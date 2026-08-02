package xsna;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.navigation.vk.RouterComponent;
import com.vk.api.generated.superApp.dto.SuperAppItemDto;
import com.vk.bridges.di.AuthBridgeComponent;
import com.vk.bridges.di.BridgeComponent;
import com.vk.catalog2.common.ui.mvp.auto.VKAndroidAutoCatalogMediaService;
import com.vk.catalog2.common.ui.mvp.holder.header.VkTopBarVh;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoCatalogRootVh;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoItemListLargeVh;
import com.vk.core.ui.modal.VkModal;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.cell.rich.middle.VkRichCellMiddle;
import com.vk.dto.newsfeed.WallGetMode;
import com.vk.feed.design.view.newsfeed.header.subtitle.VkFeedPostHeaderSubtitleTextView;
import com.vk.libvideo.design.view.video.VideoView;
import com.vk.mapper.attachment.di.AttachmentMappersComponent;
import com.vk.newsfeed.impl.fragments.video.tree.VideoCommentsTreeInPlayerFragment;
import com.vk.photos.root.di.PhotosComponent;
import com.vk.profile.user.impl.ui.UserProfileAction;
import com.vk.profile.user.impl.ui.UserProfileFragment;
import com.vk.search.ui.api.di.SearchUiComponent;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedUserProfile;
import java.util.HashSet;
import one.video.controls20.SimpleControlsView;
import xsna.y2p0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class tfm0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ tfm0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        int i2 = 0;
        Object[] objArr = 0;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((ikv0) obj).a();
                return s3q0.a;
            case 1:
                n3n0 n3n0Var = (n3n0) obj;
                ez20 ez20Var = n3n0Var.h;
                if (ez20Var != null) {
                    ez20Var.Ff("SuggestStartInterestsDialog");
                }
                n3n0Var.a.j();
                return s3q0.a;
            case 2:
                io.reactivex.rxjava3.subjects.d<s3q0> dVar = ((com.vk.superapp.ui.a) obj).t;
                s3q0 s3q0Var = s3q0.a;
                dVar.onNext(s3q0Var);
                com.vk.superapp.ui.a.S1().h(e43.l(SuperAppItemDto.TypeDto.MINI_WIDGETS.i(), "universal_vkrun"));
                return s3q0Var;
            case 3:
                tuo0 tuo0Var = (tuo0) obj;
                if (!kuo0.r(tuo0Var)) {
                    tuo0Var.e(tuo0Var.c() + 12);
                }
                return s3q0.a;
            case 4:
                ((y2p0) obj).getClass();
                return s3q0.a;
            case 5:
                return ((pzp0) obj).n;
            case 6:
                return "put(uploadFile: " + ((dbq0) obj).a + ", force: false)";
            case 7:
                HashSet hashSet = iah0.a;
                return Integer.valueOf(Math.min(((FragmentActivity) obj).getResources().getDisplayMetrics().widthPixels, dw20.e1));
            case 8:
                int i3 = UserProfileFragment.p0;
                return (PhotosComponent) ((k7m) m7m.f((UserProfileFragment) obj)).a(fpf0.a(PhotosComponent.class));
            case 9:
                ((arq0) obj).n.a(UserProfileAction.d.b.a.C1675a.b);
                return s3q0.a;
            case 10:
                return (ExtendedUserProfile) obj;
            case 11:
                mxq0 mxq0Var = (mxq0) obj;
                WallGetMode wallGetMode = mxq0Var.d;
                return wallGetMode == WallGetMode.MAIN ? new lsq0(mxq0Var, mxq0Var.n(), (wrq0) mxq0Var.i.getValue()) : new zwq0(mxq0Var, mxq0Var.n(), wallGetMode);
            case 12:
                boolean z = VKAndroidAutoCatalogMediaService.o;
                return ((AuthBridgeComponent) ((k7m) m7m.b((VKAndroidAutoCatalogMediaService) obj)).a(fpf0.a(AuthBridgeComponent.class))).s();
            case 13:
                ker0 ker0Var = (ker0) obj;
                if (ker0Var.S) {
                    FragmentActivity activity = ker0Var.getActivity();
                    if (activity != null) {
                        activity.finish();
                    }
                } else {
                    FragmentActivity activity2 = ker0Var.getActivity();
                    if (activity2 != null) {
                        activity2.onBackPressed();
                    }
                }
                return s3q0.a;
            case 14:
                return new fk30(((View) obj).getContext());
            case 15:
                k78 k78Var = ((e6s0) obj).d.e;
                if (k78Var != null) {
                    k78Var.a("video_bottom_sheet");
                }
                return s3q0.a;
            case 16:
                int i4 = VideoCatalogRootVh.M0;
                return ((BridgeComponent) ((k7m) m7m.f((VideoCatalogRootVh) obj)).a(fpf0.a(BridgeComponent.class))).s();
            case 17:
                String[] strArr = VideoCommentsTreeInPlayerFragment.c0;
                return ((AttachmentMappersComponent) m7m.d((VideoCommentsTreeInPlayerFragment) obj).mo408a(fpf0.a(AttachmentMappersComponent.class))).f3();
            case 18:
                VideoItemListLargeVh videoItemListLargeVh = (VideoItemListLargeVh) obj;
                return new l5u0(new oqh0(videoItemListLargeVh, 14), new ghn0(videoItemListLargeVh, 9), new cem0(2));
            case 19:
                return (SearchUiComponent) ((f8m) obj).a(fpf0.a(SearchUiComponent.class));
            case 20:
                qcy<Object>[] qcyVarArr = VideoView.T0;
                Boolean value = ((VideoView) obj).getViewBinding().g.getAreControlsHiddenBySkippable$core_release().getValue();
                value.booleanValue();
                return value;
            case 21:
                return ((uqt0) obj).a.X4(SimpleControlsView.ViewType.SETTINGS);
            case 22:
                return ((RouterComponent) ((k7m) m7m.f((com.vk.catalog2.common.ui.mvp.configuration.a) obj)).a(fpf0.a(RouterComponent.class))).a();
            case 23:
                return Integer.valueOf(VkFeedPostHeaderSubtitleTextView.b((VkFeedPostHeaderSubtitleTextView) obj));
            case 24:
                VkModal vkModal = (VkModal) obj;
                vkModal.f = null;
                gzs<s3q0> gzsVar = vkModal.d;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                return s3q0.a;
            case 25:
                int i5 = VkRichCellMiddle.p;
                return new VkButton(((VkRichCellMiddle) obj).getContext(), objArr == true ? 1 : 0, 6, i2);
            case 26:
                VkTopBarVh vkTopBarVh = (VkTopBarVh) obj;
                if (vkTopBarVh.r) {
                    vkTopBarVh.a();
                } else if (vkTopBarVh.e.e.invoke().booleanValue()) {
                    vkTopBarVh.d.a();
                } else {
                    vkTopBarVh.b.c(false);
                }
                return s3q0.a;
            case 27:
                return ((mjw0) obj).b;
            case 28:
                hd8 a = ((r4x0) obj).a();
                return new it80(a != null ? a.f : null);
            default:
                return (ViewGroup) ((y0y0) obj).a.findViewById(R.id.comment_restriction_container);
        }
    }

    public /* synthetic */ tfm0(y2p0 y2p0Var, y2p0.a aVar) {
        this.b = 4;
        this.c = y2p0Var;
    }
}
