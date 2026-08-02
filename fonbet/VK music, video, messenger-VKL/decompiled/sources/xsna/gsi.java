package xsna;

import com.vk.feed.core.models.news.NewsEntry;
import java.util.List;
import xsna.hb60;

/* compiled from: CompositeActionButtonVisibilityCallback.kt */
/* loaded from: classes4.dex */
public final class gsi implements hb60.a {
    public final a4r a;

    public gsi(a4r a4rVar) {
        this.a = a4rVar;
    }

    @Override // xsna.hb60.a
    public final long a() {
        return 500L;
    }

    @Override // xsna.hb60.a
    public final void b(NewsEntry newsEntry, List<? extends qi6<?>> list) {
        this.a.i(new defpackage.k(list, 27));
    }

    @Override // xsna.hb60.a
    public final void dispose() {
    }
}
