package xsna;

import com.vk.voip.VoipCallActivity;
import xsna.nlu0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class mlu0 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ mlu0(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        int i = this.b;
        izs izsVar = this.c;
        switch (i) {
            case 0:
                ((nlu0.a) izsVar).invoke(obj);
                break;
            case 1:
                ((sr8) izsVar).invoke(obj);
                break;
            case 2:
                ((ght0) izsVar).invoke(obj);
                break;
            case 3:
                int i2 = VoipCallActivity.P;
                ((ifw0) izsVar).invoke(obj);
                break;
            case 4:
                ((ifw0) izsVar).invoke(obj);
                break;
            default:
                ((prd0) izsVar).invoke(obj);
                break;
        }
    }
}
