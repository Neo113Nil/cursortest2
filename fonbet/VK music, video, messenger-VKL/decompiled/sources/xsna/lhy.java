package xsna;

import com.vk.dto.stickers.ugc.UGCStickerModel;

/* compiled from: StickersKeyboardItems.kt */
/* loaded from: classes6.dex */
public final class lhy extends dhy {
    public final UGCStickerModel d;

    public lhy(UGCStickerModel uGCStickerModel) {
        super(uGCStickerModel);
        this.d = uGCStickerModel;
    }

    @Override // xsna.rf6
    public final int a() {
        return -7;
    }

    @Override // xsna.dhy
    public final n1l0 b() {
        return this.d;
    }

    @Override // xsna.rf6, xsna.hfz
    public final Number getItemId() {
        return Long.valueOf(this.d.c);
    }
}
