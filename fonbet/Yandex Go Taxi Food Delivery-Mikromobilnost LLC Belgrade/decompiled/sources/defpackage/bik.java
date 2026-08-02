package defpackage;

import com.yandex.div2.DivChangeTransition;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class bik implements c4x {
    public final List a;
    public Integer b;
    public Integer c;

    public bik(List list) {
        this.a = list;
    }

    public final boolean a(bik bikVar, rvo rvoVar, rvo rvoVar2) {
        if (bikVar == null) {
            return false;
        }
        List list = bikVar.a;
        List list2 = this.a;
        if (list2.size() != list.size()) {
            return false;
        }
        int i = 0;
        for (Object obj : list2) {
            int i2 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            if (!((DivChangeTransition) obj).a((DivChangeTransition) list.get(i), rvoVar, rvoVar2)) {
                return false;
            }
            i = i2;
        }
        return true;
    }

    public final int b() {
        int hashCode;
        Integer num = this.c;
        if (num != null) {
            return num.intValue();
        }
        Integer num2 = this.b;
        if (num2 != null) {
            hashCode = num2.intValue();
        } else {
            hashCode = qoi0.a(bik.class).hashCode();
            this.b = Integer.valueOf(hashCode);
        }
        Iterator it = this.a.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((DivChangeTransition) it.next()).b();
        }
        int i2 = hashCode + i;
        this.c = Integer.valueOf(i2);
        return i2;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        return ((cik) ft6.b.a2.getValue()).b(ft6.a, this);
    }
}
