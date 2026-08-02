package xsna;

import android.content.Context;
import com.vk.dto.music.MusicTrack;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.player.PlayState;
import com.vk.music.player.PlaybackActionMeta;
import kotlin.NoWhenBranchMatchedException;
import xsna.go4;
import xsna.u850;

/* compiled from: MusicStoriesPlayer.kt */
/* loaded from: classes3.dex */
public final class q850 implements xza0 {
    public final Context b;
    public final xv40 c;
    public final c6q d;
    public final io.reactivex.rxjava3.subjects.f<u850> e;
    public a f;
    public int g;
    public boolean h;
    public u850 i;
    public fza0 j;
    public boolean k;
    public boolean l;
    public float m;

    /* compiled from: MusicStoriesPlayer.kt */
    public static final class a {
        public final String a;
        public final int b;
        public final int c;
        public final boolean d;
        public final boolean e;
        public final MusicTrack f;

        public a(String str, int i, int i2, boolean z, boolean z2, MusicTrack musicTrack) {
            this.a = str;
            this.b = i;
            this.c = i2;
            this.d = z;
            this.e = z2;
            this.f = musicTrack;
        }

        public static a a(a aVar, String str, int i, int i2, boolean z, MusicTrack musicTrack, int i3) {
            if ((i3 & 1) != 0) {
                str = aVar.a;
            }
            String str2 = str;
            if ((i3 & 2) != 0) {
                i = aVar.b;
            }
            int i4 = i;
            if ((i3 & 4) != 0) {
                i2 = aVar.c;
            }
            int i5 = i2;
            boolean z2 = (i3 & 8) != 0 ? aVar.d : true;
            if ((i3 & 16) != 0) {
                z = aVar.e;
            }
            boolean z3 = z;
            if ((i3 & 32) != 0) {
                musicTrack = aVar.f;
            }
            aVar.getClass();
            return new a(str2, i4, i5, z2, z3, musicTrack);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c && this.d == aVar.d && this.e == aVar.e && epx.f(this.f, aVar.f);
        }

        public final int hashCode() {
            int b = qoy.b(qoy.b(shy.a(this.c, shy.a(this.b, this.a.hashCode() * 31, 31), 31), 31, this.d), 31, this.e);
            MusicTrack musicTrack = this.f;
            return b + (musicTrack == null ? 0 : musicTrack.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PlaybackParams(url=");
            sb.append(this.a);
            sb.append(", startFromMs=");
            sb.append(this.b);
            sb.append(", stopAtMs=");
            sb.append(this.c);
            sb.append(", isLoopEnabled=");
            sb.append(this.d);
            sb.append(", isPlayWhenReady=");
            sb.append(this.e);
            sb.append(", track=");
            return rq.c(sb, this.f, ')');
        }
    }

    /* compiled from: MusicStoriesPlayer.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PlayState.values().length];
            try {
                iArr[PlayState.IDLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PlayState.STOPPED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PlayState.PLAYING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PlayState.PAUSED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public q850(Context context) {
        xv40 xv40Var = new xv40(new go4.a(1));
        c6q c6qVar = new c6q(context);
        this.b = context;
        this.c = xv40Var;
        this.d = c6qVar;
        this.e = new io.reactivex.rxjava3.subjects.f<>();
        this.i = u850.b.a;
        this.l = true;
        this.m = 1.0f;
        s850 s850Var = new s850(this);
        r850 r850Var = new r850(this);
        c6qVar.b = s850Var;
        xv40Var.d(this);
        c63 c63Var = c63.a;
        c63.a(r850Var);
    }

    public final void G(MusicTrack musicTrack, int i, int i2) {
        String str = musicTrack.i;
        if (str == null) {
            throw new NullPointerException("Trying to play track with null url!");
        }
        int max = StrictMath.max(0, i);
        a aVar = this.f;
        c6q c6qVar = this.d;
        q(aVar != null ? a.a(aVar, str, max, i2, c6qVar.b(), musicTrack, 8) : new a(str, max, i2, false, c6qVar.b(), musicTrack));
    }

    @Override // xsna.xza0
    public final boolean M(boolean z, PlaybackActionMeta playbackActionMeta, String str) {
        return f(playbackActionMeta);
    }

    @Override // xsna.xza0
    public final boolean f(PlaybackActionMeta playbackActionMeta) {
        MusicPlaybackLaunchContext musicPlaybackLaunchContext;
        a aVar;
        boolean z = false;
        bn40.f(new Object[0]);
        if (this.h && (aVar = this.f) != null) {
            q(aVar);
            this.h = false;
            return true;
        }
        bn40.f(new Object[0]);
        this.c.c(this.b);
        c6q c6qVar = this.d;
        c6qVar.getClass();
        bn40.f(new Object[0]);
        if (c6qVar.e == PlayState.PAUSED) {
            c6qVar.h(PlayState.PLAYING);
            if (c6qVar.g) {
                c6qVar.g(true);
            } else {
                String str = c6qVar.j;
                if (str != null && (musicPlaybackLaunchContext = c6qVar.i) != null) {
                    c6qVar.d(c6qVar.k, c6qVar.l, str, musicPlaybackLaunchContext, true, true);
                }
            }
            z = true;
        }
        if (z) {
            u850.e eVar = u850.e.a;
            this.i = eVar;
            this.e.onNext(eVar);
        }
        return z;
    }

    @Override // xsna.xza0
    public final float getVolume() {
        return this.d.c();
    }

    public final u850 h() {
        int i = b.$EnumSwitchMapping$0[this.d.e.ordinal()];
        if (i == 1) {
            return u850.b.a;
        }
        if (i == 2) {
            return u850.i.a;
        }
        if (i == 3) {
            return u850.e.a;
        }
        if (i == 4) {
            return u850.d.a;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.xza0
    public final boolean j(int i, PlaybackActionMeta playbackActionMeta) {
        throw null;
    }

    @Override // xsna.xza0
    public final boolean m(String str, int i, boolean z, boolean z2) {
        bn40.f(new Object[0]);
        c6q c6qVar = this.d;
        bn40.f("mState:", c6qVar.e);
        boolean z3 = c6qVar.e == PlayState.PLAYING;
        c6qVar.o = false;
        c6qVar.g(false);
        if (z3) {
            u850.d dVar = u850.d.a;
            this.i = dVar;
            this.e.onNext(dVar);
        }
        return z3;
    }

    public final void q(a aVar) {
        this.j = new fza0();
        this.f = aVar;
        boolean z = this.k;
        c6q c6qVar = this.d;
        float c = z ? this.m : c6qVar.c();
        this.d.d(aVar.f, aVar.b, aVar.a, MusicPlaybackLaunchContext.d, aVar.e, false);
        c6qVar.i(c);
        if (aVar.e) {
            u850.e eVar = u850.e.a;
            this.i = eVar;
            this.e.onNext(eVar);
        }
    }

    @Override // xsna.xza0
    public final void setVolume(float f) {
        this.m = f;
        this.d.i(f);
    }

    @Override // xsna.xza0
    public final void stop(int i) {
        bn40.f(new Object[0]);
        this.c.a(this.b);
        this.d.k();
        if (!epx.f(this.i, u850.a.a)) {
            u850.i iVar = u850.i.a;
            boolean z = this.l;
            this.i = iVar;
            if (z) {
                this.e.onNext(iVar);
            }
        }
        this.l = true;
    }
}
