package xsna;

import android.content.Context;
import com.vk.common.links.LaunchContext;

/* compiled from: LiveCategoryLink.kt */
/* loaded from: classes14.dex */
public final class miz implements kss0 {
    @Override // xsna.kss0
    public final boolean a(peq0 peq0Var) {
        return jh.h("/lives/categories/([-a-zA-Z0-9]+)", peq0Var, null, null, 14);
    }

    @Override // xsna.kss0
    public final Boolean b(peq0 peq0Var, ydt0 ydt0Var, Context context, LaunchContext launchContext, yp80 yp80Var) {
        peq0Var.l();
        if (e3m.h(context) == null) {
            return null;
        }
        String str = launchContext.d;
        peq0Var.a.toString();
        ydt0Var.getClass();
        return null;
    }
}
