package defpackage;

import com.yandex.quark.js.QuarkJsState;
import kotlinx.coroutines.channels.a;

/* loaded from: classes8.dex */
public final class om41 implements mlc, zhg0 {
    public pzt0 A;
    public final zwf0 a;
    public final ike b;
    public final zq6 c;
    public final h38 w;
    public final zcx x;
    public volatile boolean y;
    public final a z = sb2.a(Integer.MAX_VALUE, null, null, 6);

    public om41(zwf0 zwf0Var, ike ikeVar, wly0 wly0Var, zq6 zq6Var, h38 h38Var, zcx zcxVar) {
        this.a = zwf0Var;
        this.b = ikeVar;
        this.c = zq6Var;
        this.w = h38Var;
        this.x = zcxVar;
    }

    public final void a() {
        while (true) {
            mm41 mm41Var = (mm41) oi9.b(this.z.g());
            if (mm41Var == null) {
                return;
            }
            this.c.b(new cig0(mm41Var.b()));
            this.a.e("DefaultCommandExecutor", "Drop command " + mm41Var.b() + ", because quark bridge closed");
        }
    }

    @Override // defpackage.mlc
    public final syj0 b(clc clcVar) {
        if (!this.y) {
            this.c.b(new eig0(clcVar.b()));
            this.a.e("DefaultCommandExecutor", "Drop command " + clcVar.b() + ", because command executor is not ready");
            return new jyj0(olc.b);
        }
        syj0 a = this.w.a(clcVar);
        if (!(a instanceof lyj0)) {
            if (a instanceof jyj0) {
                String message = ((Throwable) ((jyj0) a).a).getMessage();
                return new jyj0(new nlc(message != null ? message : ""));
            }
            w511.b();
            return null;
        }
        clc clcVar2 = (clc) ((lyj0) a).a;
        syj0 c = clcVar2.c(this.x);
        if (c instanceof lyj0) {
            this.z.d(new mm41(clcVar2.b(), (String) ((lyj0) c).a));
            return q5z.N();
        }
        if (c instanceof jyj0) {
            String message2 = ((Throwable) ((jyj0) c).a).getMessage();
            return new jyj0(new nlc(message2 != null ? message2 : ""));
        }
        w511.b();
        return null;
    }

    @Override // defpackage.zhg0
    public final void d(QuarkJsState quarkJsState) {
        this.y = quarkJsState == QuarkJsState.CONNECTED;
        int i = nm41.a[quarkJsState.ordinal()];
        if (i == 1) {
            a();
            return;
        }
        if (i == 2) {
            a();
            this.z.l(null);
        } else {
            if (i == 3 || i == 4) {
                return;
            }
            w511.b();
        }
    }
}
