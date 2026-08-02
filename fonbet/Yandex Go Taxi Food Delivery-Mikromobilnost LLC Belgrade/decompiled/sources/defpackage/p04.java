package defpackage;

import com.ybsdk.feature.autotopup.internal.presentation.setup.v2.AutoTopupSetupV2Fragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class p04 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ AutoTopupSetupV2Fragment b;

    public /* synthetic */ p04(AutoTopupSetupV2Fragment autoTopupSetupV2Fragment, int i) {
        this.a = i;
        this.b = autoTopupSetupV2Fragment;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 onViewCreated$lambda$4$lambda$3;
        zy11 openSavingNotice$lambda$27$lambda$26$lambda$25;
        int i = this.a;
        AutoTopupSetupV2Fragment autoTopupSetupV2Fragment = this.b;
        switch (i) {
            case 0:
                onViewCreated$lambda$4$lambda$3 = AutoTopupSetupV2Fragment.onViewCreated$lambda$4$lambda$3(autoTopupSetupV2Fragment);
                return onViewCreated$lambda$4$lambda$3;
            default:
                openSavingNotice$lambda$27$lambda$26$lambda$25 = AutoTopupSetupV2Fragment.openSavingNotice$lambda$27$lambda$26$lambda$25(autoTopupSetupV2Fragment);
                return openSavingNotice$lambda$27$lambda$26$lambda$25;
        }
    }
}
