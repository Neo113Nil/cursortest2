package xsna;

import org.json.JSONObject;
import xsna.akv;
import xsna.k7r0;

/* compiled from: PosterUpload.kt */
/* loaded from: classes15.dex */
public final class gbc0 implements k7r0<a> {
    public final akv b;

    /* compiled from: PosterUpload.kt */
    public static final class a {
        public final int a;
        public final int b;
        public final String c;

        public a(int i, int i2, String str) {
            this.a = i;
            this.b = i2;
            this.c = str;
        }
    }

    public gbc0(String str, int i) {
        akv.a aVar = new akv.a();
        aVar.a = str;
        aVar.e = i * 1000;
        this.b = new akv(aVar);
    }

    @Override // xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        try {
            return new a(jSONObject.getInt("id"), jSONObject.getInt("owner_id"), jSONObject.getString("post_hash"));
        } catch (Exception unused) {
            throw new IllegalArgumentException(cq.c("Poster upload response parsing error. JSON string: ", jSONObject));
        }
    }

    @Override // xsna.k7r0
    public final per0 e(qrj0 qrj0Var, qrj0 qrj0Var2) {
        return k7r0.a.a(this, qrj0Var2);
    }
}
