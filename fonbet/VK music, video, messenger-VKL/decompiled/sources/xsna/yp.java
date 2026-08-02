package xsna;

import android.content.DialogInterface;
import com.vk.superapp.vksteps.ui.dialogs.AccountRevokePermissionDialogProvider$DialogResult;

/* compiled from: AccountRevokePermissionDialogProvider.kt */
/* loaded from: classes6.dex */
public final class yp implements DialogInterface.OnClickListener {
    public final /* synthetic */ gzg0 b;

    public yp(gzg0 gzg0Var) {
        this.b = gzg0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.b.resumeWith(AccountRevokePermissionDialogProvider$DialogResult.NEGATIVE);
        dialogInterface.dismiss();
    }
}
