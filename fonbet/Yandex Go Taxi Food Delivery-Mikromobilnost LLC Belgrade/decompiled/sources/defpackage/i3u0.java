package defpackage;

import java.io.InputStream;
import org.brotli.dec.a;
import org.brotli.dec.d;

/* loaded from: classes4.dex */
public final class i3u0 {
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public byte[] G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int T;
    public int U;
    public int V;
    public int W;
    public int X;
    public byte[] Y;
    public int b;
    public byte[] d;
    public int g;
    public boolean h;
    public boolean i;
    public boolean j;
    public int v;
    public int w;
    public int x;
    public byte[] y;
    public byte[] z;
    public int a = 0;
    public final a c = new a();
    public final int[] e = new int[3240];
    public final int[] f = new int[3240];
    public final o3 k = new o3();
    public final o3 l = new o3();
    public final o3 m = new o3();
    public final int[] n = new int[3];
    public final int[] o = new int[3];
    public final int[] p = new int[6];
    public final int[] q = {16, 15, 11, 4};
    public int r = 0;
    public int s = 0;
    public int t = 0;
    public boolean u = false;
    public int P = 0;
    public long Q = 0;
    public final byte[] R = new byte[0];
    public int S = 0;

    public static void a(i3u0 i3u0Var, InputStream inputStream) {
        int i;
        int i2 = i3u0Var.a;
        a aVar = i3u0Var.c;
        if (i2 != 0) {
            ny61.r("State MUST be uninitialized");
            return;
        }
        if (aVar.d != null) {
            ny61.r("Bit reader already has associated input stream");
            return;
        }
        e6w e6wVar = aVar.c;
        byte[] bArr = aVar.a;
        int[] iArr = aVar.b;
        e6wVar.a = bArr;
        e6wVar.b = iArr;
        aVar.d = inputStream;
        aVar.f = 0L;
        aVar.g = 64;
        aVar.h = 1024;
        aVar.e = false;
        a.e(aVar);
        a.a(aVar, false);
        a.b(aVar);
        a.b(aVar);
        if (a.d(aVar, 1) == 0) {
            i = 16;
        } else {
            int d = a.d(aVar, 3);
            i = 17;
            if (d != 0) {
                i = 17 + d;
            } else {
                int d2 = a.d(aVar, 3);
                if (d2 != 0) {
                    i = d2 + 8;
                }
            }
        }
        if (i == 9) {
            d.a("Invalid 'windowBits' code");
            return;
        }
        int i3 = 1 << i;
        i3u0Var.O = i3;
        i3u0Var.N = i3 - 16;
        i3u0Var.a = 1;
    }
}
