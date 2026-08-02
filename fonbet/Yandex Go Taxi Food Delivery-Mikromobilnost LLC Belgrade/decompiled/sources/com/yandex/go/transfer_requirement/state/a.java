package com.yandex.go.transfer_requirement.state;

import defpackage.bvf0;
import defpackage.ulx0;
import defpackage.yo01;
import defpackage.zh01;
import kotlin.coroutines.Continuation;

/* loaded from: classes14.dex */
public final class a {
    public final com.yandex.go.transfer_requirement.state.done_button.a a;
    public final com.yandex.go.transfer_requirement.state.rules.a b;
    public final com.yandex.go.transfer_requirement.state.service_section.a c;
    public final com.yandex.go.transfer_requirement.state.meeting.a d;
    public final zh01 e;
    public final ulx0 f;

    public a(com.yandex.go.transfer_requirement.state.done_button.a aVar, com.yandex.go.transfer_requirement.state.rules.a aVar2, com.yandex.go.transfer_requirement.state.service_section.a aVar3, com.yandex.go.transfer_requirement.state.meeting.a aVar4, zh01 zh01Var, ulx0 ulx0Var) {
        this.a = aVar;
        this.b = aVar2;
        this.c = aVar3;
        this.d = aVar4;
        this.e = zh01Var;
        this.f = ulx0Var;
    }

    public final Object a(yo01 yo01Var, Continuation continuation) {
        return bvf0.n(new TransferRequirementModalViewStateDataSource$getStateFlow$2(this, yo01Var, null), continuation);
    }
}
