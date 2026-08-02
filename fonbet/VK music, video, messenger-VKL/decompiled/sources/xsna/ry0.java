package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import com.vk.api.generated.market.dto.MarketProfileInfoLocationDto;
import com.vk.camera.clips.core.drafts.ClipsDraftPersistentStore;
import com.vk.clips.editor.mapper.fragment.ClipsEditorFragment;
import com.vk.clips.playlists.di.ClipsPlaylistsComponent;
import com.vk.clips.upload.edit.impl.ClipsUploadSdkEditComponentBase;
import com.vk.clips.viewer.impl.adapters.ClipVideoFileAdapter;
import com.vk.clips.viewer.impl.di.ClipsViewerComponentImpl;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.ClipsWrapperFragment;
import com.vk.clips.viewer.impl.grid.lists.fragments.ClipsGridDelayedPublishListFragment;
import com.vk.clips.viewer.impl.grid.lists.fragments.ClipsGridLikedClipsListFragment;
import com.vk.content.privacy.di.ContentPrivacyComponent;
import com.vk.dto.clips.model.ClipsEditorInitParams;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.cart.impl.cart.CartFragment;
import com.vk.ecomm.catalog.impl.catalog.root.ClassifiedsCatalogRootVh;
import com.vk.ecomm.catalog.impl.geo.ClassifiedsGeoData;
import com.vk.ecomm.onlinebooking.impl.di.OnlineBookingInternalComponent;
import com.vk.ecomm.onlinebooking.impl.masters.presentation.BookingMastersScreenFragmentMvi2;
import com.vk.ecomm.onlinebooking.impl.navhostfragment.BookingScreenParams;
import com.vk.newsfeed.impl.fragments.BottomSheetCommentsFragment;
import com.vk.profile.community.address.impl.presentation.CommunityAddressesFragment;
import com.vk.profile.community.impl.ui.profile.CommunityProfileFragment;
import com.vk.profile.community.newsfeed.api.di.CommunityNewsfeedComponent;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipDraft;
import com.vk.story.api.di.StoriesComponent;
import com.vk.toggle.features.ComFeatures;
import com.vk.video.channel.common.di.VideoChannelComponent;
import com.vk.video.ui.upload.impl.publish.presentation.author.fragment.AuthorModalInternalComponent;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import com.vkontakte.android.task.di.components.clips.ClipsUploadSdkEditComponentVkApp;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.nce;
import xsna.nzl;
import xsna.sgc;
import xsna.zgc;
import xsna.zxd0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class ry0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ry0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v27, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v78, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v17, types: [T, xsna.dw20] */
    /* JADX WARN: Type inference failed for: r2v29, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v31, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        io.reactivex.rxjava3.disposables.c cVar;
        UserId c;
        int i = this.b;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object obj = this.c;
        switch (i) {
            case 0:
                w01 w01Var = (w01) ((uy0) obj).a.getValue();
                return new gz0(w01Var.getRootContainer(), w01Var.d, w01Var.f, w01Var.g, w01Var.e, w01Var.h);
            case 1:
                return ((d12) obj).e();
            case 2:
                ((cf00) obj).invoke();
                return s3q0.a;
            case 3:
                return vtk0.a(Boolean.valueOf(((dn4) obj).b.a()));
            case 4:
                return ((AuthorModalInternalComponent) obj).c.t().b();
            case 5:
                ((io.reactivex.rxjava3.disposables.c) obj).dispose();
                return s3q0.a;
            case 6:
                y440 y440Var = (y440) obj;
                return new wht(y440Var, y440Var.getRequirePresenter());
            case 7:
                return ((ContentPrivacyComponent) ((Lazy) obj).getValue()).y3();
            case 8:
                return Boolean.valueOf(((jq6) obj).q);
            case 9:
                BookingMastersScreenFragmentMvi2 bookingMastersScreenFragmentMvi2 = (BookingMastersScreenFragmentMvi2) obj;
                qcy<Object>[] qcyVarArr = BookingMastersScreenFragmentMvi2.S;
                bp80 bp80Var = new bp80((BookingScreenParams) bookingMastersScreenFragmentMvi2.N.getValue());
                l7m d = m7m.d(bookingMastersScreenFragmentMvi2);
                OnlineBookingInternalComponent.n.getClass();
                return (OnlineBookingInternalComponent) d.d(OnlineBookingInternalComponent.a.a(bp80Var)).a(fpf0.a(OnlineBookingInternalComponent.class));
            case 10:
                nzl.a aVar = BottomSheetCommentsFragment.f1;
                return ((VideoChannelComponent) ((BottomSheetCommentsFragment) obj).X0.getValue()).h4();
            case 11:
                qcy<Object>[] qcyVarArr2 = CartFragment.Y;
                return (ComposeView) ((CartFragment) obj).requireView().findViewById(R.id.cart_compose_view);
            case 12:
                return ((StoriesComponent) ((k7m) m7m.f((gta) obj)).a(fpf0.a(StoriesComponent.class))).gd();
            case 13:
                ((com.vk.im.ui.components.chat_profile.a) obj).t(zxd0.e.a);
                return s3q0.a;
            case 14:
                tsu tsuVar = ((azb) obj).k;
                if (tsuVar != null && (cVar = ((xyb) tsuVar.b).s) != null) {
                    cVar.dispose();
                }
                return s3q0.a;
            case 15:
                ClassifiedsCatalogRootVh classifiedsCatalogRootVh = (ClassifiedsCatalogRootVh) obj;
                ah3 ah3Var = classifiedsCatalogRootVh.R;
                Activity activity = classifiedsCatalogRootVh.b;
                String str = classifiedsCatalogRootVh.Y;
                MarketProfileInfoLocationDto marketProfileInfoLocationDto = (MarketProfileInfoLocationDto) ah3Var.c;
                hl1 hl1Var = new hl1(8, ah3Var, str);
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                ref$ObjectRef.element = new sgc.a(activity, new ClassifiedsGeoData(marketProfileInfoLocationDto != null ? marketProfileInfoLocationDto.d() : null, String.valueOf(marketProfileInfoLocationDto != null ? Float.valueOf(marketProfileInfoLocationDto.e()) : null), String.valueOf(marketProfileInfoLocationDto != null ? Float.valueOf(marketProfileInfoLocationDto.f()) : null), true), zgc.b.f.a).a0(new na(((ysg0) com.vk.ecomm.catalog.impl.geo.e.a.getValue()).a.subscribe(new l50(new com.vk.movika.sdk.base.ui.s0(6, hl1Var, ref$ObjectRef), 10)), 16)).X(new qk(5, marketProfileInfoLocationDto, hl1Var)).I0("tag_geo_picker");
                return s3q0.a;
            case 16:
                ClipFeedListFragment clipFeedListFragment = (ClipFeedListFragment) obj;
                int i2 = ClipFeedListFragment.a2;
                iwc vo = clipFeedListFragment.vo();
                return Boolean.valueOf(vo != null && vo.d(clipFeedListFragment));
            case 17:
                return (TextView) ((q8d) obj).b().findViewById(R.id.video_single_clip_owner);
            case 18:
                return ((ClipVideoFileAdapter) obj).m.I1;
            case 19:
                bzd bzdVar = (bzd) obj;
                ClipsDraftPersistentStore.b.getClass();
                ClipsDraftPersistentStore.c(true);
                ClipsDraftPersistentStore.s();
                ClipsEditorFragment.b bVar = bzdVar.d;
                ClipsEditorInitParams clipsEditorInitParams = bzdVar.b;
                String str2 = clipsEditorInitParams.c.u;
                bVar.getClass();
                ComFeatures comFeatures = ComFeatures.COM_POSTING_AUTHOR_SELECTION;
                comFeatures.getClass();
                if (com.vk.toggle.b.A.a(comFeatures) && (c = bVar.c()) != null && str2 != null && str2.length() != 0) {
                    Intent putExtra = new Intent("com.vk.clips.intent.DRAFT_SAVED").putExtra("extra_clips_draft_author_id", c.b).putExtra("extra_clips_draft_entry_point", str2);
                    Context context = e43.a;
                    if (context == null) {
                        context = null;
                    }
                    cuz.a(context).c(putExtra);
                }
                qzd j = bzdVar.j();
                if (j != null) {
                    boolean z = clipsEditorInitParams.b.f;
                    j.a(new MobileOfficialAppsClipsStat$TypeClipDraft(MobileOfficialAppsClipsStat$TypeClipDraft.EventType.SAVE_DRAFT));
                }
                bVar.b(0, null);
                return s3q0.a;
            case 20:
                int i3 = ClipsGridDelayedPublishListFragment.l0;
                return (ClipsPlaylistsComponent) m7m.d((ClipsGridDelayedPublishListFragment) obj).mo408a(fpf0.a(ClipsPlaylistsComponent.class));
            case 21:
                ClipsGridLikedClipsListFragment clipsGridLikedClipsListFragment = (ClipsGridLikedClipsListFragment) obj;
                int i4 = ClipsGridLikedClipsListFragment.i0;
                return new nce(new nce.b(clipsGridLikedClipsListFragment.mo(), "MY_CLIPS_GRID".toLowerCase(Locale.ROOT), false), new ClipsGridLikedClipsListFragment.b(2, clipsGridLikedClipsListFragment, ClipsGridLikedClipsListFragment.class, "openClipList", "openClipList(ILcom/vk/libvideo/api/AnimationDialogCallback;)V", 0), new nde(objArr2 == true ? 1 : 0, objArr == true ? 1 : 0), new k60(15), new nd1(7), clipsGridLikedClipsListFragment.getViewLifecycleOwner(), (zof) clipsGridLikedClipsListFragment.f0.getValue(), (ClipsPlaylistsComponent) clipsGridLikedClipsListFragment.g0.getValue());
            case 22:
                qcy<Object>[] qcyVarArr3 = ClipsUploadSdkEditComponentBase.e;
                return new kqd(((ClipsUploadSdkEditComponentVkApp) ((ClipsUploadSdkEditComponentBase) obj)).k().e());
            case 23:
                return ((ClipsViewerComponentImpl) obj).n.s().c();
            case 24:
                ClipsWrapperFragment clipsWrapperFragment = (ClipsWrapperFragment) obj;
                int i5 = ClipsWrapperFragment.Q0;
                if (clipsWrapperFragment.po().e() || (!((Boolean) clipsWrapperFragment.po().n.getValue()).booleanValue() && !clipsWrapperFragment.qo())) {
                    r4 = false;
                }
                return Boolean.valueOf(r4);
            case 25:
                int i6 = CommunityAddressesFragment.E0;
                ((CommunityAddressesFragment) obj).oo();
                return Boolean.TRUE;
            case 26:
                c1h c1hVar = (c1h) obj;
                return Float.valueOf(((Number) c1hVar.n.getValue()).floatValue() * (((q9x) ((zak0) c1hVar.f).getValue()) != null ? (int) (r1.a & 4294967295L) : 0));
            case 27:
                cwh cwhVar = ((d3h) ((d4h) obj).c.invoke()).i;
                ajg0 ajg0Var = cwhVar.b;
                UserId userId = cwhVar.e;
                ExtendedCommunityProfile.d dVar = cwhVar.g;
                ajg0Var.j(userId, dVar != null ? dVar.a : null, dVar != null ? dVar.b : null, cwhVar.a.requireContext());
                return s3q0.a;
            case 28:
                int i7 = CommunityProfileFragment.k0;
                return ((StoriesComponent) ((k7m) m7m.f((CommunityProfileFragment) obj)).a(fpf0.a(StoriesComponent.class))).f6();
            default:
                return ((CommunityNewsfeedComponent) ((k7m) m7m.f((hrh) obj)).mo408a(fpf0.a(CommunityNewsfeedComponent.class))).ba();
        }
    }

    public /* synthetic */ ry0(fo50 fo50Var, bzd bzdVar) {
        this.b = 19;
        this.c = bzdVar;
    }
}
