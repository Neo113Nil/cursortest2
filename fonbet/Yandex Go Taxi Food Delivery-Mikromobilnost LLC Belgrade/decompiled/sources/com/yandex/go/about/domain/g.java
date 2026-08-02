package com.yandex.go.about.domain;

import defpackage.d3n;
import defpackage.k3c;
import defpackage.ny61;
import defpackage.oep0;
import defpackage.v770;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.deeplinks.DeeplinkSource;

/* loaded from: classes.dex */
public final class g extends d3n {
    public final c b;
    public final k3c c;

    public g(c cVar, k3c k3cVar) {
        this.b = cVar;
        this.c = k3cVar;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final /* bridge */ /* synthetic */ Object c(oep0 oep0Var, Object obj, v770 v770Var, DeeplinkSource deeplinkSource, Continuation continuation) {
        return d((ContinuationImpl) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(ContinuationImpl continuationImpl) {
        DumpTechInfoDeeplinkHandlerImpl$handleDeeplink$1 dumpTechInfoDeeplinkHandlerImpl$handleDeeplink$1;
        int i;
        if (continuationImpl instanceof DumpTechInfoDeeplinkHandlerImpl$handleDeeplink$1) {
            dumpTechInfoDeeplinkHandlerImpl$handleDeeplink$1 = (DumpTechInfoDeeplinkHandlerImpl$handleDeeplink$1) continuationImpl;
            int i2 = dumpTechInfoDeeplinkHandlerImpl$handleDeeplink$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dumpTechInfoDeeplinkHandlerImpl$handleDeeplink$1.label = i2 - Integer.MIN_VALUE;
                Object obj = dumpTechInfoDeeplinkHandlerImpl$handleDeeplink$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dumpTechInfoDeeplinkHandlerImpl$handleDeeplink$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    dumpTechInfoDeeplinkHandlerImpl$handleDeeplink$1.L$0 = null;
                    dumpTechInfoDeeplinkHandlerImpl$handleDeeplink$1.L$1 = null;
                    dumpTechInfoDeeplinkHandlerImpl$handleDeeplink$1.L$2 = null;
                    dumpTechInfoDeeplinkHandlerImpl$handleDeeplink$1.L$3 = null;
                    dumpTechInfoDeeplinkHandlerImpl$handleDeeplink$1.label = 1;
                    obj = this.b.a(dumpTechInfoDeeplinkHandlerImpl$handleDeeplink$1);
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
                this.c.a(true, (String) obj, "text");
                return zy11.a;
            }
        }
        dumpTechInfoDeeplinkHandlerImpl$handleDeeplink$1 = new DumpTechInfoDeeplinkHandlerImpl$handleDeeplink$1(this, continuationImpl);
        Object obj2 = dumpTechInfoDeeplinkHandlerImpl$handleDeeplink$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dumpTechInfoDeeplinkHandlerImpl$handleDeeplink$1.label;
        if (i != 0) {
        }
        this.c.a(true, (String) obj2, "text");
        return zy11.a;
    }
}
