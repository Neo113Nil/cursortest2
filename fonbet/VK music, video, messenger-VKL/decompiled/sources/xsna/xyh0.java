package xsna;

import com.vk.catalog2.feature.search.dto.ui.UIBlockGroupsMapPreview;
import java.util.List;
import xsna.hyk0;

/* compiled from: SearchStaticMapPreviewVh.kt */
/* loaded from: classes16.dex */
public final class xyh0 implements l3a {
    public final List<UIBlockGroupsMapPreview.PreviewGroupItem> a;
    public final hyk0.a b;

    public xyh0(List<UIBlockGroupsMapPreview.PreviewGroupItem> list, hyk0.a aVar) {
        this.a = list;
        this.b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xyh0)) {
            return false;
        }
        xyh0 xyh0Var = (xyh0) obj;
        return epx.f(this.a, xyh0Var.a) && epx.f(this.b, xyh0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ExpandMapButtonClick(groups=" + this.a + ", mapPreviewState=" + this.b + ')';
    }
}
