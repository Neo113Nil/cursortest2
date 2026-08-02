package com.yandex.go.chargers.error;

import defpackage.bvf0;
import defpackage.cy9;
import defpackage.zuj0;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class a {
    public final zuj0 a;
    public final ru.yandex.taxi.widget.c b;

    public a(zuj0 zuj0Var, ru.yandex.taxi.widget.c cVar) {
        this.a = zuj0Var;
        this.b = cVar;
    }

    public final Object a(cy9 cy9Var, ContinuationImpl continuationImpl) {
        return bvf0.n(new ChargersErrorMapperImpl$mapToUiState$2(cy9Var, this, null), continuationImpl);
    }
}
