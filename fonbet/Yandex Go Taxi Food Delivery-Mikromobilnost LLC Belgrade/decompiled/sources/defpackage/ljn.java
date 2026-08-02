package defpackage;

import android.view.View;
import ru.rt.ebs.cryptosdk.presentation.customView.CustomizableButton;
import ru.rt.ebs.cryptosdk.presentation.customView.CustomizableConstraintLayout;
import ru.rt.ebs.cryptosdk.presentation.customView.CustomizableScreenIcon;
import ru.rt.ebs.cryptosdk.presentation.customView.CustomizableTextView;

/* loaded from: classes4.dex */
public final class ljn implements zo31 {
    public final CustomizableConstraintLayout a;
    public final CustomizableConstraintLayout b;
    public final CustomizableScreenIcon c;
    public final CustomizableButton d;
    public final CustomizableTextView e;
    public final CustomizableTextView f;

    public ljn(CustomizableButton customizableButton, CustomizableConstraintLayout customizableConstraintLayout, CustomizableConstraintLayout customizableConstraintLayout2, CustomizableScreenIcon customizableScreenIcon, CustomizableTextView customizableTextView, CustomizableTextView customizableTextView2) {
        this.a = customizableConstraintLayout;
        this.b = customizableConstraintLayout2;
        this.c = customizableScreenIcon;
        this.d = customizableButton;
        this.e = customizableTextView;
        this.f = customizableTextView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
