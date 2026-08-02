package defpackage;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.w;
import io.appmetrica.analytics.impl.C0553n3;

/* loaded from: classes7.dex */
public final class ap2 implements zeo, oey {
    public static Boolean c;
    public yeo a;
    public String b = "unknown";

    @w(Lifecycle.Event.ON_STOP)
    public final void onAppBackgrounded() {
        yeo yeoVar = this.a;
        if (yeoVar != null) {
            yeoVar.success(C0553n3.g);
        }
        this.b = C0553n3.g;
    }

    @w(Lifecycle.Event.ON_START)
    public final void onAppForegrounded() {
        yeo yeoVar = this.a;
        if (yeoVar != null) {
            yeoVar.success("foreground");
        }
        this.b = "foreground";
    }

    @Override // defpackage.zeo
    public final void onCancel(Object obj) {
        this.a = null;
    }

    @Override // defpackage.zeo
    public final void onListen(Object obj, xeo xeoVar) {
        this.a = (yeo) xeoVar;
    }
}
