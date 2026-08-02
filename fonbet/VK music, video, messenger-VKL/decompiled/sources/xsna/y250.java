package xsna;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.vk.di.scope.FeatureScopesKt$createFeatureScope$scope$1;
import com.vk.di.scope.SharedScope;
import com.vk.dto.music.Artist;
import com.vk.music.onboarding.impl.MusicRecommendationOnboardingContract$Presenter;
import com.vk.music.onboarding.impl.di.InternalOnboardingComponent;
import com.vk.music.onboarding.impl.model.RecommendationOnBoardingModel;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.k840;

/* compiled from: MusicRecommendationOnboardingPopup.kt */
/* loaded from: classes3.dex */
public final class y250 extends com.vk.music.notifications.inapp.c implements com.vk.music.onboarding.impl.a, fsv<Artist> {
    public static final int n = iah0.a(576);
    public static final int o = iah0.a(64);
    public final String i;
    public final String j;
    public com.vk.music.onboarding.impl.b k;
    public ViewGroup l;
    public final io.reactivex.rxjava3.disposables.b m = new io.reactivex.rxjava3.disposables.b();

    /* compiled from: MusicRecommendationOnboardingPopup.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            ((y250) this.receiver).e();
            return s3q0.a;
        }
    }

    public y250(String str, String str2) {
        this.i = str;
        this.j = str2;
    }

    @Override // com.vk.music.notifications.inapp.InAppNotification
    public final boolean C() {
        return false;
    }

    @Override // com.vk.music.onboarding.impl.a
    public final void Em(List<Artist> list) {
        com.vk.music.onboarding.impl.b bVar = this.k;
        if (bVar != null) {
            bVar.i.C0(list, true);
        }
    }

    @Override // com.vk.music.notifications.inapp.InAppNotification
    public final int G() {
        return R.layout.music_recommendation_onboarding_popup;
    }

    @Override // xsna.fsv
    public final void Ig(int i, Artist artist) {
        if (i == R.id.music_recommendation_onboarding_floating_close) {
            e();
        }
    }

    @Override // com.vk.music.onboarding.impl.a
    public final void Kd(List<Artist> list) {
        com.vk.music.onboarding.impl.b bVar = this.k;
        if (bVar != null) {
            if (bVar.c.g == MusicRecommendationOnboardingContract$Presenter.State.SEARCH) {
                bVar.i.C0(list, false);
            } else {
                bVar.h.C0(list, false);
            }
        }
    }

    @Override // com.vk.music.notifications.inapp.InAppNotification
    public final void N() {
        this.m.e();
    }

    @Override // com.vk.music.notifications.inapp.InAppNotification
    public final boolean a0() {
        com.vk.music.onboarding.impl.b bVar = this.k;
        if (bVar == null) {
            return true;
        }
        bVar.c.g();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.music.notifications.inapp.InAppNotification
    public final void d3(View view) {
        l7m c = m7m.c(view);
        InternalOnboardingComponent.d.getClass();
        FeatureScopesKt$createFeatureScope$scope$1 featureScopesKt$createFeatureScope$scope$1 = new FeatureScopesKt$createFeatureScope$scope$1(SharedScope.a, new pkx(), fpf0.a(InternalOnboardingComponent.class), new zii(3));
        nwy nwyVar = ((InternalOnboardingComponent) ((k7m) c).d(featureScopesKt$createFeatureScope$scope$1).b(fpf0.a(InternalOnboardingComponent.class), new InternalOnboardingComponent.b(y250.class, this.i))).c;
        qcy<Object> qcyVar = InternalOnboardingComponent.e[0];
        RecommendationOnBoardingModel recommendationOnBoardingModel = (RecommendationOnBoardingModel) nwyVar.c();
        MusicRecommendationOnboardingContract$Presenter musicRecommendationOnboardingContract$Presenter = new MusicRecommendationOnboardingContract$Presenter(view.getContext(), this, recommendationOnBoardingModel, this.m, new bpn0(new b410(view, 3)));
        Context context = view.getContext();
        bpn0 bpn0Var = enj.a;
        this.k = new com.vk.music.onboarding.impl.b(e3m.h(context), view, musicRecommendationOnboardingContract$Presenter, recommendationOnBoardingModel, true);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.music_recommendation_onboarding_container);
        viewGroup.setClipToOutline(true);
        this.l = viewGroup;
        bwt0.p(view, R.id.music_recommendation_onboarding_floating_close, this, null, 4);
        view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: xsna.x250
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                ViewGroup viewGroup2 = y250.this.l;
                if (viewGroup2 != null) {
                    ViewGroup.LayoutParams layoutParams = viewGroup2.getLayoutParams();
                    int i9 = y250.n;
                    int p = iah0.p(viewGroup2.getContext()) - y250.o;
                    if (i9 > p) {
                        i9 = p;
                    }
                    layoutParams.height = i9;
                    viewGroup2.requestLayout();
                }
            }
        });
    }

    @Override // com.vk.music.onboarding.impl.a
    public final void e() {
        r5v0 r5v0Var = k840.a.h;
        if (r5v0Var == null) {
            r5v0Var = null;
        }
        r5v0Var.b(new dcg0(this.j));
        d();
    }

    @Override // com.vk.music.onboarding.impl.a
    public final void je(String str) {
        com.vk.music.onboarding.impl.b bVar = this.k;
        if (bVar != null) {
            a aVar = new a(0, this, y250.class, "closeScreen", "closeScreen()V", 0);
            w800<i700> j = q700.j(bVar.b, str);
            j.a(new j350(bVar, aVar));
            j.b(new k350(bVar, aVar));
        }
    }

    @Override // xsna.fsv, android.view.MenuItem.OnMenuItemClickListener, android.widget.PopupMenu.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        super.onMenuItemClick(menuItem);
        return true;
    }

    @Override // com.vk.music.onboarding.impl.a
    public final void qe(MusicRecommendationOnboardingContract$Presenter.State state) {
        com.vk.music.onboarding.impl.b bVar = this.k;
        if (bVar != null) {
            bVar.d(state);
        }
    }

    @Override // com.vk.music.onboarding.impl.a
    public final void ra(long j, String str, String str2) {
        mhy.d(this.d);
        com.vk.music.onboarding.impl.b bVar = this.k;
        if (bVar != null) {
            bVar.c(j, str, str2);
        }
    }

    @Override // com.vk.music.onboarding.impl.a
    public final void x3(List<Artist> list, Artist artist) {
        com.vk.music.onboarding.impl.b bVar = this.k;
        if (bVar != null) {
            s250 s250Var = bVar.h;
            if (bVar.c.g == MusicRecommendationOnboardingContract$Presenter.State.SEARCH) {
                bVar.i.D0(list, artist);
                s250Var.i.F0(artist, artist);
            } else {
                s250Var.D0(list, artist);
            }
            bVar.p.setEnabled(bVar.d.D());
        }
    }

    @Override // com.vk.music.notifications.inapp.InAppNotification
    public final void M() {
    }
}
