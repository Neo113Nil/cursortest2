package defpackage;

import com.yandex.messaging.core.net.entities.proto.ChatHistoryResponse;
import com.yandex.messaging.internal.ServerMessageRef;

/* loaded from: classes15.dex */
public final class nab extends iab implements cxy {
    public kbb A;
    public boolean B;
    public final /* synthetic */ oab C;
    public final ServerMessageRef z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nab(oab oabVar, qbb qbbVar, ServerMessageRef serverMessageRef) {
        super(oabVar, qbbVar);
        this.C = oabVar;
        this.z = serverMessageRef;
        lbb lbbVar = oabVar.G;
        lbbVar.getClass();
        ibb ibbVar = new ibb(lbbVar, serverMessageRef, this);
        ibbVar = ibbVar.e() ? ibbVar : null;
        this.A = ibbVar;
        if (ibbVar == null) {
            c(new iaz0());
        } else {
            dbb dbbVar = oabVar.I;
            dbbVar.a.c(dbbVar.b.uniqueRequestId());
        }
    }

    @Override // defpackage.cxy
    public final void a() {
        dbb dbbVar = this.C.I;
        dbbVar.a.b(dbbVar.b.uniqueRequestId(), false);
        this.B = true;
        c(null);
        obb obbVar = this.w.a;
        obbVar.x.post(new v4a(8, obbVar));
    }

    @Override // defpackage.jab, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        super.close();
        kbb kbbVar = this.A;
        if (kbbVar != null) {
            kbbVar.close();
        }
        this.A = null;
    }

    @Override // defpackage.cxy
    public final void d(ChatHistoryResponse chatHistoryResponse) {
        this.C.h(chatHistoryResponse);
    }

    @Override // defpackage.iab
    public final boolean e() {
        return this.B || this.C.H.b(this.z) == null;
    }
}
