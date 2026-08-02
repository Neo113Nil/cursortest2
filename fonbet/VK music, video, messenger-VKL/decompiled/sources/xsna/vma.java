package xsna;

import com.vk.core.compose.component.defaults.CellButton$IconBackgroundStyle;
import xsna.fma;
import xsna.ima;
import xsna.ktv0;
import xsna.zma;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class vma implements wzs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ vma(ima.a aVar, gzs gzsVar, hma hmaVar, kma kmaVar, fma.a aVar2, int i) {
        this.d = aVar;
        this.e = gzsVar;
        this.f = hmaVar;
        this.g = kmaVar;
        this.h = aVar2;
        this.c = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).intValue();
                ((zma) this.d).d((CellButton$IconBackgroundStyle) this.e, (izs) this.f, (zma.a) this.h, (izs) this.g, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                jiu0.a((ima.a) this.d, (gzs) this.e, (hma) this.f, (kma) this.g, (fma.a) this.h, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                ((ktv0.e) this.d).a((q630) this.e, (htv0) this.f, (jai) this.g, (jai) this.h, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ vma(zma zmaVar, CellButton$IconBackgroundStyle cellButton$IconBackgroundStyle, izs izsVar, zma.a aVar, izs izsVar2, int i) {
        this.d = zmaVar;
        this.e = cellButton$IconBackgroundStyle;
        this.f = izsVar;
        this.h = aVar;
        this.g = izsVar2;
        this.c = i;
    }

    public /* synthetic */ vma(ktv0.e eVar, q630 q630Var, htv0 htv0Var, jai jaiVar, jai jaiVar2, int i) {
        this.d = eVar;
        this.e = q630Var;
        this.f = htv0Var;
        this.g = jaiVar;
        this.h = jaiVar2;
        this.c = i;
    }
}
