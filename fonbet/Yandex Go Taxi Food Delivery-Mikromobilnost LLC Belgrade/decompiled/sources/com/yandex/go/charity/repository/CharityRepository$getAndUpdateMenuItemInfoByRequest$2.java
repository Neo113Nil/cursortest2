package com.yandex.go.charity.repository;

import defpackage.lza;
import defpackage.mdh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pzt0;
import defpackage.sjh;
import defpackage.tje;
import defpackage.uyj;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Llza;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.charity.repository.CharityRepository$getAndUpdateMenuItemInfoByRequest$2", f = "CharityRepository.kt", l = {64, 65}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class CharityRepository$getAndUpdateMenuItemInfoByRequest$2 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CharityRepository$getAndUpdateMenuItemInfoByRequest$2(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CharityRepository$getAndUpdateMenuItemInfoByRequest$2 charityRepository$getAndUpdateMenuItemInfoByRequest$2 = new CharityRepository$getAndUpdateMenuItemInfoByRequest$2(this.this$0, continuation);
        charityRepository$getAndUpdateMenuItemInfoByRequest$2.L$0 = obj;
        return charityRepository$getAndUpdateMenuItemInfoByRequest$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CharityRepository$getAndUpdateMenuItemInfoByRequest$2) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006e, code lost:
    
        if (r0.emit(r9, r8) == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0070, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005b, code lost:
    
        if (r9 == r1) goto L23;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            a aVar = this.this$0;
            pzt0 pzt0Var = aVar.j;
            if (pzt0Var == null || !pzt0Var.isActive()) {
                aVar.j = tje.N(aVar.b, null, null, new CharityRepository$startRequestIfNeed$1(aVar, null), 3);
            }
            this.this$0.c.getClass();
            sjh sjhVar = uyj.a;
            mdh mdhVar = mdh.b;
            CharityRepository$getAndUpdateMenuItemInfoByRequest$2$savedMenuItemInfo$1 charityRepository$getAndUpdateMenuItemInfoByRequest$2$savedMenuItemInfo$1 = new CharityRepository$getAndUpdateMenuItemInfoByRequest$2$savedMenuItemInfo$1(this.this$0, null);
            this.L$0 = vprVar;
            this.label = 1;
            obj = tje.k0(mdhVar, charityRepository$getAndUpdateMenuItemInfoByRequest$2$savedMenuItemInfo$1, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                return zy11.a;
            }
            b.b(obj);
        }
        lza lzaVar = (lza) obj;
        if (lzaVar.a) {
            this.L$0 = null;
            this.L$1 = null;
            this.label = 2;
        }
        return zy11.a;
    }
}
