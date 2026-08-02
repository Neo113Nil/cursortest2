package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import androidx.media3.common.ParserException;
import com.ybsdk.widgets.common.MoneyInputEditView;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collection;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCSP.CSPVersionUtility;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;
import ru.yandex.taxi.map.overlay.order.OrderMapOverlayComponent$Mode;

/* loaded from: classes10.dex */
public abstract class pw21 {
    public static volatile Handler c;
    public static final char[] a = {MoneyInputEditView.DEFAULT_VALUE, '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final char[] b = new char[64];
    public static final int[] d = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, CSPVersionUtility.CSP_BUILD_R2, 11025, 8000, 7350};
    public static final int[] e = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    public static void a() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        ny61.g("You must call this method on the main thread");
    }

    public static boolean b(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static byte[] c(int i, int i2) {
        int i3 = -1;
        for (int i4 = 0; i4 < 13; i4++) {
            if (i == d[i4]) {
                i3 = i4;
            }
        }
        int i5 = -1;
        for (int i6 = 0; i6 < 16; i6++) {
            if (i2 == e[i6]) {
                i5 = i6;
            }
        }
        if (i != -1 && i5 != -1) {
            return d(2, i3, i5);
        }
        ny61.g(oyr.h(i, i2, "Invalid sample rate or number of channels: ", Extension.FIX_SPACE));
        return null;
    }

    public static byte[] d(int i, int i2, int i3) {
        return new byte[]{(byte) (((i << 3) & 248) | ((i2 >> 1) & 7)), (byte) (((i2 << 7) & 128) | ((i3 << 3) & 120))};
    }

    public static n3g e(f0g f0gVar, o2y0 o2y0Var, OrderMapOverlayComponent$Mode orderMapOverlayComponent$Mode, agi0 agi0Var) {
        f0gVar.getClass();
        o2y0Var.getClass();
        orderMapOverlayComponent$Mode.getClass();
        agi0Var.getClass();
        n3g n3gVar = new n3g();
        int i = 11;
        n3gVar.l = new t4g(f0gVar, i);
        n3gVar.m = new v4g(f0gVar, 12);
        n3gVar.n = new u4g(f0gVar, 9);
        n3gVar.o = new u4g(f0gVar, i);
        int i2 = 19;
        n3gVar.p = new t4g(f0gVar, i2);
        int i3 = 8;
        n3gVar.q = new u4g(f0gVar, i3);
        n3w a2 = n3w.a(o2y0Var);
        n3gVar.a = a2;
        n3gVar.r = new u4g(f0gVar, 28);
        t4g t4gVar = new t4g(f0gVar, 15);
        n3gVar.s = t4gVar;
        u4g u4gVar = new u4g(f0gVar, 27);
        n3gVar.t = new flx0(t4gVar, u4gVar, i3);
        n3gVar.u = new v4g(f0gVar, 16);
        u4g u4gVar2 = new u4g(f0gVar, 4);
        u4g u4gVar3 = new u4g(f0gVar, 26);
        n3gVar.v = u4gVar3;
        int i4 = 25;
        t4g t4gVar2 = new t4g(f0gVar, i4);
        n3gVar.w = t4gVar2;
        t4g t4gVar3 = new t4g(f0gVar, 26);
        n3gVar.x = t4gVar3;
        int i5 = 20;
        zi60 zi60Var = new zi60(t4gVar2, t4gVar3, new u4g(f0gVar, i5), 7);
        n3gVar.y = zi60Var;
        n3gVar.z = new e3u((xvf0) u4gVar2, (xvf0) u4gVar3, (xvf0) zi60Var, i4);
        n3gVar.A = new v4g(f0gVar, 26);
        int i6 = 24;
        n3gVar.B = new t4g(f0gVar, i6);
        n3gVar.C = new u4g(f0gVar, i6);
        n3gVar.D = new u4g(f0gVar, 29);
        int i7 = 1;
        u4g u4gVar4 = new u4g(f0gVar, i7);
        n3gVar.E = u4gVar4;
        n3gVar.F = new u4g(f0gVar, 23);
        u4g u4gVar5 = new u4g(f0gVar, 17);
        t4g t4gVar4 = new t4g(f0gVar, 29);
        u4g u4gVar6 = new u4g(f0gVar, 0);
        n3gVar.G = u4gVar6;
        int i8 = 21;
        int i9 = 10;
        n3gVar.b = i5m.b(new m580((xvf0) u4gVar5, (xvf0) t4gVar4, (xvf0) new uzu0(u4gVar6, i8), (xvf0) new t4g(f0gVar, i5), (xvf0) a2, (xvf0) new ggl0(u4gVar6, i7), (xvf0) new cer(u4gVar4, i), (xvf0) new v4g(f0gVar, i9), (xvf0) new w7y0(u4gVar, i3), 7));
        n3gVar.H = new v4g(f0gVar, i);
        n3gVar.I = new v4g(f0gVar, 29);
        int i10 = 13;
        n3gVar.J = new u4g(f0gVar, i10);
        n3gVar.K = new u4g(f0gVar, i2);
        n3gVar.c = i5m.b(new sk21((v4g) n3gVar.m, new v4g(f0gVar, 27), n3gVar.a, i));
        n3gVar.d = dhs0.a(new tw11(new nb11((u4g) n3gVar.G, i8), 14));
        n3gVar.L = new u4g(f0gVar, 16);
        xvf0 b2 = i5m.b(egi0.a);
        n3gVar.e = b2;
        u4g u4gVar7 = new u4g(f0gVar, 7);
        int i11 = 2;
        v4g v4gVar = new v4g(f0gVar, i11);
        n3gVar.M = v4gVar;
        jpf0 jpf0Var = new jpf0((Object) v4gVar, b2, i9);
        n3gVar.N = jpf0Var;
        xvf0 xvf0Var = n3gVar.b;
        n3w n3wVar = n3gVar.a;
        flx0 flx0Var = (flx0) n3gVar.t;
        cta0 cta0Var = new cta0(xvf0Var, (xvf0) n3wVar, (xvf0) flx0Var, b2, (v7p) jpf0Var, 6);
        n3gVar.O = cta0Var;
        yc ycVar = new yc(b2, u4gVar7, xvf0Var, cta0Var, n3gVar.c, new wrh(flx0Var, b2, n3wVar, 7));
        n3gVar.P = ycVar;
        h0z h0zVar = new h0z(n3wVar, (t4g) n3gVar.w, i3);
        n3gVar.Q = h0zVar;
        n3gVar.R = new xt1(ycVar, h0zVar, 0);
        n3gVar.S = new xt1(ycVar, h0zVar, i11);
        n3gVar.T = new xt1(ycVar, h0zVar, 1);
        int i12 = 17;
        y500 y500Var = new y500((u4g) n3gVar.G, i12);
        n3gVar.U = y500Var;
        int i13 = 23;
        n3gVar.f = i5m.b(new tw11(y500Var, i13));
        u4g u4gVar8 = new u4g(f0gVar, i8);
        t4g t4gVar5 = new t4g(f0gVar, i12);
        n3gVar.V = t4gVar5;
        xvf0 b3 = i5m.b(new vfg0(n3gVar.a, (u4g) n3gVar.C, u4gVar8, t4gVar5, 3));
        u4g u4gVar9 = (u4g) n3gVar.n;
        faj fajVar = new faj(u4gVar9, i9);
        yc ycVar2 = (yc) n3gVar.P;
        h0z h0zVar2 = (h0z) n3gVar.Q;
        ze zeVar = new ze(ycVar2, h0zVar2, 6);
        n3w n3wVar2 = n3gVar.a;
        zfa zfaVar = new zfa(ycVar2, h0zVar2, n3wVar2, i13);
        fwc fwcVar = new fwc(ycVar2, h0zVar2, 18);
        upk0 upk0Var = new upk0((t4g) n3gVar.V, i10);
        u4g u4gVar10 = new u4g(f0gVar, i9);
        n3gVar.W = u4gVar10;
        n3gVar.g = i5m.b(new fmn((v4g) n3gVar.m, u4gVar9, n3wVar2, (u4g) n3gVar.D, (xt1) n3gVar.R, (xt1) n3gVar.S, (xt1) n3gVar.T, n3gVar.f, b3, n3gVar.e, (cta0) n3gVar.O, fajVar, (jpf0) n3gVar.N, ycVar2, zeVar, zfaVar, fwcVar, upk0Var, u4gVar10));
        n3w a3 = n3w.a(agi0Var);
        u4g u4gVar11 = new u4g(f0gVar, 25);
        u4g u4gVar12 = new u4g(f0gVar, 5);
        n3gVar.X = u4gVar12;
        n3gVar.h = i5m.b(new wi7((xvf0) n3gVar.m, (xvf0) n3gVar.a, n3gVar.N, n3gVar.R, n3gVar.O, n3gVar.P, a3, u4gVar11, u4gVar12, new v4g(f0gVar, i8), n3gVar.D, n3gVar.W));
        n3gVar.i = i5m.b(new vu(n3gVar.g, n3gVar.h, n3w.a(orderMapOverlayComponent$Mode), i12));
        int i14 = 14;
        n3gVar.Y = new v4g(f0gVar, i14);
        n3gVar.Z = new v4g(f0gVar, 23);
        n3gVar.a0 = new t4g(f0gVar, i14);
        n3gVar.b0 = new v4g(f0gVar, 4);
        int i15 = 22;
        n3gVar.c0 = new t4g(f0gVar, i15);
        int i16 = 24;
        n3gVar.d0 = new e3u(n3gVar.E, (xvf0) n3gVar.a, (v7p) new jl00(new mvy((u4g) n3gVar.G, 13), 0), i16);
        n3gVar.e0 = new v4g(f0gVar, 15);
        n3gVar.f0 = new abx0(kqb0.a, 14);
        n3gVar.g0 = new t4g(f0gVar, 28);
        n3gVar.h0 = new t4g(f0gVar, 10);
        xvf0 a4 = dhs0.a(dmm.a);
        t4g t4gVar6 = (t4g) n3gVar.c0;
        v4g v4gVar2 = (v4g) n3gVar.e0;
        abx0 abx0Var = (abx0) n3gVar.f0;
        t4g t4gVar7 = (t4g) n3gVar.g0;
        t4g t4gVar8 = (t4g) n3gVar.h0;
        n3gVar.i0 = new mz70(t4gVar6, v4gVar2, abx0Var, t4gVar7, t4gVar8, a4, 3);
        n3gVar.j0 = new v4g(f0gVar, i12);
        v4g v4gVar3 = new v4g(f0gVar, 8);
        n3gVar.k0 = v4gVar3;
        l180 l180Var = new l180(v4gVar3, 1);
        n3gVar.l0 = l180Var;
        n3gVar.m0 = new fy30((u4g) n3gVar.K, n3gVar.a, (u4g) n3gVar.v, (v4g) n3gVar.b0, (v4g) n3gVar.Z, l180Var, (t4g) n3gVar.w, (t4g) n3gVar.x, 5);
        u4g u4gVar13 = new u4g(f0gVar, 3);
        u4g u4gVar14 = new u4g(f0gVar, 18);
        n3gVar.n0 = u4gVar14;
        v4g v4gVar4 = new v4g(f0gVar, i15);
        v4g v4gVar5 = new v4g(f0gVar, i16);
        t4g t4gVar9 = (t4g) n3gVar.l;
        t4g t4gVar10 = (t4g) n3gVar.s;
        n3gVar.o0 = new mz70(t4gVar9, u4gVar13, u4gVar14, t4gVar10, v4gVar4, v4gVar5, 2);
        n3gVar.p0 = new v4g(f0gVar, 20);
        n3gVar.q0 = new dld0(t4gVar9, new u4g(f0gVar, 6), 4);
        n3gVar.r0 = new pqd0(t4gVar10, u4gVar13, v4gVar4, 2);
        int i17 = 23;
        t4g t4gVar11 = new t4g(f0gVar, i17);
        t4g t4gVar12 = new t4g(f0gVar, 12);
        n3gVar.s0 = t4gVar12;
        n3w a5 = n3w.a(new z380(new dt20(t4gVar11, t4gVar12, new uc50(t4gVar8, new t4g(f0gVar, 18), i17), (v4g) n3gVar.m, 16)));
        u4g u4gVar15 = new u4g(f0gVar, i15);
        t4g t4gVar13 = (t4g) n3gVar.l;
        u4g u4gVar16 = (u4g) n3gVar.n0;
        t4g t4gVar14 = (t4g) n3gVar.s;
        ph70 ph70Var = new ph70((v4g) n3gVar.p0, (dld0) n3gVar.q0, (pqd0) n3gVar.r0, a5, new js0(t4gVar13, u4gVar15, u4gVar16, t4gVar14, 11), t4gVar13);
        v4g v4gVar6 = new v4g(f0gVar, 18);
        v4g v4gVar7 = new v4g(f0gVar, 13);
        n3w n3wVar3 = n3gVar.a;
        n3gVar.t0 = new fy30(n3wVar3, (mz70) n3gVar.o0, (abx0) n3gVar.f0, ph70Var, (l180) n3gVar.l0, v4gVar6, v4gVar7, t4gVar14, 3);
        n3gVar.j = i5m.b(new n7i0(t4gVar14, n3wVar3, 19));
        n3gVar.u0 = new upk0((u4g) n3gVar.n0, 2);
        n3gVar.v0 = new kpp0((t4g) n3gVar.l, (t4g) n3gVar.s, new v4g(f0gVar, 1), 11);
        xvf0 b4 = i5m.b(new qcz0(i5m.b(new y501(new qcz0((u4g) n3gVar.W, 8), 6)), 9));
        v4g v4gVar8 = new v4g(f0gVar, 7);
        t4g t4gVar15 = (t4g) n3gVar.s;
        flx0 flx0Var2 = new flx0(v4gVar8, t4gVar15, 14);
        t4g t4gVar16 = (t4g) n3gVar.l;
        xvf0 xvf0Var2 = n3gVar.j;
        n3w n3wVar4 = n3gVar.a;
        xvf0 xvf0Var3 = n3gVar.b;
        fy30 fy30Var = new fy30(t4gVar16, xvf0Var2, n3wVar4, xvf0Var3, (upk0) n3gVar.u0, (kpp0) n3gVar.v0, b4, flx0Var2, 24);
        n3gVar.w0 = fy30Var;
        tgb0 tgb0Var = new tgb0((xvf0) b2j0.a, (xvf0) new zni0((v4g) n3gVar.k0, 4), (xvf0) new v4g(f0gVar, 6), 22, (byte) 0);
        e3u e3uVar = (e3u) n3gVar.z;
        uc50 uc50Var = new uc50(e3uVar, (zi60) n3gVar.y, i15);
        t4g t4gVar17 = new t4g(f0gVar, 9);
        rbx0 rbx0Var = new rbx0(n3wVar4, i15);
        t4g t4gVar18 = (t4g) n3gVar.w;
        mu7 mu7Var = new mu7(n3wVar4, t4gVar18, 2);
        y101 y101Var = new y101(n3wVar4, t4gVar18, (v4g) n3gVar.M, 11);
        n3gVar.x0 = new c180((u4g) n3gVar.q, n3wVar4, (u4g) n3gVar.r, (flx0) n3gVar.t, (v4g) n3gVar.u, e3uVar, (v4g) n3gVar.A, (t4g) n3gVar.B, agm.a, (u4g) n3gVar.C, (u4g) n3gVar.D, (u4g) n3gVar.E, (u4g) n3gVar.n, (t4g) n3gVar.p, (u4g) n3gVar.F, xvf0Var3, (v4g) n3gVar.H, (v4g) n3gVar.I, (u4g) n3gVar.J, (u4g) n3gVar.K, t4gVar15, n3gVar.c, n3gVar.d, (u4g) n3gVar.L, n3gVar.i, n3gVar.e, (u4g) n3gVar.X, (v4g) n3gVar.Y, (v4g) n3gVar.Z, (t4g) n3gVar.a0, (v4g) n3gVar.b0, (t4g) n3gVar.c0, (e3u) n3gVar.d0, (mz70) n3gVar.i0, (v4g) n3gVar.j0, (u4g) n3gVar.v, (fy30) n3gVar.m0, (fy30) n3gVar.t0, fy30Var, (y500) n3gVar.U, tgb0Var, uc50Var, t4gVar17, rbx0Var, mu7Var, y101Var, t4gVar18, new zi60(20, y101Var, new n2y0(n3wVar4, 19), t4gVar15), (t4g) n3gVar.s0, new p4((Object) new v4g(f0gVar, 5), (xvf0) new t4g(f0gVar, 16), 24), new v4g(f0gVar, 0));
        n3gVar.y0 = new v4g(f0gVar, 9);
        n3gVar.z0 = new v4g(f0gVar, 19);
        n3gVar.A0 = new t4g(f0gVar, 21);
        xvf0 b5 = i5m.b(b380.a);
        n3gVar.k = b5;
        v4g v4gVar9 = new v4g(f0gVar, 3);
        t4g t4gVar19 = new t4g(f0gVar, 13);
        v4g v4gVar10 = new v4g(f0gVar, 25);
        u4g u4gVar17 = new u4g(f0gVar, 12);
        u4g u4gVar18 = new u4g(f0gVar, 2);
        u4g u4gVar19 = (u4g) n3gVar.n;
        zi60 zi60Var2 = new zi60(u4gVar17, u4gVar19, u4gVar18, 9);
        v4g v4gVar11 = new v4g(f0gVar, 28);
        u4g u4gVar20 = new u4g(f0gVar, 14);
        jzi0 jzi0Var = new jzi0(10, u4gVar18);
        n7i0 n7i0Var = new n7i0((fy30) n3gVar.w0, (y500) n3gVar.U, 20);
        v4g v4gVar12 = (v4g) n3gVar.m;
        n3gVar.B0 = i5m.b(new g3b((t4g) n3gVar.l, v4gVar12, u4gVar19, (u4g) n3gVar.o, (t4g) n3gVar.p, (c180) n3gVar.x0, (v4g) n3gVar.y0, (v4g) n3gVar.z0, (t4g) n3gVar.A0, b5, n3gVar.a, v4gVar9, t4gVar19, v4gVar10, zi60Var2, v4gVar11, u4gVar20, new cta0((xvf0) v4gVar12, (xvf0) u4gVar19, (xvf0) jzi0Var, n3gVar.s, (xvf0) n7i0Var, 25, (byte) 0), new t4g(f0gVar, 27), new u4g(f0gVar, 15), 2));
        return n3gVar;
    }

    public static int f(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException unused) {
                return bitmap.getRowBytes() * bitmap.getHeight();
            }
        }
        StringBuilder sb = new StringBuilder("Cannot obtain size for recycled Bitmap: ");
        sb.append(bitmap);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap.Config config = bitmap.getConfig();
        sb.append("[");
        sb.append(width);
        sb.append(RemoteBioParameters.X);
        sb.append(height);
        sb.append("] ");
        sb.append(config);
        throw new IllegalStateException(sb.toString());
    }

    public static int g(Bitmap.Config config) {
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i = nw21.a[config.ordinal()];
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2 && i != 3) {
                return i != 4 ? 4 : 8;
            }
        }
        return i2;
    }

    public static int h(df90 df90Var) {
        int g = df90Var.g(4);
        if (g == 15) {
            if (df90Var.b() >= 24) {
                return df90Var.g(24);
            }
            throw ParserException.a(null, "AAC header insufficient data");
        }
        if (g < 13) {
            return d[g];
        }
        throw ParserException.a(null, "AAC header wrong Sampling Frequency Index");
    }

    public static ArrayList i(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (Object obj : collection) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Handler j() {
        if (c == null) {
            synchronized (pw21.class) {
                try {
                    if (c == null) {
                        c = new Handler(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        return c;
    }

    public static int k(int i, int i2) {
        return (i2 * 31) + i;
    }

    public static int l(int i, Object obj) {
        return k(obj == null ? 0 : obj.hashCode(), i);
    }

    public static boolean m(int i, int i2) {
        if (i > 0 || i == Integer.MIN_VALUE) {
            return i2 > 0 || i2 == Integer.MIN_VALUE;
        }
        return false;
    }

    public static MappedByteBuffer n(Context context, Uri uri) {
        ParcelFileDescriptor openFileDescriptor;
        try {
            openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
        } catch (IOException unused) {
        }
        if (openFileDescriptor == null) {
            if (openFileDescriptor != null) {
                openFileDescriptor.close();
                return null;
            }
            return null;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
            try {
                FileChannel channel = fileInputStream.getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                fileInputStream.close();
                openFileDescriptor.close();
                return map;
            } finally {
            }
        } finally {
        }
    }

    public static a4 o(df90 df90Var, boolean z) {
        int g = df90Var.g(5);
        if (g == 31) {
            g = df90Var.g(6) + 32;
        }
        int h = h(df90Var);
        int g2 = df90Var.g(4);
        String i = oyr.i(g, "mp4a.40.");
        if (g == 5 || g == 29) {
            h = h(df90Var);
            int g3 = df90Var.g(5);
            if (g3 == 31) {
                g3 = df90Var.g(6) + 32;
            }
            g = g3;
            if (g == 22) {
                g2 = df90Var.g(4);
            }
        }
        if (z) {
            if (g != 1 && g != 2 && g != 3 && g != 4 && g != 6 && g != 7 && g != 17) {
                switch (g) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw ParserException.c("Unsupported audio object type: " + g);
                }
            }
            if (df90Var.f()) {
                lk91.j("Unexpected frameLengthFlag = 1");
            }
            if (df90Var.f()) {
                df90Var.o(14);
            }
            boolean f = df90Var.f();
            if (g2 == 0) {
                w511.u();
                return null;
            }
            if (g == 6 || g == 20) {
                df90Var.o(3);
            }
            if (f) {
                if (g == 22) {
                    df90Var.o(16);
                }
                if (g == 17 || g == 19 || g == 20 || g == 23) {
                    df90Var.o(3);
                }
                df90Var.o(1);
            }
            switch (g) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int g4 = df90Var.g(2);
                    if (g4 == 2 || g4 == 3) {
                        throw ParserException.c("Unsupported epConfig: " + g4);
                    }
            }
        }
        int i2 = e[g2];
        if (i2 != -1) {
            return new a4(h, i2, i);
        }
        throw ParserException.a(null, null);
    }
}
