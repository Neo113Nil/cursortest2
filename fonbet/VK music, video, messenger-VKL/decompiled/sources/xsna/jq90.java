package xsna;

import android.graphics.Path;
import android.view.MotionEvent;
import java.util.ArrayList;
import xsna.k760;

/* compiled from: PathElementProducer.kt */
/* loaded from: classes4.dex */
public final class jq90 implements yap<hq90> {
    public final Object a;
    public final eq90 b;
    public final mlb0 c;
    public final Object d;
    public final boolean e;
    public final ArrayList f;
    public final ArrayList g;
    public final Path h;
    public boolean i;

    public jq90(cq90 cq90Var, eq90 eq90Var, Object obj) {
        crx0 crx0Var = crx0.H;
        this.a = cq90Var;
        this.b = eq90Var;
        this.c = crx0Var;
        this.d = obj;
        this.e = cq90Var.b();
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = new Path();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, xsna.cq90] */
    @Override // xsna.yap
    public final void a(mlo mloVar) {
        this.a.a(mloVar, this.h);
    }

    @Override // xsna.yap
    public final boolean b() {
        return this.e;
    }

    @Override // xsna.yap
    public final void c(MotionEvent motionEvent) {
        ArrayList arrayList = this.f;
        arrayList.clear();
        ArrayList arrayList2 = this.g;
        arrayList2.clear();
        Path path = this.h;
        path.rewind();
        fo50.n(arrayList, new glb0(motionEvent.getX(), motionEvent.getY(), Float.valueOf(motionEvent.getPressure())));
        this.c.b(arrayList, arrayList2, false);
        eq90.d(this.b, arrayList2, path, false, 12);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, xsna.cq90] */
    @Override // xsna.yap
    public final hq90 create() {
        ArrayList arrayList = this.g;
        if (arrayList.isEmpty()) {
            return null;
        }
        return new hq90(j5g.O0(arrayList), new Path(this.h), this.a, this.b, this.i, this.d);
    }

    @Override // xsna.yap
    public final void d(MotionEvent motionEvent, k760.a aVar) {
        glb0 glb0Var = new glb0(motionEvent.getX(), motionEvent.getY(), Float.valueOf(motionEvent.getPressure()));
        ArrayList arrayList = this.f;
        fo50.n(arrayList, glb0Var);
        this.i = true;
        mlb0 mlb0Var = this.c;
        ArrayList arrayList2 = this.g;
        mlb0Var.b(arrayList, arrayList2, true);
        eq90.d(this.b, arrayList2, this.h, true, 8);
        aVar.invoke();
    }

    @Override // xsna.yap
    public final void e(MotionEvent motionEvent) {
        glb0 glb0Var = new glb0(motionEvent.getX(), motionEvent.getY(), Float.valueOf(motionEvent.getPressure()));
        ArrayList arrayList = this.f;
        fo50.n(arrayList, glb0Var);
        mlb0 mlb0Var = this.c;
        ArrayList arrayList2 = this.g;
        mlb0Var.b(arrayList, arrayList2, false);
        eq90.d(this.b, arrayList2, this.h, false, 12);
    }

    @Override // xsna.yap
    public final boolean f() {
        return false;
    }

    @Override // xsna.yap
    public final void reset() {
        this.f.clear();
        this.g.clear();
        this.h.rewind();
        this.i = false;
    }
}
