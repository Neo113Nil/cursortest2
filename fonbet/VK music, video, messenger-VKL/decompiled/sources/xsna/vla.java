package xsna;

import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.chromium.base.version_info.VersionConstants;
import ru.ok.android.commons.nio.charset.CharsetEncoder;
import xsna.rkk;
import xsna.wla;

/* compiled from: Cea708Decoder.java */
/* loaded from: classes12.dex */
public final class vla extends wla {
    public final xi90 h = new xi90();
    public final wi90 i = new wi90();
    public int j = -1;
    public final int k;
    public final b[] l;
    public b m;

    @Nullable
    public List<rkk> n;

    @Nullable
    public List<rkk> o;

    @Nullable
    public c p;
    public int q;

    /* compiled from: Cea708Decoder.java */
    public static final class a {
        public static final ula c = new ula();
        public final rkk a;
        public final int b;

        public a(SpannableStringBuilder spannableStringBuilder, Layout.Alignment alignment, float f, int i, float f2, int i2, boolean z, int i3, int i4) {
            rkk.a aVar = new rkk.a();
            aVar.a = spannableStringBuilder;
            aVar.b = null;
            aVar.c = alignment;
            aVar.e = f;
            aVar.f = 0;
            aVar.g = i;
            aVar.h = f2;
            aVar.i = i2;
            aVar.l = -3.4028235E38f;
            if (z) {
                aVar.o = i3;
                aVar.n = true;
            }
            this.a = aVar.a();
            this.b = i4;
        }
    }

    /* compiled from: Cea708Decoder.java */
    public static final class b {
        public static final boolean[] A;
        public static final int[] B;
        public static final int[] C;
        public static final int[] D;
        public static final int[] E;
        public static final int v = c(2, 2, 2, 0);
        public static final int w;
        public static final int[] x;
        public static final int[] y;
        public static final int[] z;
        public final ArrayList a = new ArrayList();
        public final SpannableStringBuilder b = new SpannableStringBuilder();
        public boolean c;
        public boolean d;
        public int e;
        public boolean f;
        public int g;
        public int h;
        public int i;
        public int j;
        public int k;
        public int l;
        public int m;
        public int n;
        public int o;
        public int p;
        public int q;
        public int r;
        public int s;
        public int t;
        public int u;

        static {
            int c = c(0, 0, 0, 0);
            w = c;
            int c2 = c(0, 0, 0, 3);
            x = new int[]{0, 0, 0, 0, 0, 2, 0};
            y = new int[]{0, 0, 0, 0, 0, 0, 2};
            z = new int[]{3, 3, 3, 3, 3, 3, 1};
            A = new boolean[]{false, false, false, true, true, true, false};
            B = new int[]{c, c2, c, c, c2, c, c};
            C = new int[]{0, 1, 2, 3, 4, 3, 4};
            D = new int[]{0, 0, 0, 0, 0, 3, 3};
            E = new int[]{c, c, c, c, c, c2, c2};
        }

