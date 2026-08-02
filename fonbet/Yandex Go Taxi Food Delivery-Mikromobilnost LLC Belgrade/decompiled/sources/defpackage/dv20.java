package defpackage;

import com.yandex.pulse.mvi.tracker.TimeToInteractiveTracker;

/* loaded from: classes8.dex */
public final /* synthetic */ class dv20 implements thw0 {
    public final /* synthetic */ ev20 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ fv20 w;

    public /* synthetic */ dv20(ev20 ev20Var, long j, long j2, fv20 fv20Var) {
        this.a = ev20Var;
        this.b = j;
        this.c = j2;
        this.w = fv20Var;
    }

    @Override // defpackage.thw0
    public final Object get() {
        ev20 ev20Var = this.a;
        zu20 zu20Var = new zu20(ev20Var, 4);
        ioz iozVar = ev20Var.g;
        boolean z = ev20Var.h;
        this.w.getClass();
        return new TimeToInteractiveTracker(zu20Var, iozVar, this.b, this.c, z);
    }
}
