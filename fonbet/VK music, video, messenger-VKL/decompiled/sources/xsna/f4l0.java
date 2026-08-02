package xsna;

import com.vk.dto.common.im.ImageList;
import com.vk.dto.stickers.ImageConfigId;
import com.vk.dto.stickers.StickerAnimation;
import com.vk.dto.stickers.StickerRender;
import com.vk.dto.stickers.popup.PopupStickerAnimation;
import java.util.List;

/* compiled from: StickerEntity.kt */
/* loaded from: classes5.dex */
public final class f4l0 {
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
    public final int k;

    public f4l0() {
        this(0, (ImageList) null, (ImageList) null, (ImageConfigId) null, (StickerAnimation) null, false, (StickerRender) null, (String) null, (PopupStickerAnimation) null, 0, 2047);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f4l0)) {
            return false;
        }
        f4l0 f4l0Var = (f4l0) obj;
        return this.a == f4l0Var.a && this.b == f4l0Var.b && epx.f(this.c, f4l0Var.c) && epx.f(this.d, f4l0Var.d) && epx.f(this.e, f4l0Var.e) && epx.f(this.f, f4l0Var.f) && this.g == f4l0Var.g && epx.f(this.h, f4l0Var.h) && epx.f(this.i, f4l0Var.i) && epx.f(this.j, f4l0Var.j) && this.k == f4l0Var.k;
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
        return Integer.hashCode(this.k) + ((hashCode2 + (popupStickerAnimation != null ? popupStickerAnimation.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickerEntity(id=");
        sb.append(this.a);
        sb.append(", productId=");
        sb.append(this.b);
        sb.append(", images=");
        sb.append(this.c);
        sb.append(", imagesWithBackground=");
        sb.append(this.d);
        sb.append(", config=");
        sb.append(this.e);
        sb.append(", animations=");
        sb.append(this.f);
        sb.append(", isAllowed=");
        sb.append(this.g);
        sb.append(", render=");
        sb.append(this.h);
        sb.append(", vmojiCharacter=");
        sb.append(this.i);
        sb.append(", popup=");
        sb.append(this.j);
        sb.append(", order=");
        return vu5.b(sb, this.k, ')');
    }

    public f4l0(int i, int i2, ImageList imageList, ImageList imageList2, ImageConfigId imageConfigId, StickerAnimation stickerAnimation, boolean z, StickerRender stickerRender, String str, PopupStickerAnimation popupStickerAnimation, int i3) {
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
        this.k = i3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ f4l0(int i, ImageList imageList, ImageList imageList2, ImageConfigId imageConfigId, StickerAnimation stickerAnimation, boolean z, StickerRender stickerRender, String str, PopupStickerAnimation popupStickerAnimation, int i2, int i3) {
        this(r1, -1, r13, r4, r5, r6, (i3 & 64) != 0 ? true : z, (i3 & 128) != 0 ? null : stickerRender, (i3 & 256) != 0 ? null : str, (i3 & 512) != 0 ? null : popupStickerAnimation, (i3 & 1024) != 0 ? 0 : i2);
        ImageList imageList3;
        ImageList imageList4;
        StickerAnimation stickerAnimation2;
        int i4 = (i3 & 1) != 0 ? -1 : i;
        List list = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        int i5 = 1;
        if ((i3 & 4) != 0) {
            imageList3 = new ImageList(list, i5, objArr6 == true ? 1 : 0);
        } else {
            imageList3 = imageList;
        }
        if ((i3 & 8) != 0) {
            imageList4 = new ImageList(objArr5 == true ? 1 : 0, i5, objArr4 == true ? 1 : 0);
        } else {
            imageList4 = imageList2;
        }
        ImageConfigId imageConfigId2 = (i3 & 16) != 0 ? null : imageConfigId;
        if ((i3 & 32) != 0) {
            stickerAnimation2 = new StickerAnimation(objArr3 == true ? 1 : 0, objArr2 == true ? 1 : 0, 3, objArr == true ? 1 : 0);
        } else {
            stickerAnimation2 = stickerAnimation;
        }
    }
}
