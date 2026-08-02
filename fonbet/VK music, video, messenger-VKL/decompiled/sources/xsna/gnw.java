package xsna;

import android.graphics.drawable.Animatable;
import android.view.View;

/* compiled from: ImageViewerPage.kt */
/* loaded from: classes3.dex */
public final class gnw extends lqj {
    public final /* synthetic */ fnw b;

    public gnw(fnw fnwVar) {
        this.b = fnwVar;
    }

    @Override // xsna.lqj, xsna.kqj
    public final void b(String str, Throwable th) {
        fnw fnwVar = this.b;
        fnwVar.j = 2;
        View view = fnwVar.n;
        if (view != null) {
            view.setVisibility(0);
            fnwVar.m.setVisibility(8);
        }
    }

    @Override // xsna.kqj
    public final void e(String str, mjw mjwVar, Animatable animatable) {
        mjw mjwVar2 = mjwVar;
        fnw fnwVar = this.b;
        fnwVar.getCallback().d(fnwVar.getPosition());
        fnwVar.j = 1;
        fnwVar.m.setVisibility(0);
        View view = fnwVar.n;
        if (view != null) {
            view.setVisibility(8);
        }
        d7n d7nVar = new d7n(2, fnwVar, mjwVar2);
        fnwVar.k = d7nVar;
        fnwVar.post(d7nVar);
    }
}
