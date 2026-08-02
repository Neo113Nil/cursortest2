package yads;

import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes10.dex */
public abstract class ry extends mo {
    public final HashMap h = new HashMap();
    public Handler i;
    public v93 j;

    public zn1 a(Object obj, zn1 zn1Var) {
        return zn1Var;
    }

    @Override // yads.mo
    public final void b() {
        for (qy qyVar : this.h.values()) {
            qyVar.a.b(qyVar.b);
        }
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public abstract void a(Object obj, mo moVar, w73 w73Var);

    @Override // yads.mo
    public void d() {
        Iterator it = this.h.values().iterator();
        while (it.hasNext()) {
            ((qy) it.next()).a.d();
        }
    }

    @Override // yads.mo
    public void e() {
        for (qy qyVar : this.h.values()) {
            qyVar.a.c(qyVar.b);
            qyVar.a.a((do1) qyVar.c);
            qyVar.a.a((qk0) qyVar.c);
        }
        this.h.clear();
    }

    @Override // yads.mo
    public final void a() {
        for (qy qyVar : this.h.values()) {
            qyVar.a.a(qyVar.b);
        }
    }

    public final void a(final Object obj, mo moVar) {
        if (!this.h.containsKey(obj)) {
            ao1 ao1Var = new ao1() { // from class: xsna.bcz0
                @Override // yads.ao1
                public final void a(yads.mo moVar2, yads.w73 w73Var) {
                    yads.ry.this.a(obj, moVar2, w73Var);
                }
            };
            py pyVar = new py(this, obj);
            this.h.put(obj, new qy(moVar, ao1Var, pyVar));
            Handler handler = this.i;
            handler.getClass();
            moVar.getClass();
            co1 co1Var = moVar.c;
            co1Var.getClass();
            co1Var.c.add(new bo1(handler, pyVar));
            Handler handler2 = this.i;
            handler2.getClass();
            pk0 pk0Var = moVar.d;
            pk0Var.getClass();
            pk0Var.c.add(new ok0(handler2, pyVar));
            v93 v93Var = this.j;
            zf2 zf2Var = this.g;
            if (zf2Var != null) {
                Looper myLooper = Looper.myLooper();
                Looper looper = moVar.e;
                if (looper != null && looper != myLooper) {
                    throw new IllegalArgumentException();
                }
                moVar.g = zf2Var;
                w73 w73Var = moVar.f;
                moVar.a.add(ao1Var);
                if (moVar.e == null) {
                    moVar.e = myLooper;
                    moVar.b.add(ao1Var);
                    moVar.a(v93Var);
                } else if (w73Var != null) {
                    moVar.b(ao1Var);
                    ao1Var.a(moVar, w73Var);
                }
                if (this.b.isEmpty()) {
                    moVar.a(ao1Var);
                    return;
                }
                return;
            }
            throw new IllegalStateException();
        }
        throw new IllegalArgumentException();
    }
}
