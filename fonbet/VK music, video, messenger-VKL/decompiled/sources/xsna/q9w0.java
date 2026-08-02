package xsna;

import com.vk.voip.VoipCallActivity;
import xsna.l5x0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class q9w0 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ q9w0(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        int i = this.b;
        izs izsVar = this.c;
        switch (i) {
            case 0:
                ((kpk0) izsVar).invoke(obj);
                break;
            case 1:
                int i2 = VoipCallActivity.P;
                ((yjs0) izsVar).invoke(obj);
                break;
            default:
                ((l5x0.a) izsVar).invoke(obj);
                break;
        }
    }
}
