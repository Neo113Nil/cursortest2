package defpackage;

import com.ybsdk.feature.autotopup.internal.presentation.saver.RoundingFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class pyk0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ RoundingFragment b;

    public /* synthetic */ pyk0(RoundingFragment roundingFragment, int i) {
        this.a = i;
        this.b = roundingFragment;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 viewBinding$lambda$9$lambda$7;
        zy11 viewBinding$lambda$9$lambda$8;
        qa3 adapter_delegate$lambda$1;
        int i = this.a;
        RoundingFragment roundingFragment = this.b;
        switch (i) {
            case 0:
                viewBinding$lambda$9$lambda$7 = RoundingFragment.getViewBinding$lambda$9$lambda$7(roundingFragment);
                return viewBinding$lambda$9$lambda$7;
            case 1:
                viewBinding$lambda$9$lambda$8 = RoundingFragment.getViewBinding$lambda$9$lambda$8(roundingFragment);
                return viewBinding$lambda$9$lambda$8;
            default:
                adapter_delegate$lambda$1 = RoundingFragment.adapter_delegate$lambda$1(roundingFragment);
                return adapter_delegate$lambda$1;
        }
    }
}
