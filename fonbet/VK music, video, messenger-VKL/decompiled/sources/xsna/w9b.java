package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.apps.BuildInfo;
import com.vk.core.view.AppBarShadowView;
import com.vk.im.design.view.chat_profile.ChatProfileActionsView;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.engine.models.stories.ImStoryState;
import com.vk.im.ui.components.account.main.vc.AccountAvatarAction;
import com.vk.im.ui.components.chat_profile.ChatProfileBottomSheetBuilder;
import com.vk.im.ui.components.chat_profile.ChatProfileListItem;
import com.vk.im.ui.components.chat_profile.ProfileLinkActionChooser;
import com.vk.im.ui.components.chat_profile.new_channels.ChannelProfileVkAppVc$initRecyclerView$1;
import com.vk.im.ui.components.common.MemberAction;
import com.vk.im.ui.utils.AppBarLayoutStateListener;
import com.vk.im.ui.views.avatars.VkImAvatar;
import com.vk.im.ui.views.nested_recyclerview.NestedVerticalRecyclerViewContainer;
import com.vk.toggle.features.ImFeatures;
import com.vk.webapp.fragments.ReportFragment;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.cwb0;
import xsna.fxb;
import xsna.ify;
import xsna.owb;
import xsna.oxb;
import xsna.uxd0;
import xsna.zxd0;

/* compiled from: ChannelProfileVkAppVc.kt */
/* loaded from: classes2.dex */
public final class w9b implements u0e0, xds, AppBarLayoutStateListener.a, oxb.a.InterfaceC3477a, fxb.a.InterfaceC2898a, owb.a.InterfaceC3475a, uxd0.a.InterfaceC3848a, NestedVerticalRecyclerViewContainer.a, ify.a {
    public AppBarShadowView A;
    public NestedVerticalRecyclerViewContainer B;
    public View C;
    public TextView D;
    public u8b E;
    public final Object F;
    public final AppBarLayoutStateListener G;
    public final io.reactivex.rxjava3.subjects.f<zxd0> H;
    public final io.reactivex.rxjava3.subjects.f I;
    public boolean J;
    public boolean K;
    public final o660 L;
    public int M;
    public float N;
    public float O;
    public final ValueAnimator P;
    public boolean Q;
    public int R;
    public final Context b;
    public final kkm c;
    public final com.vk.im.engine.models.c d;
    public CoordinatorLayout e;
    public Toolbar f;
    public AppBarLayout g;
    public View h;
    public ConstraintLayout i;
    public VkImAvatar j;
    public FrameLayout k;
    public boolean l;
    public TextView m;
    public View n;
    public View o;
    public TextView p;
    public TextView q;
    public TextView r;
    public CollapsingToolbarLayout s;
    public ViewGroup t;
    public ViewGroup u;
    public View v;
    public View w;
    public TextView x;
    public TextView y;
    public ChatProfileActionsView z;

    /* compiled from: ChannelProfileVkAppVc.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[AppBarLayoutStateListener.AppBarState.values().length];
            try {
                iArr[AppBarLayoutStateListener.AppBarState.EXPANDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AppBarLayoutStateListener.AppBarState.TRANSFORMING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AppBarLayoutStateListener.AppBarState.COLLAPSED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[NestedVerticalRecyclerViewContainer.NestedScrollingHostState.values().length];
            try {
                iArr2[NestedVerticalRecyclerViewContainer.NestedScrollingHostState.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[NestedVerticalRecyclerViewContainer.NestedScrollingHostState.IDLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[ImStoryState.values().length];
            try {
                iArr3[ImStoryState.SEEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[ImStoryState.NEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[ProfileLinkActionChooser.LinkAction.values().length];
            try {
                iArr4[ProfileLinkActionChooser.LinkAction.COPY.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr4[ProfileLinkActionChooser.LinkAction.SHARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    /* compiled from: ChannelProfileVkAppVc.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<zxd0, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(zxd0 zxd0Var) {
            ((w9b) this.receiver).s(zxd0Var);
            return s3q0.a;
        }
    }

    /* compiled from: ChannelProfileVkAppVc.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            ((w9b) this.receiver).getClass();
            zk70.e(th);
            return s3q0.a;
        }
    }

    /* compiled from: ChannelProfileVkAppVc.kt */
    public static final class d extends AnimatorListenerAdapter {
        public d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            TextView textView = w9b.this.r;
            if (textView == null) {
                textView = null;
            }
            textView.setAlpha(1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            TextView textView = w9b.this.r;
            if (textView == null) {
                textView = null;
            }
            textView.setAlpha(1.0f);
        }
    }

