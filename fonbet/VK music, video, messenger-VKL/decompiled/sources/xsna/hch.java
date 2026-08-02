package xsna;

import android.view.View;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;

/* compiled from: View.kt */
/* loaded from: classes18.dex */
public final class hch implements View.OnLayoutChangeListener {
    public final /* synthetic */ dch b;
    public final /* synthetic */ ich c;

    public hch(dch dchVar, ich ichVar) {
        this.b = dchVar;
        this.c = ichVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        Image image;
        ImageSize Cb;
        String str;
        view.removeOnLayoutChangeListener(this);
        if (view.getWidth() <= 0 || view.getHeight() <= 0 || (image = this.b.d) == null || (Cb = image.Cb(view.getWidth(), true, false)) == null || (str = Cb.d.d) == null) {
            return;
        }
        this.c.p.load(str);
    }
}
