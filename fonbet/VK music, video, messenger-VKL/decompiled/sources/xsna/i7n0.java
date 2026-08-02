package xsna;

import android.view.View;
import com.vk.log.L;
import xsna.bqx0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class i7n0 implements u080 {
    @Override // xsna.u080
    public final bqx0 b(View view, bqx0 bqx0Var) {
        String str = "SystemInsets{left=" + bqx0Var.b() + ", top=" + bqx0Var.d() + ", right=" + bqx0Var.c() + ", bottom=" + bqx0Var.a() + '}';
        StringBuilder sb = new StringBuilder("StableInsets{left=");
        bqx0.q qVar = bqx0Var.a;
        sb.append(qVar.l().a);
        sb.append(", top=");
        sb.append(qVar.l().b);
        sb.append(", right=");
        sb.append(qVar.l().c);
        sb.append(", bottom=");
        StringBuilder a = xe9.a("Applying window insets: systemInsets=", str, ", stableInsets=", vu5.b(sb, qVar.l().d, '}'), ", displayCutout=");
        a.append(qVar.h());
        L.e(a.toString());
        return bqx0.b;
    }
}
