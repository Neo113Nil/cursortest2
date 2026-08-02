package xsna;

import android.content.Context;
import android.widget.TextView;

/* compiled from: WebViewMarkerViewProviderImpl.kt */
/* loaded from: classes7.dex */
public final class djx0 implements cjx0 {
    @Override // xsna.cjx0
    public final TextView a(Context context, String str) {
        TextView textView = new TextView(context);
        StringBuilder sb = new StringBuilder("WebView");
        sb.append(!drm0.N(str) ? air.b(')', "(", str) : "");
        textView.setText(sb.toString());
        textView.setTextColor(-65536);
        return textView;
    }
}
