package com.yandex.passport.sloth;

import android.net.Uri;
import defpackage.evu0;
import defpackage.tcc;
import defpackage.tje;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.VMInspector.Depends;

/* loaded from: classes2.dex */
public final class l {
    public final z0 a;
    public final v b;
    public final h c;

    public l(z0 z0Var, v vVar, h hVar) {
        this.a = z0Var;
        this.b = vVar;
        this.c = hVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v3, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.ArrayList] */
    public final com.yandex.passport.sloth.url.p a(String str) {
        Iterable iterable;
        List W;
        String i = com.yandex.passport.common.url.b.i(str, "errors");
        if (i == null) {
            i = (String) com.yandex.passport.common.url.b.f(str, Collections.singleton("error")).get("error");
        }
        this.a.a(new n0(i == null ? Depends.NOT_AVAILABLE : i, 3));
        if (i != null) {
            Set set = k.b;
            W = evu0.W(i, new String[]{","}, (r2 & 4) != 0 ? 0 : 2);
            List list = W;
            iterable = new ArrayList(tcc.n(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                iterable.add(new k(evu0.k0((String) it.next()).toString()));
            }
        } else {
            iterable = 0;
        }
        if (iterable == 0) {
            iterable = EmptyList.a;
        }
        Iterable iterable2 = iterable;
        if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
            Iterator it2 = iterable2.iterator();
            while (it2.hasNext()) {
                if (k.b.contains(((k) it2.next()).a.toLowerCase(Locale.ROOT))) {
                    tje.N(this.c, null, null, new SlothErrorProcessor$process$2(this, iterable, null), 3);
                    return com.yandex.passport.sloth.url.k.d;
                }
            }
        }
        return !Uri.parse(str).getBooleanQueryParameter("errorShownToUser", false) ? new com.yandex.passport.sloth.url.o(i) : com.yandex.passport.sloth.url.k.b;
    }
}
