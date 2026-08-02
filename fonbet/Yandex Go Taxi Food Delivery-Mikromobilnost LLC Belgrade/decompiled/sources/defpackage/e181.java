package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import yads.rg1;

/* loaded from: classes7.dex */
public final class e181 {
    public final l581 a;
    public final fw71 b;

    public e181() {
        l581 l581Var = new l581();
        fw71 fw71Var = new fw71();
        this.a = l581Var;
        this.b = fw71Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005e, code lost:
    
        if (r8 == false) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String a(Context context) {
        List list;
        String str;
        boolean z;
        String str2;
        List list2;
        List W;
        this.a.getClass();
        String str3 = (String) l581.a(context, rg1.f.b);
        if (str3 == null) {
            fw71 fw71Var = this.b;
            gg81 a = fw71Var.a.a.a(context);
            Object obj = null;
            if (a == null || (str2 = a.X) == null) {
                list = EmptyList.a;
            } else {
                String str4 = (String) l581.a(context, rg1.g.b);
                if (str4 != null) {
                    W = evu0.W(str4, new String[]{","}, (r2 & 4) != 0 ? 0 : 2);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : W) {
                        if (!evu0.J((String) obj2)) {
                            arrayList.add(obj2);
                        }
                    }
                    boolean isEmpty = arrayList.isEmpty();
                    list2 = arrayList;
                }
                list2 = null;
                if (list2 == null) {
                    list2 = a.A0;
                }
                list = a.m0(list2, Collections.singletonList(str2));
            }
            if (list.size() > 1) {
                Iterator it = a.K(list).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    String a2 = yma1.a((String) next);
                    if (a2 == null || !(!evu0.J(a2))) {
                        z = false;
                    } else {
                        z381 z381Var = fw71Var.b;
                        ConcurrentHashMap concurrentHashMap = z381.b;
                        z = z381Var.a(1000, a2);
                    }
                    if (z) {
                        obj = next;
                        break;
                    }
                }
                String str5 = (String) obj;
                if (str5 == null) {
                    str = (String) a.Z(list);
                } else {
                    str3 = str5;
                    if (str3 == null) {
                        str3 = "yandex.com/ads";
                    }
                }
            } else {
                str = (String) a.R(list);
            }
            str3 = str;
            if (str3 == null) {
            }
        }
        return "https://".concat(str3);
    }
}
