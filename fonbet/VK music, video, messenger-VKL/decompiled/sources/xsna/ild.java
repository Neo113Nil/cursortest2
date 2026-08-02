package xsna;

import com.vk.dto.shortvideo.ClipsChallenge;

/* compiled from: ClipsChallengeModel.kt */
/* loaded from: classes17.dex */
public final class ild {
    public final ClipsChallenge a;

    public ild() {
        this(null);
    }

    public final ClipsChallenge a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ild) && epx.f(this.a, ((ild) obj).a);
    }

    public final int hashCode() {
        ClipsChallenge clipsChallenge = this.a;
        if (clipsChallenge == null) {
            return 0;
        }
        return clipsChallenge.hashCode();
    }

    public final String toString() {
        return "ClipsChallengeModel(challenge=" + this.a + ')';
    }

    public ild(ClipsChallenge clipsChallenge) {
        this.a = clipsChallenge;
    }
}
