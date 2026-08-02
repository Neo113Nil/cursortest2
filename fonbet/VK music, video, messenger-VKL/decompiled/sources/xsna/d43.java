package xsna;

import com.vk.metrics.performance.power.PowerConsumptionChecker;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class d43 implements io.reactivex.rxjava3.functions.l {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ d43(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public final Object apply(Object obj) {
        switch (this.b) {
            case 0:
                return (PowerConsumptionChecker.b) ((c43) this.c).invoke(obj);
            default:
                return (it80) ((qo70) this.c).invoke(obj);
        }
    }
}
