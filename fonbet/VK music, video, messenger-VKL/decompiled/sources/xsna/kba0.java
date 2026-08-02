package xsna;

import com.vk.attachpicker.stickers.photo.PhotoStickerStyle;
import java.util.List;

/* compiled from: PhotoStickerInfo.kt */
/* loaded from: classes15.dex */
public final class kba0 {
    public final String a;
    public final float b;
    public final a c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final String g;
    public final long h;
    public final int i;
    public final dnr0 j;

    /* compiled from: PhotoStickerInfo.kt */
    public static final class a {
        public final PhotoStickerStyle a;
        public final List<PhotoStickerStyle> b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(PhotoStickerStyle photoStickerStyle, List<? extends PhotoStickerStyle> list) {
            this.a = photoStickerStyle;
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

    public kba0(String str, float f, a aVar, String str2, boolean z, boolean z2, String str3, long j, int i, dnr0 dnr0Var) {
        this.a = str;
        this.b = f;
        this.c = aVar;
        this.d = str2;
        this.e = z;
        this.f = z2;
        this.g = str3;
        this.h = j;
        this.i = i;
        this.j = dnr0Var;
    }

    public static kba0 a(kba0 kba0Var, String str, a aVar, String str2, dnr0 dnr0Var, int i) {
        if ((i & 1) != 0) {
            str = kba0Var.a;
        }
        String str3 = str;
        float f = kba0Var.b;
        a aVar2 = (i & 4) != 0 ? kba0Var.c : aVar;
        String str4 = kba0Var.d;
        boolean z = kba0Var.e;
        boolean z2 = kba0Var.f;
        String str5 = (i & 64) != 0 ? kba0Var.g : str2;
        long j = kba0Var.h;
        int i2 = kba0Var.i;
        dnr0 dnr0Var2 = (i & 512) != 0 ? kba0Var.j : dnr0Var;
        kba0Var.getClass();
        return new kba0(str3, f, aVar2, str4, z, z2, str5, j, i2, dnr0Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kba0)) {
            return false;
        }
        kba0 kba0Var = (kba0) obj;
        return epx.f(this.a, kba0Var.a) && Float.compare(this.b, kba0Var.b) == 0 && epx.f(this.c, kba0Var.c) && epx.f(this.d, kba0Var.d) && this.e == kba0Var.e && this.f == kba0Var.f && epx.f(this.g, kba0Var.g) && this.h == kba0Var.h && this.i == kba0Var.i && epx.f(this.j, kba0Var.j);
    }

    public final int hashCode() {
        int b = qoy.b(qoy.b(urd0.a((this.c.hashCode() + io.reactivex.rxjava3.subjects.b.a(this.b, this.a.hashCode() * 31, 31)) * 31, 31, this.d), 31, this.e), 31, this.f);
        String str = this.g;
        return this.j.hashCode() + shy.a(this.i, bh10.a((b + (str == null ? 0 : str.hashCode())) * 31, 31, this.h), 31);
    }

    public final String toString() {
        return "PhotoStickerInfo(ownerName=" + this.a + ", aspectRatio=" + this.b + ", styleInfo=" + this.c + ", url=" + this.d + ", isStory=" + this.e + ", isClickable=" + this.f + ", ownerFullNameGen=" + this.g + ", ownerId=" + this.h + ", photoId=" + this.i + ", verificationInfo=" + this.j + ')';
    }
}
