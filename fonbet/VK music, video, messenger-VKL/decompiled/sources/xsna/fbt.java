package xsna;

import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.external.miniapp.net.app.WebImageSize;
import com.vk.games.model.GamesHeaderSectionInfo;
import com.vk.games.model.SectionIdType;
import com.vk.games.model.a;
import com.vk.games.presentation.catalog.model.GamesDetailCatalogHeaderType;
import com.vk.games.presentation.catalog.model.items.GameCatalogBadge;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.builders.ListBuilder;
import xsna.ebt;
import xsna.sbt;

/* compiled from: GamesCatalogDetailSectionData.kt */
/* loaded from: classes17.dex */
public final class fbt {
    public static final ListBuilder a(List list, GamesHeaderSectionInfo gamesHeaderSectionInfo) {
        GamesHeaderSectionInfo gamesHeaderSectionInfo2 = gamesHeaderSectionInfo;
        ListBuilder e = e43.e();
        Iterator it = list.iterator();
        boolean z = true;
        boolean z2 = true;
        boolean z3 = false;
        while (it.hasNext()) {
            com.vk.games.model.a aVar = (com.vk.games.model.a) it.next();
            if (aVar instanceof a.C1079a) {
                s90 b = t90.b(((a.C1079a) aVar).a, new String());
                if (b != null) {
                    e.add(new ebt.a(b));
                }
            } else if (aVar instanceof a.c) {
                if (z && z3) {
                    e.add(new ebt.e(GamesDetailCatalogHeaderType.OLD));
                }
                e.add(new ebt.i(s7t.a(((a.c) aVar).a), z && z3));
                z = false;
            } else if (aVar instanceof a.e) {
                if (z2) {
                    e.add(new ebt.e(GamesDetailCatalogHeaderType.NEW));
                    z3 = true;
                }
                e.add(new ebt.h(s7t.a(((a.e) aVar).a), z2));
                z2 = false;
            } else if (aVar instanceof a.b) {
                GamesHeaderSectionInfo.Section section = gamesHeaderSectionInfo2 instanceof GamesHeaderSectionInfo.Section ? (GamesHeaderSectionInfo.Section) gamesHeaderSectionInfo2 : null;
                if (epx.f(section != null ? section.c : null, SectionIdType.Installed.c)) {
                    ArrayList<sbt> arrayList = ((a.b) aVar).a;
                    ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                    for (sbt sbtVar : arrayList) {
                        WebApiApplication webApiApplication = sbtVar.a;
                        long j = webApiApplication.b;
                        String str = sbtVar.c;
                        String str2 = sbtVar.d;
                        uet uetVar = new uet(j, str, str2);
                        String str3 = webApiApplication.c;
                        String str4 = sbtVar.g;
                        if (str4 == null && (str4 = webApiApplication.l) == null) {
                            str4 = "";
                        }
                        arrayList2.add(new ebt.f(new ko50(sbtVar, uetVar, str3, str4, str2)));
                    }
                    e.addAll(arrayList2);
                } else {
                    ArrayList<sbt> arrayList3 = ((a.b) aVar).a;
                    ArrayList arrayList4 = new ArrayList(c5g.u(arrayList3, 10));
                    for (sbt sbtVar2 : arrayList3) {
                        WebApiApplication webApiApplication2 = sbtVar2.a;
                        String str5 = webApiApplication2.c;
                        String str6 = sbtVar2.g;
                        GameCatalogBadge a = n6t.a(webApiApplication2);
                        WebImageSize d = sbtVar2.a.d.b.d();
                        String valueOf = String.valueOf(d != null ? d.b : null);
                        sbt.a aVar2 = sbtVar2.f;
                        arrayList4.add(new h8t(sbtVar2, str5, str6, a, valueOf, aVar2 != null ? g8t.a(aVar2) : null, epx.f(sbtVar2.h, Boolean.TRUE)));
                    }
                    e.add(new ebt.d(new qka(arrayList4)));
                }
            } else {
                if (!epx.f(aVar, a.d.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                e.add(ebt.k.a);
            }
            gamesHeaderSectionInfo2 = gamesHeaderSectionInfo;
        }
        return e.g();
    }
}
