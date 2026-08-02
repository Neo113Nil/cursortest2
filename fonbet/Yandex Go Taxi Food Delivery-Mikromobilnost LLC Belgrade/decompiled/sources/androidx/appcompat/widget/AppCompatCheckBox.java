package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.inspector.InspectionCompanion;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import android.widget.CheckBox;
import defpackage.ar2;
import defpackage.ds2;
import defpackage.efz0;
import defpackage.er2;
import defpackage.iog0;
import defpackage.rr2;
import defpackage.vng;
import defpackage.vwy0;

/* loaded from: classes10.dex */
public class AppCompatCheckBox extends CheckBox implements efz0 {
    private rr2 mAppCompatEmojiTextHelper;
    private final ar2 mBackgroundTintHelper;
    private final er2 mCompoundButtonHelper;
    private final ds2 mTextHelper;

    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion<AppCompatCheckBox> {
        private int mBackgroundTintId;
        private int mBackgroundTintModeId;
        private int mButtonTintId;
        private int mButtonTintModeId;
        private int mDrawableTintId;
        private int mDrawableTintModeId;
        private boolean mPropertiesMapped = false;

        @Override // android.view.inspector.InspectionCompanion
        public void mapProperties(PropertyMapper propertyMapper) {
            this.mBackgroundTintId = propertyMapper.mapObject("backgroundTint", iog0.backgroundTint);
            this.mBackgroundTintModeId = propertyMapper.mapObject("backgroundTintMode", iog0.backgroundTintMode);
            this.mButtonTintId = propertyMapper.mapObject("buttonTint", iog0.buttonTint);
            this.mButtonTintModeId = propertyMapper.mapObject("buttonTintMode", iog0.buttonTintMode);
            this.mDrawableTintId = propertyMapper.mapObject("drawableTint", iog0.drawableTint);
            this.mDrawableTintModeId = propertyMapper.mapObject("drawableTintMode", iog0.drawableTintMode);
            this.mPropertiesMapped = true;
        }

        @Override // android.view.inspector.InspectionCompanion
        public void readProperties(AppCompatCheckBox appCompatCheckBox, PropertyReader propertyReader) {
            if (!this.mPropertiesMapped) {
                throw new InspectionCompanion.UninitializedPropertyMapException();
            }
            propertyReader.readObject(this.mBackgroundTintId, appCompatCheckBox.getBackgroundTintList());
            propertyReader.readObject(this.mBackgroundTintModeId, appCompatCheckBox.getBackgroundTintMode());
            propertyReader.readObject(this.mButtonTintId, appCompatCheckBox.getButtonTintList());
            propertyReader.readObject(this.mButtonTintModeId, appCompatCheckBox.getButtonTintMode());
            propertyReader.readObject(this.mDrawableTintId, appCompatCheckBox.getCompoundDrawableTintList());
            propertyReader.readObject(this.mDrawableTintModeId, appCompatCheckBox.getCompoundDrawableTintMode());
        }
    }

    public AppCompatCheckBox(Context context, AttributeSet attributeSet, int i) {
        super(TintContextWrapper.wrap(context), attributeSet, i);
        vwy0.a(getContext(), this);
        er2 er2Var = new er2(this);
        this.mCompoundButtonHelper = er2Var;
        er2Var.b(attributeSet, i);
        ar2 ar2Var = new ar2(this);
        this.mBackgroundTintHelper = ar2Var;
        ar2Var.d(attributeSet, i);
        ds2 ds2Var = new ds2(this);
        this.mTextHelper = ds2Var;
        ds2Var.f(attributeSet, i);
        getEmojiTextViewHelper().c(attributeSet, i);
    }

    private rr2 getEmojiTextViewHelper() {
        if (this.mAppCompatEmojiTextHelper == null) {
            this.mAppCompatEmojiTextHelper = new rr2(this);
        }
        return this.mAppCompatEmojiTextHelper;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
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

    @Override // defpackage.efz0
    public ColorStateList getSupportButtonTintList() {
        er2 er2Var = this.mCompoundButtonHelper;
        if (er2Var != null) {
            return er2Var.b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        er2 er2Var = this.mCompoundButtonHelper;
        if (er2Var != null) {
            return er2Var.c;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.mTextHelper.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.mTextHelper.e();
    }

    public boolean isEmojiCompatEnabled() {
        return getEmojiTextViewHelper().b();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().d(z);
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

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        er2 er2Var = this.mCompoundButtonHelper;
        if (er2Var != null) {
            if (er2Var.f) {
                er2Var.f = false;
            } else {
                er2Var.f = true;
                er2Var.a();
            }
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

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().e(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
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

    @Override // defpackage.efz0
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        er2 er2Var = this.mCompoundButtonHelper;
        if (er2Var != null) {
            er2Var.b = colorStateList;
            er2Var.d = true;
            er2Var.a();
        }
    }

    @Override // defpackage.efz0
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        er2 er2Var = this.mCompoundButtonHelper;
        if (er2Var != null) {
            er2Var.c = mode;
            er2Var.e = true;
            er2Var.a();
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

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(vng.t(i, getContext()));
    }

    public AppCompatCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, iog0.checkboxStyle);
    }

    public AppCompatCheckBox(Context context) {
        this(context, null);
    }
}
