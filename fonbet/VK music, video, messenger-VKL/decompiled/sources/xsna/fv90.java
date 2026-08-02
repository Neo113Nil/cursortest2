package xsna;

import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.ViewGroup;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.clips.design.view.timeline.TimelineBottomActionsView;
import com.vk.content.design.view.photo.flow.PhotoFlowHeaderView;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.RecommendedPlaylist;
import com.vk.dto.photo.Photo;
import com.vk.dto.stories.entities.OrdData;
import com.vk.mediastore.system.MediaStoreEntry;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.offline.api.model.OfflineEntitySortType;
import com.vk.music.player.PlayRequestTrigger;
import com.vk.music.player.PlaybackActionMeta;
import com.vk.music.player.ShuffleMode;
import com.vk.music.player.StartPlaySource;
import com.vk.music.stats.AdsAudioPixelsContainer;
import com.vk.newsfeed.impl.posting.attachments.PostingAttachLocationFragment;
import com.vk.newsfeed.posting.impl.presentation.base.fragment.PostingFragment;
import com.vk.newsfeed.posting.impl.presentation.model.MusicDto;
import com.vk.photos.root.photoflow.tags.presentation.view.PhotoTagsSkeletonView;
import com.vk.photos.root.photoflow.tags.presentation.view.TagsRecyclerPaginatedView;
import com.vk.search.params.api.VkPeopleSearchParams;
import com.vk.superapp.dto.WidgetSettingsModalOpenSource;
import com.vk.superapp.ui.SuperAppFragment;
import com.vk.video.playlist.playlistscreen.domain.PlaylistDataDo;
import com.vk.video.playlist.playlistscreen.ui.entity.PlaylistScreenInfoDataState;
import com.vk.video.playlist.playlistscreen.ui.entity.PlaylistScreenState;
import com.vk.video.ui.upload.impl.publish.presentation.publish.feature.entity.PublishState;
import com.vk.video.ui.upload.impl.settings.presentation.feature.entity.SettingsState;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import ru.ok.android.webrtc.SharedPeerConnectionFactory;
import ru.ok.android.webrtc.stat.audio.AudioErrorEvent;
import xsna.dbe0;
import xsna.g9k0;
import xsna.jda0;
import xsna.lka0;
import xsna.nfm0;
import xsna.oem0;
import xsna.phg0;
import xsna.pnb0;
import xsna.q0j0;
import xsna.wq10;
import xsna.xsp;
import xsna.yhb0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class fv90 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fv90(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        boolean z;
        int action;
        via0 via0Var;
        RectF rectF;
        Object obj2;
        float f;
        List D0;
        int i = 2;
        int i2 = 3;
        int i3 = 1;
        int i4 = 0;
        switch (this.b) {
            case 0:
                VkPeopleSearchParams vkPeopleSearchParams = (VkPeopleSearchParams) this.c;
                xwz xwzVar = (xwz) obj;
                int i5 = vkPeopleSearchParams.d;
                if (i5 != 0) {
                    Object[] objArr = {Integer.valueOf(i5)};
                    xwzVar.getClass();
                    xwzVar.a(new fxz(R.string.vk_age_from, Arrays.asList(Arrays.copyOf(objArr, 1))));
                }
                if (vkPeopleSearchParams.d != 0 && vkPeopleSearchParams.e != 0) {
                    xwzVar.a(xwz.c);
                }
                int i6 = vkPeopleSearchParams.e;
                if (i6 != 0) {
                    Object[] objArr2 = {Integer.valueOf(i6)};
                    xwzVar.getClass();
                    xwzVar.a(new fxz(R.string.vk_age_to, Arrays.asList(Arrays.copyOf(objArr2, 1))));
                }
                return s3q0.a;
            case 1:
                PhotoFlowHeaderView.a aVar = ((PhotoFlowHeaderView) this.c).y;
                if (aVar != null) {
                    aVar.d();
                }
                return s3q0.a;
            case 2:
                ida0 ida0Var = (ida0) this.c;
                jda0.b bVar = (jda0.b) obj;
                Throwable th = bVar.b;
                TagsRecyclerPaginatedView tagsRecyclerPaginatedView = ida0Var.g;
                PhotoTagsSkeletonView photoTagsSkeletonView = ida0Var.h;
                tagsRecyclerPaginatedView.Mk();
                List<tba0> list = bVar.a;
                if (list != null) {
                    if (list.isEmpty()) {
                        ida0Var.b.invoke();
                    } else {
                        bwt0.p0(photoTagsSkeletonView, false);
                        ida0Var.d.submitList(list);
                    }
                } else if (th == null) {
                    bwt0.p0(photoTagsSkeletonView, true);
                } else {
                    bwt0.p0(photoTagsSkeletonView, false);
                    tagsRecyclerPaginatedView.fj(th, null);
                }
                return s3q0.a;
            case 3:
                pha0 pha0Var = (pha0) this.c;
                MotionEvent motionEvent = (MotionEvent) obj;
                if (motionEvent != null && motionEvent.getPointerCount() <= 1 && (action = motionEvent.getAction()) != 0 && action != 1 && action == 2) {
                    float f2 = pha0Var.k;
                    m1o m1oVar = pha0Var.p;
                    if (m1oVar == null || (rectF = (RectF) m1oVar.invoke()) == null) {
                        via0Var = null;
                    } else {
                        Iterator it = j5g.y0(pha0Var.e).iterator();
                        while (true) {
                            if (it.hasNext()) {
                                Object next = it.next();
                                via0 via0Var2 = (via0) next;
                                if (via0Var2.a() != null) {
                                    f = f2;
                                    double d = f;
                                    obj2 = (Math.abs(((via0Var2.getTag().g * ((double) rectF.width())) + ((double) rectF.left)) - ((double) motionEvent.getX())) < d && Math.abs(((via0Var2.getTag().h * ((double) rectF.height())) + ((double) rectF.top)) - ((double) motionEvent.getY())) < d) ? next : null;
                                } else {
                                    f = f2;
                                }
                                f2 = f;
                            }
                        }
                        via0Var = (via0) obj2;
                    }
                    pha0Var.l = via0Var;
                    if (via0Var != null) {
                        z = true;
                        return Boolean.valueOf(z);
                    }
                }
                z = false;
                return Boolean.valueOf(z);
            case 4:
                eka0 eka0Var = (eka0) this.c;
                lka0.b bVar2 = lka0.b.a;
                if (eka0Var.q) {
                    eka0Var.o.onNext(bVar2);
                }
                return s3q0.a;
            case 5:
                m4b0 m4b0Var = (m4b0) this.c;
                m4b0Var.b.f0(m4b0Var.o);
                return s3q0.a;
            case 6:
                return PlaylistScreenState.a((PlaylistScreenState) obj, new PlaylistScreenInfoDataState.Loaded((PlaylistDataDo) this.c), null, false, false, null, null, null, 1915);
            case 7:
                List list2 = (List) obj;
                int i7 = yhb0.a.$EnumSwitchMapping$0[((OfflineEntitySortType) this.c).ordinal()];
                if (i7 == 1) {
                    D0 = j5g.D0(new yhb0.c(), list2);
                } else if (i7 == 2) {
                    D0 = j5g.D0(new yhb0.e(), list2);
                } else {
                    if (i7 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    D0 = j5g.D0(new yhb0.d(), list2);
                }
                List list3 = D0;
                ArrayList arrayList = new ArrayList(c5g.u(list3, 10));
                Iterator it2 = list3.iterator();
                while (it2.hasNext()) {
                    arrayList.add(xsp.a.b((xsp) it2.next()));
                }
                return arrayList;
            case 8:
                job0 job0Var = (job0) this.c;
                Throwable th2 = (Throwable) obj;
                if (th2 instanceof VKApiExecutionException) {
                    rte0.n((VKApiExecutionException) th2, new es00(job0Var, 20), new fda0(job0Var, i3));
                } else {
                    job0Var.a.b(new pnb0.c.j(th2, 0));
                }
                return s3q0.a;
            case 9:
                List list4 = (List) ((Map) obj).get(Integer.valueOf(((Photo) this.c).c));
                return list4 == null ? EmptyList.b : list4;
            case 10:
                com.vk.newsfeed.impl.presenters.b bVar3 = (com.vk.newsfeed.impl.presenters.b) this.c;
                com.vk.metrics.eventtracking.b.a.a((Throwable) obj);
                bVar3.i0().S8();
                return s3q0.a;
            case 11:
                PostingAttachLocationFragment postingAttachLocationFragment = (PostingAttachLocationFragment) this.c;
                int i8 = PostingAttachLocationFragment.I0;
                return ((Boolean) obj).booleanValue() ? hd60.a().h0(postingAttachLocationFragment.kn()) : io.reactivex.rxjava3.core.q.H(new PostingAttachLocationFragment.a());
            case 12:
                x020 x020Var = ((PostingFragment) this.c).Y;
                wci0 wci0Var = (wci0) obj;
                int i9 = PostingFragment.L0;
                wq10 wq10Var = wci0Var.a;
                boolean z2 = wci0Var.b;
                if (wq10Var instanceof wq10.a) {
                    MediaStoreEntry mediaStoreEntry = ((wq10.a) wq10Var).a;
                    if (!x020Var.g) {
                        if (z2) {
                            com.vk.attachpicker.screen.p pVar = x020Var.f;
                            if (pVar != null) {
                                pVar.S(mediaStoreEntry);
                            }
                        } else {
                            com.vk.attachpicker.screen.p pVar2 = x020Var.f;
                            if (pVar2 != null) {
                                pVar2.J(mediaStoreEntry);
                            }
                        }
                    }
                }
                wq10 wq10Var2 = wci0Var.a;
                if (wq10Var2 instanceof wq10.b) {
                    Photo photo = ((wq10.b) wq10Var2).a;
                    if (x020Var.g) {
                        if (z2) {
                            com.vk.attachpicker.screen.p pVar3 = x020Var.f;
                            if (pVar3 != null) {
                                pVar3.S(w65.j(photo));
                            }
                        } else {
                            com.vk.attachpicker.screen.p pVar4 = x020Var.f;
                            if (pVar4 != null) {
                                pVar4.J(w65.j(photo));
                            }
                        }
                    }
                }
                return s3q0.a;
            case 13:
                d8d0 d8d0Var = (d8d0) this.c;
                nvy nvyVar = (nvy) obj;
                ArrayList arrayList2 = d8d0Var.v().b;
                wow wowVar = new wow(arrayList2);
                nvyVar.e(arrayList2.size(), new y7d0(new whd(3), wowVar, i4), new idd0(wowVar, 2), new jai(2039820996, new z7d0(i4, d8d0Var, wowVar), true));
                ArrayList arrayList3 = d8d0Var.v().a;
                wow wowVar2 = new wow(arrayList3);
                nvyVar.e(arrayList3.size(), new a8d0(new z2(7), wowVar2), new b8d0(wowVar2, 0), new jai(2039820996, new c8d0(i4, d8d0Var, wowVar2), true));
                if (d8d0Var.v().c) {
                    nvy.g(nvyVar, null, null, new jai(-944436526, new yf0(d8d0Var, i), true), 3);
                }
                if (d8d0Var.v().d) {
                    nvy.g(nvyVar, null, null, new jai(-1243332471, new uwq(d8d0Var, i2), true), 3);
                }
                return s3q0.a;
            case 14:
                return PublishState.a((PublishState) obj, null, null, null, null, false, drm0.p0(((dbe0.g.b) ((dbe0.g) this.c)).b).toString(), null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, false, null, null, false, false, null, false, false, null, false, false, false, false, -33, 2047);
            case 15:
                cse0 cse0Var = (cse0) this.c;
                zwm0 zwm0Var = (zwm0) obj;
                synchronized (cse0Var.g) {
                    cse0Var.o.remove(zwm0Var);
                }
                return s3q0.a;
            case 16:
                ((wh50) this.c).setValue(Boolean.TRUE);
                return s3q0.a;
            case 17:
                return new m2f0((ViewGroup) obj, (lbe) this.c);
            case 18:
                RecommendedPlaylist recommendedPlaylist = (RecommendedPlaylist) this.c;
                w9y w9yVar = (w9y) obj;
                w9yVar.c(Integer.valueOf(recommendedPlaylist.b), "id");
                w9yVar.d(Long.valueOf(recommendedPlaylist.c.b), "owner_id");
                w9yVar.e(recommendedPlaylist.d, "percentage");
                w9yVar.e(recommendedPlaylist.e, "percentage_title");
                w9yVar.b(Boolean.valueOf(recommendedPlaylist.f), "is_curator");
                w9yVar.e(recommendedPlaylist.g, "audios");
                w9yVar.e(recommendedPlaylist.h, "color");
                w9yVar.e(recommendedPlaylist.i, "cover");
                w9yVar.b(Boolean.valueOf(recommendedPlaylist.j), "withOwner");
                w9yVar.g("photo", recommendedPlaylist.k);
                return s3q0.a;
            case 19:
                ((j4g0) this.c).h6();
                return s3q0.a;
            case 20:
                ((ohg0) this.c).T((phg0.f) obj);
                return s3q0.a;
            case 21:
                dbi0 dbi0Var = (dbi0) this.c;
                MusicDto musicDto = (MusicDto) obj;
                int i10 = dbi0.r1;
                MusicTrack musicTrack = musicDto.m;
                if (musicTrack == null || !dbi0Var.eo().y0(musicTrack)) {
                    dbi0Var.eo().N0(new lqk0((StartPlaySource) null, musicDto.m, (List) null, (MusicPlaybackLaunchContext) null, 0, (ShuffleMode) null, (PlayRequestTrigger) null, (AdsAudioPixelsContainer) null, 0L, 1005));
                    ((izs) ((zak0) dbi0Var.k1).getValue()).invoke(musicDto);
                } else if (dbi0Var.eo().h()) {
                    dbi0Var.eo().pause(6);
                } else {
                    dbi0Var.eo().f(new PlaybackActionMeta(6, 0L, 2, null));
                }
                return s3q0.a;
            case 22:
                psi0 psi0Var = (psi0) this.c;
                ((etv0) obj).b(false);
                psi0Var.a.getSideControlPanel().getAddStickerButtonView().performClick();
                return s3q0.a;
            case 23:
                return new rvi0((ViewGroup) obj, (qjg0) this.c);
            case 24:
                SettingsState settingsState = (SettingsState) obj;
                OrdData ordData = ((q0j0.f.b) ((q0j0.f) this.c)).b;
                return SettingsState.a(settingsState, null, false, null, null, null, null, null, ordData, (ordData.c == null || ordData.d != null) ? settingsState.j : g9k0.b.a, 127);
            case 25:
                return ((SharedPeerConnectionFactory) this.c).c((AudioErrorEvent) obj);
            case 26:
                ((d66) this.c).invoke();
                ((ikv0) obj).a();
                return s3q0.a;
            case 27:
                oem0.b.a aVar2 = (oem0.b.a) obj;
                ((vem0) this.c).T(new nfm0.f(aVar2.a, aVar2.b));
                return s3q0.a;
            case 28:
                SuperAppFragment superAppFragment = (SuperAppFragment) this.c;
                int i11 = SuperAppFragment.o0;
                superAppFragment.uo(WidgetSettingsModalOpenSource.ERROR_DIALOG);
                return s3q0.a;
            default:
                gzs<s3q0> gzsVar = ((TimelineBottomActionsView) this.c).v;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                return s3q0.a;
        }
    }
}
