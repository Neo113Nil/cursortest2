package defpackage;

import com.ybsdk.core.transfer.utils.TransferDeeplink;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes3.dex */
public abstract class dt01 {
    public static final ArrayList a(eh01 eh01Var, LinkedHashMap linkedHashMap, ak1 ak1Var) {
        List<eh01> list = ak1Var.f;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        for (eh01 eh01Var2 : list) {
            arrayList.add((eh01Var == null || !jl40.l(eh01Var2.a, eh01Var.a)) ? c(linkedHashMap, eh01Var2) : eh01Var);
        }
        return arrayList;
    }

    public static final ig6 b(ig6 ig6Var, LinkedHashMap linkedHashMap) {
        String str;
        String str2;
        web webVar;
        String str3;
        web webVar2;
        String str4 = ig6Var.a;
        xmq0 xmq0Var = ig6Var.c;
        ymq0 ymq0Var = ig6Var.b;
        String str5 = ig6Var.h;
        web webVar3 = (web) linkedHashMap.get(str4);
        String str6 = null;
        String str7 = webVar3 != null ? webVar3.d : null;
        if (str5 == null) {
            str7 = null;
        }
        ymq0 e = e(linkedHashMap, ymq0Var);
        xmq0 d = d(linkedHashMap, xmq0Var);
        String str8 = str7 != null ? str5 : null;
        if (str7 == null) {
            str7 = (ymq0Var == null || (str3 = ymq0Var.a) == null || (webVar2 = (web) linkedHashMap.get(str3)) == null) ? null : webVar2.b;
            if (str7 == null) {
                if (xmq0Var != null && (str2 = xmq0Var.a) != null && (webVar = (web) linkedHashMap.get(str2)) != null) {
                    str6 = webVar.b;
                }
                if (str6 != null) {
                    str = str6;
                    return new ig6(ig6Var.a, e, d, ig6Var.d, str, ig6Var.f, ig6Var.g, str8, ig6Var.i, ig6Var.j, ig6Var.k);
                }
                str7 = ig6Var.e;
            }
        }
        str = str7;
        return new ig6(ig6Var.a, e, d, ig6Var.d, str, ig6Var.f, ig6Var.g, str8, ig6Var.i, ig6Var.j, ig6Var.k);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    public static final eh01 c(LinkedHashMap linkedHashMap, eh01 eh01Var) {
        ?? r2;
        ?? r1;
        TransferDeeplink transferDeeplink = eh01Var.f;
        r6q0 r6q0Var = eh01Var.i;
        hg6 hg6Var = eh01Var.h;
        boolean l = jl40.l(transferDeeplink, TransferDeeplink.Self.ItemsSheet.INSTANCE);
        EmptyList emptyList = EmptyList.a;
        r6q0 r6q0Var2 = null;
        if (l) {
            if (hg6Var != null) {
                List list = hg6Var.d;
                r1 = new ArrayList(tcc.n(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    r1.add(b((ig6) it.next(), linkedHashMap));
                }
            } else {
                r1 = 0;
            }
            if (r1 != 0) {
                emptyList = r1;
            }
            return eh01.a(eh01Var, hg6Var != null ? hg6.a(hg6Var, emptyList) : null, null, null, null, 130943);
        }
        if (jl40.l(transferDeeplink, TransferDeeplink.Self.Topup.INSTANCE)) {
            return eh01.a(eh01Var, null, null, null, d(linkedHashMap, eh01Var.k), 130047);
        }
        if (jl40.l(transferDeeplink, TransferDeeplink.Self.Transfer.INSTANCE)) {
            return eh01.a(eh01Var, null, null, e(linkedHashMap, eh01Var.j), null, 130559);
        }
        if (!jl40.l(transferDeeplink, TransferDeeplink.Self.SectionsSheet.INSTANCE)) {
            if (jl40.l(transferDeeplink, TransferDeeplink.AftTopup.INSTANCE) || jl40.l(transferDeeplink, TransferDeeplink.AllTargets.INSTANCE) || jl40.l(transferDeeplink, TransferDeeplink.Me2MeTopup.INSTANCE) || jl40.l(transferDeeplink, TransferDeeplink.PhoneTransfer.INSTANCE) || jl40.l(transferDeeplink, TransferDeeplink.CrossBorderTransfer.INSTANCE) || (transferDeeplink instanceof TransferDeeplink.RawAction) || jl40.l(transferDeeplink, TransferDeeplink.RequisitesTransfer.INSTANCE) || (transferDeeplink instanceof TransferDeeplink.SelectTarget) || transferDeeplink == null) {
                return eh01Var;
            }
            w511.b();
            return null;
        }
        if (r6q0Var != null) {
            List<jg6> list2 = r6q0Var.c;
            r2 = new ArrayList(tcc.n(list2, 10));
            for (jg6 jg6Var : list2) {
                List list3 = jg6Var.c;
                ArrayList arrayList = new ArrayList(tcc.n(list3, 10));
                Iterator it2 = list3.iterator();
                while (it2.hasNext()) {
                    arrayList.add(b((ig6) it2.next(), linkedHashMap));
                }
                r2.add(new jg6(jg6Var.a, jg6Var.b, arrayList));
            }
        } else {
            r2 = 0;
        }
        if (r6q0Var != null) {
            if (r2 != 0) {
                emptyList = r2;
            }
            r6q0Var2 = r6q0.a(r6q0Var, emptyList);
        }
        return eh01.a(eh01Var, null, r6q0Var2, null, null, 130815);
    }

    public static final xmq0 d(LinkedHashMap linkedHashMap, xmq0 xmq0Var) {
        String str = xmq0Var != null ? xmq0Var.a : null;
        if (str != null) {
            web webVar = (web) linkedHashMap.get(str);
            xmq0 xmq0Var2 = webVar != null ? new xmq0(xmq0Var.a, xmq0Var.b, webVar.b, xmq0Var.d, xmq0Var.e, xmq0Var.f) : null;
            if (xmq0Var2 != null) {
                return xmq0Var2;
            }
        }
        return xmq0Var;
    }

    public static final ymq0 e(LinkedHashMap linkedHashMap, ymq0 ymq0Var) {
        ymq0 ymq0Var2 = null;
        String str = ymq0Var != null ? ymq0Var.a : null;
        if (str != null) {
            web webVar = (web) linkedHashMap.get(str);
            if (webVar != null) {
                ymq0Var2 = new ymq0(ymq0Var.a, ymq0Var.b, webVar.b, ymq0Var.e, ymq0Var.d);
            }
            if (ymq0Var2 != null) {
                return ymq0Var2;
            }
        }
        return ymq0Var;
    }
}
