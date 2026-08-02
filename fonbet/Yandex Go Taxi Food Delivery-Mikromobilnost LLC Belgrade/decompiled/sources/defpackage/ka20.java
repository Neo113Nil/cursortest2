package defpackage;

import io.appmetrica.analytics.IReporterYandex;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public final class ka20 implements pcj {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ ka20(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.pcj
    public final void reportDiagnosticEvent(String str, Map map) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((IReporterYandex) obj).reportDiagnosticEvent(str, (Map<String, Object>) map);
                break;
            default:
                Iterator it = ((List) ((asd) obj).d.getValue()).iterator();
                while (it.hasNext()) {
                    ((pcj) it.next()).reportDiagnosticEvent(str, map);
                }
                break;
        }
    }
}
