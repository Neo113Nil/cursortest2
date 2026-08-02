package com.yandex.passport.internal.ui.bouncer.roundabout;

import android.app.Activity;
import android.content.DialogInterface;
import androidx.appcompat.app.AlertDialog;
import com.yandex.passport.R;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.ui.bouncer.model.h2;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class a {
    public final Activity a;
    public final com.yandex.passport.internal.ui.bouncer.t b;

    public a(Activity activity, com.yandex.passport.internal.ui.bouncer.t tVar) {
        this.a = activity;
        this.b = tVar;
    }

    public final void a(final ModernAccount modernAccount, String str) {
        Activity activity = this.a;
        AlertDialog.a aVar = new AlertDialog.a(activity);
        aVar.i(R.string.passport_delete_account_dialog_title);
        aVar.a.f = str != null ? String.format(str, Arrays.copyOf(new Object[]{modernAccount.getPrimaryDisplayName()}, 1)) : activity.getString(R.string.passport_delete_account_dialog_text, modernAccount.getPrimaryDisplayName());
        aVar.setPositiveButton(R.string.passport_delete_account_dialog_delete_button, new DialogInterface.OnClickListener() { // from class: com.yandex.passport.internal.ui.bouncer.roundabout.AccountDeleteDialogProvider$showDeleteDialog$lambda$3$$inlined$positiveButton$1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                a.this.b.a(new h2(modernAccount));
            }
        });
        aVar.setNegativeButton(R.string.passport_delete_account_dialog_cancel_button, new DialogInterface.OnClickListener() { // from class: com.yandex.passport.internal.ui.bouncer.roundabout.AccountDeleteDialogProvider$showDeleteDialog$lambda$3$$inlined$negativeButton$1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
            }
        });
        aVar.create().show();
    }
}
