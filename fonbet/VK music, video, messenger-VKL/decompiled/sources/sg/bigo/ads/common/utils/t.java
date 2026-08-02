package sg.bigo.ads.common.utils;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Window;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;

/* loaded from: classes9.dex */
public final class t {
    public static void a(Context context, ProgressBar progressBar, int i) {
        Drawable indeterminateDrawable = progressBar.getIndeterminateDrawable();
        if (indeterminateDrawable == null) {
            progressBar.setIndeterminateDrawable(a.a(context, i));
        } else {
            indeterminateDrawable.setTint(a.c(context, R.color.white));
            progressBar.setIndeterminateDrawable(indeterminateDrawable);
        }
    }

    public static void a(@NonNull Window window) {
        u.a();
        window.getDecorView().setSystemUiVisibility(5894);
    }
}
