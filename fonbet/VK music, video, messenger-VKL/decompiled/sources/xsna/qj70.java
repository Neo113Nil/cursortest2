package xsna;

import android.content.Context;
import kotlin.Lazy;
import xsna.sw50;

/* compiled from: NotificationsImpl.kt */
/* loaded from: classes4.dex */
public final class qj70 implements sw50.l {
    public final Object a;

    public qj70(Lazy<? extends zb70> lazy) {
        this.a = lazy;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.sw50.l
    public final void a(Context context) {
        zb70 zb70Var = (zb70) this.a.getValue();
        if (zb70Var != null) {
            zb70Var.a(context);
        }
    }
}
