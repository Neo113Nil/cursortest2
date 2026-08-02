package defpackage;

import com.yandex.messaging.core.net.entities.proto.ChatHistoryResponse;

/* loaded from: classes15.dex */
public final class mab extends iab implements cxy {
    public kbb A;
    public boolean B;
    public final /* synthetic */ oab C;
    public final /* synthetic */ int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mab(oab oabVar, qbb qbbVar, int i) {
        super(oabVar, qbbVar);
        jbb jbbVar;
        this.z = i;
        switch (i) {
            case 1:
                this.C = oabVar;
                super(oabVar, qbbVar);
                lbb lbbVar = oabVar.G;
                lbbVar.getClass();
                jbb jbbVar2 = new jbb(lbbVar, this, 1);
                jbbVar = jbbVar2.e() ? jbbVar2 : null;
                this.A = jbbVar;
                if (jbbVar != null) {
                    dbb dbbVar = oabVar.I;
                    dbbVar.a.c(dbbVar.b.uniqueRequestId());
                    break;
                } else {
                    c(new iaz0());
                    break;
                }
            default:
                this.C = oabVar;
                lbb lbbVar2 = oabVar.G;
                lbbVar2.getClass();
                jbb jbbVar3 = new jbb(lbbVar2, this, 0);
                jbbVar = jbbVar3.e() ? jbbVar3 : null;
                this.A = jbbVar;
                if (jbbVar != null) {
                    dbb dbbVar2 = oabVar.I;
                    dbbVar2.a.c(dbbVar2.b.uniqueRequestId());
                    break;
                } else {
                    c(new iaz0());
                    break;
                }
        }
    }

    @Override // defpackage.cxy
    public final void a() {
        int i = this.z;
        qbb qbbVar = this.w;
        oab oabVar = this.C;
        switch (i) {
            case 0:
                dbb dbbVar = oabVar.I;
                dbbVar.a.b(dbbVar.b.uniqueRequestId(), false);
                this.B = true;
                c(null);
                obb obbVar = qbbVar.a;
                obbVar.x.post(new v4a(8, obbVar));
                break;
            default:
                dbb dbbVar2 = oabVar.I;
                dbbVar2.a.b(dbbVar2.b.uniqueRequestId(), false);
                this.B = true;
                c(null);
                obb obbVar2 = qbbVar.a;
                obbVar2.x.post(new v4a(8, obbVar2));
                break;
        }
    }

    @Override // defpackage.jab, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.z) {
            case 0:
                super.close();
                kbb kbbVar = this.A;
                if (kbbVar != null) {
                    kbbVar.close();
                }
                this.A = null;
                break;
            default:
                super.close();
                kbb kbbVar2 = this.A;
                if (kbbVar2 != null) {
                    kbbVar2.close();
                }
                this.A = null;
                break;
        }
    }

    @Override // defpackage.cxy
    public final void d(ChatHistoryResponse chatHistoryResponse) {
        int i = this.z;
        oab oabVar = this.C;
        switch (i) {
            case 0:
                oabVar.h(chatHistoryResponse);
                break;
            default:
                oabVar.h(chatHistoryResponse);
                break;
        }
    }

    @Override // defpackage.iab
    public final boolean e() {
        switch (this.z) {
            case 0:
                if (this.B || this.C.H.d() == null) {
                }
                break;
            default:
                if (this.B || this.C.H.c() == null) {
                }
                break;
        }
        return true;
    }
}
