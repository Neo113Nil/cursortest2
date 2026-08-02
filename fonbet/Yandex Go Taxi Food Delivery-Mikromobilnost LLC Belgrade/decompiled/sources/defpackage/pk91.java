package defpackage;

import android.content.Context;
import android.util.Log;
import androidx.camera.video.b;
import androidx.camera.video.g;
import com.google.zxing.WriterException;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import io.flutter.plugins.camerax.CameraXError;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

/* loaded from: classes11.dex */
public abstract class pk91 {
    public static final int[][] a = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};
    public static final int[][] b = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};
    public static final int[][] c = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, 102, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 32, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, 114, -1, -1}, new int[]{6, 34, 62, 90, HProv.PP_INFO, -1, -1}, new int[]{6, 26, 50, 74, 98, 122, -1}, new int[]{6, 30, 54, 78, 102, HProv.PP_DELETE_SAVED_PASSWD, -1}, new int[]{6, 26, 52, 78, 104, 130, -1}, new int[]{6, 30, 56, 82, 108, HProv.PP_CONTAINER_EXTENSION_DEL, -1}, new int[]{6, 34, 60, 86, 112, HProv.PP_VERSION_EX, -1}, new int[]{6, 30, 58, 86, 114, 142, -1}, new int[]{6, 34, 62, 90, HProv.PP_INFO, HProv.PP_CONTAINER_STATUS, -1}, new int[]{6, 30, 54, 78, 102, HProv.PP_DELETE_SAVED_PASSWD, 150}, new int[]{6, 24, 50, 76, 102, 128, 154}, new int[]{6, 28, 54, 80, 106, HProv.PP_CONTAINER_EXTENSION, HProv.PP_LICENSE}, new int[]{6, 32, 58, 84, 110, HProv.PP_LCD_QUERY, 162}, new int[]{6, 26, 54, 82, 110, HProv.PP_VERSION_EX, 166}, new int[]{6, 30, 58, 86, 114, 142, MSException.ERROR_BUSY}};
    public static final int[][] d = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};
    public static au2 e;

    /* JADX WARN: Removed duplicated region for block: B:88:0x021d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(uz5 uz5Var, ErrorCorrectionLevel errorCorrectionLevel, aa31 aa31Var, int i, kn1 kn1Var) {
        int i2;
        char c2;
        int i3;
        boolean z;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10 = aa31Var.a;
        byte[][] bArr = (byte[][]) kn1Var.w;
        int i11 = kn1Var.b;
        int i12 = kn1Var.c;
        for (byte[] bArr2 : bArr) {
            Arrays.fill(bArr2, (byte) -1);
        }
        int length = a[0].length;
        d(0, 0, kn1Var);
        int i13 = i11 - length;
        d(i13, 0, kn1Var);
        d(0, i13, kn1Var);
        c(0, 7, kn1Var);
        int i14 = i11 - 8;
        c(i14, 7, kn1Var);
        c(0, i14, kn1Var);
        e(7, 0, kn1Var);
        int i15 = i12 - 8;
        e(i15, 0, kn1Var);
        int i16 = i12 - 7;
        e(7, i16, kn1Var);
        if (kn1Var.u(8, i15) == 0) {
            throw new WriterException();
        }
        kn1Var.w(8, i15, 1);
        int i17 = 5;
        if (i10 < 2) {
            i2 = 0;
            c2 = 1;
        } else {
            int[] iArr = c[i10 - 1];
            i2 = 0;
            int length2 = iArr.length;
            c2 = 1;
            int i18 = 0;
            while (i18 < length2) {
                int i19 = iArr[i18];
                if (i19 >= 0) {
                    int length3 = iArr.length;
                    int i20 = 0;
                    while (i20 < length3) {
                        int i21 = iArr[i20];
                        if (i21 < 0 || !f(kn1Var.u(i21, i19))) {
                            i3 = i20;
                        } else {
                            int i22 = i21 - 2;
                            int i23 = i19 - 2;
                            i3 = i20;
                            int i24 = 0;
                            while (i24 < i17) {
                                int[] iArr2 = b[i24];
                                int i25 = i24;
                                int i26 = 0;
                                while (i26 < i17) {
                                    int i27 = i26;
                                    kn1Var.w(i22 + i26, i23 + i25, iArr2[i27]);
                                    i26 = i27 + 1;
                                    i11 = i11;
                                    i17 = 5;
                                }
                                i24 = i25 + 1;
                                i17 = 5;
                            }
                        }
                        i20 = i3 + 1;
                        i11 = i11;
                        i17 = 5;
                    }
                }
                i18++;
                i11 = i11;
                i17 = 5;
            }
        }
        int i28 = i11;
        int i29 = 8;
        while (i29 < i14) {
            int i30 = i29 + 1;
            int i31 = i30 % 2;
            if (f(kn1Var.u(i29, 6))) {
                kn1Var.w(i29, 6, i31);
            }
            if (f(kn1Var.u(6, i29))) {
                kn1Var.w(6, i29, i31);
            }
            i29 = i30;
        }
        uz5 uz5Var2 = new uz5();
        if (i < 0 || i >= 8) {
            throw new WriterException("Invalid mask pattern");
        }
        int b2 = (errorCorrectionLevel.b() << 3) | i;
        uz5Var2.b(b2, 5);
        uz5Var2.b(b(b2, 1335), 10);
        uz5 uz5Var3 = new uz5();
        uz5Var3.b(21522, 15);
        if (uz5Var2.b != uz5Var3.b) {
            ny61.g("Sizes don't match");
            return;
        }
        int i32 = i2;
        while (true) {
            int[] iArr3 = uz5Var2.a;
            if (i32 >= iArr3.length) {
                break;
            }
            iArr3[i32] = iArr3[i32] ^ uz5Var3.a[i32];
            i32++;
        }
        if (uz5Var2.b != 15) {
            throw new WriterException("should not happen but we got: " + uz5Var2.b);
        }
        int i33 = i2;
        while (true) {
            int i34 = uz5Var2.b;
            if (i33 >= i34) {
                break;
            }
            boolean d2 = uz5Var2.d((i34 - 1) - i33);
            int[] iArr4 = d[i33];
            kn1Var.x(iArr4[i2], iArr4[c2], d2);
            if (i33 < 8) {
                i9 = (i28 - i33) - 1;
                i8 = 8;
            } else {
                i8 = (i33 - 8) + i16;
                i9 = 8;
            }
            kn1Var.x(i9, i8, d2);
            i33++;
        }
        if (i10 >= 7) {
            uz5 uz5Var4 = new uz5();
            uz5Var4.b(i10, 6);
            uz5Var4.b(b(i10, 7973), 12);
            if (uz5Var4.b != 18) {
                throw new WriterException("should not happen but we got: " + uz5Var4.b);
            }
            int i35 = 17;
            for (int i36 = i2; i36 < 6; i36++) {
                for (int i37 = i2; i37 < 3; i37++) {
                    boolean d3 = uz5Var4.d(i35);
                    i35--;
                    int i38 = (i12 - 11) + i37;
                    kn1Var.x(i36, i38, d3);
                    kn1Var.x(i38, i36, d3);
                }
            }
        }
        int i39 = i28 - 1;
        int i40 = i12 - 1;
        int i41 = i2;
        int i42 = -1;
        while (i39 > 0) {
            if (i39 == 6) {
                i39--;
            }
            while (i40 >= 0 && i40 < i12) {
                for (int i43 = i2; i43 < 2; i43++) {
                    int i44 = i39 - i43;
                    if (f(kn1Var.u(i44, i40))) {
                        if (i41 < uz5Var.b) {
                            z = uz5Var.d(i41);
                            i41++;
                        } else {
                            z = i2;
                        }
                        if (i != -1) {
                            switch (i) {
                                case 0:
                                    i4 = i40 + i44;
                                    i5 = i4 & 1;
                                    if (i5 == 0) {
                                        z = !z;
                                        break;
                                    }
                                    break;
                                case 1:
                                    i5 = i40 & 1;
                                    if (i5 == 0) {
                                    }
                                    break;
                                case 2:
                                    i5 = i44 % 3;
                                    if (i5 == 0) {
                                    }
                                    break;
                                case 3:
                                    i5 = (i40 + i44) % 3;
                                    if (i5 == 0) {
                                    }
                                    break;
                                case 4:
                                    i5 = ((i44 / 3) + (i40 / 2)) & 1;
                                    if (i5 == 0) {
                                    }
                                    break;
                                case 5:
                                    int i45 = i40 * i44;
                                    i5 = (i45 % 3) + (i45 & 1);
                                    if (i5 == 0) {
                                    }
                                    break;
                                case 6:
                                    int i46 = i40 * i44;
                                    i6 = i46 & 1;
                                    i7 = i46 % 3;
                                    i4 = i7 + i6;
                                    i5 = i4 & 1;
                                    if (i5 == 0) {
                                    }
                                    break;
                                case 7:
                                    i7 = (i40 * i44) % 3;
                                    i6 = (i40 + i44) & 1;
                                    i4 = i7 + i6;
                                    i5 = i4 & 1;
                                    if (i5 == 0) {
                                    }
                                    break;
                                default:
                                    ny61.g(oyr.i(i, "Invalid mask pattern: "));
                                    return;
                            }
                        }
                        kn1Var.x(i44, i40, z);
                    }
                }
                i40 += i42;
            }
            i42 = -i42;
            i40 += i42;
            i39 -= 2;
        }
        if (i41 == uz5Var.b) {
            return;
        }
        throw new WriterException("Not all bits consumed: " + i41 + '/' + uz5Var.b);
    }

    public static int b(int i, int i2) {
        if (i2 == 0) {
            ny61.g("0 polynomial");
            return 0;
        }
        int numberOfLeadingZeros = Integer.numberOfLeadingZeros(i2);
        int i3 = 32 - numberOfLeadingZeros;
        int i4 = i << (31 - numberOfLeadingZeros);
        while (32 - Integer.numberOfLeadingZeros(i4) >= i3) {
            i4 ^= i2 << ((32 - Integer.numberOfLeadingZeros(i4)) - i3);
        }
        return i4;
    }

    public static void c(int i, int i2, kn1 kn1Var) {
        for (int i3 = 0; i3 < 8; i3++) {
            int i4 = i + i3;
            if (!f(kn1Var.u(i4, i2))) {
                throw new WriterException();
            }
            kn1Var.w(i4, i2, 0);
        }
    }

    public static void d(int i, int i2, kn1 kn1Var) {
        for (int i3 = 0; i3 < 7; i3++) {
            int[] iArr = a[i3];
            for (int i4 = 0; i4 < 7; i4++) {
                kn1Var.w(i + i4, i2 + i3, iArr[i4]);
            }
        }
    }

    public static void e(int i, int i2, kn1 kn1Var) {
        for (int i3 = 0; i3 < 7; i3++) {
            int i4 = i2 + i3;
            if (!f(kn1Var.u(i, i4))) {
                throw new WriterException();
            }
            kn1Var.w(i, i4, 0);
        }
    }

    public static boolean f(int i) {
        return i == -1;
    }

    public static void g(tt5 tt5Var, final v83 v83Var) {
        rs10 j = v83Var != null ? v83Var.a.j() : new bu7();
        Object obj = null;
        m2v m2vVar = new m2v(tt5Var, "dev.flutter.pigeon.camera_android_camerax.Recorder.pigeon_defaultConstructor", j, obj);
        if (v83Var != null) {
            final int i = 0;
            m2vVar.G(new ee5() { // from class: usb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    List g5;
                    int i2 = i;
                    v83 v83Var2 = v83Var;
                    switch (i2) {
                        case 0:
                            List list = (List) obj2;
                            try {
                                ((w4u) v83Var2.a.w).j(((Long) list.get(0)).longValue(), v83.c((Long) list.get(1), (Long) list.get(2), (qgg0) list.get(3)));
                                g = Collections.singletonList(null);
                            } catch (Throwable th) {
                                if (th instanceof CameraXError) {
                                    CameraXError cameraXError = th;
                                    g = scc.g(cameraXError.getCode(), cameraXError.getMessage(), cameraXError.getDetails());
                                } else {
                                    g = scc.g(th.getClass().getSimpleName(), th.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                                }
                            }
                            ce5Var.a(g);
                            return;
                        case 1:
                            g gVar = (g) ((List) obj2).get(0);
                            try {
                                v83Var2.getClass();
                                g2 = Collections.singletonList(Long.valueOf(((k74) g.l(gVar.E)).a.d));
                            } catch (Throwable th2) {
                                if (th2 instanceof CameraXError) {
                                    CameraXError cameraXError2 = th2;
                                    g2 = scc.g(cameraXError2.getCode(), cameraXError2.getMessage(), cameraXError2.getDetails());
                                } else {
                                    g2 = scc.g(th2.getClass().getSimpleName(), th2.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            ce5Var.a(g2);
                            return;
                        case 2:
                            g gVar2 = (g) ((List) obj2).get(0);
                            try {
                                v83Var2.getClass();
                                g3 = Collections.singletonList(Long.valueOf(((Integer) ((k74) g.l(gVar2.E)).a.c.getLower()).intValue()));
                            } catch (Throwable th3) {
                                if (th3 instanceof CameraXError) {
                                    CameraXError cameraXError3 = th3;
                                    g3 = scc.g(cameraXError3.getCode(), cameraXError3.getMessage(), cameraXError3.getDetails());
                                } else {
                                    g3 = scc.g(th3.getClass().getSimpleName(), th3.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            ce5Var.a(g3);
                            return;
                        case 3:
                            g gVar3 = (g) ((List) obj2).get(0);
                            try {
                                v83Var2.getClass();
                                g4 = Collections.singletonList(((k74) g.l(gVar3.E)).a.a);
                            } catch (Throwable th4) {
                                if (th4 instanceof CameraXError) {
                                    CameraXError cameraXError4 = th4;
                                    g4 = scc.g(cameraXError4.getCode(), cameraXError4.getMessage(), cameraXError4.getDetails());
                                } else {
                                    g4 = scc.g(th4.getClass().getSimpleName(), th4.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            ce5Var.a(g4);
                            return;
                        default:
                            List list2 = (List) obj2;
                            g gVar4 = (g) list2.get(0);
                            String str = (String) list2.get(1);
                            try {
                                v83Var2.getClass();
                                try {
                                    g5 = Collections.singletonList(new b((Context) v83Var2.a.A, gVar4, new gym(new File(str)).j()));
                                } catch (NullPointerException | SecurityException e2) {
                                    throw new RuntimeException(e2);
                                }
                            } catch (Throwable th5) {
                                if (th5 instanceof CameraXError) {
                                    CameraXError cameraXError5 = th5;
                                    g5 = scc.g(cameraXError5.getCode(), cameraXError5.getMessage(), cameraXError5.getDetails());
                                } else {
                                    g5 = scc.g(th5.getClass().getSimpleName(), th5.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            ce5Var.a(g5);
                            return;
                    }
                }
            });
        } else {
            m2vVar.G(null);
        }
        m2v m2vVar2 = new m2v(tt5Var, "dev.flutter.pigeon.camera_android_camerax.Recorder.getAspectRatio", j, obj);
        if (v83Var != null) {
            final int i2 = 1;
            m2vVar2.G(new ee5() { // from class: usb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    List g5;
                    int i22 = i2;
                    v83 v83Var2 = v83Var;
                    switch (i22) {
                        case 0:
                            List list = (List) obj2;
                            try {
                                ((w4u) v83Var2.a.w).j(((Long) list.get(0)).longValue(), v83.c((Long) list.get(1), (Long) list.get(2), (qgg0) list.get(3)));
                                g = Collections.singletonList(null);
                            } catch (Throwable th) {
                                if (th instanceof CameraXError) {
                                    CameraXError cameraXError = th;
                                    g = scc.g(cameraXError.getCode(), cameraXError.getMessage(), cameraXError.getDetails());
                                } else {
                                    g = scc.g(th.getClass().getSimpleName(), th.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                                }
                            }
                            ce5Var.a(g);
                            return;
                        case 1:
                            g gVar = (g) ((List) obj2).get(0);
                            try {
                                v83Var2.getClass();
                                g2 = Collections.singletonList(Long.valueOf(((k74) g.l(gVar.E)).a.d));
                            } catch (Throwable th2) {
                                if (th2 instanceof CameraXError) {
                                    CameraXError cameraXError2 = th2;
                                    g2 = scc.g(cameraXError2.getCode(), cameraXError2.getMessage(), cameraXError2.getDetails());
                                } else {
                                    g2 = scc.g(th2.getClass().getSimpleName(), th2.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            ce5Var.a(g2);
                            return;
                        case 2:
                            g gVar2 = (g) ((List) obj2).get(0);
                            try {
                                v83Var2.getClass();
                                g3 = Collections.singletonList(Long.valueOf(((Integer) ((k74) g.l(gVar2.E)).a.c.getLower()).intValue()));
                            } catch (Throwable th3) {
                                if (th3 instanceof CameraXError) {
                                    CameraXError cameraXError3 = th3;
                                    g3 = scc.g(cameraXError3.getCode(), cameraXError3.getMessage(), cameraXError3.getDetails());
                                } else {
                                    g3 = scc.g(th3.getClass().getSimpleName(), th3.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            ce5Var.a(g3);
                            return;
                        case 3:
                            g gVar3 = (g) ((List) obj2).get(0);
                            try {
                                v83Var2.getClass();
                                g4 = Collections.singletonList(((k74) g.l(gVar3.E)).a.a);
                            } catch (Throwable th4) {
                                if (th4 instanceof CameraXError) {
                                    CameraXError cameraXError4 = th4;
                                    g4 = scc.g(cameraXError4.getCode(), cameraXError4.getMessage(), cameraXError4.getDetails());
                                } else {
                                    g4 = scc.g(th4.getClass().getSimpleName(), th4.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            ce5Var.a(g4);
                            return;
                        default:
                            List list2 = (List) obj2;
                            g gVar4 = (g) list2.get(0);
                            String str = (String) list2.get(1);
                            try {
                                v83Var2.getClass();
                                try {
                                    g5 = Collections.singletonList(new b((Context) v83Var2.a.A, gVar4, new gym(new File(str)).j()));
                                } catch (NullPointerException | SecurityException e2) {
                                    throw new RuntimeException(e2);
                                }
                            } catch (Throwable th5) {
                                if (th5 instanceof CameraXError) {
                                    CameraXError cameraXError5 = th5;
                                    g5 = scc.g(cameraXError5.getCode(), cameraXError5.getMessage(), cameraXError5.getDetails());
                                } else {
                                    g5 = scc.g(th5.getClass().getSimpleName(), th5.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            ce5Var.a(g5);
                            return;
                    }
                }
            });
        } else {
            m2vVar2.G(null);
        }
        m2v m2vVar3 = new m2v(tt5Var, "dev.flutter.pigeon.camera_android_camerax.Recorder.getTargetVideoEncodingBitRate", j, obj);
        if (v83Var != null) {
            final int i3 = 2;
            m2vVar3.G(new ee5() { // from class: usb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    List g5;
                    int i22 = i3;
                    v83 v83Var2 = v83Var;
                    switch (i22) {
                        case 0:
                            List list = (List) obj2;
                            try {
                                ((w4u) v83Var2.a.w).j(((Long) list.get(0)).longValue(), v83.c((Long) list.get(1), (Long) list.get(2), (qgg0) list.get(3)));
                                g = Collections.singletonList(null);
                            } catch (Throwable th) {
                                if (th instanceof CameraXError) {
                                    CameraXError cameraXError = th;
                                    g = scc.g(cameraXError.getCode(), cameraXError.getMessage(), cameraXError.getDetails());
                                } else {
                                    g = scc.g(th.getClass().getSimpleName(), th.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                                }
                            }
                            ce5Var.a(g);
                            return;
                        case 1:
                            g gVar = (g) ((List) obj2).get(0);
                            try {
                                v83Var2.getClass();
                                g2 = Collections.singletonList(Long.valueOf(((k74) g.l(gVar.E)).a.d));
                            } catch (Throwable th2) {
                                if (th2 instanceof CameraXError) {
                                    CameraXError cameraXError2 = th2;
                                    g2 = scc.g(cameraXError2.getCode(), cameraXError2.getMessage(), cameraXError2.getDetails());
                                } else {
                                    g2 = scc.g(th2.getClass().getSimpleName(), th2.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            ce5Var.a(g2);
                            return;
                        case 2:
                            g gVar2 = (g) ((List) obj2).get(0);
                            try {
                                v83Var2.getClass();
                                g3 = Collections.singletonList(Long.valueOf(((Integer) ((k74) g.l(gVar2.E)).a.c.getLower()).intValue()));
                            } catch (Throwable th3) {
                                if (th3 instanceof CameraXError) {
                                    CameraXError cameraXError3 = th3;
                                    g3 = scc.g(cameraXError3.getCode(), cameraXError3.getMessage(), cameraXError3.getDetails());
                                } else {
                                    g3 = scc.g(th3.getClass().getSimpleName(), th3.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            ce5Var.a(g3);
                            return;
                        case 3:
                            g gVar3 = (g) ((List) obj2).get(0);
                            try {
                                v83Var2.getClass();
                                g4 = Collections.singletonList(((k74) g.l(gVar3.E)).a.a);
                            } catch (Throwable th4) {
                                if (th4 instanceof CameraXError) {
                                    CameraXError cameraXError4 = th4;
                                    g4 = scc.g(cameraXError4.getCode(), cameraXError4.getMessage(), cameraXError4.getDetails());
                                } else {
                                    g4 = scc.g(th4.getClass().getSimpleName(), th4.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            ce5Var.a(g4);
                            return;
                        default:
                            List list2 = (List) obj2;
                            g gVar4 = (g) list2.get(0);
                            String str = (String) list2.get(1);
                            try {
                                v83Var2.getClass();
                                try {
                                    g5 = Collections.singletonList(new b((Context) v83Var2.a.A, gVar4, new gym(new File(str)).j()));
                                } catch (NullPointerException | SecurityException e2) {
                                    throw new RuntimeException(e2);
                                }
                            } catch (Throwable th5) {
                                if (th5 instanceof CameraXError) {
                                    CameraXError cameraXError5 = th5;
                                    g5 = scc.g(cameraXError5.getCode(), cameraXError5.getMessage(), cameraXError5.getDetails());
                                } else {
                                    g5 = scc.g(th5.getClass().getSimpleName(), th5.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            ce5Var.a(g5);
                            return;
                    }
                }
            });
        } else {
            m2vVar3.G(null);
        }
        m2v m2vVar4 = new m2v(tt5Var, "dev.flutter.pigeon.camera_android_camerax.Recorder.getQualitySelector", j, obj);
        if (v83Var != null) {
            final int i4 = 3;
            m2vVar4.G(new ee5() { // from class: usb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    List g5;
                    int i22 = i4;
                    v83 v83Var2 = v83Var;
                    switch (i22) {
                        case 0:
                            List list = (List) obj2;
                            try {
                                ((w4u) v83Var2.a.w).j(((Long) list.get(0)).longValue(), v83.c((Long) list.get(1), (Long) list.get(2), (qgg0) list.get(3)));
                                g = Collections.singletonList(null);
                            } catch (Throwable th) {
                                if (th instanceof CameraXError) {
                                    CameraXError cameraXError = th;
                                    g = scc.g(cameraXError.getCode(), cameraXError.getMessage(), cameraXError.getDetails());
                                } else {
                                    g = scc.g(th.getClass().getSimpleName(), th.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                                }
                            }
                            ce5Var.a(g);
                            return;
                        case 1:
                            g gVar = (g) ((List) obj2).get(0);
                            try {
                                v83Var2.getClass();
                                g2 = Collections.singletonList(Long.valueOf(((k74) g.l(gVar.E)).a.d));
                            } catch (Throwable th2) {
                                if (th2 instanceof CameraXError) {
                                    CameraXError cameraXError2 = th2;
                                    g2 = scc.g(cameraXError2.getCode(), cameraXError2.getMessage(), cameraXError2.getDetails());
                                } else {
                                    g2 = scc.g(th2.getClass().getSimpleName(), th2.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            ce5Var.a(g2);
                            return;
                        case 2:
                            g gVar2 = (g) ((List) obj2).get(0);
                            try {
                                v83Var2.getClass();
                                g3 = Collections.singletonList(Long.valueOf(((Integer) ((k74) g.l(gVar2.E)).a.c.getLower()).intValue()));
                            } catch (Throwable th3) {
                                if (th3 instanceof CameraXError) {
                                    CameraXError cameraXError3 = th3;
                                    g3 = scc.g(cameraXError3.getCode(), cameraXError3.getMessage(), cameraXError3.getDetails());
                                } else {
                                    g3 = scc.g(th3.getClass().getSimpleName(), th3.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            ce5Var.a(g3);
                            return;
                        case 3:
                            g gVar3 = (g) ((List) obj2).get(0);
                            try {
                                v83Var2.getClass();
                                g4 = Collections.singletonList(((k74) g.l(gVar3.E)).a.a);
                            } catch (Throwable th4) {
                                if (th4 instanceof CameraXError) {
                                    CameraXError cameraXError4 = th4;
                                    g4 = scc.g(cameraXError4.getCode(), cameraXError4.getMessage(), cameraXError4.getDetails());
                                } else {
                                    g4 = scc.g(th4.getClass().getSimpleName(), th4.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            ce5Var.a(g4);
                            return;
                        default:
                            List list2 = (List) obj2;
                            g gVar4 = (g) list2.get(0);
                            String str = (String) list2.get(1);
                            try {
                                v83Var2.getClass();
                                try {
                                    g5 = Collections.singletonList(new b((Context) v83Var2.a.A, gVar4, new gym(new File(str)).j()));
                                } catch (NullPointerException | SecurityException e2) {
                                    throw new RuntimeException(e2);
                                }
                            } catch (Throwable th5) {
                                if (th5 instanceof CameraXError) {
                                    CameraXError cameraXError5 = th5;
                                    g5 = scc.g(cameraXError5.getCode(), cameraXError5.getMessage(), cameraXError5.getDetails());
                                } else {
                                    g5 = scc.g(th5.getClass().getSimpleName(), th5.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            ce5Var.a(g5);
                            return;
                    }
                }
            });
        } else {
            m2vVar4.G(null);
        }
        m2v m2vVar5 = new m2v(tt5Var, "dev.flutter.pigeon.camera_android_camerax.Recorder.prepareRecording", j, obj);
        if (v83Var == null) {
            m2vVar5.G(null);
        } else {
            final int i5 = 4;
            m2vVar5.G(new ee5() { // from class: usb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    List g5;
                    int i22 = i5;
                    v83 v83Var2 = v83Var;
                    switch (i22) {
                        case 0:
                            List list = (List) obj2;
                            try {
                                ((w4u) v83Var2.a.w).j(((Long) list.get(0)).longValue(), v83.c((Long) list.get(1), (Long) list.get(2), (qgg0) list.get(3)));
                                g = Collections.singletonList(null);
                            } catch (Throwable th) {
                                if (th instanceof CameraXError) {
                                    CameraXError cameraXError = th;
                                    g = scc.g(cameraXError.getCode(), cameraXError.getMessage(), cameraXError.getDetails());
                                } else {
                                    g = scc.g(th.getClass().getSimpleName(), th.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                                }
                            }
                            ce5Var.a(g);
                            return;
                        case 1:
                            g gVar = (g) ((List) obj2).get(0);
                            try {
                                v83Var2.getClass();
                                g2 = Collections.singletonList(Long.valueOf(((k74) g.l(gVar.E)).a.d));
                            } catch (Throwable th2) {
                                if (th2 instanceof CameraXError) {
                                    CameraXError cameraXError2 = th2;
                                    g2 = scc.g(cameraXError2.getCode(), cameraXError2.getMessage(), cameraXError2.getDetails());
                                } else {
                                    g2 = scc.g(th2.getClass().getSimpleName(), th2.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            ce5Var.a(g2);
                            return;
                        case 2:
                            g gVar2 = (g) ((List) obj2).get(0);
                            try {
                                v83Var2.getClass();
                                g3 = Collections.singletonList(Long.valueOf(((Integer) ((k74) g.l(gVar2.E)).a.c.getLower()).intValue()));
                            } catch (Throwable th3) {
                                if (th3 instanceof CameraXError) {
                                    CameraXError cameraXError3 = th3;
                                    g3 = scc.g(cameraXError3.getCode(), cameraXError3.getMessage(), cameraXError3.getDetails());
                                } else {
                                    g3 = scc.g(th3.getClass().getSimpleName(), th3.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            ce5Var.a(g3);
                            return;
                        case 3:
                            g gVar3 = (g) ((List) obj2).get(0);
                            try {
                                v83Var2.getClass();
                                g4 = Collections.singletonList(((k74) g.l(gVar3.E)).a.a);
                            } catch (Throwable th4) {
                                if (th4 instanceof CameraXError) {
                                    CameraXError cameraXError4 = th4;
                                    g4 = scc.g(cameraXError4.getCode(), cameraXError4.getMessage(), cameraXError4.getDetails());
                                } else {
                                    g4 = scc.g(th4.getClass().getSimpleName(), th4.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            ce5Var.a(g4);
                            return;
                        default:
                            List list2 = (List) obj2;
                            g gVar4 = (g) list2.get(0);
                            String str = (String) list2.get(1);
                            try {
                                v83Var2.getClass();
                                try {
                                    g5 = Collections.singletonList(new b((Context) v83Var2.a.A, gVar4, new gym(new File(str)).j()));
                                } catch (NullPointerException | SecurityException e2) {
                                    throw new RuntimeException(e2);
                                }
                            } catch (Throwable th5) {
                                if (th5 instanceof CameraXError) {
                                    CameraXError cameraXError5 = th5;
                                    g5 = scc.g(cameraXError5.getCode(), cameraXError5.getMessage(), cameraXError5.getDetails());
                                } else {
                                    g5 = scc.g(th5.getClass().getSimpleName(), th5.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            ce5Var.a(g5);
                            return;
                    }
                }
            });
        }
    }
}
