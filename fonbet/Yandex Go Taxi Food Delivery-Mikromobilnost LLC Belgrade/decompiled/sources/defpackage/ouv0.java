package defpackage;

import com.yandex.go.superapp.discovery.map.impl.domain.interactors.c;
import com.yandex.mapkit.map.Map;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes14.dex */
public final /* synthetic */ class ouv0 implements Map.CameraCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ c b;

    public /* synthetic */ ouv0(c cVar, int i) {
        this.a = i;
        this.b = cVar;
    }

    @Override // com.yandex.mapkit.map.Map.CameraCallback
    public final void onMoveFinished(boolean z) {
        int i = this.a;
        c cVar = this.b;
        switch (i) {
            case 0:
                qvv qvvVar = cVar.j;
                uc4 c = vj91.c(((gh00) cVar.b).e.a());
                r0 r0Var = qvvVar.a;
                r0Var.getClass();
                r0Var.m(null, c);
                break;
            case 1:
                qvv qvvVar2 = cVar.j;
                uc4 c2 = vj91.c(((gh00) cVar.b).e.a());
                r0 r0Var2 = qvvVar2.a;
                r0Var2.getClass();
                r0Var2.m(null, c2);
                break;
            default:
                qvv qvvVar3 = cVar.j;
                uc4 c3 = vj91.c(((gh00) cVar.b).e.a());
                r0 r0Var3 = qvvVar3.a;
                r0Var3.getClass();
                r0Var3.m(null, c3);
                break;
        }
    }
}
