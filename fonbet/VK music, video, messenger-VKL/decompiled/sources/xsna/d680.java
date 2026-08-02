package xsna;

import com.vk.feed.core.models.news.NewsEntry;
import java.util.List;
import xsna.fb80;

/* compiled from: OnFlushTimeListenerDefault.kt */
/* loaded from: classes17.dex */
public abstract class d680<K> implements fb80.b<K> {
    public abstract List<hzp0> j(K k);

    @Override // xsna.fb80.b
    public void n(K k, long j, long j2) {
        List<hzp0> j3 = j(k);
        if (j3 != null) {
            for (hzp0 hzp0Var : j3) {
                hzp0Var.d = j;
                hzp0Var.e = j2;
                hzp0Var.a();
            }
        }
    }

    @Override // xsna.fb80.b
    public final void d(NewsEntry newsEntry, fb80.c cVar) {
    }
}
