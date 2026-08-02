package xsna;

import com.vk.core.compose.component.defaults.CellButton$Appearance;
import com.vk.core.compose.component.defaults.CellButton$IconSize;
import com.vk.donut.design.compose.banner.DonutBannerKt;
import xsna.ktv0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class uma implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ uma(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.g = obj4;
        this.h = obj5;
        this.c = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).intValue();
                ((zma) this.d).b((CellButton$Appearance) this.e, (izs) this.f, (CellButton$IconSize) this.h, (izs) this.g, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 1:
                ((Integer) obj2).intValue();
                ((jai) this.d).k(this.e, this.f, this.g, this.h, (androidx.compose.runtime.a) obj, ne7.I(this.c) | 1);
                break;
            case 2:
                ((Integer) obj2).getClass();
                DonutBannerKt.g((String) this.d, (String) this.e, (String) this.g, (gzs) this.h, (izs) this.f, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                ((sh80) this.d).a((gzs) this.e, (gzs) this.g, (x5) this.h, (izs) this.f, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                ((ktv0.d) this.d).a((q630) this.e, (htv0) this.f, (jai) this.g, (jai) this.h, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ uma(String str, String str2, String str3, gzs gzsVar, izs izsVar, int i) {
        this.b = 2;
        this.d = str;
        this.e = str2;
        this.g = str3;
        this.h = gzsVar;
        this.f = izsVar;
        this.c = i;
    }

    public /* synthetic */ uma(zma zmaVar, CellButton$Appearance cellButton$Appearance, izs izsVar, CellButton$IconSize cellButton$IconSize, izs izsVar2, int i) {
        this.b = 0;
        this.d = zmaVar;
        this.e = cellButton$Appearance;
        this.f = izsVar;
        this.h = cellButton$IconSize;
        this.g = izsVar2;
        this.c = i;
    }

    public /* synthetic */ uma(sh80 sh80Var, gzs gzsVar, gzs gzsVar2, x5 x5Var, izs izsVar, int i) {
        this.b = 3;
        this.d = sh80Var;
        this.e = gzsVar;
        this.g = gzsVar2;
        this.h = x5Var;
        this.f = izsVar;
        this.c = i;
    }
}
