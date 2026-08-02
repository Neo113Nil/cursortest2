package xsna;

import com.vk.feed.core.models.news.NewsEntry;
import java.util.List;
import xsna.hb60;

/* compiled from: EntriesListFieldsProviderDelegate.kt */
/* loaded from: classes4.dex */
public final class oqp implements hb60.a {
    public final /* synthetic */ mqp a;

    public oqp(mqp mqpVar) {
        this.a = mqpVar;
    }

    @Override // xsna.hb60.a
    public final long a() {
        return 0L;
    }

    @Override // xsna.hb60.a
    public final void b(NewsEntry newsEntry, List<? extends qi6<?>> list) {
        this.a.y.i(new b1h(list, 10));
    }

    @Override // xsna.hb60.a
    public final void dispose() {
    }
}
