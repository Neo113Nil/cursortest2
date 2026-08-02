package defpackage;

import android.view.View;
import com.ybsdk.feature.transfer.version2.internal.screens.me2me.confirm.TransferMe2MeConfirmFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class am01 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ TransferMe2MeConfirmFragment b;

    public /* synthetic */ am01(TransferMe2MeConfirmFragment transferMe2MeConfirmFragment, int i) {
        this.a = i;
        this.b = transferMe2MeConfirmFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        TransferMe2MeConfirmFragment transferMe2MeConfirmFragment = this.b;
        switch (i) {
            case 0:
                TransferMe2MeConfirmFragment.getViewBinding$lambda$7$lambda$4(transferMe2MeConfirmFragment, view);
                break;
            default:
                TransferMe2MeConfirmFragment.renderBottomSheet$lambda$25$lambda$22$lambda$21$lambda$20$lambda$18(transferMe2MeConfirmFragment, view);
                break;
        }
    }
}
