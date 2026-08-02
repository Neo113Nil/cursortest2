package xsna;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.cardview.widget.CardView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.stories.entities.stat.StoryBackgroundType;
import com.vk.dto.stories.model.StoryBackground;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;

/* compiled from: StoryBackgroundHolder.kt */
/* loaded from: classes16.dex */
public final class pyl0 extends hf6<qyl0> {
    public final VKImageView m;
    public final VKImageView n;
    public final CardView o;
    public final View p;
    public final View q;
    public final RectF r;
    public final float s;
    public final int t;
    public final int u;

    public pyl0(View view, lyl0 lyl0Var) {
        super(view);
        VKImageView vKImageView = (VKImageView) this.itemView.findViewById(R.id.preview);
        this.m = vKImageView;
        this.n = (VKImageView) this.itemView.findViewById(R.id.preview_dot);
        this.o = (CardView) this.itemView.findViewById(R.id.cv_container);
        this.p = this.itemView.findViewById(R.id.v_selected);
        this.q = this.itemView.findViewById(R.id.iv_animated);
        float b = iah0.b(11.0f);
        this.r = new RectF();
        this.s = cn70.c(32);
        this.t = R.color.vk_gray_750;
        this.u = R.drawable.bg_gray_750_circle;
        this.itemView.setOnClickListener(new ngu(1, lyl0Var, this));
        vKImageView.getHierarchy().q(0);
        vKImageView.setOutlineProvider(new s0w0(b, 6));
        vKImageView.setClipToOutline(true);
    }

    public static void a6(View view, boolean z, boolean z2) {
        if (qq2.d(view.getContext()) || !z2) {
            bwt0.p0(view, z);
            return;
        }
        bwt0.p0(view, !z);
        if (z) {
            ViewPropertyAnimator d = xo2.d(29, 200L, view);
            if (d != null) {
                d.withEndAction(new oyl0(view, 0));
                return;
            }
            return;
        }
        ViewPropertyAnimator e = xo2.e(view, 200L, null, 13);
        if (e != null) {
            e.withEndAction(new mf3(view, 11));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0153, code lost:
    
        if (r3 != null) goto L90;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0090  */
    @Override // xsna.hf6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void W5(qyl0 qyl0Var) {
        Drawable drawable;
        Drawable drawable2;
        boolean z;
        View view;
        Integer num;
        String str;
        String str2;
        qyl0 qyl0Var2 = qyl0Var;
        StoryBackground storyBackground = qyl0Var2.a;
        String str3 = storyBackground.f;
        String str4 = storyBackground.e;
        boolean z2 = storyBackground.h;
        boolean z3 = str3 != null && n8g.f(Color.parseColor(str3)) >= 0.5d;
        float f = this.s;
        int i = this.t;
        VKImageView vKImageView = this.m;
        if (str4 == null || drm0.N(str4)) {
            int i2 = z3 ? i : R.color.vk_white;
            Integer valueOf = z2 ? Integer.valueOf(R.drawable.vk_icon_color_pipette_outline_32) : null;
            int color = this.itemView.getContext().getColor(i2);
            if (str3 != null) {
                int parseColor = Color.parseColor(str3);
                RectF rectF = this.r;
                rectF.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, f);
                Bitmap d = kd7.d((int) rectF.width(), (int) rectF.height());
                if (d != null) {
                    Canvas canvas = new Canvas(d);
                    canvas.drawColor(parseColor);
                    if (valueOf != null) {
                        drawable = dhr0.t.a(valueOf.intValue());
                        if (drawable != null) {
                            int i3 = (int) f;
                            drawable.setBounds(0, 0, i3, i3);
                            drawable.setTint(color);
                            if (drawable != null) {
                                drawable.draw(canvas);
                            }
                            vKImageView.setImageBitmap(d);
                        }
                    }
                    drawable = null;
                    if (drawable != null) {
                    }
                    vKImageView.setImageBitmap(d);
                }
            }
        } else {
            vKImageView.load(str4);
        }
        int i4 = z3 ? this.u : R.drawable.bg_white_circle;
        VKImageView vKImageView2 = this.n;
        vKImageView2.setBackgroundResource(i4);
        int parseColor2 = z2 ? Color.parseColor(str3) : (z3 && qyl0Var2.c) ? this.itemView.getContext().getColor(i) : this.itemView.getContext().getColor(R.color.vk_white);
        CardView cardView = this.o;
        cardView.setCardBackgroundColor(parseColor2);
        if (z2) {
            Drawable a = dhr0.t.a(z3 ? R.drawable.bg_story_background_pipette_gray_editor : R.drawable.bg_story_background_pipette_white_editor);
            if (a != null) {
                int i5 = (int) f;
                a.setBounds(0, 0, i5, i5);
                drawable2 = a;
                cardView.setForeground(drawable2);
                bwt0.p0(this.p, qyl0Var2.c);
                boolean z4 = qyl0Var2.c;
                if (!z2) {
                    a6(vKImageView2, false, true);
                } else if (!bwt0.K(vKImageView2) && z4) {
                    a6(vKImageView2, true, true);
                } else if (!bwt0.K(vKImageView2) || z4) {
                    a6(vKImageView2, z4, false);
                } else {
                    a6(vKImageView2, false, true);
                }
                z = qyl0Var2.c && storyBackground.b == StoryBackgroundType.ANIMATED;
                view = this.q;
                if (bwt0.K(view) && z) {
                    a6(view, true, true);
                } else if (bwt0.K(view) || z) {
                    a6(view, z, false);
                } else {
                    a6(view, false, true);
                }
                View view2 = this.itemView;
                num = storyBackground.i;
                if (num != null) {
                    str2 = this.itemView.getResources().getString(num.intValue());
                }
                str = storyBackground.g;
                if (str == null) {
                    str = "";
                }
                str2 = str;
                view2.setContentDescription(str2);
            }
        }
        drawable2 = null;
        cardView.setForeground(drawable2);
        bwt0.p0(this.p, qyl0Var2.c);
        boolean z42 = qyl0Var2.c;
        if (!z2) {
        }
        if (qyl0Var2.c) {
        }
        view = this.q;
        if (bwt0.K(view)) {
        }
        if (bwt0.K(view)) {
        }
        a6(view, z, false);
        View view22 = this.itemView;
        num = storyBackground.i;
        if (num != null) {
        }
        str = storyBackground.g;
        if (str == null) {
        }
        str2 = str;
        view22.setContentDescription(str2);
    }
}
