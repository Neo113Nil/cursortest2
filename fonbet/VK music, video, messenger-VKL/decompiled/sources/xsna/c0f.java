package xsna;

import com.vk.dto.common.ClipVideoFile;

/* compiled from: ClipsPublishViewerOverlayViewState.kt */
/* loaded from: classes17.dex */
public final class c0f implements ao50 {
    public final fi50 a;

    /* compiled from: ClipsPublishViewerOverlayViewState.kt */
    public static final class a implements fm50<zze> {
        public final yzt0<Long> a;
        public final yzt0<Boolean> b;
        public final yzt0<qow<ClipVideoFile>> c;
        public final yzt0<Float> d;
        public final yzt0<nwa0> e;
        public final yzt0<e3b0> f;
        public final yzt0<Boolean> g;

        public a(h0u0 h0u0Var, h0u0 h0u0Var2, h0u0 h0u0Var3, h0u0 h0u0Var4, h0u0 h0u0Var5, h0u0 h0u0Var6, h0u0 h0u0Var7) {
            this.a = h0u0Var;
            this.b = h0u0Var2;
            this.c = h0u0Var3;
            this.d = h0u0Var4;
            this.e = h0u0Var5;
            this.f = h0u0Var6;
            this.g = h0u0Var7;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e) && epx.f(this.f, aVar.f) && epx.f(this.g, aVar.g);
        }

        public final int hashCode() {
            return this.g.hashCode() + sr.a(this.f, sr.a(this.e, sr.a(this.d, sr.a(this.c, sr.a(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Content(timestamp=");
            sb.append(this.a);
            sb.append(", isPlaying=");
            sb.append(this.b);
            sb.append(", clipVideoFile=");
            sb.append(this.c);
            sb.append(", progress=");
            sb.append(this.d);
            sb.append(", playbackProgress=");
            sb.append(this.e);
            sb.append(", playerRelatedData=");
            sb.append(this.f);
            sb.append(", isDraftEnabled=");
            return tr.c(sb, this.g, ')');
        }
    }

    /* compiled from: ClipsPublishViewerOverlayViewState.kt */
    public static final class b implements fm50<zze> {
        public final boolean a;

        public b(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a == ((b) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("Init(isDraftEnabled="), this.a, ')');
        }
    }

    public c0f(fi50 fi50Var) {
        this.a = fi50Var;
    }
}
