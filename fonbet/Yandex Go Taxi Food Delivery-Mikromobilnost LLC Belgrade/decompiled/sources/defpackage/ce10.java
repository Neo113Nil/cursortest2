package defpackage;

import com.yandex.go.feed_video.domain.MediaItem$StreamType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class ce10 {
    public final MediaItem$StreamType a;
    public final String b;

    public ce10(MediaItem$StreamType mediaItem$StreamType, String str) {
        this.a = mediaItem$StreamType;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ce10)) {
            return false;
        }
        ce10 ce10Var = (ce10) obj;
        return this.a == ce10Var.a && jl40.l(this.b, ce10Var.b);
    }

    public final int hashCode() {
        MediaItem$StreamType mediaItem$StreamType = this.a;
        return this.b.hashCode() + ((mediaItem$StreamType == null ? 0 : mediaItem$StreamType.hashCode()) * 31);
    }

    public final String toString() {
        return "Stream(type=" + this.a + ", stream=" + this.b + Extension.C_BRAKE;
    }
}
