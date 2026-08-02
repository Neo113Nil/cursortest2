package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.mbridge.msdk.MBridgeConstans;
import com.vk.api.generated.auth.dto.AuthValidateEmailResponseDto;
import com.vk.api.generated.likes.dto.LikesGetListExtendedResponseDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoCreateResponseDto;
import com.vk.api.generated.users.dto.UsersCanNotCallReasonDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.api.generated.video.dto.VideoGetCommentsExtendedResponseDto;
import com.vk.bridges.di.BridgeComponent;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.channels.impl.donut.ChannelDonutSupportFragment;
import com.vk.clips.design.view.templates.ClipsTemplateEditorCropperView;
import com.vk.clips.favorites.api.params.ClipsFavoritesFolderRenamingParams;
import com.vk.clips.favorites.api.params.ClipsFavoritesFoldersPickerParams;
import com.vk.clips.favorites.impl.di.ClipsFavoritesComponentImpl;
import com.vk.clips.favorites.impl.ui.folders.content.ClipsFavoriteFolderContentListFragment;
import com.vk.clips.favorites.impl.ui.folders.content.a;
import com.vk.clips.interests.impl.ui.ClipsInterestsViewState;
import com.vk.clips.sdk.shared.FavoriteFolderId;
import com.vk.clips.sdk.shared.api.nps.api.condition.SdkExternalNpsCondition;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.clips.uploader.api.model.ClipUploadStatus;
import com.vk.clips.viewer.api.routing.ClipsRouter;
import com.vk.common.links.LaunchContext;
import com.vk.dto.common.OfferVkVideo;
import com.vk.dto.common.Peer;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.entities.StoryCameraMode;
import com.vk.dto.user.OnlineInfo;
import com.vk.dto.user.VisibleStatus;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.CommunityReviewsFragment;
import com.vk.gallerypicker.configuration.GalleryPickerSourceConfiguration;
import com.vk.im.engine.di.scope.ImFeatureScopeProviderComponent;
import com.vk.im.engine.lifecycle.di.ImEngineLifecycleScopedComponent;
import com.vk.im.engine.models.contacts.Contact;
import com.vk.media.MediaFilteringStrategy;
import com.vk.storycamera.builder.StoryCameraParams;
import com.vk.toggle.features.ImFeatures;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Triple;
import xsna.aw9;
import xsna.bp9;
import xsna.bya;
import xsna.d1j;
import xsna.fu4;
import xsna.h3e;
import xsna.j3h;
import xsna.oap;
import xsna.pwb;
import xsna.qvq;
import xsna.sst0;
import xsna.tj50;
import xsna.tlo0;
import xsna.x4d0;
import xsna.zxd0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class zt4 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ zt4(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v47, types: [xsna.dqb$a, xsna.j8i] */
    /* JADX WARN: Type inference failed for: r1v66, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v38, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v25, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        FragmentManager supportFragmentManager;
        FragmentManager supportFragmentManager2;
        int i;
        z8d b;
        z8d b2;
        int i2 = this.b;
        String str = null;
        UsersCanNotCallReasonDto usersCanNotCallReasonDto = null;
        int i3 = 0;
        Object obj2 = this.c;
        switch (i2) {
            case 0:
                ((au4) obj2).T(fu4.a.b);
                Log.e(MBridgeConstans.DYNAMIC_VIEW_WX_APP, "error", (Throwable) obj);
                return s3q0.a;
            case 1:
                c37 c37Var = (c37) obj2;
                c37Var.z = ((AuthValidateEmailResponseDto) obj).e();
                y27 y27Var = (y27) c37Var.a;
                if (y27Var != null) {
                    y27Var.qf(false);
                }
                c37Var.A = SystemClock.elapsedRealtime() + (c37Var.x.e * 1000);
                c37Var.y0();
                return s3q0.a;
            case 2:
                return ((lo8) obj2).b();
            case 3:
                vr8 vr8Var = (vr8) obj2;
                dp8 dp8Var = vr8Var.m;
                cq8 cq8Var = vr8Var.n;
                dp8Var.q(cq8Var != null ? cq8Var : null);
                return s3q0.a;
            case 4:
                ((m99) obj2).d(new tb((Boolean) obj, 18));
                return s3q0.a;
            case 5:
                com.vk.cameraui.impl.a aVar = (com.vk.cameraui.impl.a) obj2;
                Intent intent = (Intent) obj;
                StoryCameraMode c4 = aVar.c4();
                StoryCameraParams storyCameraParams = aVar.c;
                if (c4.j()) {
                    intent.putExtra("camera_params", storyCameraParams);
                    intent.putExtra("gallery_picker_source_configuration", new GalleryPickerSourceConfiguration(false, false, GalleryPickerSourceConfiguration.EntryPoint.STORY, false, false, false, false, false, null, 507, null));
                }
                intent.putExtra("media_type", 111);
                intent.putExtra("camera_enabled", false);
                intent.putExtra("long_previews", true);
                intent.putExtra("short_divider", true);
                intent.putExtra("prevent_styling_photo", false);
                intent.putExtra("prevent_styling_video", false);
                intent.putExtra("story_trim_end_position", 60000L);
                intent.putExtra("video_filtering_mode", MediaFilteringStrategy.VIDEO_AVC);
                if (storyCameraParams.n == null && storyCameraParams.f == null && storyCameraParams.L == null && storyCameraParams.v == null && storyCameraParams.x == null && storyCameraParams.w == null && storyCameraParams.o0 == null && storyCameraParams.D0 == null) {
                    intent.putExtra("single_mode", false);
                    intent.putExtra("video_max_length_ms", TimeUnit.MINUTES.toMillis(3L));
                } else {
                    intent.putExtra("single_mode", true);
                    intent.putExtra("video_max_length_ms", 60000L);
                }
                if (storyCameraParams.J != null) {
                    int b0 = aVar.b0();
                    intent.putExtra("video_max_length_ms", b0);
                    intent.putExtra("contentDuration", b0);
                }
                return s3q0.a;
            case 6:
                bp9 bp9Var = (bp9) obj2;
                UsersUserFullDto usersUserFullDto = (UsersUserFullDto) obj;
                if (!epx.f(usersUserFullDto.o(), Boolean.FALSE)) {
                    Contact.LastSeenStatus lastSeenStatus = m0c.a;
                    Object obj3 = jgq0.a;
                    OnlineInfo a = jgq0.a(usersUserFullDto.U1());
                    if (a == null) {
                        a = VisibleStatus.f;
                    }
                    if (!m0c.b(a)) {
                        r2 = false;
                    }
                }
                Object obj4 = jgq0.a;
                Object a2 = jgq0.a(usersUserFullDto.U1());
                if (a2 == null) {
                    a2 = VisibleStatus.f;
                }
                oap.a aVar2 = new oap.a(a2);
                if (r2) {
                    UsersCanNotCallReasonDto p = usersUserFullDto.p();
                    if (p == null) {
                        p = UsersCanNotCallReasonDto.PRIVACY_SETTINGS;
                    }
                    usersCanNotCallReasonDto = p;
                }
                bp9Var.d.put(String.valueOf(usersUserFullDto.s1().b), new bp9.a(usersCanNotCallReasonDto, aVar2));
                return s3q0.a;
            case 7:
                y1a y1aVar = (y1a) obj2;
                Triple triple = (Triple) obj;
                boolean booleanValue = ((Boolean) triple.d()).booleanValue();
                UIBlockList uIBlockList = (UIBlockList) triple.g();
                List list = (List) triple.h();
                if (booleanValue && uIBlockList != null && list != null) {
                    y1aVar.q(list, uIBlockList.y, uIBlockList);
                }
                return s3q0.a;
            case 8:
                bya byaVar = (bya) obj;
                cya cyaVar = ((ChannelDonutSupportFragment) obj2).S;
                if (cyaVar != null) {
                    Context context = cyaVar.a;
                    qdz qdzVar = cyaVar.b;
                    if (byaVar instanceof bya.a) {
                        cyaVar.c.invoke();
                    } else if (byaVar instanceof bya.c) {
                        qdzVar.e().d(context, Uri.parse("https://m.vk.ru/@donut-faq"), LaunchContext.A, null);
                    } else {
                        if (!(byaVar instanceof bya.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        UserId userId = ((bya.b) byaVar).a;
                        qdzVar.e().d(context, Uri.parse(cya.d + userId), LaunchContext.A, null);
                    }
                }
                return s3q0.a;
            case 9:
                ((dqb) obj2).c.W();
                return s3q0.a;
            case 10:
                pwb pwbVar = (pwb) obj2;
                ViewGroup viewGroup = (ViewGroup) obj;
                xdw xdwVar = pwbVar.k;
                pwb.a aVar3 = pwbVar.l;
                ImFeatures imFeatures = ImFeatures.IM_CHAT_PROFILE_MEMBERS_COMPONENT_REDESIGN;
                imFeatures.getClass();
                return xdwVar.d(aVar3, viewGroup, com.vk.toggle.b.A.a(imFeatures) ? R.layout.vkim_chat_members_item_with_actions_v2 : R.layout.vkim_chat_members_item_with_actions);
            case 11:
                ((com.vk.im.ui.components.chat_profile.a) obj2).t(new zxd0.l((xub) obj));
                return s3q0.a;
            case 12:
                ((z4c) obj2).T(new aw9.b((com.vk.ecomm.cart.impl.checkout.feature.state.f) obj, false));
                return s3q0.a;
            case 13:
                Activity activity = (Activity) obj2;
                io.reactivex.rxjava3.disposables.c cVar = (io.reactivex.rxjava3.disposables.c) obj;
                FragmentActivity fragmentActivity = (FragmentActivity) activity;
                if (fragmentActivity.isFinishing() || fragmentActivity.isDestroyed()) {
                    cVar.dispose();
                }
                ea0.a(activity, new zy(cVar, 20));
                return s3q0.a;
            case 14:
                zld zldVar = (zld) obj2;
                Throwable th = (Throwable) obj;
                x4d0 x4d0Var = zldVar.e;
                if (x4d0Var instanceof x4d0.a) {
                    zldVar.b((x4d0.a) x4d0Var);
                }
                zldVar.f.a().d().b(th);
                Toast.makeText(zldVar.b, R.string.vk_error, 0).show();
                return s3q0.a;
            case 15:
                ClipsFavoriteFolderContentListFragment clipsFavoriteFolderContentListFragment = (ClipsFavoriteFolderContentListFragment) obj2;
                ?? r1 = clipsFavoriteFolderContentListFragment.Q;
                ?? r2 = clipsFavoriteFolderContentListFragment.R;
                ?? r6 = clipsFavoriteFolderContentListFragment.T;
                h3e h3eVar = (h3e) obj;
                int i4 = ClipsFavoriteFolderContentListFragment.W;
                if (h3eVar instanceof h3e.b) {
                    clipsFavoriteFolderContentListFragment.finish();
                } else if (h3eVar instanceof h3e.f) {
                    clipsFavoriteFolderContentListFragment.fo(((h3e.f) h3eVar).a, R.string.clips_favorites_folder_content_list_action_delete_folder, a.InterfaceC0586a.c.b);
                } else if (h3eVar instanceof h3e.e) {
                    clipsFavoriteFolderContentListFragment.fo(((h3e.e) h3eVar).a, R.string.clips_favorites_folder_content_list_action_delete_clips, a.e.c.b);
                } else if (h3eVar instanceof h3e.c) {
                    ClipsRouter a3 = ((BridgeComponent) r2.getValue()).x().a();
                    FragmentActivity kn = clipsFavoriteFolderContentListFragment.kn();
                    h3e.c cVar2 = (h3e.c) h3eVar;
                    List<ClipFeedTab> list2 = cVar2.a;
                    kwc kwcVar = cVar2.b;
                    String str2 = cVar2.c;
                    RecyclerView recyclerView = (RecyclerView) clipsFavoriteFolderContentListFragment.requireView().findViewById(R.id.favorite_folder_content_recycler);
                    Iterator<hfz> it = ((v2e) clipsFavoriteFolderContentListFragment.U.getValue()).h.f.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            hfz next = it.next();
                            if (!(next instanceof c3e) || !epx.f(((c3e) next).c, str2)) {
                                i3++;
                            }
                        } else {
                            i3 = -1;
                        }
                    }
                    RecyclerView.e0 findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i3);
                    com.vk.clips.favorites.impl.ui.folders.content.recycler.b bVar = findViewHolderForAdapterPosition instanceof com.vk.clips.favorites.impl.ui.folders.content.recycler.b ? (com.vk.clips.favorites.impl.ui.folders.content.recycler.b) findViewHolderForAdapterPosition : null;
                    ClipsRouter.c(a3, kn, list2, bVar != null ? bVar.r : null, kwcVar, null, null, null, false, null, 2032);
                } else if (h3eVar instanceof h3e.d) {
                    ((BridgeComponent) r2.getValue()).x().a().i(clipsFavoriteFolderContentListFragment.requireContext(), fpf0.a(ClipFeedTab.TopVideo.class), null);
                } else if (h3eVar instanceof h3e.h) {
                    FragmentActivity kn2 = clipsFavoriteFolderContentListFragment.kn();
                    FragmentActivity fragmentActivity2 = kn2 != null ? kn2 : null;
                    if (fragmentActivity2 != null && (supportFragmentManager2 = fragmentActivity2.getSupportFragmentManager()) != null) {
                        h3e.h hVar = (h3e.h) h3eVar;
                        ((ClipsFavoritesComponentImpl) r1.getValue()).e().a(new ClipsFavoritesFoldersPickerParams.PickFolderToMoveVideos(((Boolean) r6.getValue()).booleanValue(), hVar.a, hVar.b, hVar.c), supportFragmentManager2);
                    }
                } else if (h3eVar instanceof h3e.a) {
                    h3e.a aVar4 = (h3e.a) h3eVar;
                    CharSequence a4 = tlo0.b.a(aVar4.c, clipsFavoriteFolderContentListFragment.requireContext());
                    String obj5 = a4 != null ? a4.toString() : null;
                    if (obj5 == null) {
                        obj5 = "";
                    }
                    CharSequence a5 = tlo0.b.a(aVar4.e, clipsFavoriteFolderContentListFragment.requireContext());
                    String obj6 = a5 != null ? a5.toString() : null;
                    String str3 = obj6 != null ? obj6 : "";
                    ClipsFavoriteFolderContentListFragment.a aVar5 = new ClipsFavoriteFolderContentListFragment.a(aVar4.a, aVar4.b, obj5);
                    aVar5.y(((Boolean) r6.getValue()).booleanValue());
                    FavoriteFolderId favoriteFolderId = aVar4.d;
                    Bundle bundle = aVar5.j;
                    bundle.putParcelable("target_folder_id", favoriteFolderId);
                    bundle.putString("target_folder_name", str3);
                    aVar5.l(clipsFavoriteFolderContentListFragment);
                } else {
                    if (!(h3eVar instanceof h3e.g)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    FragmentActivity kn3 = clipsFavoriteFolderContentListFragment.kn();
                    FragmentActivity fragmentActivity3 = kn3 != null ? kn3 : null;
                    if (fragmentActivity3 != null && (supportFragmentManager = fragmentActivity3.getSupportFragmentManager()) != null) {
                        h3e.g gVar = (h3e.g) h3eVar;
                        ((ClipsFavoritesComponentImpl) r1.getValue()).e().b(new ClipsFavoritesFolderRenamingParams.RenameFolder(((Boolean) r6.getValue()).booleanValue(), gVar.a, gVar.b, gVar.c), clipsFavoriteFolderContentListFragment.requireContext(), supportFragmentManager);
                    }
                }
                return s3q0.a;
            case 16:
                ((u6e) obj2).C(new qvq.d.b((SdkExternalNpsCondition) obj));
                return s3q0.a;
            case 17:
                ((com.vk.clips.interests.impl.feature.c) obj2).d.getClass();
                return new ClipsInterestsViewState.h(((tj50.a) obj).a(new cj1(12), ao8.d));
            case 18:
                s4f s4fVar = (s4f) obj2;
                Pair pair = (Pair) obj;
                return s4fVar.j.a((VideoGetCommentsExtendedResponseDto) pair.d(), s4fVar.a, s4fVar.g, ((LikesGetListExtendedResponseDto) pair.g()).d(), true, s4fVar.f == 1);
            case 19:
                z6f z6fVar = ((ClipsTemplateEditorCropperView) obj2).t;
                a7f a7fVar = z6fVar.c;
                if (a7fVar != null && (i = a7fVar.c) < a7fVar.b.size() - 1) {
                    p6f p6fVar = z6fVar.d;
                    if (p6fVar != null && (b2 = p6fVar.b()) != null) {
                        b2.d(false);
                    }
                    int i5 = i + 1;
                    z6fVar.a.Q4(i5, true);
                    a7f a6 = a7f.a(a7fVar, null, i5, 3);
                    z6fVar.c = a6;
                    n7f b3 = a6.b();
                    if (b3 != null) {
                        z6fVar.d(b3);
                    }
                    p6f p6fVar2 = z6fVar.d;
                    if (p6fVar2 != null && (b = p6fVar2.b()) != null) {
                        b.f();
                    }
                }
                return s3q0.a;
            case 20:
                mkf mkfVar = (mkf) obj2;
                ShortVideoCreateResponseDto shortVideoCreateResponseDto = (ShortVideoCreateResponseDto) obj;
                try {
                    str = Uri.parse(shortVideoCreateResponseDto.d()).getQueryParameter("id");
                } catch (Throwable unused) {
                }
                mkfVar.o0(new ClipUploadStatus.ShortVideoCreateExecuted(mkfVar.d, shortVideoCreateResponseDto.e(), str));
                return new ncq0(shortVideoCreateResponseDto.d(), null, null, null, null, 30);
            case 21:
                ((s4o) obj).a(new wow((List) obj2), j3h.a.b);
                return s3q0.a;
            case 22:
                h7m h7mVar = (h7m) obj2;
                return ((ImEngineLifecycleScopedComponent) h7mVar.d(((ImFeatureScopeProviderComponent) h7mVar.a(fpf0.a(ImFeatureScopeProviderComponent.class))).getProvider().a((Peer) obj)).a(fpf0.a(ImEngineLifecycleScopedComponent.class))).N();
            case 23:
                vuh vuhVar = (vuh) obj2;
                T t = vuhVar.m;
                sst0.b bVar2 = (sst0.b) t;
                if ((bVar2 != null ? bVar2.b : null) != null) {
                    vuhVar.q6();
                } else if (t != 0) {
                    VideoFile videoFile = ((sst0.b) t).a;
                    wqf wqfVar = new wqf(vuhVar, 4);
                    Activity c = g2u0.c(vuhVar.itemView);
                    if (fxc0.B().J().v() && videoFile.ab() == OfferVkVideo.LISTING && c != null) {
                        g7s0 B = fxc0.B();
                        String a1 = videoFile.a1();
                        oos0 x = com.vk.toggle.d.x();
                        B.K(c, a1, x != null ? x.b : true, com.vk.libvideo.autoplay.j.b(videoFile), wqfVar);
                    } else {
                        wqfVar.invoke();
                    }
                }
                return s3q0.a;
            case 24:
                o4g0 o4g0Var = (o4g0) obj;
                e2g0 e2g0Var = ((CommunityReviewsFragment) obj2).S;
                if (e2g0Var != null) {
                    e2g0Var.p(o4g0Var.c(), o4g0Var.d(), o4g0Var.a(), o4g0Var.b());
                }
                return s3q0.a;
            case 25:
                ((zak0) ((xqi) obj2).e).setValue((fm50) obj);
                return s3q0.a;
            case 26:
                ((s0j) obj2).T(d1j.l.b);
                return s3q0.a;
            case 27:
                mkj mkjVar = (mkj) obj;
                List<hpd0> list3 = mkjVar.c;
                ujj ujjVar = ((gkj) obj2).f;
                return mkj.a(mkjVar, null, dkj.d(list3, ujjVar), dkj.d(mkjVar.d, ujjVar), false, null, false, 0, null, 249);
            case 28:
                y6k y6kVar = (y6k) obj2;
                y6kVar.t.h = (e0o) obj;
                y6kVar.Y0().a(y6kVar.t);
                return s3q0.a;
            default:
                nek0 nek0Var = (nek0) obj2;
                if (nek0Var != null) {
                    nek0Var.hide();
                }
                return s3q0.a;
        }
    }
}
