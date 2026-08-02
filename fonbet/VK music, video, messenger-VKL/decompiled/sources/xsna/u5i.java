package xsna;

import java.util.Map;
import xsna.w5i;

/* compiled from: CompactHashMap.java */
/* loaded from: classes13.dex */
public final class u5i extends w5i<Object, Object>.b<Map.Entry<Object, Object>> {
    public final /* synthetic */ w5i f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u5i(w5i w5iVar) {
        super();
        this.f = w5iVar;
    }

    @Override // xsna.w5i.b
    public final Map.Entry<Object, Object> a(int i) {
        return new w5i.d(i);
    }
}
