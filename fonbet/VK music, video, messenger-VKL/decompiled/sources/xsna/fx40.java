package xsna;

import com.vk.music.player.cache.a;
import xsna.bx1;
import xsna.fiq;
import xsna.rtk0;

/* compiled from: MusicPlayerHelperConfig.kt */
/* loaded from: classes3.dex */
public interface fx40 {

    /* compiled from: MusicPlayerHelperConfig.kt */
    public static final class a implements fx40 {
        public final long a;
        public final boolean b;
        public final bx1 c;
        public final fiq d;
        public final rtk0 e;
        public final com.vk.music.player.cache.a f;
        public final boolean g;

        public a() {
            this(null, null, null, null, 127);
        }

        @Override // xsna.fx40
        public final bx1 a() {
            return this.c;
        }

        @Override // xsna.fx40
        public final boolean b() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e) && epx.f(this.f, aVar.f) && this.g == aVar.g;
        }

        public final int hashCode() {
            int hashCode = (this.c.hashCode() + qoy.b(Long.hashCode(this.a) * 31, 31, this.b)) * 31;
            fiq fiqVar = this.d;
            return Boolean.hashCode(this.g) + ((this.f.hashCode() + ((this.e.hashCode() + ((hashCode + (fiqVar == null ? 0 : fiqVar.hashCode())) * 31)) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Default(progressThrottleMs=");
            sb.append(this.a);
            sb.append(", useOffline=");
            sb.append(this.b);
            sb.append(", analyticsConfig=");
            sb.append(this.c);
            sb.append(", fadeAudioEffectConfig=");
            sb.append(this.d);
            sb.append(", stateEmissionConfig=");
            sb.append(this.e);
            sb.append(", prefetchConfig=");
            sb.append(this.f);
            sb.append(", reusePlayer=");
            return defpackage.q0.a(sb, this.g, ')');
        }

        public a(bx1.a aVar, fiq.a aVar2, rtk0.a aVar3, com.vk.music.player.cache.a aVar4, int i) {
            boolean z = (i & 2) == 0;
            aVar = (i & 4) != 0 ? new bx1.a(7) : aVar;
            aVar2 = (i & 8) != 0 ? null : aVar2;
            aVar3 = (i & 16) != 0 ? new rtk0.a(false) : aVar3;
            aVar4 = (i & 32) != 0 ? a.b.a : aVar4;
            boolean z2 = (i & 64) != 0;
            this.a = 50L;
            this.b = z;
            this.c = aVar;
            this.d = aVar2;
            this.e = aVar3;
            this.f = aVar4;
            this.g = z2;
        }
    }

    bx1 a();

    boolean b();
}
