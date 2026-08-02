package com.yandex.go.pin.api;

import android.view.View;
import android.view.ViewGroup;
import com.yandex.go.pin.api.v1.PinV1Component;
import com.yandex.go.pin.api.v2.PinV2Component;
import com.yandex.go.pin.api.v2.c;
import defpackage.ah00;
import defpackage.ewb0;
import defpackage.fft0;
import defpackage.gpr0;
import defpackage.hpr0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qhq0;
import defpackage.tls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.ui.PassMoveTouchListener;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.pin.api.SharedPinController$attachPin$1", f = "SharedPinController.kt", l = {HProv.ALG_SID_GR3410_12_256}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class SharedPinController$attachPin$1 extends SuspendLambda implements wls {
    final /* synthetic */ ah00 $mapController;
    final /* synthetic */ View $mapTouchListener;
    final /* synthetic */ View $replaceView;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedPinController$attachPin$1(a aVar, ah00 ah00Var, View view, View view2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$mapController = ah00Var;
        this.$replaceView = view;
        this.$mapTouchListener = view2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SharedPinController$attachPin$1(this.this$0, this.$mapController, this.$replaceView, this.$mapTouchListener, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SharedPinController$attachPin$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        View touchTarget;
        PinV2Component pinV2Component;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            com.yandex.go.pin.api.widget.a aVar = this.this$0.a;
            this.label = 1;
            obj = aVar.a(this);
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
        ewb0 ewb0Var = (ewb0) obj;
        PinV1Component pinV1Component = ewb0Var.a;
        if (pinV1Component != null) {
            a aVar2 = this.this$0;
            aVar2.g = new com.yandex.go.pin.api.v1.a(pinV1Component, ((hpr0) aVar2.b.get()).c, this.$mapController, this.this$0.c);
            fft0 fft0Var = this.this$0.p;
            if (fft0Var != null) {
                fft0Var.invoke(ewb0Var.a);
            }
        } else {
            PinV2Component pinV2Component2 = ewb0Var.b;
            if (pinV2Component2 != null) {
                a aVar3 = this.this$0;
                gpr0 gpr0Var = ((hpr0) aVar3.b.get()).d;
                a aVar4 = this.this$0;
                aVar3.h = new c(pinV2Component2, gpr0Var, aVar4.d, this.$mapController, aVar4.c);
            }
        }
        ViewGroup g = this.this$0.g();
        ru.yandex.taxi.design.utils.c.w(this.$replaceView, g);
        a aVar5 = this.this$0;
        com.yandex.go.pin.api.v1.a aVar6 = aVar5.g;
        if (aVar6 == null || (touchTarget = aVar6.d()) == null) {
            c cVar = aVar5.h;
            touchTarget = (cVar == null || (pinV2Component = cVar.i) == null) ? null : pinV2Component.getTouchTarget();
        }
        if (touchTarget != null) {
            View view = this.$mapTouchListener;
            a aVar7 = this.this$0;
            touchTarget.setOnTouchListener(new PassMoveTouchListener(view));
            ru.yandex.taxi.design.utils.c.z(new qhq0(6, aVar7), touchTarget);
        }
        g.addOnLayoutChangeListener(this.this$0.i);
        tls tlsVar = this.this$0.o;
        if (tlsVar != null) {
            tlsVar.invoke(g);
        }
        a aVar8 = this.this$0;
        aVar8.o = null;
        aVar8.p = null;
        return zy11.a;
    }
}
