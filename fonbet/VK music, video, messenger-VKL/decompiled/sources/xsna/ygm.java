package xsna;

import com.vk.dto.common.Peer;

/* compiled from: DialogMarkedAsUnreadChangedLpTask.kt */
/* loaded from: classes2.dex */
public final class ygm extends e500 {
    public final w2w c;
    public final Peer d;
    public final boolean e;
    public boolean f;

    public ygm(w2w w2wVar, Peer peer, boolean z) {
        super("DialogMarkedAsUnreadChangedLpTask");
        this.c = w2wVar;
        this.d = peer;
        this.e = z;
    }

    @Override // xsna.e500
    public final void b(z300 z300Var) {
        if (this.f) {
            z300Var.g(this.d.b);
        }
    }

    @Override // xsna.e500
    public final void e(c400 c400Var) {
        xgl0 I0 = this.c.I0();
        final long j = this.d.b;
        final boolean z = this.e;
        this.f = ((Boolean) I0.u(new izs() { // from class: xsna.djm
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                final hpm e = ((xgl0) obj).b().e();
                final long j2 = j;
                com.vk.im.engine.models.dialogs.b c = e.c(j2);
                boolean z2 = false;
                if (c != null) {
                    boolean z3 = c.m;
                    final boolean z4 = z;
                    if (z3 != z4) {
                        e.c.a(Long.valueOf(j2), new izs() { // from class: xsna.bpm
                            @Override // xsna.izs
                            public final Object invoke(Object obj2) {
                                return com.vk.im.engine.models.dialogs.b.a((com.vk.im.engine.models.dialogs.b) obj2, null, null, null, 0, 0, 0, 0, 0, 0, z4, null, null, null, null, null, false, null, false, null, null, null, false, null, null, null, null, 0, false, false, null, null, 0, null, 0, -2049, 2097151);
                            }
                        }, new izs() { // from class: xsna.cpm
                            @Override // xsna.izs
                            public final Object invoke(Object obj2) {
                                e.b.b().execSQL("UPDATE dialogs SET marked_as_unread_server = " + (z4 ? 1 : 0) + " WHERE id = " + j2);
                                return s3q0.a;
                            }
                        });
                        z2 = true;
                    }
                    if (epx.f(c.n, Boolean.valueOf(z4))) {
                        e.q(j2, null);
                        z2 = true;
                    }
                }
                return Boolean.valueOf(z2);
            }
        })).booleanValue();
    }
}
