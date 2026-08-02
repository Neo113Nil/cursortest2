package defpackage;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1ParsingException;

/* loaded from: classes4.dex */
public final class awf implements n3 {
    public o3 a;

    @Override // defpackage.mlv
    public final b3 a() {
        c2 I = this.a.I();
        xvf xvfVar = tvf.a;
        return I.b < 1 ? tvf.b : new zvf(I);
    }

    @Override // defpackage.n3
    public final a2 readObject() {
        return this.a.G();
    }

    @Override // defpackage.a2
    public final b3 toASN1Primitive() {
        try {
            return a();
        } catch (IOException e) {
            throw new ASN1ParsingException(e.getMessage(), e);
        }
    }
}
