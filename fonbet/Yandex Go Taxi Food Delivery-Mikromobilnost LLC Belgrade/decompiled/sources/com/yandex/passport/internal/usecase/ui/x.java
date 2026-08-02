package com.yandex.passport.internal.usecase.ui;

import com.yandex.passport.internal.ModernAccount;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.Continuation;

/* loaded from: classes8.dex */
public final class x extends com.yandex.passport.common.domain.d {
    public final com.yandex.passport.internal.core.accounts.t b;
    public final com.yandex.passport.internal.core.accounts.d c;

    public x(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.internal.core.accounts.t tVar, com.yandex.passport.internal.core.accounts.d dVar) {
        super(((com.yandex.passport.common.coroutine.b) aVar).c);
        this.b = tVar;
        this.c = dVar;
    }

    @Override // com.yandex.passport.common.domain.d
    public final Object b(Object obj, Continuation continuation) {
        w wVar = (w) obj;
        wVar.getClass();
        com.yandex.passport.internal.b a = this.c.a();
        ArrayList c = this.b.c(wVar.a(), a);
        ArrayList arrayList = new ArrayList();
        Iterator it = c.iterator();
        while (it.hasNext()) {
            ModernAccount e = a.e(((com.yandex.passport.internal.entities.k) it.next()).d());
            if (e != null && e.getHasMasterToken()) {
                return e;
            }
            if (e != null) {
                arrayList.add(e);
            }
        }
        return (ModernAccount) kotlin.collections.a.S(0, arrayList);
    }
}
