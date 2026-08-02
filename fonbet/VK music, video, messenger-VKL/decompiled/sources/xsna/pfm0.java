package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ViewSwitcher;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.button.tool.VkToolButton;
import com.vk.imageloader.view.VKImageView;
import com.vk.stories.design.view.stats.carousel.PreviewSnapRecyclerView;
import com.vk.stories.design.view.stats.carousel.SidesScaleHorizontalLinearLayoutManager;
import com.vkontakte.android.R;
import xsna.khm0;

/* compiled from: StoryStatisticsPreview.kt */
/* loaded from: classes6.dex */
public final class pfm0 extends ConstraintLayout {
    public final w65 A;
    public boolean B;
    public Float C;
    public a D;
    public boolean E;
    public iz8 F;
    public final o3d0 G;
    public final View H;
    public final ImageView I;
    public final ImageView J;
    public final PreviewSnapRecyclerView K;
    public final VKImageView L;
    public final ViewSwitcher M;
    public final float t;
    public final float u;
    public final float v;
    public final float w;
    public final int x;
    public final float y;
    public final float z;

    /* compiled from: StoryStatisticsPreview.kt */
    public interface a {
        void a();

        void b();

        void c();

        void d(int i);

        void e(int i);

        void f();

        void g();

        void h(int i);
    }

    /* compiled from: StoryStatisticsPreview.kt */
    public static final class b extends com.vk.core.view.components.button.tool.a {
        public final /* synthetic */ khm0.e a;

        public b(khm0.e eVar) {
            this.a = eVar;
        }

        @Override // com.vk.core.view.components.button.tool.a
        public final Integer a(VkToolButton.Mode mode, VkToolButton.Appearance appearance) {
            return 0;
        }

        @Override // com.vk.core.view.components.button.tool.a
        public final u2p0 b(VkToolButton.Mode mode, VkToolButton.Appearance appearance) {
            khm0.e eVar = this.a;
            return new u2p0(R.attr.vk_ui_transparent, eVar.e, eVar.c);
        }

        @Override // com.vk.core.view.components.button.tool.a
        public final Integer c(VkToolButton.Mode mode, VkToolButton.Appearance appearance) {
            return -1;
        }
    }

