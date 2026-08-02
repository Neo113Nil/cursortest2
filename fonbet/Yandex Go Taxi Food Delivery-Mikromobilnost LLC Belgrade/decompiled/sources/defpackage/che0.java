package defpackage;

import android.graphics.Bitmap;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class che0 {
    public final Bitmap a;
    public final long b;
    public che0 c = null;

    public che0(long j, Bitmap bitmap) {
        this.a = bitmap;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof che0)) {
            return false;
        }
        che0 che0Var = (che0) obj;
        return jl40.l(this.a, che0Var.a) && this.b == che0Var.b && jl40.l(this.c, che0Var.c);
    }

    public final int hashCode() {
        Bitmap bitmap = this.a;
        int c = qv10.c((bitmap == null ? 0 : bitmap.hashCode()) * 31, 31, this.b);
        che0 che0Var = this.c;
        return c + (che0Var != null ? che0Var.hashCode() : 0);
    }

    public final String toString() {
        long j = this.b;
        return "FrameData(bitmap=" + this.a + ", delay=" + ((j / 60000) / 60 > 0 ? vqc.c(j, "HH:mm:ss") : vqc.c(j, "mm:ss")) + ", nextFrame=" + this.c + Extension.C_BRAKE;
    }
}
