package xsna;

import android.net.Uri;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: FullSegmentEncryptionKeyCache.java */
/* loaded from: classes12.dex */
public final class iws extends LinkedHashMap<Uri, byte[]> {
    final /* synthetic */ jws this$0;
    final /* synthetic */ int val$maxSize = 4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iws(jws jwsVar, int i) {
        super(i, 1.0f, false);
        this.this$0 = jwsVar;
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry<Uri, byte[]> entry) {
        return size() > this.val$maxSize;
    }
}
