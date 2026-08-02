package defpackage;

import com.yandex.fintechsdk.core.network.api.request.RestMethod;
import kotlinx.serialization.json.c;

/* loaded from: classes12.dex */
public final class ivv extends v4j0 {
    public final lvv b;
    public final RestMethod c;
    public final String d;
    public final String e;

    public ivv(lvv lvvVar) {
        super(null);
        this.b = lvvVar;
        this.c = RestMethod.POST;
        this.d = "card_init_verification";
        this.e = "/v2/init_verification";
    }

    @Override // defpackage.v4j0
    public final c a() {
        rbx rbxVar = sbx.d;
        rbxVar.getClass();
        return qcx.m(gwk0.J(rbxVar, this.b, lvv.Companion.serializer()));
    }

    @Override // defpackage.v4j0
    public final RestMethod c() {
        return this.c;
    }

    @Override // defpackage.v4j0
    public final String d() {
        return this.d;
    }

    @Override // defpackage.v4j0
    public final String e() {
        return this.e;
    }
}
