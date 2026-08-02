package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.ui;

import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.HubItemAnalytics;
import defpackage.b0v;
import defpackage.d0v;
import defpackage.f0v;
import defpackage.h0v;
import defpackage.hta1;
import defpackage.jl40;
import defpackage.o7r0;
import defpackage.szu;
import defpackage.tcc;
import defpackage.tls;
import defpackage.uzu;
import defpackage.w511;
import defpackage.xzu;
import defpackage.zy11;
import defpackage.zzu;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* synthetic */ class VerticalHubV1ModalView$hubItemsAdapter$1 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        h0v h0vVar = (h0v) obj;
        c cVar = (c) this.receiver;
        if (h0vVar instanceof xzu) {
            xzu xzuVar = (xzu) h0vVar;
            cVar.Kg(xzuVar.c);
            List list = xzuVar.d;
            ArrayList arrayList = new ArrayList(tcc.n(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(hta1.c((HubItemAnalytics) it.next(), Integer.valueOf(xzuVar.e)));
            }
            o7r0.f(cVar.D, arrayList, Integer.valueOf(xzuVar.f.a), xzuVar.g);
        } else if (h0vVar instanceof b0v) {
            b0v b0vVar = (b0v) h0vVar;
            cVar.Kg(b0vVar.e);
            List list2 = b0vVar.f;
            ArrayList arrayList2 = new ArrayList(tcc.n(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(hta1.c((HubItemAnalytics) it2.next(), Integer.valueOf(b0vVar.g)));
            }
            o7r0.f(cVar.D, arrayList2, Integer.valueOf(b0vVar.h.a), b0vVar.i);
        } else if (h0vVar instanceof zzu) {
            zzu zzuVar = (zzu) h0vVar;
            cVar.Kg(zzuVar.d);
            List list3 = zzuVar.e;
            ArrayList arrayList3 = new ArrayList(tcc.n(list3, 10));
            Iterator it3 = list3.iterator();
            while (it3.hasNext()) {
                arrayList3.add(hta1.c((HubItemAnalytics) it3.next(), Integer.valueOf(zzuVar.f)));
            }
            o7r0.f(cVar.D, arrayList3, Integer.valueOf(zzuVar.g.a), zzuVar.h);
        } else {
            cVar.getClass();
            if (!(h0vVar instanceof uzu) && !jl40.l(h0vVar, d0v.a) && !(h0vVar instanceof szu) && !(h0vVar instanceof f0v)) {
                w511.b();
                return null;
            }
        }
        return zy11.a;
    }
}
