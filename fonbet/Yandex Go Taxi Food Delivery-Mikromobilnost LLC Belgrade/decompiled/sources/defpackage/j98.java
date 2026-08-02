package defpackage;

import androidx.constraintlayout.widget.e;
import androidx.transition.Transition;
import com.ybsdk.feature.card.internal.presentation.cardactivation.CardActivationFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class j98 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ CardActivationFragment b;

    public /* synthetic */ j98(CardActivationFragment cardActivationFragment, int i) {
        this.a = i;
        this.b = cardActivationFragment;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        e constraintSetCvv_delegate$lambda$1;
        zy11 viewBinding$lambda$15$lambda$13;
        zy11 viewBinding$lambda$15$lambda$14;
        e constraintSetCard_delegate$lambda$3;
        Transition inputStateTransition_delegate$lambda$5;
        zy11 viewBinding$lambda$15$lambda$7;
        zy11 viewBinding$lambda$15$lambda$10;
        int i = this.a;
        CardActivationFragment cardActivationFragment = this.b;
        switch (i) {
            case 0:
                constraintSetCvv_delegate$lambda$1 = CardActivationFragment.constraintSetCvv_delegate$lambda$1(cardActivationFragment);
                return constraintSetCvv_delegate$lambda$1;
            case 1:
                viewBinding$lambda$15$lambda$13 = CardActivationFragment.getViewBinding$lambda$15$lambda$13(cardActivationFragment);
                return viewBinding$lambda$15$lambda$13;
            case 2:
                viewBinding$lambda$15$lambda$14 = CardActivationFragment.getViewBinding$lambda$15$lambda$14(cardActivationFragment);
                return viewBinding$lambda$15$lambda$14;
            case 3:
                constraintSetCard_delegate$lambda$3 = CardActivationFragment.constraintSetCard_delegate$lambda$3(cardActivationFragment);
                return constraintSetCard_delegate$lambda$3;
            case 4:
                inputStateTransition_delegate$lambda$5 = CardActivationFragment.inputStateTransition_delegate$lambda$5(cardActivationFragment);
                return inputStateTransition_delegate$lambda$5;
            case 5:
                viewBinding$lambda$15$lambda$7 = CardActivationFragment.getViewBinding$lambda$15$lambda$7(cardActivationFragment);
                return viewBinding$lambda$15$lambda$7;
            default:
                viewBinding$lambda$15$lambda$10 = CardActivationFragment.getViewBinding$lambda$15$lambda$10(cardActivationFragment);
                return viewBinding$lambda$15$lambda$10;
        }
    }
}
