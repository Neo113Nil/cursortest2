package com.yandex.go.shortcuts.impl.view.adapter;

import defpackage.da5;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.shortcuts.impl.view.adapter.BaseShortcutViewHolder$setFormattedTextToView$2", f = "BaseShortcutViewHolder.kt", l = {150}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class BaseShortcutViewHolder$setFormattedTextToView$2 extends SuspendLambda implements wls {
    final /* synthetic */ da5 $text;
    final /* synthetic */ tls $textConverter;
    final /* synthetic */ RobotoTextView $view;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseShortcutViewHolder$setFormattedTextToView$2(RobotoTextView robotoTextView, da5 da5Var, tls tlsVar, c cVar, Continuation continuation) {
        super(2, continuation);
        this.$view = robotoTextView;
        this.$text = da5Var;
        this.$textConverter = tlsVar;
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BaseShortcutViewHolder$setFormattedTextToView$2(this.$view, this.$text, this.$textConverter, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BaseShortcutViewHolder$setFormattedTextToView$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|2|(1:(3:5|6|7)(2:23|24))(6:25|26|27|28|29|(5:31|10|11|12|13)(2:32|(1:34)(1:35)))|8|9|10|11|12|13|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0078, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0079, code lost:
    
        r11 = r0;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        RobotoTextView robotoTextView;
        tls tlsVar;
        Throwable th;
        da5 da5Var;
        RobotoTextView robotoTextView2;
        tls tlsVar2;
        tls tlsVar3;
        CharSequence charSequence;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                robotoTextView = this.$view;
                da5 da5Var2 = this.$text;
                tlsVar = this.$textConverter;
                c cVar = this.this$0;
                try {
                } catch (Throwable th2) {
                    th = th2;
                }
                try {
                } catch (Throwable th3) {
                    th = th3;
                    da5Var = da5Var2;
                    tlsVar3 = tlsVar;
                    jst.e.k(th, "Shortcut text fail loading");
                    tlsVar3.invoke(da5Var.a);
                    return zy11.a;
                }
                if (da5Var2.b.a.isEmpty()) {
                    charSequence = (CharSequence) tlsVar.invoke(da5Var2.a);
                    da5Var = da5Var2;
                    robotoTextView.setText(charSequence);
                    return zy11.a;
                }
                ru.yandex.taxi.widget.c cVar2 = cVar.T;
                FormattedText formattedText = da5Var2.b;
                this.L$0 = tlsVar;
                this.L$1 = da5Var2;
                this.L$2 = tlsVar;
                this.L$3 = robotoTextView;
                this.label = 1;
                Object e = ru.yandex.taxi.widget.c.e(cVar2, formattedText, null, false, this, 30);
                if (e == coroutineSingletons) {
                    return coroutineSingletons;
                }
                robotoTextView2 = robotoTextView;
                da5Var = da5Var2;
                tlsVar2 = tlsVar;
                obj = e;
                tlsVar3 = tlsVar2;
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                robotoTextView2 = (RobotoTextView) this.L$3;
                tlsVar2 = (tls) this.L$2;
                da5Var = (da5) this.L$1;
                tlsVar3 = (tls) this.L$0;
                try {
                    kotlin.b.b(obj);
                } catch (Throwable th4) {
                    th = th4;
                    jst.e.k(th, "Shortcut text fail loading");
                    tlsVar3.invoke(da5Var.a);
                    return zy11.a;
                }
            }
            tlsVar = tlsVar3;
            charSequence = (CharSequence) tlsVar2.invoke(obj);
            robotoTextView = robotoTextView2;
            robotoTextView.setText(charSequence);
            return zy11.a;
        } catch (CancellationException e2) {
            throw e2;
        }
    }
}
