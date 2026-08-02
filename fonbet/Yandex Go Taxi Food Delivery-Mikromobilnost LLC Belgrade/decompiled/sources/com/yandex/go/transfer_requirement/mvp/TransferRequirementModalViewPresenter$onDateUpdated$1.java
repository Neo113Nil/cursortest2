package com.yandex.go.transfer_requirement.mvp;

import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.op01;
import defpackage.rsb1;
import defpackage.tse;
import defpackage.wls;
import defpackage.yo01;
import defpackage.zo01;
import defpackage.zy11;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.transfer_requirement.mvp.TransferRequirementModalViewPresenter$onDateUpdated$1", f = "TransferRequirementModalViewPresenter.kt", l = {HProv.ALG_SID_GR3410_12_256}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
public final class TransferRequirementModalViewPresenter$onDateUpdated$1 extends SuspendLambda implements wls {
    final /* synthetic */ Calendar $date;
    int label;
    final /* synthetic */ op01 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferRequirementModalViewPresenter$onDateUpdated$1(op01 op01Var, Calendar calendar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = op01Var;
        this.$date = calendar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TransferRequirementModalViewPresenter$onDateUpdated$1(this.this$0, this.$date, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TransferRequirementModalViewPresenter$onDateUpdated$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a;
        TimeZone timeZone;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        LocalDate localDate = null;
        zy11 zy11Var = zy11.a;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return zy11Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        com.yandex.go.transfer_requirement.card_state.a aVar = this.this$0.A;
        Calendar calendar = this.$date;
        this.label = 1;
        zo01 zo01Var = aVar.e;
        yo01 a2 = zo01Var.a();
        Calendar calendar2 = a2.a;
        TimeZone timeZone2 = calendar.getTimeZone();
        LocalDate localDate2 = timeZone2 == null ? null : LocalDateTime.ofInstant(calendar.toInstant(), timeZone2.toZoneId()).toLocalDate();
        if (calendar2 != null && (timeZone = calendar2.getTimeZone()) != null) {
            localDate = LocalDateTime.ofInstant(calendar2.toInstant(), timeZone.toZoneId()).toLocalDate();
        }
        if (jl40.l(localDate2, localDate)) {
            a = zy11Var;
        } else {
            yo01 a3 = yo01.a(a2, rsb1.d(calendar, 0, 0), null, null, null, 0, null, null, null, 254);
            zo01Var.b(a3);
            a = aVar.a(a3, this);
        }
        return a == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
