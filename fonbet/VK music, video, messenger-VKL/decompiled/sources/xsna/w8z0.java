package xsna;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;
import xsna.n8z0;
import xsna.s3z0;
import xsna.z8y0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class w8z0 extends n8z0 {
    public final List e;
    public final saz0 f;
    public dxt g;
    public final String h;

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public static class a implements n8z0.a {
        @Override // xsna.n8z0.a
        public final boolean a() {
            return true;
        }

        @Override // xsna.n8z0.a
        public final z8y0 b() {
            return new z8y0.a();
        }

        @Override // xsna.n8z0.a
        public final b920 c() {
            return new qdz0();
        }

        @Override // xsna.n8z0.a
        public final ohz0 d() {
            return new ncz0();
        }
    }

    public w8z0(ArrayList arrayList, u6z0 u6z0Var, s3z0.a aVar, int i, String str) {
        super(new a(), u6z0Var, aVar);
        this.e = arrayList;
        this.f = saz0.b(i * 1000);
        this.h = str;
    }

    @Override // xsna.n8z0
    public final void e(s3z0 s3z0Var, Context context) {
        if (this.h == null) {
            if (this.g == null) {
                this.g = new dxt(8, this, s3z0Var);
            }
            this.f.c(this.g);
        }
        super.e(s3z0Var, context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0019, code lost:
    
        if (r2.isNull("version") == false) goto L8;
     */
    @Override // xsna.n8z0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(s3z0 s3z0Var, idy0 idy0Var) {
        s3z0 s3z0Var2;
        Throwable th;
        String str = this.h;
        if (str == null) {
            List list = this.e;
            if (list == null) {
                super.f(s3z0Var, idy0Var);
                return;
            }
            xla xlaVar = new xla();
            rez0 rez0Var = (rez0) h((rez0) b(list, null, this.a.d(), s3z0Var, xlaVar), xlaVar);
            if (rez0Var != null) {
                xlaVar = new xla();
            }
            g(rez0Var, xlaVar, s3z0Var);
            return;
        }
        try {
            String str2 = this.b.h;
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("version")) {
                try {
                } catch (Throwable th2) {
                    th = th2;
                    s3z0Var2 = s3z0Var;
                    eb3.a(null, new StringBuilder("InstreamAdFactory: invalid json-data, error: "), th);
                    g(null, xla.a(iaz0.k), s3z0Var2);
                }
            }
            try {
                str = new JSONObject().put("version", "2.5").put(str2, jSONObject).toString();
                c("s2s", this.a.b().a(this.b, new HashMap(), s3z0Var, idy0Var), str, s3z0Var, null);
            } catch (Throwable th3) {
                s3z0Var2 = s3z0Var;
                th = th3;
                eb3.a(null, new StringBuilder("InstreamAdFactory: invalid json-data, error: "), th);
                g(null, xla.a(iaz0.k), s3z0Var2);
            }
        } catch (Throwable th4) {
            s3z0Var2 = s3z0Var;
            th = th4;
        }
    }
}
