package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;

/* compiled from: PollEditViews.kt */
/* loaded from: classes17.dex */
public final class sqb0 extends LinearLayout {
    public static final /* synthetic */ int d = 0;
    public final ImageView b;
    public final TextView c;

    public sqb0(Context context) {
        super(context);
        setOrientation(0);
        LayoutInflater.from(getContext()).inflate(R.layout.poll_option_edit_view, this);
        this.c = (TextView) findViewById(R.id.poll_text_view);
        this.b = (ImageView) findViewById(R.id.poll_remove_item_btn);
    }

    public final void a(boolean z, boolean z2) {
        ImageView imageView = this.b;
        imageView.clearAnimation();
        float f = z ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (z2) {
            imageView.animate().alpha(f).setDuration(300L).start();
        } else {
            imageView.setAlpha(f);
        }
    }

    public final String getText() {
        return this.c.getText().toString();
    }

    public final void setRemoveClickListener(gzs<s3q0> gzsVar) {
        bwt0.i0(this.b, new w7f(1, gzsVar));
    }

    public final void setText(CharSequence charSequence) {
        this.c.setText(charSequence);
    }

    public final void setupTextViewBackground(boolean z) {
        k15.v(this.c, z);
    }
}
