package defpackage;

import com.yandex.div2.DivPager$ItemAlignment;

/* loaded from: classes.dex */
public abstract class p2l {
    public final int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ p2l(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public abstract void d(oll0 oll0Var);

    public abstract void e(oll0 oll0Var);

    public abstract Float f(int i);

    public Float g(int i) {
        l2l l2lVar = (l2l) this.b;
        int i2 = o2l.a[((DivPager$ItemAlignment) this.c).ordinal()];
        int i3 = this.a;
        if (i2 == 1) {
            Float f = f(i);
            if (f == null) {
                return null;
            }
            return Float.valueOf((i3 - l2lVar.g) - f.floatValue());
        }
        if (i2 != 2) {
            if (i2 == 3) {
                return Float.valueOf(l2lVar.h);
            }
            w511.b();
            return null;
        }
        Float f2 = f(i);
        if (f2 == null) {
            return null;
        }
        return Float.valueOf((i3 - f2.floatValue()) / 2.0f);
    }

    public Float h(int i) {
        l2l l2lVar = (l2l) this.b;
        int i2 = o2l.a[((DivPager$ItemAlignment) this.c).ordinal()];
        if (i2 == 1) {
            return Float.valueOf(l2lVar.g);
        }
        int i3 = this.a;
        if (i2 == 2) {
            Float f = f(i);
            if (f == null) {
                return null;
            }
            return Float.valueOf((i3 - f.floatValue()) / 2.0f);
        }
        if (i2 != 3) {
            w511.b();
            return null;
        }
        Float f2 = f(i);
        if (f2 == null) {
            return null;
        }
        return Float.valueOf((i3 - l2lVar.h) - f2.floatValue());
    }

    public abstract void i();

    public abstract void j(oll0 oll0Var);

    public abstract void k();

    public abstract void l(oll0 oll0Var);

    public abstract kne0 m(oll0 oll0Var);
}
