package defpackage;

import ru.yandex.taxi.address.clarification.impl.ui.AddressAdjustmentModalView;

/* loaded from: classes5.dex */
public final /* synthetic */ class ip0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ AddressAdjustmentModalView b;

    public /* synthetic */ ip0(AddressAdjustmentModalView addressAdjustmentModalView, int i) {
        this.a = i;
        this.b = addressAdjustmentModalView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        AddressAdjustmentModalView addressAdjustmentModalView = this.b;
        switch (i) {
            case 0:
                AddressAdjustmentModalView._init_$lambda$0(addressAdjustmentModalView);
                break;
            case 1:
                addressAdjustmentModalView.onBackPressed();
                break;
            case 2:
                AddressAdjustmentModalView.onAttachedToWindow$lambda$0(addressAdjustmentModalView);
                break;
            default:
                AddressAdjustmentModalView.onAttachedToWindow$lambda$1(addressAdjustmentModalView);
                break;
        }
    }
}
