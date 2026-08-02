package xsna;

import com.vk.clips.sdk.shared.feed.recycler.adapter.ClipFeedAdapter;

/* compiled from: SkipFirstVhClipsLazyViewInflateController.kt */
/* loaded from: classes17.dex */
public final class nzj0 implements aje {
    public static final nzj0 a = new nzj0();
    public static volatile boolean b = true;

    @Override // xsna.aje
    public final void a(int i) {
        if (b && i == ClipFeedAdapter.ViewType.CLIP.ordinal()) {
            b = false;
        }
    }
}
