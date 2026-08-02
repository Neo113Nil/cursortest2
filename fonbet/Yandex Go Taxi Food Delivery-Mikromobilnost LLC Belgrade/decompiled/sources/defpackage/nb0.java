package defpackage;

import com.yandex.go.payments.cards.ui.AddCardViewImpl;

/* loaded from: classes13.dex */
public final /* synthetic */ class nb0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ AddCardViewImpl b;

    public /* synthetic */ nb0(AddCardViewImpl addCardViewImpl, int i) {
        this.a = i;
        this.b = addCardViewImpl;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 showTopTrailing$lambda$0;
        zy11 cardScanButtonVisible$lambda$0;
        zy11 zy11Var;
        int i = this.a;
        AddCardViewImpl addCardViewImpl = this.b;
        switch (i) {
            case 0:
                showTopTrailing$lambda$0 = AddCardViewImpl.showTopTrailing$lambda$0(addCardViewImpl);
                return showTopTrailing$lambda$0;
            case 1:
                cardScanButtonVisible$lambda$0 = AddCardViewImpl.setCardScanButtonVisible$lambda$0(addCardViewImpl);
                return cardScanButtonVisible$lambda$0;
            default:
                zy11Var = AddCardViewImpl.setupBubbleCvnHelp$lambda$0(addCardViewImpl);
                return zy11Var;
        }
    }
}
