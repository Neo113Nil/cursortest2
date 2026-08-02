package xsna;

import android.graphics.drawable.Drawable;

/* compiled from: PollBackgroundDrawables.kt */
/* loaded from: classes18.dex */
public final class saa0 implements tjo {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public saa0(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    @Override // xsna.tjo
    public final Drawable a(svf svfVar) {
        if (!(svfVar instanceof qvf)) {
            return null;
        }
        return new taa0(((qvf) svfVar).W3(), this.a, this.b, this.c, this.d);
    }

    @Override // xsna.tjo
    public final boolean b(svf svfVar) {
        return svfVar instanceof qvf;
    }
}
