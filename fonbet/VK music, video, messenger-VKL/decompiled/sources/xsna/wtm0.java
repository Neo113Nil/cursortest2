package xsna;

import com.vk.catalog2.common.dto.api.CatalogFilterData;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionFilter;

/* compiled from: SubcategoryFilterDelegate.kt */
/* loaded from: classes16.dex */
public final class wtm0 {
    public final q3a a;
    public final b5a b;
    public final eda c;
    public final fcr d;

    public /* synthetic */ wtm0(q3a q3aVar, b5a b5aVar, eda edaVar, int i) {
        this(q3aVar, b5aVar, (i & 4) != 0 ? null : edaVar, (nwd0) null);
    }

    public final void a(UIBlockActionFilter uIBlockActionFilter, boolean z) {
        CatalogFilterData catalogFilterData = uIBlockActionFilter.z;
        String str = uIBlockActionFilter.B;
        if (epx.f(str, "section_filter")) {
            eda edaVar = this.c;
            if (edaVar != null) {
                edaVar.d(uIBlockActionFilter.c, catalogFilterData.b, null);
            }
        } else {
            String str2 = epx.f(str, "video_seasons_block_filter") ? uIBlockActionFilter.A : null;
            buz buzVar = new buz(12, new fh1(25, this, uIBlockActionFilter), new phg(uIBlockActionFilter, this));
            q3a q3aVar = this.a;
            q3aVar.b(buzVar, true);
            q3aVar.b(new cer(4, catalogFilterData.b, str2, new iyd0(uIBlockActionFilter, 7), z), false);
        }
        fcr fcrVar = this.d;
        if (fcrVar != null) {
            fcrVar.a(uIBlockActionFilter);
        }
        this.b.a(new cfp0(uIBlockActionFilter, null));
    }

    public wtm0(q3a q3aVar, b5a b5aVar, eda edaVar, nwd0 nwd0Var) {
        this.a = q3aVar;
        this.b = b5aVar;
        this.c = edaVar;
        this.d = nwd0Var;
    }
}
