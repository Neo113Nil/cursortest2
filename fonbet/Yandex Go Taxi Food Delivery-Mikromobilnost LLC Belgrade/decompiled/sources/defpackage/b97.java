package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.bouncycastle.cert.X509CRLHolder;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.cms.CMSException;
import ru.CryptoPro.JCSP.JCSP;

/* loaded from: classes4.dex */
public abstract class b97 {
    public static final /* synthetic */ int a = 0;

    static {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        hashSet.add(JCSP.DES_NAME);
        hashSet.add("DESEDE");
        hashSet.add(zo60.d.a);
        hashSet.add(b490.j3.a);
        hashSet.add(b490.D3.a);
        hashSet2.add(xc51.k);
        hashSet2.add(lll0.i);
        hashSet2.add(lll0.j);
        hashSet2.add(lll0.k);
        hashSet2.add(lll0.l);
        hashSet3.add(xc51.j);
        hashSet3.add(xc51.i);
        hashSet3.add(lll0.e);
        hashSet3.add(lll0.a);
        hashSet3.add(lll0.f);
        hashSet3.add(lll0.b);
        hashSet3.add(lll0.g);
        hashSet3.add(lll0.c);
        hashSet3.add(lll0.h);
        hashSet3.add(lll0.d);
        hashSet4.add(bdf.i);
        hashSet4.add(pwk0.g);
        hashSet4.add(pwk0.h);
    }

    public static void a(HashSet hashSet, acs0 acs0Var, fah fahVar) {
        y87 y87Var = y87.a;
        hashSet.add(y87.b(acs0Var.getDigestAlgorithmID(), fahVar));
        Iterator it = acs0Var.getCounterSignatures().iterator();
        while (it.hasNext()) {
            acs0 acs0Var2 = (acs0) it.next();
            y87 y87Var2 = y87.a;
            hashSet.add(y87.b(acs0Var2.getDigestAlgorithmID(), fahVar));
        }
    }

    public static id4 b(OutputStream outputStream, boolean z) {
        jd4 jd4Var = new jd4(outputStream, z);
        jd4Var.c(36);
        return new id4(jd4Var, new byte[1000]);
    }

    public static rd4 c(ArrayList arrayList) {
        c2 c2Var = new c2();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            c2Var.a((a2) it.next());
        }
        return new rd4(c2Var, false);
    }

    public static ArrayList d(nju0 nju0Var) {
        ArrayList arrayList = new ArrayList();
        try {
            Iterator it = ((ncc) nju0Var).a(null).iterator();
            if (!it.hasNext()) {
                return arrayList;
            }
            if (it.next() == null) {
                throw null;
            }
            throw new ClassCastException();
        } catch (ClassCastException e) {
            throw new CMSException("error processing certs", e);
        }
    }

    public static ArrayList e(nju0 nju0Var) {
        ArrayList arrayList = new ArrayList();
        try {
            Iterator it = ((ncc) nju0Var).a(null).iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof X509CRLHolder) {
                    next = ((X509CRLHolder) next).a;
                } else if (next instanceof mr80) {
                    mr80 m = mr80.m((o2) next);
                    i(m);
                    arrayList.add(new oqf(2, 128, 1, m, 0));
                } else if (next instanceof s3) {
                }
                arrayList.add(next);
            }
            return arrayList;
        } catch (ClassCastException e) {
            throw new CMSException("error processing certs", e);
        }
    }

    public static ArrayList f(nju0 nju0Var) {
        ArrayList arrayList = new ArrayList();
        try {
            Iterator it = ((ncc) nju0Var).a(null).iterator();
            while (it.hasNext()) {
                arrayList.add(((X509CertificateHolder) it.next()).a);
            }
            return arrayList;
        } catch (ClassCastException e) {
            throw new CMSException("error processing certs", e);
        }
    }

    public static boolean g(xr1 xr1Var, xr1 xr1Var2) {
        if (xr1Var == null || xr1Var2 == null || !xr1Var.a.q(xr1Var2.a)) {
            return false;
        }
        a2 a2Var = xr1Var.b;
        a2 a2Var2 = xr1Var2.b;
        return a2Var != null ? a2Var.equals(a2Var2) || (a2Var.equals(zpf.b) && a2Var2 == null) : a2Var2 == null || a2Var2.equals(zpf.b);
    }

    public static ige h(byte[] bArr) {
        try {
            ige m = ige.m(new j2(bArr).n());
            if (m != null) {
                return m;
            }
            throw new CMSException("No content found.");
        } catch (IOException e) {
            throw new CMSException("IOException reading content.", e);
        } catch (ClassCastException e2) {
            throw new CMSException("Malformed content.", e2);
        } catch (IllegalArgumentException e3) {
            throw new CMSException("Malformed content.", e3);
        }
    }

    public static void i(mr80 mr80Var) {
        if (!p87.c1.q(mr80Var.a) || wo60.m(mr80Var.b).a.a.z() == 0) {
            return;
        }
        ny61.g("cannot add unsuccessful OCSP response to CMS SignedData");
    }
}
