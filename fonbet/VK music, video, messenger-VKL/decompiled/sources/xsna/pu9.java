package xsna;

import java.util.ArrayList;

/* compiled from: CarouselFlexLayoutStrategy1Ratio.kt */
/* loaded from: classes18.dex */
public final class pu9 implements opr {
    public final gzs<s3d0> a;
    public final mpr b = new mpr(0, 0, new ArrayList());

    public pu9(gzs<s3d0> gzsVar) {
        this.a = gzsVar;
    }

    @Override // xsna.opr
    public final mpr a(vor vorVar) {
        int i;
        int i2;
        mpr mprVar = this.b;
        mprVar.c.clear();
        int i3 = vorVar.c;
        int i4 = vorVar.d;
        float f = this.a.invoke().b;
        mprVar.a = i3;
        int floor = (int) Math.floor(i3 / f);
        mprVar.b = floor;
        int i5 = 0;
        if (floor > i4) {
            int b = an10.b(i4 * f);
            mprVar.b = i4;
            mprVar.a = i3;
            int i6 = (i3 - b) / 2;
            i2 = i6;
            i = i6 + b;
        } else {
            i = i3;
            i2 = 0;
        }
        for (Object obj : vorVar.e) {
            int i7 = i5 + 1;
            if (i5 < 0) {
                e43.t();
                throw null;
            }
            mprVar.c.add(new v0u0(((t0u0) obj).a, i2, i, mprVar.b, 4, 0));
            i5 = i7;
        }
        return mprVar;
    }
}
