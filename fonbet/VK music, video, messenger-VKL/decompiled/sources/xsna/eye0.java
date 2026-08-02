package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.vk.newsfeed.api.posting.viewpresenter.PreviewRatio;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: RatioSwitcherView.kt */
/* loaded from: classes4.dex */
public final class eye0 extends FrameLayout {
    public gzs<s3q0> b;
    public final TextView c;

    public eye0(Context context) {
        super(context, null, 0);
        LayoutInflater.from(context).inflate(R.layout.view_carousel_ratio_switcher, this);
        TextView textView = (TextView) findViewById(R.id.posting_ratio_switcher);
        bwt0.i0(this, new gib0(this, 7));
        this.c = textView;
    }

    public final gzs<s3q0> getOnClickSwitcher() {
        return this.b;
    }

    public final void setOnClickSwitcher(gzs<s3q0> gzsVar) {
        this.b = gzsVar;
    }

    public final void setRatioText(PreviewRatio previewRatio) {
        String string;
        boolean c = previewRatio.c();
        if (c) {
            string = getContext().getString(R.string.carousel_original_ratio);
        } else {
            if (c) {
                throw new NoWhenBranchMatchedException();
            }
            string = getContext().getString(R.string.carousel_ratio_template, Integer.valueOf(previewRatio.b()), Integer.valueOf(previewRatio.a()));
        }
        TextView textView = this.c;
        textView.setText(string);
        his0.t(textView, previewRatio.a, 0);
    }
}
