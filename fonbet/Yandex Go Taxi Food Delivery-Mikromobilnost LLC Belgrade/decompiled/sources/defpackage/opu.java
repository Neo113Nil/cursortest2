package defpackage;

import android.content.Context;
import android.view.View;
import com.yandex.plus.home.feature.webviews.internal.error.DefaultHomeErrorView;

/* loaded from: classes2.dex */
public final class opu implements z2d0 {
    public final z2d0 a;
    public final lld0 b;

    public opu(z2d0 z2d0Var, lld0 lld0Var) {
        this.a = z2d0Var;
        this.b = lld0Var;
    }

    public final View a(Context context, String str, sls slsVar) {
        z2d0 z2d0Var = this.a;
        return z2d0Var != null ? ((opu) z2d0Var).a(context, str, slsVar) : new DefaultHomeErrorView(context, this.b, slsVar);
    }
}
