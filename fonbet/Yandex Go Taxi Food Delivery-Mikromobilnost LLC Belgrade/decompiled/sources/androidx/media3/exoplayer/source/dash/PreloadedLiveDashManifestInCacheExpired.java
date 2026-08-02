package androidx.media3.exoplayer.source.dash;

import defpackage.ra7;
import java.io.IOException;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/media3/exoplayer/source/dash/PreloadedLiveDashManifestInCacheExpired;", "Ljava/io/IOException;", "Lra7;", "cache", "Lra7;", "a", "()Lra7;", "", "manifestCacheKey", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class PreloadedLiveDashManifestInCacheExpired extends IOException {
    private final ra7 cache;
    private final String manifestCacheKey;

    public PreloadedLiveDashManifestInCacheExpired(ra7 ra7Var, String str, Throwable th) {
        super(th);
        this.cache = ra7Var;
        this.manifestCacheKey = str;
    }

    /* renamed from: a, reason: from getter */
    public final ra7 getCache() {
        return this.cache;
    }

    /* renamed from: b, reason: from getter */
    public final String getManifestCacheKey() {
        return this.manifestCacheKey;
    }
}
