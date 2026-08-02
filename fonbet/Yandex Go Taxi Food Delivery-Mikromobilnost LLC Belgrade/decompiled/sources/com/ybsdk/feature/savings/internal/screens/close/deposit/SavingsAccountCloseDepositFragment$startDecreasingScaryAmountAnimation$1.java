package com.ybsdk.feature.savings.internal.screens.close.deposit;

import android.widget.TextView;
import com.ybsdk.core.utils.NumberFormatUtils$Currencies;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.savings.internal.screens.close.deposit.SavingsAccountCloseDepositFragment$startDecreasingScaryAmountAnimation$1", f = "SavingsAccountCloseDepositFragment.kt", l = {205}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class SavingsAccountCloseDepositFragment$startDecreasingScaryAmountAnimation$1 extends SuspendLambda implements wls {
    final /* synthetic */ long $balanceAnimationStepMs;
    final /* synthetic */ NumberFormatUtils$Currencies $currency;
    final /* synthetic */ float $decrement;
    final /* synthetic */ float $endValue;
    final /* synthetic */ float $startValue;
    final /* synthetic */ int $steps;
    final /* synthetic */ TextView $textView;
    int I$0;
    int label;
    final /* synthetic */ SavingsAccountCloseDepositFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SavingsAccountCloseDepositFragment$startDecreasingScaryAmountAnimation$1(int i, float f, float f2, SavingsAccountCloseDepositFragment savingsAccountCloseDepositFragment, NumberFormatUtils$Currencies numberFormatUtils$Currencies, TextView textView, long j, float f3, Continuation continuation) {
        super(2, continuation);
        this.$steps = i;
        this.$startValue = f;
        this.$decrement = f2;
        this.this$0 = savingsAccountCloseDepositFragment;
        this.$currency = numberFormatUtils$Currencies;
        this.$textView = textView;
        this.$balanceAnimationStepMs = j;
        this.$endValue = f3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SavingsAccountCloseDepositFragment$startDecreasingScaryAmountAnimation$1(this.$steps, this.$startValue, this.$decrement, this.this$0, this.$currency, this.$textView, this.$balanceAnimationStepMs, this.$endValue, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SavingsAccountCloseDepositFragment$startDecreasingScaryAmountAnimation$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0044  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x003d -> B:5:0x0040). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        String formatAmount;
        String formatAmount2;
        long j;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            b.b(obj);
            if (this.$steps >= 0) {
                i = 0;
                formatAmount2 = this.this$0.formatAmount(this.$startValue - (i * this.$decrement), this.$currency);
                this.$textView.setText(formatAmount2);
                j = this.$balanceAnimationStepMs;
                this.I$0 = i;
                this.label = 1;
                if (a.i(j, this) == coroutineSingletons) {
                }
                if (i != this.$steps) {
                }
            }
            TextView textView = this.$textView;
            formatAmount = this.this$0.formatAmount(this.$endValue, this.$currency);
            textView.setText(formatAmount);
            return zy11.a;
        }
        if (i2 != 1) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i = this.I$0;
        b.b(obj);
        if (i != this.$steps) {
            i++;
            formatAmount2 = this.this$0.formatAmount(this.$startValue - (i * this.$decrement), this.$currency);
            this.$textView.setText(formatAmount2);
            j = this.$balanceAnimationStepMs;
            this.I$0 = i;
            this.label = 1;
            if (a.i(j, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            if (i != this.$steps) {
            }
        }
        TextView textView2 = this.$textView;
        formatAmount = this.this$0.formatAmount(this.$endValue, this.$currency);
        textView2.setText(formatAmount);
        return zy11.a;
    }
}
