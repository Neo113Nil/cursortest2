package xsna;

import android.content.Context;
import com.vk.superapp.ui.shimmer.Shimmer;
import com.vkontakte.android.R;

/* compiled from: AboutVideoAnimations.kt */
/* loaded from: classes2.dex */
public final class v4 {
    public static final Shimmer a(Context context) {
        Shimmer.c cVar = (Shimmer.c) new Shimmer.c().j();
        cVar.k(e3m.f(R.attr.vk_ui_skeleton_from, context));
        Shimmer.c d = cVar.d(1.0f);
        d.a.d = e3m.f(R.attr.vk_ui_skeleton_to, context);
        return d.h(1.0f).e(1500L).a();
    }
}
