package defpackage;

import com.yandex.messaging.core.net.entities.proto.WhoamiResponse;

/* loaded from: classes15.dex */
public abstract class d051 implements o5t0 {
    public boolean b(WhoamiResponse whoamiResponse) {
        return false;
    }

    @Override // defpackage.o5t0
    public final Class e() {
        return WhoamiResponse.class;
    }

    public void f(WhoamiResponse whoamiResponse) {
    }

    @Override // defpackage.o5t0
    public final String k() {
        return "whoami";
    }

    @Override // defpackage.o5t0
    public final int n(Object obj) {
        WhoamiResponse whoamiResponse = (WhoamiResponse) obj;
        if (whoamiResponse.getStatus() != 0) {
            return !b(whoamiResponse) ? 1 : 0;
        }
        f(whoamiResponse);
        return 0;
    }
}
