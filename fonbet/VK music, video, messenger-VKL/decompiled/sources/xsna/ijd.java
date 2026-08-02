package xsna;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.avatar.VkAvatar;
import com.vk.core.view.components.picture.c;
import com.vk.core.view.components.text.VkText;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.LazyThreadSafetyMode;
import xsna.cut0;
import xsna.ejd;
import xsna.tlo0;

/* compiled from: ClipsAvatarCommentBubbleView.kt */
/* loaded from: classes16.dex */
public final class ijd extends LinearLayout {
    public static final int g = iah0.a(56);
    public static final int h = iah0.a(40);
    public static final int i = iah0.a(32);
    public static final int j = iah0.a(30);
    public static final int k = iah0.a(Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
    public static final int l = iah0.a(4);
    public static final int m = iah0.a(8);
    public static final int n = iah0.a(60);
    public static final int o = iah0.a(25);
    public ejd b;
    public fjd c;
    public final VkAvatar d;
    public final VkText e;
    public final Object f;

    /* compiled from: ClipsAvatarCommentBubbleView.kt */
    public final class a {
        public final View a;

        public a(VkText vkText) {
            this.a = vkText;
        }
    }

    /* compiled from: ClipsAvatarCommentBubbleView.kt */
    public interface b {
    }

    public ijd(Context context) {
        super(context, null, 0);
        VkAvatar vkAvatar = new VkAvatar(context, null, 6, 0);
        int i2 = h;
        vkAvatar.setLayoutParams(new LinearLayout.LayoutParams(i2, i2));
        this.d = vkAvatar;
        VkText vkText = new VkText(context, null, 6, 0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        float f = 0;
        layoutParams.setMargins(l, iah0.a(f), iah0.a(f), m);
        vkText.setLayoutParams(layoutParams);
        vkText.setMaxHeight(i);
        vkText.setMinWidth(j);
        vkText.setMaxWidth(k);
        vkText.setBackground(new pnd(context, n, new x7g(R.attr.vk_ui_background_contrast_secondary_alpha)));
        vkText.setTextAppearance(R.style.VkUiTypography_Caption1Medium);
        vkText.setIncludeFontPadding(false);
        vkText.setSingleLine(true);
        vkText.setHorizontalFadingEdgeEnabled(true);
        vkText.setFadingEdgeLength(o);
        this.e = vkText;
        this.f = msy.a(LazyThreadSafetyMode.NONE, new g5(this, 16));
        setMinimumHeight(g);
        setOrientation(0);
        setGravity(80);
        addView(vkAvatar);
        addView(vkText);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final a getCommentTextBubbleAnimator() {
        return (a) this.f.getValue();
    }

    public final ejd getAvatarContent() {
        return this.b;
    }

    public final fjd getCommentContent() {
        return this.c;
    }

    public final b getOnAppearAnimationEndListener() {
        return null;
    }

    public final void setAvatarContent(ejd ejdVar) {
        if (epx.f(this.b, ejdVar)) {
            return;
        }
        this.b = ejdVar;
        if (ejdVar != null) {
            c.d dVar = ejdVar.a;
            VkAvatar vkAvatar = this.d;
            vkAvatar.setContent(dVar);
            ejd.a aVar = ejdVar.b;
            vkAvatar.y0(aVar.a, cut0.a.a(aVar.b, vkAvatar.getContext()));
            s3q0 s3q0Var = s3q0.a;
        }
    }

    public final void setCommentContent(fjd fjdVar) {
        if (epx.f(this.c, fjdVar)) {
            return;
        }
        this.c = fjdVar;
        if (fjdVar != null) {
            tlo0.h hVar = fjdVar.a;
            VkText vkText = this.e;
            vkText.setText(tlo0.b.a(hVar, vkText.getContext()));
            vkText.setTextColor(cut0.a.a(fjdVar.b, vkText.getContext()));
            a commentTextBubbleAnimator = getCommentTextBubbleAnimator();
            boolean z = fjdVar.c;
            View view = commentTextBubbleAnimator.a;
            view.animate().cancel();
            if (!z) {
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
                return;
            }
            ijd ijdVar = ijd.this;
            if (!view.isLaidOut() || view.isLayoutRequested()) {
                view.addOnLayoutChangeListener(new gjd(commentTextBubbleAnimator, ijdVar));
                return;
            }
            view.setScaleX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            view.setScaleY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            view.setPivotX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            view.setPivotY(view.getHeight());
            view.animate().scaleX(1.0f).scaleY(1.0f).setDuration(250L).withEndAction(new hjd(ijdVar)).start();
        }
    }

    public final void setOnAppearAnimationEndListener(b bVar) {
    }
}
