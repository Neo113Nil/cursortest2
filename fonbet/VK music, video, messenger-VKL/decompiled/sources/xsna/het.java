package xsna;

import com.vk.api.generated.apps.dto.AppsAppDto;
import com.vk.api.generated.apps.dto.AppsFriendsStackDto;
import com.vk.api.generated.apps.dto.AppsMiniappsCatalogGameDto;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.games.model.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: GamesCatalogSectionMapper.kt */
/* loaded from: classes17.dex */
public final class het {
    public final bat a;
    public final bct b;
    public final dat c;
    public final wet d;
    public final fdt e;
    public final l8t f;

    public het(bat batVar, bct bctVar, dat datVar, wet wetVar, fdt fdtVar, l8t l8tVar) {
        this.a = batVar;
        this.b = bctVar;
        this.c = datVar;
        this.d = wetVar;
        this.e = fdtVar;
        this.f = l8tVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [xsna.sbt] */
    public static ArrayList a(het hetVar, List list) {
        AppsFriendsStackDto e;
        String str = new String();
        hetVar.getClass();
        ArrayList U0 = j5g.U0(list, 4, 4, true);
        ArrayList arrayList = new ArrayList(c5g.u(U0, 10));
        Iterator it = U0.iterator();
        while (it.hasNext()) {
            List<AppsAppDto> list2 = (List) it.next();
            dat datVar = hetVar.c;
            datVar.getClass();
            ArrayList arrayList2 = new ArrayList();
            for (AppsAppDto appsAppDto : list2) {
                cct cctVar = datVar.b.a;
                WebApiApplication d = cctVar.d(appsAppDto.getId());
                if (d != null) {
                    AppsMiniappsCatalogGameDto appsMiniappsCatalogGameDto = (AppsMiniappsCatalogGameDto) cctVar.c.get(Long.valueOf(appsAppDto.getId()));
                    r3 = new sbt(d, appsAppDto.n1(), appsMiniappsCatalogGameDto != null ? appsMiniappsCatalogGameDto.i() : null, str, appsMiniappsCatalogGameDto != null ? appsMiniappsCatalogGameDto.f() : null, (appsMiniappsCatalogGameDto == null || (e = appsMiniappsCatalogGameDto.e()) == null) ? null : z9t.a(e), appsMiniappsCatalogGameDto != null ? appsMiniappsCatalogGameDto.g() : null, null, 128);
                }
                if (r3 != null) {
                    arrayList2.add(r3);
                }
            }
            arrayList.add(new a.b(arrayList2));
        }
        return arrayList;
    }
}
