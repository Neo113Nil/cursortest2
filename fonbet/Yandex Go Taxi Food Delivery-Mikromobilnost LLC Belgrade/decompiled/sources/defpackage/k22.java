package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.yandex.taxi.layers.LayersAnalyticEventEmmiter;

/* loaded from: classes9.dex */
public final class k22 {
    public final LayersAnalyticEventEmmiter a;
    public final i3y b;
    public final i3y c;
    public final i3y d;
    public final i3y e;
    public final i3y f;
    public final i3y g;
    public final i3y h;
    public final i3y i;

    public k22(LayersAnalyticEventEmmiter layersAnalyticEventEmmiter) {
        this.a = layersAnalyticEventEmmiter;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.b = a.b(lazyThreadSafetyMode, new ia1(23));
        this.c = a.b(lazyThreadSafetyMode, new ia1(24));
        this.d = a.b(lazyThreadSafetyMode, new ia1(25));
        this.e = a.b(lazyThreadSafetyMode, new ia1(26));
        this.f = a.b(lazyThreadSafetyMode, new ia1(27));
        this.g = a.b(lazyThreadSafetyMode, new ia1(28));
        this.h = a.b(lazyThreadSafetyMode, new ia1(29));
        this.i = a.b(lazyThreadSafetyMode, new i22(0));
    }
}
