package xsna;

import android.text.SpannedString;
import com.vk.dto.common.DownloadingState;
import com.vk.dto.music.MusicDynamicRestriction;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.audiobook.AudioBook;
import com.vk.dto.music.audiobook.AudioBookChapter;
import com.vk.dto.music.audiobook.AudioBookFile;
import com.vk.dto.music.audiobook.AudioBookPerson;
import com.vk.dto.music.audiobook.AudioBooksChapterProgressStatus;
import com.vk.music.bottomsheets.audiobook.AudioBookChapterBottomSheetLaunchPoint;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.player.PlayRequestTrigger;
import com.vk.music.player.ShuffleMode;
import com.vk.music.player.StartPlayAudioBookSource;
import com.vk.music.player.StartPlaySource;
import com.vk.music.stats.AdsAudioPixelsContainer;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.gdn;
import xsna.idn;
import xsna.k840;
import xsna.odn;

/* compiled from: DisplayAudioBookChaptersFeature.kt */
/* loaded from: classes3.dex */
public final class ndn extends wk50<ken, jen, gdn, odn> {
    public final int f;
    public final ch4 g;
    public final u2b0 h;
    public final u750 i;
    public final sdz j;
    public final MusicPlaybackLaunchContext k;
    public final mzp0 l;
    public final f4z m;
    public final io.reactivex.rxjava3.disposables.g n;
    public final io.reactivex.rxjava3.disposables.g o;
    public final io.reactivex.rxjava3.disposables.g p;
    public final mdn q;
    public final w71 r;

