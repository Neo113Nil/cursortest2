package xsna;

import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import com.vk.ecomm.catalog.impl.geo.e;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class vgc implements io.reactivex.rxjava3.functions.l, Toolbar.h {
    public final /* synthetic */ izs b;

    public /* synthetic */ vgc(izs izsVar) {
        this.b = izsVar;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        return (e.a.C0931a) this.b.invoke(obj);
    }

    @Override // androidx.appcompat.widget.Toolbar.h
    public boolean onMenuItemClick(MenuItem menuItem) {
        if (bwt0.B().a()) {
            return true;
        }
        return ((Boolean) this.b.invoke(menuItem)).booleanValue();
    }
}
