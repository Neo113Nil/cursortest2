package xsna;

import com.vk.clips.sdk.stats.pixels.models.AdStatPixel;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: DefaultAdStatPixelsDeduplicator.kt */
/* loaded from: classes17.dex */
public final class u9l implements oi0 {
    public final ConcurrentHashMap a = new ConcurrentHashMap();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.oi0
    public final boolean a(AdStatPixel.a aVar) {
        if (!(aVar instanceof AdStatPixel)) {
            throw new NoWhenBranchMatchedException();
        }
        return this.a.containsKey(((AdStatPixel) aVar).Ab());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.oi0
    public final void b(AdStatPixel.a aVar) {
        if (!(aVar instanceof AdStatPixel)) {
            throw new NoWhenBranchMatchedException();
        }
        this.a.put(((AdStatPixel) aVar).Ab(), s3q0.a);
    }
}
