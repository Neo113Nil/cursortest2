package xsna;

import com.vk.voip.VoipService;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class xhw0 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ xhw0(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        int i = this.b;
        izs izsVar = this.c;
        switch (i) {
            case 0:
                ((ed5) izsVar).invoke(obj);
                break;
            default:
                Object obj2 = VoipService.q;
                ((u19) izsVar).invoke(obj);
                break;
        }
    }
}
