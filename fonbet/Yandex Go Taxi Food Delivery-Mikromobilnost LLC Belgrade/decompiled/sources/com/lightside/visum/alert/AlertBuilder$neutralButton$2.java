package com.lightside.visum.alert;

import android.content.DialogInterface;
import androidx.appcompat.app.AlertDialog;
import defpackage.tls;
import kotlin.Metadata;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
/* loaded from: classes11.dex */
public final class AlertBuilder$neutralButton$2 implements DialogInterface.OnClickListener {
    final /* synthetic */ tls $onClicked;

    public AlertBuilder$neutralButton$2(tls tlsVar) {
        this.$onClicked = tlsVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.$onClicked.invoke((AlertDialog) dialogInterface);
    }
}
