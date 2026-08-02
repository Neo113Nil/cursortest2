package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.asn1.ASN1ParsingException;

/* loaded from: classes4.dex */
public final class dd4 implements u1 {
    public final o3 a;
    public t8e b;

    public dd4(o3 o3Var) {
        this.a = o3Var;
    }

    public static bd4 c(o3 o3Var) {
        t8e t8eVar = new t8e(1, o3Var);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[4096];
        while (true) {
            int read = t8eVar.read(bArr, 0, 4096);
            if (read < 0) {
                return new bd4(byteArrayOutputStream.toByteArray(), t8eVar.c);
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    @Override // defpackage.mlv
    public final b3 a() {
        return c(this.a);
    }

    @Override // defpackage.u1
    public final InputStream b() {
        t8e t8eVar = new t8e(1, this.a);
        this.b = t8eVar;
        return t8eVar;
    }

    @Override // defpackage.u1
    public final int e() {
        return this.b.c;
    }

    @Override // defpackage.a2
    public final b3 toASN1Primitive() {
        try {
            return c(this.a);
        } catch (IOException e) {
            throw new ASN1ParsingException(x4e.d(e, new StringBuilder("IOException converting stream to byte array: ")), e);
        }
    }
}
