package androidx.media3.exoplayer.hls;

import android.net.Uri;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes10.dex */
public final class a {
    public final LinkedHashMap a;

    public a() {
        final int i = 5;
        this.a = new LinkedHashMap<Uri, byte[]>(i) { // from class: androidx.media3.exoplayer.hls.FullSegmentEncryptionKeyCache$1
            final /* synthetic */ int val$maxSize = 4;

            @Override // java.util.LinkedHashMap
            public final boolean removeEldestEntry(Map.Entry<Uri, byte[]> entry) {
                return size() > this.val$maxSize;
            }
        };
    }
}
