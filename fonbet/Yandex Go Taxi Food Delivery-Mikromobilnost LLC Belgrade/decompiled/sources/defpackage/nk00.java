package defpackage;

import com.yandex.go.navigation.screen.api.Screen;
import com.yandex.go.navigation.screen.c;
import com.yandex.runtime.recording.EventListener;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.collections.builders.MapBuilder;
import ru.yandex.taxi.analytics.i;
import ru.yandex.taxi.analytics.j;

/* loaded from: classes9.dex */
public final class nk00 implements EventListener {
    public final /* synthetic */ ok00 a;

    public nk00(ok00 ok00Var) {
        this.a = ok00Var;
    }

    @Override // com.yandex.runtime.recording.EventListener
    public final void onEvent(String str, Map map) {
        MapBuilder mapBuilder = new MapBuilder();
        mapBuilder.putAll(map);
        ok00 ok00Var = this.a;
        c cVar = ok00Var.a;
        oc50 oc50Var = ok00Var.b;
        if (mk00.a[cVar.b().ordinal()] == 1) {
            mapBuilder.put("active_screen", "navigator");
        } else {
            mapBuilder.put("active_screen", "unknown");
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (((Boolean) oc50Var.b.getValue()).booleanValue()) {
            linkedHashSet.add("navigator");
        }
        if (!linkedHashSet.isEmpty()) {
            mapBuilder.put("active_verticals", linkedHashSet);
        }
        mapBuilder.put("is_navigator_active", oc50Var.b.getValue());
        MapBuilder j = mapBuilder.j();
        if (cVar.b() == Screen.NAVIGATOR || ((Boolean) oc50Var.b.getValue()).booleanValue()) {
            str = g8e.o("navigator.", str);
        }
        i d = ((j) ok00Var.c).d(str);
        d.h(j);
        d.m();
    }

    @Override // com.yandex.runtime.recording.EventListener
    public final void onFlush(boolean z) {
    }
}
