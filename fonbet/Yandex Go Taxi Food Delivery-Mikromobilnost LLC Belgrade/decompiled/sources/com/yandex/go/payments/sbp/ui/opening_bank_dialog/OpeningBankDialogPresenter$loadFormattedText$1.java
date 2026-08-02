package com.yandex.go.payments.sbp.ui.opening_bank_dialog;

import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qa70;
import defpackage.tls;
import defpackage.tse;
import defpackage.wls;
import defpackage.xby;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.widget.c;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.sbp.ui.opening_bank_dialog.OpeningBankDialogPresenter$loadFormattedText$1", f = "OpeningBankDialogPresenter.kt", l = {43}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class OpeningBankDialogPresenter$loadFormattedText$1 extends SuspendLambda implements wls {
    final /* synthetic */ FormattedText $text;
    final /* synthetic */ tls $viewConsumer;
    Object L$0;
    int label;
    final /* synthetic */ qa70 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpeningBankDialogPresenter$loadFormattedText$1(tls tlsVar, qa70 qa70Var, FormattedText formattedText, Continuation continuation) {
        super(2, continuation);
        this.$viewConsumer = tlsVar;
        this.this$0 = qa70Var;
        this.$text = formattedText;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OpeningBankDialogPresenter$loadFormattedText$1(this.$viewConsumer, this.this$0, this.$text, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OpeningBankDialogPresenter$loadFormattedText$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tls tlsVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                b.b(obj);
                tls tlsVar2 = this.$viewConsumer;
                qa70 qa70Var = this.this$0;
                FormattedText formattedText = this.$text;
                c cVar = qa70Var.z;
                this.L$0 = tlsVar2;
                this.label = 1;
                Object e = c.e(cVar, formattedText, null, false, this, 30);
                if (e == coroutineSingletons) {
                    return coroutineSingletons;
                }
                obj = e;
                tlsVar = tlsVar2;
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                tlsVar = (tls) this.L$0;
                b.b(obj);
            }
            tlsVar.invoke(obj);
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th) {
            xby.l(jst.e, "convert_formatted_text_error", null, th, "getting formatted text error", 2);
        }
        return zy11.a;
    }
}
