package defpackage;

import android.os.Bundle;
import com.yandex.go.shortcuts.dto.request.Seen;
import com.yandex.go.shortcuts.dto.request.Status;
import com.yandex.go.shortcuts.dto.response.CountersShowPolicy;
import com.yandex.passport.internal.methods.f;
import com.yandex.pulse.ComponentParams;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.collections.a;

/* loaded from: classes8.dex */
public abstract class fd20 implements f {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public fd20(ComponentParams componentParams) {
        this.a = 0;
        this.b = componentParams;
        Map<String, String> map = componentParams.variations;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(new yoc(entry.getKey(), entry.getValue()));
        }
        Object[] array = arrayList.toArray(new yoc[0]);
        if (array == null) {
            ny61.t("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            throw null;
        }
        this.c = (yoc[]) array;
    }

    public void a(CountersShowPolicy countersShowPolicy) {
        if (e(countersShowPolicy)) {
            ((CopyOnWriteArraySet) this.c).add(new Seen(countersShowPolicy.getA(), Status.COMPLETE));
            au50 au50Var = (au50) this.b;
            String a = countersShowPolicy.getA();
            cne0 cne0Var = (cne0) au50Var.b;
            Set M0 = a.M0(cne0Var.n("seen_cache_set"));
            M0.add(a);
            cne0Var.t("seen_cache_set", M0);
        }
    }

    public void b(CountersShowPolicy countersShowPolicy) {
        au50 au50Var = (au50) this.b;
        String a = countersShowPolicy.getA();
        cne0 cne0Var = (cne0) au50Var.b;
        cne0Var.p(cne0Var.i("pref_usage_count" + a, 0) + 1, g8e.o("pref_usage_count", a));
        a(countersShowPolicy);
    }

    @Override // com.yandex.passport.internal.methods.f
    public void d(Bundle bundle, Object obj) {
        bundle.putInt((String) this.b, ((Enum) obj).ordinal());
    }

    public boolean e(CountersShowPolicy countersShowPolicy) {
        int b = countersShowPolicy.getB();
        au50 au50Var = (au50) this.b;
        String a = countersShowPolicy.getA();
        cne0 cne0Var = (cne0) au50Var.b;
        return b <= qv10.d("pref_show_count", a, cne0Var, 0) || countersShowPolicy.c() <= qv10.d("pref_usage_count", countersShowPolicy.getA(), cne0Var, 0);
    }

    @Override // com.yandex.passport.internal.methods.f
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Enum c(Bundle bundle) {
        Enum r4;
        g0c g0cVar = (g0c) this.c;
        String str = (String) this.b;
        int i = bundle.getInt(str);
        Enum[] enumArr = (Enum[]) g0cVar.a().getEnumConstants();
        if (enumArr != null) {
            int length = enumArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                r4 = enumArr[i2];
                if (r4.ordinal() == i) {
                    break;
                }
            }
        }
        r4 = null;
        if (r4 != null) {
            return r4;
        }
        vg10.d("can't get required enum ".concat(str));
        return null;
    }

    public void g(CountersShowPolicy countersShowPolicy) {
        au50 au50Var = (au50) this.b;
        String a = countersShowPolicy.getA();
        cne0 cne0Var = (cne0) au50Var.b;
        cne0Var.p(cne0Var.i("pref_show_count" + a, 0) + 1, g8e.o("pref_show_count", a));
        a(countersShowPolicy);
    }

    @Override // com.yandex.passport.internal.methods.f
    public String getKey() {
        return (String) this.b;
    }

    public String toString() {
        String fd20Var;
        switch (this.a) {
            case 3:
                String str = (String) this.c;
                fd20 fd20Var2 = (fd20) this.b;
                if (fd20Var2 == null || (fd20Var = fd20Var2.toString()) == null) {
                    return str;
                }
                return fd20Var + '.' + str;
            default:
                return super.toString();
        }
    }

    public fd20(au50 au50Var) {
        this.a = 1;
        this.b = au50Var;
        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
        this.c = copyOnWriteArraySet;
        Set n = ((cne0) au50Var.b).n("seen_cache_set");
        ArrayList arrayList = new ArrayList(tcc.n(n, 10));
        Iterator it = n.iterator();
        while (it.hasNext()) {
            arrayList.add(new Seen((String) it.next(), Status.COMPLETE));
        }
        copyOnWriteArraySet.addAll(arrayList);
    }

    public /* synthetic */ fd20(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
