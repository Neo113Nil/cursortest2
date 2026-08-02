package xsna;

import com.vk.core.view.components.group.header.VkGroupHeader;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.tlo0;
import xsna.yiw0;

/* compiled from: VoipCallServiceReducer.kt */
/* loaded from: classes7.dex */
public final /* synthetic */ class uiw0 extends FunctionReferenceImpl implements izs<yiw0.e, List<Object>> {
    @Override // xsna.izs
    public final List<Object> invoke(yiw0.e eVar) {
        yiw0.e eVar2 = eVar;
        ((viw0) this.receiver).getClass();
        ArrayList arrayList = new ArrayList();
        yiw0.e.a aVar = eVar2.b;
        yiw0.e.b bVar = eVar2.c;
        int i = 0;
        if (aVar instanceof yiw0.e.a.C4103a) {
            arrayList.add(o2x0.b);
            ArrayList arrayList2 = new ArrayList(2);
            for (int i2 = 0; i2 < 2; i2++) {
                arrayList2.add(rlw0.b);
            }
            arrayList.addAll(arrayList2);
        } else {
            if (!(aVar instanceof yiw0.e.a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            tlo0.a aVar2 = tlo0.Companion;
            yiw0.e.a.b bVar2 = (yiw0.e.a.b) aVar;
            boolean z = bVar2.b;
            ArrayList arrayList3 = bVar2.a;
            arrayList.add(new jku(tq.h(aVar2, z ? R.string.voip_vkapp_services_primary_header_friends : R.string.voip_vkapp_services_primary_header_all), VkGroupHeader.Size.Medium));
            if (arrayList3.isEmpty()) {
                arrayList.add(czw0.b);
            } else {
                arrayList.addAll(arrayList3);
            }
        }
        if (bVar instanceof yiw0.e.b.a) {
            arrayList.add(o2x0.b);
            ArrayList arrayList4 = new ArrayList(10);
            while (i < 10) {
                arrayList4.add(rlw0.b);
                i++;
            }
            arrayList.addAll(arrayList4);
            return arrayList;
        }
        if (!(bVar instanceof yiw0.e.b.C4104b)) {
            throw new NoWhenBranchMatchedException();
        }
        yiw0.e.b.C4104b c4104b = (yiw0.e.b.C4104b) bVar;
        if (!c4104b.c.isEmpty()) {
            arrayList.add(new jku(tq.h(tlo0.Companion, R.string.voip_vkapp_services_primary_header_global), VkGroupHeader.Size.Medium));
            arrayList.addAll(c4104b.c);
            if (c4104b.d) {
                ArrayList arrayList5 = new ArrayList(10);
                while (i < 10) {
                    arrayList5.add(rlw0.b);
                    i++;
                }
                arrayList.addAll(arrayList5);
            }
        }
        return arrayList;
    }
}
