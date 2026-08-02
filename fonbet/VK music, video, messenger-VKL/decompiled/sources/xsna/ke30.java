package xsna;

import android.content.Context;
import com.vk.common.links.LaunchContext;

/* compiled from: MovieLink.kt */
/* loaded from: classes14.dex */
public final class ke30 implements kss0 {
    public final boolean a = fxc0.B().J().A1();

    @Override // xsna.kss0
    public final boolean a(peq0 peq0Var) {
        return this.a && jh.h("/movies_serials/(\\d+)(?:-.*)?", peq0Var, null, null, 14);
    }

    @Override // xsna.kss0
    public final Boolean b(peq0 peq0Var, ydt0 ydt0Var, Context context, LaunchContext launchContext, yp80 yp80Var) {
        peq0Var.c(1);
        ydt0Var.getClass();
        return null;
    }
}
