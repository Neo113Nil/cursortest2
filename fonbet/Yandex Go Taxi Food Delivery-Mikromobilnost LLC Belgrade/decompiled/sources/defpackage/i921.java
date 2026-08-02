package defpackage;

import android.content.Context;
import com.yandex.go.account.upgrade.UpgradeAccountModalView;
import java.util.HashMap;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.am.j;

/* loaded from: classes12.dex */
public final class i921 extends h921 {
    public final w030 F;
    public final n921 G;
    public final co40 H;
    public final j I;
    public final j921 J;
    public final boolean K = true;

    public i921(w030 w030Var, n921 n921Var, co40 co40Var, j jVar, j921 j921Var) {
        this.F = w030Var;
        this.G = n921Var;
        this.H = co40Var;
        this.I = jVar;
        this.J = j921Var;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        co40 co40Var = this.H;
        co40Var.getClass();
        co40Var.a.a("UpgradeAccountModal.Shown", new HashMap(), 1, new HashMap());
        j921 j921Var = this.J;
        j921Var.b.setValue(j921Var, j921.c[0], Long.valueOf(j921Var.a.d()));
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final w030 P() {
        return this.F;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final boolean Q() {
        return this.K;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final Object S(Object obj, Continuation continuation) {
        return new UpgradeAccountModalView(new el11(2, this), (m921) obj, (Context) this.G.a.a.get());
    }
}
