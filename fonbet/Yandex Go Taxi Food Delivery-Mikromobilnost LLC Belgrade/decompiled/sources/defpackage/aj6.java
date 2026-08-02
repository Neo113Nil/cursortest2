package defpackage;

import android.util.Pair;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.ParserException;
import androidx.media3.common.a;
import com.google.common.collect.ImmutableList;
import com.pdfview.subsamplincscaleimageview.SubsamplingScaleImageView;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.video.m3.preload_manager.PreloadManagerBuilder;

/* loaded from: classes10.dex */
public abstract class aj6 {
    public static final byte[] a;

    static {
        int i = tw21.a;
        a = "OpusHead".getBytes(StandardCharsets.UTF_8);
    }

    public static vi6 a(int i, ef90 ef90Var) {
        ef90Var.K(i + 12);
        ef90Var.L(1);
        b(ef90Var);
        ef90Var.L(2);
        int y = ef90Var.y();
        if ((y & 128) != 0) {
            ef90Var.L(2);
        }
        if ((y & 64) != 0) {
            ef90Var.L(ef90Var.y());
        }
        if ((y & 32) != 0) {
            ef90Var.L(2);
        }
        ef90Var.L(1);
        b(ef90Var);
        String f = eh20.f(ef90Var.y());
        if ("audio/mpeg".equals(f) || "audio/vnd.dts".equals(f) || "audio/vnd.dts.hd".equals(f)) {
            return new vi6(-1L, f, -1L, null);
        }
        ef90Var.L(4);
        long A = ef90Var.A();
        long A2 = ef90Var.A();
        ef90Var.L(1);
        int b = b(ef90Var);
        byte[] bArr = new byte[b];
        ef90Var.i(0, b, bArr);
        if (A2 <= 0) {
            A2 = -1;
        }
        return new vi6(A2, f, A > 0 ? A : -1L, bArr);
    }

    public static int b(ef90 ef90Var) {
        int y = ef90Var.y();
        int i = y & HProv.PP_VERSION_TIMESTAMP;
        while ((y & 128) == 128) {
            y = ef90Var.y();
            i = (i << 7) | (y & HProv.PP_VERSION_TIMESTAMP);
        }
        return i;
    }

    public static int c(int i) {
        return (i >> 24) & 255;
    }

    public static yb30 d(ef90 ef90Var) {
        long s;
        long s2;
        ef90Var.K(8);
        if (c(ef90Var.k()) == 0) {
            s = ef90Var.A();
            s2 = ef90Var.A();
        } else {
            s = ef90Var.s();
            s2 = ef90Var.s();
        }
        return new yb30(s, s2, ef90Var.A());
    }

