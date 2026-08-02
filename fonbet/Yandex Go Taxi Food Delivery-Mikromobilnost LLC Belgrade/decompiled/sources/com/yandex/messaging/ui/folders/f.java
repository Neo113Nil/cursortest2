package com.yandex.messaging.ui.folders;

import defpackage.o7t;
import defpackage.p7t;
import java.util.Set;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes15.dex */
public final class f {
    public final o7t a;
    public final p7t b;

    public f(o7t o7tVar, p7t p7tVar) {
        this.a = o7tVar;
        this.b = p7tVar;
    }

    public final m0 a(Set set, Set set2) {
        return new m0(this.a.a(set), this.b.a(set2), new FolderListItemsProvider$getListItemsFlow$1(this, null));
    }
}
