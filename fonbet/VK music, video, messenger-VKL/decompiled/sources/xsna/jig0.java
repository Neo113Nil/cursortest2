package xsna;

import com.vk.catalog.mvi.block.impl.slider.SliderView;
import xsna.ikv0;
import xsna.loh0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class jig0 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ jig0(SliderView.BlockView blockView, a8a a8aVar, SliderView.f fVar, izs izsVar, ksr ksrVar, q630 q630Var, int i) {
        this.b = 1;
        this.f = blockView;
        this.g = a8aVar;
        this.h = fVar;
        this.c = izsVar;
        this.i = ksrVar;
        this.d = q630Var;
        this.e = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                lig0.e((loh0.e.a) this.f, (r5j0) this.g, (izs) this.c, (mtk0) this.h, (q630) this.d, (q630) this.i, (androidx.compose.runtime.a) obj, ne7.I(this.e | 1));
                break;
            case 1:
                ((Integer) obj2).intValue();
                ((SliderView.BlockView) this.f).b((a8a) this.g, (SliderView.f) this.h, (izs) this.c, (ksr) this.i, (q630) this.d, (androidx.compose.runtime.a) obj, ne7.I(this.e | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                ((a9k0) this.f).c((dlv0) this.g, (ikv0.d) this.c, (rv5) this.h, (ikv0.c) this.d, (ikv0.e) this.i, (androidx.compose.runtime.a) obj, ne7.I(this.e | 1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ jig0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i, int i2) {
        this.b = i2;
        this.f = obj;
        this.g = obj2;
        this.c = obj3;
        this.h = obj4;
        this.d = obj5;
        this.i = obj6;
        this.e = i;
    }
}
