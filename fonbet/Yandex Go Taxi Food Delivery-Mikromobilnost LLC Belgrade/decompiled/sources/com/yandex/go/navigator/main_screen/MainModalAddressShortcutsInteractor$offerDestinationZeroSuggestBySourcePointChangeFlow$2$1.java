package com.yandex.go.navigator.main_screen;

import defpackage.b64;
import defpackage.cl7;
import defpackage.dvw;
import defpackage.i8m;
import defpackage.j1;
import defpackage.j18;
import defpackage.mvg;
import defpackage.ntj0;
import defpackage.ny61;
import defpackage.uj;
import defpackage.v51;
import defpackage.vj;
import defpackage.wj;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lntj0;", "Lic61;", "resource", "", "Lcom/yandex/go/address/models/PlainAddress;", "<anonymous>", "(Lntj0;)Ljava/util/List;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.navigator.main_screen.MainModalAddressShortcutsInteractor$offerDestinationZeroSuggestBySourcePointChangeFlow$2$1", f = "MainModalAddressShortcutsInteractor.kt", l = {111}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class MainModalAddressShortcutsInteractor$offerDestinationZeroSuggestBySourcePointChangeFlow$2$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainModalAddressShortcutsInteractor$offerDestinationZeroSuggestBySourcePointChangeFlow$2$1(f fVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MainModalAddressShortcutsInteractor$offerDestinationZeroSuggestBySourcePointChangeFlow$2$1 mainModalAddressShortcutsInteractor$offerDestinationZeroSuggestBySourcePointChangeFlow$2$1 = new MainModalAddressShortcutsInteractor$offerDestinationZeroSuggestBySourcePointChangeFlow$2$1(this.this$0, continuation);
        mainModalAddressShortcutsInteractor$offerDestinationZeroSuggestBySourcePointChangeFlow$2$1.L$0 = obj;
        return mainModalAddressShortcutsInteractor$offerDestinationZeroSuggestBySourcePointChangeFlow$2$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MainModalAddressShortcutsInteractor$offerDestinationZeroSuggestBySourcePointChangeFlow$2$1) create((ntj0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Type inference failed for: r13v4, types: [T, uj] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ntj0 ntj0Var = (ntj0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            return obj;
        }
        kotlin.b.b(obj);
        f fVar = this.this$0;
        this.L$0 = ntj0Var;
        this.L$1 = fVar;
        this.label = 1;
        j18 j18Var = new j18(1, dvw.b(this));
        Ref$ObjectRef y = b64.y(j18Var);
        vj vjVar = new vj(16, y);
        cl7 cl7Var = new cl7(j18Var, vjVar);
        MainModalAddressShortcutsInteractor$offerDestinationZeroSuggestBySourcePointChangeFlow$2$1$invokeSuspend$$inlined$suspendCallbackApi$2 mainModalAddressShortcutsInteractor$offerDestinationZeroSuggestBySourcePointChangeFlow$2$1$invokeSuspend$$inlined$suspendCallbackApi$2 = new MainModalAddressShortcutsInteractor$offerDestinationZeroSuggestBySourcePointChangeFlow$2$1$invokeSuspend$$inlined$suspendCallbackApi$2(1, cl7Var, cl7.class, "success", "success(Ljava/lang/Object;)V", 0);
        ntj0Var.c(new i8m(25, fVar)).a(new v51(5, new j1(15, mainModalAddressShortcutsInteractor$offerDestinationZeroSuggestBySourcePointChangeFlow$2$1$invokeSuspend$$inlined$suspendCallbackApi$2))).b(new v51(4, mainModalAddressShortcutsInteractor$offerDestinationZeroSuggestBySourcePointChangeFlow$2$1$invokeSuspend$$inlined$suspendCallbackApi$2));
        y.element = uj.B;
        if (cl7Var.c()) {
            vjVar.invoke();
        } else {
            j18Var.w(new wj(cl7Var, 16));
        }
        Object s = j18Var.s();
        return s == coroutineSingletons ? coroutineSingletons : s;
    }
}
