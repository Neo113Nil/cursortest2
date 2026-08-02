package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.inspector.InspectionCompanion;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import defpackage.ar2;
import defpackage.ds2;
import defpackage.duy0;
import defpackage.i070;
import defpackage.iog0;
import defpackage.lon;
import defpackage.mge;
import defpackage.mya1;
import defpackage.pr2;
import defpackage.qke;
import defpackage.qr2;
import defpackage.vwy0;
import defpackage.yr2;

/* loaded from: classes.dex */
public class AppCompatEditText extends EditText implements i070 {
    private final qr2 mAppCompatEmojiEditTextHelper;
    private final ar2 mBackgroundTintHelper;
    private final duy0 mDefaultOnReceiveContentListener;
    private pr2 mSuperCaller;
    private final yr2 mTextClassifierHelper;
    private final ds2 mTextHelper;

    /* loaded from: classes10.dex */
    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion<AppCompatEditText> {
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
        public void readProperties(AppCompatEditText appCompatEditText, PropertyReader propertyReader) {
            if (!this.mPropertiesMapped) {
                throw new InspectionCompanion.UninitializedPropertyMapException();
            }
            propertyReader.readObject(this.mBackgroundTintId, appCompatEditText.getBackgroundTintList());
            propertyReader.readObject(this.mBackgroundTintModeId, appCompatEditText.getBackgroundTintMode());
            propertyReader.readObject(this.mDrawableTintId, appCompatEditText.getCompoundDrawableTintList());
            propertyReader.readObject(this.mDrawableTintModeId, appCompatEditText.getCompoundDrawableTintMode());
        }
    }

    public AppCompatEditText(Context context, AttributeSet attributeSet, int i) {
        super(TintContextWrapper.wrap(context), attributeSet, i);
        vwy0.a(getContext(), this);
        ar2 ar2Var = new ar2(this);
        this.mBackgroundTintHelper = ar2Var;
        ar2Var.d(attributeSet, i);
        ds2 ds2Var = new ds2(this);
        this.mTextHelper = ds2Var;
        ds2Var.f(attributeSet, i);
        ds2Var.b();
        this.mTextClassifierHelper = new yr2();
        this.mDefaultOnReceiveContentListener = new duy0();
        qr2 qr2Var = new qr2(this);
        this.mAppCompatEmojiEditTextHelper = qr2Var;
        qr2Var.b(attributeSet, i);
        initEmojiKeyListener(qr2Var);
    }

    private pr2 getSuperCaller() {
        if (this.mSuperCaller == null) {
            this.mSuperCaller = new pr2(this);
        }
        return this.mSuperCaller;
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

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        return getSuperCaller().a();
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
        String[] h;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.mTextHelper.getClass();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 && onCreateInputConnection != null) {
            lon.b(editorInfo, getText());
        }
        qke.u(this, onCreateInputConnection, editorInfo);
        if (onCreateInputConnection != null && i <= 30 && (h = androidx.core.view.b.h(this)) != null) {
            lon.a(editorInfo, h);
            onCreateInputConnection = androidx.core.view.inputmethod.a.b(this, onCreateInputConnection, editorInfo);
        }
        return this.mAppCompatEmojiEditTextHelper.b.c(onCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 || i >= 33) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onDragEvent(DragEvent dragEvent) {
        if (mya1.b(this, dragEvent)) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // defpackage.i070
    public mge onReceiveContent(mge mgeVar) {
        return this.mDefaultOnReceiveContentListener.a(this, mgeVar);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i) {
        if (mya1.c(this, i)) {
            return true;
        }
        return super.onTextContextMenuItem(i);
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

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        getSuperCaller().b(textClassifier);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return super.getText();
    }

    public AppCompatEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, iog0.editTextStyle);
    }

    public AppCompatEditText(Context context) {
        this(context, null);
    }
}
