package com.yandex.go.ads.prefetch.impl;

import defpackage.evu0;
import defpackage.mdh;
import defpackage.mo21;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.xd1;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lxd1;", "<anonymous>", "(Ltse;)Lxd1;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.ads.prefetch.impl.AdvertPrefetchHeadersProviderImpl$get$2", f = "AdvertPrefetchHeadersProvider.kt", l = {31, 32}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class AdvertPrefetchHeadersProviderImpl$get$2 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvertPrefetchHeadersProviderImpl$get$2(c cVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        AdvertPrefetchHeadersProviderImpl$get$2 advertPrefetchHeadersProviderImpl$get$2 = new AdvertPrefetchHeadersProviderImpl$get$2(this.this$0, continuation);
        advertPrefetchHeadersProviderImpl$get$2.L$0 = obj;
        return advertPrefetchHeadersProviderImpl$get$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AdvertPrefetchHeadersProviderImpl$get$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0081, code lost:
    
        if (r8 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00ad  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        noh h;
        String oaid;
        String str;
        String str2;
        mo21 mo21Var;
        String b;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        String str3 = null;
        if (i == 0) {
            kotlin.b.b(obj);
            this.this$0.e.getClass();
            sjh sjhVar = uyj.a;
            qoh h2 = tje.h(tseVar, mdh.b, null, new AdvertPrefetchHeadersProviderImpl$get$2$gaidDeferred$1(this.this$0, null), 2);
            h = tje.h(tseVar, null, null, new AdvertPrefetchHeadersProviderImpl$get$2$locationDeferred$1(this.this$0, null), 3);
            oaid = this.this$0.d.getOaid();
            if (oaid == null || evu0.J(oaid)) {
                oaid = null;
            }
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = h;
            this.L$3 = oaid;
            this.label = 1;
            obj = h2.s(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str2 = (String) this.L$4;
                str = (String) this.L$3;
                kotlin.b.b(obj);
                mo21Var = (mo21) obj;
                b = this.this$0.b.b();
                if (evu0.J(b)) {
                    b = null;
                }
                if (mo21Var != null) {
                    str3 = mo21Var.a + ";" + mo21Var.b;
                }
                return new xd1(b, str2, str, str3);
            }
            oaid = (String) this.L$3;
            h = (noh) this.L$2;
            kotlin.b.b(obj);
        }
        String str4 = (String) obj;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = oaid;
        this.L$4 = str4;
        this.label = 2;
        Object k = h.k(this);
        if (k != coroutineSingletons) {
            str = oaid;
            str2 = str4;
            obj = k;
            mo21Var = (mo21) obj;
            b = this.this$0.b.b();
            if (evu0.J(b)) {
            }
            if (mo21Var != null) {
            }
            return new xd1(b, str2, str, str3);
        }
        return coroutineSingletons;
    }
}
