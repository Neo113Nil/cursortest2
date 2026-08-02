package defpackage;

import android.graphics.RectF;
import com.yandex.go.blur.core.BlurEffect$CoordinatesType;
import com.yandex.go.superapp.discovery.map.impl.ui.main.searchbar.views.SuperAppMapSearchbarView;

/* loaded from: classes14.dex */
public final class d5w0 implements tls {
    public final /* synthetic */ SuperAppMapSearchbarView a;
    public final /* synthetic */ float b;

    public d5w0(SuperAppMapSearchbarView superAppMapSearchbarView, float f) {
        this.a = superAppMapSearchbarView;
        this.b = f;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        RectF rectF;
        int i;
        int i2 = sug0.discovery_map_searchbar_blur_radius;
        SuperAppMapSearchbarView superAppMapSearchbarView = this.a;
        int r = tje.r(i2, superAppMapSearchbarView.getContext());
        BlurEffect$CoordinatesType blurEffect$CoordinatesType = BlurEffect$CoordinatesType.Absolute;
        rectF = superAppMapSearchbarView.backgroundRect;
        float f = (int) rectF.top;
        float f2 = this.b;
        i = superAppMapSearchbarView.blurTopPadding;
        return ngd0.w(r, blurEffect$CoordinatesType, (f + f2) - i, 0.0f, f2 + superAppMapSearchbarView.getMeasuredHeight(), 0.0f, null, 232);
    }
}
