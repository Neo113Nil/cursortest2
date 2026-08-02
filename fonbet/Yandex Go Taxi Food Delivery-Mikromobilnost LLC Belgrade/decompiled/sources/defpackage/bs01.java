package defpackage;

import com.ybsdk.feature.transfer.internal.screens.result.presentation.TransferResultFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class bs01 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ ca61 b;
    public final /* synthetic */ wty0 c;
    public final /* synthetic */ TransferResultFragment w;

    public /* synthetic */ bs01(ca61 ca61Var, wty0 wty0Var, TransferResultFragment transferResultFragment, int i) {
        this.a = i;
        this.b = ca61Var;
        this.c = wty0Var;
        this.w = transferResultFragment;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 title$lambda$9$lambda$8;
        zy11 message$lambda$11$lambda$10;
        int i = this.a;
        TransferResultFragment transferResultFragment = this.w;
        wty0 wty0Var = this.c;
        ca61 ca61Var = this.b;
        switch (i) {
            case 0:
                title$lambda$9$lambda$8 = TransferResultFragment.setTitle$lambda$9$lambda$8(ca61Var, wty0Var, transferResultFragment);
                return title$lambda$9$lambda$8;
            default:
                message$lambda$11$lambda$10 = TransferResultFragment.setMessage$lambda$11$lambda$10(ca61Var, wty0Var, transferResultFragment);
                return message$lambda$11$lambda$10;
        }
    }
}
