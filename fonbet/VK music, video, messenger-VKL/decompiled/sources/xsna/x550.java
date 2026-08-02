package xsna;

import android.widget.EditText;
import com.vk.ads.di.NewsfeedOptionalAdsComponent;
import com.vk.badges.fragments.OneTimeDonutFragment;
import com.vk.bridges.di.BridgeComponent;
import com.vk.catalog2.common.ui.mvp.holder.container.ShowAllListVh;
import com.vk.clips.config.viewers.api.di.ClipsConfigViewersComponent;
import com.vk.clips.design.view.camera.settings.ModalSettingsPrivacyOption;
import com.vk.ecomm.market.api.di.MarketComponent;
import com.vk.ecomm.orders.impl.common.model.OrderPaymentResult;
import com.vk.ecomm.orders.impl.order.presentation.mvi.OrderAction;
import com.vk.ecomm.products_selection.impl.ProductsSelectionBottomSheet;
import com.vk.mapper.attachment.di.AttachmentMappersComponent;
import com.vk.music.pref.CrossfadeOnboarding;
import com.vk.narratives.api.di.NarrativeComponent;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.newsfeed.impl.presentation.suggested.presentation.fragment.SuggestedPostsFragment;
import com.vk.onboarding.api.di.VkOnboardingComponent;
import com.vk.photos.root.di.PhotosComponent;
import com.vk.photos.root.photoflow.presentation.PhotoFlowFragment;
import com.vk.photos.ui.profile.ProfileMainPhotosFragment;
import com.vk.story.api.di.StoriesComponent;
import com.vk.video.ui.upload.impl.publish.presentation.publish.fragment.PublishFragmentInternalComponent;
import com.vkontakte.android.R;
import java.io.File;
import kotlin.Lazy;
import xsna.a9m0;
import xsna.cqc0;
import xsna.m5u;
import xsna.yo60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class x550 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ x550(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v46, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                return ((z550) obj).o().q();
            case 1:
                yc50 yc50Var = (yc50) obj;
                return new nc50(yc50Var.m1, yc50Var.l1, yc50Var.p1, ((BridgeComponent) yc50Var.r1.getValue()).Le(), (gxh) yc50Var.o1.getValue(), yc50.bo(yc50Var.requireArguments()), (i940) yc50Var.t1.getValue(), ((com.vk.music.pref.a) yc50Var.u1.getValue()).q() != CrossfadeOnboarding.None);
            case 2:
                return ((StoriesComponent) ((k7m) m7m.f((ep50) obj)).a(fpf0.a(StoriesComponent.class))).R5();
            case 3:
                return ((NewsFeedComponent) ((k7m) m7m.c(((fr50) obj).itemView)).a(fpf0.a(NewsFeedComponent.class))).ib();
            case 4:
                return (NewsfeedOptionalAdsComponent) ((k7m) m7m.f((kh60) obj)).mo408a(fpf0.a(NewsfeedOptionalAdsComponent.class));
            case 5:
                return ((AttachmentMappersComponent) ((bpn0) obj).getValue()).g4();
            case 6:
                return new ii60((Lazy) obj);
            case 7:
                ox60 ox60Var = (ox60) obj;
                fq60 fq60Var = (fq60) ox60Var.e.getValue();
                yo60.j.a aVar = yo60.j.a.a;
                gq60 gq60Var = ox60Var.c;
                fq60Var.getClass();
                fq60.c(aVar, gq60Var);
                return s3q0.a;
            case 8:
                return ((VkOnboardingComponent) m7m.a(e3m.h(((jd80) obj).b.getContext())).a(fpf0.a(VkOnboardingComponent.class))).p3();
            case 9:
                int i2 = OneTimeDonutFragment.V;
                return ((NewsFeedComponent) ((OneTimeDonutFragment) obj).S.getValue()).w();
            case 10:
                ((ru80) obj).a.invoke(new OrderAction.f(OrderPaymentResult.Cancelled));
                return s3q0.a;
            case 11:
                ((f540) obj).invoke();
                return s3q0.a;
            case 12:
                int i3 = PhotoFlowFragment.m0;
                return ((PhotoFlowFragment) obj).fo().o5();
            case 13:
                ((iwb0) obj).c();
                return s3q0.a;
            case 14:
                return ((NewsFeedComponent) ((k7m) m7m.c(((d1c0) obj).itemView)).a(fpf0.a(NewsFeedComponent.class))).l0();
            case 15:
                return ((ClipsConfigViewersComponent) ((k7m) m7m.f((com.vk.newsfeed.impl.presenters.b) obj)).a(fpf0.a(ClipsConfigViewersComponent.class))).getExperiments();
            case 16:
                return ((BridgeComponent) ((k7m) m7m.f((pgc0) obj)).a(fpf0.a(BridgeComponent.class))).p().e();
            case 17:
                ModalSettingsPrivacyOption modalSettingsPrivacyOption = new ModalSettingsPrivacyOption(((cqc0.c) obj).a, null, 6);
                modalSettingsPrivacyOption.setTitle(R.string.clips_posting_privacy_available_add_best_friends);
                bwt0.p0(modalSettingsPrivacyOption, false);
                return modalSettingsPrivacyOption;
            case 18:
                ((lbe) obj).invoke(m5u.b.b);
                return s3q0.a;
            case 19:
                int i4 = ProductsSelectionBottomSheet.u1;
                return ((MarketComponent) ((k7m) m7m.f((ProductsSelectionBottomSheet) obj)).a(fpf0.a(MarketComponent.class))).Ob();
            case 20:
                int i5 = ProfileMainPhotosFragment.F0;
                return (PhotosComponent) m7m.d((ProfileMainPhotosFragment) obj).a(fpf0.a(PhotosComponent.class));
            case 21:
                return ((PublishFragmentInternalComponent) obj).d.x();
            case 22:
                return new l9r((File) ((a0f0) obj).a.getValue(), 52428800L);
            case 23:
                return (EditText) ((com.vk.sharing.core.view.f) obj).findViewById(R.id.sharing_comment_input_common);
            case 24:
                ((ShowAllListVh) obj).q.d();
                return s3q0.a;
            case 25:
                return Boolean.valueOf(((rg50) obj).getIntValue() < 0);
            case 26:
                return ((NarrativeComponent) ((k7m) m7m.c(((com.vk.story.viewer.impl.presentation.stories.view.storyview.b) obj).a)).a(fpf0.a(NarrativeComponent.class))).Ic();
            case 27:
                x6m0 x6m0Var = (x6m0) obj;
                o1l0 o1l0Var = x6m0Var.f;
                if (o1l0Var != null) {
                    ((kdl0) o1l0Var).a(x6m0Var);
                }
                return s3q0.a;
            case 28:
                int i6 = d9m0.n1;
                ((d9m0) obj).getFeature().C(a9m0.b.b);
                return s3q0.a;
            default:
                SuggestedPostsFragment suggestedPostsFragment = (SuggestedPostsFragment) obj;
                return new uq60(suggestedPostsFragment, suggestedPostsFragment.Y, suggestedPostsFragment.eo().a.Y, suggestedPostsFragment.eo().x);
        }
    }
}
