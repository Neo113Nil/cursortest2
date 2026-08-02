package defpackage;

import com.yandex.mapkit.map.CameraPosition;
import com.yandex.mapkit.map.CameraUpdateReason;
import java.util.Iterator;
import java.util.Map;
import ru.yandex.taxi.map.c;
import ru.yandex.taxi.scooters.presentation.arbitrary_destination.selection.overlay.a;

/* loaded from: classes14.dex */
public final /* synthetic */ class eym0 implements hr7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ eym0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.hr7
    public void h(CameraPosition cameraPosition, CameraUpdateReason cameraUpdateReason, boolean z) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                f4c0 f4c0Var = ((a) obj).C;
                if (f4c0Var != null) {
                    f4c0Var.i(cameraPosition.getZoom() > 14.0f);
                    break;
                }
                break;
            case 1:
                Iterator it = ((i4p0) obj).x.entrySet().iterator();
                while (it.hasNext()) {
                    ((c) ((j741) ((Map.Entry) it.next()).getValue())).b(cameraPosition.getZoom() > 14.0f);
                }
                break;
            case 2:
                x4p0 x4p0Var = (x4p0) obj;
                ((c) ((j741) x4p0Var.y.getValue())).b(cameraPosition.getZoom() > 14.0f);
                ((c) ((j741) x4p0Var.z.getValue())).b(cameraPosition.getZoom() > 14.0f);
                break;
            case 3:
                fp21 fp21Var = (fp21) obj;
                ((c) fp21Var.b).c(cameraPosition.getZoom() > fp21Var.c.d().c());
                break;
            default:
                j741 j741Var = ((g641) obj).y;
                boolean z2 = cameraPosition.getZoom() > 10.0f;
                c cVar = (c) j741Var;
                w4e0 w4e0Var = cVar.e;
                if (w4e0Var != null) {
                    w4e0Var.i(z2);
                }
                cVar.b(cameraPosition.getZoom() > 14.0f);
                break;
        }
    }
}
