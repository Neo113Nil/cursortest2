package defpackage;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import ru.CryptoPro.AdES.exception.IAdESException;
import ru.CryptoPro.AdES.external.decode.AdESBESAttributeDecoder;
import ru.CryptoPro.CAdES.exception.CAdESException;
import ru.CryptoPro.CAdES.tools.CAdESUtility;
import ru.CryptoPro.JCP.tools.JCPLogger;

/* loaded from: classes4.dex */
public class gv61 extends erd0 implements AdESBESAttributeDecoder {
    public Date x;

    public gv61(acs0 acs0Var) {
        super(acs0Var);
        this.x = null;
    }

    public static cr80 g(a2 a2Var, int i) {
        nr80 nr80Var;
        JCPLogger.fine("Extracting certificate reference...");
        if (i == 0) {
            JCPLogger.fine("Extract certificate reference by using current standard V2.");
            i3 i3Var = ecs0.m(a2Var).a;
            san[] sanVarArr = new san[i3Var.size()];
            for (int i2 = 0; i2 != i3Var.size(); i2++) {
                sanVarArr[i2] = san.m(i3Var.A(i2));
            }
            san sanVar = sanVarArr[0];
            return new cr80(sanVar.a, rza1.b(sanVar.b), sanVarArr[0].c);
        }
        if (i == 1) {
            JCPLogger.fine("Extract certificate reference by using current standard.");
            i3 i3Var2 = dcs0.m(a2Var).a;
            ran[] ranVarArr = new ran[i3Var2.size()];
            for (int i3 = 0; i3 != i3Var2.size(); i3++) {
                ranVarArr[i3] = ran.m(i3Var2.A(i3));
            }
            xr1 xr1Var = new xr1(zo60.e);
            ran ranVar = ranVarArr[0];
            return new cr80(xr1Var, ranVar.a.a, ranVar.b);
        }
        if (i != 2) {
            throw new CAdESException(oyr.i(i, "Unknown reference version: "), IAdESException.ecInternal);
        }
        JCPLogger.fine("Extract certificate reference by using old standard.");
        if (a2Var instanceof nr80) {
            nr80Var = (nr80) a2Var;
        } else {
            i3 z = i3.z(a2Var);
            nr80 nr80Var2 = new nr80();
            if (z.size() < 1 || z.size() > 2) {
                ny61.g(vfc.n(z, new StringBuilder("Bad sequence size: ")));
                return null;
            }
            nr80Var2.a = i3.z(z.A(0));
            if (z.size() > 1) {
                nr80Var2.b = i3.z(z.A(1));
            }
            nr80Var = nr80Var2;
        }
        i3 i3Var3 = nr80Var.a;
        cr80[] cr80VarArr = new cr80[i3Var3.size()];
        for (int i4 = 0; i4 != i3Var3.size(); i4++) {
            cr80VarArr[i4] = cr80.o(i3Var3.A(i4));
        }
        return new cr80(cr80VarArr[0].m(), cr80VarArr[0].n(), cr80VarArr[0].b);
    }

    @Override // defpackage.erd0
    public final void a() {
        cr80 g;
        vc3 c;
        JCPLogger.subEnter();
        JCPLogger.fine("Extracting signer certificate reference...");
        acs0 acs0Var = (acs0) this.b;
        a2 singleAttributeValue = CAdESUtility.getSingleAttributeValue(acs0Var.getSignedAttributes(), b490.I3);
        a2 singleAttributeValue2 = CAdESUtility.getSingleAttributeValue(acs0Var.getSignedAttributes(), b490.G3);
        a2 singleAttributeValue3 = CAdESUtility.getSingleAttributeValue(acs0Var.getSignedAttributes(), b490.Q3);
        if (singleAttributeValue != null && singleAttributeValue3 != null) {
            throw new CAdESException("Conflicting signing certificate attributes present.", IAdESException.ecParserSigningCertificateConflict);
        }
        if (singleAttributeValue != null) {
            g = g(singleAttributeValue, 0);
        } else if (singleAttributeValue2 != null) {
            g = g(singleAttributeValue2, 1);
        } else {
            if (singleAttributeValue3 == null) {
                throw new CAdESException("Signer certificate reference is not found (signing-certificate-v2, signing-certificate and other-certificate are not found)", IAdESException.ecParserSigningCertificateIsNull);
            }
            g = g(singleAttributeValue3, 2);
        }
        this.c = g;
        JCPLogger.subEnter();
        xc3 signedAttributes = acs0Var.getSignedAttributes();
        if (signedAttributes != null && (c = signedAttributes.c(b490.w3)) != null) {
            v3 v3Var = (v3) c.b.a[0];
            try {
                v3Var.getClass();
                this.x = new SimpleDateFormat("yyMMddHHmmssz", s5z.a).parse(v3Var.u());
            } catch (ParseException e) {
                JCPLogger.thrown(e);
            }
        }
        JCPLogger.subExit();
        JCPLogger.subExit();
    }

    @Override // ru.CryptoPro.AdES.external.decode.AdESBESAttributeDecoder
    public final Date getSigningTime() {
        return this.x;
    }
}
