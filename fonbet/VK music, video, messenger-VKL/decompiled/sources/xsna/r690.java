package xsna;

import android.content.Context;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.tips.Tooltip;
import com.vk.dto.hints.Hint;
import java.lang.ref.WeakReference;

/* compiled from: View.kt */
/* loaded from: classes6.dex */
public final class r690 implements Runnable {
    public final /* synthetic */ View b;
    public final /* synthetic */ Hint c;
    public final /* synthetic */ h7v d;

    public r690(View view, Hint hint, h7v h7vVar) {
        this.b = view;
        this.c = hint;
        this.d = h7vVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view = this.b;
        Context context = view.getContext();
        Hint hint = this.c;
        Tooltip.l(new Tooltip(context, hint.c, hint.d, null, null, null, this.d.v(hint.b), 0, 0, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 80, 0, false, null, 0, false, null, null, null, null, null, null, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, false, 0, new WeakReference(view), null, null, null, 2113927096, 15), view.getContext(), bwt0.G(view), false, false, false, false, 252);
    }
}
