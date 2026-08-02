package yads;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import com.vungle.ads.internal.protos.Sdk;
import ru.ok.proto.rtmp.amf.AmfConstants;

/* loaded from: classes10.dex */
public final class ol0 {
    public static final byte[] h = {0, 7, 8, AmfConstants.TYPE_XML_DOCUMENT_MARKER};
    public static final byte[] i = {0, 119, -120, -1};
    public static final byte[] j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    public final Paint a;
    public final Paint b;
    public final Canvas c;
    public final hl0 d;
    public final gl0 e;
    public final nl0 f;
    public Bitmap g;

    public ol0(int i2, int i3) {
        Paint paint = new Paint();
        this.a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.c = new Canvas();
        this.d = new hl0(719, 575, 0, 719, 0, 575);
        this.e = new gl0(0, a(), b(), c());
        this.f = new nl0(i2, i3);
    }

    public static int a(int i2, int i3, int i4, int i5) {
        return (i2 << 24) | (i3 << 16) | (i4 << 8) | i5;
    }

    public static int[] b() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i2 = 1; i2 < 16; i2++) {
            if (i2 < 8) {
                iArr[i2] = a(255, (i2 & 1) != 0 ? 255 : 0, (i2 & 2) != 0 ? 255 : 0, (i2 & 4) != 0 ? 255 : 0);
            } else {
                iArr[i2] = a(255, (i2 & 1) != 0 ? 127 : 0, (i2 & 2) != 0 ? 127 : 0, (i2 & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    public static int[] c() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            if (i2 < 8) {
                iArr[i2] = a(63, (i2 & 1) != 0 ? 255 : 0, (i2 & 2) != 0 ? 255 : 0, (i2 & 4) == 0 ? 0 : 255);
            } else {
                int i3 = i2 & Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE;
                if (i3 == 0) {
                    iArr[i2] = a(255, ((i2 & 1) != 0 ? 85 : 0) + ((i2 & 16) != 0 ? 170 : 0), ((i2 & 2) != 0 ? 85 : 0) + ((i2 & 32) != 0 ? 170 : 0), ((i2 & 4) == 0 ? 0 : 85) + ((i2 & 64) == 0 ? 0 : 170));
                } else if (i3 == 8) {
                    iArr[i2] = a(127, ((i2 & 1) != 0 ? 85 : 0) + ((i2 & 16) != 0 ? 170 : 0), ((i2 & 2) != 0 ? 85 : 0) + ((i2 & 32) != 0 ? 170 : 0), ((i2 & 4) == 0 ? 0 : 85) + ((i2 & 64) == 0 ? 0 : 170));
                } else if (i3 == 128) {
                    iArr[i2] = a(255, ((i2 & 1) != 0 ? 43 : 0) + 127 + ((i2 & 16) != 0 ? 85 : 0), ((i2 & 2) != 0 ? 43 : 0) + 127 + ((i2 & 32) != 0 ? 85 : 0), ((i2 & 4) == 0 ? 0 : 43) + 127 + ((i2 & 64) == 0 ? 0 : 85));
                } else if (i3 == 136) {
                    iArr[i2] = a(255, ((i2 & 1) != 0 ? 43 : 0) + ((i2 & 16) != 0 ? 85 : 0), ((i2 & 2) != 0 ? 43 : 0) + ((i2 & 32) != 0 ? 85 : 0), ((i2 & 4) == 0 ? 0 : 43) + ((i2 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    public static int[] a() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01ec A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0225 A[LOOP:3: B:87:0x0184->B:98:0x0225, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0211 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v17, types: [int] */
    /* JADX WARN: Type inference failed for: r3v23, types: [int] */
    /* JADX WARN: Type inference failed for: r3v34, types: [int] */
    /* JADX WARN: Type inference failed for: r3v8, types: [int] */
    /* JADX WARN: Type inference failed for: r6v1, types: [int] */
    /* JADX WARN: Type inference failed for: r6v4, types: [int] */
    /* JADX WARN: Type inference failed for: r6v5, types: [int] */
    /* JADX WARN: Type inference failed for: r6v7, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(byte[] bArr, int[] iArr, int i2, int i3, int i4, Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        boolean z;
        ?? a;
        char c;
        boolean z2;
        byte b;
        int i5;
        int a2;
        byte b2;
        int i6;
        byte b3;
        byte[] bArr4;
        int i7;
        int a3;
        boolean z3;
        byte b4;
        byte b5;
        int i8;
        int i9;
        int i10;
        int a4;
        int i11;
        Paint paint2 = paint;
        jc2 jc2Var = new jc2(bArr.length, bArr);
        int i12 = i3;
        int i13 = i4;
        byte[] bArr5 = null;
        byte[] bArr6 = null;
        byte[] bArr7 = null;
        while (jc2Var.b() != 0) {
            int a5 = jc2Var.a(8);
            if (a5 != 240) {
                int i14 = 4;
                int i15 = 2;
                int i16 = 0;
                int i17 = 1;
                switch (a5) {
                    case 16:
                        if (i2 != 3) {
                            if (i2 != 2) {
                                bArr2 = null;
                            } else if (bArr7 == null) {
                                bArr3 = h;
                                bArr2 = bArr3;
                            } else {
                                bArr2 = bArr7;
                            }
                            z = false;
                            while (true) {
                                a = jc2Var.a(2);
                                if (a != 0) {
                                }
                                z2 = z;
                                b = b3;
                                c = 4;
                                if (i5 != 0) {
                                }
                                i6 = i12;
                                i12 = i6 + i5;
                                if (!z2) {
                                }
                                paint2 = paint;
                                z = z2;
                            }
                        } else if (bArr5 == null) {
                            bArr3 = i;
                            bArr2 = bArr3;
                            z = false;
                            while (true) {
                                a = jc2Var.a(2);
                                if (a != 0) {
                                    i5 = 1;
                                    b3 = a;
                                } else {
                                    if (jc2Var.e()) {
                                        a2 = jc2Var.a(3) + 3;
                                        b2 = jc2Var.a(2);
                                    } else {
                                        if (jc2Var.e()) {
                                            i5 = 1;
                                            z2 = z;
                                            c = 4;
                                        } else {
                                            int a6 = jc2Var.a(2);
                                            if (a6 == 0) {
                                                c = 4;
                                                z2 = true;
                                            } else if (a6 == 1) {
                                                c = 4;
                                                z2 = z;
                                                i5 = 2;
                                            } else if (a6 == 2) {
                                                c = 4;
                                                i5 = jc2Var.a(4) + 12;
                                                z2 = z;
                                                b = jc2Var.a(2);
                                                if (i5 != 0 || paint2 == null) {
                                                    i6 = i12;
                                                } else {
                                                    if (bArr2 != null) {
                                                        b = bArr2[b];
                                                    }
                                                    paint2.setColor(iArr[b]);
                                                    i6 = i12;
                                                    canvas.drawRect(i12, i13, i12 + i5, i13 + 1, paint2);
                                                }
                                                i12 = i6 + i5;
                                                if (!z2) {
                                                    if (jc2Var.c != 0) {
                                                        jc2Var.c = 0;
                                                        jc2Var.b++;
                                                        jc2Var.a();
                                                        break;
                                                    }
                                                } else {
                                                    paint2 = paint;
                                                    z = z2;
                                                }
                                            } else if (a6 != 3) {
                                                z2 = z;
                                                c = 4;
                                            } else {
                                                a2 = jc2Var.a(8) + 29;
                                                b2 = jc2Var.a(2);
                                            }
                                            b = 0;
                                            i5 = 0;
                                            if (i5 != 0) {
                                            }
                                            i6 = i12;
                                            i12 = i6 + i5;
                                            if (!z2) {
                                            }
                                        }
                                        b = 0;
                                        if (i5 != 0) {
                                        }
                                        i6 = i12;
                                        i12 = i6 + i5;
                                        if (!z2) {
                                        }
                                    }
                                    i5 = a2;
                                    b3 = b2;
                                }
                                z2 = z;
                                b = b3;
                                c = 4;
                                if (i5 != 0) {
                                }
                                i6 = i12;
                                i12 = i6 + i5;
                                if (!z2) {
                                }
                            }
                        } else {
                            bArr2 = bArr5;
                            z = false;
                            while (true) {
                                a = jc2Var.a(2);
                                if (a != 0) {
                                }
                                z2 = z;
                                b = b3;
                                c = 4;
                                if (i5 != 0) {
                                }
                                i6 = i12;
                                i12 = i6 + i5;
                                if (!z2) {
                                }
                                paint2 = paint;
                                z = z2;
                            }
                        }
                        break;
                    case 17:
                        if (i2 == 3) {
                            bArr4 = bArr6 == null ? j : bArr6;
                        } else {
                            bArr4 = null;
                        }
                        boolean z4 = false;
                        while (true) {
                            ?? a7 = jc2Var.a(i14);
                            if (a7 != 0) {
                                i7 = 1;
                                z3 = z4;
                                b5 = a7;
                            } else if (!jc2Var.e()) {
                                int a8 = jc2Var.a(3);
                                if (a8 != 0) {
                                    i7 = a8 + 2;
                                    z3 = z4;
                                    b5 = 0;
                                } else {
                                    z3 = true;
                                    b5 = 0;
                                    i7 = 0;
                                }
                            } else {
                                if (!jc2Var.e()) {
                                    a3 = jc2Var.a(i15) + i14;
                                    b4 = jc2Var.a(i14);
                                } else {
                                    int a9 = jc2Var.a(i15);
                                    if (a9 == 0) {
                                        i7 = 1;
                                    } else if (a9 == 1) {
                                        i7 = i15;
                                    } else if (a9 == i15) {
                                        a3 = jc2Var.a(i14) + 9;
                                        b4 = jc2Var.a(i14);
                                    } else if (a9 != 3) {
                                        z3 = z4;
                                        b5 = 0;
                                        i7 = 0;
                                    } else {
                                        a3 = jc2Var.a(8) + 25;
                                        b4 = jc2Var.a(i14);
                                    }
                                    z3 = z4;
                                    b5 = 0;
                                }
                                i7 = a3;
                                z3 = z4;
                                b5 = b4;
                            }
                            if (i7 == 0 || paint2 == null) {
                                i8 = i12;
                                i9 = i15;
                            } else {
                                if (bArr4 != null) {
                                    b5 = bArr4[b5];
                                }
                                paint2.setColor(iArr[b5]);
                                i8 = i12;
                                i9 = 2;
                                canvas.drawRect(i12, i13, i12 + i7, i13 + 1, paint2);
                            }
                            i12 = i8 + i7;
                            if (!z3) {
                                i15 = i9;
                                z4 = z3;
                                i14 = 4;
                            } else if (jc2Var.c != 0) {
                                jc2Var.c = 0;
                                jc2Var.b++;
                                jc2Var.a();
                                break;
                            } else {
                                continue;
                            }
                        }
                    case 18:
                        int i18 = i12;
                        int i19 = 0;
                        while (true) {
                            int a10 = jc2Var.a(8);
                            if (a10 != 0) {
                                i10 = i19;
                                a4 = i17;
                            } else if (!jc2Var.e()) {
                                int a11 = jc2Var.a(7);
                                if (a11 != 0) {
                                    i10 = i19;
                                    a4 = a11;
                                    a10 = i16;
                                } else {
                                    a10 = i16;
                                    a4 = a10;
                                    i10 = i17;
                                }
                            } else {
                                i10 = i19;
                                a4 = jc2Var.a(7);
                                a10 = jc2Var.a(8);
                            }
                            if (a4 == 0 || paint2 == null) {
                                i11 = i17;
                            } else {
                                paint2.setColor(iArr[a10]);
                                i11 = i17;
                                canvas.drawRect(i18, i13, i18 + a4, i13 + 1, paint2);
                            }
                            i18 += a4;
                            if (i10 != 0) {
                                i12 = i18;
                                continue;
                            } else {
                                i17 = i11;
                                i19 = i10;
                                i16 = 0;
                            }
                        }
                    default:
                        switch (a5) {
                            case 32:
                                bArr7 = new byte[4];
                                while (i16 < 4) {
                                    bArr7[i16] = (byte) jc2Var.a(4);
                                    i16++;
                                }
                                break;
                            case 33:
                                bArr5 = new byte[4];
                                while (i16 < 4) {
                                    bArr5[i16] = (byte) jc2Var.a(8);
                                    i16++;
                                }
                                break;
                            case 34:
                                bArr6 = new byte[16];
                                while (i16 < 16) {
                                    bArr6[i16] = (byte) jc2Var.a(8);
                                    i16++;
                                }
                                break;
                            default:
                                continue;
                        }
                }
            } else {
                i13 += 2;
                i12 = i3;
            }
            paint2 = paint;
        }
    }

    public static gl0 a(jc2 jc2Var, int i2) {
        int a;
        int i3;
        int a2;
        int i4;
        int i5;
        int i6 = 8;
        int a3 = jc2Var.a(8);
        jc2Var.c(8);
        int i7 = 2;
        int i8 = i2 - 2;
        int[] a4 = a();
        int[] b = b();
        int[] c = c();
        while (i8 > 0) {
            int a5 = jc2Var.a(i6);
            int a6 = jc2Var.a(i6);
            int[] iArr = (a6 & 128) != 0 ? a4 : (a6 & 64) != 0 ? b : c;
            if ((a6 & 1) != 0) {
                i4 = jc2Var.a(i6);
                i5 = jc2Var.a(i6);
                a = jc2Var.a(i6);
                a2 = jc2Var.a(i6);
                i3 = i8 - 6;
            } else {
                int a7 = jc2Var.a(6) << i7;
                int a8 = jc2Var.a(4) << 4;
                a = jc2Var.a(4) << 4;
                i3 = i8 - 4;
                a2 = jc2Var.a(i7) << 6;
                i4 = a7;
                i5 = a8;
            }
            if (i4 == 0) {
                a2 = 255;
                i5 = 0;
                a = 0;
            }
            double d = i4;
            int i9 = a3;
            double d2 = i5 - 128;
            int i10 = (int) ((1.402d * d2) + d);
            double d3 = a - 128;
            int i11 = (int) ((d - (0.34414d * d3)) - (d2 * 0.71414d));
            int i12 = (int) ((d3 * 1.772d) + d);
            int i13 = mc3.a;
            iArr[a5] = a((byte) (255 - (a2 & 255)), Math.max(0, Math.min(i10, 255)), Math.max(0, Math.min(i11, 255)), Math.max(0, Math.min(i12, 255)));
            i8 = i3;
            a3 = i9;
            i6 = 8;
            i7 = 2;
        }
        return new gl0(a3, a4, b, c);
    }

    public static il0 a(jc2 jc2Var) {
        byte[] bArr;
        int a = jc2Var.a(16);
        jc2Var.c(4);
        int a2 = jc2Var.a(2);
        boolean e = jc2Var.e();
        jc2Var.c(1);
        byte[] bArr2 = mc3.f;
        if (a2 == 1) {
            jc2Var.c(jc2Var.a(8) * 16);
        } else if (a2 == 0) {
            int a3 = jc2Var.a(16);
            int a4 = jc2Var.a(16);
            if (a3 > 0) {
                bArr2 = new byte[a3];
                if (jc2Var.c == 0) {
                    System.arraycopy(jc2Var.a, jc2Var.b, bArr2, 0, a3);
                    jc2Var.b += a3;
                    jc2Var.a();
                } else {
                    throw new IllegalStateException();
                }
            }
            if (a4 > 0) {
                bArr = new byte[a4];
                if (jc2Var.c == 0) {
                    System.arraycopy(jc2Var.a, jc2Var.b, bArr, 0, a4);
                    jc2Var.b += a4;
                    jc2Var.a();
                    return new il0(a, e, bArr2, bArr);
                }
                throw new IllegalStateException();
            }
        }
        bArr = bArr2;
        return new il0(a, e, bArr2, bArr);
    }
}
