package com.yandex.go.flex.common.descriptors.action;

import defpackage.dmr;
import defpackage.dw;
import defpackage.hjt;
import defpackage.kr;
import defpackage.n6u;
import defpackage.tje;
import defpackage.w511;

/* loaded from: classes.dex */
public final class b implements dw {
    public final com.yandex.go.shortcuts.impl.interactors.e a;

    public b(com.yandex.go.shortcuts.impl.interactors.e eVar) {
        this.a = eVar;
    }

    @Override // defpackage.dw
    public final void handle(kr krVar, n6u n6uVar) {
        dmr dmrVar = (dmr) krVar;
        if (!(dmrVar instanceof MarkNotifyAction)) {
            w511.b();
        } else {
            tje.N(hjt.a, null, null, new FlexSideEffectHandler$handleMarkNotifyAction$1(this, (MarkNotifyAction) dmrVar, null), 3);
        }
    }
}
