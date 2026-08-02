package com.yandex.go.shortcuts.impl.interactors;

import com.yandex.go.shortcuts.dto.response.ProductsResponse;
import defpackage.ezs;
import defpackage.hbp0;
import defpackage.pzt0;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;

/* loaded from: classes8.dex */
public final class f implements vpr {
    public final /* synthetic */ g a;

    public f(g gVar) {
        this.a = gVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        ProductsResponse c = ((ezs) obj).c();
        g gVar = this.a;
        pzt0 pzt0Var = gVar.f;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        ((ru.yandex.taxi.stories.data.caching.a) gVar.c.get()).i();
        gVar.f = hbp0.e(gVar.g, null, null, new MediaShortcutInteractor$preloadMediaShortcuts$1(c, gVar, null), 3);
        return zy11.a;
    }
}
