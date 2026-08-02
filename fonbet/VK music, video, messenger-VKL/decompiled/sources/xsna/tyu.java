package xsna;

import xsna.yyu;

/* compiled from: HeadphonesController.kt */
/* loaded from: classes.dex */
public final class tyu implements yyu.a {
    public final /* synthetic */ syu a;

    public tyu(syu syuVar) {
        this.a = syuVar;
    }

    @Override // xsna.yyu.a
    public final void a(boolean z) {
        xal xalVar = this.a.a;
        if (z || !xalVar.isPlaying()) {
            return;
        }
        xalVar.q(syu.d);
    }
}
