package xsna;

import java.util.ArrayList;
import java.util.Map;
import kotlin.Pair;
import xsna.gy70;
import xsna.nkx;

/* compiled from: InternalOkHttpBatchMethodCall.kt */
/* loaded from: classes15.dex */
public final class ckx extends nkx {
    public final Map<String, gy70> x;

    /* compiled from: InternalOkHttpBatchMethodCall.kt */
    public static final class a extends nkx.a {
        public Object w;

        @Override // xsna.nkx.a
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final ckx b() {
            return new ckx(this);
        }
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, java.util.Map] */
    public ckx(a aVar) {
        super(aVar);
        if (drm0.N(aVar.d)) {
            throw new IllegalArgumentException("version is null or empty");
        }
        ?? r5 = aVar.w;
        ArrayList arrayList = new ArrayList(r5.size());
        for (Map.Entry entry : r5.entrySet()) {
            Object key = entry.getKey();
            gy70.a aVar2 = new gy70.a();
            aVar2.c((com.vk.api.sdk.a) entry.getValue());
            arrayList.add(new Pair(key, new gy70(aVar2)));
        }
        this.x = pn00.s(arrayList);
    }
}
