package xsna;

import com.google.gson.Gson;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventBenchmarkMain;
import com.vk.stat.scheme.SchemeStat$EventCustomMain;
import com.vk.stat.scheme.SchemeStat$EventProductMain;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.stat.scheme.SchemeStat$TypeDevNullItem;
import com.vk.stat.scheme.SchemeStat$TypeNavgo;
import com.vk.stat.scheme.SchemeStat$TypeNetworkCommon;
import com.vk.stat.scheme.SchemeStat$TypeNetworkImagesItem;
import com.vk.stat.scheme.SchemeStat$TypeView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import xsna.m0q;
import xsna.yxp;

/* compiled from: VkEventGenerator.kt */
/* loaded from: classes11.dex */
public final class dru0 implements zyp {
    public final pll a;
    public final yxp<SchemeStat$TypeNetworkCommon> b = new yxp<>();
    public final yxp<SchemeStat$TypeNetworkImagesItem> c = new yxp<>();

    public dru0(pll pllVar) {
        this.a = pllVar;
    }

    @Override // xsna.zyp
    public final qyp a(long j, rrk0 rrk0Var, m0q m0qVar) {
        try {
            try {
                return rrk0Var instanceof gsd0 ? ((gsd0) rrk0Var).b instanceof SchemeStat$TypeNavgo ? d(j, ((gsd0) rrk0Var).a, (SchemeStat$TypeNavgo) ((gsd0) rrk0Var).b, m0qVar) : f(j, (gsd0) rrk0Var, m0qVar) : rrk0Var instanceof qrk0 ? c(j, (qrk0) rrk0Var, m0qVar) : rrk0Var instanceof lrk0 ? b(j, (lrk0) rrk0Var, m0qVar) : new qyp("", new eta0("VK"));
            } catch (Throwable th) {
                th = th;
                th.printStackTrace();
                return new qyp("", new eta0("VK"));
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final qyp b(long j, lrk0 lrk0Var, m0q m0qVar) {
        SchemeStat$EventBenchmarkMain.b bVar = lrk0Var.a;
        if (bVar instanceof SchemeStat$TypeNetworkCommon) {
            return e(j, bVar, m0qVar, this.b);
        }
        if (bVar instanceof SchemeStat$TypeNetworkImagesItem) {
            return e(j, bVar, m0qVar, this.c);
        }
        return new qyp(p9h0.a.toJson(SchemeStat$EventBenchmarkMain.a.a(m0qVar.a(), String.valueOf(1000 * j), bVar)), new eta0("VK"));
    }

    public final qyp c(long j, qrk0 qrk0Var, m0q m0qVar) {
        SchemeStat$EventCustomMain schemeStat$EventCustomMain;
        SchemeStat$TypeDevNullItem a = SchemeStat$TypeDevNullItem.a(qrk0Var.a, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 3);
        long j2 = 1000 * j;
        pll pllVar = this.a;
        if (pllVar == null) {
            schemeStat$EventCustomMain = new SchemeStat$EventCustomMain(m0qVar.a(), String.valueOf(j2), SchemeStat$EventCustomMain.Type.TYPE_DEV_NULL_ITEM, null, null, null, null, a, null);
        } else {
            xki0 j3 = pllVar.j();
            schemeStat$EventCustomMain = new SchemeStat$EventCustomMain(m0qVar.a(), String.valueOf(j2), SchemeStat$EventCustomMain.Type.TYPE_DEV_NULL_ITEM, UUID.randomUUID().toString(), SchemeStat$EventCustomMain.Actor.APP, j3.a(), Integer.valueOf(j3.b()), a, null);
        }
        SchemeStat$EventCustomMain schemeStat$EventCustomMain2 = schemeStat$EventCustomMain;
        m0qVar.b = new m0q.a(schemeStat$EventCustomMain2.a(), schemeStat$EventCustomMain2.b());
        return new qyp(p9h0.a.toJson(schemeStat$EventCustomMain2), new eta0("VK"));
    }

    public final qyp d(long j, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, SchemeStat$TypeNavgo schemeStat$TypeNavgo, m0q m0qVar) {
        String str;
        SchemeStat$EventProductMain a;
        m0q.a aVar = m0qVar.c;
        if (aVar == null || (str = aVar.b) == null) {
            str = new String();
        }
        SchemeStat$TypeNavgo a2 = SchemeStat$TypeNavgo.a(schemeStat$TypeNavgo, str);
        long j2 = j * 1000;
        pll pllVar = this.a;
        if (pllVar == null) {
            int a3 = m0qVar.a();
            String valueOf = String.valueOf(j2);
            m0q.a aVar2 = m0qVar.b;
            int i = aVar2 != null ? aVar2.a : 0;
            m0q.a aVar3 = m0qVar.c;
            a = SchemeStat$EventProductMain.a.a(a3, valueOf, mobileOfficialAppsCoreNavStat$EventScreen, i, aVar3 != null ? aVar3.a : 0, null, null, null, null, a2);
        } else {
            xki0 j3 = pllVar.j();
            int a4 = m0qVar.a();
            String valueOf2 = String.valueOf(j2);
            m0q.a aVar4 = m0qVar.b;
            int i2 = aVar4 != null ? aVar4.a : 0;
            m0q.a aVar5 = m0qVar.c;
            a = SchemeStat$EventProductMain.a.a(a4, valueOf2, mobileOfficialAppsCoreNavStat$EventScreen, i2, aVar5 != null ? aVar5.a : 0, UUID.randomUUID().toString(), SchemeStat$EventProductMain.Actor.APP, j3.a(), Integer.valueOf(j3.b()), a2);
        }
        m0q.a aVar6 = new m0q.a(a.a(), a.b());
        m0qVar.b = aVar6;
        m0qVar.c = aVar6;
        return new qyp(p9h0.a.toJson(a), new eta0("VK"));
    }

    public final <T extends SchemeStat$EventBenchmarkMain.b> qyp e(long j, T t, m0q m0qVar, yxp<T> yxpVar) {
        ArrayList<yxp.a> arrayList;
        ArrayList<yxp.a<T>> arrayList2 = yxpVar.a;
        arrayList2.add(new yxp.a<>(j, t));
        if (arrayList2.size() < 16) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            arrayList.addAll(arrayList2);
            arrayList2.clear();
        }
        if (arrayList == null) {
            return new qyp("", new eta0("VK"));
        }
        ArrayList arrayList3 = new ArrayList();
        for (yxp.a aVar : arrayList) {
            SchemeStat$EventBenchmarkMain a = SchemeStat$EventBenchmarkMain.a.a(m0qVar.a(), String.valueOf(aVar.b() * 1000), (SchemeStat$EventBenchmarkMain.b) aVar.a());
            arrayList3.add(p9h0.a.toJson(a));
            m0qVar.b = new m0q.a(a.a(), a.b());
        }
        Gson gson = p9h0.a;
        l8y l8yVar = new l8y();
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            b9y e = bay.e((String) it.next());
            if (e instanceof x9y) {
                l8yVar.l(e.h());
            } else if (e instanceof l8y) {
                l8yVar.b.addAll(e.g().b);
            } else {
                new IllegalArgumentException("Can't parse event");
            }
        }
        return new qyp(p9h0.a.toJson((b9y) l8yVar), new eta0("VK"));
    }

    public final qyp f(long j, gsd0 gsd0Var, m0q m0qVar) {
        SchemeStat$EventProductMain a;
        long j2 = 1000 * j;
        pll pllVar = this.a;
        if (pllVar == null) {
            int a2 = m0qVar.a();
            String valueOf = String.valueOf(j2);
            MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = gsd0Var.a;
            m0q.a aVar = m0qVar.b;
            int i = aVar != null ? aVar.a : 0;
            m0q.a aVar2 = m0qVar.c;
            a = SchemeStat$EventProductMain.a.a(a2, valueOf, mobileOfficialAppsCoreNavStat$EventScreen, i, aVar2 != null ? aVar2.a : 0, null, null, null, null, gsd0Var.b);
        } else {
            xki0 j3 = pllVar.j();
            int a3 = m0qVar.a();
            String valueOf2 = String.valueOf(j2);
            MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen2 = gsd0Var.a;
            m0q.a aVar3 = m0qVar.b;
            int i2 = aVar3 != null ? aVar3.a : 0;
            m0q.a aVar4 = m0qVar.c;
            int i3 = aVar4 != null ? aVar4.a : 0;
            SchemeStat$EventProductMain.b bVar = gsd0Var.b;
            String uuid = UUID.randomUUID().toString();
            SchemeStat$EventProductMain.b bVar2 = gsd0Var.b;
            a = SchemeStat$EventProductMain.a.a(a3, valueOf2, mobileOfficialAppsCoreNavStat$EventScreen2, i2, i3, uuid, bVar2 instanceof SchemeStat$TypeNavgo ? SchemeStat$EventProductMain.Actor.APP : bVar2 instanceof SchemeStat$TypeAction ? SchemeStat$EventProductMain.Actor.APP : bVar2 instanceof SchemeStat$TypeView ? SchemeStat$EventProductMain.Actor.APP : bVar2 instanceof SchemeStat$TypeClick ? SchemeStat$EventProductMain.Actor.USER : SchemeStat$EventProductMain.Actor.APP, j3.a(), Integer.valueOf(j3.b()), bVar);
        }
        m0qVar.b = new m0q.a(a.a(), a.b());
        return new qyp(p9h0.a.toJson(a), new eta0("VK"));
    }
}
