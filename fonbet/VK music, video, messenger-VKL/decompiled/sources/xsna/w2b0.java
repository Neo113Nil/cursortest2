package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.SystemClock;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.core.apps.BuildInfo;
import com.vk.dto.common.DownloadingState;
import com.vk.dto.music.MusicDynamicRestriction;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.audiobook.AudioBook;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.notifications.restriction.MusicRestrictionPopupDisplayer;
import com.vk.music.player.LoopMode;
import com.vk.music.player.PauseReason;
import com.vk.music.player.PlayRequestTrigger;
import com.vk.music.player.PlayState;
import com.vk.music.player.PlaybackActionMeta;
import com.vk.music.player.PlayerMode;
import com.vk.music.player.PlayerTrack;
import com.vk.music.player.ShuffleMode;
import com.vk.music.player.StartPlayAudioBookSource;
import com.vk.music.player.StartPlayCatalogSource;
import com.vk.music.player.StartPlayPlaylistSource;
import com.vk.music.player.StartPlaySimilarTracksSource;
import com.vk.music.player.StartPlaySource;
import com.vk.music.player.StartPlayVkMixSource;
import com.vk.music.player.service.MusicPlayerAction;
import com.vk.music.playerservice.api.PlayerServiceComponent;
import com.vk.music.stats.AdsAudioPixelsContainer;
import com.vk.stat.scheme.CommonAudioStat$TypeAudioModal;
import com.vkontakte.android.R;
import com.vkontakte.android.VKApplication;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.random.Random;
import xsna.h7u0;
import xsna.k840;

/* compiled from: PlayerModelImpl.kt */
/* loaded from: classes.dex */
public final class w2b0 implements u2b0, i80 {
    public final bpn0 b;
    public final ix4 c = new ix4();
    public final HashSet d = new HashSet();
    public final com.vk.music.player.b e = new com.vk.music.player.b(this, new f0q());
    public io.reactivex.rxjava3.disposables.c f;
    public io.reactivex.rxjava3.disposables.c g;
    public String h;
    public final bpn0 i;

