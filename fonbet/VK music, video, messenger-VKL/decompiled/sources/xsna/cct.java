package xsna;

import com.vk.api.generated.apps.dto.AppsMiniappsCatalogGameDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.games.model.GamesCatalogScreenTab;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: GamesCatalogInMemoryCache.kt */
/* loaded from: classes17.dex */
public final class cct {
    public final LinkedHashMap a = new LinkedHashMap();
    public final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashMap c = new LinkedHashMap();
    public final ConcurrentHashMap<GamesCatalogScreenTab, ey8> d = new ConcurrentHashMap<>();

    public final void a(ArrayList arrayList) {
        int e = on00.e(c5g.u(arrayList, 10));
        if (e < 16) {
            e = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(e);
        for (Object obj : arrayList) {
            linkedHashMap.put(Long.valueOf(((WebApiApplication) obj).b), obj);
        }
        this.a.putAll(linkedHashMap);
    }

    public final void b(List<AppsMiniappsCatalogGameDto> list) {
        List<AppsMiniappsCatalogGameDto> list2 = list;
        int e = on00.e(c5g.u(list2, 10));
        if (e < 16) {
            e = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(e);
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            linkedHashMap.put(Long.valueOf(((AppsMiniappsCatalogGameDto) r0).getId()), it.next());
        }
        this.c.putAll(linkedHashMap);
    }

    public final void c(List<UsersUserFullDto> list) {
        List<UsersUserFullDto> list2 = list;
        int e = on00.e(c5g.u(list2, 10));
        if (e < 16) {
            e = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(e);
        for (Object obj : list2) {
            linkedHashMap.put(((UsersUserFullDto) obj).s1(), obj);
        }
        this.b.putAll(linkedHashMap);
    }

    public final WebApiApplication d(long j) {
        return (WebApiApplication) this.a.get(Long.valueOf(j));
    }
}
