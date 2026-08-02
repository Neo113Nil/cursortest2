package defpackage;

import com.yandex.go.benefits_center.benefits.router.d;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.perf.PerformanceAnalytics$Type;
import ru.yandex.taxi.perf.screen.ElementPerformanceState;
import ru.yandex.taxi.perf.screen.c;

/* loaded from: classes6.dex */
public final class kn5 implements i3m {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kn5(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void a() {
    }

    private final void b() {
    }

    @Override // defpackage.i3m
    public final void dispose() {
        int i = this.a;
    }

    @Override // defpackage.i3m
    public final void onRenderingFinished(l1o l1oVar, u1m u1mVar, xzl xzlVar, long j, List list) {
        p6q0 p6q0Var;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                d dVar = (d) obj;
                if (!dVar.b0 && (p6q0Var = (p6q0) xzlVar.a.c.b(qoi0.a(p6q0.class))) != null && !p6q0Var.a.isEmpty()) {
                    ((c) dVar.Z.b).i(new sn5(ElementPerformanceState.LARGEST_CONTENTFUL_PAINT));
                    dVar.b0 = true;
                    break;
                }
                break;
            default:
                xv10 xv10Var = (xv10) obj;
                super.onRenderingFinished(l1oVar, u1mVar, xzlVar, j, list);
                if (xzlVar.a.a instanceof aks0) {
                    q6c0 q6c0Var = (q6c0) xv10Var.w;
                    String path = ((y7c0) xv10Var.b).getPath();
                    String str = (String) xv10Var.c;
                    Long l = (Long) q6c0Var.c;
                    PerformanceAnalytics$Type performanceAnalytics$Type = (PerformanceAnalytics$Type) q6c0Var.w;
                    fva0 fva0Var = (fva0) q6c0Var.b;
                    if (l != null) {
                        long longValue = l.longValue();
                        String concat = "Places.Flex.Skeletons.Processed.".concat(cvu0.v(cvu0.v(cvu0.v(path, "bdui/v1/", "", false), "-", "_", false), "/", "_", false) + Extension.DOT_CHAR + (jl40.l(str, "superapp_discovery_map") ? "supermap" : "other"));
                        fva0Var.e(concat, performanceAnalytics$Type, longValue);
                        fva0.b(fva0Var, concat, performanceAnalytics$Type, null, 4);
                        q6c0Var.c = null;
                        break;
                    }
                }
                break;
        }
    }
}
