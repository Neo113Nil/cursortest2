package defpackage;

import java.util.Map;
import kotlin.Pair;
import kotlin.collections.b;
import kotlin.collections.builders.MapBuilder;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes12.dex */
public abstract class cj3 extends keo {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public cj3(j6p j6pVar, String str, String str2) {
        super(str, b.i(new Pair(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, str2), new Pair("url", j6pVar.a), new Pair("target_path", j6pVar.h), new Pair("timeout", String.valueOf(j6pVar.n))));
        if (str2 == null) {
            str2 = "ft_request_action: методом " + j6pVar.g + " в ручку " + g8e.p(evu0.n0(j6pVar.a, '/'), "/", evu0.p0(j6pVar.h, '/')) + " с ttl " + j6pVar.n;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public cj3(int i, String str, String str2, Map map, boolean z) {
        super(str2, r1.j());
        switch (i) {
            case 5:
                MapBuilder mapBuilder = new MapBuilder();
                mapBuilder.put(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, str);
                mapBuilder.putAll(map);
                super(str2, mapBuilder.j());
                break;
            default:
                MapBuilder mapBuilder2 = new MapBuilder();
                mapBuilder2.put(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, str);
                mapBuilder2.putAll(map);
                break;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public cj3(int i, String str, String str2, Map map) {
        super(str, r2.j());
        str2 = (i & 2) != 0 ? "Получение фичефлагов" : str2;
        map = (i & 4) != 0 ? b.f() : map;
        MapBuilder mapBuilder = new MapBuilder();
        mapBuilder.put(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, str2);
        mapBuilder.putAll(map);
    }
}
