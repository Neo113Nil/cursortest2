package xsna;

import com.vk.superapp.browser.internal.utils.InternalMiniApps;
import com.vk.superapp.miniapps.api.utils.InternalVkMiniApps;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: WebAppInternalMiniAppsBridge.kt */
/* loaded from: classes11.dex */
public final class qex0 {
    public static final qex0 a = new qex0();
    public static bpn0 b;
    public static boolean c;

    public static final q10 a() {
        bpn0 bpn0Var = b;
        if (bpn0Var == null) {
            bpn0Var = null;
        }
        return (q10) bpn0Var.getValue();
    }

    public List b() {
        zrp<InternalVkMiniApps> i = InternalVkMiniApps.i();
        ArrayList arrayList = new ArrayList(c5g.u(i, 10));
        Iterator<E> it = i.iterator();
        while (it.hasNext()) {
            arrayList.add(((InternalVkMiniApps) it.next()).h());
        }
        zrp<InternalMiniApps> i2 = InternalMiniApps.i();
        ArrayList arrayList2 = new ArrayList(c5g.u(i2, 10));
        Iterator<E> it2 = i2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((InternalMiniApps) it2.next()).h());
        }
        return j5g.R(j5g.u0(arrayList2, arrayList));
    }
}