    public w9b(Context context, kkm kkmVar, com.vk.im.engine.models.c cVar) {
        this.b = context;
        this.c = kkmVar;
        this.d = cVar;
        Lazy a2 = msy.a(LazyThreadSafetyMode.NONE, new oo(this, 13));
        this.F = a2;
        this.G = new AppBarLayoutStateListener(this);
        rxb rxbVar = new rxb(context);
        io.reactivex.rxjava3.subjects.f<zxd0> fVar = new io.reactivex.rxjava3.subjects.f<>();
        this.H = fVar;
        this.I = fVar;
        this.L = new o660((bzb0) a2.getValue(), new b(1, this, w9b.class, "notifyEvent", "notifyEvent(Lcom/vk/im/ui/components/chat_profile/viewmodels/base/ProfileInfoViewEvent;)V", 0), new c(1, this, w9b.class, "showError", "showError(Ljava/lang/Throwable;)V", 0), this, rxbVar, cVar);
        this.N = 1.0f;
        this.O = 1.0f;
        ValueAnimator duration = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f).setDuration(500L);
        duration.addUpdateListener(new s9b(this, 0));
        duration.addListener(new d());
        this.P = duration;
    }

    public static void t(TextView textView, float f) {
        textView.setScaleX(f);
        textView.setScaleY(f);
    }

    @Override // com.vk.im.ui.views.nested_recyclerview.NestedVerticalRecyclerViewContainer.a
    public final void a(NestedVerticalRecyclerViewContainer.NestedScrollingHostState nestedScrollingHostState) {
        int i = a.$EnumSwitchMapping$1[nestedScrollingHostState.ordinal()];
        int i2 = 1;
        if (i == 1) {
            int i3 = a.$EnumSwitchMapping$0[this.G.c.ordinal()];
            if (i3 != 1 && i3 != 2) {
                i2 = 0;
            }
        } else if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        AppBarShadowView appBarShadowView = this.A;
        if (appBarShadowView == null) {
            appBarShadowView = null;
        }
        appBarShadowView.setForceMode(Integer.valueOf(i2));
    }

    @Override // xsna.u0e0
    public final void b(Rect rect, Rect rect2) {
        Rect rect3 = new Rect(rect2.left - rect.left, rect2.top - rect.top, rect2.right - rect.right, rect2.bottom - rect.bottom);
        CoordinatorLayout coordinatorLayout = this.e;
        if (coordinatorLayout == null) {
            coordinatorLayout = null;
        }
        f4m.y(rect3.top, coordinatorLayout);
    }

    @Override // xsna.u0e0
    public final View c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) layoutInflater.inflate(R.layout.vkapp_channel_profile_fragment, viewGroup, false);
        this.e = coordinatorLayout;
        this.h = coordinatorLayout.findViewById(R.id.vkim_chat_profile_fragment__loading);
        this.j = (VkImAvatar) coordinatorLayout.findViewById(R.id.vkim_chat_profile_fragment__avatar);
        FrameLayout frameLayout = (FrameLayout) coordinatorLayout.findViewById(R.id.avatarContainer);
        int b2 = cn70.b(8);
        frameLayout.setPadding(b2, b2, b2, b2);
        this.k = frameLayout;
        VkImAvatar vkImAvatar = this.j;
        if (vkImAvatar == null) {
            vkImAvatar = null;
        }
        vkImAvatar.setVisibility(0);
        VkImAvatar vkImAvatar2 = this.j;
        if (vkImAvatar2 == null) {
            vkImAvatar2 = null;
        }
        jjc.g(vkImAvatar2, new yx0(this, 21));
        VkImAvatar vkImAvatar3 = this.j;
        if (vkImAvatar3 == null) {
            vkImAvatar3 = null;
        }
        vkImAvatar3.setClickable(false);
        this.n = coordinatorLayout.findViewById(R.id.vkim_chat_profile_fragment__collapsed_container);
        this.o = coordinatorLayout.findViewById(R.id.vkim_chat_profile_fragment__collapsed_text_container);
        this.p = (TextView) coordinatorLayout.findViewById(R.id.vkim_chat_profile_fragment__collapsed_title_trimmed);
        this.q = (TextView) coordinatorLayout.findViewById(R.id.vkim_chat_profile_fragment__collapsed_title);
        this.r = (TextView) coordinatorLayout.findViewById(R.id.vkim_chat_profile_fragment__collapsed_subtitle);
        this.s = (CollapsingToolbarLayout) coordinatorLayout.findViewById(R.id.vkim_chat_profile_fragment_collapsing_toolbar);
        this.i = (ConstraintLayout) coordinatorLayout.findViewById(R.id.vkim_chat_profile_fragment__header_container);
        this.u = (ViewGroup) coordinatorLayout.findViewById(R.id.vkim_chat_profile_fragment__header_info_wrapper);
        this.t = (ViewGroup) coordinatorLayout.findViewById(R.id.vkim_chat_profile_fragment__header_info_container);
        this.v = coordinatorLayout.findViewById(R.id.vkim_chat_profile_fragment__opacity_gradient);
        TextView textView = (TextView) coordinatorLayout.findViewById(R.id.vkim_chat_profile_fragment__title);
        this.m = textView;
        jjc.g(textView, new d7(this, 16));
        TextView textView2 = this.m;
        if (textView2 == null) {
            textView2 = null;
        }
        textView2.setClickable(false);
        this.w = coordinatorLayout.findViewById(R.id.vkim_chat_profile_fragment__title_container);
        TextView textView3 = (TextView) coordinatorLayout.findViewById(R.id.vkim_chat_profile_fragment__link);
        this.x = textView3;
        final fot fotVar = new fot(textView3.getContext(), new z8b(new vf0(textView3, 13), new t9b(0, textView3, this)), null);
        fotVar.a.setIsLongpressEnabled(true);
        textView3.setOnTouchListener(new View.OnTouchListener() { // from class: xsna.u9b
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return fot.this.a.onTouchEvent(motionEvent);
            }
        });
        textView3.setOnClickListener(new v9b(this, 0));
        this.y = (TextView) coordinatorLayout.findViewById(R.id.vkim_chat_profile_fragment__subtitle);
        CoordinatorLayout coordinatorLayout2 = this.e;
        if (coordinatorLayout2 == null) {
            coordinatorLayout2 = null;
        }
        ChatProfileActionsView chatProfileActionsView = (ChatProfileActionsView) coordinatorLayout2.findViewById(R.id.vkim_chat_profile_fragment__actions);
        chatProfileActionsView.setListener(new y9b(this));
        this.z = chatProfileActionsView;
        RecyclerView recyclerView = (RecyclerView) coordinatorLayout.findViewById(R.id.vkim_chat_profile_fragment__rv_content);
        recyclerView.setLayoutManager(new ChannelProfileVkAppVc$initRecyclerView$1());
        u8b u8bVar = new u8b();
        kkm kkmVar = this.c;
        u8bVar.y0(new dxb(kkmVar));
        u8bVar.y0(new gxb());
        u8bVar.y0(new oxb(kkmVar, this));
        u8bVar.y0(new fxb(kkmVar, this));
        u8bVar.y0(new xxb(kkmVar));
        u8bVar.y0(new lxb(kkmVar));
        u8bVar.y0(new owb(this));
        u8bVar.setHasStableIds(true);
        u8bVar.registerAdapterDataObserver(new tgh0(recyclerView, new pj0(u8bVar)));
        this.E = u8bVar;
        recyclerView.setAdapter(u8bVar);
        int b3 = cn70.b(12);
        recyclerView.addItemDecoration(new exb(b3, b3, cn70.b(8), u8bVar));
        Toolbar toolbar = (Toolbar) coordinatorLayout.findViewById(R.id.vkim_chat_profile_fragment__toolbar);
        toolbar.l(R.menu.vkim_chat_profile_menu);
        toolbar.setNavigationIcon(e3m.e(R.attr.im_ic_back_toolbar, toolbar.getContext()));
        toolbar.setNavigationOnClickListener(new bg0(this, 3));
        toolbar.getMenu();
        bwt0.l0(toolbar, new ka(this, 15));
        this.f = toolbar;
        AppBarLayout appBarLayout = (AppBarLayout) coordinatorLayout.findViewById(R.id.vkim_chat_profile_fragment__appbar);
        AppBarLayoutStateListener appBarLayoutStateListener = this.G;
        appBarLayoutStateListener.getClass();
        appBarLayout.a(appBarLayoutStateListener);
        CoordinatorLayout.f fVar = (CoordinatorLayout.f) appBarLayout.getLayoutParams();
        CoordinatorLayout.c cVar = fVar.a;
        AppBarLayout.Behavior behavior = cVar instanceof AppBarLayout.Behavior ? (AppBarLayout.Behavior) cVar : null;
        if (behavior == null) {
            behavior = new AppBarLayout.Behavior();
        }
        behavior.p = new gab();
        fVar.c(behavior);
        TextView textView4 = this.m;
        if (textView4 == null) {
            textView4 = null;
        }
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.element = textView4.getMeasuredWidth();
        Ref$IntRef ref$IntRef2 = new Ref$IntRef();
        ref$IntRef2.element = textView4.getMeasuredHeight();
        f4m.a(textView4, new z9b(textView4, ref$IntRef, ref$IntRef2, this));
        TextView textView5 = this.y;
        TextView textView6 = textView5 == null ? null : textView5;
        Ref$IntRef ref$IntRef3 = new Ref$IntRef();
        ref$IntRef3.element = textView6.getMeasuredWidth();
        Ref$IntRef ref$IntRef4 = new Ref$IntRef();
        ref$IntRef4.element = textView6.getMeasuredHeight();
        f4m.a(textView6, new aab(textView6, ref$IntRef3, ref$IntRef4, this, 0));
        TextView textView7 = this.x;
        if (textView7 == null) {
            textView7 = null;
        }
        Ref$IntRef ref$IntRef5 = new Ref$IntRef();
        ref$IntRef5.element = textView7.getMeasuredWidth();
        Ref$IntRef ref$IntRef6 = new Ref$IntRef();
        ref$IntRef6.element = textView7.getMeasuredHeight();
        f4m.a(textView7, new bab(textView7, ref$IntRef5, ref$IntRef6, this));
        TextView textView8 = this.p;
        if (textView8 == null) {
            textView8 = null;
        }
        Ref$IntRef ref$IntRef7 = new Ref$IntRef();
        ref$IntRef7.element = textView8.getMeasuredWidth();
        Ref$IntRef ref$IntRef8 = new Ref$IntRef();
        ref$IntRef8.element = textView8.getMeasuredHeight();
        f4m.a(textView8, new cab(textView8, ref$IntRef7, ref$IntRef8, this));
        TextView textView9 = this.q;
        TextView textView10 = textView9 == null ? null : textView9;
        Ref$IntRef ref$IntRef9 = new Ref$IntRef();
        ref$IntRef9.element = textView10.getMeasuredWidth();
        Ref$IntRef ref$IntRef10 = new Ref$IntRef();
        ref$IntRef10.element = textView10.getMeasuredHeight();
        f4m.a(textView10, new dab(textView10, ref$IntRef9, ref$IntRef10, this, 0));
        TextView textView11 = this.r;
        if (textView11 == null) {
            textView11 = null;
        }
        Ref$IntRef ref$IntRef11 = new Ref$IntRef();
        ref$IntRef11.element = textView11.getMeasuredWidth();
        Ref$IntRef ref$IntRef12 = new Ref$IntRef();
        ref$IntRef12.element = textView11.getMeasuredHeight();
        f4m.a(textView11, new eab(textView11, ref$IntRef11, ref$IntRef12, this));
        FrameLayout frameLayout2 = this.k;
        if (frameLayout2 == null) {
            frameLayout2 = null;
        }
        Ref$IntRef ref$IntRef13 = new Ref$IntRef();
        ref$IntRef13.element = frameLayout2.getMeasuredWidth();
        Ref$IntRef ref$IntRef14 = new Ref$IntRef();
        ref$IntRef14.element = frameLayout2.getMeasuredHeight();
        f4m.a(frameLayout2, new fab(frameLayout2, ref$IntRef13, ref$IntRef14, this));
        this.g = appBarLayout;
        AppBarShadowView appBarShadowView = (AppBarShadowView) coordinatorLayout.findViewById(R.id.vkim_chat_profile_fragment__shadow);
        appBarShadowView.setForceMode(1);
        this.A = appBarShadowView;
        NestedVerticalRecyclerViewContainer nestedVerticalRecyclerViewContainer = (NestedVerticalRecyclerViewContainer) coordinatorLayout.findViewById(R.id.vkim_chat_profile_fragment__nested_rv_container);
        nestedVerticalRecyclerViewContainer.setListener(this);
        AppBarLayout appBarLayout2 = this.g;
        if (appBarLayout2 == null) {
            appBarLayout2 = null;
        }
        appBarLayout2.a(nestedVerticalRecyclerViewContainer);
        this.B = nestedVerticalRecyclerViewContainer;
        CoordinatorLayout coordinatorLayout3 = this.e;
        if (coordinatorLayout3 == null) {
            coordinatorLayout3 = null;
        }
        this.C = coordinatorLayout3.findViewById(R.id.vkim_chat_profile_fragment_toolbar_background);
        CoordinatorLayout coordinatorLayout4 = this.e;
        if (coordinatorLayout4 == null) {
            coordinatorLayout4 = null;
        }
        TextView textView12 = (TextView) coordinatorLayout4.findViewById(R.id.vkim_chat_profile_fragment__not_disturb);
        textView12.setIncludeFontPadding(false);
        Drawable drawable = textView12.getContext().getDrawable(R.drawable.vk_icon_notification_disable_outline_28);
        if (drawable != null) {
            int b4 = cn70.b(14);
            drawable.setBounds(0, 0, b4, b4);
            textView12.setCompoundDrawables(drawable, null, null, null);
        }
        this.D = textView12;
        Toolbar toolbar2 = this.f;
        if (toolbar2 == null) {
            toolbar2 = null;
        }
        kkmVar.b(toolbar2, R.attr.vk_ui_text_accent_themed);
        TextView textView13 = this.x;
        kkmVar.c(textView13 != null ? textView13 : null, R.attr.vk_ui_text_link);
        return coordinatorLayout;
    }

    @Override // xsna.u0e0
    public final void d(Rect rect) {
        CoordinatorLayout coordinatorLayout = this.e;
        if (coordinatorLayout == null) {
            coordinatorLayout = null;
        }
        f4m.y(rect.top, coordinatorLayout);
        rect.top = 0;
    }

    @Override // xsna.owb.a.InterfaceC3475a
    public final void e(ChatProfileListItem chatProfileListItem) {
        s(new zxd0.n(chatProfileListItem));
    }

    @Override // xsna.u0e0
    public final void e0() {
        View view = this.h;
        if (view == null) {
            view = null;
        }
        view.setVisibility(0);
    }

    @Override // xsna.oxb.a.InterfaceC3477a
    public final void f(qxb qxbVar) {
        s(new zxd0.n(qxbVar));
    }

    @Override // xsna.u0e0
    public final void g(Throwable th) {
        zk70.e(th);
    }

    @Override // xsna.u0e0
    public final void h() {
        if (BuildInfo.t()) {
            int i = ify.a;
            ify.a(this);
        }
    }

    @Override // com.vk.im.ui.utils.AppBarLayoutStateListener.a
    public final void i(AppBarLayoutStateListener.AppBarState appBarState) {
        v(appBarState);
        u(appBarState);
        AppBarLayoutStateListener.AppBarState appBarState2 = this.G.c;
        NestedVerticalRecyclerViewContainer nestedVerticalRecyclerViewContainer = this.B;
        if (nestedVerticalRecyclerViewContainer == null) {
            nestedVerticalRecyclerViewContainer = null;
        }
        if (nestedVerticalRecyclerViewContainer.getScrollableHostState() == NestedVerticalRecyclerViewContainer.NestedScrollingHostState.ACTIVE) {
            int i = a.$EnumSwitchMapping$0[appBarState2.ordinal()];
            int i2 = 1;
            if (i != 1 && i != 2) {
                i2 = 0;
            }
            AppBarShadowView appBarShadowView = this.A;
            (appBarShadowView != null ? appBarShadowView : null).setForceMode(Integer.valueOf(i2));
        }
    }

    @Override // xsna.fxb.a.InterfaceC2898a
    public final void j(ChatProfileListItem.c cVar) {
        s(new zxd0.n(cVar));
    }

    @Override // xsna.u0e0
    public final void k() {
        if (BuildInfo.t()) {
            int i = ify.a;
            ify.g(this);
        }
    }

    @Override // xsna.u0e0
    public final void l() {
        View view = this.h;
        if (view == null) {
            view = null;
        }
        f4m.j(view);
    }

    @Override // xsna.xoo0
    public final int l2() {
        return dhr0.t.c(R.attr.vk_ui_background_content);
    }

    @Override // xsna.u0e0
    public final void m() {
        int c2 = dhr0.t.c(R.attr.vk_ui_background_content);
        CoordinatorLayout coordinatorLayout = this.e;
        if (coordinatorLayout == null) {
            coordinatorLayout = null;
        }
        coordinatorLayout.setBackgroundColor(c2);
        CollapsingToolbarLayout collapsingToolbarLayout = this.s;
        CollapsingToolbarLayout collapsingToolbarLayout2 = collapsingToolbarLayout != null ? collapsingToolbarLayout : null;
        collapsingToolbarLayout2.setContentScrimColor(c2);
        collapsingToolbarLayout2.setBackgroundColor(c2);
    }

    @Override // xsna.oxb.a.InterfaceC3477a
    public final void n(qxb qxbVar) {
        s(new zxd0.o(qxbVar));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.uxd0.a.InterfaceC3848a
    public final io.reactivex.rxjava3.internal.operators.completable.h o(io.reactivex.rxjava3.internal.operators.observable.l0 l0Var) {
        return hzb0.a(l0Var, (bzb0) this.F.getValue(), cwb0.j0.e);
    }

    @Override // xsna.u0e0
    public final void onDestroyView() {
        o660 o660Var = this.L;
        o660Var.a.a();
        o660Var.e.a();
    }

    @Override // xsna.u0e0
    public final io.reactivex.rxjava3.subjects.f p() {
        return this.I;
    }

    @Override // com.vk.im.ui.utils.AppBarLayoutStateListener.a
    public final void q(float f) {
        float f2 = 1.0f;
        if (f >= this.N) {
            if (this.K) {
                float f3 = this.O;
                ValueAnimator valueAnimator = this.P;
                if (f >= f3) {
                    ViewGroup viewGroup = this.u;
                    if (viewGroup == null) {
                        viewGroup = null;
                    }
                    viewGroup.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    View view = this.n;
                    if (view == null) {
                        view = null;
                    }
                    view.setAlpha(1.0f);
                    TextView textView = this.q;
                    if (textView == null) {
                        textView = null;
                    }
                    textView.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    TextView textView2 = this.p;
                    if (textView2 == null) {
                        textView2 = null;
                    }
                    textView2.setAlpha(1.0f);
                    View view2 = this.n;
                    if (view2 == null) {
                        view2 = null;
                    }
                    view2.setTranslationZ(3.0f);
                    Toolbar toolbar = this.f;
                    if (toolbar == null) {
                        toolbar = null;
                    }
                    toolbar.setTranslationZ(2.0f);
                    if (!this.Q) {
                        valueAnimator.start();
                        this.Q = true;
                    }
                } else {
                    this.Q = false;
                    if (valueAnimator.isStarted()) {
                        valueAnimator.cancel();
                    }
                    ViewGroup viewGroup2 = this.u;
                    if (viewGroup2 == null) {
                        viewGroup2 = null;
                    }
                    viewGroup2.setAlpha(1.0f);
                    View view3 = this.n;
                    if (view3 == null) {
                        view3 = null;
                    }
                    view3.setAlpha(1.0f);
                    if (this.J) {
                        TextView textView3 = this.q;
                        if (textView3 == null) {
                            textView3 = null;
                        }
                        textView3.setAlpha(1.0f);
                        TextView textView4 = this.p;
                        if (textView4 == null) {
                            textView4 = null;
                        }
                        textView4.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    } else {
                        TextView textView5 = this.q;
                        if (textView5 == null) {
                            textView5 = null;
                        }
                        textView5.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        TextView textView6 = this.p;
                        if (textView6 == null) {
                            textView6 = null;
                        }
                        textView6.setAlpha(1.0f);
                    }
                    TextView textView7 = this.r;
                    if (textView7 == null) {
                        textView7 = null;
                    }
                    textView7.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    View view4 = this.n;
                    if (view4 == null) {
                        view4 = null;
                    }
                    view4.setTranslationZ(1.0f);
                    Toolbar toolbar2 = this.f;
                    if (toolbar2 == null) {
                        toolbar2 = null;
                    }
                    toolbar2.setTranslationZ(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
                View view5 = this.v;
                if (view5 == null) {
                    view5 = null;
                }
                view5.setAlpha(1.0f);
            } else {
                View view6 = this.n;
                if (view6 == null) {
                    view6 = null;
                }
                view6.setAlpha(1.0f);
                TextView textView8 = this.q;
                if (textView8 == null) {
                    textView8 = null;
                }
                textView8.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                TextView textView9 = this.p;
                if (textView9 == null) {
                    textView9 = null;
                }
                textView9.setAlpha(1.0f);
                TextView textView10 = this.r;
                if (textView10 == null) {
                    textView10 = null;
                }
                textView10.setAlpha(1.0f);
                ViewGroup viewGroup3 = this.t;
                if (viewGroup3 == null) {
                    viewGroup3 = null;
                }
                viewGroup3.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                View view7 = this.n;
                if (view7 == null) {
                    view7 = null;
                }
                view7.setTranslationZ(3.0f);
                Toolbar toolbar3 = this.f;
                if (toolbar3 == null) {
                    toolbar3 = null;
                }
                toolbar3.setTranslationZ(2.0f);
            }
            float f4 = this.M;
            int i = ((int) (f4 - (this.N * f4))) - ((int) (f4 - (f4 * f)));
            ViewGroup viewGroup4 = this.t;
            if (viewGroup4 == null) {
                viewGroup4 = null;
            }
            viewGroup4.setScrollY(-i);
        } else {
            this.Q = false;
            ViewGroup viewGroup5 = this.t;
            if (viewGroup5 == null) {
                viewGroup5 = null;
            }
            viewGroup5.setScrollY(0);
            ViewGroup viewGroup6 = this.u;
            if (viewGroup6 == null) {
                viewGroup6 = null;
            }
            viewGroup6.setAlpha(1.0f);
            ViewGroup viewGroup7 = this.t;
            if (viewGroup7 == null) {
                viewGroup7 = null;
            }
            viewGroup7.setAlpha(1.0f);
            View view8 = this.n;
            if (view8 == null) {
                view8 = null;
            }
            view8.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            TextView textView11 = this.q;
            if (textView11 == null) {
                textView11 = null;
            }
            textView11.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            TextView textView12 = this.p;
            if (textView12 == null) {
                textView12 = null;
            }
            textView12.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            TextView textView13 = this.r;
            if (textView13 == null) {
                textView13 = null;
            }
            textView13.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            View view9 = this.v;
            if (view9 == null) {
                view9 = null;
            }
            view9.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            View view10 = this.n;
            if (view10 == null) {
                view10 = null;
            }
            view10.setTranslationZ(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            Toolbar toolbar4 = this.f;
            if (toolbar4 == null) {
                toolbar4 = null;
            }
            toolbar4.setTranslationZ(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        float f5 = this.N;
        if (f5 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f2 = swe0.f(f / f5, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        } else if (f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f2 = 0.0f;
        }
        FrameLayout frameLayout = this.k;
        if (frameLayout == null) {
            frameLayout = null;
        }
        float f6 = 1;
        float f7 = f6 - f2;
        frameLayout.setAlpha(f7);
        frameLayout.setScaleX(f7);
        frameLayout.setScaleY(f7);
        float f8 = f6 - (0.1764706f * f2);
        TextView textView14 = this.m;
        if (textView14 == null) {
            textView14 = null;
        }
        t(textView14, f8);
        TextView textView15 = this.p;
        if (textView15 == null) {
            textView15 = null;
        }
        t(textView15, f8);
        TextView textView16 = this.q;
        if (textView16 == null) {
            textView16 = null;
        }
        t(textView16, f8);
        View view11 = this.v;
        if (view11 == null) {
            view11 = null;
        }
        view11.setScaleX(f8);
        TextView textView17 = this.y;
        if (textView17 == null) {
            textView17 = null;
        }
        float f9 = f6 - (0.071428575f * f2);
        t(textView17, f9);
        TextView textView18 = this.y;
        if (textView18 == null) {
            textView18 = null;
        }
        float f10 = -f2;
        textView18.setTranslationY(this.R * f10);
        TextView textView19 = this.r;
        if (textView19 == null) {
            textView19 = null;
        }
        TextView textView20 = this.y;
        if (textView20 == null) {
            textView20 = null;
        }
        t(textView19, textView20.getScaleX());
        TextView textView21 = this.x;
        if (textView21 == null) {
            textView21 = null;
        }
        t(textView21, f9);
        TextView textView22 = this.x;
        if (textView22 == null) {
            textView22 = null;
        }
        textView22.setTranslationY(f10 * this.R);
        TextView textView23 = this.x;
        (textView23 != null ? textView23 : null).setEnabled(f2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    /* JADX WARN: Type inference failed for: r1v41, types: [T, xsna.dw20] */
    @Override // xsna.u0e0
    public final void r(uxd0 uxd0Var) {
        o660 o660Var = this.L;
        w9b w9bVar = o660Var.d;
        bzb0 bzb0Var = o660Var.a;
        rxb rxbVar = o660Var.e;
        bzb0 bzb0Var2 = o660Var.a;
        if (uxd0Var instanceof uxd0.e0) {
            boolean z = ((uxd0.e0) uxd0Var).a;
            rxbVar.a();
            Context context = bzb0Var2.a;
            ChatProfileBottomSheetBuilder.b(context, new px30(o660Var, 6), z).a(context, null);
            return;
        }
        if (uxd0Var instanceof uxd0.k) {
            Context context2 = bzb0Var2.a;
            ChatProfileBottomSheetBuilder.a(context2, new b810(o660Var, 9)).a(context2, null);
            return;
        }
        boolean z2 = uxd0Var instanceof uxd0.f0;
        Context context3 = this.b;
        if (z2) {
            bzb0.d(bzb0Var2, new cwb0.q0(context3, ((uxd0.f0) uxd0Var).a, o660Var.f), null, null, null, 30);
            return;
        }
        if (uxd0Var instanceof uxd0.g) {
            uxd0.g gVar = (uxd0.g) uxd0Var;
            bzb0.d(bzb0Var2, new ye7(context3, gVar.a), gVar.b, null, null, 28);
            return;
        }
        if (uxd0Var instanceof uxd0.h0) {
            uxd0.h0 h0Var = (uxd0.h0) uxd0Var;
            bzb0.d(bzb0Var2, new h2q0(context3, h0Var.a), h0Var.b, null, null, 28);
            return;
        }
        if (uxd0Var instanceof uxd0.u) {
            uxd0.u uVar = (uxd0.u) uxd0Var;
            DialogExt dialogExt = uVar.a;
            CharSequence charSequence = uVar.b;
            Dialog Cb = dialogExt.Cb();
            if (Cb == null) {
                return;
            }
            bzb0.e(bzb0Var, new cwb0.q(context3, Cb, charSequence), new cqv(o660Var, 19));
            return;
        }
        if (uxd0Var instanceof uxd0.v) {
            uxd0.v vVar = (uxd0.v) uxd0Var;
            bzb0Var2.c(new cwb0.p(vVar.a), vVar.b);
            return;
        }
        if (uxd0Var instanceof uxd0.r) {
            bzb0.d(bzb0Var2, new cwb0.v(context3), new x4u(o660Var, 20), null, null, 28);
            return;
        }
        if (uxd0Var instanceof uxd0.s) {
            uxd0.s sVar = (uxd0.s) uxd0Var;
            bzb0Var2.c(new cwb0.w(sVar.a), sVar.b);
            return;
        }
        if (uxd0Var instanceof uxd0.e) {
            uxd0.e eVar = (uxd0.e) uxd0Var;
            bzb0.d(bzb0Var2, new cwb0.d0(context3, eVar.a), eVar.b, eVar.c, null, 24);
            return;
        }
        if (uxd0Var instanceof uxd0.d) {
            bzb0Var2.c(cwb0.b.e, ((uxd0.d) uxd0Var).a);
            return;
        }
        if (uxd0Var instanceof uxd0.i0) {
            uxd0.i0 i0Var = (uxd0.i0) uxd0Var;
            bzb0Var2.c(new cwb0.g0(i0Var.a), i0Var.b);
            return;
        }
        if (uxd0Var instanceof uxd0.b0) {
            uxd0.b0 b0Var = (uxd0.b0) uxd0Var;
            bzb0.e(bzb0Var2, new cwb0.h0(context3, b0Var.a), new n660(0, b0Var.b));
            return;
        }
        if (uxd0Var instanceof uxd0.c0) {
            uxd0.c0 c0Var = (uxd0.c0) uxd0Var;
            bzb0Var2.c(new cwb0.g0(c0Var.a), c0Var.b);
            return;
        }
        if (uxd0Var instanceof uxd0.d0) {
            uxd0.d0 d0Var = (uxd0.d0) uxd0Var;
            List<MemberAction> list = d0Var.a;
            boolean z3 = d0Var.b;
            kp5 kp5Var = d0Var.c;
            ImFeatures imFeatures = ImFeatures.IM_CHAT_PROFILE_REDESIGN;
            imFeatures.getClass();
            if (!com.vk.toggle.b.A.a(imFeatures)) {
                bzb0Var.b(new cwb0.k0(list, true, z3), kp5Var, null);
                return;
            }
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            Context context4 = bzb0Var2.a;
            int i = w8m.a;
            ref$ObjectRef.element = new rew(context4, w8m.d(new cwb0.k0(list, true, z3)), new k8(23, kp5Var, ref$ObjectRef), null).c.b(context4, "IM_ACTIONS_CHOOSER_DIALOG_TAG");
            return;
        }
        if (uxd0Var instanceof uxd0.y) {
            bzb0.d(bzb0Var2, cwb0.f0.l, ((uxd0.y) uxd0Var).a, null, null, 28);
            return;
        }
        if (uxd0Var instanceof uxd0.k0) {
            bzb0.d(bzb0Var2, cwb0.z0.l, ((uxd0.k0) uxd0Var).a, null, null, 28);
            return;
        }
        if (uxd0Var instanceof uxd0.z) {
            bzb0Var2.c(cwb0.e0.e, ((uxd0.z) uxd0Var).a);
            return;
        }
        if (uxd0Var instanceof uxd0.l0) {
            bzb0Var2.c(cwb0.y0.e, ((uxd0.l0) uxd0Var).a);
            return;
        }
        if (uxd0Var instanceof uxd0.j0) {
            bzb0Var2.c(cwb0.d.e, ((uxd0.j0) uxd0Var).a);
            return;
        }
        if (uxd0Var instanceof uxd0.n0) {
            bzb0Var2.c(cwb0.c.e, ((uxd0.n0) uxd0Var).a);
            return;
        }
        if (uxd0Var instanceof uxd0.w) {
            o660Var.c.invoke(((uxd0.w) uxd0Var).a);
            return;
        }
        if (uxd0Var instanceof uxd0.x) {
            uxd0.x xVar = (uxd0.x) uxd0Var;
            bzb0Var2.f(xVar.a, xVar.b);
            return;
        }
        if (uxd0Var instanceof uxd0.c) {
            bzb0Var2.a();
            return;
        }
        if (uxd0Var instanceof uxd0.q0) {
            rxbVar.b((uxd0.q0) uxd0Var);
            return;
        }
        if (uxd0Var instanceof uxd0.a) {
            ((uxd0.a) uxd0Var).a.invoke(w9bVar).invoke();
            return;
        }
        if (uxd0Var instanceof uxd0.i) {
            bzb0Var2.b(new cwb0.i(0), new lqd(((uxd0.i) uxd0Var).a, 3), null);
            return;
        }
        if (uxd0Var instanceof uxd0.j) {
            bzb0Var2.c(new cwb0.s0(null, 0, 7), ((uxd0.j) uxd0Var).a);
            return;
        }
        if (uxd0Var instanceof uxd0.m0) {
            bzb0Var2.c(new cwb0.s0(null, 0, 7), ((uxd0.m0) uxd0Var).a);
            return;
        }
        if (uxd0Var instanceof uxd0.a0) {
            bzb0.d(bzb0Var2, new ezy(bzb0Var2.a, R.string.vkim_leave_channel_dialog_title, R.string.vkim_leave_channel_dialog_subtitle, R.string.vkim_leave_channel_dialog_close, R.string.vkim_channel_leave), new i440(o660Var, 4), new zf20(o660Var, 5), null, 24);
            return;
        }
        if (uxd0Var instanceof uxd0.n) {
            long j = ((uxd0.n) uxd0Var).a;
            g2v.c().getClass();
            int i2 = ReportFragment.a0;
            ReportFragment.a a2 = ReportFragment.b.a();
            a2.K("community_channel");
            a2.m = a2.m.buildUpon().appendQueryParameter("channel_id", String.valueOf(j)).build();
            a2.N();
            a2.s(true);
            a2.k(context3);
            return;
        }
        int i3 = 16;
        if (uxd0Var instanceof uxd0.q) {
            bzb0.d(bzb0Var2, new wul(bzb0Var2.a, R.string.vkim_channels_delete_submit_title, R.string.vkim_vkapp_channels_delete_submit_msg), new Cnew(o660Var, i3), null, null, 28);
        } else if (uxd0Var.equals(uxd0.h.a)) {
            VkImAvatar vkImAvatar = w9bVar.j;
            if (vkImAvatar == null) {
                vkImAvatar = null;
            }
            bzb0Var.b(new cwb0.a(e43.l(AccountAvatarAction.OPEN_STORY, AccountAvatarAction.OPEN)), new ml1(i3, o660Var, vkImAvatar), null);
        }
    }

    public final void s(zxd0 zxd0Var) {
        this.H.onNext(zxd0Var);
    }

    public final void u(AppBarLayoutStateListener.AppBarState appBarState) {
        ChatProfileActionsView chatProfileActionsView = this.z;
        if (chatProfileActionsView == null || !chatProfileActionsView.Q4()) {
            ChatProfileActionsView chatProfileActionsView2 = this.z;
            if (chatProfileActionsView2 != null) {
                f4m.j(chatProfileActionsView2);
                return;
            }
            return;
        }
        int i = a.$EnumSwitchMapping$0[appBarState.ordinal()];
        if (i == 1) {
            ChatProfileActionsView chatProfileActionsView3 = this.z;
            if (chatProfileActionsView3 != null) {
                chatProfileActionsView3.setVisibility(0);
            }
            ChatProfileActionsView chatProfileActionsView4 = this.z;
            if (chatProfileActionsView4 != null) {
                int childCount = chatProfileActionsView4.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    chatProfileActionsView4.getChildAt(i2).setClickable(true);
                }
                return;
            }
            return;
        }
        if (i != 2) {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            ChatProfileActionsView chatProfileActionsView5 = this.z;
            if (chatProfileActionsView5 != null) {
                chatProfileActionsView5.setVisibility(4);
                return;
            }
            return;
        }
        ChatProfileActionsView chatProfileActionsView6 = this.z;
        if (chatProfileActionsView6 != null) {
            chatProfileActionsView6.setVisibility(0);
        }
        ChatProfileActionsView chatProfileActionsView7 = this.z;
        if (chatProfileActionsView7 != null) {
            int childCount2 = chatProfileActionsView7.getChildCount();
            for (int i3 = 0; i3 < childCount2; i3++) {
                chatProfileActionsView7.getChildAt(i3).setClickable(false);
            }
        }
    }

    public final void v(AppBarLayoutStateListener.AppBarState appBarState) {
        int i = a.$EnumSwitchMapping$0[appBarState.ordinal()];
        if (i == 1) {
            VkImAvatar vkImAvatar = this.j;
            if (vkImAvatar == null) {
                vkImAvatar = null;
            }
            vkImAvatar.setVisibility(0);
            VkImAvatar vkImAvatar2 = this.j;
            (vkImAvatar2 != null ? vkImAvatar2 : null).setClickable(this.l);
            return;
        }
        if (i == 2) {
            VkImAvatar vkImAvatar3 = this.j;
            if (vkImAvatar3 == null) {
                vkImAvatar3 = null;
            }
            vkImAvatar3.setVisibility(0);
            VkImAvatar vkImAvatar4 = this.j;
            (vkImAvatar4 != null ? vkImAvatar4 : null).setClickable(false);
            return;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        VkImAvatar vkImAvatar5 = this.j;
        if (vkImAvatar5 == null) {
            vkImAvatar5 = null;
        }
        vkImAvatar5.setVisibility(4);
        VkImAvatar vkImAvatar6 = this.j;
        (vkImAvatar6 != null ? vkImAvatar6 : null).setClickable(this.l);
    }

    @Override // xsna.ify.a
    public final void x0(int i) {
        AppBarLayout appBarLayout = this.g;
        if (appBarLayout == null) {
            appBarLayout = null;
        }
        appBarLayout.setExpanded(false);
    }

    @Override // xsna.ify.a
    public final void Y0() {
    }
}
