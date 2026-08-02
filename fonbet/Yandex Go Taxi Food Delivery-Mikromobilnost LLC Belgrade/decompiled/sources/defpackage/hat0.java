package defpackage;

import com.yandex.go.address_confirmation.modal.SourceAddressConfirmationModalView;

/* loaded from: classes12.dex */
public final /* synthetic */ class hat0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ SourceAddressConfirmationModalView b;

    public /* synthetic */ hat0(SourceAddressConfirmationModalView sourceAddressConfirmationModalView, int i) {
        this.a = i;
        this.b = sourceAddressConfirmationModalView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        SourceAddressConfirmationModalView sourceAddressConfirmationModalView = this.b;
        switch (i) {
            case 0:
                SourceAddressConfirmationModalView.appendPorchNumberButton$lambda$0(sourceAddressConfirmationModalView);
                break;
            case 1:
                SourceAddressConfirmationModalView._init_$lambda$0(sourceAddressConfirmationModalView);
                break;
            case 2:
                SourceAddressConfirmationModalView._init_$lambda$1(sourceAddressConfirmationModalView);
                break;
            case 3:
                SourceAddressConfirmationModalView._init_$lambda$2(sourceAddressConfirmationModalView);
                break;
            case 4:
                SourceAddressConfirmationModalView._init_$lambda$4(sourceAddressConfirmationModalView);
                break;
            case 5:
                SourceAddressConfirmationModalView.lambda$6$0(sourceAddressConfirmationModalView);
                break;
            default:
                SourceAddressConfirmationModalView._init_$lambda$7(sourceAddressConfirmationModalView);
                break;
        }
    }
}
