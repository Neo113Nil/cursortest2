package xsna;

import android.text.Layout;
import android.text.StaticLayout;

/* compiled from: BackgroundData.kt */
/* loaded from: classes16.dex */
public final class fw5 implements v7q {
    public int a;
    public Object b;

    @Override // xsna.v7q
    public void b(Layout layout) {
        this.b = layout;
    }

    @Override // xsna.v7q
    public void c(int i) {
        this.a = i;
    }

    @Override // xsna.v7q
    public int e() {
        Layout layout = (Layout) this.b;
        if (layout == null) {
            return 0;
        }
        return layout.getLineBottom(this.a) - layout.getLineTop(this.a);
    }

    @Override // xsna.v7q
    public float f(float f) {
        return ((Layout) this.b) != null ? r2.getLineBottom(this.a) : 0;
    }

    @Override // xsna.v7q
    public boolean g() {
        return false;
    }

    @Override // xsna.v7q
    public void a(int i) {
    }

    @Override // xsna.v7q
    public void d(StaticLayout staticLayout) {
    }
}
