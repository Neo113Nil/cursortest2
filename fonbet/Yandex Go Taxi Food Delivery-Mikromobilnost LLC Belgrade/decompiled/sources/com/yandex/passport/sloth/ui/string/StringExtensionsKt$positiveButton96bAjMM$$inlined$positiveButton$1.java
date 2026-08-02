package com.yandex.passport.sloth.ui.string;

import android.content.DialogInterface;
import androidx.appcompat.app.AlertDialog;
import defpackage.tls;
import kotlin.Metadata;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
/* renamed from: com.yandex.passport.sloth.ui.string.StringExtensionsKt$positiveButton-96bAjMM$$inlined$positiveButton$1, reason: invalid class name */
/* loaded from: classes11.dex */
public final class StringExtensionsKt$positiveButton96bAjMM$$inlined$positiveButton$1 implements DialogInterface.OnClickListener {
    final /* synthetic */ tls $onClicked;

    public StringExtensionsKt$positiveButton96bAjMM$$inlined$positiveButton$1(tls tlsVar) {
        this.$onClicked = tlsVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.$onClicked.invoke((AlertDialog) dialogInterface);
    }
}
