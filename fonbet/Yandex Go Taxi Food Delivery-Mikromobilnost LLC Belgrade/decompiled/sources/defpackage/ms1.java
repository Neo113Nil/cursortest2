package defpackage;

import com.yandex.quark.js.QuarkJsState;
import com.yandex.quark.utils.Disposable;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes8.dex */
public final class ms1 implements zhg0, Disposable, yv {
    public final shg0 a;
    public final xa20 b;
    public boolean c;
    public final ArrayList w = new ArrayList();

    public ms1(shg0 shg0Var, xa20 xa20Var) {
        this.a = shg0Var;
        this.b = xa20Var;
        new w2n();
        shg0Var.e(this);
    }

    @Override // defpackage.yv
    public final syj0 a(mo moVar) {
        return q5z.N();
    }

    public final void b(String str) {
        Object obj;
        Object obj2;
        syj0 b = this.a.b(q9b1.c(str));
        lyj0 lyj0Var = b instanceof lyj0 ? (lyj0) b : null;
        xa20 xa20Var = this.b;
        if (lyj0Var != null && (obj2 = lyj0Var.a) != null) {
            xa20Var.b(pqe.d);
        }
        jyj0 jyj0Var = b instanceof jyj0 ? (jyj0) b : null;
        if (jyj0Var == null || (obj = jyj0Var.a) == null) {
            return;
        }
        xa20Var.e(new nqe(((plc) obj).a()));
    }

    @Override // defpackage.zhg0
    public final synchronized void d(QuarkJsState quarkJsState) {
        try {
            boolean z = quarkJsState == QuarkJsState.CONNECTED;
            this.c = z;
            if (z) {
                Iterator it = this.w.iterator();
                while (it.hasNext()) {
                    b((String) it.next());
                }
                this.w.clear();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.yandex.quark.utils.Disposable
    public final void dispose() {
        this.a.f(this);
    }
}
