package defpackage;

import com.yandex.quark.js.QuarkJsState;
import com.yandex.quark.utils.Disposable;

/* loaded from: classes8.dex */
public final class feh implements zhg0, Disposable {
    public static final eeh Companion = new eeh();
    public final shg0 a;
    public final x8o b;
    public final xa20 c;
    public t6z w;
    public boolean x;

    public feh(shg0 shg0Var, x8o x8oVar, xa20 xa20Var) {
        this.a = shg0Var;
        this.b = x8oVar;
        this.c = xa20Var;
        shg0Var.e(this);
    }

    public final syj0 a(t6z t6zVar) {
        syj0 b = this.a.b(jd00.j(t6zVar));
        b.getClass();
        if (b instanceof lyj0) {
            return b;
        }
        if (b instanceof jyj0) {
            return new jyj0(new jhg0(yei0.b, "Failed to set location: ".concat(((plc) ((jyj0) b).a).a())));
        }
        w511.b();
        return null;
    }

    @Override // defpackage.zhg0
    public final synchronized void d(QuarkJsState quarkJsState) {
        Object obj;
        Object obj2;
        try {
            boolean z = quarkJsState == QuarkJsState.CONNECTED;
            this.x = z;
            if (z) {
                t6z t6zVar = this.w;
                if (t6zVar == null) {
                    return;
                }
                syj0 a = a(t6zVar);
                lyj0 lyj0Var = a instanceof lyj0 ? (lyj0) a : null;
                if (lyj0Var != null && (obj2 = lyj0Var.a) != null) {
                    this.c.b(sqe.d);
                }
                jyj0 jyj0Var = a instanceof jyj0 ? (jyj0) a : null;
                if (jyj0Var != null && (obj = jyj0Var.a) != null) {
                    jhg0 jhg0Var = (jhg0) obj;
                    this.b.f("DefaultLocator", "Failed to update location: " + jhg0Var.b);
                    this.c.e(new qqe(jhg0Var.b));
                }
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
