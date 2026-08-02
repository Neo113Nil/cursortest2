package xsna;

import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog.mvi.block.music.impl.artists.slider.entity.ArtistSliderState;
import com.vk.catalog.mvi.block.music.impl.entity.PlayingState;
import com.vk.catalog2.common.dto.api.banner.Banner;
import com.vk.catalog2.common.ui.mvp.holder.clip.ClipDiscoverVh;
import com.vk.channels.impl.channel_screen.footer.ChannelJoiningError;
import com.vk.channels.impl.channel_screen.footer.e;
import com.vk.channels.impl.channel_screen.footer.f;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.Peer;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingMaster;
import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingServiceType;
import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingSettings;
import com.vk.ecomm.onlinebooking.impl.main.BookingStartScreenFragment;
import com.vk.ecomm.onlinebooking.impl.main.presentation.mvi2.d;
import com.vk.ecomm.onlinebooking.impl.model.BookingRecord;
import com.vk.ecomm.onlinebooking.impl.model.BookingServiceModel;
import com.vk.ecomm.onlinebooking.impl.navhostfragment.BookingScreenParams;
import com.vk.ecomm.onlinebooking.impl.navhostfragment.a;
import com.vk.ecomm.onlinebooking.impl.navhostfragment.b;
import com.vk.feed.blacklist.impl.presentation.blacklist.BlacklistFragment;
import com.vk.feed.blacklist.impl.presentation.blacklist.g;
import com.vk.im.engine.events.JoiningToChannelError;
import com.vk.im.engine.models.channels.ChannelsCounters;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.engine.models.education.EduAchievement;
import com.vk.im.engine.models.stories.ImStoryState;
import com.vk.libvideo.api.minimizable.VideoMinimizableState;
import com.vk.libvideo.bottomsheet.about.delegate.w;
import com.vk.newsfeed.posting.mediapicker.photovk.base.BasePhotoListFragment;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.voip.OKVoipEngine;
import com.vk.voip.call_effects.beauty.BeautyFilterIntensity;
import com.vk.voip.dto.call_member.CallMemberId;
import com.vk.voip.ui.VoipViewModelState;
import com.vk.voip.ui.call_effects.beauty.ui.BeautySettingsFragment;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.externcalls.sdk.Conversation;
import xsna.as7;
import xsna.cwb0;
import xsna.di8;
import xsna.dw6;
import xsna.fl6;
import xsna.gm50;
import xsna.mm7;
import xsna.mwa;
import xsna.ndw;
import xsna.o8e;
import xsna.wq10;
import xsna.x6d;
import xsna.xxd0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class k9 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ k9(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r1v79, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v43, types: [java.lang.Object, java.util.Map] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        VideoFile videoFile;
        Set<CallMemberId> set;
        gj6 io2;
        ImStoryState imStoryState;
        xxd0 c;
        Map<Peer, ImStoryState> map;
        mm7 aVar;
        as7 mVar;
        int i = 0;
        r3 = false;
        boolean z = false;
        int i2 = 0;
        i = 0;
        switch (this.b) {
            case 0:
                View view = (View) obj;
                noj0 noj0Var = ((w.a) this.c).v;
                if (noj0Var == null || (videoFile = noj0Var.a) == null) {
                    return s3q0.a;
                }
                ydt0.f(fxc0.B().Y(), view.getContext(), videoFile, null, null, null, 28);
                return s3q0.a;
            case 1:
                c00 c00Var = (c00) this.c;
                dhw0 L = com.vk.voip.ui.c.b.L();
                if (L != null && (set = L.h) != null) {
                    i = set.size();
                }
                y3v0 y3v0Var = c00Var.i;
                if (y3v0Var != null) {
                    float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    if (i > 1) {
                        com.vk.voip.ui.c.r.getClass();
                        Conversation conversation = OKVoipEngine.E.getConversation();
                        if (conversation != null) {
                            f = conversation.getAdjustedAudioLevel(conversation.getMe());
                        }
                    }
                    y3v0Var.a(f, true);
                }
                return s3q0.a;
            case 2:
                return (PhotoAlbum) this.c;
            case 3:
                ((st2) this.c).c(false);
                return s3q0.a;
            case 4:
                ArtistSliderState artistSliderState = (ArtistSliderState) obj;
                return new ArtistSliderState(artistSliderState.b, artistSliderState.c, (PlayingState) this.c, artistSliderState.e, artistSliderState.f, artistSliderState.g, artistSliderState.h);
            case 5:
                Attachment attachment = (Attachment) this.c;
                u1c0 u1c0Var = (u1c0) obj;
                k5i k5iVar = u1c0Var instanceof k5i ? (k5i) u1c0Var : null;
                return Boolean.valueOf(epx.f(k5iVar != null ? k5iVar.q : null, attachment));
            case 6:
                ((toy) this.c).s1();
                return s3q0.a;
            case 7:
                r46 r46Var = (r46) this.c;
                xxd0.b bVar = (xxd0.b) obj;
                List<xub> list = bVar.o;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                for (Object obj2 : list) {
                    if (obj2 instanceof yub) {
                        obj2 = new awb(r46Var.b);
                    }
                    arrayList.add(obj2);
                }
                return xxd0.b.a(bVar, null, arrayList, null, 4177919);
            case 8:
                ug6 ug6Var = (ug6) this.c;
                int i3 = ug6.j1;
                ug6Var.Zn();
                ug6Var.dismiss();
                return s3q0.a;
            case 9:
                BasePhotoListFragment basePhotoListFragment = (BasePhotoListFragment) this.c;
                wci0 wci0Var = (wci0) obj;
                int i4 = BasePhotoListFragment.l0;
                wq10 wq10Var = wci0Var.a;
                if ((wq10Var instanceof wq10.b) && (io2 = basePhotoListFragment.io()) != null) {
                    Photo photo = ((wq10.b) wq10Var).a;
                    boolean z2 = wci0Var.b;
                    wj6 wj6Var = (wj6) io2;
                    LinkedHashSet linkedHashSet = wj6Var.i;
                    if (z2) {
                        linkedHashSet.add(photo);
                    } else {
                        linkedHashSet.remove(photo);
                    }
                    faa0 lo = wj6Var.c.lo();
                    Iterator it = ((ArrayList) lo.y0()).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            i2 = -1;
                        } else if (((ucv0) it.next()).a.c != photo.c) {
                            i2++;
                        }
                    }
                    if (i2 != -1) {
                        lo.J0(i2, lo.k.d(lo.i, photo, z2));
                    }
                }
                return s3q0.a;
            case 10:
                rul rulVar = (rul) this.c;
                fl6.a aVar2 = (fl6.a) obj;
                DialogExt dialogExt = aVar2.a;
                ndw ndwVar = aVar2.b;
                List<EduAchievement> list2 = aVar2.c;
                y6p y6pVar = aVar2.d;
                Map<Peer, p6p> map2 = aVar2.e;
                rulVar.n(dialogExt);
                ndw.a aVar3 = ndwVar instanceof ndw.a ? (ndw.a) ndwVar : null;
                if (aVar3 == null || (map = aVar3.a) == null || (imStoryState = map.get(rulVar.h)) == null) {
                    imStoryState = ImStoryState.NONE;
                }
                ImStoryState imStoryState2 = imStoryState;
                jxb jxbVar = rulVar.u;
                return (jxbVar == null || (c = jxbVar.c(dialogExt, imStoryState2, y6pVar, list2, map2)) == null) ? xxd0.c.a : c;
            case 11:
                gw6 gw6Var = (gw6) this.c;
                dw6 dw6Var = (dw6) obj;
                int i5 = BeautySettingsFragment.Q;
                if (dw6Var instanceof dw6.b) {
                    BeautyFilterIntensity beautyFilterIntensity = ((dw6.b) dw6Var).b;
                    gw6Var.b.setText(String.valueOf((int) (beautyFilterIntensity.i() * 100)));
                    gw6Var.c.setProgress(beautyFilterIntensity.j());
                }
                return s3q0.a;
            case 12:
                ((n47) this.c).pm();
                return s3q0.a;
            case 13:
                BlacklistFragment blacklistFragment = (BlacklistFragment) this.c;
                g.a aVar4 = (g.a) obj;
                int i6 = BlacklistFragment.V;
                gm50.a.a(blacklistFragment, aVar4.a, new k00(blacklistFragment, 8));
                gm50.a.a(blacklistFragment, aVar4.b, new l00(blacklistFragment, 6));
                return s3q0.a;
            case 14:
                BookingStartScreenFragment bookingStartScreenFragment = (BookingStartScreenFragment) this.c;
                com.vk.ecomm.onlinebooking.impl.main.presentation.mvi2.d dVar = (com.vk.ecomm.onlinebooking.impl.main.presentation.mvi2.d) obj;
                BookingScreenParams bookingScreenParams = ((bz7) bookingStartScreenFragment.R.getValue()).a;
                if (dVar instanceof d.c) {
                    d.c cVar = (d.c) dVar;
                    if (cVar instanceof d.c.g) {
                        UserId userId = bookingScreenParams.b;
                        int i7 = a.g.d.a;
                        ((d.c.g) cVar).getClass();
                        mVar = new as7.m(new BookingScreenParams(userId, i7, bookingScreenParams.d, null, null, false, null, null, null, null, 0, null, 0, null, null, null, null, 131048, null), false);
                    } else if (cVar instanceof d.c.a) {
                        mVar = new as7.a(null);
                    } else if (cVar instanceof d.c.e) {
                        UserId userId2 = bookingScreenParams.b;
                        d.c.e eVar = (d.c.e) cVar;
                        BookingMaster bookingMaster = eVar.b;
                        mVar = new as7.m(new BookingScreenParams(userId2, bookingMaster != null ? a.p.d.a : a.o.d.a, bookingScreenParams.d, null, bookingMaster, bookingMaster != null, null, null, null, null, 0, null, 0, null, null, eVar.a, null, 98248, null), false);
                    } else if (cVar instanceof d.c.C0971c) {
                        mVar = new as7.m(new BookingScreenParams(bookingScreenParams.b, a.C0977a.d.a, bookingScreenParams.d, null, null, false, null, null, null, null, 0, null, 0, null, null, null, null, 131064, null), false);
                    } else if (cVar instanceof d.c.C0972d) {
                        mVar = new as7.h(new BookingScreenParams(bookingScreenParams.b, a.C0977a.d.a, bookingScreenParams.d, null, null, false, null, null, null, null, 0, null, 0, null, null, null, null, 131064, null));
                    } else if (cVar instanceof d.c.b) {
                        UserId userId3 = bookingScreenParams.b;
                        int i8 = a.m.d.a;
                        BookingSettings bookingSettings = bookingScreenParams.d;
                        BookingRecord bookingRecord = ((d.c.b) cVar).a;
                        List<BookingServiceModel> list3 = bookingRecord.e;
                        BookingMaster bookingMaster2 = bookingRecord.f;
                        String str = bookingRecord.h;
                        mVar = new as7.m(new BookingScreenParams(userId3, i8, bookingSettings, list3, bookingMaster2, false, new BookingScreenParams.DateTime(str, str, bookingRecord.i, null, null, bookingRecord.o), bookingRecord.n, bookingRecord.d, bookingRecord.c, bookingRecord.b, bookingRecord.p, 0, null, null, null, null, 127008, null), false);
                    } else {
                        if (!(cVar instanceof d.c.f)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        UserId userId4 = bookingScreenParams.b;
                        int i9 = a.n.d.a;
                        BookingSettings bookingSettings2 = bookingScreenParams.d;
                        BookingRecord bookingRecord2 = ((d.c.f) cVar).a;
                        mVar = new as7.m(new BookingScreenParams(userId4, i9, bookingSettings2, bookingRecord2.e, bookingRecord2.f, false, null, bookingRecord2.n, bookingRecord2.d, bookingRecord2.c, bookingRecord2.b, bookingRecord2.p, 0, null, null, bookingRecord2.o > 0 ? BookingServiceType.GROUP : BookingServiceType.INDIVIDUAL, null, 94240, null), false);
                    }
                    wr7.a(bookingStartScreenFragment, mVar);
                } else if (dVar instanceof d.a) {
                    b.e eVar2 = bookingStartScreenFragment.N;
                    d.a aVar5 = (d.a) dVar;
                    if (aVar5 instanceof d.a.c) {
                        aVar = new mm7.b.g(bookingScreenParams.b, ((d.a.c) aVar5).a, null, false);
                    } else if (aVar5 instanceof d.a.b) {
                        aVar = new mm7.b.C3352b(bookingScreenParams.b, ((d.a.b) aVar5).a, null);
                    } else if (aVar5 instanceof com.vk.ecomm.onlinebooking.impl.main.presentation.mvi2.f) {
                        aVar = new mm7.a.b(bookingScreenParams.b, null);
                    } else if (aVar5 instanceof com.vk.ecomm.onlinebooking.impl.main.presentation.mvi2.g) {
                        aVar = new mm7.a.c(bookingScreenParams.b, ((com.vk.ecomm.onlinebooking.impl.main.presentation.mvi2.g) aVar5).a);
                    } else if (aVar5 instanceof com.vk.ecomm.onlinebooking.impl.main.presentation.mvi2.h) {
                        com.vk.ecomm.onlinebooking.impl.main.presentation.mvi2.h hVar = (com.vk.ecomm.onlinebooking.impl.main.presentation.mvi2.h) aVar5;
                        aVar = new mm7.a.f(bookingScreenParams.b, hVar.a, hVar.b);
                    } else if (aVar5 instanceof com.vk.ecomm.onlinebooking.impl.main.presentation.mvi2.e) {
                        com.vk.ecomm.onlinebooking.impl.main.presentation.mvi2.e eVar3 = (com.vk.ecomm.onlinebooking.impl.main.presentation.mvi2.e) aVar5;
                        aVar = new mm7.a.C3351a(bookingScreenParams.b, eVar3.a, eVar3.b);
                    } else {
                        if (!(aVar5 instanceof d.a.C0970a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        d.a.C0970a c0970a = (d.a.C0970a) aVar5;
                        aVar = new mm7.b.a(bookingScreenParams.b, c0970a.a, c0970a.b);
                    }
                    wr7.b(bookingStartScreenFragment, eVar2, aVar);
                } else {
                    if (!(dVar instanceof d.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    rwp.a(bookingStartScreenFragment.requireContext(), ((d.b) dVar).a, true);
                }
                return s3q0.a;
            case 15:
                wf8 wf8Var = (wf8) this.c;
                wf8Var.z.a();
                bzb0.d(wf8Var.z, new cwb0.a1(R.string.voip_broadcast_delete, null, R.string.voip_broadcast_record_delete_submit_description, null, R.string.voip_broadcast_delete_submit_yes, null, R.string.voip_broadcast_finish_submit_no, null, null, null, 938), new ng1(wf8Var, 11), null, null, 28);
                return s3q0.a;
            case 16:
                bi8 bi8Var = (bi8) this.c;
                di8 di8Var = bi8Var.k;
                di8.a aVar6 = di8Var instanceof di8.a ? (di8.a) di8Var : null;
                if (aVar6 != null) {
                    bi8Var.a(aVar6);
                }
                return s3q0.a;
            case 17:
                cb9 cb9Var = (cb9) this.c;
                VoipViewModelState voipViewModelState = ((fjw0) obj).a;
                cb9Var.getClass();
                return Boolean.valueOf(voipViewModelState == VoipViewModelState.CallingPeer || voipViewModelState == VoipViewModelState.InCall);
            case 18:
                g3a g3aVar = (g3a) this.c;
                Throwable th = (Throwable) obj;
                if (!g3aVar.h) {
                    return io.reactivex.rxjava3.core.q.H(th);
                }
                io.reactivex.rxjava3.core.q b = g3aVar.p.b(g3aVar.b.t());
                io.reactivex.rxjava3.internal.operators.observable.h0 H = io.reactivex.rxjava3.core.q.H(th);
                b.getClass();
                return new io.reactivex.rxjava3.internal.operators.observable.m2(b, H);
            case 19:
                VideoMinimizableState videoMinimizableState = (VideoMinimizableState) ((io.reactivex.rxjava3.subjects.d) ((aha) this.c).j.getValue()).P0();
                if (videoMinimizableState != null && ((videoMinimizableState instanceof VideoMinimizableState.Collapsed) || (videoMinimizableState instanceof VideoMinimizableState.Hidden))) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 20:
                ((mwa) this.c).d = (mwa.a) obj;
                return s3q0.a;
            case 21:
                com.vk.channels.impl.channel_screen.footer.f fVar = (com.vk.channels.impl.channel_screen.footer.f) this.c;
                sxp sxpVar = (sxp) obj;
                if (sxpVar instanceof w680) {
                    return e.b.a;
                }
                if (!(sxpVar instanceof v680)) {
                    throw new IllegalArgumentException("Not supported event = " + sxpVar);
                }
                JoiningToChannelError joiningToChannelError = ((v680) sxpVar).c;
                fVar.getClass();
                int i10 = f.a.$EnumSwitchMapping$0[joiningToChannelError.ordinal()];
                return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? new e.a(ChannelJoiningError.UNKNOWN) : new e.a(ChannelJoiningError.INVALID_INVITE_LINK) : new e.a(ChannelJoiningError.CHANNEL_NOT_FOUND) : new e.a(ChannelJoiningError.ACCESS_DENIED) : new e.a(ChannelJoiningError.LIMITS);
            case 22:
                w2w w2wVar = (w2w) this.c;
                xgl0 xgl0Var = (xgl0) obj;
                frn0 system = xgl0Var.system();
                uib a = xgl0Var.a();
                int j = system.j();
                Map<ChannelsCounters.Type, com.vk.im.engine.models.channels.a> k = a.k(Arrays.asList(ChannelsCounters.Type.values()));
                Collection<bdb> d0 = a.d0();
                w2wVar.f1();
                return new ChannelsCounters(peb.f(ChannelsCounters.Type.UNREAD, k, j, d0), peb.f(ChannelsCounters.Type.UNREAD_UNMUTED, k, j, d0), peb.g(k, ChannelsCounters.Type.ARCHIVED, j), peb.g(k, ChannelsCounters.Type.SUGGESTED, j));
            case 23:
                com.vk.channels.impl.list.f fVar2 = (com.vk.channels.impl.list.f) this.c;
                ((Boolean) obj).booleanValue();
                fVar2.R();
                return s3q0.a;
            case 24:
                rtb rtbVar = (rtb) this.c;
                if (((Integer) obj).intValue() == 0) {
                    o0w b2 = rtbVar.j.b();
                    ttb ttbVar = rtbVar.m;
                    b2.R((ttbVar != null ? ttbVar : null).b.getContext());
                } else {
                    rtbVar.k.a();
                }
                return s3q0.a;
            case 25:
                ffc ffcVar = (ffc) this.c;
                int i11 = rec.j1;
                ffcVar.b(ffcVar.f);
                return s3q0.a;
            case 26:
                ClipDiscoverVh clipDiscoverVh = (ClipDiscoverVh) this.c;
                Banner banner = ((t180) obj).a;
                clipDiscoverVh.i = new SchemeStat$EventItem(SchemeStat$EventItem.Type.CATALOG_BANNER, Long.valueOf(banner.b), null, banner.c, banner.e, null, 36, null);
                return s3q0.a;
            case 27:
                return o1d.s((o1d) this.c, (e3d) obj);
            case 28:
                VideoFile videoFile2 = (VideoFile) obj;
                x6d.a aVar7 = ((x6d) this.c).e;
                p8e p8eVar = aVar7.d;
                if (p8eVar != null) {
                    p8eVar.a(new o8e(videoFile2.I0(), videoFile2.o0(), o8e.a.C3443a.a));
                }
                return aVar7.c.Hl(k15.B(videoFile2));
            default:
                xde xdeVar = (xde) this.c;
                bwr0 bwr0Var = (bwr0) obj;
                for (eoe eoeVar : xdeVar.f.values()) {
                    boolean z3 = xdeVar.b;
                    UserId userId5 = eoeVar.a;
                    if (bwr0Var instanceof wxr0) {
                        VideoFile videoFile3 = ((wxr0) bwr0Var).a;
                        if (epx.f(videoFile3.I0(), userId5) && (videoFile3 instanceof ClipVideoFile)) {
                            eoeVar.b((ClipVideoFile) videoFile3, true);
                        }
                    } else if (bwr0Var instanceof fyr0) {
                        VideoFile videoFile4 = ((fyr0) bwr0Var).a;
                        if (epx.f(videoFile4.I0(), userId5) && (videoFile4 instanceof ClipVideoFile)) {
                            eoeVar.b((ClipVideoFile) videoFile4, z3 && videoFile4.k1() == 0);
                        }
                    }
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ k9(w2w w2wVar, peb pebVar) {
        this.b = 22;
        this.c = w2wVar;
    }
}
