package com.lightside.visum.alert;

import android.content.DialogInterface;
import androidx.appcompat.app.AlertDialog;
import defpackage.zls;
import java.util.List;
import kotlin.Metadata;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
/* loaded from: classes12.dex */
public final class AlertBuilder$items$4 implements DialogInterface.OnClickListener {
    final /* synthetic */ List<Object> $items;
    final /* synthetic */ zls $onItemSelected;

    public AlertBuilder$items$4(zls zlsVar, List<Object> list) {
        this.$onItemSelected = zlsVar;
        this.$items = list;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.$onItemSelected.invoke((AlertDialog) dialogInterface, this.$items.get(i), Integer.valueOf(i));
    }
}
