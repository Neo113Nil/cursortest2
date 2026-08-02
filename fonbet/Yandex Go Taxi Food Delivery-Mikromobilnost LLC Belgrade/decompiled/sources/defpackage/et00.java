package defpackage;

import com.yandex.mapkit.map.LayerIds;
import com.yandex.mapkit.map.Map;
import com.yandex.mapkit.map.SublayerFeatureType;
import com.yandex.mapkit.map.SublayerManager;
import ru.yandex.taxi.map_common.map.k;

/* loaded from: classes6.dex */
public final class et00 {
    public final ah00 a;

    public et00(ah00 ah00Var) {
        this.a = ah00Var;
    }

    public final SublayerManager a() {
        Map map = ((gh00) this.a).b;
        if (map != null) {
            return map.getSublayerManager();
        }
        return null;
    }

    public final void b() {
        SublayerManager a;
        Integer findFirstOf;
        Integer findFirstOf2;
        String buildingsLayerId = !el00.a ? null : LayerIds.getBuildingsLayerId();
        if (buildingsLayerId == null || (a = a()) == null || (findFirstOf = a.findFirstOf("blocked_zones", SublayerFeatureType.GROUND)) == null) {
            return;
        }
        int intValue = findFirstOf.intValue();
        SublayerManager a2 = a();
        if (a2 == null || (findFirstOf2 = a2.findFirstOf(buildingsLayerId)) == null) {
            return;
        }
        int intValue2 = findFirstOf2.intValue();
        SublayerManager a3 = a();
        if (a3 != null) {
            a3.moveAfter(intValue, intValue2);
        }
    }

    public final void c() {
        SublayerManager a;
        Integer findFirstOf;
        Integer findFirstOf2;
        String s = k.s();
        if (s == null || (a = a()) == null || (findFirstOf = a.findFirstOf(s, SublayerFeatureType.GROUND)) == null) {
            return;
        }
        int intValue = findFirstOf.intValue();
        SublayerManager a2 = a();
        if (a2 == null || (findFirstOf2 = a2.findFirstOf(s, SublayerFeatureType.PLACEMARKS_AND_LABELS)) == null) {
            return;
        }
        int intValue2 = findFirstOf2.intValue();
        SublayerManager a3 = a();
        if (a3 != null) {
            a3.moveBefore(intValue, intValue2);
        }
    }

    public final void d() {
        SublayerManager a;
        Integer findFirstOf;
        Integer findFirstOf2;
        String s = k.s();
        if (s == null) {
            return;
        }
        String buildingsLayerId = !el00.a ? null : LayerIds.getBuildingsLayerId();
        if (buildingsLayerId == null || (a = a()) == null || (findFirstOf = a.findFirstOf(s, SublayerFeatureType.GROUND)) == null) {
            return;
        }
        int intValue = findFirstOf.intValue();
        SublayerManager a2 = a();
        if (a2 == null || (findFirstOf2 = a2.findFirstOf(buildingsLayerId)) == null) {
            return;
        }
        int intValue2 = findFirstOf2.intValue();
        SublayerManager a3 = a();
        if (a3 != null) {
            a3.moveAfter(intValue, intValue2);
        }
    }

    public final void e() {
        SublayerManager a;
        Integer findFirstOf;
        Integer findFirstOf2;
        String s = k.s();
        if (s == null) {
            return;
        }
        String buildingsLayerId = !el00.a ? null : LayerIds.getBuildingsLayerId();
        if (buildingsLayerId == null || (a = a()) == null || (findFirstOf = a.findFirstOf(s, SublayerFeatureType.GROUND)) == null) {
            return;
        }
        int intValue = findFirstOf.intValue();
        SublayerManager a2 = a();
        if (a2 == null || (findFirstOf2 = a2.findFirstOf(buildingsLayerId)) == null) {
            return;
        }
        int intValue2 = findFirstOf2.intValue();
        SublayerManager a3 = a();
        if (a3 != null) {
            a3.moveBefore(intValue, intValue2);
        }
    }
}
