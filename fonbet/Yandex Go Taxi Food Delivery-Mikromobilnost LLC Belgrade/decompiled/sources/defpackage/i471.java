package defpackage;

import android.util.Pair;
import com.pdfview.subsamplincscaleimageview.SubsamplingScaleImageView;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;
import ru.yandex.video.m3.preload_manager.PreloadManagerBuilder;
import yads.kk0;
import yads.t31;
import yads.wk2;

/* loaded from: classes7.dex */
public abstract class i471 {
    public static final byte[] a;

    static {
        int i = rf71.a;
        a = "OpusHead".getBytes(md81.c);
    }

    public static int a(dl81 dl81Var) {
        int s = dl81Var.s();
        int i = s & HProv.PP_VERSION_TIMESTAMP;
        while ((s & 128) == 128) {
            s = dl81Var.s();
            i = (i << 7) | (s & HProv.PP_VERSION_TIMESTAMP);
        }
        return i;
    }

    public static vi6 b(int i, dl81 dl81Var) {
        long j;
        long j2;
        dl81Var.m(i + 12);
        dl81Var.m(dl81Var.b + 1);
        a(dl81Var);
        dl81Var.m(dl81Var.b + 2);
        int s = dl81Var.s();
        if ((s & 128) != 0) {
            dl81Var.m(dl81Var.b + 2);
        }
        if ((s & 64) != 0) {
            dl81Var.m(dl81Var.b + dl81Var.s());
        }
        if ((s & 32) != 0) {
            dl81Var.m(dl81Var.b + 2);
        }
        dl81Var.m(dl81Var.b + 1);
        a(dl81Var);
        String a2 = g681.a(dl81Var.s());
        if ("audio/mpeg".equals(a2) || "audio/vnd.dts".equals(a2) || "audio/vnd.dts.hd".equals(a2)) {
            return new vi6(-1L, a2, -1L, null);
        }
        dl81Var.m(dl81Var.b + 4);
        long t = dl81Var.t();
        long t2 = dl81Var.t();
        dl81Var.m(dl81Var.b + 1);
        int a3 = a(dl81Var);
        byte[] bArr = new byte[a3];
        dl81Var.d(0, a3, bArr);
        if (t2 <= 0) {
            t2 = -1;
        }
        if (t > 0) {
            j = t2;
            j2 = t;
        } else {
            j = t2;
            j2 = -1;
        }
        return new vi6(j, a2, j2, bArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:362:0x0b2f, code lost:
    
        if (r18 == null) goto L534;
     */
    /* JADX WARN: Removed duplicated region for block: B:127:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0687 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:250:0x06ac  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x02b8  */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Exception, yi6] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static yi6 c(dl81 dl81Var, int i, int i2, String str, kk0 kk0Var, boolean z) {
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z2;
        kk0 kk0Var2;
        int i7;
        kk0 kk0Var3;
        int i8;
        int i9;
        int i10;
        yi6 yi6Var;
        yi6 yi6Var2;
        List list;
        int i11;
        float f;
        int i12;
        int i13;
        byte[] bArr;
        int i14;
        int i15;
        int i16;
        int i17;
        List list2;
        String str2;
        String str3;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        kk0 kk0Var4;
        String str4;
        String str5;
        int i25;
        String str6;
        int i26;
        int i27;
        vi6 vi6Var;
        List list3;
        String str7;
        int i28;
        String str8;
        String str9;
        int i29;
        String str10;
        String str11;
        List n;
        wk2 n2;
        long j;
        String str12 = str;
        kk0 kk0Var5 = kk0Var;
        dl81Var.m(12);
        int a2 = dl81Var.a();
        yi6 yi6Var3 = new yi6(a2, 10);
        int i30 = 0;
        while (i30 < a2) {
            int i31 = dl81Var.b;
            int a3 = dl81Var.a();
            String str13 = "childAtomSize must be positive";
            nea1.a("childAtomSize must be positive", a3 > 0);
            int a4 = dl81Var.a();
            int i32 = 5;
            int i33 = 4;
            int i34 = 3;
            int i35 = 6;
            int i36 = 16;
            if (a4 == 1635148593 || a4 == 1635148595 || a4 == 1701733238 || a4 == 1831958048 || a4 == 1836070006 || a4 == 1752589105 || a4 == 1751479857 || a4 == 1932670515 || a4 == 1211250227 || a4 == 1987063864 || a4 == 1987063865 || a4 == 1635135537 || a4 == 1685479798 || a4 == 1685479729 || a4 == 1685481573 || a4 == 1685481521) {
                i3 = a2;
                i4 = i30;
                String str14 = "childAtomSize must be positive";
                dl81Var.m(i31 + 16);
                dl81Var.m(dl81Var.b + 16);
                int x = dl81Var.x();
                int x2 = dl81Var.x();
                dl81Var.m(dl81Var.b + 50);
                int i37 = dl81Var.b;
                if (a4 == 1701733238) {
                    i5 = i31;
                    i6 = a3;
                    Pair d = d(dl81Var, i5, i6);
                    if (d != null) {
                        a4 = ((Integer) d.first).intValue();
                        if (kk0Var == null) {
                            z2 = false;
                            kk0Var2 = null;
                        } else {
                            String str15 = ((ro71) d.second).b;
                            if (rf71.o(kk0Var.d, str15)) {
                                kk0Var2 = kk0Var;
                                z2 = false;
                            } else {
                                z2 = false;
                                kk0Var2 = new kk0(str15, false, kk0Var.b);
                            }
                        }
                        ((ro71[]) yi6Var3.w)[i4] = (ro71) d.second;
                    } else {
                        z2 = false;
                        kk0Var2 = kk0Var;
                    }
                    dl81Var.m(i37);
                } else {
                    i5 = i31;
                    i6 = a3;
                    z2 = false;
                    kk0Var2 = kk0Var;
                }
                int i38 = i37;
                i7 = i5;
                String str16 = a4 == 1831958048 ? "video/mpeg" : a4 == 1211250227 ? "video/3gpp" : null;
                boolean z3 = z2;
                float f2 = 1.0f;
                List list4 = null;
                String str17 = null;
                int i39 = -1;
                byte[] bArr2 = null;
                ByteBuffer byteBuffer = null;
                vi6 vi6Var2 = null;
                int i40 = -1;
                int i41 = -1;
                int i42 = -1;
                while (true) {
                    if (i38 - i7 >= i6) {
                        kk0Var3 = kk0Var2;
                        break;
                    }
                    dl81Var.m(i38);
                    int i43 = dl81Var.b;
                    int i44 = i38;
                    int a5 = dl81Var.a();
                    kk0Var3 = kk0Var2;
                    if (a5 == 0 && dl81Var.b - i7 == i6) {
                        break;
                    }
                    nea1.a(str14, a5 > 0);
                    int a6 = dl81Var.a();
                    String str18 = str14;
                    if (a6 == 1635148611) {
                        nea1.a(null, str16 == null);
                        dl81Var.m(i43 + 8);
                        fz71 a7 = fz71.a(dl81Var);
                        list2 = a7.a;
                        yi6Var3.b = a7.b;
                        if (!z3) {
                            f2 = a7.e;
                        }
                        str2 = a7.f;
                        str3 = "video/avc";
                    } else if (a6 == 1752589123) {
                        nea1.a(null, str16 == null);
                        dl81Var.m(i43 + 8);
                        b6t0 c = b6t0.c(dl81Var);
                        list2 = (List) c.c;
                        yi6Var3.b = c.a;
                        if (!z3) {
                            f2 = c.b;
                        }
                        str2 = (String) c.d;
                        str3 = "video/hevc";
                    } else {
                        if (a6 == 1685480259 || a6 == 1685485123) {
                            yi6Var2 = yi6Var3;
                            list = list4;
                            i11 = i6;
                            f = f2;
                            i12 = a4;
                            i13 = i39;
                            bArr = bArr2;
                            i14 = i32;
                            i15 = i34;
                            i16 = i35;
                            ag1 a8 = ag1.a(dl81Var);
                            if (a8 != null) {
                                str17 = a8.b;
                                str16 = "video/dolby-vision";
                            }
                        } else {
                            if (a6 == 1987076931) {
                                nea1.a(null, str16 == null);
                                str16 = a4 == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                                yi6Var2 = yi6Var3;
                                list = list4;
                                i11 = i6;
                                i12 = a4;
                                i13 = i39;
                                bArr = bArr2;
                                i14 = i32;
                                i15 = i34;
                                i16 = i35;
                            } else {
                                if (a6 == 1635135811) {
                                    nea1.a(null, str16 == null);
                                    yi6Var2 = yi6Var3;
                                    str16 = "video/av01";
                                } else if (a6 == 1668050025) {
                                    if (byteBuffer == null) {
                                        byteBuffer = ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
                                    }
                                    ByteBuffer byteBuffer2 = byteBuffer;
                                    byteBuffer2.position(21);
                                    byteBuffer2.putShort(dl81Var.q());
                                    byteBuffer2.putShort(dl81Var.q());
                                    yi6Var2 = yi6Var3;
                                    byteBuffer = byteBuffer2;
                                } else if (a6 == 1835295606) {
                                    if (byteBuffer == null) {
                                        byteBuffer = ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
                                    }
                                    ByteBuffer byteBuffer3 = byteBuffer;
                                    short q = dl81Var.q();
                                    short q2 = dl81Var.q();
                                    i11 = i6;
                                    short q3 = dl81Var.q();
                                    i12 = a4;
                                    short q4 = dl81Var.q();
                                    yi6Var2 = yi6Var3;
                                    short q5 = dl81Var.q();
                                    list = list4;
                                    short q6 = dl81Var.q();
                                    i13 = i39;
                                    short q7 = dl81Var.q();
                                    bArr = bArr2;
                                    short q8 = dl81Var.q();
                                    long t = dl81Var.t();
                                    long t2 = dl81Var.t();
                                    byteBuffer3.position(1);
                                    byteBuffer3.putShort(q5);
                                    byteBuffer3.putShort(q6);
                                    byteBuffer3.putShort(q);
                                    byteBuffer3.putShort(q2);
                                    byteBuffer3.putShort(q3);
                                    byteBuffer3.putShort(q4);
                                    byteBuffer3.putShort(q7);
                                    byteBuffer3.putShort(q8);
                                    byteBuffer3.putShort((short) (t / 10000));
                                    byteBuffer3.putShort((short) (t2 / 10000));
                                    byteBuffer = byteBuffer3;
                                    i14 = i32;
                                    i15 = i34;
                                    i16 = i35;
                                    f2 = f2;
                                } else {
                                    yi6Var2 = yi6Var3;
                                    list = list4;
                                    i11 = i6;
                                    f = f2;
                                    i12 = a4;
                                    i13 = i39;
                                    bArr = bArr2;
                                    if (a6 == 1681012275) {
                                        nea1.a(null, str16 == null);
                                        i14 = i32;
                                        i15 = i34;
                                        i16 = i35;
                                        str16 = "video/3gpp";
                                    } else {
                                        if (a6 == 1702061171) {
                                            nea1.a(null, str16 == null);
                                            vi6 b = b(i43, dl81Var);
                                            String str19 = b.a;
                                            byte[] bArr3 = b.b;
                                            if (bArr3 != null) {
                                                list = t31.n(bArr3);
                                            }
                                            vi6Var2 = b;
                                            str16 = str19;
                                        } else {
                                            if (a6 == 1885434736) {
                                                dl81Var.m(i43 + 8);
                                                f2 = dl81Var.v() / dl81Var.v();
                                                i14 = i32;
                                                i15 = i34;
                                                i16 = i35;
                                                z3 = true;
                                            } else if (a6 == 1937126244) {
                                                int i45 = i43 + 8;
                                                while (true) {
                                                    if (i45 - i43 >= a5) {
                                                        bArr = null;
                                                        break;
                                                    }
                                                    dl81Var.m(i45);
                                                    int a9 = dl81Var.a();
                                                    if (dl81Var.a() == 1886547818) {
                                                        bArr = Arrays.copyOfRange(dl81Var.a, i45, a9 + i45);
                                                        break;
                                                    }
                                                    i45 += a9;
                                                }
                                            } else {
                                                if (a6 == 1936995172) {
                                                    int s = dl81Var.s();
                                                    dl81Var.m(dl81Var.b + 3);
                                                    if (s == 0) {
                                                        int s2 = dl81Var.s();
                                                        if (s2 == 0) {
                                                            i15 = i34;
                                                            i14 = i32;
                                                            i16 = i35;
                                                            f2 = f;
                                                            i13 = 0;
                                                        } else if (s2 != 1) {
                                                            i15 = i34;
                                                            if (s2 == 2) {
                                                                i14 = i32;
                                                                i16 = i35;
                                                                f2 = f;
                                                                i13 = 2;
                                                            } else if (s2 == i15) {
                                                                i13 = i15;
                                                                i14 = i32;
                                                                i16 = i35;
                                                            }
                                                        } else {
                                                            i15 = i34;
                                                            i14 = i32;
                                                            i16 = i35;
                                                            f2 = f;
                                                            i13 = 1;
                                                        }
                                                    } else {
                                                        i15 = i34;
                                                    }
                                                } else {
                                                    i15 = i34;
                                                    if (a6 == 1668246642) {
                                                        int a10 = dl81Var.a();
                                                        if (a10 == 1852009592 || a10 == 1852009571) {
                                                            int x3 = dl81Var.x();
                                                            int x4 = dl81Var.x();
                                                            dl81Var.m(dl81Var.b + 2);
                                                            boolean z4 = a5 == 19 && (dl81Var.s() & 128) != 0;
                                                            int i46 = 7;
                                                            if (x3 == 1) {
                                                                i14 = i32;
                                                                i17 = 1;
                                                            } else if (x3 != 9) {
                                                                i14 = i32;
                                                                i17 = (x3 == 4 || x3 == i14 || x3 == i35 || x3 == 7) ? 2 : -1;
                                                            } else {
                                                                i14 = i32;
                                                                i17 = 6;
                                                            }
                                                            int i47 = z4 ? 1 : 2;
                                                            if (x4 != 1) {
                                                                if (x4 == i36) {
                                                                    i16 = 6;
                                                                    i46 = 6;
                                                                } else if (x4 != 18) {
                                                                    i16 = 6;
                                                                    if (x4 != 6 && x4 != 7) {
                                                                        i46 = -1;
                                                                    }
                                                                } else {
                                                                    i16 = 6;
                                                                }
                                                                i42 = i17;
                                                                i40 = i46;
                                                                i41 = i47;
                                                            } else {
                                                                i16 = 6;
                                                            }
                                                            i46 = i15;
                                                            i42 = i17;
                                                            i40 = i46;
                                                            i41 = i47;
                                                        } else {
                                                            ay4.a(a10);
                                                            nba1.e();
                                                        }
                                                    }
                                                }
                                                i14 = i32;
                                                i16 = i35;
                                            }
                                            i38 = i44 + a5;
                                            i35 = i16;
                                            i34 = i15;
                                            i32 = i14;
                                            kk0Var2 = kk0Var3;
                                            str14 = str18;
                                            i6 = i11;
                                            a4 = i12;
                                            yi6Var3 = yi6Var2;
                                            list4 = list;
                                            i39 = i13;
                                            bArr2 = bArr;
                                            i36 = 16;
                                        }
                                        i14 = i32;
                                        i15 = i34;
                                        i16 = i35;
                                    }
                                    f2 = f;
                                }
                                list = list4;
                                i11 = i6;
                                i12 = a4;
                                i13 = i39;
                                bArr = bArr2;
                                i14 = i32;
                                i15 = i34;
                                i16 = i35;
                            }
                            i38 = i44 + a5;
                            i35 = i16;
                            i34 = i15;
                            i32 = i14;
                            kk0Var2 = kk0Var3;
                            str14 = str18;
                            i6 = i11;
                            a4 = i12;
                            yi6Var3 = yi6Var2;
                            list4 = list;
                            i39 = i13;
                            bArr2 = bArr;
                            i36 = 16;
                        }
                        f2 = f;
                        i38 = i44 + a5;
                        i35 = i16;
                        i34 = i15;
                        i32 = i14;
                        kk0Var2 = kk0Var3;
                        str14 = str18;
                        i6 = i11;
                        a4 = i12;
                        yi6Var3 = yi6Var2;
                        list4 = list;
                        i39 = i13;
                        bArr2 = bArr;
                        i36 = 16;
                    }
                    yi6Var2 = yi6Var3;
                    str17 = str2;
                    list = list2;
                    str16 = str3;
                    i11 = i6;
                    i12 = a4;
                    i13 = i39;
                    bArr = bArr2;
                    i14 = i32;
                    i15 = i34;
                    i16 = i35;
                    i38 = i44 + a5;
                    i35 = i16;
                    i34 = i15;
                    i32 = i14;
                    kk0Var2 = kk0Var3;
                    str14 = str18;
                    i6 = i11;
                    a4 = i12;
                    yi6Var3 = yi6Var2;
                    list4 = list;
                    i39 = i13;
                    bArr2 = bArr;
                    i36 = 16;
                }
                yi6 yi6Var4 = yi6Var3;
                List list5 = list4;
                i8 = i6;
                float f3 = f2;
                int i48 = i39;
                byte[] bArr4 = bArr2;
                if (str16 == null) {
                    yi6Var = yi6Var4;
                } else {
                    da81 da81Var = new da81();
                    da81Var.a = Integer.toString(i);
                    da81Var.k = str16;
                    da81Var.h = str17;
                    da81Var.p = x;
                    da81Var.q = x2;
                    da81Var.t = f3;
                    da81Var.s = i2;
                    da81Var.u = bArr4;
                    da81Var.v = i48;
                    da81Var.m = list5;
                    da81Var.n = kk0Var3;
                    int i49 = i42;
                    if (i49 == -1) {
                        i10 = i41;
                        i9 = i40;
                        if (i10 == -1) {
                            if (i9 == -1) {
                            }
                        }
                    } else {
                        i9 = i40;
                        i10 = i41;
                    }
                    da81Var.w = new hw81(i49, i10, i9, byteBuffer != null ? byteBuffer.array() : null);
                    if (vi6Var2 != null) {
                        vi6 vi6Var3 = vi6Var2;
                        da81Var.f = aka1.g(vi6Var3.c);
                        da81Var.g = aka1.g(vi6Var3.d);
                    }
                    qd81 qd81Var = new qd81(da81Var);
                    yi6Var = yi6Var4;
                    yi6Var.x = qd81Var;
                }
            } else {
                Object obj = null;
                if (a4 == 1836069985 || a4 == 1701733217 || a4 == 1633889587 || a4 == 1700998451 || a4 == 1633889588 || a4 == 1835823201 || a4 == 1685353315 || a4 == 1685353317 || a4 == 1685353320 || a4 == 1685353324 || a4 == 1685353336 || a4 == 1935764850 || a4 == 1935767394 || a4 == 1819304813 || a4 == 1936684916 || a4 == 1953984371 || a4 == 778924082 || a4 == 778924083 || a4 == 1835557169 || a4 == 1835560241 || a4 == 1634492771 || a4 == 1634492791 || a4 == 1970037111 || a4 == 1332770163 || a4 == 1716281667) {
                    dl81Var.m(i31 + 16);
                    if (z) {
                        i18 = dl81Var.x();
                        dl81Var.m(dl81Var.b + 6);
                    } else {
                        dl81Var.m(dl81Var.b + 8);
                        i18 = 0;
                    }
                    if (i18 != 0) {
                        i19 = 20;
                        if (i18 != 1) {
                            if (i18 == 2) {
                                dl81Var.m(dl81Var.b + 16);
                                i4 = i30;
                                i22 = (int) Math.round(Double.longBitsToDouble(dl81Var.o()));
                                i21 = dl81Var.v();
                                dl81Var.m(dl81Var.b + 20);
                                i20 = 0;
                                i23 = dl81Var.b;
                                if (a4 != 1701733217) {
                                    Pair d2 = d(dl81Var, i31, a3);
                                    if (d2 != null) {
                                        a4 = ((Integer) d2.first).intValue();
                                        if (kk0Var5 == null) {
                                            i3 = a2;
                                            i24 = i22;
                                            kk0Var4 = null;
                                        } else {
                                            String str20 = ((ro71) d2.second).b;
                                            if (rf71.o(kk0Var5.d, str20)) {
                                                kk0Var4 = kk0Var5;
                                                i3 = a2;
                                                i24 = i22;
                                            } else {
                                                i3 = a2;
                                                i24 = i22;
                                                kk0Var4 = new kk0(str20, false, kk0Var5.b);
                                            }
                                        }
                                        ((ro71[]) yi6Var3.w)[i4] = (ro71) d2.second;
                                    } else {
                                        i3 = a2;
                                        i24 = i22;
                                        kk0Var4 = kk0Var5;
                                    }
                                    dl81Var.m(i23);
                                } else {
                                    i3 = a2;
                                    i24 = i22;
                                    kk0Var4 = kk0Var5;
                                }
                                String str21 = "audio/eac3";
                                String str22 = "audio/ac3";
                                if (a4 != 1633889587) {
                                    str4 = "audio/eac3";
                                    str21 = "audio/ac3";
                                } else if (a4 == 1700998451) {
                                    str4 = "audio/eac3";
                                } else if (a4 == 1633889588) {
                                    str4 = "audio/eac3";
                                    str21 = "audio/ac4";
                                } else {
                                    if (a4 == 1685353315) {
                                        str6 = "audio/vnd.dts";
                                    } else if (a4 == 1685353320 || a4 == 1685353324) {
                                        str4 = "audio/eac3";
                                        str21 = "audio/vnd.dts.hd";
                                    } else if (a4 == 1685353317) {
                                        str6 = "audio/vnd.dts.hd;profile=lbr";
                                    } else if (a4 == 1685353336) {
                                        str6 = "audio/vnd.dts.uhd;profile=p2";
                                    } else if (a4 == 1935764850) {
                                        str6 = "audio/3gpp";
                                    } else if (a4 == 1935767394) {
                                        str6 = "audio/amr-wb";
                                    } else {
                                        str5 = "audio/raw";
                                        str4 = "audio/eac3";
                                        if (a4 == 1819304813 || a4 == 1936684916) {
                                            i25 = 2;
                                        } else if (a4 == 1953984371) {
                                            i25 = SelfTester_JCP.IMITA;
                                        } else if (a4 == 778924082 || a4 == 778924083) {
                                            str21 = "audio/mpeg";
                                        } else if (a4 == 1835557169) {
                                            str21 = "audio/mha1";
                                        } else if (a4 == 1835560241) {
                                            str21 = "audio/mhm1";
                                        } else if (a4 == 1634492771) {
                                            str21 = "audio/alac";
                                        } else if (a4 == 1634492791) {
                                            str21 = "audio/g711-alaw";
                                        } else if (a4 == 1970037111) {
                                            str21 = "audio/g711-mlaw";
                                        } else if (a4 == 1332770163) {
                                            str21 = "audio/opus";
                                        } else if (a4 == 1716281667) {
                                            str21 = "audio/flac";
                                        } else if (a4 == 1835823201) {
                                            str21 = "audio/true-hd";
                                        } else {
                                            str5 = null;
                                            i25 = -1;
                                        }
                                        i26 = i21;
                                        i27 = i24;
                                        String str23 = null;
                                        vi6Var = null;
                                        list3 = null;
                                        while (i23 - i31 < a3) {
                                            dl81Var.m(i23);
                                            int a11 = dl81Var.a();
                                            int i50 = a3;
                                            nea1.a(str13, a11 > 0);
                                            int a12 = dl81Var.a();
                                            int i51 = i25;
                                            if (a12 == 1835557187) {
                                                int i52 = a11 - 13;
                                                byte[] bArr5 = new byte[i52];
                                                str8 = str23;
                                                dl81Var.m(i23 + 13);
                                                dl81Var.d(0, i52, bArr5);
                                                list3 = t31.n(bArr5);
                                                str10 = str13;
                                                str9 = str22;
                                            } else {
                                                str8 = str23;
                                                int i53 = 1702061171;
                                                if (a12 != 1702061171) {
                                                    if (z && a12 == 2002876005) {
                                                        i53 = 1702061171;
                                                    } else {
                                                        int[] iArr = aba1.d;
                                                        int[] iArr2 = aba1.b;
                                                        if (a12 == 1684103987) {
                                                            dl81Var.m(i23 + 8);
                                                            String num = Integer.toString(i);
                                                            int i54 = iArr2[(dl81Var.s() & 192) >> 6];
                                                            int s3 = dl81Var.s();
                                                            int i55 = iArr[(s3 & 56) >> 3];
                                                            if ((s3 & 4) != 0) {
                                                                i55++;
                                                            }
                                                            str11 = str13;
                                                            da81 da81Var2 = new da81();
                                                            da81Var2.a = num;
                                                            da81Var2.k = str22;
                                                            da81Var2.x = i55;
                                                            da81Var2.y = i54;
                                                            da81Var2.n = kk0Var4;
                                                            da81Var2.c = str12;
                                                            yi6Var3.x = new qd81(da81Var2);
                                                            str9 = str22;
                                                        } else {
                                                            str11 = str13;
                                                            if (a12 == 1684366131) {
                                                                dl81Var.m(i23 + 8);
                                                                String num2 = Integer.toString(i);
                                                                dl81Var.m(dl81Var.b + 2);
                                                                int i56 = iArr2[(dl81Var.s() & 192) >> 6];
                                                                int s4 = dl81Var.s();
                                                                int i57 = iArr[(s4 & 14) >> 1];
                                                                if ((s4 & 1) != 0) {
                                                                    i57++;
                                                                }
                                                                if (((dl81Var.s() & 30) >> 1) > 0 && (dl81Var.s() & 2) != 0) {
                                                                    i57 += 2;
                                                                }
                                                                String str24 = (dl81Var.c - dl81Var.b <= 0 || (dl81Var.s() & 1) == 0) ? str4 : "audio/eac3-joc";
                                                                str9 = str22;
                                                                da81 da81Var3 = new da81();
                                                                da81Var3.a = num2;
                                                                da81Var3.k = str24;
                                                                da81Var3.x = i57;
                                                                da81Var3.y = i56;
                                                                da81Var3.n = kk0Var4;
                                                                da81Var3.c = str12;
                                                                yi6Var3.x = new qd81(da81Var3);
                                                            } else {
                                                                str9 = str22;
                                                                if (a12 == 1684103988) {
                                                                    dl81Var.m(i23 + 8);
                                                                    String num3 = Integer.toString(i);
                                                                    dl81Var.m(dl81Var.b + 1);
                                                                    int i58 = ((dl81Var.s() & 32) >> 5) == 1 ? 48000 : 44100;
                                                                    da81 da81Var4 = new da81();
                                                                    da81Var4.a = num3;
                                                                    da81Var4.k = "audio/ac4";
                                                                    da81Var4.x = 2;
                                                                    da81Var4.y = i58;
                                                                    da81Var4.n = kk0Var4;
                                                                    da81Var4.c = str12;
                                                                    yi6Var3.x = new qd81(da81Var4);
                                                                } else {
                                                                    if (a12 == 1684892784) {
                                                                        if (i20 <= 0) {
                                                                            ?? r1 = obj;
                                                                            dy31.g(r1, q8a1.c(i20, "Invalid sample rate for Dolby TrueHD MLP stream: "));
                                                                            return r1;
                                                                        }
                                                                        i27 = i20;
                                                                        str23 = str8;
                                                                        str10 = str11;
                                                                        i26 = 2;
                                                                    } else if (a12 == 1684305011) {
                                                                        da81 da81Var5 = new da81();
                                                                        da81Var5.a = Integer.toString(i);
                                                                        da81Var5.k = str5;
                                                                        da81Var5.x = i26;
                                                                        da81Var5.y = i27;
                                                                        da81Var5.n = kk0Var4;
                                                                        da81Var5.c = str12;
                                                                        yi6Var3.x = new qd81(da81Var5);
                                                                    } else {
                                                                        if (a12 == 1682927731) {
                                                                            int i59 = a11 - 8;
                                                                            byte[] bArr6 = a;
                                                                            byte[] copyOf = Arrays.copyOf(bArr6, bArr6.length + i59);
                                                                            dl81Var.m(i23 + 8);
                                                                            dl81Var.d(bArr6.length, i59, copyOf);
                                                                            n = m7a1.a(copyOf);
                                                                        } else if (a12 == 1684425825) {
                                                                            byte[] bArr7 = new byte[a11 - 8];
                                                                            bArr7[0] = 102;
                                                                            bArr7[1] = 76;
                                                                            bArr7[2] = 97;
                                                                            bArr7[3] = 67;
                                                                            dl81Var.m(i23 + 12);
                                                                            dl81Var.d(i33, a11 - 12, bArr7);
                                                                            n = t31.n(bArr7);
                                                                        } else if (a12 == 1634492771) {
                                                                            int i60 = a11 - 12;
                                                                            byte[] bArr8 = new byte[i60];
                                                                            dl81Var.m(i23 + 12);
                                                                            dl81Var.d(0, i60, bArr8);
                                                                            dl81 dl81Var2 = new dl81(bArr8);
                                                                            dl81Var2.m(9);
                                                                            int s5 = dl81Var2.s();
                                                                            dl81Var2.m(i19);
                                                                            Pair create = Pair.create(Integer.valueOf(dl81Var2.v()), Integer.valueOf(s5));
                                                                            int intValue = ((Integer) create.first).intValue();
                                                                            i26 = ((Integer) create.second).intValue();
                                                                            list3 = t31.n(bArr8);
                                                                            i27 = intValue;
                                                                            str23 = str8;
                                                                            str10 = str11;
                                                                        }
                                                                        list3 = n;
                                                                        str23 = str8;
                                                                        str10 = str11;
                                                                    }
                                                                    i23 += a11;
                                                                    str13 = str10;
                                                                    a3 = i50;
                                                                    i25 = i51;
                                                                    str22 = str9;
                                                                    i33 = 4;
                                                                    obj = null;
                                                                    i19 = 20;
                                                                }
                                                            }
                                                        }
                                                        str10 = str11;
                                                    }
                                                }
                                                String str25 = str13;
                                                str9 = str22;
                                                if (a12 != i53) {
                                                    i29 = dl81Var.b;
                                                    nea1.a(null, i29 >= i23);
                                                    while (true) {
                                                        if (i29 - i23 >= a11) {
                                                            str10 = str25;
                                                            i29 = -1;
                                                            break;
                                                        }
                                                        dl81Var.m(i29);
                                                        int a13 = dl81Var.a();
                                                        str10 = str25;
                                                        nea1.a(str10, a13 > 0);
                                                        if (dl81Var.a() == 1702061171) {
                                                            break;
                                                        }
                                                        i29 += a13;
                                                        str25 = str10;
                                                    }
                                                } else {
                                                    i29 = i23;
                                                    str10 = str25;
                                                }
                                                if (i29 != -1) {
                                                    vi6 b2 = b(i29, dl81Var);
                                                    String str26 = b2.a;
                                                    byte[] bArr9 = b2.b;
                                                    if (bArr9 != null) {
                                                        if ("audio/mp4a-latm".equals(str26)) {
                                                            int length = bArr9.length;
                                                            uh81 uh81Var = new uh81();
                                                            uh81Var.a = bArr9;
                                                            uh81Var.d = length;
                                                            a4 a14 = vaa1.a(uh81Var, false);
                                                            int i61 = a14.b;
                                                            int i62 = a14.c;
                                                            str8 = a14.a;
                                                            i27 = i61;
                                                            i26 = i62;
                                                        }
                                                        vi6Var = b2;
                                                        str5 = str26;
                                                        list3 = t31.n(bArr9);
                                                    } else {
                                                        vi6Var = b2;
                                                        str5 = str26;
                                                    }
                                                }
                                            }
                                            str23 = str8;
                                            i23 += a11;
                                            str13 = str10;
                                            a3 = i50;
                                            i25 = i51;
                                            str22 = str9;
                                            i33 = 4;
                                            obj = null;
                                            i19 = 20;
                                        }
                                        str7 = str23;
                                        i28 = i25;
                                        int i63 = a3;
                                        if (((qd81) yi6Var3.x) == null && str5 != null) {
                                            da81 da81Var6 = new da81();
                                            da81Var6.a = Integer.toString(i);
                                            da81Var6.k = str5;
                                            da81Var6.h = str7;
                                            da81Var6.x = i26;
                                            da81Var6.y = i27;
                                            da81Var6.z = i28;
                                            da81Var6.m = list3;
                                            da81Var6.n = kk0Var4;
                                            da81Var6.c = str12;
                                            if (vi6Var != null) {
                                                vi6 vi6Var4 = vi6Var;
                                                da81Var6.f = aka1.g(vi6Var4.c);
                                                da81Var6.g = aka1.g(vi6Var4.d);
                                            }
                                            yi6Var3.x = new qd81(da81Var6);
                                        }
                                        yi6Var = yi6Var3;
                                        i8 = i63;
                                        i7 = i31;
                                    }
                                    str4 = "audio/eac3";
                                    str21 = str6;
                                }
                                str5 = str21;
                                i25 = -1;
                                i26 = i21;
                                i27 = i24;
                                String str232 = null;
                                vi6Var = null;
                                list3 = null;
                                while (i23 - i31 < a3) {
                                }
                                str7 = str232;
                                i28 = i25;
                                int i632 = a3;
                                if (((qd81) yi6Var3.x) == null) {
                                    da81 da81Var62 = new da81();
                                    da81Var62.a = Integer.toString(i);
                                    da81Var62.k = str5;
                                    da81Var62.h = str7;
                                    da81Var62.x = i26;
                                    da81Var62.y = i27;
                                    da81Var62.z = i28;
                                    da81Var62.m = list3;
                                    da81Var62.n = kk0Var4;
                                    da81Var62.c = str12;
                                    if (vi6Var != null) {
                                    }
                                    yi6Var3.x = new qd81(da81Var62);
                                }
                                yi6Var = yi6Var3;
                                i8 = i632;
                                i7 = i31;
                            } else {
                                i4 = i30;
                                i3 = a2;
                                yi6Var = yi6Var3;
                            }
                        }
                    } else {
                        i19 = 20;
                    }
                    i4 = i30;
                    i21 = dl81Var.x();
                    dl81Var.m(dl81Var.b + 6);
                    byte[] bArr10 = dl81Var.a;
                    int i64 = dl81Var.b;
                    int i65 = i64 + 1;
                    dl81Var.b = i65;
                    int i66 = (bArr10[i64] & 255) << 8;
                    dl81Var.b = i64 + 2;
                    i22 = (bArr10[i65] & 255) | i66;
                    dl81Var.b = i64 + 4;
                    dl81Var.m(i64);
                    i20 = dl81Var.a();
                    if (i18 == 1) {
                        dl81Var.m(dl81Var.b + 16);
                    }
                    i23 = dl81Var.b;
                    if (a4 != 1701733217) {
                    }
                    String str212 = "audio/eac3";
                    String str222 = "audio/ac3";
                    if (a4 != 1633889587) {
                    }
                    str5 = str212;
                    i25 = -1;
                    i26 = i21;
                    i27 = i24;
                    String str2322 = null;
                    vi6Var = null;
                    list3 = null;
                    while (i23 - i31 < a3) {
                    }
                    str7 = str2322;
                    i28 = i25;
                    int i6322 = a3;
                    if (((qd81) yi6Var3.x) == null) {
                    }
                    yi6Var = yi6Var3;
                    i8 = i6322;
                    i7 = i31;
                } else {
                    if (a4 == 1414810956 || a4 == 1954034535 || a4 == 2004251764 || a4 == 1937010800 || a4 == 1664495672) {
                        dl81Var.m(i31 + 16);
                        String str27 = "application/ttml+xml";
                        long j2 = ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED;
                        if (a4 != 1414810956) {
                            if (a4 == 1954034535) {
                                int i67 = a3 - 16;
                                byte[] bArr11 = new byte[i67];
                                dl81Var.d(0, i67, bArr11);
                                n2 = t31.n(bArr11);
                                str27 = "application/x-quicktime-tx3g";
                                j = Long.MAX_VALUE;
                                da81 da81Var7 = new da81();
                                da81Var7.a = Integer.toString(i);
                                da81Var7.k = str27;
                                da81Var7.c = str12;
                                da81Var7.o = j;
                                da81Var7.m = n2;
                                yi6Var3.x = new qd81(da81Var7);
                            } else if (a4 == 2004251764) {
                                str27 = "application/x-mp4-vtt";
                            } else if (a4 == 1937010800) {
                                j2 = 0;
                            } else {
                                if (a4 != 1664495672) {
                                    ny61.k();
                                    return null;
                                }
                                yi6Var3.c = 1;
                                str27 = "application/x-mp4-cea-608";
                            }
                        }
                        j = j2;
                        n2 = null;
                        da81 da81Var72 = new da81();
                        da81Var72.a = Integer.toString(i);
                        da81Var72.k = str27;
                        da81Var72.c = str12;
                        da81Var72.o = j;
                        da81Var72.m = n2;
                        yi6Var3.x = new qd81(da81Var72);
                    } else if (a4 == 1835365492) {
                        dl81Var.m(i31 + 16);
                        if (a4 == 1835365492) {
                            dl81Var.p();
                            String p = dl81Var.p();
                            if (p != null) {
                                da81 da81Var8 = new da81();
                                da81Var8.a = Integer.toString(i);
                                da81Var8.k = p;
                                yi6Var3.x = new qd81(da81Var8);
                            }
                        }
                    } else if (a4 == 1667329389) {
                        da81 da81Var9 = new da81();
                        da81Var9.a = Integer.toString(i);
                        da81Var9.k = "application/x-camera-motion";
                        yi6Var3.x = new qd81(da81Var9);
                    }
                    i3 = a2;
                    yi6Var = yi6Var3;
                    i4 = i30;
                }
                i7 = i31;
                i8 = a3;
            }
            dl81Var.m(i7 + i8);
            i30 = i4 + 1;
            kk0Var5 = kk0Var;
            yi6Var3 = yi6Var;
            a2 = i3;
            str12 = str;
        }
        return yi6Var3;
    }

    public static Pair d(dl81 dl81Var, int i, int i2) {
        Integer num;
        ro71 ro71Var;
        Pair create;
        int i3;
        int i4;
        Integer num2;
        boolean z;
        int i5 = dl81Var.b;
        while (i5 - i < i2) {
            dl81Var.m(i5);
            int a2 = dl81Var.a();
            nea1.a("childAtomSize must be positive", a2 > 0);
            if (dl81Var.a() == 1936289382) {
                int i6 = i5 + 8;
                int i7 = 0;
                int i8 = -1;
                Integer num3 = null;
                String str = null;
                while (i6 - i5 < a2) {
                    dl81Var.m(i6);
                    int a3 = dl81Var.a();
                    int a4 = dl81Var.a();
                    if (a4 == 1718775137) {
                        num3 = Integer.valueOf(dl81Var.a());
                    } else if (a4 == 1935894637) {
                        dl81Var.m(dl81Var.b + 4);
                        str = dl81Var.b(4, md81.c);
                    } else if (a4 == 1935894633) {
                        i8 = i6;
                        i7 = a3;
                    }
                    i6 += a3;
                }
                byte[] bArr = null;
                if ("cenc".equals(str) || "cbc1".equals(str) || "cens".equals(str) || "cbcs".equals(str)) {
                    nea1.a("frma atom is mandatory", num3 != null);
                    nea1.a("schi atom is mandatory", i8 != -1);
                    int i9 = i8 + 8;
                    while (true) {
                        if (i9 - i8 >= i7) {
                            num = num3;
                            ro71Var = null;
                            break;
                        }
                        dl81Var.m(i9);
                        int a5 = dl81Var.a();
                        if (dl81Var.a() == 1952804451) {
                            int a6 = (dl81Var.a() >> 24) & 255;
                            dl81Var.m(dl81Var.b + 1);
                            if (a6 == 0) {
                                dl81Var.m(dl81Var.b + 1);
                                i4 = 0;
                                i3 = 0;
                            } else {
                                int s = dl81Var.s();
                                i3 = s & 15;
                                i4 = (s & PreloadManagerBuilder.MAXIMUM_TRACK_PRELOAD_TIMEOUT_IN_SEC) >> 4;
                            }
                            if (dl81Var.s() == 1) {
                                num2 = num3;
                                z = true;
                            } else {
                                num2 = num3;
                                z = false;
                            }
                            int s2 = dl81Var.s();
                            byte[] bArr2 = new byte[16];
                            dl81Var.d(0, 16, bArr2);
                            if (z && s2 == 0) {
                                int s3 = dl81Var.s();
                                byte[] bArr3 = new byte[s3];
                                dl81Var.d(0, s3, bArr3);
                                bArr = bArr3;
                            }
                            num = num2;
                            ro71Var = new ro71(z, str, s2, bArr2, i4, i3, bArr);
                        } else {
                            i9 += a5;
                        }
                    }
                    nea1.a("tenc atom is mandatory", ro71Var != null);
                    int i10 = rf71.a;
                    create = Pair.create(num, ro71Var);
                } else {
                    create = null;
                }
                if (create != null) {
                    return create;
                }
            }
            i5 += a2;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:269:0x00e6, code lost:
    
        if (r11 == 0) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0148  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList e(wl81 wl81Var, co71 co71Var, long j, kk0 kk0Var, boolean z, boolean z2, re71 re71Var) {
        int i;
        long j2;
        long j3;
        long j4;
        int i2;
        int i3;
        long j5;
        yi6 c;
        long j6;
        long[] jArr;
        long[] jArr2;
        wl71 wl71Var;
        wl81 j7;
        Pair create;
        long j8;
        long a2;
        wl71 wl71Var2;
        ii61 zi6Var;
        boolean z3;
        ArrayList arrayList;
        int i4;
        int i5;
        int i6;
        ArrayList arrayList2;
        int i7;
        long[] jArr3;
        long[] jArr4;
        int[] iArr;
        boolean z4;
        int i8;
        int i9;
        long j9;
        int[] iArr2;
        long[] jArr5;
        int i10;
        je81 je81Var;
        int[] iArr3;
        int i11;
        int i12;
        int i13;
        ArrayList arrayList3;
        wl81 wl81Var2 = wl81Var;
        ArrayList arrayList4 = wl81Var2.e;
        ArrayList arrayList5 = new ArrayList();
        int i14 = 0;
        while (i14 < arrayList4.size()) {
            wl81 wl81Var3 = (wl81) arrayList4.get(i14);
            if (wl81Var3.b != 1953653099) {
                arrayList = arrayList4;
                arrayList3 = arrayList5;
                i = i14;
            } else {
                hp81 k = wl81Var2.k(1836476516);
                k.getClass();
                wl81 j10 = wl81Var3.j(1835297121);
                j10.getClass();
                hp81 k2 = j10.k(1751411826);
                k2.getClass();
                dl81 dl81Var = k2.c;
                dl81Var.m(16);
                int a3 = dl81Var.a();
                int i15 = a3 == 1936684398 ? 1 : a3 == 1986618469 ? 2 : (a3 == 1952807028 || a3 == 1935832172 || a3 == 1937072756 || a3 == 1668047728) ? 3 : a3 == 1835365473 ? 5 : -1;
                i = i14;
                if (i15 == -1) {
                    j2 = 0;
                } else {
                    hp81 k3 = wl81Var3.k(1953196132);
                    k3.getClass();
                    dl81 dl81Var2 = k3.c;
                    j2 = 0;
                    dl81Var2.m(8);
                    int a4 = (dl81Var2.a() >> 24) & 255;
                    dl81Var2.m(dl81Var2.b + (a4 == 0 ? 8 : 16));
                    int a5 = dl81Var2.a();
                    dl81Var2.m(dl81Var2.b + 4);
                    int i16 = dl81Var2.b;
                    int i17 = a4 == 0 ? 4 : 8;
                    int i18 = 0;
                    while (true) {
                        if (i18 >= i17) {
                            dl81Var2.m(dl81Var2.b + i17);
                            break;
                        }
                        if (dl81Var2.a[i16 + i18] != -1) {
                            j3 = a4 == 0 ? dl81Var2.t() : dl81Var2.w();
                        } else {
                            i18++;
                        }
                    }
                    j3 = -9223372036854775807L;
                    dl81Var2.m(dl81Var2.b + 16);
                    int a6 = dl81Var2.a();
                    int a7 = dl81Var2.a();
                    dl81Var2.m(dl81Var2.b + 4);
                    int a8 = dl81Var2.a();
                    int a9 = dl81Var2.a();
                    if (a6 == 0 && a7 == 65536 && a8 == -65536 && a9 == 0) {
                        i3 = 90;
                    } else if (a6 == 0 && a7 == -65536 && a8 == 65536 && a9 == 0) {
                        i3 = SubsamplingScaleImageView.ORIENTATION_270;
                    } else if (a6 == -65536 && a7 == 0 && a8 == 0 && a9 == -65536) {
                        i3 = SubsamplingScaleImageView.ORIENTATION_180;
                    } else {
                        j4 = -9223372036854775807L;
                        i2 = 0;
                        j5 = j != j4 ? j3 : j;
                        dl81 dl81Var3 = k.c;
                        dl81Var3.m(8);
                        dl81Var3.m(dl81Var3.b + (((dl81Var3.a() >> 24) & 255) != 0 ? 8 : 16));
                        long t = dl81Var3.t();
                        if (j5 != j4) {
                            j4 = rf71.h(j5, 1000000L, t);
                        }
                        wl81 j11 = j10.j(1835626086);
                        j11.getClass();
                        wl81 j12 = j11.j(1937007212);
                        j12.getClass();
                        hp81 k4 = j10.k(1835296868);
                        k4.getClass();
                        dl81 dl81Var4 = k4.c;
                        dl81Var4.m(8);
                        int a10 = (dl81Var4.a() >> 24) & 255;
                        dl81Var4.m(dl81Var4.b + (a10 != 0 ? 8 : 16));
                        long t2 = dl81Var4.t();
                        dl81Var4.m(dl81Var4.b + (a10 != 0 ? 4 : 8));
                        int x = dl81Var4.x();
                        Pair create2 = Pair.create(Long.valueOf(t2), "" + ((char) (((x >> 10) & 31) + 96)) + ((char) (((x >> 5) & 31) + 96)) + ((char) ((x & 31) + 96)));
                        hp81 k5 = j12.k(1937011556);
                        k5.getClass();
                        c = c(k5.c, a5, i2, (String) create2.second, kk0Var, z2);
                        if (!z || (j7 = wl81Var3.j(1701082227)) == null) {
                            j6 = j4;
                        } else {
                            hp81 k6 = j7.k(1701606260);
                            if (k6 == null) {
                                j6 = j4;
                                create = null;
                            } else {
                                dl81 dl81Var5 = k6.c;
                                dl81Var5.m(8);
                                int a11 = (dl81Var5.a() >> 24) & 255;
                                int v = dl81Var5.v();
                                long[] jArr6 = new long[v];
                                long[] jArr7 = new long[v];
                                int i19 = 0;
                                while (i19 < v) {
                                    jArr6[i19] = a11 == 1 ? dl81Var5.w() : dl81Var5.t();
                                    if (a11 == 1) {
                                        a2 = dl81Var5.o();
                                        j8 = j4;
                                    } else {
                                        j8 = j4;
                                        a2 = dl81Var5.a();
                                    }
                                    jArr7[i19] = a2;
                                    if (dl81Var5.q() != 1) {
                                        ny61.g("Unsupported media rate.");
                                        return null;
                                    }
                                    dl81Var5.m(dl81Var5.b + 2);
                                    i19++;
                                    j4 = j8;
                                }
                                j6 = j4;
                                create = Pair.create(jArr6, jArr7);
                            }
                            if (create != null) {
                                jArr = (long[]) create.first;
                                jArr2 = (long[]) create.second;
                                if (((qd81) c.x) != null) {
                                    wl71Var = new wl71(a5, i15, ((Long) create2.first).longValue(), t, j6, (qd81) c.x, c.c, (ro71[]) c.w, c.b, jArr, jArr2);
                                    wl71Var2 = (wl71) re71Var.c(wl71Var);
                                    if (wl71Var2 != null) {
                                        arrayList = arrayList4;
                                        arrayList3 = arrayList5;
                                    } else {
                                        int i20 = wl71Var2.b;
                                        long j13 = wl71Var2.c;
                                        long[] jArr8 = wl71Var2.i;
                                        qd81 qd81Var = wl71Var2.f;
                                        long[] jArr9 = wl71Var2.h;
                                        wl81 j14 = wl81Var3.j(1835297121);
                                        j14.getClass();
                                        wl81 j15 = j14.j(1835626086);
                                        j15.getClass();
                                        wl81 j16 = j15.j(1937007212);
                                        j16.getClass();
                                        hp81 k7 = j16.k(1937011578);
                                        if (k7 != null) {
                                            zi6Var = new kn1(k7, qd81Var);
                                        } else {
                                            hp81 k8 = j16.k(1937013298);
                                            if (k8 == null) {
                                                dy31.g(null, "Track has no sample table size information");
                                                return null;
                                            }
                                            zi6Var = new zi6(k8);
                                        }
                                        int b = zi6Var.b();
                                        if (b == 0) {
                                            je81Var = new je81(wl71Var2, new long[0], new int[0], 0, new long[0], new int[0], 0L);
                                            arrayList = arrayList4;
                                            arrayList3 = arrayList5;
                                        } else {
                                            hp81 k9 = j16.k(1937007471);
                                            if (k9 == null) {
                                                k9 = j16.k(1668232756);
                                                k9.getClass();
                                                z3 = true;
                                            } else {
                                                z3 = false;
                                            }
                                            dl81 dl81Var6 = k9.c;
                                            arrayList = arrayList4;
                                            hp81 k10 = j16.k(1937011555);
                                            k10.getClass();
                                            dl81 dl81Var7 = k10.c;
                                            hp81 k11 = j16.k(1937011827);
                                            k11.getClass();
                                            dl81 dl81Var8 = k11.c;
                                            hp81 k12 = j16.k(1937011571);
                                            dl81 dl81Var9 = k12 != null ? k12.c : null;
                                            ii61 ii61Var = zi6Var;
                                            hp81 k13 = j16.k(1668576371);
                                            dl81 dl81Var10 = k13 != null ? k13.c : null;
                                            ui6 ui6Var = new ui6(dl81Var7, dl81Var6, z3);
                                            dl81Var8.m(12);
                                            int v2 = dl81Var8.v() - 1;
                                            int v3 = dl81Var8.v();
                                            int v4 = dl81Var8.v();
                                            if (dl81Var10 != null) {
                                                dl81Var10.m(12);
                                                i4 = dl81Var10.v();
                                            } else {
                                                i4 = 0;
                                            }
                                            if (dl81Var9 != null) {
                                                dl81Var9.m(12);
                                                int v5 = dl81Var9.v();
                                                if (v5 > 0) {
                                                    i5 = dl81Var9.v() - 1;
                                                    i6 = v5;
                                                } else {
                                                    i6 = v5;
                                                    dl81Var9 = null;
                                                    i5 = -1;
                                                }
                                            } else {
                                                i5 = -1;
                                                i6 = 0;
                                            }
                                            int a12 = ii61Var.a();
                                            dl81 dl81Var11 = dl81Var9;
                                            String str = qd81Var.E;
                                            int i21 = qd81Var.S;
                                            dl81 dl81Var12 = dl81Var10;
                                            if (a12 == -1 || !(("audio/raw".equals(str) || "audio/g711-mlaw".equals(str) || "audio/g711-alaw".equals(str)) && v2 == 0 && i4 == 0 && i6 == 0)) {
                                                long[] jArr10 = new long[b];
                                                int[] iArr4 = new int[b];
                                                long[] jArr11 = new long[b];
                                                int[] iArr5 = new int[b];
                                                int i22 = v2;
                                                int i23 = v4;
                                                int i24 = i4;
                                                int i25 = v3;
                                                int i26 = i5;
                                                int i27 = i24;
                                                arrayList2 = arrayList5;
                                                i7 = i21;
                                                long j17 = j2;
                                                long j18 = j17;
                                                int i28 = 0;
                                                int i29 = 0;
                                                int i30 = 0;
                                                int i31 = 0;
                                                int i32 = 0;
                                                while (true) {
                                                    if (i29 >= b) {
                                                        jArr3 = jArr9;
                                                        break;
                                                    }
                                                    boolean z5 = true;
                                                    while (i31 == 0) {
                                                        z5 = ui6Var.a();
                                                        if (!z5) {
                                                            break;
                                                        }
                                                        j18 = ui6Var.d;
                                                        i31 = ui6Var.c;
                                                        jArr9 = jArr9;
                                                        b = b;
                                                    }
                                                    jArr3 = jArr9;
                                                    int i33 = b;
                                                    if (!z5) {
                                                        nba1.e();
                                                        jArr10 = Arrays.copyOf(jArr10, i29);
                                                        iArr4 = Arrays.copyOf(iArr4, i29);
                                                        jArr11 = Arrays.copyOf(jArr11, i29);
                                                        iArr5 = Arrays.copyOf(iArr5, i29);
                                                        b = i29;
                                                        break;
                                                    }
                                                    if (dl81Var12 != null) {
                                                        while (i32 == 0 && i27 > 0) {
                                                            i32 = dl81Var12.v();
                                                            i28 = dl81Var12.a();
                                                            i27--;
                                                        }
                                                        i32--;
                                                    }
                                                    jArr10[i29] = j18;
                                                    int c2 = ii61Var.c();
                                                    iArr4[i29] = c2;
                                                    if (c2 > i30) {
                                                        i30 = c2;
                                                    }
                                                    jArr11[i29] = j17 + i28;
                                                    iArr5[i29] = dl81Var11 == null ? 1 : 0;
                                                    if (i29 == i26) {
                                                        iArr5[i29] = 1;
                                                        i6--;
                                                        if (i6 > 0) {
                                                            dl81Var11.getClass();
                                                            i26 = dl81Var11.v() - 1;
                                                        }
                                                    }
                                                    j17 += i23;
                                                    i25--;
                                                    if (i25 == 0 && i22 > 0) {
                                                        i22--;
                                                        i25 = dl81Var8.v();
                                                        i23 = dl81Var8.a();
                                                    }
                                                    j18 += iArr4[i29];
                                                    i31--;
                                                    i29++;
                                                    jArr9 = jArr3;
                                                    b = i33;
                                                }
                                                jArr4 = jArr10;
                                                int[] iArr6 = iArr5;
                                                long[] jArr12 = jArr11;
                                                iArr = iArr4;
                                                long j19 = j17 + i28;
                                                if (dl81Var12 != null) {
                                                    while (i27 > 0) {
                                                        if (dl81Var12.v() != 0) {
                                                            z4 = false;
                                                            break;
                                                        }
                                                        dl81Var12.a();
                                                        i27--;
                                                    }
                                                }
                                                z4 = true;
                                                if (i6 != 0 || i25 != 0 || i31 != 0 || i22 != 0 || i32 != 0 || !z4) {
                                                    nba1.e();
                                                }
                                                i8 = i30;
                                                i9 = b;
                                                j9 = j19;
                                                iArr2 = iArr6;
                                                jArr5 = jArr12;
                                            } else {
                                                int i34 = ui6Var.a;
                                                long[] jArr13 = new long[i34];
                                                int[] iArr7 = new int[i34];
                                                while (ui6Var.a()) {
                                                    int i35 = ui6Var.b;
                                                    int[] iArr8 = iArr7;
                                                    jArr13[i35] = ui6Var.d;
                                                    iArr8[i35] = ui6Var.c;
                                                    iArr7 = iArr8;
                                                }
                                                int[] iArr9 = iArr7;
                                                long j20 = v4;
                                                int i36 = 8192 / a12;
                                                int i37 = 0;
                                                for (int i38 = 0; i38 < i34; i38++) {
                                                    int i39 = iArr9[i38];
                                                    int i40 = rf71.a;
                                                    i37 = (((i39 + i36) - 1) / i36) + i37;
                                                }
                                                jArr4 = new long[i37];
                                                int[] iArr10 = new int[i37];
                                                long[] jArr14 = new long[i37];
                                                int[] iArr11 = new int[i37];
                                                int i41 = 0;
                                                int i42 = 0;
                                                int i43 = 0;
                                                int i44 = 0;
                                                while (i41 < i34) {
                                                    int i45 = iArr9[i41];
                                                    long j21 = jArr13[i41];
                                                    int i46 = i44;
                                                    int i47 = i41;
                                                    int i48 = i43;
                                                    int i49 = i46;
                                                    int i50 = i34;
                                                    int i51 = i45;
                                                    while (i51 > 0) {
                                                        int min = Math.min(i36, i51);
                                                        jArr4[i49] = j21;
                                                        int i52 = i36;
                                                        int i53 = a12 * min;
                                                        iArr10[i49] = i53;
                                                        i48 = Math.max(i48, i53);
                                                        jArr14[i49] = i42 * j20;
                                                        iArr11[i49] = 1;
                                                        j21 += iArr10[i49];
                                                        i42 += min;
                                                        i51 -= min;
                                                        i49++;
                                                        i36 = i52;
                                                    }
                                                    int i54 = i36;
                                                    int i55 = i47 + 1;
                                                    i44 = i49;
                                                    i34 = i50;
                                                    i43 = i48;
                                                    i41 = i55;
                                                    i36 = i54;
                                                }
                                                arrayList2 = arrayList5;
                                                i7 = i21;
                                                jArr3 = jArr9;
                                                i9 = b;
                                                j9 = j20 * i42;
                                                iArr = iArr10;
                                                iArr2 = iArr11;
                                                jArr5 = jArr14;
                                                i8 = i43;
                                            }
                                            long h = rf71.h(j9, 1000000L, wl71Var2.c);
                                            if (jArr3 == null) {
                                                rf71.k(j13, jArr5);
                                                je81Var = new je81(wl71Var2, jArr4, iArr, i8, jArr5, iArr2, h);
                                            } else {
                                                int[] iArr12 = iArr;
                                                long[] jArr15 = jArr3;
                                                if (jArr15.length == 1 && i20 == 1 && jArr5.length >= 2) {
                                                    jArr8.getClass();
                                                    long j22 = jArr8[0];
                                                    long h2 = j22 + rf71.h(jArr15[0], wl71Var2.c, wl71Var2.d);
                                                    int length = jArr5.length - 1;
                                                    int max = Math.max(0, Math.min(4, length));
                                                    int max2 = Math.max(0, Math.min(jArr5.length - 4, length));
                                                    long j23 = jArr5[0];
                                                    if (j23 <= j22 && j22 < jArr5[max] && jArr5[max2] < h2 && h2 <= j9) {
                                                        int i56 = i7;
                                                        long h3 = rf71.h(j22 - j23, i56, wl71Var2.c);
                                                        long h4 = rf71.h(j9 - h2, i56, wl71Var2.c);
                                                        if ((h3 != j2 || h4 != j2) && h3 <= 2147483647L && h4 <= 2147483647L) {
                                                            co71Var.a = (int) h3;
                                                            co71Var.b = (int) h4;
                                                            rf71.k(j13, jArr5);
                                                            je81Var = new je81(wl71Var2, jArr4, iArr12, i8, jArr5, iArr2, rf71.h(jArr15[0], 1000000L, wl71Var2.d));
                                                        }
                                                    }
                                                }
                                                long[] jArr16 = jArr4;
                                                if (jArr15.length != 1) {
                                                    i10 = 1;
                                                } else if (jArr15[0] == j2) {
                                                    jArr8.getClass();
                                                    long j24 = jArr8[0];
                                                    for (int i57 = 0; i57 < jArr5.length; i57++) {
                                                        jArr5[i57] = rf71.h(jArr5[i57] - j24, 1000000L, wl71Var2.c);
                                                    }
                                                    je81Var = new je81(wl71Var2, jArr16, iArr12, i8, jArr5, iArr2, rf71.h(j9 - j24, 1000000L, wl71Var2.c));
                                                    arrayList3 = arrayList2;
                                                    arrayList3.add(je81Var);
                                                    i14 = i + 1;
                                                    arrayList5 = arrayList3;
                                                    arrayList4 = arrayList;
                                                    wl81Var2 = wl81Var;
                                                } else {
                                                    i10 = 1;
                                                }
                                                boolean z6 = i20 == i10;
                                                int[] iArr13 = new int[jArr15.length];
                                                int[] iArr14 = new int[jArr15.length];
                                                jArr8.getClass();
                                                int i58 = 0;
                                                int i59 = 0;
                                                boolean z7 = false;
                                                int i60 = 0;
                                                while (i58 < jArr15.length) {
                                                    int[] iArr15 = iArr13;
                                                    long j25 = jArr8[i58];
                                                    if (j25 != -1) {
                                                        iArr3 = iArr14;
                                                        i11 = i58;
                                                        long h5 = rf71.h(jArr15[i58], wl71Var2.c, wl71Var2.d);
                                                        iArr15[i11] = rf71.t(jArr5, j25, true);
                                                        iArr3[i11] = rf71.f(jArr5, j25 + h5, z6);
                                                        while (true) {
                                                            i12 = iArr15[i11];
                                                            i13 = iArr3[i11];
                                                            if (i12 >= i13 || (iArr2[i12] & 1) != 0) {
                                                                break;
                                                            }
                                                            iArr15[i11] = i12 + 1;
                                                        }
                                                        int i61 = (i13 - i12) + i59;
                                                        z7 = (i60 != i12) | z7;
                                                        i60 = i13;
                                                        i59 = i61;
                                                    } else {
                                                        iArr3 = iArr14;
                                                        i11 = i58;
                                                    }
                                                    i58 = i11 + 1;
                                                    iArr13 = iArr15;
                                                    iArr14 = iArr3;
                                                }
                                                int[] iArr16 = iArr13;
                                                int[] iArr17 = iArr14;
                                                boolean z8 = z7 | (i59 != i9);
                                                long[] jArr17 = z8 ? new long[i59] : jArr16;
                                                int[] iArr18 = z8 ? new int[i59] : iArr12;
                                                if (z8) {
                                                    i8 = 0;
                                                }
                                                int[] iArr19 = z8 ? new int[i59] : iArr2;
                                                long[] jArr18 = new long[i59];
                                                int i62 = 0;
                                                int i63 = 0;
                                                long j26 = j2;
                                                while (i62 < jArr15.length) {
                                                    long j27 = jArr8[i62];
                                                    int i64 = iArr16[i62];
                                                    int i65 = iArr17[i62];
                                                    boolean z9 = z8;
                                                    if (z8) {
                                                        int i66 = i65 - i64;
                                                        System.arraycopy(jArr16, i64, jArr17, i63, i66);
                                                        System.arraycopy(iArr12, i64, iArr18, i63, i66);
                                                        System.arraycopy(iArr2, i64, iArr19, i63, i66);
                                                    }
                                                    while (i64 < i65) {
                                                        int[] iArr20 = iArr19;
                                                        long[] jArr19 = jArr15;
                                                        long[] jArr20 = jArr18;
                                                        long j28 = j2;
                                                        jArr20[i63] = rf71.h(j26, 1000000L, wl71Var2.d) + rf71.h(Math.max(j28, jArr5[i64] - j27), 1000000L, wl71Var2.c);
                                                        if (z9 && iArr18[i63] > i8) {
                                                            i8 = iArr12[i64];
                                                        }
                                                        i63++;
                                                        i64++;
                                                        j2 = j28;
                                                        iArr19 = iArr20;
                                                        jArr18 = jArr20;
                                                        jArr15 = jArr19;
                                                    }
                                                    long[] jArr21 = jArr15;
                                                    j26 += jArr21[i62];
                                                    i62++;
                                                    z8 = z9;
                                                    iArr19 = iArr19;
                                                    jArr18 = jArr18;
                                                    jArr15 = jArr21;
                                                }
                                                je81Var = new je81(wl71Var2, jArr17, iArr18, i8, jArr18, iArr19, rf71.h(j26, 1000000L, wl71Var2.d));
                                                arrayList3 = arrayList2;
                                                arrayList3.add(je81Var);
                                                i14 = i + 1;
                                                arrayList5 = arrayList3;
                                                arrayList4 = arrayList;
                                                wl81Var2 = wl81Var;
                                            }
                                            arrayList3 = arrayList2;
                                        }
                                        arrayList3.add(je81Var);
                                        i14 = i + 1;
                                        arrayList5 = arrayList3;
                                        arrayList4 = arrayList;
                                        wl81Var2 = wl81Var;
                                    }
                                }
                            }
                        }
                        jArr = null;
                        jArr2 = null;
                        if (((qd81) c.x) != null) {
                        }
                    }
                    i2 = i3;
                    j4 = -9223372036854775807L;
                    if (j != j4) {
                    }
                    dl81 dl81Var32 = k.c;
                    dl81Var32.m(8);
                    dl81Var32.m(dl81Var32.b + (((dl81Var32.a() >> 24) & 255) != 0 ? 8 : 16));
                    long t3 = dl81Var32.t();
                    if (j5 != j4) {
                    }
                    wl81 j112 = j10.j(1835626086);
                    j112.getClass();
                    wl81 j122 = j112.j(1937007212);
                    j122.getClass();
                    hp81 k42 = j10.k(1835296868);
                    k42.getClass();
                    dl81 dl81Var42 = k42.c;
                    dl81Var42.m(8);
                    int a102 = (dl81Var42.a() >> 24) & 255;
                    dl81Var42.m(dl81Var42.b + (a102 != 0 ? 8 : 16));
                    long t22 = dl81Var42.t();
                    dl81Var42.m(dl81Var42.b + (a102 != 0 ? 4 : 8));
                    int x2 = dl81Var42.x();
                    Pair create22 = Pair.create(Long.valueOf(t22), "" + ((char) (((x2 >> 10) & 31) + 96)) + ((char) (((x2 >> 5) & 31) + 96)) + ((char) ((x2 & 31) + 96)));
                    hp81 k52 = j122.k(1937011556);
                    k52.getClass();
                    c = c(k52.c, a5, i2, (String) create22.second, kk0Var, z2);
                    if (z) {
                    }
                    j6 = j4;
                    jArr = null;
                    jArr2 = null;
                    if (((qd81) c.x) != null) {
                    }
                }
                wl71Var = null;
                wl71Var2 = (wl71) re71Var.c(wl71Var);
                if (wl71Var2 != null) {
                }
            }
            i14 = i + 1;
            arrayList5 = arrayList3;
            arrayList4 = arrayList;
            wl81Var2 = wl81Var;
        }
        return arrayList5;
    }
}
