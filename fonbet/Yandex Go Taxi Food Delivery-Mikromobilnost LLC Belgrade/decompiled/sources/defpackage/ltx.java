package defpackage;

import org.json.JSONObject;

/* loaded from: classes11.dex */
public final /* synthetic */ class ltx implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ u2l b;

    public /* synthetic */ ltx(u2l u2lVar, int i) {
        this.a = i;
        this.b = u2lVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        u2l u2lVar = this.b;
        JSONObject jSONObject = (JSONObject) obj;
        switch (i) {
            case 0:
                kvo kvoVar = v3k.m;
                break;
            case 1:
                kvo kvoVar2 = v3k.m;
                break;
            default:
                kvo kvoVar3 = v3k.m;
                break;
        }
        return kp50.p(u2lVar, jSONObject);
    }
}
