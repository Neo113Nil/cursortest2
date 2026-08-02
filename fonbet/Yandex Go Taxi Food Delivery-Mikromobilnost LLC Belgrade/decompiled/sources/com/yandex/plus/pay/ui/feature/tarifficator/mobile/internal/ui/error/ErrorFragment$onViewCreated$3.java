package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.error;

import com.yandex.plus.pay.ui.core.mobile.view.toolbar.PlusPayToolbarView;
import defpackage.kgd0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.r6o;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ltse;", "Lkgd0;", ClidProvider.STATE, "Lzy11;", "<anonymous>", "(Ltse;Lkgd0;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.error.ErrorFragment$onViewCreated$3", f = "ErrorFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class ErrorFragment$onViewCreated$3 extends SuspendLambda implements zls {
    final /* synthetic */ r6o $errorContentViewController;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ErrorFragment$onViewCreated$3(r6o r6oVar, Continuation continuation) {
        super(3, continuation);
        this.$errorContentViewController = r6oVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ErrorFragment$onViewCreated$3 errorFragment$onViewCreated$3 = new ErrorFragment$onViewCreated$3(this.$errorContentViewController, (Continuation) obj3);
        errorFragment$onViewCreated$3.L$0 = (kgd0) obj2;
        zy11 zy11Var = zy11.a;
        errorFragment$onViewCreated$3.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kgd0 kgd0Var = (kgd0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        r6o r6oVar = this.$errorContentViewController;
        if (kgd0Var != null) {
            ((PlusPayToolbarView) r6oVar.b.a(r6o.r[1])).setVisibility(0);
            r6oVar.k.a(kgd0Var);
        } else {
            ((PlusPayToolbarView) r6oVar.b.a(r6o.r[1])).setVisibility(8);
        }
        return zy11.a;
    }
}
