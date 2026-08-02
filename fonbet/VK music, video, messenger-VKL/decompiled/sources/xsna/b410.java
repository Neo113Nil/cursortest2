package xsna;

import android.animation.ValueAnimator;
import android.os.Build;
import android.os.Bundle;
import android.os.Messenger;
import android.os.Parcelable;
import android.text.TextPaint;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import com.unity3d.ads.core.data.datasource.StoreDataSource;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.di.ServiceProvider;
import com.unity3d.services.core.di.ServicesRegistry;
import com.vk.audience.api.di.AudienceResearchComponent;
import com.vk.bridges.di.BridgeComponent;
import com.vk.catalog2.feature.music.configuration.MusicSearchCatalogConfiguration;
import com.vk.clips.download.api.di.ClipsDownloadComponent;
import com.vk.di.scope.FeatureScopesKt$createFeatureScope$scope$2;
import com.vk.di.scope.SharedScope;
import com.vk.ecomm.market.api.di.MarketComponent;
import com.vk.ecomm.reviews.api.di.ReviewsComponent;
import com.vk.ecomm.reviews.impl.marketitem.reviews.presentation.MarketItemReviewsFragment;
import com.vk.music.pref.MusicPrefsComponent;
import com.vk.newsfeed.common.presentation.model.items.CoownershipStatusUiDto;
import com.vk.newsfeed.impl.newsfeed.presentation.base.fragment.NewsfeedFragment;
import com.vk.profile.questions.impl.QuestionsListFragment;
import com.vk.qrcode.QRStatsTracker;
import com.vk.report.api.di.ReportComponent;
import com.vk.repository.data.api.di.DataRepositoryComponent;
import com.vk.sharing.api.di.SharingComponent;
import com.vk.sharing.core.SharingActivity;
import com.vk.stat.scheme.SchemeStat$TypeQuestionItem;
import com.vk.story.settings.api.di.StoriesSettingsComponent;
import com.vk.toggle.features.CoreFeatures;
import com.vk.typography.FontFamily;
import com.vk.typography.TextSizeUnit;
import com.vk.video.playlist.playlistscreen.PlaylistScreenArgs;
import com.vk.video.playlist.playlistscreen.di.PlaylistScreenFragmentInternalComponent;
import com.vk.video.playlist.playlistscreen.ui.PlaylistScreenFragment;
import com.vkontakte.android.R;
import kotlin.collections.EmptyList;
import xsna.fhc0;
import xsna.l650.a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class b410 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b410(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r1v53, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        Parcelable parcelable;
        Object parcelable2;
        StoreDataSource initialize$lambda$220$lambda$42;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                MarketItemReviewsFragment marketItemReviewsFragment = (MarketItemReviewsFragment) obj;
                int i2 = MarketItemReviewsFragment.w0;
                return new w410(marketItemReviewsFragment, ((ReportComponent) m7m.d(marketItemReviewsFragment).mo408a(fpf0.a(ReportComponent.class))).d4(), ((BridgeComponent) m7m.d(marketItemReviewsFragment).a(fpf0.a(BridgeComponent.class))).F(), ((BridgeComponent) m7m.d(marketItemReviewsFragment).a(fpf0.a(BridgeComponent.class))).p().e(), ((BridgeComponent) m7m.d(marketItemReviewsFragment).a(fpf0.a(BridgeComponent.class))).s(), new MarketItemReviewsFragment.c(1, marketItemReviewsFragment, MarketItemReviewsFragment.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0), ((SharingComponent) m7m.d(marketItemReviewsFragment).a(fpf0.a(SharingComponent.class))).P8(), ((ReviewsComponent) m7m.d(marketItemReviewsFragment).a(fpf0.a(ReviewsComponent.class))).Md());
            case 1:
                hk30 hk30Var = (hk30) obj;
                TextPaint textPaint = new TextPaint();
                textPaint.setColor(-16777216);
                com.vk.typography.b.c(textPaint, hk30Var.a, FontFamily.MEDIUM, Float.valueOf(hk30Var.b.b(R.dimen.vkim_msg_part_snippet_title_size)), TextSizeUnit.PX);
                return textPaint;
            case 2:
                qk30.f(((vm30) obj).H, EmptyList.b, null);
                return s3q0.a;
            case 3:
                return ((MusicPrefsComponent) ((k7m) m7m.c((View) obj)).a(fpf0.a(MusicPrefsComponent.class))).Q0();
            case 4:
                return ((MarketComponent) ((k7m) m7m.f((MusicSearchCatalogConfiguration) obj)).a(fpf0.a(MarketComponent.class))).l7();
            case 5:
                return ((l650) obj).new a();
            case 6:
                return ((StoriesSettingsComponent) ((k7m) m7m.f((q860) obj)).a(fpf0.a(StoriesSettingsComponent.class))).B7();
            case 7:
                qcy<Object>[] qcyVarArr = NewsfeedFragment.J0;
                return ((NewsfeedFragment) obj).fo().g();
            case 8:
                return new f170(((ct60) obj).c.i);
            case 9:
                return b660.a(((jk80) obj).a);
            case 10:
                PlaylistScreenFragment playlistScreenFragment = (PlaylistScreenFragment) obj;
                qcy<Object>[] qcyVarArr2 = PlaylistScreenFragment.T;
                Bundle requireArguments = playlistScreenFragment.requireArguments();
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable2 = requireArguments.getParcelable("arguments", PlaylistScreenArgs.class);
                    parcelable = (Parcelable) parcelable2;
                } else {
                    Parcelable parcelable3 = requireArguments.getParcelable("arguments");
                    parcelable = (PlaylistScreenArgs) (parcelable3 instanceof PlaylistScreenArgs ? parcelable3 : null);
                }
                tcb0 tcb0Var = new tcb0((PlaylistScreenArgs) parcelable);
                l7m d = m7m.d(playlistScreenFragment);
                PlaylistScreenFragmentInternalComponent.x.getClass();
                return (PlaylistScreenFragmentInternalComponent) d.d(new FeatureScopesKt$createFeatureScope$scope$2(SharedScope.a, tcb0Var, fpf0.a(PlaylistScreenFragmentInternalComponent.class), new hkb(7))).a(fpf0.a(PlaylistScreenFragmentInternalComponent.class));
            case 11:
                return (EditText) ((hpb0) obj).g(R.id.poll_question_view);
            case 12:
                ((bzb0) obj).e = null;
                return s3q0.a;
            case 13:
                return (DataRepositoryComponent) ((k7m) m7m.f((xzb0) obj)).a(fpf0.a(DataRepositoryComponent.class));
            case 14:
                f0c0 f0c0Var = ((s5c0) obj).h;
                return new m5c0(f0c0Var.b, f0c0Var.c, f0c0Var.B, f0c0Var.s, "", null, ur60.h, f0c0Var.p, f0c0Var.n, f0c0Var.o, f0c0Var.q, f0c0Var.t, CoownershipStatusUiDto.None, EmptyList.b);
            case 15:
                return (AudienceResearchComponent) ((y8c0) obj).b.a(fpf0.a(AudienceResearchComponent.class));
            case 16:
                return Boolean.valueOf(((com.vk.newsfeed.impl.items.posting.item.modals.b) obj).a.j.a);
            case 17:
                ylc0 ylc0Var = (ylc0) obj;
                return new xch(ylc0Var.c, (jbc0) ylc0Var.f.getValue(), (fhc0.e) ylc0Var.g.getValue(), ylc0Var.b);
            case 18:
                return ((SharingComponent) ((rkd0) obj).i.getValue()).v();
            case 19:
                return ((Messenger) ((che0) obj).d.getValue()).getBinder();
            case 20:
                gzs gzsVar = (gzs) obj;
                if (gzsVar != null) {
                    gzsVar.invoke();
                    dw20 dw20Var = com.vk.qrcode.d.k;
                    if (dw20Var != null) {
                        dw20Var.dismiss();
                    }
                    QRStatsTracker qRStatsTracker = QRStatsTracker.a;
                    QRStatsTracker.a(QRStatsTracker.Action.OPEN_LINK_FROM_AVATAR);
                }
                return s3q0.a;
            case 21:
                int i3 = QuestionsListFragment.f0;
                ((QuestionsListFragment) obj).lo();
                mpe0.b(SchemeStat$TypeQuestionItem.Type.CALL_FRIENDS, null, null, null, null, null, 48);
                return s3q0.a;
            case 22:
                gzs gzsVar2 = (gzs) ((zak0) ((cye0) obj).c).getValue();
                if (gzsVar2 != null) {
                    gzsVar2.invoke();
                }
                return s3q0.a;
            case 23:
                final b3f0 b3f0Var = (b3f0) obj;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -35.0f);
                ofFloat.setStartDelay(b3f0.s);
                ofFloat.setDuration(b3f0.r);
                ofFloat.setInterpolator(new LinearInterpolator());
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: xsna.a3f0
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        b3f0.this.b.setViewsRotation(((Float) valueAnimator.getAnimatedValue()).floatValue());
                    }
                });
                return ofFloat;
            case 24:
                return Boolean.valueOf(szg0.d((szg0) obj));
            case 25:
                ((zrh0) obj).b.d(true);
                return s3q0.a;
            case 26:
                initialize$lambda$220$lambda$42 = ServiceProvider.initialize$lambda$220$lambda$42((ServicesRegistry) obj);
                return initialize$lambda$220$lambda$42;
            case 27:
                return zr.a("Session.setConnectionReused() - parameter \"", (String) obj, "\" value is not 0/1!");
            case 28:
                Bundle bundle = SharingActivity.n0;
                return (ClipsDownloadComponent) j6i.b(m7m.a((SharingActivity) obj), ClipsDownloadComponent.class);
            default:
                Boolean bool = ((com.vk.sharing.core.view.f) obj).C;
                return Boolean.valueOf(bool != null ? bool.booleanValue() : com.vk.toggle.b.A.a(CoreFeatures.SHARING_REDESIGN));
        }
    }
}
