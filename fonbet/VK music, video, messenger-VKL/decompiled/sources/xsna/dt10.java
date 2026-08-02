package xsna;

import com.vk.community.design.compose.components.channel.MediaType;

/* compiled from: MediaParams.kt */
/* loaded from: classes17.dex */
public final class dt10 {
    public static final dt10 c = new dt10(null, MediaType.UNKNOWN);
    public final String a;
    public final MediaType b;

    public dt10(String str, MediaType mediaType) {
        this.a = str;
        this.b = mediaType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dt10)) {
            return false;
        }
        dt10 dt10Var = (dt10) obj;
        return epx.f(this.a, dt10Var.a) && this.b == dt10Var.b;
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "MediaParams(urlPreview=" + this.a + ", mediaType=" + this.b + ')';
    }
}
