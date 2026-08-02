package defpackage;

import android.net.Uri;
import android.os.Bundle;
import java.util.Arrays;

/* loaded from: classes7.dex */
public final class oi61 implements kq71 {
    public static final oi61 b0 = new oi61(new a291());
    public static final dy31 c0 = new dy31(15);
    public final ui81 A;
    public final ui81 B;
    public final byte[] C;
    public final Integer D;
    public final Uri E;
    public final Integer F;
    public final Integer G;
    public final Integer H;
    public final Boolean I;
    public final Integer J;
    public final Integer K;
    public final Integer L;
    public final Integer M;
    public final Integer N;
    public final Integer O;
    public final Integer P;
    public final CharSequence Q;
    public final CharSequence R;
    public final CharSequence S;
    public final Integer T;
    public final Integer U;
    public final CharSequence V;
    public final CharSequence W;
    public final CharSequence Z;
    public final CharSequence a;
    public final Bundle a0;
    public final CharSequence b;
    public final CharSequence c;
    public final CharSequence w;
    public final CharSequence x;
    public final CharSequence y;
    public final CharSequence z;

    public oi61(a291 a291Var) {
        this.a = a291Var.a;
        this.b = a291Var.b;
        this.c = a291Var.c;
        this.w = a291Var.d;
        this.x = a291Var.e;
        this.y = a291Var.f;
        this.z = a291Var.g;
        this.A = a291Var.h;
        this.B = a291Var.i;
        this.C = a291Var.j;
        this.D = a291Var.k;
        this.E = a291Var.l;
        this.F = a291Var.m;
        this.G = a291Var.n;
        this.H = a291Var.o;
        this.I = a291Var.p;
        Integer num = a291Var.q;
        this.J = num;
        this.K = num;
        this.L = a291Var.r;
        this.M = a291Var.s;
        this.N = a291Var.t;
        this.O = a291Var.u;
        this.P = a291Var.v;
        this.Q = a291Var.w;
        this.R = a291Var.x;
        this.S = a291Var.y;
        this.T = a291Var.z;
        this.U = a291Var.A;
        this.V = a291Var.B;
        this.W = a291Var.C;
        this.Z = a291Var.D;
        this.a0 = a291Var.E;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && oi61.class == obj.getClass()) {
            oi61 oi61Var = (oi61) obj;
            if (rf71.o(this.a, oi61Var.a) && rf71.o(this.b, oi61Var.b) && rf71.o(this.c, oi61Var.c) && rf71.o(this.w, oi61Var.w) && rf71.o(this.x, oi61Var.x) && rf71.o(this.y, oi61Var.y) && rf71.o(this.z, oi61Var.z) && rf71.o(this.A, oi61Var.A) && rf71.o(this.B, oi61Var.B) && Arrays.equals(this.C, oi61Var.C) && rf71.o(this.D, oi61Var.D) && rf71.o(this.E, oi61Var.E) && rf71.o(this.F, oi61Var.F) && rf71.o(this.G, oi61Var.G) && rf71.o(this.H, oi61Var.H) && rf71.o(this.I, oi61Var.I) && rf71.o(this.K, oi61Var.K) && rf71.o(this.L, oi61Var.L) && rf71.o(this.M, oi61Var.M) && rf71.o(this.N, oi61Var.N) && rf71.o(this.O, oi61Var.O) && rf71.o(this.P, oi61Var.P) && rf71.o(this.Q, oi61Var.Q) && rf71.o(this.R, oi61Var.R) && rf71.o(this.S, oi61Var.S) && rf71.o(this.T, oi61Var.T) && rf71.o(this.U, oi61Var.U) && rf71.o(this.V, oi61Var.V) && rf71.o(this.W, oi61Var.W) && rf71.o(this.Z, oi61Var.Z)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.w, this.x, this.y, this.z, this.A, this.B, Integer.valueOf(Arrays.hashCode(this.C)), this.D, this.E, this.F, this.G, this.H, this.I, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, this.S, this.T, this.U, this.V, this.W, this.Z});
    }
}
