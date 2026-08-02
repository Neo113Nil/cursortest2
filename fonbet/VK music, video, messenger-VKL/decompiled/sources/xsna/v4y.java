package xsna;

import com.vk.auth.main.LibverifyListener;
import com.vk.auth.main.VkClientLibverifyInfo;
import kotlin.NoWhenBranchMatchedException;
import xsna.s3z;
import xsna.w2z;

/* compiled from: JsLibverifyInteractorImpl.kt */
/* loaded from: classes6.dex */
public final class v4y {
    public d3z a;
    public LibverifyListener b;
    public l7 c;
    public s3z d;
    public boolean e;

    public final void a(w2z w2zVar) {
        if (w2zVar instanceof w2z.d) {
            String str = ((w2z.d) w2zVar).a;
            d3z d3zVar = this.a;
            if (d3zVar == null) {
                r55 r55Var = r55.a;
                umu0 umu0Var = r55.g;
                d3zVar = (umu0Var != null ? umu0Var : null).e.a(r55.a(), r55.h().n().c(VkClientLibverifyInfo.Service.ACCOUNT));
            }
            this.a = d3zVar;
            LibverifyListener libverifyListener = this.b;
            if (libverifyListener == null) {
                libverifyListener = new u4y(this);
            }
            this.b = libverifyListener;
            d3zVar.i(libverifyListener);
            d3z d3zVar2 = this.a;
            if (d3zVar2 != null) {
                d3zVar2.j(str);
                return;
            }
            return;
        }
        if (w2zVar instanceof w2z.b) {
            String str2 = ((w2z.b) w2zVar).a;
            d3z d3zVar3 = this.a;
            if (d3zVar3 == null) {
                throw new IllegalStateException("OnStart should be called before calling other methods!");
            }
            d3zVar3.b(str2);
            return;
        }
        if (w2zVar instanceof w2z.c) {
            d3z d3zVar4 = this.a;
            if (d3zVar4 == null) {
                throw new IllegalStateException("OnStart should be called before calling other methods!");
            }
            if (d3zVar4 != null) {
                d3zVar4.n();
                return;
            }
            return;
        }
        if (!(w2zVar instanceof w2z.a)) {
            throw new NoWhenBranchMatchedException();
        }
        d3z d3zVar5 = this.a;
        if (d3zVar5 != null) {
            d3zVar5.onCancel();
        }
        d3z d3zVar6 = this.a;
        if (d3zVar6 != null) {
            d3zVar6.i(null);
        }
        this.a = null;
        this.b = null;
        c(s3z.d.a);
        b(false);
    }

    public final void b(boolean z) {
        if (this.e != z) {
            xgx0.a.getClass();
            xgx0.f("[JsLibverifyDelegateImpl][State] loader state updated, currentLoaderState - " + z);
            this.e = z;
            l7 l7Var = this.c;
            if (l7Var != null) {
                l7Var.b(this.d, z);
            }
        }
    }

    public final void c(s3z s3zVar) {
        if (epx.f(this.d, s3zVar)) {
            return;
        }
        xgx0.a.getClass();
        xgx0.f("[JsLibverifyDelegateImpl][State] state updated, currentState - " + s3zVar);
        this.d = s3zVar;
        l7 l7Var = this.c;
        if (l7Var != null) {
            l7Var.b(s3zVar, this.e);
        }
    }
}
