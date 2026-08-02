package androidx.core.util;

import android.util.LruCache;
import defpackage.bms;
import defpackage.tls;
import defpackage.wls;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001J\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u0001H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0007\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0007\u0010\bJ1\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u00012\b\u0010\f\u001a\u0004\u0018\u00018\u0001H\u0014¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"androidx/core/util/LruCacheKt$lruCache$4", "Landroid/util/LruCache;", "key", "value", "", "sizeOf", "(Ljava/lang/Object;Ljava/lang/Object;)I", "create", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "evicted", "oldValue", "newValue", "Lzy11;", "entryRemoved", "(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "core-ktx_release"}, k = 1, mv = {2, 0, 0}, xi = 176)
/* loaded from: classes10.dex */
public final class LruCacheKt$lruCache$4 extends LruCache<Object, Object> {
    final /* synthetic */ tls $create;
    final /* synthetic */ bms $onEntryRemoved;
    final /* synthetic */ wls $sizeOf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LruCacheKt$lruCache$4(int i, wls wlsVar, tls tlsVar, bms bmsVar) {
        super(i);
        this.$sizeOf = wlsVar;
        this.$create = tlsVar;
        this.$onEntryRemoved = bmsVar;
    }

    @Override // android.util.LruCache
    public Object create(Object key) {
        return this.$create.invoke(key);
    }

    @Override // android.util.LruCache
    public void entryRemoved(boolean evicted, Object key, Object oldValue, Object newValue) {
        this.$onEntryRemoved.invoke(Boolean.valueOf(evicted), key, oldValue, newValue);
    }

    @Override // android.util.LruCache
    public int sizeOf(Object key, Object value) {
        return ((Number) this.$sizeOf.invoke(key, value)).intValue();
    }
}
