package xsna;

import com.vk.libvideo.design.view.videotexture.VideoTextureView;
import kotlin.LazyThreadSafetyMode;
import xsna.dai;

/* compiled from: PlayerWithAdControlsViewState.kt */
/* loaded from: classes16.dex */
public final class q5b0 {
    public final b a;
    public final a b;

    /* compiled from: PlayerWithAdControlsViewState.kt */
    public static final class a {
        public final je0 a;
        public final com.vk.libvideo.api.ad.a b;
        public final kzr0 c;
        public final boolean d;
        public final Object e = msy.a(LazyThreadSafetyMode.NONE, new te0(12));

        public a(je0 je0Var, com.vk.libvideo.api.ad.a aVar, kzr0 kzr0Var, boolean z) {
            this.a = je0Var;
            this.b = aVar;
            this.c = kzr0Var;
            this.d = z;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final dai.d<zhf0> a() {
            return (dai.d) this.e.getValue();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && this.d == aVar.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Ad(adController=");
            sb.append(this.a);
            sb.append(", adData=");
            sb.append(this.b);
            sb.append(", videoAdLayoutConfig=");
            sb.append(this.c);
            sb.append(", showPostViewState=");
            return defpackage.q0.a(sb, this.d, ')');
        }
    }

    /* compiled from: PlayerWithAdControlsViewState.kt */
    public static final class b {
        public final yg5 a;
        public final float b;
        public final Object c;
        public final Object d;

        public b(yg5 yg5Var, float f) {
            this.a = yg5Var;
            this.b = f;
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
            this.c = msy.a(lazyThreadSafetyMode, new te0(12));
            this.d = at.c(lazyThreadSafetyMode);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final dai.d<VideoTextureView> a() {
            return (dai.d) this.c.getValue();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final dai.c b() {
            return (dai.c) this.d.getValue();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && Float.compare(this.b, bVar.b) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Player(autoPlay=");
            sb.append(this.a);
            sb.append(", aspectRatio=");
            return xq.c(')', this.b, sb);
        }
    }

    public q5b0(b bVar, a aVar) {
        this.a = bVar;
        this.b = aVar;
    }

    public final a a() {
        return this.b;
    }

    public final b b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q5b0)) {
            return false;
        }
        q5b0 q5b0Var = (q5b0) obj;
        return epx.f(this.a, q5b0Var.a) && epx.f(this.b, q5b0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        a aVar = this.b;
        return hashCode + (aVar == null ? 0 : aVar.hashCode());
    }

    public final String toString() {
        return "PlayerWithAdControlsViewState(player=" + this.a + ", ad=" + this.b + ')';
    }
}
