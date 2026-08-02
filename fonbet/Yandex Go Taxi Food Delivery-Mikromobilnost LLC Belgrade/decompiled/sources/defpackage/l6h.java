package defpackage;

import com.yandex.quark.audio.ContentType;
import com.yandex.quark.audio.UsageType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class l6h {
    public final UsageType a;
    public final ContentType b;
    public final xfo c;

    public l6h(int i) {
        UsageType usageType = UsageType.MEDIA;
        ContentType contentType = ContentType.SPEECH;
        xfo xfoVar = new xfo(20);
        this.a = usageType;
        this.b = contentType;
        this.c = xfoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l6h)) {
            return false;
        }
        l6h l6hVar = (l6h) obj;
        return this.a == l6hVar.a && this.b == l6hVar.b && jl40.l(this.c, l6hVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "DefaultAudioSinkArgs(usageType=" + this.a + ", contentType=" + this.b + ", audioSinkInterceptor=" + this.c + Extension.C_BRAKE;
    }

    public l6h() {
        this(0);
    }
}
