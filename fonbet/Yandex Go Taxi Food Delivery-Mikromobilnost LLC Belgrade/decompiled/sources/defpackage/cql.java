package defpackage;

import android.view.ViewGroup;
import com.yandex.div.core.view2.Div2View;
import flex.section.divkit.cache.DivWrapperView;

/* loaded from: classes4.dex */
public final class cql implements bpl {
    public final DivWrapperView a;
    public final String b;
    public final gul c;

    public cql(DivWrapperView divWrapperView, String str, gul gulVar) {
        this.a = divWrapperView;
        this.b = str;
        this.c = gulVar;
    }

    @Override // defpackage.bpl
    public final Div2View getDivView() {
        Div2View divView = this.a.getDivView();
        if (divView != null) {
            return divView;
        }
        ny61.g("Div2View is not prepared. Call setData() first.");
        return null;
    }

    @Override // defpackage.bpl
    public final ViewGroup getLayout() {
        return this.a;
    }

    @Override // defpackage.bpl
    public final boolean setData(omk omkVar, zmk zmkVar) {
        return this.a.setData(this.b, omkVar, zmkVar, this.c);
    }

    @Override // defpackage.bpl
    public final void setDataAsync(omk omkVar, zmk zmkVar, tls tlsVar) {
        this.a.setDataAsync(this.b, omkVar, zmkVar, this.c, tlsVar);
    }

    @Override // defpackage.bpl
    public final void setPlaceholderHeight(int i) {
        this.a.setPlaceholderHeight(i);
    }

    @Override // defpackage.bpl
    public final void toContentMode() {
        this.a.toContentMode();
    }

    @Override // defpackage.bpl
    public final void toPlaceholderMode() {
        this.a.toPlaceholderMode();
    }
}
