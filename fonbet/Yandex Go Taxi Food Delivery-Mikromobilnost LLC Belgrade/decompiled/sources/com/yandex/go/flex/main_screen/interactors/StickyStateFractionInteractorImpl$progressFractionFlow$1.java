package com.yandex.go.flex.main_screen.interactors;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.uhr;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lvpr;", "", "", "isSticked", "Lzy11;", "<anonymous>", "(Lvpr;Z)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.flex.main_screen.interactors.StickyStateFractionInteractorImpl$progressFractionFlow$1", f = "StickyStateFractionInteractorImpl.kt", l = {31, 33}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class StickyStateFractionInteractorImpl$progressFractionFlow$1 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ t this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StickyStateFractionInteractorImpl$progressFractionFlow$1(t tVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = tVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        StickyStateFractionInteractorImpl$progressFractionFlow$1 stickyStateFractionInteractorImpl$progressFractionFlow$1 = new StickyStateFractionInteractorImpl$progressFractionFlow$1(this.this$0, (Continuation) obj3);
        stickyStateFractionInteractorImpl$progressFractionFlow$1.L$0 = (vpr) obj;
        stickyStateFractionInteractorImpl$progressFractionFlow$1.Z$0 = booleanValue;
        return stickyStateFractionInteractorImpl$progressFractionFlow$1.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0033, code lost:
    
        if (r0.emit(r8, r7) == r2) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004f, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
    
        if (kotlinx.coroutines.flow.e.u(r6, r0, r7) == r2) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        boolean z = this.Z$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            if (z) {
                t tVar = this.this$0;
                s sVar = new s(((uhr) tVar.b).a, tVar);
                this.L$0 = null;
                this.Z$0 = z;
                this.label = 2;
            } else {
                Float f = new Float(0.0f);
                this.L$0 = null;
                this.Z$0 = z;
                this.label = 1;
            }
        } else {
            if (i != 1 && i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