        public b() {
            d();
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x002a  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0025  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static int c(int i, int i2, int i3, int i4) {
            int i5;
            fxc0.s(i, 4);
            fxc0.s(i2, 4);
            fxc0.s(i3, 4);
            fxc0.s(i4, 4);
            if (i4 != 0 && i4 != 1) {
                if (i4 == 2) {
                    i5 = 127;
                } else if (i4 == 3) {
                    i5 = 0;
                }
                return Color.argb(i5, i <= 1 ? 255 : 0, i2 <= 1 ? 255 : 0, i3 > 1 ? 255 : 0);
            }
            i5 = 255;
            return Color.argb(i5, i <= 1 ? 255 : 0, i2 <= 1 ? 255 : 0, i3 > 1 ? 255 : 0);
        }

        public final void a(char c) {
            SpannableStringBuilder spannableStringBuilder = this.b;
            if (c != '\n') {
                spannableStringBuilder.append(c);
                return;
            }
            SpannableString b = b();
            ArrayList arrayList = this.a;
            arrayList.add(b);
            spannableStringBuilder.clear();
            if (this.o != -1) {
                this.o = 0;
            }
            if (this.p != -1) {
                this.p = 0;
            }
            if (this.q != -1) {
                this.q = 0;
            }
            if (this.s != -1) {
                this.s = 0;
            }
            while (true) {
                if (arrayList.size() < this.j && arrayList.size() < 15) {
                    this.u = arrayList.size();
                    return;
                }
                arrayList.remove(0);
            }
        }

        public final SpannableString b() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.b);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.o != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.o, length, 33);
                }
                if (this.p != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.p, length, 33);
                }
                if (this.q != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.r), this.q, length, 33);
                }
                if (this.s != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.t), this.s, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        public final void d() {
            this.a.clear();
            this.b.clear();
            this.o = -1;
            this.p = -1;
            this.q = -1;
            this.s = -1;
            this.u = 0;
            this.c = false;
            this.d = false;
            this.e = 4;
            this.f = false;
            this.g = 0;
            this.h = 0;
            this.i = 0;
            this.j = 15;
            this.k = 0;
            this.l = 0;
            this.m = 0;
            int i = w;
            this.n = i;
            this.r = v;
            this.t = i;
        }

        public final void e(boolean z2, boolean z3) {
            int i = this.o;
            SpannableStringBuilder spannableStringBuilder = this.b;
            if (i != -1) {
                if (!z2) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.o, spannableStringBuilder.length(), 33);
                    this.o = -1;
                }
            } else if (z2) {
                this.o = spannableStringBuilder.length();
            }
            if (this.p == -1) {
                if (z3) {
                    this.p = spannableStringBuilder.length();
                }
            } else {
                if (z3) {
                    return;
                }
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.p, spannableStringBuilder.length(), 33);
                this.p = -1;
            }
        }

        public final void f(int i, int i2) {
            int i3 = this.q;
            SpannableStringBuilder spannableStringBuilder = this.b;
            if (i3 != -1 && this.r != i) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.r), this.q, spannableStringBuilder.length(), 33);
            }
            if (i != v) {
                this.q = spannableStringBuilder.length();
                this.r = i;
            }
            if (this.s != -1 && this.t != i2) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.t), this.s, spannableStringBuilder.length(), 33);
            }
            if (i2 != w) {
                this.s = spannableStringBuilder.length();
                this.t = i2;
            }
        }
    }

    /* compiled from: Cea708Decoder.java */
    public static final class c {
        public final int a;
        public final int b;
        public final byte[] c;
        public int d = 0;

        public c(int i, int i2) {
            this.a = i;
            this.b = i2;
            this.c = new byte[(i2 * 2) - 1];
        }
    }

    public vla(int i, @Nullable List<byte[]> list) {
        this.k = i == -1 ? 1 : i;
        if (list != null) {
            byte[] bArr = tzf.a;
            if (list.size() == 1 && list.get(0).length == 1) {
                byte b2 = list.get(0)[0];
            }
        }
        this.l = new b[8];
        for (int i2 = 0; i2 < 8; i2++) {
            this.l[i2] = new b();
        }
        this.m = this.l[0];
    }

    @Override // xsna.wla
    public final xla c() {
        List<rkk> list = this.n;
        this.o = list;
        list.getClass();
        return new xla(list);
    }

    @Override // xsna.wla
    public final void d(wla.a aVar) {
        ByteBuffer byteBuffer = aVar.e;
        byteBuffer.getClass();
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        xi90 xi90Var = this.h;
        xi90Var.N(array, limit);
        while (xi90Var.a() >= 3) {
            int C = xi90Var.C();
            int i = C & 3;
            boolean z = (C & 4) == 4;
            byte C2 = (byte) xi90Var.C();
            byte C3 = (byte) xi90Var.C();
            if (i == 2 || i == 3) {
                if (z) {
                    if (i == 3) {
                        g();
                        int i2 = (C2 & 192) >> 6;
                        int i3 = this.j;
                        if (i3 != -1 && i2 != (i3 + 1) % 4) {
                            i();
                            ahn.F("Sequence number discontinuity. previous=" + this.j + " current=" + i2);
                        }
                        this.j = i2;
                        int i4 = C2 & CharsetEncoder.DEFAULT_REPLACEMENT;
                        if (i4 == 0) {
                            i4 = 64;
                        }
                        c cVar = new c(i2, i4);
                        this.p = cVar;
                        cVar.d = 1;
                        cVar.c[0] = C3;
                    } else {
                        fxc0.p(i == 2);
                        c cVar2 = this.p;
                        if (cVar2 == null) {
                            ahn.n("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr = cVar2.c;
                            int i5 = cVar2.d;
                            int i6 = i5 + 1;
                            cVar2.d = i6;
                            bArr[i5] = C2;
                            cVar2.d = i5 + 2;
                            bArr[i6] = C3;
                        }
                    }
                    c cVar3 = this.p;
                    if (cVar3.d == (cVar3.b * 2) - 1) {
                        g();
                    }
                }
            }
        }
    }

    @Override // xsna.wla
    public final boolean f() {
        return this.n != this.o;
    }

    @Override // xsna.wla, xsna.a8l
    public final void flush() {
        super.flush();
        this.n = null;
        this.o = null;
        this.q = 0;
        this.m = this.l[0];
        i();
        this.p = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void g() {
        int i;
        boolean z;
        int i2;
        int i3;
        char c2;
        c cVar = this.p;
        if (cVar == null) {
            return;
        }
        int i4 = 2;
        boolean z2 = true;
        if (cVar.d != (cVar.b * 2) - 1) {
            ahn.m("DtvCcPacket ended prematurely; size is " + ((this.p.b * 2) - 1) + ", but current index is " + this.p.d + " (sequence number " + this.p.a + ");");
        }
        c cVar2 = this.p;
        byte[] bArr = cVar2.c;
        int i5 = cVar2.d;
        wi90 wi90Var = this.i;
        wi90Var.l(bArr, i5);
        boolean z3 = false;
        while (true) {
            if (wi90Var.b() > 0) {
                int i6 = 3;
                int g = wi90Var.g(3);
                int g2 = wi90Var.g(5);
                int i7 = 7;
                if (g == 7) {
                    wi90Var.o(i4);
                    g = wi90Var.g(6);
                    if (g < 7) {
                        sn.d(g, "Invalid extended service number: ");
                    }
                }
                if (g2 == 0) {
                    if (g != 0) {
                        ahn.F("serviceNumber is non-zero (" + g + ") when blockSize is 0");
                    }
                } else if (g != this.k) {
                    wi90Var.p(g2);
                } else {
                    int e = (g2 * 8) + wi90Var.e();
                    while (wi90Var.e() < e) {
                        int g3 = wi90Var.g(8);
                        if (g3 != 16) {
                            if (g3 <= 31) {
                                if (g3 != 0) {
                                    if (g3 == i6) {
                                        this.n = h();
                                    } else if (g3 != 8) {
                                        switch (g3) {
                                            case 12:
                                                i();
                                                break;
                                            case 13:
                                                this.m.a('\n');
                                                break;
                                            case 14:
                                                break;
                                            default:
                                                if (g3 < 17 || g3 > 23) {
                                                    if (g3 < 24 || g3 > 31) {
                                                        sn.d(g3, "Invalid C0 command: ");
                                                        break;
                                                    } else {
                                                        ahn.F("Currently unsupported COMMAND_P16 Command: " + g3);
                                                        wi90Var.o(16);
                                                        break;
                                                    }
                                                } else {
                                                    ahn.F("Currently unsupported COMMAND_EXT1 Command: " + g3);
                                                    wi90Var.o(8);
                                                    break;
                                                }
                                        }
                                    } else {
                                        SpannableStringBuilder spannableStringBuilder = this.m.b;
                                        int length = spannableStringBuilder.length();
                                        if (length > 0) {
                                            spannableStringBuilder.delete(length - 1, length);
                                        }
                                    }
                                }
                                i3 = i4;
                                i = i6;
                                i2 = i7;
                            } else if (g3 <= 127) {
                                if (g3 == 127) {
                                    this.m.a((char) 9835);
                                } else {
                                    this.m.a((char) (g3 & 255));
                                }
                                i3 = i4;
                                i = i6;
                                i2 = i7;
                                z3 = true;
                            } else {
                                if (g3 <= 159) {
                                    b[] bVarArr = this.l;
                                    switch (g3) {
                                        case 128:
                                        case 129:
                                        case 130:
                                        case MRAID_JS_WRITE_FAILED_VALUE:
                                        case OMSDK_DOWNLOAD_JS_ERROR_VALUE:
                                        case OMSDK_JS_WRITE_FAILED_VALUE:
                                        case 134:
                                        case 135:
                                            i = i6;
                                            z = true;
                                            int i8 = g3 - 128;
                                            if (this.q != i8) {
                                                this.q = i8;
                                                this.m = bVarArr[i8];
                                                break;
                                            }
                                            break;
                                        case PRIVACY_URL_ERROR_VALUE:
                                            i = i6;
                                            z = true;
                                            for (int i9 = 1; i9 <= 8; i9++) {
                                                if (wi90Var.f()) {
                                                    b bVar = bVarArr[8 - i9];
                                                    bVar.a.clear();
                                                    bVar.b.clear();
                                                    bVar.o = -1;
                                                    bVar.p = -1;
                                                    bVar.q = -1;
                                                    bVar.s = -1;
                                                    bVar.u = 0;
                                                }
                                            }
                                            break;
                                        case TPAT_RETRY_FAILED_VALUE:
                                            i = i6;
                                            for (int i10 = 1; i10 <= 8; i10++) {
                                                if (wi90Var.f()) {
                                                    bVarArr[8 - i10].d = true;
                                                }
                                            }
                                            z = true;
                                            break;
                                        case 138:
                                            i = i6;
                                            for (int i11 = 1; i11 <= 8; i11++) {
                                                if (wi90Var.f()) {
                                                    bVarArr[8 - i11].d = false;
                                                }
                                            }
                                            z = true;
                                            break;
                                        case 139:
                                            i = i6;
                                            for (int i12 = 1; i12 <= 8; i12++) {
                                                if (wi90Var.f()) {
                                                    bVarArr[8 - i12].d = !r1.d;
                                                }
                                            }
                                            z = true;
                                            break;
                                        case VersionConstants.PRODUCT_MAJOR_VERSION /* 140 */:
                                            i = i6;
                                            for (int i13 = 1; i13 <= 8; i13++) {
                                                if (wi90Var.f()) {
                                                    bVarArr[8 - i13].d();
                                                }
                                            }
                                            z = true;
                                            break;
                                        case 141:
                                            i = i6;
                                            wi90Var.o(8);
                                            z = true;
                                            break;
                                        case 142:
                                            i = i6;
                                            z = true;
                                            break;
                                        case 143:
                                            i = i6;
                                            i();
                                            z = true;
                                            break;
                                        case 144:
                                            int i14 = i4;
                                            if (!this.m.c) {
                                                wi90Var.o(16);
                                                i = 3;
                                                z = true;
                                                break;
                                            } else {
                                                wi90Var.g(4);
                                                wi90Var.g(i14);
                                                wi90Var.g(i14);
                                                boolean f = wi90Var.f();
                                                boolean f2 = wi90Var.f();
                                                i = 3;
                                                wi90Var.g(3);
                                                wi90Var.g(3);
                                                this.m.e(f, f2);
                                                z = true;
                                            }
                                        case 145:
                                            if (this.m.c) {
                                                int c3 = b.c(wi90Var.g(2), wi90Var.g(2), wi90Var.g(2), wi90Var.g(2));
                                                int c4 = b.c(wi90Var.g(2), wi90Var.g(2), wi90Var.g(2), wi90Var.g(2));
                                                wi90Var.o(2);
                                                b.c(wi90Var.g(2), wi90Var.g(2), wi90Var.g(2), 0);
                                                this.m.f(c3, c4);
                                            } else {
                                                wi90Var.o(24);
                                            }
                                            i = 3;
                                            z = true;
                                            break;
                                        case 146:
                                            if (this.m.c) {
                                                wi90Var.o(4);
                                                int g4 = wi90Var.g(4);
                                                wi90Var.o(2);
                                                wi90Var.g(6);
                                                b bVar2 = this.m;
                                                if (bVar2.u != g4) {
                                                    bVar2.a('\n');
                                                }
                                                bVar2.u = g4;
                                            } else {
                                                wi90Var.o(16);
                                            }
                                            i = 3;
                                            z = true;
                                            break;
                                        case 147:
                                        case 148:
                                        case 149:
                                        case 150:
                                        default:
                                            sn.d(g3, "Invalid C1 command: ");
                                            i = i6;
                                            z = true;
                                            break;
                                        case 151:
                                            if (this.m.c) {
                                                int c5 = b.c(wi90Var.g(2), wi90Var.g(2), wi90Var.g(2), wi90Var.g(2));
                                                wi90Var.g(2);
                                                b.c(wi90Var.g(2), wi90Var.g(2), wi90Var.g(2), 0);
                                                wi90Var.f();
                                                wi90Var.f();
                                                wi90Var.g(2);
                                                wi90Var.g(2);
                                                int g5 = wi90Var.g(2);
                                                wi90Var.o(8);
                                                b bVar3 = this.m;
                                                bVar3.n = c5;
                                                bVar3.k = g5;
                                            } else {
                                                wi90Var.o(32);
                                            }
                                            i = 3;
                                            z = true;
                                            break;
                                        case 152:
                                        case 153:
                                        case 154:
                                        case 155:
                                        case 156:
                                        case 157:
                                        case 158:
                                        case 159:
                                            int i15 = g3 - 152;
                                            b bVar4 = bVarArr[i15];
                                            wi90Var.o(i4);
                                            boolean f3 = wi90Var.f();
                                            wi90Var.o(i4);
                                            int g6 = wi90Var.g(i6);
                                            boolean f4 = wi90Var.f();
                                            int g7 = wi90Var.g(i7);
                                            int g8 = wi90Var.g(8);
                                            int g9 = wi90Var.g(4);
                                            int g10 = wi90Var.g(4);
                                            wi90Var.o(i4);
                                            wi90Var.o(6);
                                            wi90Var.o(i4);
                                            int g11 = wi90Var.g(i6);
                                            int g12 = wi90Var.g(i6);
                                            ArrayList arrayList = bVar4.a;
                                            bVar4.c = true;
                                            bVar4.d = f3;
                                            bVar4.e = g6;
                                            bVar4.f = f4;
                                            bVar4.g = g7;
                                            bVar4.h = g8;
                                            bVar4.i = g9;
                                            int i16 = g10 + 1;
                                            if (bVar4.j != i16) {
                                                bVar4.j = i16;
                                                while (true) {
                                                    if (arrayList.size() >= bVar4.j || arrayList.size() >= 15) {
                                                        arrayList.remove(0);
                                                    }
                                                }
                                            }
                                            if (g11 != 0 && bVar4.l != g11) {
                                                bVar4.l = g11;
                                                int i17 = g11 - 1;
                                                int i18 = b.B[i17];
                                                boolean z4 = b.A[i17];
                                                int i19 = b.y[i17];
                                                int i20 = b.z[i17];
                                                int i21 = b.x[i17];
                                                bVar4.n = i18;
                                                bVar4.k = i21;
                                            }
                                            if (g12 != 0 && bVar4.m != g12) {
                                                bVar4.m = g12;
                                                int i22 = g12 - 1;
                                                int i23 = b.D[i22];
                                                int i24 = b.C[i22];
                                                bVar4.e(false, false);
                                                bVar4.f(b.v, b.E[i22]);
                                            }
                                            if (this.q != i15) {
                                                this.q = i15;
                                                this.m = bVarArr[i15];
                                            }
                                            i = 3;
                                            z = true;
                                            break;
                                    }
                                } else {
                                    i = i6;
                                    z = true;
                                    if (g3 <= 255) {
                                        this.m.a((char) (g3 & 255));
                                    } else {
                                        sn.d(g3, "Invalid base command: ");
                                        i3 = 2;
                                        i2 = 7;
                                    }
                                }
                                z3 = z;
                                i3 = 2;
                                i2 = 7;
                            }
                            z = true;
                        } else {
                            i = i6;
                            z = true;
                            int g13 = wi90Var.g(8);
                            if (g13 <= 31) {
                                i2 = 7;
                                if (g13 > 7) {
                                    if (g13 <= 15) {
                                        wi90Var.o(8);
                                    } else if (g13 <= 23) {
                                        wi90Var.o(16);
                                    } else if (g13 <= 31) {
                                        wi90Var.o(24);
                                    }
                                }
                            } else {
                                i2 = 7;
                                if (g13 <= 127) {
                                    if (g13 == 32) {
                                        this.m.a(' ');
                                    } else if (g13 == 33) {
                                        this.m.a((char) 160);
                                    } else if (g13 == 37) {
                                        this.m.a((char) 8230);
                                    } else if (g13 == 42) {
                                        this.m.a((char) 352);
                                    } else if (g13 == 44) {
                                        this.m.a((char) 338);
                                    } else if (g13 == 63) {
                                        this.m.a((char) 376);
                                    } else if (g13 == 57) {
                                        this.m.a((char) 8482);
                                    } else if (g13 == 58) {
                                        this.m.a((char) 353);
                                    } else if (g13 == 60) {
                                        this.m.a((char) 339);
                                    } else if (g13 != 61) {
                                        switch (g13) {
                                            case 48:
                                                this.m.a((char) 9608);
                                                break;
                                            case 49:
                                                this.m.a((char) 8216);
                                                break;
                                            case 50:
                                                this.m.a((char) 8217);
                                                break;
                                            case 51:
                                                this.m.a((char) 8220);
                                                break;
                                            case 52:
                                                this.m.a((char) 8221);
                                                break;
                                            case 53:
                                                this.m.a((char) 8226);
                                                break;
                                            default:
                                                switch (g13) {
                                                    case PROTOBUF_SERIALIZATION_ERROR_VALUE:
                                                        this.m.a((char) 8539);
                                                        break;
                                                    case JSON_ENCODE_ERROR_VALUE:
                                                        this.m.a((char) 8540);
                                                        break;
                                                    case 120:
                                                        this.m.a((char) 8541);
                                                        break;
                                                    case TPAT_ERROR_VALUE:
                                                        this.m.a((char) 8542);
                                                        break;
                                                    case INVALID_ADS_ENDPOINT_VALUE:
                                                        this.m.a((char) 9474);
                                                        break;
                                                    case 123:
                                                        this.m.a((char) 9488);
                                                        break;
                                                    case INVALID_LOG_ERROR_ENDPOINT_VALUE:
                                                        this.m.a((char) 9492);
                                                        break;
                                                    case 125:
                                                        this.m.a((char) 9472);
                                                        break;
                                                    case ASSET_FAILED_INSUFFICIENT_SPACE_VALUE:
                                                        this.m.a((char) 9496);
                                                        break;
                                                    case 127:
                                                        this.m.a((char) 9484);
                                                        break;
                                                    default:
                                                        sn.d(g13, "Invalid G2 character: ");
                                                        break;
                                                }
                                        }
                                    } else {
                                        this.m.a((char) 8480);
                                    }
                                    z3 = true;
                                } else {
                                    if (g13 > 159) {
                                        i3 = 2;
                                        c2 = 6;
                                        if (g13 <= 255) {
                                            if (g13 == 160) {
                                                this.m.a((char) 13252);
                                            } else {
                                                sn.d(g13, "Invalid G3 character: ");
                                                this.m.a('_');
                                            }
                                            z3 = true;
                                        } else {
                                            sn.d(g13, "Invalid extended command: ");
                                        }
                                    } else if (g13 <= 135) {
                                        wi90Var.o(32);
                                    } else if (g13 <= 143) {
                                        wi90Var.o(40);
                                    } else if (g13 <= 159) {
                                        i3 = 2;
                                        wi90Var.o(2);
                                        c2 = 6;
                                        wi90Var.o(wi90Var.g(6) * 8);
                                    }
                                    boolean z5 = z;
                                    i6 = i;
                                    i4 = i3;
                                    z2 = z5;
                                    i7 = i2;
                                }
                            }
                            i3 = 2;
                        }
                        c2 = 6;
                        boolean z52 = z;
                        i6 = i;
                        i4 = i3;
                        z2 = z52;
                        i7 = i2;
                    }
                }
            }
        }
        if (z3) {
            this.n = h();
        }
        this.p = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<rkk> h() {
        a aVar;
        Layout.Alignment alignment;
        float f;
        float f2;
        int i;
        int i2;
        int i3;
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < 8; i4++) {
            b[] bVarArr = this.l;
            b bVar = bVarArr[i4];
            if (bVar.c && (!bVar.a.isEmpty() || bVar.b.length() != 0)) {
                b bVar2 = bVarArr[i4];
                if (bVar2.d) {
                    ArrayList arrayList2 = bVar2.a;
                    if (!bVar2.c || (arrayList2.isEmpty() && bVar2.b.length() == 0)) {
                        aVar = null;
                    } else {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        for (int i5 = 0; i5 < arrayList2.size(); i5++) {
                            spannableStringBuilder.append((CharSequence) arrayList2.get(i5));
                            spannableStringBuilder.append('\n');
                        }
                        spannableStringBuilder.append((CharSequence) bVar2.b());
                        int i6 = bVar2.k;
                        if (i6 != 0) {
                            if (i6 == 1) {
                                alignment = Layout.Alignment.ALIGN_OPPOSITE;
                            } else if (i6 == 2) {
                                alignment = Layout.Alignment.ALIGN_CENTER;
                            } else if (i6 != 3) {
                                throw new IllegalArgumentException("Unexpected justification value: " + bVar2.k);
                            }
                            Layout.Alignment alignment2 = alignment;
                            if (bVar2.f) {
                                f = bVar2.h / 209.0f;
                                f2 = bVar2.g / 74.0f;
                            } else {
                                f = bVar2.h / 99.0f;
                                f2 = bVar2.g / 99.0f;
                            }
                            float f3 = (f * 0.9f) + 0.05f;
                            float f4 = (f2 * 0.9f) + 0.05f;
                            int i7 = bVar2.i;
                            i = i7 / 3;
                            if (i != 0) {
                                i2 = i7;
                                i3 = 0;
                            } else if (i == 1) {
                                i2 = i7;
                                i3 = 1;
                            } else {
                                i2 = i7;
                                i3 = 2;
                            }
                            int i8 = i2 % 3;
                            int i9 = i8 != 0 ? 0 : i8 == 1 ? 1 : 2;
                            int i10 = bVar2.n;
                            aVar = new a(spannableStringBuilder, alignment2, f4, i3, f3, i9, i10 == b.w, i10, bVar2.e);
                        }
                        alignment = Layout.Alignment.ALIGN_NORMAL;
                        Layout.Alignment alignment22 = alignment;
                        if (bVar2.f) {
                        }
                        float f32 = (f * 0.9f) + 0.05f;
                        float f42 = (f2 * 0.9f) + 0.05f;
                        int i72 = bVar2.i;
                        i = i72 / 3;
                        if (i != 0) {
                        }
                        int i82 = i2 % 3;
                        if (i82 != 0) {
                        }
                        int i102 = bVar2.n;
                        aVar = new a(spannableStringBuilder, alignment22, f42, i3, f32, i9, i102 == b.w, i102, bVar2.e);
                    }
                    if (aVar != null) {
                        arrayList.add(aVar);
                    }
                } else {
                    continue;
                }
            }
        }
        Collections.sort(arrayList, a.c);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            arrayList3.add(((a) arrayList.get(i11)).a);
        }
        return Collections.unmodifiableList(arrayList3);
    }

    public final void i() {
        for (int i = 0; i < 8; i++) {
            this.l[i].d();
        }
    }
}
