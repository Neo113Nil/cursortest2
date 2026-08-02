package defpackage;

import android.content.Context;
import com.yandex.go.inapp_calls.ui.fullscreenintent.RequestUseFullScreenIntentModalView;
import com.yandex.go.inapp_calls.ui.fullscreenintent.a;
import ru.yandex.taxi.activity.g;

/* loaded from: classes12.dex */
public final class f9j0 extends m230 {
    public final w030 E;
    public final i9j0 F;
    public final e9j0 G;

    public f9j0(w030 w030Var, i9j0 i9j0Var, e9j0 e9j0Var) {
        super(null);
        this.E = w030Var;
        this.F = i9j0Var;
        this.G = e9j0Var;
    }

    @Override // defpackage.m230
    public final w030 P() {
        return this.E;
    }

    @Override // defpackage.m230
    public final boolean Q() {
        return true;
    }

    @Override // defpackage.m230
    public final u45 S(Object obj) {
        h9j0 h9j0Var = (h9j0) obj;
        sue0 sue0Var = new sue0(22, this);
        yuf0 yuf0Var = this.F.a;
        a aVar = new a(sue0Var, h9j0Var, (Context) ((xvf0) yuf0Var.a).get(), (y50) ((xvf0) yuf0Var.b).get(), (g) ((xvf0) yuf0Var.c).get(), (o8g0) ((n4g0) yuf0Var.d).get(), (com.yandex.go.inapp_calls.interactor.permissions.a) ((xvf0) yuf0Var.e).get(), (njv) ((xvf0) yuf0Var.f).get());
        mc mcVar = this.G.a;
        return new RequestUseFullScreenIntentModalView((Context) mcVar.a.get(), aVar, (ip11) mcVar.b.get());
    }
}
