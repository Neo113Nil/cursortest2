package defpackage;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.rt.ebs.cryptosdk.presentation.customView.CustomizableHeader;
import ru.rt.ebs.cryptosdk.presentation.customView.CustomizableLinearLayout;
import ru.rt.ebs.cryptosdk.presentation.customView.CustomizableProgressBar;
import ru.rt.ebs.cryptosdk.presentation.customView.CustomizableTextView;

/* loaded from: classes4.dex */
public final class jjn implements zo31 {
    public final ConstraintLayout a;
    public final CustomizableLinearLayout b;
    public final CustomizableHeader c;
    public final CustomizableProgressBar d;
    public final CustomizableTextView e;

    public jjn(ConstraintLayout constraintLayout, CustomizableLinearLayout customizableLinearLayout, CustomizableHeader customizableHeader, CustomizableProgressBar customizableProgressBar, CustomizableTextView customizableTextView) {
        this.a = constraintLayout;
        this.b = customizableLinearLayout;
        this.c = customizableHeader;
        this.d = customizableProgressBar;
        this.e = customizableTextView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
