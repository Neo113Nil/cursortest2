package yads;

import android.view.View;
import com.ironsource.InterfaceC4413l1;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes10.dex */
public final class ph3 implements cl3 {
    public final ye3 a;
    public final al3 b;

    public ph3(ye3 ye3Var, al3 al3Var) {
        this.a = ye3Var;
        this.b = al3Var;
    }

    @Override // yads.cl3
    public final void a() {
    }

    @Override // yads.cl3
    public final void h() {
        this.b.a(this.a, "render_impression");
    }

    @Override // yads.cl3
    public final void i() {
        this.b.a(new jf3(this.a), "renderingStart");
    }

    @Override // yads.cl3
    public final void n() {
        this.b.a(this.a, "impression");
    }

    @Override // yads.cl3
    public final void a(float f) {
    }

    @Override // yads.cl3
    public final void a(float f, long j) {
    }

    @Override // yads.cl3
    public final void a(View view, List list) {
    }

    @Override // yads.cl3
    public final void a(bl3 bl3Var) {
    }

    @Override // yads.cl3
    public final void a(ng3 ng3Var) {
        int i;
        switch (ng3Var.a) {
            case b:
            case c:
            case d:
            case e:
            case f:
            case g:
            case h:
            case k:
            case l:
            case m:
            case A:
            case B:
                i = InterfaceC4413l1.a.b.e;
                break;
            case i:
                i = 402;
                break;
            case j:
            case n:
            case D:
                i = 900;
                break;
            case o:
            case p:
            case q:
            case r:
            case s:
            case t:
            case v:
            case w:
            case x:
            case z:
            case C:
                i = 400;
                break;
            case u:
                i = 401;
                break;
            case y:
                i = 403;
                break;
            case E:
            case G:
                i = 901;
                break;
            case F:
                i = 902;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        Map b = xsna.dt.b("[ERRORCODE]", String.valueOf(i));
        al3 al3Var = this.b;
        ye3 ye3Var = this.a;
        al3Var.getClass();
        List list = (List) ye3Var.a().get("error");
        if (list != null) {
            al3Var.a.a(list, b);
        }
    }

    @Override // yads.cl3
    public final void b() {
    }

    @Override // yads.cl3
    public final void c() {
    }

    @Override // yads.cl3
    public final void d() {
    }

    @Override // yads.cl3
    public final void f() {
    }

    @Override // yads.cl3
    public final void g() {
    }

    @Override // yads.cl3
    public final void j() {
    }

    @Override // yads.cl3
    public final void k() {
    }

    @Override // yads.cl3
    public final void l() {
    }

    @Override // yads.cl3
    public final void m() {
    }
}
