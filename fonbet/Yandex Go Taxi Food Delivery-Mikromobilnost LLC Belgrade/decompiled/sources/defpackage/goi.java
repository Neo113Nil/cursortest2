package defpackage;

import com.yandex.go.delivery.sdd_slots_selector.DeliverySddIntervalsModalView;

/* loaded from: classes12.dex */
public final class goi extends m230 {
    public final w030 E;
    public final uq1 F;
    public final wwf G;
    public final boolean H;

    public goi(w030 w030Var, uq1 uq1Var, wwf wwfVar) {
        super(null);
        this.E = w030Var;
        this.F = uq1Var;
        this.G = wwfVar;
        this.H = true;
    }

    @Override // defpackage.m230
    public final w030 P() {
        return this.E;
    }

    @Override // defpackage.m230
    public final boolean Q() {
        return this.H;
    }

    @Override // defpackage.m230
    public final u45 S(Object obj) {
        hoi hoiVar = (hoi) obj;
        foi foiVar = new foi(this);
        boi boiVar = new boi(hoiVar.a, hoiVar.b, hoiVar.c);
        wwf wwfVar = this.G;
        wwfVar.getClass();
        return (DeliverySddIntervalsModalView) i5m.b(new wif((xvf0) new pyf(wwfVar, 0), i5m.b(new bpf((xvf0) new pyf(wwfVar, 1), (xvf0) n3w.a(boiVar), (xvf0) n3w.a(foiVar), (xvf0) new pyf(wwfVar, 2), 15)), 26)).get();
    }
}
