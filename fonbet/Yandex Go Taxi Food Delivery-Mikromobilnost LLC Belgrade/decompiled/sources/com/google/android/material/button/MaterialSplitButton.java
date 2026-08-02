package com.google.android.material.button;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.core.view.b;
import defpackage.b810;
import defpackage.eng0;
import defpackage.g2i0;
import defpackage.g810;
import defpackage.kxh0;
import defpackage.ny61;

/* loaded from: classes11.dex */
public class MaterialSplitButton extends MaterialButtonGroup {
    private static final int DEF_STYLE_RES = g2i0.Widget_Material3_MaterialSplitButton;
    private static final int REQUIRED_BUTTON_COUNT = 2;

    public MaterialSplitButton(Context context, AttributeSet attributeSet, int i) {
        super(g810.b(context, attributeSet, i, DEF_STYLE_RES), attributeSet, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addView$0(MaterialButton materialButton, MaterialButton materialButton2, boolean z) {
        b.t(materialButton, getResources().getString(z ? kxh0.mtrl_button_expanded_content_description : kxh0.mtrl_button_collapsed_content_description));
    }

    @Override // com.google.android.material.button.MaterialButtonGroup, android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            ny61.g("MaterialSplitButton can only hold MaterialButtons.");
            return;
        }
        if (getChildCount() > 2) {
            ny61.g("MaterialSplitButton can only hold two MaterialButtons.");
            return;
        }
        MaterialButton materialButton = (MaterialButton) view;
        super.addView(view, i, layoutParams);
        if (indexOfChild(view) == 1) {
            materialButton.setCheckable(true);
            materialButton.setA11yClassName(Button.class.getName());
            b.t(materialButton, getResources().getString(materialButton.isChecked() ? kxh0.mtrl_button_expanded_content_description : kxh0.mtrl_button_collapsed_content_description));
            materialButton.addOnCheckedChangeListener(new b810(this, materialButton));
        }
    }

    public MaterialSplitButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, eng0.materialSplitButtonStyle);
    }

    public MaterialSplitButton(Context context) {
        this(context, null);
    }
}
