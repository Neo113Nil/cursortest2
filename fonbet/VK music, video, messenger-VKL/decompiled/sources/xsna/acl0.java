package xsna;

import com.vk.dto.stickers.StickerPackPreviewModel;
import java.util.List;

/* compiled from: StickersRecommendationsEntity.kt */
/* loaded from: classes5.dex */
public final class acl0 {
    public final int a;
    public final List<Integer> b;
    public final List<StickerPackPreviewModel> c;

    public acl0(int i, List<Integer> list, List<StickerPackPreviewModel> list2) {
        this.a = i;
        this.b = list;
        this.c = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof acl0)) {
            return false;
        }
        acl0 acl0Var = (acl0) obj;
        return this.a == acl0Var.a && epx.f(this.b, acl0Var.b) && epx.f(this.c, acl0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + fw3.a(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickersRecommendationsEntity(id=");
        sb.append(this.a);
        sb.append(", packIdsInKeyboard=");
        sb.append(this.b);
        sb.append(", packs=");
        return ms9.a(')', sb, this.c);
    }
}
