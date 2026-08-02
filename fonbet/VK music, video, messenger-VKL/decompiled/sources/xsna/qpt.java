package xsna;

import kotlin.jvm.internal.Ref$BooleanRef;
import org.json.JSONObject;
import xsna.k7r0;

/* compiled from: GetAttachFileExistStatusCmd.kt */
/* loaded from: classes2.dex */
public final class qpt<Result> implements k7r0 {
    public final /* synthetic */ Ref$BooleanRef b;
    public final /* synthetic */ rpt c;

    public qpt(Ref$BooleanRef ref$BooleanRef, rpt rptVar) {
        this.b = ref$BooleanRef;
        this.c = rptVar;
    }

    @Override // xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        String str = this.c.b.b;
        int hashCode = str.hashCode();
        this.b.element = hashCode == 99640 ? str.equals("doc") && jSONObject.getJSONArray("response").length() > 0 : hashCode == 106642994 ? str.equals("photo") && jSONObject.getJSONArray("response").length() > 0 : hashCode == 112202875 && str.equals("video") && jSONObject.getJSONObject("response").getInt("count") > 0;
        return s3q0.a;
    }

    @Override // xsna.k7r0
    public final per0 e(qrj0 qrj0Var, qrj0 qrj0Var2) {
        return k7r0.a.a(this, qrj0Var2);
    }
}
