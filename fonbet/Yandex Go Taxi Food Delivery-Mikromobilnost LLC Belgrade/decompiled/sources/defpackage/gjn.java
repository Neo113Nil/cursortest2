package defpackage;

import android.view.View;
import ru.rt.ebs.cryptosdk.presentation.customView.CustomizableButton;
import ru.rt.ebs.cryptosdk.presentation.customView.CustomizableConstraintLayout;
import ru.rt.ebs.cryptosdk.presentation.customView.CustomizableHeader;
import ru.rt.ebs.cryptosdk.presentation.customView.CustomizableScreenIcon;
import ru.rt.ebs.cryptosdk.presentation.customView.CustomizableTextView;
import ru.rt.ebs.cryptosdk.presentation.customView.CustomizableTextWithBulletPoint;

/* loaded from: classes4.dex */
public final class gjn implements zo31 {
    public final CustomizableConstraintLayout a;
    public final CustomizableConstraintLayout b;
    public final CustomizableHeader c;
    public final CustomizableScreenIcon d;
    public final CustomizableTextWithBulletPoint e;
    public final CustomizableTextWithBulletPoint f;
    public final CustomizableTextWithBulletPoint g;
    public final CustomizableButton h;
    public final CustomizableTextView i;
    public final CustomizableTextView j;

    public gjn(CustomizableConstraintLayout customizableConstraintLayout, CustomizableConstraintLayout customizableConstraintLayout2, CustomizableHeader customizableHeader, CustomizableScreenIcon customizableScreenIcon, CustomizableTextWithBulletPoint customizableTextWithBulletPoint, CustomizableTextWithBulletPoint customizableTextWithBulletPoint2, CustomizableTextWithBulletPoint customizableTextWithBulletPoint3, CustomizableButton customizableButton, CustomizableTextView customizableTextView, CustomizableTextView customizableTextView2) {
        this.a = customizableConstraintLayout;
        this.b = customizableConstraintLayout2;
        this.c = customizableHeader;
        this.d = customizableScreenIcon;
        this.e = customizableTextWithBulletPoint;
        this.f = customizableTextWithBulletPoint2;
        this.g = customizableTextWithBulletPoint3;
        this.h = customizableButton;
        this.i = customizableTextView;
        this.j = customizableTextView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
