package xsna;

import com.vk.voip.ui.accessibility.AccessibilityEvents;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class al implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Collection c;

    public /* synthetic */ al(int i, Collection collection) {
        this.b = i;
        this.c = collection;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        AccessibilityEvents.a aVar;
        switch (this.b) {
            case 0:
                Map map = (Map) obj;
                Collection<String> collection = this.c;
                ArrayList arrayList = new ArrayList();
                for (String str : collection) {
                    whr0 whr0Var = (whr0) map.get(str);
                    if (whr0Var != null) {
                        String str2 = whr0Var.q;
                        if (str2 == null) {
                            str2 = whr0Var.e();
                        }
                        aVar = new AccessibilityEvents.a(str, str2, whr0Var.c);
                    } else {
                        aVar = null;
                    }
                    if (aVar != null) {
                        arrayList.add(aVar);
                    }
                }
                return arrayList;
            default:
                return Boolean.valueOf(this.c.contains(obj));
        }
    }
}
