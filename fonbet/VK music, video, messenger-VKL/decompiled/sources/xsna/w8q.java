package xsna;

import android.os.Bundle;
import android.text.TextPaint;
import android.widget.ImageView;
import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.vk.attachpicker.di.AttachPickerComponent;
import com.vk.biometric.auth.api.di.BiometricAuthComponent;
import com.vk.catalog2.feature.music.ui.holder.MusicArtistCatalogRootVh;
import com.vk.catalog2.feature.music.ui.holder.MusicCatalogRootVh;
import com.vk.core.view.components.picture.VkImage;
import com.vk.di.scope.FeatureScopesKt$createFeatureScope$scope$1;
import com.vk.di.scope.SharedScope;
import com.vk.dto.stories.model.NarrativePublishEventType;
import com.vk.fave.fragments.FavesFragment;
import com.vk.home.HomeFragment2;
import com.vk.music.onboarding.impl.di.InternalOnboardingComponent;
import com.vk.music.onboarding.impl.model.RecommendationOnBoardingModel;
import com.vk.music.onboarding.impl.phone.MusicRecommendationOnboardingFragment;
import com.vk.newsfeed.impl.newsfeed.presentation.base.fragment.NewsfeedFragment;
import com.vk.stat.scheme.CommonAudioStat$TypeAudioSnippetItem;
import com.vk.typography.FontFamily;
import com.vk.typography.TextSizeUnit;
import com.vk.voip.ui.groupcalls.list.ListGroupCallView;
import com.vkontakte.android.R;
import com.vkontakte.android.ui.bottomnavigation.BottomNavigationView;
import java.util.LinkedHashMap;
import xsna.aiz;
import xsna.kex;
import xsna.mms;
import xsna.nzw;
import xsna.qbk;
import xsna.x6y;
import xsna.xey;
import xsna.zcv;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class w8q implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ w8q(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v27, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        ExposedFunction invoke$lambda$17;
        int i = this.b;
        int i2 = 6;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((zak0) ((c9q) obj).c).setValue(Boolean.TRUE);
                return s3q0.a;
            case 1:
                FavesFragment favesFragment = (FavesFragment) obj;
                if (favesFragment.U != null) {
                    enq.a.getClass();
                    enq.e(null);
                } else {
                    favesFragment.finish();
                }
                return s3q0.a;
            case 2:
                return "Session " + ((xti0) obj) + " is duplicate";
            case 3:
                return anj.b(R.color.post_counters_black, ((com.vk.newsfeed.common.recycler.holders.a) obj).itemView.getContext());
            case 4:
                ((tms) obj).a.a(new mms.b(true));
                return s3q0.a;
            case 5:
                ((t3t) obj).c.invoke();
                return s3q0.a;
            case 6:
                return ((y4u) obj).j.a;
            case 7:
                invoke$lambda$17 = HandleInvocationsFromAdViewer.invoke$lambda$17((HandleInvocationsFromAdViewer) obj);
                return invoke$lambda$17;
            case 8:
                int i3 = y2v.m1;
                return ((BiometricAuthComponent) ((k7m) m7m.f((y2v) obj)).mo408a(fpf0.a(BiometricAuthComponent.class))).Y6();
            case 9:
                m5v m5vVar = (m5v) obj;
                m5vVar.q.b(NarrativePublishEventType.CLICK_TO_EDIT_NARRATIVE, m5vVar.p, m5vVar.q6());
                m5vVar.n.h2(m5vVar.q6());
                return s3q0.a;
            case 10:
                int i4 = HomeFragment2.x0;
                return new com.vk.movika.sdk.android.defaultplayer.control.n((HomeFragment2) obj, i2);
            case 11:
                VkImage vkImage = new VkImage(((zcv.a.C4175a) obj).a, null, 6, 0);
                vkImage.setScaleType(ImageView.ScaleType.CENTER_CROP);
                ifx0 ifx0Var = e370.c;
                ifx0 ifx0Var2 = ifx0Var != null ? ifx0Var : null;
                float f = zcv.p;
                int m = krv0.m(R.attr.vk_ui_image_border_alpha, vkImage.getContext());
                ifx0Var2.getClass();
                zq70.E(vkImage, 4.9d, f, m);
                return vkImage;
            case 12:
                ((com.vk.newsfeed.posting.market_picker.presentation.base.view.d) obj).j.b();
                return s3q0.a;
            case 13:
                nzw nzwVar = (nzw) obj;
                xyt0 xyt0Var = nzwVar.b;
                new com.vk.movika.sdk.base.model.props.a(14);
                vyt0 vyt0Var = new vyt0(xyt0Var.getViewModelStore(), new oyt0(), xyt0Var instanceof androidx.lifecycle.f ? ((androidx.lifecycle.f) xyt0Var).getDefaultViewModelCreationExtras() : qbk.a.b);
                rfc a = fpf0.a(nzw.a.class);
                String h = a.h();
                if (h == null) {
                    throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
                }
                nzw.a aVar = (nzw.a) vyt0Var.a("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(h), a);
                String str = nzwVar.a;
                gzs<Instance> gzsVar = nzwVar.c;
                LinkedHashMap linkedHashMap = aVar.b;
                Object obj2 = linkedHashMap.get(str);
                Object obj3 = obj2;
                if (obj2 == null) {
                    uic uicVar = (uic) gzsVar.invoke();
                    linkedHashMap.put(str, uicVar);
                    obj3 = uicVar;
                }
                return (uic) obj3;
            case 14:
                kex.a aVar2 = ((kex) obj).d;
                if (aVar2 != null) {
                    aVar2.a();
                }
                return s3q0.a;
            case 15:
                return ((n1y) obj).b;
            case 16:
                x6y.c cVar = new x6y.c((x6y) obj, x6y.class, "presenter", "getPresenter()Lcom/vk/superapp/browser/internal/delegates/VkUiBrowserPresenter;", 0);
                wvs wvsVar = new wvs();
                wvsVar.a = cVar;
                wvsVar.b = io.reactivex.rxjava3.subjects.d.O0(Boolean.FALSE);
                return wvsVar;
            case 17:
                ((xey) obj).G(xey.c.b);
                return s3q0.a;
            case 18:
                return ((ListGroupCallView) obj).G.animate().setDuration(300L);
            case 19:
                ((aiz.a) obj).c = null;
                return s3q0.a;
            case 20:
                j210 j210Var = (j210) obj;
                h210 h210Var = j210Var.n;
                if (h210Var != null) {
                    j210Var.l.d(h210Var.d, h210Var.c, h210Var.b);
                }
                return s3q0.a;
            case 21:
                return "checkHistoryUpdate: start load update with historyUpdateArgs = " + ((x8v) obj);
            case 22:
                TextPaint textPaint = new TextPaint();
                com.vk.typography.b.c(textPaint, ((hk30) obj).a, FontFamily.REGULAR, Float.valueOf(14.0f), TextSizeUnit.SP);
                return textPaint;
            case 23:
                MusicArtistCatalogRootVh musicArtistCatalogRootVh = (MusicArtistCatalogRootVh) obj;
                bnn0 bnn0Var = musicArtistCatalogRootVh.O.r;
                swp swpVar = bnn0Var instanceof swp ? (swp) bnn0Var : null;
                if (((Boolean) musicArtistCatalogRootVh.q.getValue()).booleanValue()) {
                    j03 j03Var = j03.a;
                    Throwable th = swpVar != null ? swpVar.a : null;
                    j03Var.getClass();
                    if (j03.a(17101, th)) {
                        musicArtistCatalogRootVh.m.b.b.c(false);
                        return s3q0.a;
                    }
                }
                musicArtistCatalogRootVh.j0(true);
                musicArtistCatalogRootVh.M.d();
                return s3q0.a;
            case 24:
                ((MusicCatalogRootVh) obj).B.a().a(false, true);
                return s3q0.a;
            case 25:
                MusicRecommendationOnboardingFragment musicRecommendationOnboardingFragment = (MusicRecommendationOnboardingFragment) obj;
                int i5 = MusicRecommendationOnboardingFragment.Y;
                l7m d = m7m.d(musicRecommendationOnboardingFragment);
                InternalOnboardingComponent.d.getClass();
                FeatureScopesKt$createFeatureScope$scope$1 featureScopesKt$createFeatureScope$scope$1 = new FeatureScopesKt$createFeatureScope$scope$1(SharedScope.a, new pkx(), fpf0.a(InternalOnboardingComponent.class), new zii(3));
                Bundle arguments = musicRecommendationOnboardingFragment.getArguments();
                nwy nwyVar = ((InternalOnboardingComponent) d.d(featureScopesKt$createFeatureScope$scope$1).b(fpf0.a(InternalOnboardingComponent.class), new InternalOnboardingComponent.b(MusicRecommendationOnboardingFragment.class, arguments != null ? arguments.getString("SCENARIO") : null))).c;
                qcy<Object> qcyVar = InternalOnboardingComponent.e[0];
                return (RecommendationOnBoardingModel) nwyVar.c();
            case 26:
                rbk0 rbk0Var = ((l650) obj).i;
                rbk0Var.b.q0(CommonAudioStat$TypeAudioSnippetItem.EventSubtype.GOTO_PLAYLIST, rbk0Var.b());
                return s3q0.a;
            case 27:
                nx50 nx50Var = (nx50) obj;
                BottomNavigationView bottomNavigationView = nx50Var.z;
                if (bottomNavigationView != null) {
                    for (j58 j58Var : bottomNavigationView.c.g) {
                        j58Var.j.setVisibility(8);
                    }
                }
                nx50Var.L0 = null;
                return s3q0.a;
            case 28:
                return ((NewsfeedFragment) obj).m0;
            default:
                return (AttachPickerComponent) ((g8m) obj).a(fpf0.a(AttachPickerComponent.class));
        }
    }
}
