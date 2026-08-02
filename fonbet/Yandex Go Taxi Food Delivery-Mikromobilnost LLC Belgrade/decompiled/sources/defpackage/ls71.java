package defpackage;

import java.util.Arrays;
import yads.t31;
import yads.wk2;

/* loaded from: classes7.dex */
public final class ls71 implements u281 {
    public final wk2 a;
    public final int b;

    public ls71(int i, wk2 wk2Var) {
        this.b = i;
        this.a = wk2Var;
    }

    public static ls71 a(int i, dl81 dl81Var) {
        u281 rn81Var;
        String str;
        int i2 = 4;
        ela1.a(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i3 = dl81Var.c;
        int i4 = 0;
        int i5 = -2;
        int i6 = 0;
        while (dl81Var.c - dl81Var.b > 8) {
            int h = dl81Var.h();
            int h2 = dl81Var.b + dl81Var.h();
            dl81Var.k(h2);
            if (h == 1414744396) {
                rn81Var = a(dl81Var.h(), dl81Var);
            } else {
                u281 u281Var = null;
                if (h != 1718776947) {
                    if (h == 1751742049) {
                        int h3 = dl81Var.h();
                        dl81Var.m(dl81Var.b + 8);
                        int h4 = dl81Var.h();
                        int h5 = dl81Var.h();
                        dl81Var.m(dl81Var.b + i2);
                        dl81Var.h();
                        dl81Var.m(dl81Var.b + 12);
                        u281Var = new rf81(h3, h4, h5);
                    } else if (h == 1752331379) {
                        int h6 = dl81Var.h();
                        dl81Var.m(dl81Var.b + 12);
                        dl81Var.h();
                        int h7 = dl81Var.h();
                        int h8 = dl81Var.h();
                        dl81Var.m(dl81Var.b + i2);
                        int h9 = dl81Var.h();
                        int h10 = dl81Var.h();
                        dl81Var.m(dl81Var.b + 8);
                        u281Var = new wi81(h6, h7, h8, h9, h10);
                    } else if (h == 1852994675) {
                        rn81Var = new nw81(dl81Var.b(dl81Var.c - dl81Var.b, md81.c));
                    }
                    rn81Var = u281Var;
                } else if (i5 == 2) {
                    dl81Var.m(dl81Var.b + i2);
                    int h11 = dl81Var.h();
                    int h12 = dl81Var.h();
                    dl81Var.m(dl81Var.b + i2);
                    switch (dl81Var.h()) {
                        case 808802372:
                        case 877677894:
                        case 1145656883:
                        case 1145656920:
                        case 1482049860:
                        case 1684633208:
                        case 2021026148:
                            str = "video/mp4v-es";
                            break;
                        case 826496577:
                        case 828601953:
                        case 875967048:
                            str = "video/avc";
                            break;
                        case 842289229:
                            str = "video/mp42";
                            break;
                        case 859066445:
                            str = "video/mp43";
                            break;
                        case 1196444237:
                        case 1735420525:
                            str = "video/mjpeg";
                            break;
                        default:
                            str = null;
                            break;
                    }
                    if (str == null) {
                        nba1.e();
                        rn81Var = u281Var;
                    } else {
                        da81 da81Var = new da81();
                        da81Var.p = h11;
                        da81Var.q = h12;
                        da81Var.k = str;
                        rn81Var = new rn81(new qd81(da81Var));
                    }
                } else {
                    if (i5 == 1) {
                        int n = dl81Var.n();
                        String str2 = n != 1 ? n != 85 ? n != 255 ? n != 8192 ? n != 8193 ? null : "audio/vnd.dts" : "audio/ac3" : "audio/mp4a-latm" : "audio/mpeg" : "audio/raw";
                        if (str2 == null) {
                            nba1.e();
                        } else {
                            int n2 = dl81Var.n();
                            int h13 = dl81Var.h();
                            dl81Var.m(dl81Var.b + 6);
                            int s = rf71.s(dl81Var.x());
                            int n3 = dl81Var.n();
                            byte[] bArr = new byte[n3];
                            dl81Var.d(i4, n3, bArr);
                            da81 da81Var2 = new da81();
                            da81Var2.k = str2;
                            da81Var2.x = n2;
                            da81Var2.y = h13;
                            if ("audio/raw".equals(str2) && s != 0) {
                                da81Var2.z = s;
                            }
                            if ("audio/mp4a-latm".equals(str2) && n3 > 0) {
                                da81Var2.m = t31.n(bArr);
                            }
                            rn81Var = new rn81(new qd81(da81Var2));
                        }
                    } else {
                        rf71.x(i5);
                        nba1.e();
                    }
                    rn81Var = u281Var;
                }
            }
            if (rn81Var != null) {
                if (rn81Var.getType() == 1752331379) {
                    int i7 = ((wi81) rn81Var).a;
                    if (i7 == 1935960438) {
                        i5 = 2;
                    } else if (i7 == 1935963489) {
                        i5 = 1;
                    } else if (i7 != 1937012852) {
                        Integer.toHexString(i7);
                        nba1.e();
                        i5 = -1;
                    } else {
                        i5 = 3;
                    }
                }
                int i8 = i6 + 1;
                if (objArr.length < i8) {
                    objArr = Arrays.copyOf(objArr, jr71.a(objArr.length, i8));
                }
                objArr[i6] = rn81Var;
                i6 = i8;
            }
            dl81Var.m(h2);
            dl81Var.k(i3);
            i2 = 4;
            i4 = 0;
        }
        return new ls71(i, t31.p(i6, objArr));
    }

    public final u281 b(Class cls) {
        p481 listIterator = this.a.listIterator(0);
        while (listIterator.hasNext()) {
            u281 u281Var = (u281) listIterator.next();
            if (u281Var.getClass() == cls) {
                return u281Var;
            }
        }
        return null;
    }

    @Override // defpackage.u281
    public final int getType() {
        return this.b;
    }
}
