package com.yandex.go.superapp.discovery.map.impl.ui.main.v2.header;

import com.yandex.go.mainscreen.superapp.impl.header.domain.h;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.otj;
import defpackage.ptj;
import defpackage.tpr;
import defpackage.tse;
import defpackage.uui;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.superapp.discovery.map.impl.ui.main.v2.header.DiscoveryMapFloatingHeaderPresenter$attachView$1", f = "DiscoveryMapFloatingHeaderPresenter.kt", l = {35}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class DiscoveryMapFloatingHeaderPresenter$attachView$1 extends SuspendLambda implements wls {
    final /* synthetic */ otj $mvpView;
    int label;
    final /* synthetic */ ptj this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiscoveryMapFloatingHeaderPresenter$attachView$1(ptj ptjVar, otj otjVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = ptjVar;
        this.$mvpView = otjVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DiscoveryMapFloatingHeaderPresenter$attachView$1(this.this$0, this.$mvpView, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DiscoveryMapFloatingHeaderPresenter$attachView$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            tpr b = ((h) this.this$0.x).b();
            this.this$0.y.getClass();
            tpr F = e.F(b, uyj.a);
            uui uuiVar = new uui(3, this.$mvpView);
            this.label = 1;
            if (F.collect(uuiVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
