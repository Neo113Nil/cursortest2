package com.yandex.go.navigator.alt_select;

import com.yandex.go.zone.dto.objects.VerticalType;
import defpackage.bf31;
import defpackage.oa31;
import defpackage.pb31;
import defpackage.scc;
import defpackage.tcc;
import defpackage.wg50;
import defpackage.za31;
import defpackage.zls;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AdaptedFunctionReference;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
final /* synthetic */ class NavigatorVerticalsInteractor$stateFlow$1 extends AdaptedFunctionReference implements zls {
    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i;
        String str;
        boolean z;
        Map map = (Map) obj2;
        wg50 wg50Var = (wg50) this.receiver;
        wg50Var.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj4 : (List) obj) {
            if (!((za31) obj4).a.o) {
                arrayList.add(obj4);
            }
        }
        Iterator it = arrayList.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (((za31) it.next()).a.c == VerticalType.NAVIGATOR) {
                i = i2;
                break;
            }
            i2++;
        }
        if (i == -1) {
            return EmptyList.a;
        }
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            oa31 oa31Var = ((za31) it2.next()).a;
            arrayList2.add(new bf31(oa31Var.a, oa31Var.d));
        }
        ArrayList arrayList3 = new ArrayList(tcc.n(arrayList2, 10));
        Iterator it3 = arrayList2.iterator();
        int i3 = 0;
        while (it3.hasNext()) {
            Object next = it3.next();
            int i4 = i3 + 1;
            if (i3 < 0) {
                scc.m();
                throw null;
            }
            bf31 bf31Var = (bf31) next;
            int i5 = i3;
            pb31 pb31Var = wg50Var.b;
            String str2 = bf31Var.a;
            String str3 = bf31Var.b;
            if (i5 == i) {
                z = true;
                str = str3;
            } else {
                str = str3;
                z = false;
            }
            arrayList3.add(pb31Var.a(str2, str, z, map, arrayList2));
            i3 = i4;
        }
        return arrayList3;
    }
}
