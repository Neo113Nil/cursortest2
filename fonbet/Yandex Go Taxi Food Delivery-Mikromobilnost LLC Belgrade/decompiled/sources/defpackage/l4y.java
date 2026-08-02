package defpackage;

import androidx.compose.runtime.f;

/* loaded from: classes10.dex */
public final class l4y {
    public final yx40 a;
    public final yx40 b;
    public boolean c;
    public Object d;
    public final w5y e;

    public l4y(int i, int i2) {
        this.a = f.g(i);
        this.b = f.g(i2);
        this.e = new w5y(i, 90, 200);
    }

    public final void a(int i, int i2) {
        if (i < 0.0f) {
            lxv.a("Index should be non-negative");
        }
        this.a.setIntValue(i);
        this.e.a(i);
        this.b.setIntValue(i2);
    }

    public l4y() {
        this(0, 0);
    }
}
