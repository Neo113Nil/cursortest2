package defpackage;

import android.content.Context;
import com.yandex.go.inapp_calls.experiment.q;
import com.yandex.go.inapp_calls.repository.c;
import com.yandex.go.inapp_calls.ui.loader.InAppCallsLoadingLoadingModalView;
import com.yandex.go.navigation.modals.coroutines.a;
import com.yandex.go.taxi.intercity.dashboard.impl.presentation.comment_suggests.IntercityDashboardCommentSuggestsModalView;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.surge.dialog.selector.SelectorModalView;

/* loaded from: classes12.dex */
public final class bkv extends a {
    public final /* synthetic */ int F;
    public final Object G;
    public final boolean H;
    public final Object I;
    public final Object J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bkv(int i, Object obj, Object obj2, Object obj3) {
        super(null);
        this.F = i;
        this.G = obj;
        this.I = obj2;
        this.J = obj3;
        this.H = true;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final w030 P() {
        switch (this.F) {
            case 0:
                return (w030) this.G;
            case 1:
                return (w030) this.G;
            default:
                return ((i130) this.G).a();
        }
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final boolean Q() {
        switch (this.F) {
        }
        return this.H;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final Object S(Object obj, Continuation continuation) {
        int i = this.F;
        Object obj2 = this.J;
        Object obj3 = this.I;
        switch (i) {
            case 0:
                sjv sjvVar = (sjv) obj;
                h2t h2tVar = new h2t(this);
                String str = sjvVar.a;
                fkv fkvVar = sjvVar.b;
                mf1 mf1Var = sjvVar.c;
                zh0 zh0Var = ((akv) obj2).a;
                com.yandex.go.inapp_calls.ui.loader.a aVar = new com.yandex.go.inapp_calls.ui.loader.a(h2tVar, str, fkvVar, mf1Var, (c) zh0Var.a.get(), (yi7) zh0Var.b.get(), (q) zh0Var.c.get(), (njv) zh0Var.d.get());
                mc mcVar = ((wjv) obj3).a;
                return new InAppCallsLoadingLoadingModalView((Context) mcVar.a.get(), aVar, (ip11) mcVar.b.get());
            case 1:
                qbw qbwVar = new qbw(new i4u(this), (pbw) obj, (com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor.a) ((rbw) obj2).a.a.get());
                mc mcVar2 = ((ubw) obj3).a;
                return new IntercityDashboardCommentSuggestsModalView((Context) mcVar2.a.get(), qbwVar, (pav) mcVar2.b.get());
            default:
                tlq0 tlq0Var = (tlq0) obj;
                String str2 = tlq0Var.f;
                SelectorModalView selectorModalView = new SelectorModalView((Context) obj3, tlq0Var, new b7p0(11, this), new uyo0(26, this));
                selectorModalView.setOnAppearingListener(new ou4(9, this, str2));
                return selectorModalView;
        }
    }
}
