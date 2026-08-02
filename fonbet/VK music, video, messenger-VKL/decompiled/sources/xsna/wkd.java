package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.avatar.VkAvatar;
import com.vk.core.view.components.text.VkText;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import xsna.dhd;

/* compiled from: ClipsCameraAuthorsChooseView.kt */
/* loaded from: classes16.dex */
public final class wkd extends LinearLayout implements tod {
    public sod b;
    public final Object c;
    public final Object d;

    public wkd(lpj lpjVar) {
        super(lpjVar, null, 0);
        this.b = new vod(this);
        vf0 vf0Var = new vf0(this, 22);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.c = msy.a(lazyThreadSafetyMode, vf0Var);
        this.d = msy.a(lazyThreadSafetyMode, new b3(this, 19));
        LayoutInflater.from(lpjVar).inflate(R.layout.clips_camera_authors_choose_view, (ViewGroup) this, true);
        getAuthorName().setShadowLayer(cn70.c(3), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, cn70.c(1), dhr0.t.c(R.attr.vk_ui_field_border_alpha));
        f4m.j(this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final VkText getAuthorName() {
        return (VkText) this.d.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final VkAvatar getAvatarView() {
        return (VkAvatar) this.c.getValue();
    }

    @Override // xsna.tod
    public final void a(dhd dhdVar) {
        if (dhdVar.equals(dhd.b.a)) {
            getAuthorName().setText((CharSequence) null);
            f4m.j(this);
        } else {
            jjd a = qf9.a(dhdVar);
            getAuthorName().setText(dhdVar.getName());
            getAvatarView().o0(a != null ? a.a : null, null);
            setVisibility(0);
        }
    }

    @Override // xsna.tod
    public Context getCtx() {
        return getContext();
    }

    public sod getPresenter() {
        return this.b;
    }

    @Override // xsna.tod
    public View getTooltipAnchorView() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getPresenter().g0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getPresenter().h0();
    }

    public void setPresenter(sod sodVar) {
        this.b = sodVar;
    }
}
