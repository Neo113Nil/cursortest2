package xsna;

import android.content.Context;
import com.vk.dto.common.id.UserId;
import com.vk.repository.internal.repos.stickers.database.StickersDatabase;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.Callable;
import xsna.ca9;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class obc implements Callable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ obc(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                io.reactivex.rxjava3.subjects.d<nbc> dVar = ((pbc) obj).b;
                dVar.onNext(nbc.a(dVar.P0(), null, null, true, null, 3));
                LinkedHashMap linkedHashMap = uyj.a;
                Context context = e43.a;
                Context context2 = context != null ? context : null;
                bpn0 bpn0Var = t65.a;
                return uyj.a(context2, ply.a());
            case 1:
                ((m9l0) obj).getClass();
                HashMap<UserId, StickersDatabase> hashMap = StickersDatabase.m;
                return StickersDatabase.a.b().z().a().b;
            case 2:
                return ((gzs) obj).invoke();
            default:
                m99 m99Var = ((wmw0) obj).g1;
                if (m99Var == null) {
                    throw new NullPointerException("settingsFeature is null");
                }
                ca9 ca9Var = m99Var.j().c;
                ca9.c cVar = ca9Var instanceof ca9.c ? (ca9.c) ca9Var : null;
                if (cVar == null) {
                    throw new NullPointerException("callInfo is null");
                }
                Set<String> set = m99Var.j().b;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : set) {
                    String str = (String) obj2;
                    Set<String> set2 = cVar.f;
                    if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                        Iterator<T> it = set2.iterator();
                        while (it.hasNext()) {
                            if (epx.f((String) it.next(), str)) {
                                break;
                            }
                        }
                    }
                    arrayList.add(obj2);
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    whr0 whr0Var = cVar.m.get((String) it2.next());
                    sew0 sew0Var = whr0Var != null ? whr0Var.b : null;
                    if (sew0Var != null) {
                        arrayList2.add(sew0Var);
                    }
                }
                return arrayList2;
        }
    }
}
