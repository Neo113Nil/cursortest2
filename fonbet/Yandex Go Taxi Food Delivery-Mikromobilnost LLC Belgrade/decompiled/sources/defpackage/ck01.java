package defpackage;

import com.ybsdk.feature.transfer.version2.internal.screens.result.TransferMainResultFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class ck01 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ w961 b;
    public final /* synthetic */ vty0 c;
    public final /* synthetic */ TransferMainResultFragment w;

    public /* synthetic */ ck01(w961 w961Var, vty0 vty0Var, TransferMainResultFragment transferMainResultFragment, int i) {
        this.a = i;
        this.b = w961Var;
        this.c = vty0Var;
        this.w = transferMainResultFragment;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 renderDescription$lambda$22$lambda$20$lambda$19;
        zy11 renderTitle$lambda$14$lambda$13;
        int i = this.a;
        TransferMainResultFragment transferMainResultFragment = this.w;
        vty0 vty0Var = this.c;
        w961 w961Var = this.b;
        switch (i) {
            case 0:
                renderDescription$lambda$22$lambda$20$lambda$19 = TransferMainResultFragment.renderDescription$lambda$22$lambda$20$lambda$19(w961Var, vty0Var, transferMainResultFragment);
                return renderDescription$lambda$22$lambda$20$lambda$19;
            default:
                renderTitle$lambda$14$lambda$13 = TransferMainResultFragment.renderTitle$lambda$14$lambda$13(w961Var, vty0Var, transferMainResultFragment);
                return renderTitle$lambda$14$lambda$13;
        }
    }
}
