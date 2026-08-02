package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.ecomm.reviews.model.reviewfriends.ReviewFriendsModel;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.a7f0;
import xsna.ehg0;
import xsna.phg0;
import xsna.sss;

/* compiled from: ReviewFriendsFeature.kt */
/* loaded from: classes18.dex */
public final class ohg0 extends wk50<uhg0, thg0, ehg0, phg0> {
    public final v7x f;
    public final UserId g;
    public final f4z h;

    public ohg0(shg0 shg0Var, v7x v7xVar, UserId userId) {
        super(ehg0.a.b, shg0Var);
        this.f = v7xVar;
        this.g = userId;
        this.h = new f4z();
    }

    @Override // xsna.wk50
    public final void N(thg0 thg0Var, ehg0 ehg0Var) {
        Object obj;
        Integer num;
        thg0 thg0Var2 = thg0Var;
        ehg0 ehg0Var2 = ehg0Var;
        if (ehg0Var2 instanceof ehg0.a) {
            U();
            return;
        }
        boolean z = ehg0Var2 instanceof ehg0.d;
        f4z f4zVar = this.h;
        if (!z) {
            if (ehg0Var2 instanceof ehg0.f) {
                V(thg0Var2);
                return;
            }
            if (ehg0Var2 instanceof ehg0.e) {
                V(thg0Var2);
                return;
            } else if (ehg0Var2 instanceof ehg0.b) {
                f4zVar.b(sss.a.a);
                return;
            } else {
                if (!(ehg0Var2 instanceof ehg0.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                U();
                return;
            }
        }
        ehg0.d dVar = (ehg0.d) ehg0Var2;
        Iterator<T> it = thg0Var2.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((ReviewFriendsModel) obj).b.b == dVar.b) {
                    break;
                }
            }
        }
        ReviewFriendsModel reviewFriendsModel = (ReviewFriendsModel) obj;
        if (reviewFriendsModel == null || (num = reviewFriendsModel.f) == null) {
            return;
        }
        f4zVar.b(new sss.b(this.g, num.intValue()));
    }

    public final void U() {
        T(phg0.e.b);
        a7f0.a.f(this, io.reactivex.rxjava3.core.x.B(rsg0.w0(yfb.x(((yd10) this.f.c).o(fkq0.a(this.g), 0))), io.reactivex.rxjava3.core.x.t(1L, TimeUnit.SECONDS), new xb20(new vx7((byte) 0, 4), 12)).l(new qw80(new i0r(16), 7)), new v4w(this, 25), new eiz(this, 27), 1);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [T, java.util.List<com.vk.ecomm.reviews.model.reviewfriends.ReviewFriendsModel>] */
    public final void V(thg0 thg0Var) {
        T(phg0.d.b);
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = thg0Var.c;
        a7f0.a.f(this, rsg0.w0(yfb.x(((yd10) this.f.c).o(fkq0.a(this.g), Integer.valueOf(thg0Var.i)))).l(new or20(new qz40(ref$ObjectRef, 20), 11)), new fv90(this, 20), new by5(24, this, ref$ObjectRef), 1);
    }
}
