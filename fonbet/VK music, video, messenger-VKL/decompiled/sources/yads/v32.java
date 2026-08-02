package yads;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes10.dex */
public final class v32 implements x12 {
    public final List a;
    public final x12 b;

    public v32(ArrayList arrayList) {
        this.a = arrayList;
        this.b = arrayList.isEmpty() ? null : (x12) arrayList.get(0);
    }

    @Override // yads.x12
    public final void a(s22 s22Var, pu puVar) {
        x12 x12Var = this.b;
        if (x12Var != null) {
            x12Var.a(s22Var, puVar);
        }
    }

    @Override // yads.x12
    public final e22 b() {
        x12 x12Var = this.b;
        if (x12Var != null) {
            return x12Var.b();
        }
        return null;
    }

    @Override // yads.x12
    public final e52 c() {
        e52 c;
        x12 x12Var = this.b;
        return (x12Var == null || (c = x12Var.c()) == null) ? new e52(null, null) : c;
    }

    @Override // yads.x12
    public final List d() {
        x12 x12Var = this.b;
        if (x12Var != null) {
            return x12Var.d();
        }
        return null;
    }

    @Override // yads.x12
    public final void destroy() {
        x12 x12Var = this.b;
        if (x12Var != null) {
            x12Var.destroy();
        }
    }

    @Override // yads.x12
    public final y00 getAdAssets() {
        y00 adAssets;
        x12 x12Var = this.b;
        return (x12Var == null || (adAssets = x12Var.getAdAssets()) == null) ? new y00(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false) : adAssets;
    }

    @Override // yads.x12
    public final dr2 getAdType() {
        dr2 adType;
        x12 x12Var = this.b;
        return (x12Var == null || (adType = x12Var.getAdType()) == null) ? dr2.c : adType;
    }

    @Override // yads.x12
    public final String getCampaignId() {
        x12 x12Var = this.b;
        if (x12Var != null) {
            return x12Var.getCampaignId();
        }
        return null;
    }

    @Override // yads.x12
    public final String getCreativeId() {
        x12 x12Var = this.b;
        if (x12Var != null) {
            return x12Var.getCreativeId();
        }
        return null;
    }

    @Override // yads.x12
    public final String getInfo() {
        x12 x12Var = this.b;
        if (x12Var != null) {
            return x12Var.getInfo();
        }
        return null;
    }

    @Override // yads.x12
    public final void loadImages() {
        x12 x12Var = this.b;
        if (x12Var != null) {
            x12Var.loadImages();
        }
    }

    @Override // yads.x12
    public final void a(s22 s22Var) {
        x12 x12Var = this.b;
        if (x12Var != null) {
            x12Var.a(s22Var);
        }
    }

    @Override // yads.x12
    public final gc a() {
        x12 x12Var = this.b;
        if (x12Var != null) {
            return x12Var.a();
        }
        return null;
    }

    @Override // yads.x12
    public final void a(z00 z00Var) {
        x12 x12Var = this.b;
        if (x12Var != null) {
            x12Var.a(z00Var);
        }
    }
}
