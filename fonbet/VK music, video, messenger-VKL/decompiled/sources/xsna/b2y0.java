package xsna;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.vk.writebar.WriteBar;
import com.vkontakte.android.R;

/* compiled from: WriteBarThemeHelper.kt */
/* loaded from: classes7.dex */
public final class b2y0 {
    public final WriteBar a;
    public kkm b;

    public b2y0(WriteBar writeBar) {
        this.a = writeBar;
    }

    public final int a(int i) {
        return i == R.attr.vk_legacy_icon_outline_secondary ? dhr0.t.c(i) : b(i);
    }

    public final int b(int i) {
        Context context = this.a.getContext();
        if (context instanceof l7s) {
            return e3m.f(i, context);
        }
        kkm kkmVar = this.b;
        return kkmVar != null ? kkmVar.f(i) : dhr0.t.c(i);
    }

    public final void c(int i, int i2, int i3) {
        View findViewById = this.a.findViewById(i);
        ImageView imageView = findViewById instanceof ImageView ? (ImageView) findViewById : null;
        if (imageView == null) {
            return;
        }
        dhr0.m(imageView, false);
        kkm kkmVar = this.b;
        if (kkmVar != null) {
            kkmVar.h(imageView);
        }
        imageView.setImageDrawable(new baf0(dhr0.t.d(i2), i3));
    }

    public final void d(final int i) {
        View findViewById = this.a.findViewById(R.id.writebar_emoji);
        ImageView imageView = findViewById instanceof ImageView ? (ImageView) findViewById : null;
        if (imageView == null) {
            return;
        }
        dhr0.a.l0(imageView, dhr0.b0(R.attr.im_ic_emoji), i);
        kkm kkmVar = this.b;
        if (kkmVar != null) {
            kkmVar.e(imageView, new wzs() { // from class: xsna.a2y0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    kkm kkmVar2 = (kkm) obj2;
                    Drawable drawable = ((ImageView) obj).getDrawable();
                    boolean z = drawable instanceof baf0;
                    int i2 = i;
                    if (z) {
                        ((baf0) drawable).a(kkmVar2.f(i2));
                    } else if (drawable != null) {
                        sjo.b(drawable, kkmVar2.f(i2), PorterDuff.Mode.SRC_IN);
                    }
                    return s3q0.a;
                }
            });
        }
    }
}
