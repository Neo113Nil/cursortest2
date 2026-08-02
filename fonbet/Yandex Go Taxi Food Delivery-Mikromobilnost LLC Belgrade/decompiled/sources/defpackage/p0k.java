package defpackage;

import com.yandex.messaging.core.net.entities.proto.message.LocalizedData;
import com.yandex.messaging.domain.user.UserNameType;
import com.yandex.messaging.internal.images.b;
import java.util.Objects;

/* loaded from: classes15.dex */
public final /* synthetic */ class p0k implements e9e {
    public final /* synthetic */ int a;
    public final /* synthetic */ apf b;
    public final /* synthetic */ zog c;

    public /* synthetic */ p0k(apf apfVar, zog zogVar, int i) {
        this.a = i;
        this.b = apfVar;
        this.c = zogVar;
    }

    @Override // defpackage.e9e
    public final void accept(Object obj) {
        String str;
        int i = this.a;
        zog zogVar = this.c;
        apf apfVar = this.b;
        switch (i) {
            case 0:
                x4b0 x4b0Var = (x4b0) obj;
                q0k q0kVar = (q0k) apfVar.x;
                String str2 = x4b0Var.a;
                String str3 = (String) apfVar.b;
                if (!str2.equals(str3)) {
                    uds0 uds0Var = (uds0) apfVar.c;
                    if (uds0Var != null) {
                        uds0Var.close();
                        apfVar.c = null;
                    }
                    apfVar.w = ((nft) q0kVar.d.get()).b.c(new oft(str3, true), new k9b(7, new p0k(apfVar, zogVar, 1)));
                    break;
                } else {
                    q0k.a(q0kVar, zogVar, x4b0Var);
                    break;
                }
            default:
                in21 in21Var = (in21) obj;
                q0k q0kVar2 = (q0k) apfVar.x;
                rp21 rp21Var = (rp21) q0kVar2.h.get();
                String str4 = in21Var.c;
                long c = rp21Var.b.c();
                in21 a = rp21Var.a.a().a(str4);
                String g = h791.g(a == null ? new qp21(null, UserNameType.NOT_FOUND) : rp21Var.c.a(a, c), q0kVar2.a.getResources(), in21Var.a);
                iv21 iv21Var = (iv21) q0kVar2.g.get();
                Objects.requireNonNull(iv21Var);
                if (iv21Var.c) {
                    LocalizedData a2 = ((z5z) q0kVar2.f.get()).a(str4);
                    String displayName = a2 != null ? a2.getDisplayName() : null;
                    str = a2 != null ? b.f(a2.getAvatarId()) : null;
                    r1 = displayName;
                } else {
                    str = null;
                }
                g3t0 g3t0Var = h3t0.a;
                if (r1 != null) {
                    g = r1;
                }
                if (str == null) {
                    str = in21Var.b;
                }
                zogVar.b(g3t0Var, new czj(g, str4, str, Boolean.valueOf(in21Var.o)));
                break;
        }
    }
}
