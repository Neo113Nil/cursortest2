package xsna;

import com.vk.video.ui.discovery.recommendations.b;
import kotlin.Pair;
import kotlin.Triple;
import xsna.l1o0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class aam0 implements io.reactivex.rxjava3.functions.l, io.reactivex.rxjava3.functions.m {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ aam0(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 0:
                return (Pair) ((viu) this.c).invoke(obj);
            case 1:
                return (t4n0) ((rgl0) this.c).invoke(obj);
            case 2:
                return (l1o0.a) ((k1o0) this.c).invoke(obj);
            case 3:
                return (Triple) ((nm1) this.c).invoke(obj);
            case 4:
                return (b.a) ((kgs0) this.c).invoke(obj);
            default:
                return (io.reactivex.rxjava3.core.b0) ((lxh0) this.c).invoke(obj);
        }
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        return ((Boolean) ((lxh0) this.c).invoke(obj)).booleanValue();
    }
}
