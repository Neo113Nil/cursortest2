package defpackage;

import android.content.Context;
import com.google.firebase.encoders.EncodingException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;

/* loaded from: classes11.dex */
public final class b1b1 implements lya1 {
    public final j3y a;
    public final j3y b;
    public final vya1 c;

    public b1b1(Context context, vya1 vya1Var) {
        this.c = vya1Var;
        d87 d87Var = d87.e;
        z811.b(context);
        j211 c = z811.a().c(d87Var);
        if (d87.d.contains(new pzn("json"))) {
            this.a = new j3y(new j0b1(c, 0));
        }
        this.b = new j3y(new j0b1(c, 1));
    }

    public static g64 b(vya1 vya1Var, wl91 wl91Var) {
        byte[] byteArray;
        b691 b691Var;
        ip60 ip60Var;
        int a = vya1Var.a();
        m501 m501Var = m501.y;
        ffa1 ffa1Var = (ffa1) wl91Var.a;
        ((nra1) wl91Var.b).i = Boolean.valueOf(1 == (a ^ 1));
        nra1 nra1Var = (nra1) wl91Var.b;
        nra1Var.g = Boolean.FALSE;
        ffa1Var.a = new isa1(nra1Var);
        try {
            h2b1.k();
            if (a == 0) {
                pfa1 pfa1Var = new pfa1(ffa1Var);
                mcx mcxVar = new mcx();
                m501Var.x(mcxVar);
                mcxVar.d = true;
                StringWriter stringWriter = new StringWriter();
                try {
                    zex zexVar = new zex(stringWriter, mcxVar.a, mcxVar.b, mcxVar.c, mcxVar.d);
                    zexVar.g(pfa1Var);
                    zexVar.i();
                    zexVar.b.flush();
                } catch (IOException unused) {
                }
                byteArray = stringWriter.toString().getBytes("utf-8");
            } else {
                pfa1 pfa1Var2 = new pfa1(ffa1Var);
                m691 m691Var = new m691();
                m501Var.x(m691Var);
                HashMap hashMap = new HashMap(m691Var.a);
                HashMap hashMap2 = new HashMap(m691Var.b);
                w591 w591Var = m691Var.c;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    b691Var = new b691(byteArrayOutputStream, hashMap, hashMap2, w591Var);
                    ip60Var = (ip60) hashMap.get(pfa1.class);
                } catch (IOException unused2) {
                }
                if (ip60Var == null) {
                    throw new EncodingException("No encoder for ".concat(String.valueOf(pfa1.class)));
                }
                ip60Var.a(pfa1Var2, b691Var);
                byteArray = byteArrayOutputStream.toByteArray();
            }
            return jeo.g(byteArray);
        } catch (UnsupportedEncodingException e) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e);
        }
    }

    @Override // defpackage.lya1
    public final void a(wl91 wl91Var) {
        vya1 vya1Var = this.c;
        if (vya1Var.a() != 0) {
            ((z211) this.b.get()).b(b(vya1Var, wl91Var));
            return;
        }
        j3y j3yVar = this.a;
        if (j3yVar != null) {
            ((z211) j3yVar.get()).b(b(vya1Var, wl91Var));
        }
    }
}
