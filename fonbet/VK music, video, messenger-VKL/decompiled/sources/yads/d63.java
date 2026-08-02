package yads;

import android.view.View;
import java.util.Arrays;

/* loaded from: classes10.dex */
public final class d63 implements ge1 {
    public final View b;

    public d63(ic2 ic2Var) {
        this.b = ic2Var;
    }

    @Override // yads.ge1
    public final String a() {
        return String.format("supports: {inlineVideo: %s}", Arrays.copyOf(new Object[]{Boolean.valueOf(this.b.isHardwareAccelerated())}, 1));
    }
}
