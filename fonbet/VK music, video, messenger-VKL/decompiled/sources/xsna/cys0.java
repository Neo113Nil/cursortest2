package xsna;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.motion.widget.a;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import com.vk.catalog2.video.VideoCatalogId;
import com.vk.core.fragments.FragmentEntry;
import com.vk.core.view.components.button.VkSimpleButton;
import com.vk.core.view.components.placeholder.VkPlaceholder;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.id.UserId;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.imageloader.view.VKImageView;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.superapp.ui.shimmer.Shimmer;
import com.vk.superapp.ui.shimmer.ShimmerFrameLayout;
import com.vk.video.profile.presentation.VideoProfileFragmentOld;
import com.vk.video.profile.presentation.a;
import com.vk.video.profile.presentation.catalog.VideoProfileCatalogFragment;
import com.vk.video.profile.presentation.views.VideoNewProfileHeaderViewV2;
import com.vk.video.profile.presentation.views.VideoNewProfileToolbarV2;
import com.vkontakte.android.R;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import xsna.f5h0;
import xsna.f8t0;
import xsna.iut0;
import xsna.k7t0;
import xsna.k9t0;
import xsna.n7t0;

/* compiled from: VideoNewProfileV2Screen.kt */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes6.dex */
public final class cys0 extends qb30 implements gm50 {
    public final f5z U;
    public final Lifecycle V;
    public final p1t W;
    public final boolean a0;
    public final VideoProfileFragmentOld.e b0;
    public final MotionLayout c0;
    public final VideoNewProfileToolbarV2 d0;
    public final View e0;
    public final VKImageView f0;
    public final ShimmerFrameLayout g0;
    public final View h0;
    public final VideoNewProfileHeaderViewV2 i0;
    public final View j0;
    public final FragmentContainerView k0;
    public final View l0;
    public final VkSimpleButton m0;
    public final VkPlaceholder n0;
    public final View o0;
    public float p0;
    public boolean q0;
    public final int r0;

