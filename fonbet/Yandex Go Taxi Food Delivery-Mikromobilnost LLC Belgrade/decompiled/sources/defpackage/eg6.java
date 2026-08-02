package defpackage;

import android.os.Bundle;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.yandex.bricks.c;
import com.yandex.messaging.extension.view.ViewExtensionsKt$onHeightChanged$listener$1;
import com.yandex.messaging.views.bottomsheet.a;
import com.yandex.messaging.views.bottomsheet.b;

/* loaded from: classes15.dex */
public final /* synthetic */ class eg6 implements sls {
    public final /* synthetic */ a a;
    public final /* synthetic */ b b;
    public final /* synthetic */ Bundle c;
    public final /* synthetic */ int w;
    public final /* synthetic */ int x;
    public final /* synthetic */ int y;

    public /* synthetic */ eg6(a aVar, b bVar, Bundle bundle, int i, int i2, int i3) {
        this.a = aVar;
        this.b = bVar;
        this.c = bundle;
        this.w = i;
        this.x = i2;
        this.y = i3;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        a aVar = this.a;
        b bVar = this.b;
        aVar.b(bVar, this.c);
        c cVar = aVar.a;
        cVar.a.setAlpha(0.0f);
        View view = aVar.b;
        int i = this.w;
        view.setY(i);
        BottomSheetBehavior bottomSheetBehavior = aVar.e;
        int G = bottomSheetBehavior.G();
        int i2 = i - this.x;
        if (G + i2 > aVar.a().getHeight()) {
            i2 = aVar.a().getHeight() - bottomSheetBehavior.G();
        }
        if (bottomSheetBehavior.k0 == 4) {
            bottomSheetBehavior.V(bottomSheetBehavior.G() + i2, false);
        }
        View view2 = cVar.a;
        ViewExtensionsKt$onHeightChanged$listener$1 viewExtensionsKt$onHeightChanged$listener$1 = new ViewExtensionsKt$onHeightChanged$listener$1(view2, new fg6(aVar, bVar, this.y, i2));
        view2.addOnLayoutChangeListener(viewExtensionsKt$onHeightChanged$listener$1);
        c18 c18Var = new c18(0, new hh31(6, view2, viewExtensionsKt$onHeightChanged$listener$1));
        op3 op3Var = aVar.k;
        kgx kgxVar = a.m[0];
        op3Var.b(c18Var);
        return zy11.a;
    }
}
