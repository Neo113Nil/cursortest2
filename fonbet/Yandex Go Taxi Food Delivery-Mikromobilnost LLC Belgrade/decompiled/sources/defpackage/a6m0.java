package defpackage;

import com.ybsdk.feature.savings.internal.screens.account.SavingsAccountFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class a6m0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ SavingsAccountFragment b;

    public /* synthetic */ a6m0(SavingsAccountFragment savingsAccountFragment, int i) {
        this.a = i;
        this.b = savingsAccountFragment;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 showThemeSelector$lambda$29$lambda$28;
        zy11 showUnlock$lambda$34$lambda$33;
        int i = this.a;
        SavingsAccountFragment savingsAccountFragment = this.b;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        switch (i) {
            case 0:
                showThemeSelector$lambda$29$lambda$28 = SavingsAccountFragment.showThemeSelector$lambda$29$lambda$28(savingsAccountFragment, booleanValue);
                return showThemeSelector$lambda$29$lambda$28;
            default:
                showUnlock$lambda$34$lambda$33 = SavingsAccountFragment.showUnlock$lambda$34$lambda$33(savingsAccountFragment, booleanValue);
                return showUnlock$lambda$34$lambda$33;
        }
    }
}
