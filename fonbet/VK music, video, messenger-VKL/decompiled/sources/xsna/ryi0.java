package xsna;

import com.vk.dto.common.data.LikeInfo;
import com.vk.feed.core.models.news.NewsEntry;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import xsna.qn60;

/* compiled from: SetLikesInfoEditorAction.kt */
/* loaded from: classes4.dex */
public final class ryi0 implements qn60.b {
    public final List<LikeInfo> a;
    public final pn60 b;

    public ryi0(List<LikeInfo> list, pn60 pn60Var) {
        this.a = list;
        this.b = pn60Var;
    }

    @Override // xsna.qn60.b
    public final void a(qn60.a aVar) {
        LinkedHashSet c = aVar.a.c();
        ArrayList arrayList = new ArrayList();
        for (Object obj : c) {
            if (obj instanceof NewsEntry) {
                arrayList.add(obj);
            }
        }
        aVar.l(arrayList, new qyi0(this, 0));
    }
}
