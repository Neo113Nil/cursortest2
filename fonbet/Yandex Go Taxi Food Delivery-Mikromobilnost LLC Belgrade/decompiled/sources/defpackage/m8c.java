package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class m8c implements g2c0 {
    public final int a;
    public final int b;

    public m8c(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m8c)) {
            return false;
        }
        m8c m8cVar = (m8c) obj;
        return this.a == m8cVar.a && this.b == m8cVar.b;
    }

    @Override // defpackage.g2c0
    public final int getHeight() {
        return this.b;
    }

    @Override // defpackage.g2c0
    public final int getWidth() {
        return this.a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return b64.d(this.a, this.b, "ClusteringFrameMapWindow(width=", ", height=", Extension.C_BRAKE);
    }
}
