package com.yandex.passport.internal.usecase;

import com.yandex.passport.common.core.Uid;
import com.yandex.passport.internal.ModernAccount;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.Continuation;

/* loaded from: classes8.dex */
public final class m extends com.yandex.passport.common.domain.a {
    public final com.yandex.passport.internal.storage.i b;

    public m(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.internal.storage.i iVar) {
        super(((com.yandex.passport.common.coroutine.b) aVar).c);
        this.b = iVar;
    }

    @Override // com.yandex.passport.common.domain.d
    public final Object b(Object obj, Continuation continuation) {
        Iterator it = ((List) obj).iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            com.yandex.passport.internal.storage.i iVar = this.b;
            if (!hasNext) {
                iVar.h.setValue(iVar, com.yandex.passport.internal.storage.i.m[6], Boolean.TRUE);
                return new Result(zy11.a);
            }
            Uid uid = ((ModernAccount) it.next()).getUid();
            iVar.getClass();
            new com.yandex.passport.internal.storage.b(iVar, uid).c(true);
        }
    }
}
