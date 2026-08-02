package xsna;

import com.vk.feed.core.models.news.NewsEntry;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import xsna.qn60;

/* compiled from: PutNewsEntryFirstEditorAction.kt */
/* loaded from: classes4.dex */
public final class xle0 implements qn60.b {
    public final NewsEntry a;
    public final Set<dcy<?>> b;
    public final qtc0 c;
    public final pn60 d;
    public final Object e = msy.a(LazyThreadSafetyMode.NONE, new fd90(4));

    /* JADX WARN: Multi-variable type inference failed */
    public xle0(NewsEntry newsEntry, Set<? extends dcy<?>> set, qtc0 qtc0Var, pn60 pn60Var) {
        this.a = newsEntry;
        this.b = set;
        this.c = qtc0Var;
        this.d = pn60Var;
    }

    @Override // xsna.qn60.b
    public final void a(qn60.a aVar) {
        aVar.g(this.a, new r9c0(this, 4), new gib0(this, 6));
    }
}
