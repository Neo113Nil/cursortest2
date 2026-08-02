package defpackage;

import android.content.Context;
import com.google.firebase.a;

/* loaded from: classes.dex */
public final class hfo implements wvf0 {
    public final /* synthetic */ int a;
    public final m3w b;

    public /* synthetic */ hfo(m3w m3wVar, int i) {
        this.a = i;
        this.b = m3wVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        m3w m3wVar = this.b;
        switch (i) {
            case 0:
                return new gfo((zvf0) m3wVar.b);
            case 1:
                a aVar = (a) m3wVar.b;
                kzq0 kzq0Var = kzq0.a;
                return kzq0.a(aVar);
            default:
                return new e4z((Context) m3wVar.b);
        }
    }
}
