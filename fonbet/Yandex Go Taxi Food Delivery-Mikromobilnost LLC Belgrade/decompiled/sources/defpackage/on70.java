package defpackage;

import androidx.compose.ui.platform.m;
import com.yandex.div.state.db.StateEntry;
import defpackage.g131;
import defpackage.v2w;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.Map;
import kotlin.collections.builders.MapBuilder;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;
import kotlinx.serialization.json.d;

/* loaded from: classes11.dex */
public abstract class on70 {
    public static f530 a(f530 f530Var, final float f) {
        return f530Var.k(new n83(f, m.b ? new tls() { // from class: androidx.compose.foundation.layout.AspectRatioKt$aspectRatio$$inlined$debugInspectorInfo$1
            final /* synthetic */ boolean $matchHeightConstraintsFirst$inlined = false;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                v2w v2wVar = (v2w) obj;
                v2wVar.getClass();
                g131 g131Var = v2wVar.a;
                g131Var.b("ratio", Float.valueOf(f));
                g131Var.b("matchHeightConstraintsFirst", Boolean.valueOf(this.$matchHeightConstraintsFirst$inlined));
                return zy11.a;
            }
        } : m.a()));
    }

    public static final lum b(tls tlsVar) {
        return new lum(new gse(11), slg.a, new dv9(24, tlsVar), tlg.a);
    }

    public static final u1m c(bf21 bf21Var) {
        Map map = bf21Var.f;
        b bVar = map != null ? (b) map.get(StateEntry.COLUMN_PATH) : null;
        d dVar = bVar instanceof d ? (d) bVar : null;
        String a = dVar != null ? dVar.a() : null;
        String Q = a != null ? evu0.Q("/", a) : "sdk";
        MapBuilder mapBuilder = new MapBuilder();
        mapBuilder.put("format", bf21Var.a.getValue());
        mapBuilder.put(Constants.KEY_PAGE, bf21Var.b);
        Integer num = bf21Var.c;
        if (num != null) {
            mapBuilder.put("position", num);
        }
        Integer num2 = bf21Var.d;
        if (num2 != null) {
            mapBuilder.put("row", num2);
        }
        Integer num3 = bf21Var.e;
        if (num3 != null) {
            mapBuilder.put("column", num3);
        }
        Map map2 = bf21Var.f;
        c cVar = map2 != null ? new c(map2) : null;
        if (cVar != null) {
            mapBuilder.put("overrides", cVar);
        }
        mapBuilder.put("animateChanges", Boolean.valueOf(bf21Var.g));
        return new u1m(2, Q, mapBuilder.j());
    }

    public static final boolean d(int i, int i2, long j) {
        int k = n8e.k(j);
        if (i > n8e.i(j) || k > i) {
            return false;
        }
        return i2 <= n8e.h(j) && n8e.j(j) <= i2;
    }
}
