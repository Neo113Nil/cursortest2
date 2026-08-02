package xsna;

import com.vk.dto.common.Peer;
import java.util.HashMap;

/* compiled from: DialogCnvReadTillForOutgoingLpTask.kt */
/* loaded from: classes2.dex */
public final class gcm extends e500 {
    public final w2w c;
    public final Peer d;
    public final int e;
    public boolean f;

    public gcm(w2w w2wVar, Peer peer, int i) {
        super("DialogCnvReadTillForOutgoingLpTask");
        this.c = w2wVar;
        this.d = peer;
        this.e = i;
    }

    @Override // xsna.e500
    public final void b(z300 z300Var) {
        if (this.f) {
            z300Var.g(this.d.b);
        }
        long j = this.d.b;
        int i = this.e;
        if (z300Var.z == null) {
            z300Var.z = new HashMap();
        }
        z300Var.z.put(Long.valueOf(j), Integer.valueOf(i));
    }

    @Override // xsna.e500
    public final void e(c400 c400Var) {
        this.f = ((Boolean) new gjm(this.d.b, null, Integer.valueOf(this.e), null, 10).o(this.c)).booleanValue();
    }
}
