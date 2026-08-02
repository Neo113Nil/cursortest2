package defpackage;

import com.yandex.go.safety.center.lost_item.data.Image$ImageType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class h7v implements m7v {
    public final String a;
    public final Image$ImageType b;

    public h7v(String str, Image$ImageType image$ImageType) {
        this.a = str;
        this.b = image$ImageType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h7v)) {
            return false;
        }
        h7v h7vVar = (h7v) obj;
        return jl40.l(this.a, h7vVar.a) && this.b == h7vVar.b;
    }

    @Override // defpackage.m7v
    public final Image$ImageType getType() {
        return this.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Remote(tag=" + this.a + ", type=" + this.b + Extension.C_BRAKE;
    }
}
