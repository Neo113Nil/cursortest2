package defpackage;

import ru.yandex.video.m3.player.impl.load_control.MultiplatformLoadControlFactory;

/* loaded from: classes7.dex */
public final class az50 implements cq6 {
    public final f260 a;
    public final double b;
    public final MultiplatformLoadControlFactory.NetworkQualityProviderAdapter c;

    public az50(f260 f260Var, double d, MultiplatformLoadControlFactory.NetworkQualityProviderAdapter networkQualityProviderAdapter) {
        this.a = f260Var;
        this.b = d;
        this.c = networkQualityProviderAdapter;
    }

    @Override // defpackage.cq6
    public final Double a(md6 md6Var) {
        Double a = this.a.a(md6Var);
        double doubleValue = a.doubleValue();
        if (!this.c.isGoodNetwork()) {
            return a;
        }
        return Double.valueOf(Math.max(doubleValue - (r2.getGoodNetworkCounter() * 1.0d), this.b * doubleValue));
    }
}
