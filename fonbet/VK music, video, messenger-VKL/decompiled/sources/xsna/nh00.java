package xsna;

import org.json.JSONObject;
import xsna.k7r0;

/* compiled from: ManageDeviceForPushesJob.kt */
/* loaded from: classes2.dex */
public final class nh00<Result> implements k7r0 {
    public final /* synthetic */ w2w b;
    public final /* synthetic */ mh00 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ long e;

    public nh00(w2w w2wVar, mh00 mh00Var, String str, long j) {
        this.b = w2wVar;
        this.c = mh00Var;
        this.d = str;
        this.e = j;
    }

    @Override // xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        if (this.b.getExperiments().v()) {
            this.c.l.getClass();
            vle0.a(this.e, this.d);
        }
        return s3q0.a;
    }

    @Override // xsna.k7r0
    public final per0 e(qrj0 qrj0Var, qrj0 qrj0Var2) {
        return k7r0.a.a(this, qrj0Var2);
    }
}
