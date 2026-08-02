package com.yandex.go.payments.shared.business.accountcreation.corp;

import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class b implements vpr {
    public final /* synthetic */ vpr a;

    public b(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        CreateCorpAccountRequestInteractor$createCorpAccountDraft_tZkwj4A$lambda$0$$inlined$map$1$2$1 createCorpAccountRequestInteractor$createCorpAccountDraft_tZkwj4A$lambda$0$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof CreateCorpAccountRequestInteractor$createCorpAccountDraft_tZkwj4A$lambda$0$$inlined$map$1$2$1) {
            createCorpAccountRequestInteractor$createCorpAccountDraft_tZkwj4A$lambda$0$$inlined$map$1$2$1 = (CreateCorpAccountRequestInteractor$createCorpAccountDraft_tZkwj4A$lambda$0$$inlined$map$1$2$1) continuation;
            int i2 = createCorpAccountRequestInteractor$createCorpAccountDraft_tZkwj4A$lambda$0$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                createCorpAccountRequestInteractor$createCorpAccountDraft_tZkwj4A$lambda$0$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = createCorpAccountRequestInteractor$createCorpAccountDraft_tZkwj4A$lambda$0$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = createCorpAccountRequestInteractor$createCorpAccountDraft_tZkwj4A$lambda$0$$inlined$map$1$2$1.label;
                zy11 zy11Var = zy11.a;
                if (i == 0) {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                    return zy11Var;
                }
                kotlin.b.b(obj2);
                Result result = new Result(zy11Var);
                createCorpAccountRequestInteractor$createCorpAccountDraft_tZkwj4A$lambda$0$$inlined$map$1$2$1.L$0 = null;
                createCorpAccountRequestInteractor$createCorpAccountDraft_tZkwj4A$lambda$0$$inlined$map$1$2$1.L$1 = null;
                createCorpAccountRequestInteractor$createCorpAccountDraft_tZkwj4A$lambda$0$$inlined$map$1$2$1.L$2 = null;
                createCorpAccountRequestInteractor$createCorpAccountDraft_tZkwj4A$lambda$0$$inlined$map$1$2$1.L$3 = null;
                createCorpAccountRequestInteractor$createCorpAccountDraft_tZkwj4A$lambda$0$$inlined$map$1$2$1.label = 1;
                return this.a.emit(result, createCorpAccountRequestInteractor$createCorpAccountDraft_tZkwj4A$lambda$0$$inlined$map$1$2$1) == coroutineSingletons ? coroutineSingletons : zy11Var;
            }
        }
        createCorpAccountRequestInteractor$createCorpAccountDraft_tZkwj4A$lambda$0$$inlined$map$1$2$1 = new CreateCorpAccountRequestInteractor$createCorpAccountDraft_tZkwj4A$lambda$0$$inlined$map$1$2$1(this, continuation);
        Object obj22 = createCorpAccountRequestInteractor$createCorpAccountDraft_tZkwj4A$lambda$0$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = createCorpAccountRequestInteractor$createCorpAccountDraft_tZkwj4A$lambda$0$$inlined$map$1$2$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i == 0) {
        }
    }
}
