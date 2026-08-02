package com.yandex.plus.home.feature.webviews.internal.simple;

import android.net.Uri;
import com.yandex.plus.home.feature.webviews.internal.uri.c;
import defpackage.i0h;
import defpackage.mvg;
import defpackage.nfs0;
import defpackage.ny61;
import defpackage.qzg;
import defpackage.tse;
import defpackage.vzg;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.home.feature.webviews.internal.simple.SimpleWebViewLayoutPresenter$handleUrlLoading$1$1", f = "SimpleWebViewLayoutPresenter.kt", l = {147, 148}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class SimpleWebViewLayoutPresenter$handleUrlLoading$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ vzg $deeplink;
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleWebViewLayoutPresenter$handleUrlLoading$1$1(vzg vzgVar, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$deeplink = vzgVar;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SimpleWebViewLayoutPresenter$handleUrlLoading$1$1(this.$deeplink, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SimpleWebViewLayoutPresenter$handleUrlLoading$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0069, code lost:
    
        if (r12 == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0036, code lost:
    
        if (r12 == r0) goto L25;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            vzg vzgVar = this.$deeplink;
            qzg qzgVar = (qzg) vzgVar;
            boolean z = qzgVar.b;
            a aVar = this.this$0;
            if (z) {
                com.yandex.plus.home.feature.webviews.internal.container.b.b(aVar.k, vzgVar, false, null, null, null, null, 60);
                return zy11.a;
            }
            i0h i0hVar = aVar.m;
            this.label = 1;
            Object d = i0hVar.d(qzgVar, this);
            obj2 = d;
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                this.this$0.p.v();
                ((nfs0) this.this$0.b).loadUri((String) obj);
                return zy11.a;
            }
            b.b(obj);
            obj2 = obj;
        }
        a aVar2 = this.this$0;
        String uri = ((qzg) obj2).a.toString();
        this.L$0 = null;
        this.label = 2;
        obj = uri;
        if (!aVar2.i) {
            c cVar = aVar2.j;
            Object j = cVar.a.j(Uri.parse(uri));
            vzg vzgVar2 = (vzg) (j instanceof Result.Failure ? null : j);
            obj = uri;
            if (vzgVar2 instanceof qzg) {
                obj = cVar.b((qzg) vzgVar2, this);
            }
        }
    }
}
