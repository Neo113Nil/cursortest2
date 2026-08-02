package defpackage;

import com.ybsdk.feature.card.internal.presentation.singlecard.SingleCardFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class kgs0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ SingleCardFragment b;

    public /* synthetic */ kgs0(SingleCardFragment singleCardFragment, int i) {
        this.a = i;
        this.b = singleCardFragment;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 zy11Var;
        zy11 onCreate$lambda$18;
        zy11 onViewCreated$lambda$16;
        int i = this.a;
        SingleCardFragment singleCardFragment = this.b;
        switch (i) {
            case 0:
                zy11Var = SingleCardFragment.setupClickListeners$lambda$28$lambda$21(singleCardFragment);
                return zy11Var;
            case 1:
                onCreate$lambda$18 = SingleCardFragment.onCreate$lambda$18(singleCardFragment);
                return onCreate$lambda$18;
            default:
                onViewCreated$lambda$16 = SingleCardFragment.onViewCreated$lambda$16(singleCardFragment);
                return onViewCreated$lambda$16;
        }
    }
}
