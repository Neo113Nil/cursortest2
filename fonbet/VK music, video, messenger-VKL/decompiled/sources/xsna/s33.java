package xsna;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: AppCompatToggleButton.java */
/* loaded from: classes11.dex */
public final class s33 extends ToggleButton {
    public final f23 b;
    public final p33 c;
    public f33 d;

    public s33(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.buttonStyleToggle);
        qpo0.a(getContext(), this);
        f23 f23Var = new f23(this);
        this.b = f23Var;
        f23Var.d(attributeSet, R.attr.buttonStyleToggle);
        p33 p33Var = new p33(this);
        this.c = p33Var;
        p33Var.f(attributeSet, R.attr.buttonStyleToggle);
        getEmojiTextViewHelper().b(attributeSet, R.attr.buttonStyleToggle);
    }

    @NonNull
    private f33 getEmojiTextViewHelper() {
        if (this.d == null) {
            this.d = new f33(this);
        }
        return this.d;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        f23 f23Var = this.b;
        if (f23Var != null) {
            f23Var.a();
        }
        p33 p33Var = this.c;
        if (p33Var != null) {
            p33Var.b();
        }
    }

    @Nullable
    public ColorStateList getSupportBackgroundTintList() {
        f23 f23Var = this.b;
        if (f23Var != null) {
            return f23Var.b();
        }
        return null;
    }

    @Nullable
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        f23 f23Var = this.b;
        if (f23Var != null) {
            return f23Var.c();
        }
        return null;
    }

    @Nullable
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.c.d();
    }

    @Nullable
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.c.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(@Nullable Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        f23 f23Var = this.b;
        if (f23Var != null) {
            f23Var.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        f23 f23Var = this.b;
        if (f23Var != null) {
            f23Var.f(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        p33 p33Var = this.c;
        if (p33Var != null) {
            p33Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        p33 p33Var = this.c;
        if (p33Var != null) {
            p33Var.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().d(z);
    }

    @Override // android.widget.TextView
    public void setFilters(@NonNull InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        f23 f23Var = this.b;
        if (f23Var != null) {
            f23Var.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        f23 f23Var = this.b;
        if (f23Var != null) {
            f23Var.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(@Nullable ColorStateList colorStateList) {
        p33 p33Var = this.c;
        p33Var.h(colorStateList);
        p33Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(@Nullable PorterDuff.Mode mode) {
        p33 p33Var = this.c;
        p33Var.i(mode);
        p33Var.b();
    }
}
