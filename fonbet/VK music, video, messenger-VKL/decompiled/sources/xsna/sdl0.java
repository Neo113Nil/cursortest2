package xsna;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.tips.Tooltip;
import com.vk.dto.hints.Hint;
import com.vk.dto.hints.HintId;
import com.vk.stickers.keyboard.StickersView;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;

/* compiled from: StickersView.kt */
/* loaded from: classes6.dex */
public final class sdl0 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ StickersView b;
    public final /* synthetic */ int c;

    public sdl0(StickersView stickersView, int i) {
        this.b = stickersView;
        this.c = i;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        View findViewByPosition;
        Context context;
        StickersView stickersView = this.b;
        RecyclerView recyclerView = stickersView.u;
        recyclerView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        if (layoutManager == null || (findViewByPosition = layoutManager.findViewByPosition(this.c)) == null || (context = stickersView.getContext()) == null) {
            return;
        }
        l7v b = pla.e().b();
        HintId hintId = HintId.STICKERS_UGC_ONBOARDING_TOOLTIP;
        Hint p = b.p(hintId.getId());
        String str = p != null ? p.d : null;
        l7v b2 = pla.e().b();
        String id = hintId.getId();
        b2.getClass();
        b1y b1yVar = new b1y(id);
        abg0 abg0Var = dhr0.t;
        Tooltip.l(new Tooltip(context, null, str, null, null, null, b1yVar, abg0Var.c(R.attr.vk_ui_accent_blue), abg0Var.c(R.attr.vk_ui_text_contrast), null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 48, 0, false, null, 0, false, null, null, null, null, null, null, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, false, -iah0.a(20.0f), new WeakReference(findViewByPosition), null, null, null, 1040184888, 15), context, new RectF(bwt0.C(findViewByPosition)), false, false, false, false, 252);
        pla.e().b().b(hintId.getId());
    }
}
