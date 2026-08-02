package defpackage;

import java.io.FilterInputStream;
import java.io.IOException;
import java.util.Enumeration;
import ru.domesticroots.bouncycastle.asn1.ASN1ParsingException;

/* loaded from: classes4.dex */
public final class o3y implements Enumeration {
    public final /* synthetic */ int a;
    public FilterInputStream b;
    public Object c;

    public /* synthetic */ o3y(int i) {
        this.a = i;
    }

    public a3 a() {
        try {
            return ((i2) this.b).k();
        } catch (IOException e) {
            throw new ASN1ParsingException("malformed ASN.1: " + e, e);
        }
    }

    public b3 b() {
        try {
            return ((j2) this.b).n();
        } catch (IOException e) {
            throw new org.bouncycastle.asn1.ASN1ParsingException("malformed ASN.1: " + e, e);
        }
    }

    @Override // java.util.Enumeration
    public final boolean hasMoreElements() {
        switch (this.a) {
            case 0:
                if (((a3) this.c) != null) {
                }
                break;
            default:
                if (((b3) this.c) != null) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Enumeration
    public final Object nextElement() {
        switch (this.a) {
            case 0:
                a3 a3Var = (a3) this.c;
                if (a3Var == null) {
                    ny61.p();
                    break;
                } else {
                    this.c = a();
                    break;
                }
            default:
                b3 b3Var = (b3) this.c;
                if (b3Var == null) {
                    ny61.p();
                    break;
                } else {
                    this.c = b();
                    break;
                }
        }
        return null;
    }
}
