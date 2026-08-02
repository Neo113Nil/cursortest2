package xsna;

import com.vk.ecomm.checklist.impl.domain.model.CommunityCheckListTip;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.owg;
import xsna.twg;

/* compiled from: CommunityCheckListReducer.kt */
/* loaded from: classes18.dex */
public final class pwg extends dm50<xwg, owg, twg> {
    public final ywg d;

    public pwg(ywg ywgVar) {
        super(new twg(0));
        this.d = ywgVar;
    }

    @Override // xsna.dm50
    public final twg c(twg twgVar, owg owgVar) {
        twg twgVar2 = twgVar;
        owg owgVar2 = owgVar;
        if (owgVar2 instanceof owg.a.C3476a) {
            return twg.a(twgVar2, 0, 0, null, null, null, false, false, null, null, true, 415);
        }
        if (owgVar2 instanceof owg.a.c) {
            owg.a.c cVar = (owg.a.c) owgVar2;
            return twg.a(twgVar2, cVar.b, cVar.c, cVar.d, null, null, false, false, cVar.e, cVar.f, false, 24);
        }
        if (owgVar2 instanceof owg.a.b) {
            return twg.a(twgVar2, 0, 0, null, null, null, true, ((owg.a.b) owgVar2).b, null, null, false, 415);
        }
        if (owgVar2 instanceof owg.c.a) {
            return twg.a(twgVar2, 0, 0, null, ((owg.c.a) owgVar2).b, null, false, false, null, null, false, 1015);
        }
        if (owgVar2 instanceof owg.b) {
            twg.a aVar = twgVar2.f;
            owg.b bVar = (owg.b) owgVar2;
            String str = bVar.b;
            if (str == null) {
                str = "";
            }
            String str2 = bVar.c;
            String str3 = str2 != null ? str2 : "";
            aVar.getClass();
            return twg.a(twgVar2, 0, 0, null, null, new twg.a(str, str3), false, false, null, null, false, 1007);
        }
        if (!(owgVar2 instanceof owg.d)) {
            throw new NoWhenBranchMatchedException();
        }
        List<svg> list = twgVar2.d;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        for (svg svgVar : list) {
            CommunityCheckListTip.Type type = ((owg.d) owgVar2).b;
            List<CommunityCheckListTip> list2 = svgVar.c;
            ArrayList arrayList2 = new ArrayList(c5g.u(list2, 10));
            for (CommunityCheckListTip communityCheckListTip : list2) {
                CommunityCheckListTip.Type type2 = communityCheckListTip.d;
                if (type2 == type) {
                    communityCheckListTip = new CommunityCheckListTip(communityCheckListTip.a, communityCheckListTip.b, communityCheckListTip.c, type2, true);
                }
                arrayList2.add(communityCheckListTip);
            }
            int i = 0;
            if (!arrayList2.isEmpty()) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    if (((CommunityCheckListTip) it.next()).e && (i = i + 1) < 0) {
                        e43.s();
                        throw null;
                    }
                }
            }
            arrayList.add(new svg(svgVar.a, svgVar.b, arrayList2, i, svgVar.e));
        }
        return twg.a(twgVar2, 0, 0, arrayList, null, null, false, false, null, null, false, 1019);
    }

    @Override // xsna.dm50
    public final xwg d() {
        return new xwg(e(new wcg(this, 1)), e(new b40(11)), e(new com.vk.movika.sdk.base.observable.e0(16)));
    }

    @Override // xsna.dm50
    public final void h(twg twgVar, xwg xwgVar) {
        twg twgVar2 = twgVar;
        xwg xwgVar2 = xwgVar;
        if (twgVar2.g) {
            f(xwgVar2.b, twgVar2);
        } else if (twgVar2.k) {
            f(xwgVar2.c, twgVar2);
        } else {
            if (twgVar2.d.isEmpty()) {
                return;
            }
            f(xwgVar2.a, twgVar2);
        }
    }
}
