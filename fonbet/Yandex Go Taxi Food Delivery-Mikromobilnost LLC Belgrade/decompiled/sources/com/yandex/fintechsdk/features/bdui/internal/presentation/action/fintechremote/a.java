package com.yandex.fintechsdk.features.bdui.internal.presentation.action.fintechremote;

import defpackage.ig5;
import defpackage.jg5;
import defpackage.jh5;
import defpackage.lfh;
import defpackage.nbr;
import defpackage.obr;
import defpackage.rbr;
import defpackage.tje;
import defpackage.tse;
import defpackage.ype;

/* loaded from: classes12.dex */
public final class a implements jg5 {
    public final ype a;
    public final lfh b;
    public final tse c;

    public a(ype ypeVar, lfh lfhVar, tse tseVar) {
        this.a = ypeVar;
        this.b = lfhVar;
        this.c = tseVar;
    }

    @Override // defpackage.jg5
    public final void y(ig5 ig5Var, jh5 jh5Var) {
        if (ig5Var instanceof nbr) {
            String a = this.a.a();
            rbr rbrVar = ((nbr) ig5Var).a;
            tje.N(this.c, null, null, new FintechRemoteActionHandler$handle$1(this, new obr(a, rbrVar.c, rbrVar.a, rbrVar.b), ig5Var, jh5Var, null), 3);
        }
    }
}
