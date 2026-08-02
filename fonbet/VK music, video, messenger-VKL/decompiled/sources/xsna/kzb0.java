package xsna;

import android.app.Activity;
import android.content.Context;
import java.util.HashSet;

/* compiled from: PortraitOrientationDelegate.kt */
/* loaded from: classes15.dex */
public final class kzb0 implements vds {
    public final boolean b;

    public kzb0() {
        c63 c63Var = c63.a;
        Activity b = c63.b();
        Context applicationContext = b != null ? b.getApplicationContext() : null;
        HashSet hashSet = iah0.a;
        this.b = fnj.b(applicationContext);
    }

    @Override // xsna.vds
    public final int Q0() {
        return this.b ? -1 : 12;
    }
}
