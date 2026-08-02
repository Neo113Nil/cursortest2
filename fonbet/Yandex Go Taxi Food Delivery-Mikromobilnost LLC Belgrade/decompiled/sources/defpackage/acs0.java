package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.SimpleTimeZone;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.cms.CMSException;
import org.bouncycastle.cms.CMSSignerDigestMismatchException;
import org.bouncycastle.cms.CMSVerifierCertificateNotValidException;
import org.bouncycastle.operator.OperatorCreationException;

/* loaded from: classes4.dex */
public class acs0 {
    public final wbs0 a;
    public final q87 b;
    public final byte[] c;
    public final u2 d;
    public final boolean e;
    public xc3 f;
    public xc3 g;
    public byte[] h;
    public final ybs0 i;
    public final xr1 j;
    public final xr1 k;
    public final m3 l;
    public final m3 m;

    public acs0(ybs0 ybs0Var, u2 u2Var, q87 q87Var, byte[] bArr) {
        wbs0 wbs0Var;
        this.i = ybs0Var;
        this.d = u2Var;
        this.e = u2Var == null;
        o2 o2Var = ybs0Var.b.a;
        boolean z = o2Var instanceof s3;
        p1 p1Var = w2.b;
        if (z) {
            wbs0Var = new wbs0(null, null, w2.x(o2Var instanceof s3 ? (w2) p1Var.Hg((s3) o2Var, false) : o2Var).a);
        } else {
            p0x m = p0x.m(o2Var instanceof s3 ? (w2) p1Var.Hg((s3) o2Var, false) : o2Var);
            wbs0Var = new wbs0(m.a, m.b.x(), null);
        }
        this.a = wbs0Var;
        this.j = ybs0Var.c;
        this.l = ybs0Var.w;
        this.m = ybs0Var.z;
        this.k = ybs0Var.x;
        this.c = ybs0Var.y.a;
        this.b = q87Var;
        this.h = bArr;
    }

    public static acs0 addCounterSigners(acs0 acs0Var, bcs0 bcs0Var) {
        ybs0 ybs0Var = acs0Var.i;
        xc3 unsignedAttributes = acs0Var.getUnsignedAttributes();
        c2 g = unsignedAttributes != null ? unsignedAttributes.g() : new c2();
        c2 c2Var = new c2();
        Iterator it = bcs0Var.a().iterator();
        while (it.hasNext()) {
            c2Var.a(((acs0) it.next()).toASN1Structure());
        }
        g.a(new vc3(j87.d, new lqf(c2Var)));
        return new acs0(new ybs0(ybs0Var.b, ybs0Var.c, ybs0Var.w, ybs0Var.x, ybs0Var.y, new lqf(g)), acs0Var.d, acs0Var.b, null);
    }

    public static acs0 replaceUnsignedAttributes(acs0 acs0Var, xc3 xc3Var) {
        ybs0 ybs0Var = acs0Var.i;
        return new acs0(new ybs0(ybs0Var.b, ybs0Var.c, ybs0Var.w, ybs0Var.x, ybs0Var.y, xc3Var != null ? new lqf(xc3Var.g()) : null), acs0Var.d, acs0Var.b, null);
    }

    public final b3 a(u2 u2Var, String str) {
        c2 d;
        int i;
        xc3 unsignedAttributes = getUnsignedAttributes();
        if (unsignedAttributes != null && unsignedAttributes.d(u2Var).b > 0) {
            throw new CMSException(oyr.p("The ", str, " attribute MUST NOT be an unsigned attribute"));
        }
        xc3 signedAttributes = getSignedAttributes();
        if (signedAttributes == null || (i = (d = signedAttributes.d(u2Var)).b) == 0) {
            return null;
        }
        if (i != 1) {
            throw new CMSException(oyr.p("The SignedAttributes in a signerInfo MUST NOT include multiple instances of the ", str, " attribute"));
        }
        a2[] a2VarArr = ((vc3) d.c(0)).b.a;
        if (a2VarArr.length == 1) {
            return a2VarArr[0].toASN1Primitive();
        }
        throw new CMSException(oyr.p("A ", str, " attribute MUST have a single attribute value"));
    }

    public byte[] getContentDigest() {
        byte[] bArr = this.h;
        if (bArr != null) {
            return rza1.b(bArr);
        }
        ny61.r("method can only be called after verify.");
        return null;
    }

    public u2 getContentType() {
        return this.d;
    }

    public bcs0 getCounterSignatures() {
        xc3 unsignedAttributes = getUnsignedAttributes();
        if (unsignedAttributes == null) {
            return new bcs0(new ArrayList(0));
        }
        ArrayList arrayList = new ArrayList();
        c2 d = unsignedAttributes.d(j87.d);
        for (int i = 0; i < d.b; i++) {
            a2[] a2VarArr = ((vc3) d.c(i)).b.a;
            int length = a2VarArr.length;
            for (int i2 = 0; i2 < a2VarArr.length; i2++) {
                if (i2 >= a2VarArr.length) {
                    ny61.p();
                    return null;
                }
                arrayList.add(new acs0(ybs0.m(a2VarArr[i2]), null, new md6(getSignature()), null));
            }
        }
        return new bcs0(arrayList);
    }

