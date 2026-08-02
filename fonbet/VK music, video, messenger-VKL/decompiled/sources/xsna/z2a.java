package xsna;

import android.app.ActivityManager;
import android.content.Context;

/* compiled from: CatalogCacheDelegate.kt */
/* loaded from: classes16.dex */
public final class z2a implements d740 {
    public final Object a;
    public final Object b;

    public /* synthetic */ z2a(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // xsna.d740
    public void a(String str) {
        d740 d740Var = (d740) this.b;
        if (d740Var != null) {
            d740Var.a(str);
            return;
        }
        w2a w2aVar = (w2a) this.a;
        if (w2aVar != null) {
            w2aVar.clear();
        }
    }

    @Override // xsna.d740
    public io.reactivex.rxjava3.core.q b(String str) {
        io.reactivex.rxjava3.core.q<hda> b;
        d740 d740Var = (d740) this.b;
        if (d740Var != null && (b = d740Var.b(str)) != null) {
            return b;
        }
        w2a w2aVar = (w2a) this.a;
        return w2aVar != null ? w2aVar.a() : io.reactivex.rxjava3.internal.operators.observable.g0.b;
    }

    @Override // xsna.d740
    public void c(String str, hda hdaVar) {
        d740 d740Var = (d740) this.b;
        if (d740Var != null) {
            d740Var.c(str, hdaVar);
            return;
        }
        w2a w2aVar = (w2a) this.a;
        if (w2aVar != null) {
            w2aVar.b(hdaVar);
        }
    }

    public int d() {
        int i = ((b25) this.b).d0().b;
        return i < 0 ? ((ActivityManager) ((Context) this.a).getSystemService("activity")).getMemoryClass() > 64 ? 1 : 0 : i;
    }
}
