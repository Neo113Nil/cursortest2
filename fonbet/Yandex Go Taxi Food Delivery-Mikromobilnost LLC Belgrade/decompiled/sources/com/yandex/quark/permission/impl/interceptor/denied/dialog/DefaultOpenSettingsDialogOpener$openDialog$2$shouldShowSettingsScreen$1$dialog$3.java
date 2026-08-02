package com.yandex.quark.permission.impl.interceptor.denied.dialog;

import android.content.DialogInterface;
import defpackage.i18;
import kotlin.Metadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
final class DefaultOpenSettingsDialogOpener$openDialog$2$shouldShowSettingsScreen$1$dialog$3 implements DialogInterface.OnCancelListener {
    final /* synthetic */ i18 $continuation;

    public DefaultOpenSettingsDialogOpener$openDialog$2$shouldShowSettingsScreen$1$dialog$3(i18 i18Var) {
        this.$continuation = i18Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.$continuation.resumeWith(Boolean.FALSE);
    }
}
