package defpackage;

import androidx.compose.animation.k;
import androidx.compose.runtime.f;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.google.ar.core.ImageMetadata;
import com.google.crypto.tink.subtle.EllipticCurves$CurveType;
import com.google.crypto.tink.subtle.EllipticCurves$PointFormatType;
import java.math.BigInteger;
import java.security.NoSuchAlgorithmException;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptySet;
import yads.yh0;

/* loaded from: classes11.dex */
public abstract class c5a1 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(f530 f530Var, a aVar, fid fidVar, int i) {
        f530 f530Var2;
        Object c;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1768098340);
        int i2 = i | 6;
        boolean z = false;
        int i3 = 1;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            zx01 O = bvf0.O(com.yandex.go.design.compose.modal.utils.a.a(false, null, btsVar, 0, 7).a, null, btsVar, 0, 2);
            cz20 cz20Var = new cz20((wp2) null, (sls) (null == true ? 1 : 0), z, 15);
            long n = tje.n(cz20Var.a, btsVar);
            l2z0 l2z0Var = l2z0.a;
            gl11 gl11Var = gtq0.f;
            boolean g = O.g();
            o430 o430Var = did.a;
            if (g) {
                btsVar.e0(1666827533);
                btsVar.t(false);
                c = O.c();
            } else {
                btsVar.e0(1666573488);
                boolean k = btsVar.k(O);
                c = btsVar.Q();
                if (k || c == o430Var) {
                    i2t0 D = tje.D();
                    tls e = D != null ? D.e() : null;
                    i2t0 O2 = tje.O(D);
                    try {
                        Object c2 = O.c();
                        tje.W(D, O2, e);
                        btsVar.o0(c2);
                        c = c2;
                    } catch (Throwable th) {
                        tje.W(D, O2, e);
                        throw th;
                    }
                }
                btsVar.t(false);
            }
            boolean booleanValue = ((Boolean) c).booleanValue();
            btsVar.e0(1753794890);
            float f = booleanValue ? 1.0f : 0.0f;
            btsVar.t(false);
            Float valueOf = Float.valueOf(f);
            boolean k2 = btsVar.k(O);
            Object Q = btsVar.Q();
            if (k2 || Q == o430Var) {
                Q = f.d(new fw0(O, 10));
                btsVar.o0(Q);
            }
            boolean booleanValue2 = ((Boolean) ((m3u0) Q).getValue()).booleanValue();
            btsVar.e0(1753794890);
            float f2 = booleanValue2 ? 1.0f : 0.0f;
            btsVar.t(false);
            Float valueOf2 = Float.valueOf(f2);
            boolean k3 = btsVar.k(O);
            Object Q2 = btsVar.Q();
            if (k3 || Q2 == o430Var) {
                Q2 = f.d(new fw0(O, 11));
                btsVar.o0(Q2);
            }
            tx01 s = bvf0.s(O, valueOf, valueOf2, (qar) l2z0Var.invoke(((m3u0) Q2).getValue(), btsVar, 0), gl11Var, btsVar, ImageMetadata.EDGE_MODE);
            btsVar.e0(252750009);
            btsVar.t(false);
            k3r k3rVar = ljs0.c;
            boolean d = btsVar.d(n) | btsVar.k(s);
            Object Q3 = btsVar.Q();
            if (d || Q3 == o430Var) {
                Q3 = new mhs(n, s, i3);
                btsVar.o0(Q3);
            }
            f530 c3 = i470.c(bb1.g(k3rVar, (tls) Q3), cz20Var.b, null);
            z910 d2 = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d3 = b.d(btsVar, c3);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, d2);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d3);
            int i4 = 29;
            wx20.a(i9a1.c(i9a1.g(k3rVar)), null, dz20.a, k.p(sb2.G(0.75f, 150.0f, 4, null), new ur70(i4)), k.u(sb2.G(0.75f, 400.0f, 4, null), new ur70(i4)), false, false, wwg.S(1044105915, true, new k2z0(aVar, null == true ? 1 : 0), btsVar), btsVar, 14156160, 34);
            btsVar = btsVar;
            btsVar.t(true);
            f530Var2 = c530.a;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new zsm(f530Var2, aVar, i, 4);
        }
    }

    public static Set b(hk61 hk61Var, yh0 yh0Var) {
        List f = hk61Var.f();
        if (f == null) {
            return EmptySet.a;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = f.iterator();
        while (it.hasNext()) {
            ycc.r(((ld71) it.next()).g, arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            os81 os81Var = (os81) next;
            if (yh0Var == null || os81Var.a == yh0Var) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList(tcc.n(arrayList2, 10));
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            arrayList3.add(((os81) it3.next()).b);
        }
        return kotlin.collections.a.N0(arrayList3);
    }

    public static ECParameterSpec c(EllipticCurves$CurveType ellipticCurves$CurveType) {
        int i = orn.b[ellipticCurves$CurveType.ordinal()];
        if (i == 1) {
            return prn.a;
        }
        if (i == 2) {
            return prn.b;
        }
        if (i == 3) {
            return prn.c;
        }
        throw new NoSuchAlgorithmException("curve not implemented:" + ellipticCurves$CurveType);
    }

    public static BigInteger d(BigInteger bigInteger, boolean z, EllipticCurve ellipticCurve) {
        BigInteger b = prn.b(ellipticCurve);
        BigInteger mod = bigInteger.multiply(bigInteger).add(ellipticCurve.getA()).multiply(bigInteger).add(ellipticCurve.getB()).mod(b);
        if (b.signum() != 1) {
            kbs.t("p must be positive");
            return null;
        }
        BigInteger mod2 = mod.mod(b);
        BigInteger bigInteger2 = BigInteger.ZERO;
        if (!mod2.equals(bigInteger2)) {
            if (b.testBit(0) && b.testBit(1)) {
                bigInteger2 = mod2.modPow(b.add(BigInteger.ONE).shiftRight(2), b);
            } else if (!b.testBit(0) || b.testBit(1)) {
                bigInteger2 = null;
            } else {
                bigInteger2 = BigInteger.ONE;
                BigInteger shiftRight = b.subtract(bigInteger2).shiftRight(1);
                int i = 0;
                while (true) {
                    BigInteger mod3 = bigInteger2.multiply(bigInteger2).subtract(mod2).mod(b);
                    if (mod3.equals(BigInteger.ZERO)) {
                        break;
                    }
                    BigInteger modPow = mod3.modPow(shiftRight, b);
                    BigInteger bigInteger3 = BigInteger.ONE;
                    if (modPow.add(bigInteger3).equals(b)) {
                        BigInteger shiftRight2 = b.add(bigInteger3).shiftRight(1);
                        BigInteger bigInteger4 = bigInteger2;
                        for (int bitLength = shiftRight2.bitLength() - 2; bitLength >= 0; bitLength--) {
                            BigInteger multiply = bigInteger4.multiply(bigInteger3);
                            bigInteger4 = bigInteger4.multiply(bigInteger4).add(bigInteger3.multiply(bigInteger3).mod(b).multiply(mod3)).mod(b);
                            BigInteger mod4 = multiply.add(multiply).mod(b);
                            if (shiftRight2.testBit(bitLength)) {
                                BigInteger mod5 = bigInteger4.multiply(bigInteger2).add(mod4.multiply(mod3)).mod(b);
                                bigInteger3 = bigInteger2.multiply(mod4).add(bigInteger4).mod(b);
                                bigInteger4 = mod5;
                            } else {
                                bigInteger3 = mod4;
                            }
                        }
                        bigInteger2 = bigInteger4;
                    } else {
                        if (!modPow.equals(bigInteger3)) {
                            kbs.t("p is not prime");
                            return null;
                        }
                        bigInteger2 = bigInteger2.add(bigInteger3);
                        i++;
                        if (i == 128 && !b.isProbablePrime(80)) {
                            kbs.t("p is not prime");
                            return null;
                        }
                    }
                }
            }
            if (bigInteger2 != null && bigInteger2.multiply(bigInteger2).mod(b).compareTo(mod2) != 0) {
                kbs.v("Could not find a modular square root");
                return null;
            }
        }
        return z != bigInteger2.testBit(0) ? b.subtract(bigInteger2).mod(b) : bigInteger2;
    }

    public static byte[] e(EllipticCurves$CurveType ellipticCurves$CurveType, EllipticCurves$PointFormatType ellipticCurves$PointFormatType, ECPoint eCPoint) {
        EllipticCurve curve = c(ellipticCurves$CurveType).getCurve();
        prn.a(eCPoint, curve);
        int bitLength = (prn.b(curve).subtract(BigInteger.ONE).bitLength() + 7) / 8;
        int i = orn.a[ellipticCurves$PointFormatType.ordinal()];
        if (i == 1) {
            int i2 = (bitLength * 2) + 1;
            byte[] bArr = new byte[i2];
            byte[] d = r6b1.d(eCPoint.getAffineX());
            byte[] d2 = r6b1.d(eCPoint.getAffineY());
            System.arraycopy(d2, 0, bArr, i2 - d2.length, d2.length);
            System.arraycopy(d, 0, bArr, (bitLength + 1) - d.length, d.length);
            bArr[0] = 4;
            return bArr;
        }
        if (i != 2) {
            if (i != 3) {
                yhl.g(ellipticCurves$PointFormatType, "invalid format:");
                return null;
            }
            int i3 = bitLength + 1;
            byte[] bArr2 = new byte[i3];
            byte[] d3 = r6b1.d(eCPoint.getAffineX());
            System.arraycopy(d3, 0, bArr2, i3 - d3.length, d3.length);
            bArr2[0] = (byte) (eCPoint.getAffineY().testBit(0) ? 3 : 2);
            return bArr2;
        }
        int i4 = bitLength * 2;
        byte[] bArr3 = new byte[i4];
        byte[] d4 = r6b1.d(eCPoint.getAffineX());
        if (d4.length > bitLength) {
            d4 = Arrays.copyOfRange(d4, d4.length - bitLength, d4.length);
        }
        byte[] d5 = r6b1.d(eCPoint.getAffineY());
        if (d5.length > bitLength) {
            d5 = Arrays.copyOfRange(d5, d5.length - bitLength, d5.length);
        }
        System.arraycopy(d5, 0, bArr3, i4 - d5.length, d5.length);
        System.arraycopy(d4, 0, bArr3, bitLength - d4.length, d4.length);
        return bArr3;
    }

    public static Class f(Class cls) {
        return cls == Integer.TYPE ? Integer.class : cls == Float.TYPE ? Float.class : cls == Byte.TYPE ? Byte.class : cls == Double.TYPE ? Double.class : cls == Long.TYPE ? Long.class : cls == Character.TYPE ? Character.class : cls == Boolean.TYPE ? Boolean.class : cls == Short.TYPE ? Short.class : cls == Void.TYPE ? Void.class : cls;
    }
}
