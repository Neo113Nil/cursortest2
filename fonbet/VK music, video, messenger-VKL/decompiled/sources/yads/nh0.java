package yads;

import android.graphics.Bitmap;
import android.net.Uri;
import com.yandex.div.core.images.BitmapSource;
import com.yandex.div.core.images.CachedBitmap;
import com.yandex.div.core.images.DivImageDownloadCallback;

/* loaded from: classes10.dex */
public final class nh0 implements m41 {
    public final /* synthetic */ DivImageDownloadCallback a;
    public final /* synthetic */ String b;

    public nh0(String str, DivImageDownloadCallback divImageDownloadCallback) {
        this.a = divImageDownloadCallback;
        this.b = str;
    }

    @Override // yads.uq2
    public final void a(mn3 mn3Var) {
        this.a.onError();
    }

    @Override // yads.m41
    public final void a(l41 l41Var, boolean z) {
        Bitmap bitmap = l41Var.a;
        if (bitmap != null) {
            this.a.onSuccess(new CachedBitmap(bitmap, Uri.parse(this.b), z ? BitmapSource.MEMORY : BitmapSource.NETWORK));
        }
    }
}
