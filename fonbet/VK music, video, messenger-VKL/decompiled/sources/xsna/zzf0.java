package xsna;

import androidx.compose.foundation.gestures.Orientation;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import xsna.d0g0;

/* compiled from: ReorderableLazyListState.kt */
/* loaded from: classes17.dex */
public final class zzf0 extends d0g0<xuy> {
    public final xvy o;

    public zzf0(xvy xvyVar, yvj yvjVar, float f, wzs wzsVar, wzs wzsVar2, wzs wzsVar3, umk0 umk0Var) {
        super(yvjVar, f, wzsVar, wzsVar2, wzsVar3, umk0Var);
        this.o = xvyVar;
    }

    @Override // xsna.d0g0
    public final xuy b(xuy xuyVar, List<? extends xuy> list, int i, int i2) {
        xuy xuyVar2 = xuyVar;
        return v() ? (xuy) super.b(xuyVar2, list, 0, i2) : (xuy) super.b(xuyVar2, list, i, 0);
    }

    @Override // xsna.d0g0
    public final ArrayList c(int i, int i2, Object obj) {
        xuy xuyVar = (xuy) obj;
        return v() ? super.c(0, i2, xuyVar) : super.c(i, 0, xuyVar);
    }

    @Override // xsna.d0g0
    public final int d(xuy xuyVar) {
        xuy xuyVar2 = xuyVar;
        if (!v()) {
            return 0;
        }
        xvy xvyVar = this.o;
        if (xvyVar.j().i()) {
            return ((int) (xvyVar.j().a() & 4294967295L)) - xuyVar2.getOffset();
        }
        return xuyVar2.getSize() + xuyVar2.getOffset();
    }

    @Override // xsna.d0g0
    public final int j() {
        return this.o.h();
    }

    @Override // xsna.d0g0
    public final int k() {
        return this.o.i();
    }

    @Override // xsna.d0g0
    public final int l(xuy xuyVar) {
        xuy xuyVar2 = xuyVar;
        if (v()) {
            return xuyVar2.getSize();
        }
        return 0;
    }

    @Override // xsna.d0g0
    public final int m(xuy xuyVar) {
        return xuyVar.getIndex();
    }

    @Override // xsna.d0g0
    public final Object n(xuy xuyVar) {
        return xuyVar.getKey();
    }

    @Override // xsna.d0g0
    public final int o(xuy xuyVar) {
        xuy xuyVar2 = xuyVar;
        if (v()) {
            return 0;
        }
        xvy xvyVar = this.o;
        return xvyVar.j().i() ? (((int) (xvyVar.j().a() >> 32)) - xuyVar2.getOffset()) - xuyVar2.getSize() : xuyVar2.getOffset();
    }

    @Override // xsna.d0g0
    public final int p(xuy xuyVar) {
        xuy xuyVar2 = xuyVar;
        if (v()) {
            return 0;
        }
        xvy xvyVar = this.o;
        if (xvyVar.j().i()) {
            return ((int) (xvyVar.j().a() >> 32)) - xuyVar2.getOffset();
        }
        return xuyVar2.getSize() + xuyVar2.getOffset();
    }

    @Override // xsna.d0g0
    public final int q(xuy xuyVar) {
        xuy xuyVar2 = xuyVar;
        if (!v()) {
            return 0;
        }
        xvy xvyVar = this.o;
        return xvyVar.j().i() ? (((int) (xvyVar.j().a() & 4294967295L)) - xuyVar2.getOffset()) - xuyVar2.getSize() : xuyVar2.getOffset();
    }

    @Override // xsna.d0g0
    public final int r() {
        return this.o.j().h();
    }

    @Override // xsna.d0g0
    public final int s() {
        return this.o.j().g();
    }

    @Override // xsna.d0g0
    public final List<xuy> t() {
        return this.o.j().f();
    }

    @Override // xsna.d0g0
    public final int u(xuy xuyVar) {
        xuy xuyVar2 = xuyVar;
        if (v()) {
            return 0;
        }
        return xuyVar2.getSize();
    }

    @Override // xsna.d0g0
    public final boolean v() {
        return this.o.j().getOrientation() == Orientation.Vertical;
    }

    @Override // xsna.d0g0
    public final boolean y(int i, int i2) {
        return v() ? super.y(0, i2) : super.y(i, 0);
    }

    @Override // xsna.d0g0
    public final Object z(int i, int i2, d0g0.a aVar) {
        Object k = this.o.k(i, i2, aVar);
        return k == CoroutineSingletons.COROUTINE_SUSPENDED ? k : s3q0.a;
    }
}
