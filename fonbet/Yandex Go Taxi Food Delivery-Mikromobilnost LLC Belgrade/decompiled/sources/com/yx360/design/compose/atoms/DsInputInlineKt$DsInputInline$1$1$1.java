package com.yx360.design.compose.atoms;

import defpackage.eja1;
import defpackage.hoy0;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oz40;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yx360.design.compose.atoms.DsInputInlineKt$DsInputInline$1$1$1", f = "DsInputInline.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class DsInputInlineKt$DsInputInline$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ oz40 $textFieldValue$delegate;
    final /* synthetic */ String $value;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DsInputInlineKt$DsInputInline$1$1$1(oz40 oz40Var, String str, Continuation continuation) {
        super(2, continuation);
        this.$value = str;
        this.$textFieldValue$delegate = oz40Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DsInputInlineKt$DsInputInline$1$1$1(this.$textFieldValue$delegate, this.$value, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        DsInputInlineKt$DsInputInline$1$1$1 dsInputInlineKt$DsInputInline$1$1$1 = (DsInputInlineKt$DsInputInline$1$1$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        dsInputInlineKt$DsInputInline$1$1$1.invokeSuspend(zy11Var);
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
        if (!jl40.l(((hoy0) this.$textFieldValue$delegate.getValue()).a.b, this.$value)) {
            oz40 oz40Var = this.$textFieldValue$delegate;
            String str = this.$value;
            int length = str.length();
            oz40Var.setValue(new hoy0(str, eja1.c(length, length), 4));
        }
        return zy11.a;
    }
}
