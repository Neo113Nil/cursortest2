package xsna;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.ImageButton;
import com.vk.ads.api.di.AdsComponent;
import com.vk.attachpicker.base.BaseAttachPickerFragment;
import com.vk.attachpicker.impl.DeprecatedAttachActivity;
import com.vk.attachpicker.impl.fragment.video.AttachVideoFragment;
import com.vk.bridges.di.BridgeComponent;
import com.vk.catalog2.common.ui.mvp.holder.group.CommunitiesCatalogRootVh;
import com.vk.catalog2.common.ui.mvp.holder.group.CommunitiesVerticalPaginationViewVkUi;
import com.vk.catalog2.common.ui.mvp.holder.video.AuthorsCatalogRootVh;
import com.vk.channels.impl.channel_screen.ChannelFragment;
import com.vk.clips.entrypoints.params.ClipsEntryPointsParams;
import com.vk.clips.entrypoints.ui.ClipsEntryPointsFragment;
import com.vk.clips.playlists.ClipsPlaylistPickerParams;
import com.vk.clips.playlists.ui.picker.ClipsPlaylistPickerFragment;
import com.vk.clips.sdk.shared.item.ads.events.AdsItemViewEvent;
import com.vk.dto.common.id.UserId;
import com.vk.money.createtransfer.people.CreatePeopleTransferFragment;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.newsfeed.impl.postmodal.comments.CommentsOutherFragment;
import com.vk.newsfeed.posting.mediapicker.photovk.base.BasePhotoListFragment;
import com.vk.photos.ui.editalbum.presentation.CreateAlbumFragment;
import com.vk.search.integration.api.di.SearchComponent;
import com.vk.search.params.api.di.SearchParamsComponent;
import com.vk.superapp.miniapps.impl.AppsCatalogSearchFragment;
import com.vkontakte.android.R;
import java.util.ArrayList;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.ok.android.webrtc.di.CallModuleImpl;
import xsna.ghw0;
import xsna.iqh0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class sx0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ sx0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v54, types: [android.os.Parcelable] */
    /* JADX WARN: Type inference failed for: r0v81, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v90, types: [T extends xsna.oak] */
    @Override // xsna.gzs
    public final Object invoke() {
        Object obj;
        Object parcelable;
        int i = this.b;
        int i2 = 4;
        boolean z = false;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((tx0) obj2).b.a(AdsItemViewEvent.a.b);
                return s3q0.a;
            case 1:
                AppsCatalogSearchFragment appsCatalogSearchFragment = (AppsCatalogSearchFragment) obj2;
                int i3 = AppsCatalogSearchFragment.T;
                return ((SearchComponent) m7m.d(appsCatalogSearchFragment).mo408a(fpf0.a(SearchComponent.class))).V3().a(new iqh0.c(appsCatalogSearchFragment, appsCatalogSearchFragment.requireContext().getString(R.string.vk_search)));
            case 2:
                return Boolean.valueOf(((AuthorsCatalogRootVh) obj2).m.b.b.c(false));
            case 3:
                int i4 = BaseAttachPickerFragment.y0;
                return new BaseAttachPickerFragment.d((BaseAttachPickerFragment) obj2);
            case 4:
                j96 j96Var = (j96) obj2;
                return new e8m0((Activity) j96Var.c.invoke(), (u76) j96Var.e.invoke(), j96Var.getStickersDrawingView());
            case 5:
                ((vgg) obj2).c();
                return s3q0.a;
            case 6:
                int i5 = BasePhotoListFragment.l0;
                return ((NewsFeedComponent) m7m.d((BasePhotoListFragment) obj2).a(fpf0.a(NewsFeedComponent.class))).w();
            case 7:
                cr6 cr6Var = (cr6) obj2;
                int i6 = cr6.D;
                ImageButton imageButton = (ImageButton) hvt0.a(cr6Var.getIconViewId(), cr6Var, new op1(cr6Var, i2));
                imageButton.setImportantForAccessibility(2);
                return imageButton;
            case 8:
                g27 g27Var = (g27) obj2;
                return new rf0(g27Var.W, g27Var.V, new d27(g27Var, z ? 1 : 0), g27Var.T, g27Var.U);
            case 9:
                return Boolean.valueOf(CallModuleImpl.e((CallModuleImpl) obj2));
            case 10:
                ((u59) obj2).d.a(ghw0.c.a);
                return s3q0.a;
            case 11:
                ChannelFragment channelFragment = (ChannelFragment) obj2;
                int i7 = ChannelFragment.a1;
                return new a3b(channelFragment.mo(), channelFragment.isPostponed(), (izv) channelFragment.W.getValue(), (lzv) channelFragment.X.getValue());
            case 12:
                io.reactivex.rxjava3.disposables.c cVar = ((cxb) obj2).x.g;
                if (cVar != null) {
                    cVar.dispose();
                }
                return s3q0.a;
            case 13:
                BridgeComponent bridgeComponent = (BridgeComponent) obj2;
                return new b1r(bridgeComponent.p(), bridgeComponent.F());
            case 14:
                return ((cmf) ((uvd) obj2).f.getValue()).e();
            case 15:
                return ((hyd) obj2).i().findViewById(R.id.fullscreen_editor_overlay_view);
            case 16:
                int i8 = ClipsEntryPointsFragment.i0;
                ClipsEntryPointsParams jo = ((ClipsEntryPointsFragment) obj2).jo();
                return Boolean.valueOf(jo != null ? jo.e : false);
            case 17:
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) obj2;
                bkd bkdVar = (bkd) ref$ObjectRef.element;
                if (bkdVar != null) {
                    bkdVar.dismiss();
                }
                ref$ObjectRef.element = null;
                return s3q0.a;
            case 18:
                int i9 = ClipsPlaylistPickerFragment.V;
                Bundle requireArguments = ((ClipsPlaylistPickerFragment) obj2).requireArguments();
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable = requireArguments.getParcelable("params", ClipsPlaylistPickerParams.class);
                    obj = (Parcelable) parcelable;
                } else {
                    ?? parcelable2 = requireArguments.getParcelable("params");
                    obj = (ClipsPlaylistPickerParams) (parcelable2 instanceof ClipsPlaylistPickerParams ? parcelable2 : null);
                }
                if (obj != null) {
                    return (ClipsPlaylistPickerParams) obj;
                }
                throw new IllegalArgumentException("Required value was null.");
            case 19:
                return ((AdsComponent) ((k7m) m7m.f((nag) obj2)).mo408a(fpf0.a(AdsComponent.class))).j6();
            case 20:
                int i10 = CommentsOutherFragment.h0;
                z1h0 parentFragment = ((CommentsOutherFragment) obj2).getParentFragment();
                fcn fcnVar = parentFragment instanceof fcn ? (fcn) parentFragment : null;
                if (fcnVar != null) {
                    fcnVar.b(true);
                }
                return s3q0.a;
            case 21:
                return ((SearchParamsComponent) ((k7m) m7m.f((CommunitiesCatalogRootVh) obj2)).a(fpf0.a(SearchParamsComponent.class))).oa();
            case 22:
                ((CommunitiesVerticalPaginationViewVkUi.a) obj2).a();
                return s3q0.a;
            case 23:
                return ((ynh) obj2).b().Zd();
            case 24:
                ((r4i) obj2).c.a();
                return s3q0.a;
            case 25:
                i1j i1jVar = (i1j) obj2;
                bwt0.i0((View) i1jVar.h.getValue(), new x2e(i1jVar, i2));
                return i1jVar.c.findViewById(R.id.voip_failed_group);
            case 26:
                int i11 = CreateAlbumFragment.Z;
                ArrayList parcelableArrayList = ((CreateAlbumFragment) obj2).requireArguments().getParcelableArrayList("photos");
                if (parcelableArrayList != null) {
                    return j5g.O0(parcelableArrayList);
                }
                return null;
            case 27:
                int i12 = CreatePeopleTransferFragment.B0;
                ?? r0 = ((CreatePeopleTransferFragment) obj2).m0;
                ((h9k) (r0 != 0 ? r0 : null)).m();
                return s3q0.a;
            case 28:
                return new k2l((View) ((cil) obj2).b.getValue());
            default:
                DeprecatedAttachActivity deprecatedAttachActivity = (DeprecatedAttachActivity) obj2;
                int i13 = DeprecatedAttachActivity.K0;
                AttachVideoFragment.a aVar = new AttachVideoFragment.a();
                com.vk.attachpicker.c cVar2 = deprecatedAttachActivity.v;
                aVar.z(cVar2.a);
                aVar.A(cVar2.a);
                UserId userId = deprecatedAttachActivity.u0;
                Bundle bundle = aVar.j;
                bundle.putParcelable("uid", userId);
                bundle.putBoolean("closeBtn", false);
                return aVar.f();
        }
    }
}
