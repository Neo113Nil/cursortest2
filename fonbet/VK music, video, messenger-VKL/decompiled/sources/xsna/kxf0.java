package xsna;

import com.vk.feed.core.models.news.NewsEntry;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import xsna.nw2;
import xsna.qn60;

/* compiled from: RemoveNewsEntriesByTypeEditorAction.kt */
/* loaded from: classes4.dex */
public final class kxf0 implements qn60.b {
    public final List<Class<? extends NewsEntry>> a;

    /* JADX WARN: Multi-variable type inference failed */
    public kxf0(List<? extends Class<? extends NewsEntry>> list) {
        this.a = list;
    }

    @Override // xsna.qn60.b
    public final void a(qn60.a aVar) {
        Iterator<Class<? extends NewsEntry>> it = this.a.iterator();
        while (it.hasNext()) {
            HashSet c = aVar.c(new nw2.a(it.next()));
            if (c != null) {
                aVar.i(c);
            }
        }
    }
}
