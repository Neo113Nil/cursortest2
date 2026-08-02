package xsna;

import com.vk.superapp.base.js.bridge.Responses$ClientError;
import com.vk.superapp.base.js.bridge.Responses$ReasonUserDenied;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;
import xsna.g7g0;
import xsna.ypt;

/* compiled from: GetAuthTokenDelegate.kt */
/* loaded from: classes6.dex */
public final class zpt implements l1w0 {
    public final /* synthetic */ qpj a;
    public final /* synthetic */ ypt.a b;
    public final /* synthetic */ ypt c;

    public zpt(qpj qpjVar, ypt.a aVar, ypt yptVar) {
        this.a = qpjVar;
        this.b = aVar;
        this.c = yptVar;
    }

    @Override // xsna.l1w0
    public final void a(Throwable th) {
        ypt.b(this.c.e, fco0.h(this.b.b, th));
    }

    @Override // xsna.l1w0
    public final void b() {
        ypt.b(this.c.e, new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_USER_DENIED, null, null, null, null, new Responses$ReasonUserDenied(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, null, 131038, null), this.b.b, 1, null));
    }

    @Override // xsna.l1w0
    public final void c(List<String> list) {
        ypt.a aVar = this.b;
        g7g0.a aVar2 = aVar.a;
        this.a.invoke(new ypt.a(new g7g0.a(aVar2.a, p4g.k(list, StringUtils.COMMA, null), aVar2.c, aVar2.d, true, aVar2.f), aVar.b));
    }
}
