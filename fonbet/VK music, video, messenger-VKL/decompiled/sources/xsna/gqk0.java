package xsna;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.vkontakte.android.R;

/* compiled from: StartLiveNotificationView.kt */
/* loaded from: classes7.dex */
public final class gqk0 extends FrameLayout {
    public final TextView b;
    public Boolean c;

    public gqk0(Context context) {
        super(context, null, 0);
        TextView textView = new TextView(context);
        textView.setTextAppearance(R.style.VkUiTypography_FootnoteMedium);
        textView.setCompoundDrawablePadding(iah0.a(2));
        textView.setGravity(16);
        textView.setIncludeFontPadding(false);
        this.b = textView;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 16;
        s3q0 s3q0Var = s3q0.a;
        addView(textView, layoutParams);
        bwt0.d(this, iah0.a(8), (r4 & 2) != 0, (r4 & 4) != 0);
        int a = iah0.a(6);
        setPadding(a, a, a, a);
    }
}
