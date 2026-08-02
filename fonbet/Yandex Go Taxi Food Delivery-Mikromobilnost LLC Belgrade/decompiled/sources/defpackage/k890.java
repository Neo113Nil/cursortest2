package defpackage;

import com.yandex.div.core.view2.divs.widgets.DivPagerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class k890 {
    public final Object a = new Object();
    public final LinkedHashMap b = new LinkedHashMap();
    public final ArrayList c = new ArrayList();

    public final void a() {
        synchronized (this.a) {
            try {
                Iterator it = this.b.entrySet().iterator();
                while (it.hasNext()) {
                    ((DivPagerView) ((Map.Entry) it.next()).getValue()).clearChangePageCallbackForIndicators();
                }
                Iterator it2 = this.c.iterator();
                while (it2.hasNext()) {
                    j890 j890Var = (j890) it2.next();
                    DivPagerView divPagerView = (DivPagerView) this.b.get(j890Var.b);
                    if (divPagerView != null) {
                        j890Var.a.attachPager(divPagerView);
                    }
                }
                this.b.clear();
                this.c.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
