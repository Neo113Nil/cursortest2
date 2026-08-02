package xsna;

import android.graphics.Bitmap;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public abstract class shv {

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public static final class a {
        public final int a;
        public final String b;

        public a(int i, String str) {
            this.a = i;
            this.b = str;
        }
    }

    public abstract void a(@NonNull WebView webView, @NonNull a aVar, @Nullable String str);

    public abstract void b(@NonNull WebView webView);

    public abstract void c(@NonNull WebView webView, @NonNull String str, @Nullable Bitmap bitmap);
}