    public static Pair e(ef90 ef90Var, int i, int i2) {
        Integer num;
        vzz0 vzz0Var;
        Pair create;
        int i3;
        int i4;
        Integer num2;
        boolean z;
        int i5 = ef90Var.b;
        while (i5 - i < i2) {
            ef90Var.K(i5);
            int k = ef90Var.k();
            aja1.b("childAtomSize must be positive", k > 0);
            if (ef90Var.k() == 1936289382) {
                int i6 = i5 + 8;
                int i7 = 0;
                int i8 = -1;
                Integer num3 = null;
                String str = null;
                while (i6 - i5 < k) {
                    ef90Var.K(i6);
                    int k2 = ef90Var.k();
                    int k3 = ef90Var.k();
                    if (k3 == 1718775137) {
                        num3 = Integer.valueOf(ef90Var.k());
                    } else if (k3 == 1935894637) {
                        ef90Var.L(4);
                        str = ef90Var.w(4, StandardCharsets.UTF_8);
                    } else if (k3 == 1935894633) {
                        i8 = i6;
                        i7 = k2;
                    }
                    i6 += k2;
                }
                byte[] bArr = null;
                if ("cenc".equals(str) || "cbc1".equals(str) || "cens".equals(str) || "cbcs".equals(str)) {
                    aja1.b("frma atom is mandatory", num3 != null);
                    aja1.b("schi atom is mandatory", i8 != -1);
                    int i9 = i8 + 8;
                    while (true) {
                        if (i9 - i8 >= i7) {
                            num = num3;
                            vzz0Var = null;
                            break;
                        }
                        ef90Var.K(i9);
                        int k4 = ef90Var.k();
                        if (ef90Var.k() == 1952804451) {
                            int c = c(ef90Var.k());
                            ef90Var.L(1);
                            if (c == 0) {
                                ef90Var.L(1);
                                i4 = 0;
                                i3 = 0;
                            } else {
                                int y = ef90Var.y();
                                i3 = y & 15;
                                i4 = (y & PreloadManagerBuilder.MAXIMUM_TRACK_PRELOAD_TIMEOUT_IN_SEC) >> 4;
                            }
                            if (ef90Var.y() == 1) {
                                num2 = num3;
                                z = true;
                            } else {
                                num2 = num3;
                                z = false;
                            }
                            int y2 = ef90Var.y();
                            byte[] bArr2 = new byte[16];
                            ef90Var.i(0, 16, bArr2);
                            if (z && y2 == 0) {
                                int y3 = ef90Var.y();
                                byte[] bArr3 = new byte[y3];
                                ef90Var.i(0, y3, bArr3);
                                bArr = bArr3;
                            }
                            num = num2;
                            vzz0Var = new vzz0(z, str, y2, bArr2, i4, i3, bArr);
                        } else {
                            i9 += k4;
                        }
                    }
                    aja1.b("tenc atom is mandatory", vzz0Var != null);
                    int i10 = tw21.a;
                    create = Pair.create(num, vzz0Var);
                } else {
                    create = null;
                }
                if (create != null) {
                    return create;
                }
            }
            i5 += k;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:379:0x07c7, code lost:
    
        if (r13 == 2) goto L411;
     */
    /* JADX WARN: Removed duplicated region for block: B:255:0x06c0  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x06f7  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x08ac  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x08bf  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x090c  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0927  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0951  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x09d3  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x09f5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:354:0x09bc  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x08bc  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0798  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x07b8  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x082e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:443:0x089c  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x08a0  */
    /* JADX WARN: Removed duplicated region for block: B:463:0x0940 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:468:0x06d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static yi6 f(ef90 ef90Var, int i, int i2, String str, DrmInitData drmInitData, boolean z) {
        int i3;
        boolean z2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int E;
        int k;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        DrmInitData drmInitData2;
        String str2;
        List list;
        int i14;
        String str3;
        int i15;
        int i16;
        int i17;
        String str4;
        String str5;
        int i18;
        vi6 vi6Var;
        int i19;
        String str6;
        int i20;
        int i21;
        int i22;
        int i23;
        ImmutableList r;
        int i24;
        jb jbVar;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int g;
        int g2;
        int i33;
        boolean z3;
        boolean z4;
        int i34;
        int i35;
        boolean f;
        int i36;
        int i37;
        int i38;
        String str7;
        String str8;
        int i39;
        long j;
        ImmutableList immutableList;
        ef90 ef90Var2 = ef90Var;
        String str9 = str;
        DrmInitData drmInitData3 = drmInitData;
        ef90Var2.K(12);
        int k2 = ef90Var2.k();
        boolean z5 = false;
        yi6 yi6Var = new yi6(k2, 0);
        int i40 = 0;
        while (i40 < k2) {
            int i41 = ef90Var2.b;
            int k3 = ef90Var2.k();
            String str10 = "childAtomSize must be positive";
            aja1.b("childAtomSize must be positive", k3 > 0 ? true : z5);
            int k4 = ef90Var2.k();
            if (k4 == 1635148593 || k4 == 1635148595 || k4 == 1701733238 || k4 == 1831958048 || k4 == 1836070006 || k4 == 1752589105 || k4 == 1751479857 || k4 == 1932670515 || k4 == 1211250227 || k4 == 1748121139 || k4 == 1987063864 || k4 == 1987063865 || k4 == 1635135537 || k4 == 1685479798 || k4 == 1685479729 || k4 == 1685481573 || k4 == 1685481521) {
                i3 = k2;
                z2 = z5;
                ef90Var2 = ef90Var;
                i4 = i2;
                drmInitData3 = drmInitData;
                i5 = k4;
            } else if (k4 == 1634760241) {
                i4 = i2;
                i5 = k4;
                i3 = k2;
                z2 = z5;
            } else {
                RuntimeException runtimeException = null;
                if (k4 == 1836069985 || k4 == 1701733217 || k4 == 1633889587 || k4 == 1700998451 || k4 == 1633889588 || k4 == 1835823201 || k4 == 1685353315 || k4 == 1685353317 || k4 == 1685353320 || k4 == 1685353324 || k4 == 1685353336 || k4 == 1935764850 || k4 == 1935767394 || k4 == 1819304813 || k4 == 1936684916 || k4 == 1953984371 || k4 == 778924082 || k4 == 778924083 || k4 == 1835557169 || k4 == 1835560241 || k4 == 1634492771 || k4 == 1634492791 || k4 == 1970037111 || k4 == 1332770163 || k4 == 1716281667 || k4 == 1767992678) {
                    ef90Var2.K(i41 + 16);
                    if (z) {
                        int E2 = ef90Var2.E();
                        ef90Var2.L(6);
                        i8 = E2;
                    } else {
                        ef90Var2.L(8);
                        i8 = 0;
                    }
                    if (i8 == 0 || i8 == 1) {
                        i3 = k2;
                        E = ef90Var2.E();
                        ef90Var2.L(6);
                        int z6 = ef90Var2.z();
                        ef90Var2.K(ef90Var2.b - 4);
                        k = ef90Var2.k();
                        if (i8 == 1) {
                            ef90Var2.L(16);
                        }
                        i9 = z6;
                        i10 = -1;
                    } else if (i8 == 2) {
                        ef90Var2.L(16);
                        i3 = k2;
                        int round = (int) Math.round(Double.longBitsToDouble(ef90Var2.s()));
                        int C = ef90Var2.C();
                        ef90Var2.L(4);
                        int C2 = ef90Var2.C();
                        int C3 = ef90Var2.C();
                        boolean z7 = (C3 & 1) != 0;
                        boolean z8 = (C3 & 2) != 0;
                        if (z7) {
                            if (C2 == 32) {
                                i39 = 4;
                                ef90Var2.L(8);
                                i9 = round;
                                E = C;
                                k = 0;
                                i10 = i39;
                            }
                            i39 = -1;
                            ef90Var2.L(8);
                            i9 = round;
                            E = C;
                            k = 0;
                            i10 = i39;
                        } else {
                            if (C2 == 8) {
                                i39 = 3;
                            } else if (C2 == 16) {
                                i39 = z8 ? 268435456 : 2;
                            } else if (C2 == 24) {
                                i39 = z8 ? 1342177280 : 21;
                            } else {
                                if (C2 == 32) {
                                    i39 = z8 ? 1610612736 : 22;
                                }
                                i39 = -1;
                            }
                            ef90Var2.L(8);
                            i9 = round;
                            E = C;
                            k = 0;
                            i10 = i39;
                        }
                        ef90Var2 = ef90Var;
                        i41 = i11;
                    } else {
                        i3 = k2;
                        i11 = i41;
                        i6 = k3;
                        i7 = i40;
                        z2 = false;
                        ef90Var2 = ef90Var;
                        i41 = i11;
                    }
                    if (k4 == 1767992678) {
                        i12 = -1;
                        E = -1;
                    } else {
                        if (k4 == 1935764850) {
                            i12 = 8000;
                        } else if (k4 == 1935767394) {
                            i12 = 16000;
                        } else {
                            i12 = i9;
                        }
                        E = 1;
                    }
                    int i42 = ef90Var2.b;
                    if (k4 == 1701733217) {
                        Pair e = e(ef90Var2, i41, k3);
                        if (e != null) {
                            k4 = ((Integer) e.first).intValue();
                            drmInitData2 = drmInitData3 == null ? null : drmInitData3.copyWithSchemeType(((vzz0) e.second).b);
                            i13 = i12;
                            ((vzz0[]) yi6Var.w)[i40] = (vzz0) e.second;
                        } else {
                            i13 = i12;
                            drmInitData2 = drmInitData3;
                        }
                        ef90Var2.K(i42);
                    } else {
                        i13 = i12;
                        drmInitData2 = drmInitData3;
                    }
                    String str11 = "audio/mhm1";
                    if (k4 == 1633889587) {
                        str2 = "audio/ac3";
                    } else if (k4 == 1700998451) {
                        str2 = "audio/eac3";
                    } else if (k4 == 1633889588) {
                        str2 = "audio/ac4";
                    } else if (k4 == 1685353315) {
                        str2 = "audio/vnd.dts";
                    } else if (k4 == 1685353320 || k4 == 1685353324) {
                        str2 = "audio/vnd.dts.hd";
                    } else if (k4 == 1685353317) {
                        str2 = "audio/vnd.dts.hd;profile=lbr";
                    } else if (k4 == 1685353336) {
                        str2 = "audio/vnd.dts.uhd;profile=p2";
                    } else if (k4 == 1935764850) {
                        str2 = "audio/3gpp";
                    } else if (k4 == 1935767394) {
                        str2 = "audio/amr-wb";
                    } else {
                        if (k4 != 1936684916) {
                            if (k4 == 1953984371) {
                                str2 = "audio/raw";
                                i10 = 268435456;
                            } else if (k4 != 1819304813) {
                                str2 = (k4 == 778924082 || k4 == 778924083) ? "audio/mpeg" : k4 == 1835557169 ? "audio/mha1" : k4 == 1835560241 ? "audio/mhm1" : k4 == 1634492771 ? "audio/alac" : k4 == 1634492791 ? "audio/g711-alaw" : k4 == 1970037111 ? "audio/g711-mlaw" : k4 == 1332770163 ? "audio/opus" : k4 == 1716281667 ? "audio/flac" : k4 == 1835823201 ? "audio/true-hd" : k4 == 1767992678 ? "audio/iamf" : null;
                            } else if (i10 != -1) {
                                str2 = "audio/raw";
                            }
                        }
                        str2 = "audio/raw";
                        i10 = 2;
                    }
                    String str12 = str2;
                    i11 = i41;
                    i7 = i40;
                    int i43 = i42;
                    String str13 = null;
                    List list2 = null;
                    vi6 vi6Var2 = null;
                    ti6 ti6Var = null;
                    int i44 = E;
                    int i45 = i13;
                    while (i43 - i11 < k3) {
                        ef90Var2.K(i43);
                        int k5 = ef90Var2.k();
                        int i46 = i43;
                        aja1.b(str10, k5 > 0);
                        int k6 = ef90Var2.k();
                        int i47 = k3;
                        if (k6 == 1835557187) {
                            ef90Var2.K(i46 + 8);
                            ef90Var2.L(1);
                            int y = ef90Var2.y();
                            ef90Var2.L(1);
                            String format = Objects.equals(str12, str11) ? String.format("mhm1.%02X", Integer.valueOf(y)) : String.format("mha1.%02X", Integer.valueOf(y));
                            int E3 = ef90Var2.E();
                            byte[] bArr = new byte[E3];
                            ef90Var2.i(0, E3, bArr);
                            str5 = str10;
                            list = list2 == null ? ImmutableList.r(bArr) : ImmutableList.s(bArr, (byte[]) list2.get(0));
                            i17 = k5;
                            i14 = i10;
                            str3 = str11;
                            i19 = i44;
                            i16 = i46;
                            str13 = format;
                        } else if (k6 == 1835557200) {
                            ef90Var2.K(i46 + 8);
                            int y2 = ef90Var2.y();
                            if (y2 > 0) {
                                byte[] bArr2 = new byte[y2];
                                str8 = str12;
                                ef90Var2.i(0, y2, bArr2);
                                list2 = list2 == null ? ImmutableList.r(bArr2) : ImmutableList.s((byte[]) list2.get(0), bArr2);
                            } else {
                                str8 = str12;
                            }
                            str5 = str10;
                            list = list2;
                            i17 = k5;
                            i14 = i10;
                            str3 = str11;
                            i19 = i44;
                            i16 = i46;
                            str12 = str8;
                        } else {
                            String str14 = str12;
                            int i48 = 1702061171;
                            if (k6 != 1702061171) {
                                if (z && k6 == 2002876005) {
                                    i48 = 1702061171;
                                } else if (k6 == 1651798644) {
                                    ef90Var2.K(i46 + 8);
                                    ef90Var2.L(4);
                                    str5 = str10;
                                    list = list2;
                                    i17 = k5;
                                    i14 = i10;
                                    str3 = str11;
                                    i19 = i44;
                                    i16 = i46;
                                    str12 = str14;
                                    ti6Var = new ti6(ef90Var2.A(), ef90Var2.A(), 0, (byte) 0);
                                } else {
                                    int[] iArr = m83.d;
                                    int[] iArr2 = m83.b;
                                    if (k6 == 1684103987) {
                                        ef90Var2.K(i46 + 8);
                                        String num = Integer.toString(i);
                                        df90 df90Var = new df90();
                                        df90Var.l(ef90Var2);
                                        int i49 = iArr2[df90Var.g(2)];
                                        str3 = str11;
                                        df90Var.o(8);
                                        int i50 = iArr[df90Var.g(3)];
                                        int i51 = df90Var.g(1) != 0 ? i50 + 1 : i50;
                                        list = list2;
                                        int i52 = m83.e[df90Var.g(5)] * 1000;
                                        df90Var.c();
                                        ef90Var2.K(df90Var.d());
                                        f7s f7sVar = new f7s();
                                        f7sVar.a = num;
                                        f7sVar.m = eh20.q("audio/ac3");
                                        f7sVar.C = i51;
                                        f7sVar.D = i49;
                                        f7sVar.q = drmInitData2;
                                        f7sVar.d = str9;
                                        f7sVar.h = i52;
                                        f7sVar.i = i52;
                                        yi6Var.x = new a(f7sVar);
                                        str6 = str13;
                                        str5 = str10;
                                        i20 = k5;
                                        i23 = i45;
                                        i14 = i10;
                                    } else {
                                        list = list2;
                                        str3 = str11;
                                        if (k6 == 1684366131) {
                                            ef90Var2.K(i46 + 8);
                                            String num2 = Integer.toString(i);
                                            df90 df90Var2 = new df90();
                                            df90Var2.l(ef90Var2);
                                            int g3 = df90Var2.g(13) * 1000;
                                            df90Var2.o(3);
                                            int i53 = iArr2[df90Var2.g(2)];
                                            df90Var2.o(10);
                                            int i54 = iArr[df90Var2.g(3)];
                                            if (df90Var2.g(1) != 0) {
                                                i54++;
                                            }
                                            df90Var2.o(3);
                                            int g4 = df90Var2.g(4);
                                            df90Var2.o(1);
                                            i14 = i10;
                                            if (g4 > 0) {
                                                df90Var2.o(6);
                                                if (df90Var2.g(1) != 0) {
                                                    i54 += 2;
                                                }
                                                df90Var2.o(1);
                                            }
                                            int i55 = i54;
                                            str6 = str13;
                                            if (df90Var2.b() > 7) {
                                                df90Var2.o(7);
                                                if (df90Var2.g(1) != 0) {
                                                    str7 = "audio/eac3-joc";
                                                    df90Var2.c();
                                                    ef90Var2.K(df90Var2.d());
                                                    f7s f7sVar2 = new f7s();
                                                    f7sVar2.a = num2;
                                                    f7sVar2.m = eh20.q(str7);
                                                    f7sVar2.C = i55;
                                                    f7sVar2.D = i53;
                                                    f7sVar2.q = drmInitData2;
                                                    f7sVar2.d = str9;
                                                    f7sVar2.i = g3;
                                                    yi6Var.x = new a(f7sVar2);
                                                    str5 = str10;
                                                    i20 = k5;
                                                    i23 = i45;
                                                }
                                            }
                                            str7 = "audio/eac3";
                                            df90Var2.c();
                                            ef90Var2.K(df90Var2.d());
                                            f7s f7sVar22 = new f7s();
                                            f7sVar22.a = num2;
                                            f7sVar22.m = eh20.q(str7);
                                            f7sVar22.C = i55;
                                            f7sVar22.D = i53;
                                            f7sVar22.q = drmInitData2;
                                            f7sVar22.d = str9;
                                            f7sVar22.i = g3;
                                            yi6Var.x = new a(f7sVar22);
                                            str5 = str10;
                                            i20 = k5;
                                            i23 = i45;
                                        } else {
                                            str6 = str13;
                                            i14 = i10;
                                            if (k6 == 1684103988) {
                                                ef90Var2.K(i46 + 8);
                                                String num3 = Integer.toString(i);
                                                df90 df90Var3 = new df90();
                                                df90Var3.l(ef90Var2);
                                                int b = df90Var3.b();
                                                int g5 = df90Var3.g(3);
                                                if (g5 > 1) {
                                                    throw ParserException.c("Unsupported AC-4 DSI version: " + g5);
                                                }
                                                int g6 = df90Var3.g(7);
                                                int i56 = df90Var3.f() ? 48000 : 44100;
                                                df90Var3.o(4);
                                                int g7 = df90Var3.g(9);
                                                if (g6 > 1) {
                                                    if (g5 == 0) {
                                                        throw ParserException.c("Invalid AC-4 DSI version: " + g5);
                                                    }
                                                    if (df90Var3.f()) {
                                                        df90Var3.o(16);
                                                        i24 = i46;
                                                        if (df90Var3.f()) {
                                                            df90Var3.o(128);
                                                        }
                                                        if (g5 != 1) {
                                                            str5 = str10;
                                                            if (df90Var3.b() < 66) {
                                                                throw ParserException.c("Invalid AC-4 DSI bitrate.");
                                                            }
                                                            df90Var3.o(66);
                                                            df90Var3.c();
                                                        } else {
                                                            str5 = str10;
                                                        }
                                                        jbVar = new jb();
                                                        jbVar.a = true;
                                                        jbVar.b = -1;
                                                        jbVar.c = -1;
                                                        jbVar.d = true;
                                                        jbVar.e = 2;
                                                        jbVar.f = 0;
                                                        i25 = 0;
                                                        while (true) {
                                                            jb jbVar2 = jbVar;
                                                            if (i25 < g7) {
                                                                i20 = k5;
                                                                i26 = i45;
                                                                i21 = i24;
                                                                i27 = i44;
                                                                jbVar = jbVar2;
                                                                i28 = 8;
                                                                i29 = 5;
                                                            } else if (g5 == 0) {
                                                                boolean f2 = df90Var3.f();
                                                                i20 = k5;
                                                                i21 = i24;
                                                                g = df90Var3.g(5);
                                                                jbVar = jbVar2;
                                                                g2 = df90Var3.g(5);
                                                                i33 = 0;
                                                                z3 = false;
                                                                z4 = f2;
                                                                i34 = 0;
                                                            } else {
                                                                i37 = g7;
                                                                int g8 = df90Var3.g(8);
                                                                i20 = k5;
                                                                int g9 = df90Var3.g(8);
                                                                if (g9 == 255) {
                                                                    jbVar = jbVar2;
                                                                    i38 = df90Var3.g(16) + g9;
                                                                } else {
                                                                    jbVar = jbVar2;
                                                                    i38 = g9;
                                                                }
                                                                if (g8 > 2) {
                                                                    df90Var3.o(i38 * 8);
                                                                    i25++;
                                                                    g7 = i37;
                                                                    k5 = i20;
                                                                } else {
                                                                    int b2 = (b - df90Var3.b()) / 8;
                                                                    g = df90Var3.g(5);
                                                                    z3 = g == 31;
                                                                    i34 = i38;
                                                                    i21 = i24;
                                                                    g2 = g8;
                                                                    i33 = b2;
                                                                    z4 = false;
                                                                }
                                                            }
                                                        }
                                                        i26 = i45;
                                                        if (z4 && !z3 && g == 6) {
                                                            i35 = g2;
                                                            i27 = i44;
                                                            f = true;
                                                        } else {
                                                            i27 = i44;
                                                            jbVar.f = df90Var3.g(3);
                                                            if (df90Var3.f()) {
                                                                df90Var3.o(5);
                                                            }
                                                            df90Var3.o(2);
                                                            if (g5 == 1 && (g2 == 1 || g2 == 2)) {
                                                                df90Var3.o(2);
                                                            }
                                                            df90Var3.o(5);
                                                            df90Var3.o(10);
                                                            if (g5 == 1) {
                                                                if (g2 > 0) {
                                                                    jbVar.a = df90Var3.f();
                                                                }
                                                                if (jbVar.a) {
                                                                    if (g2 != 1) {
                                                                        i36 = 2;
                                                                    }
                                                                    int g10 = df90Var3.g(5);
                                                                    if (g10 >= 0 && g10 <= 15) {
                                                                        jbVar.b = g10;
                                                                    }
                                                                    if (g10 < 11 || g10 > 14) {
                                                                        i36 = 2;
                                                                    } else {
                                                                        jbVar.d = df90Var3.f();
                                                                        i36 = 2;
                                                                        jbVar.e = df90Var3.g(2);
                                                                    }
                                                                    df90Var3.o(24);
                                                                } else {
                                                                    i36 = 2;
                                                                }
                                                                if (g2 == 1 || g2 == i36) {
                                                                    if (df90Var3.f() && df90Var3.f()) {
                                                                        df90Var3.o(i36);
                                                                    }
                                                                    if (df90Var3.f()) {
                                                                        df90Var3.n();
                                                                        int i57 = 8;
                                                                        int g11 = df90Var3.g(8);
                                                                        i35 = g2;
                                                                        int i58 = 0;
                                                                        while (i58 < g11) {
                                                                            df90Var3.o(i57);
                                                                            i58++;
                                                                            i57 = 8;
                                                                        }
                                                                        if (z4 && !z3) {
                                                                            df90Var3.n();
                                                                            if (g == 0 || g == 1 || g == 2) {
                                                                                if (i35 == 0) {
                                                                                    for (int i59 = 0; i59 < 2; i59++) {
                                                                                        eg3.m(df90Var3, jbVar);
                                                                                    }
                                                                                } else {
                                                                                    for (int i60 = 0; i60 < 2; i60++) {
                                                                                        eg3.n(df90Var3, jbVar);
                                                                                    }
                                                                                }
                                                                            } else if (g == 3 || g == 4) {
                                                                                if (i35 == 0) {
                                                                                    for (int i61 = 0; i61 < 3; i61++) {
                                                                                        eg3.m(df90Var3, jbVar);
                                                                                    }
                                                                                } else {
                                                                                    for (int i62 = 0; i62 < 3; i62++) {
                                                                                        eg3.n(df90Var3, jbVar);
                                                                                    }
                                                                                }
                                                                            } else if (g != 5) {
                                                                                int g12 = df90Var3.g(7);
                                                                                for (int i63 = 0; i63 < g12; i63++) {
                                                                                    df90Var3.o(8);
                                                                                }
                                                                            } else if (i35 == 0) {
                                                                                eg3.m(df90Var3, jbVar);
                                                                            } else {
                                                                                int g13 = df90Var3.g(3);
                                                                                for (int i64 = 0; i64 < g13 + 2; i64++) {
                                                                                    eg3.n(df90Var3, jbVar);
                                                                                }
                                                                            }
                                                                        } else if (i35 == 0) {
                                                                            eg3.m(df90Var3, jbVar);
                                                                        } else {
                                                                            eg3.n(df90Var3, jbVar);
                                                                        }
                                                                        df90Var3.n();
                                                                        f = df90Var3.f();
                                                                    }
                                                                }
                                                            }
                                                            i35 = g2;
                                                            if (z4) {
                                                            }
                                                            if (i35 == 0) {
                                                            }
                                                            df90Var3.n();
                                                            f = df90Var3.f();
                                                        }
                                                        if (!f) {
                                                            int g14 = df90Var3.g(7);
                                                            for (int i65 = 0; i65 < g14; i65++) {
                                                                df90Var3.o(15);
                                                            }
                                                        }
                                                        if (i35 > 0) {
                                                            if (df90Var3.f()) {
                                                                if (df90Var3.b() < 66) {
                                                                    throw ParserException.c("Can't parse bitrate DSI.");
                                                                }
                                                                df90Var3.o(66);
                                                            }
                                                            if (df90Var3.f()) {
                                                                df90Var3.c();
                                                                df90Var3.p(df90Var3.g(16));
                                                                i29 = 5;
                                                                int g15 = df90Var3.g(5);
                                                                for (int i66 = 0; i66 < g15; i66++) {
                                                                    df90Var3.o(3);
                                                                    df90Var3.o(8);
                                                                }
                                                                i28 = 8;
                                                                df90Var3.c();
                                                                if (g5 == 1) {
                                                                    int b3 = ((b - df90Var3.b()) / i28) - i33;
                                                                    if (i34 < b3) {
                                                                        throw ParserException.c("pres_bytes is smaller than presentation bytes read.");
                                                                    }
                                                                    df90Var3.p(i34 - b3);
                                                                }
                                                                if (jbVar.a && jbVar.b == -1) {
                                                                    throw ParserException.c("Can't determine channel mode of presentation " + i25);
                                                                }
                                                                if (jbVar.a) {
                                                                    int i67 = jbVar.b;
                                                                    boolean z9 = jbVar.d;
                                                                    int i68 = jbVar.e;
                                                                    switch (i67) {
                                                                        case 0:
                                                                            i32 = 11;
                                                                            i31 = 1;
                                                                            break;
                                                                        case 1:
                                                                            i32 = 11;
                                                                            i31 = 2;
                                                                            break;
                                                                        case 2:
                                                                            i32 = 11;
                                                                            i31 = 3;
                                                                            break;
                                                                        case 3:
                                                                            i31 = i29;
                                                                            i32 = 11;
                                                                            break;
                                                                        case 4:
                                                                            i32 = 11;
                                                                            i31 = 6;
                                                                            break;
                                                                        case 5:
                                                                        case 7:
                                                                        case 9:
                                                                            i32 = 11;
                                                                            i31 = 7;
                                                                            break;
                                                                        case 6:
                                                                        case 8:
                                                                        case 10:
                                                                            i31 = i28;
                                                                            i32 = 11;
                                                                            break;
                                                                        case 11:
                                                                            i32 = 11;
                                                                            i31 = 11;
                                                                            break;
                                                                        case 12:
                                                                            i32 = 11;
                                                                            i31 = 12;
                                                                            break;
                                                                        case 13:
                                                                            i32 = 11;
                                                                            i31 = 13;
                                                                            break;
                                                                        case 14:
                                                                            i32 = 11;
                                                                            i31 = 14;
                                                                            break;
                                                                        case 15:
                                                                            i32 = 11;
                                                                            i31 = 24;
                                                                            break;
                                                                        default:
                                                                            i32 = 11;
                                                                            i31 = -1;
                                                                            break;
                                                                    }
                                                                    if (i67 == i32 || i67 == 12 || i67 == 13 || i67 == 14) {
                                                                        if (!z9) {
                                                                            i31 -= 2;
                                                                        }
                                                                        if (i68 == 0) {
                                                                            i31 -= 4;
                                                                        } else if (i68 == 1) {
                                                                            i31 -= 2;
                                                                        }
                                                                    }
                                                                } else {
                                                                    i30 = jbVar.c + 1;
                                                                    if (jbVar.f == 4) {
                                                                        i31 = i30 == 17 ? 21 : i30;
                                                                    }
                                                                    if (i30 > 0) {
                                                                        throw ParserException.c("Can't determine channel count of presentation.");
                                                                    }
                                                                    f7s f7sVar3 = new f7s();
                                                                    f7sVar3.a = num3;
                                                                    f7sVar3.m = eh20.q("audio/ac4");
                                                                    f7sVar3.C = i30;
                                                                    f7sVar3.D = i56;
                                                                    f7sVar3.q = drmInitData2;
                                                                    f7sVar3.d = str9;
                                                                    yi6Var.x = new a(f7sVar3);
                                                                    i23 = i26;
                                                                    i22 = i27;
                                                                    i19 = i22;
                                                                    i45 = i23;
                                                                    str12 = str14;
                                                                    str13 = str6;
                                                                    i17 = i20;
                                                                    i16 = i21;
                                                                    i43 = i16 + i17;
                                                                    ef90Var2 = ef90Var;
                                                                    k3 = i47;
                                                                    i10 = i14;
                                                                    str11 = str3;
                                                                    list2 = list;
                                                                    str10 = str5;
                                                                    i44 = i19;
                                                                    runtimeException = null;
                                                                }
                                                                i30 = i31;
                                                                if (i30 > 0) {
                                                                }
                                                            }
                                                        }
                                                        i28 = 8;
                                                        i29 = 5;
                                                        df90Var3.c();
                                                        if (g5 == 1) {
                                                        }
                                                        if (jbVar.a) {
                                                            throw ParserException.c("Can't determine channel mode of presentation " + i25);
                                                        }
                                                        if (jbVar.a) {
                                                        }
                                                        i30 = i31;
                                                        if (i30 > 0) {
                                                        }
                                                    }
                                                }
                                                i24 = i46;
                                                if (g5 != 1) {
                                                }
                                                jbVar = new jb();
                                                jbVar.a = true;
                                                jbVar.b = -1;
                                                jbVar.c = -1;
                                                jbVar.d = true;
                                                jbVar.e = 2;
                                                jbVar.f = 0;
                                                i25 = 0;
                                                while (true) {
                                                    jb jbVar22 = jbVar;
                                                    if (i25 < g7) {
                                                    }
                                                    df90Var3.o(i38 * 8);
                                                    i25++;
                                                    g7 = i37;
                                                    k5 = i20;
                                                }
                                                i26 = i45;
                                                if (z4) {
                                                }
                                                i27 = i44;
                                                jbVar.f = df90Var3.g(3);
                                                if (df90Var3.f()) {
                                                }
                                                df90Var3.o(2);
                                                if (g5 == 1) {
                                                    df90Var3.o(2);
                                                }
                                                df90Var3.o(5);
                                                df90Var3.o(10);
                                                if (g5 == 1) {
                                                }
                                                i35 = g2;
                                                if (z4) {
                                                }
                                                if (i35 == 0) {
                                                }
                                                df90Var3.n();
                                                f = df90Var3.f();
                                                if (!f) {
                                                }
                                                if (i35 > 0) {
                                                }
                                                i28 = 8;
                                                i29 = 5;
                                                df90Var3.c();
                                                if (g5 == 1) {
                                                }
                                                if (jbVar.a) {
                                                }
                                                if (jbVar.a) {
                                                }
                                                i30 = i31;
                                                if (i30 > 0) {
                                                }
                                            } else {
                                                str5 = str10;
                                                i20 = k5;
                                                int i69 = i45;
                                                i19 = i44;
                                                i21 = i46;
                                                if (k6 != 1684892784) {
                                                    if (k6 == 1684305011 || k6 == 1969517683) {
                                                        f7s f7sVar4 = new f7s();
                                                        f7sVar4.a = Integer.toString(i);
                                                        f7sVar4.m = eh20.q(str14);
                                                        i22 = i19;
                                                        f7sVar4.C = i22;
                                                        i23 = i69;
                                                        f7sVar4.D = i23;
                                                        f7sVar4.q = drmInitData2;
                                                        f7sVar4.d = str9;
                                                        yi6Var.x = new a(f7sVar4);
                                                    } else if (k6 == 1682927731) {
                                                        int i70 = i20 - 8;
                                                        byte[] bArr3 = a;
                                                        byte[] copyOf = Arrays.copyOf(bArr3, bArr3.length + i70);
                                                        ef90Var2.K(i21 + 8);
                                                        ef90Var2.i(bArr3.length, i70, copyOf);
                                                        list = xub1.a(copyOf);
                                                        str12 = str14;
                                                        str13 = str6;
                                                        i17 = i20;
                                                        i16 = i21;
                                                        i45 = i69;
                                                    } else {
                                                        if (k6 == 1684425825) {
                                                            byte[] bArr4 = new byte[i20 - 8];
                                                            bArr4[0] = 102;
                                                            bArr4[1] = 76;
                                                            bArr4[2] = 97;
                                                            bArr4[3] = 67;
                                                            ef90Var2.K(i21 + 12);
                                                            ef90Var2.i(4, i20 - 12, bArr4);
                                                            r = ImmutableList.r(bArr4);
                                                        } else if (k6 == 1634492771) {
                                                            int i71 = i20 - 12;
                                                            byte[] bArr5 = new byte[i71];
                                                            ef90Var2.K(i21 + 12);
                                                            ef90Var2.i(0, i71, bArr5);
                                                            byte[] bArr6 = bac.a;
                                                            ef90 ef90Var3 = new ef90(bArr5);
                                                            ef90Var3.K(9);
                                                            int y3 = ef90Var3.y();
                                                            ef90Var3.K(20);
                                                            Pair create = Pair.create(Integer.valueOf(ef90Var3.C()), Integer.valueOf(y3));
                                                            int intValue = ((Integer) create.first).intValue();
                                                            i19 = ((Integer) create.second).intValue();
                                                            i45 = intValue;
                                                            list = ImmutableList.r(bArr5);
                                                            str12 = str14;
                                                            str13 = str6;
                                                            i17 = i20;
                                                            i16 = i21;
                                                            i43 = i16 + i17;
                                                            ef90Var2 = ef90Var;
                                                            k3 = i47;
                                                            i10 = i14;
                                                            str11 = str3;
                                                            list2 = list;
                                                            str10 = str5;
                                                            i44 = i19;
                                                            runtimeException = null;
                                                        } else if (k6 == 1767990114) {
                                                            ef90Var2.K(i21 + 9);
                                                            long j2 = 0;
                                                            int i72 = 0;
                                                            for (int i73 = 9; i72 < i73; i73 = 9) {
                                                                if (ef90Var2.b == ef90Var2.c) {
                                                                    ny61.r("Attempting to read a byte over the limit.");
                                                                    return null;
                                                                }
                                                                long y4 = ef90Var2.y();
                                                                j2 |= (y4 & 127) << (i72 * 7);
                                                                if ((y4 & 128) == 0) {
                                                                    int b4 = com.google.common.primitives.a.b(j2);
                                                                    byte[] bArr7 = new byte[b4];
                                                                    ef90Var2.i(0, b4, bArr7);
                                                                    r = ImmutableList.r(bArr7);
                                                                } else {
                                                                    i72++;
                                                                }
                                                            }
                                                            int b42 = com.google.common.primitives.a.b(j2);
                                                            byte[] bArr72 = new byte[b42];
                                                            ef90Var2.i(0, b42, bArr72);
                                                            r = ImmutableList.r(bArr72);
                                                        } else {
                                                            i23 = i69;
                                                            i22 = i19;
                                                        }
                                                        list = r;
                                                        str12 = str14;
                                                        str13 = str6;
                                                        i17 = i20;
                                                        i16 = i21;
                                                        i45 = i69;
                                                        i43 = i16 + i17;
                                                        ef90Var2 = ef90Var;
                                                        k3 = i47;
                                                        i10 = i14;
                                                        str11 = str3;
                                                        list2 = list;
                                                        str10 = str5;
                                                        i44 = i19;
                                                        runtimeException = null;
                                                    }
                                                    i19 = i22;
                                                    i45 = i23;
                                                    str12 = str14;
                                                    str13 = str6;
                                                    i17 = i20;
                                                    i16 = i21;
                                                    i43 = i16 + i17;
                                                    ef90Var2 = ef90Var;
                                                    k3 = i47;
                                                    i10 = i14;
                                                    str11 = str3;
                                                    list2 = list;
                                                    str10 = str5;
                                                    i44 = i19;
                                                    runtimeException = null;
                                                } else {
                                                    if (k <= 0) {
                                                        throw ParserException.a(runtimeException, "Invalid sample rate for Dolby TrueHD MLP stream: " + k);
                                                    }
                                                    i45 = k;
                                                    str12 = str14;
                                                    str13 = str6;
                                                    i17 = i20;
                                                    i16 = i21;
                                                    i19 = 2;
                                                    i43 = i16 + i17;
                                                    ef90Var2 = ef90Var;
                                                    k3 = i47;
                                                    i10 = i14;
                                                    str11 = str3;
                                                    list2 = list;
                                                    str10 = str5;
                                                    i44 = i19;
                                                    runtimeException = null;
                                                }
                                            }
                                        }
                                    }
                                    i22 = i44;
                                    i21 = i46;
                                    i19 = i22;
                                    i45 = i23;
                                    str12 = str14;
                                    str13 = str6;
                                    i17 = i20;
                                    i16 = i21;
                                    i43 = i16 + i17;
                                    ef90Var2 = ef90Var;
                                    k3 = i47;
                                    i10 = i14;
                                    str11 = str3;
                                    list2 = list;
                                    str10 = str5;
                                    i44 = i19;
                                    runtimeException = null;
                                }
                            }
                            String str15 = str13;
                            String str16 = str10;
                            list = list2;
                            int i74 = k5;
                            int i75 = i45;
                            i14 = i10;
                            str3 = str11;
                            int i76 = i44;
                            if (k6 == i48) {
                                str4 = str16;
                                i17 = i74;
                                i15 = i46;
                                i16 = i15;
                            } else {
                                i15 = ef90Var2.b;
                                i16 = i46;
                                aja1.b(null, i15 >= i16);
                                while (true) {
                                    i17 = i74;
                                    if (i15 - i16 < i17) {
                                        ef90Var2.K(i15);
                                        int k7 = ef90Var2.k();
                                        str4 = str16;
                                        aja1.b(str4, k7 > 0);
                                        if (ef90Var2.k() != 1702061171) {
                                            i15 += k7;
                                            str16 = str4;
                                            i74 = i17;
                                        }
                                    } else {
                                        str4 = str16;
                                        i15 = -1;
                                    }
                                }
                            }
                            if (i15 != -1) {
                                vi6Var = a(i15, ef90Var2);
                                String str17 = vi6Var.a;
                                byte[] bArr8 = vi6Var.b;
                                if (bArr8 == null) {
                                    str5 = str4;
                                } else if ("audio/vorbis".equals(str17)) {
                                    ef90 ef90Var4 = new ef90(bArr8);
                                    ef90Var4.L(1);
                                    int i77 = 0;
                                    while (ef90Var4.a() > 0 && ef90Var4.h() == 255) {
                                        i77 += 255;
                                        ef90Var4.L(1);
                                    }
                                    int y5 = ef90Var4.y() + i77;
                                    int i78 = 0;
                                    while (true) {
                                        if (ef90Var4.a() > 0) {
                                            str5 = str4;
                                            if (ef90Var4.h() == 255) {
                                                i78 += 255;
                                                ef90Var4.L(1);
                                                str4 = str5;
                                            }
                                        } else {
                                            str5 = str4;
                                        }
                                    }
                                    int y6 = ef90Var4.y() + i78;
                                    byte[] bArr9 = new byte[y5];
                                    int i79 = ef90Var4.b;
                                    System.arraycopy(bArr8, i79, bArr9, 0, y5);
                                    int i80 = i79 + y5 + y6;
                                    int length = bArr8.length - i80;
                                    byte[] bArr10 = new byte[length];
                                    System.arraycopy(bArr8, i80, bArr10, 0, length);
                                    list = ImmutableList.s(bArr9, bArr10);
                                } else {
                                    str5 = str4;
                                    if ("audio/mp4a-latm".equals(str17)) {
                                        a4 o = pw21.o(new df90(bArr8, bArr8.length), false);
                                        int i81 = o.b;
                                        int i82 = o.c;
                                        str13 = o.a;
                                        i18 = i82;
                                        i75 = i81;
                                    } else {
                                        i18 = i76;
                                        str13 = str15;
                                    }
                                    ImmutableList r2 = ImmutableList.r(bArr8);
                                    i45 = i75;
                                    list = r2;
                                    str12 = str17;
                                    i19 = i18;
                                    vi6Var2 = vi6Var;
                                    i43 = i16 + i17;
                                    ef90Var2 = ef90Var;
                                    k3 = i47;
                                    i10 = i14;
                                    str11 = str3;
                                    list2 = list;
                                    str10 = str5;
                                    i44 = i19;
                                    runtimeException = null;
                                }
                                str12 = str17;
                                i18 = i76;
                                i45 = i75;
                            } else {
                                str5 = str4;
                                i18 = i76;
                                i45 = i75;
                                vi6Var = vi6Var2;
                                str12 = str14;
                            }
                            str13 = str15;
                            i19 = i18;
                            vi6Var2 = vi6Var;
                            i43 = i16 + i17;
                            ef90Var2 = ef90Var;
                            k3 = i47;
                            i10 = i14;
                            str11 = str3;
                            list2 = list;
                            str10 = str5;
                            i44 = i19;
                            runtimeException = null;
                        }
                        i43 = i16 + i17;
                        ef90Var2 = ef90Var;
                        k3 = i47;
                        i10 = i14;
                        str11 = str3;
                        list2 = list;
                        str10 = str5;
                        i44 = i19;
                        runtimeException = null;
                    }
                    String str18 = str13;
                    i6 = k3;
                    String str19 = str12;
                    List list3 = list2;
                    int i83 = i45;
                    int i84 = i10;
                    int i85 = i44;
                    z2 = false;
                    if (((a) yi6Var.x) == null && str19 != null) {
                        f7s f7sVar5 = new f7s();
                        f7sVar5.a = Integer.toString(i);
                        f7sVar5.m = eh20.q(str19);
                        f7sVar5.j = str18;
                        f7sVar5.C = i85;
                        f7sVar5.D = i83;
                        f7sVar5.E = i84;
                        f7sVar5.p = list3;
                        f7sVar5.q = drmInitData2;
                        f7sVar5.d = str9;
                        if (vi6Var2 != null) {
                            vi6 vi6Var3 = vi6Var2;
                            f7sVar5.h = com.google.common.primitives.a.d(vi6Var3.c);
                            f7sVar5.i = com.google.common.primitives.a.d(vi6Var3.d);
                        } else {
                            ti6 ti6Var2 = ti6Var;
                            if (ti6Var2 != null) {
                                f7sVar5.h = com.google.common.primitives.a.d(ti6Var2.b);
                                f7sVar5.i = com.google.common.primitives.a.d(ti6Var2.c);
                            }
                        }
                        yi6Var.x = new a(f7sVar5);
                    }
                    ef90Var2 = ef90Var;
                    i41 = i11;
                } else {
                    if (k4 == 1414810956 || k4 == 1954034535 || k4 == 2004251764 || k4 == 1937010800 || k4 == 1664495672) {
                        ef90Var2.K(i41 + 16);
                        String str20 = "application/ttml+xml";
                        if (k4 != 1414810956) {
                            if (k4 == 1954034535) {
                                int i86 = k3 - 16;
                                byte[] bArr11 = new byte[i86];
                                ef90Var2.i(0, i86, bArr11);
                                str20 = "application/x-quicktime-tx3g";
                                immutableList = ImmutableList.r(bArr11);
                                j = Long.MAX_VALUE;
                                f7s f7sVar6 = new f7s();
                                f7sVar6.a = Integer.toString(i);
                                f7sVar6.m = eh20.q(str20);
                                f7sVar6.d = str9;
                                f7sVar6.r = j;
                                f7sVar6.p = immutableList;
                                yi6Var.x = new a(f7sVar6);
                            } else if (k4 == 2004251764) {
                                str20 = "application/x-mp4-vtt";
                            } else if (k4 == 1937010800) {
                                j = 0;
                                immutableList = null;
                                f7s f7sVar62 = new f7s();
                                f7sVar62.a = Integer.toString(i);
                                f7sVar62.m = eh20.q(str20);
                                f7sVar62.d = str9;
                                f7sVar62.r = j;
                                f7sVar62.p = immutableList;
                                yi6Var.x = new a(f7sVar62);
                            } else {
                                if (k4 != 1664495672) {
                                    ny61.k();
                                    return null;
                                }
                                yi6Var.c = 1;
                                str20 = "application/x-mp4-cea-608";
                            }
                        }
                        immutableList = null;
                        j = Long.MAX_VALUE;
                        f7s f7sVar622 = new f7s();
                        f7sVar622.a = Integer.toString(i);
                        f7sVar622.m = eh20.q(str20);
                        f7sVar622.d = str9;
                        f7sVar622.r = j;
                        f7sVar622.p = immutableList;
                        yi6Var.x = new a(f7sVar622);
                    } else if (k4 == 1835365492) {
                        ef90Var2.K(i41 + 16);
                        if (k4 == 1835365492) {
                            ef90Var2.t();
                            String t = ef90Var2.t();
                            if (t != null) {
                                f7s f7sVar7 = new f7s();
                                f7sVar7.a = Integer.toString(i);
                                f7sVar7.m = eh20.q(t);
                                yi6Var.x = new a(f7sVar7);
                            }
                        }
                    } else if (k4 == 1667329389) {
                        f7s f7sVar8 = new f7s();
                        f7sVar8.a = Integer.toString(i);
                        f7sVar8.m = eh20.q("application/x-camera-motion");
                        yi6Var.x = new a(f7sVar8);
                    }
                    i6 = k3;
                    i7 = i40;
                    i3 = k2;
                    z2 = false;
                }
                ef90Var2.K(i41 + i6);
                i40 = i7 + 1;
                str9 = str;
                drmInitData3 = drmInitData;
                z5 = z2;
                k2 = i3;
            }
            h(ef90Var2, i5, i41, k3, i, str9, i4, drmInitData3, yi6Var, i40);
            i6 = k3;
            i7 = i40;
            ef90Var2.K(i41 + i6);
            i40 = i7 + 1;
            str9 = str;
            drmInitData3 = drmInitData;
            z5 = z2;
            k2 = i3;
        }
        return yi6Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:313:0x00de, code lost:
    
        if (r11 == 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x00e0, code lost:
    
        r11 = -9223372036854775807L;
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0767  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x07b4  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x07cb  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x086d  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0875  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x087b  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0881  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0885  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0896  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0915  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0888  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x087e  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0878  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x086f  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x07b6  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0533  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x05f0 A[ADDED_TO_REGION, LOOP:15: B:259:0x05f0->B:262:0x05fa, LOOP_START, PHI: r17
      0x05f0: PHI (r17v8 int) = (r17v6 int), (r17v9 int) binds: [B:258:0x05ee, B:262:0x05fa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:275:0x063b  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x063e  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x05e0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x0949 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:407:0x01e0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:409:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x065c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0698  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x06aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList g(tb30 tb30Var, jts jtsVar, long j, DrmInitData drmInitData, boolean z, boolean z2, vls vlsVar) {
        long j2;
        int i;
        long j3;
        int i2;
        int i3;
        long j4;
        long j5;
        long e0;
        int i4;
        int i5;
        ArrayList arrayList;
        long j6;
        int i6;
        String str;
        ub30 k;
        long j7;
        long[] jArr;
        long[] jArr2;
        a aVar;
        a aVar2;
        vls vlsVar2;
        uzz0 uzz0Var;
        tb30 j8;
        Pair create;
        long j9;
        long k2;
        wi6 zi6Var;
        boolean z3;
        int i7;
        int i8;
        int i9;
        int o;
        ef90 ef90Var;
        int i10;
        long[] jArr3;
        int[] iArr;
        int i11;
        int i12;
        int i13;
        ArrayList arrayList2;
        long j10;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        long[] jArr4;
        int[] iArr2;
        int i19;
        long j11;
        boolean z4;
        int i20;
        long[] jArr5;
        int[] iArr3;
        int i21;
        long j12;
        int i22;
        long j13;
        long[] jArr6;
        a aVar3;
        int i23;
        int i24;
        boolean z5;
        int i25;
        boolean z6;
        ArrayList arrayList3;
        k001 k001Var;
        int[] iArr4;
        int i26;
        boolean z7;
        int i27;
        k001 k001Var2;
        tb30 tb30Var2 = tb30Var;
        ArrayList arrayList4 = tb30Var2.e;
        ArrayList arrayList5 = new ArrayList();
        int i28 = 0;
        while (i28 < arrayList4.size()) {
            tb30 tb30Var3 = (tb30) arrayList4.get(i28);
            if (tb30Var3.b != 1953653099) {
                arrayList = arrayList4;
                arrayList3 = arrayList5;
                i10 = i28;
            } else {
                ub30 k3 = tb30Var2.k(1836476516);
                k3.getClass();
                tb30 j14 = tb30Var3.j(1835297121);
                j14.getClass();
                ub30 k4 = j14.k(1751411826);
                k4.getClass();
                ef90 ef90Var2 = k4.c;
                ef90Var2.K(16);
                int k5 = ef90Var2.k();
                int i29 = k5 == 1936684398 ? 1 : k5 == 1986618469 ? 2 : (k5 == 1952807028 || k5 == 1935832172 || k5 == 1937072756 || k5 == 1668047728) ? 3 : k5 == 1835365473 ? 5 : -1;
                if (i29 == -1) {
                    arrayList = arrayList4;
                    uzz0Var = null;
                    vlsVar2 = vlsVar;
                } else {
                    int i30 = 2;
                    ub30 k6 = tb30Var3.k(1953196132);
                    k6.getClass();
                    ef90 ef90Var3 = k6.c;
                    int i31 = 1;
                    ef90Var3.K(8);
                    int c = c(ef90Var3.k());
                    ef90Var3.L(c == 0 ? 8 : 16);
                    int k7 = ef90Var3.k();
                    ef90Var3.L(4);
                    int i32 = ef90Var3.b;
                    int i33 = c == 0 ? 4 : 8;
                    int i34 = 0;
                    while (true) {
                        if (i34 >= i33) {
                            ef90Var3.L(i33);
                            break;
                        }
                        if (ef90Var3.a[i32 + i34] != -1) {
                            j2 = c == 0 ? ef90Var3.A() : ef90Var3.D();
                        } else {
                            i34++;
                        }
                    }
                    ef90Var3.L(10);
                    int E = ef90Var3.E();
                    ef90Var3.L(4);
                    int k8 = ef90Var3.k();
                    int k9 = ef90Var3.k();
                    ef90Var3.L(4);
                    int k10 = ef90Var3.k();
                    int k11 = ef90Var3.k();
                    if (k8 == 0 && k9 == 65536) {
                        i = -65536;
                        if (k10 == -65536 && k11 == 0) {
                            i3 = 90;
                            j3 = -9223372036854775807L;
                            i2 = i3;
                            j4 = j != j3 ? j2 : j;
                            long j15 = d(k3.c).c;
                            if (j4 != j3) {
                                j5 = j15;
                                e0 = j3;
                            } else {
                                int i35 = tw21.a;
                                j5 = j15;
                                e0 = tw21.e0(j4, 1000000L, j5, RoundingMode.DOWN);
                            }
                            tb30 j16 = j14.j(1835626086);
                            j16.getClass();
                            tb30 j17 = j16.j(1937007212);
                            j17.getClass();
                            ub30 k12 = j14.k(1835296868);
                            k12.getClass();
                            ef90 ef90Var4 = k12.c;
                            ef90Var4.K(8);
                            int c2 = c(ef90Var4.k());
                            ef90Var4.L(c2 != 0 ? 8 : 16);
                            long A = ef90Var4.A();
                            int i36 = ef90Var4.b;
                            i4 = c2 != 0 ? 4 : 8;
                            i5 = 0;
                            while (true) {
                                if (i5 < i4) {
                                    arrayList = arrayList4;
                                    ef90Var4.L(i4);
                                    break;
                                }
                                arrayList = arrayList4;
                                if (ef90Var4.a[i36 + i5] != -1) {
                                    long A2 = c2 == 0 ? ef90Var4.A() : ef90Var4.D();
                                    if (A2 != 0) {
                                        int i37 = tw21.a;
                                        j6 = tw21.e0(A2, 1000000L, A, RoundingMode.DOWN);
                                    }
                                } else {
                                    i5++;
                                    arrayList4 = arrayList;
                                }
                            }
                            j6 = -9223372036854775807L;
                            int E2 = ef90Var4.E();
                            char[] cArr = {(char) (((E2 >> 10) & 31) + 96), (char) (((E2 >> 5) & 31) + 96), (char) ((E2 & 31) + 96)};
                            for (i6 = 0; i6 < 3; i6++) {
                                char c3 = cArr[i6];
                                if (c3 < 'a' || c3 > 'z') {
                                    str = null;
                                    break;
                                }
                            }
                            str = new String(cArr);
                            k = j17.k(1937011556);
                            if (k != null) {
                                throw ParserException.a(null, "Malformed sample table (stbl) missing sample description (stsd)");
                            }
                            yi6 f = f(k.c, k7, i2, str, drmInitData, z2);
                            if (z || (j8 = tb30Var3.j(1701082227)) == null) {
                                j7 = e0;
                            } else {
                                ub30 k13 = j8.k(1701606260);
                                if (k13 == null) {
                                    j7 = e0;
                                    create = null;
                                } else {
                                    ef90 ef90Var5 = k13.c;
                                    ef90Var5.K(8);
                                    int c4 = c(ef90Var5.k());
                                    int C = ef90Var5.C();
                                    long[] jArr7 = new long[C];
                                    long[] jArr8 = new long[C];
                                    int i38 = 0;
                                    while (i38 < C) {
                                        int i39 = i31;
                                        jArr7[i38] = c4 == i39 ? ef90Var5.D() : ef90Var5.A();
                                        if (c4 == i39) {
                                            k2 = ef90Var5.s();
                                            j9 = e0;
                                        } else {
                                            j9 = e0;
                                            k2 = ef90Var5.k();
                                        }
                                        jArr8[i38] = k2;
                                        if (ef90Var5.v() != 1) {
                                            ny61.g("Unsupported media rate.");
                                            return null;
                                        }
                                        ef90Var5.L(i30);
                                        i38++;
                                        e0 = j9;
                                        i30 = 2;
                                        i31 = 1;
                                    }
                                    j7 = e0;
                                    create = Pair.create(jArr7, jArr8);
                                }
                                if (create != null) {
                                    long[] jArr9 = (long[]) create.first;
                                    jArr2 = (long[]) create.second;
                                    jArr = jArr9;
                                    aVar = (a) f.x;
                                    if (aVar != null) {
                                        vlsVar2 = vlsVar;
                                        uzz0Var = null;
                                    } else {
                                        if (E != 0) {
                                            sb30 sb30Var = new sb30(E);
                                            f7s a2 = aVar.a();
                                            w820 w820Var = ((a) f.x).l;
                                            a2.k = w820Var != null ? w820Var.a(sb30Var) : new w820(sb30Var);
                                            aVar2 = new a(a2);
                                        } else {
                                            aVar2 = aVar;
                                        }
                                        vlsVar2 = vlsVar;
                                        uzz0Var = new uzz0(k7, i29, A, j5, j7, j6, aVar2, f.c, (vzz0[]) f.w, f.b, jArr, jArr2);
                                    }
                                }
                            }
                            jArr = null;
                            jArr2 = null;
                            aVar = (a) f.x;
                            if (aVar != null) {
                            }
                        }
                    } else {
                        i = -65536;
                    }
                    if (k8 == 0 && k9 == i) {
                        if (k10 == 65536 && k11 == 0) {
                            i3 = SubsamplingScaleImageView.ORIENTATION_270;
                            j3 = -9223372036854775807L;
                            i2 = i3;
                            if (j != j3) {
                            }
                            long j152 = d(k3.c).c;
                            if (j4 != j3) {
                            }
                            tb30 j162 = j14.j(1835626086);
                            j162.getClass();
                            tb30 j172 = j162.j(1937007212);
                            j172.getClass();
                            ub30 k122 = j14.k(1835296868);
                            k122.getClass();
                            ef90 ef90Var42 = k122.c;
                            ef90Var42.K(8);
                            int c22 = c(ef90Var42.k());
                            ef90Var42.L(c22 != 0 ? 8 : 16);
                            long A3 = ef90Var42.A();
                            int i362 = ef90Var42.b;
                            if (c22 != 0) {
                            }
                            i5 = 0;
                            while (true) {
                                if (i5 < i4) {
                                }
                                i5++;
                                arrayList4 = arrayList;
                            }
                            j6 = -9223372036854775807L;
                            int E22 = ef90Var42.E();
                            char[] cArr2 = {(char) (((E22 >> 10) & 31) + 96), (char) (((E22 >> 5) & 31) + 96), (char) ((E22 & 31) + 96)};
                            while (i6 < 3) {
                            }
                            str = new String(cArr2);
                            k = j172.k(1937011556);
                            if (k != null) {
                            }
                        } else {
                            i = -65536;
                        }
                    }
                    if (k8 == i && k9 == 0 && k10 == 0 && k11 == i) {
                        i3 = SubsamplingScaleImageView.ORIENTATION_180;
                        j3 = -9223372036854775807L;
                        i2 = i3;
                        if (j != j3) {
                        }
                        long j1522 = d(k3.c).c;
                        if (j4 != j3) {
                        }
                        tb30 j1622 = j14.j(1835626086);
                        j1622.getClass();
                        tb30 j1722 = j1622.j(1937007212);
                        j1722.getClass();
                        ub30 k1222 = j14.k(1835296868);
                        k1222.getClass();
                        ef90 ef90Var422 = k1222.c;
                        ef90Var422.K(8);
                        int c222 = c(ef90Var422.k());
                        ef90Var422.L(c222 != 0 ? 8 : 16);
                        long A32 = ef90Var422.A();
                        int i3622 = ef90Var422.b;
                        if (c222 != 0) {
                        }
                        i5 = 0;
                        while (true) {
                            if (i5 < i4) {
                            }
                            i5++;
                            arrayList4 = arrayList;
                        }
                        j6 = -9223372036854775807L;
                        int E222 = ef90Var422.E();
                        char[] cArr22 = {(char) (((E222 >> 10) & 31) + 96), (char) (((E222 >> 5) & 31) + 96), (char) ((E222 & 31) + 96)};
                        while (i6 < 3) {
                        }
                        str = new String(cArr22);
                        k = j1722.k(1937011556);
                        if (k != null) {
                        }
                    } else {
                        j3 = -9223372036854775807L;
                        i2 = 0;
                        if (j != j3) {
                        }
                        long j15222 = d(k3.c).c;
                        if (j4 != j3) {
                        }
                        tb30 j16222 = j14.j(1835626086);
                        j16222.getClass();
                        tb30 j17222 = j16222.j(1937007212);
                        j17222.getClass();
                        ub30 k12222 = j14.k(1835296868);
                        k12222.getClass();
                        ef90 ef90Var4222 = k12222.c;
                        ef90Var4222.K(8);
                        int c2222 = c(ef90Var4222.k());
                        ef90Var4222.L(c2222 != 0 ? 8 : 16);
                        long A322 = ef90Var4222.A();
                        int i36222 = ef90Var4222.b;
                        if (c2222 != 0) {
                        }
                        i5 = 0;
                        while (true) {
                            if (i5 < i4) {
                            }
                            i5++;
                            arrayList4 = arrayList;
                        }
                        j6 = -9223372036854775807L;
                        int E2222 = ef90Var4222.E();
                        char[] cArr222 = {(char) (((E2222 >> 10) & 31) + 96), (char) (((E2222 >> 5) & 31) + 96), (char) ((E2222 & 31) + 96)};
                        while (i6 < 3) {
                        }
                        str = new String(cArr222);
                        k = j17222.k(1937011556);
                        if (k != null) {
                        }
                    }
                }
                uzz0 uzz0Var2 = (uzz0) vlsVar2.mo489apply(uzz0Var);
                if (uzz0Var2 == null) {
                    arrayList3 = arrayList5;
                    i10 = i28;
                } else {
                    a aVar4 = uzz0Var2.g;
                    tb30 j18 = tb30Var3.j(1835297121);
                    j18.getClass();
                    tb30 j19 = j18.j(1835626086);
                    j19.getClass();
                    tb30 j20 = j19.j(1937007212);
                    j20.getClass();
                    ub30 k14 = j20.k(1937011578);
                    if (k14 != null) {
                        zi6Var = new kn1(k14, aVar4);
                    } else {
                        ub30 k15 = j20.k(1937013298);
                        if (k15 == null) {
                            throw ParserException.a(null, "Track has no sample table size information");
                        }
                        zi6Var = new zi6(k15);
                    }
                    int h = zi6Var.h();
                    if (h == 0) {
                        k001Var = new k001(uzz0Var2, new long[0], new int[0], 0, new long[0], new int[0], 0L);
                        arrayList3 = arrayList5;
                        i10 = i28;
                    } else {
                        if (uzz0Var2.b == 2) {
                            long j21 = uzz0Var2.f;
                            if (j21 > 0) {
                                f7s a3 = aVar4.a();
                                a3.v = h / (j21 / 1000000.0f);
                                uzz0Var2 = uzz0Var2.a(new a(a3));
                            }
                        }
                        a aVar5 = uzz0Var2.g;
                        ub30 k16 = j20.k(1937007471);
                        if (k16 == null) {
                            k16 = j20.k(1668232756);
                            k16.getClass();
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        ef90 ef90Var6 = k16.c;
                        ub30 k17 = j20.k(1937011555);
                        k17.getClass();
                        ef90 ef90Var7 = k17.c;
                        ub30 k18 = j20.k(1937011827);
                        k18.getClass();
                        ef90 ef90Var8 = k18.c;
                        ub30 k19 = j20.k(1937011571);
                        ef90 ef90Var9 = k19 != null ? k19.c : null;
                        ub30 k20 = j20.k(1668576371);
                        ef90 ef90Var10 = k20 != null ? k20.c : null;
                        ui6 ui6Var = new ui6(ef90Var7, ef90Var6, z3);
                        ef90Var8.K(12);
                        int C2 = ef90Var8.C() - 1;
                        int C3 = ef90Var8.C();
                        int C4 = ef90Var8.C();
                        if (ef90Var10 != null) {
                            ef90Var10.K(12);
                            i7 = ef90Var10.C();
                        } else {
                            i7 = 0;
                        }
                        if (ef90Var9 != null) {
                            ef90Var9.K(12);
                            i8 = ef90Var9.C();
                            if (i8 > 0) {
                                i9 = ef90Var9.C() - 1;
                                o = zi6Var.o();
                                ef90Var = ef90Var10;
                                String str2 = aVar5.n;
                                if (o == -1 && (("audio/raw".equals(str2) || "audio/g711-mlaw".equals(str2) || "audio/g711-alaw".equals(str2)) && C2 == 0 && i7 == 0 && i8 == 0)) {
                                    int i40 = ui6Var.a;
                                    long[] jArr10 = new long[i40];
                                    int[] iArr5 = new int[i40];
                                    while (ui6Var.b()) {
                                        int i41 = ui6Var.b;
                                        jArr10[i41] = ui6Var.d;
                                        iArr5[i41] = ui6Var.c;
                                    }
                                    long j22 = C4;
                                    int i42 = 8192 / o;
                                    int i43 = 0;
                                    for (int i44 = 0; i44 < i40; i44++) {
                                        i43 += tw21.f(iArr5[i44], i42);
                                    }
                                    jArr4 = new long[i43];
                                    iArr2 = new int[i43];
                                    long[] jArr11 = new long[i43];
                                    int[] iArr6 = new int[i43];
                                    i10 = i28;
                                    int i45 = 0;
                                    int i46 = 0;
                                    int i47 = 0;
                                    int i48 = 0;
                                    int i49 = 0;
                                    while (i45 < i40) {
                                        int i50 = iArr5[i45];
                                        long j23 = jArr10[i45];
                                        int i51 = i49;
                                        int i52 = i40;
                                        int i53 = i48;
                                        int i54 = i51;
                                        int i55 = i45;
                                        int i56 = i50;
                                        while (i56 > 0) {
                                            int min = Math.min(i42, i56);
                                            jArr4[i54] = j23;
                                            int i57 = i56;
                                            int i58 = o * min;
                                            iArr2[i54] = i58;
                                            i47 += i58;
                                            i53 = Math.max(i53, i58);
                                            long j24 = j22;
                                            jArr11[i54] = i46 * j24;
                                            iArr6[i54] = 1;
                                            j23 += iArr2[i54];
                                            i46 += min;
                                            i56 = i57 - min;
                                            i54++;
                                            j22 = j24;
                                        }
                                        long j25 = j22;
                                        i45 = i55 + 1;
                                        int i59 = i54;
                                        i48 = i53;
                                        i40 = i52;
                                        i49 = i59;
                                        j22 = j25;
                                    }
                                    j11 = i46 * j22;
                                    j12 = i47;
                                    arrayList2 = arrayList5;
                                    iArr3 = iArr6;
                                    jArr5 = jArr11;
                                    i21 = i48;
                                } else {
                                    i10 = i28;
                                    jArr3 = new long[h];
                                    iArr = new int[h];
                                    long[] jArr12 = new long[h];
                                    int[] iArr7 = new int[h];
                                    int i60 = i7;
                                    wi6 wi6Var = zi6Var;
                                    i11 = C3;
                                    i12 = i8;
                                    int i61 = C4;
                                    i13 = C2;
                                    int i62 = i9;
                                    int i63 = i60;
                                    arrayList2 = arrayList5;
                                    ef90 ef90Var11 = ef90Var9;
                                    long j26 = 0;
                                    long j27 = 0;
                                    j10 = 0;
                                    i14 = 0;
                                    i15 = 0;
                                    i16 = 0;
                                    int i64 = 0;
                                    i17 = 0;
                                    while (true) {
                                        if (i16 < h) {
                                            i18 = i11;
                                            jArr4 = jArr3;
                                            iArr2 = iArr;
                                            h = h;
                                            break;
                                        }
                                        boolean z8 = true;
                                        while (i17 == 0) {
                                            z8 = ui6Var.b();
                                            if (!z8) {
                                                break;
                                            }
                                            j10 = ui6Var.d;
                                            i17 = ui6Var.c;
                                            h = h;
                                            i11 = i11;
                                        }
                                        i22 = h;
                                        i18 = i11;
                                        if (!z8) {
                                            lk91.j("Unexpected end of chunk data");
                                            long[] copyOf = Arrays.copyOf(jArr3, i16);
                                            int[] copyOf2 = Arrays.copyOf(iArr, i16);
                                            jArr12 = Arrays.copyOf(jArr12, i16);
                                            iArr7 = Arrays.copyOf(iArr7, i16);
                                            iArr2 = copyOf2;
                                            h = i16;
                                            jArr4 = copyOf;
                                            break;
                                        }
                                        if (ef90Var != null) {
                                            while (i15 == 0 && i63 > 0) {
                                                i15 = ef90Var.C();
                                                i64 = ef90Var.k();
                                                i63--;
                                            }
                                            i15--;
                                        }
                                        jArr3[i16] = j10;
                                        int e = wi6Var.e();
                                        iArr[i16] = e;
                                        int[] iArr8 = iArr;
                                        int i65 = i15;
                                        j26 += e;
                                        if (e > i14) {
                                            i14 = e;
                                        }
                                        jArr12[i16] = j27 + i64;
                                        iArr7[i16] = ef90Var11 == null ? 1 : 0;
                                        if (i16 == i62) {
                                            iArr7[i16] = 1;
                                            i12--;
                                            if (i12 > 0) {
                                                ef90Var11.getClass();
                                                i62 = ef90Var11.C() - 1;
                                            }
                                        }
                                        j27 += i61;
                                        int i66 = i18 - 1;
                                        if (i66 == 0 && i13 > 0) {
                                            i66 = ef90Var8.C();
                                            i13--;
                                            i61 = ef90Var8.k();
                                        }
                                        j10 += iArr8[i16];
                                        i17--;
                                        i16++;
                                        i11 = i66;
                                        iArr = iArr8;
                                        jArr3 = jArr3;
                                        i15 = i65;
                                        h = i22;
                                        i14 = i14;
                                    }
                                    i19 = i17;
                                    j11 = j27 + i64;
                                    if (ef90Var != null) {
                                        while (i63 > 0) {
                                            if (ef90Var.C() != 0) {
                                                z4 = false;
                                                break;
                                            }
                                            ef90Var.k();
                                            i63--;
                                        }
                                    }
                                    z4 = true;
                                    if (i12 != 0 && i18 == 0 && i19 == 0 && i13 == 0 && i15 == 0 && z4) {
                                        i20 = i14;
                                    } else {
                                        StringBuilder sb = new StringBuilder("Inconsistent stbl box for track ");
                                        i20 = i14;
                                        boolean z9 = z4;
                                        vfc.u(uzz0Var2.a, i12, ": remainingSynchronizationSamples ", ", remainingSamplesAtTimestampDelta ", sb);
                                        vfc.u(i18, i19, ", remainingSamplesInChunk ", ", remainingTimestampDeltaChanges ", sb);
                                        sb.append(i13);
                                        sb.append(", remainingSamplesAtTimestampOffset ");
                                        sb.append(i15);
                                        sb.append(z9 ? ", ctts invalid" : "");
                                        lk91.j(sb.toString());
                                    }
                                    jArr5 = jArr12;
                                    iArr3 = iArr7;
                                    i21 = i20;
                                    j12 = j26;
                                }
                                long[] jArr13 = jArr4;
                                int[] iArr9 = iArr2;
                                j13 = uzz0Var2.f;
                                if (j13 > 0) {
                                    long e02 = tw21.e0(8 * j12, 1000000L, j13, RoundingMode.HALF_DOWN);
                                    if (e02 > 0 && e02 < 2147483647L) {
                                        f7s a4 = aVar5.a();
                                        a4.h = (int) e02;
                                        uzz0Var2 = uzz0Var2.a(new a(a4));
                                    }
                                }
                                long j28 = uzz0Var2.c;
                                a aVar6 = uzz0Var2.g;
                                int i67 = uzz0Var2.b;
                                long[] jArr14 = uzz0Var2.j;
                                jArr6 = uzz0Var2.i;
                                RoundingMode roundingMode = RoundingMode.DOWN;
                                long e03 = tw21.e0(j11, 1000000L, j28, roundingMode);
                                if (jArr6 != null) {
                                    tw21.d0(j28, jArr5);
                                    k001Var2 = new k001(uzz0Var2, jArr13, iArr9, i21, jArr5, iArr3, e03);
                                } else {
                                    long[] jArr15 = jArr5;
                                    if (jArr6.length == 1 && i67 == 1 && jArr15.length >= 2) {
                                        jArr14.getClass();
                                        long j29 = jArr14[0];
                                        i23 = h;
                                        long e04 = tw21.e0(jArr6[0], uzz0Var2.c, uzz0Var2.d, roundingMode) + j29;
                                        int length = jArr15.length - 1;
                                        int i68 = tw21.i(4, 0, length);
                                        int i69 = tw21.i(jArr15.length - 4, 0, length);
                                        long j30 = jArr15[0];
                                        if (j30 > j29 || j29 >= jArr15[i68] || jArr15[i69] >= e04 || e04 > j11) {
                                            aVar3 = aVar6;
                                            int i70 = 1;
                                            if (jArr6.length == 1) {
                                                if (jArr6[0] == 0) {
                                                    jArr14.getClass();
                                                    long j31 = jArr14[0];
                                                    for (int i71 = 0; i71 < jArr15.length; i71++) {
                                                        jArr15[i71] = tw21.e0(jArr15[i71] - j31, 1000000L, uzz0Var2.c, RoundingMode.DOWN);
                                                    }
                                                    arrayList3 = arrayList2;
                                                    k001Var = new k001(uzz0Var2, jArr13, iArr9, i21, jArr15, iArr3, tw21.e0(j11 - j31, 1000000L, uzz0Var2.c, RoundingMode.DOWN));
                                                    arrayList3.add(k001Var);
                                                } else {
                                                    i70 = 1;
                                                }
                                            }
                                            int[] iArr10 = iArr3;
                                            boolean z10 = i67 != i70;
                                            int[] iArr11 = new int[jArr6.length];
                                            int[] iArr12 = new int[jArr6.length];
                                            jArr14.getClass();
                                            int i72 = 0;
                                            i24 = 0;
                                            boolean z11 = false;
                                            int i73 = 0;
                                            while (i24 < jArr6.length) {
                                                int[] iArr13 = iArr11;
                                                int[] iArr14 = iArr12;
                                                long j32 = jArr14[i24];
                                                if (j32 != -1) {
                                                    i26 = i24;
                                                    boolean z12 = z11;
                                                    long e05 = tw21.e0(jArr6[i24], uzz0Var2.c, uzz0Var2.d, RoundingMode.DOWN);
                                                    iArr4 = iArr13;
                                                    iArr4[i26] = tw21.e(jArr15, j32, true);
                                                    long j33 = j32 + e05;
                                                    iArr14[i26] = tw21.a(jArr15, j33, z10);
                                                    int i74 = iArr4[i26];
                                                    while (true) {
                                                        i27 = iArr4[i26];
                                                        if (i27 < 0 || (iArr10[i27] & 1) != 0) {
                                                            break;
                                                        }
                                                        iArr4[i26] = i27 - 1;
                                                    }
                                                    if (i27 < 0) {
                                                        iArr4[i26] = i74;
                                                        while (true) {
                                                            int i75 = iArr4[i26];
                                                            if (i75 >= iArr14[i26] || (iArr10[i75] & 1) != 0) {
                                                                break;
                                                            }
                                                            iArr4[i26] = i75 + 1;
                                                        }
                                                    }
                                                    if (i67 == 2 && iArr4[i26] != iArr14[i26]) {
                                                        while (true) {
                                                            int i76 = iArr14[i26];
                                                            if (i76 >= jArr15.length - 1) {
                                                                break;
                                                            }
                                                            int i77 = i76 + 1;
                                                            if (jArr15[i77] > j33) {
                                                                break;
                                                            }
                                                            iArr14[i26] = i77;
                                                        }
                                                    }
                                                    int i78 = iArr14[i26];
                                                    int i79 = iArr4[i26];
                                                    int i80 = (i78 - i79) + i73;
                                                    z7 = z12 | (i72 != i79);
                                                    i72 = i78;
                                                    i73 = i80;
                                                } else {
                                                    iArr4 = iArr13;
                                                    i26 = i24;
                                                    z7 = z11;
                                                }
                                                i24 = i26 + 1;
                                                iArr12 = iArr14;
                                                z11 = z7;
                                                iArr11 = iArr4;
                                            }
                                            int[] iArr15 = iArr11;
                                            int[] iArr16 = iArr12;
                                            z5 = z11 | (i73 == i23);
                                            long[] jArr16 = !z5 ? new long[i73] : jArr13;
                                            int[] iArr17 = !z5 ? new int[i73] : iArr9;
                                            if (z5) {
                                                i21 = 0;
                                            }
                                            int[] iArr18 = !z5 ? new int[i73] : iArr10;
                                            long[] jArr17 = new long[i73];
                                            i25 = 0;
                                            z6 = false;
                                            int i81 = 0;
                                            long j34 = 0;
                                            int i82 = i21;
                                            while (i25 < jArr6.length) {
                                                long j35 = jArr14[i25];
                                                boolean z13 = z5;
                                                int i83 = iArr15[i25];
                                                long[] jArr18 = jArr6;
                                                int i84 = iArr16[i25];
                                                long[] jArr19 = jArr17;
                                                if (z13) {
                                                    int i85 = i84 - i83;
                                                    System.arraycopy(jArr13, i83, jArr16, i81, i85);
                                                    System.arraycopy(iArr9, i83, iArr17, i81, i85);
                                                    System.arraycopy(iArr10, i83, iArr18, i81, i85);
                                                }
                                                int i86 = i82;
                                                while (i83 < i84) {
                                                    int i87 = i83;
                                                    long[] jArr20 = jArr16;
                                                    long j36 = uzz0Var2.d;
                                                    RoundingMode roundingMode2 = RoundingMode.DOWN;
                                                    long e06 = tw21.e0(j34, 1000000L, j36, roundingMode2);
                                                    long e07 = tw21.e0(jArr15[i87] - j35, 1000000L, uzz0Var2.c, roundingMode2);
                                                    if (e07 < 0) {
                                                        z6 = true;
                                                    }
                                                    jArr19[i81] = e06 + e07;
                                                    if (z13 && iArr17[i81] > i86) {
                                                        i86 = iArr9[i87];
                                                    }
                                                    i81++;
                                                    i83 = i87 + 1;
                                                    jArr16 = jArr20;
                                                }
                                                j34 += jArr18[i25];
                                                i25++;
                                                i82 = i86;
                                                z5 = z13;
                                                jArr6 = jArr18;
                                                jArr16 = jArr16;
                                                jArr17 = jArr19;
                                            }
                                            long[] jArr21 = jArr16;
                                            long[] jArr22 = jArr17;
                                            long e08 = tw21.e0(j34, 1000000L, uzz0Var2.d, RoundingMode.DOWN);
                                            if (z6) {
                                                f7s a5 = aVar3.a();
                                                a5.s = true;
                                                uzz0Var2 = uzz0Var2.a(new a(a5));
                                            }
                                            arrayList3 = arrayList2;
                                            k001Var = new k001(uzz0Var2, jArr21, iArr17, i82, jArr22, iArr18, e08);
                                            arrayList3.add(k001Var);
                                        } else {
                                            long j37 = j11 - e04;
                                            long e09 = tw21.e0(j29 - j30, aVar6.E, uzz0Var2.c, roundingMode);
                                            aVar3 = aVar6;
                                            long e010 = tw21.e0(j37, aVar6.E, uzz0Var2.c, roundingMode);
                                            if ((e09 != 0 || e010 != 0) && e09 <= 2147483647L && e010 <= 2147483647L) {
                                                jtsVar.a = (int) e09;
                                                jtsVar.b = (int) e010;
                                                tw21.d0(j28, jArr15);
                                                k001Var2 = new k001(uzz0Var2, jArr13, iArr9, i21, jArr15, iArr3, tw21.e0(jArr6[0], 1000000L, uzz0Var2.d, roundingMode));
                                            }
                                        }
                                    } else {
                                        aVar3 = aVar6;
                                        i23 = h;
                                    }
                                    int i702 = 1;
                                    if (jArr6.length == 1) {
                                    }
                                    int[] iArr102 = iArr3;
                                    if (i67 != i702) {
                                    }
                                    int[] iArr112 = new int[jArr6.length];
                                    int[] iArr122 = new int[jArr6.length];
                                    jArr14.getClass();
                                    int i722 = 0;
                                    i24 = 0;
                                    boolean z112 = false;
                                    int i732 = 0;
                                    while (i24 < jArr6.length) {
                                    }
                                    int[] iArr152 = iArr112;
                                    int[] iArr162 = iArr122;
                                    z5 = z112 | (i732 == i23);
                                    if (!z5) {
                                    }
                                    if (!z5) {
                                    }
                                    if (z5) {
                                    }
                                    if (!z5) {
                                    }
                                    long[] jArr172 = new long[i732];
                                    i25 = 0;
                                    z6 = false;
                                    int i812 = 0;
                                    long j342 = 0;
                                    int i822 = i21;
                                    while (i25 < jArr6.length) {
                                    }
                                    long[] jArr212 = jArr16;
                                    long[] jArr222 = jArr172;
                                    long e082 = tw21.e0(j342, 1000000L, uzz0Var2.d, RoundingMode.DOWN);
                                    if (z6) {
                                    }
                                    arrayList3 = arrayList2;
                                    k001Var = new k001(uzz0Var2, jArr212, iArr17, i822, jArr222, iArr18, e082);
                                    arrayList3.add(k001Var);
                                }
                                arrayList3 = arrayList2;
                                k001Var = k001Var2;
                            } else {
                                ef90Var9 = null;
                            }
                        } else {
                            i8 = 0;
                        }
                        i9 = -1;
                        o = zi6Var.o();
                        ef90Var = ef90Var10;
                        String str22 = aVar5.n;
                        if (o == -1) {
                        }
                        i10 = i28;
                        jArr3 = new long[h];
                        iArr = new int[h];
                        long[] jArr122 = new long[h];
                        int[] iArr72 = new int[h];
                        int i602 = i7;
                        wi6 wi6Var2 = zi6Var;
                        i11 = C3;
                        i12 = i8;
                        int i612 = C4;
                        i13 = C2;
                        int i622 = i9;
                        int i632 = i602;
                        arrayList2 = arrayList5;
                        ef90 ef90Var112 = ef90Var9;
                        long j262 = 0;
                        long j272 = 0;
                        j10 = 0;
                        i14 = 0;
                        i15 = 0;
                        i16 = 0;
                        int i642 = 0;
                        i17 = 0;
                        while (true) {
                            if (i16 < h) {
                            }
                            j10 += iArr8[i16];
                            i17--;
                            i16++;
                            i11 = i66;
                            iArr = iArr8;
                            jArr3 = jArr3;
                            i15 = i65;
                            h = i22;
                            i14 = i14;
                        }
                        i19 = i17;
                        j11 = j272 + i642;
                        if (ef90Var != null) {
                        }
                        z4 = true;
                        if (i12 != 0) {
                        }
                        StringBuilder sb2 = new StringBuilder("Inconsistent stbl box for track ");
                        i20 = i14;
                        boolean z92 = z4;
                        vfc.u(uzz0Var2.a, i12, ": remainingSynchronizationSamples ", ", remainingSamplesAtTimestampDelta ", sb2);
                        vfc.u(i18, i19, ", remainingSamplesInChunk ", ", remainingTimestampDeltaChanges ", sb2);
                        sb2.append(i13);
                        sb2.append(", remainingSamplesAtTimestampOffset ");
                        sb2.append(i15);
                        sb2.append(z92 ? ", ctts invalid" : "");
                        lk91.j(sb2.toString());
                        jArr5 = jArr122;
                        iArr3 = iArr72;
                        i21 = i20;
                        j12 = j262;
                        long[] jArr132 = jArr4;
                        int[] iArr92 = iArr2;
                        j13 = uzz0Var2.f;
                        if (j13 > 0) {
                        }
                        long j282 = uzz0Var2.c;
                        a aVar62 = uzz0Var2.g;
                        int i672 = uzz0Var2.b;
                        long[] jArr142 = uzz0Var2.j;
                        jArr6 = uzz0Var2.i;
                        RoundingMode roundingMode3 = RoundingMode.DOWN;
                        long e032 = tw21.e0(j11, 1000000L, j282, roundingMode3);
                        if (jArr6 != null) {
                        }
                        arrayList3 = arrayList2;
                        k001Var = k001Var2;
                    }
                    arrayList3.add(k001Var);
                }
            }
            i28 = i10 + 1;
            arrayList5 = arrayList3;
            arrayList4 = arrayList;
            tb30Var2 = tb30Var;
        }
        return arrayList5;
    }

    /* JADX WARN: Removed duplicated region for block: B:226:0x04b6  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x05eb  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x05ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void h(ef90 ef90Var, int i, int i2, int i3, int i4, String str, int i5, DrmInitData drmInitData, yi6 yi6Var, int i6) {
        int i7;
        String str2;
        int i8;
        int i9;
        int i10;
        DrmInitData drmInitData2;
        String str3;
        dt20 dt20Var;
        int i11;
        int i12;
        List list;
        int i13;
        int g;
        int i14;
        int g2;
        int i15;
        kfc a2;
        int i16;
        int g3;
        int i17;
        String str4;
        DrmInitData drmInitData3;
        int i18;
        pm5 pm5Var;
        int i19;
        int i20 = i2;
        int i21 = i3;
        DrmInitData drmInitData4 = drmInitData;
        yi6 yi6Var2 = yi6Var;
        ef90Var.K(i20 + 16);
        ef90Var.L(16);
        int E = ef90Var.E();
        int E2 = ef90Var.E();
        ef90Var.L(50);
        int i22 = ef90Var.b;
        int i23 = i;
        if (i23 == 1701733238) {
            Pair e = e(ef90Var, i20, i21);
            if (e != null) {
                i23 = ((Integer) e.first).intValue();
                drmInitData4 = drmInitData4 == null ? null : drmInitData4.copyWithSchemeType(((vzz0) e.second).b);
                ((vzz0[]) yi6Var2.w)[i6] = (vzz0) e.second;
            }
            ef90Var.K(i22);
        }
        String str5 = "video/3gpp";
        String str6 = i23 == 1831958048 ? "video/mpeg" : i23 == 1211250227 ? "video/3gpp" : null;
        float f = 1.0f;
        List list2 = null;
        String str7 = null;
        byte[] bArr = null;
        int i24 = -1;
        int i25 = -1;
        int i26 = -1;
        int i27 = -1;
        int i28 = -1;
        int i29 = -1;
        ByteBuffer byteBuffer = null;
        int i30 = 8;
        int i31 = 8;
        ti6 ti6Var = null;
        vi6 vi6Var = null;
        dt20 dt20Var2 = null;
        boolean z = false;
        while (i22 - i20 < i21) {
            ef90Var.K(i22);
            int i32 = ef90Var.b;
            int k = ef90Var.k();
            if (k == 0 && ef90Var.b - i20 == i21) {
                break;
            }
            String str8 = "childAtomSize must be positive";
            aja1.b("childAtomSize must be positive", k > 0);
            int k2 = ef90Var.k();
            if (k2 == 1635148611) {
                aja1.b(null, str6 == null);
                ef90Var.K(i32 + 8);
                nb4 a3 = nb4.a(ef90Var);
                ArrayList arrayList = a3.a;
                yi6Var2.b = a3.b;
                if (!z) {
                    f = a3.k;
                }
                String str9 = a3.l;
                int i33 = a3.j;
                int i34 = a3.g;
                int i35 = a3.h;
                str7 = str9;
                int i36 = a3.i;
                int i37 = a3.e;
                i10 = a3.f;
                i9 = i37;
                drmInitData2 = drmInitData4;
                i7 = i22;
                i12 = i23;
                str2 = str5;
                i8 = i35;
                list = arrayList;
                i29 = i36;
                str3 = "video/avc";
                i25 = i33;
                i27 = i34;
            } else {
                i7 = i22;
                if (k2 == 1752589123) {
                    aja1.b(null, str6 == null);
                    ef90Var.K(i32 + 8);
                    pfu a4 = pfu.a(ef90Var, false, null);
                    List list3 = a4.a;
                    yi6Var2.b = a4.b;
                    if (!z) {
                        f = a4.j;
                    }
                    int i38 = a4.k;
                    int i39 = a4.c;
                    String str10 = a4.l;
                    int i40 = a4.i;
                    if (i40 != -1) {
                        i24 = i40;
                    }
                    int i41 = a4.f;
                    int i42 = a4.g;
                    int i43 = a4.h;
                    int i44 = a4.d;
                    i10 = a4.e;
                    drmInitData2 = drmInitData4;
                    str3 = "video/hevc";
                    dt20Var2 = a4.m;
                    i12 = i23;
                    str2 = str5;
                    i8 = i42;
                    list = list3;
                    i29 = i43;
                    i9 = i44;
                    i26 = i39;
                    i27 = i41;
                    i25 = i38;
                    str7 = str10;
                } else {
                    str2 = str5;
                    if (k2 == 1818785347) {
                        aja1.b("lhvC must follow hvcC atom", "video/hevc".equals(str6));
                        dt20 dt20Var3 = dt20Var2;
                        aja1.b("must have at least two layers", dt20Var3 != null && ((ImmutableList) dt20Var3.b).size() >= 2);
                        ef90Var.K(i32 + 8);
                        dt20Var3.getClass();
                        pfu a5 = pfu.a(ef90Var, true, dt20Var3);
                        aja1.b("nalUnitLengthFieldLength must be same for both hvcC and lhvC atoms", yi6Var2.b == a5.b);
                        int i45 = a5.f;
                        int i46 = i27;
                        if (i45 != -1) {
                            aja1.b("colorSpace must be the same for both views", i46 == i45);
                        }
                        int i47 = a5.g;
                        int i48 = i28;
                        if (i47 != -1) {
                            aja1.b("colorRange must be the same for both views", i48 == i47);
                        }
                        int i49 = a5.h;
                        if (i49 != -1) {
                            i19 = i29;
                            aja1.b("colorTransfer must be the same for both views", i19 == i49);
                        } else {
                            i19 = i29;
                        }
                        int i50 = i30;
                        int i51 = i19;
                        aja1.b("bitdepthLuma must be the same for both views", i50 == a5.d);
                        int i52 = i31;
                        aja1.b("bitdepthChroma must be the same for both views", i52 == a5.e);
                        if (list2 != null) {
                            piv pivVar = ImmutableList.b;
                            ImmutableList.a aVar = new ImmutableList.a();
                            aVar.d(list2);
                            aVar.d(a5.a);
                            list2 = aVar.g();
                        } else {
                            aja1.b("initializationData must be already set from hvcC atom", false);
                        }
                        dt20Var2 = dt20Var3;
                        drmInitData2 = drmInitData4;
                        str3 = "video/mv-hevc";
                        i12 = i23;
                        i8 = i48;
                        i9 = i50;
                        list = list2;
                        i29 = i51;
                        i10 = i52;
                        str7 = a5.l;
                        i27 = i46;
                    } else {
                        int i53 = i27;
                        i8 = i28;
                        int i54 = i29;
                        i9 = i30;
                        i10 = i31;
                        dt20 dt20Var4 = dt20Var2;
                        if (k2 == 1986361461) {
                            ef90Var.K(i32 + 8);
                            int i55 = ef90Var.b;
                            str3 = str6;
                            pm5 pm5Var2 = null;
                            while (i55 - i32 < k) {
                                ef90Var.K(i55);
                                int k3 = ef90Var.k();
                                int i56 = i55;
                                aja1.b(str8, k3 > 0);
                                if (ef90Var.k() == 1702454643) {
                                    ef90Var.K(i56 + 8);
                                    int i57 = ef90Var.b;
                                    while (true) {
                                        if (i57 - i56 >= k3) {
                                            str4 = str8;
                                            drmInitData3 = drmInitData4;
                                            i18 = k3;
                                            pm5Var = null;
                                            break;
                                        }
                                        ef90Var.K(i57);
                                        int k4 = ef90Var.k();
                                        aja1.b(str8, k4 > 0);
                                        str4 = str8;
                                        if (ef90Var.k() == 1937011305) {
                                            ef90Var.L(4);
                                            int y = ef90Var.y();
                                            boolean z2 = (y & 1) == 1;
                                            i18 = k3;
                                            boolean z3 = (y & 2) == 2;
                                            drmInitData3 = drmInitData4;
                                            boolean z4 = (y & 8) == 8;
                                            xi6 xi6Var = new xi6();
                                            xi6Var.a = z2;
                                            xi6Var.b = z3;
                                            xi6Var.c = z4;
                                            pm5Var = new pm5(6, xi6Var);
                                        } else {
                                            i57 += k4;
                                            str8 = str4;
                                        }
                                    }
                                    pm5Var2 = pm5Var;
                                } else {
                                    str4 = str8;
                                    drmInitData3 = drmInitData4;
                                    i18 = k3;
                                }
                                i55 = i56 + i18;
                                str8 = str4;
                                drmInitData4 = drmInitData3;
                            }
                            drmInitData2 = drmInitData4;
                            hh5 hh5Var = pm5Var2 == null ? null : new hh5(7, pm5Var2);
                            if (hh5Var != null) {
                                xi6 xi6Var2 = (xi6) ((pm5) hh5Var.b).b;
                                if (dt20Var4 == null || ((ImmutableList) dt20Var4.b).size() < 2) {
                                    i17 = i24;
                                    if (i17 == -1) {
                                        i24 = xi6Var2.c ? 5 : 4;
                                        dt20Var2 = dt20Var4;
                                    }
                                    i24 = i17;
                                    dt20Var2 = dt20Var4;
                                } else {
                                    aja1.b("both eye views must be marked as available", xi6Var2.a && xi6Var2.b);
                                    aja1.b("for MV-HEVC, eye_views_reversed must be set to false", !xi6Var2.c);
                                }
                            }
                            i17 = i24;
                            i24 = i17;
                            dt20Var2 = dt20Var4;
                        } else {
                            drmInitData2 = drmInitData4;
                            str3 = str6;
                            int i58 = i24;
                            if (k2 == 1685480259 || k2 == 1685485123) {
                                dt20Var = dt20Var4;
                                i11 = i58;
                                i12 = i23;
                                list = list2;
                                i13 = i54;
                                mf1 n = mf1.n(ef90Var);
                                if (n != null) {
                                    str7 = n.b;
                                    str3 = "video/dolby-vision";
                                }
                            } else {
                                int i59 = 12;
                                if (k2 == 1987076931) {
                                    aja1.b(null, str3 == null);
                                    String str11 = i23 == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                                    ef90Var.K(i32 + 12);
                                    byte y2 = (byte) ef90Var.y();
                                    byte y3 = (byte) ef90Var.y();
                                    int y4 = ef90Var.y();
                                    int i60 = y4 >> 4;
                                    byte b = (byte) ((y4 >> 1) & 7);
                                    if (str11.equals("video/x-vnd.on2.vp9")) {
                                        byte[] bArr2 = bac.a;
                                        list2 = ImmutableList.r(new byte[]{1, 1, y2, 2, 1, y3, 3, 1, (byte) i60, 4, 1, b});
                                    }
                                    boolean z5 = (y4 & 1) != 0;
                                    int y5 = ef90Var.y();
                                    int y6 = ef90Var.y();
                                    int f2 = kfc.f(y5);
                                    int i61 = z5 ? 1 : 2;
                                    i29 = kfc.g(y6);
                                    dt20Var2 = dt20Var4;
                                    i24 = i58;
                                    i9 = i60;
                                    i10 = i9;
                                    i27 = f2;
                                    i12 = i23;
                                    list = list2;
                                    i8 = i61;
                                    str3 = str11;
                                } else {
                                    int i62 = 11;
                                    if (k2 == 1635135811) {
                                        int i63 = k - 8;
                                        byte[] bArr3 = new byte[i63];
                                        ef90Var.i(0, i63, bArr3);
                                        ImmutableList r = ImmutableList.r(bArr3);
                                        ef90Var.K(i32 + 8);
                                        jfc jfcVar = new jfc();
                                        byte[] bArr4 = ef90Var.a;
                                        df90 df90Var = new df90(bArr4, bArr4.length);
                                        df90Var.m(ef90Var.b * 8);
                                        df90Var.p(1);
                                        int g4 = df90Var.g(3);
                                        df90Var.o(6);
                                        boolean f3 = df90Var.f();
                                        boolean f4 = df90Var.f();
                                        int i64 = 2;
                                        if (g4 == 2) {
                                            if (f3) {
                                                jfcVar.e = f4 ? 12 : 10;
                                                jfcVar.f = f4 ? 12 : 10;
                                                df90Var.o(13);
                                                df90Var.n();
                                                g = df90Var.g(4);
                                                if (g == 1) {
                                                    lk91.h("BoxParsers", "Unsupported obu_type: " + g);
                                                    a2 = jfcVar.a();
                                                } else if (df90Var.f()) {
                                                    lk91.h("BoxParsers", "Unsupported obu_extension_flag");
                                                    a2 = jfcVar.a();
                                                } else {
                                                    boolean f5 = df90Var.f();
                                                    df90Var.n();
                                                    if (!f5 || df90Var.g(8) <= 127) {
                                                        int g5 = df90Var.g(3);
                                                        df90Var.n();
                                                        if (df90Var.f()) {
                                                            lk91.h("BoxParsers", "Unsupported reduced_still_picture_header");
                                                            a2 = jfcVar.a();
                                                        } else if (df90Var.f()) {
                                                            lk91.h("BoxParsers", "Unsupported timing_info_present_flag");
                                                            a2 = jfcVar.a();
                                                        } else if (df90Var.f()) {
                                                            lk91.h("BoxParsers", "Unsupported initial_display_delay_present_flag");
                                                            a2 = jfcVar.a();
                                                        } else {
                                                            int i65 = 5;
                                                            int g6 = df90Var.g(5);
                                                            int i66 = 0;
                                                            while (i66 <= g6) {
                                                                df90Var.o(i59);
                                                                if (df90Var.g(i65) > 7) {
                                                                    df90Var.n();
                                                                }
                                                                i66++;
                                                                i59 = 12;
                                                                i65 = 5;
                                                            }
                                                            int g7 = df90Var.g(4);
                                                            int g8 = df90Var.g(4);
                                                            df90Var.o(g7 + 1);
                                                            df90Var.o(g8 + 1);
                                                            if (df90Var.f()) {
                                                                df90Var.o(7);
                                                            }
                                                            df90Var.o(7);
                                                            boolean f6 = df90Var.f();
                                                            if (f6) {
                                                                df90Var.o(2);
                                                            }
                                                            if (df90Var.f()) {
                                                                i14 = 1;
                                                                g2 = 2;
                                                            } else {
                                                                i14 = 1;
                                                                g2 = df90Var.g(1);
                                                            }
                                                            if (g2 > 0 && !df90Var.f()) {
                                                                df90Var.o(i14);
                                                            }
                                                            if (f6) {
                                                                i15 = 3;
                                                                df90Var.o(3);
                                                            } else {
                                                                i15 = 3;
                                                            }
                                                            df90Var.o(i15);
                                                            boolean f7 = df90Var.f();
                                                            if (g5 == 2 && f7) {
                                                                df90Var.n();
                                                            }
                                                            boolean z6 = g5 != 1 && df90Var.f();
                                                            if (df90Var.f()) {
                                                                int g9 = df90Var.g(8);
                                                                int g10 = df90Var.g(8);
                                                                int g11 = df90Var.g(8);
                                                                if (z6) {
                                                                    i16 = 1;
                                                                } else {
                                                                    i16 = 1;
                                                                    if (g9 == 1 && g10 == 13 && g11 == 0) {
                                                                        g3 = 1;
                                                                        jfcVar.a = kfc.f(g9);
                                                                        jfcVar.b = g3 != i16 ? 1 : 2;
                                                                        jfcVar.c = kfc.g(g10);
                                                                    }
                                                                }
                                                                g3 = df90Var.g(i16);
                                                                jfcVar.a = kfc.f(g9);
                                                                jfcVar.b = g3 != i16 ? 1 : 2;
                                                                jfcVar.c = kfc.g(g10);
                                                            }
                                                            a2 = jfcVar.a();
                                                        }
                                                    } else {
                                                        lk91.h("BoxParsers", "Excessive obu_size");
                                                        a2 = jfcVar.a();
                                                    }
                                                }
                                                int i67 = a2.e;
                                                int i68 = a2.f;
                                                int i69 = a2.a;
                                                int i70 = a2.b;
                                                i29 = a2.c;
                                                dt20Var2 = dt20Var4;
                                                i24 = i58;
                                                i9 = i67;
                                                i10 = i68;
                                                i27 = i69;
                                                i8 = i70;
                                                i12 = i23;
                                                str3 = "video/av01";
                                                list = r;
                                            } else {
                                                i64 = 2;
                                            }
                                        }
                                        if (g4 <= i64) {
                                            jfcVar.e = f3 ? 10 : 8;
                                            jfcVar.f = f3 ? 10 : 8;
                                        }
                                        df90Var.o(13);
                                        df90Var.n();
                                        g = df90Var.g(4);
                                        if (g == 1) {
                                        }
                                        int i672 = a2.e;
                                        int i682 = a2.f;
                                        int i692 = a2.a;
                                        int i702 = a2.b;
                                        i29 = a2.c;
                                        dt20Var2 = dt20Var4;
                                        i24 = i58;
                                        i9 = i672;
                                        i10 = i682;
                                        i27 = i692;
                                        i8 = i702;
                                        i12 = i23;
                                        str3 = "video/av01";
                                        list = r;
                                    } else if (k2 == 1668050025) {
                                        ByteBuffer order = byteBuffer == null ? ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN) : byteBuffer;
                                        order.position(21);
                                        order.putShort(ef90Var.v());
                                        order.putShort(ef90Var.v());
                                        byteBuffer = order;
                                        dt20Var2 = dt20Var4;
                                        i24 = i58;
                                    } else {
                                        if (k2 == 1835295606) {
                                            ByteBuffer order2 = byteBuffer == null ? ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN) : byteBuffer;
                                            short v = ef90Var.v();
                                            short v2 = ef90Var.v();
                                            short v3 = ef90Var.v();
                                            short v4 = ef90Var.v();
                                            short v5 = ef90Var.v();
                                            dt20Var = dt20Var4;
                                            short v6 = ef90Var.v();
                                            i12 = i23;
                                            short v7 = ef90Var.v();
                                            list = list2;
                                            short v8 = ef90Var.v();
                                            long A = ef90Var.A();
                                            long A2 = ef90Var.A();
                                            i11 = i58;
                                            order2.position(1);
                                            order2.putShort(v5);
                                            order2.putShort(v6);
                                            order2.putShort(v);
                                            order2.putShort(v2);
                                            order2.putShort(v3);
                                            order2.putShort(v4);
                                            order2.putShort(v7);
                                            order2.putShort(v8);
                                            order2.putShort((short) (A / 10000));
                                            order2.putShort((short) (A2 / 10000));
                                            byteBuffer = order2;
                                        } else {
                                            dt20Var = dt20Var4;
                                            i11 = i58;
                                            i12 = i23;
                                            list = list2;
                                            if (k2 == 1681012275) {
                                                aja1.b(null, str3 == null);
                                                i27 = i53;
                                                dt20Var2 = dt20Var;
                                                str3 = str2;
                                                i29 = i54;
                                                i24 = i11;
                                            } else if (k2 == 1702061171) {
                                                aja1.b(null, str3 == null);
                                                vi6 a6 = a(i32, ef90Var);
                                                String str12 = a6.a;
                                                byte[] bArr5 = a6.b;
                                                vi6Var = a6;
                                                str3 = str12;
                                                i27 = i53;
                                                list = bArr5 != null ? ImmutableList.r(bArr5) : list;
                                                dt20Var2 = dt20Var;
                                                i29 = i54;
                                                i24 = i11;
                                            } else if (k2 == 1651798644) {
                                                ef90Var.K(i32 + 8);
                                                ef90Var.L(4);
                                                i27 = i53;
                                                dt20Var2 = dt20Var;
                                                i29 = i54;
                                                i24 = i11;
                                                ti6Var = new ti6(ef90Var.A(), ef90Var.A(), 0, (byte) 0);
                                            } else if (k2 == 1885434736) {
                                                ef90Var.K(i32 + 8);
                                                f = ef90Var.C() / ef90Var.C();
                                                i27 = i53;
                                                dt20Var2 = dt20Var;
                                                i29 = i54;
                                                i24 = i11;
                                                z = true;
                                            } else if (k2 == 1937126244) {
                                                int i71 = i32 + 8;
                                                while (true) {
                                                    if (i71 - i32 >= k) {
                                                        bArr = null;
                                                        break;
                                                    }
                                                    ef90Var.K(i71);
                                                    int k5 = ef90Var.k();
                                                    if (ef90Var.k() == 1886547818) {
                                                        bArr = Arrays.copyOfRange(ef90Var.a, i71, k5 + i71);
                                                        break;
                                                    }
                                                    i71 += k5;
                                                }
                                            } else if (k2 == 1936995172) {
                                                int y7 = ef90Var.y();
                                                ef90Var.L(3);
                                                if (y7 == 0) {
                                                    int y8 = ef90Var.y();
                                                    if (y8 == 0) {
                                                        i11 = 0;
                                                    } else if (y8 == 1) {
                                                        i11 = 1;
                                                    } else if (y8 == 2) {
                                                        i11 = 2;
                                                    } else if (y8 == 3) {
                                                        i11 = 3;
                                                    }
                                                }
                                            } else if (k2 == 1634760259) {
                                                int i72 = k - 12;
                                                byte[] bArr6 = new byte[i72];
                                                ef90Var.K(i32 + 12);
                                                ef90Var.i(0, i72, bArr6);
                                                ImmutableList r2 = ImmutableList.r(bArr6);
                                                ef90 ef90Var2 = new ef90(bArr6);
                                                jfc jfcVar2 = new jfc();
                                                byte[] bArr7 = ef90Var2.a;
                                                df90 df90Var2 = new df90(bArr7, bArr7.length);
                                                df90Var2.m(ef90Var2.b * 8);
                                                int i73 = 1;
                                                df90Var2.p(1);
                                                int g12 = df90Var2.g(8);
                                                int i74 = 0;
                                                while (i74 < g12) {
                                                    df90Var2.p(i73);
                                                    int g13 = df90Var2.g(8);
                                                    int i75 = 0;
                                                    while (i75 < g13) {
                                                        df90Var2.o(6);
                                                        boolean f8 = df90Var2.f();
                                                        df90Var2.n();
                                                        df90Var2.p(i62);
                                                        df90Var2.o(4);
                                                        int g14 = df90Var2.g(4) + 8;
                                                        jfcVar2.e = g14;
                                                        jfcVar2.f = g14;
                                                        df90Var2.p(1);
                                                        if (f8) {
                                                            int g15 = df90Var2.g(8);
                                                            int g16 = df90Var2.g(8);
                                                            df90Var2.p(1);
                                                            boolean f9 = df90Var2.f();
                                                            jfcVar2.a = kfc.f(g15);
                                                            jfcVar2.b = f9 ? 1 : 2;
                                                            jfcVar2.c = kfc.g(g16);
                                                        }
                                                        i75++;
                                                        i62 = 11;
                                                    }
                                                    i74++;
                                                    i73 = 1;
                                                    i62 = 11;
                                                }
                                                kfc a7 = jfcVar2.a();
                                                int i76 = a7.e;
                                                int i77 = a7.f;
                                                int i78 = a7.a;
                                                int i79 = a7.b;
                                                list = r2;
                                                i29 = a7.c;
                                                i9 = i76;
                                                i10 = i77;
                                                i27 = i78;
                                                i8 = i79;
                                                str3 = "video/apv";
                                                dt20Var2 = dt20Var;
                                                i24 = i11;
                                            } else if (k2 == 1668246642) {
                                                i13 = i54;
                                                if (i53 == -1 && i13 == -1) {
                                                    int k6 = ef90Var.k();
                                                    if (k6 == 1852009592 || k6 == 1852009571) {
                                                        int E3 = ef90Var.E();
                                                        int E4 = ef90Var.E();
                                                        ef90Var.L(2);
                                                        boolean z7 = k == 19 && (ef90Var.y() & 128) != 0;
                                                        i27 = kfc.f(E3);
                                                        int i80 = z7 ? 1 : 2;
                                                        i29 = kfc.g(E4);
                                                        i8 = i80;
                                                        dt20Var2 = dt20Var;
                                                        i24 = i11;
                                                    } else {
                                                        lk91.j("Unsupported color type: ".concat(ay4.d(k6)));
                                                    }
                                                }
                                            } else {
                                                i13 = i54;
                                            }
                                        }
                                        i27 = i53;
                                        dt20Var2 = dt20Var;
                                        i29 = i54;
                                        i24 = i11;
                                    }
                                }
                            }
                            i27 = i53;
                            i29 = i13;
                            dt20Var2 = dt20Var;
                            i24 = i11;
                        }
                        i27 = i53;
                        i12 = i23;
                        list = list2;
                        i29 = i54;
                    }
                }
                i22 = i7 + k;
                i20 = i2;
                i21 = i3;
                yi6Var2 = yi6Var;
                str6 = str3;
                i23 = i12;
                list2 = list;
                str5 = str2;
                i28 = i8;
                i30 = i9;
                i31 = i10;
                drmInitData4 = drmInitData2;
            }
            i22 = i7 + k;
            i20 = i2;
            i21 = i3;
            yi6Var2 = yi6Var;
            str6 = str3;
            i23 = i12;
            list2 = list;
            str5 = str2;
            i28 = i8;
            i30 = i9;
            i31 = i10;
            drmInitData4 = drmInitData2;
        }
        DrmInitData drmInitData5 = drmInitData4;
        int i81 = i24;
        int i82 = i27;
        int i83 = i28;
        int i84 = i29;
        int i85 = i30;
        int i86 = i31;
        String str13 = str6;
        List list4 = list2;
        if (str13 == null) {
            return;
        }
        f7s f7sVar = new f7s();
        f7sVar.a = Integer.toString(i4);
        f7sVar.m = eh20.q(str13);
        f7sVar.j = str7;
        f7sVar.t = E;
        f7sVar.u = E2;
        f7sVar.x = f;
        f7sVar.w = i5;
        f7sVar.y = bArr;
        f7sVar.z = i81;
        f7sVar.p = list4;
        f7sVar.o = i25;
        f7sVar.B = i26;
        f7sVar.q = drmInitData5;
        f7sVar.d = str;
        jfc jfcVar3 = new jfc();
        jfcVar3.a = i82;
        jfcVar3.b = i83;
        jfcVar3.c = i84;
        jfcVar3.d = byteBuffer != null ? byteBuffer.array() : null;
        jfcVar3.e = i85;
        jfcVar3.f = i86;
        f7sVar.A = jfcVar3.a();
        ti6 ti6Var2 = ti6Var;
        if (ti6Var2 != null) {
            f7sVar.h = com.google.common.primitives.a.d(ti6Var2.b);
            f7sVar.i = com.google.common.primitives.a.d(ti6Var2.c);
        } else {
            vi6 vi6Var2 = vi6Var;
            if (vi6Var2 != null) {
                f7sVar.h = com.google.common.primitives.a.d(vi6Var2.c);
                f7sVar.i = com.google.common.primitives.a.d(vi6Var2.d);
            }
        }
        yi6Var.x = new a(f7sVar);
    }
}
