package xsna;

import android.content.Context;
import com.vk.dto.common.id.UserId;
import com.vk.webapp.fragments.ReportFragment;

/* compiled from: ReportFragmentRouterImpl.kt */
/* loaded from: classes5.dex */
public final class o5g0 implements n5g0 {
    @Override // xsna.n5g0
    public final void a(int i, Context context, UserId userId) {
        int i2 = ReportFragment.a0;
        ReportFragment.a a = ReportFragment.b.a();
        a.K("market_comment");
        a.I("market_comment");
        a.D(i);
        a.G(userId);
        a.k(context);
    }

    @Override // xsna.n5g0
    public final void b(int i, Context context, UserId userId) {
        int i2 = ReportFragment.a0;
        ReportFragment.a a = ReportFragment.b.a();
        a.D(i);
        a.G(userId);
        a.K("item_review");
        a.s(true);
        a.k(context);
    }

    @Override // xsna.n5g0
    public final void c(Context context, String str, String str2, UserId userId, long j) {
        int i = ReportFragment.a0;
        ReportFragment.a a = ReportFragment.b.a();
        a.K(str);
        if (str2 != null) {
            a.I(str2);
        }
        a.G(userId);
        a.D(j);
        a.k(context);
    }

    @Override // xsna.n5g0
    public final void d(int i, Context context, UserId userId) {
        int i2 = ReportFragment.a0;
        ReportFragment.a a = ReportFragment.b.a();
        a.D(i);
        a.G(userId);
        a.K("community_review");
        a.s(true);
        a.k(context);
    }
}