    public ndn(int i, pdn pdnVar, ch4 ch4Var, u2b0 u2b0Var, u750 u750Var, sdz sdzVar, MusicPlaybackLaunchContext musicPlaybackLaunchContext, mzp0 mzp0Var) {
        super(gdn.d.a.b, pdnVar);
        this.f = i;
        this.g = ch4Var;
        this.h = u2b0Var;
        this.i = u750Var;
        this.j = sdzVar;
        this.k = musicPlaybackLaunchContext;
        this.l = mzp0Var;
        this.m = new f4z();
        io.reactivex.rxjava3.disposables.g gVar = new io.reactivex.rxjava3.disposables.g();
        this.e.b(gVar);
        this.n = gVar;
        io.reactivex.rxjava3.disposables.g gVar2 = new io.reactivex.rxjava3.disposables.g();
        this.e.b(gVar2);
        this.o = gVar2;
        io.reactivex.rxjava3.disposables.g gVar3 = new io.reactivex.rxjava3.disposables.g();
        this.e.b(gVar3);
        this.p = gVar3;
        mdn mdnVar = new mdn(this);
        this.q = mdnVar;
        u2b0Var.P0(mdnVar, true);
        r5v0 r5v0Var = k840.a.h;
        this.e.b((r5v0Var == null ? null : r5v0Var).a.a.a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new hz(new m4g(this, 14), 25)));
        w71 w71Var = new w71(100L, new com.vk.movika.sdk.android.defaultplayer.control.l(this, 3), new g54(21));
        this.e.b(w71Var.d);
        this.r = w71Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v21, types: [xsna.idn$o] */
    /* JADX WARN: Type inference failed for: r1v23, types: [xsna.idn$q] */
    /* JADX WARN: Type inference failed for: r1v33, types: [xsna.idn$o] */
    /* JADX WARN: Type inference failed for: r1v35, types: [xsna.idn$q] */
    /* JADX WARN: Type inference failed for: r2v30, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.lang.Object] */
    @Override // xsna.wk50
    public final void N(jen jenVar, gdn gdnVar) {
        idn.h hVar;
        idn.h hVar2;
        Object obj;
        ArrayList arrayList;
        AudioBookChapter audioBookChapter;
        jen jenVar2 = jenVar;
        gdn gdnVar2 = gdnVar;
        List<AudioBookPerson> list = jenVar2.o;
        List<AudioBookPerson> list2 = jenVar2.m;
        AudioBook audioBook = jenVar2.c;
        if (gdnVar2 instanceof gdn.d) {
            gdn.d dVar = (gdn.d) gdnVar2;
            if (dVar instanceof gdn.d.a) {
                V(false);
                return;
            } else {
                if (!(dVar instanceof gdn.d.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                V(true);
                return;
            }
        }
        boolean z = gdnVar2 instanceof gdn.c;
        u2b0 u2b0Var = this.h;
        AudioBookChapter audioBookChapter2 = null;
        MusicTrack musicTrack = null;
        MusicTrack musicTrack2 = null;
        ArrayList arrayList2 = null;
        f4z f4zVar = this.m;
        if (z) {
            gdn.c cVar = (gdn.c) gdnVar2;
            if (epx.f(cVar, gdn.c.C2934c.b)) {
                f4zVar.b(idn.a.a);
                return;
            }
            if (epx.f(cVar, gdn.c.d.b)) {
                f4zVar.b(new idn.f(audioBook));
                return;
            }
            if (cVar instanceof gdn.c.f) {
                boolean z2 = ((gdn.c.f) cVar).b;
                a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
                a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
                MusicPlaybackLaunchContext musicPlaybackLaunchContext = this.k;
                ch4 ch4Var = this.g;
                if (z2) {
                    final int i = audioBook.b;
                    final String str = audioBook.t;
                    this.o.b(new io.reactivex.rxjava3.internal.operators.completable.h(new io.reactivex.rxjava3.internal.operators.completable.w(R(S(ch4Var.a(i, musicPlaybackLaunchContext.Lb(), jnj.d(audioBook.u)))), new v8(new k7f(this, 13), 20), lVar, kVar, kVar, kVar, kVar), new cdd(this, 1)).subscribe(new io.reactivex.rxjava3.functions.a() { // from class: xsna.ldn
                        @Override // io.reactivex.rxjava3.functions.a
                        public final void run() {
                            ndn ndnVar = ndn.this;
                            int i2 = i;
                            ndnVar.X(i2, true);
                            ndnVar.T(new odn.b(true));
                            ndnVar.i.s0(i2, str, true);
                            ndnVar.m.b(idn.j.a);
                        }
                    }, new defpackage.n(new y8(this, 19), 22)));
                    return;
                } else {
                    final int i2 = audioBook.b;
                    final String str2 = audioBook.t;
                    this.p.b(new io.reactivex.rxjava3.internal.operators.completable.h(new io.reactivex.rxjava3.internal.operators.completable.w(R(S(ch4Var.c(i2, musicPlaybackLaunchContext.Lb(), jnj.d(audioBook.u)))), new az(new wze(this, 19), 21), lVar, kVar, kVar, kVar, kVar), new zwa(this, 3)).subscribe(new io.reactivex.rxjava3.functions.a() { // from class: xsna.jdn
                        @Override // io.reactivex.rxjava3.functions.a
                        public final void run() {
                            ndn ndnVar = ndn.this;
                            int i3 = i2;
                            ndnVar.X(i3, false);
                            ndnVar.T(new odn.b(false));
                            ndnVar.i.s0(i3, str2, false);
                        }
                    }, new ez(new dz(this, 23), 18)));
                    return;
                }
            }
            if (!epx.f(cVar, gdn.c.e.b)) {
                if (!epx.f(cVar, gdn.c.b.b)) {
                    if (epx.f(cVar, gdn.c.g.b)) {
                        W(jenVar2);
                        return;
                    } else {
                        if (!epx.f(cVar, gdn.c.a.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        f4zVar.b(idn.c.a);
                        return;
                    }
                }
                boolean z3 = jenVar2.d;
                boolean z4 = jenVar2.t;
                boolean i3 = jnj.i(audioBook.u);
                MusicDynamicRestriction musicDynamicRestriction = audioBook.v;
                if (!z3 && !z4 && i3) {
                    if (musicDynamicRestriction != null) {
                        f4zVar.b(new idn.m(musicDynamicRestriction));
                        return;
                    }
                    return;
                } else if (!z3 && z4) {
                    f4zVar.b(idn.n.a);
                    return;
                } else {
                    if (z3 || z4) {
                        return;
                    }
                    f4zVar.b(idn.r.a);
                    return;
                }
            }
            if (U()) {
                u2b0Var.pause(6);
                return;
            }
            List<AudioBookChapter> list3 = audioBook.k;
            if (list3 != null) {
                List<AudioBookChapter> list4 = list3;
                ArrayList arrayList3 = new ArrayList(c5g.u(list4, 10));
                Iterator it = list4.iterator();
                while (it.hasNext()) {
                    arrayList3.add(com.vk.dto.music.audiobook.a.d(audioBook, (AudioBookChapter) it.next()));
                }
                arrayList = arrayList3;
            } else {
                arrayList = null;
            }
            StartPlayAudioBookSource startPlayAudioBookSource = new StartPlayAudioBookSource(audioBook, null, null, 6, null);
            if (arrayList != null) {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    ?? next = it2.next();
                    AudioBookChapter audioBookChapter3 = ((MusicTrack) next).O;
                    if ((audioBookChapter3 != null ? audioBookChapter3.f : null) == AudioBooksChapterProgressStatus.IN_PROGRESS) {
                        musicTrack = next;
                        break;
                    }
                }
                musicTrack2 = musicTrack;
            }
            if (musicTrack2 != null && (audioBookChapter = musicTrack2.O) != null) {
                r11 = audioBookChapter.e * 1000;
            }
            u2b0Var.N0(new lqk0(startPlayAudioBookSource, musicTrack2, arrayList, this.k, r11, ShuffleMode.SHUFFLE_OFF, PlayRequestTrigger.FAST_PLAY_TRACK_LIST, (AdsAudioPixelsContainer) null, 0L, 784));
            return;
        }
        if (!(gdnVar2 instanceof gdn.a)) {
            if (!(gdnVar2 instanceof gdn.e)) {
                if (!(gdnVar2 instanceof gdn.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                gdn.b bVar = (gdn.b) gdnVar2;
                if (epx.f(bVar, gdn.b.C2933b.b)) {
                    f4zVar.b(idn.e.a);
                    return;
                } else {
                    if (!epx.f(bVar, gdn.b.a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    f4zVar.b(idn.b.a);
                    return;
                }
            }
            gdn.e eVar = (gdn.e) gdnVar2;
            if (eVar instanceof gdn.e.c) {
                f4zVar.b(new idn.g(((gdn.e.c) eVar).b));
                return;
            }
            if (epx.f(eVar, gdn.e.a.b)) {
                if (list2.size() > 1) {
                    hVar2 = new idn.i(list2);
                } else if (jnj.j(((AudioBookPerson) j5g.Y(list2)).g)) {
                    hVar2 = idn.o.a;
                } else {
                    AudioBookPerson audioBookPerson = (AudioBookPerson) j5g.a0(list2);
                    if (audioBookPerson == null) {
                        return;
                    } else {
                        hVar2 = new idn.h(audioBookPerson.b);
                    }
                }
                f4zVar.b(hVar2);
                return;
            }
            if (!epx.f(eVar, gdn.e.b.b)) {
                if (!epx.f(eVar, gdn.e.d.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                W(jenVar2);
                return;
            }
            if (list.size() > 1) {
                hVar = new idn.p(list);
            } else if (jnj.j(((AudioBookPerson) j5g.Y(list)).g)) {
                hVar = idn.o.a;
            } else {
                AudioBookPerson audioBookPerson2 = (AudioBookPerson) j5g.a0(list);
                if (audioBookPerson2 == null) {
                    return;
                } else {
                    hVar = new idn.h(audioBookPerson2.b);
                }
            }
            f4zVar.b(hVar);
            return;
        }
        gdn.a aVar = (gdn.a) gdnVar2;
        if (aVar instanceof gdn.a.b) {
            String str3 = ((gdn.a.b) aVar).b;
            List<AudioBookChapter> list5 = audioBook.k;
            if (list5 != null) {
                Iterator it3 = list5.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it3.next();
                        if (epx.f(((AudioBookChapter) obj).b, str3)) {
                            break;
                        }
                    }
                }
                AudioBookChapter audioBookChapter4 = (AudioBookChapter) obj;
                if (audioBookChapter4 == null) {
                    return;
                }
                MusicTrack d = com.vk.dto.music.audiobook.a.d(audioBook, audioBookChapter4);
                StartPlayAudioBookSource startPlayAudioBookSource2 = new StartPlayAudioBookSource(audioBook, null, null, 6, null);
                AudioBookFile audioBookFile = audioBookChapter4.d;
                int i4 = (audioBookFile == null || audioBookChapter4.e != audioBookFile.c) ? audioBookChapter4.e * 1000 : 0;
                List<AudioBookChapter> list6 = audioBook.k;
                if (list6 != null) {
                    List<AudioBookChapter> list7 = list6;
                    arrayList2 = new ArrayList(c5g.u(list7, 10));
                    Iterator it4 = list7.iterator();
                    while (it4.hasNext()) {
                        arrayList2.add(com.vk.dto.music.audiobook.a.d(audioBook, (AudioBookChapter) it4.next()));
                    }
                }
                u2b0Var.N0(new lqk0(startPlayAudioBookSource2, d, arrayList2, this.k, i4, ShuffleMode.SHUFFLE_OFF, (PlayRequestTrigger) null, (AdsAudioPixelsContainer) null, 0L, 912));
                return;
            }
            return;
        }
        if (!(aVar instanceof gdn.a.C2932a)) {
            throw new NoWhenBranchMatchedException();
        }
        String str4 = ((gdn.a.C2932a) aVar).b;
        List<AudioBookChapter> list8 = audioBook.k;
        int i5 = audioBook.b;
        if (list8 != null) {
            Iterator it5 = list8.iterator();
            while (true) {
                if (!it5.hasNext()) {
                    break;
                }
                ?? next2 = it5.next();
                if (epx.f(((AudioBookChapter) next2).b, str4)) {
                    audioBookChapter2 = next2;
                    break;
                }
            }
            AudioBookChapter audioBookChapter5 = audioBookChapter2;
            if (audioBookChapter5 == null) {
                return;
            }
            DownloadingState downloadingState = audioBookChapter5.j;
            if (epx.f(downloadingState, DownloadingState.NotLoaded.b)) {
                f4zVar.b(new idn.d(audioBook, audioBookChapter5));
                return;
            }
            if (epx.f(downloadingState, DownloadingState.Corrupted.b) || epx.f(downloadingState, DownloadingState.Downloaded.b)) {
                f4zVar.b(new idn.k(new AudioBookChapterBottomSheetLaunchPoint.RemoveDownload(i5, str4, AudioBookChapterBottomSheetLaunchPoint.RemoveDownload.Type.DELETE_FILE)));
            } else if (epx.f(downloadingState, DownloadingState.PendingDownload.b) || (downloadingState instanceof DownloadingState.Downloading)) {
                f4zVar.b(new idn.k(new AudioBookChapterBottomSheetLaunchPoint.RemoveDownload(i5, str4, AudioBookChapterBottomSheetLaunchPoint.RemoveDownload.Type.CANCEL_DOWNLOAD)));
            } else if (!epx.f(downloadingState, DownloadingState.PartlyDownloaded.b)) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public final boolean U() {
        AudioBook audioBook;
        u2b0 u2b0Var = this.h;
        if (!u2b0Var.m0().h()) {
            return false;
        }
        StartPlaySource j = u2b0Var.j();
        StartPlayAudioBookSource startPlayAudioBookSource = j instanceof StartPlayAudioBookSource ? (StartPlayAudioBookSource) j : null;
        return (startPlayAudioBookSource == null || (audioBook = startPlayAudioBookSource.c) == null || audioBook.b != this.f) ? false : true;
    }

    public final void V(boolean z) {
        mzp0 mzp0Var = this.l;
        if (mzp0Var != null) {
            mzp0Var.a();
        }
        this.n.b(new io.reactivex.rxjava3.internal.operators.single.n(new io.reactivex.rxjava3.internal.operators.single.j(this.g.b(this.f, this.k).q(io.reactivex.rxjava3.schedulers.a.b()).m(yiz.f(com.vk.mvi.core.internal.executors.a.a)), new psb(this, 3)), new bg1(new f58(z, this, 3), 23)).subscribe(new defpackage.d(new ire(this, 14), 23), new hv(new kdn(this, 0), 18)));
    }

    public final void W(jen jenVar) {
        this.m.b(new idn.l(new r1m(jenVar.k, SpannedString.valueOf(this.j.m(jenVar.c.d)), jenVar.v, jenVar.u, jenVar.q, jenVar.w)));
    }

    public final void X(int i, boolean z) {
        AudioBook audioBook;
        StartPlaySource j = this.h.j();
        StartPlayAudioBookSource startPlayAudioBookSource = j instanceof StartPlayAudioBookSource ? (StartPlayAudioBookSource) j : null;
        if (startPlayAudioBookSource == null || (audioBook = startPlayAudioBookSource.c) == null || audioBook.b != i) {
            return;
        }
        startPlayAudioBookSource.f = Boolean.valueOf(z);
    }

    @Override // xsna.wk50, xsna.g4z
    public final void onDestroy() {
        super.onDestroy();
        this.h.n0(this.q);
    }
}
