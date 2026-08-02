package xsna;

import com.vk.clips.sdk.shared.api.analytics.SdkClipViewerClick;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.builders.ListBuilder;

/* compiled from: ClipFeedCompositeClickTracker.kt */
/* loaded from: classes17.dex */
public final class bwc implements rih0 {
    public final List<rih0> a;

    public bwc(ListBuilder listBuilder) {
        this.a = listBuilder;
    }

    @Override // xsna.rih0
    public final void o2(SdkClipViewerClick sdkClipViewerClick) {
        Iterator<T> it = this.a.iterator();
        while (it.hasNext()) {
            ((rih0) it.next()).o2(sdkClipViewerClick);
        }
    }
}
