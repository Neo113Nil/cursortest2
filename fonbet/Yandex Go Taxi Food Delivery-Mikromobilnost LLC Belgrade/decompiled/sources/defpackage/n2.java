package defpackage;

import java.io.ByteArrayOutputStream;

/* loaded from: classes9.dex */
public abstract class n2 implements z1 {
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof z1) {
            return toASN1Primitive().l(((z1) obj).toASN1Primitive());
        }
        return false;
    }

    public final byte[] g() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        a3 aSN1Primitive = toASN1Primitive();
        aSN1Primitive.getClass();
        g191.G(byteArrayOutputStream).d0(aSN1Primitive);
        return byteArrayOutputStream.toByteArray();
    }

    public int hashCode() {
        return toASN1Primitive().hashCode();
    }
}
