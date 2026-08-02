package com.yandex.go.shortcuts.impl.view.adapter;

import defpackage.jst;
import defpackage.l47;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.yj11;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.shortcuts.impl.view.adapter.TurboButtonsViewHolder$bindButton$5$1", f = "TurboButtonsViewHolder.kt", l = {HProv.PP_LICENSE}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class TurboButtonsViewHolder$bindButton$5$1 extends SuspendLambda implements wls {
    final /* synthetic */ FormattedText $attributedTitle;
    final /* synthetic */ yj11 $button;
    final /* synthetic */ l47 $holder;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ w this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TurboButtonsViewHolder$bindButton$5$1(w wVar, FormattedText formattedText, l47 l47Var, yj11 yj11Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = wVar;
        this.$attributedTitle = formattedText;
        this.$holder = l47Var;
        this.$button = yj11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TurboButtonsViewHolder$bindButton$5$1(this.this$0, this.$attributedTitle, this.$holder, this.$button, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TurboButtonsViewHolder$bindButton$5$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        l47 l47Var;
        yj11 yj11Var;
        l47 l47Var2;
        FormattedText formattedText;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                w wVar = this.this$0;
                FormattedText formattedText2 = this.$attributedTitle;
                l47 l47Var3 = this.$holder;
                yj11 yj11Var2 = this.$button;
                try {
                    ru.yandex.taxi.widget.c cVar = wVar.V;
                    this.L$0 = l47Var3;
                    this.L$1 = l47Var3;
                    this.L$2 = yj11Var2;
                    this.label = 1;
                    obj = ru.yandex.taxi.widget.c.e(cVar, formattedText2, null, false, this, 30);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    l47Var2 = l47Var3;
                    l47Var = l47Var2;
                    yj11Var = yj11Var2;
                } catch (Throwable th2) {
                    th = th2;
                    l47Var = l47Var3;
                    yj11Var = yj11Var2;
                    RobotoTextView robotoTextView = l47Var.f;
                    formattedText = yj11Var.d;
                    if (formattedText != null || (r0 = formattedText.a()) == null) {
                        CharSequence charSequence = yj11Var.c;
                    }
                    robotoTextView.setText(charSequence);
                    jst.e.k(th, "Title of turbo button fail loading");
                    return zy11.a;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                yj11Var = (yj11) this.L$2;
                l47Var = (l47) this.L$1;
                l47Var2 = (l47) this.L$0;
                try {
                    kotlin.b.b(obj);
                } catch (Throwable th3) {
                    th = th3;
                    RobotoTextView robotoTextView2 = l47Var.f;
                    formattedText = yj11Var.d;
                    if (formattedText != null) {
                    }
                    CharSequence charSequence2 = yj11Var.c;
                    robotoTextView2.setText(charSequence2);
                    jst.e.k(th, "Title of turbo button fail loading");
                    return zy11.a;
                }
            }
            l47Var2.f.setText((CharSequence) obj);
            return zy11.a;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
