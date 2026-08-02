package xsna;

import android.content.Context;
import com.vk.dto.common.id.UserId;
import com.vk.topics.impl.fragments.BoardTopicsFragment;

/* compiled from: TopicsRouterImpl.kt */
/* loaded from: classes11.dex */
public final class q9p0 implements n9p0 {
    @Override // xsna.n9p0
    public final void a(Context context, UserId userId, boolean z) {
        BoardTopicsFragment.b bVar = new BoardTopicsFragment.b(userId);
        bVar.y(z);
        bVar.k(context);
    }

    @Override // xsna.n9p0
    public final boolean b(int i, int i2, Context context, UserId userId, yp80 yp80Var) {
        new io.reactivex.rxjava3.internal.operators.observable.c0(hg1.m(rsg0.y0(new ai7(userId, i), null, null, 3), context, 0L, false, 62), io.reactivex.rxjava3.internal.functions.a.d, new nq80(yp80Var, 1)).subscribe(new p9p0(new o9p0(i, i2, context, userId, yp80Var), 0), new q440(new gj80(yp80Var, 24), 23));
        return true;
    }
}
