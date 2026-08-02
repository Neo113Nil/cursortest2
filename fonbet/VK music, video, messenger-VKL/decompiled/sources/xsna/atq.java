package xsna;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.dto.common.im.ImageList;
import com.vk.dto.stickers.ImageConfigId;
import com.vk.dto.stickers.StickerAnimation;
import com.vk.dto.stickers.StickerRender;
import com.vk.dto.stickers.popup.PopupStickerAnimation;

/* compiled from: FavoriteStickerEntity.kt */
/* loaded from: classes5.dex */
public final class atq {
    public final int a;
    public final int b;
    public final ImageList c;
    public final ImageList d;
    public final ImageConfigId e;
    public final StickerAnimation f;
    public final boolean g;
    public final StickerRender h;
    public final String i;
    public final PopupStickerAnimation j;

    public atq() {
        this(0, (ImageList) null, (ImageList) null, (ImageConfigId) null, (StickerAnimation) null, false, (StickerRender) null, (String) null, (PopupStickerAnimation) null, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof atq)) {
            return false;
        }
        atq atqVar = (atq) obj;
        return this.a == atqVar.a && this.b == atqVar.b && epx.f(this.c, atqVar.c) && epx.f(this.d, atqVar.d) && epx.f(this.e, atqVar.e) && epx.f(this.f, atqVar.f) && this.g == atqVar.g && epx.f(this.h, atqVar.h) && epx.f(this.i, atqVar.i) && epx.f(this.j, atqVar.j);
    }

    public final int hashCode() {
        int a = fw3.a(fw3.a(shy.a(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c.b), 31, this.d.b);
        ImageConfigId imageConfigId = this.e;
        int b = qoy.b((this.f.hashCode() + ((a + (imageConfigId == null ? 0 : imageConfigId.hashCode())) * 31)) * 31, 31, this.g);
        StickerRender stickerRender = this.h;
        int hashCode = (b + (stickerRender == null ? 0 : stickerRender.hashCode())) * 31;
        String str = this.i;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        PopupStickerAnimation popupStickerAnimation = this.j;
        return hashCode2 + (popupStickerAnimation != null ? popupStickerAnimation.hashCode() : 0);
    }

    public final String toString() {
        return "FavoriteStickerEntity(id=" + this.a + ", productId=" + this.b + ", images=" + this.c + ", imagesWithBackground=" + this.d + ", config=" + this.e + ", animations=" + this.f + ", isAllowed=" + this.g + ", render=" + this.h + ", vmojiCharacter=" + this.i + ", popup=" + this.j + ')';
    }

    public atq(int i, int i2, ImageList imageList, ImageList imageList2, ImageConfigId imageConfigId, StickerAnimation stickerAnimation, boolean z, StickerRender stickerRender, String str, PopupStickerAnimation popupStickerAnimation) {
        this.a = i;
        this.b = i2;
        this.c = imageList;
        this.d = imageList2;
        this.e = imageConfigId;
        this.f = stickerAnimation;
        this.g = z;
        this.h = stickerRender;
        this.i = str;
        this.j = popupStickerAnimation;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ atq(int i, ImageList imageList, ImageList imageList2, ImageConfigId imageConfigId, StickerAnimation stickerAnimation, boolean z, StickerRender stickerRender, String str, PopupStickerAnimation popupStickerAnimation, int i2) {
        this(r1, -1, imageList, r4, r5, r6, (i2 & 64) != 0 ? true : z, (i2 & 128) != 0 ? null : stickerRender, (i2 & 256) != 0 ? null : str, (i2 & 512) != 0 ? null : popupStickerAnimation);
        ImageList imageList3;
        StickerAnimation stickerAnimation2;
        int i3 = (i2 & 1) != 0 ? -1 : i;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        int i4 = 1;
        imageList = (i2 & 4) != 0 ? new ImageList(null, i4, 0 == true ? 1 : 0) : imageList;
        if ((i2 & 8) != 0) {
            imageList3 = new ImageList(objArr5 == true ? 1 : 0, i4, objArr4 == true ? 1 : 0);
        } else {
            imageList3 = imageList2;
        }
        ImageConfigId imageConfigId2 = (i2 & 16) != 0 ? null : imageConfigId;
        if ((i2 & 32) != 0) {
            stickerAnimation2 = new StickerAnimation(objArr3 == true ? 1 : 0, objArr2 == true ? 1 : 0, 3, objArr == true ? 1 : 0);
        } else {
            stickerAnimation2 = stickerAnimation;
        }
    }
}
