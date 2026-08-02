package xsna;

import android.util.Log;
import com.ironsource.X3;
import java.util.Objects;

/* compiled from: ConnectionLogger.kt */
/* loaded from: classes8.dex */
public final class c4j implements i100 {
    public final int b;

    public c4j(int i, cdi cdiVar) {
        this.b = i;
    }

    @Override // xsna.i100
    public final void j(String str, gzs<String> gzsVar) {
        Objects.toString(gzsVar.invoke());
    }

    @Override // xsna.i100
    public final void k(gzs gzsVar) {
        Objects.toString(gzsVar.invoke());
    }

    @Override // xsna.i100
    public final void m(String str, gzs<String> gzsVar) {
        Log.e(str, X3.j.d + this.b + "] " + ((Object) gzsVar.invoke()));
    }

    @Override // xsna.i100
    public final void o(String str, gzs<String> gzsVar) {
        Objects.toString(gzsVar.invoke());
    }
}
