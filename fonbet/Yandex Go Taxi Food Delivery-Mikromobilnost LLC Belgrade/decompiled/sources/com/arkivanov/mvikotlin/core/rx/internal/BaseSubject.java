package com.arkivanov.mvikotlin.core.rx.internal;

import defpackage.lxj;
import defpackage.n1k;
import defpackage.oq60;
import defpackage.rq60;
import defpackage.ta5;
import defpackage.va5;
import defpackage.wa5;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public class BaseSubject implements oq60 {
    public final lxj a = new lxj(new BaseSubject$serializer$1(1, this, BaseSubject.class, "onEvent", "onEvent(Lcom/arkivanov/mvikotlin/core/rx/internal/BaseSubject$Event;)V", 0));
    public LinkedHashMap b = new LinkedHashMap();

    @Override // defpackage.oq60
    public final void a(Object obj) {
        this.a.k(new va5(obj));
    }

    public void b(rq60 rq60Var) {
    }

    public void c(Object obj) {
    }

    public final n1k d(rq60 rq60Var) {
        n1k n1kVar = new n1k(new BaseSubject$subscribe$disposable$1(this));
        this.a.k(new wa5(rq60Var, n1kVar));
        return n1kVar;
    }

    @Override // defpackage.oq60
    public final void onComplete() {
        this.a.k(ta5.a);
    }
}
