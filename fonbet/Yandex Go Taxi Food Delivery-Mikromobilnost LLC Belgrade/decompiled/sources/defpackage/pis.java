package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.core.view.b;
import java.util.WeakHashMap;
import ru.yandex.taxi.banners.presentation.fullscreen.FullScreenBannerModalView;

/* loaded from: classes6.dex */
public final class pis extends hsf0 {
    public final View g;
    public final Rect h;

    public pis(FullScreenBannerModalView fullScreenBannerModalView) {
        super(fullScreenBannerModalView, bei.F);
        int i = idh0.banner_content;
        WeakHashMap weakHashMap = b.a;
        this.g = (View) rp31.d(fullScreenBannerModalView, i);
        int v = xw31.v();
        int u = xw31.u();
        int i2 = (int) (v * 0.2f);
        int i3 = (v - i2) / 2;
        this.h = new Rect(i3, u, i2 + i3, ((int) (u * 0.2f)) + u);
    }

    @Override // defpackage.hsf0
    public final Rect c() {
        return this.h;
    }

    @Override // defpackage.hsf0
    public final void i(float f, float f2, float f3, float f4, float f5) {
        hsf0.h(this.g, f, f2, f3, f4, f5);
    }

    @Override // defpackage.hsf0
    public final void j(float f, float f2, float f3, float f4) {
    }

    @Override // defpackage.hsf0
    public final void m(float f, float f2) {
        hsf0.l(f, f2, this.g);
    }
}
