package xsna;

import com.vk.core.performance.device.DevicePerformanceInfo;
import com.vk.toggle.internal.ToggleManager;
import kotlin.NoWhenBranchMatchedException;
import xsna.k240;
import xsna.nb3;
import xsna.s240;
import xsna.t240;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class cb3 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ cb3(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        ToggleManager.DevicePerformanceClass a;
        switch (this.b) {
            case 0:
                ToggleManager.DevicePerformanceMetric devicePerformanceMetric = (ToggleManager.DevicePerformanceMetric) obj;
                DevicePerformanceInfo a2 = DevicePerformanceInfo.a.a();
                if (a2 != null) {
                    int i = nb3.d.$EnumSwitchMapping$1[devicePerformanceMetric.ordinal()];
                    if (i == 1) {
                        a = nb3.a(a2.a);
                    } else if (i == 2) {
                        a = nb3.a(a2.b);
                    } else if (i == 3) {
                        a = nb3.a(a2.c);
                    } else {
                        if (i != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        a = nb3.a(a2.d);
                    }
                    if (a != null) {
                        return a;
                    }
                }
                return ToggleManager.DevicePerformanceClass.UNKNOWN;
            case 1:
                s240.a aVar = (s240.a) obj;
                t240.a a3 = aVar.a();
                return a3 instanceof t240.a.b ? new k240.b(aVar.b(), ((t240.a.b) a3).a()) : a3 instanceof t240.a.C3713a ? new k240.a(aVar.b()) : k240.c.a;
            default:
                return obj;
        }
    }
}
