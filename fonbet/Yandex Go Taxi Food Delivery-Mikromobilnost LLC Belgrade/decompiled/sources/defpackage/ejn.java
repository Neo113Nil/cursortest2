package defpackage;

import android.view.View;
import ru.rt.ebs.cryptosdk.presentation.customView.CustomizableButton;
import ru.rt.ebs.cryptosdk.presentation.customView.CustomizableConstraintLayout;
import ru.rt.ebs.cryptosdk.presentation.customView.CustomizableHeader;
import ru.rt.ebs.cryptosdk.presentation.customView.CustomizableScreenIcon;
import ru.rt.ebs.cryptosdk.presentation.customView.CustomizableTextView;
import ru.rt.ebs.cryptosdk.presentation.customView.CustomizableTextWithBulletPoint;

/* loaded from: classes4.dex */
public final class ejn implements zo31 {
    public final CustomizableConstraintLayout a;
    public final CustomizableScreenIcon b;
    public final CustomizableConstraintLayout c;
    public final CustomizableHeader d;
    public final CustomizableTextWithBulletPoint e;
    public final CustomizableTextWithBulletPoint f;
    public final CustomizableTextWithBulletPoint g;
    public final CustomizableButton h;
    public final CustomizableTextView i;

    public ejn(CustomizableConstraintLayout customizableConstraintLayout, CustomizableScreenIcon customizableScreenIcon, CustomizableConstraintLayout customizableConstraintLayout2, CustomizableHeader customizableHeader, CustomizableTextWithBulletPoint customizableTextWithBulletPoint, CustomizableTextWithBulletPoint customizableTextWithBulletPoint2, CustomizableTextWithBulletPoint customizableTextWithBulletPoint3, CustomizableButton customizableButton, CustomizableTextView customizableTextView) {
        this.a = customizableConstraintLayout;
        this.b = customizableScreenIcon;
        this.c = customizableConstraintLayout2;
        this.d = customizableHeader;
        this.e = customizableTextWithBulletPoint;
        this.f = customizableTextWithBulletPoint2;
        this.g = customizableTextWithBulletPoint3;
        this.h = customizableButton;
        this.i = customizableTextView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
