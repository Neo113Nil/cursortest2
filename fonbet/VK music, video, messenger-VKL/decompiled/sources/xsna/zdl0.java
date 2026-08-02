package xsna;

import com.vk.superapp.advertisement.api.dto.BannerAdUiData;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class zdl0 implements wzs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ zdl0(List list, izs izsVar, gzs gzsVar, q630 q630Var, int i) {
        this.c = list;
        this.d = izsVar;
        this.e = gzsVar;
        this.f = q630Var;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                bel0 bel0Var = (bel0) this.c;
                ydl0 ydl0Var = (ydl0) this.d;
                uh0 uh0Var = (uh0) this.e;
                BannerAdUiData bannerAdUiData = (BannerAdUiData) this.f;
                bel0Var.v(ydl0Var, (String) uh0Var.b, ((Integer) obj).intValue(), ((Integer) obj2).intValue(), bannerAdUiData);
                break;
            default:
                ((Integer) obj2).getClass();
                yvn0.b((List) this.c, (izs) this.d, (gzs) this.e, (q630) this.f, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ zdl0(bel0 bel0Var, ydl0 ydl0Var, uh0 uh0Var, BannerAdUiData bannerAdUiData) {
        this.c = bel0Var;
        this.d = ydl0Var;
        this.e = uh0Var;
        this.f = bannerAdUiData;
    }
}
