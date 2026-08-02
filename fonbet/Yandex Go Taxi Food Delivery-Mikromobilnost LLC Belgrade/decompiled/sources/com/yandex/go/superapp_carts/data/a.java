package com.yandex.go.superapp_carts.data;

import defpackage.awp0;
import defpackage.hxx;
import defpackage.ksv0;
import defpackage.lsv0;
import defpackage.m950;
import defpackage.ny61;
import defpackage.oep0;
import defpackage.p9w0;
import defpackage.pep0;
import defpackage.v770;
import defpackage.yvf0;
import defpackage.zy11;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.deeplinks.DeeplinkSource;

/* loaded from: classes8.dex */
public final class a extends lsv0 {
    public final yvf0 b;
    public final com.yandex.go.lifecycle.a c;

    public a(awp0 awp0Var, com.yandex.go.lifecycle.a aVar) {
        this.b = awp0Var;
        this.c = aVar;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final boolean b() {
        return false;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final /* bridge */ /* synthetic */ Object c(oep0 oep0Var, Object obj, v770 v770Var, DeeplinkSource deeplinkSource, Continuation continuation) {
        return d(oep0Var, (ksv0) obj, (ContinuationImpl) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(oep0 oep0Var, ksv0 ksv0Var, ContinuationImpl continuationImpl) {
        SuperAppCartDeeplinkHandler$handleDeeplink$1 superAppCartDeeplinkHandler$handleDeeplink$1;
        int i;
        p9w0 p9w0Var;
        if (continuationImpl instanceof SuperAppCartDeeplinkHandler$handleDeeplink$1) {
            superAppCartDeeplinkHandler$handleDeeplink$1 = (SuperAppCartDeeplinkHandler$handleDeeplink$1) continuationImpl;
            int i2 = superAppCartDeeplinkHandler$handleDeeplink$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superAppCartDeeplinkHandler$handleDeeplink$1.label = i2 - Integer.MIN_VALUE;
                Object obj = superAppCartDeeplinkHandler$handleDeeplink$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superAppCartDeeplinkHandler$handleDeeplink$1.label;
                if (i != 0) {
                    b.b(obj);
                    p9w0Var = new p9w0(ksv0Var.a());
                    superAppCartDeeplinkHandler$handleDeeplink$1.L$0 = oep0Var;
                    superAppCartDeeplinkHandler$handleDeeplink$1.L$1 = null;
                    superAppCartDeeplinkHandler$handleDeeplink$1.L$2 = null;
                    superAppCartDeeplinkHandler$handleDeeplink$1.L$3 = null;
                    superAppCartDeeplinkHandler$handleDeeplink$1.L$4 = null;
                    superAppCartDeeplinkHandler$handleDeeplink$1.L$5 = p9w0Var;
                    superAppCartDeeplinkHandler$handleDeeplink$1.label = 1;
                    if (this.c.a(superAppCartDeeplinkHandler$handleDeeplink$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p9w0 p9w0Var2 = (p9w0) superAppCartDeeplinkHandler$handleDeeplink$1.L$5;
                    oep0 oep0Var2 = (oep0) superAppCartDeeplinkHandler$handleDeeplink$1.L$0;
                    b.b(obj);
                    p9w0Var = p9w0Var2;
                    oep0Var = oep0Var2;
                }
                ((pep0) oep0Var).f((m950) this.b.get(), p9w0Var, hxx.a);
                return zy11.a;
            }
        }
        superAppCartDeeplinkHandler$handleDeeplink$1 = new SuperAppCartDeeplinkHandler$handleDeeplink$1(this, continuationImpl);
        Object obj2 = superAppCartDeeplinkHandler$handleDeeplink$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superAppCartDeeplinkHandler$handleDeeplink$1.label;
        if (i != 0) {
        }
        ((pep0) oep0Var).f((m950) this.b.get(), p9w0Var, hxx.a);
        return zy11.a;
    }
}
