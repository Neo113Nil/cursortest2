package yads;

import android.app.Activity;
import android.content.Context;
import java.util.List;
import kotlin.Result;

/* loaded from: classes10.dex */
public final class bx2 implements cy0 {
    public final gy0 a;
    public final ov2 b;
    public final j12 c;
    public final cu2 d;
    public final u52 e;
    public final d4 f;
    public final e32 g;
    public final ly0 h;
    public v9 i;
    public x12 j;
    public boolean k;

    public /* synthetic */ bx2(gy0 gy0Var, ov2 ov2Var) {
        this(gy0Var, ov2Var, new j12());
    }

    @Override // yads.fc
    public final List a() {
        j12 j12Var = this.c;
        x12 x12Var = this.j;
        j12Var.getClass();
        return j12.a(x12Var);
    }

    @Override // yads.fc
    public final List b() {
        j12 j12Var = this.c;
        x12 x12Var = this.j;
        j12Var.getClass();
        return j12.b(x12Var);
    }

    @Override // yads.cy0
    public final String getAdInfo() {
        return this.c.c(this.j);
    }

    @Override // yads.cy0
    public final void a(Context context) {
        this.k = true;
        this.i = null;
        this.j = null;
        this.e.b.a();
    }

    public bx2(gy0 gy0Var, ov2 ov2Var, j12 j12Var) {
        this.a = gy0Var;
        this.b = ov2Var;
        this.c = j12Var;
        Context g = gy0Var.g();
        d4 e = gy0Var.e();
        this.f = e;
        this.g = new e32(e);
        w5 f = gy0Var.f();
        this.d = new cu2(e, ov2Var);
        this.e = new u52(g, ov2Var, e, f);
        this.h = new ly0(ov2Var);
    }

    @Override // yads.cy0
    public final void a(Context context, v9 v9Var) {
        if (this.k) {
            return;
        }
        this.i = v9Var;
        this.a.b.a(v5.c, null);
        this.e.a(v9Var, new ax2(this), new zw2(this, context, v9Var));
    }

    @Override // yads.cy0
    public final Object a(ry0 ry0Var, Activity activity) {
        Result.Failure failure = new Result.Failure(o7.b);
        v9 v9Var = this.i;
        x12 x12Var = this.j;
        if (v9Var == null || x12Var == null) {
            return failure;
        }
        d4 d4Var = this.f;
        Object a = this.h.a(activity, new x1(v9Var, d4Var, ry0Var.c, this.b, x12Var, d4Var.n, null, 64));
        this.i = null;
        this.j = null;
        return a;
    }
}
