package defpackage;

import com.yandex.go.morphlex.api.MorphlexScreenPayload$ParamType;
import com.yandex.go.morphlex.api.MorphlexScreenPayload$PresentType;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes12.dex */
public final class h830 {
    public final String a;
    public final String b;
    public final MorphlexScreenPayload$PresentType c;
    public final Map d;
    public final List e;
    public final Map f;
    public final String g;
    public final boolean h;
    public final i6z0 i;
    public final boolean j;
    public final String k;

    public h830(String str, String str2, MorphlexScreenPayload$PresentType morphlexScreenPayload$PresentType, Map map, List list, Map map2, String str3, boolean z, i6z0 i6z0Var, boolean z2, String str4, int i) {
        map = (i & 8) != 0 ? null : map;
        map2 = (i & 32) != 0 ? null : map2;
        z = (i & 256) != 0 ? false : z;
        i6z0Var = (i & 512) != 0 ? null : i6z0Var;
        z2 = (i & 1024) != 0 ? false : z2;
        this.a = str;
        this.b = str2;
        this.c = morphlexScreenPayload$PresentType;
        this.d = map;
        this.e = list;
        this.f = map2;
        this.g = str3;
        this.h = z;
        this.i = i6z0Var;
        this.j = z2;
        this.k = str4;
    }

    public final boolean a(MorphlexScreenPayload$ParamType morphlexScreenPayload$ParamType) {
        List list = this.e;
        if (list != null) {
            List list2 = list;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    if (((g830) it.next()).a == morphlexScreenPayload$ParamType) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean b(MorphlexScreenPayload$ParamType morphlexScreenPayload$ParamType) {
        List list = this.e;
        if (list != null) {
            List<g830> list2 = list;
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                return false;
            }
            for (g830 g830Var : list2) {
                if (g830Var.a == morphlexScreenPayload$ParamType && g830Var.b) {
                    return true;
                }
            }
        }
        return false;
    }
}
