package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.yandex.go.navigator.alt_select.new_summary.a;
import com.yandex.go.navigator.permission.NavigatorPermissionRequestRouter$ExitListener$State;
import com.yandex.mapkit.directions.carparks.CarparksLayer;
import com.yandex.mapkit.road_events.EventTag;
import com.yandex.mapkit.road_events_layer.RoadEventsLayer;
import com.yandex.xplat.common.JSONItemKind;
import com.yandex.xplat.common.JSONParsingError;
import defpackage.pi50;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.rt.ebs.cryptosdk.core.common.entities.models.IEbsCryptoSdkConfig;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.masstransit.datasource.routing.MtTransportType;

/* loaded from: classes12.dex */
public final /* synthetic */ class ej40 implements tls {
    public final /* synthetic */ int a;

    public /* synthetic */ ej40(int i) {
        this.a = i;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                MtTransportType.Companion.getClass();
                return ij40.a((String) obj);
            case 1:
                return Boolean.valueOf(((MtTransportType) obj) != MtTransportType.UNKNOWN);
            case 2:
                return ((n940) obj).b;
            case 3:
                cc90 cc90Var = (cc90) obj;
                StringBuilder sb = new StringBuilder("[");
                sb.append(cc90Var.b);
                sb.append(Extension.FIX_SPACE);
                return oyr.s(sb, cc90Var.c, ')');
            case 4:
                return new ListItemComponent(((ViewGroup) obj).getContext(), null, 0, 6, null);
            case 5:
                ca1 ca1Var = new ca1((ListItemComponent) obj, 20);
                nzs.s((ListItemComponent) ((View) ca1Var.R), -1, -2);
                return ca1Var;
            case 6:
                return new ListItemComponent(((ViewGroup) obj).getContext(), null, 0, 6, null);
            case 7:
                y9d.a.getClass();
                u6y.b((u6y) obj, null, y9d.b, 3);
                return zy11Var;
            case 8:
                ((Integer) obj).getClass();
                return zy11Var;
            case 9:
                Map.Entry entry = (Map.Entry) obj;
                Object value = entry.getValue();
                return unr0.r(new StringBuilder("  "), ((kme0) entry.getKey()).a, " = ", value instanceof byte[] ? j73.K((byte[]) value, Extension.FIX_SPACE, null, 56) : String.valueOf(entry.getValue()));
            case 10:
                return Boolean.valueOf(((azt0) obj).w());
            case 11:
                x9v0 x9v0Var = (x9v0) obj;
                if (x9v0Var.D == null && x9v0Var.C == null) {
                    r2 = false;
                }
                return Boolean.valueOf(r2);
            case 12:
                ((CarparksLayer) obj).setVisible(false);
                return zy11Var;
            case 13:
                ((ce50) obj).I0(NavigatorPermissionRequestRouter$ExitListener$State.GRANTED);
                return zy11Var;
            case 14:
                ((ce50) obj).I0(NavigatorPermissionRequestRouter$ExitListener$State.GRANTED);
                return zy11Var;
            case 15:
                ((ce50) obj).I0(NavigatorPermissionRequestRouter$ExitListener$State.DENIED);
                return zy11Var;
            case 16:
                RoadEventsLayer roadEventsLayer = (RoadEventsLayer) obj;
                for (EventTag eventTag : EventTag.values()) {
                    roadEventsLayer.setRoadEventVisible(eventTag, false);
                }
                return zy11Var;
            case 17:
                ((pf50) obj).V();
                return zy11Var;
            case 18:
                ((rf50) obj).a.r(new ej40(17));
                return zy11Var;
            case 19:
                ((cg50) obj).J0();
                return zy11Var;
            case 20:
                ((gg50) obj).o1();
                return zy11Var;
            case 21:
                a aVar = ((gg50) obj).a;
                aVar.N.a();
                lg50 lg50Var = aVar.G;
                lg50Var.d = null;
                lg50Var.e = false;
                aVar.r(new ej40(19));
                return zy11Var;
            case 22:
                a aVar2 = ((gg50) obj).a;
                aVar2.B((m950) aVar2.E.get(), new qf50(vf50.a, !aVar2.H.a()), new ilm(aVar2, 2), new n1j0(aVar2.Q()));
                return zy11Var;
            case 23:
                ((gg50) obj).o1();
                return zy11Var;
            case 24:
                ((gg50) obj).o1();
                return zy11Var;
            case 25:
                return zy11Var;
            case 26:
                return Boolean.valueOf(((pi50.a) obj).b);
            case 27:
                IEbsCryptoSdkConfig iEbsCryptoSdkConfig = (IEbsCryptoSdkConfig) obj;
                return b.i(new Pair(k4w.b, hhb1.d(iEbsCryptoSdkConfig.getKpmApiUri().toString())), new Pair(k4w.a, hhb1.d(iEbsCryptoSdkConfig.getInstructionsApiUri().toString())), new Pair(d70.d, ""), new Pair(d70.c, ""), new Pair(d70.e, ""));
            case 28:
                wj00 b = ((y3x) obj).b();
                y3x y3xVar = (y3x) b.b.get("binding");
                Map map = (y3xVar == null || y3xVar.a != JSONItemKind.map) ? null : ((wj00) y3xVar).b;
                JSONParsingError jSONParsingError = new JSONParsingError(unr0.p("Failed to query MapJSONItem for key \"binding\" of kind \"", mbb1.c(JSONItemKind.map), "\", json: \"", mbb1.a(b), "\""), null);
                if (map == null) {
                    throw jSONParsingError;
                }
                y3x y3xVar2 = (y3x) map.get("id");
                if (y3xVar2 != null) {
                    return new n560(y3xVar2.c().b);
                }
                throw new JSONParsingError(unr0.p("Failed to query MapJSONItem for key \"id\" of kind \"", mbb1.c(JSONItemKind.string), "\", json: \"", mbb1.a(b), "\""), null);
            default:
                oll0 oll0Var = (oll0) obj;
                ull0 T0 = oll0Var.T0("DELETE FROM no_phone_namespaces");
                try {
                    T0.q();
                    int x = jx81.x(oll0Var);
                    T0.close();
                    return Integer.valueOf(x);
                } catch (Throwable th) {
                    T0.close();
                    throw th;
                }
        }
    }
}
