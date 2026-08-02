package xsna;

import com.vk.dto.common.Peer;

/* compiled from: OnDialogUnPinFailedEvent.kt */
/* loaded from: classes2.dex */
public final class p480 extends sxp {
    public final emm b;
    public final Peer c;
    public final Throwable d;

    public p480(emm emmVar, Peer peer, Throwable th) {
        this.b = emmVar;
        this.c = peer;
        this.d = th;
    }

    @Override // xsna.sxp
    public final Object a() {
        return this.b;
    }
}
