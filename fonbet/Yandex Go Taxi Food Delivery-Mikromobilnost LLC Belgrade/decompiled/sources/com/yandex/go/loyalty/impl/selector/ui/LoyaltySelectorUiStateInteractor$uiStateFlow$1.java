package com.yandex.go.loyalty.impl.selector.ui;

import com.yandex.go.loyalty.impl.selector.domain.LoyaltySelectorLoadingState;
import defpackage.bms;
import defpackage.ciq0;
import defpackage.dvz;
import defpackage.eiq0;
import defpackage.fia1;
import defpackage.fiq0;
import defpackage.ha2;
import defpackage.jqr;
import defpackage.kxz;
import defpackage.lxz;
import defpackage.mth;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.twz;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lkxz;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.loyalty.impl.selector.ui.LoyaltySelectorUiStateInteractor$uiStateFlow$1", f = "LoyaltySelectorUiStateInteractor.kt", l = {44, 47}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class LoyaltySelectorUiStateInteractor$uiStateFlow$1 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ b this$0;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Llxz;", "it", "Lzy11;", "<anonymous>", "(Llxz;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.loyalty.impl.selector.ui.LoyaltySelectorUiStateInteractor$uiStateFlow$1$1", f = "LoyaltySelectorUiStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.loyalty.impl.selector.ui.LoyaltySelectorUiStateInteractor$uiStateFlow$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ b this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(b bVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((lxz) obj, (Continuation) obj2);
            zy11 zy11Var = zy11.a;
            anonymousClass1.invokeSuspend(zy11Var);
            return zy11Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            dvz c;
            lxz lxzVar = (lxz) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            twz twzVar = (twz) this.this$0.f.a;
            if (!(((fiq0) twzVar.a.getValue()) instanceof eiq0) && (c = fia1.c(lxzVar)) != null) {
                String str = c.a;
                r0 r0Var = twzVar.a;
                ciq0 ciq0Var = new ciq0(str);
                r0Var.getClass();
                r0Var.m(null, ciq0Var);
            }
            return zy11.a;
        }
    }

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    /* renamed from: com.yandex.go.loyalty.impl.selector.ui.LoyaltySelectorUiStateInteractor$uiStateFlow$1$2, reason: invalid class name */
    final /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements bms {
        @Override // defpackage.bms
        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            return b.b((b) this.receiver, (lxz) obj, (LoyaltySelectorLoadingState) obj2, (fiq0) obj3, (Continuation) obj4);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoyaltySelectorUiStateInteractor$uiStateFlow$1(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        LoyaltySelectorUiStateInteractor$uiStateFlow$1 loyaltySelectorUiStateInteractor$uiStateFlow$1 = new LoyaltySelectorUiStateInteractor$uiStateFlow$1(this.this$0, continuation);
        loyaltySelectorUiStateInteractor$uiStateFlow$1.L$0 = obj;
        return loyaltySelectorUiStateInteractor$uiStateFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LoyaltySelectorUiStateInteractor$uiStateFlow$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x008e, code lost:
    
        if (kotlinx.coroutines.flow.e.u(r14, r0, r13) == r1) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0090, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
    
        if (r0.emit(r14, r13) == r1) goto L21;
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
            kotlin.b.b(obj);
            if (this.this$0.b.a() == null) {
                r0 r0Var = this.this$0.e.a;
                if (r0Var.getValue() == LoyaltySelectorLoadingState.NONE) {
                    r0Var.l(LoyaltySelectorLoadingState.FIRST_LOADING);
                }
                kxz c = this.this$0.c();
                this.L$0 = vprVar;
                this.label = 1;
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
            kotlin.b.b(obj);
        }
        b bVar = this.this$0;
        jqr jqrVar = new jqr(new mth(bVar.b.a, 6), new AnonymousClass1(bVar, null), 3);
        b bVar2 = this.this$0;
        ha2 n = e.n(jqrVar, bVar2.e.a, bVar2.g.a, new AnonymousClass2(4, this.this$0, b.class, "mapLoyaltyStateToUi", "mapLoyaltyStateToUi(Lcom/yandex/go/loyalty/impl/selector/domain/model/LoyaltyState;Lcom/yandex/go/loyalty/impl/selector/domain/LoyaltySelectorLoadingState;Lcom/yandex/go/loyalty/impl/selector/domain/SelectedProgramInSelector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0));
        this.L$0 = null;
        this.label = 2;
    }
}
