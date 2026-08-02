package xsna;

import android.graphics.Bitmap;
import android.graphics.Rect;
import androidx.annotation.Nullable;
import com.google.common.collect.ImmutableList;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.zip.Inflater;
import xsna.a1n0;
import xsna.rkk;

/* compiled from: VobsubParser.java */
/* loaded from: classes12.dex */
public final class rbw0 implements a1n0 {
    public final xi90 a = new xi90();
    public final xi90 b = new xi90();
    public final a c;

    @Nullable
    public Inflater d;

    /* compiled from: VobsubParser.java */
    public static final class a {
        public boolean b;
        public boolean c;
        public int[] d;
        public int e;
        public int f;

        @Nullable
        public Rect g;
        public final int[] a = new int[4];
        public int h = -1;
        public int i = -1;

        public static int a(int i, int[] iArr) {
            return (i < 0 || i >= iArr.length) ? iArr[0] : iArr[i];
        }

        public static int c(int i, int i2) {
            return (i & 16777215) | ((i2 * 17) << 24);
        }

        public final void b(wi90 wi90Var, boolean z, Rect rect, int[] iArr) {
            int i;
            int i2;
            int width = rect.width();
            int height = rect.height();
            int i3 = !z ? 1 : 0;
            int i4 = i3 * width;
            while (true) {
                int i5 = 0;
                do {
                    int i6 = 0;
                    for (int i7 = 1; i6 < i7 && i7 <= 64; i7 <<= 2) {
                        if (wi90Var.b() < 4) {
                            i = -1;
                            i2 = 0;
                            break;
                        }
                        i6 = (i6 << 4) | wi90Var.g(4);
                    }
                    i = i6 & 3;
                    i2 = i6 < 4 ? width : i6 >> 2;
                    int min = Math.min(i2, width - i5);
                    if (min > 0) {
                        int i8 = i4 + min;
                        Arrays.fill(iArr, i4, i8, this.a[i]);
                        i5 += min;
                        i4 = i8;
                    }
                } while (i5 < width);
                i3 += 2;
                if (i3 >= height) {
                    return;
                }
                i4 = i3 * width;
                wi90Var.c();
            }
        }
    }

