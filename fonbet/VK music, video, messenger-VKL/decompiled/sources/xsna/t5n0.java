package xsna;

import com.vk.stickers.views.animation.VKAnimationView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class t5n0 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ t5n0(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        int i = this.b;
        izs izsVar = this.c;
        switch (i) {
            case 0:
                ((rvq) izsVar).invoke(obj);
                break;
            case 1:
                ((tn0) izsVar).invoke(obj);
                break;
            case 2:
                int i2 = VKAnimationView.w;
                ((tzq0) izsVar).invoke(obj);
                break;
            case 3:
                ((ync) izsVar).invoke(obj);
                break;
            default:
                ((g99) izsVar).invoke(obj);
                break;
        }
    }
}
