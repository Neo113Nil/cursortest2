package yads;

import com.ironsource.X3;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import xsna.c5g;
import xsna.e43;
import xsna.j5g;

/* loaded from: classes10.dex */
public final class j12 {
    public final r61 a;

    public /* synthetic */ j12() {
        this(new r61());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList] */
    public static List a(x12 x12Var) {
        ?? singletonList;
        if (x12Var instanceof w32) {
            ArrayList i = ((w32) x12Var).i();
            singletonList = new ArrayList(c5g.u(i, 10));
            Iterator it = i.iterator();
            while (it.hasNext()) {
                singletonList.add(((x12) it.next()).a());
            }
        } else {
            singletonList = Collections.singletonList(x12Var != null ? x12Var.a() : null);
        }
        return j5g.V(singletonList);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0046 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0014 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static List b(x12 x12Var) {
        k00 k00Var;
        k00 k00Var2 = null;
        if (!(x12Var instanceof w32)) {
            if (x12Var != null && (x12Var.getCreativeId() != null || x12Var.getCampaignId() != null)) {
                k00Var2 = new k00(x12Var.getCreativeId(), x12Var.getCampaignId());
            }
            return e43.m(k00Var2);
        }
        ArrayList i = ((w32) x12Var).i();
        ArrayList arrayList = new ArrayList();
        Iterator it = i.iterator();
        while (it.hasNext()) {
            x12 x12Var2 = (x12) it.next();
            if ((x12Var2 != null ? x12Var2.getCreativeId() : null) == null) {
                if ((x12Var2 != null ? x12Var2.getCampaignId() : null) == null) {
                    k00Var = null;
                    if (k00Var == null) {
                        arrayList.add(k00Var);
                    }
                }
            }
            k00Var = new k00(x12Var2.getCreativeId(), x12Var2.getCampaignId());
            if (k00Var == null) {
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList] */
    public final String c(x12 x12Var) {
        ?? m;
        if (x12Var instanceof w32) {
            ArrayList i = ((w32) x12Var).i();
            m = new ArrayList();
            Iterator it = i.iterator();
            while (it.hasNext()) {
                String info = ((x12) it.next()).getInfo();
                if (info != null) {
                    m.add(info);
                }
            }
        } else {
            m = e43.m(x12Var != null ? x12Var.getInfo() : null);
        }
        List list = m;
        this.a.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return j5g.g0(list, StringUtils.COMMA, X3.j.d, X3.j.e, 0, null, 56);
    }

    public j12(r61 r61Var) {
        this.a = r61Var;
    }
}
