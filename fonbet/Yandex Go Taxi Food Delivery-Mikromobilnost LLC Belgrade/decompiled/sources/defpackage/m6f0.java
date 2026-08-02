package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes10.dex */
public final class m6f0 {
    public final int a;
    public final b8x0 b;
    public final r1s c;
    public final r1s d;
    public final Rect e;
    public final int f;
    public final int g;
    public final Matrix h;
    public final n9j0 i;
    public final String j;
    public final euy l;
    public int m = -1;
    public final ArrayList k = new ArrayList();

    public m6f0(p38 p38Var, b8x0 b8x0Var, n9j0 n9j0Var, euy euyVar, int i) {
        this.a = i;
        this.b = b8x0Var;
        this.c = b8x0Var.g();
        this.d = b8x0Var.i();
        this.g = b8x0Var.e();
        this.f = b8x0Var.h();
        this.e = b8x0Var.c();
        this.h = b8x0Var.j();
        this.i = n9j0Var;
        this.j = String.valueOf(p38Var.hashCode());
        List<g48> list = p38Var.a;
        Objects.requireNonNull(list);
        for (g48 g48Var : list) {
            ArrayList arrayList = this.k;
            g48Var.getClass();
            arrayList.add(0);
        }
        this.l = euyVar;
    }

    public final void a(int i) {
        if (this.m != i) {
            this.m = i;
            n9j0 n9j0Var = this.i;
            n9j0Var.getClass();
            tob1.b();
            if (n9j0Var.g) {
                return;
            }
            b8x0 b8x0Var = n9j0Var.a;
            b8x0Var.a().execute(new a8x0(b8x0Var, i));
        }
    }
}
