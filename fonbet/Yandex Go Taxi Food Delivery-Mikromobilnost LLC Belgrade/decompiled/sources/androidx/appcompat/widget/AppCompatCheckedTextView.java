package androidx.appcompat.widget;

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
import android.view.inspector.InspectionCompanion;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import android.widget.CheckedTextView;
import defpackage.ar2;
import defpackage.dfz0;
import defpackage.dr2;
import defpackage.ds2;
import defpackage.iog0;
import defpackage.n4i0;
import defpackage.qke;
import defpackage.rr2;
import defpackage.sp31;
import defpackage.vbm;
import defpackage.vng;
import defpackage.vwy0;
import java.util.WeakHashMap;

/* loaded from: classes10.dex */
public class AppCompatCheckedTextView extends CheckedTextView {
    private rr2 mAppCompatEmojiTextHelper;
    private final ar2 mBackgroundTintHelper;
    private final dr2 mCheckedHelper;
    private final ds2 mTextHelper;

    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion<AppCompatCheckedTextView> {
        private int mBackgroundTintId;
        private int mBackgroundTintModeId;
        private int mCheckMarkTintId;
        private int mCheckMarkTintModeId;
        private int mDrawableTintId;
        private int mDrawableTintModeId;
        private boolean mPropertiesMapped = false;

        @Override // android.view.inspector.InspectionCompanion
        public void mapProperties(PropertyMapper propertyMapper) {
            this.mBackgroundTintId = propertyMapper.mapObject("backgroundTint", iog0.backgroundTint);
            this.mBackgroundTintModeId = propertyMapper.mapObject("backgroundTintMode", iog0.backgroundTintMode);
            this.mCheckMarkTintId = propertyMapper.mapObject("checkMarkTint", iog0.checkMarkTint);
            this.mCheckMarkTintModeId = propertyMapper.mapObject("checkMarkTintMode", iog0.checkMarkTintMode);
            this.mDrawableTintId = propertyMapper.mapObject("drawableTint", iog0.drawableTint);
            this.mDrawableTintModeId = propertyMapper.mapObject("drawableTintMode", iog0.drawableTintMode);
            this.mPropertiesMapped = true;
        }

        @Override // android.view.inspector.InspectionCompanion
        public void readProperties(AppCompatCheckedTextView appCompatCheckedTextView, PropertyReader propertyReader) {
            if (!this.mPropertiesMapped) {
                throw new InspectionCompanion.UninitializedPropertyMapException();
            }
            propertyReader.readObject(this.mBackgroundTintId, appCompatCheckedTextView.getBackgroundTintList());
            propertyReader.readObject(this.mBackgroundTintModeId, appCompatCheckedTextView.getBackgroundTintMode());
            propertyReader.readObject(this.mCheckMarkTintId, appCompatCheckedTextView.getCheckMarkTintList());
            propertyReader.readObject(this.mCheckMarkTintModeId, appCompatCheckedTextView.getCheckMarkTintMode());
            propertyReader.readObject(this.mDrawableTintId, appCompatCheckedTextView.getCompoundDrawableTintList());
            propertyReader.readObject(this.mDrawableTintModeId, appCompatCheckedTextView.getCompoundDrawableTintMode());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x008c A[Catch: all -> 0x0066, TryCatch #1 {all -> 0x0066, blocks: (B:3:0x004a, B:5:0x0052, B:8:0x005a, B:9:0x0084, B:11:0x008c, B:12:0x0095, B:14:0x009d, B:21:0x0069, B:23:0x0071, B:25:0x0079), top: B:2:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x009d A[Catch: all -> 0x0066, TRY_LEAVE, TryCatch #1 {all -> 0x0066, blocks: (B:3:0x004a, B:5:0x0052, B:8:0x005a, B:9:0x0084, B:11:0x008c, B:12:0x0095, B:14:0x009d, B:21:0x0069, B:23:0x0071, B:25:0x0079), top: B:2:0x004a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AppCompatCheckedTextView(Context context, AttributeSet attributeSet, int i) {
        super(TintContextWrapper.wrap(context), attributeSet, i);
        int resourceId;
        int resourceId2;
        vwy0.a(getContext(), this);
        ds2 ds2Var = new ds2(this);
        this.mTextHelper = ds2Var;
        ds2Var.f(attributeSet, i);
        ds2Var.b();
        ar2 ar2Var = new ar2(this);
        this.mBackgroundTintHelper = ar2Var;
        ar2Var.d(attributeSet, i);
        this.mCheckedHelper = new dr2(this);
        dfz0 e = dfz0.e(i, 0, getContext(), attributeSet, n4i0.CheckedTextView);
        TypedArray typedArray = e.b;
        Context context2 = getContext();
        int[] iArr = n4i0.CheckedTextView;
        TypedArray typedArray2 = e.b;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        sp31.b(this, context2, iArr, attributeSet, typedArray2, i, 0);
        try {
            if (typedArray.hasValue(n4i0.CheckedTextView_checkMarkCompat) && (resourceId2 = typedArray.getResourceId(n4i0.CheckedTextView_checkMarkCompat, 0)) != 0) {
                try {
                    setCheckMarkDrawable(vng.t(resourceId2, getContext()));
                } catch (Resources.NotFoundException unused) {
                }
                if (typedArray.hasValue(n4i0.CheckedTextView_checkMarkTint)) {
                    setCheckMarkTintList(e.a(n4i0.CheckedTextView_checkMarkTint));
                }
                if (typedArray.hasValue(n4i0.CheckedTextView_checkMarkTintMode)) {
                    setCheckMarkTintMode(vbm.c(typedArray.getInt(n4i0.CheckedTextView_checkMarkTintMode, -1), null));
                }
                e.g();
                getEmojiTextViewHelper().c(attributeSet, i);
            }
            if (typedArray.hasValue(n4i0.CheckedTextView_android_checkMark) && (resourceId = typedArray.getResourceId(n4i0.CheckedTextView_android_checkMark, 0)) != 0) {
                setCheckMarkDrawable(vng.t(resourceId, getContext()));
            }
            if (typedArray.hasValue(n4i0.CheckedTextView_checkMarkTint)) {
            }
            if (typedArray.hasValue(n4i0.CheckedTextView_checkMarkTintMode)) {
            }
            e.g();
            getEmojiTextViewHelper().c(attributeSet, i);
        } catch (Throwable th) {
            e.g();
            throw th;
        }
    }

    private rr2 getEmojiTextViewHelper() {
        if (this.mAppCompatEmojiTextHelper == null) {
            this.mAppCompatEmojiTextHelper = new rr2(this);
        }
        return this.mAppCompatEmojiTextHelper;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        ds2 ds2Var = this.mTextHelper;
        if (ds2Var != null) {
            ds2Var.b();
        }
        ar2 ar2Var = this.mBackgroundTintHelper;
        if (ar2Var != null) {
            ar2Var.a();
        }
        dr2 dr2Var = this.mCheckedHelper;
        if (dr2Var != null) {
            dr2Var.a();
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

    public ColorStateList getSupportCheckMarkTintList() {
        dr2 dr2Var = this.mCheckedHelper;
        if (dr2Var != null) {
            return dr2Var.b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        dr2 dr2Var = this.mCheckedHelper;
        if (dr2Var != null) {
            return dr2Var.c;
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

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        qke.u(this, onCreateInputConnection, editorInfo);
        return onCreateInputConnection;
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

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        dr2 dr2Var = this.mCheckedHelper;
        if (dr2Var != null) {
            if (dr2Var.f) {
                dr2Var.f = false;
            } else {
                dr2Var.f = true;
                dr2Var.a();
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

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().e(z);
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

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        dr2 dr2Var = this.mCheckedHelper;
        if (dr2Var != null) {
            dr2Var.b = colorStateList;
            dr2Var.d = true;
            dr2Var.a();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        dr2 dr2Var = this.mCheckedHelper;
        if (dr2Var != null) {
            dr2Var.c = mode;
            dr2Var.e = true;
            dr2Var.a();
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

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(vng.t(i, getContext()));
    }

    public AppCompatCheckedTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, iog0.checkedTextViewStyle);
    }

    public AppCompatCheckedTextView(Context context) {
        this(context, null);
    }
}
