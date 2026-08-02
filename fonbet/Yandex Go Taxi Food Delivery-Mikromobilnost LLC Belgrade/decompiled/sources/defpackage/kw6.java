package defpackage;

import com.yandex.go.payments.shared.business.accountcreation.BusinessAccountCreationView;

/* loaded from: classes13.dex */
public final /* synthetic */ class kw6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ BusinessAccountCreationView b;

    public /* synthetic */ kw6(BusinessAccountCreationView businessAccountCreationView, int i) {
        this.a = i;
        this.b = businessAccountCreationView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        BusinessAccountCreationView businessAccountCreationView = this.b;
        switch (i) {
            case 0:
                businessAccountCreationView.requestFocus();
                break;
            case 1:
                BusinessAccountCreationView.setupViews$lambda$0(businessAccountCreationView);
                break;
            case 2:
                BusinessAccountCreationView.setupViews$lambda$1(businessAccountCreationView);
                break;
            case 3:
                BusinessAccountCreationView.setupViews$lambda$2(businessAccountCreationView);
                break;
            case 4:
                BusinessAccountCreationView.setupViews$lambda$3(businessAccountCreationView);
                break;
            default:
                BusinessAccountCreationView.setupViews$lambda$4(businessAccountCreationView);
                break;
        }
    }
}
