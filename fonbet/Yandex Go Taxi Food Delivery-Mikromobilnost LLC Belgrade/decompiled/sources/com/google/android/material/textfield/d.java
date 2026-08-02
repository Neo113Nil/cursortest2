package com.google.android.material.textfield;

import android.widget.LinearLayout;
import com.google.android.material.internal.CheckableImageButton;
import defpackage.hib;

/* loaded from: classes11.dex */
public final /* synthetic */ class d implements hib {
    public final /* synthetic */ int a;
    public final /* synthetic */ LinearLayout b;

    public /* synthetic */ d(LinearLayout linearLayout, int i) {
        this.a = i;
        this.b = linearLayout;
    }

    @Override // defpackage.hib
    public final void a(CheckableImageButton checkableImageButton, boolean z) {
        int i = this.a;
        LinearLayout linearLayout = this.b;
        switch (i) {
            case 0:
                ((EndCompoundLayout) linearLayout).lambda$new$0(checkableImageButton, z);
                break;
            case 1:
                ((EndCompoundLayout) linearLayout).lambda$new$1(checkableImageButton, z);
                break;
            default:
                ((StartCompoundLayout) linearLayout).lambda$new$0(checkableImageButton, z);
                break;
        }
    }
}
