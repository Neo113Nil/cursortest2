package xsna;

import android.content.Context;
import com.facebook.soloader.MinElf;
import com.vk.common.links.LaunchContext;
import com.vk.dto.common.Image;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.reviews.api.model.ReviewsActionType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import xsna.kjf0;
import xsna.o0r0;

/* compiled from: MarketItemReviewItemClickListener.kt */
/* loaded from: classes18.dex */
public final class i210 implements h780 {
    public final y4u a;
    public final Context b;
    public final cxo c;

    public i210(y4u y4uVar, Context context, cxo cxoVar) {
        this.a = y4uVar;
        this.b = context;
        this.c = cxoVar;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.h780
    public final void a(UserId userId) {
        ((o0r0) this.c.a.c0.getValue()).m(this.b, userId, new o0r0.a(false, null, null, null, null, null, null, false, false, false, false, null, null, null, MinElf.PN_XNUM));
    }

    @Override // xsna.h780
    public final void b(int i, long j) {
        UserId userId;
        c4u a = this.a.a();
        a.getClass();
        cxo cxoVar = this.c;
        h010 h010Var = cxoVar.f;
        if (h010Var == null || (userId = h010Var.c) == null) {
            userId = UserId.d;
        }
        io.reactivex.rxjava3.core.x d = a.a.d(userId, j, i);
        Context context = this.b;
        hg1.n(d, context, false, null, 62).m(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new tts(new b4u(cxoVar, a, i), 3), new com.vk.im.ui.components.dialogs_list.b(new p4f(context, 28), 26));
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.h780
    public final void c(f210 f210Var) {
        boolean f = epx.f(f210Var.a, this.a.e0.c());
        ListBuilder e = e43.e();
        if (f210Var.d.length() > 0) {
            e.add(ReviewsActionType.ACTION_COPY_TEXT);
        }
        if (!f) {
            e.add(ReviewsActionType.ACTION_REPORT);
        }
        if (f210Var.e) {
            e.add(ReviewsActionType.ACTION_EDIT);
        }
        if (f210Var.f) {
            e.add(ReviewsActionType.ACTION_DELETE);
        }
        ListBuilder g = e.g();
        by5 by5Var = new by5(18, this, f210Var);
        if (g.isEmpty()) {
            return;
        }
        ((ajg0) this.c.a.S.getValue()).k(g, by5Var, this.b);
    }

    @Override // xsna.h780
    public final void e() {
        String str;
        cxo cxoVar = this.c;
        h8u h8uVar = cxoVar.J;
        if (h8uVar == null || (str = h8uVar.n) == null) {
            return;
        }
        maz.c(cxoVar.a.b(), this.b, str, LaunchContext.A, null, null, 24);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.h780
    public final void f(int i) {
        cxo cxoVar = this.c;
        h8u h8uVar = cxoVar.J;
        a5u a5uVar = cxoVar.c;
        if (h8uVar != null) {
            ((i8u) this.a.g0.getValue()).getClass();
            List<hfz> list = h8uVar.j;
            ArrayList arrayList = new ArrayList(c5g.u(list, 10));
            for (hfz hfzVar : list) {
                if (epx.f(hfzVar.getItemId(), Integer.valueOf(i)) && (hfzVar instanceof u7u)) {
                    u7u u7uVar = (u7u) hfzVar;
                    ugg0 ugg0Var = u7uVar.i;
                    odo0 odo0Var = ugg0Var.c;
                    hfzVar = new u7u(u7uVar.b, u7uVar.c, u7uVar.d, u7uVar.e, u7uVar.f, u7uVar.g, u7uVar.h, new ugg0(ugg0Var.a, ugg0Var.b, new odo0(odo0Var.a, odo0Var.b, true ^ odo0Var.c), ugg0Var.d), u7uVar.j);
                }
                arrayList.add(hfzVar);
            }
            h8u c = h8u.c(h8uVar, arrayList, 524031);
            cxoVar.J = c;
            a5uVar.a(cxoVar, kjf0.a.c(25, c));
            a5uVar.a(cxoVar, kjf0.a.c(30, new q310(rl3.I(new c8u[]{cxoVar.J, cxoVar.K}))));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v4, types: [xsna.ajg0] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v4, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    @Override // xsna.h780
    public final void g(int i, int i2) {
        ?? r3;
        Object obj;
        ugg0 ugg0Var;
        List<y2u0> list;
        cxo cxoVar = this.c;
        h8u h8uVar = cxoVar.J;
        if (h8uVar != null) {
            ?? r0 = (ajg0) cxoVar.a.S.getValue();
            List<hfz> list2 = h8uVar.j;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list2) {
                if (obj2 instanceof u7u) {
                    arrayList.add(obj2);
                }
            }
            Iterator it = arrayList.iterator();
            while (true) {
                r3 = 0;
                r3 = 0;
                r3 = 0;
                if (it.hasNext()) {
                    obj = it.next();
                    if (((u7u) obj).b == i2) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            u7u u7uVar = (u7u) obj;
            if (u7uVar != null && (ugg0Var = u7uVar.i) != null && (list = ugg0Var.a) != null) {
                List<y2u0> list3 = list;
                r3 = new ArrayList(c5g.u(list3, 10));
                Iterator it2 = list3.iterator();
                while (it2.hasNext()) {
                    r3.add(new Image(((y2u0) it2.next()).b));
                }
            }
            if (r3 == 0) {
                r3 = EmptyList.b;
            }
            r0.r(i, this.b, r3);
        }
    }

    @Override // xsna.h780
    public final void d(UserId userId, long j, int i) {
    }
}
