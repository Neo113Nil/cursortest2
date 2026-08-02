package xsna;

import java.util.List;
import one.video.player.model.text.SubtitleRenderItem;

/* compiled from: SubtitlesMappingData.kt */
/* loaded from: classes17.dex */
public final class k1n0 {
    public final boolean a;
    public final String b;
    public final List<SubtitleRenderItem> c;

    public k1n0(String str, List list, boolean z) {
        this.a = z;
        this.b = str;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k1n0)) {
            return false;
        }
        k1n0 k1n0Var = (k1n0) obj;
        return this.a == k1n0Var.a && epx.f(this.b, k1n0Var.b) && epx.f(this.c, k1n0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + urd0.a(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SubtitlesMappingData(visible=");
        sb.append(this.a);
        sb.append(", uniqueKey=");
        sb.append(this.b);
        sb.append(", subtitleRenderItems=");
        return ms9.a(')', sb, this.c);
    }
}
