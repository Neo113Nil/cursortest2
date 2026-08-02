package yads;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes10.dex */
public final class jf0 implements oa3 {
    public final int a;
    public final List b;

    public jf0() {
        this(s51.g());
    }

    public final qa3 a(int i, na3 na3Var) {
        if (i != 2) {
            if (i == 3 || i == 4) {
                return new jd2(new ow1(na3Var.a));
            }
            if (i == 21) {
                return new jd2(new z21());
            }
            if (i == 27) {
                if (a(4)) {
                    return null;
                }
                return new jd2(new m01(new ry2(a(na3Var)), a(1), a(8)));
            }
            if (i == 36) {
                return new jd2(new o01(new ry2(a(na3Var))));
            }
            if (i == 89) {
                return new jd2(new ql0(na3Var.b));
            }
            if (i != 138) {
                if (i == 172) {
                    return new jd2(new j0(na3Var.a));
                }
                if (i == 257) {
                    return new wx2(new vc2("application/vnd.dvb.ait"));
                }
                if (i == 134) {
                    if (a(16)) {
                        return null;
                    }
                    return new wx2(new vc2(MimeTypes.APPLICATION_SCTE35));
                }
                if (i != 135) {
                    switch (i) {
                        case 15:
                            if (a(2)) {
                                return null;
                            }
                            return new jd2(new qc(na3Var.a, false));
                        case 16:
                            return new jd2(new j01(new kc3(a(na3Var))));
                        case 17:
                            if (a(2)) {
                                return null;
                            }
                            return new jd2(new ue1(na3Var.a));
                        default:
                            switch (i) {
                                case 128:
                                    break;
                                case 129:
                                    break;
                                case 130:
                                    if (!a(64)) {
                                        return null;
                                    }
                                    break;
                                default:
                                    return null;
                            }
                    }
                }
                return new jd2(new g0(na3Var.a));
            }
            return new jd2(new xk0(na3Var.a));
        }
        return new jd2(new g01(new kc3(a(na3Var))));
    }

    public jf0(tn2 tn2Var) {
        this.a = 0;
        this.b = tn2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v4 */
    public final List a(na3 na3Var) {
        String str;
        int i;
        List list;
        if (a(32)) {
            return this.b;
        }
        kc2 kc2Var = new kc2(na3Var.c);
        ArrayList arrayList = this.b;
        while (kc2Var.c - kc2Var.b > 0) {
            int m = kc2Var.m();
            int m2 = kc2Var.b + kc2Var.m();
            if (m == 134) {
                arrayList = new ArrayList();
                int m3 = kc2Var.m() & 31;
                for (int i2 = 0; i2 < m3; i2++) {
                    String a = kc2Var.a(3, bu.c);
                    int m4 = kc2Var.m();
                    boolean z = (m4 & 128) != 0;
                    if (z) {
                        i = m4 & 63;
                        str = MimeTypes.APPLICATION_CEA708;
                    } else {
                        str = MimeTypes.APPLICATION_CEA608;
                        i = 1;
                    }
                    byte m5 = (byte) kc2Var.m();
                    kc2Var.e(kc2Var.b + 1);
                    if (z) {
                        list = Collections.singletonList((m5 & 64) != 0 ? new byte[]{1} : new byte[]{0});
                    } else {
                        list = null;
                    }
                    mx0 mx0Var = new mx0();
                    mx0Var.k = str;
                    mx0Var.c = a;
                    mx0Var.C = i;
                    mx0Var.m = list;
                    arrayList.add(new nx0(mx0Var));
                }
            }
            kc2Var.e(m2);
            arrayList = arrayList;
        }
        return arrayList;
    }

    public final boolean a(int i) {
        return (i & this.a) != 0;
    }
}
