package xsna;

import com.vk.dto.stickers.StickerPackPreviewModel;
import java.util.List;

/* compiled from: RecommendationsData.kt */
/* loaded from: classes6.dex */
public final class vbf0 {
    public final List<StickerPackPreviewModel> a;
    public final int b;

    public vbf0(List<StickerPackPreviewModel> list, int i) {
        this.a = list;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vbf0)) {
            return false;
        }
        vbf0 vbf0Var = (vbf0) obj;
        return epx.f(this.a, vbf0Var.a) && this.b == vbf0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RecommendationsData(recommendations=");
        sb.append(this.a);
        sb.append(", afterPack=");
        return vu5.b(sb, this.b, ')');
    }
}
