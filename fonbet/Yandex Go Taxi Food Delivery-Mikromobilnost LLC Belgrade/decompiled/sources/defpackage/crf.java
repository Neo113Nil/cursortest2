package defpackage;

import com.yandex.payment.divkit.bind.DKBindCardFragment;
import com.yandex.payment.sdk.core.data.CardPaymentSystem;
import com.yandex.payment.sdk.core.data.PaymentMethod;

/* loaded from: classes2.dex */
public final /* synthetic */ class crf implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ DKBindCardFragment b;

    public /* synthetic */ crf(DKBindCardFragment dKBindCardFragment, int i) {
        this.a = i;
        this.b = dKBindCardFragment;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 observeLiveData$lambda$3;
        zy11 observeLiveData$lambda$4;
        zy11 observeLiveData$lambda$5;
        zy11 zy11Var;
        zy11 zy11Var2;
        zy11 zy11Var3;
        zy11 onViewCreated$lambda$3;
        zy11 onViewCreated$lambda$4;
        zy11 observeSaveCardFlag$lambda$0;
        zy11 observeLiveData$lambda$0;
        zy11 observeLiveData$lambda$1;
        zy11 observeLiveData$lambda$2;
        int i = this.a;
        DKBindCardFragment dKBindCardFragment = this.b;
        switch (i) {
            case 0:
                observeLiveData$lambda$3 = DKBindCardFragment.observeLiveData$lambda$3(dKBindCardFragment, (nl41) obj);
                return observeLiveData$lambda$3;
            case 1:
                observeLiveData$lambda$4 = DKBindCardFragment.observeLiveData$lambda$4(dKBindCardFragment, (nl41) obj);
                return observeLiveData$lambda$4;
            case 2:
                observeLiveData$lambda$5 = DKBindCardFragment.observeLiveData$lambda$5(dKBindCardFragment, (nn8) obj);
                return observeLiveData$lambda$5;
            case 3:
                zy11Var = DKBindCardFragment.setupInput$lambda$1$1(dKBindCardFragment, (CardPaymentSystem) obj);
                return zy11Var;
            case 4:
                zy11Var2 = DKBindCardFragment.setupInput$lambda$1$2(dKBindCardFragment, (String) obj);
                return zy11Var2;
            case 5:
                zy11Var3 = DKBindCardFragment.setupInput$lambda$1$5(dKBindCardFragment, (vyv) obj);
                return zy11Var3;
            case 6:
                onViewCreated$lambda$3 = DKBindCardFragment.onViewCreated$lambda$3(dKBindCardFragment, (jhq0) obj);
                return onViewCreated$lambda$3;
            case 7:
                onViewCreated$lambda$4 = DKBindCardFragment.onViewCreated$lambda$4(dKBindCardFragment, (PaymentMethod) obj);
                return onViewCreated$lambda$4;
            case 8:
                observeSaveCardFlag$lambda$0 = DKBindCardFragment.observeSaveCardFlag$lambda$0(dKBindCardFragment, (Boolean) obj);
                return observeSaveCardFlag$lambda$0;
            case 9:
                observeLiveData$lambda$0 = DKBindCardFragment.observeLiveData$lambda$0(dKBindCardFragment, (nn8) obj);
                return observeLiveData$lambda$0;
            case 10:
                observeLiveData$lambda$1 = DKBindCardFragment.observeLiveData$lambda$1(dKBindCardFragment, (Boolean) obj);
                return observeLiveData$lambda$1;
            default:
                observeLiveData$lambda$2 = DKBindCardFragment.observeLiveData$lambda$2(dKBindCardFragment, (f98) obj);
                return observeLiveData$lambda$2;
        }
    }
}
