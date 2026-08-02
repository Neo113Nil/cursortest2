package defpackage;

import com.adjust.sdk.Constants;
import com.squareup.moshi.Moshi;
import com.yandex.messaging.core.net.entities.proto.ProtoRequestBody;
import ru.yandex.video.m3.ott.data.net.impl.ExtFunctionsKt;

/* loaded from: classes15.dex */
public final class c370 {
    public final h5o a;
    public final xf7 b;
    public final ouf0 c;
    public final Moshi d;
    public final String e;
    public final int f;
    public final r0d0 g;

    public c370(h5o h5oVar, xf7 xf7Var, ouf0 ouf0Var, Moshi moshi, String str, int i, r0d0 r0d0Var) {
        this.a = h5oVar;
        this.b = xf7Var;
        this.c = ouf0Var;
        this.d = moshi;
        this.e = str;
        this.f = i;
        this.g = r0d0Var;
    }

    public final void a(int i, String str, String str2) {
        pcp pcpVar = new pcp();
        pcpVar.requestId = str;
        pcpVar.code = str2;
        pcpVar.faultClass = i;
        pcpVar.endpoint = 2;
        t8o t8oVar = new t8o();
        t8oVar.environment = this.a.a();
        t8oVar.origin = this.f;
        t8oVar.faultInfo = pcpVar;
        d(t8oVar);
    }

    public final void b(int i, String str, String str2) {
        pcp pcpVar = new pcp();
        pcpVar.endpoint = 4;
        pcpVar.code = str;
        pcpVar.tag = str2;
        pcpVar.faultClass = i;
        t8o t8oVar = new t8o();
        t8oVar.environment = this.a.a();
        t8oVar.origin = this.f;
        t8oVar.faultInfo = pcpVar;
        d(t8oVar);
    }

    public final void c(int i, String str, String str2) {
        pcp pcpVar = new pcp();
        pcpVar.requestId = str;
        pcpVar.code = str2;
        pcpVar.faultClass = i;
        pcpVar.endpoint = 0;
        t8o t8oVar = new t8o();
        t8oVar.environment = this.a.a();
        t8oVar.origin = this.f;
        t8oVar.faultInfo = pcpVar;
        d(t8oVar);
    }

    public final void d(t8o t8oVar) {
        if (ydz.a.a()) {
            this.d.adapter(t8o.class).toJson(t8oVar);
            ydz.a();
        }
        ProtoRequestBody protoRequestBody = new ProtoRequestBody(this.c.a(t8o.class), t8oVar);
        jwu jwuVar = new jwu();
        jwuVar.o(Constants.SCHEME);
        jwuVar.h(((gsu) this.g.b).a());
        jwuVar.c("report", false);
        t4j0 t4j0Var = new t4j0();
        t4j0Var.a = jwuVar.e();
        t4j0Var.c.a(ExtFunctionsKt.HEADER_USER_AGENT, this.e);
        t4j0Var.e("POST", protoRequestBody);
        this.b.newCall(new d5j0(t4j0Var)).I(new r400(4));
    }
}
