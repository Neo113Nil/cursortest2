package xsna;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import org.chromium.net.NetError;
import xsna.bqx0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class rvt0 implements u080 {
    @Override // xsna.u080
    public final bqx0 b(View view, bqx0 bqx0Var) {
        bqx0.q qVar = bqx0Var.a;
        h4x i = qVar.i(129);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams.leftMargin = i.a;
        int i2 = i.d;
        marginLayoutParams.bottomMargin = i2;
        int i3 = i.c;
        marginLayoutParams.rightMargin = i3;
        marginLayoutParams.topMargin = wqx0.a(bqx0Var);
        view.setLayoutParams(marginLayoutParams);
        h4x i4 = qVar.i(129);
        h4x i5 = qVar.i(NetError.ERR_PROXY_CONNECTION_FAILED);
        int i6 = Build.VERSION.SDK_INT;
        bqx0.h gVar = i6 >= 36 ? new bqx0.g() : i6 >= 35 ? new bqx0.f() : i6 >= 34 ? new bqx0.e() : i6 >= 31 ? new bqx0.d() : i6 >= 30 ? new bqx0.c() : i6 >= 29 ? new bqx0.b() : new bqx0.a();
        gVar.d(129, h4x.c(i4.a - i.a, i4.b - i.b, i4.c - i3, i4.d - i2));
        gVar.d(NetError.ERR_PROXY_CONNECTION_FAILED, i5);
        return gVar.b();
    }
}
