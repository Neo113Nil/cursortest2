package com.lightside.visum.alert;

import android.content.DialogInterface;
import androidx.appcompat.app.AlertDialog;
import defpackage.wls;
import kotlin.Metadata;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
/* loaded from: classes12.dex */
public final class AlertBuilder$items$2 implements DialogInterface.OnClickListener {
    final /* synthetic */ wls $onItemSelected;

    public AlertBuilder$items$2(wls wlsVar) {
        this.$onItemSelected = wlsVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.$onItemSelected.invoke((AlertDialog) dialogInterface, Integer.valueOf(i));
    }
}
