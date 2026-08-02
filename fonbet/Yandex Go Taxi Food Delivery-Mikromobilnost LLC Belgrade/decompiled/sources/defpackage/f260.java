package defpackage;

import ru.yandex.video.m3.player.impl.load_control.MultiplatformLoadControlFactory;

/* loaded from: classes7.dex */
public final class f260 implements cq6 {
    public final MultiplatformLoadControlFactory.NetworkTypeProviderAdapter a;
    public final double b;
    public final double c;
    public final double d;

    public f260(MultiplatformLoadControlFactory.NetworkTypeProviderAdapter networkTypeProviderAdapter, double d, double d2, double d3) {
        this.a = networkTypeProviderAdapter;
        this.b = d;
        this.c = d2;
        this.d = d3;
    }

    @Override // defpackage.cq6
    public final Double a(md6 md6Var) {
        double d;
        switch (e260.a[this.a.getNetworkType().ordinal()]) {
            case 1:
                d = this.c;
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                d = this.d;
                break;
            default:
                d = this.b;
                break;
        }
        return Double.valueOf(d);
    }
}
