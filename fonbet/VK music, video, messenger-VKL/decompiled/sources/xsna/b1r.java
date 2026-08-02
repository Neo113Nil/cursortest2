package xsna;

import android.app.Activity;
import android.content.Context;
import com.vk.common.links.LaunchContext;
import com.vk.dto.common.id.UserId;
import xsna.o0r0;

/* compiled from: FeedItemExternalNavigatorImpl.kt */
/* loaded from: classes17.dex */
public final class b1r implements a1r {
    public final qdz a;
    public final o0r0 b;

    public b1r(qdz qdzVar, o0r0 o0r0Var) {
        this.a = qdzVar;
        this.b = o0r0Var;
    }

    public final void a(Context context, String str) {
        this.a.getBrowser().f(context, null, LaunchContext.A, str);
    }

    @Override // xsna.a1r
    public final void b(Activity activity, int i, String str) {
        this.a.e().b(activity, i, str);
    }

    @Override // xsna.a1r
    public final void c(Activity activity, String str, String str2) {
        maz.c(this.a.e(), activity, str, new LaunchContext(false, false, false, str2, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, false, false, null, null, null, 67108855), null, null, 24);
    }

    @Override // xsna.a1r
    public final void d(Context context, UserId userId, boolean z) {
        this.b.m(context, userId, new o0r0.a(false, null, null, null, null, null, null, false, false, z, false, null, null, null, 64511));
    }
}
