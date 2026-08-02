package xsna;

import java.util.LinkedHashMap;
import java.util.Map;
import xsna.rpf0;

/* compiled from: RegexCache.java */
/* loaded from: classes8.dex */
public final class qpf0 extends LinkedHashMap<Object, Object> {
    final /* synthetic */ rpf0.a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qpf0(rpf0.a aVar, int i) {
        super(i, 0.75f, true);
        this.this$0 = aVar;
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry<Object, Object> entry) {
        return size() > this.this$0.b;
    }
}
