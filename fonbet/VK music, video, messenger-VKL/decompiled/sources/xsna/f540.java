package xsna;

import android.animation.ValueAnimator;
import android.content.Intent;
import android.widget.FrameLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.attachpicker.fragment.gallery.PostingAttachGalleryFragment;
import com.vk.auth.DefaultAuthActivity;
import com.vk.badges.fragments.OneTimeDonutFragment;
import com.vk.bridges.di.BridgeComponent;
import com.vk.clips.design.view.camera.settings.ModalSettingsPrivacyOption;
import com.vk.clips.entrypoints.di.ClipsEntryPointsComponent;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.market.api.di.MarketComponent;
import com.vk.ecomm.orders.impl.common.model.OrderPaymentResult;
import com.vk.ecomm.orders.impl.order.presentation.mvi.OrderAction;
import com.vk.ecomm.products_selection.impl.ProductsSelectionBottomSheet;
import com.vk.feed.settings.impl.presentation.filtered.NewsfeedFilteredSourcesFragment;
import com.vk.mapper.attachment.di.AttachmentMappersComponent;
import com.vk.music.di.StickyPlayerComponent;
import com.vk.music.pref.MusicPrefsComponent;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.newsfeed.impl.presentation.search.presentation.fragment.NewsfeedSearchFragment;
import com.vk.newsfeed.posting.impl.data.db.PostingDatabase;
import com.vk.posting.presentation.video.search.SearchVideoPickerFragment;
import com.vk.search.communities.map.impl.ui.details.SearchCommunitiesOnMapDetailsFragment;
import com.vk.stat.scheme.MobileOfficialAppsConStoriesStat$ViewEntryPoint;
import com.vk.superapp.ui.SuperAppFragment;
import com.vk.video.ui.upload.impl.publish.presentation.publish.fragment.PublishFragmentInternalComponent;
import com.vkontakte.android.R;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;
import xsna.a7f0;
import xsna.cqc0;
import xsna.s1c0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class f540 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f540(DefaultAuthActivity defaultAuthActivity, Ref$ObjectRef ref$ObjectRef) {
        this.b = 10;
        this.c = defaultAuthActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v30, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v16, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        boolean multiUploadHelper_delegate$lambda$0$0;
        int i = this.b;
        int i2 = 1;
        Object obj = this.c;
        switch (i) {
            case 0:
                multiUploadHelper_delegate$lambda$0$0 = MultiFileUploader.multiUploadHelper_delegate$lambda$0$0((MultiFileUploader) obj);
                return Boolean.valueOf(multiUploadHelper_delegate$lambda$0$0);
            case 1:
                return ((MarketComponent) ((k7m) m7m.f((com.vk.catalog2.feature.music.configuration.a) obj)).a(fpf0.a(MarketComponent.class))).l7();
            case 2:
                int i3 = yc50.x1;
                return ((MusicPrefsComponent) m7m.d((yc50) obj).a(fpf0.a(MusicPrefsComponent.class))).Q0();
            case 3:
                return (u5k0) obj;
            case 4:
                NewsfeedFilteredSourcesFragment newsfeedFilteredSourcesFragment = (NewsfeedFilteredSourcesFragment) obj;
                io.reactivex.rxjava3.core.q qVar = ((ysg0) newsfeedFilteredSourcesFragment.X.getValue()).a;
                n1r n1rVar = new n1r(new m360(newsfeedFilteredSourcesFragment, i2), 9);
                int i4 = kwg0.a;
                newsfeedFilteredSourcesFragment.getFeature().e.b(qVar.subscribe(n1rVar, new hwg0()));
                return s3q0.a;
            case 5:
                return ((AttachmentMappersComponent) ((bpn0) obj).getValue()).f3();
            case 6:
                NewsfeedSearchFragment newsfeedSearchFragment = (NewsfeedSearchFragment) obj;
                qcy<Object>[] qcyVarArr = NewsfeedSearchFragment.p0;
                UserId userId = newsfeedSearchFragment.eo().a;
                if (userId != null && fkq0.d(userId)) {
                    s1c0.a aVar = new s1c0.a();
                    aVar.x = true;
                    aVar.b = true;
                    aVar.o = true;
                    sf2 sf2Var = new sf2();
                    sf2Var.b = newsfeedSearchFragment.k0.get();
                    aVar.s = sf2Var.a();
                    return aVar.a();
                }
                if (userId == null || !fkq0.b(userId)) {
                    s1c0.a aVar2 = new s1c0.a();
                    aVar2.b = true;
                    sf2 sf2Var2 = new sf2();
                    sf2Var2.b = newsfeedSearchFragment.k0.get();
                    aVar2.s = sf2Var2.a();
                    aVar2.F = true;
                    aVar2.G = MobileOfficialAppsConStoriesStat$ViewEntryPoint.SEARCH_STORY_LIST;
                    return aVar2.a();
                }
                s1c0.a aVar3 = new s1c0.a();
                aVar3.y = true;
                aVar3.b = true;
                aVar3.o = true;
                sf2 sf2Var3 = new sf2();
                sf2Var3.b = newsfeedSearchFragment.k0.get();
                aVar3.s = sf2Var3.a();
                return aVar3.a();
            case 7:
                return (PostingDatabase) bhv0.a(((sz70) obj).a, "posting_db", PostingDatabase.class).b();
            case 8:
                int i5 = OneTimeDonutFragment.V;
                return ((NewsFeedComponent) ((OneTimeDonutFragment) obj).S.getValue()).l0();
            case 9:
                ((ru80) obj).a.invoke(new OrderAction.f(OrderPaymentResult.Failed));
                return s3q0.a;
            case 10:
                ((DefaultAuthActivity) obj).finish();
                return s3q0.a;
            case 11:
                e2b0.this.q();
                return s3q0.a;
            case 12:
                ((iwb0) obj).d();
                return s3q0.a;
            case 13:
                ((NewsFeedComponent) ((k7m) m7m.f((com.vk.newsfeed.impl.presenters.b) obj)).a(fpf0.a(NewsFeedComponent.class))).n0();
                return iuc0.b;
            case 14:
                PostingAttachGalleryFragment postingAttachGalleryFragment = ((dcc0) obj).b;
                postingAttachGalleryFragment.startActivityForResult(new Intent(postingAttachGalleryFragment.getActivity(), (Class<?>) postingAttachGalleryFragment.h0.getValue()).putExtra("type", 2), 11);
                return s3q0.a;
            case 15:
                return (ClipsEntryPointsComponent) ((k7m) m7m.f((pgc0) obj)).mo408a(fpf0.a(ClipsEntryPointsComponent.class));
            case 16:
                ModalSettingsPrivacyOption modalSettingsPrivacyOption = new ModalSettingsPrivacyOption(((cqc0.c) obj).a, null, 6);
                modalSettingsPrivacyOption.setTitle(R.string.clips_posting_privacy_available_only_best_friends);
                bwt0.p0(modalSettingsPrivacyOption, false);
                return modalSettingsPrivacyOption;
            case 17:
                nuc0 nuc0Var = (nuc0) obj;
                mo60 mo60Var = nuc0Var.a;
                return new hv50(mo60Var.X, mo60Var.Y, ((NewsFeedComponent) nuc0Var.c.getValue()).cc());
            case 18:
                int i6 = ProductsSelectionBottomSheet.u1;
                return ((BridgeComponent) ((k7m) m7m.f((ProductsSelectionBottomSheet) obj)).a(fpf0.a(BridgeComponent.class))).p().e();
            case 19:
                return ((PublishFragmentInternalComponent) obj).h.y3();
            case 20:
                final p6f0 p6f0Var = (p6f0) obj;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                ofFloat.setStartDelay(0L);
                ofFloat.setDuration(133L);
                ofFloat.setInterpolator(new pkk(0.33f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.83f, 0.83f));
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: xsna.n6f0
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        p6f0 p6f0Var2 = p6f0.this;
                        k6f0 k6f0Var = p6f0Var2.b;
                        int length = k6f0Var.getReactionViews().length;
                        int i7 = p6f0Var2.h;
                        if (i7 < 0 || i7 >= length) {
                            return;
                        }
                        f3r f3rVar = k6f0Var.getReactionViews()[p6f0Var2.h];
                        float f = p6f0Var2.i;
                        f3rVar.setTranslationY(((p6f0Var2.j - f) * floatValue) + f);
                    }
                });
                return ofFloat;
            case 21:
                return Float.valueOf(f17.e((h17) obj));
            case 22:
                return new SearchCommunitiesOnMapDetailsFragment.a(((SearchCommunitiesOnMapDetailsFragment.b) obj).j);
            case 23:
                int i7 = SearchVideoPickerFragment.U;
                return new djl(new cf00((SearchVideoPickerFragment) obj, 23));
            case 24:
                ((zak0) ((u8i0) obj).c).setValue("");
                return s3q0.a;
            case 25:
                of6 of6Var = (of6) obj;
                io.reactivex.rxjava3.disposables.c cVar = (io.reactivex.rxjava3.disposables.c) of6Var.a;
                if (cVar != null) {
                    cVar.dispose();
                }
                of6Var.a = null;
                return s3q0.a;
            case 26:
                mwi0 mwi0Var = (mwi0) obj;
                com.vk.voip.ui.c.b.getClass();
                com.vk.voip.ui.sessionrooms.d dVar = com.vk.voip.ui.c.B0;
                a7f0.a.d(mwi0Var, new io.reactivex.rxjava3.internal.operators.single.s(dVar.l().K(), new ie40(new pwi0(dVar), 10)), null, new r8a0(mwi0Var, 20), new dac0(mwi0Var, 8), 1);
                return s3q0.a;
            case 27:
                return (FrameLayout) ((com.vk.sharing.core.view.f) obj).findViewById(R.id.sharing_attach_container);
            case 28:
                nwy nwyVar = ((StickyPlayerComponent) ((k7m) m7m.c((jfl0) obj)).mo408a(fpf0.a(StickyPlayerComponent.class))).b;
                qcy<Object> qcyVar = StickyPlayerComponent.c[1];
                return (ny40) nwyVar.c();
            default:
                c7n0 c7n0Var = ((SuperAppFragment) obj).b0;
                if (c7n0Var == null) {
                    return null;
                }
                return c7n0Var;
        }
    }

    public /* synthetic */ f540(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }
}
