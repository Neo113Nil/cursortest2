package com.yandex.plus.home.feature.webviews.internal.uri;

import android.net.Uri;
import defpackage.ny61;
import defpackage.qzg;
import defpackage.tg21;
import defpackage.v920;
import defpackage.vzg;
import java.util.Map;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class c implements tg21 {
    public final v920 a;
    public final com.yandex.plus.home.auth.b b;

    public c(v920 v920Var, com.yandex.plus.home.auth.b bVar) {
        this.a = v920Var;
        this.b = bVar;
    }

    @Override // defpackage.tg21
    public final Object a(String str, Map map, Continuation continuation) {
        ContinuationImpl continuationImpl = (ContinuationImpl) continuation;
        Object j = this.a.j(Uri.parse(str));
        if (j instanceof Result.Failure) {
            j = null;
        }
        vzg vzgVar = (vzg) j;
        return vzgVar instanceof qzg ? b((qzg) vzgVar, continuationImpl) : str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x004e, code lost:
    
        if (r6.f(r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0061 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0062 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(qzg qzgVar, ContinuationImpl continuationImpl) {
        SimpleDeeplinkUrlManager$authorize$1 simpleDeeplinkUrlManager$authorize$1;
        int i;
        if (continuationImpl instanceof SimpleDeeplinkUrlManager$authorize$1) {
            simpleDeeplinkUrlManager$authorize$1 = (SimpleDeeplinkUrlManager$authorize$1) continuationImpl;
            int i2 = simpleDeeplinkUrlManager$authorize$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                simpleDeeplinkUrlManager$authorize$1.label = i2 - Integer.MIN_VALUE;
                Object obj = simpleDeeplinkUrlManager$authorize$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = simpleDeeplinkUrlManager$authorize$1.label;
                com.yandex.plus.home.auth.b bVar = this.b;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (!qzgVar.h) {
                        return qzgVar.a.toString();
                    }
                    simpleDeeplinkUrlManager$authorize$1.L$0 = qzgVar;
                    simpleDeeplinkUrlManager$authorize$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    qzgVar = (qzg) simpleDeeplinkUrlManager$authorize$1.L$0;
                    kotlin.b.b(obj);
                }
                String uri = qzgVar.a.toString();
                simpleDeeplinkUrlManager$authorize$1.L$0 = null;
                simpleDeeplinkUrlManager$authorize$1.label = 2;
                Object g = bVar.g(uri, simpleDeeplinkUrlManager$authorize$1);
                return g != coroutineSingletons ? coroutineSingletons : g;
            }
        }
        simpleDeeplinkUrlManager$authorize$1 = new SimpleDeeplinkUrlManager$authorize$1(this, continuationImpl);
        Object obj2 = simpleDeeplinkUrlManager$authorize$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = simpleDeeplinkUrlManager$authorize$1.label;
        com.yandex.plus.home.auth.b bVar2 = this.b;
        if (i != 0) {
        }
        String uri2 = qzgVar.a.toString();
        simpleDeeplinkUrlManager$authorize$1.L$0 = null;
        simpleDeeplinkUrlManager$authorize$1.label = 2;
        Object g2 = bVar2.g(uri2, simpleDeeplinkUrlManager$authorize$1);
        if (g2 != coroutineSingletons2) {
        }
    }
}
