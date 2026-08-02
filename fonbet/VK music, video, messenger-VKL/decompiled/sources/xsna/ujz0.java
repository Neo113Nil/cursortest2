package xsna;

import android.content.Context;
import android.util.DisplayMetrics;
import android.util.SparseIntArray;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class ujz0 {
    public static int c;
    public final SparseIntArray a = new SparseIntArray();
    public final float b;
    public static final int d = a();
    public static final int e = a();
    public static final int f = a();
    public static final int g = a();
    public static final int h = a();
    public static final int i = a();
    public static final int j = a();
    public static final int k = a();
    public static final int l = a();
    public static final int m = a();
    public static final int n = a();
    public static final int o = a();
    public static final int p = a();
    public static final int q = a();
    public static final int r = a();
    public static final int s = a();
    public static final int t = a();
    public static final int u = a();
    public static final int v = a();
    public static final int w = a();
    public static final int x = a();
    public static final int y = a();
    public static final int z = a();
    public static final int A = a();
    public static final int B = a();
    public static final int C = a();
    public static final int D = a();
    public static final int E = a();
    public static final int F = a();
    public static final int G = a();
    public static final int H = a();
    public static final int I = a();
    public static final int J = a();
    public static final int K = a();
    public static final int L = a();
    public static final int M = a();
    public static final int N = a();
    public static final int O = a();
    public static final int P = a();
    public static final int Q = a();
    public static final int R = a();
    public static final int S = a();
    public static final int T = a();
    public static final int U = a();
    public static final int V = a();
    public static final int W = a();
    public static final int X = a();
    public static final int Y = a();

    public ujz0(Context context) {
        int i2;
        c1z0 c1z0Var = new c1z0(context);
        DisplayMetrics f2 = c1z0.f(context);
        int i3 = f2.heightPixels;
        if (i3 <= 0 || (i2 = f2.widthPixels) <= 0) {
            this.b = 1.0f;
            c(c1z0Var);
            return;
        }
        float f3 = f2.density;
        float min = Math.min(i2 / f3, i3 / f3);
        if (min >= 720.0f) {
            this.b = 2.0f;
        } else if (min >= 600.0f) {
            this.b = 1.2f;
        } else {
            this.b = 1.0f;
        }
        c(c1z0Var);
    }

    public static int a() {
        int i2 = c;
        c = i2 + 1;
        return i2;
    }

    public final void b(int i2, int i3) {
        this.a.put(i2, (int) (i3 * this.b));
    }

    public final void c(c1z0 c1z0Var) {
        b(d, c1z0Var.b(1));
        b(e, c1z0Var.b(2));
        b(f, c1z0Var.b(3));
        b(g, c1z0Var.b(4));
        b(h, c1z0Var.b(5));
        b(i, c1z0Var.b(6));
        b(j, c1z0Var.b(7));
        b(k, c1z0Var.b(8));
        b(l, c1z0Var.b(9));
        b(m, c1z0Var.b(10));
        b(n, c1z0Var.b(12));
        b(o, c1z0Var.b(13));
        b(p, c1z0Var.b(14));
        b(q, c1z0Var.b(15));
        b(r, c1z0Var.b(16));
        b(s, c1z0Var.b(17));
        b(t, c1z0Var.b(18));
        b(u, c1z0Var.b(20));
        b(v, c1z0Var.b(24));
        b(w, c1z0Var.b(28));
        b(x, c1z0Var.b(30));
        b(z, c1z0Var.b(36));
        b(A, c1z0Var.b(37));
        b(B, c1z0Var.b(38));
        b(C, c1z0Var.b(40));
        b(D, c1z0Var.b(44));
        b(E, c1z0Var.b(48));
        b(F, c1z0Var.b(56));
        b(y, c1z0Var.b(32));
        b(G, c1z0Var.b(72));
        b(H, c1z0Var.b(100));
        b(I, c1z0Var.b(105));
        b(J, c1z0Var.b(179));
        b(K, c1z0Var.b(184));
        b(L, c1z0Var.b(200));
        b(M, c1z0Var.b(276));
        b(N, 18);
        b(Q, 12);
        b(R, 11);
        b(P, 13);
        b(O, 14);
        b(U, 15);
        int i2 = S;
        b(i2, 16);
        b(T, 17);
        b(i2, 16);
        b(X, 20);
        b(Y, 10);
        b(V, 22);
        b(W, 24);
    }
}
