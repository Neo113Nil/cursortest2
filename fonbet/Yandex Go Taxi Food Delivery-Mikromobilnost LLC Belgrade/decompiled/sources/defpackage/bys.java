package defpackage;

import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.b;
import androidx.recyclerview.widget.c;
import androidx.recyclerview.widget.x0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executors;
import kotlin.collections.a;

/* loaded from: classes10.dex */
public class bys extends dvy0 {
    public final ays c;
    public final List w;
    public final c x;
    public String y;

    public bys(ays aysVar, List list) {
        this.c = aysVar;
        this.w = list;
        b bVar = new b(this);
        yxs yxsVar = new yxs(this);
        synchronized (y5e.a) {
            try {
                if (y5e.b == null) {
                    y5e.b = Executors.newFixedThreadPool(2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        c cVar = new c(bVar, new lb7(9, y5e.b, yxsVar));
        this.x = cVar;
        this.y = "";
        cVar.d.add(new pa3() { // from class: xxs
            @Override // defpackage.pa3
            public final void a(List list2, List list3) {
                long currentTimeMillis = System.currentTimeMillis();
                bys bysVar = bys.this;
                String s = bysVar.s(list2);
                bysVar.y = oyr.t(x4e.k("GenericAdapter list changed at ", currentTimeMillis, " from ", s), " to ", bysVar.s(list3));
                jst.e.getClass();
            }
        });
    }

    public static String r(Object obj) {
        String str;
        e6v e6vVar = obj instanceof e6v ? (e6v) obj : null;
        if (e6vVar == null || (str = e6vVar.getId()) == null) {
            str = "UNKNOWN";
        }
        return "{" + obj.getClass() + " (id='" + str + "')}";
    }

    public Object getItem(int i) {
        return this.x.f.get(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.x.f.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        Object item = getItem(i);
        Iterator it = this.w.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            }
            if (((zxs) it.next()).a.isInstance(item)) {
                break;
            }
            i2++;
        }
        if (i2 != -1) {
            return i2;
        }
        throw new Exception(qv10.o("Wrong model type: ", item));
    }

    @Override // defpackage.dvy0
    /* renamed from: i */
    public final void onViewRecycled(xwy0 xwy0Var) {
        wys wysVar = (wys) xwy0Var;
        wysVar.Y();
        super.onViewRecycled(wysVar);
    }

    public boolean j(Object obj, Object obj2) {
        return jl40.l(obj, obj2);
    }

    public boolean k(Object obj, Object obj2) {
        return ((obj instanceof e6v) && (obj2 instanceof e6v)) ? jl40.l(((e6v) obj).getId(), ((e6v) obj2).getId()) && obj.getClass() == obj2.getClass() : j(obj, obj2);
    }

    public Object l(Object obj, Object obj2) {
        Object obj3;
        if (k(obj, obj2)) {
            Iterator it = this.w.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj3 = null;
                    break;
                }
                obj3 = it.next();
                if (((zxs) obj3).a.isInstance(obj)) {
                    break;
                }
            }
            zxs zxsVar = (zxs) obj3;
            List list = zxsVar != null ? zxsVar.d : null;
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj4 : list) {
                    if (((tys) obj4).b(obj, obj2)) {
                        arrayList.add(obj4);
                    }
                }
                if (!arrayList.isEmpty()) {
                    return arrayList;
                }
            }
        }
        return null;
    }

    public final int m(Class cls) {
        Iterator it = this.w.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (jl40.l(((zxs) it.next()).a, cls)) {
                break;
            }
            i++;
        }
        if (i != -1) {
            return i;
        }
        throw new Exception(qv10.l(cls, "Wrong model clazz: "));
    }

    @Override // defpackage.dvy0, androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: n, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void onBindViewHolder(wys wysVar, int i) {
        super.onBindViewHolder(wysVar, i);
        Object item = getItem(i);
        try {
            wysVar.c(item);
        } catch (ClassCastException e) {
            q(e, qv10.l(wysVar.getClass(), "Failed to bind to holder "), item, i);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:29|(3:31|(2:32|(2:34|(1:36)(1:42))(2:43|44))|(4:38|39|40|41))|45|46|48|49|50|41|27) */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f9, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00fa, code lost:
    
        q(r6, "Failed to updateHolder on payloadType " + r5.getClass() + " with payloadTypes.size " + r14.size(), r0, r13);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object] */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onBindViewHolder(wys wysVar, int i, List list) {
        Object obj;
        Object obj2;
        zxs zxsVar;
        ArrayList D = adc.D(tcc.o(adc.D(list, List.class)), tys.class);
        if (D.isEmpty()) {
            g(wysVar, i);
            return;
        }
        Object item = getItem(i);
        List list2 = this.w;
        Iterator it = list2.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (jl40.l(((zxs) obj).a, item.getClass())) {
                    break;
                }
            }
        }
        zxs zxsVar2 = (zxs) obj;
        if (zxsVar2 == null) {
            Iterator it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    zxsVar = 0;
                    break;
                } else {
                    zxsVar = it2.next();
                    if (((zxs) zxsVar).a.isAssignableFrom(item.getClass())) {
                        break;
                    }
                }
            }
            zxsVar2 = zxsVar;
        }
        if (zxsVar2 == null) {
            jst.e.k(new IllegalStateException("Missing itemType for model"), "There is no known item type for model " + item.getClass());
        }
        Iterator it3 = D.iterator();
        boolean z = false;
        while (it3.hasNext()) {
            tys tysVar = (tys) it3.next();
            if (zxsVar2 != null) {
                List list3 = zxsVar2.d;
                Iterator it4 = list3.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        obj2 = null;
                        break;
                    } else {
                        obj2 = it4.next();
                        if (((tys) obj2).getClass().equals(tysVar.getClass())) {
                            break;
                        }
                    }
                }
                if (obj2 == null) {
                    q(new IllegalStateException("Payload type is not comport with itemType"), "ItemType " + zxs.class + " with payloadTypes " + list3 + " doesn't contains payload type " + tysVar.getClass(), item, i);
                }
            }
            tysVar.a(wysVar, item);
            z = true;
        }
        if (z) {
            return;
        }
        g(wysVar, i);
    }

    @Override // defpackage.dvy0, androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewRecycled(x0 x0Var) {
        wys wysVar = (wys) x0Var;
        wysVar.Y();
        super.onViewRecycled(wysVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public wys onCreateViewHolder(ViewGroup viewGroup, int i) {
        View f;
        wys wysVar;
        zxs zxsVar = (zxs) this.w.get(i);
        wls wlsVar = zxsVar.f;
        if (wlsVar != null) {
            wysVar = (wys) wlsVar.invoke(LayoutInflater.from(viewGroup.getContext()), viewGroup);
        } else {
            tls tlsVar = zxsVar.e;
            if (tlsVar == null) {
                ny61.r("Invalid item type");
                return null;
            }
            tls tlsVar2 = zxsVar.c;
            if (tlsVar2 == null || (f = (View) tlsVar2.invoke(viewGroup)) == null) {
                f = oo31.f(viewGroup, zxsVar.b, viewGroup, false);
            }
            wysVar = (wys) tlsVar.invoke(f);
        }
        if (wysVar.X()) {
            ru.yandex.taxi.design.utils.c.z(new ou(18, wysVar, this), wysVar.a);
        }
        return wysVar;
    }

    public final void q(RuntimeException runtimeException, String str, Object obj, int i) {
        hst hstVar = jst.e;
        long currentTimeMillis = System.currentTimeMillis();
        String r = r(obj);
        String str2 = this.y;
        StringBuilder l = x4e.l("Error '", str, "' reported at ", currentTimeMillis);
        l.append(" for model ");
        l.append(r);
        l.append(" at position ");
        l.append(i);
        xby.t(hstVar, "GENERIC_ADAPTER:MODEL_INCONSISTENCY", runtimeException, unr0.r(l, " with last changed log '", str2, "'"), 2);
    }

    public final String s(List list) {
        return a.X(list, null, oyr.j(list.size(), "list{size=", "}["), "]", new dsg(this), 25);
    }

    public final void submitList(List list, Runnable runnable) {
        if (!jl40.l(Looper.myLooper(), Looper.getMainLooper())) {
            xby.t(jst.e, "GENERIC_ADAPTER:SUBMIT_NOT_FROM_UI_THREAD", new IllegalStateException("submitList to GenericAdapter should be called only from main thread"), null, 10);
        }
        qyy0.c(new r94(this, list, runnable));
    }

    public bys(List list) {
        this(new wxs(), list);
    }
}
