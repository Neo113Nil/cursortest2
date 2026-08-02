package com.yandex.go.taxi.order.queue.mapper;

import com.yandex.go.zone.dto.objects.QueueScreen;
import defpackage.bdc;
import defpackage.ckg0;
import defpackage.kdc;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.tje;
import defpackage.tse;
import defpackage.ufu;
import defpackage.ukg0;
import defpackage.vkg0;
import defpackage.wkg0;
import defpackage.wls;
import defpackage.xkg0;
import defpackage.xng0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lxkg0;", "<anonymous>", "(Ltse;)Lxkg0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.queue.mapper.QueueInfoToModelMapper$mapButton$2", f = "QueueInfoToModelMapper.kt", l = {MSException.ERROR_INVALID_PASSWORD}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class QueueInfoToModelMapper$mapButton$2 extends SuspendLambda implements wls {
    final /* synthetic */ QueueScreen.QueueButton $button;
    double D$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QueueInfoToModelMapper$mapButton$2(a aVar, QueueScreen.QueueButton queueButton, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$button = queueButton;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        QueueInfoToModelMapper$mapButton$2 queueInfoToModelMapper$mapButton$2 = new QueueInfoToModelMapper$mapButton$2(this.this$0, this.$button, continuation);
        queueInfoToModelMapper$mapButton$2.L$0 = obj;
        return queueInfoToModelMapper$mapButton$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((QueueInfoToModelMapper$mapButton$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        wkg0 wkg0Var;
        kdc kdcVar;
        double d;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            qoh h = tje.h(tseVar, null, null, new QueueInfoToModelMapper$mapButton$2$title$1(this.this$0, this.$button, null), 3);
            kdc a = ((ufu) this.this$0.c).a(new bdc(xng0.bgInvert), this.$button.c);
            a aVar = this.this$0;
            QueueScreen.QueueButton.QueueButtonAction queueButtonAction = this.$button.a;
            aVar.getClass();
            int i2 = ckg0.a[queueButtonAction.ordinal()];
            wkg0Var = i2 != 1 ? i2 != 2 ? null : vkg0.a : ukg0.a;
            Double d2 = new Double(this.$button.f);
            double doubleValue = d2.doubleValue();
            if (0.0d > doubleValue || doubleValue > 1.0d) {
                d2 = null;
            }
            double doubleValue2 = d2 != null ? d2.doubleValue() : 1.0d;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = a;
            this.L$3 = wkg0Var;
            this.D$0 = doubleValue2;
            this.label = 1;
            obj = h.s(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            kdcVar = a;
            d = doubleValue2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            d = this.D$0;
            wkg0Var = (wkg0) this.L$3;
            kdcVar = (kdc) this.L$2;
            b.b(obj);
        }
        wkg0 wkg0Var2 = wkg0Var;
        QueueScreen.QueueButton queueButton = this.$button;
        return new xkg0(kdcVar, (CharSequence) obj, wkg0Var2, queueButton.d, queueButton.e, (float) d);
    }
}
