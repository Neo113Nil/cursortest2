package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.drawee.generic.RoundingParams;
import com.vk.avatar.api.VKAvatarView;
import com.vk.avatar.api.border.AvatarBorderType;
import com.vk.imageloader.view.VKImageView;
import com.vk.notifications.core.avatar.NotificationAvatarViewContainer;

/* compiled from: NotificationAvatarViewContainer.kt */
/* loaded from: classes4.dex */
public final class z770 extends FrameLayout implements a870 {
    public final VKImageView b;
    public final VKAvatarView c;

    public z770(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = new VKImageView(context, null, 6, 0);
        this.c = new VKAvatarView(context, null, 6, 0);
    }

    @Override // xsna.a870
    public final void a(String str, AvatarBorderType avatarBorderType, cq5 cq5Var) {
        VKImageView vKImageView = this.b;
        if (bwt0.K(vKImageView)) {
            vKImageView.o0(str, null);
            return;
        }
        VKAvatarView vKAvatarView = this.c;
        if (bwt0.K(vKAvatarView)) {
            VKAvatarView.c1(vKAvatarView, avatarBorderType, cq5Var, 4);
            vKAvatarView.load(str);
        }
    }

    @Override // xsna.a870
    public final void clear() {
        this.b.clear();
        this.c.clear();
    }

    @Override // xsna.a870
    public final void f(mk6 mk6Var, boolean z) {
        RoundingParams roundingParams;
        VKAvatarView vKAvatarView = this.c;
        VKImageView vKImageView = this.b;
        if (z && mk6Var == null) {
            bwt0.p0(vKAvatarView, true);
            bwt0.p0(vKImageView, false);
            return;
        }
        njt hierarchy = vKImageView.getHierarchy();
        if (z) {
            RoundingParams roundingParams2 = NotificationAvatarViewContainer.c;
            roundingParams = NotificationAvatarViewContainer.c;
        } else {
            RoundingParams roundingParams3 = NotificationAvatarViewContainer.c;
            roundingParams = NotificationAvatarViewContainer.d;
        }
        hierarchy.u(roundingParams);
        vKImageView.setPostprocessor(mk6Var);
        bwt0.p0(vKAvatarView, false);
        bwt0.p0(vKImageView, true);
    }

    @Override // xsna.a870
    public o9r0 getBorderParams() {
        return this.c.getAvatarBorderConfigParamsOverride();
    }

    @Override // xsna.a870
    public int getRoundAvatarSize() {
        return this.b.getWidth();
    }

    @Override // xsna.a870
    public void setBorderParams(o9r0 o9r0Var) {
        if (o9r0Var != null) {
            this.c.setAvatarBorderConfigParamsOverride(o9r0Var);
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (layoutParams != null) {
            removeAllViews();
            VKImageView vKImageView = this.b;
            bwt0.p0(vKImageView, false);
            View view = this.c;
            bwt0.p0(view, true);
            vKImageView.setRound(true);
            addView(vKImageView);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams.width, layoutParams.height);
            layoutParams2.gravity = 17;
            s3q0 s3q0Var = s3q0.a;
            addView(view, layoutParams2);
        }
    }

    @Override // xsna.a870
    public void setOverlay(Drawable drawable) {
        this.c.getHierarchy().r(drawable, 0);
        this.b.getHierarchy().r(drawable, 0);
    }

    @Override // xsna.a870
    public void setPlaceholder(Drawable drawable) {
        if (drawable != null) {
            this.c.setPlaceholderImage(drawable);
            this.b.setPlaceholderImage(drawable);
        }
    }

    @Override // xsna.a870
    public void setRoundAvatarSize(int i) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
        layoutParams.gravity = 17;
        this.b.setLayoutParams(layoutParams);
    }

    @Override // xsna.ts5
    public z770 getView() {
        return this;
    }
}
