package defpackage;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes10.dex */
public final class hvt0 extends i35 {
    public final PointF i;
    public final PointF j;
    public final kor k;
    public final kor l;
    public puz m;
    public puz n;

    public hvt0(kor korVar, kor korVar2) {
        super(Collections.EMPTY_LIST);
        this.i = new PointF();
        this.j = new PointF();
        this.k = korVar;
        this.l = korVar2;
        j(this.d);
    }

    @Override // defpackage.i35
    public final Object f() {
        return m();
    }

    @Override // defpackage.i35
    public final /* bridge */ /* synthetic */ Object g(rkx rkxVar, float f) {
        return m();
    }

    @Override // defpackage.i35
    public final void j(float f) {
        kor korVar = this.k;
        korVar.j(f);
        kor korVar2 = this.l;
        korVar2.j(f);
        this.i.set(((Float) korVar.f()).floatValue(), ((Float) korVar2.f()).floatValue());
        int i = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                return;
            }
            ((e35) arrayList.get(i)).d();
            i++;
        }
    }

    public final PointF m() {
        Float f;
        kor korVar;
        rkx b;
        kor korVar2;
        rkx b2;
        Float f2 = null;
        if (this.m == null || (b2 = (korVar2 = this.k).b()) == null) {
            f = null;
        } else {
            Float f3 = b2.h;
            puz puzVar = this.m;
            float f4 = b2.g;
            f = (Float) puzVar.b(f4, f3 == null ? f4 : f3.floatValue(), (Float) b2.b, (Float) b2.c, korVar2.d(), korVar2.e(), korVar2.d);
        }
        if (this.n != null && (b = (korVar = this.l).b()) != null) {
            Float f5 = b.h;
            puz puzVar2 = this.n;
            float f6 = b.g;
            f2 = (Float) puzVar2.b(f6, f5 == null ? f6 : f5.floatValue(), (Float) b.b, (Float) b.c, korVar.d(), korVar.e(), korVar.d);
        }
        PointF pointF = this.i;
        PointF pointF2 = this.j;
        if (f == null) {
            pointF2.set(pointF.x, 0.0f);
        } else {
            pointF2.set(f.floatValue(), 0.0f);
        }
        if (f2 == null) {
            pointF2.set(pointF2.x, pointF.y);
            return pointF2;
        }
        pointF2.set(pointF2.x, f2.floatValue());
        return pointF2;
    }

    public final void n(puz puzVar) {
        puz puzVar2 = this.m;
        if (puzVar2 != null) {
            puzVar2.getClass();
        }
        this.m = puzVar;
    }

    public final void o(puz puzVar) {
        puz puzVar2 = this.n;
        if (puzVar2 != null) {
            puzVar2.getClass();
        }
        this.n = puzVar;
    }
}
