package xsna;

import com.vk.dto.stories.model.StoryEntry;
import com.vk.story.api.domain.preload.StoryVideoMemoryCache;

/* compiled from: StoryLoaderContentImpl.kt */
/* loaded from: classes11.dex */
public final class w5m0 implements v5m0 {
    public final bpn0 a = new bpn0(new jbw(10));

    @Override // xsna.v5m0
    public final j1d0 a() {
        x8m0 x8m0Var = (x8m0) this.a.getValue();
        if (x8m0Var != null) {
            return x8m0Var.b();
        }
        return null;
    }

    @Override // xsna.v5m0
    public final io.reactivex.rxjava3.core.a b(StoryEntry storyEntry, StoryVideoMemoryCache storyVideoMemoryCache) {
        if (!storyEntry.Tb()) {
            return io.reactivex.rxjava3.internal.operators.completable.i.b;
        }
        x8m0 x8m0Var = (x8m0) this.a.getValue();
        return x8m0Var != null ? x8m0Var.c(storyEntry, storyVideoMemoryCache) : io.reactivex.rxjava3.internal.operators.completable.i.b;
    }

    @Override // xsna.v5m0
    public final void cancel() {
        x8m0 x8m0Var = (x8m0) this.a.getValue();
        if (x8m0Var != null) {
            x8m0Var.a();
        }
    }
}
