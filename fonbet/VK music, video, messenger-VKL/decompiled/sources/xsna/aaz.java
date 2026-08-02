package xsna;

import android.app.Activity;
import android.view.View;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;

/* compiled from: LinkOpenHelperImpl.kt */
/* loaded from: classes17.dex */
public final class aaz implements z9z {
    public final View a;
    public final a1r b;

    public aaz(View view, a1r a1rVar) {
        this.a = view;
        this.b = a1rVar;
    }

    @Override // xsna.z9z
    public final void a(String str) {
        Activity L = blk.L(this.a);
        if (L == null) {
            return;
        }
        this.b.c(L, str, com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.CLIPS));
    }
}
