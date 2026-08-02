package com.yandex.messaging.domain.personal;

import com.yandex.messaging.domain.k;
import com.yandex.messaging.internal.authorized.j;
import defpackage.fse;
import defpackage.kse;
import defpackage.ny61;
import defpackage.tje;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes15.dex */
public final class a extends k {
    public final j b;
    public String c;

    public a(kse kseVar, j jVar) {
        super(kseVar.b);
        this.b = jVar;
    }

    @Override // com.yandex.messaging.domain.k
    public final /* bridge */ /* synthetic */ Object b(Object obj, Continuation continuation) {
        return c((ContinuationImpl) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ContinuationImpl continuationImpl) {
        GetPersonalGuidUseCase$run$1 getPersonalGuidUseCase$run$1;
        int i;
        if (continuationImpl instanceof GetPersonalGuidUseCase$run$1) {
            getPersonalGuidUseCase$run$1 = (GetPersonalGuidUseCase$run$1) continuationImpl;
            int i2 = getPersonalGuidUseCase$run$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getPersonalGuidUseCase$run$1.label = i2 - Integer.MIN_VALUE;
                Object obj = getPersonalGuidUseCase$run$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = getPersonalGuidUseCase$run$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String str = this.c;
                    if (str != null) {
                        return str;
                    }
                    fse fseVar = getPersonalGuidUseCase$run$1.get_context();
                    if (fseVar == null) {
                        fseVar = getPersonalGuidUseCase$run$1.get_context();
                    }
                    GetPersonalGuidUseCase$run$$inlined$cancelableCoroutineWrapper$1 getPersonalGuidUseCase$run$$inlined$cancelableCoroutineWrapper$1 = new GetPersonalGuidUseCase$run$$inlined$cancelableCoroutineWrapper$1(null, this);
                    getPersonalGuidUseCase$run$1.L$0 = this;
                    getPersonalGuidUseCase$run$1.label = 1;
                    obj = tje.k0(fseVar, getPersonalGuidUseCase$run$$inlined$cancelableCoroutineWrapper$1, getPersonalGuidUseCase$run$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (a) getPersonalGuidUseCase$run$1.L$0;
                    kotlin.b.b(obj);
                }
                this.c = (String) obj;
                return obj;
            }
        }
        getPersonalGuidUseCase$run$1 = new GetPersonalGuidUseCase$run$1(this, continuationImpl);
        Object obj2 = getPersonalGuidUseCase$run$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = getPersonalGuidUseCase$run$1.label;
        if (i != 0) {
        }
        this.c = (String) obj2;
        return obj2;
    }
}
