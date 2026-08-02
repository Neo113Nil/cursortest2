package com.yandex.go.taxi.summary.shared.requirement;

import androidx.media3.exoplayer.offline.DownloadService;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import com.yandex.go.zone.model.Zone;
import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import defpackage.b580;
import defpackage.c4r0;
import defpackage.f580;
import defpackage.gxi0;
import defpackage.is60;
import defpackage.j63;
import defpackage.kb5;
import defpackage.ore;
import defpackage.pex0;
import defpackage.qtb1;
import defpackage.s421;
import defpackage.tcc;
import defpackage.tpr;
import defpackage.tse0;
import defpackage.w3r0;
import defpackage.wiq0;
import defpackage.xcv0;
import defpackage.z4m0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlinx.coroutines.flow.m0;
import ru.yandex.taxi.requirements.repository.RequirementsChangedNotifier;
import ru.yandex.taxi.tariffs.model.SelectionOrigin;

/* loaded from: classes14.dex */
public final class e {
    public final ru.yandex.taxi.widget.utils.e a;
    public final xcv0 b;
    public final wiq0 c;
    public final f580 d;
    public final z4m0 e;
    public final ore f;
    public final s421 g;
    public final gxi0 h;

    public e(ru.yandex.taxi.widget.utils.e eVar, xcv0 xcv0Var, wiq0 wiq0Var, f580 f580Var, z4m0 z4m0Var, ore oreVar, s421 s421Var, gxi0 gxi0Var) {
        this.a = eVar;
        this.b = xcv0Var;
        this.c = wiq0Var;
        this.d = f580Var;
        this.e = z4m0Var;
        this.f = oreVar;
        this.g = s421Var;
        this.h = gxi0Var;
    }

    public final d a(kb5 kb5Var, tpr tprVar) {
        return new d(kotlinx.coroutines.flow.e.t(new m0(tprVar, com.yandex.go.coroutines.b.d(this.e.d(), new RequirementsNotificationInteractor$notificationFlow$$inlined$start$1(zy11.a, null)), new RequirementsNotificationInteractor$notificationFlow$1(this, null))), kb5Var, this);
    }

    public final void b() {
        ArrayList arrayList;
        Zone zone;
        SelectionOrigin selectionOrigin;
        ore oreVar = this.f;
        if (oreVar.a(((k) oreVar.b).m())) {
            xcv0 xcv0Var = this.b;
            xcv0Var.a.a("Summary.ChangeRequirementsAction", tse0.q(xcv0Var), 1, new HashMap());
            gxi0 gxi0Var = this.h;
            Set set = EmptySet.a;
            Zone c = gxi0Var.a.c();
            pex0 m = ((k) gxi0Var.b).m();
            if (c != null && m != null) {
                Set j63Var = new j63(0);
                if (gxi0Var.g.d(m)) {
                    gxi0Var.d.a(qtb1.D);
                }
                if (gxi0Var.e.h(m)) {
                    gxi0Var.e.f();
                }
                Set set2 = m.L;
                List<b580> list = gxi0Var.a.a.x;
                List a = gxi0Var.h.a(m.b, c, list);
                ArrayList arrayList2 = new ArrayList();
                for (b580 b580Var : list) {
                    if (set2.contains(b580Var.a) || !a.contains(b580Var)) {
                        j63Var.add(b580Var);
                    } else {
                        arrayList2.add(b580Var);
                    }
                }
                c4r0 c4r0Var = gxi0Var.c;
                SelectionOrigin selectionOrigin2 = SelectionOrigin.UNSUPPORTED_REQUIREMENTS;
                if (m.u) {
                    arrayList = arrayList2;
                    zone = c;
                    selectionOrigin = selectionOrigin2;
                    m = pex0.a(m, null, null, is60.c, null, null, null, null, null, 0, null, null, null, false, null, null, false, set, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, -1611661377, -36, 8388607);
                } else {
                    zone = c;
                    selectionOrigin = selectionOrigin2;
                    arrayList = arrayList2;
                }
                c4r0Var.c(selectionOrigin, m, true);
                w3r0.b(gxi0Var.f, arrayList, zone, RequirementsChangedNotifier.ChangeType.REMOVE_UNSUPPORTED, null, 8);
                set = j63Var;
            }
            f580 f580Var = this.d;
            pex0 m2 = ((k) this.c).m();
            String str = m2 != null ? m2.b : null;
            f580Var.getClass();
            Set set3 = set;
            ArrayList arrayList3 = new ArrayList(tcc.n(set3, 10));
            Iterator<E> it = set3.iterator();
            while (it.hasNext()) {
                arrayList3.add(((b580) it.next()).a);
            }
            xcv0 xcv0Var2 = f580Var.c;
            String str2 = f580Var.a.a.V;
            String g = f580Var.g();
            xcv0Var2.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("vertical_id", str2);
            hashMap.put(DownloadService.KEY_REQUIREMENTS, arrayList3);
            if (str != null) {
                hashMap.put(PlusAcquisitionSmartOffer.Texts.TARIFF_PREFIX, str);
            }
            xcv0Var2.a.a("Summary.OptionRemoved", hashMap, 2, tse0.r("summary_state", hashMap, g));
        }
    }
}
