package xsna;

import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog.mvi.block.impl.filtersbottomsheet.FilterBottomSheetState;
import com.vk.catalog.mvi.section.domain.CatalogFilterOptionDo;
import com.vkontakte.android.R;
import java.util.List;
import xsna.q630;

/* compiled from: FiltersBottomSheet.kt */
/* loaded from: classes16.dex */
public final class mfr extends jmu0 {
    public final izs<CatalogFilterOptionDo, s3q0> h1;
    public final utk0 i1;

    /* compiled from: FiltersBottomSheet.kt */
    public static final class a extends kmu0 {
        public final List<CatalogFilterOptionDo> h;
        public final defpackage.c i;

        public a(Context context, List list, defpackage.c cVar) {
            super(context, tzp0.a(null, 3));
            this.h = list;
            this.i = cVar;
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            return new mfr(this.h, this.i);
        }
    }

    public mfr(List list, defpackage.c cVar) {
        this.h1 = cVar;
        this.i1 = vtk0.a(new FilterBottomSheetState(list));
    }

    @Override // xsna.vpi
    public final void bo(b33 b33Var) {
        ViewGroup Ln = Ln();
        if (Ln != null) {
            int a2 = iah0.a(10);
            int a3 = iah0.a(8);
            f4m.u(Ln, a2, 0, a2, a2);
            int i = a3 * 2;
            Ln.setPadding(a3, i, a3, i);
            Ln.setBackground(gu9.c(R.attr.vk_ui_background_contrast_themed, requireContext()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.jmu0
    public final void co(int i, androidx.compose.runtime.a aVar) {
        aVar.K(-2054979427);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-2054979427, 8, -1, "com.vk.catalog.mvi.block.impl.filtersbottomsheet.FiltersBottomSheet.ThemedContent (FiltersBottomSheet.kt:45)");
        }
        FilterBottomSheetState filterBottomSheetState = (FilterBottomSheetState) nr2.u(this.i1, aVar).getValue();
        boolean y = aVar.y(this);
        Object x = aVar.x();
        if (y || x == a.C0011a.a) {
            x = new udo(this, 7);
            aVar.R(x);
        }
        sfr.a(filterBottomSheetState, (izs) x, s200.F(20, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, ahn.E(q630.a.a, "filters_bottom_sheet_dialog")), aVar, 384);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
    }
}
