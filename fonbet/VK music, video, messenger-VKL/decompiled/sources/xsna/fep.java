package xsna;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: EmojiTransformationMethod.java */
/* loaded from: classes12.dex */
public final class fep implements TransformationMethod {

    @Nullable
    public final TransformationMethod b;

    public fep(@Nullable TransformationMethod transformationMethod) {
        this.b = transformationMethod;
    }

    public final TransformationMethod a() {
        return this.b;
    }

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(@Nullable CharSequence charSequence, @NonNull View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.b;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        if (charSequence == null || androidx.emoji2.text.c.a().c() != 1) {
            return charSequence;
        }
        androidx.emoji2.text.c a = androidx.emoji2.text.c.a();
        a.getClass();
        return a.g(0, charSequence.length(), 0, charSequence);
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
        TransformationMethod transformationMethod = this.b;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z, i, rect);
        }
    }
}
