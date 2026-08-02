package xsna;

import com.vk.dto.shortvideo.ClipCameraParams;
import com.vk.dto.shortvideo.ClipGridParams;
import com.vk.dto.shortvideo.ClipsChallenge;

/* compiled from: ClipsGridChallengeEntry.kt */
/* loaded from: classes18.dex */
public final class gce implements nmv {
    public final ClipsChallenge a;
    public final ClipGridParams.Data b;
    public final ClipCameraParams c;

    public gce(ClipsChallenge clipsChallenge, ClipGridParams.Data data, ClipCameraParams clipCameraParams) {
        this.a = clipsChallenge;
        this.b = data;
        this.c = clipCameraParams;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gce)) {
            return false;
        }
        gce gceVar = (gce) obj;
        return epx.f(this.a, gceVar.a) && epx.f(this.b, gceVar.b) && epx.f(this.c, gceVar.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        ClipCameraParams clipCameraParams = this.c;
        return hashCode + (clipCameraParams == null ? 0 : clipCameraParams.hashCode());
    }

    public final String toString() {
        return "ClipsGridChallengeEntry(challenge=" + this.a + ", gridParam=" + this.b + ", cameraParams=" + this.c + ')';
    }
}
