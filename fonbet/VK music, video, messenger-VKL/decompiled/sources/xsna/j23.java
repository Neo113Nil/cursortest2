package xsna;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.R$styleable;

/* compiled from: AppCompatCompoundButtonHelper.java */
/* loaded from: classes11.dex */
public final class j23 {

    @NonNull
    public final CompoundButton a;
    public ColorStateList b = null;
    public PorterDuff.Mode c = null;
    public boolean d = false;
    public boolean e = false;
    public boolean f;

    public j23(@NonNull CompoundButton compoundButton) {
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

    /* JADX WARN: Removed duplicated region for block: B:11:0x0054 A[Catch: all -> 0x0033, TryCatch #1 {all -> 0x0033, blocks: (B:3:0x001b, B:5:0x0021, B:8:0x0027, B:9:0x004d, B:11:0x0054, B:12:0x005b, B:14:0x0062, B:21:0x0036, B:23:0x003c, B:25:0x0042), top: B:2:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0062 A[Catch: all -> 0x0033, TRY_LEAVE, TryCatch #1 {all -> 0x0033, blocks: (B:3:0x001b, B:5:0x0021, B:8:0x0027, B:9:0x004d, B:11:0x0054, B:12:0x005b, B:14:0x0062, B:21:0x0036, B:23:0x003c, B:25:0x0042), top: B:2:0x001b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(@Nullable AttributeSet attributeSet, int i) {
        int resourceId;
        int resourceId2;
        CompoundButton compoundButton = this.a;
        Context context = compoundButton.getContext();
        int[] iArr = R$styleable.m;
        yyo0 e = yyo0.e(context, attributeSet, iArr, i, 0);
        TypedArray typedArray = e.b;
        iut0.p(compoundButton, compoundButton.getContext(), iArr, attributeSet, e.b, i);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(m33.a(resourceId2, compoundButton.getContext()));
                } catch (Resources.NotFoundException unused) {
                }
                if (typedArray.hasValue(2)) {
                    compoundButton.setButtonTintList(e.a(2));
                }
                if (typedArray.hasValue(3)) {
                    compoundButton.setButtonTintMode(rko.c(typedArray.getInt(3, -1), null));
                }
                e.f();
            }
            if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                compoundButton.setButtonDrawable(m33.a(resourceId, compoundButton.getContext()));
            }
            if (typedArray.hasValue(2)) {
            }
            if (typedArray.hasValue(3)) {
            }
            e.f();
        } catch (Throwable th) {
            e.f();
            throw th;
        }
    }
}
