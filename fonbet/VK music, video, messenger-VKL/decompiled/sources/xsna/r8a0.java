package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.tabs.TabLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.photos.PhotosGetAlbums;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.attachpicker.fragment.gallery.PostingAttachGalleryFragment;
import com.vk.attachpicker.impl.fragment.PollPickerFragment;
import com.vk.catalog2.common.ui.holders.search.SearchSuggestionVh;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.tabs.d;
import com.vk.dto.attaches.AttachmentsArrangementConfig;
import com.vk.dto.common.Peer;
import com.vk.dto.common.data.PrivacyRules;
import com.vk.dto.common.data.PrivacySetting;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.dto.stickers.StickerRender;
import com.vk.dto.user.UserSex;
import com.vk.ecomm.products_selection.impl.ProductsSelectionBottomSheet;
import com.vk.im.engine.models.users.User;
import com.vk.im.engine.models.users.UserNameCase;
import com.vk.log.L;
import com.vk.music.player.PlaySourceMeta;
import com.vk.music.player.PlaybackActionMeta;
import com.vk.music.player.StartPlayPlaylistSource;
import com.vk.newsfeed.api.data.NewsComment;
import com.vk.newsfeed.common.util.CommentDraft;
import com.vk.newsfeed.impl.posting.profilefriendslists.a;
import com.vk.permission.PermissionHelper;
import com.vk.photos.root.albumdetails.presentation.a;
import com.vk.photos.root.albumdetails.presentation.k;
import com.vk.photos.root.photoflow.domain.AlbumsRepository;
import com.vk.poll.fragments.PollEditorFragment;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stories.design.view.editor.SideControlPanelView;
import com.vk.video.ui.discovery.minimizable.c;
import com.vk.video.ui.upload.impl.publish.domain.model.PrivacyDo;
import com.vk.video.ui.upload.impl.publish.presentation.publish.feature.entity.PublishState;
import com.vk.voip.ui.sessionrooms.dialog.SessionRoomsDialog;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import one.video.transform.TransformController;
import one.video.view.OneVideoPlayerView;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import xsna.am;
import xsna.bji0;
import xsna.h7u0;
import xsna.k840;
import xsna.nii0;
import xsna.rwi0;
import xsna.t8a0;
import xsna.yk8;
import xsna.yt0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class r8a0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ r8a0(androidx.recyclerview.widget.k0 k0Var, Activity activity) {
        this.b = 12;
        this.c = activity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:167:0x05be  */
    /* JADX WARN: Type inference failed for: r1v29, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        Object[] objArr;
        User user;
        int i = this.b;
        int i2 = 2;
        int i3 = 16;
        int i4 = 12;
        int i5 = 5;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                t8a0 t8a0Var = (t8a0) obj2;
                AlbumsRepository.a aVar = (AlbumsRepository.a) obj;
                VKList<PhotoAlbum> vKList = aVar.a;
                ArrayList arrayList = new ArrayList();
                for (PhotoAlbum photoAlbum : vKList) {
                    if (photoAlbum.b != -9000) {
                        arrayList.add(photoAlbum);
                    }
                }
                ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (true) {
                    int i6 = 4;
                    if (!it.hasNext()) {
                        return arrayList2.isEmpty() ? io.reactivex.rxjava3.core.x.k(new t8a0.a(EmptyList.b, aVar.b)) : io.reactivex.rxjava3.core.x.D(arrayList2, new mh40(new pf40(aVar, i6), 4));
                    }
                    PhotoAlbum photoAlbum2 = (PhotoAlbum) it.next();
                    PrivacySetting privacySetting = new PrivacySetting();
                    privacySetting.f = e43.l("all", "friends", "friends_of_friends", "only_me", "some");
                    Context context = e43.a;
                    if (context == null) {
                        context = null;
                    }
                    privacySetting.c = context.getString(R.string.create_album_privacy);
                    List<PrivacySetting.PrivacyRule> list = photoAlbum2.i;
                    if (list == null) {
                        list = Collections.singletonList(PrivacyRules.a);
                    }
                    privacySetting.e = list;
                    arrayList2.add(t8a0Var.d.b(list).l(new he40(new lx60(i6, t8a0Var, photoAlbum2), i2)));
                }
            case 1:
                aaa0 aaa0Var = (aaa0) obj2;
                aaa0Var.o.P7(new a.t(((k.c.C1491c) aaa0Var.m).a, aaa0Var.itemView));
                return Boolean.TRUE;
            case 2:
                ((iha0) ((mha0) obj2).c).P((PhotosGetAlbums.a) obj);
                return s3q0.a;
            case 3:
                j7b0 j7b0Var = (j7b0) obj2;
                List list2 = (List) obj;
                u2b0 u2b0Var = j7b0Var.e;
                Playlist playlist = j7b0Var.c;
                String str = playlist.x;
                String str2 = playlist.h;
                if (str2 == null) {
                    str2 = "";
                }
                u2b0Var.m1(new StartPlayPlaylistSource(new PlaySourceMeta.PlaylistPlaySourceMeta(str2, playlist.Eb(), playlist.c, playlist.b, playlist.O, playlist.z), null, null, str, 6, null), list2, j7b0Var.b, (r15 & 8) == 0, new PlaybackActionMeta(6, 0L, 2, null));
                if (playlist.Eb()) {
                    List list3 = list2;
                    if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                        Iterator it2 = list3.iterator();
                        while (it2.hasNext()) {
                            if (((MusicTrack) it2.next()).g == 3) {
                                objArr = true;
                                boolean z = playlist.z != null;
                                boolean j = jnj.j(playlist.O);
                                if (!objArr == true || z || j) {
                                    return s3q0.a;
                                }
                                r5v0 r5v0Var = k840.a.h;
                                (r5v0Var != null ? r5v0Var : null).b(new a7b0(playlist));
                                return s3q0.a;
                            }
                        }
                    }
                }
                objArr = false;
                if (playlist.z != null) {
                }
                boolean j2 = jnj.j(playlist.O);
                if (objArr == true) {
                }
                return s3q0.a;
            case 4:
                PollPickerFragment pollPickerFragment = (PollPickerFragment) obj2;
                int i7 = PollPickerFragment.W;
                int i8 = PollEditorFragment.a.m;
                PollEditorFragment.a.C1520a.a((UserId) pollPickerFragment.U.getValue(), (String) pollPickerFragment.S.getValue()).g(10009, pollPickerFragment);
                return s3q0.a;
            case 5:
                FrameLayout frameLayout = (FrameLayout) obj2;
                gy90 gy90Var = (gy90) obj;
                int i9 = PostingAttachGalleryFragment.p0;
                ArrayList arrayList3 = gy90Var.a;
                PermissionHelper.a.getClass();
                bwt0.p0(frameLayout, (arrayList3.containsAll(rl3.u0(PermissionHelper.e)) || gy90Var.a.containsAll(rl3.u0(PermissionHelper.f))) ? ihs.b.P0().booleanValue() : false);
                return s3q0.a;
            case 6:
                elc0 elc0Var = (elc0) obj2;
                AttachmentsArrangementConfig attachmentsArrangementConfig = (AttachmentsArrangementConfig) obj;
                return (System.currentTimeMillis() <= TimeUnit.HOURS.toMillis(1L) + attachmentsArrangementConfig.b && attachmentsArrangementConfig.b > 0) ? io.reactivex.rxjava3.core.q.T(attachmentsArrangementConfig) : io.reactivex.rxjava3.core.q.q(io.reactivex.rxjava3.core.q.T(attachmentsArrangementConfig), new io.reactivex.rxjava3.internal.operators.observable.o1(rsg0.w0(yfb.x(new tfx("wall.getAttachmentsConfig", new aoq0(i5), new cjl0(5)))).l(new yzt(new bee(1, (m9x0) elc0Var.b.getValue(), m9x0.class, "map", "map(Lcom/vk/api/generated/wall/dto/WallGetAttachmentsConfigResponseDto;)Lcom/vk/dto/attaches/AttachmentsArrangementConfig;", 0, 5), 11)).l(new tuz(new rxz(elc0Var, i3), 9)).w(), new ao(new d220(i4), 28)));
            case 7:
                final e5d0 e5d0Var = ((h5d0) obj2).a;
                if (e5d0Var != null) {
                    Peer peer = e5d0Var.i;
                    a1w a1wVar = e5d0Var.k;
                    FragmentActivity fragmentActivity = e5d0Var.j;
                    f5d0 f5d0Var = e5d0Var.o;
                    User user2 = f5d0Var != null ? f5d0Var.a : null;
                    Integer valueOf = user2 != null ? Integer.valueOf(user2.z) : null;
                    if (valueOf != null && valueOf.intValue() == 0) {
                        if (user2.j) {
                            f5d0 f5d0Var2 = e5d0Var.o;
                            if (f5d0Var2 != null && (user = f5d0Var2.a) != null) {
                                h7u0.a aVar2 = new h7u0.a(fragmentActivity);
                                aVar2.g0(R.string.vkim_error_unknown);
                                aVar2.a.f = fragmentActivity.getResources().getString(user.g == UserSex.FEMALE ? R.string.vkim_friend_blacklisted_f : R.string.vkim_friend_blacklisted_m, user.Q2(UserNameCase.ACC));
                                aVar2.c0(R.string.vkim_contact_unblock_user, new DialogInterface.OnClickListener() { // from class: xsna.d5d0
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i10) {
                                        e5d0 e5d0Var2 = e5d0.this;
                                        e5d0Var2.I0(itg0.n(new io.reactivex.rxjava3.internal.operators.single.j(new io.reactivex.rxjava3.internal.operators.single.o(new io.reactivex.rxjava3.internal.operators.single.n(e5d0Var2.k.E(e5d0Var2, new ys(e5d0Var2.i)), new s440(new aj50(e5d0Var2, 11), 9)), new g600(new t440(e5d0Var2, 15), 16)), new ueb(e5d0Var2, 5))));
                                    }
                                });
                                aVar2.W(R.string.cancel, null);
                                aVar2.m();
                            }
                        } else {
                            e5d0Var.I0(e5d0Var.Z0(a1wVar.E(e5d0Var, new zjs(peer, null, null, 14))).subscribe());
                        }
                    } else if (valueOf != null && valueOf.intValue() == 1) {
                        e5d0Var.I0(e5d0Var.Z0(a1wVar.E(e5d0Var, new ess(peer))).subscribe());
                    } else if (valueOf != null && valueOf.intValue() == 3) {
                        e5d0Var.l.c(fragmentActivity, user2.m2());
                    } else if (valueOf != null && valueOf.intValue() == 2) {
                        e5d0Var.I0(e5d0Var.Z0(a1wVar.E(e5d0Var, new zjs(peer, null, null, 14))).subscribe());
                    }
                }
                return s3q0.a;
            case 8:
                l6t0 l6t0Var = (l6t0) obj2;
                PublishState publishState = (PublishState) obj;
                PrivacyDo privacyDo = publishState.p;
                UserId userId = publishState.h;
                return PublishState.a(publishState, null, null, null, null, false, null, null, null, null, null, false, false, null, null, vcd0.a(privacyDo, userId, l6t0Var.a), null, vcd0.a(publishState.r, userId, l6t0Var.b), null, null, null, null, null, false, false, false, null, null, null, null, false, null, null, false, false, null, false, false, null, false, false, false, false, -81921, 2047);
            case 9:
                int intValue = ((Integer) obj).intValue();
                int i10 = ProductsSelectionBottomSheet.u1;
                ((ProductsSelectionBottomSheet) obj2).bo(intValue);
                return s3q0.a;
            case 10:
                com.vk.profile.core.tabs.ui.music.c cVar = (com.vk.profile.core.tabs.ui.music.c) obj2;
                MusicTrack musicTrack = (MusicTrack) obj;
                j15 j15Var = (j15) cVar.t;
                if (j15Var != null) {
                    zih.a(cVar.E, j15Var, new bm4(musicTrack, j15Var), null, 12);
                }
                return s3q0.a;
            case 11:
                return new uhz((ViewGroup) obj, (a.InterfaceC1385a) obj2);
            case 12:
                return Boolean.valueOf(epx.f(androidx.recyclerview.widget.k0.a(((RecyclerView.e0) obj).itemView.getContext()), (Activity) obj2));
            case 13:
                m3g0 m3g0Var = (m3g0) obj2;
                CommentDraft commentDraft = (CommentDraft) obj;
                if (m3g0Var.d0()) {
                    CommentDraft commentDraft2 = m3g0Var.m;
                    NewsComment newsComment = commentDraft2.b;
                    NewsComment newsComment2 = commentDraft.b;
                    newsComment.b = newsComment2.b;
                    newsComment.J = newsComment2.J;
                    newsComment.k = newsComment2.k;
                    commentDraft2.c = commentDraft.c;
                }
                return s3q0.a;
            case 14:
                return Boolean.valueOf(((List) obj2).contains((MobileOfficialAppsCoreNavStat$EventScreen) obj));
            case 15:
                Map<String, Integer> map = SearchSuggestionVh.g;
                ((am) obj).b(new am.a(16, ((VkCell) obj2).getContext().getString(R.string.accessibility_recent_query_tap_action)));
                return s3q0.a;
            case 16:
                ggj ggjVar = (ggj) obj;
                ggjVar.s1();
                float I0 = ggjVar.I0(30);
                float I02 = ggjVar.I0(kqu0.r);
                float floatValue = ((Number) ((mtk0) obj2).getValue()).floatValue() * (I0 / Float.intBitsToFloat((int) (ggjVar.d() >> 32)));
                Pair pair = new Pair(Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), new l5g(l5g.j));
                Float valueOf2 = Float.valueOf(floatValue);
                long j3 = l5g.b;
                oio.x1(ggjVar, yk8.a.b(new Pair[]{pair, new Pair(valueOf2, new l5g(j3)), new Pair(Float.valueOf(1.0f), new l5g(j3))}, I02, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12), 0L, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, 6, 62);
                return s3q0.a;
            case 17:
                s8i0 s8i0Var = (s8i0) obj2;
                Activity activity = s8i0Var.b;
                cmf0.d(activity, s8i0Var.c, j03.g(activity, (Throwable) obj, R.string.error), false, iah0.a(88), true);
                ba40 ba40Var = s8i0Var.q;
                if (ba40Var != null) {
                    ba40Var.invoke(Boolean.valueOf(s8i0Var.v.size() <= 1));
                }
                return s3q0.a;
            case 18:
                ((bji0.a) obj2).l.invoke(new nii0.f(((pno0) obj).d().toString()));
                return s3q0.a;
            case 19:
                nvi0 nvi0Var = (nvi0) obj2;
                ParticipantId participantId = nvi0Var.g1;
                if (participantId != null) {
                    SessionRoomsDialog.a aVar3 = new SessionRoomsDialog.a();
                    kwi0 kwi0Var = new kwi0(new rh4(27, nvi0Var, participantId), new pod0(nvi0Var, i5));
                    aVar3.a = SessionRoomsDialog.DialogKind.SELECT_ROOM;
                    aVar3.b = kwi0Var;
                    aVar3.a(nvi0Var.getParentFragmentManager());
                }
                nvi0Var.tn();
                return s3q0.a;
            case 20:
                ((mwi0) obj2).V(rwi0.d.a.a);
                L.e("SessionRoomsFeature", "Error on closing rooms list");
                return s3q0.a;
            case 21:
                xgx0.a.getClass();
                xgx0.d((Throwable) obj);
                ((ehj0) obj2).a.g0();
                return s3q0.a;
            case 22:
                u76 u76Var = ((SideControlPanelView) obj2).u;
                if (u76Var != null) {
                    u76Var.E2();
                }
                return s3q0.a;
            case 23:
                TransformController transformController = (TransformController) obj2;
                Context context2 = (Context) obj;
                OneVideoPlayerView oneVideoPlayerView = new OneVideoPlayerView(context2, null, 0, 14, 0);
                Activity h = e3m.h(context2);
                if (h != null) {
                    oneVideoPlayerView.setKeepAwakeManager(new cch0(h.getWindow()));
                }
                transformController.a = oneVideoPlayerView.getTransformConsumer();
                transformController.l = null;
                transformController.m = null;
                transformController.n = null;
                transformController.o = null;
                if (transformController.f.e()) {
                    transformController.b();
                }
                transformController.j(oneVideoPlayerView);
                return oneVideoPlayerView;
            case 24:
                return com.vk.clips.sdk.shared.item.static_ads.c.r((com.vk.clips.sdk.shared.item.static_ads.c) obj2, (yt0.h) obj);
            case 25:
                return new zfy((ViewGroup) obj, ((com.vk.stickers.keyboard.page.a) obj2).m);
            case 26:
                ncl0 ncl0Var = (ncl0) obj2;
                for (StickerRender stickerRender : (List) obj) {
                    ncl0Var.t.put(stickerRender.b, stickerRender);
                }
                ncl0Var.d.getClass();
                y8l0.a.a(hcl0.a);
                return s3q0.a;
            case 27:
                pwm0 pwm0Var = (pwm0) obj2;
                String a1 = ((hxr0) obj).a.a1();
                if (pwm0Var.c.R()) {
                    if (com.vk.libvideo.api.minimizable.a.g(rts0.b.a().P0())) {
                        pwm0Var.e = true;
                    } else {
                        pwm0Var.b.invoke(new c.d(1, null, Boolean.TRUE, a1));
                    }
                }
                return s3q0.a;
            case 28:
                ian0 ian0Var = (ian0) obj2;
                Throwable th = (Throwable) obj;
                VKApiExecutionException vKApiExecutionException = th instanceof VKApiExecutionException ? (VKApiExecutionException) th : null;
                if (vKApiExecutionException != null) {
                    rte0.z((Context) ian0Var.a.invoke(), vKApiExecutionException);
                }
                return s3q0.a;
            default:
                kxn0 kxn0Var = (kxn0) obj2;
                TabLayout.g gVar = (TabLayout.g) obj;
                kxn0Var.getClass();
                int i11 = com.vk.core.view.components.tabs.d.G;
                nxv0 a = d.a.a(gVar.h.getContext());
                CharSequence pageTitle = kxn0Var.a.getAdapter() != null ? kxn0Var.a.getAdapter().getPageTitle(gVar.e) : null;
                if (pageTitle != null) {
                    a.setText(pageTitle);
                } else {
                    a.setText(gVar.c);
                }
                return a;
        }
    }

    public /* synthetic */ r8a0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }
}
