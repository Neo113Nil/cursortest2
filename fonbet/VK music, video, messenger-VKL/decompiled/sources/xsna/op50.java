package xsna;

import android.content.Context;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.clips.viewer.api.routing.ClipsRouter;
import java.util.Collections;

/* compiled from: MyTargetClipOpenDelegate.kt */
/* loaded from: classes4.dex */
public final class op50 implements s0t0 {
    public final Context b;
    public final ClipsRouter c;
    public final s2f d;
    public bq50 e;

    public op50(Context context, ClipsRouter clipsRouter, s2f s2fVar) {
        this.b = context;
        this.c = clipsRouter;
        this.d = s2fVar;
    }

    @Override // xsna.s0t0
    public final void a(fh5 fh5Var) {
        ClipsRouter.c(this.c, this.b, Collections.singletonList(new ClipFeedTab.SingleAdv(this.d.c(fh5Var.o), this.e)), fh5Var, null, null, null, null, false, this.e, 1528);
    }
}
