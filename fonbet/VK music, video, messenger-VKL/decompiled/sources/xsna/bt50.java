package xsna;

import android.view.View;
import com.ironsource.X3;
import xsna.j11;
import xsna.kel0;
import xsna.ydl0;
import xsna.zu50;

/* compiled from: MyTargetStickyBannerNativeAd.kt */
/* loaded from: classes6.dex */
public final class bt50 implements zu50.c {
    public final /* synthetic */ ct50 a;

    public bt50(ct50 ct50Var) {
        this.a = ct50Var;
    }

    @Override // xsna.zu50.c
    public final void a(View view, zu50 zu50Var) {
        ydl0.a aVar = this.a.b;
        if (aVar != null) {
            aVar.onClick();
        }
    }

    @Override // xsna.zu50.c
    public final void b(zu50 zu50Var) {
        ydl0.a aVar = this.a.b;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // xsna.zu50.c
    public final void c(iaz0 iaz0Var, zu50 zu50Var) {
        ydl0.a aVar = this.a.b;
        if (aVar != null) {
            aVar.b(new j11.b(iaz0Var.a, iaz0Var.b));
        }
    }

    @Override // xsna.zu50.c
    public final void d(cw50 cw50Var, zu50 zu50Var) {
        kiw kiwVar = cw50Var.v;
        int i = kiwVar != null ? kiwVar.b : 0;
        int i2 = kiwVar != null ? kiwVar.c : 0;
        float f = i == i2 ? 1.0f : i / i2;
        String str = cw50Var.g;
        if (str == null) {
            str = "";
        }
        ydl0.b.AbstractC4094b.a aVar = new ydl0.b.AbstractC4094b.a(new kel0.a(str, cw50Var.i, cw50Var.j, cw50Var.n, cw50Var.h, cw50Var.o, cw50Var.l, epx.f(cw50Var.a, X3.i.U), cw50Var.c, cw50Var.d, f));
        ct50 ct50Var = this.a;
        ct50Var.d = aVar;
        ydl0.a aVar2 = ct50Var.b;
        if (aVar2 != null) {
            aVar2.c(ct50Var, aVar);
        }
    }

    @Override // xsna.zu50.c
    public final void onClick() {
        ydl0.a aVar = this.a.b;
        if (aVar != null) {
            aVar.onClick();
        }
    }

    @Override // xsna.zu50.c
    public final void onVideoComplete() {
    }

    @Override // xsna.zu50.c
    public final void onVideoPause() {
    }

    @Override // xsna.zu50.c
    public final void onVideoPlay() {
    }
}
