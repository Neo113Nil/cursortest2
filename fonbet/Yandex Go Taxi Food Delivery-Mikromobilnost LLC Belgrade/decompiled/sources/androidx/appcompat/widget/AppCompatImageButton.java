package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.inspector.InspectionCompanion;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import android.widget.ImageButton;
import android.widget.ImageView;
import defpackage.ar2;
import defpackage.cfz0;
import defpackage.iog0;
import defpackage.sr2;
import defpackage.vwy0;

/* loaded from: classes10.dex */
public class AppCompatImageButton extends ImageButton {
    private final ar2 mBackgroundTintHelper;
    private boolean mHasLevel;
    private final sr2 mImageHelper;

    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion<AppCompatImageButton> {
        private int mBackgroundTintId;
        private int mBackgroundTintModeId;
        private boolean mPropertiesMapped = false;
        private int mTintId;
        private int mTintModeId;

        @Override // android.view.inspector.InspectionCompanion
        public void mapProperties(PropertyMapper propertyMapper) {
            this.mBackgroundTintId = propertyMapper.mapObject("backgroundTint", iog0.backgroundTint);
            this.mBackgroundTintModeId = propertyMapper.mapObject("backgroundTintMode", iog0.backgroundTintMode);
            this.mTintId = propertyMapper.mapObject("tint", iog0.tint);
            this.mTintModeId = propertyMapper.mapObject("tintMode", iog0.tintMode);
            this.mPropertiesMapped = true;
        }

        @Override // android.view.inspector.InspectionCompanion
        public void readProperties(AppCompatImageButton appCompatImageButton, PropertyReader propertyReader) {
            if (!this.mPropertiesMapped) {
                throw new InspectionCompanion.UninitializedPropertyMapException();
            }
            propertyReader.readObject(this.mBackgroundTintId, appCompatImageButton.getBackgroundTintList());
            propertyReader.readObject(this.mBackgroundTintModeId, appCompatImageButton.getBackgroundTintMode());
            propertyReader.readObject(this.mTintId, appCompatImageButton.getImageTintList());
            propertyReader.readObject(this.mTintModeId, appCompatImageButton.getImageTintMode());
        }
    }

    public AppCompatImageButton(Context context, AttributeSet attributeSet, int i) {
        super(TintContextWrapper.wrap(context), attributeSet, i);
        this.mHasLevel = false;
        vwy0.a(getContext(), this);
        ar2 ar2Var = new ar2(this);
        this.mBackgroundTintHelper = ar2Var;
        ar2Var.d(attributeSet, i);
        sr2 sr2Var = new sr2(this);
        this.mImageHelper = sr2Var;
        sr2Var.b(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        ar2 ar2Var = this.mBackgroundTintHelper;
        if (ar2Var != null) {
            ar2Var.a();
        }
        sr2 sr2Var = this.mImageHelper;
        if (sr2Var != null) {
            sr2Var.a();
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

    public ColorStateList getSupportImageTintList() {
        cfz0 cfz0Var;
        sr2 sr2Var = this.mImageHelper;
        if (sr2Var == null || (cfz0Var = sr2Var.b) == null) {
            return null;
        }
        return cfz0Var.a;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        cfz0 cfz0Var;
        sr2 sr2Var = this.mImageHelper;
        if (sr2Var == null || (cfz0Var = sr2Var.b) == null) {
            return null;
        }
        return cfz0Var.b;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return !(this.mImageHelper.a.getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
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

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        sr2 sr2Var = this.mImageHelper;
        if (sr2Var != null) {
            sr2Var.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        sr2 sr2Var = this.mImageHelper;
        if (sr2Var != null && drawable != null && !this.mHasLevel) {
            sr2Var.c = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        sr2 sr2Var2 = this.mImageHelper;
        if (sr2Var2 != null) {
            sr2Var2.a();
            if (this.mHasLevel) {
                return;
            }
            sr2 sr2Var3 = this.mImageHelper;
            ImageView imageView = sr2Var3.a;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(sr2Var3.c);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.mHasLevel = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        this.mImageHelper.c(i);
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        sr2 sr2Var = this.mImageHelper;
        if (sr2Var != null) {
            sr2Var.a();
        }
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

    public void setSupportImageTintList(ColorStateList colorStateList) {
        sr2 sr2Var = this.mImageHelper;
        if (sr2Var != null) {
            if (sr2Var.b == null) {
                sr2Var.b = new cfz0();
            }
            cfz0 cfz0Var = sr2Var.b;
            cfz0Var.a = colorStateList;
            cfz0Var.d = true;
            sr2Var.a();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        sr2 sr2Var = this.mImageHelper;
        if (sr2Var != null) {
            if (sr2Var.b == null) {
                sr2Var.b = new cfz0();
            }
            cfz0 cfz0Var = sr2Var.b;
            cfz0Var.b = mode;
            cfz0Var.c = true;
            sr2Var.a();
        }
    }

    public AppCompatImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, iog0.imageButtonStyle);
    }

    public AppCompatImageButton(Context context) {
        this(context, null);
    }
}
