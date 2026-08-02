package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.asn1.ASN1ParsingException;

/* loaded from: classes4.dex */
public final class ld4 implements y2 {
    public final /* synthetic */ int a = 1;
    public Object b;

    public ld4(o3 o3Var) {
        this.b = o3Var;
    }

    @Override // defpackage.mlv
    public final b3 a() {
        switch (this.a) {
            case 0:
                u8e u8eVar = new u8e(1, (o3) this.b);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[4096];
                while (true) {
                    int read = u8eVar.read(bArr, 0, 4096);
                    if (read < 0) {
                        return new hd4(byteArrayOutputStream.toByteArray(), null);
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
            default:
                return new dqf(((cph) this.b).c());
        }
    }

    @Override // defpackage.y2
    public final InputStream d() {
        switch (this.a) {
            case 0:
                return new u8e(1, (o3) this.b);
            default:
                return (cph) this.b;
        }
    }

    @Override // defpackage.a2
    public final b3 toASN1Primitive() {
        switch (this.a) {
            case 0:
                try {
                    u8e u8eVar = new u8e(1, (o3) this.b);
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int read = u8eVar.read(bArr, 0, 4096);
                        if (read < 0) {
                            return new hd4(byteArrayOutputStream.toByteArray(), null);
                        }
                        byteArrayOutputStream.write(bArr, 0, read);
                    }
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

    public /* synthetic */ ld4() {
    }
}
