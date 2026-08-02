package xsna;

import android.view.View;
import com.vk.dto.common.ImageSize;
import com.vk.imageloader.view.VKImageView;

/* compiled from: View.kt */
/* loaded from: classes18.dex */
public final class st5 implements View.OnLayoutChangeListener {
    public final /* synthetic */ rt5 b;
    public final /* synthetic */ ot5 c;

    public st5(rt5 rt5Var, ot5 ot5Var) {
        this.b = rt5Var;
        this.c = ot5Var;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        String str;
        view.removeOnLayoutChangeListener(this);
        rt5 rt5Var = this.b;
        VKImageView vKImageView = rt5Var.k1;
        if (vKImageView == null) {
            vKImageView = null;
        }
        ImageSize Cb = this.c.a.Cb(vKImageView.getWidth(), true, false);
        if (Cb == null || (str = Cb.d.d) == null) {
            return;
        }
        VKImageView vKImageView2 = rt5Var.k1;
        (vKImageView2 != null ? vKImageView2 : null).load(str);
    }
}
