package com.yandex.fintechsdk.features.bdui.internal.presentation.action.ftrequest;

import com.yandex.fintechsdk.adapters.flex.sdk.api.FlexAdapter;
import com.yandex.fintechsdk.features.bdui.internal.presentation.action.ftrequest.requester.c;
import defpackage.ig5;
import defpackage.j6p;
import defpackage.jg5;
import defpackage.jh5;
import defpackage.n6p;
import defpackage.ns31;
import defpackage.sh5;
import defpackage.tje;
import defpackage.tse;
import defpackage.wjm;
import defpackage.z22;

/* loaded from: classes12.dex */
public final class a implements jg5 {
    public final z22 a;
    public final wjm b;
    public final FlexAdapter c;
    public final c w;
    public final ns31 x;

    public a(z22 z22Var, wjm wjmVar, FlexAdapter flexAdapter, c cVar, ns31 ns31Var) {
        this.a = z22Var;
        this.b = wjmVar;
        this.c = flexAdapter;
        this.w = cVar;
        this.x = ns31Var;
    }

    @Override // defpackage.jg5
    public final void y(ig5 ig5Var, jh5 jh5Var) {
        tse tseVar;
        FlexAdapter flexAdapter;
        sh5 stateManager;
        if (!(ig5Var instanceof j6p) || (tseVar = (tse) this.x.a()) == null || (flexAdapter = this.c) == null || (stateManager = flexAdapter.getStateManager()) == null) {
            return;
        }
        tje.N(tseVar, null, null, new FTRequestActionHandler$handle$1(this, ig5Var, new n6p((j6p) ig5Var, jh5Var.a, stateManager, this.a), jh5Var, stateManager, null), 3);
    }
}
