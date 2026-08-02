package yads;

import android.content.Context;
import com.yandex.div.core.DivConfiguration;
import xsna.epx;

/* loaded from: classes10.dex */
public final class c23 {
    public static DivConfiguration a(Context context, b23 b23Var, ai0 ai0Var) {
        oh0 oh0Var = new oh0(context);
        ah0 ah0Var = new ah0(new ch0(), new gh0(), new fh0(), new bh0(), new hh0(), new dh0());
        ci0 ci0Var = new ci0(ai0Var);
        qu2 a = gx2.a().a(context);
        return new DivConfiguration.Builder(oh0Var).divCustomContainerViewAdapter(ah0Var).typefaceProvider(epx.f(a != null ? Boolean.valueOf(tu2.a(a)) : null, Boolean.TRUE) ? new ui0(context) : new wi0(context)).extension(b23Var).extension(ci0Var).build();
    }
}