    public String getDigestAlgOID() {
        return this.j.a.a;
    }

    public byte[] getDigestAlgParams() {
        try {
            a2 a2Var = this.j.b;
            if (a2Var != null) {
                return a2Var.toASN1Primitive().getEncoded();
            }
            return null;
        } catch (Exception e) {
            w511.v(e, "exception getting digest parameters ");
            return null;
        }
    }

    public xr1 getDigestAlgorithmID() {
        return this.j;
    }

    public byte[] getEncodedSignedAttributes() throws IOException {
        m3 m3Var = this.l;
        if (m3Var != null) {
            return m3Var.getEncoded("DER");
        }
        return null;
    }

    public String getEncryptionAlgOID() {
        return this.k.a.a;
    }

    public byte[] getEncryptionAlgParams() {
        try {
            a2 a2Var = this.k.b;
            if (a2Var != null) {
                return a2Var.toASN1Primitive().getEncoded();
            }
            return null;
        } catch (Exception e) {
            w511.v(e, "exception getting encryption parameters ");
            return null;
        }
    }

    public wbs0 getSID() {
        return this.a;
    }

    public byte[] getSignature() {
        return rza1.b(this.c);
    }

    public xc3 getSignedAttributes() {
        m3 m3Var = this.l;
        if (m3Var != null && this.f == null) {
            this.f = new xc3(m3Var);
        }
        return this.f;
    }

    public xc3 getUnsignedAttributes() {
        m3 m3Var = this.m;
        if (m3Var != null && this.g == null) {
            this.g = new xc3(m3Var);
        }
        return this.g;
    }

    public int getVersion() {
        return this.i.a.A();
    }

    public boolean isCounterSignature() {
        return this.e;
    }

    public ybs0 toASN1Structure() {
        return this.i;
    }

