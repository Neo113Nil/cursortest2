package defpackage;

import com.yandex.div2.DivPager$ItemAlignment;

/* loaded from: classes.dex */
public final class aua0 extends p2l implements qer {
    public final float d;
    public final float e;
    public final boolean f;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public aua0(t0l t0lVar, rvo rvoVar, int i, l2l l2lVar, DivPager$ItemAlignment divPager$ItemAlignment) {
        super(i, l2lVar, divPager$ItemAlignment);
        float f;
        float f2;
        float f3;
        double doubleValue = ((Number) t0lVar.a.a.a(rvoVar)).doubleValue();
        float f4 = (float) ((i * doubleValue) / 100.0d);
        this.d = f4;
        int i2 = zta0.a[divPager$ItemAlignment.ordinal()];
        if (i2 == 1) {
            f = i;
            f2 = l2lVar.g;
        } else if (i2 == 2) {
            f3 = (i - f4) / 2.0f;
            this.e = f3;
            this.f = doubleValue < 100.0d;
        } else {
            if (i2 != 3) {
                w511.b();
                throw null;
            }
            f = i;
            f2 = l2lVar.h;
        }
        f3 = (f - f2) - f4;
        this.e = f3;
        this.f = doubleValue < 100.0d;
    }

    @Override // defpackage.qer
    public final float a() {
        return this.d;
    }

    @Override // defpackage.qer
    public final float b() {
        return this.e;
    }

    @Override // defpackage.qer
    public final boolean c() {
        return this.f;
    }

    @Override // defpackage.p2l
    public final Float f(int i) {
        return Float.valueOf(this.d);
    }
}
