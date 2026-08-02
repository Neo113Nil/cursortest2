package com.yandex.go.chargers.discounts.activate;

import defpackage.eja1;
import defpackage.hoy0;
import defpackage.lt9;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oz40;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.discounts.activate.ChargersDiscountsActivateScreenKt$Content$1$1", f = "ChargersDiscountsActivateScreen.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes11.dex */
final class ChargersDiscountsActivateScreenKt$Content$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ lt9 $content;
    final /* synthetic */ oz40 $textFieldValue$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersDiscountsActivateScreenKt$Content$1$1(lt9 lt9Var, oz40 oz40Var, Continuation continuation) {
        super(2, continuation);
        this.$content = lt9Var;
        this.$textFieldValue$delegate = oz40Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChargersDiscountsActivateScreenKt$Content$1$1(this.$content, this.$textFieldValue$delegate, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ChargersDiscountsActivateScreenKt$Content$1$1 chargersDiscountsActivateScreenKt$Content$1$1 = (ChargersDiscountsActivateScreenKt$Content$1$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        chargersDiscountsActivateScreenKt$Content$1$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (((hoy0) this.$textFieldValue$delegate.getValue()).a.b.length() == 0 && this.$content.d.length() > 0) {
            String upperCase = this.$content.d.toUpperCase(Locale.ROOT);
            oz40 oz40Var = this.$textFieldValue$delegate;
            int length = upperCase.length();
            oz40Var.setValue(new hoy0(upperCase, eja1.c(length, length), 4));
        }
        return zy11.a;
    }
}
