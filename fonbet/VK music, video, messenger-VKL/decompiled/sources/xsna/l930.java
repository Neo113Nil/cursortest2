package xsna;

import one.video.player.OneVideoPlayer;
import one.video.player.model.FrameSize;
import xsna.o1b0;

/* compiled from: MoreMenuHelper.kt */
/* loaded from: classes17.dex */
public final class l930 implements ebs0 {
    @Override // xsna.ebs0
    public final void bk(dbs0 dbs0Var) {
        FrameSize frameSize;
        OneVideoPlayer a;
        if (dbs0Var instanceof cet0) {
            cet0 cet0Var = (cet0) dbs0Var;
            boolean z = cet0Var.b;
            sr10 sr10Var = dy2.a;
            if (sr10Var != null) {
                sr10Var.k(z);
                s3q0 s3q0Var = s3q0.a;
            }
            d3b0 d3b0Var = cet0Var.a;
            if (z) {
                o1b0.a.getClass();
                frameSize = o1b0.a.b;
            } else {
                frameSize = null;
            }
            if (fxc0.B().J().l0() || (a = d3b0Var.a()) == null) {
                return;
            }
            rm80.c(a, frameSize);
        }
    }
}
