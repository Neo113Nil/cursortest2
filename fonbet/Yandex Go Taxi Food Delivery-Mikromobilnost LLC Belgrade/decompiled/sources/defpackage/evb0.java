package defpackage;

import com.ybsdk.widgets.common.PinCodeDotsView;

/* loaded from: classes4.dex */
public final /* synthetic */ class evb0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ PinCodeDotsView b;
    public final /* synthetic */ sls c;

    public /* synthetic */ evb0(PinCodeDotsView pinCodeDotsView, sls slsVar, int i) {
        this.a = i;
        this.b = pinCodeDotsView;
        this.c = slsVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 showError$lambda$22;
        zy11 showSuccess$lambda$25;
        int i = this.a;
        sls slsVar = this.c;
        PinCodeDotsView pinCodeDotsView = this.b;
        switch (i) {
            case 0:
                showError$lambda$22 = PinCodeDotsView.showError$lambda$22(pinCodeDotsView, slsVar);
                return showError$lambda$22;
            default:
                showSuccess$lambda$25 = PinCodeDotsView.showSuccess$lambda$25(pinCodeDotsView, slsVar);
                return showSuccess$lambda$25;
        }
    }
}
