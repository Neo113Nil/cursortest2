package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inspector.InspectionCompanion;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import android.widget.AutoCompleteTextView;
import defpackage.ar2;
import defpackage.dfz0;
import defpackage.ds2;
import defpackage.iog0;
import defpackage.qke;
import defpackage.qr2;
import defpackage.vng;
import defpackage.vwy0;

/* loaded from: classes10.dex */
public class AppCompatAutoCompleteTextView extends AutoCompleteTextView {
    private static final int[] TINT_ATTRS = {R.attr.popupBackground};
    private final qr2 mAppCompatEmojiEditTextHelper;
    private final ar2 mBackgroundTintHelper;
    private final ds2 mTextHelper;

    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion<AppCompatAutoCompleteTextView> {
        private int mBackgroundTintId;
        private int mBackgroundTintModeId;
        private int mDrawableTintId;
        private int mDrawableTintModeId;
        private boolean mPropertiesMapped = false;

        @Override // android.view.inspector.InspectionCompanion
        public void mapProperties(PropertyMapper propertyMapper) {
            this.mBackgroundTintId = propertyMapper.mapObject("backgroundTint", iog0.backgroundTint);
            this.mBackgroundTintModeId = propertyMapper.mapObject("backgroundTintMode", iog0.backgroundTintMode);
            this.mDrawableTintId = propertyMapper.mapObject("drawableTint", iog0.drawableTint);
            this.mDrawableTintModeId = propertyMapper.mapObject("drawableTintMode", iog0.drawableTintMode);
            this.mPropertiesMapped = true;
        }

        @Override // android.view.inspector.InspectionCompanion
        public void readProperties(AppCompatAutoCompleteTextView appCompatAutoCompleteTextView, PropertyReader propertyReader) {
            if (!this.mPropertiesMapped) {
                throw new InspectionCompanion.UninitializedPropertyMapException();
            }
            propertyReader.readObject(this.mBackgroundTintId, appCompatAutoCompleteTextView.getBackgroundTintList());
            propertyReader.readObject(this.mBackgroundTintModeId, appCompatAutoCompleteTextView.getBackgroundTintMode());
            propertyReader.readObject(this.mDrawableTintId, appCompatAutoCompleteTextView.getCompoundDrawableTintList());
            propertyReader.readObject(this.mDrawableTintModeId, appCompatAutoCompleteTextView.getCompoundDrawableTintMode());
        }
    }

    public AppCompatAutoCompleteTextView(Context context, AttributeSet attributeSet, int i) {
        super(TintContextWrapper.wrap(context), attributeSet, i);
        vwy0.a(getContext(), this);
        dfz0 e = dfz0.e(i, 0, getContext(), attributeSet, TINT_ATTRS);
        if (e.b.hasValue(0)) {
            setDropDownBackgroundDrawable(e.b(0));
        }
        e.g();
        ar2 ar2Var = new ar2(this);
        this.mBackgroundTintHelper = ar2Var;
        ar2Var.d(attributeSet, i);
        ds2 ds2Var = new ds2(this);
        this.mTextHelper = ds2Var;
        ds2Var.f(attributeSet, i);
        ds2Var.b();
        qr2 qr2Var = new qr2(this);
        this.mAppCompatEmojiEditTextHelper = qr2Var;
        qr2Var.b(attributeSet, i);
        initEmojiKeyListener(qr2Var);
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        ar2 ar2Var = this.mBackgroundTintHelper;
        if (ar2Var != null) {
            ar2Var.a();
        }
        ds2 ds2Var = this.mTextHelper;
        if (ds2Var != null) {
            ds2Var.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.b.c(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        ar2 ar2Var = this.mBackgroundTintHelper;
        if (ar2Var != null) {
            return ar2Var.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        ar2 ar2Var = this.mBackgroundTintHelper;
        if (ar2Var != null) {
            return ar2Var.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.mTextHelper.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.mTextHelper.e();
    }

    public void initEmojiKeyListener(qr2 qr2Var) {
        KeyListener keyListener = getKeyListener();
        qr2Var.getClass();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean isFocusable = super.isFocusable();
        boolean isClickable = super.isClickable();
        boolean isLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener a = qr2Var.a(keyListener);
        if (a == keyListener) {
            return;
        }
        super.setKeyListener(a);
        super.setRawInputType(inputType);
        super.setFocusable(isFocusable);
        super.setClickable(isClickable);
        super.setLongClickable(isLongClickable);
    }

    public boolean isEmojiCompatEnabled() {
        return this.mAppCompatEmojiEditTextHelper.b.b();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        qke.u(this, onCreateInputConnection, editorInfo);
        return this.mAppCompatEmojiEditTextHelper.b.c(onCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        ar2 ar2Var = this.mBackgroundTintHelper;
        if (ar2Var != null) {
            ar2Var.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        ar2 ar2Var = this.mBackgroundTintHelper;
        if (ar2Var != null) {
            ar2Var.f(i);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        ds2 ds2Var = this.mTextHelper;
        if (ds2Var != null) {
            ds2Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        ds2 ds2Var = this.mTextHelper;
        if (ds2Var != null) {
            ds2Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(vng.t(i, getContext()));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.mAppCompatEmojiEditTextHelper.b.e(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.mAppCompatEmojiEditTextHelper.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        ar2 ar2Var = this.mBackgroundTintHelper;
        if (ar2Var != null) {
            ar2Var.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        ar2 ar2Var = this.mBackgroundTintHelper;
        if (ar2Var != null) {
            ar2Var.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.mTextHelper.h(colorStateList);
        this.mTextHelper.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.mTextHelper.i(mode);
        this.mTextHelper.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        ds2 ds2Var = this.mTextHelper;
        if (ds2Var != null) {
            ds2Var.g(i, context);
        }
    }

    public AppCompatAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, iog0.autoCompleteTextViewStyle);
    }

    public AppCompatAutoCompleteTextView(Context context) {
        this(context, null);
    }
}
