package defpackage;

import com.ybsdk.feature.card.internal.presentation.carddetails.CardDetailsFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class md8 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ CardDetailsFragment b;

    public /* synthetic */ md8(CardDetailsFragment cardDetailsFragment, int i) {
        this.a = i;
        this.b = cardDetailsFragment;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 viewBinding$lambda$27$lambda$2;
        zy11 viewBinding$lambda$27$lambda$11;
        zy11 onViewCreated$lambda$30;
        zy11 render$lambda$35$lambda$33;
        int i = this.a;
        CardDetailsFragment cardDetailsFragment = this.b;
        switch (i) {
            case 0:
                viewBinding$lambda$27$lambda$2 = CardDetailsFragment.getViewBinding$lambda$27$lambda$2(cardDetailsFragment);
                return viewBinding$lambda$27$lambda$2;
            case 1:
                viewBinding$lambda$27$lambda$11 = CardDetailsFragment.getViewBinding$lambda$27$lambda$11(cardDetailsFragment);
                return viewBinding$lambda$27$lambda$11;
            case 2:
                onViewCreated$lambda$30 = CardDetailsFragment.onViewCreated$lambda$30(cardDetailsFragment);
                return onViewCreated$lambda$30;
            case 3:
                render$lambda$35$lambda$33 = CardDetailsFragment.render$lambda$35$lambda$33(cardDetailsFragment);
                return render$lambda$35$lambda$33;
            default:
                CardDetailsFragment.access$getBinding(cardDetailsFragment).r.requestLayout();
                return zy11.a;
        }
    }
}
