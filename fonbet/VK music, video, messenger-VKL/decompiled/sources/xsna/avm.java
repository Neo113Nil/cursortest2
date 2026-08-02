package xsna;

import com.vk.im.engine.models.messages.PinnedMsg;
import java.util.Collection;

/* compiled from: DialogsPinnedEntryStorageManager.kt */
/* loaded from: classes2.dex */
public final class avm implements moa0<PinnedMsg> {
    public final tgl0 b;
    public final dhl0<com.vk.im.engine.models.dialogs.b, Long> c;
    public final jcm d = ucm.a;

    public avm(tgl0 tgl0Var, dhl0 dhl0Var) {
        this.b = tgl0Var;
        this.c = dhl0Var;
    }

    public final void b(PinnedMsg pinnedMsg, long j) {
        this.c.a(Long.valueOf(j), new k7f(pinnedMsg, 11), new xqb(j, pinnedMsg, this));
    }

    @Override // xsna.moa0
    public final Collection<PinnedMsg> c(long j) {
        com.vk.im.engine.models.dialogs.b d = this.c.d(Long.valueOf(j));
        return e43.m(d != null ? d.t : null);
    }

    public final void d(final long j, final boolean z) {
        this.c.a(Long.valueOf(j), new xum(z, 0), new izs() { // from class: xsna.yum
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                avm.this.b.b().execSQL("UPDATE dialogs SET pinned_msg_visible = ? WHERE id = ?", new Long[]{Long.valueOf(z ? 1L : 0L), Long.valueOf(j)});
                return s3q0.a;
            }
        });
        this.b.b().execSQL("UPDATE dialogs SET pinned_msg_visible = ? WHERE id = ?", new Long[]{Long.valueOf(z ? 1L : 0L), Long.valueOf(j)});
    }

    @Override // xsna.moa0
    public final void a(int i, long j, boolean z) {
    }
}
