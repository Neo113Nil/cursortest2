package xsna;

import com.vk.dto.common.Peer;

/* compiled from: OnDialogPinFailedEvent.kt */
/* loaded from: classes2.dex */
public final class j480 extends sxp {
    public final kim b;
    public final Peer c;
    public final Throwable d;

    public j480(kim kimVar, Peer peer, Throwable th) {
        this.b = kimVar;
        this.c = peer;
        this.d = th;
    }

    @Override // xsna.sxp
    public final Object a() {
        return this.b;
    }
}
