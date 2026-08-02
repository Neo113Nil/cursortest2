package yads;

import android.content.Context;
import java.util.ArrayList;

/* loaded from: classes10.dex */
public final class w32 extends q42 implements x12 {
    public final v32 P;
    public final nj2 Q;

    public w32(Context context, v32 v32Var, nj2 nj2Var, up upVar, g02 g02Var) {
        super(context, upVar, g02Var);
        this.P = v32Var;
        this.Q = nj2Var;
        a(a(upVar.d().a()));
    }

    @Override // yads.x12
    public final void a(s22 s22Var, pu puVar) {
        this.P.a(s22Var, puVar);
    }

    public final void b(z00 z00Var) {
        super.a(z00Var);
    }

    @Override // yads.x12
    public final y00 getAdAssets() {
        return this.P.getAdAssets();
    }

    @Override // yads.x12
    public final dr2 getAdType() {
        return this.P.getAdType();
    }

    @Override // yads.x12
    public final String getCampaignId() {
        return this.P.getCampaignId();
    }

    @Override // yads.x12
    public final String getCreativeId() {
        return this.P.getCreativeId();
    }

    @Override // yads.x12
    public final String getInfo() {
        return this.P.getInfo();
    }

    public final ArrayList i() {
        return new ArrayList(this.P.a);
    }

    @Override // yads.q42, yads.x12
    public final void loadImages() {
        this.P.loadImages();
    }

    @Override // yads.x12
    public final void a(s22 s22Var) {
        this.P.a(s22Var);
    }

    @Override // yads.x12
    public final gc a() {
        return this.P.a();
    }

    @Override // yads.q42, yads.x12
    public final void a(z00 z00Var) {
        this.P.a(z00Var);
    }

    public final j32 a(d4 d4Var) {
        w52 w52Var = w52.c;
        j32 j32Var = new j32(d4Var, "ad_unit", this.i, this.j, new g32(), null);
        j32Var.f = r32.c;
        return j32Var;
    }
}
