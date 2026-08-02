package com.yandex.go.mainscreen.superapp.orders.presentation.ui.adapter;

import com.yandex.go.superapp.orders.card.experiments.y;
import defpackage.lm70;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.xda;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Llm70;", "<anonymous>", "()Llm70;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.mainscreen.superapp.orders.presentation.ui.adapter.SuperappTrackingCardUiStateInteractor$getCardHeaderUiState$serviceIcon$4", f = "SuperappTrackingCardUiStateInteractor.kt", l = {546, 547}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class SuperappTrackingCardUiStateInteractor$getCardHeaderUiState$serviceIcon$4 extends SuspendLambda implements tls {
    final /* synthetic */ xda $data;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperappTrackingCardUiStateInteractor$getCardHeaderUiState$serviceIcon$4(e eVar, xda xdaVar, Continuation continuation) {
        super(1, continuation);
        this.this$0 = eVar;
        this.$data = xdaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new SuperappTrackingCardUiStateInteractor$getCardHeaderUiState$serviceIcon$4(this.this$0, this.$data, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((SuperappTrackingCardUiStateInteractor$getCardHeaderUiState$serviceIcon$4) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003d, code lost:
    
        if (r6 == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003f, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0028, code lost:
    
        if (r6 == r0) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005b A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        String s;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            y yVar = this.this$0.k;
            this.label = 1;
            obj = yVar.l(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                str = (String) obj;
                if (str == null) {
                    str = this.$data.c;
                }
                s = this.this$0.s(str);
                if (s == null) {
                    return new lm70(s, null);
                }
                return null;
            }
            kotlin.b.b(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            y yVar2 = this.this$0.k;
            this.label = 2;
            obj = yVar2.d(this);
        } else {
            str = this.$data.c;
            s = this.this$0.s(str);
            if (s == null) {
            }
        }
    }
}
