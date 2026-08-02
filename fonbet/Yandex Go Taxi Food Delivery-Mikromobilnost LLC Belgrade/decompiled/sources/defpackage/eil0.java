package defpackage;

import io.appmetrica.analytics.RtmErrorEvent;
import java.util.Map;

/* loaded from: classes15.dex */
public final class eil0 {
    public final x22 a;

    public eil0(x22 x22Var) {
        this.a = x22Var;
    }

    public final void a(String str, Map map) {
        RtmErrorEvent.ErrorLevel errorLevel = RtmErrorEvent.ErrorLevel.ERROR;
        x22 x22Var = this.a;
        x22Var.j(str, errorLevel, map);
        if (map == null) {
            x22Var.reportEvent(str);
        } else {
            x22Var.reportEvent(str, map);
        }
    }

    public final void b(String str, Map map) {
        RtmErrorEvent.ErrorLevel errorLevel = RtmErrorEvent.ErrorLevel.INFO;
        x22 x22Var = this.a;
        x22Var.j(str, errorLevel, map);
        x22Var.reportEvent(str, map);
    }
}
