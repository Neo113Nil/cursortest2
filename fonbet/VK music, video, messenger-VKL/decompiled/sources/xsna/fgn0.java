package xsna;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vk.avatar.api.VKAvatarView;
import com.vk.avatar.api.border.AvatarBorderType;
import xsna.cq5;
import xsna.f5h0;
import xsna.hgn0;

/* compiled from: SuperappAvatarView.kt */
/* loaded from: classes6.dex */
public final class fgn0 extends VKAvatarView implements hgn0 {
    public int s;
    public hgn0.a t;
    public String u;
    public Integer v;
    public Drawable w;

    @Override // xsna.hgn0
    public final void G(String str, hgn0.a aVar) {
        this.u = str;
        this.v = null;
        this.w = null;
        e1(aVar, null);
        f1(false);
    }

    @Override // xsna.hgn0
    public final void H(int i, hgn0.a aVar) {
        e1(aVar, null);
        setPlaceholderImage(i);
    }

    @Override // xsna.hgn0
    public final void M(int i, hgn0.a aVar) {
        this.u = null;
        this.v = Integer.valueOf(i);
        this.w = null;
        e1(aVar, null);
        f1(false);
    }

    @Override // xsna.hgn0
    public final void N(Drawable drawable, hgn0.a aVar) {
        this.u = null;
        this.v = null;
        this.w = drawable;
        e1(aVar, null);
        f1(false);
    }

    @Override // xsna.hgn0
    public final void P(Drawable drawable, f5h0.d dVar, hgn0.a aVar) {
        e1(aVar, null);
        Q0(drawable, dVar);
    }

    public final void e1(hgn0.a aVar, Integer num) {
        int fixedWidth;
        int fixedHeight;
        Float f;
        AvatarBorderType avatarBorderType = aVar.a;
        cq5 cq5Var = aVar.b;
        int i = avatarBorderType == AvatarBorderType.HEXAGON ? 1 : 2;
        o9r0 borderConfig = getBorderConfig();
        int floatValue = i * ((borderConfig == null || (f = borderConfig.c) == null) ? 0 : (int) f.floatValue());
        if (num != null) {
            fixedWidth = num.intValue();
            fixedHeight = num.intValue();
        } else {
            fixedWidth = getFixedWidth() > 0 ? getFixedWidth() : getLayoutParams().width;
            fixedHeight = getFixedHeight() > 0 ? getFixedHeight() : getLayoutParams().height;
        }
        boolean z = this.t.b instanceof cq5.b;
        if (z && !(cq5Var instanceof cq5.b)) {
            fixedWidth -= floatValue;
            fixedHeight -= floatValue;
        }
        if (!z && (cq5Var instanceof cq5.b)) {
            fixedWidth += floatValue;
            fixedHeight += floatValue;
        }
        H0(fixedWidth, fixedHeight);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.width = fixedWidth;
        layoutParams.height = fixedHeight;
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = 17;
        }
        setLayoutParams(layoutParams);
        this.t = aVar;
        VKAvatarView.c1(this, aVar.a, cq5Var, 4);
    }

    public final void f1(boolean z) {
        String str = this.u;
        if (str != null) {
            if (z) {
                v0(str);
                return;
            } else {
                load(str);
                return;
            }
        }
        Integer num = this.v;
        if (num != null) {
            q0(num.intValue());
            return;
        }
        Drawable drawable = this.w;
        if (drawable != null) {
            setImageDrawable(drawable);
        }
    }

    @Override // xsna.hgn0
    public o9r0 getBorderConfig() {
        return getAvatarBorderConfigParamsOverride();
    }

    @Override // xsna.hgn0
    public int getRoundAvatarSize() {
        return this.s;
    }

    @Override // xsna.hgn0
    public final void i(String str, hgn0.a aVar) {
        this.u = str;
        this.v = null;
        this.w = null;
        e1(aVar, null);
        f1(true);
    }

    @Override // xsna.hgn0
    public void setAvatarSize(int i) {
        e1(this.t, Integer.valueOf(i));
    }

    @Override // xsna.hgn0
    public void setBorderConfig(o9r0 o9r0Var) {
        if (o9r0Var != null) {
            setAvatarBorderConfigParamsOverride(o9r0Var);
        }
    }

    @Override // xsna.hgn0
    public void setRoundAvatarSize(int i) {
        this.s = i;
    }

    @Override // xsna.hgn0
    public void setupBorder(hgn0.a aVar) {
        e1(aVar, null);
        f1(false);
    }

    @Override // xsna.ts5
    public View getView() {
        return this;
    }
}