    public w2b0(bpn0 bpn0Var) {
        this.b = bpn0Var;
        EmptyDisposable emptyDisposable = EmptyDisposable.INSTANCE;
        this.f = emptyDisposable;
        this.g = emptyDisposable;
        this.i = new bpn0(new c24(9));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean E(lqk0 lqk0Var, List list) {
        AudioBook Ab;
        AudioBook Ab2;
        Boolean bool;
        Integer num;
        boolean z;
        MusicTrack musicTrack;
        StartPlaySource g = lqk0Var.g();
        MusicDynamicRestriction Ab3 = g instanceof StartPlayPlaylistSource ? ((StartPlayPlaylistSource) g).Ab().Ab() : (!(g instanceof StartPlayAudioBookSource) || (Ab = ((StartPlayAudioBookSource) g).Ab()) == null) ? null : Ab.Eb();
        StartPlaySource g2 = lqk0Var.g();
        int i = 1;
        boolean j = g2 instanceof StartPlayPlaylistSource ? jnj.j(((StartPlayPlaylistSource) g2).Ab().zb()) : (g2 instanceof StartPlayAudioBookSource) && (Ab2 = ((StartPlayAudioBookSource) g2).Ab()) != null && jnj.j(aqw.e(Ab2));
        StartPlaySource g3 = lqk0Var.g();
        int i2 = 3;
        if (g3 instanceof StartPlayCatalogSource) {
            boolean b = k840.a.i.b();
            boolean equals = lqk0Var.c().Gb().equals("kids_section");
            if (!b && equals) {
                num = 24;
            }
            num = null;
        } else {
            if (g3 instanceof StartPlayPlaylistSource) {
                if (list != null) {
                    List list2 = list;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            if (((MusicTrack) it.next()).Db() == 3) {
                                z = false;
                                break;
                            }
                        }
                    }
                    z = true;
                    bool = Boolean.valueOf(z);
                } else {
                    bool = null;
                }
                if (((StartPlayPlaylistSource) g3).Ab().Bb() && epx.f(bool, Boolean.FALSE)) {
                    num = 3;
                }
            }
            num = null;
        }
        if (list != null) {
            if (!list.isEmpty()) {
                List list3 = list;
                if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                    Iterator it2 = list3.iterator();
                    while (it2.hasNext()) {
                        if (!((MusicTrack) it2.next()).B()) {
                        }
                    }
                }
                if (list != null) {
                    musicTrack = (MusicTrack) j5g.a0(list);
                    if (Ab3 == null) {
                        com.vk.music.notifications.restriction.a aVar = k840.a.d;
                        if (aVar == null) {
                            aVar = null;
                        }
                        aVar.a(Ab3, null);
                        return true;
                    }
                    if (j) {
                        c63 c63Var = c63.a;
                        Activity b2 = c63.b();
                        if (b2 != null) {
                            ke50.a(b2);
                        }
                        return true;
                    }
                    if (num == null) {
                        if (musicTrack == null) {
                            return false;
                        }
                        com.vk.music.notifications.restriction.a aVar2 = k840.a.d;
                        (aVar2 != null ? aVar2 : null).g(musicTrack);
                        return true;
                    }
                    com.vk.music.notifications.restriction.a aVar3 = k840.a.d;
                    if (aVar3 == null) {
                        aVar3 = null;
                    }
                    int intValue = num.intValue();
                    aVar3.getClass();
                    r5v0 r5v0Var = k840.a.h;
                    (r5v0Var != null ? r5v0Var : null).b(xij0.a);
                    aVar3.d.b(new io.reactivex.rxjava3.internal.operators.single.j(((mw4) aVar3.i.getValue()).c(intValue).q(vx2.d.m()).m(io.reactivex.rxjava3.android.schedulers.a.b()), new nt1(aVar3, i)).subscribe(new sf(new bi6(aVar3), i2)));
                    return true;
                }
            }
            list = null;
            if (list != null) {
            }
        }
        musicTrack = null;
        if (Ab3 == null) {
        }
    }

    public static Pair y(MusicTrack musicTrack, List list, boolean z) {
        ArrayList arrayList;
        int i = 0;
        if (list != null) {
            arrayList = new ArrayList();
            for (Object obj : list) {
                if (!((MusicTrack) obj).B()) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        if (musicTrack != null) {
            int indexOf = arrayList != null ? arrayList.indexOf(musicTrack) : -1;
            return (indexOf < 0 || arrayList == null) ? new Pair(Collections.singletonList(musicTrack), 0) : new Pair(arrayList, Integer.valueOf(indexOf));
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return new Pair((list != null ? (MusicTrack) j5g.Y(list) : null) == null ? EmptyList.b : Collections.singletonList(j5g.Y(list)), 0);
        }
        if (z) {
            Random.Default r7 = Random.b;
            int size = arrayList.size();
            r7.getClass();
            i = Random.c.k(size);
        }
        return new Pair(arrayList, Integer.valueOf(i));
    }

    @Override // xsna.u2b0
    public final boolean A0() {
        return j() instanceof StartPlayVkMixSource;
    }

    @Override // xsna.u2b0
    public final void B0(int i, PlaybackActionMeta playbackActionMeta) {
        kza0 a = dy4.p.a();
        MusicTrack d = vn4.d();
        if (a == null || d == null) {
            return;
        }
        a.j((int) ((a.getDuration() * i) / 100.0f), playbackActionMeta);
    }

    @Override // xsna.u2b0
    public final long C1() {
        kza0 a = dy4.p.a();
        if ((a != null ? a.C() : null) == null) {
            return 0L;
        }
        return r0.h() / 1000;
    }

    public final void D(int i, boolean z) {
        c63 c63Var = c63.a;
        Context b = c63.b();
        if (b != null) {
            if (z) {
                b = bwt0.u(b);
            }
            w7k0.d((w7k0) this.i.getValue(), b, i);
        }
    }

    @Override // xsna.u2b0
    public final boolean E0() {
        Iterator<PlayerTrack> it = vn4.b().iterator();
        while (it.hasNext()) {
            if (it.next().Ab().Mb()) {
                return true;
            }
        }
        return false;
    }

    @Override // xsna.u2b0
    public final void E1(PlayerTrack playerTrack, boolean z, PlaybackActionMeta playbackActionMeta, String str) {
        if (playerTrack.Ab().Pb()) {
            com.vk.core.utils.newtork.b.a.getClass();
            if (!com.vk.core.utils.newtork.b.d()) {
                com.vk.music.notifications.restriction.a aVar = k840.a.d;
                if (aVar == null) {
                    aVar = null;
                }
                aVar.j();
                return;
            }
        }
        ox40.g(playbackActionMeta, playerTrack.Bb(), str, z);
    }

    @Override // xsna.u2b0
    public final long F0() {
        kza0 a = dy4.p.a();
        if (a != null) {
            return TimeUnit.SECONDS.toMillis(a.Q());
        }
        return 0L;
    }

    @Override // xsna.u2b0
    public final void G0(int i, PlaybackActionMeta playbackActionMeta) {
        StringBuilder b = ji.b(i, "seekToPositionMs=", ", actionTrigger=");
        b.append(playbackActionMeta.Ab());
        bn40.f(b.toString());
        kza0 a = dy4.p.a();
        MusicTrack d = vn4.d();
        if (a == null || d == null) {
            return;
        }
        a.j(i, playbackActionMeta);
    }

    @Override // xsna.u2b0
    public final com.vk.music.player.f H() {
        kza0 a = dy4.p.a();
        if (a != null) {
            return a.C();
        }
        return null;
    }

    @Override // xsna.u2b0
    public final void H0(PlayerTrack playerTrack, PlayerTrack playerTrack2) {
        kza0 a = dy4.p.a();
        if (a != null) {
            a.l(playerTrack.Bb(), playerTrack2.Bb());
        }
    }

    @Override // xsna.u2b0
    public final void I0() {
        ox40.d(this.h);
    }

    @Override // xsna.u2b0
    public final boolean I1() {
        kza0 a = dy4.p.a();
        com.vk.music.player.f C = a != null ? a.C() : null;
        return C != null && C.n();
    }

    @Override // xsna.u2b0
    public final boolean J0() {
        if (k() == p() - 1) {
            return getRepeatMode() == LoopMode.NONE || getRepeatMode() == LoopMode.TRACK;
        }
        return false;
    }

    @Override // xsna.u2b0
    public final boolean J1(String str) {
        kza0 a = dy4.p.a();
        if (a == null) {
            return false;
        }
        a.H(str);
        return true;
    }

    @Override // xsna.u2b0
    public final MusicTrack K0() {
        com.vk.music.player.f C;
        PlayerTrack j;
        kza0 a = dy4.p.a();
        if (a == null || (C = a.C()) == null || (j = C.j()) == null) {
            return null;
        }
        return j.Ab();
    }

    @Override // xsna.u2b0
    public final void L0(PlaybackActionMeta playbackActionMeta) {
        ox40.i(playbackActionMeta, this.h);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.u2b0
    public final void N0(lqk0 lqk0Var) {
        h7u0.a c;
        Pair pair;
        AudioBook Ab;
        AudioBook Ab2;
        bn40.f("request = " + lqk0Var);
        this.g.dispose();
        StartPlaySource g = lqk0Var.g();
        List<MusicTrack> b = lqk0Var.b();
        Object[] objArr = b == null || b.isEmpty();
        int i = 9;
        if ((g instanceof StartPlaySimilarTracksSource) && objArr == true) {
            boolean z = epx.f(lqk0Var.c().Hb(), "player") || epx.f(lqk0Var.c().Hb(), "player_track_menu");
            r5v0 r5v0Var = k840.a.h;
            if (r5v0Var == null) {
                r5v0Var = null;
            }
            StartPlaySimilarTracksSource startPlaySimilarTracksSource = (StartPlaySimilarTracksSource) g;
            r5v0Var.b(new igp0(startPlaySimilarTracksSource.Ab().zb(), true));
            io.reactivex.rxjava3.internal.operators.observable.m1 y0 = rsg0.y0(yfb.x(this.c.n(Boolean.valueOf(startPlaySimilarTracksSource.Ab().Ab()), startPlaySimilarTracksSource.Ab().zb())), null, null, 3);
            int i2 = 15;
            cc20 cc20Var = new cc20(new c3v(10), i2);
            a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
            a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
            io.reactivex.rxjava3.internal.operators.observable.j1 U = y0.E(cc20Var, lVar, kVar, kVar).F(new a8v(new pyz(17), i)).U(new t7(new qcw(i2), 28));
            Context context = e43.a;
            StartPlaySimilarTracksSource startPlaySimilarTracksSource2 = (StartPlaySimilarTracksSource) g;
            boolean z2 = z;
            this.g = new io.reactivex.rxjava3.internal.operators.observable.a0(hg1.m(U, context != null ? context : null, 0L, false, 62), new jad(startPlaySimilarTracksSource2, 4)).subscribe(new l8w(new agh(2, this, lqk0Var, startPlaySimilarTracksSource2, z2), i2), new b8v(new f66(this, z2, 2), i2));
            return;
        }
        if (!lqk0Var.j() && lqk0Var.i() != null && epx.f(lqk0Var.i(), vn4.d())) {
            MusicPlaybackLaunchContext c2 = lqk0Var.c();
            kza0 a = dy4.p.a();
            if (a != null) {
                a.t(c2);
            }
            ox40.n(new PlaybackActionMeta(6, lqk0Var.h()), this.h);
            return;
        }
        if (E(lqk0Var, lqk0Var.b())) {
            dy4.p.onError(null);
            return;
        }
        StartPlaySource g2 = lqk0Var.g();
        StartPlayAudioBookSource startPlayAudioBookSource = g2 instanceof StartPlayAudioBookSource ? (StartPlayAudioBookSource) g2 : null;
        bpn0 bpn0Var = this.b;
        if (startPlayAudioBookSource != null && (Ab = startPlayAudioBookSource.Ab()) != null && Ab.Fb() && !((g950) bpn0Var.getValue()).b()) {
            com.vk.music.notifications.restriction.a aVar = k840.a.d;
            com.vk.music.notifications.restriction.a aVar2 = aVar != null ? aVar : null;
            StartPlaySource g3 = lqk0Var.g();
            StartPlayAudioBookSource startPlayAudioBookSource2 = g3 instanceof StartPlayAudioBookSource ? (StartPlayAudioBookSource) g3 : null;
            MusicRestrictionPopupDisplayer.d(aVar2, (startPlayAudioBookSource2 == null || (Ab2 = startPlayAudioBookSource2.Ab()) == null || !jnj.d(aqw.e(Ab2))) ? "audiobook" : "audio_kids", lqk0Var.c(), null, null, 12);
            return;
        }
        MusicTrack i3 = lqk0Var.i();
        List<MusicTrack> b2 = lqk0Var.b();
        PlaybackActionMeta d = lqk0Var.d();
        if (i3 == null) {
            List<MusicTrack> list = b2;
            if (list == null || list.isEmpty()) {
                pair = new Pair(b2, null);
            } else {
                pair = y(null, lqk0Var.b(), lqk0Var.f() == ShuffleMode.SHUFFLE_ON);
            }
            vn4.e((List) pair.d(), lqk0Var.e(), null, lqk0Var.c(), lqk0Var.f(), this.h, lqk0Var.g(), d, lqk0Var.a());
        } else {
            List<MusicTrack> list2 = b2;
            if (list2 == null || list2.isEmpty()) {
                vn4.e(Collections.singletonList(i3), lqk0Var.e(), 0, lqk0Var.c(), lqk0Var.f(), this.h, lqk0Var.g(), d, lqk0Var.a());
            } else {
                Pair y = y(lqk0Var.i(), lqk0Var.b(), lqk0Var.f() == ShuffleMode.SHUFFLE_ON);
                vn4.e((List) y.d(), lqk0Var.e(), Integer.valueOf(((Number) y.g()).intValue()), lqk0Var.c(), lqk0Var.f(), this.h, lqk0Var.g(), d, lqk0Var.a());
            }
        }
        if (i3 == null || ((g950) bpn0Var.getValue()).c()) {
            return;
        }
        final com.vk.music.notifications.restriction.a aVar3 = k840.a.d;
        if (aVar3 == null) {
            aVar3 = null;
        }
        final MusicPlaybackLaunchContext c3 = lqk0Var.c();
        aVar3.getClass();
        DownloadingState downloadingState = i3.J;
        if (epx.f(c3 != null ? c3.t() : null, MusicPlaybackLaunchContext.J.t()) || i3.Mb() || i3.Vb()) {
            return;
        }
        final Activity b3 = c63.b();
        if (aVar3.f || b3 == null) {
            return;
        }
        DownloadingState.Downloaded downloaded = DownloadingState.Downloaded.b;
        if (epx.f(downloadingState, downloaded)) {
            int i4 = h7u0.p;
            c = h7u0.b.c(b3);
            com.vk.core.utils.newtork.b.a.getClass();
            boolean d2 = com.vk.core.utils.newtork.b.d();
            c.g0(d2 ? R.string.offline_subscription_online_popup_title : R.string.offline_subscription_offline_popup_title);
            c.U(d2 ? R.string.offline_subscription_online_popup_message : R.string.offline_subscription_offline_popup_message);
            if (d2) {
                c.c0(R.string.offline_subscription_online_popup_positive_button, new DialogInterface.OnClickListener() { // from class: xsna.th6
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i5) {
                        MusicPlaybackLaunchContext musicPlaybackLaunchContext = c3;
                        if (musicPlaybackLaunchContext == null) {
                            musicPlaybackLaunchContext = MusicPlaybackLaunchContext.d;
                        }
                        MusicRestrictionPopupDisplayer.SubscriptionPopupType subscriptionPopupType = MusicRestrictionPopupDisplayer.SubscriptionPopupType.DEFAULT;
                        MusicRestrictionPopupDisplayer.e(com.vk.music.notifications.restriction.a.this, b3, "download", musicPlaybackLaunchContext, "audio_download_alert", subscriptionPopupType, null, 32);
                        dialogInterface.dismiss();
                    }
                });
                c.W(R.string.offline_subscription_online_popup_negative_button, new uh6(0));
            } else {
                c.c0(R.string.offline_subscription_offline_popup_positive_button, new DialogInterface.OnClickListener() { // from class: xsna.vh6
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i5) {
                        dialogInterface.dismiss();
                    }
                });
            }
            i0q0.f(new ra(c, i));
            aVar3.f = true;
            s750 s750Var = aVar3.b;
            if (epx.f(downloadingState, downloaded)) {
                s750Var.Z(d2);
            }
            s750Var.H0(d2 ? CommonAudioStat$TypeAudioModal.ModalId.SUBSCRIPTION_EXPIRED : CommonAudioStat$TypeAudioModal.ModalId.SUBSCRIPTION_EXPIRED_OFFLINE);
        }
    }

    @Override // xsna.u2b0
    public final void P0(com.vk.music.player.e eVar, boolean z) {
        if (this.f.h()) {
            r5v0 r5v0Var = k840.a.h;
            if (r5v0Var == null) {
                r5v0Var = null;
            }
            this.f = r5v0Var.a.a.a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new czz(new v2b0(), 2));
        }
        this.d.add(eVar);
        vn4.a(eVar, z);
    }

    @Override // xsna.u2b0
    public final boolean T0() {
        Iterator<PlayerTrack> it = vn4.b().iterator();
        while (it.hasNext()) {
            if (it.next().Ab().Vb()) {
                return true;
            }
        }
        return false;
    }

    @Override // xsna.u2b0
    public final boolean U0() {
        return vn4.g().M();
    }

    @Override // xsna.u2b0
    public final void V0() {
        ox40.m(getRepeatMode());
    }

    @Override // xsna.u2b0
    public final MusicTrack b() {
        return vn4.d();
    }

    @Override // xsna.u2b0
    public final void b1(PlaybackActionMeta playbackActionMeta) {
        ox40.f(playbackActionMeta, this.h);
    }

    @Override // xsna.u2b0
    public final boolean c1() {
        Iterator<PlayerTrack> it = vn4.b().iterator();
        while (it.hasNext()) {
            if (it.next().Ab().Ub()) {
                return true;
            }
        }
        return false;
    }

    @Override // xsna.u2b0
    public final List<gza0> d() {
        kza0 a = dy4.p.a();
        return a == null ? Collections.EMPTY_LIST : a.d();
    }

    @Override // xsna.i80
    public final Bundle e() {
        return new Bundle();
    }

    @Override // xsna.u2b0
    public final void f(PlaybackActionMeta playbackActionMeta) {
        ox40.j(playbackActionMeta, this.h);
    }

    @Override // xsna.u2b0
    public final List<PlayerTrack> g() {
        return vn4.b();
    }

    @Override // xsna.u2b0
    public final LoopMode getRepeatMode() {
        return vn4.g().n0();
    }

    @Override // xsna.u2b0
    public final boolean h() {
        PlayState playState = dy4.p.c;
        if (playState == null) {
            playState = PlayState.IDLE;
        }
        return playState.h();
    }

    @Override // xsna.u2b0
    public final StartPlaySource j() {
        kza0 a = dy4.p.a();
        if (a != null) {
            return a.i();
        }
        return null;
    }

    @Override // xsna.u2b0
    public final int k() {
        kza0 a = dy4.p.a();
        if (a != null) {
            return a.k();
        }
        return -1;
    }

    @Override // xsna.u2b0
    public final float l() {
        return vn4.g().l();
    }

    @Override // xsna.u2b0
    public final PlayState m0() {
        PlayState playState = dy4.p.c;
        return playState == null ? PlayState.IDLE : playState;
    }

    @Override // xsna.u2b0
    public final void m1(StartPlaySource startPlaySource, List<MusicTrack> list, MusicPlaybackLaunchContext musicPlaybackLaunchContext, boolean z, PlaybackActionMeta playbackActionMeta) {
        if (E(new lqk0(startPlaySource, (MusicTrack) null, (List) null, (MusicPlaybackLaunchContext) null, 0, (ShuffleMode) null, (PlayRequestTrigger) null, (AdsAudioPixelsContainer) null, 0L, IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW), list)) {
            return;
        }
        List<MusicTrack> list2 = list;
        ox40.a(new vo0(startPlaySource, list2, z), this.h, musicPlaybackLaunchContext, playbackActionMeta);
        if (list2.isEmpty()) {
            return;
        }
        r5v0 r5v0Var = k840.a.h;
        if (r5v0Var == null) {
            r5v0Var = null;
        }
        r5v0Var.b(new bb50(x0().Kb()));
    }

    @Override // xsna.u2b0
    public final void n0(com.vk.music.player.e eVar) {
        vn4.f(eVar);
        HashSet hashSet = this.d;
        hashSet.remove(eVar);
        if (hashSet.size() != 0 || this.f.h()) {
            return;
        }
        vn4.f(eVar);
        this.f.dispose();
    }

    @Override // xsna.u2b0
    public final void o() {
        U0();
        ox40.o();
    }

    @Override // xsna.u2b0
    public final PlayerTrack o0() {
        com.vk.music.player.f C;
        kza0 a = dy4.p.a();
        if (a == null || (C = a.C()) == null) {
            return null;
        }
        return C.g();
    }

    @Override // xsna.u2b0
    public final int p() {
        kza0 a = dy4.p.a();
        if (a == null) {
            return 0;
        }
        return a.p();
    }

    @Override // xsna.u2b0
    public final void pause(int i) {
        ox40.n(new PlaybackActionMeta(i, 0L, 2, null), this.h);
    }

    @Override // xsna.u2b0
    public final void q0() {
        com.vk.music.pref.a g = vn4.g();
        afw0 b = a201.b();
        PlayState playState = dy4.p.c;
        if (playState == null) {
            playState = PlayState.IDLE;
        }
        if (playState == PlayState.PAUSED && g.b0() && b.isIdle()) {
            g.B0(false);
            ox40.j(new PlaybackActionMeta(2, SystemClock.elapsedRealtime()), null);
        }
    }

    @Override // xsna.i80
    public final void release() {
        HashSet hashSet = this.d;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            vn4.f((com.vk.music.player.e) it.next());
        }
        hashSet.clear();
        this.f.dispose();
        this.g.dispose();
    }

    @Override // xsna.u2b0
    public final void s(float f, boolean z) {
        ox40.k(f, z);
    }

    @Override // xsna.u2b0
    public final void s0(PlaybackActionMeta playbackActionMeta) {
        ox40.e(playbackActionMeta, this.h);
    }

    @Override // xsna.u2b0
    public final void setPayload(String str) {
        this.h = str;
    }

    @Override // xsna.u2b0
    public final void stop(int i) {
        ox40.l(new PlaybackActionMeta(i, 0L, 2, null), this.h);
    }

    @Override // xsna.u2b0
    public final void t1(int i, PauseReason pauseReason, Runnable runnable) {
        ((PlayerServiceComponent) j6i.b(m7m.f(vn4.a), PlayerServiceComponent.class)).i7().a(MusicPlayerAction.ACTION_CONNECT_AND_CLOSE, new tn4(i, pauseReason, runnable, this.h));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[state=");
        PlayState playState = dy4.p.c;
        if (playState == null) {
            playState = PlayState.IDLE;
        }
        sb.append(playState);
        sb.append(", current= ");
        sb.append(vn4.d());
        sb.append(", prev=");
        sb.append(K0());
        sb.append(']');
        return sb.toString();
    }

    @Override // xsna.i80
    public final void u(Bundle bundle) {
        HashSet hashSet = this.d;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            vn4.f((com.vk.music.player.e) it.next());
        }
        if (this.f.h()) {
            return;
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            vn4.a((com.vk.music.player.e) it2.next(), true);
        }
    }

    @Override // xsna.u2b0
    public final void v1(hhg hhgVar) {
        com.vk.music.player.b bVar = this.e;
        bVar.c.getClass();
        BuildInfo.Client client = BuildInfo.a;
        VKApplication vKApplication = com.vk.core.apps.a.a;
        w2b0 w2b0Var = bVar.b;
        if (w2b0Var.m0().h()) {
            hhgVar.run();
            return;
        }
        bVar.d.add(hhgVar);
        if (bVar.e) {
            return;
        }
        w2b0Var.P0(bVar, true);
        bVar.e = true;
    }

    @Override // xsna.u2b0
    public final void w0(boolean z, PlaybackActionMeta playbackActionMeta) {
        ox40.h(z, playbackActionMeta, this.h);
    }

    @Override // xsna.u2b0
    public final void w1(PlaybackActionMeta playbackActionMeta) {
        ox40.n(playbackActionMeta, this.h);
    }

    @Override // xsna.u2b0
    public final MusicPlaybackLaunchContext x0() {
        MusicPlaybackLaunchContext c = vn4.c();
        if (epx.f(c, MusicPlaybackLaunchContext.d)) {
            c = null;
        }
        return c == null ? MusicPlaybackLaunchContext.A : c;
    }

    @Override // xsna.u2b0
    public final PlayerMode x1() {
        MusicTrack d = vn4.d();
        return !I1() ? PlayerMode.ADVERTISEMENT : (d == null || !d.Vb()) ? (d == null || !d.Wb()) ? (d == null || !d.Mb()) ? (d == null || !d.Nb()) ? (d == null || !d.Qb()) ? PlayerMode.AUDIO : PlayerMode.PODCAST : PlayerMode.STREAM : PlayerMode.AUDIO_BOOK : PlayerMode.RADIO : PlayerMode.PODCAST;
    }

    @Override // xsna.u2b0
    public final boolean y0(MusicTrack musicTrack) {
        return musicTrack.equals(vn4.d());
    }

    @Override // xsna.u2b0
    public final boolean z0() {
        MusicTrack d = vn4.d();
        if (d != null) {
            return d.Wb();
        }
        return false;
    }

    @Override // xsna.u2b0
    public final boolean z1() {
        Iterator<PlayerTrack> it = vn4.b().iterator();
        while (it.hasNext()) {
            if (it.next().Ab().Qb()) {
                return true;
            }
        }
        return false;
    }

    @Override // xsna.i80
    public final void G1() {
    }

    @Override // xsna.u2b0
    public final void Y0() {
    }
}
