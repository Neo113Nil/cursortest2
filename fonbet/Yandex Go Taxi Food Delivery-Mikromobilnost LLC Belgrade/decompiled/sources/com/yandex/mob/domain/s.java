package com.yandex.mob.domain;

import defpackage.ol20;
import defpackage.rol0;
import defpackage.un20;

/* loaded from: classes8.dex */
public final class s {
    public final com.yandex.mob.data.c a;
    public final un20 b;

    public s(com.yandex.mob.data.c cVar, un20 un20Var) {
        this.a = cVar;
        this.b = un20Var;
    }

    public final rol0 a(String str, ol20... ol20VarArr) {
        return new rol0(new SelectedProxyUseCase$invokeFlow$1(this, str, ol20VarArr, null));
    }
}
