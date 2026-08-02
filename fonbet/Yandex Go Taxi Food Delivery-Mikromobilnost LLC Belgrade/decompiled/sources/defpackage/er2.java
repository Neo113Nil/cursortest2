package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import androidx.core.view.b;
import java.util.WeakHashMap;

/* loaded from: classes10.dex */
public final class er2 {
    public final CompoundButton a;
    public ColorStateList b = null;
    public PorterDuff.Mode c = null;
    public boolean d = false;
    public boolean e = false;
    public boolean f;

    public er2(CompoundButton compoundButton) {
        this.a = compoundButton;
    }

    public final void a() {
        CompoundButton compoundButton = this.a;
        Drawable buttonDrawable = compoundButton.getButtonDrawable();
        if (buttonDrawable != null) {
            if (this.d || this.e) {
                Drawable mutate = buttonDrawable.mutate();
                if (this.d) {
                    mutate.setTintList(this.b);
                }
                if (this.e) {
                    mutate.setTintMode(this.c);
                }
                if (mutate.isStateful()) {
                    mutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(mutate);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0061 A[Catch: all -> 0x003b, TryCatch #1 {all -> 0x003b, blocks: (B:3:0x001f, B:5:0x0027, B:8:0x002f, B:9:0x0059, B:11:0x0061, B:12:0x006a, B:14:0x0072, B:21:0x003e, B:23:0x0046, B:25:0x004e), top: B:2:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0072 A[Catch: all -> 0x003b, TRY_LEAVE, TryCatch #1 {all -> 0x003b, blocks: (B:3:0x001f, B:5:0x0027, B:8:0x002f, B:9:0x0059, B:11:0x0061, B:12:0x006a, B:14:0x0072, B:21:0x003e, B:23:0x0046, B:25:0x004e), top: B:2:0x001f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(AttributeSet attributeSet, int i) {
        int resourceId;
        int resourceId2;
        CompoundButton compoundButton = this.a;
        dfz0 e = dfz0.e(i, 0, compoundButton.getContext(), attributeSet, n4i0.CompoundButton);
        TypedArray typedArray = e.b;
        Context context = compoundButton.getContext();
        int[] iArr = n4i0.CompoundButton;
        TypedArray typedArray2 = e.b;
        WeakHashMap weakHashMap = b.a;
        sp31.b(compoundButton, context, iArr, attributeSet, typedArray2, i, 0);
        try {
            if (typedArray.hasValue(n4i0.CompoundButton_buttonCompat) && (resourceId2 = typedArray.getResourceId(n4i0.CompoundButton_buttonCompat, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(vng.t(resourceId2, compoundButton.getContext()));
                } catch (Resources.NotFoundException unused) {
                }
                if (typedArray.hasValue(n4i0.CompoundButton_buttonTint)) {
                    compoundButton.setButtonTintList(e.a(n4i0.CompoundButton_buttonTint));
                }
                if (typedArray.hasValue(n4i0.CompoundButton_buttonTintMode)) {
                    compoundButton.setButtonTintMode(vbm.c(typedArray.getInt(n4i0.CompoundButton_buttonTintMode, -1), null));
                }
                e.g();
            }
            if (typedArray.hasValue(n4i0.CompoundButton_android_button) && (resourceId = typedArray.getResourceId(n4i0.CompoundButton_android_button, 0)) != 0) {
                compoundButton.setButtonDrawable(vng.t(resourceId, compoundButton.getContext()));
            }
            if (typedArray.hasValue(n4i0.CompoundButton_buttonTint)) {
            }
            if (typedArray.hasValue(n4i0.CompoundButton_buttonTintMode)) {
            }
            e.g();
        } catch (Throwable th) {
            e.g();
            throw th;
        }
    }
}
