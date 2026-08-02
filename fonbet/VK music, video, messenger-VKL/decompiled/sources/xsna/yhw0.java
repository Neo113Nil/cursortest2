package xsna;

import com.vk.voip.VoipService;
import xsna.ivw0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class yhw0 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ yhw0(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        int i = this.b;
        izs izsVar = this.c;
        switch (i) {
            case 0:
                ((zu1) izsVar).invoke(obj);
                break;
            case 1:
                ((ivw0.b) izsVar).invoke(obj);
                break;
            default:
                Object obj2 = VoipService.q;
                ((odg) izsVar).invoke(obj);
                break;
        }
    }
}
