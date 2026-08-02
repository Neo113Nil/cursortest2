package com.vungle.ads.internal.network.converters;

import com.vungle.ads.internal.network.j;
import java.io.InputStream;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.internal.WriteMode;
import xsna.bqz0;
import xsna.dmb;
import xsna.fpm0;
import xsna.j8y;
import xsna.n9y;
import xsna.olb;
import xsna.q8y;
import xsna.s1v;
import xsna.tt8;
import xsna.vcy;
import xsna.x7f0;

/* loaded from: classes7.dex */
public final class d implements a {
    public static final j8y b = n9y.a(c.a);
    public final vcy a;

    public d(vcy vcyVar) {
        this.a = vcyVar;
    }

    @Override // com.vungle.ads.internal.network.converters.a
    public final Object a(j jVar) {
        try {
            InputStream byteStream = jVar.byteStream();
            if (byteStream == null) {
                jVar.close();
                return null;
            }
            j8y j8yVar = b;
            KSerializer p = s1v.p(j8y.d.b, this.a);
            bqz0 bqz0Var = new bqz0(byteStream);
            dmb dmbVar = (dmb) bqz0Var.b;
            try {
                char[] e = olb.c.e(16384);
                q8y q8yVar = j8yVar.a;
                x7f0 x7f0Var = new x7f0(bqz0Var, e);
                try {
                    Object h = new fpm0(j8yVar, WriteMode.OBJ, x7f0Var, p.getDescriptor(), null).h(p);
                    x7f0Var.o();
                    jVar.close();
                    return h;
                } finally {
                    x7f0Var.G();
                }
            } finally {
                dmbVar.getClass();
                tt8.c.a(dmbVar.c.array());
            }
        } finally {
        }
    }
}
