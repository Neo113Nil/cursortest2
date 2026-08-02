package defpackage;

import com.ybsdk.feature.partnerpayments.internal.screens.save.presentation.PartnerSaveFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class oh90 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ PartnerSaveFragment b;

    public /* synthetic */ oh90(PartnerSaveFragment partnerSaveFragment, int i) {
        this.a = i;
        this.b = partnerSaveFragment;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 onCreate$lambda$6;
        zy11 onCreate$lambda$7;
        zy11 viewBinding$lambda$3$lambda$2$lambda$0;
        zy11 viewBinding$lambda$3$lambda$2$lambda$1;
        int i = this.a;
        PartnerSaveFragment partnerSaveFragment = this.b;
        switch (i) {
            case 0:
                onCreate$lambda$6 = PartnerSaveFragment.onCreate$lambda$6(partnerSaveFragment);
                return onCreate$lambda$6;
            case 1:
                onCreate$lambda$7 = PartnerSaveFragment.onCreate$lambda$7(partnerSaveFragment);
                return onCreate$lambda$7;
            case 2:
                viewBinding$lambda$3$lambda$2$lambda$0 = PartnerSaveFragment.getViewBinding$lambda$3$lambda$2$lambda$0(partnerSaveFragment);
                return viewBinding$lambda$3$lambda$2$lambda$0;
            default:
                viewBinding$lambda$3$lambda$2$lambda$1 = PartnerSaveFragment.getViewBinding$lambda$3$lambda$2$lambda$1(partnerSaveFragment);
                return viewBinding$lambda$3$lambda$2$lambda$1;
        }
    }
}
