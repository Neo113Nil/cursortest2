package xsna;

import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.dto.common.Image;
import com.vk.ecomm.reviews.impl.allreviews.presentation.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.xs00;
import xsna.y2u0;

/* compiled from: MarketAllReviewsNavigator.kt */
/* loaded from: classes18.dex */
public final class ys00 {
    public final f4z a;

    public ys00(f4z f4zVar) {
        this.a = f4zVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v17, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v8, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.util.ArrayList] */
    public final void a(a.e eVar, ft00 ft00Var) {
        Object obj;
        List<List<BaseImageDto>> list;
        Object obj2;
        List<List<BaseImageDto>> list2;
        boolean z = eVar instanceof a.e.b;
        f4z f4zVar = this.a;
        ?? r2 = 0;
        r2 = 0;
        ?? r22 = 0;
        r2 = 0;
        if (z) {
            a.e.b bVar = (a.e.b) eVar;
            String str = bVar.c;
            int i = bVar.b;
            Iterator it = ft00Var.h.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                } else {
                    obj2 = it.next();
                    if (epx.f(((df10) obj2).d, str)) {
                        break;
                    }
                }
            }
            df10 df10Var = (df10) obj2;
            if (df10Var != null && (list2 = df10Var.o) != null) {
                List<List<BaseImageDto>> list3 = list2;
                r22 = new ArrayList(c5g.u(list3, 10));
                Iterator it2 = list3.iterator();
                while (it2.hasNext()) {
                    r22.add(y2u0.a.a((List) it2.next()));
                }
            }
            if (r22 == 0) {
                r22 = EmptyList.b;
            }
            Iterable iterable = (Iterable) r22;
            ArrayList arrayList = new ArrayList(c5g.u(iterable, 10));
            Iterator it3 = iterable.iterator();
            while (it3.hasNext()) {
                arrayList.add(new Image(((y2u0) it3.next()).b));
            }
            if (((Image) j5g.b0(i, arrayList)) != null) {
                f4zVar.b(new xs00.f(arrayList, i));
                return;
            }
            return;
        }
        if (!(eVar instanceof a.e.C1005a)) {
            throw new NoWhenBranchMatchedException();
        }
        a.e.C1005a c1005a = (a.e.C1005a) eVar;
        int i2 = c1005a.c;
        int i3 = c1005a.b;
        Iterator it4 = ft00Var.l.iterator();
        while (true) {
            if (!it4.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it4.next();
                if (((cf10) obj).a == i2) {
                    break;
                }
            }
        }
        cf10 cf10Var = (cf10) obj;
        if (cf10Var != null && (list = cf10Var.k) != null) {
            List<List<BaseImageDto>> list4 = list;
            r2 = new ArrayList(c5g.u(list4, 10));
            Iterator it5 = list4.iterator();
            while (it5.hasNext()) {
                r2.add(y2u0.a.a((List) it5.next()));
            }
        }
        if (r2 == 0) {
            r2 = EmptyList.b;
        }
        Iterable iterable2 = (Iterable) r2;
        ArrayList arrayList2 = new ArrayList(c5g.u(iterable2, 10));
        Iterator it6 = iterable2.iterator();
        while (it6.hasNext()) {
            arrayList2.add(new Image(((y2u0) it6.next()).b));
        }
        if (((Image) j5g.b0(i3, arrayList2)) != null) {
            f4zVar.b(new xs00.f(arrayList2, i3));
        }
    }
}