    public boolean verify(ccs0 ccs0Var) throws CMSException {
        s5z0 m;
        xr1 xr1Var;
        Date y;
        b3 a = a(j87.c, "signing-time");
        h87 h87Var = null;
        if (a == null) {
            m = null;
        } else {
            try {
                m = s5z0.m(a);
            } catch (IllegalArgumentException unused) {
                throw new CMSException("signing-time attribute value not a valid 'Time' structure");
            }
        }
        yie yieVar = ccs0Var.a;
        if (yieVar.hasAssociatedCertificate() && m != null) {
            X509CertificateHolder associatedCertificate = yieVar.getAssociatedCertificate();
            try {
                b3 b3Var = m.a;
                if (b3Var instanceof v3) {
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmssz", s5z.a);
                    simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
                    String u = ((v3) b3Var).u();
                    y = simpleDateFormat.parse((u.charAt(0) < '5' ? "20" : "19").concat(u));
                } else {
                    y = ((g2) b3Var).y();
                }
                if (y.before(associatedCertificate.a.b.y.m()) || y.after(associatedCertificate.a.b.z.m())) {
                    throw new CMSVerifierCertificateNotValidException("verifier not valid at signingTime");
                }
            } catch (ParseException e) {
                yci0.t(e.getMessage(), "invalid date string: ");
                return false;
            }
        }
        y87 y87Var = y87.a;
        String encryptionAlgOID = getEncryptionAlgOID();
        String str = (String) y87.b.get(encryptionAlgOID);
        if (str != null) {
            encryptionAlgOID = str;
        }
        xr1 xr1Var2 = this.k;
        ybs0 ybs0Var = this.i;
        m3 m3Var = this.l;
        if (m3Var != null) {
            xr1Var = ybs0Var.c;
        } else {
            xr1Var = ybs0Var.c;
            if (b490.S2.q(xr1Var2.a) && (zo60.g.q(xr1Var.a) || b490.Z2.q(xr1Var.a))) {
                xr1Var = new xr1(zo60.e, zpf.b);
            }
        }
        try {
            xie xieVar = yieVar.get(new xr1(ccs0Var.c.find(ccs0Var.d.getSignatureName(xr1Var, xr1Var2)).a, xr1Var2.b));
            try {
                OutputStream outputStream = xieVar.getOutputStream();
                byte[] bArr = this.h;
                q87 q87Var = this.b;
                if (bArr == null) {
                    ljj ljjVar = ccs0Var.b.get(xr1Var);
                    if (q87Var != null) {
                        OutputStream outputStream2 = ljjVar.getOutputStream();
                        if (m3Var != null) {
                            q87Var.write(outputStream2);
                            outputStream.write(getEncodedSignedAttributes());
                        } else if (xieVar instanceof b9i0) {
                            q87Var.write(outputStream2);
                        } else {
                            qcy0 qcy0Var = new qcy0(outputStream2, outputStream);
                            q87Var.write(qcy0Var);
                            qcy0Var.close();
                        }
                        outputStream2.close();
                    } else {
                        if (m3Var == null) {
                            throw new CMSException("data not encapsulated in signature - use detached constructor.");
                        }
                        outputStream.write(getEncodedSignedAttributes());
                    }
                    this.h = ljjVar.getDigest();
                } else if (m3Var != null) {
                    outputStream.write(getEncodedSignedAttributes());
                } else if (q87Var != null) {
                    q87Var.write(outputStream);
                }
                outputStream.close();
                b3 a2 = a(j87.a, "content-type");
                boolean z = this.e;
                if (a2 != null) {
                    if (z) {
                        throw new CMSException("[For counter signatures,] the signedAttributes field MUST NOT contain a content-type attribute");
                    }
                    if (!(a2 instanceof u2)) {
                        throw new CMSException("content-type attribute value not of ASN.1 type 'OBJECT IDENTIFIER'");
                    }
                    if (!((u2) a2).q(this.d)) {
                        throw new CMSException("content-type attribute value does not match eContentType");
                    }
                } else if (!z && m3Var != null) {
                    throw new CMSException("The content-type attribute type MUST be present whenever signed attributes are present in signed-data");
                }
                xc3 signedAttributes = getSignedAttributes();
                xc3 unsignedAttributes = getUnsignedAttributes();
                if (unsignedAttributes != null && unsignedAttributes.d(j87.e).b > 0) {
                    throw new CMSException("A cmsAlgorithmProtect attribute MUST be a signed attribute");
                }
                if (signedAttributes != null) {
                    c2 d = signedAttributes.d(j87.e);
                    int i = d.b;
                    if (i > 1) {
                        throw new CMSException("Only one instance of a cmsAlgorithmProtect attribute can be present");
                    }
                    if (i > 0) {
                        a2[] a2VarArr = vc3.m(d.c(0)).b.a;
                        if (a2VarArr.length != 1) {
                            throw new CMSException("A cmsAlgorithmProtect attribute MUST contain exactly one value");
                        }
                        a2 a2Var = c2.b(a2VarArr)[0];
                        if (a2Var instanceof h87) {
                            h87Var = (h87) a2Var;
                        } else if (a2Var != null) {
                            h87Var = new h87(i3.z(a2Var));
                        }
                        if (!b97.g(h87Var.a, ybs0Var.c)) {
                            throw new CMSException("CMS Algorithm Identifier Protection check failed for digestAlgorithm");
                        }
                        if (!b97.g(h87Var.b, ybs0Var.x)) {
                            throw new CMSException("CMS Algorithm Identifier Protection check failed for signatureAlgorithm");
                        }
                    }
                }
                b3 a3 = a(j87.b, "message-digest");
                if (a3 != null) {
                    if (!(a3 instanceof w2)) {
                        throw new CMSException("message-digest attribute value not of ASN.1 type 'OCTET STRING'");
                    }
                    if (!rza1.c(this.h, ((w2) a3).a)) {
                        throw new CMSSignerDigestMismatchException("message-digest attribute value does not match calculated value");
                    }
                } else if (m3Var != null) {
                    throw new CMSException("the message-digest signed attribute type MUST be present when there are any signed attributes present");
                }
                if (signedAttributes != null && signedAttributes.d(j87.d).b > 0) {
                    throw new CMSException("A countersignature attribute MUST NOT be a signed attribute");
                }
                xc3 unsignedAttributes2 = getUnsignedAttributes();
                if (unsignedAttributes2 != null) {
                    c2 d2 = unsignedAttributes2.d(j87.d);
                    for (int i2 = 0; i2 < d2.b; i2++) {
                        if (vc3.m(d2.c(i2)).b.a.length < 1) {
                            throw new CMSException("A countersignature attribute MUST contain at least one AttributeValue");
                        }
                    }
                }
                if (m3Var == null) {
                    try {
                        if (this.h != null && (xieVar instanceof b9i0)) {
                            b9i0 b9i0Var = (b9i0) xieVar;
                            return encryptionAlgOID.equals("RSA") ? b9i0Var.verify(new njj(new xr1(xr1Var.a, zpf.b), this.h).getEncoded("DER"), getSignature()) : b9i0Var.verify(this.h, getSignature());
                        }
                    } catch (IOException e2) {
                        throw new CMSException("can't process mime object to create signature.", e2);
                    }
                }
                return xieVar.verify(getSignature());
            } catch (IOException e3) {
                throw new CMSException("can't process mime object to create signature.", e3);
            } catch (OperatorCreationException e4) {
                throw new CMSException("can't create digest calculator: " + e4.getMessage(), e4);
            }
        } catch (OperatorCreationException e5) {
            throw new CMSException("can't create content verifier: " + e5.getMessage(), e5);
        }
    }

    public acs0(acs0 acs0Var) {
        ybs0 ybs0Var = acs0Var.i;
        this.i = ybs0Var;
        this.d = acs0Var.d;
        this.e = acs0Var.isCounterSignature();
        this.a = acs0Var.getSID();
        this.j = ybs0Var.c;
        this.l = ybs0Var.w;
        this.m = ybs0Var.z;
        this.k = ybs0Var.x;
        this.c = ybs0Var.y.a;
        this.b = acs0Var.b;
        this.h = acs0Var.h;
        this.f = getSignedAttributes();
        this.g = getUnsignedAttributes();
    }
}
