package defpackage;

import com.yandex.go.navigator.domain.FocusMode;
import com.yandex.mapkit.navigation.guidance_camera.CameraMode;
import kotlin.coroutines.Continuation;

/* loaded from: classes12.dex */
public final class cd50 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ dd50 b;

    public /* synthetic */ cd50(dd50 dd50Var, int i) {
        this.a = i;
        this.b = dd50Var;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        dd50 dd50Var = this.b;
        switch (i) {
            case 0:
                ((Number) obj).longValue();
                ((gh00) dd50Var.I).I(true);
                break;
            case 1:
                if (((FocusMode) obj) == FocusMode.FREE && !dd50Var.E.a() && !dd50Var.L.a()) {
                    ((yc50) dd50Var.Dg()).V0(CameraMode.OVERVIEW);
                    break;
                } else {
                    ((yc50) dd50Var.Dg()).V0(CameraMode.FREE);
                    break;
                }
            default:
                y290 y290Var = (y290) obj;
                ((yc50) dd50Var.Dg()).selectRoadEvent(y290Var != null ? y290Var.a : null);
                break;
        }
        return zy11Var;
    }
}
