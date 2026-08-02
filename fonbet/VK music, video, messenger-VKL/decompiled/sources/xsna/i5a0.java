package xsna;

import android.graphics.drawable.Drawable;
import com.vk.dto.common.restrictions.Restriction;
import com.vk.stickers.api.models.AlbumStickerStyle;
import java.util.List;

/* compiled from: PhotoAlbumStickerInfo.kt */
/* loaded from: classes5.dex */
public final class i5a0 {
    public final long a;
    public final int b;
    public final String c;
    public final float d;
    public final int e;
    public final String f;
    public final Drawable g;
    public final Restriction h;
    public final a i;

    /* compiled from: PhotoAlbumStickerInfo.kt */
    public static final class a {
        public final AlbumStickerStyle a;
        public final List<AlbumStickerStyle> b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(AlbumStickerStyle albumStickerStyle, List<? extends AlbumStickerStyle> list) {
            this.a = albumStickerStyle;
            this.b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("StyleInfo(currentStyle=");
            sb.append(this.a);
            sb.append(", availableStyles=");
            return ms9.a(')', sb, this.b);
        }
    }

    public i5a0(long j, int i, String str, float f, int i2, String str2, Drawable drawable, Restriction restriction, a aVar) {
        this.a = j;
        this.b = i;
        this.c = str;
        this.d = f;
        this.e = i2;
        this.f = str2;
        this.g = drawable;
        this.h = restriction;
        this.i = aVar;
    }

    public static i5a0 a(i5a0 i5a0Var, String str, Drawable drawable, a aVar, int i) {
        long j = i5a0Var.a;
        int i2 = i5a0Var.b;
        String str2 = i5a0Var.c;
        float f = i5a0Var.d;
        int i3 = i5a0Var.e;
        if ((i & 32) != 0) {
            str = i5a0Var.f;
        }
        String str3 = str;
        if ((i & 64) != 0) {
            drawable = i5a0Var.g;
        }
        Drawable drawable2 = drawable;
        Restriction restriction = i5a0Var.h;
        if ((i & 256) != 0) {
            aVar = i5a0Var.i;
        }
        i5a0Var.getClass();
        return new i5a0(j, i2, str2, f, i3, str3, drawable2, restriction, aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i5a0)) {
            return false;
        }
        i5a0 i5a0Var = (i5a0) obj;
        return this.a == i5a0Var.a && this.b == i5a0Var.b && epx.f(this.c, i5a0Var.c) && Float.compare(this.d, i5a0Var.d) == 0 && this.e == i5a0Var.e && epx.f(this.f, i5a0Var.f) && epx.f(this.g, i5a0Var.g) && epx.f(this.h, i5a0Var.h) && epx.f(this.i, i5a0Var.i);
    }

    public final int hashCode() {
        int a2 = urd0.a(shy.a(this.e, io.reactivex.rxjava3.subjects.b.a(this.d, urd0.a(shy.a(this.b, Long.hashCode(this.a) * 31, 31), 31, this.c), 31), 31), 31, this.f);
        Drawable drawable = this.g;
        int hashCode = (a2 + (drawable == null ? 0 : drawable.hashCode())) * 31;
        Restriction restriction = this.h;
        return this.i.hashCode() + ((hashCode + (restriction != null ? restriction.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "PhotoAlbumStickerInfo(ownerId=" + this.a + ", albumId=" + this.b + ", coverUrl=" + this.c + ", photoRatio=" + this.d + ", albumSize=" + this.e + ", ownerName=" + this.f + ", ownerVerifyDrawable=" + this.g + ", restriction=" + this.h + ", style=" + this.i + ')';
    }
}
