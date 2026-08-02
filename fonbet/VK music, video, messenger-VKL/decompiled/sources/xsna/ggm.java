package xsna;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.avatar.api.border.AvatarBorderType;
import com.vk.dto.common.im.ImageList;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.stories.ImStoryState;
import com.vk.im.ui.views.avatars.ImAvatarView;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import xsna.egm;

/* compiled from: DialogItemViewLegacyDelegate.kt */
/* loaded from: classes2.dex */
public final class ggm extends egm {
    public final ImAvatarView K;
    public final Object L;
    public final Object M;

    public ggm(AttributeSet attributeSet, ViewGroup viewGroup) {
        super(attributeSet, viewGroup);
        this.K = new ImAvatarView(this.d, null, 6, 0);
        l9h l9hVar = new l9h(this, 8);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.L = msy.a(lazyThreadSafetyMode, new hn9(9, "DialogItemView.drCallActive", l9hVar));
        this.M = msy.a(lazyThreadSafetyMode, new hn9(9, "DialogItemView.drCallInactive", new fgm(this, 0)));
    }

    @Override // xsna.egm
    public final void N() {
        egm.b bVar = this.m;
        if (bVar == null) {
            bVar = null;
        }
        int i = bVar.f;
        int b = cn70.b(6);
        int i2 = -cn70.b(6);
        int i3 = -cn70.b(6);
        int i4 = -cn70.b(4);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(i, i);
        marginLayoutParams.leftMargin = i2;
        marginLayoutParams.topMargin = i3;
        marginLayoutParams.rightMargin = b;
        marginLayoutParams.bottomMargin = i4;
        ImAvatarView imAvatarView = this.K;
        imAvatarView.setLayoutParams(marginLayoutParams);
        imAvatarView.setAvatarBorderConfigParamsOverride(new o9r0(false, null, Float.valueOf(cn70.b(3)), null, false, null, null, null, null, 2043));
    }

    @Override // xsna.egm
    public final void Y(ImageList imageList, Drawable drawable, boolean z) {
        this.K.p1(imageList, drawable, z ? AvatarBorderType.HEXAGON : AvatarBorderType.CIRCLE);
    }

    @Override // xsna.egm
    public final void Z(Dialog dialog, ProfilesSimpleInfo profilesSimpleInfo) {
        this.K.r1(dialog, profilesSimpleInfo);
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.egm
    public final void a(int i, int i2) {
        int i3 = a2u0.a;
        ImAvatarView imAvatarView = this.K;
        a2u0.a(bwt0.N(imAvatarView) + i, bwt0.P(imAvatarView) + i2, imAvatarView);
        u9r0 config = imAvatarView.getConfig();
        int i4 = config != null ? (int) config.b.d : 0;
        int right = imAvatarView.getRight();
        ?? r2 = this.J;
        egm.a.d(r2, (right - (!r2.isInitialized() ? 0 : ((View) r2.getValue()).getMeasuredWidth())) - i4, cn70.b(4) + ((imAvatarView.getBottom() - egm.a.a(r2)) - i4));
        int right2 = imAvatarView.getRight();
        ?? r1 = this.I;
        egm.a.d(r1, right2 - (r1.isInitialized() ? ((View) r1.getValue()).getMeasuredWidth() : 0), imAvatarView.getTop());
    }

    @Override // xsna.egm
    public final void a0(View.OnClickListener onClickListener) {
        ImAvatarView imAvatarView = this.K;
        bwt0.h0(onClickListener, imAvatarView);
        imAvatarView.setClickable(onClickListener != null);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.egm
    public final void b(int i, int i2) {
        int i3 = a2u0.a;
        a2u0.c(this.K, i, 0, i2);
        ?? r0 = this.J;
        if (r0.isInitialized()) {
            a2u0.d((View) r0.getValue(), i, 0, i2);
        }
        ?? r02 = this.I;
        if (r02.isInitialized()) {
            a2u0.d((View) r02.getValue(), i, 0, i2);
        }
    }

    @Override // xsna.egm
    public final void b0(String str) {
        this.K.setContentDescription(str);
    }

    @Override // xsna.egm
    public final void c0(View.OnTouchListener onTouchListener) {
        this.K.setOnTouchListener(onTouchListener);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.egm
    public final void f0() {
        int b = cn70.b(16);
        int b2 = cn70.b(20);
        ?? r2 = this.J;
        bwt0.m0(b, b2, (View) r2.getValue());
        ((ImageView) r2.getValue()).setImageDrawable((Drawable) this.h.getValue());
        xo2.d(31, 0L, (View) r2.getValue());
    }

    @Override // xsna.egm
    public final void g0() {
        ImAvatarView.x1(this.K, dhr0.t.a(R.drawable.ic_cake_circle_fill_purple_composite_26));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.egm
    public final void h0(boolean z) {
        Drawable drawable = z ? (Drawable) this.L.getValue() : (Drawable) this.M.getValue();
        ?? r0 = this.I;
        ((ImageView) r0.getValue()).setImageDrawable(drawable);
        r0.isInitialized();
        bwt0.p0((View) r0.getValue(), true);
    }

    @Override // xsna.egm
    public final void i() {
        this.K.t1();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.egm
    public final void i0() {
        ImAvatarView.x1(this.K, null);
        ?? r0 = this.I;
        if (r0.isInitialized()) {
            bwt0.p0((View) r0.getValue(), false);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.egm
    public final void j0() {
        ?? r0 = this.J;
        if (r0.isInitialized()) {
            xo2.e((View) r0.getValue(), 0L, null, 15);
        }
    }

    @Override // xsna.egm
    public final Rect k(Rect rect) {
        this.K.getGlobalVisibleRect(rect);
        return rect;
    }

    @Override // xsna.egm
    public final void k0(ImStoryState imStoryState) {
        this.K.w1(imStoryState);
    }

    @Override // xsna.egm
    public final View l() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.egm
    public final void v0() {
        ?? r0 = this.J;
        if (r0.isInitialized()) {
            d3m.b((View) r0.getValue(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3);
        }
    }
}
