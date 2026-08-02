package xsna;

import android.content.Context;
import android.os.Looper;
import xsna.l65;
import xsna.p600;

/* compiled from: VkEsiaOAuthActivityDeps.kt */
/* loaded from: classes4.dex */
public final class yqu0 extends ajg {
    public final p600<l65> b;
    public final nxp c;
    public final Object[] d;

    public yqu0(Context context, boolean z) {
        p600.a aVar = p600.d;
        l65.d dVar = l65.d.a;
        aVar.getClass();
        p600<l65> p600Var = new p600<>(dVar, Looper.getMainLooper());
        this.b = p600Var;
        nxp nxpVar = new nxp(context);
        this.c = nxpVar;
        this.d = new Object[]{new t55(p600Var, new j6l0(this, 25)), new lmj0(p600Var, (io.reactivex.rxjava3.disposables.b) this.a.getValue(), z, nxpVar)};
    }
}
