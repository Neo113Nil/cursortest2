package xsna;

import com.vk.video.ui.upload.impl.attachedclips.presentation.compose.clip.ClipSubtitleViewState;

/* compiled from: ClipViewState.kt */
/* loaded from: classes7.dex */
public final class kfd {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final ClipSubtitleViewState f;

    public kfd(String str, String str2, String str3, boolean z, boolean z2, ClipSubtitleViewState clipSubtitleViewState) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = z2;
        this.f = clipSubtitleViewState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kfd)) {
            return false;
        }
        kfd kfdVar = (kfd) obj;
        return epx.f(this.a, kfdVar.a) && epx.f(this.b, kfdVar.b) && epx.f(this.c, kfdVar.c) && this.d == kfdVar.d && this.e == kfdVar.e && this.f == kfdVar.f;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int b = qoy.b(qoy.b(urd0.a((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d), 31, this.e);
        ClipSubtitleViewState clipSubtitleViewState = this.f;
        return b + (clipSubtitleViewState != null ? clipSubtitleViewState.hashCode() : 0);
    }

    public final String toString() {
        return "ClipViewState(videoId=" + this.a + ", coverUrl=" + this.b + ", contentDescription=" + this.c + ", isSelected=" + this.d + ", isClipsSelectEnabled=" + this.e + ", subtitle=" + this.f + ')';
    }
}
