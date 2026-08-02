package xsna;

import com.vk.musc.kidsmode.api.KidsModeRestrictionRenderer;
import xsna.hmd0;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class kiy implements wzs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ gzs c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ kiy(KidsModeRestrictionRenderer.Source source, gzs gzsVar, Integer num, gzs gzsVar2, int i) {
        this.e = source;
        this.c = gzsVar;
        this.g = num;
        this.f = gzsVar2;
        this.d = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                liy.a((KidsModeRestrictionRenderer.Source) this.e, this.c, (Integer) this.g, (gzs) this.f, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                fjd0.b((hmd0.a) this.e, (hmd0.a) this.f, (izs) this.g, this.c, q630.a.a, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ kiy(hmd0.a aVar, hmd0.a aVar2, izs izsVar, gzs gzsVar, int i) {
        this.e = aVar;
        this.f = aVar2;
        this.g = izsVar;
        this.c = gzsVar;
        this.d = i;
    }
}
