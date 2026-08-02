package androidx.core.app;

import android.util.Log;
import java.lang.reflect.Method;

/* loaded from: classes10.dex */
public final class c implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public c(com.yandex.passport.legacy.lx.c cVar, Throwable th) {
        this.c = cVar;
        this.b = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                try {
                    Method method = d.d;
                    if (method != null) {
                        method.invoke(obj, obj2, Boolean.FALSE, "AppCompat recreation");
                    } else {
                        d.e.invoke(obj, obj2, Boolean.FALSE);
                    }
                    return;
                } catch (RuntimeException e) {
                    if (e.getClass() == RuntimeException.class && e.getMessage() != null && e.getMessage().startsWith("Unable to stop")) {
                        throw e;
                    }
                    return;
                } catch (Throwable th) {
                    Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
                    return;
                }
            default:
                com.yandex.passport.legacy.lx.c cVar = (com.yandex.passport.legacy.lx.c) obj2;
                if (cVar.b.a) {
                    return;
                }
                cVar.c.mo290a((Throwable) obj);
                return;
        }
    }

    public c(Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
    }
}
