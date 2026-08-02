package xsna;

import com.vk.dto.stickers.StickerPackPreviewModel;

/* compiled from: StickersKeyboardItems.kt */
/* loaded from: classes6.dex */
public final class wfy extends rf6 {
    public final StickerPackPreviewModel b;
    public final String c;
    public final int d;
    public final boolean e;
    public final String f;

    public wfy(StickerPackPreviewModel stickerPackPreviewModel, String str, int i, boolean z, String str2) {
        this.b = stickerPackPreviewModel;
        this.c = str;
        this.d = i;
        this.e = z;
        this.f = str2;
    }

    @Override // xsna.rf6
    public final int a() {
        return this.b.e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wfy)) {
            return false;
        }
        wfy wfyVar = (wfy) obj;
        return epx.f(this.b, wfyVar.b) && epx.f(this.c, wfyVar.c) && this.d == wfyVar.d && this.e == wfyVar.e && epx.f(this.f, wfyVar.f);
    }

    @Override // xsna.rf6, xsna.hfz
    public final Number getItemId() {
        return Integer.valueOf(this.b.e());
    }

    public final int hashCode() {
        return this.f.hashCode() + qoy.b(shy.a(this.d, urd0.a(this.b.hashCode() * 31, 31, this.c), 31), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("KeyboardHeaderRecommendationItem(packPreview=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", id=");
        sb.append(this.d);
        sb.append(", loading=");
        sb.append(this.e);
        sb.append(", ref=");
        return ho8.a(sb, this.f, ')');
    }
}
