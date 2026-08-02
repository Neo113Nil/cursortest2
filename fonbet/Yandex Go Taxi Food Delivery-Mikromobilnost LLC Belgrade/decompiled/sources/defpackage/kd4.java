package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import ru.domesticroots.bouncycastle.asn1.ASN1ParsingException;

/* loaded from: classes4.dex */
public final class kd4 implements x2 {
    public final /* synthetic */ int a = 1;
    public Object b;

    public kd4(o3 o3Var) {
        this.b = o3Var;
    }

    public static gd4 c(o3 o3Var) {
        u8e u8eVar = new u8e(0, o3Var);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[4096];
        while (true) {
            int read = u8eVar.read(bArr, 0, 4096);
            if (read < 0) {
                return new gd4(byteArrayOutputStream.toByteArray(), null);
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    @Override // defpackage.llv
    public final a3 a() {
        switch (this.a) {
            case 0:
                return c((o3) this.b);
            default:
                return new cqf(((bph) this.b).c());
        }
    }

    @Override // defpackage.x2
    public final InputStream d() {
        switch (this.a) {
            case 0:
                return new u8e(0, (o3) this.b);
            default:
                return (bph) this.b;
        }
    }

    @Override // defpackage.z1
    public final a3 toASN1Primitive() {
        switch (this.a) {
            case 0:
                try {
                    return c((o3) this.b);
                } catch (IOException e) {
                    throw new ASN1ParsingException(x4e.d(e, new StringBuilder("IOException converting stream to byte array: ")), e);
                }
            default:
                try {
                    return a();
                } catch (IOException e2) {
                    throw new ASN1ParsingException(x4e.d(e2, new StringBuilder("IOException converting stream to byte array: ")), e2);
                }
        }
    }

    public /* synthetic */ kd4() {
    }
}
