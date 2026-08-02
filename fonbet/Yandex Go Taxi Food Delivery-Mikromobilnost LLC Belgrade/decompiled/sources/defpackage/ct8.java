package defpackage;

import android.util.Log;

/* loaded from: classes4.dex */
public final class ct8 implements lr41 {
    public final /* synthetic */ gt8 b;

    public ct8(gt8 gt8Var) {
        this.b = gt8Var;
    }

    @Override // defpackage.lr41
    public final void error(String str, Throwable th) {
        dt8 dt8Var = this.b.b;
        if (th != null) {
            Log.e("Care_SDK", str, th);
        } else {
            Log.e("Care_SDK", str);
        }
    }
}
