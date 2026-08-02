package defpackage;

import com.yandex.fintechsdk.core.network.api.request.RestMethod;
import kotlinx.serialization.json.c;

/* loaded from: classes12.dex */
public final class gt5 extends v4j0 {
    public final String b;
    public final jt5 c;
    public final RestMethod d;
    public final String e;
    public final String f;

    public gt5(String str, jt5 jt5Var) {
        super(null);
        this.b = str;
        this.c = jt5Var;
        this.d = RestMethod.POST;
        this.e = "cardmeta";
        this.f = "/v2/cardmeta";
    }

    @Override // defpackage.v4j0
    public final c a() {
        rbx rbxVar = sbx.d;
        rbxVar.getClass();
        return qcx.m(gwk0.J(rbxVar, this.c, jt5.Companion.serializer()));
    }

    @Override // defpackage.v4j0
    public final String b() {
        return this.b;
    }

    @Override // defpackage.v4j0
    public final RestMethod c() {
        return this.d;
    }

    @Override // defpackage.v4j0
    public final String d() {
        return this.e;
    }

    @Override // defpackage.v4j0
    public final String e() {
        return this.f;
    }
}
