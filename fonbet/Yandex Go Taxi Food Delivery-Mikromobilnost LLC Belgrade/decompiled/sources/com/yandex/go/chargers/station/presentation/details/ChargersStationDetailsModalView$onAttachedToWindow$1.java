package com.yandex.go.chargers.station.presentation.details;

import defpackage.b64;
import defpackage.ej1;
import defpackage.em9;
import defpackage.esa;
import defpackage.gss;
import defpackage.hsa;
import defpackage.kps0;
import defpackage.nss;
import defpackage.pho;
import defpackage.sra;
import defpackage.tcc;
import defpackage.wls;
import defpackage.x4e;
import defpackage.xvq;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* synthetic */ class ChargersStationDetailsModalView$onAttachedToWindow$1 extends FunctionReferenceImpl implements wls {
    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int intValue = ((Number) obj2).intValue();
        sra sraVar = (sra) this.receiver;
        int i = intValue + 1;
        em9 em9Var = sraVar.z.a;
        HashMap w = b64.w(em9Var);
        HashMap n = x4e.n(i, w, "image_number");
        pho phoVar = em9Var.a;
        phoVar.a("Chargers.LocationCard.PhotosTapped", w, 1, n);
        HashMap hashMap = new HashMap();
        phoVar.a("Chargers.LocationCard.PhotoViewer", hashMap, 1, x4e.n(i, hashMap, "image_number"));
        hsa hsaVar = (hsa) sraVar.H.a;
        gss gssVar = hsaVar.M;
        ej1 ej1Var = new ej1(8, gssVar.a, gssVar.b, hsaVar.T);
        List list = (List) obj;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new kps0((String) it.next(), null, 6));
        }
        hsaVar.A(ej1Var, new nss(intValue, new xvq(29), arrayList, false), new esa());
        return zy11.a;
    }
}
