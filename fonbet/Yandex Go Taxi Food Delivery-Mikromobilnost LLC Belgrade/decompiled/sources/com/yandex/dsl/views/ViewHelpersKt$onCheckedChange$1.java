package com.yandex.dsl.views;

import android.widget.CompoundButton;
import defpackage.tls;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/widget/CompoundButton;", "<anonymous parameter 0>", "", "isChecked", "Lzy11;", "onCheckedChanged", "(Landroid/widget/CompoundButton;Z)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
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
