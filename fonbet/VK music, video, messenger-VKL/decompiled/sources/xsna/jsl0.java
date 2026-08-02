package xsna;

import android.view.View;
import android.widget.ImageView;
import com.facebook.drawee.generic.RoundingParams;
import com.unity3d.services.UnityAdsConstants;
import com.vk.attachpicker.stickers.post.attach.StoryAttachImageView;
import com.vk.core.tool.view.galvitalayout.GalvitaLayout;
import com.vk.dto.common.restrictions.Restriction;
import com.vk.imageloader.view.VKImageView;
import com.vk.stories.design.view.stickers.post.RoundedFrameLayout;
import com.vkontakte.android.R;

/* compiled from: StoriesGalvitaGridAdapter.kt */
/* loaded from: classes15.dex */
public final class jsl0 extends o5t<w64> {
    public final a31 c;

    /* compiled from: StoriesGalvitaGridAdapter.kt */
    public static final class a extends d6t {
        public static final float h = cn70.a() * 2.0f;
        public static final int i = cn70.b(40);
        public static final int j = cn70.b(36);
        public final StoryAttachImageView c;
        public final View d;
        public final VKImageView e;
        public w64 f;
        public final jwx g;

        public a(View view, int i2, a31 a31Var) {
            super(view, i2);
            njt hierarchy;
            njt hierarchy2;
            StoryAttachImageView storyAttachImageView = (StoryAttachImageView) view.findViewById(R.id.image);
            this.c = storyAttachImageView;
            this.d = view.findViewById(R.id.overlay);
            this.e = (VKImageView) view.findViewById(R.id.restriction_icon);
            this.g = new jwx(5, 60);
            RoundedFrameLayout roundedFrameLayout = (RoundedFrameLayout) view.findViewById(R.id.imageFrame);
            float f = h;
            if (roundedFrameLayout != null) {
                roundedFrameLayout.setCornerRadius(f);
            }
            if (storyAttachImageView != null) {
                storyAttachImageView.setImageCornerRadius(f);
            }
            if (storyAttachImageView != null) {
                storyAttachImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            }
            if (storyAttachImageView != null && (hierarchy2 = storyAttachImageView.getHierarchy()) != null) {
                hierarchy2.u(RoundingParams.b(f));
            }
            if (storyAttachImageView != null && (hierarchy = storyAttachImageView.getHierarchy()) != null) {
                hierarchy.q(0);
            }
            bwt0.S(view, new r770(8, this, a31Var));
        }

        public final void a(w64 w64Var) {
            String str = w64Var.a;
            this.f = w64Var;
            Restriction restriction = w64Var.c;
            View view = this.d;
            StoryAttachImageView storyAttachImageView = this.c;
            VKImageView vKImageView = this.e;
            if (restriction == null) {
                bwt0.p0(view, false);
                bwt0.p0(vKImageView, false);
                storyAttachImageView.setPostprocessor(null);
                if (storyAttachImageView != null) {
                    storyAttachImageView.T0(str);
                    return;
                }
                return;
            }
            bwt0.p0(view, true);
            View view2 = this.a;
            int width = view2.getWidth();
            int i2 = i;
            if (width <= i2 || view2.getHeight() <= i2) {
                bwt0.p0(vKImageView, false);
            } else {
                bwt0.p0(vKImageView, true);
                egi.f(vKImageView, j, restriction);
            }
            if (w64Var.d) {
                storyAttachImageView.setPostprocessor(this.g);
                if (storyAttachImageView != null) {
                    storyAttachImageView.T0(str);
                }
            }
        }
    }

    public jsl0(a31 a31Var) {
        this.c = a31Var;
    }

    @Override // xsna.o5t
    public final float a(int i) {
        w64 w64Var = (w64) j5g.b0(i, this.a);
        return w64Var != null ? w64Var.b : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // xsna.o5t
    public final int b(int i) {
        return 0;
    }

    @Override // xsna.o5t
    public final void c(d6t d6tVar, int i) {
        w64 w64Var;
        a aVar = d6tVar instanceof a ? (a) d6tVar : null;
        if (aVar == null || (w64Var = (w64) j5g.b0(i, this.a)) == null) {
            return;
        }
        aVar.a(w64Var);
    }

    @Override // xsna.o5t
    public final d6t d(GalvitaLayout galvitaLayout, int i) {
        return new a(bwt0.I(R.layout.galvita_grid_simple_holder, galvitaLayout, false), i, this.c);
    }
}
