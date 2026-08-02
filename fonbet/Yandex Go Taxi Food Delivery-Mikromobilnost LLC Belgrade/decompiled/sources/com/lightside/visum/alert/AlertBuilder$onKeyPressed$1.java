package com.lightside.visum.alert;

import android.content.DialogInterface;
import android.view.KeyEvent;
import androidx.appcompat.app.AlertDialog;
import defpackage.zls;
import kotlin.Metadata;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
/* loaded from: classes4.dex */
public final class AlertBuilder$onKeyPressed$1 implements DialogInterface.OnKeyListener {
    final /* synthetic */ zls $handler;

    public AlertBuilder$onKeyPressed$1(zls zlsVar) {
        this.$handler = zlsVar;
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        return ((Boolean) this.$handler.invoke((AlertDialog) dialogInterface, Integer.valueOf(i), keyEvent)).booleanValue();
    }
}
