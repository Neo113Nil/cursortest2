package com.yandex.go.lifecycle;

import defpackage.noh;
import defpackage.tje;
import java.util.function.UnaryOperator;
import kotlinx.coroutines.CoroutineStart;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements UnaryOperator {
    public final /* synthetic */ c a;

    public /* synthetic */ b(c cVar) {
        this.a = cVar;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        noh nohVar = (noh) obj;
        if (nohVar != null) {
            return nohVar;
        }
        c cVar = this.a;
        return tje.h(cVar.a(), null, CoroutineStart.LAZY, new ObtainInstanceListener$getOrCreateDeferred$1$1(cVar, null), 1);
    }
}
