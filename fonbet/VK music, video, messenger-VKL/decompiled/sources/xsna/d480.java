package xsna;

import com.vk.dto.common.Peer;
import com.vk.im.engine.internal.jobs.dialogs.DialogArchiveUnarchiveJob;

/* compiled from: OnDialogArchiveFailedEvent.kt */
/* loaded from: classes2.dex */
public final class d480 extends sxp {
    public final DialogArchiveUnarchiveJob b;
    public final Peer c;
    public final Throwable d;

    public d480(DialogArchiveUnarchiveJob dialogArchiveUnarchiveJob, Peer peer, Throwable th) {
        this.b = dialogArchiveUnarchiveJob;
        this.c = peer;
        this.d = th;
    }

    @Override // xsna.sxp
    public final Object a() {
        return this.b;
    }
}
