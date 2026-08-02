package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.vkontakte.android.R;

/* compiled from: Separator.kt */
/* loaded from: classes16.dex */
public final class pki0 {
    public static final View a(Context context) {
        View view = new View(context);
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, iah0.a(1)));
        view.setBackground(m33.a(R.drawable.clips_feed_controls_separator, view.getContext()));
        view.setId(R.id.fullscreen_clip_overlay_separator);
        view.setVisibility(8);
        view.setElevation(iah0.a(r1));
        view.setImportantForAccessibility(2);
        return view;
    }
}
