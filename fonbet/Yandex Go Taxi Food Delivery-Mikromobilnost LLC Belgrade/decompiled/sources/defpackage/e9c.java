package defpackage;

import android.view.View;
import com.ybsdk.screens.registration.codeconfirmation.presentation.CodeConfirmationFragment;

/* loaded from: classes2.dex */
public final /* synthetic */ class e9c implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ CodeConfirmationFragment b;

    public /* synthetic */ e9c(CodeConfirmationFragment codeConfirmationFragment, int i) {
        this.a = i;
        this.b = codeConfirmationFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        CodeConfirmationFragment codeConfirmationFragment = this.b;
        switch (i) {
            case 0:
                codeConfirmationFragment.showLogoutDialog();
                break;
            case 1:
                codeConfirmationFragment.showLogoutDialog();
                break;
            default:
                CodeConfirmationFragment.onViewCreated$lambda$3(codeConfirmationFragment, view);
                break;
        }
    }
}
