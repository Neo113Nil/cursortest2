package defpackage;

import android.content.Context;
import com.yandex.go.explorer.impl.experiments.g;
import com.yandex.go.explorer.impl.navigation.appsettings.a;
import com.yandex.go.explorer.impl.ui.permission.NoBackgroundLocationPermissionBottomSheetModalView;

/* loaded from: classes12.dex */
public final class lb60 extends m230 {
    public final w030 E;
    public final kb60 F;
    public final hb60 G;
    public final boolean H;

    public lb60(w030 w030Var, kb60 kb60Var, hb60 hb60Var) {
        super(null);
        this.E = w030Var;
        this.F = kb60Var;
        this.G = hb60Var;
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
        uk10 uk10Var = new uk10(this);
        dt20 dt20Var = this.F.a;
        jb60 jb60Var = new jb60(uk10Var, (g) ((xvf0) dt20Var.b).get(), (k7x0) ((xvf0) dt20Var.c).get(), (a) ((xvf0) dt20Var.w).get(), (ney) ((jzf) dt20Var.x).get());
        at20 at20Var = this.G.a;
        return new NoBackgroundLocationPermissionBottomSheetModalView((Context) ((jzf) at20Var.a).get(), (pav) ((jzf) at20Var.b).get(), jb60Var);
    }
}
