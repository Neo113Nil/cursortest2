package com.yandex.messaging.extension;

import android.net.Uri;
import defpackage.dnh;
import defpackage.fyc;
import defpackage.g9v;
import defpackage.gwk0;
import defpackage.mvg;
import defpackage.myj0;
import defpackage.ny61;
import defpackage.sls;
import defpackage.tse;
import defpackage.wls;
import defpackage.yn50;
import defpackage.zy11;
import java.io.File;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ltse;", "Loyj0;", "Landroid/net/Uri;", "Lmav;", "<anonymous>", "(Ltse;)Loyj0;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.extension.ImagesExtensionsKt$loadIntoAnimated$5$result$1", f = "ImagesExtensions.kt", l = {100}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class ImagesExtensionsKt$loadIntoAnimated$5$result$1 extends SuspendLambda implements wls {
    final /* synthetic */ sls $onNoCacheAction;
    final /* synthetic */ g9v $this_loadIntoAnimated;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImagesExtensionsKt$loadIntoAnimated$5$result$1(g9v g9vVar, sls slsVar, Continuation continuation) {
        super(2, continuation);
        this.$this_loadIntoAnimated = g9vVar;
        this.$onNoCacheAction = slsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ImagesExtensionsKt$loadIntoAnimated$5$result$1(this.$this_loadIntoAnimated, this.$onNoCacheAction, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ImagesExtensionsKt$loadIntoAnimated$5$result$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object s;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        g9v g9vVar = this.$this_loadIntoAnimated;
        sls slsVar = this.$onNoCacheAction;
        this.label = 1;
        fyc b = gwk0.b();
        dnh dnhVar = new dnh();
        dnhVar.b = b;
        Uri c = ((yn50) g9vVar).c(dnhVar);
        String path = c != null ? c.getPath() : null;
        if (path == null || !new File(path).exists()) {
            slsVar.invoke();
            s = b.s(this);
        } else {
            s = new myj0(c);
        }
        return s == coroutineSingletons ? coroutineSingletons : s;
    }
}
