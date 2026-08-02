package defpackage;

import android.view.KeyEvent;

/* loaded from: classes10.dex */
public final class mix extends e530 implements lix {
    public tls a;
    public tls b;

    @Override // defpackage.lix
    public final boolean o0(KeyEvent keyEvent) {
        tls tlsVar = this.a;
        if (tlsVar != null) {
            return ((Boolean) tlsVar.invoke(new eix(keyEvent))).booleanValue();
        }
        return false;
    }

    @Override // defpackage.lix
    public final boolean y(KeyEvent keyEvent) {
        tls tlsVar = this.b;
        if (tlsVar != null) {
            return ((Boolean) tlsVar.invoke(new eix(keyEvent))).booleanValue();
        }
        return false;
    }
}
