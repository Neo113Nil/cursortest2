package com.yandex.go.flex.main_screen.interactors;

import defpackage.h3y;
import defpackage.w9w0;
import defpackage.zzs;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes.dex */
public final class d {
    public final h3y a;
    public final w9w0 b;

    public d(h3y h3yVar, w9w0 w9w0Var) {
        this.a = h3yVar;
        this.b = w9w0Var;
    }

    public final Object a(zzs zzsVar, List list, ContinuationImpl continuationImpl) {
        return ((b) this.a.get()).b("mlutp/v1/widgets/layout/superapp", zzsVar, list, new MainScreenDocumentQueryFactory$createDocumentQuery$2(0, this, d.class, "createParams", "createParams()Ljava/util/Map;", 0), true, true, continuationImpl);
    }
}
