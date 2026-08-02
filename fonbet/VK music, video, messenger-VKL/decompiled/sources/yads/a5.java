package yads;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.EmptyList;
import xsna.drm0;
import xsna.go9;
import xsna.j5g;

/* loaded from: classes10.dex */
public final class a5 {
    public final ti1 a;
    public final tl b;

    public /* synthetic */ a5() {
        this(new ti1(), new tl());
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0064, code lost:
    
        if (r9 == false) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String a(Context context) {
        List list;
        String str;
        String str2;
        List list2;
        this.a.getClass();
        String str3 = (String) ti1.a(context, ui1.f.b);
        if (str3 == null) {
            tl tlVar = this.b;
            f11 f11Var = tlVar.a;
            qu2 a = f11Var.a.a(context);
            Object obj = null;
            if (a == null || (str2 = a.X) == null) {
                list = EmptyList.b;
            } else {
                f11Var.b.getClass();
                String str4 = (String) ti1.a(context, ui1.g.b);
                if (str4 != null) {
                    List c0 = drm0.c0(str4, new String[]{StringUtils.COMMA}, 0, 6);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : c0) {
                        if (!drm0.N((String) obj2)) {
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
                list = j5g.u0(list2, Collections.singletonList(str2));
            }
            if (list.size() > 1) {
                Iterator it = j5g.T(1, list).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    String a2 = cc3.a((String) next);
                    if (a2 != null && (!drm0.N(a2))) {
                        e11 e11Var = tlVar.b;
                        ConcurrentHashMap concurrentHashMap = e11.b;
                        if (e11Var.a(1000, a2)) {
                            obj = next;
                            break;
                        }
                    }
                }
                String str5 = (String) obj;
                if (str5 == null) {
                    str = (String) j5g.i0(list);
                } else {
                    str3 = str5;
                    if (str3 == null) {
                        str3 = "yandex.com/ads";
                    }
                }
            } else {
                str = (String) j5g.a0(list);
            }
            str3 = str;
            if (str3 == null) {
            }
        }
        return a(str3);
    }

    public a5(ti1 ti1Var, tl tlVar) {
        this.a = ti1Var;
        this.b = tlVar;
    }

    public static String a(String str) {
        return go9.b("https://", str);
    }
}
