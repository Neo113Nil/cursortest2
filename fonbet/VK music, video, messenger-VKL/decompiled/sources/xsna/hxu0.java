package xsna;

import android.view.View;
import com.vkontakte.android.R;

/* compiled from: VkGroupHeader.kt */
/* loaded from: classes17.dex */
public final class hxu0 {
    public static final void a(View view, gzs<s3q0> gzsVar, boolean z) {
        if (gzsVar != null) {
            view.setOnClickListener(new isk(gzsVar, 10));
        } else {
            view.setOnClickListener(null);
            view.setClickable(false);
        }
        if (z) {
            view.setBackgroundResource(gzsVar != null ? R.drawable.vk_highlight_unbounded : 0);
        }
    }
}
