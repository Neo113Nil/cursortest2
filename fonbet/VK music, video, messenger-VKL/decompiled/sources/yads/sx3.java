package yads;

import android.webkit.WebView;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes10.dex */
public final class sx3 implements Runnable {
    public final /* synthetic */ float b;
    public final /* synthetic */ ux3 c;

    public sx3(ux3 ux3Var, float f) {
        this.c = ux3Var;
        this.b = f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        ny3 ny3Var = this.c.b.e;
        float f = this.b;
        ny3Var.a = f;
        if (ny3Var.e == null) {
            ny3Var.e = rx3.c;
        }
        Iterator it = Collections.unmodifiableCollection(ny3Var.e.b).iterator();
        while (it.hasNext()) {
            ka kaVar = ((ax3) it.next()).e;
            my3.a.a((WebView) kaVar.b.get(), "setDeviceVolume", Float.valueOf(f), kaVar.a);
        }
    }
}
