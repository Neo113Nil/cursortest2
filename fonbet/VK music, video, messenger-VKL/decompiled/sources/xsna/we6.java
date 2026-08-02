package xsna;

import android.view.ViewGroup;

/* compiled from: BaseInfoItem.kt */
/* loaded from: classes5.dex */
public abstract class we6 implements z8l {
    public int a;
    public boolean b;
    public int c;
    public int d;
    public int e;
    public Integer f;

    public abstract vif0<? extends we6> a(ViewGroup viewGroup);

    public int b() {
        return this.a;
    }

    @Override // xsna.z8l
    public final boolean c() {
        return false;
    }

    @Override // xsna.z8l
    public final boolean d() {
        return this.b;
    }

    public int e() {
        return 0;
    }

    public String f(int i) {
        return null;
    }

    public int g() {
        return this.c;
    }

    @Override // xsna.z8l
    public final int getPaddingBottom() {
        return this.d;
    }

    @Override // xsna.z8l
    public final int getPaddingTop() {
        return this.e;
    }

    public abstract int h();

    public void i(int i) {
        this.a = i;
    }

    public void j(int i) {
        this.c = i;
    }
}
