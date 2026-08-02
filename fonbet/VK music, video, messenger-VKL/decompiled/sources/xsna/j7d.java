package xsna;

import com.vk.catalog.mvi.block.video.impl.p002short.ClipListView;
import com.vk.donut.design.compose.banner.DonutBannerKt;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class j7d implements wzs {
    public final /* synthetic */ int b = 2;
    public final /* synthetic */ xzs c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ j7d(int i, wzs wzsVar, jai jaiVar, jai jaiVar2, wzs wzsVar2, zpx0 zpx0Var, jai jaiVar3, int i2) {
        this.d = i;
        this.e = wzsVar;
        this.f = jaiVar;
        this.g = jaiVar2;
        this.c = wzsVar2;
        this.h = zpx0Var;
        this.i = jaiVar3;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).intValue();
                ((ClipListView.a) this.e).c((a8a) this.f, (ClipListView.c) this.g, (izs) this.c, (ksr) this.h, (q630) this.i, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                DonutBannerKt.e((String) this.e, (gzs) this.f, (String) this.g, (String) this.h, (gzs) this.i, (izs) this.c, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                int I = ne7.I(24577);
                a4h0.c(this.d, (wzs) this.e, (jai) this.f, (jai) this.g, (wzs) this.c, (zpx0) this.h, (jai) this.i, (androidx.compose.runtime.a) obj, I);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ j7d(ClipListView.a aVar, a8a a8aVar, ClipListView.c cVar, izs izsVar, ksr ksrVar, q630 q630Var, int i) {
        this.e = aVar;
        this.f = a8aVar;
        this.g = cVar;
        this.c = izsVar;
        this.h = ksrVar;
        this.i = q630Var;
        this.d = i;
    }

    public /* synthetic */ j7d(String str, gzs gzsVar, String str2, String str3, gzs gzsVar2, izs izsVar, int i) {
        this.e = str;
        this.f = gzsVar;
        this.g = str2;
        this.h = str3;
        this.i = gzsVar2;
        this.c = izsVar;
        this.d = i;
    }
}
