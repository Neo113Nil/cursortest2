package xsna;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.R$drawable;
import com.google.android.material.R$string;

/* compiled from: PasswordToggleEndIconDelegate.java */
/* loaded from: classes13.dex */
public final class om90 extends qkp {
    public final int e;

    @Nullable
    public EditText f;
    public final oa6 g;

    public om90(@NonNull com.google.android.material.textfield.a aVar, int i) {
        super(aVar);
        this.e = R$drawable.design_password_eye;
        this.g = new oa6(this, 8);
        if (i != 0) {
            this.e = i;
        }
    }

    @Override // xsna.qkp
    public final void b() {
        q();
    }

    @Override // xsna.qkp
    public final int c() {
        return R$string.password_toggle_content_description;
    }

    @Override // xsna.qkp
    public final int d() {
        return this.e;
    }

    @Override // xsna.qkp
    public final View.OnClickListener f() {
        return this.g;
    }

    @Override // xsna.qkp
    public final boolean k() {
        return true;
    }

    @Override // xsna.qkp
    public final boolean l() {
        EditText editText = this.f;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // xsna.qkp
    public final void m(@Nullable EditText editText) {
        this.f = editText;
        q();
    }

    @Override // xsna.qkp
    public final void r() {
        EditText editText = this.f;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.f.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // xsna.qkp
    public final void s() {
        EditText editText = this.f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
