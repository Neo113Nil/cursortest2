package com.yandex.fintechsdk.features.bdui.internal.presentation.action.card.pay.topup;

import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import defpackage.fp51;
import defpackage.iee;
import defpackage.ig5;
import defpackage.jg5;
import defpackage.jh5;
import defpackage.ns31;
import defpackage.rbs;
import defpackage.tje;
import defpackage.tse;
import defpackage.vwz0;

/* loaded from: classes12.dex */
public final class a implements jg5 {
    public final iee a;
    public final rbs b;
    public final ns31 c;
    public final fp51 w;

    public a(iee ieeVar, rbs rbsVar, ns31 ns31Var, fp51 fp51Var) {
        this.a = ieeVar;
        this.b = rbsVar;
        this.c = ns31Var;
        this.w = fp51Var;
    }

    @Override // defpackage.jg5
    public final void y(ig5 ig5Var, jh5 jh5Var) {
        FragmentActivity fragmentActivity;
        ViewGroup viewGroup;
        fp51 fp51Var;
        tse tseVar;
        if (!(ig5Var instanceof vwz0) || (fragmentActivity = (FragmentActivity) this.b.a()) == null || (viewGroup = (ViewGroup) this.a.a()) == null || (fp51Var = this.w) == null || (tseVar = (tse) this.c.a()) == null) {
            return;
        }
        tje.N(tseVar, null, null, new TopUpPayCardActionHandler$handle$1(ig5Var, fp51Var, viewGroup, fragmentActivity, jh5Var, null), 3);
    }
}
