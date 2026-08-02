package xsna;

import com.vk.catalog.mvi.block.video.impl.p002short.draft.DraftShortVideoListView;
import xsna.fma;
import xsna.ima;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class nma implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ nma(m2a m2aVar, a8a a8aVar, r2a r2aVar, izs izsVar, ksr ksrVar, q630 q630Var, int i, int i2) {
        this.b = i2;
        this.d = m2aVar;
        this.e = a8aVar;
        this.f = r2aVar;
        this.g = izsVar;
        this.h = ksrVar;
        this.i = q630Var;
        this.c = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                ((oma) this.d).b((ima.a) this.e, (gzs) this.f, (hma) this.g, (kma) this.h, (fma.a) this.i, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 1:
                ((Integer) obj2).intValue();
                ((DraftShortVideoListView.a) this.d).b((a8a) this.e, (DraftShortVideoListView.d) this.f, (izs) this.g, (ksr) this.h, (q630) this.i, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                ((re30) this.d).b((a8a) this.e, (se30) this.f, (izs) this.g, (ksr) this.h, (q630) this.i, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ nma(oma omaVar, ima.a aVar, gzs gzsVar, hma hmaVar, kma kmaVar, fma.a aVar2, int i) {
        this.b = 0;
        this.d = omaVar;
        this.e = aVar;
        this.f = gzsVar;
        this.g = hmaVar;
        this.h = kmaVar;
        this.i = aVar2;
        this.c = i;
    }
}
