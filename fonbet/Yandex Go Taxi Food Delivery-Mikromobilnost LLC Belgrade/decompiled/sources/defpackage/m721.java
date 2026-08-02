package defpackage;

import com.yandex.plus.metrica.utils.e;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.collections.a;

/* loaded from: classes8.dex */
public final class m721 implements ero {
    public final hl21 a;

    public m721(hl21 hl21Var) {
        this.a = hl21Var;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        k2d0 k2d0Var = (k2d0) obj;
        wa20 j = ((e) this.a).j();
        if (j != null) {
            String str = null;
            List list = k2d0Var != null ? k2d0Var.c : null;
            k95 k95Var = j.a;
            if (list != null) {
                k95Var.getClass();
                str = a.X(list, ";", null, null, null, 62);
            }
            if (!jl40.l(k95Var.c, str)) {
                ReentrantLock reentrantLock = k95Var.a;
                reentrantLock.lock();
                try {
                    if (!jl40.l(k95Var.c, str)) {
                        k95Var.c = str;
                        try {
                            k95Var.b();
                        } catch (Throwable th) {
                            d5z0 d5z0Var = h5z0.a;
                            d5z0Var.t("Metrica8RtmConfigUpdater");
                            d5z0Var.d("Can't update config for RTM!", th);
                        }
                    }
                    reentrantLock.unlock();
                } catch (Throwable th2) {
                    reentrantLock.unlock();
                    throw th2;
                }
            }
        }
        return zy11.a;
    }
}
