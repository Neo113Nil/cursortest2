package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.maps.internal.zze;
import com.google.android.gms.maps.internal.zzf;

/* loaded from: classes11.dex */
public final class cd91 {
    public static Context a;
    public static zzf b;

    public static zzf a(Context context) {
        zzf zzeVar;
        cvw.l(context);
        zzf zzfVar = b;
        if (zzfVar != null) {
            return zzfVar;
        }
        int i = ewt.e;
        int b2 = fwt.b(context, 13400000);
        if (b2 != 0) {
            throw new GooglePlayServicesNotAvailableException(b2);
        }
        Log.i("cd91", "Making Creator dynamically");
        ClassLoader classLoader = b(context).getClassLoader();
        try {
            cvw.l(classLoader);
            IBinder iBinder = (IBinder) c(classLoader.loadClass("com.google.android.gms.maps.internal.CreatorImpl"));
            if (iBinder == null) {
                zzeVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICreator");
                zzeVar = queryLocalInterface instanceof zzf ? (zzf) queryLocalInterface : new zze(iBinder);
            }
            b = zzeVar;
            try {
                Context b3 = b(context);
                b3.getClass();
                zzeVar.zzk(ObjectWrapper.wrap(b3.getResources()), 12451000);
                return b;
            } catch (RemoteException e) {
                su71.e(e);
                return null;
            }
        } catch (ClassNotFoundException unused) {
            ny61.r("Unable to find dynamic class com.google.android.gms.maps.internal.CreatorImpl");
            return null;
        }
    }

    public static Context b(Context context) {
        Context context2;
        Context context3 = a;
        if (context3 != null) {
            return context3;
        }
        context.getApplicationContext();
        try {
            context2 = gan.c(context, gan.b, "com.google.android.gms.maps_dynamite").a;
        } catch (Exception e) {
            try {
                if ("com.google.android.gms.maps_dynamite".equals("com.google.android.gms.maps_dynamite")) {
                    Log.e("cd91", "Failed to load maps module, use pre-Chimera", e);
                    int i = ewt.e;
                    context2 = context.createPackageContext("com.google.android.gms", 3);
                } else {
                    try {
                        context2 = gan.c(context, gan.b, "com.google.android.gms.maps_dynamite").a;
                    } catch (Exception e2) {
                        Log.e("cd91", "Failed to load maps module, use pre-Chimera", e2);
                        int i2 = ewt.e;
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

    public static Object c(Class cls) {
        try {
            return cls.newInstance();
        } catch (IllegalAccessException unused) {
            String name = cls.getName();
            throw new IllegalStateException(name.length() != 0 ? "Unable to call the default constructor of ".concat(name) : new String("Unable to call the default constructor of "));
        } catch (InstantiationException unused2) {
            String name2 = cls.getName();
            throw new IllegalStateException(name2.length() != 0 ? "Unable to instantiate the dynamic class ".concat(name2) : new String("Unable to instantiate the dynamic class "));
        }
    }
}
