package xsna;

import com.vk.feed.core.models.news.NewsEntry;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class bm60 implements izs {
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ em60 d;

    public /* synthetic */ bm60(boolean z, boolean z2, x19 x19Var, em60 em60Var) {
        this.b = z;
        this.c = z2;
        this.d = em60Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.ArrayList, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.List] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Integer num;
        Object os60Var;
        lu60 lu60Var = (lu60) obj;
        if (this.b) {
            ce60.b.getClass();
            AtomicBoolean atomicBoolean = ce60.i;
            if (!atomicBoolean.get() || this.c) {
                List<NewsEntry> a = lu60Var.a();
                Collection arrayList = new ArrayList(a);
                g5g.D(arrayList, true, new pl2(29));
                com.vk.core.utils.newtork.b.a.getClass();
                if (com.vk.core.utils.newtork.b.d()) {
                    pv8 pv8Var = (pv8) ((bxx) hd60.a().a().a(m6r0.Z0));
                    num = pv8Var != null ? Integer.valueOf(pv8Var.f) : null;
                } else {
                    num = 5;
                }
                if (num != null && num.intValue() >= 0 && num.intValue() < arrayList.size()) {
                    arrayList = arrayList.subList(0, num.intValue());
                }
                List<NewsEntry> list = !arrayList.isEmpty() ? arrayList : a;
                if (lu60Var instanceof al60) {
                    al60 al60Var = (al60) lu60Var;
                    os60Var = new al60(list, null, al60Var.f, al60Var.g, true);
                } else {
                    os60Var = new os60(list, null, lu60Var.c(), true);
                }
                this.d.c.getClass();
                atomicBoolean.set(true);
                return os60Var;
            }
        }
        if (lu60Var instanceof al60) {
            al60 al60Var2 = (al60) lu60Var;
            return new al60(al60Var2.d, al60Var2.e, al60Var2.f, al60Var2.g, false);
        }
        if (!(lu60Var instanceof os60)) {
            return lu60Var;
        }
        os60 os60Var2 = (os60) lu60Var;
        return new os60(os60Var2.d, os60Var2.e, os60Var2.f, false);
    }
}
