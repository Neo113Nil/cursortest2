package com.yandex.passport.internal.usecase.ui;

import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.internal.entities.Filter;
import defpackage.ny61;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class c0 extends com.yandex.passport.common.domain.d {
    public final com.yandex.passport.internal.core.accounts.d b;
    public final com.yandex.passport.internal.filter.i c;

    public c0(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.internal.core.accounts.d dVar, com.yandex.passport.internal.filter.i iVar) {
        super(((com.yandex.passport.common.coroutine.b) aVar).e);
        this.b = dVar;
        this.c = iVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.yandex.passport.common.domain.d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(b0 b0Var, ContinuationImpl continuationImpl) {
        LoadAccountsUseCase$run$1 loadAccountsUseCase$run$1;
        int i;
        com.yandex.passport.internal.b bVar;
        List list;
        com.yandex.passport.internal.b bVar2;
        com.yandex.passport.internal.core.accounts.d dVar = this.b;
        if (continuationImpl instanceof LoadAccountsUseCase$run$1) {
            loadAccountsUseCase$run$1 = (LoadAccountsUseCase$run$1) continuationImpl;
            int i2 = loadAccountsUseCase$run$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                loadAccountsUseCase$run$1.label = i2 - Integer.MIN_VALUE;
                Object obj = loadAccountsUseCase$run$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = loadAccountsUseCase$run$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    try {
                        bVar = dVar.a();
                        list = bVar.f();
                    } catch (SecurityException e) {
                        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                            com.yandex.passport.common.logger.a.b(LogLevel.ERROR, null, "SecurityException", e);
                        }
                        com.yandex.passport.internal.network.mappers.h hVar = dVar.a.h;
                        List list2 = EmptyList.a;
                        bVar = new com.yandex.passport.internal.b(list2, hVar);
                        list = list2;
                    }
                    Filter filter = b0Var.a;
                    loadAccountsUseCase$run$1.L$0 = bVar;
                    loadAccountsUseCase$run$1.label = 1;
                    Object c = this.c.c(list, filter, loadAccountsUseCase$run$1);
                    if (c == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    com.yandex.passport.internal.b bVar3 = bVar;
                    obj = c;
                    bVar2 = bVar3;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    bVar2 = (com.yandex.passport.internal.b) loadAccountsUseCase$run$1.L$0;
                    kotlin.b.b(obj);
                }
                return new a0(bVar2, new com.yandex.passport.internal.account.d((List) obj));
            }
        }
        loadAccountsUseCase$run$1 = new LoadAccountsUseCase$run$1(this, continuationImpl);
        Object obj2 = loadAccountsUseCase$run$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = loadAccountsUseCase$run$1.label;
        if (i != 0) {
        }
        return new a0(bVar2, new com.yandex.passport.internal.account.d((List) obj2));
    }
}
