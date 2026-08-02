package defpackage;

import android.view.KeyEvent;

/* loaded from: classes10.dex */
public final class k8w extends e530 implements t5t0 {
    public tls a;

    public final boolean E0(KeyEvent keyEvent) {
        tls tlsVar = this.a;
        if (tlsVar != null) {
            return ((Boolean) tlsVar.invoke(new eix(keyEvent))).booleanValue();
        }
        return false;
    }
}
