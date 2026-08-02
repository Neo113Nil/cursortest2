package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes11.dex */
public final class e630 {
    public ArrayList a = new ArrayList();
    public d630 b = d630.b;
    public Integer c = null;

    public final void a(cjx cjxVar, int i, String str, String str2) {
        ArrayList arrayList = this.a;
        if (arrayList != null) {
            arrayList.add(new f630(cjxVar, i, str, str2));
        } else {
            ny61.r("addEntry cannot be called after build()");
        }
    }

    public final g630 b() {
        if (this.a == null) {
            ny61.r("cannot call build() twice");
            return null;
        }
        Integer num = this.c;
        if (num != null) {
            int intValue = num.intValue();
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                if (((f630) it.next()).b == intValue) {
                }
            }
            kbs.v("primary key ID is not present in entries");
            return null;
        }
        g630 g630Var = new g630(this.b, Collections.unmodifiableList(this.a), this.c);
        this.a = null;
        return g630Var;
    }

    public final void c(d630 d630Var) {
        if (this.a != null) {
            this.b = d630Var;
        } else {
            ny61.r("setAnnotations cannot be called after build()");
        }
    }

    public final void d(int i) {
        if (this.a != null) {
            this.c = Integer.valueOf(i);
        } else {
            ny61.r("setPrimaryKeyId cannot be called after build()");
        }
    }
}
