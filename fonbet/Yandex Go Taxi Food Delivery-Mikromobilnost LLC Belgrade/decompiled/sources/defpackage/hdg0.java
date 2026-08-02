package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class hdg0 {
    public final rbv a;
    public final Text b;
    public final Text c;
    public final Text d;

    public hdg0(rbv rbvVar, Text text, Text text2, Text text3) {
        this.a = rbvVar;
        this.b = text;
        this.c = text2;
        this.d = text3;
    }

    public final Text a() {
        return this.d;
    }

    public final Text b() {
        return this.c;
    }

    public final rbv c() {
        return this.a;
    }

    public final Text d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hdg0)) {
            return false;
        }
        hdg0 hdg0Var = (hdg0) obj;
        return this.a.equals(hdg0Var.a) && this.b.equals(hdg0Var.b) && this.c.equals(hdg0Var.c) && this.d.equals(hdg0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + n.c(this.c, n.c(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "QrReaderContentCameraPermissionEntity(image=" + this.a + ", title=" + this.b + ", description=" + this.c + ", buttonText=" + this.d + Extension.C_BRAKE;
    }
}
