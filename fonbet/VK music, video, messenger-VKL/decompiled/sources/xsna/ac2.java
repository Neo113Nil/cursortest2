package xsna;

import androidx.annotation.NonNull;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* compiled from: AndroidResourceSignature.java */
/* loaded from: classes12.dex */
public final class ac2 implements ady {
    public final int b;
    public final ady c;

    public ac2(int i, ady adyVar) {
        this.b = i;
        this.c = adyVar;
    }

    @Override // xsna.ady
    public final void b(@NonNull MessageDigest messageDigest) {
        this.c.b(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.b).array());
    }

    @Override // xsna.ady
    public final boolean equals(Object obj) {
        if (obj instanceof ac2) {
            ac2 ac2Var = (ac2) obj;
            if (this.b == ac2Var.b && this.c.equals(ac2Var.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // xsna.ady
    public final int hashCode() {
        return s2r0.h(this.b, this.c);
    }
}
