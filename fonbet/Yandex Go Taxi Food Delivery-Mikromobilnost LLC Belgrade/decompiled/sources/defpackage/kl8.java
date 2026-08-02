package defpackage;

import com.ybsdk.feature.card.internal.presentation.cardpin.CardPinCodeFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class kl8 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ CardPinCodeFragment b;

    public /* synthetic */ kl8(CardPinCodeFragment cardPinCodeFragment, int i) {
        this.a = i;
        this.b = cardPinCodeFragment;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 onViewCreated$lambda$3$lambda$2;
        zy11 renderErrorState$lambda$8;
        zy11 renderEnteringState$lambda$5$lambda$4;
        zy11 renderMismatchState$lambda$6;
        zy11 renderSuccessState$lambda$7;
        int i = this.a;
        CardPinCodeFragment cardPinCodeFragment = this.b;
        switch (i) {
            case 0:
                onViewCreated$lambda$3$lambda$2 = CardPinCodeFragment.onViewCreated$lambda$3$lambda$2(cardPinCodeFragment);
                return onViewCreated$lambda$3$lambda$2;
            case 1:
                renderErrorState$lambda$8 = CardPinCodeFragment.renderErrorState$lambda$8(cardPinCodeFragment);
                return renderErrorState$lambda$8;
            case 2:
                renderEnteringState$lambda$5$lambda$4 = CardPinCodeFragment.renderEnteringState$lambda$5$lambda$4(cardPinCodeFragment);
                return renderEnteringState$lambda$5$lambda$4;
            case 3:
                renderMismatchState$lambda$6 = CardPinCodeFragment.renderMismatchState$lambda$6(cardPinCodeFragment);
                return renderMismatchState$lambda$6;
            default:
                renderSuccessState$lambda$7 = CardPinCodeFragment.renderSuccessState$lambda$7(cardPinCodeFragment);
                return renderSuccessState$lambda$7;
        }
    }
}
