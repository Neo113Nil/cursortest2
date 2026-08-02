package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.music.audiobook.AudioBookChapter;
import com.vk.music.offline.api.domain.download.DownloadType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.collections.EmptyList;
import xsna.k840;
import xsna.lt70;

/* compiled from: MusicDownloadDataController.kt */
/* loaded from: classes.dex */
public final class sg40 implements t9v, vd50 {
    public final wh40 a;
    public final up40 b;
    public final k850 c;
    public final oc40 d;
    public final kgp0 e;
    public final rbb0 f;
    public final ilb g;
    public final qh4 h;
    public final whb0 i;
    public final ctp j;
    public final df5 k;
    public final u750 l;
    public final xb50 m;
    public final ExecutorService n;
    public final bpn0 o;
    public final bpn0 p;
    public final bpn0 q;
    public final bpn0 r;

    /* compiled from: MusicDownloadDataController.kt */
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DownloadType.values().length];
            try {
                iArr[DownloadType.MUSIC_TRACK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DownloadType.AUDIO_BOOK_CHAPTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DownloadType.PODCAST_EPISODE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public sg40(wh40 wh40Var, vp40 vp40Var, k850 k850Var, oc40 oc40Var, kgp0 kgp0Var, rbb0 rbb0Var, ilb ilbVar, qh4 qh4Var, whb0 whb0Var, ctp ctpVar, df5 df5Var) {
        ExecutorService b;
        this.a = wh40Var;
        this.b = vp40Var;
        this.c = k850Var;
        this.d = oc40Var;
        this.e = kgp0Var;
        this.f = rbb0Var;
        this.g = ilbVar;
        this.h = qh4Var;
        this.i = whb0Var;
        this.j = ctpVar;
        this.k = df5Var;
        s750 s750Var = k840.a.e;
        this.l = s750Var == null ? null : s750Var;
        this.m = new xb50();
        b = asu0.a.b((r5 & 2) != 0 ? 1 : 5, (r5 & 4) != 0 ? 0L : 1000L, "vk-offline-music-cache-thread");
        this.n = b;
        this.o = new bpn0(new y45(6));
        this.p = new bpn0(new ag6(this, 6));
        this.q = new bpn0(new bg6(this, 6));
        this.r = new bpn0(new yp6(8));
        wh40Var.h0(this);
    }

    @Override // xsna.vd50
    public final void O(boolean z, UserId userId, MusicTrack musicTrack, oya0 oya0Var) {
        if (!z) {
            new lt70.e(musicTrack, k840.a.i.b()).q();
        } else {
            asu0.a.getClass();
            asu0.n().execute(new z1r(musicTrack, this, oya0Var, 2));
        }
    }

    public final void a(Playlist playlist) {
        List<MusicTrack> f0 = this.a.f0(playlist);
        String Ib = playlist.b == -1 ? null : playlist.Ib();
        if (f0 != null) {
            this.n.execute(new z3l(this, o25.a().c(), f0, Ib, 1));
        }
    }

    @Override // xsna.t9v
    public final void b(String str, String str2, String str3) {
        this.n.execute(new fv8(str, this, str2, str3, 2));
    }

    @Override // xsna.t9v
    public final void c(String str, float f, long j) {
        this.a.W(f, str);
    }

    public final ArrayList d(UserId userId, List list) {
        if (list == null) {
            list = EmptyList.b;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AudioBookChapter d = this.g.d(userId, ((AudioBookChapter) it.next()).getId());
            if (d != null) {
                this.a.e0(d);
            }
            if (d != null) {
                arrayList.add(d);
            }
        }
        return arrayList;
    }

    public final ArrayList e(UserId userId, UserId userId2) {
        List<MusicTrack> g = this.i.g(userId, userId2);
        if (g == null) {
            g = EmptyList.b;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = g.iterator();
        while (it.hasNext()) {
            MusicTrack z = this.j.z(userId, ((MusicTrack) it.next()).Fb());
            if (z != null) {
                this.a.O(z);
            }
            if (z != null) {
                arrayList.add(z);
            }
        }
        return arrayList;
    }

    @Override // xsna.vd50
    public final void y(String str, boolean z) {
        new lt70.c(str, k840.a.i.b(), this.a.P(), z).q();
    }
}
