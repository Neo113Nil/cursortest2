package xsna;

import com.vk.clips.sdk.stats.pixels.models.AdStatPixel;
import java.util.Collections;

/* compiled from: AdStatVideoPixelTrackerImpl.kt */
/* loaded from: classes17.dex */
public final class wi0 extends ak80 {
    public static final /* synthetic */ int h = 0;
    public final ti0 g;

    public wi0(ti0 ti0Var, zi0 zi0Var) {
        super(new vi0(0), zi0Var);
        this.g = ti0Var;
    }

    @Override // xsna.rzr0
    public final void O(i11 i11Var) {
        Object a = i11Var.a();
        if ((a instanceof AdStatPixel) && (a instanceof AdStatPixel.b)) {
            this.g.c.onNext(Collections.singletonList((AdStatPixel) a));
        }
    }
}
