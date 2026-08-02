package xsna;

import com.vk.newsfeed.api.posting.viewpresenter.PreviewRatio;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PreviewRatioIterator.kt */
/* loaded from: classes4.dex */
public final class k5d0 {
    public final List<PreviewRatio> a;
    public int b;

    public k5d0(ArrayList arrayList, PreviewRatio previewRatio) {
        this.a = arrayList;
        this.b = -1;
        Integer g = i7o0.g(arrayList, new bjk(previewRatio, 29));
        if (g != null) {
            this.b = g.intValue();
        }
        if (this.b == -1) {
            this.b = 0;
        }
    }
}