    public cys0(final Context context, f5z f5zVar, androidx.lifecycle.m mVar, p1t p1tVar, boolean z, VideoProfileFragmentOld.e eVar) {
        super(context);
        this.U = f5zVar;
        this.V = mVar;
        this.W = p1tVar;
        this.a0 = z;
        this.b0 = eVar;
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.r0 = Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels);
        HashSet hashSet = iah0.a;
        View.inflate(context, (fnj.d(context) ? nr2.d : blk.d).m(), this);
        setFitsSystemWindows(true);
        MotionLayout motionLayout = (MotionLayout) findViewById(R.id.video_profile_new_v2_motion_layout);
        this.c0 = motionLayout;
        this.e0 = findViewById(R.id.video_profile_new_v2_cover);
        VKImageView vKImageView = (VKImageView) findViewById(R.id.video_profile_new_v2_cover_image);
        this.f0 = vKImageView;
        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) findViewById(R.id.video_profile_new_v2_cover_shimmer);
        this.g0 = shimmerFrameLayout;
        this.h0 = findViewById(R.id.video_profile_new_v2_cover_stub);
        View findViewById = findViewById(R.id.video_profile_new_v2_sections_container_bottom);
        this.j0 = findViewById;
        VideoNewProfileToolbarV2 videoNewProfileToolbarV2 = (VideoNewProfileToolbarV2) findViewById(R.id.video_profile_new_v2_toolbar);
        this.d0 = videoNewProfileToolbarV2;
        videoNewProfileToolbarV2.setSearchEnabled(z);
        VideoNewProfileHeaderViewV2 videoNewProfileHeaderViewV2 = (VideoNewProfileHeaderViewV2) findViewById(R.id.video_profile_new_v2_header_section);
        this.i0 = videoNewProfileHeaderViewV2;
        this.l0 = findViewById(R.id.video_profile_new_v2_anonymous_hint);
        this.m0 = (VkSimpleButton) findViewById(R.id.video_profile_v2_anonymous_hint_btn_sign_in);
        this.k0 = (FragmentContainerView) findViewById(R.id.video_profile_new_v2_list_fragment_container);
        VkPlaceholder vkPlaceholder = (VkPlaceholder) findViewById(R.id.video_profile_new_v2_connection_error_view);
        this.n0 = vkPlaceholder;
        this.o0 = findViewById(R.id.video_profile_new_v2_catalog_skeleton);
        final androidx.constraintlayout.widget.b Z4 = motionLayout.Z4(R.id.profile_expanded_set);
        final androidx.constraintlayout.widget.b Z42 = motionLayout.Z4(R.id.profile_default_set);
        u080 u080Var = new u080() { // from class: xsna.ays0
            @Override // xsna.u080
            public final bqx0 b(View view, bqx0 bqx0Var) {
                h4x j = bqx0Var.a.j(647);
                int a = e3m.a(R.dimen.vk_video_profile_v2_toolbar_height, context) + j.b;
                androidx.constraintlayout.widget.b bVar = Z4;
                if (bVar != null) {
                    bVar.E(R.id.video_profile_new_v2_appbar_guideline, a);
                }
                androidx.constraintlayout.widget.b bVar2 = Z42;
                if (bVar2 != null) {
                    bVar2.E(R.id.video_profile_new_v2_appbar_guideline, a);
                }
                cys0 cys0Var = this;
                cys0Var.c0.setPadding(j.a, 0, j.c, j.d);
                View view2 = cys0Var.h0;
                if (view2 != null) {
                    awt0.x(view2, 0, j.b, 0, 0, 13);
                }
                return bqx0.b;
            }
        };
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        iut0.d.c(this, u080Var);
        setProgressBackgroundColorSchemeColor(e3m.f(R.attr.vk_ui_background_modal, context));
        setColorSchemeColors(e3m.f(R.attr.vk_ui_icon_accent, context));
        vKImageView.setActualScaleType(f5h0.f.a);
        vKImageView.setEmptyImagePlaceholder(new ColorDrawable(e3m.f(R.attr.vk_ui_background, getContext())));
        Shimmer a = tdj0.a(vKImageView.getContext());
        com.vk.superapp.ui.shimmer.a aVar = new com.vk.superapp.ui.shimmer.a();
        aVar.setCallback(vKImageView);
        aVar.b(a);
        vKImageView.setPlaceholderImage(aVar);
        f4m.j(vkPlaceholder);
        videoNewProfileHeaderViewV2.setVisibility(0);
        videoNewProfileHeaderViewV2.a(f8t0.b.a);
        p(new k9t0.a(false, false, false, false));
        o(n7t0.e.a);
        n(k7t0.c.a);
        shimmerFrameLayout.b(tdj0.a(shimmerFrameLayout.getContext()));
        videoNewProfileToolbarV2.setListener(new p5e(1, this, cys0.class, "onToolbarProgressChanged", "onToolbarProgressChanged(F)V", 0, 10));
        findViewById.setClipToOutline(true);
    }

    private final VideoNewProfileToolbarV2.State getToolbarDefaultState() {
        return this.a0 ? VideoNewProfileToolbarV2.State.Searchable : VideoNewProfileToolbarV2.State.Default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListeners$lambda$14(cys0 cys0Var) {
        cys0Var.b0.invoke(a.z.b);
    }

    @Override // xsna.gm50
    public f5z getViewOwner() {
        return this.U;
    }

    public final void n(k7t0 k7t0Var) {
        boolean z = k7t0Var instanceof k7t0.d;
        setEnabled(z);
        Iterator<T> it = this.c0.getDefinedTransitions().iterator();
        while (it.hasNext()) {
            ((a.b) it.next()).o = !z;
        }
        boolean f = epx.f(k7t0Var, k7t0.b.a);
        View view = this.o0;
        View view2 = this.l0;
        FragmentContainerView fragmentContainerView = this.k0;
        if (f) {
            f4m.j(view2);
            f4m.j(fragmentContainerView);
            f4m.j(view);
            return;
        }
        if (epx.f(k7t0Var, k7t0.c.a)) {
            f4m.j(view2);
            f4m.j(fragmentContainerView);
            view.setVisibility(0);
            return;
        }
        if (epx.f(k7t0Var, k7t0.a.a)) {
            view2.setVisibility(0);
            f4m.j(fragmentContainerView);
            f4m.j(view);
            return;
        }
        if (!z) {
            throw new NoWhenBranchMatchedException();
        }
        p1t p1tVar = this.W;
        FragmentManager fragmentManager = (FragmentManager) p1tVar.b;
        VideoProfileCatalogFragment.a aVar = new VideoProfileCatalogFragment.a(VideoProfileCatalogFragment.class, null, null);
        aVar.j.putSerializable("video_catalog_id", VideoCatalogId.PROFILE);
        k7t0.d dVar = (k7t0.d) k7t0Var;
        UserId userId = dVar.a;
        Bundle bundle = aVar.j;
        bundle.putParcelable("owner_id", userId);
        bundle.putParcelable("search_stats_logging_info", (SearchStatsLoggingInfo) p1tVar.d);
        bundle.putString("ref", com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.PROFILE));
        aVar.z(dVar.b, false);
        FragmentEntry j = aVar.j();
        androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(fragmentManager);
        aVar2.r = true;
        aVar2.g(fragmentContainerView.getId(), aVar2.e(j.b, j.c), "VideoProfileCatalogFragment");
        aVar2.h(new tn9(this, 22), false);
        aVar2.l();
    }

    public final void o(n7t0 n7t0Var) {
        String str;
        int i = !(n7t0Var instanceof n7t0.c) ? 0 : 8;
        View view = this.e0;
        view.setVisibility(i);
        if (view.getVisibility() == 0) {
            boolean z = n7t0Var instanceof n7t0.e;
            int i2 = !z ? 0 : 8;
            VKImageView vKImageView = this.f0;
            vKImageView.setVisibility(i2);
            this.g0.setVisibility(z ? 0 : 8);
            if (n7t0Var instanceof n7t0.b) {
                vKImageView.setImageDrawable(new m2k(GradientDrawable.Orientation.BL_TR, new int[]{((n7t0.b) n7t0Var).a, dhr0.t.c(R.attr.vk_ui_background_content)}));
            } else if (n7t0Var instanceof n7t0.d) {
                ImageSize Cb = ((n7t0.d) n7t0Var).a.Cb(this.r0, true, false);
                if (Cb != null && (str = Cb.d.d) != null) {
                    vKImageView.load(str);
                }
            } else {
                vKImageView.setImageDrawable(new ColorDrawable(e3m.f(R.attr.vk_ui_background, getContext())));
            }
            View view2 = this.h0;
            if (view2 != null) {
                view2.setVisibility(n7t0Var.a() ? 0 : 8);
            }
        }
    }

    public final void p(k9t0 k9t0Var) {
        boolean z = k9t0Var instanceof k9t0.a;
        VideoNewProfileToolbarV2 videoNewProfileToolbarV2 = this.d0;
        if (z) {
            this.q0 = false;
            q();
            videoNewProfileToolbarV2.setState(getToolbarDefaultState());
            videoNewProfileToolbarV2.setTitle(null);
            videoNewProfileToolbarV2.setMoreVisibility(false);
            k9t0.a aVar = (k9t0.a) k9t0Var;
            videoNewProfileToolbarV2.setShareVisibility(aVar.c);
            videoNewProfileToolbarV2.setSearchButtonVisibility(false);
            videoNewProfileToolbarV2.setSearchViewVisibility(true);
            videoNewProfileToolbarV2.setSettingsVisibility(aVar.b);
            videoNewProfileToolbarV2.setNavigationButtonVisibility(aVar.a);
            return;
        }
        if (!(k9t0Var instanceof k9t0.b)) {
            throw new NoWhenBranchMatchedException();
        }
        k9t0.b bVar = (k9t0.b) k9t0Var;
        boolean z2 = bVar.g;
        boolean z3 = bVar.f;
        if (z2 || bVar.h) {
            videoNewProfileToolbarV2.setState(VideoNewProfileToolbarV2.State.Error);
            if (dhr0.C().b) {
                this.q0 = true;
                q();
            }
        } else {
            videoNewProfileToolbarV2.setState(getToolbarDefaultState());
            this.q0 = false;
            q();
        }
        boolean z4 = this.a0;
        videoNewProfileToolbarV2.setTitle(z4 ? null : bVar.b);
        videoNewProfileToolbarV2.setSearchButtonVisibility(z4 && z3);
        videoNewProfileToolbarV2.setSearchViewVisibility(z4 && z3);
        videoNewProfileToolbarV2.setNavigationButtonVisibility(bVar.a);
        videoNewProfileToolbarV2.setMoreVisibility(bVar.c);
        videoNewProfileToolbarV2.setShareVisibility(bVar.e);
        videoNewProfileToolbarV2.setSettingsVisibility(bVar.d);
    }

    public final void q() {
        if (getVisibility() == 0) {
            boolean z = dhr0.C().b && (this.q0 || this.p0 >= 0.4f);
            Activity h = e3m.h(getContext());
            if (h == null) {
                return;
            }
            mnh0.w(h.getWindow().getDecorView(), z);
        }
    }

    public View getView() {
        return this;
    }
}
