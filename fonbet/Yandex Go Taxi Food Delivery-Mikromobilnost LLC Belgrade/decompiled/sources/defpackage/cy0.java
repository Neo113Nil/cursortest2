package defpackage;

import com.yandex.go.preorder.map.CameraAnimationFinishType;
import com.yandex.mapkit.map.Map;
import com.yandex.mapkit.map.VisibleRegionUtils;
import ru.yandex.taxi.layers.presentation.optimalview.c;
import ru.yandex.taxi.preorder.CameraAnimationUpdateType;

/* loaded from: classes5.dex */
public final /* synthetic */ class cy0 implements Map.CameraCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ cy0(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // com.yandex.mapkit.map.Map.CameraCallback
    public final void onMoveFinished(boolean z) {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                dy0 dy0Var = (dy0) obj2;
                sls slsVar = (sls) obj;
                if (z) {
                    a3v a3vVar = dy0Var.c;
                    gh00 gh00Var = (gh00) dy0Var.a;
                    if (gh00Var.a.e(a3vVar)) {
                        gh00Var.L(gh00Var.e.b());
                    }
                    slsVar.invoke();
                    break;
                }
                break;
            case 1:
                c cVar = (c) obj2;
                kq00 kq00Var = (kq00) obj;
                if (cVar.J || !cVar.Kg(kq00Var)) {
                    gh00 gh00Var2 = (gh00) cVar.x;
                    gh00Var2.F(VisibleRegionUtils.getBounds(gh00Var2.e.a()));
                    break;
                }
                break;
            default:
                lgt0 lgt0Var = (lgt0) obj2;
                String str = (String) obj;
                if (z) {
                    lgt0Var.f.b(CameraAnimationUpdateType.ANIMATE_TAP_ON_PICKUP_POINT);
                    CameraAnimationFinishType cameraAnimationFinishType = CameraAnimationFinishType.ANIMATE_TAP_ON_PICKUP_POINT;
                    ((yet0) lgt0Var.g.get()).a(cameraAnimationFinishType, false, str);
                    lgt0Var.d.a.g(cameraAnimationFinishType);
                    break;
                }
                break;
        }
    }
}
