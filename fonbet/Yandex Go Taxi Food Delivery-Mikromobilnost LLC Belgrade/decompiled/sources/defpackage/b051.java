package defpackage;

import com.yandex.messaging.core.net.entities.proto.CommonRequestFields;
import com.yandex.messaging.core.net.entities.proto.WhoamiRequest;
import com.yandex.messaging.core.net.entities.proto.WhoamiResponse;

/* loaded from: classes15.dex */
public final class b051 extends d051 {
    public final /* synthetic */ String a;
    public final /* synthetic */ c051 b;
    public final /* synthetic */ si3 c;
    public final /* synthetic */ si3 w;

    public b051(String str, c051 c051Var, si3 si3Var, si3 si3Var2) {
        this.a = str;
        this.b = c051Var;
        this.c = si3Var;
        this.w = si3Var2;
    }

    @Override // defpackage.d051
    public final boolean b(WhoamiResponse whoamiResponse) {
        this.w.invoke(whoamiResponse);
        return true;
    }

    @Override // defpackage.o5t0
    public final Object c(int i, int i2) {
        WhoamiRequest whoamiRequest = new WhoamiRequest(this.a, null, 2, null);
        whoamiRequest.setCommonFields(new CommonRequestFields(i2 > 0, i));
        return whoamiRequest;
    }

    @Override // defpackage.d051
    public final void f(WhoamiResponse whoamiResponse) {
        this.b.c = null;
        this.c.invoke(whoamiResponse);
    }
}
