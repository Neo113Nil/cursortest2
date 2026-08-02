package defpackage;

import android.view.View;
import ru.rt.ebs.cryptosdk.presentation.customView.CustomizableButton;
import ru.rt.ebs.cryptosdk.presentation.customView.CustomizableConstraintLayout;
import ru.rt.ebs.cryptosdk.presentation.customView.CustomizableHeader;
import ru.rt.ebs.cryptosdk.presentation.customView.CustomizableScreenIcon;
import ru.rt.ebs.cryptosdk.presentation.customView.CustomizableTextView;

/* loaded from: classes4.dex */
public final class hjn implements zo31 {
    public final CustomizableConstraintLayout a;
    public final CustomizableConstraintLayout b;
    public final CustomizableScreenIcon c;
    public final CustomizableTextView d;
    public final CustomizableTextView e;
    public final CustomizableHeader f;
    public final CustomizableButton g;

    public hjn(CustomizableConstraintLayout customizableConstraintLayout, CustomizableConstraintLayout customizableConstraintLayout2, CustomizableScreenIcon customizableScreenIcon, CustomizableTextView customizableTextView, CustomizableTextView customizableTextView2, CustomizableHeader customizableHeader, CustomizableButton customizableButton) {
        this.a = customizableConstraintLayout;
        this.b = customizableConstraintLayout2;
        this.c = customizableScreenIcon;
        this.d = customizableTextView;
        this.e = customizableTextView2;
        this.f = customizableHeader;
        this.g = customizableButton;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
