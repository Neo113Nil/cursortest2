package defpackage;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1Exception;
import org.bouncycastle.asn1.ASN1ParsingException;

/* loaded from: classes4.dex */
public final class ppf implements a2, mlv {
    public final o3 a;

    public ppf(o3 o3Var) {
        this.a = o3Var;
    }

    public static opf c(o3 o3Var) {
        try {
            return new opf(new xvf(o3Var.I()), 1);
        } catch (IllegalArgumentException e) {
            throw new ASN1Exception(e, e.getMessage());
        }
    }

    @Override // defpackage.mlv
    public final b3 a() {
        return c(this.a);
    }

    @Override // defpackage.a2
    public final b3 toASN1Primitive() {
        try {
            return c(this.a);
        } catch (IOException e) {
            throw new ASN1ParsingException("unable to get DER object", e);
        } catch (IllegalArgumentException e2) {
            throw new ASN1ParsingException("unable to get DER object", e2);
        }
    }
}
