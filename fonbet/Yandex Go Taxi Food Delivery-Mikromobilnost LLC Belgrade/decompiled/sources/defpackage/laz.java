package defpackage;

import android.content.Context;
import com.yandex.go.places.impl.ui.location_permission.LocationPermissionRequestModalView;

/* loaded from: classes13.dex */
public final class laz extends m230 {
    public final w030 E;
    public final kaz F;
    public final haz G;
    public final boolean H;

    public laz(w030 w030Var, kaz kazVar, haz hazVar) {
        super(null);
        this.E = w030Var;
        this.F = kazVar;
        this.G = hazVar;
        this.H = true;
    }

    @Override // defpackage.m230
    public final w030 P() {
        return this.E;
    }

    @Override // defpackage.m230
    public final boolean Q() {
        return this.H;
    }

    @Override // defpackage.m230
    public final u45 S(Object obj) {
        i4u i4uVar = new i4u(this);
        r1s r1sVar = this.F.a;
        jaz jazVar = new jaz(i4uVar, (y50) ((o4g) r1sVar.b).get(), (v7j0) ((y4g) r1sVar.c).get(), (ney) ((x4g) r1sVar.w).get());
        gaz gazVar = this.G.a;
        return new LocationPermissionRequestModalView((Context) gazVar.a.get(), (ip11) gazVar.b.get(), (yac0) gazVar.c.get(), jazVar);
    }
}
