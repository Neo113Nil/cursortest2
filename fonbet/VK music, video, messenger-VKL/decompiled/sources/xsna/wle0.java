package xsna;

import com.vk.feed.core.models.news.NewsEntry;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import xsna.qn60;

/* compiled from: PutAllNewsEntryFirstEditorAction.kt */
/* loaded from: classes4.dex */
public final class wle0 implements qn60.b {
    public final List<NewsEntry> a;
    public final qtc0 b;
    public final pn60 c;
    public final Object d = msy.a(LazyThreadSafetyMode.NONE, new cy20(9));

    /* JADX WARN: Multi-variable type inference failed */
    public wle0(List<? extends NewsEntry> list, qtc0 qtc0Var, pn60 pn60Var) {
        this.a = list;
        this.b = qtc0Var;
        this.c = pn60Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.qn60.b
    public final void a(qn60.a aVar) {
        List<NewsEntry> list = this.a;
        fju fjuVar = new fju(this, 28);
        qn60 qn60Var = aVar.a;
        ux80<Object, List<ol60>> ux80Var = qn60Var.b;
        if (ux80Var.b.f()) {
            aVar.f(list, fjuVar);
            return;
        }
        int size = ux80Var.c.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = ux80Var.c.get(i2);
            Object d = ux80Var.b.d(obj);
            if (d != null) {
                boolean contains = on60.a.contains(fpf0.a(obj.getClass()));
                if (!contains) {
                    i = i2;
                }
                if (!contains) {
                    break;
                }
            }
        }
        for (NewsEntry newsEntry : list) {
            ux80Var.a(i, newsEntry, fjuVar.invoke(newsEntry));
            qn60Var.c.a(newsEntry);
            i++;
        }
    }
}
