package com.yandex.go.pin.api.v2;

import android.view.animation.AccelerateDecelerateInterpolator;
import com.yandex.go.pin.api.v2.PinV2Component;
import defpackage.dv31;
import defpackage.tje;
import defpackage.uh6;
import defpackage.w511;
import ru.yandex.taxi.widget.map.SourceOnMapControl;

/* loaded from: classes8.dex */
public final class b extends dv31 {
    public final SourceOnMapControl k;
    public final float l;
    public final float m;
    public final float n;
    public float o;
    public float p;
    public float q;
    public final float r;
    public long s;
    public final long t;

    public b(PinV2Component pinV2Component, SourceOnMapControl sourceOnMapControl) {
        super(pinV2Component, PinV2Component.Position.DEFAULT);
        this.k = sourceOnMapControl;
        this.l = tje.x(pinV2Component.getContext(), 17.0f);
        float x = tje.x(pinV2Component.getContext(), 38.0f);
        this.m = x;
        float x2 = tje.x(pinV2Component.getContext(), 24.0f);
        this.n = x2;
        this.r = x - ((x - x2) / 2.0f);
        this.s = -1L;
        this.t = 800L;
        this.i = new AccelerateDecelerateInterpolator();
        this.h = 300L;
    }

    @Override // defpackage.dv31
    public final void a(Object obj, Object obj2) {
        float f;
        this.p = this.o;
        int i = a.a[((PinV2Component.Position) obj2).ordinal()];
        if (i == 1) {
            f = this.m;
        } else if (i == 2) {
            f = this.n;
        } else {
            if (i != 3) {
                w511.b();
                return;
            }
            f = this.l;
        }
        this.q = f;
        this.a.invalidate();
    }

    @Override // defpackage.dv31
    public final void d(Object obj, Object obj2) {
        this.s = -1L;
    }

    @Override // defpackage.dv31
    public final void f(float f) {
        float H = uh6.H(this.p, this.q, f);
        this.o = H;
        this.k.setTranslationY(-H);
    }
}
