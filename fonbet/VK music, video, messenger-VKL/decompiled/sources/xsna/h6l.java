package xsna;

import com.vk.superapp.advertisement.api.dto.BannerAdUiData;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class h6l implements wzs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ h6l(uu20 uu20Var, izs izsVar, gzs gzsVar, gzs gzsVar2, int i) {
        this.c = uu20Var;
        this.d = izsVar;
        this.e = gzsVar;
        this.f = gzsVar2;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                r6l.c((uu20) this.c, (izs) this.d, (gzs) this.e, (gzs) this.f, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            default:
                ((bel0) this.c).v((ydl0) this.d, (String) this.e, ((Integer) obj).intValue(), ((Integer) obj2).intValue(), (BannerAdUiData) this.f);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ h6l(bel0 bel0Var, ydl0 ydl0Var, String str, BannerAdUiData bannerAdUiData) {
        this.c = bel0Var;
        this.d = ydl0Var;
        this.e = str;
        this.f = bannerAdUiData;
    }
}
