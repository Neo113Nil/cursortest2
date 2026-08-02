package com.yandex.go.summary.requirements.list.requirementgroup;

import android.content.Context;
import com.yandex.go.zone.dto.objects.TariffInfoGroupDefinition;
import defpackage.gus;
import defpackage.khj0;
import defpackage.lxo0;
import defpackage.mu5;
import defpackage.ohj0;
import defpackage.pgd;
import defpackage.qoe0;
import defpackage.roe0;
import defpackage.roj0;
import defpackage.tgb0;
import defpackage.tje;
import defpackage.w030;
import defpackage.wfd;

/* loaded from: classes14.dex */
public final class d extends pgd {
    public final Context F;
    public final w030 G;
    public final roe0 H;
    public final tgb0 I;
    public final mu5 J;

    public d(Context context, w030 w030Var, ohj0 ohj0Var, khj0 khj0Var, roe0 roe0Var, tgb0 tgb0Var) {
        super(0);
        this.F = context;
        this.G = w030Var;
        this.H = roe0Var;
        this.I = tgb0Var;
        this.J = new mu5(new lxo0(19, this, ohj0Var, khj0Var));
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        gus gusVar = this.H.a;
        tje.N(o(), null, null, new SpecialNeedsComposeRouter$onLaunch$1(new qoe0((TariffInfoGroupDefinition) obj, (roj0) gusVar.a.get(), (ru.yandex.taxi.summary.requirements.list.router.a) gusVar.b.get()), null), 3);
    }

    @Override // defpackage.pgd
    public final wfd P() {
        return this.J;
    }

    @Override // defpackage.pgd
    public final Context Q() {
        return this.F;
    }

    @Override // defpackage.pgd
    public final w030 S() {
        return this.G;
    }
}
