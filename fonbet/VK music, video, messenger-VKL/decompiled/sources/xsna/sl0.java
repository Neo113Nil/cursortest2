package xsna;

import com.vk.dto.newsfeed.activities.Activity;
import com.vk.feed.core.models.news.NewsEntry;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.Pair;
import xsna.qn60;

/* compiled from: AddLikesActivityToPostsEditorAction.kt */
/* loaded from: classes4.dex */
public final class sl0 implements qn60.b {
    public final pn60 a;
    public final Map<Pair<Long, Integer>, Activity> b;

    /* JADX WARN: Multi-variable type inference failed */
    public sl0(pn60 pn60Var, Map<Pair<Long, Integer>, ? extends Activity> map) {
        this.a = pn60Var;
        this.b = map;
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
        aVar.l(arrayList, new pd(this, 1));
    }
}
