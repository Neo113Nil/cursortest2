package xsna;

import com.vk.voip.api.id.CallId;
import org.json.JSONObject;
import xsna.ij20;
import xsna.k7r0;

/* compiled from: EditAnonymNameCmd.kt */
/* loaded from: classes7.dex */
public final class lzo extends le6<vt2> {
    public final CallId b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    /* compiled from: EditAnonymNameCmd.kt */
    public static final class a implements k7r0<vt2> {
        @Override // xsna.k7r0
        public final Object a(JSONObject jSONObject) {
            return new vt2(jSONObject.getJSONObject("response").getString("secret"));
        }

        @Override // xsna.k7r0
        public final per0 e(qrj0 qrj0Var, qrj0 qrj0Var2) {
            return k7r0.a.a(this, qrj0Var2);
        }
    }

    public lzo(CallId callId, String str, String str2, String str3, String str4) {
        this.b = callId;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
    }

    @Override // xsna.le6
    public final vt2 e(w2w w2wVar) {
        ij20.a aVar = new ij20.a();
        aVar.c = "calls.editParticipantName";
        aVar.h(this.b, "call_id");
        aVar.b("name", this.c);
        aVar.b("secret", this.d);
        aVar.b("device_id", this.e);
        aVar.b("anonym_auth_user_id", this.f);
        aVar.l = true;
        aVar.o = true;
        aVar.k = true;
        return (vt2) bz2.f(new ij20(aVar), new a());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lzo)) {
            return false;
        }
        lzo lzoVar = (lzo) obj;
        return epx.f(this.b, lzoVar.b) && epx.f(this.c, lzoVar.c) && epx.f(this.d, lzoVar.d) && epx.f(this.e, lzoVar.e) && epx.f(this.f, lzoVar.f);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return this.f.hashCode() + urd0.a(urd0.a(urd0.a(this.b.b.hashCode() * 31, 31, this.c), 31, this.d), 31, this.e);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("EditAnonymNameCmd(callId=");
        sb.append(this.b);
        sb.append(", changedName=");
        sb.append(this.c);
        sb.append(", secret=");
        sb.append(this.d);
        sb.append(", deviceId=");
        sb.append(this.e);
        sb.append(", anonymAuthUserId=");
        return ho8.a(sb, this.f, ')');
    }
}
