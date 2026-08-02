package xsna;

import android.graphics.Rect;
import android.view.View;
import com.google.android.material.tabs.TabLayout;
import com.vk.catalog2.common.dto.api.hint.CatalogHintType;
import com.vk.catalog2.common.dto.api.ui.UIBlockHint;
import com.vk.tab.presentation.TabView;

/* compiled from: ShowHintRunnable.kt */
/* loaded from: classes16.dex */
public final class fij0 implements Runnable, dcn {
    public final TabLayout.g b;
    public final b7a c;
    public final UIBlockHint d;
    public final gzs<s3q0> e;
    public dcn f;

    public fij0(TabLayout.g gVar, b7a b7aVar, UIBlockHint uIBlockHint, gzs<s3q0> gzsVar) {
        this.b = gVar;
        this.c = b7aVar;
        this.d = uIBlockHint;
        this.e = gzsVar;
    }

    @Override // xsna.dcn
    public final void dismiss() {
        this.e.invoke();
        dcn dcnVar = this.f;
        if (dcnVar != null) {
            dcnVar.dismiss();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Rect rect = new Rect();
        TabLayout.g gVar = this.b;
        if (gVar == null) {
            return;
        }
        View view = gVar.f;
        TabView tabView = view instanceof TabView ? (TabView) view : null;
        View container = (this.d.B != CatalogHintType.COACHMARK || tabView == null) ? gVar.h : tabView.getContainer();
        if (container == null) {
            return;
        }
        f4m.d(rect, container);
        this.f = b7a.c(this.c, container.getContext(), rect, this.d, null, new pwh0(gVar, 6), 8);
    }
}
