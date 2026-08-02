package defpackage;

import android.view.View;
import ru.rt.ebs.cryptosdk.presentation.customView.CustomizableButton;
import ru.rt.ebs.cryptosdk.presentation.customView.CustomizableConstraintLayout;
import ru.rt.ebs.cryptosdk.presentation.customView.CustomizableScreenIcon;
import ru.rt.ebs.cryptosdk.presentation.customView.CustomizableTextView;

/* loaded from: classes4.dex */
public final class kjn implements zo31 {
    public final CustomizableConstraintLayout a;
    public final CustomizableConstraintLayout b;
    public final CustomizableScreenIcon c;
    public final CustomizableTextView d;
    public final CustomizableTextView e;
    public final CustomizableButton f;

    public kjn(CustomizableButton customizableButton, CustomizableConstraintLayout customizableConstraintLayout, CustomizableConstraintLayout customizableConstraintLayout2, CustomizableScreenIcon customizableScreenIcon, CustomizableTextView customizableTextView, CustomizableTextView customizableTextView2) {
        this.a = customizableConstraintLayout;
        this.b = customizableConstraintLayout2;
        this.c = customizableScreenIcon;
        this.d = customizableTextView;
        this.e = customizableTextView2;
        this.f = customizableButton;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
