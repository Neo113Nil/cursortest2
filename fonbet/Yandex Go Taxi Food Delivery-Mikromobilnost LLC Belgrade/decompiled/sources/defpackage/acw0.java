package defpackage;

import android.view.View;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes.dex */
public final class acw0 implements zbw0 {
    public final r0 a = bvf0.c(0);
    public final r0 b = bvf0.c(0);
    public final r0 c;
    public final r0 d;
    public final n0 e;

    public acw0() {
        Float valueOf = Float.valueOf(0.0f);
        this.c = bvf0.c(valueOf);
        this.d = bvf0.c(valueOf);
        this.e = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);
    }

    public final void a(View view) {
        int b = m810.b(view.getTranslationY() + view.getHeight());
        if (b < 0) {
            b = 0;
        }
        x4e.z(b >= 0 ? b : 0, this.b, null);
    }
}
