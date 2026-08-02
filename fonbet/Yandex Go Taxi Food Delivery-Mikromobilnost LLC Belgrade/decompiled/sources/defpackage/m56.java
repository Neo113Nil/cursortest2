package defpackage;

import com.yandex.mapkit.map.LayerIds;
import com.yandex.mapkit.map.SublayerFeatureType;
import com.yandex.mapkit.map.SublayerManager;
import java.util.List;
import ru.yandex.taxi.map.overlay.b;

/* loaded from: classes6.dex */
public final class m56 implements l56 {
    public final b a;

    public m56(b bVar) {
        this.a = bVar;
    }

    @Override // defpackage.l56
    public final void clearBlockedZones() {
        this.a.Jg();
    }

    @Override // defpackage.l56
    public final void hideBlockedZones() {
        SublayerManager a;
        Integer findFirstOf;
        Integer findFirstOf2;
        b bVar = this.a;
        et00 et00Var = bVar.x;
        et00Var.getClass();
        String buildingsLayerId = !el00.a ? null : LayerIds.getBuildingsLayerId();
        if (buildingsLayerId != null && (a = et00Var.a()) != null && (findFirstOf = a.findFirstOf("blocked_zones", SublayerFeatureType.GROUND)) != null) {
            int intValue = findFirstOf.intValue();
            SublayerManager a2 = et00Var.a();
            if (a2 != null && (findFirstOf2 = a2.findFirstOf(buildingsLayerId)) != null) {
                int intValue2 = findFirstOf2.intValue();
                SublayerManager a3 = et00Var.a();
                if (a3 != null) {
                    a3.moveBefore(intValue, intValue2);
                }
            }
        }
        bVar.z.i(false);
    }

    @Override // defpackage.l56
    public final void showBlockedZones() {
        b bVar = this.a;
        bVar.x.b();
        bVar.z.i(true);
    }

    @Override // defpackage.l56
    public final void updateBlockedZones(List list) {
        this.a.Mg(list);
    }
}
