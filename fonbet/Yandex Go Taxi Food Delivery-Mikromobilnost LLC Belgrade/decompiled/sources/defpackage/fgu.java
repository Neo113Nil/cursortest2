package defpackage;

import androidx.credentials.playservices.HiddenActivity;

/* loaded from: classes10.dex */
public final /* synthetic */ class fgu implements iy60 {
    public final /* synthetic */ int a;
    public final /* synthetic */ HiddenActivity b;

    public /* synthetic */ fgu(HiddenActivity hiddenActivity, int i) {
        this.a = i;
        this.b = hiddenActivity;
    }

    @Override // defpackage.iy60
    public final void onFailure(Exception exc) {
        int i = this.a;
        HiddenActivity hiddenActivity = this.b;
        switch (i) {
            case 0:
                HiddenActivity.handleCreatePublicKeyCredential$lambda$2$lambda$1(hiddenActivity, exc);
                break;
            case 1:
                HiddenActivity.handleCreatePassword$lambda$14$lambda$13(hiddenActivity, exc);
                break;
            case 2:
                HiddenActivity.handleGetSignInIntent$lambda$6$lambda$5(hiddenActivity, exc);
                break;
            default:
                HiddenActivity.handleBeginSignIn$lambda$10$lambda$9(hiddenActivity, exc);
                break;
        }
    }
}
