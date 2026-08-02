package xsna;

import com.vk.catalog.mvi.block.video.impl.video.largelisttablet.VideoLargeListTabletView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class xo1 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ a8a c;
    public final /* synthetic */ izs d;
    public final /* synthetic */ ksr e;
    public final /* synthetic */ q630 f;
    public final /* synthetic */ int g;
    public final /* synthetic */ m2a h;
    public final /* synthetic */ r2a i;

    public /* synthetic */ xo1(m2a m2aVar, a8a a8aVar, r2a r2aVar, izs izsVar, ksr ksrVar, q630 q630Var, int i, int i2) {
        this.b = i2;
        this.h = m2aVar;
        this.c = a8aVar;
        this.i = r2aVar;
        this.d = izsVar;
        this.e = ksrVar;
        this.f = q630Var;
        this.g = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).intValue();
                ((yo1) this.h).c(this.c, (vo1) this.i, this.d, this.e, this.f, (androidx.compose.runtime.a) obj, ne7.I(this.g | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                ((VideoLargeListTabletView.a) this.h).b(this.c, (VideoLargeListTabletView.d) this.i, this.d, this.e, this.f, (androidx.compose.runtime.a) obj, ne7.I(this.g | 1));
                break;
        }
        return s3q0.a;
    }
}