    public pfm0(Context context) {
        super(context, null, 0);
        int dimension = ((int) getResources().getDimension(R.dimen.story_statistics_button_top_margin)) + ((int) getTopOffset());
        this.t = getResources().getDimension(R.dimen.story_statistics_preview_top_margin) + ((int) getTopOffset());
        this.u = getResources().getDimension(R.dimen.story_statistics_preview_bottom_margin);
        this.v = getResources().getDimension(R.dimen.story_statistics_preview_item_height);
        this.w = getResources().getDimension(R.dimen.story_statistics_preview_item_corner_radius);
        int dimension2 = (int) getResources().getDimension(R.dimen.story_statistics_preview_item_horizontal_padding);
        this.x = dimension2;
        this.y = getResources().getDimension(R.dimen.story_statistics_privacy_height);
        this.z = getResources().getDimension(R.dimen.story_statistics_privacy_bottom_margin);
        this.A = new w65(15);
        o3d0 o3d0Var = new o3d0();
        this.G = o3d0Var;
        dhk0 dhk0Var = new dhk0(dimension2, 0, dimension2, 0);
        qfm0 qfm0Var = new qfm0(this);
        LayoutInflater.from(context).inflate(R.layout.layout_story_statistics_preview, this);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        setBackgroundColor(-16777216);
        this.H = findViewById(R.id.preview_bottom_border);
        ImageView imageView = (ImageView) findViewById(R.id.button_settings);
        this.I = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.button_close);
        this.J = imageView2;
        PreviewSnapRecyclerView previewSnapRecyclerView = (PreviewSnapRecyclerView) findViewById(R.id.preview_recycler);
        this.K = previewSnapRecyclerView;
        this.L = (VKImageView) findViewById(R.id.collapsible_preview);
        ViewSwitcher viewSwitcher = (ViewSwitcher) findViewById(R.id.button_privacy);
        this.M = viewSwitcher;
        bwt0.i0(imageView, new ie90(this, 21));
        bwt0.i0(imageView2, new lxh0(this, 5));
        bwt0.i0(viewSwitcher, new mvl0(this, 1));
        bwt0.f0(imageView, 0, dimension, 0, 0, 13);
        bwt0.f0(imageView2, 0, dimension, 0, 0, 13);
        previewSnapRecyclerView.getContext();
        previewSnapRecyclerView.setLayoutManager(new SidesScaleHorizontalLinearLayoutManager(0, false));
        previewSnapRecyclerView.setAdapter(o3d0Var);
        previewSnapRecyclerView.setHasFixedSize(true);
        previewSnapRecyclerView.setItemAnimator(new o4d0());
        previewSnapRecyclerView.addItemDecoration(dhk0Var);
        previewSnapRecyclerView.setPreviewScrollListener(qfm0Var);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.setDuration(300L);
        animationSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animationSet.addAnimation(new AlphaAnimation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f));
        AnimationSet animationSet2 = new AnimationSet(true);
        animationSet2.setDuration(300L);
        animationSet2.setInterpolator(new AccelerateDecelerateInterpolator());
        animationSet2.addAnimation(new AlphaAnimation(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        viewSwitcher.setInAnimation(animationSet);
        viewSwitcher.setOutAnimation(animationSet2);
        awt0.o(viewSwitcher, new rj60(this, 29));
    }

    private final float getTopOffset() {
        return !iah0.o(getContext()) ? fnj.a(getContext()) : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public final void P4(float f, int i) {
        if (epx.a(f, this.C)) {
            return;
        }
        this.C = Float.valueOf(f);
        iz8 iz8Var = this.F;
        float topOffset = iz8Var != null ? iz8Var.c : getTopOffset();
        boolean z = f == 1.0f;
        PreviewSnapRecyclerView previewSnapRecyclerView = this.K;
        previewSnapRecyclerView.setFullyCollapsedState(z);
        float f2 = 1 - f;
        int i2 = (int) ((this.t * f) + (topOffset * f2));
        int i3 = (int) ((this.u + (this.E ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : this.y + this.z)) * f);
        bwt0.f0(this.L, 0, i2, 0, i3, 5);
        bwt0.f0(this.K, 0, i2, 0, i3, 5);
        int itemCount = this.G.getItemCount();
        for (int i4 = 0; i4 < itemCount; i4++) {
            RecyclerView.e0 findViewHolderForAdapterPosition = previewSnapRecyclerView.findViewHolderForAdapterPosition(i4);
            if (findViewHolderForAdapterPosition != null && (findViewHolderForAdapterPosition instanceof y5d0)) {
                y5d0 y5d0Var = (y5d0) findViewHolderForAdapterPosition;
                y5d0Var.q.setAlpha(f);
                y5d0Var.r.setAlpha(f);
            }
        }
        this.I.setAlpha(f);
        this.J.setAlpha(f);
        float f3 = (this.w * f) + (iz8.j * f2);
        bwt0.d(this.L, f3, (r4 & 2) != 0, (r4 & 4) != 0);
        for (int i5 = 0; i5 < previewSnapRecyclerView.getChildCount(); i5++) {
            bwt0.d(previewSnapRecyclerView.getChildAt(i5), f3, (r4 & 2) != 0, (r4 & 4) != 0);
        }
        f4m.q(i, this.H);
    }

    public final ImageView getCloseButton() {
        return this.J;
    }

    public final VKImageView getPreviewCollapsible() {
        return this.L;
    }

    public final PreviewSnapRecyclerView getPreviewRecycler() {
        return this.K;
    }

    public final ViewSwitcher getPrivacyButton() {
        return this.M;
    }

    public final ImageView getSettingsButton() {
        return this.I;
    }

    public final void setCadreSize(iz8 iz8Var) {
        this.F = iz8Var;
        int i = iz8Var.a;
        float f = this.v;
        int i2 = iz8Var.b;
        int z = ((iah0.z(getContext()) - ((int) ((f * i) / i2))) / 2) - this.x;
        this.K.setPadding(z, 0, z, 0);
        o3d0 o3d0Var = this.G;
        o3d0Var.c.getClass();
        o3d0Var.e = "H," + i2 + ':' + i;
        ViewGroup.LayoutParams layoutParams = this.L.getLayoutParams();
        ConstraintLayout.b bVar = layoutParams instanceof ConstraintLayout.b ? (ConstraintLayout.b) layoutParams : null;
        if (bVar != null) {
            this.A.getClass();
            bVar.G = "W," + i + ':' + i2;
        }
    }

    public final void setCallback(a aVar) {
        this.D = aVar;
        this.G.d = aVar;
    }

    public final void setContentVisibility(khm0.c cVar) {
        View childAt;
        if (cVar.a && !this.B) {
            this.B = true;
            PreviewSnapRecyclerView previewSnapRecyclerView = this.K;
            if (previewSnapRecyclerView.getChildCount() > 0) {
                childAt = previewSnapRecyclerView.getChildAt(0);
                if (childAt == null) {
                    throw new IndexOutOfBoundsException();
                }
            } else {
                childAt = null;
            }
            if (childAt != null) {
                int z = ((iah0.z(getContext()) - childAt.getWidth()) / 2) - this.x;
                previewSnapRecyclerView.setPadding(z, 0, z, 0);
            }
            previewSnapRecyclerView.a();
            bwt0.p0(previewSnapRecyclerView, true);
            bwt0.p0(this.L, false);
        }
        if (!cVar.b) {
            f4m.j(this.M);
            s3q0 s3q0Var = s3q0.a;
        } else if (cVar.c) {
            d3m.c(this.M, (r15 & 1) != 0 ? 300L : 200L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        } else {
            d3m.e(this.M, (r15 & 1) != 0 ? 300L : 200L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
        }
    }

    public final void setIsGroup(boolean z) {
        this.E = z;
    }

    public final void setPreviewCadres(khm0.d dVar) {
        this.G.submitList(dVar.a);
    }

    public final void setPreviewSelection(khm0.b bVar) {
        int i = bVar.a;
        boolean z = this.B;
        PreviewSnapRecyclerView previewSnapRecyclerView = this.K;
        if (!z && previewSnapRecyclerView.getCurrentPosition() != i) {
            previewSnapRecyclerView.scrollToPosition(i);
        }
        previewSnapRecyclerView.setSavedCenterPosition(i);
    }

    public final void setPrivacy(khm0.e eVar) {
        int i = eVar.d;
        if (eVar.a) {
            ViewSwitcher viewSwitcher = this.M;
            View nextView = viewSwitcher.getNextView();
            VkToolButton vkToolButton = nextView instanceof VkToolButton ? (VkToolButton) nextView : null;
            if (vkToolButton != null) {
                vkToolButton.setStyle(new b(eVar));
                VkToolButton.c(vkToolButton, Integer.valueOf(eVar.b));
                vkToolButton.setText(i);
            }
            viewSwitcher.setContentDescription(getContext().getString(R.string.story_statistics_current_privacy, getContext().getString(i)));
            viewSwitcher.showNext();
        }
    }

    public final void setBlurVisibility(boolean z) {
    }
}
