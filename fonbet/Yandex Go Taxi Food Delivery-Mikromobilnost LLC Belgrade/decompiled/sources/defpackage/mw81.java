package defpackage;

import android.content.Context;
import java.util.ArrayList;
import yads.s12;

/* loaded from: classes7.dex */
public final class mw81 extends va81 implements hk61 {
    public final au81 N;
    public final v881 O;

    public mw81(Context context, au81 au81Var, v881 v881Var, hq71 hq71Var, nr41 nr41Var) {
        super(context, hq71Var, nr41Var);
        this.N = au81Var;
        this.O = v881Var;
        uio0 uio0Var = new uio0(hq71Var.a.c, "ad_unit", this.i, this.j, new ai71());
        uio0Var.f = s12.c;
        b(uio0Var);
    }

    @Override // defpackage.hk61
    public final String a() {
        return this.N.a();
    }

    @Override // defpackage.hk61
    public final String c() {
        return this.N.c();
    }

    @Override // defpackage.hk61
    public final xn61 e() {
        return this.N.e();
    }

    @Override // defpackage.hk61
    public final String g() {
        return this.N.g();
    }

    @Override // defpackage.hk61
    public final m081 getAdAssets() {
        return this.N.getAdAssets();
    }

    @Override // defpackage.va81, defpackage.hk61
    public final void h() {
        this.N.h();
    }

    @Override // defpackage.hk61
    public final void i(xg81 xg81Var, t171 t171Var) {
        this.N.i(xg81Var, t171Var);
    }

    @Override // defpackage.va81, defpackage.hk61
    public final void j(nr41 nr41Var) {
        this.N.j(nr41Var);
    }

    public final void o(nr41 nr41Var) {
        super.j(nr41Var);
    }

    public final ArrayList p() {
        return new ArrayList(this.N.a);
    }

    @Override // defpackage.hk61
    public final z681 a(xg81 xg81Var) {
        return this.N.a(xg81Var);
    }
}
