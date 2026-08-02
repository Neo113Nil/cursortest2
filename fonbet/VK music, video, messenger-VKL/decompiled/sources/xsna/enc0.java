package xsna;

import android.animation.ValueAnimator;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.unity3d.services.UnityAdsConstants;
import com.vk.attachpicker.screen.a;
import com.vk.common.links.LinksParserData;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vk.core.tool.onboarding.VkTooltip$BalloonPosition;
import com.vk.core.tool.onboarding.VkTooltip$BalloonTilt;
import com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.formitem.VkInputSelect;
import com.vk.core.view.components.spinner.VkScreenSpinner;
import com.vk.core.view.components.tabs.VkTabLayout;
import com.vk.core.view.components.text.VkText;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.common.id.UserId;
import com.vk.feed.design.view.posting.preview.spinner.PostingVkSpinnerWrapperView;
import com.vk.imageloader.view.VKImageView;
import com.vk.mediastore.system.MediaStoreEntry;
import com.vk.newsfeed.posting.api.model.PostingMediaEntryPoint;
import com.vk.newsfeed.posting.impl.domain.model.ActionsAvailabilityState;
import com.vk.newsfeed.posting.impl.domain.model.LoadingState;
import com.vk.newsfeed.posting.impl.domain.model.LocalAlbum;
import com.vk.newsfeed.posting.impl.domain.model.MediaPickerState;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.newsfeed.posting.impl.domain.model.PostingStepScreen;
import com.vk.newsfeed.posting.impl.presentation.base.fragment.PostingFragment;
import com.vk.newsfeed.posting.impl.presentation.base.view.MediaPickerBottomSheetState;
import com.vk.newsfeed.posting.impl.presentation.base.view.ViewConstraint;
import com.vk.newsfeed.posting.impl.presentation.base.view.steps.mediapicker.MediaPickerBottomSheetBehavior;
import com.vk.newsfeed.posting.impl.presentation.model.ToolbarNavButtonType;
import com.vk.newsfeed.posting.mentions.PostingMentionLoadingState;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.gko;
import xsna.m8v0;
import xsna.tlo0;

/* compiled from: PostingStep1View.kt */
/* loaded from: classes4.dex */
public final class enc0 implements gm50 {
    public static final List<MediaPickerState.Tab> q0 = e43.l(MediaPickerState.Tab.LocalAlbum, MediaPickerState.Tab.PhotoVk, MediaPickerState.Tab.VideoVk);
    public static final int r0 = cn70.b(Sdk.SDKError.Reason.PLACEMENT_SLEEP_VALUE);
    public static final int s0 = cn70.b(108);
    public final MediaPickerBottomSheetBehavior A;
    public final View B;
    public final RecyclerView C;
    public final VkButton D;
    public final View E;
    public final ViewGroup F;
    public final FrameLayout G;
    public final VkScreenSpinner H;
    public final VkScreenSpinner I;
    public final FrameLayout J;
    public final PostingVkSpinnerWrapperView K;
    public final RecyclerView L;
    public final ModalBottomSheetBehavior<ViewGroup> M;
    public final m320 N;
    public ActionsAvailabilityState O;
    public ValueAnimator P;
    public final Handler Q;
    public boolean R;
    public float S;
    public int T;
    public final hb40 U;
    public final ahc0 V;
    public final xai0 W;
    public List<LocalAlbum> X;
    public LocalAlbum Y;
    public UserId Z;
    public final l320 a0;
    public final PostingFragment b;
    public final int b0;
    public final View c;
    public final int c0;
    public final PostingFragment.e d;
    public final int d0;
    public final PostingFragment.f e;
    public final int e0;
    public final kdg0 f;
    public final Object f0;
    public final y1q0 g;
    public final dz5 g0;
    public final hvz h;
    public final dhc0 h0;
    public final cpc0 i;
    public final knc0 i0;
    public final PostingFragment j;
    public final j8c0 j0;
    public final NestedScrollView k;
    public final loc0 k0;
    public final CoordinatorLayout l;
    public final it10 l0;
    public final VkTopBar m;
    public final Object m0;
    public final VkInputSelect n;
    public final Object n0;
    public final RecyclerView o;
    public int o0;
    public final h0c0 p;
    public final jnc0 p0;
    public final ConstraintLayout q;
    public final View r;
    public final VkTabLayout s;
    public final FragmentContainerView t;
    public final ViewPager2 u;
    public final VkTopBar v;
    public final View w;
    public final View x;
    public final View y;
    public final View z;

