package xsna;

import android.content.Context;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.vkontakte.android.R;

/* compiled from: QuickActionView.kt */
/* loaded from: classes2.dex */
public final class nse0 extends AppCompatImageView {
    public final lse0 b;

    public nse0(Context context, lse0 lse0Var, kkm kkmVar) {
        super(context);
        this.b = lse0Var;
        setImageResource(lse0Var.b);
        kkmVar.d(this, R.attr.vk_legacy_header_tint);
        setScaleType(ImageView.ScaleType.CENTER);
    }

    public final lse0 getAction() {
        return this.b;
    }
}
