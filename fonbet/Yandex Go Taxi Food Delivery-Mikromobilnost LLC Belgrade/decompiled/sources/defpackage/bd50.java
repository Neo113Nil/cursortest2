package defpackage;

import com.yandex.mapkit.directions.driving.DrivingRoute;
import com.yandex.mapkit.navigation.automotive.Navigation;
import kotlin.coroutines.Continuation;

/* loaded from: classes12.dex */
public final class bd50 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ yc50 b;

    public /* synthetic */ bd50(yc50 yc50Var, int i) {
        this.a = i;
        this.b = yc50Var;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        yc50 yc50Var = this.b;
        switch (i) {
            case 0:
                yc50Var.q6(((Boolean) obj).booleanValue());
                break;
            case 1:
                yc50Var.ga((Navigation) obj);
                break;
            default:
                yc50Var.v1((DrivingRoute) obj);
                break;
        }
        return zy11Var;
    }
}
