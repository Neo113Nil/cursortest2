package defpackage;

import kotlin.collections.builders.MapBuilder;
import ru.yandex.taxi.logistics.sdk.tracking.impl.data.models.ActionPosition;
import ru.yandex.taxi.logistics.sdk.tracking.impl.domain.l;

/* loaded from: classes5.dex */
public final class ptb {
    public final kcz0 a;
    public final j00 b;
    public final l c;

    public ptb(kcz0 kcz0Var, j00 j00Var, l lVar) {
        this.a = kcz0Var;
        this.b = j00Var;
        this.c = lVar;
    }

    public static MapBuilder a(String str, ActionPosition actionPosition, String str2) {
        MapBuilder mapBuilder = new MapBuilder();
        if (str != null) {
            mapBuilder.put("button_name", str);
        }
        if (actionPosition != null) {
            mapBuilder.put("button_position", actionPosition.toString());
        }
        if (str2 != null) {
            mapBuilder.put("button_icon_tag", str2);
        }
        return mapBuilder.j();
    }

    public static void b(ptb ptbVar, String str) {
        ptbVar.getClass();
        if (str != null) {
            ptbVar.a.x(str.concat(".Shown"), a(null, null, null));
        }
    }
}
