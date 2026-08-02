package defpackage;

import android.net.Uri;
import androidx.compose.foundation.c;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.snapping.a;
import androidx.compose.foundation.pager.b;
import androidx.compose.foundation.pager.d;
import androidx.compose.ui.platform.j;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.ar.core.ImageMetadata;
import java.util.Map;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class otr0 {
    public static final jd2 a = new jd2(5.0d, 0.45d);

    /* JADX WARN: Removed duplicated region for block: B:102:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final d dVar, f530 f530Var, j690 j690Var, u790 u790Var, float f, to5 to5Var, a aVar, boolean z, tls tlsVar, gn50 gn50Var, k1t0 k1t0Var, c cVar, final androidx.compose.runtime.internal.a aVar2, fid fidVar, final int i, final int i2) {
        int i3;
        f530 f530Var2;
        int i4;
        j690 j690Var2;
        int i5;
        u790 u790Var2;
        int i6;
        int i7;
        int i8;
        boolean z2;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        final float f2;
        final to5 to5Var2;
        final boolean z3;
        final gn50 gn50Var2;
        final c cVar2;
        final f530 f530Var3;
        final j690 j690Var3;
        final u790 u790Var3;
        final a aVar3;
        final tls tlsVar2;
        final k1t0 k1t0Var2;
        aii0 v;
        u790 u790Var4;
        int i14;
        k1t0 k1t0Var3;
        float f3;
        int i15;
        gn50 gn50Var3;
        c a2;
        f530 f530Var4;
        to5 to5Var3;
        tls tlsVar3;
        a aVar4;
        j690 j690Var4;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1860873769);
        if ((i & 6) == 0) {
            i3 = (btsVar.k(dVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i16 = i2 & 2;
        if (i16 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            f530Var2 = f530Var;
            i3 |= btsVar.k(f530Var2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                j690Var2 = j690Var;
                i3 |= btsVar.k(j690Var2) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= HProv.ALG_TYPE_SECURECHANNEL;
                } else if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
                    u790Var2 = u790Var;
                    i3 |= btsVar.k(u790Var2) ? 2048 : 1024;
                    int i17 = i3 | HProv.ALG_CLASS_DATA_ENCRYPT;
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i17 = 221184 | i3;
                    } else if ((i & ImageMetadata.EDGE_MODE) == 0) {
                        i17 |= btsVar.b(f) ? 131072 : 65536;
                        i7 = i2 & 64;
                        if (i7 != 0) {
                            i17 |= 1572864;
                        } else if ((i & 1572864) == 0) {
                            i17 |= btsVar.k(to5Var) ? 1048576 : 524288;
                        }
                        if ((i & 12582912) == 0) {
                            i17 |= SelfTester_JCP.ENCRYPT_CBC;
                        }
                        i8 = i2 & 256;
                        if (i8 != 0) {
                            i17 |= 100663296;
                            z2 = z;
                        } else {
                            z2 = z;
                            if ((i & 100663296) == 0) {
                                i17 |= btsVar.a(z2) ? SelfTester_JCP.DECRYPT_CBC : SelfTester_JCP.DECRYPT_CFB;
                            }
                        }
                        i9 = i17 | 805306368;
                        i10 = i2 & 1024;
                        if (i10 != 0) {
                            i12 = 24582;
                            i11 = HProv.ALG_CLASS_DATA_ENCRYPT;
                        } else {
                            i11 = HProv.ALG_CLASS_DATA_ENCRYPT;
                            i12 = 24576 | (btsVar.e(tlsVar) ? 4 : 2);
                        }
                        i13 = i12 | 1424;
                        if (btsVar.V(i9 & 1, (i9 & 306783379) == 306783378 || (i13 & 9363) != 9362)) {
                            btsVar.a0();
                            if ((i & 1) == 0 || btsVar.C()) {
                                f530 f530Var5 = i16 != 0 ? c530.a : f530Var2;
                                j690 l690Var = i4 != 0 ? new l690(0.0f, 0.0f, 0.0f, 0.0f) : j690Var2;
                                u790Var4 = i5 != 0 ? h2b1.J : u790Var2;
                                float f4 = i6 != 0 ? 0.0f : f;
                                to5 to5Var4 = i7 != 0 ? x4c.E : to5Var;
                                int i18 = (i9 & 14) | ImageMetadata.EDGE_MODE;
                                v890 v890Var = new v890();
                                int i19 = 6;
                                gxg a3 = ist0.a(btsVar);
                                Map map = jx31.a;
                                f530 f530Var6 = f530Var5;
                                twt0 G = sb2.G(0.0f, 400.0f, 1, Float.valueOf(1.0f));
                                Object obj = (fwi) btsVar.m(j.h);
                                LayoutDirection layoutDirection = (LayoutDirection) btsVar.m(j.n);
                                j690 j690Var5 = l690Var;
                                boolean k = ((((i18 & 14) ^ 6) > 4 && btsVar.k(dVar)) || (i18 & 6) == 4) | btsVar.k(a3) | btsVar.k(G) | btsVar.k(v890Var) | btsVar.k(obj) | btsVar.c(layoutDirection.ordinal());
                                Object Q = btsVar.Q();
                                Object obj2 = did.a;
                                if (k || Q == obj2) {
                                    Object aVar5 = new a(new z6y(dVar, new y740(i19, dVar, layoutDirection), v890Var), a3, G);
                                    btsVar.o0(aVar5);
                                    Q = aVar5;
                                }
                                a aVar6 = (a) Q;
                                int i20 = i9 & (-29360129);
                                boolean z4 = i8 != 0 ? true : z;
                                tls tlsVar4 = i10 != 0 ? null : tlsVar;
                                Orientation orientation = Orientation.Horizontal;
                                int i21 = (i9 & 14) | 432;
                                boolean z5 = (((i21 & 14) ^ 6) > 4 && btsVar.k(dVar)) || (i21 & 6) == 4;
                                Object Q2 = btsVar.Q();
                                if (z5 || Q2 == obj2) {
                                    Q2 = new tgh(dVar, orientation);
                                    btsVar.o0(Q2);
                                }
                                i14 = i20;
                                k1t0Var3 = msb1.U;
                                f3 = f4;
                                i15 = i13 & (-7281);
                                gn50Var3 = (tgh) Q2;
                                a2 = m290.a(btsVar);
                                f530Var4 = f530Var6;
                                to5Var3 = to5Var4;
                                tlsVar3 = tlsVar4;
                                z2 = z4;
                                aVar4 = aVar6;
                                j690Var4 = j690Var5;
                            } else {
                                btsVar.Y();
                                int i22 = i9 & (-29360129);
                                aVar4 = aVar;
                                tlsVar3 = tlsVar;
                                k1t0Var3 = k1t0Var;
                                a2 = cVar;
                                i15 = i13 & (-7281);
                                i14 = i22;
                                f530Var4 = f530Var2;
                                j690Var4 = j690Var2;
                                u790Var4 = u790Var2;
                                f3 = f;
                                to5Var3 = to5Var;
                                gn50Var3 = gn50Var;
                            }
                            btsVar.u();
                            f530 f530Var7 = f530Var4;
                            int i23 = i14 >> 6;
                            int i24 = i14 << 12;
                            b.a(f530Var7, dVar, j690Var4, Orientation.Horizontal, aVar4, z2, a2, f3, u790Var4, gn50Var3, tlsVar3, to5Var3, k1t0Var3, aVar2, btsVar, ((i14 >> 3) & 14) | i11 | ((i14 << 3) & 112) | (i14 & 896) | ((i14 >> 18) & 7168) | (i23 & 3670016) | (i24 & 234881024) | (i24 & 1879048192), (i23 & HProv.ALG_CLASS_ALL) | ((i14 >> 9) & 14) | HProv.ALG_TYPE_SECURECHANNEL | ((i15 << 6) & 896) | 1769472);
                            float f5 = f3;
                            aVar3 = aVar4;
                            u790Var3 = u790Var4;
                            z3 = z2;
                            f2 = f5;
                            k1t0 k1t0Var4 = k1t0Var3;
                            cVar2 = a2;
                            to5Var2 = to5Var3;
                            k1t0Var2 = k1t0Var4;
                            tls tlsVar5 = tlsVar3;
                            gn50Var2 = gn50Var3;
                            tlsVar2 = tlsVar5;
                            j690Var3 = j690Var4;
                            f530Var3 = f530Var7;
                        } else {
                            btsVar.Y();
                            f2 = f;
                            to5Var2 = to5Var;
                            z3 = z;
                            gn50Var2 = gn50Var;
                            cVar2 = cVar;
                            f530Var3 = f530Var2;
                            j690Var3 = j690Var2;
                            u790Var3 = u790Var2;
                            aVar3 = aVar;
                            tlsVar2 = tlsVar;
                            k1t0Var2 = k1t0Var;
                        }
                        v = btsVar.v();
                        if (v != null) {
                            v.d = new wls() { // from class: n890
                                @Override // defpackage.wls
                                public final Object invoke(Object obj3, Object obj4) {
                                    ((Integer) obj4).getClass();
                                    int O = vng.O(i | 1);
                                    otr0.a(d.this, f530Var3, j690Var3, u790Var3, f2, to5Var2, aVar3, z3, tlsVar2, gn50Var2, k1t0Var2, cVar2, aVar2, (fid) obj3, O, i2);
                                    return zy11.a;
                                }
                            };
                            return;
                        }
                        return;
                    }
                    i7 = i2 & 64;
                    if (i7 != 0) {
                    }
                    if ((i & 12582912) == 0) {
                    }
                    i8 = i2 & 256;
                    if (i8 != 0) {
                    }
                    i9 = i17 | 805306368;
                    i10 = i2 & 1024;
                    if (i10 != 0) {
                    }
                    i13 = i12 | 1424;
                    if (btsVar.V(i9 & 1, (i9 & 306783379) == 306783378 || (i13 & 9363) != 9362)) {
                    }
                    v = btsVar.v();
                    if (v != null) {
                    }
                }
                u790Var2 = u790Var;
                int i172 = i3 | HProv.ALG_CLASS_DATA_ENCRYPT;
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                i7 = i2 & 64;
                if (i7 != 0) {
                }
                if ((i & 12582912) == 0) {
                }
                i8 = i2 & 256;
                if (i8 != 0) {
                }
                i9 = i172 | 805306368;
                i10 = i2 & 1024;
                if (i10 != 0) {
                }
                i13 = i12 | 1424;
                if (btsVar.V(i9 & 1, (i9 & 306783379) == 306783378 || (i13 & 9363) != 9362)) {
                }
                v = btsVar.v();
                if (v != null) {
                }
            }
            j690Var2 = j690Var;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            u790Var2 = u790Var;
            int i1722 = i3 | HProv.ALG_CLASS_DATA_ENCRYPT;
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            i7 = i2 & 64;
            if (i7 != 0) {
            }
            if ((i & 12582912) == 0) {
            }
            i8 = i2 & 256;
            if (i8 != 0) {
            }
            i9 = i1722 | 805306368;
            i10 = i2 & 1024;
            if (i10 != 0) {
            }
            i13 = i12 | 1424;
            if (btsVar.V(i9 & 1, (i9 & 306783379) == 306783378 || (i13 & 9363) != 9362)) {
            }
            v = btsVar.v();
            if (v != null) {
            }
        }
        f530Var2 = f530Var;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        j690Var2 = j690Var;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        u790Var2 = u790Var;
        int i17222 = i3 | HProv.ALG_CLASS_DATA_ENCRYPT;
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        i7 = i2 & 64;
        if (i7 != 0) {
        }
        if ((i & 12582912) == 0) {
        }
        i8 = i2 & 256;
        if (i8 != 0) {
        }
        i9 = i17222 | 805306368;
        i10 = i2 & 1024;
        if (i10 != 0) {
        }
        i13 = i12 | 1424;
        if (btsVar.V(i9 & 1, (i9 & 306783379) == 306783378 || (i13 & 9363) != 9362)) {
        }
        v = btsVar.v();
        if (v != null) {
        }
    }

    public static final String b(String str, String str2, String str3) {
        Uri parse = Uri.parse(str);
        Uri.Builder clearQuery = parse.buildUpon().clearQuery();
        for (String str4 : parse.getQueryParameterNames()) {
            clearQuery.appendQueryParameter(str4, parse.getQueryParameter(str4));
        }
        clearQuery.appendQueryParameter(str2, str3);
        return clearQuery.build().toString();
    }

    public static final void c(Uri.Builder builder, String str, String str2, String str3, boolean z) {
        if (str3 != null && str3.length() != 0) {
            builder.appendQueryParameter("city", str3);
        }
        if (str != null && str.length() != 0) {
            builder.appendQueryParameter("phone", str);
        }
        if (str2 != null && str2.length() != 0 && z) {
            builder.appendQueryParameter("email", str2);
        }
        builder.appendQueryParameter("isIframeSupported", "true");
    }

    public static long d() {
        return System.currentTimeMillis();
    }
}
