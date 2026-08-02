package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.google.ar.core.ImageMetadata;
import com.yx360.design.compose.atoms.DsAvatar$Form;
import com.yx360.design.compose.atoms.DsAvatar$Size;
import com.yx360.design.compose.atoms.DsBadge$Size;
import com.yx360.design.compose.atoms.DsBadge$Variant;
import com.yx360.design.compose.atoms.DsStatus$Size;
import java.util.Arrays;
import java.util.List;
import kotlin.Pair;
import kotlin.random.Random;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes4.dex */
public abstract class iom {
    public static final float a;

    static {
        qnm qnmVar = qnm.a;
        qnm.c.getClass();
        a = 4.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(DsAvatar$Size dsAvatar$Size, yn91 yn91Var, int i, f530 f530Var, fid fidVar, int i2) {
        int i3;
        DsBadge$Size dsBadge$Size;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1659474087);
        if ((i2 & 6) == 0) {
            i3 = (btsVar.c(dsAvatar$Size.ordinal()) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= btsVar.k(yn91Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= btsVar.c(i) ? 256 : 128;
        }
        if ((i2 & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i3 |= btsVar.k(f530Var) ? 2048 : 1024;
        }
        if ((i3 & 1171) == 1170 && btsVar.E()) {
            btsVar.Y();
        } else {
            int[] iArr = hom.a;
            switch (iArr[dsAvatar$Size.ordinal()]) {
                case 1:
                case 2:
                case 3:
                    dsBadge$Size = null;
                    break;
                case 4:
                case 5:
                case 6:
                case 7:
                    dsBadge$Size = DsBadge$Size.Sm;
                    break;
                case 8:
                    dsBadge$Size = DsBadge$Size.Md;
                    break;
                default:
                    w511.b();
                    return;
            }
            DsBadge$Size dsBadge$Size2 = dsBadge$Size;
            float f = 0.0f;
            if (jl40.l(yn91Var, com.a)) {
                switch (iArr[dsAvatar$Size.ordinal()]) {
                    case 4:
                    case 5:
                    case 6:
                        qnm.d.getClass();
                        f = 2.0f;
                    case 1:
                    case 2:
                    case 3:
                    case 7:
                    case 8:
                        f530 e = sm91.e(f530Var, f, -f);
                        if (dsBadge$Size2 != null) {
                            btsVar.e0(1977378628);
                            DsStatus$Size dsStatus$Size = DsStatus$Size.Xs;
                            qnm qnmVar = qnm.a;
                            pw91.d(dsStatus$Size, e, null, 0L, qnm.b(btsVar).a, 0L, btsVar, 6, 44);
                            btsVar = btsVar;
                            btsVar.t(false);
                            break;
                        } else {
                            btsVar.e0(1977049470);
                            oom.a(new jom(i, (Integer) btsVar.m(oom.b)), e, dsBadge$Size2, DsBadge$Variant.Brand, true, 0L, null, btsVar, 27648, 96);
                            btsVar.t(false);
                            break;
                        }
                    default:
                        w511.b();
                        return;
                }
            } else if (!(yn91Var instanceof fom)) {
                w511.b();
                return;
            }
            f530 e2 = sm91.e(f530Var, f, -f);
            if (dsBadge$Size2 != null) {
            }
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new v4(dsAvatar$Size, yn91Var, i, f530Var, i2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:95:0x030a, code lost:
    
        if (defpackage.jl40.l(r0.Q(), java.lang.Integer.valueOf(r7)) == false) goto L164;
     */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0a33  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0a85  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0aaf  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0a77  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x09b0  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x09c1  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x09e0  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x09ef  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x09f2  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x09e4  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x09b4  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0b14  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01a1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(f530 f530Var, final un91 un91Var, yn91 yn91Var, final DsAvatar$Size dsAvatar$Size, DsAvatar$Form dsAvatar$Form, dtm dtmVar, Integer num, String str, sls slsVar, fid fidVar, final int i, final int i2) {
        f530 f530Var2;
        int i3;
        yn91 yn91Var2;
        int i4;
        int i5;
        dtm dtmVar2;
        int i6;
        Integer num2;
        int i7;
        int i8;
        int i9;
        String str2;
        sls slsVar2;
        f530 f530Var3;
        Object Q;
        boolean z;
        int i10;
        boolean z2;
        boolean z3;
        dtm dtmVar3;
        boolean z4;
        f530 f530Var4;
        DsAvatar$Form dsAvatar$Form2;
        byk0 byk0Var;
        f530 f530Var5;
        String str3;
        dtm dtmVar4;
        float f;
        float f2;
        dtm dtmVar5;
        o430 o430Var;
        String str4;
        boolean z5;
        long j;
        ety0 ety0Var;
        ety0 h;
        int hashCode;
        bts btsVar;
        boolean z6;
        int j2;
        final Integer num3;
        final yn91 yn91Var3;
        final sls slsVar3;
        final f530 f530Var6;
        final DsAvatar$Form dsAvatar$Form3;
        final String str5;
        Object Q2;
        float f3;
        float f4;
        f530 a2;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-1407303909);
        dmw0 dmw0Var = btsVar2.a;
        int i11 = i2 & 1;
        if (i11 != 0) {
            i3 = i | 6;
            f530Var2 = f530Var;
        } else if ((i & 6) == 0) {
            f530Var2 = f530Var;
            i3 = (btsVar2.k(f530Var2) ? 4 : 2) | i;
        } else {
            f530Var2 = f530Var;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= btsVar2.k(un91Var) ? 32 : 16;
        }
        int i12 = i2 & 4;
        if (i12 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            yn91Var2 = yn91Var;
            i3 |= btsVar2.k(yn91Var2) ? 256 : 128;
            if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
                i3 |= btsVar2.c(dsAvatar$Size == null ? -1 : dsAvatar$Size.ordinal()) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= HProv.ALG_CLASS_DATA_ENCRYPT;
            } else if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                i3 |= btsVar2.c(dsAvatar$Form != null ? dsAvatar$Form.ordinal() : -1) ? 16384 : 8192;
            }
            i5 = i2 & 32;
            if (i5 == 0) {
                i3 |= ImageMetadata.EDGE_MODE;
            } else if ((196608 & i) == 0) {
                dtmVar2 = dtmVar;
                i3 |= btsVar2.k(dtmVar2) ? 131072 : 65536;
                i6 = i2 & 64;
                if (i6 != 0) {
                    i3 |= 1572864;
                    num2 = num;
                } else {
                    num2 = num;
                    if ((i & 1572864) == 0) {
                        i3 |= btsVar2.k(num2) ? 1048576 : 524288;
                    }
                }
                i7 = i2 & 128;
                if (i7 != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    i3 |= btsVar2.k(str) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC;
                }
                i8 = i2 & 256;
                if (i8 != 0) {
                    i3 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    i9 = i8;
                    i3 |= btsVar2.e(slsVar) ? SelfTester_JCP.DECRYPT_CBC : SelfTester_JCP.DECRYPT_CFB;
                    if ((i3 & 38347923) == 38347922 || !btsVar2.E()) {
                        f530 f530Var7 = c530.a;
                        if (i11 != 0) {
                            f530Var2 = f530Var7;
                        }
                        com comVar = com.a;
                        if (i12 != 0) {
                            yn91Var2 = comVar;
                        }
                        DsAvatar$Form dsAvatar$Form4 = i4 == 0 ? DsAvatar$Form.Circle : dsAvatar$Form;
                        if (i5 != 0) {
                            dtmVar2 = null;
                        }
                        if (i6 != 0) {
                            num2 = null;
                        }
                        str2 = i7 == 0 ? null : str;
                        slsVar2 = i9 == 0 ? null : slsVar;
                        f530 l = ymb1.l(ljs0.m(f530Var7, dsAvatar$Size.getValue()), c(dsAvatar$Form4, dsAvatar$Size));
                        if (slsVar2 == null) {
                            f530Var7 = q791.d(f530Var7, false, null, null, slsVar2, 15);
                            f530Var3 = f530Var7;
                        } else {
                            f530Var3 = f530Var7;
                        }
                        sls slsVar4 = slsVar2;
                        f530 k = l.k(f530Var7);
                        btsVar2.e0(5004770);
                        Integer num4 = num2;
                        boolean z7 = (29360128 & i3) != 8388608;
                        Q = btsVar2.Q();
                        z = z7;
                        o430 o430Var2 = did.a;
                        if (!z || Q == o430Var2) {
                            i10 = i3;
                            Q = new wwb(str2, 22);
                            btsVar2.o0(Q);
                        } else {
                            i10 = i3;
                        }
                        btsVar2.t(false);
                        f530 a3 = fnq0.a(k, (tls) Q);
                        btsVar2.e0(495668784);
                        z2 = yn91Var2 instanceof fom;
                        String str6 = str2;
                        if (z2) {
                            z3 = z2;
                            dtmVar3 = dtmVar2;
                            z4 = false;
                        } else {
                            fom fomVar = (fom) yn91Var2;
                            if (fomVar instanceof eom) {
                                btsVar2.e0(-1814043630);
                                qnm qnmVar = qnm.a;
                                qnm.c.getClass();
                                qnm.h.getClass();
                                btsVar2.e0(1122028039);
                                z3 = z2;
                                dtmVar3 = dtmVar2;
                                Pair[] pairArr = {new Pair(Float.valueOf(0.0f), new ldc(qnm.c(btsVar2).j())), new Pair(Float.valueOf(0.5f), new ldc(qnm.c(btsVar2).k())), new Pair(Float.valueOf(1.0f), new ldc(qnm.c(btsVar2).l()))};
                                btsVar2.t(false);
                                a2 = aab1.b(a3, 2.0f, zoy0.B((Pair[]) Arrays.copyOf(pairArr, 3), 0.0f, 0.0f, 14), c(dsAvatar$Form4, dsAvatar$Size));
                                btsVar2.t(false);
                                z4 = false;
                                f4 = 2.0f;
                            } else {
                                z3 = z2;
                                dtmVar3 = dtmVar2;
                                if (!(fomVar instanceof dom)) {
                                    throw unr0.y(495670147, btsVar2, false);
                                }
                                btsVar2.e0(-1813743209);
                                long j3 = 0;
                                if (ldc.c(0L, ldc.m)) {
                                    qnm qnmVar2 = qnm.a;
                                    j3 = qnm.c(btsVar2).h();
                                }
                                qnm.c.getClass();
                                f4 = 2.0f;
                                a2 = aab1.a(2.0f, j3, a3, c(dsAvatar$Form4, dsAvatar$Size));
                                z4 = false;
                                btsVar2.t(false);
                            }
                            qnm.c.getClass();
                            a3 = aab1.a(f4, ldc.l, an91.k(a2, 4.0f), c(dsAvatar$Form4, dsAvatar$Size));
                        }
                        btsVar2.t(z4);
                        z910 d = pi6.d(x4c.C, z4);
                        int hashCode2 = Long.hashCode(btsVar2.T);
                        r1b0 o = btsVar2.o();
                        f530 d2 = b.d(btsVar2, f530Var2);
                        ohd.G1.getClass();
                        sls slsVar5 = d.b;
                        if (dmw0Var != null) {
                            cma1.b0();
                            throw null;
                        }
                        btsVar2.i0();
                        if (btsVar2.S) {
                            btsVar2.n(slsVar5);
                        } else {
                            btsVar2.r0();
                        }
                        wls wlsVar = d.f;
                        qje.W(btsVar2, wlsVar, d);
                        wls wlsVar2 = d.e;
                        qje.W(btsVar2, wlsVar2, o);
                        wls wlsVar3 = d.g;
                        if (btsVar2.S) {
                            f530Var4 = f530Var2;
                        } else {
                            f530Var4 = f530Var2;
                        }
                        b64.z(hashCode2, btsVar2, hashCode2, wlsVar3);
                        wls wlsVar4 = d.d;
                        qje.W(btsVar2, wlsVar4, d2);
                        f530 m = ljs0.m(f530Var3, dsAvatar$Size.getValue());
                        int i13 = hom.b[dsAvatar$Form4.ordinal()];
                        if (i13 == 1) {
                            dsAvatar$Form2 = dsAvatar$Form4;
                            byk0Var = cyk0.a;
                        } else {
                            if (i13 != 2) {
                                w511.b();
                                return;
                            }
                            float d3 = d(dsAvatar$Size);
                            if (z3) {
                                dsAvatar$Form2 = dsAvatar$Form4;
                                d3 = ((y7m) y6i0.a(new y7m(d3 - a), new y7m(0.0f))).a;
                            } else {
                                dsAvatar$Form2 = dsAvatar$Form4;
                            }
                            byk0Var = cyk0.c(d3);
                        }
                        f530 d4 = u3a1.d(ymb1.l(m, byk0Var), "AVATAR_ICON");
                        uo5 uo5Var = x4c.y;
                        z910 d5 = pi6.d(uo5Var, false);
                        int hashCode3 = Long.hashCode(btsVar2.T);
                        r1b0 o2 = btsVar2.o();
                        f530 d6 = b.d(btsVar2, a3);
                        btsVar2.i0();
                        if (btsVar2.S) {
                            btsVar2.n(slsVar5);
                        } else {
                            btsVar2.r0();
                        }
                        qje.W(btsVar2, wlsVar, d5);
                        qje.W(btsVar2, wlsVar2, o2);
                        if (btsVar2.S || !jl40.l(btsVar2.Q(), Integer.valueOf(hashCode3))) {
                            b64.z(hashCode3, btsVar2, hashCode3, wlsVar3);
                        }
                        qje.W(btsVar2, wlsVar4, d6);
                        if (un91Var instanceof znm) {
                            btsVar2.e0(28840624);
                            qnm qnmVar3 = qnm.a;
                            mgv mgvVar = x2b1.a;
                            if (mgvVar == null) {
                                lgv lgvVar = new lgv("AvatarNotLoaded", 56.0f, 56.0f, 56.0f, 56.0f, 0L, 0, false, 224);
                                a6t0 a6t0Var = new a6t0(rzo.f(4288125347L));
                                uq90 e = nnm.e(44.9208f, 50.3108f);
                                e.d(51.653f, 45.1971f, 56.0f, 37.1062f, 56.0f, 28.0f);
                                e.d(56.0f, 12.536f, 43.464f, 0.0f, 28.0f, 0.0f);
                                e.d(12.536f, 0.0f, 0.0f, 12.536f, 0.0f, 28.0f);
                                e.d(0.0f, 35.1231f, 2.65987f, 41.625f, 7.04055f, 46.5666f);
                                e.d(11.8972f, 45.4631f, 19.762f, 43.5195f, 22.0335f, 42.6666f);
                                e.d(22.7515f, 37.6666f, 22.0335f, 32.8395f, 22.0335f, 32.8395f);
                                e.d(22.0335f, 32.8395f, 21.2672f, 34.1013f, 19.479f, 32.4609f);
                                e.d(17.8186f, 30.6943f, 16.2859f, 22.4405f, 19.479f, 24.3333f);
                                e.d(19.479f, 24.3333f, 19.2236f, 19.3333f, 19.479f, 16.3333f);
                                e.d(19.3016f, 15.4799f, 18.8587f, 15.1339f, 18.4181f, 14.795f);
                                e.d(18.7515f, 14.4617f, 19.4181f, 14.3333f, 20.0848f, 14.4165f);
                                e.d(20.0848f, 14.4165f, 21.3565f, 12.6541f, 23.758f, 10.8016f);
                                e.d(24.7971f, 9.99998f, 26.6492f, 9.93079f, 28.0848f, 9.99998f);
                                e.d(34.0848f, 10.2891f, 35.8277f, 8.74084f, 35.8277f, 8.74084f);
                                e.d(35.8277f, 8.74084f, 36.7515f, 12.0f, 34.9336f, 12.6499f);
                                e.d(34.9336f, 12.6499f, 37.1689f, 12.9642f, 39.0848f, 12.3333f);
                                e.d(39.0848f, 12.3333f, 38.4181f, 14.3333f, 36.2109f, 14.4165f);
                                e.d(36.2109f, 14.4165f, 38.7579f, 15.055f, 39.7515f, 14.795f);
                                e.d(39.5773f, 15.8289f, 38.4181f, 16.3333f, 38.4181f, 16.3333f);
                                e.d(38.4181f, 16.3333f, 39.4181f, 16.6667f, 39.7515f, 17.6667f);
                                e.d(38.7515f, 17.6667f, 38.4181f, 18.0f, 38.0848f, 18.3333f);
                                e.o(20.6865f);
                                e.d(38.0848f, 20.6865f, 38.4298f, 20.7568f, 38.7636f, 20.6865f);
                                e.d(38.6758f, 21.442f, 38.5001f, 21.7406f, 37.8845f, 22.3344f);
                                e.d(37.8845f, 22.988f, 37.7908f, 24.2777f, 37.4881f, 24.7636f);
                                e.d(37.4881f, 24.7636f, 38.7653f, 23.628f, 39.1485f, 24.7636f);
                                e.d(39.6386f, 26.2163f, 37.3604f, 33.9752f, 35.8277f, 32.3347f);
                                e.d(35.8277f, 32.3347f, 33.6564f, 41.1677f, 29.0583f, 41.2939f);
                                e.d(25.3395f, 41.2939f, 24.5041f, 39.7222f, 24.359f, 39.0922f);
                                e.d(25.0848f, 44.6666f, 29.7515f, 44.6666f, 34.0848f, 43.6666f);
                                e.d(34.0848f, 43.6666f, 38.2203f, 45.648f, 44.9208f, 50.3108f);
                                e.c();
                                lgvVar.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 0, 0, 0, a6t0Var, null, "", e.a);
                                a6t0 a6t0Var2 = new a6t0(rzo.f(4288125347L));
                                uq90 e2 = nnm.e(28.0231f, 56.0f);
                                e2.d(27.9984f, 56.0f, 27.9736f, 56.0f, 27.949f, 56.0f);
                                e2.d(27.966f, 56.0f, 27.983f, 56.0f, 28.0f, 56.0f);
                                e2.d(28.0077f, 56.0f, 28.0154f, 56.0f, 28.0231f, 56.0f);
                                e2.c();
                                lgvVar.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 0, 0, 0, a6t0Var2, null, "", e2.a);
                                mgvVar = lgvVar.d();
                                x2b1.a = mgvVar;
                            }
                            dtmVar4 = dtmVar3;
                            str3 = str6;
                            f530Var5 = f530Var3;
                            f = 0.0f;
                            f2 = 2.0f;
                            p4v.b(ba91.c(mgvVar, btsVar2), null, d4, ldc.m, btsVar2, 3128, 0);
                            btsVar = btsVar2;
                            btsVar.t(false);
                        } else {
                            f530Var5 = f530Var3;
                            str3 = str6;
                            dtmVar4 = dtmVar3;
                            f = 0.0f;
                            f2 = 2.0f;
                            if (un91Var instanceof aom) {
                                btsVar2.e0(29181841);
                                p4v.b(((aom) un91Var).b, null, d4, ldc.m, btsVar2, 3120, 0);
                                btsVar = btsVar2;
                                btsVar.t(false);
                            } else {
                                if (!(un91Var instanceof bom)) {
                                    throw unr0.y(-691805987, btsVar2, false);
                                }
                                btsVar2.e0(29544293);
                                bom bomVar = (bom) un91Var;
                                ldc ldcVar = bomVar.d;
                                btsVar2.e0(-691784203);
                                if (ldcVar == null) {
                                    Long l2 = bomVar.c;
                                    btsVar2.e0(-328749045);
                                    btsVar2.e0(375380607);
                                    qnm qnmVar4 = qnm.a;
                                    str4 = str3;
                                    Object g = scc.g(new ldc(qnm.c(btsVar2).o()), new ldc(qnm.c(btsVar2).p()), new ldc(qnm.c(btsVar2).q()), new ldc(qnm.c(btsVar2).r()), new ldc(qnm.c(btsVar2).s()), new ldc(qnm.c(btsVar2).t()), new ldc(qnm.c(btsVar2).u()), new ldc(qnm.c(btsVar2).v()), new ldc(qnm.c(btsVar2).w()), new ldc(qnm.c(btsVar2).x()), new ldc(qnm.c(btsVar2).y()), new ldc(qnm.c(btsVar2).z()), new ldc(qnm.c(btsVar2).A()), new ldc(qnm.c(btsVar2).B()), new ldc(qnm.c(btsVar2).C()));
                                    btsVar2.e0(1849434622);
                                    Object Q3 = btsVar2.Q();
                                    if (Q3 == o430Var2) {
                                        btsVar2.o0(g);
                                    } else {
                                        g = Q3;
                                    }
                                    List list = (List) g;
                                    z5 = false;
                                    btsVar2.t(false);
                                    btsVar2.t(false);
                                    if (l2 != null) {
                                        j2 = Math.abs(l2.hashCode() % list.size());
                                        dtmVar5 = dtmVar4;
                                        o430Var = o430Var2;
                                    } else {
                                        o430Var = o430Var2;
                                        dtmVar5 = dtmVar4;
                                        j2 = y6i0.j(new d6w(0, scc.f(list), 1), Random.a);
                                    }
                                    j = ((ldc) list.get(j2)).a;
                                    btsVar2.t(false);
                                } else {
                                    dtmVar5 = dtmVar4;
                                    o430Var = o430Var2;
                                    str4 = str3;
                                    z5 = false;
                                    j = ldcVar.a;
                                }
                                btsVar2.t(z5);
                                switch (hom.a[dsAvatar$Size.ordinal()]) {
                                    case 1:
                                        btsVar2.e0(-691779242);
                                        qnm qnmVar5 = qnm.a;
                                        xtm b = ltm.b(btsVar2);
                                        b.getClass();
                                        btsVar2.e0(645728946);
                                        yom yomVar = b.a;
                                        ety0 ety0Var2 = new ety0(0L, yomVar.i, yomVar.X, null, (eyr) yomVar.P.invoke(btsVar2, Integer.valueOf(z5 ? 1 : 0)), null, yomVar.c0, 0, yomVar.z, null, null, 16645977);
                                        z5 = false;
                                        btsVar2.t(false);
                                        btsVar2.t(false);
                                        ety0Var = ety0Var2;
                                        f530 b2 = m4m0.b(d4, j, qke.q);
                                        z910 d7 = pi6.d(uo5Var, z5);
                                        long j4 = j;
                                        hashCode = Long.hashCode(btsVar2.T);
                                        r1b0 o3 = btsVar2.o();
                                        f530 d8 = b.d(btsVar2, b2);
                                        btsVar2.i0();
                                        if (btsVar2.S) {
                                            btsVar2.r0();
                                        } else {
                                            btsVar2.n(slsVar5);
                                        }
                                        qje.W(btsVar2, wlsVar, d7);
                                        qje.W(btsVar2, wlsVar2, o3);
                                        if (!btsVar2.S || !jl40.l(btsVar2.Q(), Integer.valueOf(hashCode))) {
                                            b64.z(hashCode, btsVar2, hashCode, wlsVar3);
                                        }
                                        qje.W(btsVar2, wlsVar4, d8);
                                        long j5 = ((double) rzo.M(j4)) <= 0.5d ? ldc.b : ldc.f;
                                        String str7 = bomVar.b;
                                        float f5 = !jl40.l(yn91Var2, comVar) ? 1.0f : 0.8f;
                                        vqy0.c(str7, u3a1.d(gza1.b(f530Var5, f5, f5), "AVATAR_TEXT"), j5, 0L, null, 0L, null, 0L, 0, false, 1, 0, ety0Var, btsVar2, 0, HProv.ALG_CLASS_DATA_ENCRYPT, 114680);
                                        btsVar = btsVar2;
                                        z6 = true;
                                        btsVar.t(true);
                                        btsVar.t(false);
                                        btsVar.t(z6);
                                        btsVar.e0(1829187304);
                                        if (dtmVar5 != null) {
                                            switch (hom.a[dsAvatar$Size.ordinal()]) {
                                                case 1:
                                                case 2:
                                                    qnm.d.getClass();
                                                    f3 = 4.0f;
                                                    break;
                                                case 3:
                                                    qnm.d.getClass();
                                                    f3 = f2;
                                                    break;
                                                case 4:
                                                    qnm.d.getClass();
                                                    f3 = 1.0f;
                                                    break;
                                                case 5:
                                                case 6:
                                                    f3 = f;
                                                    break;
                                                case 7:
                                                case 8:
                                                    qnm.d.getClass();
                                                    f3 = -4.0f;
                                                    break;
                                                default:
                                                    w511.b();
                                                    return;
                                            }
                                            dtmVar2 = dtmVar5;
                                            pw91.a(dtmVar2, DsStatus$Size.Sm, sm91.e(f530Var5, f3, f3), btsVar, ((i10 >> 15) & 14) | 48);
                                        } else {
                                            dtmVar2 = dtmVar5;
                                        }
                                        btsVar.t(false);
                                        btsVar.e0(1829207023);
                                        if (num4 != null && y7m.a(dsAvatar$Size.getValue(), DsAvatar$Size.M16.getValue()) > 0) {
                                            int intValue = num4.intValue();
                                            f530 a4 = cj6.a.a(f530Var5, x4c.w);
                                            btsVar.e0(1849434622);
                                            Q2 = btsVar.Q();
                                            if (Q2 == o430Var) {
                                                Q2 = new c0m(20);
                                                btsVar.o0(Q2);
                                            }
                                            btsVar.t(false);
                                            a(dsAvatar$Size, yn91Var2, intValue, fnq0.a(a4, (tls) Q2), btsVar, ((i10 >> 9) & 14) | ((i10 >> 3) & 112) | ((i10 >> 12) & 896));
                                        }
                                        btsVar.t(false);
                                        btsVar.t(true);
                                        num3 = num4;
                                        yn91Var3 = yn91Var2;
                                        slsVar3 = slsVar4;
                                        f530Var6 = f530Var4;
                                        dsAvatar$Form3 = dsAvatar$Form2;
                                        str5 = str4;
                                        break;
                                    case 2:
                                        btsVar2.e0(-691776842);
                                        qnm qnmVar6 = qnm.a;
                                        h = ltm.b(btsVar2).h(btsVar2);
                                        btsVar2.t(z5);
                                        ety0Var = h;
                                        f530 b22 = m4m0.b(d4, j, qke.q);
                                        z910 d72 = pi6.d(uo5Var, z5);
                                        long j42 = j;
                                        hashCode = Long.hashCode(btsVar2.T);
                                        r1b0 o32 = btsVar2.o();
                                        f530 d82 = b.d(btsVar2, b22);
                                        btsVar2.i0();
                                        if (btsVar2.S) {
                                        }
                                        qje.W(btsVar2, wlsVar, d72);
                                        qje.W(btsVar2, wlsVar2, o32);
                                        if (!btsVar2.S) {
                                            break;
                                        }
                                        b64.z(hashCode, btsVar2, hashCode, wlsVar3);
                                        qje.W(btsVar2, wlsVar4, d82);
                                        long j52 = ((double) rzo.M(j42)) <= 0.5d ? ldc.b : ldc.f;
                                        String str72 = bomVar.b;
                                        if (!jl40.l(yn91Var2, comVar)) {
                                        }
                                        vqy0.c(str72, u3a1.d(gza1.b(f530Var5, f5, f5), "AVATAR_TEXT"), j52, 0L, null, 0L, null, 0L, 0, false, 1, 0, ety0Var, btsVar2, 0, HProv.ALG_CLASS_DATA_ENCRYPT, 114680);
                                        btsVar = btsVar2;
                                        z6 = true;
                                        btsVar.t(true);
                                        btsVar.t(false);
                                        btsVar.t(z6);
                                        btsVar.e0(1829187304);
                                        if (dtmVar5 != null) {
                                        }
                                        btsVar.t(false);
                                        btsVar.e0(1829207023);
                                        if (num4 != null) {
                                            int intValue2 = num4.intValue();
                                            f530 a42 = cj6.a.a(f530Var5, x4c.w);
                                            btsVar.e0(1849434622);
                                            Q2 = btsVar.Q();
                                            if (Q2 == o430Var) {
                                            }
                                            btsVar.t(false);
                                            a(dsAvatar$Size, yn91Var2, intValue2, fnq0.a(a42, (tls) Q2), btsVar, ((i10 >> 9) & 14) | ((i10 >> 3) & 112) | ((i10 >> 12) & 896));
                                            break;
                                        }
                                        btsVar.t(false);
                                        btsVar.t(true);
                                        num3 = num4;
                                        yn91Var3 = yn91Var2;
                                        slsVar3 = slsVar4;
                                        f530Var6 = f530Var4;
                                        dsAvatar$Form3 = dsAvatar$Form2;
                                        str5 = str4;
                                        break;
                                    case 3:
                                        btsVar2.e0(-691774442);
                                        qnm qnmVar7 = qnm.a;
                                        h = ltm.b(btsVar2).h(btsVar2);
                                        btsVar2.t(z5);
                                        ety0Var = h;
                                        f530 b222 = m4m0.b(d4, j, qke.q);
                                        z910 d722 = pi6.d(uo5Var, z5);
                                        long j422 = j;
                                        hashCode = Long.hashCode(btsVar2.T);
                                        r1b0 o322 = btsVar2.o();
                                        f530 d822 = b.d(btsVar2, b222);
                                        btsVar2.i0();
                                        if (btsVar2.S) {
                                        }
                                        qje.W(btsVar2, wlsVar, d722);
                                        qje.W(btsVar2, wlsVar2, o322);
                                        if (!btsVar2.S) {
                                        }
                                        b64.z(hashCode, btsVar2, hashCode, wlsVar3);
                                        qje.W(btsVar2, wlsVar4, d822);
                                        long j522 = ((double) rzo.M(j422)) <= 0.5d ? ldc.b : ldc.f;
                                        String str722 = bomVar.b;
                                        if (!jl40.l(yn91Var2, comVar)) {
                                        }
                                        vqy0.c(str722, u3a1.d(gza1.b(f530Var5, f5, f5), "AVATAR_TEXT"), j522, 0L, null, 0L, null, 0L, 0, false, 1, 0, ety0Var, btsVar2, 0, HProv.ALG_CLASS_DATA_ENCRYPT, 114680);
                                        btsVar = btsVar2;
                                        z6 = true;
                                        btsVar.t(true);
                                        btsVar.t(false);
                                        btsVar.t(z6);
                                        btsVar.e0(1829187304);
                                        if (dtmVar5 != null) {
                                        }
                                        btsVar.t(false);
                                        btsVar.e0(1829207023);
                                        if (num4 != null) {
                                        }
                                        btsVar.t(false);
                                        btsVar.t(true);
                                        num3 = num4;
                                        yn91Var3 = yn91Var2;
                                        slsVar3 = slsVar4;
                                        f530Var6 = f530Var4;
                                        dsAvatar$Form3 = dsAvatar$Form2;
                                        str5 = str4;
                                        break;
                                    case 4:
                                        btsVar2.e0(-691772044);
                                        qnm qnmVar8 = qnm.a;
                                        h = ltm.b(btsVar2).c(btsVar2);
                                        btsVar2.t(z5);
                                        ety0Var = h;
                                        f530 b2222 = m4m0.b(d4, j, qke.q);
                                        z910 d7222 = pi6.d(uo5Var, z5);
                                        long j4222 = j;
                                        hashCode = Long.hashCode(btsVar2.T);
                                        r1b0 o3222 = btsVar2.o();
                                        f530 d8222 = b.d(btsVar2, b2222);
                                        btsVar2.i0();
                                        if (btsVar2.S) {
                                        }
                                        qje.W(btsVar2, wlsVar, d7222);
                                        qje.W(btsVar2, wlsVar2, o3222);
                                        if (!btsVar2.S) {
                                        }
                                        b64.z(hashCode, btsVar2, hashCode, wlsVar3);
                                        qje.W(btsVar2, wlsVar4, d8222);
                                        long j5222 = ((double) rzo.M(j4222)) <= 0.5d ? ldc.b : ldc.f;
                                        String str7222 = bomVar.b;
                                        if (!jl40.l(yn91Var2, comVar)) {
                                        }
                                        vqy0.c(str7222, u3a1.d(gza1.b(f530Var5, f5, f5), "AVATAR_TEXT"), j5222, 0L, null, 0L, null, 0L, 0, false, 1, 0, ety0Var, btsVar2, 0, HProv.ALG_CLASS_DATA_ENCRYPT, 114680);
                                        btsVar = btsVar2;
                                        z6 = true;
                                        btsVar.t(true);
                                        btsVar.t(false);
                                        btsVar.t(z6);
                                        btsVar.e0(1829187304);
                                        if (dtmVar5 != null) {
                                        }
                                        btsVar.t(false);
                                        btsVar.e0(1829207023);
                                        if (num4 != null) {
                                        }
                                        btsVar.t(false);
                                        btsVar.t(true);
                                        num3 = num4;
                                        yn91Var3 = yn91Var2;
                                        slsVar3 = slsVar4;
                                        f530Var6 = f530Var4;
                                        dsAvatar$Form3 = dsAvatar$Form2;
                                        str5 = str4;
                                        break;
                                    case 5:
                                        btsVar2.e0(-691769712);
                                        qnm qnmVar9 = qnm.a;
                                        h = ltm.b(btsVar2).o(btsVar2);
                                        btsVar2.t(z5);
                                        ety0Var = h;
                                        f530 b22222 = m4m0.b(d4, j, qke.q);
                                        z910 d72222 = pi6.d(uo5Var, z5);
                                        long j42222 = j;
                                        hashCode = Long.hashCode(btsVar2.T);
                                        r1b0 o32222 = btsVar2.o();
                                        f530 d82222 = b.d(btsVar2, b22222);
                                        btsVar2.i0();
                                        if (btsVar2.S) {
                                        }
                                        qje.W(btsVar2, wlsVar, d72222);
                                        qje.W(btsVar2, wlsVar2, o32222);
                                        if (!btsVar2.S) {
                                        }
                                        b64.z(hashCode, btsVar2, hashCode, wlsVar3);
                                        qje.W(btsVar2, wlsVar4, d82222);
                                        long j52222 = ((double) rzo.M(j42222)) <= 0.5d ? ldc.b : ldc.f;
                                        String str72222 = bomVar.b;
                                        if (!jl40.l(yn91Var2, comVar)) {
                                        }
                                        vqy0.c(str72222, u3a1.d(gza1.b(f530Var5, f5, f5), "AVATAR_TEXT"), j52222, 0L, null, 0L, null, 0L, 0, false, 1, 0, ety0Var, btsVar2, 0, HProv.ALG_CLASS_DATA_ENCRYPT, 114680);
                                        btsVar = btsVar2;
                                        z6 = true;
                                        btsVar.t(true);
                                        btsVar.t(false);
                                        btsVar.t(z6);
                                        btsVar.e0(1829187304);
                                        if (dtmVar5 != null) {
                                        }
                                        btsVar.t(false);
                                        btsVar.e0(1829207023);
                                        if (num4 != null) {
                                        }
                                        btsVar.t(false);
                                        btsVar.t(true);
                                        num3 = num4;
                                        yn91Var3 = yn91Var2;
                                        slsVar3 = slsVar4;
                                        f530Var6 = f530Var4;
                                        dsAvatar$Form3 = dsAvatar$Form2;
                                        str5 = str4;
                                        break;
                                    case 6:
                                        btsVar2.e0(-691767504);
                                        qnm qnmVar10 = qnm.a;
                                        h = ltm.b(btsVar2).m(btsVar2);
                                        btsVar2.t(z5);
                                        ety0Var = h;
                                        f530 b222222 = m4m0.b(d4, j, qke.q);
                                        z910 d722222 = pi6.d(uo5Var, z5);
                                        long j422222 = j;
                                        hashCode = Long.hashCode(btsVar2.T);
                                        r1b0 o322222 = btsVar2.o();
                                        f530 d822222 = b.d(btsVar2, b222222);
                                        btsVar2.i0();
                                        if (btsVar2.S) {
                                        }
                                        qje.W(btsVar2, wlsVar, d722222);
                                        qje.W(btsVar2, wlsVar2, o322222);
                                        if (!btsVar2.S) {
                                        }
                                        b64.z(hashCode, btsVar2, hashCode, wlsVar3);
                                        qje.W(btsVar2, wlsVar4, d822222);
                                        long j522222 = ((double) rzo.M(j422222)) <= 0.5d ? ldc.b : ldc.f;
                                        String str722222 = bomVar.b;
                                        if (!jl40.l(yn91Var2, comVar)) {
                                        }
                                        vqy0.c(str722222, u3a1.d(gza1.b(f530Var5, f5, f5), "AVATAR_TEXT"), j522222, 0L, null, 0L, null, 0L, 0, false, 1, 0, ety0Var, btsVar2, 0, HProv.ALG_CLASS_DATA_ENCRYPT, 114680);
                                        btsVar = btsVar2;
                                        z6 = true;
                                        btsVar.t(true);
                                        btsVar.t(false);
                                        btsVar.t(z6);
                                        btsVar.e0(1829187304);
                                        if (dtmVar5 != null) {
                                        }
                                        btsVar.t(false);
                                        btsVar.e0(1829207023);
                                        if (num4 != null) {
                                        }
                                        btsVar.t(false);
                                        btsVar.t(true);
                                        num3 = num4;
                                        yn91Var3 = yn91Var2;
                                        slsVar3 = slsVar4;
                                        f530Var6 = f530Var4;
                                        dsAvatar$Form3 = dsAvatar$Form2;
                                        str5 = str4;
                                        break;
                                    case 7:
                                        btsVar2.e0(-691765296);
                                        qnm qnmVar11 = qnm.a;
                                        h = ltm.b(btsVar2).k(btsVar2);
                                        btsVar2.t(z5);
                                        ety0Var = h;
                                        f530 b2222222 = m4m0.b(d4, j, qke.q);
                                        z910 d7222222 = pi6.d(uo5Var, z5);
                                        long j4222222 = j;
                                        hashCode = Long.hashCode(btsVar2.T);
                                        r1b0 o3222222 = btsVar2.o();
                                        f530 d8222222 = b.d(btsVar2, b2222222);
                                        btsVar2.i0();
                                        if (btsVar2.S) {
                                        }
                                        qje.W(btsVar2, wlsVar, d7222222);
                                        qje.W(btsVar2, wlsVar2, o3222222);
                                        if (!btsVar2.S) {
                                        }
                                        b64.z(hashCode, btsVar2, hashCode, wlsVar3);
                                        qje.W(btsVar2, wlsVar4, d8222222);
                                        long j5222222 = ((double) rzo.M(j4222222)) <= 0.5d ? ldc.b : ldc.f;
                                        String str7222222 = bomVar.b;
                                        if (!jl40.l(yn91Var2, comVar)) {
                                        }
                                        vqy0.c(str7222222, u3a1.d(gza1.b(f530Var5, f5, f5), "AVATAR_TEXT"), j5222222, 0L, null, 0L, null, 0L, 0, false, 1, 0, ety0Var, btsVar2, 0, HProv.ALG_CLASS_DATA_ENCRYPT, 114680);
                                        btsVar = btsVar2;
                                        z6 = true;
                                        btsVar.t(true);
                                        btsVar.t(false);
                                        btsVar.t(z6);
                                        btsVar.e0(1829187304);
                                        if (dtmVar5 != null) {
                                        }
                                        btsVar.t(false);
                                        btsVar.e0(1829207023);
                                        if (num4 != null) {
                                        }
                                        btsVar.t(false);
                                        btsVar.t(true);
                                        num3 = num4;
                                        yn91Var3 = yn91Var2;
                                        slsVar3 = slsVar4;
                                        f530Var6 = f530Var4;
                                        dsAvatar$Form3 = dsAvatar$Form2;
                                        str5 = str4;
                                        break;
                                    case 8:
                                        btsVar2.e0(-691763088);
                                        qnm qnmVar12 = qnm.a;
                                        h = ltm.b(btsVar2).k(btsVar2);
                                        btsVar2.t(z5);
                                        ety0Var = h;
                                        f530 b22222222 = m4m0.b(d4, j, qke.q);
                                        z910 d72222222 = pi6.d(uo5Var, z5);
                                        long j42222222 = j;
                                        hashCode = Long.hashCode(btsVar2.T);
                                        r1b0 o32222222 = btsVar2.o();
                                        f530 d82222222 = b.d(btsVar2, b22222222);
                                        btsVar2.i0();
                                        if (btsVar2.S) {
                                        }
                                        qje.W(btsVar2, wlsVar, d72222222);
                                        qje.W(btsVar2, wlsVar2, o32222222);
                                        if (!btsVar2.S) {
                                        }
                                        b64.z(hashCode, btsVar2, hashCode, wlsVar3);
                                        qje.W(btsVar2, wlsVar4, d82222222);
                                        long j52222222 = ((double) rzo.M(j42222222)) <= 0.5d ? ldc.b : ldc.f;
                                        String str72222222 = bomVar.b;
                                        if (!jl40.l(yn91Var2, comVar)) {
                                        }
                                        vqy0.c(str72222222, u3a1.d(gza1.b(f530Var5, f5, f5), "AVATAR_TEXT"), j52222222, 0L, null, 0L, null, 0L, 0, false, 1, 0, ety0Var, btsVar2, 0, HProv.ALG_CLASS_DATA_ENCRYPT, 114680);
                                        btsVar = btsVar2;
                                        z6 = true;
                                        btsVar.t(true);
                                        btsVar.t(false);
                                        btsVar.t(z6);
                                        btsVar.e0(1829187304);
                                        if (dtmVar5 != null) {
                                        }
                                        btsVar.t(false);
                                        btsVar.e0(1829207023);
                                        if (num4 != null) {
                                        }
                                        btsVar.t(false);
                                        btsVar.t(true);
                                        num3 = num4;
                                        yn91Var3 = yn91Var2;
                                        slsVar3 = slsVar4;
                                        f530Var6 = f530Var4;
                                        dsAvatar$Form3 = dsAvatar$Form2;
                                        str5 = str4;
                                        break;
                                    default:
                                        throw unr0.y(-691780984, btsVar2, z5);
                                }
                            }
                        }
                        dtmVar5 = dtmVar4;
                        o430Var = o430Var2;
                        str4 = str3;
                        z6 = true;
                        btsVar.t(z6);
                        btsVar.e0(1829187304);
                        if (dtmVar5 != null) {
                        }
                        btsVar.t(false);
                        btsVar.e0(1829207023);
                        if (num4 != null) {
                        }
                        btsVar.t(false);
                        btsVar.t(true);
                        num3 = num4;
                        yn91Var3 = yn91Var2;
                        slsVar3 = slsVar4;
                        f530Var6 = f530Var4;
                        dsAvatar$Form3 = dsAvatar$Form2;
                        str5 = str4;
                    } else {
                        btsVar2.Y();
                        str5 = str;
                        btsVar = btsVar2;
                        num3 = num2;
                        f530Var6 = f530Var2;
                        yn91Var3 = yn91Var2;
                        dsAvatar$Form3 = dsAvatar$Form;
                        slsVar3 = slsVar;
                    }
                    final dtm dtmVar6 = dtmVar2;
                    aii0 v = btsVar.v();
                    if (v != null) {
                        v.d = new wls() { // from class: gom
                            @Override // defpackage.wls
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                iom.b(f530.this, un91Var, yn91Var3, dsAvatar$Size, dsAvatar$Form3, dtmVar6, num3, str5, slsVar3, (fid) obj, vng.O(i | 1), i2);
                                return zy11.a;
                            }
                        };
                        return;
                    }
                    return;
                }
                i9 = i8;
                if ((i3 & 38347923) == 38347922) {
                }
                f530 f530Var72 = c530.a;
                if (i11 != 0) {
                }
                com comVar2 = com.a;
                if (i12 != 0) {
                }
                if (i4 == 0) {
                }
                if (i5 != 0) {
                }
                if (i6 != 0) {
                }
                if (i7 == 0) {
                }
                if (i9 == 0) {
                }
                f530 l3 = ymb1.l(ljs0.m(f530Var72, dsAvatar$Size.getValue()), c(dsAvatar$Form4, dsAvatar$Size));
                if (slsVar2 == null) {
                }
                sls slsVar42 = slsVar2;
                f530 k2 = l3.k(f530Var72);
                btsVar2.e0(5004770);
                Integer num42 = num2;
                if ((29360128 & i3) != 8388608) {
                }
                Q = btsVar2.Q();
                z = z7;
                o430 o430Var22 = did.a;
                if (z) {
                }
                i10 = i3;
                Q = new wwb(str2, 22);
                btsVar2.o0(Q);
                btsVar2.t(false);
                f530 a32 = fnq0.a(k2, (tls) Q);
                btsVar2.e0(495668784);
                z2 = yn91Var2 instanceof fom;
                String str62 = str2;
                if (z2) {
                }
                btsVar2.t(z4);
                z910 d9 = pi6.d(x4c.C, z4);
                int hashCode22 = Long.hashCode(btsVar2.T);
                r1b0 o4 = btsVar2.o();
                f530 d22 = b.d(btsVar2, f530Var2);
                ohd.G1.getClass();
                sls slsVar52 = d.b;
                if (dmw0Var != null) {
                }
            }
            dtmVar2 = dtmVar;
            i6 = i2 & 64;
            if (i6 != 0) {
            }
            i7 = i2 & 128;
            if (i7 != 0) {
            }
            i8 = i2 & 256;
            if (i8 != 0) {
            }
            i9 = i8;
            if ((i3 & 38347923) == 38347922) {
            }
            f530 f530Var722 = c530.a;
            if (i11 != 0) {
            }
            com comVar22 = com.a;
            if (i12 != 0) {
            }
            if (i4 == 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if (i7 == 0) {
            }
            if (i9 == 0) {
            }
            f530 l32 = ymb1.l(ljs0.m(f530Var722, dsAvatar$Size.getValue()), c(dsAvatar$Form4, dsAvatar$Size));
            if (slsVar2 == null) {
            }
            sls slsVar422 = slsVar2;
            f530 k22 = l32.k(f530Var722);
            btsVar2.e0(5004770);
            Integer num422 = num2;
            if ((29360128 & i3) != 8388608) {
            }
            Q = btsVar2.Q();
            z = z7;
            o430 o430Var222 = did.a;
            if (z) {
            }
            i10 = i3;
            Q = new wwb(str2, 22);
            btsVar2.o0(Q);
            btsVar2.t(false);
            f530 a322 = fnq0.a(k22, (tls) Q);
            btsVar2.e0(495668784);
            z2 = yn91Var2 instanceof fom;
            String str622 = str2;
            if (z2) {
            }
            btsVar2.t(z4);
            z910 d92 = pi6.d(x4c.C, z4);
            int hashCode222 = Long.hashCode(btsVar2.T);
            r1b0 o42 = btsVar2.o();
            f530 d222 = b.d(btsVar2, f530Var2);
            ohd.G1.getClass();
            sls slsVar522 = d.b;
            if (dmw0Var != null) {
            }
        }
        yn91Var2 = yn91Var;
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
        }
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        i5 = i2 & 32;
        if (i5 == 0) {
        }
        dtmVar2 = dtmVar;
        i6 = i2 & 64;
        if (i6 != 0) {
        }
        i7 = i2 & 128;
        if (i7 != 0) {
        }
        i8 = i2 & 256;
        if (i8 != 0) {
        }
        i9 = i8;
        if ((i3 & 38347923) == 38347922) {
        }
        f530 f530Var7222 = c530.a;
        if (i11 != 0) {
        }
        com comVar222 = com.a;
        if (i12 != 0) {
        }
        if (i4 == 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if (i7 == 0) {
        }
        if (i9 == 0) {
        }
        f530 l322 = ymb1.l(ljs0.m(f530Var7222, dsAvatar$Size.getValue()), c(dsAvatar$Form4, dsAvatar$Size));
        if (slsVar2 == null) {
        }
        sls slsVar4222 = slsVar2;
        f530 k222 = l322.k(f530Var7222);
        btsVar2.e0(5004770);
        Integer num4222 = num2;
        if ((29360128 & i3) != 8388608) {
        }
        Q = btsVar2.Q();
        z = z7;
        o430 o430Var2222 = did.a;
        if (z) {
        }
        i10 = i3;
        Q = new wwb(str2, 22);
        btsVar2.o0(Q);
        btsVar2.t(false);
        f530 a3222 = fnq0.a(k222, (tls) Q);
        btsVar2.e0(495668784);
        z2 = yn91Var2 instanceof fom;
        String str6222 = str2;
        if (z2) {
        }
        btsVar2.t(z4);
        z910 d922 = pi6.d(x4c.C, z4);
        int hashCode2222 = Long.hashCode(btsVar2.T);
        r1b0 o422 = btsVar2.o();
        f530 d2222 = b.d(btsVar2, f530Var2);
        ohd.G1.getClass();
        sls slsVar5222 = d.b;
        if (dmw0Var != null) {
        }
    }

    public static final byk0 c(DsAvatar$Form dsAvatar$Form, DsAvatar$Size dsAvatar$Size) {
        int i = hom.b[dsAvatar$Form.ordinal()];
        if (i == 1) {
            return cyk0.a;
        }
        if (i == 2) {
            return cyk0.c(d(dsAvatar$Size));
        }
        w511.b();
        return null;
    }

    public static final float d(DsAvatar$Size dsAvatar$Size) {
        switch (hom.a[dsAvatar$Size.ordinal()]) {
            case 1:
            case 2:
                qnm.e.getClass();
                return 8.0f;
            case 3:
                qnm.e.getClass();
                return 10.0f;
            case 4:
                qnm.e.getClass();
                return 12.0f;
            case 5:
            case 6:
                qnm.e.getClass();
                return 16.0f;
            case 7:
            case 8:
                qnm.e.getClass();
                return 24.0f;
            default:
                w511.b();
                return 0.0f;
        }
    }
}
