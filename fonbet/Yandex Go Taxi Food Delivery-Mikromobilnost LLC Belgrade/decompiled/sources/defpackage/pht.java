package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.yandex.div.core.images.BitmapSource;

/* loaded from: classes11.dex */
public final /* synthetic */ class pht implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Uri b;

    public /* synthetic */ pht(int i, Uri uri) {
        this.a = i;
        this.b = uri;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Uri uri = this.b;
        switch (i) {
            case 0:
                GifDrawable gifDrawable = (GifDrawable) obj;
                byte[] bArr = new byte[gifDrawable.getBuffer().remaining()];
                gifDrawable.getBuffer().get(bArr);
                break;
        }
        return new bd7((Bitmap) obj, null, uri, (BitmapSource) obj2);
    }
}
