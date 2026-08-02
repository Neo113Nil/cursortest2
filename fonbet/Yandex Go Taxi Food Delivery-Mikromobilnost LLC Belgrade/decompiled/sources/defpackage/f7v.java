package defpackage;

import com.yandex.go.safety.center.lost_item.data.Image$ImageType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class f7v implements m7v {
    public final int a;
    public final Image$ImageType b;

    public f7v(int i, Image$ImageType image$ImageType) {
        this.a = i;
        this.b = image$ImageType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f7v)) {
            return false;
        }
        f7v f7vVar = (f7v) obj;
        return this.a == f7vVar.a && this.b == f7vVar.b;
    }

    @Override // defpackage.m7v
    public final Image$ImageType getType() {
        return this.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Local(resId=" + this.a + ", type=" + this.b + Extension.C_BRAKE;
    }
}
