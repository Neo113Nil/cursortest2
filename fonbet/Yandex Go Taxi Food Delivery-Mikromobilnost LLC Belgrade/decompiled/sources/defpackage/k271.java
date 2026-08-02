package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import com.google.vr.dynamite.client.ILoadedInstanceCreator;
import com.google.vr.dynamite.client.a;
import com.google.vr.dynamite.client.d;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes11.dex */
public final class k271 {
    public Context a;
    public ILoadedInstanceCreator b;
    public final p571 c;

    public k271(p571 p571Var) {
        this.c = p571Var;
    }

    public static IBinder c(ClassLoader classLoader) {
        try {
            return (IBinder) classLoader.loadClass("com.google.vr.dynamite.LoadedInstanceCreator").getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException e) {
            ny61.h("Unable to find dynamic class ".concat("com.google.vr.dynamite.LoadedInstanceCreator"), e);
            return null;
        } catch (IllegalAccessException e2) {
            ny61.h("Unable to call the default constructor of ".concat("com.google.vr.dynamite.LoadedInstanceCreator"), e2);
            return null;
        } catch (InstantiationException e3) {
            ny61.h("Unable to instantiate the remote class ".concat("com.google.vr.dynamite.LoadedInstanceCreator"), e3);
            return null;
        } catch (NoSuchMethodException e4) {
            ny61.h("No constructor for dynamic class ".concat("com.google.vr.dynamite.LoadedInstanceCreator"), e4);
            return null;
        } catch (InvocationTargetException e5) {
            ny61.h("Unable to invoke constructor of dynamic class ".concat("com.google.vr.dynamite.LoadedInstanceCreator"), e5);
            return null;
        }
    }

    public final synchronized ILoadedInstanceCreator a(Context context) {
        ILoadedInstanceCreator aVar;
        try {
            if (this.b == null) {
                IBinder c = c(b(context).getClassLoader());
                if (c == null) {
                    aVar = null;
                } else {
                    IInterface queryLocalInterface = c.queryLocalInterface("com.google.vr.dynamite.client.ILoadedInstanceCreator");
                    aVar = queryLocalInterface instanceof ILoadedInstanceCreator ? (ILoadedInstanceCreator) queryLocalInterface : new a(c);
                }
                this.b = aVar;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.b;
    }

    public final synchronized Context b(Context context) {
        if (this.a == null) {
            try {
                this.a = context.createPackageContext(this.c.a, 3);
            } catch (PackageManager.NameNotFoundException unused) {
                throw new d();
            }
        }
        return this.a;
    }
}
