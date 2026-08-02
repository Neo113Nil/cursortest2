package xsna;

import android.graphics.Bitmap;
import com.vk.superapp.api.dto.story.WebStickerType;

/* compiled from: PackSticker.kt */
/* loaded from: classes15.dex */
public final class w690 extends ad7 {
    public final int q;
    public final int r;

    public w690(int i, int i2, Bitmap bitmap, int i3, String str) {
        super(bitmap, i3, WebStickerType.STICKER, str);
        this.q = i;
        this.r = i2;
    }

    @Override // xsna.ad7, xsna.kr9, xsna.nov
    public final nov E0(nov novVar) {
        return super.E0(new w690(this));
    }

    public w690(w690 w690Var) {
        super(w690Var);
        this.q = w690Var.q;
        this.r = w690Var.r;
    }
}
