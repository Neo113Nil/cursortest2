package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vk.core.view.components.avatar.VkAvatar;
import com.vk.core.view.components.avatar.badge.VkAvatarBadge;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import xsna.dhd;

/* compiled from: ClipsEditorAuthorsChooseView.kt */
/* loaded from: classes16.dex */
public final class xwd extends FrameLayout implements tod {
    public final Object b;
    public sod c;

    public xwd(lpj lpjVar) {
        super(lpjVar, null, 0);
        this.b = msy.a(LazyThreadSafetyMode.NONE, new eb(this, 16));
        LayoutInflater.from(lpjVar).inflate(R.layout.clips_authors_choose_view, (ViewGroup) this, true);
        f4m.j(this);
        this.c = new fxd(this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final VkAvatar getAvatar() {
        return (VkAvatar) this.b.getValue();
    }

    @Override // xsna.tod
    public final void a(dhd dhdVar) {
        if (dhdVar.equals(dhd.b.a)) {
            f4m.j(this);
            return;
        }
        jjd a = qf9.a(dhdVar);
        getAvatar().o0(a != null ? a.a : null, null);
        getAvatar().Q0(new com.vk.core.view.components.avatar.badge.a(m33.a(R.drawable.vk_icon_sync_circle_fill_black_16, getContext()), false, VkAvatarBadge.Alignment.BottomRight, (String) null, 24));
        setVisibility(0);
    }

    @Override // xsna.tod
    public Context getCtx() {
        return getContext();
    }

    public sod getPresenter() {
        return this.c;
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
        this.c = sodVar;
    }

    @Override // xsna.tod
    public View getTooltipAnchorView() {
        return this;
    }

    public View getTooltipViewAnchor() {
        return this;
    }
}
