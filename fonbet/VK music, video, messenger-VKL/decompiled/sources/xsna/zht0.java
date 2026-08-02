package xsna;

import android.view.View;
import xsna.av20;
import xsna.xht0;

/* compiled from: VideoSpeedBottomSheet.kt */
/* loaded from: classes2.dex */
public final class zht0 implements av20.b<xht0.a> {
    public final /* synthetic */ xht0 a;

    public zht0(xht0 xht0Var) {
        this.a = xht0Var;
    }

    @Override // xsna.av20.b
    public final void a(View view, Object obj, int i, wmg wmgVar) {
        xht0 xht0Var = this.a;
        xht0Var.e.bk(new wht0(xht0Var.d, ((xht0.a) obj).b));
        xht0Var.b(view);
    }
}
