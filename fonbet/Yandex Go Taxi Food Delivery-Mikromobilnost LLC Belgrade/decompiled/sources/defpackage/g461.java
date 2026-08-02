package defpackage;

import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.ybsdk.feature.banners.api.view.PrizeProgressView;

/* loaded from: classes3.dex */
public final class g461 implements zo31 {
    public final PrizeProgressView a;
    public final AppCompatImageView b;
    public final ProgressBar c;

    public g461(PrizeProgressView prizeProgressView, AppCompatImageView appCompatImageView, ProgressBar progressBar, TextView textView) {
        this.a = prizeProgressView;
        this.b = appCompatImageView;
        this.c = progressBar;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
