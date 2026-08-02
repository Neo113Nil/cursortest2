package xsna;

import com.vk.dto.common.DownloadingState;
import com.vk.dto.music.MusicTrack;
import java.util.List;
import xsna.lc50;

/* compiled from: MusicTrackMenuViewState.kt */
/* loaded from: classes3.dex */
public final class jd50 implements ao50 {
    public final fi50 a;
    public final fi50 b;

    /* compiled from: MusicTrackMenuViewState.kt */
    public static final class a implements fm50<id50> {
        public final yzt0<b> a;
        public final yzt0<MusicTrack> b;
        public final yzt0<C3117a> c;
        public final yzt0<List<lc50.c>> d;

        /* compiled from: MusicTrackMenuViewState.kt */
        /* renamed from: xsna.jd50$a$a, reason: collision with other inner class name */
        public static final class C3117a {
            public final DownloadingState a;
            public final List<lc50.b> b;

            /* JADX WARN: Multi-variable type inference failed */
            public C3117a(DownloadingState downloadingState, List<? extends lc50.b> list) {
                this.a = downloadingState;
                this.b = list;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3117a)) {
                    return false;
                }
                C3117a c3117a = (C3117a) obj;
                return epx.f(this.a, c3117a.a) && epx.f(this.b, c3117a.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("MenuHeaderActions(downloadingState=");
                sb.append(this.a);
                sb.append(", actions=");
                return ms9.a(')', sb, this.b);
            }
        }

        /* compiled from: MusicTrackMenuViewState.kt */
        public static final class b {
            public final Long a;

            public b(Long l) {
                this.a = l;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
            }

            public final int hashCode() {
                Long l = this.a;
                if (l == null) {
                    return 0;
                }
                return l.hashCode();
            }

            public final String toString() {
                return iq.b(new StringBuilder("RemainingTime(remainingTimeMs="), this.a, ')');
            }
        }

        public a(h0u0 h0u0Var, h0u0 h0u0Var2, h0u0 h0u0Var3, h0u0 h0u0Var4) {
            this.a = h0u0Var;
            this.b = h0u0Var2;
            this.c = h0u0Var3;
            this.d = h0u0Var4;
        }
    }

    /* compiled from: MusicTrackMenuViewState.kt */
    public static final class b implements fm50<id50> {
        public final yzt0<a.b> a;
        public final yzt0<MusicTrack> b;
        public final yzt0<List<lc50.c>> c;

        public b(h0u0 h0u0Var, h0u0 h0u0Var2, h0u0 h0u0Var3) {
            this.a = h0u0Var;
            this.b = h0u0Var2;
            this.c = h0u0Var3;
        }
    }

    public jd50(fi50 fi50Var, fi50 fi50Var2) {
        this.a = fi50Var;
        this.b = fi50Var2;
    }
}
