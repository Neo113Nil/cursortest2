package com.yandex.go.chargers.passes.ui;

import defpackage.cka;
import defpackage.dka;
import defpackage.eka;
import defpackage.fka;
import defpackage.fl3;
import defpackage.hfa0;
import defpackage.hl3;
import defpackage.jla;
import defpackage.kla;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qla;
import defpackage.vpr;
import defpackage.w511;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"R", "T", "Lvpr;", "", "it", "Lzy11;", "<anonymous>", "(Lvpr;Lkotlin/Array;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.passes.ui.ChargersPassesUiStateInteractor$special$$inlined$combine$1$3", f = "ChargersPassesUiStateInteractor.kt", l = {339, MSException.ERROR_MORE_DATA}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
public final class ChargersPassesUiStateInteractor$special$$inlined$combine$1$3 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    boolean Z$0;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersPassesUiStateInteractor$special$$inlined$combine$1$3(d dVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = dVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ChargersPassesUiStateInteractor$special$$inlined$combine$1$3 chargersPassesUiStateInteractor$special$$inlined$combine$1$3 = new ChargersPassesUiStateInteractor$special$$inlined$combine$1$3(this.this$0, (Continuation) obj3);
        chargersPassesUiStateInteractor$special$$inlined$combine$1$3.L$0 = (vpr) obj;
        chargersPassesUiStateInteractor$special$$inlined$combine$1$3.L$1 = (Object[]) obj2;
        return chargersPassesUiStateInteractor$special$$inlined$combine$1$3.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00dc, code lost:
    
        if (r6.emit(r0, r13) == r7) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00de, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00bf, code lost:
    
        if (r0 == r7) goto L29;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object jlaVar;
        vpr vprVar = (vpr) this.L$0;
        Object[] objArr = (Object[]) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            Object obj2 = objArr[0];
            Object obj3 = objArr[1];
            Object obj4 = objArr[2];
            Object obj5 = objArr[3];
            Object obj6 = objArr[4];
            boolean booleanValue = ((Boolean) objArr[5]).booleanValue();
            String str = (String) obj6;
            hfa0 hfa0Var = (hfa0) obj5;
            hl3 hl3Var = (hl3) obj4;
            fka fkaVar = (fka) obj3;
            if (fkaVar == null) {
                jlaVar = kla.a;
            } else {
                e eVar = this.this$0.b;
                boolean z = hl3Var instanceof fl3;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = vprVar;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.L$7 = null;
                this.L$8 = null;
                this.L$9 = null;
                this.Z$0 = booleanValue;
                this.label = 1;
                if (fkaVar instanceof eka) {
                    jlaVar = eVar.h((eka) fkaVar, booleanValue, this);
                } else if (fkaVar instanceof dka) {
                    jlaVar = eVar.d((dka) fkaVar, hfa0Var, str, z, this);
                    if (jlaVar != coroutineSingletons) {
                        jlaVar = (qla) jlaVar;
                    }
                } else {
                    eVar.getClass();
                    if (!(fkaVar instanceof cka)) {
                        w511.b();
                        return null;
                    }
                    jlaVar = new jla(((cka) fkaVar).a);
                }
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vprVar = (vpr) this.L$2;
            kotlin.b.b(obj);
            jlaVar = obj;
        }
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.L$4 = null;
        this.L$5 = null;
        this.L$6 = null;
        this.L$7 = null;
        this.L$8 = null;
        this.L$9 = null;
        this.label = 2;
    }
}
