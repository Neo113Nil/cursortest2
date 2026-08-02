package com.yandex.go.tips.ui.selector_v2;

import com.yandex.go.tips.experiments.TipsSettingsModalExperiment;
import defpackage.ad5;
import defpackage.avj0;
import defpackage.bdc;
import defpackage.ehz0;
import defpackage.hne0;
import defpackage.ihz0;
import defpackage.kyh0;
import defpackage.nfz0;
import defpackage.wpy0;
import defpackage.xng0;
import defpackage.zuj0;

/* loaded from: classes14.dex */
public final class a extends ad5 {
    public final nfz0 A;
    public int B;
    public final int C;
    public final ehz0 D;
    public final TipsSettingsModalExperiment x;
    public final wpy0 y;
    public final hne0 z;

    public a(TipsSettingsModalExperiment tipsSettingsModalExperiment, wpy0 wpy0Var, hne0 hne0Var, zuj0 zuj0Var, nfz0 nfz0Var) {
        super(ihz0.class);
        this.x = tipsSettingsModalExperiment;
        this.y = wpy0Var;
        this.z = hne0Var;
        this.A = nfz0Var;
        int s = hne0Var.d.a.s();
        this.B = s;
        this.C = s;
        this.D = new ehz0(((avj0) zuj0Var).h(kyh0.understand), new bdc(xng0.controlMinor), new bdc(xng0.textOnControlMinor), 0, new TipsSettingsPresenter$initButtonUiState$1(0, this, a.class, "close", "close()V", 0));
    }
}
