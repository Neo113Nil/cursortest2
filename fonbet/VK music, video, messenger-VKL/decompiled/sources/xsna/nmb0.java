package xsna;

import android.view.MotionEvent;
import java.util.ArrayList;
import xsna.k760;

/* compiled from: PointsElementProducer.kt */
/* loaded from: classes4.dex */
public final class nmb0 implements yap<mmb0> {
    public final gif0 a;
    public final kx90 b;
    public final Object c;
    public final boolean d = false;
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final ArrayList g = new ArrayList();
    public boolean h;

    public nmb0(gif0 gif0Var, kx90 kx90Var, Object obj) {
        this.a = gif0Var;
        this.b = kx90Var;
        this.c = obj;
    }

    @Override // xsna.yap
    public final void a(mlo mloVar) {
        this.a.c(mloVar, this.g);
    }

    @Override // xsna.yap
    public final boolean b() {
        return this.d;
    }

    @Override // xsna.yap
    public final void c(MotionEvent motionEvent) {
        ArrayList arrayList = this.e;
        arrayList.clear();
        ArrayList arrayList2 = this.f;
        arrayList2.clear();
        ArrayList arrayList3 = this.g;
        arrayList3.clear();
        kx90 kx90Var = this.b;
        kx90Var.c();
        fo50.n(arrayList, new glb0(motionEvent.getX(), motionEvent.getY(), Float.valueOf(motionEvent.getPressure())));
        kx90Var.a(arrayList, arrayList2, false);
        g5g.y(arrayList2, arrayList3);
    }

    @Override // xsna.yap
    public final mmb0 create() {
        ArrayList arrayList = this.g;
        if (arrayList.isEmpty()) {
            return null;
        }
        return new mmb0(j5g.O0(arrayList), this.a, this.h, this.c);
    }

    @Override // xsna.yap
    public final void d(MotionEvent motionEvent, k760.a aVar) {
        glb0 glb0Var = new glb0(motionEvent.getX(), motionEvent.getY(), Float.valueOf(motionEvent.getPressure()));
        ArrayList arrayList = this.e;
        fo50.n(arrayList, glb0Var);
        this.h = true;
        kx90 kx90Var = this.b;
        ArrayList arrayList2 = this.f;
        kx90Var.a(arrayList, arrayList2, true);
        g5g.y(arrayList2, this.g);
        aVar.invoke();
    }

    @Override // xsna.yap
    public final void e(MotionEvent motionEvent) {
        glb0 glb0Var = new glb0(motionEvent.getX(), motionEvent.getY(), Float.valueOf(motionEvent.getPressure()));
        ArrayList arrayList = this.e;
        fo50.n(arrayList, glb0Var);
        kx90 kx90Var = this.b;
        ArrayList arrayList2 = this.f;
        kx90Var.a(arrayList, arrayList2, false);
        g5g.y(arrayList2, this.g);
    }

    @Override // xsna.yap
    public final boolean f() {
        return false;
    }

    @Override // xsna.yap
    public final void reset() {
        this.e.clear();
        this.f.clear();
        this.g.clear();
        this.h = false;
        this.b.c();
    }
}