    public rbw0(List<byte[]> list) {
        int i;
        a aVar = new a();
        this.c = aVar;
        String trim = new String(list.get(0), StandardCharsets.UTF_8).trim();
        String str = y2r0.a;
        for (String str2 : trim.split("\\r?\\n", -1)) {
            if (str2.startsWith("palette: ")) {
                String[] split = str2.substring(9).split(StringUtils.COMMA, -1);
                aVar.d = new int[split.length];
                for (int i2 = 0; i2 < split.length; i2++) {
                    int[] iArr = aVar.d;
                    try {
                        i = Integer.parseInt(split[i2].trim(), 16);
                    } catch (RuntimeException e) {
                        ahn.G("Parsing color failed", e);
                        i = 0;
                    }
                    iArr[i2] = i;
                }
            } else if (str2.startsWith("size: ")) {
                String[] split2 = str2.substring(6).trim().split("x", -1);
                if (split2.length != 2) {
                    ahn.F("Ignoring malformed IDX size line: '" + str2 + "'");
                } else {
                    try {
                        aVar.e = Integer.parseInt(split2[0]);
                        aVar.f = Integer.parseInt(split2[1]);
                        aVar.b = true;
                    } catch (RuntimeException e2) {
                        ahn.G("Parsing IDX failed", e2);
                    }
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x025d  */
    @Override // xsna.a1n0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(byte[] bArr, int i, int i2, a1n0.b bVar, j7j<wkk> j7jVar) {
        rkk rkkVar;
        rkk rkkVar2;
        com.google.common.collect.g gVar;
        boolean z;
        Rect rect;
        xi90 xi90Var = this.a;
        xi90Var.N(bArr, i + i2);
        xi90Var.P(i);
        if (this.d == null) {
            this.d = new Inflater();
        }
        Inflater inflater = this.d;
        String str = y2r0.a;
        if (xi90Var.a() > 0 && xi90Var.m() == 120) {
            xi90 xi90Var2 = this.b;
            if (y2r0.K(xi90Var, xi90Var2, inflater)) {
                xi90Var.N(xi90Var2.a, xi90Var2.c);
            }
        }
        a aVar = this.c;
        aVar.c = false;
        aVar.g = null;
        aVar.h = -1;
        aVar.i = -1;
        int a2 = xi90Var.a();
        if (a2 < 2 || xi90Var.J() != a2) {
            rkkVar = null;
        } else {
            if (aVar.d == null) {
                ahn.F("Skipping SPU (no palette)");
            } else if (aVar.b) {
                int i3 = xi90Var.b - 2;
                xi90Var.P(xi90Var.J() + i3);
                do {
                    int i4 = 4;
                    if (xi90Var.a() < 4) {
                        z = false;
                    } else {
                        int i5 = xi90Var.b;
                        xi90Var.Q(2);
                        int J = xi90Var.J() + i3;
                        z = J != i5 && J < xi90Var.c;
                        int i6 = z ? J : xi90Var.c;
                        boolean z2 = true;
                        while (xi90Var.b < i6 && z2) {
                            int[] iArr = aVar.a;
                            int C = xi90Var.C();
                            if (C != 255) {
                                switch (C) {
                                    case 0:
                                    case 1:
                                    case 2:
                                        z2 = true;
                                        break;
                                    case 3:
                                        if (xi90Var.a() >= 2) {
                                            int C2 = xi90Var.C();
                                            int C3 = xi90Var.C();
                                            iArr[3] = a.a(C2 >> 4, aVar.d);
                                            iArr[2] = a.a(C2 & 15, aVar.d);
                                            iArr[1] = a.a(C3 >> 4, aVar.d);
                                            iArr[0] = a.a(C3 & 15, aVar.d);
                                            aVar.c = true;
                                            z2 = true;
                                            break;
                                        } else {
                                            ahn.F("Incomplete color command");
                                            break;
                                        }
                                    case 4:
                                        if (xi90Var.a() >= 2) {
                                            if (!aVar.c) {
                                                ahn.F("Ignoring alpha command before color command");
                                                break;
                                            } else {
                                                int C4 = xi90Var.C();
                                                int C5 = xi90Var.C();
                                                iArr[3] = a.c(iArr[3], C4 >> 4);
                                                iArr[2] = a.c(iArr[2], C4 & 15);
                                                iArr[1] = a.c(iArr[1], C5 >> 4);
                                                iArr[0] = a.c(iArr[0], C5 & 15);
                                                z2 = true;
                                                break;
                                            }
                                        } else {
                                            ahn.F("Incomplete alpha command");
                                            break;
                                        }
                                    case 5:
                                        if (xi90Var.a() >= 6) {
                                            int C6 = xi90Var.C();
                                            int C7 = xi90Var.C();
                                            int i7 = (C6 << i4) | (C7 >> 4);
                                            int C8 = ((C7 & 15) << 8) | xi90Var.C();
                                            int C9 = xi90Var.C();
                                            int C10 = xi90Var.C();
                                            aVar.g = new Rect(i7, (C9 << i4) | (C10 >> 4), C8 + 1, (((C10 & 15) << 8) | xi90Var.C()) + 1);
                                            z2 = true;
                                            break;
                                        } else {
                                            ahn.F("Incomplete area command");
                                            break;
                                        }
                                    case 6:
                                        if (xi90Var.a() >= i4) {
                                            aVar.h = xi90Var.J();
                                            aVar.i = xi90Var.J();
                                            z2 = true;
                                            break;
                                        } else {
                                            ahn.F("Incomplete offsets command");
                                            break;
                                        }
                                    default:
                                        sn.d(C, "Unrecognized command: ");
                                        break;
                                }
                                i4 = 4;
                            }
                            z2 = false;
                            i4 = 4;
                        }
                        if (z) {
                            xi90Var.P(J);
                        }
                    }
                } while (z);
            } else {
                ahn.F("Skipping SPU (no plane)");
            }
            if (aVar.d != null && aVar.b && aVar.c && (rect = aVar.g) != null && aVar.h != -1 && aVar.i != -1 && rect.width() >= 2 && aVar.g.height() >= 2) {
                Rect rect2 = aVar.g;
                int[] iArr2 = new int[rect2.height() * rect2.width()];
                wi90 wi90Var = new wi90();
                xi90Var.P(aVar.h);
                wi90Var.k(xi90Var);
                aVar.b(wi90Var, true, rect2, iArr2);
                xi90Var.P(aVar.i);
                wi90Var.k(xi90Var);
                aVar.b(wi90Var, false, rect2, iArr2);
                Bitmap createBitmap = Bitmap.createBitmap(iArr2, rect2.width(), rect2.height(), Bitmap.Config.ARGB_8888);
                rkk.a aVar2 = new rkk.a();
                aVar2.b = createBitmap;
                aVar2.a = null;
                aVar2.h = rect2.left / aVar.e;
                aVar2.i = 0;
                aVar2.e = rect2.top / aVar.f;
                aVar2.f = 0;
                aVar2.g = 0;
                aVar2.l = rect2.width() / aVar.e;
                aVar2.m = rect2.height() / aVar.f;
                rkkVar2 = aVar2.a();
                if (rkkVar2 == null) {
                    gVar = ImmutableList.p(rkkVar2);
                } else {
                    ImmutableList.b bVar2 = ImmutableList.c;
                    gVar = com.google.common.collect.g.f;
                }
                j7jVar.accept(new wkk(gVar, C.TIME_UNSET, 5000000L));
            }
            rkkVar = null;
        }
        rkkVar2 = rkkVar;
        if (rkkVar2 == null) {
        }
        j7jVar.accept(new wkk(gVar, C.TIME_UNSET, 5000000L));
    }

    @Override // xsna.a1n0
    public final int b() {
        return 2;
    }
}
