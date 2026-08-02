package xsna;

import android.graphics.drawable.Drawable;

/* compiled from: PollBackgroundDrawables.kt */
/* loaded from: classes18.dex */
public final class urb0 implements tjo {
    public final /* synthetic */ int a;

    public urb0(int i) {
        this.a = i;
    }

    @Override // xsna.tjo
    public final Drawable a(svf svfVar) {
        if (svfVar instanceof qvf) {
            return new vrb0(((qvf) svfVar).W3(), this.a);
        }
        return null;
    }

    @Override // xsna.tjo
    public final boolean b(svf svfVar) {
        return svfVar instanceof qvf;
    }
}
