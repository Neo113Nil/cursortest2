package xsna;

import com.vk.media.pipeline.model.timeline.VideoFragment;
import kotlin.Lazy;

/* compiled from: BoundFragment.kt */
/* loaded from: classes3.dex */
public final class kql extends c7s0 {
    public final VideoFragment b;
    public final tht0 c;

    public kql(Lazy<? extends tht0> lazy, VideoFragment videoFragment) {
        super(lazy);
        this.b = videoFragment;
        this.c = lazy.getValue();
    }

    @Override // xsna.c7s0
    public final tht0 a() {
        return this.c;
    }

    @Override // xsna.o98
    public final VideoFragment getLayout() {
        return this.b;
    }

    @Override // xsna.o98
    public final void release() {
        this.c.release();
    }
}
