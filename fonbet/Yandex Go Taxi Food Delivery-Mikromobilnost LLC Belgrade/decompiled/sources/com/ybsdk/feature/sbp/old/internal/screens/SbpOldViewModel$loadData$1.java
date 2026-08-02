package com.ybsdk.feature.sbp.old.internal.screens;

import defpackage.ds31;
import defpackage.lrp0;
import defpackage.mhm0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.tje;
import defpackage.tse;
import defpackage.v7l;
import defpackage.wls;
import defpackage.x4c;
import defpackage.zy11;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.sbp.old.internal.screens.SbpOldViewModel$loadData$1", f = "SbpOldViewModel.kt", l = {38, 40}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class SbpOldViewModel$loadData$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SbpOldViewModel$loadData$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SbpOldViewModel$loadData$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SbpOldViewModel$loadData$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0083, code lost:
    
        if (r11 == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0085, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x005c, code lost:
    
        if (r4 == r0) goto L23;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        r0 r0Var;
        Object value;
        r0 r0Var2;
        Object value2;
        Object a;
        r0 r0Var3;
        Object value3;
        r0 r0Var4;
        Object value4;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            b.b(obj);
            a aVar = this.this$0;
            this.label = 1;
            if (((mhm0) aVar.X()).d) {
                pz40 Y = aVar.Y();
                do {
                    r0Var = (r0) Y;
                    value = r0Var.getValue();
                } while (!r0Var.k(value, mhm0.b((mhm0) value, null, null, null, 7)));
                tje.N(ds31.a(aVar), null, null, new SbpOldViewModel$handleLoadingState$3(aVar, null), 3);
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                a = ((Result) obj).getValue();
                a aVar2 = this.this$0;
                if (!(a instanceof Result.Failure)) {
                    v7l v7lVar = (v7l) a;
                    pz40 Y2 = aVar2.Y();
                    do {
                        r0Var4 = (r0) Y2;
                        value4 = r0Var4.getValue();
                    } while (!r0Var4.k(value4, mhm0.b((mhm0) value4, null, v7lVar, null, 13)));
                    aVar2.D.c();
                }
                a aVar3 = this.this$0;
                Throwable a2 = Result.a(a);
                if (a2 != null) {
                    x4c.g("Failed to load sbp subscription consent screen", a2, null, Collections.singletonList(lrp0.D), 4);
                    pz40 Y3 = aVar3.Y();
                    do {
                        r0Var3 = (r0) Y3;
                        value3 = r0Var3.getValue();
                    } while (!r0Var3.k(value3, mhm0.b((mhm0) value3, a2, null, null, 14)));
                    aVar3.D.d();
                }
                return zy11Var;
            }
            b.b(obj);
        }
        pz40 Y4 = this.this$0.Y();
        do {
            r0Var2 = (r0) Y4;
            value2 = r0Var2.getValue();
        } while (!r0Var2.k(value2, mhm0.b((mhm0) value2, null, null, null, 14)));
        com.ybsdk.feature.sbp.old.internal.data.a aVar4 = this.this$0.B;
        this.label = 2;
        a = aVar4.a(this);
    }
}
