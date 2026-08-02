package xsna;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: AppCompatMultiAutoCompleteTextView.java */
/* loaded from: classes11.dex */
public final class h33 extends MultiAutoCompleteTextView {
    public static final int[] e = {R.attr.popupBackground};
    public final f23 b;
    public final p33 c;

    @NonNull
    public final e33 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h33(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, com.vkontakte.android.R.attr.autoCompleteTextViewStyle);
        uyo0.a(context);
        qpo0.a(getContext(), this);
        yyo0 e2 = yyo0.e(getContext(), attributeSet, e, com.vkontakte.android.R.attr.autoCompleteTextViewStyle, 0);
        if (e2.b.hasValue(0)) {
            setDropDownBackgroundDrawable(e2.b(0));
        }
        e2.f();
        f23 f23Var = new f23(this);
        this.b = f23Var;
        f23Var.d(attributeSet, com.vkontakte.android.R.attr.autoCompleteTextViewStyle);
        p33 p33Var = new p33(this);
        this.c = p33Var;
        p33Var.f(attributeSet, com.vkontakte.android.R.attr.autoCompleteTextViewStyle);
        p33Var.b();
        e33 e33Var = new e33(this);
        this.d = e33Var;
        e33Var.b(attributeSet, com.vkontakte.android.R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean isFocusable = isFocusable();
        boolean isClickable = isClickable();
        boolean isLongClickable = isLongClickable();
        int inputType = getInputType();
        KeyListener a = e33Var.a(keyListener);
        if (a == keyListener) {
            return;
        }
        super.setKeyListener(a);
        setRawInputType(inputType);
        setFocusable(isFocusable);
        setClickable(isClickable);
        setLongClickable(isLongClickable);
    }

    @Override // android.widget.TextView, android.view.View
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

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        y6l.b(onCreateInputConnection, editorInfo, this);
        return this.d.c(onCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
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

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(m33.a(i, getContext()));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.d.d(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(@Nullable KeyListener keyListener) {
        super.setKeyListener(this.d.a(keyListener));
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

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        p33 p33Var = this.c;
        if (p33Var != null) {
            p33Var.g(i, context);
        }
    }
}
