package com.yandex.fintechsdk.features.bdui.internal.presentation.action.card.pay.open;

import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import defpackage.c770;
import defpackage.fp51;
import defpackage.iee;
import defpackage.ig5;
import defpackage.jg5;
import defpackage.jh5;
import defpackage.ns31;
import defpackage.rbs;
import defpackage.tje;
import defpackage.tse;
import defpackage.z22;

/* loaded from: classes12.dex */
public final class a implements jg5 {
    public final z22 a;
    public final iee b;
    public final rbs c;
    public final ns31 w;
    public final fp51 x;

    public a(z22 z22Var, iee ieeVar, rbs rbsVar, ns31 ns31Var, fp51 fp51Var) {
        this.a = z22Var;
        this.b = ieeVar;
        this.c = rbsVar;
        this.w = ns31Var;
        this.x = fp51Var;
    }

    @Override // defpackage.jg5
    public final void y(ig5 ig5Var, jh5 jh5Var) {
        tse tseVar;
        ViewGroup viewGroup;
        FragmentActivity fragmentActivity;
        if (!(ig5Var instanceof c770) || (tseVar = (tse) this.w.a()) == null || (viewGroup = (ViewGroup) this.b.a()) == null || (fragmentActivity = (FragmentActivity) this.c.a()) == null) {
            return;
        }
        tje.N(tseVar, null, null, new OpenPayCardActionHandler$handle$1(this, viewGroup, fragmentActivity, ig5Var, jh5Var, null), 3);
    }
}
