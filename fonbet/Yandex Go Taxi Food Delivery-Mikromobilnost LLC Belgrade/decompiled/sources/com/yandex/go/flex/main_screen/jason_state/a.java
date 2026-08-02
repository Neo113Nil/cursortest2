package com.yandex.go.flex.main_screen.jason_state;

import android.content.Context;
import defpackage.k6x;
import defpackage.pzt0;
import defpackage.tse;
import json.state.disk.storage.feature.b;
import json.state.disk.storage.feature.c;

/* loaded from: classes.dex */
public final class a {
    public final k6x a;
    public final tse b;
    public final com.yandex.go.flex.common.utils.a c;
    public final c d;
    public final b e;
    public pzt0 f;

    public a(Context context, k6x k6xVar, tse tseVar, com.yandex.go.flex.common.utils.a aVar) {
        this.a = k6xVar;
        this.b = tseVar;
        this.c = aVar;
        c cVar = new c(context, "jason_flex_main_screen_storage");
        this.d = cVar;
        this.e = new b(k6xVar, cVar);
    }

    public final void a() {
        this.e.a();
        this.f = com.yandex.go.coroutines.b.g(this.b, null, null, new MainScreenFlexJasonStateDiskStorageRepository$start$1(this, null), 3);
    }
}
