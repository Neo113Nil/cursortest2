package xsna;

import android.view.View;
import android.widget.ImageView;
import com.vkontakte.android.R;

/* compiled from: ActionLeave.kt */
/* loaded from: classes7.dex */
public abstract class u10 extends vu<Boolean> {
    @Override // xsna.ku
    public final void g(View view, Object obj) {
        bwt0.p0((ImageView) view, ((Boolean) obj).booleanValue());
    }

    @Override // xsna.wu
    public final int j() {
        return R.drawable.voip_button_decline;
    }

    @Override // xsna.wu, xsna.ku
    /* renamed from: p */
    public final void h(ImageView imageView) {
        super.h(imageView);
        imageView.setId(q());
        imageView.setContentDescription(imageView.getContext().getString(r()));
    }

    public abstract int q();

    public abstract int r();
}
