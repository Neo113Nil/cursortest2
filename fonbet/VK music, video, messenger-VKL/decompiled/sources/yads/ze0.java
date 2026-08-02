package yads;

import android.content.Context;
import android.graphics.Point;
import android.util.SparseArray;
import android.util.SparseBooleanArray;

/* loaded from: classes10.dex */
public final class ze0 extends t83 {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public final SparseArray N;
    public final SparseBooleanArray O;

    public ze0() {
        this.N = new SparseArray();
        this.O = new SparseBooleanArray();
        a();
    }

    public final void a() {
        this.A = true;
        this.B = false;
        this.C = true;
        this.D = false;
        this.E = true;
        this.F = false;
        this.G = false;
        this.H = false;
        this.I = false;
        this.J = true;
        this.K = true;
        this.L = false;
        this.M = true;
    }

    @Override // yads.t83
    public final void b(Context context) {
        Point c = mc3.c(context);
        a(c.x, c.y);
    }

    public ze0(Context context) {
        super(context);
        this.N = new SparseArray();
        this.O = new SparseBooleanArray();
        a();
    }

    @Override // yads.t83
    public final void a(Context context) {
        super.a(context);
    }

    @Override // yads.t83
    public final t83 a(int i, int i2) {
        this.i = i;
        this.j = i2;
        this.k = true;
        return this;
    }
}
