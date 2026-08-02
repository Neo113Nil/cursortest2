package com.lightside.visum;

import android.widget.CompoundButton;
import defpackage.tls;
import kotlin.Metadata;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
/* loaded from: classes11.dex */
public final class ViewHelpersKt$onCheckedChange$1 implements CompoundButton.OnCheckedChangeListener {
    final /* synthetic */ tls $onCheckedChange;

    public ViewHelpersKt$onCheckedChange$1(tls tlsVar) {
        this.$onCheckedChange = tlsVar;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.$onCheckedChange.invoke(Boolean.valueOf(z));
    }
}
