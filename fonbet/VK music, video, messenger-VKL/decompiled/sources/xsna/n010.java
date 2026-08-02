package xsna;

import android.os.Bundle;
import com.vk.comments.api.model.MarketItemCommentsArgs;
import com.vk.comments.core.BoardComment;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.a7f0;
import xsna.c110;
import xsna.d110;
import xsna.k010;
import xsna.m010;

/* compiled from: MarketItemCommentsFeature.kt */
/* loaded from: classes17.dex */
public final class n010 extends wk50<l110, k110, k010, d110> {
    public final a110 f;
    public final mzp0 g;
    public final MarketItemCommentsArgs h;
    public final f4z i;
    public final f4z j;

    public n010(Bundle bundle, a110 a110Var, mzp0 mzp0Var, e110 e110Var) {
        super(k010.c.b, e110Var);
        this.f = a110Var;
        this.g = mzp0Var;
        this.h = bundle != null ? (MarketItemCommentsArgs) bundle.getParcelable("MARKET_ITEM_COMMENTS_ARGS_KEY") : null;
        this.i = new f4z();
        this.j = new f4z();
    }

    @Override // xsna.wk50
    public final void N(k110 k110Var, k010 k010Var) {
        k110 k110Var2 = k110Var;
        k010 k010Var2 = k010Var;
        boolean z = k110Var2.h;
        boolean z2 = k110Var2.i;
        UserId userId = k110Var2.b;
        List<BoardComment> list = k110Var2.d;
        if (k010Var2 instanceof k010.c) {
            T(d110.a.c.b);
            U();
            return;
        }
        if (k010Var2 instanceof k010.j) {
            if (z2 || z) {
                return;
            }
            T(d110.a.b.b);
            U();
            return;
        }
        boolean z3 = k010Var2 instanceof k010.d;
        int i = 1;
        a110 a110Var = this.f;
        if (z3) {
            if (z) {
                return;
            }
            if ((k110Var2.j == null || k110Var2.m != 0) && !z2 && !k110Var2.l && list.size() < k110Var2.f) {
                T(d110.b.C2696b.b);
                a7f0.a.f(this, a110Var.c.a(k110Var2.m, 20, a110Var.b, a110Var.a), new com.vk.libvideo.design.view.video.a(19, this, k110Var2), new m1k(this, 22), 1);
                return;
            }
            return;
        }
        Object obj = null;
        if (k010Var2 instanceof k010.f) {
            k010.f fVar = (k010.f) k010Var2;
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((BoardComment) next).b == fVar.b.b) {
                    obj = next;
                    break;
                }
            }
            BoardComment boardComment = (BoardComment) obj;
            if (boardComment != null) {
                boardComment.s = true;
            }
            T(new d110.c(list));
            return;
        }
        if (k010Var2 instanceof k010.i) {
            ArrayList arrayList = new ArrayList(list);
            if (arrayList.size() <= 0) {
                T(new d110.c(arrayList));
                return;
            } else {
                int i2 = ((BoardComment) arrayList.get(0)).b;
                throw null;
            }
        }
        if (k010Var2 instanceof k010.e) {
            k010.e eVar = (k010.e) k010Var2;
            boolean z4 = eVar instanceof k010.e.a;
            f4z f4zVar = this.j;
            if (z4) {
                f4zVar.b(new c110.a(((k010.e.a) eVar).b, userId));
                return;
            }
            if (eVar instanceof k010.e.b) {
                f4zVar.b(new c110.b(((k010.e.b) eVar).b, userId));
                return;
            } else if (eVar instanceof k010.e.c) {
                f4zVar.b(new c110.c(userId, ((k010.e.c) eVar).b));
                return;
            } else {
                if (!(eVar instanceof k010.e.d)) {
                    throw new NoWhenBranchMatchedException();
                }
                f4zVar.b(new c110.d());
                return;
            }
        }
        if (k010Var2 instanceof k010.h) {
            int i3 = ((k010.h) k010Var2).b;
            a110Var.c.a.getClass();
            tfx tfxVar = new tfx("market.restoreComment", new defpackage.j0(23), new or(20));
            tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
            tfx.l(tfxVar, "comment_id", i3, 0, 0, 8);
            a7f0.a.f(this, rsg0.w0(yfb.x(tfxVar)).l(new lp0(new uuz(3), 27)), new wi6(k110Var2, this, i3, i), new gzn(13), 1);
            return;
        }
        boolean z5 = k010Var2 instanceof k010.b;
        f4z f4zVar2 = this.i;
        if (z5) {
            BoardComment boardComment2 = ((k010.b) k010Var2).b;
            T(new d110.d(Integer.valueOf(boardComment2.b)));
            f4zVar2.b(new m010.b(list.indexOf(boardComment2) + 1));
        } else if (k010Var2 instanceof k010.a) {
            T(new d110.d(null));
        } else {
            if (!(k010Var2 instanceof k010.g)) {
                throw new NoWhenBranchMatchedException();
            }
            BoardComment boardComment3 = ((k010.g) k010Var2).b;
            f4zVar2.b(new m010.c(boardComment3));
            C(new k010.b(boardComment3));
        }
    }

    public final void U() {
        MarketItemCommentsArgs marketItemCommentsArgs = this.h;
        if (marketItemCommentsArgs == null) {
            return;
        }
        mzp0 mzp0Var = this.g;
        if (mzp0Var != null) {
            mzp0Var.a();
        }
        a110 a110Var = this.f;
        h110 h110Var = a110Var.c;
        UserId userId = a110Var.a;
        long j = a110Var.b;
        yd10 yd10Var = h110Var.a;
        io.reactivex.rxjava3.internal.operators.observable.f0 w0 = rsg0.w0(yfb.x(yd10Var.n(userId, (int) j, 0, 20, h110Var.c)));
        long j2 = userId.b;
        StringBuilder sb = new StringBuilder();
        sb.append(j2);
        sb.append('_');
        sb.append(j);
        a7f0.a.f(this, io.reactivex.rxjava3.core.x.B(w0, rsg0.w0(yfb.x(yd10Var.C(Collections.singletonList(sb.toString())))).l(new nm3(new x90(27), 17)), new xl0(new cx(11, h110Var, userId), 26)), new bi0(23, this, marketItemCommentsArgs), new rop(this, 14), 1);
    }
}
