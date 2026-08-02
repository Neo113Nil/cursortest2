package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.PhotoAlbum;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.hq1;
import xsna.lq1;

/* compiled from: AlbumsSettingsReducer.kt */
/* loaded from: classes4.dex */
public final class jq1 extends dm50<rq1, hq1, lq1> {
    public final s0e0 d;

    public jq1(UserId userId, s0e0 s0e0Var) {
        super(new lq1(null, lq1.a.b.a, null, userId));
        this.d = s0e0Var;
    }

    @Override // xsna.dm50
    public final lq1 c(lq1 lq1Var, hq1 hq1Var) {
        Collection collection;
        Collection collection2;
        lq1 lq1Var2 = lq1Var;
        hq1 hq1Var2 = hq1Var;
        Collection collection3 = lq1Var2.b;
        if (hq1Var2.equals(hq1.b.b)) {
            return lq1Var2;
        }
        if (hq1Var2 instanceof hq1.c) {
            hq1.c cVar = (hq1.c) hq1Var2;
            lq1.a.C3283a c3283a = new lq1.a.C3283a(cVar.b);
            return (cVar.c || (collection2 = collection3) == null || collection2.isEmpty()) ? lq1.a(lq1Var2, null, c3283a, null, 13) : lq1.a(lq1Var2, null, null, c3283a, 11);
        }
        if (hq1Var2 instanceof hq1.e) {
            return (((hq1.e) hq1Var2).b || (collection = collection3) == null || collection.isEmpty()) ? lq1.a(lq1Var2, null, lq1.a.b.a, null, 9) : lq1.a(lq1Var2, null, null, lq1.a.b.a, 9);
        }
        if (hq1Var2 instanceof hq1.d) {
            if (collection3 == null) {
                collection3 = EmptyList.b;
            }
            return lq1.a(lq1Var2, j5g.u0(((hq1.d) hq1Var2).b, collection3), null, null, 8);
        }
        if (hq1Var2 instanceof hq1.f) {
            return lq1.a(lq1Var2, ((hq1.f) hq1Var2).b, null, null, 12);
        }
        if (!(hq1Var2 instanceof hq1.a)) {
            throw new NoWhenBranchMatchedException();
        }
        if (collection3 == null) {
            collection3 = EmptyList.b;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : collection3) {
            if (!epx.f((PhotoAlbum) obj, ((hq1.a) hq1Var2).b)) {
                arrayList.add(obj);
            }
        }
        return lq1.a(lq1Var2, arrayList, null, null, 14);
    }

    @Override // xsna.dm50
    public final rq1 d() {
        return new rq1(e(new com.vk.movika.sdk.base.observable.g(this, 4)), e(new i8(4)));
    }

    @Override // xsna.dm50
    public final void h(lq1 lq1Var, rq1 rq1Var) {
        lq1 lq1Var2 = lq1Var;
        rq1 rq1Var2 = rq1Var;
        if (epx.f(lq1Var2.c, lq1.a.b.a)) {
            f(rq1Var2.b, lq1Var2);
        } else {
            f(rq1Var2.a, lq1Var2);
        }
    }
}
