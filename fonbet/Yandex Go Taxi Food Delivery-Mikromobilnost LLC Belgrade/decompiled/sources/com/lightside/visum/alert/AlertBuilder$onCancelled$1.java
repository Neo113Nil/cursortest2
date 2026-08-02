package com.lightside.visum.alert;

import android.content.DialogInterface;
import androidx.appcompat.app.AlertDialog;
import defpackage.tls;
import kotlin.Metadata;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
/* loaded from: classes15.dex */
public final class AlertBuilder$onCancelled$1 implements DialogInterface.OnCancelListener {
    final /* synthetic */ tls $handler;

    public AlertBuilder$onCancelled$1(tls tlsVar) {
        this.$handler = tlsVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.$handler.invoke((AlertDialog) dialogInterface);
    }
}
