package com.yandex.go.superapp_favorites.flex;

import defpackage.aaw0;
import defpackage.ajr;
import defpackage.maw0;
import defpackage.rol0;
import defpackage.wnt;

/* loaded from: classes14.dex */
public final class a {
    public final maw0 a;
    public final ajr b;
    public final wnt c;
    public final com.yandex.div.core.expression.variables.a d;
    public final aaw0 e;

    public a(maw0 maw0Var, ajr ajrVar, wnt wntVar, com.yandex.div.core.expression.variables.a aVar, aaw0 aaw0Var) {
        this.a = maw0Var;
        this.b = ajrVar;
        this.c = wntVar;
        this.d = aVar;
        this.e = aaw0Var;
    }

    public final rol0 a() {
        return new rol0(new SuperappFavoritesLoadingActionEmitter$createDocumentLoadActions$1(this, null));
    }
}
