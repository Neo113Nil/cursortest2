package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vk.core.utils.VerifyInfoHelper;
import com.vk.core.view.MaskableFrameLayout;
import com.vk.core.view.components.avatar.VkAvatar;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.core.view.components.text.VkText;
import com.vk.dto.common.VerifyInfo;
import com.vkontakte.android.R;
import xsna.wjk0;

/* compiled from: SpectatorsBroadcastView.java */
/* loaded from: classes16.dex */
public final class ujk0 extends FrameLayout implements wjk0 {
    public final VkAvatar b;
    public final VkText c;
    public final VkText d;
    public final VkImageSimple e;
    public final View f;
    public final MaskableFrameLayout g;
    public vjk0 h;

    public ujk0(Context context) {
        super(context, null, 0);
        View inflate = ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(R.layout.live_spectators_broadcast, (ViewGroup) this, true);
        this.b = (VkAvatar) inflate.findViewById(R.id.liveSpectatorsImage);
        VkText vkText = (VkText) inflate.findViewById(R.id.liveSpectatorsViewers);
        this.c = vkText;
        VkText vkText2 = (VkText) inflate.findViewById(R.id.liveSpectatorsTime);
        this.d = vkText2;
        VkImageSimple vkImageSimple = (VkImageSimple) inflate.findViewById(R.id.liveSpectatorsTimeIcon);
        this.e = vkImageSimple;
        this.f = inflate.findViewById(R.id.liveSpectatorsVerified);
        MaskableFrameLayout maskableFrameLayout = (MaskableFrameLayout) inflate.findViewById(R.id.liveSpectatorsMaskable);
        this.g = maskableFrameLayout;
        maskableFrameLayout.setPorterMode(5);
        vkText2.setVisibility(8);
        vkImageSimple.setVisibility(8);
        setCurrentViewers(0);
        iut0.q(vkText, new dgj(0));
    }

    @Override // xsna.wjk0
    public final void Y2() {
        this.d.setVisibility(0);
        this.e.setVisibility(0);
    }

    @Override // xsna.rr6
    public Context getViewContext() {
        return getContext();
    }

    @Override // xsna.rr6
    public final void pause() {
        vjk0 vjk0Var = this.h;
        if (vjk0Var != null) {
            vjk0Var.pause();
        }
    }

    @Override // xsna.rr6
    public final void release() {
        vjk0 vjk0Var = this.h;
        if (vjk0Var != null) {
            vjk0Var.release();
        }
    }

    @Override // xsna.rr6
    public final void resume() {
        vjk0 vjk0Var = this.h;
        if (vjk0Var != null) {
            vjk0Var.resume();
        }
    }

    @Override // xsna.wjk0
    public void setCurrentViewers(int i) {
        String replace = crx0.l(i).replace(" ", " ");
        VkText vkText = this.c;
        vkText.setText(replace);
        vkText.setContentDescription(getContext().getResources().getQuantityString(R.plurals.video_spectators_count, i, Integer.valueOf(i)));
    }

    @Override // xsna.wjk0
    public void setTimeText(int i) {
        this.d.setText(DateUtils.formatElapsedTime(i));
    }

    @Override // xsna.wjk0
    public void setUser(wjk0.a aVar) {
        Drawable drawable = null;
        this.b.o0(aVar.d, null);
        VerifyInfo verifyInfo = aVar.e;
        if (verifyInfo != null) {
            boolean z = verifyInfo.b;
            boolean z2 = verifyInfo.c;
            if (z && z2) {
                drawable = m33.a(R.drawable.vk_icon_deprecated_mask_verified_fire_40, getContext());
            } else if (z) {
                drawable = m33.a(R.drawable.vk_icon_deprecated_mask_verified_40, getContext());
            } else if (z2) {
                drawable = m33.a(R.drawable.vk_icon_deprecated_mask_fire_40, getContext());
            }
            if (drawable != null) {
                MaskableFrameLayout maskableFrameLayout = this.g;
                maskableFrameLayout.setMask(drawable);
                maskableFrameLayout.setBackground(drawable);
                this.f.setBackground(VerifyInfoHelper.h(VerifyInfoHelper.a, verifyInfo, getContext(), VerifyInfoHelper.ColorTheme.white, 24));
            }
        }
    }

    @Override // xsna.rr6
    public vjk0 getPresenter() {
        return this.h;
    }

    @Override // xsna.rr6
    public void setPresenter(vjk0 vjk0Var) {
        this.h = vjk0Var;
    }

    @Override // xsna.wjk0
    public final void X() {
    }

    @Override // xsna.rr6
    public View getView() {
        return this;
    }

    @Override // xsna.wjk0
    public final void T1(boolean z) {
    }

    @Override // xsna.wjk0
    public final void Y(boolean z, boolean z2) {
    }

    @Override // xsna.wjk0
    public final void v2(int i, boolean z) {
    }
}
