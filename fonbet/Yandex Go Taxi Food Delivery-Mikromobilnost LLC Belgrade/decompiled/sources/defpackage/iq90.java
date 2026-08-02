package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.yandex.taxi.requirements.models.net.RequirementsParam;

@gsq0
/* loaded from: classes9.dex */
public final class iq90 extends ooc {
    public static final hq90 Companion = new hq90();
    public static final i3y[] q;
    public final String e;
    public final List f;
    public final String g;
    public final String h;
    public final Integer i;
    public final List j;
    public final o1a0 k;
    public final np40 l;
    public final String m;
    public final Map n;
    public final boolean o;
    public final String p;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        q = new i3y[]{null, a.b(lazyThreadSafetyMode, new nk90(5)), null, null, null, a.b(lazyThreadSafetyMode, new nk90(6)), null, null, null, a.b(lazyThreadSafetyMode, new nk90(7)), null, null};
    }

    public iq90(x6b0 x6b0Var) {
        String str = x6b0Var.a;
        List list = x6b0Var.b;
        String str2 = x6b0Var.c;
        String str3 = x6b0Var.d;
        Integer valueOf = Integer.valueOf(x6b0Var.e);
        LinkedHashMap linkedHashMap = x6b0Var.f;
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str4 = (String) entry.getKey();
            rpj0 rpj0Var = RequirementsParam.Companion;
            List list2 = (List) entry.getValue();
            rpj0Var.getClass();
            arrayList.add(new vax0(str4, rpj0.a(null, list2)));
        }
        o1a0 o1a0Var = new o1a0(x6b0Var.g, x6b0Var.h);
        np40 np40Var = x6b0Var.i;
        String str5 = x6b0Var.j;
        HashMap hashMap = x6b0Var.k;
        boolean z = x6b0Var.l;
        String str6 = x6b0Var.m;
        this.e = str;
        this.f = list;
        this.g = str2;
        this.h = str3;
        this.i = valueOf;
        this.j = arrayList;
        this.k = o1a0Var;
        this.l = np40Var;
        this.m = str5;
        this.n = hashMap;
        this.o = z;
        this.p = str6;
    }

    public iq90(int i, String str, List list, String str2, String str3, Integer num, List list2, o1a0 o1a0Var, np40 np40Var, String str4, Map map, boolean z, String str5) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, gq90.a.getDescriptor());
            throw null;
        }
        this.e = str;
        this.f = list;
        if ((i & 4) == 0) {
            this.g = null;
        } else {
            this.g = str2;
        }
        if ((i & 8) == 0) {
            this.h = null;
        } else {
            this.h = str3;
        }
        if ((i & 16) == 0) {
            this.i = null;
        } else {
            this.i = num;
        }
        if ((i & 32) == 0) {
            this.j = null;
        } else {
            this.j = list2;
        }
        if ((i & 64) == 0) {
            this.k = null;
        } else {
            this.k = o1a0Var;
        }
        if ((i & 128) == 0) {
            this.l = null;
        } else {
            this.l = np40Var;
        }
        if ((i & 256) == 0) {
            this.m = null;
        } else {
            this.m = str4;
        }
        if ((i & 512) == 0) {
            this.n = null;
        } else {
            this.n = map;
        }
        if ((i & 1024) == 0) {
            this.o = false;
        } else {
            this.o = z;
        }
        if ((i & 2048) == 0) {
            this.p = null;
        } else {
            this.p = str5;
        }
    }
}
