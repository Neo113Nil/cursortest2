package com.yandex.go.scooters.insurance.suggest;

import android.content.Context;
import com.yandex.go.scooters.domain.r;
import defpackage.aun0;
import defpackage.bun0;
import defpackage.ehn0;
import defpackage.gus;
import defpackage.m230;
import defpackage.n3o0;
import defpackage.u45;
import defpackage.w030;
import defpackage.xtn0;
import defpackage.yvf0;
import defpackage.zsn0;
import defpackage.ztn0;
import defpackage.zz7;

/* loaded from: classes13.dex */
public final class d extends m230 {
    public final w030 E;
    public final yvf0 F;
    public final yvf0 G;
    public final yvf0 H;
    public final bun0 I;
    public final xtn0 J;

    public d(w030 w030Var, yvf0 yvf0Var, yvf0 yvf0Var2, yvf0 yvf0Var3, bun0 bun0Var, xtn0 xtn0Var) {
        super(null);
        this.E = w030Var;
        this.F = yvf0Var;
        this.G = yvf0Var2;
        this.H = yvf0Var3;
        this.I = bun0Var;
        this.J = xtn0Var;
    }

    @Override // defpackage.m230
    public final w030 P() {
        return this.E;
    }

    @Override // defpackage.m230
    public final boolean Q() {
        return true;
    }

    @Override // defpackage.m230
    public final u45 S(Object obj) {
        n3o0 n3o0Var = ((ztn0) obj).a;
        ScootersInsuranceSuggestRouter$provideModalView$1 scootersInsuranceSuggestRouter$provideModalView$1 = new ScootersInsuranceSuggestRouter$provideModalView$1(0, this, d.class, "goBack", "goBack(Lkotlin/jvm/functions/Function1;)V", 0);
        ScootersInsuranceSuggestRouter$provideModalView$2 scootersInsuranceSuggestRouter$provideModalView$2 = new ScootersInsuranceSuggestRouter$provideModalView$2(1, this, d.class, "showErrorDialog", "showErrorDialog(Ljava/lang/Throwable;)V", 0);
        ScootersInsuranceSuggestRouter$provideModalView$3 scootersInsuranceSuggestRouter$provideModalView$3 = new ScootersInsuranceSuggestRouter$provideModalView$3(1, this, d.class, "showInsuranceStory", "showInsuranceStory(Ljava/lang/String;)V", 0);
        ScootersInsuranceSuggestRouter$provideModalView$4 scootersInsuranceSuggestRouter$provideModalView$4 = new ScootersInsuranceSuggestRouter$provideModalView$4(2, this, d.class, "showInsuranceDetails", "showInsuranceDetails(Ljava/lang/CharSequence;Ljava/util/List;)V", 0);
        zz7 zz7Var = this.I.a;
        aun0 aun0Var = new aun0((r) zz7Var.a.get(), (com.yandex.go.scooters.insurance.data.b) zz7Var.b.get(), scootersInsuranceSuggestRouter$provideModalView$3, n3o0Var, scootersInsuranceSuggestRouter$provideModalView$4);
        ehn0 ehn0Var = new ehn0(7, this);
        gus gusVar = this.J.a;
        return new ScootersInsuranceSuggestModalView((Context) gusVar.a.get(), (zsn0) gusVar.b.get(), scootersInsuranceSuggestRouter$provideModalView$1, ehn0Var, scootersInsuranceSuggestRouter$provideModalView$2, aun0Var);
    }
}
