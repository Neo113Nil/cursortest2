package com.yandex.go.suggest.impl.router;

import android.net.Uri;
import defpackage.hxx;
import defpackage.kgw0;
import defpackage.m950;
import defpackage.ny61;
import defpackage.oep0;
import defpackage.pep0;
import defpackage.q6w0;
import defpackage.r6w0;
import defpackage.v770;
import defpackage.yvf0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.deeplinks.DeeplinkSource;

/* loaded from: classes8.dex */
public final class a extends r6w0 {
    public final yvf0 b;
    public final com.yandex.go.lifecycle.a c;

    public a(yvf0 yvf0Var, com.yandex.go.lifecycle.a aVar) {
        this.b = yvf0Var;
        this.c = aVar;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final boolean b() {
        return false;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final /* bridge */ /* synthetic */ Object c(oep0 oep0Var, Object obj, v770 v770Var, DeeplinkSource deeplinkSource, Continuation continuation) {
        return d(oep0Var, (q6w0) obj, (ContinuationImpl) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(oep0 oep0Var, q6w0 q6w0Var, ContinuationImpl continuationImpl) {
        SuperappSuggestDeeplinkHandler$handleDeeplink$1 superappSuggestDeeplinkHandler$handleDeeplink$1;
        int i;
        Uri a;
        if (continuationImpl instanceof SuperappSuggestDeeplinkHandler$handleDeeplink$1) {
            superappSuggestDeeplinkHandler$handleDeeplink$1 = (SuperappSuggestDeeplinkHandler$handleDeeplink$1) continuationImpl;
            int i2 = superappSuggestDeeplinkHandler$handleDeeplink$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superappSuggestDeeplinkHandler$handleDeeplink$1.label = i2 - Integer.MIN_VALUE;
                Object obj = superappSuggestDeeplinkHandler$handleDeeplink$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superappSuggestDeeplinkHandler$handleDeeplink$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a = q6w0Var.a();
                    superappSuggestDeeplinkHandler$handleDeeplink$1.L$0 = oep0Var;
                    superappSuggestDeeplinkHandler$handleDeeplink$1.L$1 = null;
                    superappSuggestDeeplinkHandler$handleDeeplink$1.L$2 = null;
                    superappSuggestDeeplinkHandler$handleDeeplink$1.L$3 = null;
                    superappSuggestDeeplinkHandler$handleDeeplink$1.L$4 = a;
                    superappSuggestDeeplinkHandler$handleDeeplink$1.label = 1;
                    if (this.c.a(superappSuggestDeeplinkHandler$handleDeeplink$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Uri uri = (Uri) superappSuggestDeeplinkHandler$handleDeeplink$1.L$4;
                    oep0 oep0Var2 = (oep0) superappSuggestDeeplinkHandler$handleDeeplink$1.L$0;
                    kotlin.b.b(obj);
                    a = uri;
                    oep0Var = oep0Var2;
                }
                ((pep0) oep0Var).f((m950) this.b.get(), new kgw0(a), hxx.a);
                return zy11.a;
            }
        }
        superappSuggestDeeplinkHandler$handleDeeplink$1 = new SuperappSuggestDeeplinkHandler$handleDeeplink$1(this, continuationImpl);
        Object obj2 = superappSuggestDeeplinkHandler$handleDeeplink$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superappSuggestDeeplinkHandler$handleDeeplink$1.label;
        if (i != 0) {
        }
        ((pep0) oep0Var).f((m950) this.b.get(), new kgw0(a), hxx.a);
        return zy11.a;
    }
}
