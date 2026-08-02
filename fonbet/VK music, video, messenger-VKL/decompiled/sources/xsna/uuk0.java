package xsna;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.rlr0;

/* compiled from: Animator.kt */
/* loaded from: classes11.dex */
public final class uuk0 implements clr0 {
    public mtk0<Float> a;
    public mtk0<Float> b;
    public mtk0<Float> c;
    public mtk0<Float> d;
    public mtk0<Float> e;
    public mtk0<Float> f;
    public mtk0<Float> g;
    public mtk0<? extends List<? extends qq90>> h;
    public mtk0<l5g> i;
    public mtk0<l5g> j;
    public mtk0<Float> k;
    public mtk0<Float> l;
    public mtk0<Float> m;
    public mtk0<Float> n;
    public mtk0<Float> o;
    public mtk0<Float> p;

    @Override // xsna.clr0
    public final <T> T a(rlr0<T> rlr0Var, T t) {
        T t2;
        if (rlr0Var instanceof rlr0.f) {
            mtk0<Float> mtk0Var = this.a;
            if (mtk0Var != null) {
                return (T) Float.valueOf(mtk0Var.getValue().floatValue());
            }
        } else if (rlr0Var instanceof rlr0.d) {
            mtk0<Float> mtk0Var2 = this.b;
            if (mtk0Var2 != null) {
                return (T) Float.valueOf(mtk0Var2.getValue().floatValue());
            }
        } else if (rlr0Var instanceof rlr0.e) {
            mtk0<Float> mtk0Var3 = this.c;
            if (mtk0Var3 != null) {
                return (T) Float.valueOf(mtk0Var3.getValue().floatValue());
            }
        } else if (rlr0Var instanceof rlr0.g) {
            mtk0<Float> mtk0Var4 = this.d;
            if (mtk0Var4 != null) {
                return (T) Float.valueOf(mtk0Var4.getValue().floatValue());
            }
        } else if (rlr0Var instanceof rlr0.h) {
            mtk0<Float> mtk0Var5 = this.e;
            if (mtk0Var5 != null) {
                return (T) Float.valueOf(mtk0Var5.getValue().floatValue());
            }
        } else if (rlr0Var instanceof rlr0.l) {
            mtk0<Float> mtk0Var6 = this.f;
            if (mtk0Var6 != null) {
                return (T) Float.valueOf(mtk0Var6.getValue().floatValue());
            }
        } else if (rlr0Var instanceof rlr0.m) {
            mtk0<Float> mtk0Var7 = this.g;
            if (mtk0Var7 != null) {
                return (T) Float.valueOf(mtk0Var7.getValue().floatValue());
            }
        } else if (rlr0Var instanceof rlr0.c) {
            mtk0<? extends List<? extends qq90>> mtk0Var8 = this.h;
            if (mtk0Var8 != null && (t2 = (T) mtk0Var8.getValue()) != null) {
                return t2;
            }
        } else if (rlr0Var instanceof rlr0.a) {
            mtk0<l5g> mtk0Var9 = this.i;
            if (mtk0Var9 != null) {
                return (T) new rek0(mtk0Var9.getValue().a);
            }
        } else if (rlr0Var instanceof rlr0.b) {
            mtk0<Float> mtk0Var10 = this.m;
            if (mtk0Var10 != null) {
                return (T) Float.valueOf(mtk0Var10.getValue().floatValue());
            }
        } else if (rlr0Var instanceof rlr0.i) {
            mtk0<l5g> mtk0Var11 = this.j;
            if (mtk0Var11 != null) {
                return (T) new rek0(mtk0Var11.getValue().a);
            }
        } else if (rlr0Var instanceof rlr0.k) {
            mtk0<Float> mtk0Var12 = this.k;
            if (mtk0Var12 != null) {
                return (T) Float.valueOf(mtk0Var12.getValue().floatValue());
            }
        } else if (rlr0Var instanceof rlr0.j) {
            mtk0<Float> mtk0Var13 = this.l;
            if (mtk0Var13 != null) {
                return (T) Float.valueOf(mtk0Var13.getValue().floatValue());
            }
        } else if (rlr0Var instanceof rlr0.p) {
            mtk0<Float> mtk0Var14 = this.n;
            if (mtk0Var14 != null) {
                return (T) Float.valueOf(mtk0Var14.getValue().floatValue());
            }
        } else if (rlr0Var instanceof rlr0.n) {
            mtk0<Float> mtk0Var15 = this.o;
            if (mtk0Var15 != null) {
                return (T) Float.valueOf(mtk0Var15.getValue().floatValue());
            }
        } else {
            if (!(rlr0Var instanceof rlr0.o)) {
                throw new NoWhenBranchMatchedException();
            }
            mtk0<Float> mtk0Var16 = this.p;
            if (mtk0Var16 != null) {
                return (T) Float.valueOf(mtk0Var16.getValue().floatValue());
            }
        }
        return t;
    }
}
