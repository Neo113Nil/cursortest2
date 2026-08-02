package xsna;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.R$styleable;
import com.vkontakte.android.R;

/* compiled from: AppCompatCheckedTextView.java */
/* loaded from: classes11.dex */
public final class h23 extends CheckedTextView {
    public final i23 b;
    public final f23 c;
    public final p33 d;

    @NonNull
    public f33 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0080 A[Catch: all -> 0x005f, TryCatch #1 {all -> 0x005f, blocks: (B:3:0x0047, B:5:0x004d, B:8:0x0053, B:9:0x0079, B:11:0x0080, B:12:0x0087, B:14:0x008e, B:21:0x0062, B:23:0x0068, B:25:0x006e), top: B:2:0x0047 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x008e A[Catch: all -> 0x005f, TRY_LEAVE, TryCatch #1 {all -> 0x005f, blocks: (B:3:0x0047, B:5:0x004d, B:8:0x0053, B:9:0x0079, B:11:0x0080, B:12:0x0087, B:14:0x008e, B:21:0x0062, B:23:0x0068, B:25:0x006e), top: B:2:0x0047 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public h23(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.checkedTextViewStyle);
        int resourceId;
        int resourceId2;
        uyo0.a(context);
        qpo0.a(getContext(), this);
        p33 p33Var = new p33(this);
        this.d = p33Var;
        p33Var.f(attributeSet, R.attr.checkedTextViewStyle);
        p33Var.b();
        f23 f23Var = new f23(this);
        this.c = f23Var;
        f23Var.d(attributeSet, R.attr.checkedTextViewStyle);
        this.b = new i23(this);
        Context context2 = getContext();
        int[] iArr = R$styleable.l;
        yyo0 e = yyo0.e(context2, attributeSet, iArr, R.attr.checkedTextViewStyle, 0);
        TypedArray typedArray = e.b;
        iut0.p(this, getContext(), iArr, attributeSet, e.b, R.attr.checkedTextViewStyle);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    setCheckMarkDrawable(m33.a(resourceId2, getContext()));
                } catch (Resources.NotFoundException unused) {
                }
                if (typedArray.hasValue(2)) {
                    setCheckMarkTintList(e.a(2));
                }
                if (typedArray.hasValue(3)) {
                    setCheckMarkTintMode(rko.c(typedArray.getInt(3, -1), null));
                }
                e.f();
                getEmojiTextViewHelper().b(attributeSet, R.attr.checkedTextViewStyle);
            }
            if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                setCheckMarkDrawable(m33.a(resourceId, getContext()));
            }
            if (typedArray.hasValue(2)) {
            }
            if (typedArray.hasValue(3)) {
            }
            e.f();
            getEmojiTextViewHelper().b(attributeSet, R.attr.checkedTextViewStyle);
        } catch (Throwable th) {
            e.f();
            throw th;
        }
    }

    @NonNull
    private f33 getEmojiTextViewHelper() {
        if (this.e == null) {
            this.e = new f33(this);
        }
        return this.e;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        p33 p33Var = this.d;
        if (p33Var != null) {
            p33Var.b();
        }
        f23 f23Var = this.c;
        if (f23Var != null) {
            f23Var.a();
        }
        i23 i23Var = this.b;
        if (i23Var != null) {
            i23Var.a();
        }
    }

    @Override // android.widget.TextView
    @Nullable
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return hno0.d(super.getCustomSelectionActionModeCallback());
    }

    @Nullable
    public ColorStateList getSupportBackgroundTintList() {
        f23 f23Var = this.c;
        if (f23Var != null) {
            return f23Var.b();
        }
        return null;
    }

    @Nullable
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        f23 f23Var = this.c;
        if (f23Var != null) {
            return f23Var.c();
        }
        return null;
    }

    @Nullable
    public ColorStateList getSupportCheckMarkTintList() {
        i23 i23Var = this.b;
        if (i23Var != null) {
            return i23Var.b;
        }
        return null;
    }

    @Nullable
    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        i23 i23Var = this.b;
        if (i23Var != null) {
            return i23Var.c;
        }
        return null;
    }

    @Nullable
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.d.d();
    }

    @Nullable
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.d.e();
    }

    @Override // android.widget.TextView, android.view.View
    @Nullable
    public final InputConnection onCreateInputConnection(@NonNull EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        y6l.b(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@Nullable Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        f23 f23Var = this.c;
        if (f23Var != null) {
            f23Var.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        f23 f23Var = this.c;
        if (f23Var != null) {
            f23Var.f(i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(@Nullable Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        i23 i23Var = this.b;
        if (i23Var != null) {
            if (i23Var.f) {
                i23Var.f = false;
            } else {
                i23Var.f = true;
                i23Var.a();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        p33 p33Var = this.d;
        if (p33Var != null) {
            p33Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        p33 p33Var = this.d;
        if (p33Var != null) {
            p33Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(@Nullable ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().d(z);
    }

    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        f23 f23Var = this.c;
        if (f23Var != null) {
            f23Var.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        f23 f23Var = this.c;
        if (f23Var != null) {
            f23Var.i(mode);
        }
    }

    public void setSupportCheckMarkTintList(@Nullable ColorStateList colorStateList) {
        i23 i23Var = this.b;
        if (i23Var != null) {
            i23Var.b = colorStateList;
            i23Var.d = true;
            i23Var.a();
        }
    }

    public void setSupportCheckMarkTintMode(@Nullable PorterDuff.Mode mode) {
        i23 i23Var = this.b;
        if (i23Var != null) {
            i23Var.c = mode;
            i23Var.e = true;
            i23Var.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(@Nullable ColorStateList colorStateList) {
        p33 p33Var = this.d;
        p33Var.h(colorStateList);
        p33Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(@Nullable PorterDuff.Mode mode) {
        p33 p33Var = this.d;
        p33Var.i(mode);
        p33Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(@NonNull Context context, int i) {
        super.setTextAppearance(context, i);
        p33 p33Var = this.d;
        if (p33Var != null) {
            p33Var.g(i, context);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(m33.a(i, getContext()));
    }
}
