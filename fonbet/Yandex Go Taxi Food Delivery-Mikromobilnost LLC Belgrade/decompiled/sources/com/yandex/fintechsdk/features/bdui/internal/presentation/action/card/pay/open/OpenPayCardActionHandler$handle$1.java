package com.yandex.fintechsdk.features.bdui.internal.presentation.action.card.pay.open;

import android.net.Uri;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.yandex.fintechsdk.adapters.yb.sdk.impl.c;
import defpackage.c770;
import defpackage.fp51;
import defpackage.ig5;
import defpackage.jh5;
import defpackage.mvg;
import defpackage.nba1;
import defpackage.ny61;
import defpackage.tse;
import defpackage.vm50;
import defpackage.wls;
import defpackage.z22;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.fintechsdk.features.bdui.internal.presentation.action.card.pay.open.OpenPayCardActionHandler$handle$1", f = "OpenPayCardActionHandler.kt", l = {35}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class OpenPayCardActionHandler$handle$1 extends SuspendLambda implements wls {
    final /* synthetic */ ig5 $action;
    final /* synthetic */ FragmentActivity $activity;
    final /* synthetic */ ViewGroup $container;
    final /* synthetic */ jh5 $context;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenPayCardActionHandler$handle$1(a aVar, ViewGroup viewGroup, FragmentActivity fragmentActivity, ig5 ig5Var, jh5 jh5Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$container = viewGroup;
        this.$activity = fragmentActivity;
        this.$action = ig5Var;
        this.$context = jh5Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OpenPayCardActionHandler$handle$1(this.this$0, this.$container, this.$activity, this.$action, this.$context, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OpenPayCardActionHandler$handle$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        try {
            if (i == 0) {
                b.b(obj);
                nba1.f(this.this$0.a);
                fp51 fp51Var = this.this$0.x;
                if (fp51Var != null) {
                    ViewGroup viewGroup = this.$container;
                    FragmentActivity fragmentActivity = this.$activity;
                    this.label = 1;
                    Object b = ((c) fp51Var).b(fragmentActivity, viewGroup, Uri.parse("ybapp://screen.open/dashboard"), this);
                    if (b != coroutineSingletons) {
                        b = zy11Var;
                    }
                    if (b == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            z22 z22Var = this.this$0.a;
            String message = e2.getMessage();
            if (message == null) {
                message = e2.toString();
            }
            nba1.h(z22Var, message);
        }
        vm50 vm50Var = ((c770) this.$action).c;
        if (vm50Var != null) {
            this.$context.a.dispatch(vm50Var);
        }
        return zy11Var;
    }
}
