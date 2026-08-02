package xsna;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import androidx.appcompat.widget.Toolbar;
import com.vk.voip.ui.groupcalls.list.primary.tab.PrimaryTabsView;
import com.vk.voip.ui.groupcalls.list.primary.tab.a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class jkm implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ jkm(Object obj, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                final Toolbar toolbar = (Toolbar) obj;
                final int f = ((kkm) this.d).f(this.c);
                final int[] iArr = {f, l8g.f(0.4f, f)};
                final int[][] iArr2 = {new int[]{R.attr.state_enabled}, new int[]{-16842910}};
                awt0.t(toolbar, new gzs() { // from class: xsna.ikm
                    @Override // xsna.gzs
                    public final Object invoke() {
                        ColorStateList colorStateList = new ColorStateList(iArr2, iArr);
                        Toolbar toolbar2 = toolbar;
                        Drawable navigationIcon = toolbar2.getNavigationIcon();
                        baf0 baf0Var = navigationIcon instanceof baf0 ? (baf0) navigationIcon : null;
                        int i = f;
                        if (baf0Var != null) {
                            baf0Var.a(i);
                        } else {
                            Drawable navigationIcon2 = toolbar2.getNavigationIcon();
                            if (navigationIcon2 != null) {
                                navigationIcon2.setTint(i);
                            }
                        }
                        Drawable overflowIcon = toolbar2.getOverflowIcon();
                        baf0 baf0Var2 = overflowIcon instanceof baf0 ? (baf0) overflowIcon : null;
                        if (baf0Var2 != null) {
                            baf0Var2.a(i);
                        } else {
                            Drawable overflowIcon2 = toolbar2.getOverflowIcon();
                            if (overflowIcon2 != null) {
                                overflowIcon2.setTint(i);
                            }
                        }
                        Menu menu = toolbar2.getMenu();
                        int size = menu.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            n720.b(menu.getItem(i2), colorStateList);
                        }
                        return s3q0.a;
                    }
                });
                break;
            case 1:
                l880 l880Var = (l880) this.d;
                l880Var.M.f.f();
                l880Var.f7(this.c);
                break;
            default:
                a.b bVar = ((PrimaryTabsView) this.d).h;
                if (bVar != null) {
                    ((dad0) ((xx40) bVar).c).b.e(this.c, true);
                }
                break;
        }
        return s3q0.a;
    }
}
