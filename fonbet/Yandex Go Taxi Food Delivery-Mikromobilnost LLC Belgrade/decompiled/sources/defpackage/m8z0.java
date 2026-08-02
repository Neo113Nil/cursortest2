package defpackage;

import java.io.ByteArrayOutputStream;
import java.text.ParseException;
import java.util.ArrayList;
import org.bouncycastle.cms.CMSException;
import org.bouncycastle.tsp.TSPException;
import org.bouncycastle.tsp.TSPValidationException;

/* loaded from: classes4.dex */
public final class m8z0 {
    public final u87 a;
    public final acs0 b;
    public final zxs0 c;

    public m8z0(u87 u87Var) {
        this.a = u87Var;
        if (!u87Var.a.c.a.a.equals(b490.A3.a)) {
            throw new TSPValidationException("ContentInfo object not for a time stamp.");
        }
        ArrayList a = u87Var.b().a();
        if (a.size() != 1) {
            kbs.i("Time-stamp token signed by ", a.size(), " signers, but it must contain just the TSA signature.");
            throw null;
        }
        acs0 acs0Var = (acs0) a.iterator().next();
        this.b = acs0Var;
        try {
            z87 z87Var = u87Var.c;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            z87Var.write(byteArrayOutputStream);
            p4x0 m = p4x0.m(b3.r(byteArrayOutputStream.toByteArray()));
            zxs0 zxs0Var = new zxs0();
            zxs0Var.a = m;
            try {
                zxs0Var.b = m.x.y();
                this.c = zxs0Var;
                vc3 c = acs0Var.getSignedAttributes().c(b490.G3);
                if (c != null) {
                    i3 i3Var = dcs0.m(c.b.a[0]).a;
                    ran[] ranVarArr = new ran[i3Var.size()];
                    for (int i = 0; i != i3Var.size(); i++) {
                        ranVarArr[i] = ran.m(i3Var.A(i));
                    }
                    ran.m(ranVarArr[0]);
                    return;
                }
                vc3 c2 = acs0Var.getSignedAttributes().c(b490.I3);
                if (c2 == null) {
                    throw new TSPValidationException("no signing certificate attribute found, time stamp invalid.");
                }
                i3 i3Var2 = ecs0.m(c2.b.a[0]).a;
                san[] sanVarArr = new san[i3Var2.size()];
                for (int i2 = 0; i2 != i3Var2.size(); i2++) {
                    sanVarArr[i2] = san.m(i3Var2.A(i2));
                }
                san.m(sanVarArr[0]);
            } catch (ParseException unused) {
                throw new TSPException("unable to parse genTime field");
            }
        } catch (CMSException e) {
            throw new TSPException(e.getMessage(), e.getUnderlyingException());
        }
    }
}
