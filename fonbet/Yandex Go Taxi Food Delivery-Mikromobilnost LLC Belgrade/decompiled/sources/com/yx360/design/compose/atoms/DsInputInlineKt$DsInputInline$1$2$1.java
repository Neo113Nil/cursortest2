package com.yx360.design.compose.atoms;

import defpackage.eja1;
import defpackage.hoy0;
import defpackage.m3u0;
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
@mvg(c = "com.yx360.design.compose.atoms.DsInputInlineKt$DsInputInline$1$2$1", f = "DsInputInline.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class DsInputInlineKt$DsInputInline$1$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ DsInputInline$FocusPosition $focusPosition;
    final /* synthetic */ m3u0 $isFocused$delegate;
    final /* synthetic */ oz40 $textFieldValue$delegate;
    final /* synthetic */ boolean $truncateText;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DsInputInlineKt$DsInputInline$1$2$1(DsInputInline$FocusPosition dsInputInline$FocusPosition, boolean z, m3u0 m3u0Var, oz40 oz40Var, Continuation continuation) {
        super(2, continuation);
        this.$focusPosition = dsInputInline$FocusPosition;
        this.$truncateText = z;
        this.$isFocused$delegate = m3u0Var;
        this.$textFieldValue$delegate = oz40Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DsInputInlineKt$DsInputInline$1$2$1(this.$focusPosition, this.$truncateText, this.$isFocused$delegate, this.$textFieldValue$delegate, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        DsInputInlineKt$DsInputInline$1$2$1 dsInputInlineKt$DsInputInline$1$2$1 = (DsInputInlineKt$DsInputInline$1$2$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        dsInputInlineKt$DsInputInline$1$2$1.invokeSuspend(zy11Var);
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
        boolean booleanValue = ((Boolean) this.$isFocused$delegate.getValue()).booleanValue();
        zy11 zy11Var = zy11.a;
        if (!booleanValue || (this.$focusPosition != DsInputInline$FocusPosition.End && !this.$truncateText)) {
            return zy11Var;
        }
        oz40 oz40Var = this.$textFieldValue$delegate;
        hoy0 hoy0Var = (hoy0) oz40Var.getValue();
        int length = ((hoy0) this.$textFieldValue$delegate.getValue()).a.b.length();
        oz40Var.setValue(hoy0.a(hoy0Var, null, eja1.c(length, length), 5));
        return zy11Var;
    }
}
