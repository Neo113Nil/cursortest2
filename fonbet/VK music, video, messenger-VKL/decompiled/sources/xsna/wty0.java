package xsna;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class wty0 {
    public final kiw a;
    public final String b;
    public List c;
    public List d;
    public String e;
    public q4z0 f;
    public l5z0 g;

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public static class a {
        public final String a;
        public final String b;
        public final String c;
        public final boolean d;
        public final b520 e;

        public a(String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
            this.a = str3;
            this.b = str4;
            this.c = str5;
            this.d = z;
            this.e = new b520(str, 0, str2, str6);
        }
    }

    public wty0(kiw kiwVar, String str) {
        this.a = kiwVar;
        this.b = str;
    }

    public static List a(List list) {
        if (list == null || list.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(list.size() + 1);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((a) it.next()).e);
        }
        arrayList.add(new b520("", 1, "cancel", null));
        return arrayList;
    }
}
