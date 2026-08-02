package com.yandex.quark.permission.impl.interceptor.denied.dialog;

import android.content.DialogInterface;
import defpackage.i18;
import kotlin.Metadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
final class DefaultOpenSettingsDialogOpener$openDialog$2$shouldShowSettingsScreen$1$dialog$1 implements DialogInterface.OnClickListener {
    final /* synthetic */ i18 $continuation;

    public DefaultOpenSettingsDialogOpener$openDialog$2$shouldShowSettingsScreen$1$dialog$1(i18 i18Var) {
        this.$continuation = i18Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        this.$continuation.resumeWith(Boolean.TRUE);
    }
}
