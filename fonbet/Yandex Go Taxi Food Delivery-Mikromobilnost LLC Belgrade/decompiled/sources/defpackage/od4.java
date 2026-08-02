package defpackage;

import java.io.IOException;
import ru.domesticroots.bouncycastle.asn1.ASN1Exception;
import ru.domesticroots.bouncycastle.asn1.ASN1ParsingException;

/* loaded from: classes4.dex */
public final class od4 implements z1, llv {
    public final /* synthetic */ int a;
    public o3 b;

    public od4(o3 o3Var) {
        this.a = 2;
        this.b = o3Var;
    }

    public static md4 c(o3 o3Var) {
        return new md4(o3Var.H());
    }

    public static qd4 f(o3 o3Var) {
        return new qd4(o3Var.H());
    }

    public static npf g(o3 o3Var) {
        try {
            return new npf(svf.a(o3Var.H()), 1);
        } catch (IllegalArgumentException e) {
            throw new ASN1Exception(e.getMessage(), e);
        }
    }

    @Override // defpackage.llv
    public final a3 a() {
        switch (this.a) {
            case 0:
                return new md4(this.b.H());
            case 1:
                return f(this.b);
            case 2:
                return g(this.b);
            case 3:
                return svf.a(this.b.H());
            default:
                return svf.b(this.b.H());
        }
    }

    @Override // defpackage.z1
    public final a3 toASN1Primitive() {
        switch (this.a) {
            case 0:
                try {
                    return new md4(this.b.H());
                } catch (IOException e) {
                    ny61.r(e.getMessage());
                    return null;
                }
            case 1:
                try {
                    return f(this.b);
                } catch (IOException e2) {
                    throw new ASN1ParsingException(e2.getMessage(), e2);
                }
            case 2:
                try {
                    return g(this.b);
                } catch (IOException e3) {
                    throw new ASN1ParsingException("unable to get DER object", e3);
                } catch (IllegalArgumentException e4) {
                    throw new ASN1ParsingException("unable to get DER object", e4);
                }
            case 3:
                try {
                    return a();
                } catch (IOException e5) {
                    ny61.r(e5.getMessage());
                    return null;
                }
            default:
                try {
                    return a();
                } catch (IOException e6) {
                    throw new ASN1ParsingException(e6.getMessage(), e6);
                }
        }
    }

    public /* synthetic */ od4(int i) {
        this.a = i;
    }
}
