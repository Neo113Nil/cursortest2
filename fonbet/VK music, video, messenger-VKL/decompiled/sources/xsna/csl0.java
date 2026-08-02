package xsna;

import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vk.log.L;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class csl0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ csl0(Object obj, boolean z, int i) {
        this.b = i;
        this.d = obj;
        this.c = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        int i2 = 14;
        boolean z = this.c;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                dsl0 dsl0Var = (dsl0) obj2;
                io.reactivex.rxjava3.internal.operators.single.o oVar = new io.reactivex.rxjava3.internal.operators.single.o(new io.reactivex.rxjava3.internal.operators.single.o(dsl0Var.b.a(true, "feed", null, null), new h4f0(new gqe0(dsl0Var, 9), 5)).m(asu0.a.d()), new o330(new qjl0(dsl0Var, 1), 16));
                int i3 = kwg0.a;
                oVar.subscribe(new iwg0(), new fl30(new t50(L.a, 14), 25));
                if (!z) {
                    dsl0Var.c.c(Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE);
                }
                return s3q0.a;
            default:
                sat0 sat0Var = (sat0) obj2;
                List list = (List) obj;
                List list2 = list;
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list2) {
                    if (obj3 instanceof AboutVideoItem.SimilarVideoRedesign) {
                        arrayList.add(obj3);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj4 : list2) {
                    if (!(((AboutVideoItem) obj4) instanceof AboutVideoItem.SimilarVideoRedesign)) {
                        arrayList2.add(obj4);
                    }
                }
                if (arrayList.isEmpty()) {
                    return io.reactivex.rxjava3.core.q.T(list);
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(arrayList.size());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    linkedHashMap.put(((AboutVideoItem.SimilarVideoRedesign) next).b.a.r1(), next);
                }
                return wjs0.b.L(new n8c0(new rat0(linkedHashMap, sat0Var, arrayList2, z), i2), false);
        }
    }
}
