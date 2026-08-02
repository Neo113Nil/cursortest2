package com.yandex.fintechsdk.features.bdui.internal.presentation.action.yb.split.upgrade;

import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import defpackage.gb21;
import defpackage.iee;
import defpackage.ig5;
import defpackage.jg5;
import defpackage.jh5;
import defpackage.ns31;
import defpackage.rbs;
import defpackage.tje;
import defpackage.tse;

/* loaded from: classes12.dex */
public final class a implements jg5 {
    public final iee a;
    public final rbs b;
    public final com.yandex.fintechsdk.logic.yb.impl.upgrade.internal.a c;
    public final ns31 w;

    public a(iee ieeVar, rbs rbsVar, com.yandex.fintechsdk.logic.yb.impl.upgrade.internal.a aVar, ns31 ns31Var) {
        this.a = ieeVar;
        this.b = rbsVar;
        this.c = aVar;
        this.w = ns31Var;
    }

    @Override // defpackage.jg5
    public final void y(ig5 ig5Var, jh5 jh5Var) {
        tse tseVar;
        ViewGroup viewGroup;
        FragmentActivity fragmentActivity;
        if (!(ig5Var instanceof gb21) || (tseVar = (tse) this.w.a()) == null || (viewGroup = (ViewGroup) this.a.a()) == null || (fragmentActivity = (FragmentActivity) this.b.a()) == null) {
            return;
        }
        tje.N(tseVar, null, null, new UpgradeSplitActionHandler$handle$1(this, viewGroup, ig5Var, fragmentActivity, jh5Var, null), 3);
    }
}
