package xsna;

import android.graphics.Bitmap;
import com.vkontakte.android.R;

/* compiled from: ClipSwapItem.kt */
/* loaded from: classes18.dex */
public final class zcd extends zif0 {
    public final Bitmap a;
    public final Bitmap b;

    public zcd(Bitmap bitmap, Bitmap bitmap2) {
        this.a = bitmap;
        this.b = bitmap2;
    }

    @Override // xsna.zif0
    public final int b() {
        return R.layout.item_swap_recycler;
    }
}
