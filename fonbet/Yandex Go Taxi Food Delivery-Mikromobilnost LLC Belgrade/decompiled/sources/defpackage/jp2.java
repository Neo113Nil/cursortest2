package defpackage;

import android.graphics.drawable.ColorDrawable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.flex.common.scaffolds.appbarscaffold.AppBarScaffold;
import com.yandex.go.flex.common.scaffolds.appbarscaffold.c;
import flex.utils.android.DimensionUnit;

/* loaded from: classes.dex */
public final /* synthetic */ class jp2 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ c b;

    public /* synthetic */ jp2(c cVar, int i) {
        this.a = i;
        this.b = cVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        CoordinatorLayout coordinatorLayout;
        AppBarScaffold.ContentPadding contentPadding;
        AppBarScaffold.ContentPadding contentPadding2;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        c cVar = this.b;
        switch (i) {
            case 0:
                int intValue = ((Integer) obj).intValue();
                h2y h2yVar = cVar.C;
                if (h2yVar != null && (coordinatorLayout = h2yVar.a) != null) {
                    coordinatorLayout.setBackgroundColor(intValue);
                }
                return zy11Var;
            case 1:
                int intValue2 = ((Integer) obj).intValue();
                h2y h2yVar2 = cVar.C;
                if (h2yVar2 != null) {
                    h2yVar2.d.setBackground(new ColorDrawable(intValue2).mutate());
                }
                return zy11Var;
            default:
                n751 n751Var = (n751) obj;
                RecyclerView recyclerView = cVar.D;
                Boolean bool = null;
                if (recyclerView == null) {
                    h2y h2yVar3 = cVar.C;
                    recyclerView = h2yVar3 != null ? (RecyclerView) h2yVar3.e.findViewById(nch0.flexsdk_recycler_view_id) : null;
                }
                if (recyclerView != null) {
                    AppBarScaffold appBarScaffold = cVar.x;
                    if (appBarScaffold != null && (contentPadding2 = appBarScaffold.g) != null) {
                        bool = Boolean.valueOf(contentPadding2.b);
                    }
                    int i2 = jl40.l(bool, Boolean.TRUE) ? n751Var.a.g(519).d : 0;
                    AppBarScaffold appBarScaffold2 = cVar.x;
                    sb2.M(recyclerView, 0, new pkj(i2 + ((appBarScaffold2 == null || (contentPadding = appBarScaffold2.g) == null) ? 0 : rzo.s(contentPadding.a, recyclerView)), DimensionUnit.PX).w, 7);
                    recyclerView.setClipToPadding(false);
                }
                return n751Var;
        }
    }
}
