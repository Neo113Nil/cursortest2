package xsna;

import com.vk.dto.common.Image;
import com.vk.dto.common.id.UserId;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import xsna.p410;

/* compiled from: MarketItemReviewsReducer.kt */
/* loaded from: classes18.dex */
public final class r410 extends dm50<y410, p410, x410> {
    public final a510 d;

    public r410(a510 a510Var) {
        super(new x410(0));
        this.d = a510Var;
    }

    @Override // xsna.dm50
    public final x410 c(x410 x410Var, p410 p410Var) {
        x410 x410Var2 = x410Var;
        p410 p410Var2 = p410Var;
        Map<Integer, n210> map = x410Var2.k;
        if (p410Var2 instanceof p410.a) {
            p410.a aVar = (p410.a) p410Var2;
            return x410.a(x410Var2, null, 0L, null, null, 0, false, null, null, null, null, aVar.c, aVar.b, null, null, null, null, false, false, false, false, null, null, null, 0, null, null, null, null, false, false, null, null, -3073);
        }
        if (p410Var2 instanceof p410.i) {
            return x410.a(x410Var2, null, 0L, null, null, 0, false, null, null, null, null, false, false, null, null, null, null, false, false, false, ((p410.i) p410Var2).b, null, null, null, 0, null, null, null, null, false, false, null, null, -524289);
        }
        if (p410Var2 instanceof p410.e) {
            p410.e eVar = (p410.e) p410Var2;
            return x410.a(x410Var2, eVar.c, eVar.b, null, null, 0, false, null, null, null, null, false, false, null, null, null, null, false, false, false, false, null, null, null, 0, null, null, null, null, false, false, null, null, -4);
        }
        if (p410Var2 instanceof p410.c) {
            return x410.a(x410Var2, null, 0L, null, null, 0, false, null, null, null, null, false, false, null, null, null, null, true, false, false, false, null, null, null, 0, null, null, null, null, false, false, null, null, -1114113);
        }
        if (p410Var2 instanceof p410.d) {
            p410.d dVar = (p410.d) p410Var2;
            LinkedHashMap linkedHashMap = dVar.i;
            Image image = dVar.c;
            String str = dVar.b;
            int i = dVar.d;
            boolean z = dVar.e;
            String str2 = dVar.f;
            String str3 = dVar.g;
            Float f = dVar.h;
            int size = linkedHashMap.size();
            int size2 = linkedHashMap.size();
            String str4 = dVar.j;
            String str5 = dVar.k;
            Map<UserId, big0> map2 = dVar.l;
            UserId userId = dVar.m;
            return x410.a(x410Var2, null, 0L, image, str, i, z, str2, str3, f, linkedHashMap, false, false, str4, str5, dVar.n, dVar.o, false, false, false, false, null, null, null, size, Integer.valueOf(size2), userId, null, map2, dVar.p, dVar.q, dVar.r, dVar.s, 71568387);
        }
        if (p410Var2 instanceof p410.b) {
            return x410.a(x410Var2, null, 0L, null, null, 0, false, null, null, null, null, false, false, null, null, null, null, false, false, false, false, ((p410.b) p410Var2).b, null, null, 0, null, null, null, null, false, false, null, null, -1769473);
        }
        if (p410Var2 instanceof p410.g) {
            return x410.a(x410Var2, null, 0L, null, null, 0, false, null, null, null, null, false, false, null, null, null, null, false, true, false, false, null, null, null, 0, null, null, null, null, false, false, null, null, -3538945);
        }
        if (p410Var2 instanceof p410.f) {
            p410.f fVar = (p410.f) p410Var2;
            if (fVar instanceof p410.f.b) {
                return x410.a(x410Var2, null, 0L, null, null, 0, false, null, null, null, null, false, false, null, null, null, null, false, false, true, false, null, null, null, 0, null, null, null, null, false, false, null, null, -2359297);
            }
            if (!(fVar instanceof p410.f.c)) {
                if (fVar instanceof p410.f.a) {
                    return x410.a(x410Var2, null, 0L, null, null, 0, false, null, null, null, null, false, false, null, null, null, null, false, false, false, false, null, ((p410.f.a) fVar).b, null, 0, null, null, null, null, false, false, null, null, -2359297);
                }
                throw new NoWhenBranchMatchedException();
            }
            p410.f.c cVar = (p410.f.c) fVar;
            LinkedHashMap linkedHashMap2 = cVar.b;
            LinkedHashMap n = pn00.n(map, linkedHashMap2);
            int size3 = linkedHashMap2.size() + map.size();
            int size4 = linkedHashMap2.size();
            return x410.a(x410Var2, null, 0L, null, null, 0, false, null, null, null, n, false, false, null, null, null, null, false, false, false, false, null, null, null, size3, Integer.valueOf(size4), null, null, pn00.n(x410Var2.C, cVar.c), false, false, null, null, -159646209);
        }
        if (p410Var2 instanceof p410.j) {
            Map<Integer, n210> map3 = ((p410.j) p410Var2).b;
            return x410.a(x410Var2, null, 0L, null, null, 0, false, null, null, null, map3, false, false, null, null, null, null, false, false, false, false, null, null, null, map3.size(), null, null, null, null, false, false, null, null, -8913409);
        }
        if (p410Var2 instanceof p410.k) {
            return x410.a(x410Var2, null, 0L, null, null, 0, false, null, null, null, null, false, false, null, null, null, null, false, false, false, false, null, null, ((p410.k) p410Var2).b, 0, null, null, null, null, false, false, null, null, -4194305);
        }
        if (!(p410Var2 instanceof p410.h)) {
            throw new NoWhenBranchMatchedException();
        }
        p410.h hVar = (p410.h) p410Var2;
        if (!(hVar instanceof p410.h.b)) {
            if (hVar instanceof p410.h.a) {
                return x410.a(x410Var2, null, 0L, null, null, 0, false, null, null, null, null, false, false, null, null, null, null, false, false, false, false, null, null, null, 0, null, null, s410.a(x410Var2.B, null, null, null, null, 8), null, false, false, null, null, -67633153);
            }
            if (hVar instanceof p410.h.c) {
                return x410.a(x410Var2, null, 0L, null, null, 0, false, null, null, null, null, false, false, null, null, null, null, false, false, false, false, null, null, null, 0, null, null, s410.a(x410Var2.B, null, null, null, ((p410.h.c) hVar).b, 23), null, false, false, null, null, -67108865);
            }
            throw new NoWhenBranchMatchedException();
        }
        s410 s410Var = x410Var2.B;
        p410.h.b bVar = (p410.h.b) hVar;
        Integer num = bVar.b;
        Integer num2 = bVar.c;
        UserId userId2 = bVar.d;
        UserId userId3 = bVar.e;
        Long valueOf = Long.valueOf(bVar.f);
        s410Var.getClass();
        return x410.a(x410Var2, null, 0L, null, null, 0, false, null, null, null, null, false, false, null, null, null, null, false, false, false, false, null, null, null, 0, null, null, new s410(num, num2, userId2, userId3, valueOf), null, false, false, null, null, -67108865);
    }

    @Override // xsna.dm50
    public final y410 d() {
        return new y410(e(new hxl(this, 17)), e(new l8k(16)), e(new ekh(this, 16)), e(new d0k(13)));
    }

    @Override // xsna.dm50
    public final void h(x410 x410Var, y410 y410Var) {
        x410 x410Var2 = x410Var;
        y410 y410Var2 = y410Var;
        Throwable th = x410Var2.v;
        if (x410Var2.r) {
            f(y410Var2.b, x410Var2);
            return;
        }
        if (x410Var2.k.isEmpty() && th == null) {
            f(y410Var2.c, x410Var2);
        } else if (th != null) {
            f(y410Var2.d, x410Var2);
        } else {
            f(y410Var2.a, x410Var2);
        }
    }
}
