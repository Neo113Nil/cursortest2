package yads;

import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import xsna.atv0;
import xsna.cgn;

/* loaded from: classes10.dex */
public abstract class ek {
    public static final byte[] a = mc3.c("OpusHead");

    public static zj a(int i, kc2 kc2Var) {
        kc2Var.e(i + 12);
        kc2Var.e(kc2Var.b + 1);
        a(kc2Var);
        kc2Var.e(kc2Var.b + 2);
        int m = kc2Var.m();
        if ((m & 128) != 0) {
            kc2Var.e(kc2Var.b + 2);
        }
        if ((m & 64) != 0) {
            kc2Var.e(kc2Var.b + kc2Var.m());
        }
        if ((m & 32) != 0) {
            kc2Var.e(kc2Var.b + 2);
        }
        kc2Var.e(kc2Var.b + 1);
        a(kc2Var);
        String a2 = iu1.a(kc2Var.m());
        if (MimeTypes.AUDIO_MPEG.equals(a2) || MimeTypes.AUDIO_DTS.equals(a2) || MimeTypes.AUDIO_DTS_HD.equals(a2)) {
            return new zj(a2, null, -1L, -1L);
        }
        kc2Var.e(kc2Var.b + 4);
        long n = kc2Var.n();
        long n2 = kc2Var.n();
        kc2Var.e(kc2Var.b + 1);
        int a3 = a(kc2Var);
        byte[] bArr = new byte[a3];
        kc2Var.a(bArr, 0, a3);
        return new zj(a2, bArr, n2 > 0 ? n2 : -1L, n > 0 ? n : -1L);
    }

    public static int a(kc2 kc2Var) {
        int m = kc2Var.m();
        int i = m & 127;
        while ((m & 128) == 128) {
            m = kc2Var.m();
            i = (i << 7) | (m & 127);
        }
        return i;
    }

