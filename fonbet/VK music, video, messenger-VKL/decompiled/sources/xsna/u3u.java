package xsna;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.apps.dto.AppsGetResponseDto;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.catalog.mvi.block.video.impl.video.largelist.entity.VideoLargeListState;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.ui.mvp.holder.group.GroupCardItemVh;
import com.vk.catalog2.feature.music.holders.MusicDownloadsInProgressVh;
import com.vk.catalog2.feature.music.offline.content.OfflineCatalogCategories;
import com.vk.catalog2.feature.music.ui.holder.MusicOfflineCatalogRootVh;
import com.vk.clips.sdk.shared.item.market_ads.MarketAdsItemPatch;
import com.vk.clips.uploader.api.model.ClipUploadJob;
import com.vk.clips.uploader.api.model.ClipUploaderData;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.view.components.picture.VkPicture;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.user.RequestUserProfile;
import com.vk.feed.settings.impl.presentation.filtered.NewsfeedFilteredSourcesFragment;
import com.vk.home.HomeFragment2;
import com.vk.im.engine.models.groups.Group;
import com.vk.im.engine.models.groups.WarningNotification;
import com.vk.im.engine.models.messages.Msg;
import com.vk.navigation.NavigationDelegateActivity;
import com.vk.network.kbh.state.NetworkState;
import com.vk.voip.OKVoipEngine;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.collections.EmptyList;
import ru.ok.android.webrtc.media_options.MediaOptionState;
import xsna.a9a0;
import xsna.ded;
import xsna.dja0;
import xsna.fiy;
import xsna.gm50;
import xsna.gy50;
import xsna.ij20;
import xsna.j9d0;
import xsna.jd50;
import xsna.l8c0;
import xsna.lc50;
import xsna.mno0;
import xsna.p410;
import xsna.p8c0;
import xsna.qot0;
import xsna.v3u;
import xsna.wk50;
import xsna.ye20;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class u3u implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ u3u(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:154:0x0418, code lost:
    
        if (r12.a(r13, 0, r16, true) == false) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x03ed, code lost:
    
        if (r3 == null) goto L186;
     */
    /* JADX WARN: Type inference failed for: r1v124, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v85, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v37, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        ArrayList arrayList;
        ImageSize imageSize;
        String str;
        ArrayList arrayList2;
        Object obj2;
        View view;
        View view2;
        int i = 6;
        int i2 = 1;
        switch (this.b) {
            case 0:
                VkPicture vkPicture = (VkPicture) obj;
                Image image = ((v3u.c) this.c).a;
                vkPicture.o0((image == null || (arrayList = image.b) == null || (imageSize = (ImageSize) ixj0.c(arrayList, vkPicture.getWidth(), vkPicture.getHeight())) == null) ? null : imageSize.d.d, null);
                return s3q0.a;
            case 1:
                GroupCardItemVh groupCardItemVh = (GroupCardItemVh) this.c;
                Bitmap b = xjo.b((Drawable) obj, 0, 0, 7);
                ImageButton imageButton = groupCardItemVh.m;
                return new BitmapDrawable((imageButton != null ? imageButton : null).getContext().getResources(), b);
            case 2:
                return Group.zb((Group) obj, false, false, 0L, 0, (WarningNotification) this.c, 469762047);
            case 3:
                ((c8v) this.c).r = ((ye20.a) obj).b;
                return s3q0.a;
            case 4:
                com.vk.im.video.g gVar = (com.vk.im.video.g) this.c;
                pbw pbwVar = gVar.g;
                if (pbwVar != null) {
                    k0w w = pbwVar.w();
                    Msg msg = gVar.r;
                    if (msg == null) {
                        msg = null;
                    }
                    w.d(msg.c);
                }
                Activity m = gVar.m();
                if (m != null) {
                    if (d6q0.t == NetworkState.UNSTABLE) {
                        cvk.t();
                    } else {
                        fh5 fh5Var = gVar.w;
                        uc.o(fh5Var == null ? null : fh5Var, m, false, null, null, null, 60);
                        s3q0 s3q0Var = s3q0.a;
                    }
                }
                return s3q0.a;
            case 5:
                ((ArrayList) this.c).clear();
                return io.reactivex.rxjava3.core.q.q(((io.reactivex.rxjava3.core.q) obj).L(new nit(new l8k(13), 2), false).a0(asu0.a.c()).t0(10L), io.reactivex.rxjava3.core.q.H(new fiy.b("Failed to load sticker keywords in 10 attempts")));
            case 6:
                Pair pair = (Pair) obj;
                ((wk50.a) this.c).b(new MarketAdsItemPatch.a.b((cut0) pair.i(), (cut0) pair.j()));
                return s3q0.a;
            case 7:
                ((a410) this.c).T(new p410.b((Throwable) obj));
                return s3q0.a;
            case 8:
                tlo0 tlo0Var = (tlo0) obj;
                VkTopBar vkTopBar = ((f910) this.c).g;
                if (vkTopBar != null) {
                    vkTopBar.setMiddle(f910.c(tlo0Var));
                }
                return s3q0.a;
            case 9:
                ((ij20.a) obj).l(((gf20) this.c).c);
                return s3q0.a;
            case 10:
                com.vk.im.ui.components.msg_list.a aVar = (com.vk.im.ui.components.msg_list.a) this.c;
                vm30 vm30Var = aVar.o;
                if (vm30Var != null) {
                    vm30Var.e0.dismiss();
                }
                aVar.a0 = null;
                return s3q0.a;
            case 11:
                MusicDownloadsInProgressVh musicDownloadsInProgressVh = (MusicDownloadsInProgressVh) this.c;
                Triple triple = (Triple) obj;
                List list = (List) triple.d();
                List list2 = (List) triple.g();
                boolean booleanValue = ((Boolean) triple.h()).booleanValue();
                if (!list2.isEmpty()) {
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        musicDownloadsInProgressVh.a().B0((Playlist) it.next());
                    }
                } else if (((ArrayList) musicDownloadsInProgressVh.a().y0()).isEmpty() || booleanValue) {
                    musicDownloadsInProgressVh.a().setItems(j5g.O0(list));
                }
                if (list.isEmpty()) {
                    q3a q3aVar = musicDownloadsInProgressVh.d;
                    UIBlockList uIBlockList = musicDownloadsInProgressVh.e;
                    if (uIBlockList == null || (str = uIBlockList.b) == null) {
                        str = "";
                    }
                    q3aVar.b(new lwf0(Collections.singletonList(str)), false);
                    musicDownloadsInProgressVh.g.e();
                }
                return s3q0.a;
            case 12:
                ((MusicOfflineCatalogRootVh) this.c).m.b.e.b(new oon0("audio_book_chapter_download", Collections.singleton(OfflineCatalogCategories.Audiobooks.i()), false, false, 12), false);
                return s3q0.a;
            case 13:
                z550 z550Var = (z550) this.c;
                Throwable th = (Throwable) obj;
                VKApiExecutionException vKApiExecutionException = th instanceof VKApiExecutionException ? (VKApiExecutionException) th : null;
                if (vKApiExecutionException != null) {
                    rte0.z(z550Var.h, vKApiExecutionException);
                }
                z550Var.dismiss();
                return s3q0.a;
            case 14:
                Throwable th2 = (Throwable) obj;
                mzp0 mzp0Var = ((b950) this.c).d;
                if (mzp0Var != null) {
                    mzp0Var.f();
                }
                bn40.c(th2, new Object[0]);
                return s3q0.a;
            case 15:
                yc50 yc50Var = (yc50) this.c;
                jd50.b bVar = (jd50.b) obj;
                int i3 = yc50.x1;
                yzt0<jd50.a.b> yzt0Var = bVar.a;
                vte0 vte0Var = yc50Var.j1;
                gm50.a.a(yc50Var, yzt0Var, new cd50(1, vte0Var == null ? null : vte0Var, vte0.class, "renderRemainingTime", "renderRemainingTime(Lcom/vk/music/bottomsheets/track/domain/MusicTrackMenuViewState$MusicTrackMenuRender$RemainingTime;)V", 0));
                yzt0<MusicTrack> yzt0Var2 = bVar.b;
                vte0 vte0Var2 = yc50Var.j1;
                gm50.a.a(yc50Var, yzt0Var2, new ae8(1, vte0Var2 == null ? null : vte0Var2, vte0.class, "renderHeader", "renderHeader(Lcom/vk/dto/music/MusicTrack;)V", 0, 7));
                yzt0<List<lc50.c>> yzt0Var3 = bVar.c;
                vte0 vte0Var3 = yc50Var.j1;
                gm50.a.a(yc50Var, yzt0Var3, new dd50(1, vte0Var3 == null ? null : vte0Var3, vte0.class, "renderListActions", "renderListActions(Ljava/util/List;)V", 0));
                return s3q0.a;
            case 16:
                zi50 zi50Var = (zi50) this.c;
                eps epsVar = (eps) obj;
                List<zxq0> list3 = epsVar.b;
                if (list3 == null) {
                    list3 = EmptyList.b;
                }
                io.reactivex.rxjava3.core.x<List<RequestUserProfile>> a = zi50Var.a(list3);
                List<zxq0> list4 = epsVar.a;
                if (list4 == null) {
                    list4 = EmptyList.b;
                }
                return io.reactivex.rxjava3.core.x.A(a, zi50Var.a(list4), zi50Var.a(epsVar.c.a), new l340(new ua30(epsVar, i2), 3));
            case 17:
                nx50 nx50Var = (nx50) this.c;
                List list5 = (List) obj;
                qot0 qot0Var = nx50Var.I0;
                FragmentImpl m2 = nx50Var.y0().m();
                boolean z = (m2 == null || m2.isHidden() || !m2.getClass().equals(HomeFragment2.class)) ? false : true;
                qot0.a aVar2 = qot0Var.n;
                qot0 qot0Var2 = qot0.this;
                boolean booleanValue2 = ((Boolean) qot0Var2.k.getValue()).booleanValue();
                NavigationDelegateActivity navigationDelegateActivity = qot0Var2.a;
                rot0 rot0Var = qot0Var2.l;
                if (booleanValue2) {
                    arrayList2 = new ArrayList();
                    for (Object obj3 : list5) {
                        if (((ClipUploadJob) ((Pair) obj3).i()).c != null) {
                            arrayList2.add(obj3);
                        }
                    }
                } else {
                    arrayList2 = new ArrayList();
                    for (Object obj4 : list5) {
                        if (((ClipUploadJob) ((Pair) obj4).i()).i != null) {
                            arrayList2.add(obj4);
                        }
                    }
                }
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj2 = it2.next();
                        if (!(((Pair) obj2).j() instanceof ded.g)) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                Pair pair2 = (Pair) obj2;
                if (pair2 == null) {
                    qot0Var2.s = null;
                    utj utjVar = qot0Var2.q;
                    if (utjVar != null) {
                        utjVar.b();
                    }
                } else {
                    Integer num = qot0Var2.s;
                    int i4 = ((ClipUploadJob) pair2.i()).b;
                    if (num != null && num.intValue() == i4) {
                        i2 = 0;
                    } else {
                        qot0Var2.s = Integer.valueOf(((ClipUploadJob) pair2.i()).b);
                    }
                    if (qot0Var2.p) {
                        if (i2 == 0) {
                            view = qot0Var2.o;
                            break;
                        } else {
                            view = (View) rot0Var.d.getValue();
                            view.findViewById(R.id.cancel_button).setOnClickListener(new com.vk.movika.sdk.android.defaultplayer.control.i(5, aVar2, pair2));
                        }
                        if (!view.equals(qot0Var2.o)) {
                            qot0 qot0Var3 = qot0.this;
                            ClipUploaderData.Author author = ((ClipUploadJob) pair2.i()).c;
                            UserId e = author != null ? author.e() : null;
                            View view3 = view;
                            view2 = view3;
                            break;
                        } else {
                            view2 = view;
                        }
                        qot0Var2.i(z);
                        TextView textView = (TextView) view2.findViewById(R.id.status);
                        ClipUploaderData.Author author2 = ((ClipUploadJob) pair2.i()).c;
                        if (author2 != null) {
                            author2.e();
                        }
                        ded dedVar = (ded) pair2.j();
                        if (dedVar instanceof ded.e) {
                            qot0Var2.h(navigationDelegateActivity.getString(R.string.video_upload_clip_failed));
                        } else if (dedVar instanceof ded.b) {
                            qot0Var2.h(navigationDelegateActivity.getString(R.string.video_upload_progress_snack_canceled));
                        } else if (dedVar instanceof ded.c) {
                            qot0Var2.g((View) rot0Var.e.getValue());
                        } else {
                            ded.f fVar = dedVar instanceof ded.f ? (ded.f) dedVar : null;
                            int i5 = fVar != null ? fVar.a : 0;
                            List c0 = drm0.c0(textView.getText(), new String[]{" · "}, 0, 6);
                            StringBuilder sb = new StringBuilder();
                            sb.append((String) c0.get(0));
                            sb.append(" · " + i5 + '%');
                            textView.setText(sb.toString());
                        }
                    }
                }
                return s3q0.a;
            case 18:
                NewsfeedFilteredSourcesFragment newsfeedFilteredSourcesFragment = (NewsfeedFilteredSourcesFragment) this.c;
                boolean booleanValue3 = ((Boolean) obj).booleanValue();
                View view4 = newsfeedFilteredSourcesFragment.U;
                (view4 != null ? view4 : null).setVisibility(booleanValue3 ? 0 : 8);
                return s3q0.a;
            case 19:
                return ((byt) this.c).e(30, null).U(new i630(new w7u((cfr) obj, 19), i));
            case 20:
                return new yz80((ViewGroup) obj, ((im70) this.c).j);
            case 21:
                return Integer.valueOf(((Integer) obj).intValue() % ((bc90) this.c).b);
            case 22:
                z8a0 z8a0Var = (z8a0) this.c;
                a9a0.a aVar3 = (a9a0.a) obj;
                bwt0.p0(z8a0Var.h, true);
                z8a0Var.j.setIsShow(false);
                gm50.a.a(z8a0Var, aVar3.b, new k170(z8a0Var, i));
                gm50.a.a(z8a0Var, aVar3.a, new w7u(z8a0Var, 28));
                return s3q0.a;
            case 23:
                return VideoLargeListState.a((VideoLargeListState) obj, null, false, false, null, null, null, false, null, ((one.video.player.tracks.b) this.c) == null ? new mno0.g(R.string.video_subtitles_on) : new mno0.g(R.string.video_subtitles_off), null, null, null, null, null, null, null, null, null, 0, 67076095);
            case 24:
                ((k2b0) obj).v((com.vk.movika.sdk.player.base.model.a) this.c);
                return s3q0.a;
            case 25:
                return chx0.b(((q73) this.c.getValue()).p((AppsGetResponseDto) obj));
            case 26:
                p7c0 p7c0Var = (p7c0) this.c;
                p8c0.b bVar2 = (p8c0.b) obj;
                p8c0.d(p7c0Var);
                if (p7c0Var instanceof nov) {
                    l8c0.a.getClass();
                    nov novVar = (nov) p7c0Var;
                    novVar.a(Math.min(Math.min(l8c0.a.c, novVar.getRealHeight()) / novVar.getRealHeight(), Math.min(l8c0.a.b, novVar.getRealWidth()) / novVar.getRealWidth()), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    novVar.e(((bVar2.c.getWidth() - novVar.getRealWidth()) * 0.5f) - pov.e(novVar.getStickerMatrix()), ((bVar2.c.getHeight() - novVar.getRealHeight()) * 0.5f) - pov.f(novVar.getStickerMatrix()));
                    novVar.F0(bVar2.e, true);
                }
                return bVar2;
            case 27:
                i9d0 i9d0Var = (i9d0) this.c;
                j9d0 j9d0Var = (j9d0) obj;
                f69 f69Var = i9d0Var.g;
                gvw0 gvw0Var = i9d0Var.a;
                tjw0 tjw0Var = i9d0Var.c;
                if (epx.f(j9d0Var, j9d0.a.a)) {
                    i9d0Var.b.invoke();
                } else if (epx.f(j9d0Var, j9d0.b.a)) {
                    i9d0Var.f.invoke();
                } else if (epx.f(j9d0Var, j9d0.h.a)) {
                    com.vk.voip.ui.c.b.getClass();
                    com.vk.voip.ui.c.A(!(com.vk.voip.ui.c.r.getParticipantStatesManager() != null ? r1.isOwnHandRaised() : false));
                } else if (epx.f(j9d0Var, j9d0.g.a)) {
                    com.vk.voip.ui.c cVar = com.vk.voip.ui.c.b;
                    cVar.getClass();
                    if (com.vk.voip.ui.c.z0()) {
                        cVar.q1();
                    } else {
                        MediaOptionState videoState = OKVoipEngine.b.getMediaOptionsForCurrentUser().getVideoState();
                        if (videoState == MediaOptionState.MUTED_PERMANENT) {
                            Boolean bool = Boolean.FALSE;
                            tjw0Var.invoke(null, videoState, bool, bool);
                        } else {
                            com.vk.voip.ui.c.s1(gvw0Var, null);
                        }
                    }
                } else if (epx.f(j9d0Var, j9d0.f.a)) {
                    com.vk.voip.ui.c.k1(com.vk.voip.ui.c.b);
                } else if (epx.f(j9d0Var, j9d0.i.a)) {
                    com.vk.voip.ui.c cVar2 = com.vk.voip.ui.c.b;
                    cVar2.getClass();
                    if (com.vk.voip.ui.c.v) {
                        cVar2.A0();
                    } else {
                        MediaOptionState audioState = OKVoipEngine.b.getMediaOptionsForCurrentUser().getAudioState();
                        if (audioState == MediaOptionState.MUTED_PERMANENT) {
                            Boolean bool2 = Boolean.FALSE;
                            tjw0Var.invoke(audioState, null, bool2, bool2);
                        } else if (!gvw0Var.e()) {
                            gvw0Var.i(new e07(cVar2, 4), null);
                        }
                    }
                } else if (epx.f(j9d0Var, j9d0.j.a)) {
                    com.vk.voip.ui.c.b.getClass();
                    com.vk.voip.ui.c.l1();
                } else if (j9d0Var instanceof j9d0.c) {
                    j9d0.c cVar3 = (j9d0.c) j9d0Var;
                    tjw0Var.invoke(cVar3.a, cVar3.b, Boolean.valueOf(cVar3.c), Boolean.valueOf(cVar3.d));
                } else if (j9d0Var instanceof j9d0.k) {
                    i9d0Var.d.invoke();
                } else if (epx.f(j9d0Var, j9d0.e.a)) {
                    f69Var.a(gy50.i.a);
                } else {
                    if (!epx.f(j9d0Var, j9d0.d.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ((pvw0) i9d0Var.h.invoke()).F();
                    f69Var.a(gy50.h.a);
                }
                return s3q0.a;
            case 28:
                com.vk.ecomm.market.good.ui.e eVar = (com.vk.ecomm.market.good.ui.e) this.c;
                com.vk.ecomm.market.good.ui.c cVar4 = eVar.l;
                eVar.f(cVar4 != null ? cVar4.g : null, cVar4 != null ? cVar4.j : null, true, eVar.g.getContext());
                return s3q0.a;
            default:
                com.vk.clips.viewer.impl.grid.toolbar.profile.swap.modal.picking.b bVar3 = (com.vk.clips.viewer.impl.grid.toolbar.profile.swap.modal.picking.b) this.c;
                dja0 dja0Var = (dja0) obj;
                qcy<Object>[] qcyVarArr = com.vk.clips.viewer.impl.grid.toolbar.profile.swap.modal.picking.b.m1;
                if (dja0Var instanceof dja0.a) {
                    bVar3.getParentFragmentManager().k0(yfb.b(new Pair("picker_bs_add_btn_click", Boolean.TRUE)), "picker_bs_result_req_key");
                    bVar3.dismiss();
                } else {
                    if (!(dja0Var instanceof dja0.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bVar3.hide();
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ u3u(p7c0 p7c0Var, p8c0 p8c0Var) {
        this.b = 26;
        this.c = p7c0Var;
    }
}
