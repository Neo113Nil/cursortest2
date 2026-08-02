package com.yandex.plus.pay.ui.core.debug.internal.ui.form;

import android.net.Uri;
import android.webkit.ValueCallback;
import com.yandex.plus.core.activity.result.internal.c;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.pay.ui.core.debug.internal.ui.form.ReportFormFragment$onViewCreated$2$1", f = "ReportFormFragment.kt", l = {64}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class ReportFormFragment$onViewCreated$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ ValueCallback<Uri[]> $callback;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReportFormFragment$onViewCreated$2$1(ValueCallback valueCallback, Continuation continuation) {
        super(2, continuation);
        this.$callback = valueCallback;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReportFormFragment$onViewCreated$2$1(this.$callback, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ReportFormFragment$onViewCreated$2$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            c cVar = c.d;
            this.label = 1;
            obj = cVar.a("*/*", this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        this.$callback.onReceiveValue(((List) obj).toArray(new Uri[0]));
        return zy11.a;
    }
}
