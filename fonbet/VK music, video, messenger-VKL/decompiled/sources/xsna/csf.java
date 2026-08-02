package xsna;

import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: ClipsWrapperMemoryStorage.kt */
/* loaded from: classes17.dex */
public final class csf<V> implements Callable {
    public final /* synthetic */ Object b;

    public csf(Object obj) {
        this.b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final ClipFeedTab call() {
        duf dufVar = ((stf) this.b).c;
        List<ClipFeedTab> list = dufVar.a;
        if (list != null) {
            return (ClipFeedTab) j5g.b0(dufVar.b, list);
        }
        return null;
    }
}
