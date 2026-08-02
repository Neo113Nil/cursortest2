package xsna;

import com.vk.voip.VoipCallActivity;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class l8u0 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ l8u0(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        int i = this.b;
        izs izsVar = this.c;
        switch (i) {
            case 0:
                ((snj0) izsVar).invoke(obj);
                break;
            case 1:
                ((i2s0) izsVar).invoke(obj);
                break;
            case 2:
                int i2 = VoipCallActivity.P;
                ((b8j0) izsVar).invoke(obj);
                break;
            default:
                ((meh) izsVar).invoke(obj);
                break;
        }
    }
}
