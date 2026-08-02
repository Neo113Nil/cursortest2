package xsna;

import androidx.media3.datasource.cache.Cache;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: OfflineCacheKeyFactory.kt */
/* loaded from: classes11.dex */
public final class kt70 implements xw8 {
    public Cache c;
    public Set<String> b = EmptySet.b;
    public final s7s0 d = new s7s0();
    public final List<izs<evk, String>> e = e43.l(new a(1, this, kt70.class, "buildV1Key", "buildV1Key(Landroidx/media3/datasource/DataSpec;)Ljava/lang/String;", 0), new b(1, this, kt70.class, "buildV2Key", "buildV2Key(Landroidx/media3/datasource/DataSpec;)Ljava/lang/String;", 0));

    /* compiled from: OfflineCacheKeyFactory.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<evk, String> {
        @Override // xsna.izs
        public final String invoke(evk evkVar) {
            return ((kt70) this.receiver).d.k(evkVar);
        }
    }

    /* compiled from: OfflineCacheKeyFactory.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<evk, String> {
        @Override // xsna.izs
        public final String invoke(evk evkVar) {
            ((kt70) this.receiver).getClass();
            return evkVar.a.toString();
        }
    }

    @Override // xsna.xw8
    public final String k(evk evkVar) {
        boolean contains;
        Iterator<izs<evk, String>> it = this.e.iterator();
        while (it.hasNext()) {
            String invoke = it.next().invoke(evkVar);
            if (wn80.A) {
                contains = false;
                if (this.c != null && (!r2.getCachedSpans(invoke).isEmpty())) {
                    contains = true;
                }
            } else {
                contains = this.b.contains(invoke);
            }
            if (contains) {
                return invoke;
            }
        }
        return (String) (wn80.z ? new m8(this) : new n8(this)).invoke(evkVar);
    }
}
