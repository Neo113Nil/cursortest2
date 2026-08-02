package xsna;

import com.vk.attachpicker.stat.data.GraffityParamsEntity;
import com.vk.attachpicker.stat.data.PhotoParamsEntity;
import com.vk.attachpicker.stat.data.StickerParamsEntity;
import com.vk.attachpicker.stat.data.TextParamsEntity;
import java.util.List;

/* compiled from: PhotoParamsWithMarkupEntity.kt */
/* loaded from: classes15.dex */
public final class oaa0 {
    public final PhotoParamsEntity a;
    public final List<GraffityParamsEntity> b;
    public final List<TextParamsEntity> c;
    public final List<StickerParamsEntity> d;

    public oaa0(PhotoParamsEntity photoParamsEntity, List<GraffityParamsEntity> list, List<TextParamsEntity> list2, List<StickerParamsEntity> list3) {
        this.a = photoParamsEntity;
        this.b = list;
        this.c = list2;
        this.d = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oaa0)) {
            return false;
        }
        oaa0 oaa0Var = (oaa0) obj;
        return epx.f(this.a, oaa0Var.a) && epx.f(this.b, oaa0Var.b) && epx.f(this.c, oaa0Var.c) && epx.f(this.d, oaa0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + fw3.a(fw3.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PhotoParamsWithMarkupEntity(params=");
        sb.append(this.a);
        sb.append(", graffities=");
        sb.append(this.b);
        sb.append(", texts=");
        sb.append(this.c);
        sb.append(", stickers=");
        return ms9.a(')', sb, this.d);
    }
}
