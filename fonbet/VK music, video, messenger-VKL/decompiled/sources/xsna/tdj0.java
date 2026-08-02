package xsna;

import android.content.Context;
import com.vk.superapp.ui.shimmer.Shimmer;
import com.vkontakte.android.R;

/* compiled from: Shimmer.kt */
/* loaded from: classes6.dex */
public final class tdj0 {
    public static final Shimmer a(Context context) {
        Shimmer.c cVar = (Shimmer.c) new Shimmer.c().c(true).j();
        cVar.k(e3m.f(R.attr.vk_ui_skeleton_from, context));
        cVar.a.d = e3m.f(R.attr.vk_ui_skeleton_to, context);
        return cVar.d(1.0f).a();
    }
}
