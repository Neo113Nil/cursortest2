package xsna;

import com.vk.dto.attaches.CarouselRatio;

/* compiled from: GridStrategyProvider.kt */
/* loaded from: classes4.dex */
public final class lgu implements ppr {
    public final ou9 c;
    public final t5t b = new t5t();
    public final int d = 10;

    public lgu(gzs<CarouselRatio> gzsVar) {
        this.c = new ou9(gzsVar);
    }

    @Override // xsna.ppr
    public final int a() {
        return this.d;
    }

    @Override // xsna.ppr
    public final npr b(int i) {
        if (i == 1) {
            return this.c;
        }
        int i2 = this.d;
        if (i > i2) {
            i = i2;
        }
        t5t t5tVar = this.b;
        t5tVar.e = i;
        return t5tVar;
    }
}