    public static Pair a(int i, int i2, kc2 kc2Var) {
        Integer num;
        j83 j83Var;
        Pair create;
        int i3;
        int i4;
        Integer num2;
        boolean z;
        int i5 = kc2Var.b;
        while (i5 - i < i2) {
            kc2Var.e(i5);
            int b = kc2Var.b();
            rq0.a("childAtomSize must be positive", b > 0);
            if (kc2Var.b() == 1936289382) {
                int i6 = i5 + 8;
                int i7 = 0;
                int i8 = -1;
                Integer num3 = null;
                String str = null;
                while (i6 - i5 < b) {
                    kc2Var.e(i6);
                    int b2 = kc2Var.b();
                    int b3 = kc2Var.b();
                    if (b3 == 1718775137) {
                        num3 = Integer.valueOf(kc2Var.b());
                    } else if (b3 == 1935894637) {
                        kc2Var.e(kc2Var.b + 4);
                        str = kc2Var.a(4, bu.c);
                    } else if (b3 == 1935894633) {
                        i8 = i6;
                        i7 = b2;
                    }
                    i6 += b2;
                }
                byte[] bArr = null;
                if (C.CENC_TYPE_cenc.equals(str) || C.CENC_TYPE_cbc1.equals(str) || C.CENC_TYPE_cens.equals(str) || C.CENC_TYPE_cbcs.equals(str)) {
                    rq0.a("frma atom is mandatory", num3 != null);
                    rq0.a("schi atom is mandatory", i8 != -1);
                    int i9 = i8 + 8;
                    while (true) {
                        if (i9 - i8 >= i7) {
                            num = num3;
                            j83Var = null;
                            break;
                        }
                        kc2Var.e(i9);
                        int b4 = kc2Var.b();
                        if (kc2Var.b() == 1952804451) {
                            int b5 = (kc2Var.b() >> 24) & 255;
                            kc2Var.e(kc2Var.b + 1);
                            if (b5 == 0) {
                                kc2Var.e(kc2Var.b + 1);
                                i4 = 0;
                                i3 = 0;
                            } else {
                                int m = kc2Var.m();
                                i3 = m & 15;
                                i4 = (m & PsExtractor.VIDEO_STREAM_MASK) >> 4;
                            }
                            if (kc2Var.m() == 1) {
                                num2 = num3;
                                z = true;
                            } else {
                                num2 = num3;
                                z = false;
                            }
                            int m2 = kc2Var.m();
                            byte[] bArr2 = new byte[16];
                            kc2Var.a(bArr2, 0, 16);
                            if (z && m2 == 0) {
                                int m3 = kc2Var.m();
                                byte[] bArr3 = new byte[m3];
                                kc2Var.a(bArr3, 0, m3);
                                bArr = bArr3;
                            }
                            num = num2;
                            j83Var = new j83(z, str, m2, bArr2, i4, i3, bArr);
                        } else {
                            i9 += b4;
                        }
                    }
                    rq0.a("tenc atom is mandatory", j83Var != null);
                    int i10 = mc3.a;
                    create = Pair.create(num, j83Var);
                } else {
                    create = null;
                }
                if (create != null) {
                    return create;
                }
            }
            i5 += b;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:149:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0694  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static bk a(kc2 kc2Var, int i, int i2, String str, lk0 lk0Var, boolean z) {
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z2;
        lk0 lk0Var2;
        String str2;
        int i7;
        lk0 lk0Var3;
        int i8;
        bk bkVar;
        bk bkVar2;
        List list;
        byte[] bArr;
        int i9;
        String str3;
        float f;
        int i10;
        int i11;
        int i12;
        int i13;
        List list2;
        String str4;
        String str5;
        int i14;
        int r;
        int b;
        int i15;
        int i16;
        lk0 lk0Var4;
        String str6;
        int i17;
        int i18;
        String str7;
        int i19;
        zj zjVar;
        List list3;
        String str8;
        int i20;
        List list4;
        int i21;
        int i22;
        int i23;
        String str9;
        List a2;
        String str10;
        String str11;
        tn2 a3;
        String str12 = str;
        lk0 lk0Var5 = lk0Var;
        kc2Var.e(12);
        int b2 = kc2Var.b();
        bk bkVar3 = new bk(b2);
        int i24 = 0;
        while (i24 < b2) {
            int i25 = kc2Var.b;
            int b3 = kc2Var.b();
            String str13 = "childAtomSize must be positive";
            rq0.a("childAtomSize must be positive", b3 > 0);
            int b4 = kc2Var.b();
            int i26 = 4;
            int i27 = 3;
            int i28 = 6;
            int i29 = 16;
            if (b4 == 1635148593 || b4 == 1635148595 || b4 == 1701733238 || b4 == 1831958048 || b4 == 1836070006 || b4 == 1752589105 || b4 == 1751479857 || b4 == 1932670515 || b4 == 1211250227 || b4 == 1987063864 || b4 == 1987063865 || b4 == 1635135537 || b4 == 1685479798 || b4 == 1685479729 || b4 == 1685481573 || b4 == 1685481521) {
                i3 = b2;
                i4 = i24;
                kc2Var.e(i25 + 16);
                kc2Var.e(kc2Var.b + 16);
                int r2 = kc2Var.r();
                int r3 = kc2Var.r();
                kc2Var.e(kc2Var.b + 50);
                int i30 = kc2Var.b;
                if (b4 == 1701733238) {
                    i5 = i25;
                    i6 = b3;
                    Pair a4 = a(i5, i6, kc2Var);
                    if (a4 != null) {
                        b4 = ((Integer) a4.first).intValue();
                        if (lk0Var == null) {
                            lk0Var2 = null;
                        } else {
                            String str14 = ((j83) a4.second).b;
                            if (mc3.a(lk0Var.d, str14)) {
                                lk0Var2 = lk0Var;
                            } else {
                                z2 = false;
                                lk0Var2 = new lk0(str14, false, lk0Var.b);
                                bkVar3.a[i4] = (j83) a4.second;
                            }
                        }
                        z2 = false;
                        bkVar3.a[i4] = (j83) a4.second;
                    } else {
                        z2 = false;
                        lk0Var2 = lk0Var;
                    }
                    kc2Var.e(i30);
                } else {
                    i5 = i25;
                    i6 = b3;
                    z2 = false;
                    lk0Var2 = lk0Var;
                }
                if (b4 == 1831958048) {
                    str2 = MimeTypes.VIDEO_MPEG;
                } else {
                    str2 = b4 == 1211250227 ? MimeTypes.VIDEO_H263 : null;
                }
                int i31 = i30;
                i7 = i5;
                String str15 = str2;
                float f2 = 1.0f;
                boolean z3 = z2;
                List list5 = null;
                String str16 = null;
                byte[] bArr2 = null;
                int i32 = -1;
                ByteBuffer byteBuffer = null;
                zj zjVar2 = null;
                int i33 = -1;
                int i34 = -1;
                int i35 = -1;
                while (true) {
                    if (i31 - i7 >= i6) {
                        lk0Var3 = lk0Var2;
                        break;
                    }
                    kc2Var.e(i31);
                    int i36 = kc2Var.b;
                    int i37 = i31;
                    int b5 = kc2Var.b();
                    lk0Var3 = lk0Var2;
                    if (b5 == 0 && kc2Var.b - i7 == i6) {
                        break;
                    }
                    rq0.a(str13, b5 > 0);
                    int b6 = kc2Var.b();
                    int i38 = i6;
                    if (b6 == 1635148611) {
                        rq0.a(null, str15 == null);
                        kc2Var.e(i36 + 8);
                        ul a5 = ul.a(kc2Var);
                        list2 = a5.a;
                        bkVar3.c = a5.b;
                        if (!z3) {
                            f2 = a5.e;
                        }
                        str4 = a5.f;
                        str5 = "video/avc";
                    } else if (b6 == 1752589123) {
                        rq0.a(null, str15 == null);
                        kc2Var.e(i36 + 8);
                        x01 a6 = x01.a(kc2Var);
                        list2 = a6.a;
                        bkVar3.c = a6.b;
                        if (!z3) {
                            f2 = a6.c;
                        }
                        str4 = a6.d;
                        str5 = "video/hevc";
                    } else {
                        if (b6 == 1685480259 || b6 == 1685485123) {
                            bkVar2 = bkVar3;
                            list = list5;
                            bArr = bArr2;
                            i9 = b4;
                            str3 = str13;
                            f = f2;
                            i10 = i32;
                            i11 = i27;
                            i12 = i28;
                            i13 = i29;
                            ej0 a7 = ej0.a(kc2Var);
                            if (a7 != null) {
                                str16 = a7.a;
                                str15 = "video/dolby-vision";
                            }
                        } else {
                            if (b6 == 1987076931) {
                                rq0.a(null, str15 == null);
                                bkVar2 = bkVar3;
                                i9 = b4;
                                str3 = str13;
                                f = f2;
                                str15 = b4 == 1987063864 ? MimeTypes.VIDEO_VP8 : MimeTypes.VIDEO_VP9;
                            } else if (b6 == 1635135811) {
                                rq0.a(null, str15 == null);
                                str15 = com.unity3d.services.core.device.MimeTypes.VIDEO_AV1;
                                bkVar2 = bkVar3;
                                i9 = b4;
                                str3 = str13;
                                f = f2;
                            } else if (b6 == 1668050025) {
                                ByteBuffer order = byteBuffer == null ? ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN) : byteBuffer;
                                order.position(21);
                                order.putShort(kc2Var.k());
                                order.putShort(kc2Var.k());
                                bkVar2 = bkVar3;
                                i9 = b4;
                                str3 = str13;
                                f = f2;
                                byteBuffer = order;
                            } else {
                                if (b6 == 1835295606) {
                                    ByteBuffer order2 = byteBuffer == null ? ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN) : byteBuffer;
                                    short k = kc2Var.k();
                                    short k2 = kc2Var.k();
                                    i9 = b4;
                                    short k3 = kc2Var.k();
                                    str3 = str13;
                                    short k4 = kc2Var.k();
                                    bkVar2 = bkVar3;
                                    short k5 = kc2Var.k();
                                    list = list5;
                                    short k6 = kc2Var.k();
                                    i10 = i32;
                                    short k7 = kc2Var.k();
                                    bArr = bArr2;
                                    short k8 = kc2Var.k();
                                    long n = kc2Var.n();
                                    long n2 = kc2Var.n();
                                    f = f2;
                                    order2.position(1);
                                    order2.putShort(k5);
                                    order2.putShort(k6);
                                    order2.putShort(k);
                                    order2.putShort(k2);
                                    order2.putShort(k3);
                                    order2.putShort(k4);
                                    order2.putShort(k7);
                                    order2.putShort(k8);
                                    order2.putShort((short) (n / 10000));
                                    order2.putShort((short) (n2 / 10000));
                                    byteBuffer = order2;
                                } else {
                                    bkVar2 = bkVar3;
                                    list = list5;
                                    bArr = bArr2;
                                    i9 = b4;
                                    str3 = str13;
                                    f = f2;
                                    i10 = i32;
                                    if (b6 == 1681012275) {
                                        rq0.a(null, str15 == null);
                                        str15 = MimeTypes.VIDEO_H263;
                                    } else {
                                        if (b6 == 1702061171) {
                                            rq0.a(null, str15 == null);
                                            zj a8 = a(i36, kc2Var);
                                            String str17 = a8.a;
                                            byte[] bArr3 = a8.b;
                                            if (bArr3 != null) {
                                                list = s51.a(bArr3);
                                            }
                                            zjVar2 = a8;
                                            str15 = str17;
                                            i11 = i27;
                                        } else {
                                            if (b6 == 1885434736) {
                                                kc2Var.e(i36 + 8);
                                                f = kc2Var.p() / kc2Var.p();
                                                i11 = i27;
                                                i12 = i28;
                                                i13 = i29;
                                                list5 = list;
                                                bArr2 = bArr;
                                                z3 = true;
                                            } else if (b6 == 1937126244) {
                                                int i39 = i36 + 8;
                                                while (true) {
                                                    if (i39 - i36 >= b5) {
                                                        bArr2 = null;
                                                        break;
                                                    }
                                                    kc2Var.e(i39);
                                                    int b7 = kc2Var.b();
                                                    if (kc2Var.b() == 1886547818) {
                                                        bArr2 = Arrays.copyOfRange(kc2Var.a, i39, b7 + i39);
                                                        break;
                                                    }
                                                    i39 += b7;
                                                }
                                                i11 = i27;
                                                i12 = i28;
                                                i13 = i29;
                                                list5 = list;
                                            } else {
                                                if (b6 == 1936995172) {
                                                    int m = kc2Var.m();
                                                    kc2Var.e(kc2Var.b + 3);
                                                    if (m == 0) {
                                                        int m2 = kc2Var.m();
                                                        if (m2 == 0) {
                                                            i11 = i27;
                                                            i12 = i28;
                                                            i13 = i29;
                                                            list5 = list;
                                                            bArr2 = bArr;
                                                            i10 = 0;
                                                        } else if (m2 != 1) {
                                                            i11 = i27;
                                                            if (m2 == 2) {
                                                                i12 = i28;
                                                                i13 = i29;
                                                                list5 = list;
                                                                bArr2 = bArr;
                                                                i10 = 2;
                                                            } else if (m2 == i11) {
                                                                i10 = i11;
                                                            }
                                                        } else {
                                                            i11 = i27;
                                                            i12 = i28;
                                                            i13 = i29;
                                                            list5 = list;
                                                            bArr2 = bArr;
                                                            i10 = 1;
                                                        }
                                                    } else {
                                                        i11 = i27;
                                                    }
                                                } else {
                                                    i11 = i27;
                                                    if (b6 == 1668246642) {
                                                        int b8 = kc2Var.b();
                                                        if (b8 != 1852009592 && b8 != 1852009571) {
                                                            ji1.d("AtomParsers", "Unsupported color type: " + xj.a(b8));
                                                        } else {
                                                            int r4 = kc2Var.r();
                                                            int r5 = kc2Var.r();
                                                            kc2Var.e(kc2Var.b + 2);
                                                            boolean z4 = b5 == 19 && (kc2Var.m() & 128) != 0;
                                                            int i40 = 7;
                                                            int i41 = r4 != 1 ? r4 != 9 ? (r4 == 4 || r4 == 5 || r4 == i28 || r4 == 7) ? 2 : -1 : 6 : 1;
                                                            int i42 = z4 ? 1 : 2;
                                                            i13 = i29;
                                                            if (r5 != 1) {
                                                                if (r5 == i13) {
                                                                    i12 = 6;
                                                                    i40 = 6;
                                                                } else if (r5 != 18) {
                                                                    i12 = 6;
                                                                    if (r5 != 6 && r5 != 7) {
                                                                        i40 = -1;
                                                                    }
                                                                } else {
                                                                    i12 = 6;
                                                                }
                                                                i35 = i41;
                                                                i33 = i42;
                                                                i34 = i40;
                                                            } else {
                                                                i12 = 6;
                                                            }
                                                            i40 = i11;
                                                            i35 = i41;
                                                            i33 = i42;
                                                            i34 = i40;
                                                        }
                                                    }
                                                }
                                                i12 = i28;
                                                i13 = i29;
                                            }
                                            i31 = i37 + b5;
                                            i28 = i12;
                                            i27 = i11;
                                            i29 = i13;
                                            lk0Var2 = lk0Var3;
                                            i6 = i38;
                                            b4 = i9;
                                            str13 = str3;
                                            bkVar3 = bkVar2;
                                            i32 = i10;
                                            f2 = f;
                                        }
                                        i12 = i28;
                                        i13 = i29;
                                        list5 = list;
                                        bArr2 = bArr;
                                        i31 = i37 + b5;
                                        i28 = i12;
                                        i27 = i11;
                                        i29 = i13;
                                        lk0Var2 = lk0Var3;
                                        i6 = i38;
                                        b4 = i9;
                                        str13 = str3;
                                        bkVar3 = bkVar2;
                                        i32 = i10;
                                        f2 = f;
                                    }
                                }
                                i11 = i27;
                                i12 = i28;
                                i13 = i29;
                                list5 = list;
                                bArr2 = bArr;
                                i31 = i37 + b5;
                                i28 = i12;
                                i27 = i11;
                                i29 = i13;
                                lk0Var2 = lk0Var3;
                                i6 = i38;
                                b4 = i9;
                                str13 = str3;
                                bkVar3 = bkVar2;
                                i32 = i10;
                                f2 = f;
                            }
                            i10 = i32;
                            i11 = i27;
                            i12 = i28;
                            i13 = i29;
                            i31 = i37 + b5;
                            i28 = i12;
                            i27 = i11;
                            i29 = i13;
                            lk0Var2 = lk0Var3;
                            i6 = i38;
                            b4 = i9;
                            str13 = str3;
                            bkVar3 = bkVar2;
                            i32 = i10;
                            f2 = f;
                        }
                        list5 = list;
                        bArr2 = bArr;
                        i31 = i37 + b5;
                        i28 = i12;
                        i27 = i11;
                        i29 = i13;
                        lk0Var2 = lk0Var3;
                        i6 = i38;
                        b4 = i9;
                        str13 = str3;
                        bkVar3 = bkVar2;
                        i32 = i10;
                        f2 = f;
                    }
                    bkVar2 = bkVar3;
                    str16 = str4;
                    list5 = list2;
                    str15 = str5;
                    i9 = b4;
                    str3 = str13;
                    f = f2;
                    i10 = i32;
                    i11 = i27;
                    i12 = i28;
                    i13 = i29;
                    i31 = i37 + b5;
                    i28 = i12;
                    i27 = i11;
                    i29 = i13;
                    lk0Var2 = lk0Var3;
                    i6 = i38;
                    b4 = i9;
                    str13 = str3;
                    bkVar3 = bkVar2;
                    i32 = i10;
                    f2 = f;
                }
                bk bkVar4 = bkVar3;
                List list6 = list5;
                i8 = i6;
                byte[] bArr4 = bArr2;
                float f3 = f2;
                int i43 = i32;
                if (str15 == null) {
                    bkVar = bkVar4;
                } else {
                    mx0 mx0Var = new mx0();
                    mx0Var.a = Integer.toString(i);
                    mx0Var.k = str15;
                    mx0Var.h = str16;
                    mx0Var.p = r2;
                    mx0Var.q = r3;
                    mx0Var.t = f3;
                    mx0Var.s = i2;
                    mx0Var.u = bArr4;
                    mx0Var.v = i43;
                    mx0Var.m = list6;
                    mx0Var.n = lk0Var3;
                    int i44 = i35;
                    int i45 = i33;
                    int i46 = i34;
                    if (i44 != -1 || i45 != -1 || i46 != -1 || byteBuffer != null) {
                        mx0Var.w = new mx(i44, i45, i46, byteBuffer != null ? byteBuffer.array() : null);
                    }
                    if (zjVar2 != null) {
                        zj zjVar3 = zjVar2;
                        mx0Var.f = wd1.b(zjVar3.c);
                        mx0Var.g = wd1.b(zjVar3.d);
                    }
                    nx0 nx0Var = new nx0(mx0Var);
                    bkVar = bkVar4;
                    bkVar.b = nx0Var;
                }
            } else {
                if (b4 == 1836069985 || b4 == 1701733217 || b4 == 1633889587 || b4 == 1700998451 || b4 == 1633889588 || b4 == 1835823201 || b4 == 1685353315 || b4 == 1685353317 || b4 == 1685353320 || b4 == 1685353324 || b4 == 1685353336 || b4 == 1935764850 || b4 == 1935767394 || b4 == 1819304813 || b4 == 1936684916 || b4 == 1953984371 || b4 == 778924082 || b4 == 778924083 || b4 == 1835557169 || b4 == 1835560241 || b4 == 1634492771 || b4 == 1634492791 || b4 == 1970037111 || b4 == 1332770163 || b4 == 1716281667) {
                    kc2Var.e(i25 + 16);
                    if (z) {
                        i14 = kc2Var.r();
                        kc2Var.e(kc2Var.b + 6);
                    } else {
                        kc2Var.e(kc2Var.b + 8);
                        i14 = 0;
                    }
                    if (i14 == 0 || i14 == 1) {
                        r = kc2Var.r();
                        kc2Var.e(kc2Var.b + 6);
                        byte[] bArr5 = kc2Var.a;
                        int i47 = kc2Var.b;
                        int i48 = (bArr5[i47 + 1] & 255) | ((bArr5[i47] & 255) << 8);
                        kc2Var.b = i47 + 4;
                        kc2Var.e(i47);
                        b = kc2Var.b();
                        if (i14 == 1) {
                            kc2Var.e(kc2Var.b + 16);
                        }
                        i15 = i48;
                    } else if (i14 == 2) {
                        kc2Var.e(kc2Var.b + 16);
                        i15 = (int) Math.round(Double.longBitsToDouble(kc2Var.i()));
                        r = kc2Var.p();
                        kc2Var.e(kc2Var.b + 20);
                        b = 0;
                    }
                    int i49 = kc2Var.b;
                    if (b4 == 1701733217) {
                        Pair a9 = a(i25, b3, kc2Var);
                        if (a9 != null) {
                            b4 = ((Integer) a9.first).intValue();
                            if (lk0Var5 == null) {
                                i3 = b2;
                                i4 = i24;
                                i16 = i15;
                                lk0Var4 = null;
                            } else {
                                String str18 = ((j83) a9.second).b;
                                i3 = b2;
                                if (mc3.a(lk0Var5.d, str18)) {
                                    lk0Var4 = lk0Var5;
                                    i4 = i24;
                                    i16 = i15;
                                } else {
                                    i4 = i24;
                                    i16 = i15;
                                    lk0Var4 = new lk0(str18, false, lk0Var5.b);
                                }
                            }
                            bkVar3.a[i4] = (j83) a9.second;
                        } else {
                            i3 = b2;
                            i4 = i24;
                            i16 = i15;
                            lk0Var4 = lk0Var5;
                        }
                        kc2Var.e(i49);
                    } else {
                        i3 = b2;
                        i4 = i24;
                        i16 = i15;
                        lk0Var4 = lk0Var5;
                    }
                    if (b4 == 1633889587) {
                        str6 = MimeTypes.AUDIO_AC3;
                    } else if (b4 == 1700998451) {
                        str6 = MimeTypes.AUDIO_E_AC3;
                    } else if (b4 == 1633889588) {
                        str6 = "audio/ac4";
                    } else if (b4 == 1685353315) {
                        str6 = MimeTypes.AUDIO_DTS;
                    } else if (b4 == 1685353320 || b4 == 1685353324) {
                        str6 = MimeTypes.AUDIO_DTS_HD;
                    } else if (b4 == 1685353317) {
                        str6 = MimeTypes.AUDIO_DTS_EXPRESS;
                    } else if (b4 == 1685353336) {
                        str6 = "audio/vnd.dts.uhd;profile=p2";
                    } else if (b4 == 1935764850) {
                        str6 = MimeTypes.AUDIO_AMR_NB;
                    } else if (b4 == 1935767394) {
                        str6 = MimeTypes.AUDIO_AMR_WB;
                    } else {
                        if (b4 == 1819304813 || b4 == 1936684916) {
                            str6 = MimeTypes.AUDIO_RAW;
                            i17 = 2;
                        } else if (b4 == 1953984371) {
                            str6 = MimeTypes.AUDIO_RAW;
                            i17 = 268435456;
                        } else if (b4 == 778924082 || b4 == 778924083) {
                            str6 = MimeTypes.AUDIO_MPEG;
                        } else if (b4 == 1835557169) {
                            str6 = "audio/mha1";
                        } else if (b4 == 1835560241) {
                            str6 = "audio/mhm1";
                        } else if (b4 == 1634492771) {
                            str6 = MimeTypes.AUDIO_ALAC;
                        } else if (b4 == 1634492791) {
                            str6 = MimeTypes.AUDIO_ALAW;
                        } else if (b4 == 1970037111) {
                            str6 = MimeTypes.AUDIO_MLAW;
                        } else if (b4 == 1332770163) {
                            str6 = MimeTypes.AUDIO_OPUS;
                        } else if (b4 == 1716281667) {
                            str6 = MimeTypes.AUDIO_FLAC;
                        } else {
                            str6 = b4 == 1835823201 ? MimeTypes.AUDIO_TRUEHD : null;
                        }
                        i18 = i16;
                        String str19 = null;
                        zj zjVar4 = null;
                        List list7 = null;
                        while (i49 - i25 < b3) {
                            kc2Var.e(i49);
                            int b9 = kc2Var.b();
                            int i50 = b3;
                            rq0.a("childAtomSize must be positive", b9 > 0);
                            int b10 = kc2Var.b();
                            zj zjVar5 = zjVar4;
                            if (b10 == 1835557187) {
                                int i51 = b9 - 13;
                                byte[] bArr6 = new byte[i51];
                                kc2Var.e(i49 + 13);
                                kc2Var.a(bArr6, 0, i51);
                                str8 = str19;
                                list7 = s51.a(bArr6);
                                i20 = i17;
                            } else {
                                int i52 = 1702061171;
                                if (b10 != 1702061171) {
                                    if (z && b10 == 2002876005) {
                                        i52 = 1702061171;
                                    } else {
                                        if (b10 == 1684103987) {
                                            kc2Var.e(i49 + 8);
                                            String num = Integer.toString(i);
                                            int i53 = h0.b[(kc2Var.m() & PsExtractor.AUDIO_STREAM) >> 6];
                                            int m3 = kc2Var.m();
                                            int i54 = h0.d[(m3 & 56) >> 3];
                                            if ((m3 & 4) != 0) {
                                                i54++;
                                            }
                                            list4 = list7;
                                            int i55 = i54;
                                            i20 = i17;
                                            mx0 mx0Var2 = new mx0();
                                            mx0Var2.a = num;
                                            mx0Var2.k = MimeTypes.AUDIO_AC3;
                                            mx0Var2.x = i55;
                                            mx0Var2.y = i53;
                                            mx0Var2.n = lk0Var4;
                                            mx0Var2.c = str12;
                                            bkVar3.b = new nx0(mx0Var2);
                                            str8 = str19;
                                        } else {
                                            i20 = i17;
                                            list4 = list7;
                                            if (b10 == 1684366131) {
                                                kc2Var.e(i49 + 8);
                                                String num2 = Integer.toString(i);
                                                kc2Var.e(kc2Var.b + 2);
                                                int i56 = h0.b[(kc2Var.m() & PsExtractor.AUDIO_STREAM) >> 6];
                                                int m4 = kc2Var.m();
                                                int i57 = h0.d[(m4 & 14) >> 1];
                                                if ((m4 & 1) != 0) {
                                                    i57++;
                                                }
                                                if (((kc2Var.m() & 30) >> 1) > 0 && (kc2Var.m() & 2) != 0) {
                                                    i57 += 2;
                                                }
                                                if (kc2Var.c - kc2Var.b > 0 && (kc2Var.m() & 1) != 0) {
                                                    str10 = MimeTypes.AUDIO_E_AC3_JOC;
                                                } else {
                                                    str10 = MimeTypes.AUDIO_E_AC3;
                                                }
                                                str8 = str19;
                                                mx0 mx0Var3 = new mx0();
                                                mx0Var3.a = num2;
                                                mx0Var3.k = str10;
                                                mx0Var3.x = i57;
                                                mx0Var3.y = i56;
                                                mx0Var3.n = lk0Var4;
                                                mx0Var3.c = str12;
                                                bkVar3.b = new nx0(mx0Var3);
                                            } else {
                                                str8 = str19;
                                                if (b10 == 1684103988) {
                                                    kc2Var.e(i49 + 8);
                                                    String num3 = Integer.toString(i);
                                                    kc2Var.e(kc2Var.b + 1);
                                                    int i58 = ((kc2Var.m() & 32) >> 5) == 1 ? 48000 : 44100;
                                                    mx0 mx0Var4 = new mx0();
                                                    mx0Var4.a = num3;
                                                    mx0Var4.k = "audio/ac4";
                                                    mx0Var4.x = 2;
                                                    mx0Var4.y = i58;
                                                    mx0Var4.n = lk0Var4;
                                                    mx0Var4.c = str12;
                                                    bkVar3.b = new nx0(mx0Var4);
                                                } else {
                                                    if (b10 == 1684892784) {
                                                        if (b <= 0) {
                                                            throw new pc2(nh2.a("Invalid sample rate for Dolby TrueHD MLP stream: ", b), null, true, 1);
                                                        }
                                                        i18 = b;
                                                        zjVar4 = zjVar5;
                                                        list7 = list4;
                                                        r = 2;
                                                    } else if (b10 == 1684305011) {
                                                        mx0 mx0Var5 = new mx0();
                                                        mx0Var5.a = Integer.toString(i);
                                                        mx0Var5.k = str6;
                                                        mx0Var5.x = r;
                                                        mx0Var5.y = i18;
                                                        mx0Var5.n = lk0Var4;
                                                        mx0Var5.c = str12;
                                                        bkVar3.b = new nx0(mx0Var5);
                                                    } else {
                                                        if (b10 == 1682927731) {
                                                            int i59 = b9 - 8;
                                                            byte[] bArr7 = a;
                                                            byte[] copyOf = Arrays.copyOf(bArr7, bArr7.length + i59);
                                                            kc2Var.e(i49 + 8);
                                                            kc2Var.a(copyOf, bArr7.length, i59);
                                                            a2 = sb2.a(copyOf);
                                                        } else if (b10 == 1684425825) {
                                                            byte[] bArr8 = new byte[b9 - 8];
                                                            bArr8[0] = 102;
                                                            bArr8[1] = 76;
                                                            bArr8[2] = 97;
                                                            bArr8[3] = 67;
                                                            kc2Var.e(i49 + 12);
                                                            kc2Var.a(bArr8, i26, b9 - 12);
                                                            a2 = s51.a(bArr8);
                                                        } else {
                                                            if (b10 == 1634492771) {
                                                                int i60 = b9 - 12;
                                                                byte[] bArr9 = new byte[i60];
                                                                kc2Var.e(i49 + 12);
                                                                kc2Var.a(bArr9, 0, i60);
                                                                kc2 kc2Var2 = new kc2(bArr9);
                                                                kc2Var2.e(9);
                                                                int m5 = kc2Var2.m();
                                                                kc2Var2.e(20);
                                                                Pair create = Pair.create(Integer.valueOf(kc2Var2.p()), Integer.valueOf(m5));
                                                                i18 = ((Integer) create.first).intValue();
                                                                r = ((Integer) create.second).intValue();
                                                                list7 = s51.a(bArr9);
                                                                zjVar4 = zjVar5;
                                                            }
                                                            zjVar4 = zjVar5;
                                                            list7 = list4;
                                                        }
                                                        list7 = a2;
                                                    }
                                                    i49 += b9;
                                                    b3 = i50;
                                                    i17 = i20;
                                                    str19 = str8;
                                                    i26 = 4;
                                                }
                                            }
                                        }
                                        zjVar4 = zjVar5;
                                        list7 = list4;
                                        i49 += b9;
                                        b3 = i50;
                                        i17 = i20;
                                        str19 = str8;
                                        i26 = 4;
                                    }
                                }
                                str8 = str19;
                                i20 = i17;
                                list4 = list7;
                                if (b10 != i52) {
                                    i21 = kc2Var.b;
                                    rq0.a(null, i21 >= i49);
                                    while (true) {
                                        if (i21 - i49 >= b9) {
                                            i21 = -1;
                                            break;
                                        }
                                        kc2Var.e(i21);
                                        int b11 = kc2Var.b();
                                        rq0.a("childAtomSize must be positive", b11 > 0);
                                        if (kc2Var.b() == 1702061171) {
                                            break;
                                        }
                                        i21 += b11;
                                    }
                                } else {
                                    i21 = i49;
                                }
                                if (i21 != -1) {
                                    zj a10 = a(i21, kc2Var);
                                    String str20 = a10.a;
                                    byte[] bArr10 = a10.b;
                                    if (bArr10 != null) {
                                        if ("audio/mp4a-latm".equals(str20)) {
                                            a a11 = b.a(new jc2(bArr10.length, bArr10), false);
                                            i23 = a11.a;
                                            i22 = a11.b;
                                            str9 = a11.c;
                                        } else {
                                            i22 = r;
                                            i23 = i18;
                                            str9 = str8;
                                        }
                                        list7 = s51.a(bArr10);
                                        str8 = str9;
                                        i18 = i23;
                                        r = i22;
                                        zjVar4 = a10;
                                        str6 = str20;
                                        i49 += b9;
                                        b3 = i50;
                                        i17 = i20;
                                        str19 = str8;
                                        i26 = 4;
                                    } else {
                                        zjVar4 = a10;
                                        str6 = str20;
                                        list7 = list4;
                                        i49 += b9;
                                        b3 = i50;
                                        i17 = i20;
                                        str19 = str8;
                                        i26 = 4;
                                    }
                                }
                                zjVar4 = zjVar5;
                                list7 = list4;
                                i49 += b9;
                                b3 = i50;
                                i17 = i20;
                                str19 = str8;
                                i26 = 4;
                            }
                            zjVar4 = zjVar5;
                            i49 += b9;
                            b3 = i50;
                            i17 = i20;
                            str19 = str8;
                            i26 = 4;
                        }
                        str7 = str19;
                        int i61 = b3;
                        i19 = i17;
                        zjVar = zjVar4;
                        list3 = list7;
                        if (bkVar3.b == null && str6 != null) {
                            mx0 mx0Var6 = new mx0();
                            mx0Var6.a = Integer.toString(i);
                            mx0Var6.k = str6;
                            mx0Var6.h = str7;
                            mx0Var6.x = r;
                            mx0Var6.y = i18;
                            mx0Var6.z = i19;
                            mx0Var6.m = list3;
                            mx0Var6.n = lk0Var4;
                            mx0Var6.c = str12;
                            if (zjVar != null) {
                                mx0Var6.f = wd1.b(zjVar.c);
                                mx0Var6.g = wd1.b(zjVar.d);
                            }
                            bkVar3.b = new nx0(mx0Var6);
                        }
                        bkVar = bkVar3;
                        i8 = i61;
                        i7 = i25;
                    }
                    i17 = -1;
                    i18 = i16;
                    String str192 = null;
                    zj zjVar42 = null;
                    List list72 = null;
                    while (i49 - i25 < b3) {
                    }
                    str7 = str192;
                    int i612 = b3;
                    i19 = i17;
                    zjVar = zjVar42;
                    list3 = list72;
                    if (bkVar3.b == null) {
                        mx0 mx0Var62 = new mx0();
                        mx0Var62.a = Integer.toString(i);
                        mx0Var62.k = str6;
                        mx0Var62.h = str7;
                        mx0Var62.x = r;
                        mx0Var62.y = i18;
                        mx0Var62.z = i19;
                        mx0Var62.m = list3;
                        mx0Var62.n = lk0Var4;
                        mx0Var62.c = str12;
                        if (zjVar != null) {
                        }
                        bkVar3.b = new nx0(mx0Var62);
                    }
                    bkVar = bkVar3;
                    i8 = i612;
                    i7 = i25;
                } else if (b4 == 1414810956 || b4 == 1954034535 || b4 == 2004251764 || b4 == 1937010800 || b4 == 1664495672) {
                    kc2Var.e(i25 + 16);
                    long j = Long.MAX_VALUE;
                    if (b4 == 1414810956) {
                        str11 = MimeTypes.APPLICATION_TTML;
                    } else if (b4 == 1954034535) {
                        int i62 = b3 - 16;
                        byte[] bArr11 = new byte[i62];
                        kc2Var.a(bArr11, 0, i62);
                        a3 = s51.a(bArr11);
                        str11 = MimeTypes.APPLICATION_TX3G;
                        mx0 mx0Var7 = new mx0();
                        mx0Var7.a = Integer.toString(i);
                        mx0Var7.k = str11;
                        mx0Var7.c = str12;
                        mx0Var7.o = j;
                        mx0Var7.m = a3;
                        bkVar3.b = new nx0(mx0Var7);
                    } else if (b4 == 2004251764) {
                        str11 = MimeTypes.APPLICATION_MP4VTT;
                    } else if (b4 == 1937010800) {
                        str11 = MimeTypes.APPLICATION_TTML;
                        j = 0;
                    } else if (b4 == 1664495672) {
                        bkVar3.d = 1;
                        str11 = MimeTypes.APPLICATION_MP4CEA608;
                    } else {
                        throw new IllegalStateException();
                    }
                    a3 = null;
                    mx0 mx0Var72 = new mx0();
                    mx0Var72.a = Integer.toString(i);
                    mx0Var72.k = str11;
                    mx0Var72.c = str12;
                    mx0Var72.o = j;
                    mx0Var72.m = a3;
                    bkVar3.b = new nx0(mx0Var72);
                } else if (b4 == 1835365492) {
                    kc2Var.e(i25 + 16);
                    if (b4 == 1835365492) {
                        kc2Var.j();
                        String j2 = kc2Var.j();
                        if (j2 != null) {
                            mx0 mx0Var8 = new mx0();
                            mx0Var8.a = Integer.toString(i);
                            mx0Var8.k = j2;
                            bkVar3.b = new nx0(mx0Var8);
                        }
                    }
                } else if (b4 == 1667329389) {
                    mx0 mx0Var9 = new mx0();
                    mx0Var9.a = Integer.toString(i);
                    mx0Var9.k = MimeTypes.APPLICATION_CAMERA_MOTION;
                    bkVar3.b = new nx0(mx0Var9);
                }
                i3 = b2;
                bkVar = bkVar3;
                i4 = i24;
                i7 = i25;
                i8 = b3;
            }
            kc2Var.e(i7 + i8);
            i24 = i4 + 1;
            lk0Var5 = lk0Var;
            bkVar3 = bkVar;
            b2 = i3;
            str12 = str;
        }
        return bkVar3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:281:0x00e6, code lost:
    
        if (r14 == 0) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x05f3  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0603  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList a(vj vjVar, az0 az0Var, long j, lk0 lk0Var, boolean z, boolean z2, xy0 xy0Var) {
        int i;
        long j2;
        long j3;
        long j4;
        int i2;
        int i3;
        long j5;
        bk a2;
        long j6;
        long[] jArr;
        long[] jArr2;
        i83 i83Var;
        int i4;
        vj b;
        Pair create;
        long j7;
        long b2;
        i83 i83Var2;
        ak dkVar;
        boolean z3;
        int i5;
        int i6;
        int i7;
        int a3;
        String str;
        ArrayList arrayList;
        int i8;
        int i9;
        long[] jArr3;
        long[] jArr4;
        int[] iArr;
        boolean z4;
        long[] jArr5;
        int i10;
        int[] iArr2;
        long[] jArr6;
        int i11;
        long j8;
        long[] jArr7;
        int[] iArr3;
        long[] jArr8;
        long[] jArr9;
        int[] iArr4;
        r83 r83Var;
        int[] iArr5;
        long[] jArr10;
        int i12;
        int i13;
        ArrayList arrayList2;
        vj vjVar2 = vjVar;
        ArrayList arrayList3 = new ArrayList();
        int i14 = 0;
        while (i14 < vjVar2.d.size()) {
            vj vjVar3 = (vj) vjVar2.d.get(i14);
            if (vjVar3.a != 1953653099) {
                arrayList2 = arrayList3;
                i = i14;
            } else {
                wj c = vjVar2.c(1836476516);
                c.getClass();
                vj b3 = vjVar3.b(1835297121);
                b3.getClass();
                wj c2 = b3.c(1751411826);
                c2.getClass();
                kc2 kc2Var = c2.b;
                kc2Var.e(16);
                int b4 = kc2Var.b();
                int i15 = b4 == 1936684398 ? 1 : b4 == 1986618469 ? 2 : (b4 == 1952807028 || b4 == 1935832172 || b4 == 1937072756 || b4 == 1668047728) ? 3 : b4 == 1835365473 ? 5 : -1;
                i = i14;
                if (i15 == -1) {
                    j2 = 0;
                } else {
                    wj c3 = vjVar3.c(1953196132);
                    c3.getClass();
                    kc2 kc2Var2 = c3.b;
                    j2 = 0;
                    kc2Var2.e(8);
                    int b5 = (kc2Var2.b() >> 24) & 255;
                    kc2Var2.e(kc2Var2.b + (b5 == 0 ? 8 : 16));
                    int b6 = kc2Var2.b();
                    kc2Var2.e(kc2Var2.b + 4);
                    int i16 = kc2Var2.b;
                    int i17 = b5 == 0 ? 4 : 8;
                    int i18 = 0;
                    while (true) {
                        if (i18 < i17) {
                            if (kc2Var2.a[i16 + i18] != -1) {
                                j3 = b5 == 0 ? kc2Var2.n() : kc2Var2.q();
                            } else {
                                i18++;
                            }
                        } else {
                            kc2Var2.e(kc2Var2.b + i17);
                            break;
                        }
                    }
                    j3 = -9223372036854775807L;
                    kc2Var2.e(kc2Var2.b + 16);
                    int b7 = kc2Var2.b();
                    int b8 = kc2Var2.b();
                    kc2Var2.e(kc2Var2.b + 4);
                    int b9 = kc2Var2.b();
                    int b10 = kc2Var2.b();
                    if (b7 == 0 && b8 == 65536 && b9 == -65536 && b10 == 0) {
                        i3 = 90;
                    } else if (b7 == 0 && b8 == -65536 && b9 == 65536 && b10 == 0) {
                        i3 = atv0.b;
                    } else if (b7 == -65536 && b8 == 0 && b9 == 0 && b10 == -65536) {
                        i3 = 180;
                    } else {
                        j4 = -9223372036854775807L;
                        i2 = 0;
                        j5 = j != j4 ? j3 : j;
                        kc2 kc2Var3 = c.b;
                        kc2Var3.e(8);
                        kc2Var3.e(kc2Var3.b + (((kc2Var3.b() >> 24) & 255) != 0 ? 8 : 16));
                        long n = kc2Var3.n();
                        if (j5 != j4) {
                            j4 = mc3.a(j5, 1000000L, n);
                        }
                        vj b11 = b3.b(1835626086);
                        b11.getClass();
                        vj b12 = b11.b(1937007212);
                        b12.getClass();
                        wj c4 = b3.c(1835296868);
                        c4.getClass();
                        kc2 kc2Var4 = c4.b;
                        kc2Var4.e(8);
                        int b13 = (kc2Var4.b() >> 24) & 255;
                        kc2Var4.e(kc2Var4.b + (b13 == 0 ? 8 : 16));
                        long n2 = kc2Var4.n();
                        kc2Var4.e(kc2Var4.b + (b13 != 0 ? 4 : 8));
                        int r = kc2Var4.r();
                        Pair create2 = Pair.create(Long.valueOf(n2), "" + ((char) (((r >> 10) & 31) + 96)) + ((char) (((r >> 5) & 31) + 96)) + ((char) ((r & 31) + 96)));
                        wj c5 = b12.c(1937011556);
                        c5.getClass();
                        a2 = a(c5.b, b6, i2, (String) create2.second, lk0Var, z2);
                        if (!z || (b = vjVar3.b(1701082227)) == null) {
                            j6 = j4;
                        } else {
                            wj c6 = b.c(1701606260);
                            if (c6 == null) {
                                j6 = j4;
                                create = null;
                            } else {
                                kc2 kc2Var5 = c6.b;
                                kc2Var5.e(8);
                                int b14 = (kc2Var5.b() >> 24) & 255;
                                int p = kc2Var5.p();
                                long[] jArr11 = new long[p];
                                long[] jArr12 = new long[p];
                                int i19 = 0;
                                while (i19 < p) {
                                    jArr11[i19] = b14 == 1 ? kc2Var5.q() : kc2Var5.n();
                                    if (b14 == 1) {
                                        j7 = j4;
                                        b2 = kc2Var5.i();
                                    } else {
                                        j7 = j4;
                                        b2 = kc2Var5.b();
                                    }
                                    jArr12[i19] = b2;
                                    if (kc2Var5.k() == 1) {
                                        kc2Var5.e(kc2Var5.b + 2);
                                        i19++;
                                        j4 = j7;
                                    } else {
                                        throw new IllegalArgumentException("Unsupported media rate.");
                                    }
                                }
                                j6 = j4;
                                create = Pair.create(jArr11, jArr12);
                            }
                            if (create != null) {
                                long[] jArr13 = (long[]) create.first;
                                jArr2 = (long[]) create.second;
                                jArr = jArr13;
                                if (a2.b != null) {
                                    i4 = 1937007212;
                                    i83Var = new i83(b6, i15, ((Long) create2.first).longValue(), n, j6, a2.b, a2.d, a2.a, a2.c, jArr, jArr2);
                                    i83Var2 = (i83) xy0Var.apply(i83Var);
                                    if (i83Var2 != null) {
                                        arrayList2 = arrayList3;
                                    } else {
                                        vj b15 = vjVar3.b(1835297121);
                                        b15.getClass();
                                        vj b16 = b15.b(1835626086);
                                        b16.getClass();
                                        vj b17 = b16.b(i4);
                                        b17.getClass();
                                        wj c7 = b17.c(1937011578);
                                        if (c7 != null) {
                                            dkVar = new ck(c7, i83Var2.f);
                                        } else {
                                            wj c8 = b17.c(1937013298);
                                            if (c8 != null) {
                                                dkVar = new dk(c8);
                                            } else {
                                                throw new pc2("Track has no sample table size information", null, true, 1);
                                            }
                                        }
                                        int b18 = dkVar.b();
                                        if (b18 == 0) {
                                            r83Var = new r83(i83Var2, new long[0], new int[0], 0, new long[0], new int[0], 0L);
                                            arrayList2 = arrayList3;
                                        } else {
                                            wj c9 = b17.c(1937007471);
                                            if (c9 == null) {
                                                c9 = b17.c(1668232756);
                                                c9.getClass();
                                                z3 = true;
                                            } else {
                                                z3 = false;
                                            }
                                            kc2 kc2Var6 = c9.b;
                                            wj c10 = b17.c(1937011555);
                                            c10.getClass();
                                            kc2 kc2Var7 = c10.b;
                                            wj c11 = b17.c(1937011827);
                                            c11.getClass();
                                            kc2 kc2Var8 = c11.b;
                                            wj c12 = b17.c(1937011571);
                                            kc2 kc2Var9 = c12 != null ? c12.b : null;
                                            wj c13 = b17.c(1668576371);
                                            kc2 kc2Var10 = c13 != null ? c13.b : null;
                                            yj yjVar = new yj(kc2Var7, kc2Var6, z3);
                                            kc2Var8.e(12);
                                            int p2 = kc2Var8.p() - 1;
                                            int p3 = kc2Var8.p();
                                            int p4 = kc2Var8.p();
                                            if (kc2Var10 != null) {
                                                kc2Var10.e(12);
                                                i5 = kc2Var10.p();
                                            } else {
                                                i5 = 0;
                                            }
                                            if (kc2Var9 != null) {
                                                kc2Var9.e(12);
                                                i6 = kc2Var9.p();
                                                if (i6 > 0) {
                                                    i7 = kc2Var9.p() - 1;
                                                    a3 = dkVar.a();
                                                    kc2 kc2Var11 = kc2Var10;
                                                    str = i83Var2.f.m;
                                                    ak akVar = dkVar;
                                                    if (!(a3 == -1 && (MimeTypes.AUDIO_RAW.equals(str) || MimeTypes.AUDIO_MLAW.equals(str) || MimeTypes.AUDIO_ALAW.equals(str)) && p2 == 0 && i5 == 0 && i6 == 0)) {
                                                        int i20 = yjVar.a;
                                                        long[] jArr14 = new long[i20];
                                                        int[] iArr6 = new int[i20];
                                                        while (yjVar.a()) {
                                                            int i21 = yjVar.b;
                                                            jArr14[i21] = yjVar.d;
                                                            iArr6[i21] = yjVar.c;
                                                        }
                                                        long j9 = p4;
                                                        int i22 = 8192 / a3;
                                                        int i23 = 0;
                                                        for (int i24 = 0; i24 < i20; i24++) {
                                                            int i25 = iArr6[i24];
                                                            int i26 = mc3.a;
                                                            i23 += ((i25 + i22) - 1) / i22;
                                                        }
                                                        long[] jArr15 = new long[i23];
                                                        int[] iArr7 = new int[i23];
                                                        long[] jArr16 = new long[i23];
                                                        int[] iArr8 = new int[i23];
                                                        int i27 = 0;
                                                        int i28 = 0;
                                                        i11 = 0;
                                                        int i29 = 0;
                                                        while (i28 < i20) {
                                                            int i30 = iArr6[i28];
                                                            long j10 = jArr14[i28];
                                                            int i31 = i29;
                                                            int i32 = i20;
                                                            int i33 = i11;
                                                            int i34 = i31;
                                                            long[] jArr17 = jArr14;
                                                            int i35 = i30;
                                                            while (i35 > 0) {
                                                                int min = Math.min(i22, i35);
                                                                jArr15[i34] = j10;
                                                                int i36 = i35;
                                                                int i37 = a3 * min;
                                                                iArr7[i34] = i37;
                                                                i33 = Math.max(i33, i37);
                                                                jArr16[i34] = i27 * j9;
                                                                iArr8[i34] = 1;
                                                                j10 += iArr7[i34];
                                                                i27 += min;
                                                                i35 = i36 - min;
                                                                i34++;
                                                                iArr6 = iArr6;
                                                            }
                                                            i28++;
                                                            int i38 = i34;
                                                            i11 = i33;
                                                            i20 = i32;
                                                            i29 = i38;
                                                            jArr14 = jArr17;
                                                        }
                                                        long j11 = j9 * i27;
                                                        arrayList = arrayList3;
                                                        iArr2 = iArr8;
                                                        jArr6 = jArr16;
                                                        j8 = j11;
                                                        iArr3 = iArr7;
                                                        jArr7 = jArr15;
                                                    } else {
                                                        long[] jArr18 = new long[b18];
                                                        int[] iArr9 = new int[b18];
                                                        long[] jArr19 = new long[b18];
                                                        int i39 = i6;
                                                        int[] iArr10 = new int[b18];
                                                        int i40 = p2;
                                                        int i41 = i39;
                                                        int i42 = i7;
                                                        int i43 = i5;
                                                        int i44 = p4;
                                                        int i45 = p3;
                                                        arrayList = arrayList3;
                                                        kc2 kc2Var12 = kc2Var9;
                                                        long j12 = j2;
                                                        long j13 = j12;
                                                        int i46 = 0;
                                                        int i47 = 0;
                                                        int i48 = 0;
                                                        int i49 = 0;
                                                        int i50 = 0;
                                                        while (true) {
                                                            if (i47 >= b18) {
                                                                i8 = i41;
                                                                i9 = i40;
                                                                jArr3 = jArr18;
                                                                jArr4 = jArr19;
                                                                iArr = iArr10;
                                                                b18 = b18;
                                                                break;
                                                            }
                                                            boolean z5 = true;
                                                            while (i49 == 0) {
                                                                z5 = yjVar.a();
                                                                if (!z5) {
                                                                    break;
                                                                }
                                                                int i51 = i41;
                                                                long j14 = yjVar.d;
                                                                i49 = yjVar.c;
                                                                j13 = j14;
                                                                i41 = i51;
                                                                i40 = i40;
                                                                b18 = b18;
                                                            }
                                                            int i52 = b18;
                                                            i8 = i41;
                                                            i9 = i40;
                                                            if (!z5) {
                                                                ji1.d("AtomParsers", "Unexpected end of chunk data");
                                                                long[] copyOf = Arrays.copyOf(jArr18, i47);
                                                                iArr9 = Arrays.copyOf(iArr9, i47);
                                                                long[] copyOf2 = Arrays.copyOf(jArr19, i47);
                                                                iArr = Arrays.copyOf(iArr10, i47);
                                                                int i53 = i47;
                                                                jArr3 = copyOf;
                                                                jArr4 = copyOf2;
                                                                b18 = i53;
                                                                break;
                                                            }
                                                            if (kc2Var11 != null) {
                                                                int i54 = i50;
                                                                while (i54 == 0 && i43 > 0) {
                                                                    i54 = kc2Var11.p();
                                                                    i48 = kc2Var11.b();
                                                                    i43--;
                                                                }
                                                                i50 = i54 - 1;
                                                            }
                                                            jArr18[i47] = j13;
                                                            int c14 = akVar.c();
                                                            iArr9[i47] = c14;
                                                            if (c14 > i46) {
                                                                i46 = c14;
                                                            }
                                                            jArr19[i47] = j12 + i48;
                                                            iArr10[i47] = kc2Var12 == null ? 1 : 0;
                                                            if (i47 == i42) {
                                                                iArr10[i47] = 1;
                                                                i41 = i8 - 1;
                                                                if (i41 > 0) {
                                                                    kc2Var12.getClass();
                                                                    jArr8 = jArr18;
                                                                    i42 = kc2Var12.p() - 1;
                                                                } else {
                                                                    jArr8 = jArr18;
                                                                }
                                                            } else {
                                                                jArr8 = jArr18;
                                                                i41 = i8;
                                                            }
                                                            j12 += i44;
                                                            i45--;
                                                            if (i45 != 0 || i9 <= 0) {
                                                                i40 = i9;
                                                            } else {
                                                                i40 = i9 - 1;
                                                                i45 = kc2Var8.p();
                                                                i44 = kc2Var8.b();
                                                            }
                                                            j13 += iArr9[i47];
                                                            i49--;
                                                            i47++;
                                                            jArr18 = jArr8;
                                                            b18 = i52;
                                                        }
                                                        int[] iArr11 = iArr9;
                                                        int i55 = i49;
                                                        long j15 = j12 + i48;
                                                        if (kc2Var11 != null) {
                                                            while (i43 > 0) {
                                                                if (kc2Var11.p() != 0) {
                                                                    z4 = false;
                                                                    break;
                                                                }
                                                                kc2Var11.b();
                                                                i43--;
                                                            }
                                                        }
                                                        z4 = true;
                                                        if (i8 == 0 && i45 == 0 && i55 == 0 && i9 == 0 && i50 == 0 && z4) {
                                                            jArr5 = jArr4;
                                                            i10 = i46;
                                                        } else {
                                                            StringBuilder sb = new StringBuilder("Inconsistent stbl box for track ");
                                                            jArr5 = jArr4;
                                                            i10 = i46;
                                                            cgn.a(i83Var2.a, i8, ": remainingSynchronizationSamples ", ", remainingSamplesAtTimestampDelta ", sb);
                                                            cgn.a(i45, i55, ", remainingSamplesInChunk ", ", remainingTimestampDeltaChanges ", sb);
                                                            sb.append(i9);
                                                            sb.append(", remainingSamplesAtTimestampOffset ");
                                                            sb.append(i50);
                                                            sb.append(!z4 ? ", ctts invalid" : "");
                                                            ji1.d("AtomParsers", sb.toString());
                                                        }
                                                        iArr2 = iArr;
                                                        jArr6 = jArr5;
                                                        i11 = i10;
                                                        j8 = j15;
                                                        jArr7 = jArr3;
                                                        iArr3 = iArr11;
                                                    }
                                                    long a4 = mc3.a(j8, 1000000L, i83Var2.c);
                                                    jArr9 = i83Var2.h;
                                                    if (jArr9 != null) {
                                                        mc3.a(jArr6, i83Var2.c);
                                                        r83Var = new r83(i83Var2, jArr7, iArr3, i11, jArr6, iArr2, a4);
                                                    } else {
                                                        long[] jArr20 = jArr7;
                                                        long[] jArr21 = jArr6;
                                                        if (jArr9.length == 1 && i83Var2.b == 1 && jArr21.length >= 2) {
                                                            long[] jArr22 = i83Var2.i;
                                                            jArr22.getClass();
                                                            long j16 = jArr22[0];
                                                            long a5 = mc3.a(i83Var2.h[0], i83Var2.c, i83Var2.d) + j16;
                                                            int length = jArr21.length - 1;
                                                            int max = Math.max(0, Math.min(4, length));
                                                            int max2 = Math.max(0, Math.min(jArr21.length - 4, length));
                                                            long j17 = jArr21[0];
                                                            if (j17 <= j16 && j16 < jArr21[max] && jArr21[max2] < a5 && a5 <= j8) {
                                                                long a6 = mc3.a(j16 - j17, i83Var2.f.A, i83Var2.c);
                                                                long a7 = mc3.a(j8 - a5, i83Var2.f.A, i83Var2.c);
                                                                if ((a6 != j2 || a7 != j2) && a6 <= 2147483647L && a7 <= 2147483647L) {
                                                                    az0Var.a = (int) a6;
                                                                    az0Var.b = (int) a7;
                                                                    mc3.a(jArr21, i83Var2.c);
                                                                    r83Var = new r83(i83Var2, jArr20, iArr3, i11, jArr21, iArr2, mc3.a(i83Var2.h[0], 1000000L, i83Var2.d));
                                                                }
                                                            }
                                                        }
                                                        long[] jArr23 = i83Var2.h;
                                                        if (jArr23.length == 1 && jArr23[0] == j2) {
                                                            long[] jArr24 = i83Var2.i;
                                                            jArr24.getClass();
                                                            long j18 = jArr24[0];
                                                            for (int i56 = 0; i56 < jArr21.length; i56++) {
                                                                jArr21[i56] = mc3.a(jArr21[i56] - j18, 1000000L, i83Var2.c);
                                                            }
                                                            r83Var = new r83(i83Var2, jArr20, iArr3, i11, jArr21, iArr2, mc3.a(j8 - j18, 1000000L, i83Var2.c));
                                                        } else {
                                                            long[] jArr25 = jArr21;
                                                            int[] iArr12 = iArr2;
                                                            boolean z6 = i83Var2.b == 1;
                                                            int[] iArr13 = new int[jArr23.length];
                                                            int[] iArr14 = new int[jArr23.length];
                                                            long[] jArr26 = i83Var2.i;
                                                            jArr26.getClass();
                                                            int i57 = 0;
                                                            int i58 = 0;
                                                            boolean z7 = false;
                                                            int i59 = 0;
                                                            while (true) {
                                                                long[] jArr27 = i83Var2.h;
                                                                iArr4 = iArr14;
                                                                if (i57 >= jArr27.length) {
                                                                    break;
                                                                }
                                                                long j19 = jArr26[i57];
                                                                if (j19 != -1) {
                                                                    long j20 = jArr27[i57];
                                                                    iArr5 = iArr13;
                                                                    jArr10 = jArr26;
                                                                    long a8 = mc3.a(j20, i83Var2.c, i83Var2.d);
                                                                    int i60 = 1;
                                                                    iArr5[i57] = mc3.b(jArr25, j19, true);
                                                                    iArr4[i57] = mc3.a(jArr25, j19 + a8, z6);
                                                                    while (true) {
                                                                        i12 = iArr5[i57];
                                                                        i13 = iArr4[i57];
                                                                        if (i12 >= i13 || (iArr12[i12] & i60) != 0) {
                                                                            break;
                                                                        }
                                                                        iArr5[i57] = i12 + 1;
                                                                        i60 = 1;
                                                                    }
                                                                    int i61 = (i13 - i12) + i58;
                                                                    z7 = (i59 != i12) | z7;
                                                                    i59 = i13;
                                                                    i58 = i61;
                                                                } else {
                                                                    iArr5 = iArr13;
                                                                    jArr10 = jArr26;
                                                                }
                                                                i57++;
                                                                iArr13 = iArr5;
                                                                iArr14 = iArr4;
                                                                jArr26 = jArr10;
                                                            }
                                                            int[] iArr15 = iArr13;
                                                            boolean z8 = z7 | (i58 != b18);
                                                            long[] jArr28 = z8 ? new long[i58] : jArr20;
                                                            int[] iArr16 = z8 ? new int[i58] : iArr3;
                                                            if (z8) {
                                                                i11 = 0;
                                                            }
                                                            int[] iArr17 = z8 ? new int[i58] : iArr12;
                                                            long[] jArr29 = new long[i58];
                                                            int i62 = 0;
                                                            int i63 = 0;
                                                            long j21 = j2;
                                                            while (i62 < i83Var2.h.length) {
                                                                long j22 = i83Var2.i[i62];
                                                                int i64 = iArr15[i62];
                                                                boolean z9 = z8;
                                                                int i65 = iArr4[i62];
                                                                long[] jArr30 = jArr25;
                                                                if (z9) {
                                                                    int i66 = i65 - i64;
                                                                    System.arraycopy(jArr20, i64, jArr28, i63, i66);
                                                                    System.arraycopy(iArr3, i64, iArr16, i63, i66);
                                                                    System.arraycopy(iArr12, i64, iArr17, i63, i66);
                                                                }
                                                                int i67 = i11;
                                                                while (i64 < i65) {
                                                                    int i68 = i65;
                                                                    long[] jArr31 = jArr28;
                                                                    int[] iArr18 = iArr16;
                                                                    int[] iArr19 = iArr17;
                                                                    long j23 = j2;
                                                                    jArr29[i63] = mc3.a(j21, 1000000L, i83Var2.d) + mc3.a(Math.max(j23, jArr30[i64] - j22), 1000000L, i83Var2.c);
                                                                    if (z9 && iArr18[i63] > i67) {
                                                                        i67 = iArr3[i64];
                                                                    }
                                                                    i63++;
                                                                    i64++;
                                                                    j2 = j23;
                                                                    jArr28 = jArr31;
                                                                    i65 = i68;
                                                                    iArr16 = iArr18;
                                                                    iArr17 = iArr19;
                                                                }
                                                                j21 += i83Var2.h[i62];
                                                                i62++;
                                                                i11 = i67;
                                                                z8 = z9;
                                                                jArr25 = jArr30;
                                                                jArr28 = jArr28;
                                                                iArr16 = iArr16;
                                                                iArr17 = iArr17;
                                                            }
                                                            r83Var = new r83(i83Var2, jArr28, iArr16, i11, jArr29, iArr17, mc3.a(j21, 1000000L, i83Var2.d));
                                                        }
                                                        arrayList2 = arrayList;
                                                        arrayList2.add(r83Var);
                                                        i14 = i + 1;
                                                        arrayList3 = arrayList2;
                                                        vjVar2 = vjVar;
                                                    }
                                                    arrayList2 = arrayList;
                                                } else {
                                                    kc2Var9 = null;
                                                }
                                            } else {
                                                i6 = 0;
                                            }
                                            i7 = -1;
                                            a3 = dkVar.a();
                                            kc2 kc2Var112 = kc2Var10;
                                            str = i83Var2.f.m;
                                            ak akVar2 = dkVar;
                                            if (!(a3 == -1 && (MimeTypes.AUDIO_RAW.equals(str) || MimeTypes.AUDIO_MLAW.equals(str) || MimeTypes.AUDIO_ALAW.equals(str)) && p2 == 0 && i5 == 0 && i6 == 0)) {
                                            }
                                            long a42 = mc3.a(j8, 1000000L, i83Var2.c);
                                            jArr9 = i83Var2.h;
                                            if (jArr9 != null) {
                                            }
                                            arrayList2 = arrayList;
                                        }
                                        arrayList2.add(r83Var);
                                        i14 = i + 1;
                                        arrayList3 = arrayList2;
                                        vjVar2 = vjVar;
                                    }
                                }
                            }
                        }
                        jArr = null;
                        jArr2 = null;
                        if (a2.b != null) {
                        }
                    }
                    i2 = i3;
                    j4 = -9223372036854775807L;
                    if (j != j4) {
                    }
                    kc2 kc2Var32 = c.b;
                    kc2Var32.e(8);
                    kc2Var32.e(kc2Var32.b + (((kc2Var32.b() >> 24) & 255) != 0 ? 8 : 16));
                    long n3 = kc2Var32.n();
                    if (j5 != j4) {
                    }
                    vj b112 = b3.b(1835626086);
                    b112.getClass();
                    vj b122 = b112.b(1937007212);
                    b122.getClass();
                    wj c42 = b3.c(1835296868);
                    c42.getClass();
                    kc2 kc2Var42 = c42.b;
                    kc2Var42.e(8);
                    int b132 = (kc2Var42.b() >> 24) & 255;
                    if (b132 == 0) {
                    }
                    kc2Var42.e(kc2Var42.b + (b132 == 0 ? 8 : 16));
                    long n22 = kc2Var42.n();
                    kc2Var42.e(kc2Var42.b + (b132 != 0 ? 4 : 8));
                    int r2 = kc2Var42.r();
                    Pair create22 = Pair.create(Long.valueOf(n22), "" + ((char) (((r2 >> 10) & 31) + 96)) + ((char) (((r2 >> 5) & 31) + 96)) + ((char) ((r2 & 31) + 96)));
                    wj c52 = b122.c(1937011556);
                    c52.getClass();
                    a2 = a(c52.b, b6, i2, (String) create22.second, lk0Var, z2);
                    if (z) {
                    }
                    j6 = j4;
                    jArr = null;
                    jArr2 = null;
                    if (a2.b != null) {
                    }
                }
                i4 = 1937007212;
                i83Var = null;
                i83Var2 = (i83) xy0Var.apply(i83Var);
                if (i83Var2 != null) {
                }
            }
            i14 = i + 1;
            arrayList3 = arrayList2;
            vjVar2 = vjVar;
        }
        return arrayList3;
    }
}
