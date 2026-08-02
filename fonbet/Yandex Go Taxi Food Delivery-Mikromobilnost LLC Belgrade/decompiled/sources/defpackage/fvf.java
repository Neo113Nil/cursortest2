package defpackage;

import com.yandex.payment.divkit.verify.DKVerifyCardFragment;

/* loaded from: classes2.dex */
public final /* synthetic */ class fvf implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ DKVerifyCardFragment b;

    public /* synthetic */ fvf(DKVerifyCardFragment dKVerifyCardFragment, int i) {
        this.a = i;
        this.b = dKVerifyCardFragment;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 observeLiveData$lambda$1;
        zy11 observeLiveData$lambda$2;
        zy11 observeLiveData$lambda$3;
        zy11 observeLiveData$lambda$4;
        zy11 observeSaveCardFlag$lambda$0;
        zy11 onViewCreated$lambda$1;
        zy11 onViewCreated$lambda$2;
        zy11 observeLiveData$lambda$0;
        int i = this.a;
        DKVerifyCardFragment dKVerifyCardFragment = this.b;
        switch (i) {
            case 0:
                observeLiveData$lambda$1 = DKVerifyCardFragment.observeLiveData$lambda$1(dKVerifyCardFragment, (Boolean) obj);
                return observeLiveData$lambda$1;
            case 1:
                observeLiveData$lambda$2 = DKVerifyCardFragment.observeLiveData$lambda$2(dKVerifyCardFragment, (nl41) obj);
                return observeLiveData$lambda$2;
            case 2:
                observeLiveData$lambda$3 = DKVerifyCardFragment.observeLiveData$lambda$3(dKVerifyCardFragment, (nl41) obj);
                return observeLiveData$lambda$3;
            case 3:
                observeLiveData$lambda$4 = DKVerifyCardFragment.observeLiveData$lambda$4(dKVerifyCardFragment, (nn8) obj);
                return observeLiveData$lambda$4;
            case 4:
                observeSaveCardFlag$lambda$0 = DKVerifyCardFragment.observeSaveCardFlag$lambda$0(dKVerifyCardFragment, (Boolean) obj);
                return observeSaveCardFlag$lambda$0;
            case 5:
                onViewCreated$lambda$1 = DKVerifyCardFragment.onViewCreated$lambda$1(dKVerifyCardFragment, (rf8) obj);
                return onViewCreated$lambda$1;
            case 6:
                onViewCreated$lambda$2 = DKVerifyCardFragment.onViewCreated$lambda$2(dKVerifyCardFragment, (String) obj);
                return onViewCreated$lambda$2;
            default:
                observeLiveData$lambda$0 = DKVerifyCardFragment.observeLiveData$lambda$0(dKVerifyCardFragment, (nn8) obj);
                return observeLiveData$lambda$0;
        }
    }
}
