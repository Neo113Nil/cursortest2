package xsna;

import android.app.Activity;
import android.content.Intent;
import xsna.bcw0;
import xsna.dcw0;
import xsna.icw0;

/* compiled from: VoiceRecognitionControllerImpl.kt */
/* loaded from: classes7.dex */
public final class fcw0 implements tb0 {
    public final /* synthetic */ bcw0 b;
    public final /* synthetic */ Object c;

    public fcw0(Activity activity, bcw0 bcw0Var) {
        this.b = bcw0Var;
        this.c = activity;
    }

    @Override // xsna.tb0
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i != 34) {
            return;
        }
        dcw0 dcw0Var = dcw0.a;
        dcw0.b f = dcw0.f(i, i2, intent);
        bcw0.a aVar = new bcw0.a(f != null ? f.a : null, icw0.a.a);
        bcw0 bcw0Var = this.b;
        bcw0Var.a(aVar);
        dcw0.b.remove(bcw0Var);
        ((aeg0) this.c).yk(this);
    }
}
