package xsna;

import com.vk.dto.music.Thumb;

/* compiled from: PlaylistOnboardingInfo.kt */
/* loaded from: classes6.dex */
public final class wbb0 {
    public final Thumb a;
    public final String b;

    public wbb0(Thumb thumb, String str) {
        this.a = thumb;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wbb0)) {
            return false;
        }
        wbb0 wbb0Var = (wbb0) obj;
        return epx.f(this.a, wbb0Var.a) && epx.f(this.b, wbb0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaylistOnboardingInfo(thumb=");
        sb.append(this.a);
        sb.append(", title=");
        return ho8.a(sb, this.b, ')');
    }
}
