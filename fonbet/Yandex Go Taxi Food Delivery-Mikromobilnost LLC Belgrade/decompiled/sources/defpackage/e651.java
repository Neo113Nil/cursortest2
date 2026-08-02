package defpackage;

import android.view.View;
import androidx.appcompat.app.h;
import androidx.appcompat.app.o;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.core.view.b;
import java.util.WeakHashMap;

/* loaded from: classes10.dex */
public final class e651 extends fu31 {
    public final /* synthetic */ int a;
    public final /* synthetic */ o b;

    public /* synthetic */ e651(o oVar, int i) {
        this.a = i;
        this.b = oVar;
    }

    @Override // defpackage.fu31, defpackage.eu31
    public final void onAnimationEnd(View view) {
        View view2;
        int i = this.a;
        o oVar = this.b;
        switch (i) {
            case 0:
                if (oVar.o && (view2 = oVar.g) != null) {
                    view2.setTranslationY(0.0f);
                    oVar.d.setTranslationY(0.0f);
                }
                oVar.d.setVisibility(8);
                oVar.d.setTransitioning(false);
                oVar.t = null;
                h hVar = oVar.k;
                if (hVar != null) {
                    hVar.b(oVar.j);
                    oVar.j = null;
                    oVar.k = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = oVar.c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = b.a;
                    np31.c(actionBarOverlayLayout);
                    break;
                }
                break;
            default:
                oVar.t = null;
                oVar.d.requestLayout();
                break;
        }
    }
}
