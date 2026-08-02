package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.maps.model.RuntimeRemoteException;

/* compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* loaded from: classes13.dex */
public final class h601 {

    @Nullable
    @SuppressLint({"StaticFieldLeak"})
    public static Context a;
    public static da01 b;

    public static da01 a(Context context) throws GooglePlayServicesNotAvailableException {
        da01 k801Var;
        exc0.i(context);
        "preferredRenderer: ".concat("null");
        da01 da01Var = b;
        if (da01Var != null) {
            return da01Var;
        }
        int i = GooglePlayServicesUtil.e;
        int b2 = fau.b(context, 13400000);
        if (b2 != 0) {
            throw new GooglePlayServicesNotAvailableException(b2);
        }
        ClassLoader classLoader = b(context).getClassLoader();
        try {
            exc0.i(classLoader);
            IBinder iBinder = (IBinder) c(classLoader.loadClass("com.google.android.gms.maps.internal.CreatorImpl"));
            if (iBinder == null) {
                k801Var = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICreator");
                k801Var = queryLocalInterface instanceof da01 ? (da01) queryLocalInterface : new k801(iBinder, "com.google.android.gms.maps.internal.ICreator");
            }
            b = k801Var;
            try {
                Context b3 = b(context);
                b3.getClass();
                k801Var.b0(new bq70(b3.getResources()));
                return b;
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } catch (ClassNotFoundException unused) {
            throw new IllegalStateException("Unable to find dynamic class com.google.android.gms.maps.internal.CreatorImpl");
        }
    }

    @Nullable
    public static Context b(Context context) {
        Context context2;
        Context context3 = a;
        if (context3 != null) {
            return context3;
        }
        context.getApplicationContext();
        try {
            context2 = DynamiteModule.c(context, DynamiteModule.b, "com.google.android.gms.maps_dynamite").a;
        } catch (Exception e) {
            try {
                if ("com.google.android.gms.maps_dynamite".equals("com.google.android.gms.maps_dynamite")) {
                    Log.e("h601", "Failed to load maps module, use pre-Chimera", e);
                    int i = GooglePlayServicesUtil.e;
                    context2 = context.createPackageContext("com.google.android.gms", 3);
                } else {
                    try {
                        context2 = DynamiteModule.c(context, DynamiteModule.b, "com.google.android.gms.maps_dynamite").a;
                    } catch (Exception e2) {
                        Log.e("h601", "Failed to load maps module, use pre-Chimera", e2);
                        int i2 = GooglePlayServicesUtil.e;
                        context2 = context.createPackageContext("com.google.android.gms", 3);
                    }
                }
            } catch (PackageManager.NameNotFoundException unused) {
                context2 = null;
            }
        }
        a = context2;
        return context2;
    }

    public static <T> T c(Class cls) {
        try {
            return (T) cls.newInstance();
        } catch (IllegalAccessException unused) {
            String name = cls.getName();
            throw new IllegalStateException(name.length() != 0 ? "Unable to call the default constructor of ".concat(name) : new String("Unable to call the default constructor of "));
        } catch (InstantiationException unused2) {
            String name2 = cls.getName();
            throw new IllegalStateException(name2.length() != 0 ? "Unable to instantiate the dynamic class ".concat(name2) : new String("Unable to instantiate the dynamic class "));
        }
    }
}
