package xsna;

import com.vk.core.native_loader.NativeLibLoader;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class z33 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ z33(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        switch (this.b) {
            case 0:
                ((com.vk.metrics.performance.power.b) this.c).invoke(obj);
                break;
            case 1:
                ((j67) this.c).invoke(obj);
                break;
            case 2:
                ((NativeLibLoader.f) this.c).invoke(obj);
                break;
            default:
                ((s56) this.c).invoke(obj);
                break;
        }
    }
}
