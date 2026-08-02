package xsna;

import org.json.JSONObject;
import xsna.k7r0;

/* compiled from: RegisterDeviceForPushesJob.kt */
/* loaded from: classes2.dex */
public final class cqf0<Result> implements k7r0 {
    public final /* synthetic */ w2w b;
    public final /* synthetic */ bqf0 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ long e;

    public cqf0(w2w w2wVar, bqf0 bqf0Var, String str, long j) {
        this.b = w2wVar;
        this.c = bqf0Var;
        this.d = str;
        this.e = j;
    }

    @Override // xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        if (!this.b.getExperiments().v()) {
            return "";
        }
        this.c.j.getClass();
        vle0.a(this.e, this.d);
        return "";
    }

    @Override // xsna.k7r0
    public final per0 e(qrj0 qrj0Var, qrj0 qrj0Var2) {
        return k7r0.a.a(this, qrj0Var2);
    }
}
