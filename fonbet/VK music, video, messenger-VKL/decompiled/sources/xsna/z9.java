package xsna;

import java.util.ArrayList;

/* compiled from: AbsColorWheelRenderer.java */
/* loaded from: classes12.dex */
public abstract class z9 implements g9g {
    public Object a;
    public Object b;

    public /* synthetic */ z9(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // xsna.g9g
    public ArrayList a() {
        return (ArrayList) this.b;
    }

    @Override // xsna.g9g
    public void b(f9g f9gVar) {
        this.a = f9gVar;
        this.b = new ArrayList();
    }

    @Override // xsna.g9g
    public f9g c() {
        if (((f9g) this.a) == null) {
            this.a = new f9g();
        }
        return (f9g) this.a;
    }

    public abstract void d(mwx mwxVar);

    public xza0 e() {
        xza0 xza0Var = ((ko4) this.a).c.e;
        if (xza0Var != null) {
            return xza0Var;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public void f(com.vk.music.player.f fVar) {
        this.a = fVar.b();
        ugp0 ugp0Var = (ugp0) this.b;
        ugp0Var.a = fVar.e();
        ugp0Var.b = fVar.h();
        ugp0Var.c = fVar.d();
    }

    public void g(izs izsVar) {
        Object value;
        utk0 utk0Var = (utk0) this.a;
        do {
            value = utk0Var.getValue();
        } while (!utk0Var.compareAndSet(value, izsVar.invoke(value)));
    }

    public z9(nwx nwxVar) {
        utk0 a = vtk0.a(nwxVar);
        this.a = a;
        this.b = rsr.f(a);
    }
}
