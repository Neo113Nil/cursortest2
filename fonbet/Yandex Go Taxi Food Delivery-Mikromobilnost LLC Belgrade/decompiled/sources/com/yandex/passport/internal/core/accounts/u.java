package com.yandex.passport.internal.core.accounts;

import com.yandex.passport.internal.database.DatabaseHelper;

/* loaded from: classes8.dex */
public final class u {
    public final long a;
    public final g b;
    public final com.yandex.passport.internal.usecase.t c;
    public final DatabaseHelper d;
    public final com.yandex.passport.common.ui.lang.b e;
    public final com.yandex.passport.data.mapper.a f;

    public u(long j, g gVar, com.yandex.passport.common.a aVar, com.yandex.passport.internal.usecase.t tVar, DatabaseHelper databaseHelper, com.yandex.passport.common.ui.lang.b bVar, com.yandex.passport.data.mapper.a aVar2) {
        this.a = j;
        this.b = gVar;
        this.c = tVar;
        this.d = databaseHelper;
        this.e = bVar;
        this.f = aVar2;
    }
}
