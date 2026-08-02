package com.yandex.go.payments.shared.business.accountcreation.corp;

import defpackage.mdh;
import defpackage.ny61;
import defpackage.rol0;
import defpackage.sjh;
import defpackage.tt2;
import defpackage.uyj;
import java.util.LinkedHashMap;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class d {
    public final CitySuggestApi a;
    public final tt2 b;

    public d(CitySuggestApi citySuggestApi, tt2 tt2Var) {
        this.a = citySuggestApi;
        this.b = tt2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, String str3, String str4, String str5, String str6, String str7, LinkedHashMap linkedHashMap, ContinuationImpl continuationImpl) {
        CreateCorpAccountRequestInteractor$createCorpAccountDraft$1 createCorpAccountRequestInteractor$createCorpAccountDraft$1;
        int i;
        try {
            if (continuationImpl instanceof CreateCorpAccountRequestInteractor$createCorpAccountDraft$1) {
                createCorpAccountRequestInteractor$createCorpAccountDraft$1 = (CreateCorpAccountRequestInteractor$createCorpAccountDraft$1) continuationImpl;
                int i2 = createCorpAccountRequestInteractor$createCorpAccountDraft$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    createCorpAccountRequestInteractor$createCorpAccountDraft$1.label = i2 - Integer.MIN_VALUE;
                    CreateCorpAccountRequestInteractor$createCorpAccountDraft$1 createCorpAccountRequestInteractor$createCorpAccountDraft$12 = createCorpAccountRequestInteractor$createCorpAccountDraft$1;
                    Object obj = createCorpAccountRequestInteractor$createCorpAccountDraft$12.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = createCorpAccountRequestInteractor$createCorpAccountDraft$12.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        rol0 rol0Var = new rol0(new CreateCorpAccountRequestInteractor$createCorpAccountDraft$2$1(str6, str4, str5, str2, str3, str, str7, linkedHashMap, this, null));
                        this.b.getClass();
                        sjh sjhVar = uyj.a;
                        c cVar = new c(kotlinx.coroutines.flow.e.F(rol0Var, mdh.b));
                        createCorpAccountRequestInteractor$createCorpAccountDraft$12.L$0 = null;
                        createCorpAccountRequestInteractor$createCorpAccountDraft$12.L$1 = null;
                        createCorpAccountRequestInteractor$createCorpAccountDraft$12.L$2 = null;
                        createCorpAccountRequestInteractor$createCorpAccountDraft$12.L$3 = null;
                        createCorpAccountRequestInteractor$createCorpAccountDraft$12.L$4 = null;
                        createCorpAccountRequestInteractor$createCorpAccountDraft$12.L$5 = null;
                        createCorpAccountRequestInteractor$createCorpAccountDraft$12.L$6 = null;
                        createCorpAccountRequestInteractor$createCorpAccountDraft$12.L$7 = null;
                        createCorpAccountRequestInteractor$createCorpAccountDraft$12.label = 1;
                        obj = kotlinx.coroutines.flow.e.y(cVar, createCorpAccountRequestInteractor$createCorpAccountDraft$12);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                    }
                    return ((Result) obj).getValue();
                }
            }
            if (i != 0) {
            }
            return ((Result) obj).getValue();
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            return new Result.Failure(th);
        }
        createCorpAccountRequestInteractor$createCorpAccountDraft$1 = new CreateCorpAccountRequestInteractor$createCorpAccountDraft$1(this, continuationImpl);
        CreateCorpAccountRequestInteractor$createCorpAccountDraft$1 createCorpAccountRequestInteractor$createCorpAccountDraft$122 = createCorpAccountRequestInteractor$createCorpAccountDraft$1;
        Object obj2 = createCorpAccountRequestInteractor$createCorpAccountDraft$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = createCorpAccountRequestInteractor$createCorpAccountDraft$122.label;
    }
}
