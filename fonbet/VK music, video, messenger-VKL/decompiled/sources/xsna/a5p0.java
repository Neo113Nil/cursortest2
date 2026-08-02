package xsna;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageButton;

/* compiled from: TooltipCompat.java */
/* loaded from: classes11.dex */
public final class a5p0 {

    /* compiled from: TooltipCompat.java */
    public static class a {
        public static void a(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    public static void a(@NonNull AppCompatImageButton appCompatImageButton, @Nullable CharSequence charSequence) {
        a.a(appCompatImageButton, charSequence);
    }
}
