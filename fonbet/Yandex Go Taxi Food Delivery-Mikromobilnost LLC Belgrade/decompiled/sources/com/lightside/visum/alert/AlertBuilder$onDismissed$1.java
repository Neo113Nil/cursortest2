package com.lightside.visum.alert;

import android.content.DialogInterface;
import androidx.appcompat.app.AlertDialog;
import defpackage.tls;
import kotlin.Metadata;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
/* loaded from: classes11.dex */
public final class AlertBuilder$onDismissed$1 implements DialogInterface.OnDismissListener {
    final /* synthetic */ tls $onClicked;

    public AlertBuilder$onDismissed$1(tls tlsVar) {
        this.$onClicked = tlsVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.$onClicked.invoke((AlertDialog) dialogInterface);
    }
}
