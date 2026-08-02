package defpackage;

import com.ybsdk.core.utils.text.Text;
import com.ybsdk.widgets.common.YbButtonView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.a;

/* loaded from: classes3.dex */
public final class br01 implements ev31 {
    @Override // defpackage.ev31
    public final Object q(Object obj) {
        j5x0 j5x0Var;
        List m0;
        Text h;
        Text.Resource h2;
        zq01 zq01Var = (zq01) obj;
        List list = zq01Var.b;
        if (list.size() > 1) {
            List<tq01> list2 = list;
            ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
            for (tq01 tq01Var : list2) {
                if ((tq01Var instanceof qq01) || (tq01Var instanceof oq01)) {
                    h2 = unr0.h(Text.Companion, dzh0.ybsdk_transfer_requisite_legal_title);
                } else {
                    if (!(tq01Var instanceof sq01)) {
                        w511.b();
                        return null;
                    }
                    h2 = unr0.h(Text.Companion, dzh0.ybsdk_transfer_requisite_person_title);
                }
                arrayList.add(h2);
            }
            ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
            Iterator it = arrayList.iterator();
            int i = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i2 = i + 1;
                if (i < 0) {
                    scc.m();
                    throw null;
                }
                arrayList2.add(new k5x0((Text) next, i));
                i = i2;
            }
            j5x0Var = new j5x0(arrayList2, Integer.valueOf(zq01Var.c()));
        } else {
            j5x0Var = null;
        }
        tq01 b = zq01Var.b();
        if (b == null) {
            m0 = EmptyList.a;
        } else {
            Text.Resource resource = new Text.Resource(dzh0.ybsdk_transfer_requisites_button_title);
            boolean z = zq01Var.c;
            m0 = a.m0(Collections.singletonList(new tqj0(new YbButtonView.a(resource, null, null, null, null, null, null, !z, z, null, 2558))), a.J0(b.b().values()));
        }
        tq01 b2 = zq01Var.b();
        if (b2 instanceof oq01) {
            h = unr0.h(Text.Companion, dzh0.ybsdk_transfer_requisite_hcs_toolbar_title);
        } else if ((b2 instanceof qq01) || (b2 instanceof sq01)) {
            h = unr0.h(Text.Companion, dzh0.ybsdk_transfer_requisite_toolbar_title);
        } else {
            if (b2 != null) {
                w511.b();
                return null;
            }
            h = Text.Empty.INSTANCE;
        }
        return new mr01(m0, j5x0Var, new stz0(h, null, null, null, null, null, false, null, null, null, null, null, 32766));
    }
}
