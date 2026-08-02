package xsna;

import androidx.compose.foundation.text.Handle;
import kotlin.KotlinNothingValueException;
import xsna.zbi0;

/* compiled from: SelectionManager.kt */
/* loaded from: classes11.dex */
public final class xdi0 implements zdo0 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ bei0 b;

    public xdi0(boolean z, bei0 bei0Var) {
        this.a = z;
        this.b = bei0Var;
    }

    @Override // xsna.zdo0
    public final void a() {
        obi0 f;
        tny a;
        bei0 bei0Var = this.b;
        boolean z = this.a;
        if ((z ? (ov70) ((zak0) bei0Var.q).getValue() : (ov70) ((zak0) bei0Var.r).getValue()) == null || (f = bei0Var.f()) == null) {
            return;
        }
        cai0 c = bei0Var.c(z ? f.a : f.b);
        if (c == null || (a = c.a()) == null) {
            return;
        }
        long h = c.h(f, z);
        if ((9223372034707292159L & h) == 9205357640488583168L) {
            return;
        }
        ((zak0) bei0Var.t).setValue(new ov70(bei0Var.j().w(a, kdi0.a(h))));
        ((zak0) bei0Var.s).setValue(z ? Handle.SelectionStart : Handle.SelectionEnd);
        bei0Var.y = false;
        bei0Var.o();
    }

    @Override // xsna.zdo0
    public final void b() {
        bei0 bei0Var = this.b;
        bei0Var.y = true;
        bei0Var.o();
        ((zak0) bei0Var.s).setValue(null);
        ((zak0) bei0Var.t).setValue(null);
    }

    @Override // xsna.zdo0
    public final void c(long j, zbi0 zbi0Var) {
        bei0 bei0Var = this.b;
        if (bei0Var.e() == null) {
            return;
        }
        obi0 f = bei0Var.f();
        boolean z = this.a;
        cai0 b = bei0Var.a.c.b((z ? f.a : f.b).c);
        if (b == null) {
            xzw.d("SelectionRegistrar should contain the current selection's selectableIds");
            throw new KotlinNothingValueException();
        }
        cai0 cai0Var = b;
        tny a = cai0Var.a();
        if (a == null) {
            xzw.d("Current selectable should have layout coordinates.");
            throw new KotlinNothingValueException();
        }
        long h = cai0Var.h(f, z);
        if ((9223372034707292159L & h) == 9205357640488583168L) {
            return;
        }
        ((zak0) bei0Var.o).setValue(new ov70(bei0Var.j().w(a, kdi0.a(h))));
        ((zak0) bei0Var.p).setValue(new ov70(0L));
    }

    @Override // xsna.zdo0
    public final void d(long j) {
        bei0 bei0Var = this.b;
        wh50 wh50Var = bei0Var.o;
        wh50 wh50Var2 = bei0Var.p;
        if (bei0Var.e() == null) {
            return;
        }
        ((zak0) wh50Var2).setValue(new ov70(ov70.f(((ov70) ((zak0) wh50Var2).getValue()).a, j)));
        long f = ov70.f(((ov70) ((zak0) wh50Var).getValue()).a, ((ov70) ((zak0) wh50Var2).getValue()).a);
        if (bei0Var.n(f, ((ov70) ((zak0) wh50Var).getValue()).a, this.a, zbi0.a.d)) {
            ((zak0) wh50Var).setValue(new ov70(f));
            ((zak0) wh50Var2).setValue(new ov70(0L));
        }
    }

    @Override // xsna.zdo0
    public final void onCancel() {
        bei0 bei0Var = this.b;
        bei0Var.y = true;
        bei0Var.o();
        ((zak0) bei0Var.s).setValue(null);
        ((zak0) bei0Var.t).setValue(null);
    }

    @Override // xsna.zdo0
    public final void onStop() {
        bei0 bei0Var = this.b;
        bei0Var.y = true;
        bei0Var.o();
        ((zak0) bei0Var.s).setValue(null);
        ((zak0) bei0Var.t).setValue(null);
    }
}
