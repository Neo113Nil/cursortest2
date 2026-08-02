package xsna;

import android.view.LayoutInflater;
import com.vkontakte.android.R;

/* compiled from: LayoutInflaterExt.kt */
/* loaded from: classes6.dex */
public final class eoy {
    public static final LayoutInflater a(LayoutInflater layoutInflater) {
        return layoutInflater.getContext().getTheme().resolveAttribute(R.attr.vk_ui_text_accent, dbq.a, true) ? layoutInflater : layoutInflater.cloneInContext(hnj.a(layoutInflater.getContext()));
    }
}
