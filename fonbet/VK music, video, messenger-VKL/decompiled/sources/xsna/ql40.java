package xsna;

import android.view.View;
import com.vk.catalog2.common.dto.ui.UIBlockLink;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;

/* compiled from: ViewExt.kt */
/* loaded from: classes16.dex */
public final class ql40 implements View.OnLayoutChangeListener {
    public final /* synthetic */ UIBlockLink b;
    public final /* synthetic */ rl40 c;

    public ql40(UIBlockLink uIBlockLink, rl40 rl40Var) {
        this.b = uIBlockLink;
        this.c = rl40Var;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        Image image = this.b.y.f;
        rl40 rl40Var = this.c;
        ImageSize Cb = image.Cb(rl40Var.m.getWidth(), true, false);
        rl40Var.m.s0(Cb != null ? Cb.d.d : null);
    }
}
