package xsna;

import android.content.Context;
import com.vk.dto.photo.Photo;
import com.vk.dto.photo.PhotoAlbum;
import com.vkontakte.android.R;

/* compiled from: CarouselStrategyProvider.kt */
/* loaded from: classes18.dex */
public final class nv9 implements qpr {
    public final Object a;
    public final Object b;

    public nv9(byte[] bArr, Boolean bool) {
        this.a = bArr;
        this.b = bool;
    }

    @Override // xsna.qpr
    public int a() {
        return 10;
    }

    @Override // xsna.qpr
    public opr b(int i) {
        return i == 1 ? (pu9) this.b : (ru9) this.a;
    }

    public byte[] c() {
        return (byte[]) this.a;
    }

    public ucv0 d(PhotoAlbum photoAlbum, Photo photo, boolean z) {
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        return new ucv0(photo, z, bis.c(context, photo, (photoAlbum != null ? photoAlbum.r : null) != null ? photoAlbum.g : null, (StringBuilder) this.b, (gk) this.a), z ? R.drawable.vk_icon_check_circle_shadow_40 : R.drawable.vk_icon_circle_outline_shadow_40, z ? y8g0.e(R.string.media_item_checked_checkbox_content_description) : y8g0.e(R.string.media_item_unchecked_checkbox_content_description));
    }

    public nv9(gzs gzsVar) {
        this.a = new ru9(gzsVar);
        this.b = new pu9(gzsVar);
    }

    public nv9() {
        Context context = e43.a;
        this.a = new gk(context == null ? null : context);
        this.b = new StringBuilder();
    }
}
