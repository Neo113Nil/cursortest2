package com.yandex.go.tariffcard.interactor;

import defpackage.kdd0;
import defpackage.oxu0;
import defpackage.tpr;
import defpackage.zkz0;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes14.dex */
public final class a {
    public final kdd0 a;
    public final oxu0 b;
    public final zkz0 c;

    public a(kdd0 kdd0Var, oxu0 oxu0Var, zkz0 zkz0Var) {
        this.a = kdd0Var;
        this.b = oxu0Var;
        this.c = zkz0Var;
    }

    public final m0 a(tpr tprVar) {
        return new m0(new m0(((ru.yandex.taxi.styling.g) this.b).d(), tprVar, new GroupedRequirementsItemInteractor$styledRequirementsFlow$1(this, null)), this.c.b, new GroupedRequirementsItemInteractor$itemsFlow$1(this, null));
    }
}
