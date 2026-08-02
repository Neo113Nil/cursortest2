package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.toggle.features.MusicFeatures;

/* compiled from: RelatedAudioRepositoryImpl.kt */
/* loaded from: classes6.dex */
public final class gsf0 {
    public final uft0 a;
    public final vqs0 b;
    public final b25 c;
    public final io.reactivex.rxjava3.subjects.f<s3q0> d = new io.reactivex.rxjava3.subjects.f<>();
    public volatile a e;

    /* compiled from: RelatedAudioRepositoryImpl.kt */
    public static final class a {
        public final UserId a;
        public final int b;
        public final vrf0 c;

        public a(UserId userId, int i, vrf0 vrf0Var) {
            this.a = userId;
            this.b = i;
            this.c = vrf0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b == aVar.b && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + shy.a(this.b, Long.hashCode(this.a.b) * 31, 31);
        }

        public final String toString() {
            return "CacheEntry(ownerId=" + this.a + ", videoId=" + this.b + ", relatedAudio=" + this.c + ')';
        }
    }

    /* compiled from: RelatedAudioRepositoryImpl.kt */
    public static final class b {
    }

    public gsf0(uft0 uft0Var, vqs0 vqs0Var, b25 b25Var) {
        this.a = uft0Var;
        this.b = vqs0Var;
        this.c = b25Var;
    }

    public final boolean a() {
        if (!MusicFeatures.AUDIO_VIDEO_RELATED_TRACKS.h()) {
            return false;
        }
        this.b.getClass();
        return true;
    }

    public final void b(int i, boolean z) {
        a aVar = this.e;
        if (aVar != null) {
            if (aVar.c.a != i) {
                aVar = null;
            }
            if (aVar != null) {
                vrf0 vrf0Var = aVar.c;
                this.e = new a(aVar.a, aVar.b, new vrf0(vrf0Var.a, vrf0Var.b, vrf0Var.c, vrf0Var.d, vrf0Var.e, vrf0Var.f, z, vrf0Var.h, vrf0Var.i, vrf0Var.j));
            }
        }
    }
}