    /* compiled from: PostingStep1View.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;

        static {
            int[] iArr = new int[MediaPickerState.Tab.values().length];
            try {
                iArr[MediaPickerState.Tab.LocalAlbum.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MediaPickerState.Tab.PhotoVk.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MediaPickerState.Tab.VideoVk.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[PostingMediaEntryPoint.values().length];
            try {
                iArr2[PostingMediaEntryPoint.Video.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[ToolbarNavButtonType.values().length];
            try {
                iArr3[ToolbarNavButtonType.Close.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[ToolbarNavButtonType.Back.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[LoadingState.values().length];
            try {
                iArr4[LoadingState.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr4[LoadingState.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$3 = iArr4;
            int[] iArr5 = new int[PostingMentionLoadingState.values().length];
            try {
                iArr5[PostingMentionLoadingState.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr5[PostingMentionLoadingState.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr5[PostingMentionLoadingState.LOADED_BY_QUERY.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr5[PostingMentionLoadingState.LOADED_BY_ID.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$4 = iArr5;
        }
    }

    public enc0(PostingFragment postingFragment, View view, ezw ezwVar, Bundle bundle, PostingFragment.e eVar, PostingFragment.f fVar, kdg0 kdg0Var, y1q0 y1q0Var, hvz hvzVar, cpc0 cpc0Var) {
        float f;
        Object obj;
        Parcelable parcelable;
        View view2;
        hb40 hb40Var;
        boolean z;
        Object parcelable2;
        Object parcelable3;
        boolean z2;
        PostingMediaEntryPoint postingMediaEntryPoint;
        dpc0 dpc0Var;
        this.b = postingFragment;
        this.c = view;
        this.d = eVar;
        this.e = fVar;
        this.f = kdg0Var;
        this.g = y1q0Var;
        this.h = hvzVar;
        this.i = cpc0Var;
        this.j = postingFragment;
        this.k = (NestedScrollView) view.findViewById(R.id.nested_scroll_view);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) view.findViewById(R.id.posting_step_1_content);
        this.l = coordinatorLayout;
        VkTopBar vkTopBar = (VkTopBar) view.findViewById(R.id.posting_top_bar);
        this.m = vkTopBar;
        VkInputSelect vkInputSelect = (VkInputSelect) view.findViewById(R.id.post_text_input);
        this.n = vkInputSelect;
        VkText vkText = (VkText) view.findViewById(R.id.post_text_restriction_text_view);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.post_attachments_recycler_view);
        this.o = recyclerView;
        ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(R.id.media_picker_bottom_sheet);
        this.q = constraintLayout;
        View findViewById = view.findViewById(R.id.media_picker_drag_handle);
        this.r = findViewById;
        VkTabLayout vkTabLayout = (VkTabLayout) view.findViewById(R.id.media_picker_tab_layout);
        this.s = vkTabLayout;
        FragmentContainerView fragmentContainerView = (FragmentContainerView) view.findViewById(R.id.media_picker_navigation_host);
        this.t = fragmentContainerView;
        ViewPager2 viewPager2 = (ViewPager2) view.findViewById(R.id.media_picker_pager);
        this.u = viewPager2;
        VkTopBar vkTopBar2 = (VkTopBar) view.findViewById(R.id.posting_media_picker_top_bar);
        this.v = vkTopBar2;
        this.w = view.findViewById(R.id.media_picker_drafts_button_container);
        View findViewById2 = view.findViewById(R.id.media_picker_drafts_button);
        this.x = findViewById2;
        View findViewById3 = view.findViewById(R.id.drafts_open_button);
        this.y = findViewById3;
        View findViewById4 = view.findViewById(R.id.media_picker_open_button);
        this.z = findViewById4;
        this.B = awt0.l(viewPager2, new oqu(26));
        RecyclerView recyclerView2 = (RecyclerView) view.findViewById(R.id.selected_media_preview);
        this.C = recyclerView2;
        VkButton vkButton = (VkButton) view.findViewById(R.id.confirm_selection_button);
        this.D = vkButton;
        this.E = view.findViewById(R.id.selected_media_preview_container);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.post_mention_container);
        this.F = viewGroup;
        this.G = (FrameLayout) view.findViewById(R.id.mention_description_container);
        VkScreenSpinner vkScreenSpinner = (VkScreenSpinner) view.findViewById(R.id.loading_mention_spinner);
        vkScreenSpinner.setElevation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.H = vkScreenSpinner;
        VkScreenSpinner vkScreenSpinner2 = (VkScreenSpinner) view.findViewById(R.id.mention_loading_error);
        vkScreenSpinner2.setElevation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.I = vkScreenSpinner2;
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.posting_loader_view);
        this.J = frameLayout;
        this.K = (PostingVkSpinnerWrapperView) view.findViewById(R.id.posting_spinner);
        RecyclerView recyclerView3 = (RecyclerView) view.findViewById(R.id.mention_recycler);
        this.L = recyclerView3;
        this.O = ActionsAvailabilityState.j;
        this.Q = new Handler(Looper.getMainLooper());
        hb40 hb40Var2 = new hb40(this, 12);
        this.U = hb40Var2;
        fnc0 fnc0Var = new fnc0(this);
        this.X = EmptyList.b;
        l320 l320Var = new l320();
        this.a0 = l320Var;
        this.b0 = cn70.b(44);
        this.c0 = cn70.b(2);
        this.d0 = cn70.b(32);
        this.e0 = cn70.b(PsExtractor.AUDIO_STREAM);
        mnc0 mnc0Var = new mnc0(this);
        uz uzVar = new uz(28);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.f0 = msy.a(lazyThreadSafetyMode, uzVar);
        dz5 dz5Var = new dz5();
        this.g0 = dz5Var;
        q420 q420Var = new q420(vkInputSelect.getEditText(), mnc0Var, new ehc0(), 24);
        q420Var.p = new fz5();
        q420Var.q = dz5Var;
        s3q0 s3q0Var = s3q0.a;
        this.h0 = new dhc0(vkInputSelect, mnc0Var, q420Var);
        bpn0 bpn0Var = new bpn0(new t210(this, 23));
        this.i0 = new knc0(this);
        this.j0 = new j8c0(vkText);
        this.k0 = new loc0(this);
        sy50 sy50Var = new sy50(this, 15);
        o440 o440Var = new o440(this, 16);
        this.l0 = new it10(viewPager2, fragmentContainerView, findViewById, vkTabLayout, vkTopBar2, sy50Var, o440Var);
        Lazy a2 = msy.a(lazyThreadSafetyMode, new rkt(this, 23));
        this.m0 = a2;
        this.n0 = msy.a(lazyThreadSafetyMode, new nuv(this, 27));
        this.p0 = new jnc0(this);
        constraintLayout.setBackground(krv0.e(R.drawable.media_picker_sheet_background, view.getContext()));
        viewPager2.setBackground(null);
        viewPager2.setOutlineProvider(new s0w0(cn70.a() * 12.0f, false, true));
        viewPager2.setClipToOutline(true);
        w5j.d(R.id.media_picker_pager, findViewById);
        vkInputSelect.setTag("PostingTextInput");
        if (findViewById3 != null) {
            findViewById3.setTag("PostingDraftsButton");
        }
        findViewById4.setTag("PostingMediaPickerButton");
        constraintLayout.setTag("PostingMediaPanel");
        if (ezwVar != null && (dpc0Var = ezwVar.a) != null) {
            b(dpc0Var);
        }
        q420Var.g = new tci();
        j(ezwVar);
        PostingMediaEntryPoint postingMediaEntryPoint2 = (ezwVar == null || (postingMediaEntryPoint = ezwVar.c) == null) ? PostingMediaEntryPoint.Default : postingMediaEntryPoint;
        constraintLayout.setElevation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        constraintLayout.setClipToOutline(true);
        this.A = new MediaPickerBottomSheetBehavior(new jz70(this, 10));
        CoordinatorLayout.f fVar2 = (CoordinatorLayout.f) constraintLayout.getLayoutParams();
        if (bundle == null) {
            fVar2.c(this.A);
            constraintLayout.setLayoutParams(fVar2);
            k(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            h(4);
            f = 0.0f;
            view2 = findViewById3;
            z = false;
            hb40Var = hb40Var2;
        } else {
            f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            int i = Build.VERSION.SDK_INT;
            if (i >= 33) {
                parcelable3 = bundle.getParcelable("KEY_MEDIA_PICKER_OWNER_ID", UserId.class);
                obj = (Parcelable) parcelable3;
            } else {
                Object parcelable4 = bundle.getParcelable("KEY_MEDIA_PICKER_OWNER_ID");
                obj = (UserId) (parcelable4 instanceof UserId ? parcelable4 : null);
            }
            UserId userId = (UserId) obj;
            this.Z = userId == null ? UserId.d : userId;
            if (i >= 33) {
                parcelable2 = bundle.getParcelable("savedStateBottomSheet", MediaPickerBottomSheetState.class);
                parcelable = (Parcelable) parcelable2;
            } else {
                Parcelable parcelable5 = bundle.getParcelable("savedStateBottomSheet");
                parcelable = (MediaPickerBottomSheetState) (parcelable5 instanceof MediaPickerBottomSheetState ? parcelable5 : null);
            }
            MediaPickerBottomSheetState mediaPickerBottomSheetState = (MediaPickerBottomSheetState) parcelable;
            if (mediaPickerBottomSheetState == null) {
                view2 = findViewById3;
            } else {
                Float f2 = mediaPickerBottomSheetState.k;
                ViewConstraint viewConstraint = mediaPickerBottomSheetState.g;
                ViewConstraint viewConstraint2 = mediaPickerBottomSheetState.d;
                view2 = findViewById3;
                f4m.t(mediaPickerBottomSheetState.b, viewPager2);
                f4m.q(mediaPickerBottomSheetState.c, viewPager2);
                w5j.d(viewConstraint2.b, viewPager2);
                w5j.c(viewConstraint2.c, viewPager2);
                w5j.b(viewConstraint2.d, viewPager2);
                w5j.a(viewConstraint2.e, viewPager2);
                f4m.t(mediaPickerBottomSheetState.e, fragmentContainerView);
                f4m.q(mediaPickerBottomSheetState.f, fragmentContainerView);
                w5j.d(viewConstraint.b, fragmentContainerView);
                w5j.c(viewConstraint.c, fragmentContainerView);
                w5j.b(viewConstraint.d, fragmentContainerView);
                w5j.a(viewConstraint.e, fragmentContainerView);
                findViewById.setAlpha(mediaPickerBottomSheetState.h);
                vkTabLayout.setAlpha(mediaPickerBottomSheetState.i);
                vkTopBar2.setAlpha(mediaPickerBottomSheetState.j);
                if (f2 != null) {
                    o440Var.invoke(f2);
                }
            }
            if (bundle.getBoolean("KEY_HAS_DATA_LOSS_DIALOG", false)) {
                hb40Var = hb40Var2;
                hb40Var.invoke(new PostingAction.Navigation.OpenInCurrentStep(PostingStepScreen.NotificationDataLossDialog.b));
            } else {
                hb40Var = hb40Var2;
            }
            fVar2.c(this.A);
            constraintLayout.setLayoutParams(fVar2);
            z = false;
        }
        viewPager2.setUserInputEnabled(z);
        mbs mbsVar = postingFragment.D;
        com.vk.newsfeed.posting.impl.presentation.base.view.steps.mediapicker.a aVar = (com.vk.newsfeed.posting.impl.presentation.base.view.steps.mediapicker.a) a2.getValue();
        FragmentManager fragmentManager = postingFragment.In().a;
        List<MediaPickerState.Tab> list = q0;
        View view3 = view2;
        ahc0 ahc0Var = new ahc0(viewPager2, postingFragment, mbsVar, list, aVar, fragmentManager);
        ahc0Var.J0(this.S, this.T);
        this.V = ahc0Var;
        viewPager2.setAdapter(ahc0Var);
        viewPager2.setOffscreenPageLimit(1);
        viewPager2.b(new goc0(this));
        vkTabLayout.setCustomTabContent(new ekh(this, 29));
        new com.google.android.material.tabs.c(vkTabLayout, viewPager2, new xw70(this, 4)).a();
        usn0.a(vkTabLayout);
        vkTabLayout.setTabMode(4);
        vkTabLayout.setSaveEnabled(false);
        fragmentContainerView.setOnHierarchyChangeListener(new hoc0(this));
        postingFragment.mo2getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(0, false);
        xai0 xai0Var = new xai0(kdg0Var, new bjk(this, 28), new el30(this, 20));
        xai0Var.registerAdapterDataObserver(new ioc0(this, xai0Var, linearLayoutManager));
        this.W = xai0Var;
        recyclerView2.setLayoutManager(linearLayoutManager);
        recyclerView2.setAdapter(this.W);
        recyclerView2.addItemDecoration(new dev(cn70.b(8)));
        MediaPickerBottomSheetBehavior mediaPickerBottomSheetBehavior = this.A;
        if (mediaPickerBottomSheetBehavior != null) {
            mediaPickerBottomSheetBehavior.b = constraintLayout;
            mediaPickerBottomSheetBehavior.M(true);
            mediaPickerBottomSheetBehavior.u = new foc0(this);
        }
        a50 a50Var = new a50(this, 7);
        if (view3 != null) {
            view3.setOnClickListener(a50Var);
        }
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(a50Var);
        }
        findViewById4.setOnClickListener(new z00(this, 10));
        vkButton.setOnClickListener(new isk(this, 6));
        if (bundle == null) {
            PostingMediaEntryPoint postingMediaEntryPoint3 = PostingMediaEntryPoint.Default;
            h(postingMediaEntryPoint2 == postingMediaEntryPoint3 ? 4 : 3);
            float f3 = postingMediaEntryPoint2 == postingMediaEntryPoint3 ? f : 1.0f;
            k(f3, f3);
            Integer j = p4g.j(a.$EnumSwitchMapping$1[postingMediaEntryPoint2.ordinal()] == 1 ? MediaPickerState.Tab.VideoVk : MediaPickerState.Tab.LocalAlbum, list);
            viewPager2.e(j != null ? j.intValue() : 0, false);
        }
        m320 m320Var = new m320(viewGroup);
        this.N = m320Var;
        ModalBottomSheetBehavior<ViewGroup> modalBottomSheetBehavior = new ModalBottomSheetBehavior<>(m320Var, null);
        modalBottomSheetBehavior.b = viewGroup;
        ((CoordinatorLayout.f) viewGroup.getLayoutParams()).c(modalBottomSheetBehavior);
        modalBottomSheetBehavior.M(true);
        modalBottomSheetBehavior.O(4);
        modalBottomSheetBehavior.u = (lnc0) bpn0Var.getValue();
        modalBottomSheetBehavior.F = true;
        this.M = modalBottomSheetBehavior;
        recyclerView3.setAdapter(l320Var);
        view.getContext();
        recyclerView3.setLayoutManager(new LinearLayoutManager());
        vkInputSelect.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: xsna.cnc0
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view4, boolean z3) {
                enc0 enc0Var;
                MediaPickerBottomSheetBehavior mediaPickerBottomSheetBehavior2;
                if (!z3 || (mediaPickerBottomSheetBehavior2 = (enc0Var = enc0.this).A) == null || mediaPickerBottomSheetBehavior2.k == 5) {
                    return;
                }
                f4m.v(0, enc0Var.n);
                mediaPickerBottomSheetBehavior2.O(5);
                bwt0.p0(enc0Var.q, false);
            }
        });
        this.p = new h0c0(recyclerView, hb40Var, fVar, fnc0Var);
        frameLayout.setClickable(true);
        coordinatorLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: xsna.ymc0
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view4, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                enc0 enc0Var = enc0.this;
                int measuredHeight = enc0Var.l.getMeasuredHeight();
                int i10 = ify.a;
                if (ify.e(ify.c) || enc0Var.o0 == measuredHeight || measuredHeight <= 0) {
                    return;
                }
                enc0Var.o0 = measuredHeight;
                int b = an10.b(((((measuredHeight - enc0Var.m.getMeasuredHeight()) / 2.0f) - enc0Var.b0) - enc0Var.c0) - enc0Var.d0);
                int i11 = enc0Var.e0;
                if (b < i11) {
                    b = i11;
                }
                h0c0 h0c0Var = enc0Var.p;
                h0c0Var.h = b;
                pcc0 pcc0Var = h0c0Var.g;
                if (pcc0Var != null) {
                    pcc0Var.Q0(b);
                }
            }
        });
        view.addOnLayoutChangeListener(new koc0(this));
        gnc0 gnc0Var = new gnc0(this);
        vkInputSelect.setCustomInsertionActionModeCallback(gnc0Var);
        vkInputSelect.setCustomSelectionActionModeCallback(gnc0Var);
        if (view3 != null) {
            z2 = true;
            iut0.q(view3, new hnc0(true, this, 5));
        } else {
            z2 = true;
        }
        iut0.q(findViewById4, new hnc0(z2, this, 3));
        iut0.q(vkInputSelect.getEditText(), new hnc0(false, this, 3));
        iut0.q(vkTopBar, new hnc0(false, this, 3));
    }

    public static final void a(enc0 enc0Var) {
        ViewPager2 viewPager2 = enc0Var.u;
        FragmentContainerView fragmentContainerView = enc0Var.t;
        if (bwt0.K(fragmentContainerView) && s101.r(fragmentContainerView)) {
            MediaPickerBottomSheetBehavior mediaPickerBottomSheetBehavior = enc0Var.A;
            if (mediaPickerBottomSheetBehavior != null) {
                mediaPickerBottomSheetBehavior.t = new WeakReference<>(mediaPickerBottomSheetBehavior.G(fragmentContainerView));
                return;
            }
            return;
        }
        if (bwt0.K(viewPager2)) {
            MediaPickerBottomSheetBehavior mediaPickerBottomSheetBehavior2 = enc0Var.A;
            if (mediaPickerBottomSheetBehavior2 != null) {
                mediaPickerBottomSheetBehavior2.t = new WeakReference<>(mediaPickerBottomSheetBehavior2.G(viewPager2));
                return;
            }
            return;
        }
        MediaPickerBottomSheetBehavior mediaPickerBottomSheetBehavior3 = enc0Var.A;
        if (mediaPickerBottomSheetBehavior3 != null) {
            mediaPickerBottomSheetBehavior3.t = new WeakReference<>(mediaPickerBottomSheetBehavior3.G(enc0Var.q));
        }
    }

    public static void e(enc0 enc0Var, int i) {
        boolean z = (i & 1) == 0;
        boolean z2 = (i & 2) == 0;
        bwt0.p0(enc0Var.L, (i & 4) == 0);
        bwt0.p0(enc0Var.H, z2);
        bwt0.p0(enc0Var.I, z);
    }

    public final void b(dpc0 dpc0Var) {
        VkTopBar.b bVar;
        VkTopBar.c.f fVar;
        ToolbarNavButtonType toolbarNavButtonType = dpc0Var.d;
        int[] iArr = a.$EnumSwitchMapping$2;
        int i = iArr[toolbarNavButtonType.ordinal()];
        int i2 = 15;
        View view = this.c;
        int i3 = 2;
        VkTopBar.a.d dVar = null;
        if (i == 1) {
            bVar = null;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            ye80 ye80Var = new ye80(this, 8);
            tlo0.a aVar = tlo0.Companion;
            String string = view.getContext().getString(R.string.previous_step_talkback_title);
            aVar.getClass();
            bVar = new VkTopBar.b(ye80Var, new tlo0.h(string), null, null, com.vk.core.compose.component.semantics.b.a(null, new kb40(this, i2), 3), 12);
        }
        VkTopBar vkTopBar = this.m;
        vkTopBar.setBack(bVar);
        int i4 = iArr[dpc0Var.d.ordinal()];
        if (i4 == 1) {
            gko.b bVar2 = gko.Companion;
            fVar = new VkTopBar.c.f(new gko(R.drawable.vk_icon_cancel_outline_28), tq.h(tlo0.Companion, R.string.post_exit_posts_editing_content_description), new xsw(this, 25), null, com.vk.core.compose.component.semantics.b.a(null, new nt10(this, 14), 3), 24);
        } else {
            if (i4 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            fVar = null;
        }
        vkTopBar.setBefore(fVar);
        tlo0.a aVar2 = tlo0.Companion;
        VkTopBar.Middle.Text.Title title = new VkTopBar.Middle.Text.Title(oq.d(aVar2, dpc0Var.a), null, null, null, null, 30);
        String a2 = cqm0.a(dpc0Var.g);
        VkTopBar.Middle.Text.c cVar = a2 != null ? new VkTopBar.Middle.Text.c(new tlo0.h(a2), null, null, 24) : null;
        SemanticsConfiguration.Mode mode = SemanticsConfiguration.Mode.ClearAndSet;
        vkTopBar.setMiddle(new VkTopBar.Middle.Text(title, cVar, null, com.vk.core.compose.component.semantics.b.a(mode, new mi10(dpc0Var, i2), 2), 4));
        boolean z = dpc0Var.b;
        ActionsAvailabilityState.Availability availability = dpc0Var.c;
        boolean z2 = dpc0Var.f;
        if (z) {
            boolean z3 = availability instanceof ActionsAvailabilityState.Availability.Available;
            if (z3) {
                mode = SemanticsConfiguration.Mode.Merge;
            }
            if (z2) {
                dVar = VkTopBar.a.C0875a.a(new VkTopBar.a.c.h(f870.c(e3m.f(R.attr.vk_ui_icon_secondary, this.b.requireContext()))), null, 6);
            } else {
                CharSequence text = view.getContext().getText(R.string.next_step_toolbar_button_title);
                aVar2.getClass();
                dVar = VkTopBar.a.C0875a.a(new VkTopBar.a.c.b(new tlo0.h(text), z3 ? 1.0f : 0.5f, new defpackage.f0(22, this, availability), com.vk.core.compose.component.semantics.b.a(mode, new xvx(z3, this, i3), 2)), null, 6);
            }
        }
        vkTopBar.setAfter(dVar);
        String str = dpc0Var.e;
        if (str != null) {
            int i5 = m8v0.M;
            m8v0.a.a(view, str, new hp30(this, 13), null, null, null, VkTooltip$BalloonPosition.BottomLeft, VkTooltip$BalloonTilt.Right, new g6(26, this, dpc0Var), new oi40(9), null, null, null, new r820(this, i2), null, 0, false, null, null, false, null, false, 16768056);
        }
    }

    public final String c(LocalAlbum localAlbum) {
        LocalAlbum.CatalogType catalogType;
        String str;
        View view = this.c;
        if (localAlbum != null && (catalogType = localAlbum.d) != null) {
            if (catalogType instanceof LocalAlbum.CatalogType.Root) {
                str = view.getContext().getString(R.string.media_picker_root_catalog);
            } else {
                if (!(catalogType instanceof LocalAlbum.CatalogType.Folder)) {
                    throw new NoWhenBranchMatchedException();
                }
                str = ((LocalAlbum.CatalogType.Folder) catalogType).b;
            }
            if (str != null) {
                return str;
            }
        }
        return view.getContext().getString(R.string.media_picker_recent_media_album);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final a.c d(Integer num) {
        a.c cVar = new a.c();
        if (num != null) {
            int intValue = num.intValue();
            RecyclerView recyclerView = this.C;
            RecyclerView.e0 findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(intValue);
            yai0 yai0Var = findViewHolderForAdapterPosition instanceof yai0 ? (yai0) findViewHolderForAdapterPosition : null;
            if (yai0Var != null) {
                VKImageView vKImageView = yai0Var.o;
                MediaStoreEntry b = com.vk.newsfeed.posting.impl.domain.model.b.b(((zai0) yai0Var.m).a);
                if (b != null) {
                    cVar.a = vKImageView;
                    cVar.b = vKImageView;
                    cVar.c = recyclerView.getRootView();
                    cVar.d = b;
                    if (vKImageView.c0()) {
                        cVar.e = vKImageView.getImageWidth();
                        cVar.f = vKImageView.getImageHeight();
                    }
                }
            }
        }
        return cVar;
    }

    public final void f(boolean z) {
        qaz qazVar;
        String i;
        Editable editableText = this.n.getEditableText();
        if (editableText == null) {
            return;
        }
        int i2 = 0;
        qaz[] qazVarArr = (qaz[]) editableText.getSpans(0, editableText.length(), qaz.class);
        while (i2 < qazVarArr.length) {
            int i3 = i2 + 1;
            try {
                qaz qazVar2 = qazVarArr[i2];
                if (!(qazVar2 instanceof r320) && !(qazVar2 instanceof x7q)) {
                    if (qazVar2 == null) {
                        throw new NoWhenBranchMatchedException();
                    }
                    editableText.removeSpan(qazVar2);
                }
                i2 = i3;
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new NoSuchElementException(e.getMessage());
            }
        }
        ArrayList arrayList = new ArrayList();
        xwk.d().a().q(editableText, new LinksParserData(9, (Bundle) null, 0, 0, (String) null, (String) null, 0, R.attr.vk_ui_text_accent, (LinksParserData.HashtagService) null, (saz) null, 0, (taz) null, false, 8062), arrayList);
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            String str = null;
            if (!(next instanceof r320) && !(next instanceof x7q) && (next instanceof qaz) && (i = (qazVar = (qaz) next).i()) != null && i.length() != 0) {
                str = qazVar.i();
            }
            arrayList2.add(str);
        }
        List V = j5g.V(arrayList2);
        if (z) {
            this.U.invoke(new PostingAction.Editing.Text.ParseLinks(V));
        }
    }

    public final void g(MediaPickerState.Tab tab) {
        int indexOf = q0.indexOf(tab);
        VkTabLayout vkTabLayout = this.s;
        TabLayout.g b = vkTabLayout.b(indexOf);
        if (b == null) {
            return;
        }
        vkTabLayout.c(b, true);
    }

    @Override // xsna.gm50
    public final f5z getViewOwner() {
        return this.j;
    }

    public final void h(int i) {
        MediaPickerBottomSheetBehavior mediaPickerBottomSheetBehavior = this.A;
        if (mediaPickerBottomSheetBehavior != null) {
            mediaPickerBottomSheetBehavior.O(i);
        }
        MediaPickerState.SheetState sheetState = i != 3 ? i != 4 ? i != 5 ? null : MediaPickerState.SheetState.Hidden : MediaPickerState.SheetState.Collapsed : MediaPickerState.SheetState.Expanded;
        if (sheetState == null) {
            return;
        }
        this.U.invoke(new PostingAction.MediaPicker.SheetStateChanged(sheetState));
    }

    public final void i(float f, float f2, boolean z) {
        float b = u11.b(z ? 1.0f : 0.0f, f2, f, f2);
        boolean z2 = Math.abs(b - 1.0f) < 1.0E-5f;
        boolean z3 = Math.abs(b - UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) < 1.0E-5f;
        RecyclerView recyclerView = this.C;
        recyclerView.setScaleX(b);
        recyclerView.setScaleY(b);
        bwt0.d0(recyclerView, z3);
        VkButton vkButton = this.D;
        vkButton.setScaleX(b);
        vkButton.setScaleY(b);
        bwt0.d0(vkButton, z3);
        View view = this.E;
        FragmentContainerView fragmentContainerView = this.t;
        ViewPager2 viewPager2 = this.u;
        if (z2) {
            w5j.b(R.id.selected_media_preview_container, viewPager2);
            w5j.b(R.id.selected_media_preview_container, fragmentContainerView);
            view.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            f4m.q(0, viewPager2);
            f4m.q(0, fragmentContainerView);
        } else {
            w5j.a(0, viewPager2);
            w5j.a(0, fragmentContainerView);
            view.setTranslationY((1.0f - b) * view.getMeasuredHeight());
            int measuredHeight = (int) (view.getMeasuredHeight() * b);
            f4m.q(measuredHeight, viewPager2);
            f4m.q(measuredHeight, fragmentContainerView);
        }
        bwt0.d0(view, z3);
    }

    public final void j(ezw ezwVar) {
        String str;
        ucp ucpVar = ucp.a;
        io.reactivex.rxjava3.disposables.c subscribe = ucp.a().subscribe(new jw80(new qw30(this, 19), 7));
        VkInputSelect vkInputSelect = this.n;
        hg1.b(vkInputSelect, subscribe);
        if (ezwVar != null && (str = ezwVar.b) != null) {
            vkInputSelect.setText(ucp.i(str));
            Editable text = vkInputSelect.getText();
            int length = text != null ? text.length() : 0;
            if (length != 0) {
                vkInputSelect.setSelection(length);
            }
            f(true);
        }
        this.h0.d.e(true);
        vkInputSelect.setOnSelectionChangedListener(new l71(this, 6));
        loc0 loc0Var = this.k0;
        vkInputSelect.e(loc0Var);
        vkInputSelect.b(loc0Var);
        int i = ify.a;
        jnc0 jnc0Var = this.p0;
        ify.g(jnc0Var);
        ify.a(jnc0Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c1, code lost:
    
        if ((r13 == com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) != false) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(float f, float f2) {
        float f3;
        float f4 = 1.0f;
        VkTopBar vkTopBar = this.v;
        VkTabLayout vkTabLayout = this.s;
        View view = this.w;
        FragmentContainerView fragmentContainerView = this.t;
        ViewPager2 viewPager2 = this.u;
        float f5 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (f == 1.0f) {
            f4m.t(0, viewPager2);
            f4m.t(0, fragmentContainerView);
            w5j.c(R.id.media_picker_tab_layout, viewPager2);
            w5j.c(R.id.posting_media_picker_top_bar, fragmentContainerView);
        } else {
            View view2 = this.x;
            if (view2 != null ? bwt0.K(view2) : false) {
                f3 = (1 - f) * (view != null ? view.getMeasuredHeight() : 0);
            } else {
                f3 = 0.0f;
            }
            int measuredHeight = (int) (vkTopBar.getMeasuredHeight() * f);
            int measuredHeight2 = ((int) (vkTabLayout.getMeasuredHeight() * f)) + measuredHeight;
            f4m.t(((int) f3) + measuredHeight2, viewPager2);
            f4m.t(measuredHeight, fragmentContainerView);
            if (f2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                int measuredHeight3 = (int) (((view != null ? view.getMeasuredHeight() : 0) * f) + measuredHeight2);
                if (view != null) {
                    f4m.q(-measuredHeight3, view);
                }
            }
            w5j.d(0, viewPager2);
            w5j.d(0, fragmentContainerView);
        }
        float f6 = f >= 0.45f ? 0.0f : f >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? (0.45f - f) / 0.45f : 1.0f;
        boolean z = f6 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        View view3 = this.r;
        bwt0.p0(view3, !z);
        view3.setAlpha(f6);
        if (f >= 0.45f) {
            f4 = (f - 0.45f) / 0.55f;
        } else if (f >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f4 = 0.0f;
        }
        if (view != null) {
            bwt0.p0(view, f4 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        if (f4 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
        }
        f5 = 3.0f;
        this.q.setElevation(f5);
        bwt0.p0(vkTabLayout, !(f4 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        vkTabLayout.setAlpha(f4);
        bwt0.p0(vkTopBar, !(f4 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        vkTopBar.setAlpha(f4);
        this.S = f;
        int height = f4m.b(viewPager2).height();
        MediaPickerBottomSheetBehavior mediaPickerBottomSheetBehavior = this.A;
        int L = mediaPickerBottomSheetBehavior != null ? mediaPickerBottomSheetBehavior.L() : 0;
        if (height < L) {
            height = L;
        }
        this.T = height;
        ahc0 ahc0Var = this.V;
        if (ahc0Var != null) {
            ahc0Var.J0(f, height);
        }
    }
}
