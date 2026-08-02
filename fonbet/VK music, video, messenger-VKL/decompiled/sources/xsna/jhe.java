package xsna;

import com.vk.dto.common.Image;

/* compiled from: ClipsInterestsPatch.kt */
/* loaded from: classes16.dex */
public final class jhe implements com.vk.clips.interests.impl.feature.b {
    public final Image b;

    public jhe(Image image) {
        this.b = image;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jhe) && epx.f(this.b, ((jhe) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return er.d(new StringBuilder("AvatarSuccess(avatar="), this.b, ')');
    }
}
