package xsna;

import android.text.Editable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: EmojiEditableFactory.java */
/* loaded from: classes.dex */
public final class edp extends Editable.Factory {
    public static final Object a = new Object();
    public static volatile edp b;

    @Nullable
    public static Class<?> c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(@NonNull CharSequence charSequence) {
        Class<?> cls = c;
        return cls != null ? new mik0(cls, charSequence) : super.newEditable(charSequence);
    }
}
