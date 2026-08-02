package xsna;

import com.vk.catalog.mvi.block.impl.LinksSmallListVideoLibrary;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class x40 implements wzs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ izs c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ x40(LinksSmallListVideoLibrary.a aVar, a8a a8aVar, LinksSmallListVideoLibrary.d dVar, izs izsVar, q630 q630Var, int i) {
        this.e = aVar;
        this.f = a8aVar;
        this.g = dVar;
        this.c = izsVar;
        this.h = q630Var;
        this.d = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                ((z40) this.e).a((gzs) this.f, (gzs) this.g, (x5) this.h, this.c, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                ((LinksSmallListVideoLibrary.a) this.e).c((a8a) this.f, (LinksSmallListVideoLibrary.d) this.g, this.c, (q630) this.h, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ x40(z40 z40Var, gzs gzsVar, gzs gzsVar2, x5 x5Var, izs izsVar, int i) {
        this.e = z40Var;
        this.f = gzsVar;
        this.g = gzsVar2;
        this.h = x5Var;
        this.c = izsVar;
        this.d = i;
    }
}
