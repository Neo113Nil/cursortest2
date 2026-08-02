package yads;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Arrays;

/* loaded from: classes10.dex */
public final class mg1 implements vl {
    public final s51 a;
    public final int b;

    public mg1(int i, tn2 tn2Var) {
        this.b = i;
        this.a = tn2Var;
    }

    public final vl a(Class cls) {
        p51 listIterator = this.a.listIterator(0);
        while (listIterator.hasNext()) {
            vl vlVar = (vl) listIterator.next();
            if (vlVar.getClass() == cls) {
                return vlVar;
            }
        }
        return null;
    }

    @Override // yads.vl
    public final int getType() {
        return this.b;
    }

    public static mg1 a(int i, kc2 kc2Var) {
        String str;
        vl x43Var;
        String str2;
        String str3;
        int i2 = 4;
        kx.a(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i3 = kc2Var.c;
        int i4 = 0;
        int i5 = -2;
        int i6 = 0;
        while (kc2Var.c - kc2Var.b > 8) {
            int d = kc2Var.d();
            int d2 = kc2Var.b + kc2Var.d();
            kc2Var.d(d2);
            if (d == 1414744396) {
                x43Var = a(kc2Var.d(), kc2Var);
            } else {
                vl vlVar = null;
                if (d != 1718776947) {
                    if (d == 1751742049) {
                        int d3 = kc2Var.d();
                        kc2Var.e(kc2Var.b + 8);
                        int d4 = kc2Var.d();
                        int d5 = kc2Var.d();
                        kc2Var.e(kc2Var.b + i2);
                        kc2Var.d();
                        kc2Var.e(kc2Var.b + 12);
                        vlVar = new zl(d3, d4, d5);
                    } else if (d == 1752331379) {
                        int d6 = kc2Var.d();
                        kc2Var.e(kc2Var.b + 12);
                        kc2Var.d();
                        int d7 = kc2Var.d();
                        int d8 = kc2Var.d();
                        kc2Var.e(kc2Var.b + i2);
                        int d9 = kc2Var.d();
                        int d10 = kc2Var.d();
                        kc2Var.e(kc2Var.b + 8);
                        vlVar = new am(d6, d7, d8, d9, d10);
                    } else if (d == 1852994675) {
                        x43Var = new a53(kc2Var.a(kc2Var.c - kc2Var.b, bu.c));
                    }
                    x43Var = vlVar;
                } else if (i5 == 2) {
                    kc2Var.e(kc2Var.b + i2);
                    int d11 = kc2Var.d();
                    int d12 = kc2Var.d();
                    kc2Var.e(kc2Var.b + i2);
                    int d13 = kc2Var.d();
                    switch (d13) {
                        case 808802372:
                        case 877677894:
                        case 1145656883:
                        case 1145656920:
                        case 1482049860:
                        case 1684633208:
                        case 2021026148:
                            str2 = MimeTypes.VIDEO_MP4V;
                            str3 = str2;
                            break;
                        case 826496577:
                        case 828601953:
                        case 875967048:
                            str2 = "video/avc";
                            str3 = str2;
                            break;
                        case 842289229:
                            str2 = "video/mp42";
                            str3 = str2;
                            break;
                        case 859066445:
                            str2 = "video/mp43";
                            str3 = str2;
                            break;
                        case 1196444237:
                        case 1735420525:
                            str2 = "video/mjpeg";
                            str3 = str2;
                            break;
                        default:
                            str3 = null;
                            break;
                    }
                    if (str3 == null) {
                        lg1.a("Ignoring track with unsupported compression ", d13, "StreamFormatChunk");
                        x43Var = vlVar;
                    } else {
                        mx0 mx0Var = new mx0();
                        mx0Var.p = d11;
                        mx0Var.q = d12;
                        mx0Var.k = str3;
                        x43Var = new x43(new nx0(mx0Var));
                    }
                } else {
                    if (i5 == 1) {
                        int h = kc2Var.h();
                        if (h == 1) {
                            str = MimeTypes.AUDIO_RAW;
                        } else if (h == 85) {
                            str = MimeTypes.AUDIO_MPEG;
                        } else if (h == 255) {
                            str = "audio/mp4a-latm";
                        } else if (h != 8192) {
                            str = h != 8193 ? null : MimeTypes.AUDIO_DTS;
                        } else {
                            str = MimeTypes.AUDIO_AC3;
                        }
                        if (str == null) {
                            lg1.a("Ignoring track with unsupported format tag ", h, "StreamFormatChunk");
                        } else {
                            int h2 = kc2Var.h();
                            int d14 = kc2Var.d();
                            kc2Var.e(kc2Var.b + 6);
                            int b = mc3.b(kc2Var.r());
                            int h3 = kc2Var.h();
                            byte[] bArr = new byte[h3];
                            kc2Var.a(bArr, i4, h3);
                            mx0 mx0Var2 = new mx0();
                            mx0Var2.k = str;
                            mx0Var2.x = h2;
                            mx0Var2.y = d14;
                            if (MimeTypes.AUDIO_RAW.equals(str) && b != 0) {
                                mx0Var2.z = b;
                            }
                            if ("audio/mp4a-latm".equals(str) && h3 > 0) {
                                mx0Var2.m = s51.a(bArr);
                            }
                            x43Var = new x43(new nx0(mx0Var2));
                        }
                    } else {
                        ji1.d("StreamFormatChunk", "Ignoring strf box for unsupported track type: " + mc3.d(i5));
                    }
                    x43Var = vlVar;
                }
            }
            if (x43Var != null) {
                if (x43Var.getType() == 1752331379) {
                    am amVar = (am) x43Var;
                    int i7 = amVar.a;
                    if (i7 == 1935960438) {
                        i5 = 2;
                    } else if (i7 == 1935963489) {
                        i5 = 1;
                    } else if (i7 != 1937012852) {
                        ji1.d("AviStreamHeaderChunk", "Found unsupported streamType fourCC: " + Integer.toHexString(amVar.a));
                        i5 = -1;
                    } else {
                        i5 = 3;
                    }
                }
                int i8 = i6 + 1;
                if (objArr.length < i8) {
                    objArr = Arrays.copyOf(objArr, l51.a(objArr.length, i8));
                }
                objArr[i6] = x43Var;
                i6 = i8;
            }
            kc2Var.e(d2);
            kc2Var.d(i3);
            i2 = 4;
            i4 = 0;
        }
        return new mg1(i, s51.b(i6, objArr));
    }
}
