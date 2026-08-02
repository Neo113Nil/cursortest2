package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vk.avatar.api.VKAvatarView;
import com.vk.avatar.api.border.AvatarBorderType;
import com.vk.dto.common.im.ImageList;
import xsna.sew0;

/* compiled from: VoipAvatarViewContainer.kt */
/* loaded from: classes7.dex */
public final class tew0 extends FrameLayout implements uew0 {
    public final VKAvatarView b;
    public final VKAvatarView c;
    public int d;
    public final /* synthetic */ Context e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tew0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = context;
        VKAvatarView vKAvatarView = new VKAvatarView(context, null, 6, 0);
        vKAvatarView.setId(-1);
        this.b = vKAvatarView;
        VKAvatarView vKAvatarView2 = new VKAvatarView(context, null, 6, 0);
        vKAvatarView2.setId(-1);
        bwt0.p0(vKAvatarView2, false);
        this.c = vKAvatarView2;
        this.d = Math.min(getWidth(), getHeight());
    }

    @Override // xsna.uew0
    public final void O(sew0 sew0Var) {
        if (sew0Var instanceof sew0.c) {
            sew0.c cVar = (sew0.c) sew0Var;
            c(new kr5((AvatarBorderType) null, new h2z(this.e, cVar.b, cVar.c), (izs) null, 11));
        } else if (sew0Var instanceof sew0.b) {
            c(new kr5(((sew0.b) sew0Var).c ? AvatarBorderType.HEXAGON : AvatarBorderType.CIRCLE, (h2z) null, new ykt0(sew0Var, 8), 6));
        }
    }

    @Override // xsna.uew0
    public final void a(String str, AvatarBorderType avatarBorderType, cq5 cq5Var) {
        VKAvatarView vKAvatarView = this.b;
        VKAvatarView.c1(vKAvatarView, avatarBorderType, cq5Var, 4);
        VKAvatarView.c1(this.c, avatarBorderType, cq5Var, 4);
        vKAvatarView.load(str);
    }

    @Override // xsna.uew0
    public final void c(kr5 kr5Var) {
        AvatarBorderType avatarBorderType = kr5Var.a;
        cq5 cq5Var = kr5Var.b;
        VKAvatarView vKAvatarView = this.b;
        VKAvatarView.c1(vKAvatarView, avatarBorderType, cq5Var, 4);
        VKAvatarView.c1(this.c, avatarBorderType, cq5Var, 4);
        Drawable drawable = kr5Var.c;
        if (drawable != null) {
            vKAvatarView.setEmptyImagePlaceholder(drawable);
        }
        vKAvatarView.Y0(kr5Var);
    }

    @Override // xsna.uew0
    public o9r0 getBorderParams() {
        return this.b.getAvatarBorderConfigParamsOverride();
    }

    @Override // xsna.uew0
    public int getRoundAvatarSize() {
        return this.d;
    }

    @Override // xsna.uew0
    public final void o(ImageList imageList, AvatarBorderType avatarBorderType, cq5 cq5Var, Drawable drawable) {
        VKAvatarView vKAvatarView = this.b;
        VKAvatarView.c1(vKAvatarView, avatarBorderType, cq5Var, 4);
        VKAvatarView.c1(this.c, avatarBorderType, cq5Var, 4);
        if (drawable != null) {
            vKAvatarView.setPlaceholderImage(drawable);
        }
        vKAvatarView.load(imageList != null ? ImageList.Eb(getRoundAvatarSize(), getRoundAvatarSize(), imageList.b) : null);
    }

    @Override // xsna.uew0
    public void setBorderParams(o9r0 o9r0Var) {
        if (o9r0Var != null) {
            this.b.setAvatarBorderConfigParamsOverride(o9r0Var);
            this.c.setAvatarBorderConfigParamsOverride(o9r0Var);
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (layoutParams != null) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams.width, layoutParams.height);
            removeAllViews();
            addView(this.b, layoutParams2);
            addView(this.c, layoutParams2);
        }
    }

    @Override // xsna.uew0
    public void setRoundAvatarSize(int i) {
        this.d = i;
    }

    @Override // xsna.uew0
    public void setupOverlay(Drawable drawable) {
        VKAvatarView vKAvatarView = this.c;
        if (drawable != null) {
            vKAvatarView.setEmptyImagePlaceholder(drawable);
            vKAvatarView.load(null);
        }
        bwt0.p0(vKAvatarView, drawable != null);
    }

    @Override // xsna.ts5
    public View getView() {
        return this;
    }
}
