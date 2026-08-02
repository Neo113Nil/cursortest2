package com.yandex.go.summary.interactor.common.state;

import defpackage.akv0;
import defpackage.mmq0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qlq0;
import defpackage.vpr;
import defpackage.xjv0;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.perf.screen.ElementPerformanceState;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lvpr;", "Lomq0;", "Lqlq0;", "selectorModel", "Lzy11;", "<anonymous>", "(Lvpr;Lqlq0;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.summary.interactor.common.state.SelectorUiStateInteractor$uiStateFlow$1$1", f = "SelectorUiStateInteractor.kt", l = {114, HProv.PP_CACHE_SIZE, HProv.PP_CACHE_SIZE, HProv.PP_NK_SYNC, HProv.PP_NK_SYNC}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class SelectorUiStateInteractor$uiStateFlow$1$1 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectorUiStateInteractor$uiStateFlow$1$1(c cVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = cVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        SelectorUiStateInteractor$uiStateFlow$1$1 selectorUiStateInteractor$uiStateFlow$1$1 = new SelectorUiStateInteractor$uiStateFlow$1$1(this.this$0, (Continuation) obj3);
        selectorUiStateInteractor$uiStateFlow$1$1.L$0 = (vpr) obj;
        selectorUiStateInteractor$uiStateFlow$1$1.L$1 = (qlq0) obj2;
        return selectorUiStateInteractor$uiStateFlow$1$1.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00db, code lost:
    
        if (r13 == r2) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00bd, code lost:
    
        if (r0.emit(r13, r12) == r2) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a8, code lost:
    
        if (r13 != r2) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00cc, code lost:
    
        if (r13 == r2) goto L42;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        mmq0 mmq0Var;
        vpr vprVar = (vpr) this.L$0;
        qlq0 qlq0Var = (qlq0) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            akv0 akv0Var = this.this$0.h;
            boolean z = akv0Var.a.a(new xjv0(ElementPerformanceState.LARGEST_CONTENTFUL_PAINT)) || akv0Var.a.a(new xjv0(ElementPerformanceState.FIRST_CONTENTFUL_PAINT));
            c cVar = this.this$0;
            if (z) {
                cVar.getClass();
                mmq0 mmq0Var2 = new mmq0(cVar.o(qlq0Var.a));
                this.L$0 = vprVar;
                this.L$1 = qlq0Var;
                this.L$2 = mmq0Var2;
                this.label = 1;
                if (vprVar.emit(mmq0Var2, this) != coroutineSingletons) {
                    mmq0Var = mmq0Var2;
                    c cVar2 = this.this$0;
                    this.L$0 = vprVar;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 2;
                    obj = c.c(cVar2, qlq0Var, mmq0Var, this);
                }
            } else {
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = vprVar;
                this.label = 4;
                obj = c.e(cVar, qlq0Var, this);
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            mmq0Var = (mmq0) this.L$2;
            kotlin.b.b(obj);
            c cVar22 = this.this$0;
            this.L$0 = vprVar;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 2;
            obj = c.c(cVar22, qlq0Var, mmq0Var, this);
        } else {
            if (i == 2) {
                kotlin.b.b(obj);
                mmq0 mmq0Var3 = (mmq0) obj;
                if (mmq0Var3 != null) {
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.label = 3;
                }
                return zy11.a;
            }
            if (i == 3) {
                kotlin.b.b(obj);
                return zy11.a;
            }
            if (i != 4) {
                if (i != 5) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return zy11.a;
            }
            vprVar = (vpr) this.L$2;
            kotlin.b.b(obj);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 5;
            obj = vprVar.emit(obj, this);
        }
    }
}
