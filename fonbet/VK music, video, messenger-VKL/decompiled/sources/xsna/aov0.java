package xsna;

import com.vk.voip.VoipService;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class aov0 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ aov0(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        int i = this.b;
        izs izsVar = this.c;
        switch (i) {
            case 0:
                ((znv0) izsVar).invoke(obj);
                break;
            case 1:
                ((pe70) izsVar).invoke(obj);
                break;
            default:
                Object obj2 = VoipService.q;
                ((qjm0) izsVar).invoke(obj);
                break;
        }
    }
}
