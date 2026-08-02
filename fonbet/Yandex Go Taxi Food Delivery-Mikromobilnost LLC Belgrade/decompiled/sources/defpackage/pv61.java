package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import org.bouncycastle.cms.CMSException;

/* loaded from: classes4.dex */
public final class pv61 implements nv61 {
    public final v87 a;

    public pv61(v87 v87Var) {
        this.a = v87Var;
    }

    @Override // defpackage.nv61
    public final ncc b() {
        v87 v87Var = this.a;
        v87Var.Vg();
        y87 y87Var = v87.D;
        m3 m3Var = v87Var.A;
        y87Var.getClass();
        return y87.d(m3Var);
    }

    @Override // defpackage.nv61
    public final ncc c() {
        v87 v87Var = this.a;
        v87Var.Vg();
        y87 y87Var = v87.D;
        m3 m3Var = v87Var.B;
        y87Var.getClass();
        return y87.c(m3Var);
    }

    @Override // defpackage.nv61
    public final ncc d() {
        u2 u2Var = jw61.a;
        v87 v87Var = this.a;
        v87Var.Vg();
        y87 y87Var = v87.D;
        m3 m3Var = v87Var.B;
        y87Var.getClass();
        return y87.e(u2Var, m3Var);
    }

    @Override // defpackage.nv61
    public final bcs0 e() {
        v87 v87Var = this.a;
        HashMap hashMap = v87Var.y;
        if (v87Var.z == null) {
            v87Var.Vg();
            ArrayList arrayList = new ArrayList();
            HashMap hashMap2 = new HashMap();
            for (Object obj : hashMap.keySet()) {
                hashMap2.put(obj, ((ljj) hashMap.get(obj)).getDigest());
            }
            try {
                n3 e = v87Var.c.e();
                while (true) {
                    a2 readObject = e.readObject();
                    if (readObject == null) {
                        break;
                    }
                    ybs0 m = ybs0.m(readObject.toASN1Primitive());
                    arrayList.add(new acs0(m, v87Var.w, null, (byte[]) hashMap2.get(m.c.a)));
                }
                v87Var.z = new bcs0(arrayList);
            } catch (IOException e2) {
                throw new CMSException(x4e.d(e2, new StringBuilder("io exception: ")), e2);
            }
        }
        return v87Var.z;
    }

    @Override // defpackage.nv61
    public final byte[] f() {
        return null;
    }

    @Override // defpackage.nv61
    public final InputStream g() {
        c06 Ug = this.a.Ug();
        if (Ug != null) {
            return (a97) Ug.b;
        }
        return null;
    }
}
