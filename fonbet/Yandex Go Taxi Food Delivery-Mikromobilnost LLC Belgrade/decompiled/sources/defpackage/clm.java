package defpackage;

import com.yandex.go.navigator.driving.DrivingModeNotification;
import com.yandex.go.navigator.driving.w;
import kotlin.coroutines.Continuation;

/* loaded from: classes12.dex */
public final class clm implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ w b;

    public /* synthetic */ clm(w wVar, int i) {
        this.a = i;
        this.b = wVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        w wVar = this.b;
        switch (i) {
            case 0:
                wVar.h.l((DrivingModeNotification) obj);
                break;
            case 1:
                wVar.h.l((DrivingModeNotification) obj);
                break;
            default:
                wVar.h.l((DrivingModeNotification) obj);
                break;
        }
        return zy11Var;
    }
}
