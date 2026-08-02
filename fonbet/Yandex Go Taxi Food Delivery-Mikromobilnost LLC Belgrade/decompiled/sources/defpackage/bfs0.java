package defpackage;

import android.content.Context;
import com.pichillilorenzo.flutter_inappwebview_android.Util;

/* loaded from: classes15.dex */
public final class bfs0 extends zn50 {
    public final Context b;

    public bfs0(Context context) {
        this.b = context.getApplicationContext();
    }

    @Override // defpackage.zn50
    public final boolean a(xn50 xn50Var) {
        String scheme = xn50Var.b.getScheme();
        if ("content".equals(scheme)) {
            return true;
        }
        return "file".equals(scheme) && !xn50Var.b.toString().startsWith(Util.ANDROID_ASSET_URL);
    }

    @Override // defpackage.zn50
    public final ht10 c(xn50 xn50Var) {
        return new ht10(d5b1.h(this.b, xn50Var.b, xn50Var.i, xn50Var.j, xn50Var.k), (byte[]) null);
    }
}
