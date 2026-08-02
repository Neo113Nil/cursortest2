package defpackage;

import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.cardinput.CardInputMainView;

/* loaded from: classes12.dex */
public final /* synthetic */ class jg8 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ CardInputMainView b;

    public /* synthetic */ jg8(CardInputMainView cardInputMainView, int i) {
        this.a = i;
        this.b = cardInputMainView;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 viewController$lambda$0;
        boolean cancelWaitingForBin;
        zy11 _init_$lambda$12;
        int i = this.a;
        CardInputMainView cardInputMainView = this.b;
        switch (i) {
            case 0:
                viewController$lambda$0 = CardInputMainView.viewController$lambda$0(cardInputMainView);
                return viewController$lambda$0;
            case 1:
                cancelWaitingForBin = cardInputMainView.cancelWaitingForBin();
                return Boolean.valueOf(cancelWaitingForBin);
            default:
                _init_$lambda$12 = CardInputMainView._init_$lambda$12(cardInputMainView);
                return _init_$lambda$12;
        }
    }
}
