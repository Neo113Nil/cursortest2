package xsna;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.common.collect.ImmutableList;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.List;
import ru.ok.proto.rtmp.amf.AmfConstants;
import xsna.a1n0;
import xsna.rkk;

/* compiled from: DvbParser.java */
/* loaded from: classes12.dex */
public final class poo implements a1n0 {
    public static final byte[] h = {0, 7, 8, AmfConstants.TYPE_XML_DOCUMENT_MARKER};
    public static final byte[] i = {0, 119, -120, -1};
    public static final byte[] j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    public final Paint a;
    public final Paint b;
    public final Canvas c;
    public final b d;
    public final a e;
    public final h f;
    public Bitmap g;

    /* compiled from: DvbParser.java */
    public static final class a {
        public final int a;
        public final int[] b;
        public final int[] c;
        public final int[] d;

        public a(int i, int[] iArr, int[] iArr2, int[] iArr3) {
            this.a = i;
            this.b = iArr;
            this.c = iArr2;
            this.d = iArr3;
        }
    }

    /* compiled from: DvbParser.java */
    public static final class b {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;

        public b(int i, int i2, int i3, int i4, int i5, int i6) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = i5;
            this.f = i6;
        }
    }

    /* compiled from: DvbParser.java */
    public static final class c {
        public final int a;
        public final boolean b;
        public final byte[] c;
        public final byte[] d;

        public c(int i, boolean z, byte[] bArr, byte[] bArr2) {
            this.a = i;
            this.b = z;
            this.c = bArr;
            this.d = bArr2;
        }
    }

    /* compiled from: DvbParser.java */
    public static final class d {
        public final int a;
        public final int b;
        public final SparseArray<e> c;

        public d(int i, int i2, SparseArray sparseArray) {
            this.a = i;
            this.b = i2;
            this.c = sparseArray;
        }
    }

    /* compiled from: DvbParser.java */
    public static final class e {
        public final int a;
        public final int b;

        public e(int i, int i2) {
            this.a = i;
            this.b = i2;
        }
    }

    /* compiled from: DvbParser.java */
    public static final class f {
        public final int a;
        public final boolean b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;
        public final int h;
        public final int i;
        public final SparseArray<g> j;

        public f(int i, boolean z, int i2, int i3, int i4, int i5, int i6, int i7, int i8, SparseArray sparseArray) {
            this.a = i;
            this.b = z;
            this.c = i2;
            this.d = i3;
            this.e = i4;
            this.f = i5;
            this.g = i6;
            this.h = i7;
            this.i = i8;
            this.j = sparseArray;
        }
    }

    /* compiled from: DvbParser.java */
    public static final class g {
        public final int a;
        public final int b;

        public g(int i, int i2) {
            this.a = i;
            this.b = i2;
        }
    }

    /* compiled from: DvbParser.java */
    public static final class h {
        public final int a;
        public final int b;
        public final SparseArray<f> c = new SparseArray<>();
        public final SparseArray<a> d = new SparseArray<>();
        public final SparseArray<c> e = new SparseArray<>();
        public final SparseArray<a> f = new SparseArray<>();
        public final SparseArray<c> g = new SparseArray<>();

        @Nullable
        public b h;

        @Nullable
        public d i;

        public h(int i, int i2) {
            this.a = i;
            this.b = i2;
        }
    }

    public poo(List<byte[]> list) {
        xi90 xi90Var = new xi90(list.get(0));
        int J = xi90Var.J();
        int J2 = xi90Var.J();
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
        this.d = new b(719, 575, 0, 719, 0, 575);
        this.e = new a(0, new int[]{0, -1, -16777216, -8421505}, e(), f());
        this.f = new h(J, J2);
    }

    public static byte[] d(int i2, int i3, wi90 wi90Var) {
        byte[] bArr = new byte[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            bArr[i4] = (byte) wi90Var.g(i3);
        }
        return bArr;
    }

    public static int[] e() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i2 = 1; i2 < 16; i2++) {
            if (i2 < 8) {
                iArr[i2] = g(255, (i2 & 1) != 0 ? 255 : 0, (i2 & 2) != 0 ? 255 : 0, (i2 & 4) != 0 ? 255 : 0);
            } else {
                iArr[i2] = g(255, (i2 & 1) != 0 ? 127 : 0, (i2 & 2) != 0 ? 127 : 0, (i2 & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    public static int[] f() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            if (i2 < 8) {
                iArr[i2] = g(63, (i2 & 1) != 0 ? 255 : 0, (i2 & 2) != 0 ? 255 : 0, (i2 & 4) == 0 ? 0 : 255);
            } else {
                int i3 = i2 & Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE;
                if (i3 == 0) {
                    iArr[i2] = g(255, ((i2 & 1) != 0 ? 85 : 0) + ((i2 & 16) != 0 ? 170 : 0), ((i2 & 2) != 0 ? 85 : 0) + ((i2 & 32) != 0 ? 170 : 0), ((i2 & 4) == 0 ? 0 : 85) + ((i2 & 64) == 0 ? 0 : 170));
                } else if (i3 == 8) {
                    iArr[i2] = g(127, ((i2 & 1) != 0 ? 85 : 0) + ((i2 & 16) != 0 ? 170 : 0), ((i2 & 2) != 0 ? 85 : 0) + ((i2 & 32) != 0 ? 170 : 0), ((i2 & 4) == 0 ? 0 : 85) + ((i2 & 64) == 0 ? 0 : 170));
                } else if (i3 == 128) {
                    iArr[i2] = g(255, ((i2 & 1) != 0 ? 43 : 0) + 127 + ((i2 & 16) != 0 ? 85 : 0), ((i2 & 2) != 0 ? 43 : 0) + 127 + ((i2 & 32) != 0 ? 85 : 0), ((i2 & 4) == 0 ? 0 : 43) + 127 + ((i2 & 64) == 0 ? 0 : 85));
                } else if (i3 == 136) {
                    iArr[i2] = g(255, ((i2 & 1) != 0 ? 43 : 0) + ((i2 & 16) != 0 ? 85 : 0), ((i2 & 2) != 0 ? 43 : 0) + ((i2 & 32) != 0 ? 85 : 0), ((i2 & 4) == 0 ? 0 : 43) + ((i2 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    public static int g(int i2, int i3, int i4, int i5) {
        return (i2 << 24) | (i3 << 16) | (i4 << 8) | i5;
    }

    /* JADX WARN: Removed duplicated region for block: B:92:0x01d5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0203 A[LOOP:3: B:86:0x0156->B:98:0x0203, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01ff A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void h(byte[] bArr, int[] iArr, int i2, int i3, int i4, @Nullable Paint paint, Canvas canvas) {
        char c2;
        char c3;
        boolean z;
        int i5;
        int i6;
        int i7;
        byte[] bArr2;
        boolean z2;
        int i8;
        int g2;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z3;
        int g3;
        int i13;
        Paint paint2 = paint;
        wi90 wi90Var = new wi90(bArr, bArr.length);
        int i14 = i3;
        int i15 = i4;
        byte[] bArr3 = null;
        byte[] bArr4 = null;
        byte[] bArr5 = null;
        while (wi90Var.b() != 0) {
            int i16 = 8;
            int g4 = wi90Var.g(8);
            if (g4 != 240) {
                int i17 = 3;
                int i18 = 2;
                int i19 = 4;
                switch (g4) {
                    case 16:
                        byte[] bArr6 = i2 == 3 ? bArr3 == null ? i : bArr3 : i2 == 2 ? bArr5 == null ? h : bArr5 : null;
                        boolean z4 = false;
                        while (true) {
                            int g5 = wi90Var.g(2);
                            if (g5 != 0) {
                                z = z4;
                                i5 = g5;
                                i6 = 1;
                            } else if (wi90Var.f()) {
                                int g6 = wi90Var.g(3) + 3;
                                z = z4;
                                i5 = wi90Var.g(2);
                                i6 = g6;
                            } else {
                                if (wi90Var.f()) {
                                    z = z4;
                                    i6 = 1;
                                    c2 = '\b';
                                    c3 = 4;
                                } else {
                                    int g7 = wi90Var.g(2);
                                    if (g7 == 0) {
                                        c2 = '\b';
                                        c3 = 4;
                                        z = true;
                                    } else if (g7 == 1) {
                                        c2 = '\b';
                                        c3 = 4;
                                        z = z4;
                                        i6 = 2;
                                    } else if (g7 == 2) {
                                        c2 = '\b';
                                        c3 = 4;
                                        i6 = wi90Var.g(4) + 12;
                                        i5 = wi90Var.g(2);
                                        z = z4;
                                        if (i6 != 0) {
                                        }
                                        i7 = i14;
                                        i14 = i7 + i6;
                                        if (z) {
                                        }
                                    } else if (g7 != 3) {
                                        z = z4;
                                        c2 = '\b';
                                        c3 = 4;
                                    } else {
                                        c2 = '\b';
                                        int g8 = wi90Var.g(8) + 29;
                                        i5 = wi90Var.g(2);
                                        z = z4;
                                        i6 = g8;
                                        c3 = 4;
                                        if (i6 != 0 || paint2 == null) {
                                            i7 = i14;
                                        } else {
                                            if (bArr6 != 0) {
                                                i5 = bArr6[i5];
                                            }
                                            paint2.setColor(iArr[i5]);
                                            i7 = i14;
                                            canvas.drawRect(i14, i15, i14 + i6, i15 + 1, paint2);
                                        }
                                        i14 = i7 + i6;
                                        if (z) {
                                            wi90Var.c();
                                            break;
                                        } else {
                                            paint2 = paint;
                                            z4 = z;
                                        }
                                    }
                                    i5 = 0;
                                    i6 = 0;
                                    if (i6 != 0) {
                                    }
                                    i7 = i14;
                                    i14 = i7 + i6;
                                    if (z) {
                                    }
                                }
                                i5 = 0;
                                if (i6 != 0) {
                                }
                                i7 = i14;
                                i14 = i7 + i6;
                                if (z) {
                                }
                            }
                            c2 = '\b';
                            c3 = 4;
                            if (i6 != 0) {
                            }
                            i7 = i14;
                            i14 = i7 + i6;
                            if (z) {
                            }
                        }
                    case 17:
                        if (i2 == 3) {
                            bArr2 = bArr4 == null ? j : bArr4;
                        } else {
                            bArr2 = null;
                        }
                        boolean z5 = false;
                        while (true) {
                            int g9 = wi90Var.g(i19);
                            if (g9 != 0) {
                                z2 = z5;
                                i9 = g9;
                                i8 = 1;
                            } else if (wi90Var.f()) {
                                if (wi90Var.f()) {
                                    int g10 = wi90Var.g(i18);
                                    if (g10 == 0) {
                                        z2 = z5;
                                        i8 = 1;
                                    } else if (g10 != 1) {
                                        if (g10 == i18) {
                                            i8 = wi90Var.g(i19) + 9;
                                            g2 = wi90Var.g(i19);
                                        } else if (g10 != i17) {
                                            z2 = z5;
                                            i8 = 0;
                                        } else {
                                            i8 = wi90Var.g(i16) + 25;
                                            g2 = wi90Var.g(i19);
                                        }
                                        i9 = g2;
                                    } else {
                                        z2 = z5;
                                        i8 = i18;
                                    }
                                    i9 = 0;
                                } else {
                                    i8 = wi90Var.g(i18) + 4;
                                    i9 = wi90Var.g(i19);
                                }
                                z2 = z5;
                            } else {
                                int g11 = wi90Var.g(i17);
                                if (g11 != 0) {
                                    i8 = g11 + 2;
                                    z2 = z5;
                                    i9 = 0;
                                } else {
                                    z2 = true;
                                    i8 = 0;
                                    i9 = 0;
                                }
                            }
                            if (i8 == 0 || paint2 == null) {
                                i10 = i14;
                                i11 = i17;
                                i12 = i18;
                            } else {
                                if (bArr2 != 0) {
                                    i9 = bArr2[i9];
                                }
                                paint2.setColor(iArr[i9]);
                                i11 = i17;
                                i12 = 2;
                                i10 = i14;
                                canvas.drawRect(i14, i15, i14 + i8, i15 + 1, paint2);
                            }
                            i14 = i10 + i8;
                            if (z2) {
                                wi90Var.c();
                                break;
                            } else {
                                z5 = z2;
                                i17 = i11;
                                i18 = i12;
                                i19 = 4;
                                i16 = 8;
                            }
                        }
                    case 18:
                        boolean z6 = false;
                        while (true) {
                            int g12 = wi90Var.g(8);
                            if (g12 != 0) {
                                z3 = z6;
                                g3 = 1;
                            } else if (wi90Var.f()) {
                                z3 = z6;
                                g3 = wi90Var.g(7);
                                g12 = wi90Var.g(8);
                            } else {
                                int g13 = wi90Var.g(7);
                                if (g13 != 0) {
                                    z3 = z6;
                                    g3 = g13;
                                    g12 = 0;
                                } else {
                                    z3 = true;
                                    g12 = 0;
                                    g3 = 0;
                                }
                            }
                            if (g3 == 0 || paint2 == null) {
                                i13 = i14;
                            } else {
                                paint2.setColor(iArr[g12]);
                                i13 = i14;
                                canvas.drawRect(i14, i15, i14 + g3, i15 + 1, paint2);
                            }
                            i14 = i13 + g3;
                            if (z3) {
                                break;
                            } else {
                                z6 = z3;
                            }
                        }
                        break;
                    default:
                        switch (g4) {
                            case 32:
                                bArr5 = d(4, 4, wi90Var);
                                break;
                            case 33:
                                bArr3 = d(4, 8, wi90Var);
                                break;
                            case 34:
                                bArr4 = d(16, 8, wi90Var);
                                break;
                        }
                }
            } else {
                i15 += 2;
                i14 = i3;
            }
            paint2 = paint;
        }
    }

    public static a i(wi90 wi90Var, int i2) {
        int g2;
        int i3;
        int g3;
        int i4;
        int i5;
        int i6 = 8;
        int g4 = wi90Var.g(8);
        wi90Var.o(8);
        int i7 = 2;
        int i8 = i2 - 2;
        int i9 = 0;
        int[] iArr = {0, -1, -16777216, -8421505};
        int[] e2 = e();
        int[] f2 = f();
        while (i8 > 0) {
            int g5 = wi90Var.g(i6);
            int g6 = wi90Var.g(i6);
            int[] iArr2 = (g6 & 128) != 0 ? iArr : (g6 & 64) != 0 ? e2 : f2;
            if ((g6 & 1) != 0) {
                i4 = wi90Var.g(i6);
                i5 = wi90Var.g(i6);
                g2 = wi90Var.g(i6);
                g3 = wi90Var.g(i6);
                i3 = i8 - 6;
            } else {
                int g7 = wi90Var.g(6) << i7;
                int g8 = wi90Var.g(4) << 4;
                g2 = wi90Var.g(4) << 4;
                i3 = i8 - 4;
                g3 = wi90Var.g(i7) << 6;
                i4 = g7;
                i5 = g8;
            }
            if (i4 == 0) {
                i5 = i9;
                g2 = i5;
                g3 = 255;
            }
            double d2 = i4;
            double d3 = i5 - 128;
            double d4 = g2 - 128;
            iArr2[g5] = g((byte) (255 - (g3 & 255)), y2r0.j((int) ((1.402d * d3) + d2), 0, 255), y2r0.j((int) ((d2 - (0.34414d * d4)) - (d3 * 0.71414d)), 0, 255), y2r0.j((int) ((d4 * 1.772d) + d2), 0, 255));
            i8 = i3;
            i9 = 0;
            g4 = g4;
            f2 = f2;
            i6 = 8;
            i7 = 2;
        }
        return new a(g4, iArr, e2, f2);
    }

    public static c j(wi90 wi90Var) {
        byte[] bArr;
        int g2 = wi90Var.g(16);
        wi90Var.o(4);
        int g3 = wi90Var.g(2);
        boolean f2 = wi90Var.f();
        wi90Var.o(1);
        byte[] bArr2 = y2r0.b;
        if (g3 == 1) {
            wi90Var.o(wi90Var.g(8) * 16);
        } else if (g3 == 0) {
            int g4 = wi90Var.g(16);
            int g5 = wi90Var.g(16);
            if (g4 > 0) {
                bArr2 = new byte[g4];
                wi90Var.j(g4, bArr2);
            }
            if (g5 > 0) {
                bArr = new byte[g5];
                wi90Var.j(g5, bArr);
                return new c(g2, f2, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new c(g2, f2, bArr2, bArr);
    }

    @Override // xsna.a1n0
    public final void a(byte[] bArr, int i2, int i3, a1n0.b bVar, j7j<wkk> j7jVar) {
        h hVar;
        boolean z;
        wkk wkkVar;
        char c2;
        char c3;
        char c4;
        int i4;
        b bVar2;
        ArrayList arrayList;
        int i5;
        f fVar;
        int i6;
        int i7;
        int i8;
        h hVar2;
        int i9;
        f fVar2;
        int i10;
        int i11;
        int i12;
        int i13;
        wi90 wi90Var = new wi90(bArr, i2 + i3);
        wi90Var.m(i2);
        while (true) {
            int b2 = wi90Var.b();
            hVar = this.f;
            z = true;
            if (b2 >= 48 && wi90Var.g(8) == 15) {
                int g2 = wi90Var.g(8);
                int g3 = wi90Var.g(16);
                int g4 = wi90Var.g(16);
                int d2 = wi90Var.d() + g4;
                if (g4 * 8 > wi90Var.b()) {
                    ahn.F("Data field length exceeds limit");
                    wi90Var.o(wi90Var.b());
                } else {
                    switch (g2) {
                        case 16:
                            if (g3 == hVar.a) {
                                d dVar = hVar.i;
                                wi90Var.g(8);
                                int g5 = wi90Var.g(4);
                                int g6 = wi90Var.g(2);
                                wi90Var.o(2);
                                int i14 = g4 - 2;
                                SparseArray sparseArray = new SparseArray();
                                while (i14 > 0) {
                                    int g7 = wi90Var.g(8);
                                    wi90Var.o(8);
                                    i14 -= 6;
                                    sparseArray.put(g7, new e(wi90Var.g(16), wi90Var.g(16)));
                                }
                                d dVar2 = new d(g5, g6, sparseArray);
                                if (g6 != 0) {
                                    hVar.i = dVar2;
                                    hVar.c.clear();
                                    hVar.d.clear();
                                    hVar.e.clear();
                                    break;
                                } else if (dVar != null && dVar.a != g5) {
                                    hVar.i = dVar2;
                                    break;
                                }
                            }
                            break;
                        case 17:
                            d dVar3 = hVar.i;
                            SparseArray<f> sparseArray2 = hVar.c;
                            if (g3 == hVar.a && dVar3 != null) {
                                int g8 = wi90Var.g(8);
                                wi90Var.o(4);
                                boolean f2 = wi90Var.f();
                                wi90Var.o(3);
                                int g9 = wi90Var.g(16);
                                int g10 = wi90Var.g(16);
                                wi90Var.g(3);
                                int g11 = wi90Var.g(3);
                                wi90Var.o(2);
                                int g12 = wi90Var.g(8);
                                int g13 = wi90Var.g(8);
                                int g14 = wi90Var.g(4);
                                int g15 = wi90Var.g(2);
                                wi90Var.o(2);
                                int i15 = g4 - 10;
                                SparseArray sparseArray3 = new SparseArray();
                                while (i15 > 0) {
                                    int g16 = wi90Var.g(16);
                                    int g17 = wi90Var.g(2);
                                    wi90Var.g(2);
                                    int g18 = wi90Var.g(12);
                                    wi90Var.o(4);
                                    int g19 = wi90Var.g(12);
                                    int i16 = i15 - 6;
                                    if (g17 == 1 || g17 == 2) {
                                        wi90Var.g(8);
                                        wi90Var.g(8);
                                        i15 -= 8;
                                    } else {
                                        i15 = i16;
                                    }
                                    sparseArray3.put(g16, new g(g18, g19));
                                }
                                f fVar3 = new f(g8, f2, g9, g10, g11, g12, g13, g14, g15, sparseArray3);
                                if (dVar3.b == 0 && (fVar2 = sparseArray2.get(g8)) != null) {
                                    SparseArray<g> sparseArray4 = fVar2.j;
                                    for (int i17 = 0; i17 < sparseArray4.size(); i17++) {
                                        fVar3.j.put(sparseArray4.keyAt(i17), sparseArray4.valueAt(i17));
                                    }
                                }
                                sparseArray2.put(fVar3.a, fVar3);
                                break;
                            }
                            break;
                        case 18:
                            if (g3 == hVar.a) {
                                a i18 = i(wi90Var, g4);
                                hVar.d.put(i18.a, i18);
                                break;
                            } else if (g3 == hVar.b) {
                                a i19 = i(wi90Var, g4);
                                hVar.f.put(i19.a, i19);
                                break;
                            }
                            break;
                        case 19:
                            if (g3 == hVar.a) {
                                c j2 = j(wi90Var);
                                hVar.e.put(j2.a, j2);
                                break;
                            } else if (g3 == hVar.b) {
                                c j3 = j(wi90Var);
                                hVar.g.put(j3.a, j3);
                                break;
                            }
                            break;
                        case 20:
                            if (g3 == hVar.a) {
                                wi90Var.o(4);
                                boolean f3 = wi90Var.f();
                                wi90Var.o(3);
                                int g20 = wi90Var.g(16);
                                int g21 = wi90Var.g(16);
                                if (f3) {
                                    int g22 = wi90Var.g(16);
                                    i10 = wi90Var.g(16);
                                    i13 = wi90Var.g(16);
                                    i11 = wi90Var.g(16);
                                    i12 = g22;
                                } else {
                                    i10 = g20;
                                    i11 = g21;
                                    i12 = 0;
                                    i13 = 0;
                                }
                                hVar.h = new b(g20, g21, i12, i10, i13, i11);
                                break;
                            }
                            break;
                    }
                    wi90Var.p(d2 - wi90Var.d());
                }
            }
        }
        d dVar4 = hVar.i;
        if (dVar4 == null) {
            ImmutableList.b bVar3 = ImmutableList.c;
            wkkVar = new wkk(com.google.common.collect.g.f, C.TIME_UNSET, C.TIME_UNSET);
        } else {
            b bVar4 = hVar.h;
            if (bVar4 == null) {
                bVar4 = this.d;
            }
            Bitmap bitmap = this.g;
            Canvas canvas = this.c;
            if (bitmap == null || bVar4.a + 1 != bitmap.getWidth() || bVar4.b + 1 != this.g.getHeight()) {
                Bitmap createBitmap = Bitmap.createBitmap(bVar4.a + 1, bVar4.b + 1, Bitmap.Config.ARGB_8888);
                this.g = createBitmap;
                canvas.setBitmap(createBitmap);
            }
            ArrayList arrayList2 = new ArrayList();
            SparseArray<e> sparseArray5 = dVar4.c;
            int i20 = 0;
            while (i20 < sparseArray5.size()) {
                canvas.save();
                e valueAt = sparseArray5.valueAt(i20);
                f fVar4 = hVar.c.get(sparseArray5.keyAt(i20));
                int i21 = valueAt.a + bVar4.c;
                int i22 = valueAt.b + bVar4.e;
                int i23 = fVar4.c;
                int i24 = fVar4.f;
                int i25 = fVar4.d;
                boolean z2 = z;
                int i26 = i21 + i23;
                int i27 = i22 + i25;
                SparseArray<e> sparseArray6 = sparseArray5;
                canvas.clipRect(i21, i22, Math.min(i26, bVar4.d), Math.min(i27, bVar4.f));
                a aVar = hVar.d.get(i24);
                if (aVar == null && (aVar = hVar.f.get(i24)) == null) {
                    aVar = this.e;
                }
                SparseArray<g> sparseArray7 = fVar4.j;
                int i28 = i20;
                int i29 = 0;
                while (true) {
                    Canvas canvas2 = canvas;
                    if (i29 < sparseArray7.size()) {
                        int keyAt = sparseArray7.keyAt(i29);
                        g valueAt2 = sparseArray7.valueAt(i29);
                        SparseArray<g> sparseArray8 = sparseArray7;
                        c cVar = hVar.e.get(keyAt);
                        if (cVar == null) {
                            cVar = hVar.g.get(keyAt);
                        }
                        if (cVar != null) {
                            Paint paint = cVar.b ? null : this.a;
                            int i30 = i21;
                            int i31 = fVar4.e;
                            int i32 = i30 + valueAt2.a;
                            int i33 = valueAt2.b + i22;
                            bVar2 = bVar4;
                            i6 = i23;
                            f fVar5 = fVar4;
                            int[] iArr = i31 == 3 ? aVar.d : i31 == 2 ? aVar.c : aVar.b;
                            fVar = fVar5;
                            i8 = i25;
                            Paint paint2 = paint;
                            i7 = i29;
                            canvas = canvas2;
                            hVar2 = hVar;
                            i9 = i30;
                            arrayList = arrayList2;
                            i5 = i22;
                            h(cVar.c, iArr, i31, i32, i33, paint2, canvas);
                            h(cVar.d, iArr, i31, i32, i33 + 1, paint2, canvas);
                        } else {
                            bVar2 = bVar4;
                            arrayList = arrayList2;
                            i5 = i22;
                            fVar = fVar4;
                            i6 = i23;
                            i7 = i29;
                            i8 = i25;
                            canvas = canvas2;
                            hVar2 = hVar;
                            i9 = i21;
                        }
                        i29 = i7 + 1;
                        i23 = i6;
                        i22 = i5;
                        fVar4 = fVar;
                        i21 = i9;
                        hVar = hVar2;
                        sparseArray7 = sparseArray8;
                        arrayList2 = arrayList;
                        bVar4 = bVar2;
                        i25 = i8;
                    } else {
                        b bVar5 = bVar4;
                        ArrayList arrayList3 = arrayList2;
                        int i34 = i22;
                        f fVar6 = fVar4;
                        int i35 = i23;
                        int i36 = i25;
                        canvas = canvas2;
                        h hVar3 = hVar;
                        int i37 = i21;
                        if (fVar6.b) {
                            int i38 = fVar6.e;
                            if (i38 == 3) {
                                i4 = aVar.d[fVar6.g];
                                c4 = 2;
                            } else {
                                c4 = 2;
                                i4 = i38 == 2 ? aVar.c[fVar6.h] : aVar.b[fVar6.i];
                            }
                            Paint paint3 = this.b;
                            paint3.setColor(i4);
                            c2 = c4;
                            c3 = 3;
                            canvas.drawRect(i37, i34, i26, i27, paint3);
                        } else {
                            c2 = 2;
                            c3 = 3;
                        }
                        rkk.a aVar2 = new rkk.a();
                        aVar2.b = Bitmap.createBitmap(this.g, i37, i34, i35, i36);
                        aVar2.a = null;
                        float f4 = bVar5.a;
                        aVar2.h = i37 / f4;
                        aVar2.i = 0;
                        float f5 = bVar5.b;
                        aVar2.e = i34 / f5;
                        aVar2.f = 0;
                        aVar2.g = 0;
                        aVar2.l = i35 / f4;
                        aVar2.m = i36 / f5;
                        arrayList3.add(aVar2.a());
                        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                        canvas.restore();
                        z = z2;
                        arrayList2 = arrayList3;
                        sparseArray5 = sparseArray6;
                        i20 = i28 + 1;
                        bVar4 = bVar5;
                        hVar = hVar3;
                    }
                }
            }
            wkkVar = new wkk(arrayList2, C.TIME_UNSET, C.TIME_UNSET);
        }
        j7jVar.accept(wkkVar);
    }

    @Override // xsna.a1n0
    public final int b() {
        return 2;
    }

    @Override // xsna.a1n0
    public final void reset() {
        h hVar = this.f;
        hVar.c.clear();
        hVar.d.clear();
        hVar.e.clear();
        hVar.f.clear();
        hVar.g.clear();
        hVar.h = null;
        hVar.i = null;
    }
}
