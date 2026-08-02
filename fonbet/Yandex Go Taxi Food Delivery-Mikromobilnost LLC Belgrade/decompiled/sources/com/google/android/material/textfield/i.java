package com.google.android.material.textfield;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import defpackage.cxg0;
import defpackage.kxh0;
import defpackage.zgv;

/* loaded from: classes11.dex */
public final class i extends g {
    public final int e;
    public EditText f;
    public final zgv g;

    public i(EndCompoundLayout endCompoundLayout, int i) {
        super(endCompoundLayout);
        this.e = cxg0.design_password_eye;
        this.g = new zgv(28, this);
        if (i != 0) {
            this.e = i;
        }
    }

    @Override // com.google.android.material.textfield.g
    public final void b() {
        p();
    }

    @Override // com.google.android.material.textfield.g
    public final int c() {
        return kxh0.password_toggle_content_description;
    }

    @Override // com.google.android.material.textfield.g
    public final int d() {
        return this.e;
    }

    @Override // com.google.android.material.textfield.g
    public final View.OnClickListener f() {
        return this.g;
    }

    @Override // com.google.android.material.textfield.g
    public final boolean j() {
        return true;
    }

    @Override // com.google.android.material.textfield.g
    public final boolean k() {
        EditText editText = this.f;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // com.google.android.material.textfield.g
    public final void l(EditText editText) {
        this.f = editText;
        p();
    }

    @Override // com.google.android.material.textfield.g
    public final void q() {
        EditText editText = this.f;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.f.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // com.google.android.material.textfield.g
    public final void r() {
        EditText editText = this.f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
