package defpackage;

import android.view.View;
import com.yandex.div.core.view2.Div2View;
import com.yandex.urbanads.internal.visibility.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class jvo implements dpk {
    @Override // defpackage.dpk
    public final void beforeBindView(Div2View div2View, rvo rvoVar, View view, egk egkVar) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r23v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r7v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.util.ArrayList] */
    @Override // defpackage.dpk
    public final void bindView(final Div2View div2View, final rvo rvoVar, View view, egk egkVar) {
        Object obj;
        JSONObject jSONObject;
        ArrayList arrayList;
        List extensions = egkVar.getExtensions();
        if (extensions != null) {
            Iterator it = extensions.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (jl40.l(((bpk) obj).a, "exposureTracking")) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            bpk bpkVar = (bpk) obj;
            if (bpkVar == null || (jSONObject = bpkVar.b) == null) {
                return;
            }
            u2l u2lVar = new u2l(eg90.b);
            long optLong = jSONObject.optLong("updateTreshhold", 200L);
            JSONArray optJSONArray = jSONObject.optJSONArray("onAppear");
            final int i = 0;
            ?? r7 = EmptyList.a;
            if (optJSONArray != null) {
                d6w n = y6i0.n(0, optJSONArray.length());
                arrayList = new ArrayList();
                c6w it2 = n.iterator();
                while (it2.c) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(it2.nextInt());
                    evo f = optJSONObject != null ? cha1.f(u2lVar, optJSONObject) : null;
                    if (f != null) {
                        arrayList.add(f);
                    }
                }
            } else {
                arrayList = r7;
            }
            JSONArray optJSONArray2 = jSONObject.optJSONArray("onDisappear");
            if (optJSONArray2 != null) {
                d6w n2 = y6i0.n(0, optJSONArray2.length());
                r7 = new ArrayList();
                c6w it3 = n2.iterator();
                while (it3.c) {
                    JSONObject optJSONObject2 = optJSONArray2.optJSONObject(it3.nextInt());
                    evo f2 = optJSONObject2 != null ? cha1.f(u2lVar, optJSONObject2) : null;
                    if (f2 != null) {
                        r7.add(f2);
                    }
                }
            }
            ArrayList<evo> arrayList2 = arrayList;
            ArrayList arrayList3 = new ArrayList(tcc.n(arrayList2, 10));
            for (final evo evoVar : arrayList2) {
                arrayList3.add(new ix31(evoVar.a, evoVar.b, evoVar.c, new sls() { // from class: ivo
                    @Override // defpackage.sls
                    public final Object invoke() {
                        int i2 = i;
                        zy11 zy11Var = zy11.a;
                        rvo rvoVar2 = rvoVar;
                        Div2View div2View2 = div2View;
                        evo evoVar2 = evoVar;
                        switch (i2) {
                            case 0:
                                for (v3k v3kVar : evoVar2.d) {
                                    y6k actionHandler = div2View2.getActionHandler();
                                    if (actionHandler != null) {
                                        actionHandler.handleAction(v3kVar, div2View2, rvoVar2);
                                    }
                                }
                                break;
                            default:
                                for (v3k v3kVar2 : evoVar2.d) {
                                    y6k actionHandler2 = div2View2.getActionHandler();
                                    if (actionHandler2 != null) {
                                        actionHandler2.handleAction(v3kVar2, div2View2, rvoVar2);
                                    }
                                }
                                break;
                        }
                        return zy11Var;
                    }
                }));
            }
            Iterable iterable = (Iterable) r7;
            ArrayList arrayList4 = new ArrayList(tcc.n(iterable, 10));
            Iterator it4 = iterable.iterator();
            while (true) {
                final int i2 = 1;
                if (!it4.hasNext()) {
                    break;
                }
                final evo evoVar2 = (evo) it4.next();
                arrayList4.add(new ix31(evoVar2.a, evoVar2.b, evoVar2.c, new sls() { // from class: ivo
                    @Override // defpackage.sls
                    public final Object invoke() {
                        int i22 = i2;
                        zy11 zy11Var = zy11.a;
                        rvo rvoVar2 = rvoVar;
                        Div2View div2View2 = div2View;
                        evo evoVar22 = evoVar2;
                        switch (i22) {
                            case 0:
                                for (v3k v3kVar : evoVar22.d) {
                                    y6k actionHandler = div2View2.getActionHandler();
                                    if (actionHandler != null) {
                                        actionHandler.handleAction(v3kVar, div2View2, rvoVar2);
                                    }
                                }
                                break;
                            default:
                                for (v3k v3kVar2 : evoVar22.d) {
                                    y6k actionHandler2 = div2View2.getActionHandler();
                                    if (actionHandler2 != null) {
                                        actionHandler2.handleAction(v3kVar2, div2View2, rvoVar2);
                                    }
                                }
                                break;
                        }
                        return zy11Var;
                    }
                }));
            }
            a aVar = new a(view, arrayList3, arrayList4, optLong);
            view.setTag(2131361793, aVar);
            ArrayList arrayList5 = aVar.b;
            boolean isEmpty = arrayList5.isEmpty();
            ArrayList arrayList6 = aVar.c;
            if ((isEmpty && arrayList6.isEmpty()) || aVar.f) {
                return;
            }
            aVar.f = true;
            ArrayList arrayList7 = aVar.h;
            arrayList7.clear();
            Iterator it5 = arrayList5.iterator();
            while (it5.hasNext()) {
                arrayList7.add(new rw31((ix31) it5.next()));
            }
            ArrayList arrayList8 = aVar.i;
            arrayList8.clear();
            Iterator it6 = arrayList6.iterator();
            while (it6.hasNext()) {
                arrayList8.add(new rw31((ix31) it6.next()));
            }
            aVar.j = new uid(5, aVar);
            aVar.a.getViewTreeObserver().addOnPreDrawListener(aVar.j);
            aVar.b();
        }
    }

    @Override // defpackage.dpk
    public final void loadMedia(Div2View div2View, rvo rvoVar, View view, egk egkVar) {
    }

    @Override // defpackage.dpk
    public final boolean matches(egk egkVar) {
        List extensions = egkVar.getExtensions();
        if (extensions == null) {
            return false;
        }
        List list = extensions;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (jl40.l(((bpk) it.next()).a, "exposureTracking")) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dpk
    public final void preprocess(egk egkVar, rvo rvoVar) {
    }

    @Override // defpackage.dpk
    public final void releaseMedia(Div2View div2View, rvo rvoVar, View view, egk egkVar) {
    }

    @Override // defpackage.dpk
    public final void unbindView(Div2View div2View, rvo rvoVar, View view, egk egkVar) {
        Object tag = view.getTag(2131361793);
        a aVar = tag instanceof a ? (a) tag : null;
        if (aVar != null && aVar.f) {
            aVar.f = false;
            bh11 bh11Var = aVar.l;
            if (bh11Var != null) {
                aVar.g.removeCallbacks(bh11Var);
                aVar.l = null;
            }
            Iterator it = aVar.h.iterator();
            while (it.hasNext()) {
                aVar.a((rw31) it.next());
            }
            Iterator it2 = aVar.i.iterator();
            while (it2.hasNext()) {
                aVar.a((rw31) it2.next());
            }
            uid uidVar = aVar.j;
            if (uidVar != null) {
                aVar.a.getViewTreeObserver().removeOnPreDrawListener(uidVar);
            }
            aVar.j = null;
        }
        view.setTag(2131361793, null);
    }
}
