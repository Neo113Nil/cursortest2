package xsna;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.reflect.Method;
import org.chromium.net.ApiVersion;

/* compiled from: com.google.android.gms:play-services-cronet@@17.0.1 */
/* loaded from: classes13.dex */
public final class xek {
    public static final com.google.android.gms.common.a a = com.google.android.gms.common.a.b;
    public static final Object b = new Object();

    @Nullable
    public static DynamiteModule c = null;
    public static String d = "0";

    @NonNull
    public static Task<Void> a(@NonNull final Context context) {
        DynamiteModule dynamiteModule;
        exc0.j(context, "Context must not be null");
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        synchronized (b) {
            dynamiteModule = c;
        }
        if (dynamiteModule != null) {
            taskCompletionSource.setResult(null);
            return taskCompletionSource.getTask();
        }
        new Thread(new Runnable() { // from class: xsna.xsz0
            @Override // java.lang.Runnable
            public final void run() {
                Context context2 = context;
                TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                try {
                    xek.b(context2);
                    taskCompletionSource2.setResult(null);
                } catch (Exception e) {
                    taskCompletionSource2.setException(e);
                }
            }
        }).start();
        return taskCompletionSource.getTask();
    }

    @Deprecated
    public static void b(@NonNull Context context) throws GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException {
        DynamiteModule dynamiteModule;
        Object obj = b;
        synchronized (obj) {
            try {
                synchronized (obj) {
                    dynamiteModule = c;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (dynamiteModule != null) {
            return;
        }
        exc0.j(context, "Context must not be null");
        ClassLoader classLoader = xek.class.getClassLoader();
        exc0.i(classLoader);
        try {
            classLoader.loadClass("org.chromium.net.CronetEngine");
            int apiLevel = ApiVersion.getApiLevel();
            com.google.android.gms.common.a aVar = a;
            aVar.getClass();
            com.google.android.gms.common.a.d(context);
            try {
                DynamiteModule c2 = DynamiteModule.c(context, DynamiteModule.b, "com.google.android.gms.cronet_dynamite");
                try {
                    Class<?> loadClass = c2.a.getClassLoader().loadClass("org.chromium.net.impl.ImplVersion");
                    if (loadClass.getClassLoader() == xek.class.getClassLoader()) {
                        Log.e("xek", "ImplVersion class is missing from Cronet module.");
                        throw new GooglePlayServicesNotAvailableException(8);
                    }
                    Method method = loadClass.getMethod("getApiLevel", null);
                    Method method2 = loadClass.getMethod("getCronetVersion", null);
                    Integer num = (Integer) method.invoke(null, null);
                    exc0.i(num);
                    int intValue = num.intValue();
                    String str = (String) method2.invoke(null, null);
                    exc0.i(str);
                    d = str;
                    if (apiLevel <= intValue) {
                        c = c2;
                        return;
                    }
                    Intent b2 = aVar.b(context, 2, "cr");
                    if (b2 == null) {
                        Log.e("xek", "Unable to fetch error resolution intent");
                        throw new GooglePlayServicesNotAvailableException(2);
                    }
                    String str2 = d;
                    StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 174);
                    sb.append("Google Play Services update is required. The API Level of the client is ");
                    sb.append(apiLevel);
                    sb.append(". The API Level of the implementation is ");
                    sb.append(intValue);
                    sb.append(". The Cronet implementation version is ");
                    sb.append(str2);
                    throw new GooglePlayServicesRepairableException(2, sb.toString(), b2);
                } catch (Exception e) {
                    Log.e("xek", "Unable to read Cronet version from the Cronet module ", e);
                    throw ((GooglePlayServicesNotAvailableException) new GooglePlayServicesNotAvailableException(8).initCause(e));
                }
            } catch (DynamiteModule.LoadingException e2) {
                Log.e("xek", "Unable to load Cronet module", e2);
                throw ((GooglePlayServicesNotAvailableException) new GooglePlayServicesNotAvailableException(8).initCause(e2));
            }
        } catch (ClassNotFoundException e3) {
            Log.e("xek", "Cronet API is not available. Have you included all required dependencies?");
            throw ((GooglePlayServicesNotAvailableException) new GooglePlayServicesNotAvailableException(10).initCause(e3));
        }
    }
}
