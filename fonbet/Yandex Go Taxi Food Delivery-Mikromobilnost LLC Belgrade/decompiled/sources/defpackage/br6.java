package defpackage;

import com.yandex.quark.utils.Disposable;
import java.util.Set;

/* loaded from: classes2.dex */
public final class br6 implements wy11 {
    public wy11 a;
    public Disposable b;
    public Set c;

    @Override // defpackage.wy11
    public final synchronized syj0 a(Set set) {
        syj0 a;
        try {
            synchronized (this) {
                try {
                    this.c = null;
                    Disposable disposable = this.b;
                    if (disposable != null) {
                        disposable.dispose();
                    }
                    this.b = null;
                } finally {
                }
            }
            return a;
        } catch (Throwable th) {
            throw th;
        }
        wy11 wy11Var = this.a;
        if (wy11Var == null) {
            this.c = set;
            a = new lyj0(new Disposable() { // from class: ar6
                @Override // com.yandex.quark.utils.Disposable
                public final void dispose() {
                    br6 br6Var = br6.this;
                    synchronized (br6Var) {
                        try {
                            br6Var.c = null;
                            Disposable disposable2 = br6Var.b;
                            if (disposable2 != null) {
                                disposable2.dispose();
                            }
                            br6Var.b = null;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            });
        } else {
            a = wy11Var.a(set);
        }
        return a;
    }
}
