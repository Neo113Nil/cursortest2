package xsna;

import android.content.Context;
import xsna.x2x0;

/* compiled from: VkVoipUiLauncherChooser.kt */
/* loaded from: classes7.dex */
public final class i1w0 implements x2x0 {
    public final Context a;
    public final w2x0 b;
    public final bpn0 c = new bpn0(new mll0(this, 19));

    public i1w0(Context context, w2x0 w2x0Var) {
        this.a = context;
        this.b = w2x0Var;
    }

    @Override // xsna.x2x0
    public final w2x0 a(x2x0.a aVar) {
        return aVar.a ? this.b : (h1w0) this.c.getValue();
    }
}
