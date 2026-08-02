package xsna;

import com.vk.catalog.mvi.block.music.impl.filters.MusicTabsFiltersView;
import xsna.yb70;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class l2a implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ izs d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ q630 f;
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ l2a(m2a m2aVar, a8a a8aVar, r2a r2aVar, izs izsVar, ksr ksrVar, q630 q630Var, int i, int i2) {
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
                ((m2a) this.h).a((a8a) this.c, (r2a) this.i, this.d, (ksr) this.e, this.f, (androidx.compose.runtime.a) obj, ne7.I(this.g | 1));
                break;
            case 1:
                ((Integer) obj2).intValue();
                ((MusicTabsFiltersView.a) this.h).b((a8a) this.c, (MusicTabsFiltersView.f) this.i, this.d, (ksr) this.e, this.f, (androidx.compose.runtime.a) obj, ne7.I(this.g | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                ((nc70) this.h).h((String) this.c, (yb70.f) this.i, (yb70.g) this.e, this.d, this.f, (androidx.compose.runtime.a) obj, ne7.I(this.g | 1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ l2a(nc70 nc70Var, String str, yb70.f fVar, yb70.g gVar, izs izsVar, q630 q630Var, int i) {
        this.b = 2;
        this.h = nc70Var;
        this.c = str;
        this.i = fVar;
        this.e = gVar;
        this.d = izsVar;
        this.f = q630Var;
        this.g = i;
    }
}
