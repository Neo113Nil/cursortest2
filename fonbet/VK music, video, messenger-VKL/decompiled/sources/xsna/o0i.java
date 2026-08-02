package xsna;

import com.vk.dto.common.ClipVideoFile;

/* compiled from: CommunityScheduledClipsGridClip.kt */
/* loaded from: classes5.dex */
public final class o0i {
    public final ClipVideoFile a;
    public final Integer b;

    public o0i(ClipVideoFile clipVideoFile, Integer num) {
        this.a = clipVideoFile;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0i)) {
            return false;
        }
        o0i o0iVar = (o0i) obj;
        return epx.f(this.a, o0iVar.a) && epx.f(this.b, o0iVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommunityScheduledClipsGridClip(clipFile=");
        sb.append(this.a);
        sb.append(", indexInRow=");
        return uqi.b(sb, this.b, ')');
    }
}
