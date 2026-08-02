package xsna;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.util.Size;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.widget.ViewPager2;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.apps.BuildInfo;
import com.vk.core.preference.Preference;
import com.vk.core.voip.VoipCallSource;
import com.vk.im.ui.views.avatars.a;
import com.vk.imageloader.view.VKImageView;
import com.vk.log.L;
import com.vk.stat.scheme.MobileOfficialAppsCallsStat$TypeVoipCallItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.toggle.Features;
import com.vk.voip.OKVoipEngine;
import com.vk.voip.api.di.VoipCallComponent;
import com.vk.voip.dto.call_member.CallMember;
import com.vk.voip.dto.call_member.CallMemberId;
import com.vk.voip.ui.VoipTextButton;
import com.vk.voip.ui.VoipViewBehaviour;
import com.vk.voip.ui.VoipViewModelState;
import com.vk.voip.ui.asr_online.AsrOnlineView;
import com.vk.voip.ui.avatars.VoipAvatarViewContainer;
import com.vk.voip.ui.debug.view.HeadersViewBoundsDebugView;
import com.vk.voip.ui.groupcalls.ControlsBoundsProvider;
import com.vk.voip.ui.groupcalls.GroupCallViewModel;
import com.vk.voip.ui.groupcalls.grid.GroupCallGridContainerView;
import com.vk.voip.ui.groupcalls.list.ListGroupCallView;
import com.vk.voip.ui.hint.VoipHintView;
import com.vk.voip.ui.hint.a;
import com.vk.voip.ui.members.VoipDataProvider;
import com.vk.voip.ui.sessionrooms.SessionRoomsObserver;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.functions.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.webrtc.RendererCommon;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.layout.ConversationDisplayLayoutItem;
import ru.ok.android.externcalls.sdk.layout.ConversationVideoTrackParticipantKey;
import ru.ok.android.externcalls.sdk.participant.collection.ParticipantCollection;
import ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager;
import ru.ok.android.externcalls.sdk.stat.StatSets;
import ru.ok.android.externcalls.sdk.stat.view.TextStatRenderer;
import ru.ok.android.externcalls.sdk.stat.view.TextStatRendererView;
import ru.ok.android.externcalls.sdk.ui.FrameDecorator;
import ru.ok.android.externcalls.sdk.ui.TextureViewRenderer;
import ru.ok.android.webrtc.videotracks.VideoTrackType;
import xsna.boo;
import xsna.e3m;
import xsna.g3m;
import xsna.gf8;
import xsna.ghw0;
import xsna.qhu;
import xsna.qiu;
import xsna.zrw;

/* compiled from: VoipCallView.kt */
/* loaded from: classes7.dex */
public final class mjw0 extends FrameLayout implements tmg0, ControlsBoundsProvider, arj, w8i {
    public static final long l1 = TimeUnit.SECONDS.toMillis(3);
    public static final int m1 = cn70.b(16);
    public static final int n1 = cn70.b(96);
    public static final int o1 = cn70.b(128);
    public static final int p1 = cn70.b(16);
    public final ViewGroup A;
    public final dkw0 A0;
    public final View B;
    public final zjw0 B0;
    public final View C;
    public final ov3 C0;
    public final VKImageView D;
    public final vjw0 D0;
    public final VKImageView E;
    public final jkw0 E0;
    public final zrw F;
    public final kkw0 F0;
    public final ft80 G;
    public boolean G0;
    public final gxu H;
    public boolean H0;
    public final g8x0 I;
    public final io.reactivex.rxjava3.subjects.f I0;
    public final ssw J;
    public final bpn0 J0;
    public final e8x0 K;
    public final h0 K0;
    public final io.reactivex.rxjava3.disposables.b L;
    public final k6x0 L0;
    public Long M;
    public final rcx0 M0;
    public final FrameLayout N;
    public final ov N0;
    public int O;
    public final ArrayList O0;
    public int P;
    public final OKVoipEngine P0;
    public final ViewGroup Q;
    public final rct0 Q0;
    public final ImageView R;
    public final i9d0 R0;
    public final ImageView S;
    public final f69 S0;
    public final VoipHintView T;
    public final ze00 T0;
    public final VoipTextButton U;
    public final j6r U0;
    public final VoipTextButton V;
    public final ArrayList V0;
    public final com.vk.voip.ui.hint.a W;
    public io.reactivex.rxjava3.disposables.c W0;
    public final io.reactivex.rxjava3.subjects.f<Float> X0;
    public io.reactivex.rxjava3.disposables.c Y0;
    public final EmptyList Z0;
    public hjw0 a0;
    public final gkw0 a1;
    public final gvw0 b;
    public njw0 b0;
    public boolean b1;
    public final a c;
    public ojw0 c0;
    public gzs<s3q0> c1;
    public final zzz d;
    public lsw0 d0;
    public izs<? super Long, s3q0> d1;
    public final GroupCallGridContainerView e;
    public final AnimatorSet e0;
    public gzs<s3q0> e1;
    public final ListGroupCallView f;
    public final LinearLayout f0;
    public izs<? super izs<? super Boolean, s3q0>, s3q0> f1;
    public final ne00 g;
    public final View g0;
    public long g1;
    public final qiu h;
    public final FrameLayout h0;
    public boolean h1;
    public CallMemberId i;
    public final FrameLayout i0;
    public boolean i1;
    public boolean j;
    public final cbv j0;
    public final g3m j1;
    public boolean k;
    public final io.reactivex.rxjava3.subjects.d<szt0> k0;
    public final cdi k1;
    public final TextView l;
    public final ViewGroup l0;
    public final VoipAvatarViewContainer m;
    public final VoipTextButton m0;
    public final VKImageView n;
    public final ViewGroup n0;
    public final FrameLayout o;
    public final ImageView o0;
    public TextureViewRenderer p;
    public final ImageView p0;
    public ConversationVideoTrackParticipantKey q;
    public final ViewGroup q0;
    public final FrameLayout r;
    public final ImageView r0;
    public TextureViewRenderer s;
    public final ImageView s0;
    public ConversationVideoTrackParticipantKey t;
    public final pkw0 t0;
    public final gb9 u;
    public final mkw0 u0;
    public final TextStatRenderer v;
    public final hkw0 v0;
    public final TextStatRendererView w;
    public final ekw0 w0;
    public final VoipViewBehaviour x;
    public final eh8 x0;
    public final VoipViewBehaviour y;
    public final sg8 y0;
    public final Object z;
    public final akw0 z0;

    /* compiled from: VoipCallView.kt */
    public static final class a extends ViewOutlineProvider {
        public float a;

        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), cn70.a() * this.a);
        }
    }

    /* compiled from: VoipCallView.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GroupCallViewModel.GroupCallViewMode.values().length];
            try {
                iArr[GroupCallViewModel.GroupCallViewMode.GridViewMode.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GroupCallViewModel.GroupCallViewMode.MainSpeakerAndThumbsViewMode.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: VoipCallView.kt */
    public static final /* synthetic */ class c extends AdaptedFunctionReference implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            com.vk.voip.ui.c cVar = (com.vk.voip.ui.c) this.receiver;
            com.vk.voip.ui.c cVar2 = com.vk.voip.ui.c.b;
            cVar.j(false);
            return s3q0.a;
        }
    }

    /* compiled from: VoipCallView.kt */
    public static final /* synthetic */ class d extends AdaptedFunctionReference implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            com.vk.voip.ui.c cVar = (com.vk.voip.ui.c) this.receiver;
            com.vk.voip.ui.c cVar2 = com.vk.voip.ui.c.b;
            cVar.j(false);
            return s3q0.a;
        }
    }

    /* compiled from: VoipCallView.kt */
    public static final /* synthetic */ class e extends AdaptedFunctionReference implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            com.vk.voip.ui.c cVar = (com.vk.voip.ui.c) this.receiver;
            com.vk.voip.ui.c cVar2 = com.vk.voip.ui.c.b;
            cVar.j(false);
            return s3q0.a;
        }
    }

    /* compiled from: VoipCallView.kt */
    public static final /* synthetic */ class f extends FunctionReferenceImpl implements izs<jf8, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(jf8 jf8Var) {
            jf8 jf8Var2 = jf8Var;
            com.vk.voip.ui.hint.a aVar = (com.vk.voip.ui.hint.a) this.receiver;
            aVar.getClass();
            com.vk.voip.ui.c.b.getClass();
            VoipDataProvider voipDataProvider = com.vk.voip.ui.c.d0;
            if (voipDataProvider == null) {
                voipDataProvider = null;
            }
            io.reactivex.rxjava3.disposables.c e = io.reactivex.rxjava3.kotlin.c.e(voipDataProvider.o(jf8Var2.b.a), new gyo0(jf8Var2, 19), new x7t0(6, aVar, jf8Var2));
            pgn pgnVar = aVar.h;
            qcy<Object> qcyVar = com.vk.voip.ui.hint.a.m[1];
            pgnVar.b(e);
            return s3q0.a;
        }
    }

    /* compiled from: VoipCallView.kt */
    public static final /* synthetic */ class g extends FunctionReferenceImpl implements izs<gy50, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(gy50 gy50Var) {
            ((f69) this.receiver).a(gy50Var);
            return s3q0.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public mjw0(l7s l7sVar, gvw0 gvw0Var) {
        super(l7sVar);
        int i;
        mjw0 mjw0Var;
        gxu gxuVar;
        int i2;
        char c2;
        char c3;
        ListGroupCallView listGroupCallView;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        ViewGroup viewGroup4;
        this.b = gvw0Var;
        com.vk.voip.ui.c cVar = com.vk.voip.ui.c.b;
        cVar.getClass();
        a000 a000Var = (a000) com.vk.voip.ui.c.T().a;
        this.d = a000Var;
        qiu qiuVar = new qiu();
        this.h = qiuVar;
        this.z = msy.a(LazyThreadSafetyMode.NONE, new cy20(27));
        this.L = new io.reactivex.rxjava3.disposables.b();
        this.e0 = new AnimatorSet();
        this.k0 = io.reactivex.rxjava3.subjects.d.O0(new szt0(0));
        int i3 = 5;
        if (ad0.e == null) {
            ad0.e = new eh8(com.vk.voip.ui.c.r, ad0.d, new bpn0(new yv2(i3)), com.vk.voip.ui.c.I());
        }
        this.x0 = ad0.e;
        this.C0 = com.vk.voip.ui.c.G().j;
        this.G0 = com.vk.voip.ui.c.t;
        rah0 rah0Var = com.vk.voip.ui.c.g;
        this.H0 = (rah0Var == null ? null : rah0Var).b();
        this.I0 = new io.reactivex.rxjava3.subjects.f();
        int i4 = 17;
        this.J0 = new bpn0(new pis0(this, i4));
        this.N0 = new ov(this, 20);
        ArrayList arrayList = new ArrayList();
        this.O0 = arrayList;
        OKVoipEngine oKVoipEngine = com.vk.voip.ui.c.r;
        this.P0 = oKVoipEngine;
        this.Q0 = oKVoipEngine.getVideoController();
        this.V0 = new ArrayList();
        EmptyDisposable emptyDisposable = EmptyDisposable.INSTANCE;
        this.W0 = emptyDisposable;
        this.X0 = new io.reactivex.rxjava3.subjects.f<>();
        this.Y0 = emptyDisposable;
        this.Z0 = EmptyList.b;
        this.k1 = new cdi();
        OKVoipEngine.b.w();
        setBackground(new ColorDrawable(-9341574));
        e3m.b(v()).inflate(R.layout.voip_call_view_full_screen, this);
        this.w = (TextStatRendererView) findViewById(R.id.debug_media_stat_fullscreen);
        GroupCallGridContainerView groupCallGridContainerView = (GroupCallGridContainerView) findViewById(R.id.grid_group_call_view);
        groupCallGridContainerView.setTopIndent(qiuVar);
        groupCallGridContainerView.setListener(new qca0(this, 18));
        groupCallGridContainerView.setBoundsProvider(this);
        this.e = groupCallGridContainerView;
        FragmentManager fragmentManager = getFragmentManager();
        a aVar = new a();
        aVar.a = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.c = aVar;
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.fl_answer);
        this.f0 = linearLayout;
        v2x0 v2x0Var = com.vk.voip.ui.c.r0;
        zrw zrwVar = new zrw(this, (v2x0Var == null ? null : v2x0Var).c());
        this.F = zrwVar;
        ft80 ft80Var = new ft80(this);
        this.G = ft80Var;
        this.I = new g8x0(this, com.vk.voip.ui.c.F());
        this.J = new ssw(this);
        this.K = new e8x0(this);
        VoipHintView voipHintView = (VoipHintView) findViewById(R.id.voip_hint_view);
        this.T = voipHintView;
        com.vk.voip.ui.hint.a aVar2 = new com.vk.voip.ui.hint.a(voipHintView, cVar, GroupCallViewModel.b, new f9t(i4), new po40(), v6v.a(), com.vk.voip.ui.c.j0(), k(oKVoipEngine.getParticipantStatesManager()), gvw0Var);
        this.W = aVar2;
        int i5 = 0;
        int i6 = 0;
        int i7 = 27;
        ze00 ze00Var = new ze00(this, new wfu0(l7sVar, 3), new k3b(i6, this, mjw0.class, "getFragmentManager", "getFragmentManager()Landroidx/fragment/app/FragmentManager;", i5, 8), new tfm0(this, i7), new m9b(i6, this, mjw0.class, "isAnimationAllowed", "isAnimationAllowed()Z", i5, 6), new xkw(i6, this, mjw0.class, "scheduleUpdateUIStateThrottled", "scheduleUpdateUIStateThrottled()V", i5, 4));
        this.T0 = ze00Var;
        f69 f69Var = new f69(getContext(), ((VoipCallComponent) ((k7m) m7m.f(this)).a(fpf0.a(VoipCallComponent.class))).a(), com.vk.voip.ui.c.F0, aVar2);
        this.S0 = f69Var;
        int i8 = 10;
        i9d0 i9d0Var = new i9d0(gvw0Var, new afl0(this, 28), new tjw0(4, aVar2, com.vk.voip.ui.hint.a.class, "onMediaMuted", "onMediaMuted(Lru/ok/android/webrtc/media_options/MediaOptionState;Lru/ok/android/webrtc/media_options/MediaOptionState;ZZ)V", 0), new ll4(0, aVar2, com.vk.voip.ui.hint.a.class, "onWatchTogetherForbidden", "onWatchTogetherForbidden()V", 0, 1), new od50(com.vk.voip.ui.c.X, new jzm0(i8)), new oqh0(f69Var, i7), f69Var, new chr0(8));
        this.R0 = i9d0Var;
        this.a1 = new gkw0(i9d0Var, com.vk.voip.ui.c.B0, com.vk.voip.ui.c.l0());
        this.U0 = new j6r(new t98(this), com.vk.voip.ui.c.Y, com.vk.voip.ui.c.F(), l7sVar);
        ListGroupCallView listGroupCallView2 = (ListGroupCallView) findViewById(R.id.list_group_call_view);
        listGroupCallView2.setOpponentNetworkStatusVisibilityUpdater$ui_release(ft80Var.c);
        listGroupCallView2.setPinNotAllowedListener(new vhs0(this, 12));
        this.f = listGroupCallView2;
        listGroupCallView2.setListener(new u1j0(this, 11));
        listGroupCallView2.setBoundsProvider(this);
        g3m g3mVar = new g3m(a000Var, zrwVar, qiuVar, ze00Var, listGroupCallView2);
        this.j1 = g3mVar;
        getContext();
        gxu gxuVar2 = new gxu(this, g3mVar, new mcc0(f69Var));
        ((HeadersViewBoundsDebugView) findViewById(R.id.bounds_debug_view)).setDesignControlBounds(g3mVar);
        this.H = gxuVar2;
        listGroupCallView2.setPrimaryParticipantTabs(gxuVar2.i);
        arrayList.add(zrwVar);
        arrayList.add(gxuVar2);
        arrayList.add(ft80Var);
        this.n0 = (ViewGroup) findViewById(R.id.ll_p2p_own_mic_cam);
        ImageView imageView = (ImageView) findViewById(R.id.iv_p2p_own_mic_off);
        this.o0 = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.iv_p2p_own_cam_off);
        this.p0 = imageView2;
        this.q0 = (ViewGroup) findViewById(R.id.ll_p2p_remote_mic_cam);
        this.r0 = (ImageView) findViewById(R.id.iv_p2p_remote_mic_off);
        this.s0 = (ImageView) findViewById(R.id.iv_p2p_remote_cam_off);
        this.g0 = linearLayout.findViewById(R.id.fl_answer_contact_call_warning);
        int i9 = 2;
        ((VoipTextButton) linearLayout.findViewById(R.id.btn_accept_audio)).setOnButtonClickCallback(new dtv0(this, i9));
        ((VoipTextButton) linearLayout.findViewById(R.id.btn_decline_call)).setOnButtonClickCallback(new s7c0(19));
        ((VoipTextButton) linearLayout.findViewById(R.id.btn_accept_video_call)).setOnButtonClickCallback(new mwm0(this, 21));
        ((VoipTextButton) linearLayout.findViewById(R.id.btn_accept_audio_call)).setOnButtonClickCallback(new vpj0(this, 23));
        ((VoipTextButton) linearLayout.findViewById(R.id.btn_decline_video_call)).setOnButtonClickCallback(new w0o0(13));
        this.h0 = (FrameLayout) linearLayout.findViewById(R.id.fl_answer_audio);
        this.i0 = (FrameLayout) linearLayout.findViewById(R.id.fl_answer_video);
        this.l = (TextView) findViewById(R.id.tv_peer_name);
        this.m = (VoipAvatarViewContainer) findViewById(R.id.iv_peer_photo);
        VKImageView vKImageView = (VKImageView) findViewById(R.id.iv_peer_big_blurred_photo);
        this.n = vKImageView;
        com.vk.voip.ui.c.s0.f.getClass();
        mqw0 mqw0Var = mqw0.a;
        Boolean bool = Boolean.TRUE;
        if (bool.booleanValue()) {
            vKImageView.setPostprocessor(new hh7(cn70.b(10), -1895825408));
        }
        bwt0.i0(vKImageView, new k7l0(this, 25));
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.fl_p2p_render_container_remote_big);
        this.o = frameLayout;
        FrameLayout frameLayout2 = (FrameLayout) findViewById(R.id.fl_p2p_render_container_own_minimized);
        this.r = frameLayout2;
        View findViewById = findViewById(R.id.thumb_touch_overlay);
        View findViewById2 = findViewById(R.id.big_touch_overlay);
        View findViewById3 = findViewById(R.id.fl_render_container_container);
        this.g = new ne00(listGroupCallView2, groupCallGridContainerView);
        int i10 = 1;
        this.L0 = new k6x0(e43.l(listGroupCallView2.getPlayerMediator(), groupCallGridContainerView.getPlayerMediator()));
        this.M0 = new rcx0(aVar2, com.vk.voip.ui.c.k0().b, com.vk.voip.ui.c.l0(), oKVoipEngine);
        gb9 gb9Var = new gb9(frameLayout);
        this.u = gb9Var;
        frameLayout2.setClipToOutline(true);
        frameLayout.setClipToOutline(true);
        frameLayout.setClipChildren(false);
        VKImageView vKImageView2 = (VKImageView) findViewById(R.id.iv_p2p_own_preview);
        this.D = vKImageView2;
        com.vk.voip.ui.c.s0.f.getClass();
        mqw0 mqw0Var2 = mqw0.a;
        if (bool.booleanValue()) {
            vKImageView2.setPostprocessor(new hh7(cn70.b(2), -1895825408));
        }
        vKImageView2.load(com.vk.voip.ui.c.J().i());
        VKImageView vKImageView3 = (VKImageView) findViewById(R.id.iv_p2p_remote_stub);
        this.E = vKImageView3;
        com.vk.voip.ui.c.s0.f.getClass();
        mqw0 mqw0Var3 = mqw0.a;
        if (bool.booleanValue()) {
            vKImageView3.setPostprocessor(new hh7(cn70.b(2), -1895825408));
        }
        z();
        float f2 = m1;
        VoipViewBehaviour voipViewBehaviour = new VoipViewBehaviour(frameLayout2, findViewById, f2, findViewById3, false, null);
        this.x = voipViewBehaviour;
        VoipViewBehaviour voipViewBehaviour2 = new VoipViewBehaviour(frameLayout, findViewById2, f2, findViewById3, true, gb9Var);
        this.y = voipViewBehaviour2;
        voipViewBehaviour.m = new rns0(this, i8);
        voipViewBehaviour.n = new myd0(this, 27);
        voipViewBehaviour.l = new tfu0(this, 5);
        voipViewBehaviour.o = new jjw0(this, 0);
        int i11 = 4;
        voipViewBehaviour2.m = new egu0(this, i11);
        voipViewBehaviour2.n = new v5n0(this, 25);
        voipViewBehaviour2.k = new u7v0(this, 3);
        voipViewBehaviour2.l = new d8t0(this, 11);
        voipViewBehaviour2.o = new iml0(this, 29);
        this.K0 = new h0(i11, this, l7sVar);
        ViewGroup viewGroup5 = (ViewGroup) findViewById(R.id.ll_scrims);
        this.A = viewGroup5;
        this.B = viewGroup5.findViewById(R.id.scrim_top);
        this.C = viewGroup5.findViewById(R.id.scrim_bottom);
        bwt0.i0(this.F.q, new vgs0(this, 11));
        bwt0.i0(this.F.r, new cbt0(this, i8));
        bwt0.i0(this.F.t, new kjw0(0));
        bwt0.i0(this.F.u, new n9t0(this, 3));
        bwt0.i0(this.F.v, new aiw0(this, i10));
        bwt0.i0(this.F.s, new ljw0(this, 0));
        if (((Boolean) com.vk.voip.ui.c.s0.i.invoke()).booleanValue()) {
            bwt0.i0(this.I.f, new whw0(this, i9));
        }
        bwt0.i0(this.F.w, new biw0(this, i10));
        int i12 = 6;
        bwt0.i0(gxuVar2.j.b, new l2i(new qqt0(this, i12), i12));
        this.N = (FrameLayout) findViewById(R.id.fl_callback_actions);
        ((VoipTextButton) findViewById(R.id.btn_cancel)).setOnButtonClickCallback(new zpt0(5));
        VoipTextButton voipTextButton = (VoipTextButton) findViewById(R.id.btn_callback);
        this.U = voipTextButton;
        voipTextButton.setOnButtonClickCallback(new z0h0(this, 17));
        VoipTextButton voipTextButton2 = (VoipTextButton) findViewById(R.id.btn_callback_video);
        this.V = voipTextButton2;
        voipTextButton2.setOnButtonClickCallback(new e3c0(this));
        ViewGroup viewGroup6 = (ViewGroup) findViewById(R.id.fl_peer_photo);
        this.Q = viewGroup6;
        ImageView imageView3 = (ImageView) findViewById(R.id.peer_photo_bg_circle_one);
        this.R = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.peer_photo_bg_circle_two);
        this.S = imageView4;
        ViewGroup viewGroup7 = (ViewGroup) findViewById(R.id.top_layers_container);
        new okw0(viewGroup7);
        this.t0 = new pkw0(viewGroup7);
        this.u0 = new mkw0(this, gxuVar2.f);
        this.v0 = new hkw0((ViewGroup) findViewById(R.id.header_join_link_notification_container), new ma9(this));
        this.w0 = new ekw0((ViewGroup) findViewById(R.id.header_join_as_contact_notification_container));
        ViewGroup viewGroup8 = (ViewGroup) findViewById(R.id.broadcast_launch_container);
        if (viewGroup8 != null && cVar.P().isEnabled()) {
            this.y0 = new sg8(viewGroup8, this.x0, new yyl0(this, 26));
        }
        ViewGroup viewGroup9 = (ViewGroup) findViewById(R.id.broadcast_preview_extended_container);
        if (viewGroup9 != null && fragmentManager != null && cVar.P().isEnabled()) {
            akw0 akw0Var = new akw0(v(), fragmentManager, this.x0, viewGroup9);
            q9f0 q9f0Var = new q9f0(this, 8);
            akw0Var.e = q9f0Var;
            yh8 yh8Var = akw0Var.f;
            if (yh8Var != null && (viewGroup4 = yh8Var.a) != null) {
                q9f0Var.a(viewGroup4.getWidth(), viewGroup4.getHeight(), 0, 0);
            }
            this.z0 = akw0Var;
        }
        ViewGroup viewGroup10 = (ViewGroup) findViewById(R.id.broadcast_preview_simple_container);
        if (viewGroup10 == null || !cVar.P().isEnabled()) {
            i = 0;
        } else {
            dkw0 dkw0Var = new dkw0(v(), this.x0, viewGroup10);
            s1j0 s1j0Var = new s1j0(this, 13);
            dkw0Var.d = s1j0Var;
            bi8 bi8Var = dkw0Var.e;
            if (bi8Var == null || (viewGroup3 = bi8Var.b) == null) {
                i = 0;
            } else {
                i = 0;
                s1j0Var.a(viewGroup3.getWidth(), viewGroup3.getHeight(), 0, 0);
            }
            this.A0 = dkw0Var;
        }
        ViewGroup viewGroup11 = (ViewGroup) findViewById(R.id.broadcast_finish_container);
        if (viewGroup11 == null || fragmentManager == null || !cVar.P().isEnabled()) {
            mjw0Var = this;
            gxuVar = gxuVar2;
            i2 = i;
            c2 = 5;
            c3 = 4;
            listGroupCallView = listGroupCallView2;
        } else {
            c2 = 5;
            gxuVar = gxuVar2;
            c3 = 4;
            listGroupCallView = listGroupCallView2;
            i2 = i;
            mjw0Var = this;
            mjw0Var.B0 = new zjw0(v(), fragmentManager, this.x0, viewGroup11, new mvl0(this, 19), new lpd(1, mjw0Var, mjw0.class, "onOpenRecords", "onOpenRecords(Lcom/vk/voip/dto/profiles/VoipProfile;)V", 0, 11));
        }
        ViewGroup viewGroup12 = (ViewGroup) mjw0Var.findViewById(R.id.screencast_preview_container);
        if (viewGroup12 != null) {
            jkw0 jkw0Var = new jkw0(mjw0Var.v(), viewGroup12);
            sqk0 sqk0Var = new sqk0(mjw0Var, 9);
            jkw0Var.c = sqk0Var;
            rdh0 rdh0Var = jkw0Var.g;
            if (rdh0Var != null && (viewGroup2 = rdh0Var.a) != null) {
                sqk0Var.a(viewGroup2.getWidth(), viewGroup2.getHeight(), i2, i2);
            }
            mjw0Var.E0 = jkw0Var;
        }
        com.vk.voip.ui.c.G().getClass();
        vjw0 vjw0Var = new vjw0(mjw0Var.v(), mjw0Var.C0, mjw0Var.W, mjw0Var);
        mjw0Var.D0 = vjw0Var;
        khc0 khc0Var = new khc0(mjw0Var, 16);
        xjw0 xjw0Var = vjw0Var.d;
        xjw0Var.d = khc0Var;
        aw3 aw3Var = xjw0Var.e;
        if (aw3Var != null && (viewGroup = aw3Var.b) != null) {
            viewGroup.getWidth();
            int height = viewGroup.getHeight();
            mjw0Var.e.b(height, i2);
            listGroupCallView.d5(height, i2);
        }
        s3q0 s3q0Var = s3q0.a;
        l7s v = mjw0Var.v();
        ViewGroup viewGroup13 = (ViewGroup) mjw0Var.findViewById(R.id.session_room_indicator_container);
        kkw0 kkw0Var = new kkw0(v, viewGroup13, gxuVar, mjw0Var.W, new k9b(0, mjw0Var, mjw0.class, "getFragmentManager", "getFragmentManager()Landroidx/fragment/app/FragmentManager;", 0, 6));
        eo9 eo9Var = new eo9(mjw0Var);
        kkw0Var.g = eo9Var;
        viewGroup13.getWidth();
        eo9Var.c(viewGroup13.getHeight());
        mjw0Var.F0 = kkw0Var;
        int i13 = 1;
        mjw0Var.F.c.addOnLayoutChangeListener(new cft0(mjw0Var, 1));
        if (((Boolean) com.vk.voip.ui.c.s0.h.invoke()).booleanValue()) {
            TextStatRenderer textStatRenderer = new TextStatRenderer(null, i13, 0 == true ? 1 : 0);
            textStatRenderer.setStatProcessor(OKVoipEngine.D);
            TextStatRendererView textStatRendererView = mjw0Var.w;
            if (textStatRendererView != null) {
                textStatRendererView.setRenderer(textStatRenderer);
                s3q0 s3q0Var2 = s3q0.a;
            }
            mjw0Var.v = textStatRenderer;
            TextStatRendererView textStatRendererView2 = mjw0Var.w;
            if (textStatRendererView2 != null) {
                textStatRendererView2.setVisibility(i2);
                s3q0 s3q0Var3 = s3q0.a;
            }
        }
        mjw0Var.g1 = System.currentTimeMillis();
        mjw0Var.l0 = (ViewGroup) mjw0Var.findViewById(R.id.fl_message_recording_actinos);
        VoipTextButton voipTextButton3 = (VoipTextButton) mjw0Var.findViewById(R.id.btn_send_audio_message);
        mjw0Var.m0 = voipTextButton3;
        VoipTextButton voipTextButton4 = (VoipTextButton) mjw0Var.findViewById(R.id.btn_cancel_recording);
        voipTextButton3.setOnButtonClickCallback(new jql0(7));
        voipTextButton4.setOnButtonClickCallback(new yo80(19));
        listGroupCallView.setVoipCallView$ui_release(mjw0Var);
        s3q0 s3q0Var4 = s3q0.a;
        if (com.vk.toggle.b.A.a(Features.Type.FEATURE_VOIP_HOLIDAY_INTERACTION)) {
            mjw0Var.j0 = new cbv(mjw0Var);
        }
        float[] fArr = new float[1];
        fArr[i2] = 1.3f;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView3, "scaleX", fArr);
        ofFloat.setDuration(1100L);
        float[] fArr2 = new float[1];
        fArr2[i2] = 1.3f;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView3, "scaleY", fArr2);
        ofFloat2.setDuration(1100L);
        float[] fArr3 = new float[1];
        fArr3[i2] = 0.0f;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(imageView3, "alpha", fArr3);
        ofFloat3.setDuration(1100L);
        float[] fArr4 = new float[1];
        fArr4[i2] = 1.15f;
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(imageView4, "scaleX", fArr4);
        ofFloat4.setDuration(1400L);
        float[] fArr5 = new float[1];
        fArr5[i2] = 1.15f;
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(imageView4, "scaleY", fArr5);
        ofFloat5.setDuration(1400L);
        float[] fArr6 = new float[1];
        fArr6[i2] = 0.0f;
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(imageView4, "alpha", fArr6);
        ofFloat6.setDuration(1400L);
        AnimatorSet animatorSet = mjw0Var.e0;
        Animator[] animatorArr = new Animator[6];
        animatorArr[i2] = ofFloat;
        animatorArr[1] = ofFloat2;
        animatorArr[2] = ofFloat3;
        animatorArr[3] = ofFloat4;
        animatorArr[c3] = ofFloat5;
        animatorArr[c2] = ofFloat6;
        animatorSet.playTogether(animatorArr);
        animatorSet.addListener(new sjw0(mjw0Var));
        mjw0Var.s();
        ArrayList arrayList2 = mjw0Var.V0;
        arrayList2.add(viewGroup6);
        arrayList2.add(mjw0Var.T);
        arrayList2.add(imageView);
        arrayList2.add(imageView2);
    }

    public static s3q0 b(mjw0 mjw0Var) {
        com.vk.voip.ui.sessionrooms.c cVar;
        FragmentManager fragmentManager = mjw0Var.getFragmentManager();
        if (fragmentManager != null) {
            cVar = new com.vk.voip.ui.sessionrooms.b(fragmentManager);
        } else {
            com.vk.voip.ui.c.b.getClass();
            cVar = com.vk.voip.ui.c.B0;
        }
        cVar.g();
        return s3q0.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:228:0x0628, code lost:
    
        if ((r4 == com.vk.voip.ui.VoipViewModelState.CallingPeer) != false) goto L345;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x0631, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:402:0x062e, code lost:
    
        if (com.vk.voip.ui.c.z0() == false) goto L350;
     */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0529  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x06c7  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0769  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x077a  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0781  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0800  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0844  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x088d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x08bc  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x08f6  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x090a  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0917  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0922  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0911  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x08dc  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x08aa  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0861  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x077c  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x076b  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x06d5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x0945  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x04e3  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x04b7  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0388  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static s3q0 c(mjw0 mjw0Var) {
        boolean m;
        VoipViewBehaviour voipViewBehaviour;
        ImageView imageView;
        boolean z;
        TextureViewRenderer textureViewRenderer;
        zzz zzzVar;
        gb9 gb9Var;
        FrameLayout frameLayout;
        FrameDecorator j7iVar;
        ConversationVideoTrackParticipantKey conversationVideoTrackParticipantKey;
        ConversationVideoTrackParticipantKey conversationVideoTrackParticipantKey2;
        Object obj;
        int i;
        boolean z2;
        boolean z3;
        pna0 pna0Var;
        zrw.a aVar;
        qhu.b bVar;
        boolean z4;
        qhu.b bVar2;
        ViewGroup.LayoutParams layoutParams;
        boolean z5;
        com.vk.voip.ui.c cVar;
        boolean z6;
        boolean z7;
        boolean z8;
        VoipTextButton voipTextButton;
        boolean z9;
        com.vk.voip.ui.c cVar2;
        boolean s0;
        boolean z10;
        boolean z11;
        rah0 rah0Var;
        rah0 rah0Var2;
        TextStatRenderer textStatRenderer;
        TextStatRendererView textStatRendererView;
        boolean z12;
        boolean z13;
        boolean z14;
        Integer valueOf;
        Set<CallMemberId> set;
        dhw0 L;
        VoipViewBehaviour voipViewBehaviour2 = mjw0Var.x;
        ImageView imageView2 = mjw0Var.S;
        ImageView imageView3 = mjw0Var.R;
        TextView textView = mjw0Var.l;
        ze00 ze00Var = mjw0Var.T0;
        ViewGroup viewGroup = mjw0Var.A;
        k6x0 k6x0Var = mjw0Var.L0;
        FrameLayout frameLayout2 = mjw0Var.r;
        gb9 gb9Var2 = mjw0Var.u;
        FrameLayout frameLayout3 = mjw0Var.o;
        ssw sswVar = mjw0Var.J;
        com.vk.voip.ui.c cVar3 = com.vk.voip.ui.c.b;
        cVar3.getClass();
        if (com.vk.voip.ui.c.K0 != VoipViewModelState.Idle) {
            mjw0Var.y();
            if (mjw0Var.M == null) {
                mjw0Var.M = Long.valueOf(System.currentTimeMillis());
                m = false;
            } else {
                m = mjw0Var.m();
            }
            zzz zzzVar2 = mjw0Var.d;
            rct0 rct0Var = mjw0Var.Q0;
            L.A("VoipCallView", "updateVideoViews isAttached=" + mjw0Var.isAttachedToWindow());
            if (cVar3.s0()) {
                if (mjw0Var.p != null || mjw0Var.s != null) {
                    mjw0Var.q();
                }
            } else if (mjw0Var.isAttachedToWindow() && mjw0Var.getVisibility() == 0 && !com.vk.voip.ui.c.t0()) {
                if (mjw0Var.isAttachedToWindow() && mjw0Var.getVisibility() == 0 && ((mjw0Var.p == null || mjw0Var.s == null) && !com.vk.voip.ui.c.t0() && com.vk.voip.ui.c.q && !cVar3.s0())) {
                    mjw0Var.p = rct0Var.mo349createVideoViewInstance(mjw0Var.getContext());
                    if (com.vk.voip.ui.c.w0()) {
                        TextureViewRenderer textureViewRenderer2 = mjw0Var.p;
                        if (textureViewRenderer2 != null) {
                            textureViewRenderer2.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FIT);
                            textureViewRenderer2.setUseAlternateLayout(true);
                            gb9Var2.d(textureViewRenderer2);
                            voipViewBehaviour = voipViewBehaviour2;
                            obj = "VoipCallView";
                            z = m;
                            textureViewRenderer2.setFrameDecorator(new ags(new rjw0(zzzVar2, zzz.class, "currentAngle", "getCurrentAngle()F", 0)));
                        } else {
                            voipViewBehaviour = voipViewBehaviour2;
                            z = m;
                            obj = "VoipCallView";
                        }
                        TextureViewRenderer textureViewRenderer3 = mjw0Var.p;
                        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
                        layoutParams2.gravity = 17;
                        s3q0 s3q0Var = s3q0.a;
                        i = 0;
                        frameLayout3.addView(textureViewRenderer3, 0, layoutParams2);
                        imageView = imageView2;
                    } else {
                        voipViewBehaviour = voipViewBehaviour2;
                        z = m;
                        obj = "VoipCallView";
                        TextureViewRenderer textureViewRenderer4 = mjw0Var.p;
                        imageView = imageView2;
                        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2);
                        layoutParams3.gravity = 17;
                        s3q0 s3q0Var2 = s3q0.a;
                        i = 0;
                        frameLayout3.addView(textureViewRenderer4, 0, layoutParams3);
                    }
                    TextureViewRenderer mo349createVideoViewInstance = rct0Var.mo349createVideoViewInstance(mjw0Var.getContext());
                    mjw0Var.s = mo349createVideoViewInstance;
                    frameLayout2.addView(mo349createVideoViewInstance, i);
                    L.A(obj, "createRenderViewsIfNeeded");
                    gb9Var2.A = new nt8(mjw0Var);
                } else {
                    voipViewBehaviour = voipViewBehaviour2;
                    imageView = imageView2;
                    z = m;
                }
                TextureViewRenderer textureViewRenderer5 = mjw0Var.s;
                if (textureViewRenderer5 == null || (textureViewRenderer = mjw0Var.p) == null) {
                    frameLayout = frameLayout2;
                    gb9Var = gb9Var2;
                } else {
                    CallMemberId c0 = cVar3.c0();
                    if (!epx.f(mjw0Var.i, c0)) {
                        CallMemberId callMemberId = mjw0Var.i;
                        if (callMemberId != null) {
                            rct0Var.removeParticipantView(new ConversationVideoTrackParticipantKey.Builder().setParticipantId(mnh0.H(callMemberId)).setType(VideoTrackType.VIDEO).build(), textureViewRenderer);
                        }
                        mjw0Var.i = c0;
                    }
                    ConversationVideoTrackParticipantKey ownRenderViewTrackAttachKey = mjw0Var.getOwnRenderViewTrackAttachKey();
                    VideoTrackType type = ownRenderViewTrackAttachKey != null ? ownRenderViewTrackAttachKey.getType() : null;
                    ConversationVideoTrackParticipantKey conversationVideoTrackParticipantKey3 = mjw0Var.t;
                    boolean z15 = type != (conversationVideoTrackParticipantKey3 != null ? conversationVideoTrackParticipantKey3.getType() : null);
                    if (!epx.f(ownRenderViewTrackAttachKey, mjw0Var.t) && (conversationVideoTrackParticipantKey2 = mjw0Var.t) != null) {
                        rct0Var.removeParticipantView(conversationVideoTrackParticipantKey2, textureViewRenderer5);
                    }
                    boolean z16 = z15;
                    if ((ownRenderViewTrackAttachKey != null ? ownRenderViewTrackAttachKey.getType() : null) == VideoTrackType.ANIMOJI) {
                        zzzVar = zzzVar2;
                        gb9Var = gb9Var2;
                        j7iVar = new ags(new pjw0(zzzVar2, zzz.class, "currentAngle", "getCurrentAngle()F", 0));
                        frameLayout = frameLayout2;
                    } else {
                        zzzVar = zzzVar2;
                        gb9Var = gb9Var2;
                        qm60 qm60Var = new qm60(zzzVar, 1);
                        mjw0Var.P0.getClass();
                        frameLayout = frameLayout2;
                        j7iVar = new j7i(qm60Var, OKVoipEngine.f);
                    }
                    rct0Var.setParticipantView(ownRenderViewTrackAttachKey, textureViewRenderer5, j7iVar);
                    if (z16) {
                        textureViewRenderer5.setFrameDecorator(j7iVar);
                    }
                    mjw0Var.t = ownRenderViewTrackAttachKey;
                    ConversationVideoTrackParticipantKey opponentRenderViewTrackAttachKey = mjw0Var.getOpponentRenderViewTrackAttachKey();
                    if (!epx.f(opponentRenderViewTrackAttachKey, mjw0Var.q) && (conversationVideoTrackParticipantKey = mjw0Var.q) != null) {
                        rct0Var.removeParticipantView(conversationVideoTrackParticipantKey, textureViewRenderer);
                    }
                    rct0Var.setParticipantView(opponentRenderViewTrackAttachKey, textureViewRenderer, new ags(new v3t(zzzVar)));
                    mjw0Var.q = opponentRenderViewTrackAttachKey;
                }
                e8x0 e8x0Var = mjw0Var.K;
                TextView textView2 = e8x0Var.b;
                VoipViewModelState voipViewModelState = com.vk.voip.ui.c.K0;
                VoipViewModelState voipViewModelState2 = VoipViewModelState.WaitingRoom;
                z2 = voipViewModelState != voipViewModelState2;
                textView2.setVisibility(!z2 ? 0 : 8);
                e8x0Var.c.setVisibility(!z2 ? 0 : 8);
                if (z2) {
                    qj80.a(textView2, new d8x0(textView2, e8x0Var.d.c()));
                }
                mjw0Var.w();
                z3 = (n(com.vk.voip.ui.c.K0) || mjw0Var.i1) ? false : true;
                gxu gxuVar = mjw0Var.H;
                gxuVar.g = z3;
                gxuVar.i.setControlsVisible(z3);
                tla0 tla0Var = gxuVar.k;
                tla0Var.c = z3;
                pna0Var = tla0Var.d;
                if (pna0Var != null) {
                    tla0Var.a(pna0Var);
                }
                kvi0 kvi0Var = gxuVar.l;
                kvi0Var.d = z3;
                kvi0Var.c();
                kvi0 kvi0Var2 = mjw0Var.F0.h;
                kvi0Var2.d = z3;
                kvi0Var2.c();
                zrw zrwVar = mjw0Var.F;
                ViewGroup viewGroup2 = zrwVar.c;
                ImageView imageView4 = zrwVar.s;
                zrwVar.j = z3;
                if (z) {
                    zmp0.a(viewGroup2, zrwVar.h);
                }
                viewGroup2.setVisibility(!z3 ? 0 : 8);
                if (z3) {
                    boolean t = emi.t(com.vk.voip.ui.c.K0);
                    VoipViewModelState voipViewModelState3 = com.vk.voip.ui.c.K0;
                    VoipViewModelState voipViewModelState4 = VoipViewModelState.RecordingAudioMessage;
                    boolean z17 = (voipViewModelState3 == voipViewModelState4 || voipViewModelState3 == voipViewModelState2 || voipViewModelState3 == VoipViewModelState.AboutToCallPeer || ((L = cVar3.L()) != null && L.r())) ? false : true;
                    dhw0 L2 = cVar3.L();
                    int size = (L2 == null || (set = L2.h) == null) ? 0 : set.size();
                    boolean s02 = cVar3.s0();
                    if (z17 && s02) {
                        z12 = z17;
                        if (size > 1) {
                            z13 = true;
                            if (z12) {
                                z14 = z13;
                                valueOf = null;
                            } else {
                                z14 = z13;
                                valueOf = z13 ? Integer.valueOf(R.drawable.ic_viewer_users_outline_shadow_48_with_counter) : Integer.valueOf(R.drawable.vk_icon_users_outline_shadow_large_48);
                            }
                            zrw.b bVar3 = new zrw.b(valueOf, !z14 ? Integer.valueOf(size) : null);
                            imageView4.setVisibility(!z12 ? 0 : 8);
                            zrwVar.o.setVisibility(!z14 ? 0 : 8);
                            zrwVar.f.b(bVar3);
                            if (z12) {
                                boolean z18 = BuildInfo.s() || BuildInfo.t();
                                boolean w0 = com.vk.voip.ui.c.w0();
                                boolean s03 = cVar3.s0();
                                if (z18 && w0 && !s03 && !zrwVar.i) {
                                    zrwVar.i = true;
                                    bwt0.j(imageView4, new cws(zrwVar, 12));
                                }
                            }
                            VoipViewModelState voipViewModelState5 = com.vk.voip.ui.c.K0;
                            zrwVar.m = (voipViewModelState5 != voipViewModelState4 || voipViewModelState5 == voipViewModelState2 || voipViewModelState5 == VoipViewModelState.AboutToCallPeer) ? false : true;
                            zrwVar.j();
                            if (t) {
                                zrwVar.i(false);
                            } else {
                                zrwVar.i(true);
                                TextView textView3 = zrwVar.p;
                                ImageView imageView5 = zrwVar.r;
                                nmw0 V = com.vk.voip.ui.c.V();
                                dhw0 L3 = V.a.L();
                                if (L3 == null || com.vk.voip.ui.c.W().a() || L3.O || L3.r() || ((!L3.E || !com.vk.voip.ui.c.o0()) && L3.D && !com.vk.voip.ui.c.Z0 && L3.B == null)) {
                                    imageView5.setEnabled(false);
                                    imageView5.setAlpha(0.4f);
                                    textView3.setVisibility(8);
                                } else {
                                    imageView5.setEnabled(true);
                                    rdi.B(imageView5, true);
                                    dhw0 L4 = V.a.L();
                                    int i2 = L4 != null ? L4.F : 0;
                                    if (i2 > 0) {
                                        textView3.setVisibility(0);
                                        textView3.setText(uqm0.o(i2));
                                    } else {
                                        textView3.setVisibility(8);
                                    }
                                }
                                ImageView imageView6 = zrwVar.t;
                                dhw0 L5 = cVar3.L();
                                if (L5 != null ? L5.D : false) {
                                    imageView6.setVisibility(0);
                                    GroupCallViewModel.b.getClass();
                                    int i3 = GroupCallViewModel.e == GroupCallViewModel.GroupCallViewMode.GridViewMode ? R.drawable.vk_icon_grid_3_outline_shadow_large_48 : R.drawable.ic_4_square_outline;
                                    jhu P0 = com.vk.voip.ui.c.l0.b.d.P0();
                                    boolean z19 = !(P0 != null ? P0.g : true);
                                    imageView6.setEnabled(z19);
                                    rdi.B(imageView6, z19);
                                    imageView6.setImageResource(i3);
                                } else {
                                    imageView6.setVisibility(8);
                                }
                                zrwVar.w.setVisibility(!((Preference.m(0L, "voip_prefs_shared", "slider_moved") > 0L ? 1 : (Preference.m(0L, "voip_prefs_shared", "slider_moved") == 0L ? 0 : -1)) != 0) && com.vk.voip.ui.c.w0() ? 0 : 8);
                            }
                            zrwVar.q.setVisibility(com.vk.voip.ui.c.t0() ? 0 : 8);
                        }
                    } else {
                        z12 = z17;
                    }
                    z13 = false;
                    if (z12) {
                    }
                    zrw.b bVar32 = new zrw.b(valueOf, !z14 ? Integer.valueOf(size) : null);
                    imageView4.setVisibility(!z12 ? 0 : 8);
                    zrwVar.o.setVisibility(!z14 ? 0 : 8);
                    zrwVar.f.b(bVar32);
                    if (z12) {
                    }
                    VoipViewModelState voipViewModelState52 = com.vk.voip.ui.c.K0;
                    zrwVar.m = (voipViewModelState52 != voipViewModelState4 || voipViewModelState52 == voipViewModelState2 || voipViewModelState52 == VoipViewModelState.AboutToCallPeer) ? false : true;
                    zrwVar.j();
                    if (t) {
                    }
                    zrwVar.q.setVisibility(com.vk.voip.ui.c.t0() ? 0 : 8);
                }
                aVar = zrwVar.g;
                if (aVar != null) {
                    aVar.a();
                }
                mjw0Var.p();
                ft80 ft80Var = mjw0Var.G;
                ft80Var.d = z3;
                if (z3) {
                    GroupCallViewModel.b.getClass();
                    if (GroupCallViewModel.e == GroupCallViewModel.GroupCallViewMode.GridViewMode) {
                        ft80Var.c.hide();
                    }
                }
                ViewGroup viewGroup3 = (ViewGroup) sswVar.a;
                VoipViewModelState voipViewModelState6 = com.vk.voip.ui.c.K0;
                VoipViewModelState voipViewModelState7 = VoipViewModelState.ReceivingCallFromPeer;
                bwt0.p0(viewGroup3, voipViewModelState6 != voipViewModelState7);
                GroupCallGridContainerView groupCallGridContainerView = mjw0Var.e;
                boolean z20 = !mjw0Var.i1;
                com.vk.voip.ui.groupcalls.grid.a aVar2 = groupCallGridContainerView.d;
                qhu qhuVar = aVar2.J;
                bVar = qhuVar.g;
                if (bVar == null) {
                    bVar2 = qhu.b.a(bVar, null, 0, false, z20, false, false, 55);
                    z4 = z20;
                    qhuVar.b(bVar2);
                } else {
                    z4 = z20;
                    bVar2 = null;
                }
                qhuVar.g = bVar2;
                aVar2.D.a(z4);
                aVar2.v0(aVar2.F.c());
                k6x0Var.a(!mjw0Var.i1);
                ListGroupCallView listGroupCallView = mjw0Var.f;
                boolean z21 = mjw0Var.i1;
                int i4 = ListGroupCallView.t0;
                AsrOnlineView asrOnlineView = listGroupCallView.K;
                int i5 = (z21 && asrOnlineView.getVisibility() == 0) ? ListGroupCallView.s0 + i4 : (z21 || asrOnlineView.getVisibility() != 0) ? 0 : i4;
                ViewPager2 viewPager2 = listGroupCallView.C.b;
                layoutParams = viewPager2.getLayoutParams();
                if (layoutParams != null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.bottomMargin = i5;
                viewPager2.setLayoutParams(marginLayoutParams);
                viewGroup.setVisibility(!mjw0Var.i1 ? 0 : 8);
                ze00Var.d.a(new ghw0.r(!mjw0Var.i1));
                u(mjw0Var, mjw0Var.f0, com.vk.voip.ui.c.K0 == voipViewModelState7, false, 12);
                u(mjw0Var, mjw0Var.g0, com.vk.voip.ui.c.W().a(), false, 12);
                u(mjw0Var, mjw0Var.h0, !com.vk.voip.ui.c.N, false, 12);
                u(mjw0Var, mjw0Var.i0, com.vk.voip.ui.c.N, false, 12);
                boolean z22 = com.vk.voip.ui.c.W0 && com.vk.voip.ui.c.v0();
                boolean t0 = com.vk.voip.ui.c.t0();
                u(mjw0Var, mjw0Var.N, z22, false, 12);
                u(mjw0Var, mjw0Var.U, !com.vk.voip.ui.c.N, false, 12);
                u(mjw0Var, mjw0Var.V, com.vk.voip.ui.c.N, false, 12);
                if (textView != null) {
                    textView.setText(com.vk.voip.ui.c.d0());
                }
                if (textView != null) {
                    textView.setVisibility(com.vk.voip.ui.c.K0 != voipViewModelState7 ? 0 : 8);
                }
                ((TextView) sswVar.b).setText(com.vk.voip.ui.c.d0());
                ((TextView) sswVar.c).setText(cVar3.e0());
                imageView3.setImageResource(R.drawable.white_oval);
                ImageView imageView7 = imageView;
                imageView7.setImageResource(R.drawable.white_oval);
                int b2 = cn70.b(8);
                imageView3.setPadding(b2, b2, b2, b2);
                int b3 = cn70.b(8);
                imageView7.setPadding(b3, b3, b3, b3);
                ViewGroup viewGroup4 = mjw0Var.Q;
                if (!(((com.vk.voip.ui.c.H0.a && com.vk.voip.ui.c.K0 == VoipViewModelState.InCall) || cVar3.x0() || com.vk.voip.ui.c.z0() || com.vk.voip.ui.c.i0().g()) ? false : true)) {
                    VoipViewModelState voipViewModelState8 = com.vk.voip.ui.c.K0;
                    if (!(voipViewModelState8 == voipViewModelState7)) {
                    }
                }
                boolean z23 = true;
                boolean z24 = z;
                u(mjw0Var, viewGroup4, z23, z24, 8);
                if (com.vk.voip.ui.c.J0 == voipViewModelState7) {
                    if (!(com.vk.voip.ui.c.K0 == VoipViewModelState.FinishedTransient && com.vk.voip.ui.c.J0 == voipViewModelState7)) {
                        ArrayList arrayList = ze00Var.b().f.p;
                        if (!arrayList.isEmpty()) {
                            View[] viewArr = (View[]) arrayList.toArray(new View[0]);
                            View[] viewArr2 = (View[]) Arrays.copyOf(viewArr, viewArr.length);
                            ArrayList arrayList2 = new ArrayList();
                            int length = viewArr2.length;
                            int i6 = 0;
                            while (i6 < length) {
                                View view = viewArr2[i6];
                                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleX", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                                ofFloat.setDuration(150L);
                                boolean z25 = z22;
                                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "scaleY", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                                ofFloat2.setDuration(150L);
                                arrayList2.add(ofFloat);
                                arrayList2.add(ofFloat2);
                                i6++;
                                arrayList = arrayList;
                                viewArr2 = viewArr2;
                                z22 = z25;
                            }
                            z5 = z22;
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.playTogether(arrayList2);
                            animatorSet.start();
                            arrayList.clear();
                            cVar = com.vk.voip.ui.c.b;
                            if (cVar.s0()) {
                                FrameLayout frameLayout4 = frameLayout;
                                boolean z26 = cVar.y0() || cVar.x0();
                                boolean o = o();
                                if (o || z26) {
                                    if (!mjw0Var.j && z26) {
                                        mjw0Var.y.h();
                                        voipViewBehaviour.i();
                                    }
                                    z6 = true;
                                    if (o) {
                                        mjw0Var.k = true;
                                    }
                                    if (z26) {
                                        mjw0Var.j = true;
                                    }
                                } else {
                                    mjw0Var.j = false;
                                    mjw0Var.k = false;
                                    voipViewBehaviour.h();
                                    z6 = true;
                                }
                                z7 = false;
                                t(frameLayout3, (z26 || mjw0Var.j) ? z6 : false, false, z6);
                                t(mjw0Var.p, z26, false, z6);
                                t(frameLayout4, (o || mjw0Var.k) ? z6 : false, false, z6);
                            } else {
                                t(frameLayout3, false, false, true);
                                t(frameLayout, false, false, true);
                                z7 = false;
                                z6 = true;
                            }
                            u(mjw0Var, mjw0Var.D, o() ^ z6, z7, 8);
                            u(mjw0Var, mjw0Var.E, !((!cVar.y0() || cVar.x0()) ? z6 : z7), z7, 8);
                            mjw0Var.C.setVisibility(!(com.vk.voip.ui.c.K0 != VoipViewModelState.ReceivingCallFromPeer || z5 || t0) ? 0 : 8);
                            boolean z27 = mjw0Var.i1;
                            z8 = !z27;
                            if ((viewGroup.getVisibility() != 0) != z8) {
                                ArrayList arrayList3 = mjw0Var.O0;
                                ArrayList arrayList4 = new ArrayList();
                                Iterator it = arrayList3.iterator();
                                while (it.hasNext()) {
                                    Object next = it.next();
                                    if (((vgw0) next).b()) {
                                        arrayList4.add(next);
                                    }
                                }
                                if (z24) {
                                    biq biqVar = new biq();
                                    Iterator it2 = arrayList4.iterator();
                                    while (it2.hasNext()) {
                                        biqVar.addTarget(((vgw0) it2.next()).a());
                                    }
                                    biqVar.addTarget(viewGroup);
                                    biqVar.addListener(new ujw0(mjw0Var, z8));
                                    zmp0.a(mjw0Var, biqVar);
                                } else {
                                    Iterator it3 = arrayList4.iterator();
                                    while (it3.hasNext()) {
                                        ((vgw0) it3.next()).a().setVisibility(!z27 ? 0 : 8);
                                    }
                                    viewGroup.setVisibility(!z27 ? 0 : 8);
                                    k6x0Var.a(z8);
                                }
                            }
                            if (mjw0Var.j0 != null) {
                                mjw0Var.k0.onNext(mjw0Var.i1 ? new szt0(0) : new szt0(e3m.a(R.dimen.voip_primary_buttons_bottom_margin, mjw0Var.getContext()) + e3m.a(R.dimen.voip_primary_button_size, mjw0Var.getContext()) + ((int) (cn70.a() * 14.5f))));
                            }
                            mjw0Var.i();
                            u(mjw0Var, mjw0Var.l0, t0, false, 12);
                            voipTextButton = mjw0Var.m0;
                            if (voipTextButton == null) {
                                rq4.a.getClass();
                                z9 = true;
                                voipTextButton.setInactive(!(rq4.e >= rq4.c() + rq4.c));
                            } else {
                                z9 = true;
                            }
                            ImageView imageView8 = mjw0Var.p0;
                            cVar2 = com.vk.voip.ui.c.b;
                            cVar2.getClass();
                            u(mjw0Var, imageView8, com.vk.voip.ui.c.z0() ^ z9, z24, 8);
                            u(mjw0Var, mjw0Var.o0, com.vk.voip.ui.c.v ^ z9, z24, 8);
                            u(mjw0Var, mjw0Var.s0, cVar2.y0() ^ z9, z24, 8);
                            ImageView imageView9 = mjw0Var.r0;
                            s0 = cVar2.s0();
                            if (s0 != z9) {
                                GroupCallViewModel groupCallViewModel = GroupCallViewModel.b;
                                dhw0 dhw0Var = com.vk.voip.ui.c.O;
                                CallMemberId callMemberId2 = dhw0Var != null ? dhw0Var.m : null;
                                groupCallViewModel.getClass();
                                kiu b4 = GroupCallViewModel.b(callMemberId2);
                                z10 = b4 != null ? b4.a.f : false;
                            } else {
                                if (s0) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                z10 = com.vk.voip.ui.c.E;
                            }
                            u(mjw0Var, imageView9, !z10, z24, 8);
                            z11 = mjw0Var.H0;
                            rah0Var = com.vk.voip.ui.c.g;
                            if (rah0Var == null) {
                                rah0Var = null;
                            }
                            if (z11 == rah0Var.b() || mjw0Var.G0 != com.vk.voip.ui.c.t) {
                                gb9 gb9Var3 = gb9Var;
                                gb9Var3.x = !com.vk.voip.ui.c.t;
                                gb9Var3.c(false);
                                rah0Var2 = com.vk.voip.ui.c.g;
                                if (rah0Var2 == null) {
                                    rah0Var2 = null;
                                }
                                mjw0Var.H0 = rah0Var2.b();
                                mjw0Var.G0 = com.vk.voip.ui.c.t;
                            }
                            if (com.vk.voip.ui.c.K0 == VoipViewModelState.InCall && (textStatRenderer = mjw0Var.v) != null) {
                                textStatRendererView = mjw0Var.w;
                                if (textStatRendererView != null) {
                                    textStatRendererView.setVisibility(!cVar2.s0() ? 0 : 8);
                                }
                                CallMemberId a2 = voipViewBehaviour.f.a ? com.vk.voip.ui.c.r.a() : cVar2.c0();
                                textStatRenderer.setSource(a2 == null ? new ParticipantId(a2.b, false, a2.c) : null, StatSets.INSTANCE.getAll());
                            }
                            j6r j6rVar = mjw0Var.U0;
                            j6rVar.j = !mjw0Var.i1;
                            j6rVar.b(j6rVar.i);
                        }
                    }
                }
                z5 = z22;
                cVar = com.vk.voip.ui.c.b;
                if (cVar.s0()) {
                }
                u(mjw0Var, mjw0Var.D, o() ^ z6, z7, 8);
                u(mjw0Var, mjw0Var.E, !((!cVar.y0() || cVar.x0()) ? z6 : z7), z7, 8);
                mjw0Var.C.setVisibility(!(com.vk.voip.ui.c.K0 != VoipViewModelState.ReceivingCallFromPeer || z5 || t0) ? 0 : 8);
                boolean z272 = mjw0Var.i1;
                z8 = !z272;
                if ((viewGroup.getVisibility() != 0) != z8) {
                }
                if (mjw0Var.j0 != null) {
                }
                mjw0Var.i();
                u(mjw0Var, mjw0Var.l0, t0, false, 12);
                voipTextButton = mjw0Var.m0;
                if (voipTextButton == null) {
                }
                ImageView imageView82 = mjw0Var.p0;
                cVar2 = com.vk.voip.ui.c.b;
                cVar2.getClass();
                u(mjw0Var, imageView82, com.vk.voip.ui.c.z0() ^ z9, z24, 8);
                u(mjw0Var, mjw0Var.o0, com.vk.voip.ui.c.v ^ z9, z24, 8);
                u(mjw0Var, mjw0Var.s0, cVar2.y0() ^ z9, z24, 8);
                ImageView imageView92 = mjw0Var.r0;
                s0 = cVar2.s0();
                if (s0 != z9) {
                }
                u(mjw0Var, imageView92, !z10, z24, 8);
                z11 = mjw0Var.H0;
                rah0Var = com.vk.voip.ui.c.g;
                if (rah0Var == null) {
                }
                if (z11 == rah0Var.b()) {
                }
                gb9 gb9Var32 = gb9Var;
                gb9Var32.x = !com.vk.voip.ui.c.t;
                gb9Var32.c(false);
                rah0Var2 = com.vk.voip.ui.c.g;
                if (rah0Var2 == null) {
                }
                mjw0Var.H0 = rah0Var2.b();
                mjw0Var.G0 = com.vk.voip.ui.c.t;
                if (com.vk.voip.ui.c.K0 == VoipViewModelState.InCall) {
                    textStatRendererView = mjw0Var.w;
                    if (textStatRendererView != null) {
                    }
                    if (voipViewBehaviour.f.a) {
                    }
                    textStatRenderer.setSource(a2 == null ? new ParticipantId(a2.b, false, a2.c) : null, StatSets.INSTANCE.getAll());
                }
                j6r j6rVar2 = mjw0Var.U0;
                j6rVar2.j = !mjw0Var.i1;
                j6rVar2.b(j6rVar2.i);
            }
            voipViewBehaviour = voipViewBehaviour2;
            imageView = imageView2;
            frameLayout = frameLayout2;
            gb9Var = gb9Var2;
            z = m;
            e8x0 e8x0Var2 = mjw0Var.K;
            TextView textView22 = e8x0Var2.b;
            VoipViewModelState voipViewModelState9 = com.vk.voip.ui.c.K0;
            VoipViewModelState voipViewModelState22 = VoipViewModelState.WaitingRoom;
            if (voipViewModelState9 != voipViewModelState22) {
            }
            textView22.setVisibility(!z2 ? 0 : 8);
            e8x0Var2.c.setVisibility(!z2 ? 0 : 8);
            if (z2) {
            }
            mjw0Var.w();
            if (n(com.vk.voip.ui.c.K0)) {
            }
            gxu gxuVar2 = mjw0Var.H;
            gxuVar2.g = z3;
            gxuVar2.i.setControlsVisible(z3);
            tla0 tla0Var2 = gxuVar2.k;
            tla0Var2.c = z3;
            pna0Var = tla0Var2.d;
            if (pna0Var != null) {
            }
            kvi0 kvi0Var3 = gxuVar2.l;
            kvi0Var3.d = z3;
            kvi0Var3.c();
            kvi0 kvi0Var22 = mjw0Var.F0.h;
            kvi0Var22.d = z3;
            kvi0Var22.c();
            zrw zrwVar2 = mjw0Var.F;
            ViewGroup viewGroup22 = zrwVar2.c;
            ImageView imageView42 = zrwVar2.s;
            zrwVar2.j = z3;
            if (z) {
            }
            viewGroup22.setVisibility(!z3 ? 0 : 8);
            if (z3) {
            }
            aVar = zrwVar2.g;
            if (aVar != null) {
            }
            mjw0Var.p();
            ft80 ft80Var2 = mjw0Var.G;
            ft80Var2.d = z3;
            if (z3) {
            }
            ViewGroup viewGroup32 = (ViewGroup) sswVar.a;
            VoipViewModelState voipViewModelState62 = com.vk.voip.ui.c.K0;
            VoipViewModelState voipViewModelState72 = VoipViewModelState.ReceivingCallFromPeer;
            bwt0.p0(viewGroup32, voipViewModelState62 != voipViewModelState72);
            GroupCallGridContainerView groupCallGridContainerView2 = mjw0Var.e;
            boolean z202 = !mjw0Var.i1;
            com.vk.voip.ui.groupcalls.grid.a aVar22 = groupCallGridContainerView2.d;
            qhu qhuVar2 = aVar22.J;
            bVar = qhuVar2.g;
            if (bVar == null) {
            }
            qhuVar2.g = bVar2;
            aVar22.D.a(z4);
            aVar22.v0(aVar22.F.c());
            k6x0Var.a(!mjw0Var.i1);
            ListGroupCallView listGroupCallView2 = mjw0Var.f;
            boolean z212 = mjw0Var.i1;
            int i42 = ListGroupCallView.t0;
            AsrOnlineView asrOnlineView2 = listGroupCallView2.K;
            if (z212) {
            }
            ViewPager2 viewPager22 = listGroupCallView2.C.b;
            layoutParams = viewPager22.getLayoutParams();
            if (layoutParams != null) {
            }
        }
        return s3q0.a;
    }

    public static cb9 d(mjw0 mjw0Var) {
        com.vk.voip.ui.c.b.getClass();
        return new cb9(com.vk.voip.ui.c.k0, mjw0Var.getFragmentManager());
    }

    public static s3q0 e(mjw0 mjw0Var) {
        com.vk.voip.ui.sessionrooms.c cVar;
        FragmentManager fragmentManager = mjw0Var.getFragmentManager();
        if (fragmentManager != null) {
            cVar = new com.vk.voip.ui.sessionrooms.b(fragmentManager);
        } else {
            com.vk.voip.ui.c.b.getClass();
            cVar = com.vk.voip.ui.c.B0;
        }
        cVar.e(null);
        return s3q0.a;
    }

    private final cb9 getCallVpnSnackbarDelegate() {
        return (cb9) this.J0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FragmentManager getFragmentManager() {
        Activity h = e3m.h(getContext());
        FragmentActivity fragmentActivity = h instanceof FragmentActivity ? (FragmentActivity) h : null;
        if (fragmentActivity != null) {
            return fragmentActivity.getSupportFragmentManager();
        }
        return null;
    }

    private final float getMinimizedVideoBottomOffset() {
        return this.i1 ? m1 : o1;
    }

    private final float getMinimizedVideoTopOffset() {
        float f2;
        int i;
        if (this.i1) {
            f2 = m1;
            i = this.P;
        } else {
            f2 = n1;
            i = this.P;
        }
        return f2 + i;
    }

    private final ConversationVideoTrackParticipantKey getOpponentRenderViewTrackAttachKey() {
        com.vk.voip.ui.c cVar = com.vk.voip.ui.c.b;
        VideoTrackType videoTrackType = (!cVar.x0() || cVar.y0()) ? VideoTrackType.VIDEO : VideoTrackType.ANIMOJI;
        CallMemberId c0 = cVar.c0();
        ParticipantId H = c0 != null ? mnh0.H(c0) : null;
        if (H != null) {
            return new ConversationVideoTrackParticipantKey.Builder().setParticipantId(H).setType(videoTrackType).build();
        }
        return null;
    }

    private final ConversationVideoTrackParticipantKey getOwnRenderViewTrackAttachKey() {
        com.vk.voip.ui.c.b.getClass();
        boolean g2 = com.vk.voip.ui.c.i0().g();
        rct0 rct0Var = this.Q0;
        return (!g2 || com.vk.voip.ui.c.z0()) ? rct0Var.getOwnVideoTrack() : rct0Var.a();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final ltw0 getP2pLayoutUpdater() {
        return (ltw0) this.z.getValue();
    }

    public static Set k(ParticipantStatesManager participantStatesManager) {
        Set<ParticipantId> raisedHandIds;
        if (participantStatesManager != null && (raisedHandIds = participantStatesManager.getRaisedHandIds()) != null) {
            Set<ParticipantId> set = raisedHandIds;
            ArrayList arrayList = new ArrayList(c5g.u(set, 10));
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                arrayList.add(mnh0.E((ParticipantId) it.next()));
            }
            Set S0 = j5g.S0(arrayList);
            if (S0 != null) {
                return S0;
            }
        }
        return EmptySet.b;
    }

    public static boolean n(VoipViewModelState voipViewModelState) {
        return voipViewModelState == VoipViewModelState.AboutToCallPeer || voipViewModelState == VoipViewModelState.InCall || voipViewModelState == VoipViewModelState.Connecting || voipViewModelState == VoipViewModelState.CallingPeer || voipViewModelState == VoipViewModelState.WaitingRoom || voipViewModelState == VoipViewModelState.RecordingAudioMessage;
    }

    public static boolean o() {
        com.vk.voip.ui.c.b.getClass();
        if (com.vk.voip.ui.c.z0()) {
            return true;
        }
        return (!com.vk.voip.ui.c.i0().g() || com.vk.voip.ui.c.K0 == VoipViewModelState.ReceivingCallFromPeer || com.vk.voip.ui.c.K0 == VoipViewModelState.CallingPeer) ? false : true;
    }

    public static void r(boolean z) {
        com.vk.voip.ui.c cVar = com.vk.voip.ui.c.b;
        zqk0 g0 = cVar.g0();
        if (g0 == null) {
            return;
        }
        com.vk.voip.ui.c.i1(cVar, zqk0.a(g0, null, z, 3670015), new VoipCallSource(MobileOfficialAppsCallsStat$TypeVoipCallItem.Source.FROM_BUSY_STATE, MobileOfficialAppsCoreNavStat$EventScreen.VOIP_CALL));
    }

    public static void t(View view, boolean z, boolean z2, boolean z3) {
        if (view != null) {
            int i = 8;
            if (!z2) {
                if (z) {
                    i = 0;
                } else if (z3) {
                    i = 4;
                }
                view.setVisibility(i);
                return;
            }
            if (z && !bwt0.K(view)) {
                d3m.c(view, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
            if (!z && z3) {
                qcy<Object>[] qcyVarArr = bwt0.a;
                if (view.getVisibility() != 4) {
                    d3m.e(view, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
                }
            }
            if (z || z3 || view.getVisibility() == 8) {
                return;
            }
            d3m.e(view, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : true);
        }
    }

    public static /* synthetic */ void u(mjw0 mjw0Var, View view, boolean z, boolean z2, int i) {
        if ((i & 4) != 0) {
            z2 = false;
        }
        mjw0Var.getClass();
        t(view, z, z2, false);
    }

    @Override // xsna.arj
    public final void a() {
        l();
    }

    public final void f(boolean z) {
        gvw0 gvw0Var = this.b;
        if (gvw0Var.e()) {
            com.vk.voip.ui.c.b.j(z);
        } else if (z) {
            gvw0Var.g(new ufm0(11), new c(0, com.vk.voip.ui.c.b, com.vk.voip.ui.c.class, "acceptIncoming", "acceptIncoming(Z)V", 0));
        } else {
            com.vk.voip.ui.c cVar = com.vk.voip.ui.c.b;
            gvw0Var.i(new d(0, cVar, com.vk.voip.ui.c.class, "acceptIncoming", "acceptIncoming(Z)V", 0), new e(0, cVar, com.vk.voip.ui.c.class, "acceptIncoming", "acceptIncoming(Z)V", 0));
        }
    }

    @Override // android.view.View
    @ozl
    public final boolean fitSystemWindows(Rect rect) {
        View view;
        if (rect == null) {
            return true;
        }
        this.P = rect.top;
        h();
        float minimizedVideoTopOffset = getMinimizedVideoTopOffset();
        VoipViewBehaviour voipViewBehaviour = this.x;
        voipViewBehaviour.g = minimizedVideoTopOffset;
        voipViewBehaviour.i = getMinimizedVideoBottomOffset();
        float minimizedVideoTopOffset2 = getMinimizedVideoTopOffset();
        VoipViewBehaviour voipViewBehaviour2 = this.y;
        voipViewBehaviour2.g = minimizedVideoTopOffset2;
        voipViewBehaviour2.i = getMinimizedVideoBottomOffset();
        voipViewBehaviour.a();
        voipViewBehaviour2.a();
        pkw0 pkw0Var = this.t0;
        if (pkw0Var != null && (view = pkw0Var.a) != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.height = rect.top;
            view.setLayoutParams(layoutParams);
        }
        qiu qiuVar = this.h;
        qiuVar.getClass();
        qiuVar.b = rect.top;
        qiuVar.b();
        return false;
    }

    @Override // xsna.tmg0
    public List<View> getAnimatedViewsToRotate() {
        return this.V0;
    }

    @Override // com.vk.voip.ui.groupcalls.ControlsBoundsProvider
    public int getBottomOffset() {
        return this.T0.b().getBottomOffset$ui_release();
    }

    public final boolean getControlsAreHidden() {
        return this.i1;
    }

    public final boolean getControlsAreLocked() {
        return this.h1;
    }

    public final izs<izs<? super Boolean, s3q0>, s3q0> getEnsureMasksPermissionsCallback() {
        return this.f1;
    }

    public final gkw0 getFeature$ui_release() {
        return this.a1;
    }

    public final gzs<s3q0> getFinishCallCallback() {
        return this.e1;
    }

    public final boolean getHasListRecycler$ui_release() {
        return this.b1;
    }

    public ControlsBoundsProvider.Gravity getHorizontalGravity() {
        return ControlsBoundsProvider.Gravity.LEFT;
    }

    public final long getLastTimeChangedControlsRelatedState() {
        return this.g1;
    }

    public final izs<Long, s3q0> getOpenChatCallback() {
        return this.d1;
    }

    public final gzs<s3q0> getPipCallback() {
        return this.c1;
    }

    @Override // com.vk.voip.ui.groupcalls.ControlsBoundsProvider
    public int getTopOffset() {
        int n = awt0.n(this.F.c) + this.h.a();
        gxu gxuVar = this.H;
        int i = 0;
        int n2 = n + ((!gxuVar.g || gxuVar.h.isHorizontal()) ? 0 : awt0.n(gxuVar.f));
        mkw0 mkw0Var = this.u0;
        int n3 = n2 + (!mkw0Var.e.isHorizontal() ? awt0.n(mkw0Var.c) : 0);
        if (this.d.isHorizontal() && getHorizontalGravity() == ControlsBoundsProvider.Gravity.LEFT) {
            i = p1;
        }
        return n3 + i;
    }

    @Override // xsna.tmg0
    public List<View> getViewsToRotate() {
        return this.Z0;
    }

    public final void h() {
        Float valueOf = Float.valueOf(1.0f);
        float translationY = (((this.F.c.getTranslationY() + this.O) + this.P) - (iah0.f().heightPixels / 2)) + (cn70.b(260) / 2) + cn70.b(11);
        Float valueOf2 = Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        if (translationY > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            sdw0.a(this.Q, valueOf2, Float.valueOf(translationY), valueOf, valueOf, valueOf2, m());
        }
    }

    public final void i() {
        FragmentManager supportFragmentManager;
        com.vk.voip.ui.c.b.getClass();
        if (com.vk.voip.ui.c.K0 == VoipViewModelState.InCall && com.vk.voip.ui.c.z0()) {
            long currentTimeMillis = System.currentTimeMillis() - Math.max(this.g1, Math.max(com.vk.voip.ui.c.w, com.vk.voip.ui.c.I0));
            if (currentTimeMillis < 3000) {
                ov ovVar = this.N0;
                removeCallbacks(ovVar);
                postDelayed(ovVar, 3000 - currentTimeMillis);
                return;
            }
            Activity c2 = g2u0.c(this);
            FragmentActivity fragmentActivity = c2 instanceof FragmentActivity ? (FragmentActivity) c2 : null;
            if (fragmentActivity == null || (supportFragmentManager = fragmentActivity.getSupportFragmentManager()) == null) {
                return;
            }
            List<Fragment> f2 = supportFragmentManager.c.f();
            if (!(f2 instanceof Collection) || !f2.isEmpty()) {
                Iterator<T> it = f2.iterator();
                while (it.hasNext()) {
                    if (((Fragment) it.next()).isVisible()) {
                        return;
                    }
                }
            }
            setControlsAreHidden(true);
        }
    }

    public final Size j(View view, VoipViewBehaviour voipViewBehaviour, boolean z) {
        Pair pair = z ? new Pair(Integer.valueOf(getWidth()), Integer.valueOf(getHeight())) : new Pair(Integer.valueOf(view.getWidth()), Integer.valueOf(view.getHeight()));
        int intValue = ((Number) pair.d()).intValue();
        int intValue2 = ((Number) pair.g()).intValue();
        boolean z2 = voipViewBehaviour.f.a;
        zzz zzzVar = this.d;
        if (!z2) {
            return zzzVar.isHorizontal() ? new Size(intValue2, intValue) : new Size(intValue, intValue2);
        }
        float g2 = voipViewBehaviour.g();
        int i = (int) (intValue * g2);
        int i2 = (int) (intValue2 * g2);
        return z ? zzzVar.isHorizontal() ? new Size(Math.max(i, i2), Math.min(i, i2)) : new Size(Math.min(i, i2), Math.max(i, i2)) : new Size(i, i2);
    }

    public final void l() {
        setControlsAreHidden(!this.i1);
    }

    public final boolean m() {
        Long l = this.M;
        if (l == null) {
            return false;
        }
        return System.currentTimeMillis() > l.longValue() + l1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v30, types: [ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager$Listener, xsna.hjw0] */
    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        SessionRoomsObserver sessionRoomsObserver;
        com.vk.voip.ui.c cVar;
        b.a aVar;
        a.q qVar;
        io.reactivex.rxjava3.disposables.c subscribe;
        final mjw0 mjw0Var = this;
        L.A("VoipCallView", "onAttachedToWindow");
        super.onAttachedToWindow();
        com.vk.voip.ui.c cVar2 = com.vk.voip.ui.c.b;
        cVar2.getClass();
        if (((Boolean) com.vk.voip.ui.c.k0().b.invoke()).booleanValue()) {
            mjw0Var.L0.b(mjw0Var);
        }
        ne00 ne00Var = mjw0Var.g;
        ne00Var.getClass();
        gkw0 gkw0Var = mjw0Var.a1;
        pa9 pa9Var = gkw0Var.e;
        SessionRoomsObserver sessionRoomsObserver2 = gkw0Var.b;
        i9d0 i9d0Var = gkw0Var.a;
        pa9Var.b.add(ne00Var);
        ze00 ze00Var = mjw0Var.T0;
        ze00Var.getClass();
        GroupCallViewModel.b.getClass();
        io.reactivex.rxjava3.internal.operators.observable.y i = GroupCallViewModel.i();
        a.q qVar2 = io.reactivex.rxjava3.internal.functions.a.a;
        b.a aVar2 = io.reactivex.rxjava3.internal.functions.b.a;
        io.reactivex.rxjava3.internal.operators.observable.y yVar = new io.reactivex.rxjava3.internal.operators.observable.y(i, qVar2, aVar2);
        asu0 asu0Var = asu0.a;
        io.reactivex.rxjava3.internal.operators.observable.m1 a0 = yVar.a0(asu0Var.d());
        b0y b0yVar = new b0y(new af00(1, ze00Var, ze00.class, "handleCallViewMode", "handleCallViewMode(Lcom/vk/voip/ui/groupcalls/GroupCallViewModel$GroupCallViewMode;)V", 0), 2);
        io.reactivex.rxjava3.internal.operators.observable.m1 a02 = a0.a0(asu0Var.d());
        L l = L.a;
        gkw0Var.a(a02.subscribe(b0yVar, new lw30(new lp1(l, 12), 22)));
        t70 t70Var = ze00Var.h;
        z89 z89Var = t70Var instanceof z89 ? (z89) t70Var : null;
        if (z89Var != null) {
            io.reactivex.rxjava3.internal.operators.observable.y yVar2 = new io.reactivex.rxjava3.internal.operators.observable.y(i9d0Var.a(), qVar2, aVar2);
            xn xnVar = new xn(new cj1(6), 4);
            a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
            a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
            z89 z89Var2 = z89Var;
            i9d0Var.j.b(io.reactivex.rxjava3.kotlin.c.f(2, yVar2.E(xnVar, lVar, kVar, kVar).v0(50L, TimeUnit.MILLISECONDS).E(new t00(new md(10), 5), lVar, kVar, kVar).a0(asu0Var.d()), null, new pl2(4), new y89(1, z89Var, z89.class, "updateButtonsState", "updateButtonsState(Lcom/vk/voip/ui/call_view/buttons/PrimaryButtonsFeatureState;)V", 0, 0)));
            z89Var2.e = i9d0Var;
            z89Var2.d.j(gkw0Var.d);
        }
        h69 h69Var = ze00Var.l;
        if (h69Var != null) {
            uuq uuqVar = new uuq((l7s) ze00Var.j.c, (FragmentManager) ze00Var.k.invoke(), gkw0Var.a, com.vk.voip.ui.c.X, new td8(ze00Var, 3));
            io.reactivex.rxjava3.disposables.b bVar = h69Var.f;
            bVar.e();
            lcx0 lcx0Var = uuqVar.a;
            lcx0Var.getClass();
            io.reactivex.rxjava3.internal.operators.observable.j1 U = new xbx0(com.vk.voip.ui.c.k0()).a().U(new a0m0(new fvq0(lcx0Var, 22), 12));
            b6r b6rVar = uuqVar.b;
            sessionRoomsObserver = sessionRoomsObserver2;
            io.reactivex.rxjava3.internal.operators.observable.j1 U2 = new io.reactivex.rxjava3.internal.operators.observable.y(b6rVar.c.a().U(new nm3(new x90(19), 12)), qVar2, aVar2).U(new op0(new bjk(b6rVar, 10), 15));
            q8w0 q8w0Var = uuqVar.c;
            q8w0Var.getClass();
            io.reactivex.rxjava3.internal.operators.mixed.a h = com.vk.voip.ui.c.i0().h();
            r5x0 i0 = com.vk.voip.ui.c.i0();
            cVar = cVar2;
            io.reactivex.rxjava3.core.q m = io.reactivex.rxjava3.core.q.m(h, a201.b().b().a().d(new io.reactivex.rxjava3.internal.operators.observable.y(i0.d.b().U(new p7(new com.vk.im.engine.internal.api_commands.messages.a(i0, 9), 7)), qVar2, aVar2)), new n8c0(new l71(q8w0Var, 10), 17));
            bj50 bj50Var = new bj50(new m0m0(9), 20);
            m.getClass();
            io.reactivex.rxjava3.internal.operators.observable.p1 p1Var = new io.reactivex.rxjava3.internal.operators.observable.p1(m, bj50Var);
            hot hotVar = uuqVar.d;
            hotVar.getClass();
            wot Z = com.vk.voip.ui.c.Z();
            io.reactivex.rxjava3.core.q T = !((Boolean) Z.c.invoke()).booleanValue() ? io.reactivex.rxjava3.core.q.T(Boolean.FALSE) : io.reactivex.rxjava3.core.q.m(Z.e.a(), Z.b.g(), new r490());
            T.getClass();
            int i2 = 24;
            io.reactivex.rxjava3.core.t L = new io.reactivex.rxjava3.internal.operators.observable.y(T, qVar2, aVar2).L(new pj4(new wje(hotVar, i2), i2), false);
            av3 av3Var = uuqVar.e;
            av3Var.getClass();
            io.reactivex.rxjava3.core.q b2 = com.vk.voip.ui.c.D0.b.b();
            o4x0 G = com.vk.voip.ui.c.G();
            G.getClass();
            uvs0 uvs0Var = new uvs0(G, 9);
            io.reactivex.rxjava3.subjects.f<Object> fVar = ysg0.b.a;
            io.reactivex.rxjava3.internal.operators.observable.n0 n0Var = new io.reactivex.rxjava3.internal.operators.observable.n0(11);
            fVar.getClass();
            io.reactivex.rxjava3.core.q o0 = new io.reactivex.rxjava3.internal.operators.observable.i0(fVar, n0Var).U(new sj4(uvs0Var, 3)).o0(new io.reactivex.rxjava3.internal.operators.single.v(new ota(uvs0Var, 0)));
            o0.getClass();
            io.reactivex.rxjava3.core.q m2 = io.reactivex.rxjava3.core.q.m(b2, new io.reactivex.rxjava3.internal.operators.observable.y(o0, qVar2, aVar2), new ai3(new zu3(av3Var, 0), 1));
            com.vk.movika.sdk.base.ui.p0 p0Var = new com.vk.movika.sdk.base.ui.p0(new xx0(2), 2);
            m2.getClass();
            io.reactivex.rxjava3.core.q k = io.reactivex.rxjava3.core.q.k(U, U2, p1Var, L, new io.reactivex.rxjava3.internal.operators.observable.p1(m2, p0Var), new ux0(new wai(1), 26));
            r11 r11Var = new r11(new tuq(0), 14);
            k.getClass();
            bVar.b(new io.reactivex.rxjava3.internal.operators.observable.p1(k, r11Var).U(new com.vk.movika.sdk.base.ui.p0(new com(4), 21)).a0(asu0Var.d()).subscribe(new tf1(new tm0(h69Var, 16), 5)));
            bVar.b(h69Var.g.subscribe(new um0(new jy(uuqVar, 17), 7)));
        } else {
            sessionRoomsObserver = sessionRoomsObserver2;
            cVar = cVar2;
        }
        ze00Var.c.e = new ym1(gkw0Var.e, 6);
        zrw zrwVar = mjw0Var.F;
        zrwVar.getClass();
        gkw0Var.a(new io.reactivex.rxjava3.internal.operators.observable.y(sessionRoomsObserver.b(), qVar2, aVar2).subscribe(new m5(new d9j(zrwVar, 19), 25)));
        kkw0 kkw0Var = mjw0Var.F0;
        kkw0Var.getClass();
        io.reactivex.rxjava3.internal.operators.observable.y yVar3 = new io.reactivex.rxjava3.internal.operators.observable.y(sessionRoomsObserver.b().U(new t3j0(new t6c0(22), 8)), qVar2, aVar2);
        io.reactivex.rxjava3.subjects.d<Float> dVar = kkw0Var.i;
        dVar.getClass();
        gkw0Var.a(io.reactivex.rxjava3.core.q.m(yVar3, new io.reactivex.rxjava3.internal.operators.observable.y(dVar, qVar2, aVar2), new x310(new cf3(8), 24)).a0(asu0Var.d()).subscribe(new c7q0(new c3k0(kkw0Var, 20), 7)));
        gkw0Var.a(sessionRoomsObserver.a().a0(asu0Var.d()).subscribe(new qgs0(new b3m0(kkw0Var, 23), 6)));
        int i3 = 25;
        gkw0Var.a(io.reactivex.rxjava3.core.q.m(sessionRoomsObserver.h(), new io.reactivex.rxjava3.internal.operators.observable.y(dVar, qVar2, aVar2), new qat0(new d69((byte) 0, 10), 4)).a0(asu0Var.d()).subscribe(new cp50(new dso0(kkw0Var, 23), i3)));
        gkw0Var.a(new io.reactivex.rxjava3.internal.operators.observable.i0(gkw0Var.c.a(), new yzt(new iiu0(5), i3)).U(new pi40(new jyq0(10), 22)).a0(asu0Var.d()).subscribe(new qtq0(new kyq0(mjw0Var, 12), 7), new lw30(new lp1(l, 12), 22)));
        zzz zzzVar = mjw0Var.d;
        zzzVar.d(mjw0Var);
        zzzVar.d(zrwVar);
        gxu gxuVar = mjw0Var.H;
        zzzVar.d(gxuVar);
        zzzVar.d(ze00Var);
        zzzVar.d(mjw0Var.G);
        mkw0 mkw0Var = mjw0Var.u0;
        zzzVar.d(mkw0Var);
        zzzVar.d(mjw0Var.K);
        zzzVar.d(mjw0Var.I);
        zzzVar.d(mjw0Var.U0);
        zzzVar.d(kkw0Var);
        g3m g3mVar = mjw0Var.j1;
        g3mVar.getClass();
        g3mVar.f.b(io.reactivex.rxjava3.kotlin.c.f(2, new io.reactivex.rxjava3.internal.operators.observable.y(GroupCallViewModel.i(), qVar2, aVar2), null, new n99(l, 3), new iz0(g3mVar, 22)));
        ListGroupCallView listGroupCallView = g3mVar.e;
        g3m.b bVar2 = g3mVar.i;
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) listGroupCallView.t.b;
        if (!copyOnWriteArrayList.contains(bVar2)) {
            copyOnWriteArrayList.add(bVar2);
            bVar2.b();
        }
        CopyOnWriteArrayList<qiu.a> copyOnWriteArrayList2 = g3mVar.c.a;
        if (!copyOnWriteArrayList2.contains(bVar2)) {
            copyOnWriteArrayList2.add(bVar2);
            bVar2.c();
        }
        g3mVar.b.g = bVar2;
        g3mVar.a.d(bVar2);
        io.reactivex.rxjava3.disposables.b bVar3 = mjw0Var.L;
        bVar3.e();
        ysg0<Object> ysg0Var = ysg0.b;
        io.reactivex.rxjava3.subjects.f<Object> fVar2 = ysg0Var.a;
        m2o0 m2o0Var = new m2o0(4);
        fVar2.getClass();
        bVar3.b(new io.reactivex.rxjava3.internal.operators.observable.i0(fVar2, m2o0Var).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new wvq0(mjw0Var, 12), new xvr0(new g2h0(15), 5)));
        ihu ihuVar = com.vk.voip.ui.c.l0;
        bVar3.b(io.reactivex.rxjava3.kotlin.c.f(3, ihuVar.c.a0(asu0Var.d()), null, null, new emh0(mjw0Var, 26)));
        bVar3.b(ihuVar.a().a0(asu0Var.d()).subscribe(new xvq0(new z8l0(mjw0Var, 17), 11)));
        bVar3.b(com.vk.voip.ui.c.u.e.a0(asu0Var.d()).b0(et80.class).subscribe(new v4r0(new ixu0(mjw0Var, 5), 5)));
        yot yotVar = com.vk.voip.ui.c.Z().g;
        io.reactivex.rxjava3.subjects.f<s3q0> fVar3 = yotVar.f;
        su9 su9Var = yotVar.d;
        io.reactivex.rxjava3.core.t w = ((lrt) su9Var.b).b().l(new vj0(new wcg(su9Var, 19), 23)).w();
        com.vk.movika.sdk.base.ui.j jVar = new com.vk.movika.sdk.base.ui.j(new dmi((byte) 0, 2), 17);
        fVar3.getClass();
        bVar3.b(io.reactivex.rxjava3.core.q.I0(fVar3, w, jVar).a0(asu0Var.d()).subscribe(new d8u0(new l9v0(mjw0Var, 4), 5)));
        cb9 callVpnSnackbarDelegate = mjw0Var.getCallVpnSnackbarDelegate();
        io.reactivex.rxjava3.core.q m3 = io.reactivex.rxjava3.core.q.m(callVpnSnackbarDelegate.a, callVpnSnackbarDelegate.d, new en(7, new bb9(0)));
        int i4 = 7;
        y34 y34Var = new y34(new com.vk.newsfeed.posting.impl.presentation.base.fragment.a(callVpnSnackbarDelegate, 11), i4);
        m3.getClass();
        bVar3.b(io.reactivex.rxjava3.kotlin.c.h(new io.reactivex.rxjava3.internal.operators.observable.i0(new io.reactivex.rxjava3.internal.operators.observable.r(m3, y34Var), new com.vk.movika.sdk.base.flow.binding.c(new k9(callVpnSnackbarDelegate, 17), i4)).U(new ed(new w5(callVpnSnackbarDelegate, 11), 6)).K().m(asu0Var.d()), null, new tzq0(mjw0Var, 9), 1));
        r4x0 I = com.vk.voip.ui.c.I();
        I.getClass();
        io.reactivex.rxjava3.subjects.d N0 = io.reactivex.rxjava3.subjects.d.N0();
        bVar3.b(new io.reactivex.rxjava3.internal.operators.observable.i0(I.g.a(false, new tfm0(I, 28)), new pi40(new jyq0(13), 24)).U(new tuz(new weq0(7), 25)).subscribe(new rt10(new kyq0(N0, 15), 26)));
        io.reactivex.rxjava3.internal.operators.observable.m1 a03 = ysg0Var.a.b0(gf8.a.class).U(new ie40(new q4x0(0, N0, I), 25)).a0(asu0Var.d());
        com.vk.voip.ui.hint.a aVar3 = mjw0Var.W;
        bVar3.b(a03.subscribe(new xj50(new f(1, aVar3, com.vk.voip.ui.hint.a.class, "onBroadcastFinished", "onBroadcastFinished(Lcom/vk/voip/dto/BroadcastFinishInfo;)V", 0), 26)));
        bVar3.b(new io.reactivex.rxjava3.internal.operators.observable.y(mjw0Var.x0.c().a0(asu0Var.d()).U(new tj60(new yaq0(mjw0Var, 7), 23)), qVar2, aVar2).subscribe(new bpt0(new r0r0(mjw0Var, 18), 4)));
        hg1.e(bVar3, com.vk.voip.ui.c.x.a0(asu0Var.d()).subscribe(new cl30(new ujm0(mjw0Var, 19), 22)));
        hg1.e(bVar3, com.vk.voip.ui.c.Y.f.a0(asu0Var.d()).subscribe(new nvm0(new gyo0(mjw0Var, 20), 13)));
        hg1.e(bVar3, com.vk.voip.ui.c.y.a0(asu0Var.d()).subscribe(new h2t0(new svk0(mjw0Var, 21), 2)));
        hg1.e(bVar3, com.vk.voip.ui.c.g0.a0(asu0Var.d()).subscribe(new vom0(new g(1, mjw0Var.S0, f69.class, "onNavigationEvent", "onNavigationEvent(Lcom/vk/voip/ui/events/navigation/NavigationEvent;)V", 0), 8)));
        mjw0Var.s();
        ?? r1 = new ParticipantStatesManager.Listener() { // from class: xsna.hjw0
            @Override // ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager.Listener
            public final void onParticipantStateChanged(ParticipantStatesManager participantStatesManager, ParticipantStatesManager.StateChangedEvent stateChangedEvent) {
                com.vk.voip.ui.hint.a aVar4 = mjw0.this.W;
                Set k2 = mjw0.k(participantStatesManager);
                HashSet hashSet = aVar4.k;
                aVar4.k = p4g.d(k2);
                a.EnumC2056a enumC2056a = a.EnumC2056a.HandRaised;
                if (enumC2056a.h() < aVar4.a()) {
                    return;
                }
                Set g2 = izi0.g(k2, hashSet);
                aVar4.b.getClass();
                Set<CallMemberId> g3 = izi0.g(g2, j5g.S0(e43.m(com.vk.voip.ui.c.r.a())));
                if (aVar4.i != enumC2056a) {
                    aVar4.k(g3);
                } else {
                    aVar4.k(izi0.j(izi0.g(aVar4.l, izi0.g(aVar4.l, k2)), g3));
                }
            }
        };
        OKVoipEngine.b.getClass();
        ulp ulpVar = OKVoipEngine.k;
        ulpVar.g(r1);
        mjw0Var.a0 = r1;
        njw0 njw0Var = new njw0(mjw0Var);
        OKVoipEngine.r.add(njw0Var);
        mjw0Var.b0 = njw0Var;
        if (GroupCallViewModel.r.e != null) {
            GroupCallViewModel.p(GroupCallViewModel.GroupCallViewMode.MainSpeakerAndThumbsViewMode);
        } else {
            com.vk.voip.ui.c.D0();
        }
        ojw0 ojw0Var = new ojw0(mjw0Var);
        OKVoipEngine.s.add(ojw0Var);
        mjw0Var.c0 = ojw0Var;
        lsw0 lsw0Var = new lsw0(aVar3, i9d0Var);
        ulpVar.o.a.add(lsw0Var);
        mjw0Var.d0 = lsw0Var;
        mkw0Var.a(true);
        mjw0Var.v0.a(true);
        sg8 sg8Var = mjw0Var.y0;
        if (sg8Var != null) {
            sg8Var.a(true);
        }
        mjw0Var.w0.a(true);
        akw0 akw0Var = mjw0Var.z0;
        if (akw0Var != null) {
            akw0Var.b(true);
        }
        dkw0 dkw0Var = mjw0Var.A0;
        if (dkw0Var != null) {
            dkw0Var.b(true);
        }
        zjw0 zjw0Var = mjw0Var.B0;
        if (zjw0Var != null) {
            zjw0Var.b(true);
        }
        jkw0 jkw0Var = mjw0Var.E0;
        if (jkw0Var != null) {
            jkw0Var.b(true);
        }
        vjw0 vjw0Var = mjw0Var.D0;
        if (vjw0Var != null) {
            vjw0Var.a(true);
        }
        nlk.b.getClass();
        nlk.f.add(mjw0Var.K0);
        cbv cbvVar = mjw0Var.j0;
        if (cbvVar != null) {
            nav navVar = com.vk.voip.ui.c.S;
            nav navVar2 = navVar != null ? navVar : null;
            aVar = aVar2;
            qjw0 qjw0Var = new qjw0(1, mjw0Var, mjw0.class, "onHolidayInteractionViewModeChanged", "onHolidayInteractionViewModeChanged(Lcom/vk/voip/ui/holiday_interaction/view/HolidayInteractionView$ViewMode;)V", 0);
            qVar = qVar2;
            mjw0Var = this;
            pba pbaVar = new pba(1, mjw0Var, mjw0.class, "onHolidayInteractionNotification", "onHolidayInteractionNotification(Lcom/vk/voip/ui/holiday_interaction/feature/HolidayInteractionFeatureNotification;)V", 0, 10);
            navVar2.getClass();
            io.reactivex.rxjava3.disposables.b bVar4 = new io.reactivex.rxjava3.disposables.b();
            qav qavVar = navVar2.a;
            io.reactivex.rxjava3.subjects.d<vav> dVar2 = qavVar.c;
            dVar2.getClass();
            io.reactivex.rxjava3.internal.operators.observable.y yVar4 = new io.reactivex.rxjava3.internal.operators.observable.y(dVar2, qVar, aVar);
            io.reactivex.rxjava3.subjects.d<szt0> dVar3 = mjw0Var.k0;
            dVar3.getClass();
            io.reactivex.rxjava3.core.q m4 = io.reactivex.rxjava3.core.q.m(yVar4, new io.reactivex.rxjava3.internal.operators.observable.y(dVar3, qVar, aVar), new q6x());
            m4.getClass();
            bVar4.b(new io.reactivex.rxjava3.internal.operators.observable.y(m4, qVar, aVar).a0(asu0Var.d()).subscribe(new defpackage.x(new jnb(cbvVar, 7), 28)));
            int i5 = 0;
            bVar4.b(cbvVar.p.U(new x34(new kf8(fvt0.a, 6), 15)).subscribe(new defpackage.z(new mf8(1, qavVar, qav.class, "acceptAction", "acceptAction(Lcom/vk/voip/ui/holiday_interaction/feature/HolidayInteractionFeatureAction;)V", i5, 8), 28)));
            io.reactivex.rxjava3.core.q m5 = io.reactivex.rxjava3.core.q.m(cbvVar.r, cbvVar.q, new jxb0(cbvVar));
            m5.getClass();
            bVar4.b(new io.reactivex.rxjava3.internal.operators.observable.y(m5, qVar, aVar).subscribe(new qz(new mav(1, qjw0Var, izs.class, "invoke", "invoke(Ljava/lang/Object;)Ljava/lang/Object;", 0), 21)));
            io.reactivex.rxjava3.subjects.f<uav> fVar4 = qavVar.e;
            fVar4.getClass();
            bVar4.b(new io.reactivex.rxjava3.internal.operators.observable.y(fVar4, qVar, aVar).a0(asu0Var.d()).subscribe(new lav(new pf8(1, pbaVar, izs.class, "invoke", "invoke(Ljava/lang/Object;)Ljava/lang/Object;", i5, 7), 0)));
            bVar3.b(bVar4);
        } else {
            aVar = aVar2;
            qVar = qVar2;
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        bVar3.b(mjw0Var.I0.v0(50L, timeUnit).a0(asu0Var.d()).subscribe(new dbu0(new lzl0(mjw0Var, 21), 3)));
        bVar3.b(io.reactivex.rxjava3.kotlin.c.f(3, GroupCallViewModel.i(), null, null, new qjl0(mjw0Var, 22)));
        bVar3.b(io.reactivex.rxjava3.kotlin.c.f(2, new io.reactivex.rxjava3.internal.operators.observable.i0(GroupCallViewModel.l.a0(asu0Var.d()).U(new q9(new ehu(1), 15)), new com.vk.movika.sdk.base.ui.j(new u4u(2), 19)).U(new yzt(new ve0(28), 1)), null, new u9e(l, 9), new b8j0(mjw0Var, 27)));
        bVar3.b(io.reactivex.rxjava3.core.q.l(com.vk.voip.ui.c.H0(true), com.vk.voip.ui.c.G0(true), GroupCallViewModel.i(), new hl30(new ec1(6), 24)).subscribe(new hrt0(new r50(gxuVar, 9), 6)));
        bVar3.b(com.vk.voip.ui.c.i0().i().subscribe(new nan0(new waf0(mjw0Var, 29), 10)));
        bVar3.b(com.vk.voip.ui.c.D0.b.c().a0(asu0Var.d()).subscribe(new yvq0(new vcw0(mjw0Var, 2), 5)));
        bVar3.b(new io.reactivex.rxjava3.internal.operators.observable.y(GroupCallViewModel.i(), qVar, aVar).y(250L, timeUnit).a0(asu0Var.d()).subscribe(new mlu0(new ifw0(mjw0Var, 1), 4)));
        p19 provide = ((VoipCallComponent) ((k7m) m7m.f(cVar)).a(fpf0.a(VoipCallComponent.class))).t1().provide();
        if (provide != null && (subscribe = provide.c.a0(asu0Var.d()).subscribe(new j5v0(new r6i0(mjw0Var, 29), 3))) != null) {
            bVar3.b(subscribe);
        }
        mjw0Var.k1.getClass();
        bVar3.b(io.reactivex.rxjava3.kotlin.c.f(3, new io.reactivex.rxjava3.internal.operators.observable.y(new io.reactivex.rxjava3.internal.operators.observable.y(com.vk.voip.ui.c.G0(true).U(new x6h0(new dl70(15), 2)), qVar, aVar).b(2, 1).U(new s1j0(new l140(14), 1)), qVar, new sqk0(new bb9(6), 0)), null, null, new ijw0(mjw0Var, 0)));
        mjw0Var.Y0 = io.reactivex.rxjava3.kotlin.c.f(2, mjw0Var.X0.v0(200L, timeUnit).a0(asu0Var.d()), null, new e89(l, 9), new efr0(mjw0Var, 15));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        Fragment H;
        L.A("VoipCallView", "onDetachedFromWindow");
        com.vk.voip.ui.c.b.getClass();
        if (((Boolean) com.vk.voip.ui.c.k0().b.invoke()).booleanValue()) {
            this.L0.b(null);
        }
        gkw0 gkw0Var = this.a1;
        gkw0Var.e.b.clear();
        s5r s5rVar = gkw0Var.d;
        s5rVar.getClass();
        com.vk.voip.ui.c.Y.h(false);
        s5rVar.c.dispose();
        gkw0Var.h.dispose();
        this.R0.j.dispose();
        zzz zzzVar = this.d;
        zzzVar.b(this);
        zrw zrwVar = this.F;
        zzzVar.b(zrwVar);
        gxu gxuVar = this.H;
        zzzVar.b(gxuVar);
        ze00 ze00Var = this.T0;
        zzzVar.b(ze00Var);
        zzzVar.b(this.G);
        mkw0 mkw0Var = this.u0;
        zzzVar.b(mkw0Var);
        zzzVar.b(this.K);
        zzzVar.b(this.I);
        zzzVar.b(this.F0);
        j6r j6rVar = this.U0;
        zzzVar.b(j6rVar);
        g3m g3mVar = this.j1;
        g3mVar.f.e();
        ListGroupCallView listGroupCallView = g3mVar.e;
        g3m.b bVar = g3mVar.i;
        ((CopyOnWriteArrayList) listGroupCallView.t.b).remove(bVar);
        g3mVar.c.a.remove(bVar);
        g3mVar.b.g = null;
        g3mVar.a.b(bVar);
        gxuVar.e.e();
        this.u.e();
        super.onDetachedFromWindow();
        this.L.e();
        this.W0.dispose();
        this.Y0.dispose();
        q();
        this.W.c();
        lsw0 lsw0Var = this.d0;
        if (lsw0Var != null) {
            OKVoipEngine.b.getClass();
            OKVoipEngine.k.o.a.remove(lsw0Var);
        }
        ojw0 ojw0Var = this.c0;
        if (ojw0Var != null) {
            OKVoipEngine.b.getClass();
            OKVoipEngine.s.remove(ojw0Var);
        }
        njw0 njw0Var = this.b0;
        if (njw0Var != null) {
            OKVoipEngine.b.getClass();
            OKVoipEngine.r.remove(njw0Var);
        }
        hjw0 hjw0Var = this.a0;
        if (hjw0Var != null) {
            OKVoipEngine.b.getClass();
            OKVoipEngine.k.k(hjw0Var);
        }
        removeCallbacks(this.N0);
        nlk.b.getClass();
        nlk.f.remove(this.K0);
        io.reactivex.rxjava3.disposables.c cVar = ze00Var.g.d;
        if (cVar != null) {
            cVar.dispose();
        }
        io.reactivex.rxjava3.disposables.c cVar2 = ze00Var.i;
        if (cVar2 != null) {
            cVar2.dispose();
        }
        ze00Var.c.e = null;
        ihw0 ihw0Var = ze00Var.d;
        FragmentManager fragmentManager = ihw0Var.a.b;
        if (fragmentManager != null) {
            fragmentManager.r0(ihw0Var.g);
        }
        ihw0Var.f.dispose();
        FragmentManager a2 = ze00Var.f.a();
        if (a2 != null && (H = a2.H("pull-up-menu-inner")) != null) {
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(a2);
            aVar.q(H);
            aVar.m();
        }
        h69 h69Var = ze00Var.l;
        if (h69Var != null) {
            h69Var.f.dispose();
            h69Var.e.dispose();
        }
        mkw0Var.a(false);
        this.v0.a(false);
        sg8 sg8Var = this.y0;
        if (sg8Var != null) {
            sg8Var.a(false);
        }
        this.w0.a(false);
        akw0 akw0Var = this.z0;
        if (akw0Var != null) {
            akw0Var.b(false);
        }
        dkw0 dkw0Var = this.A0;
        if (dkw0Var != null) {
            dkw0Var.b(false);
        }
        zjw0 zjw0Var = this.B0;
        if (zjw0Var != null) {
            zjw0Var.b(false);
        }
        jkw0 jkw0Var = this.E0;
        if (jkw0Var != null) {
            jkw0Var.b(false);
        }
        vjw0 vjw0Var = this.D0;
        if (vjw0Var != null) {
            vjw0Var.a(false);
        }
        this.M0.d.dispose();
        zrwVar.getClass();
        j6rVar.h.dispose();
        TextStatRenderer textStatRenderer = this.v;
        if (textStatRenderer != null) {
            textStatRenderer.setStatProcessor(null);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.g1 = System.currentTimeMillis();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        y();
    }

    public final void p() {
        InsetDrawable insetDrawable;
        int i;
        com.vk.voip.ui.c cVar = com.vk.voip.ui.c.b;
        cVar.getClass();
        boolean z = (n(com.vk.voip.ui.c.K0) && !this.i1) && !cVar.s0();
        boo booVar = this.H.j;
        TextView textView = booVar.b;
        booVar.d = z && com.vk.voip.ui.c.K0 == VoipViewModelState.InCall;
        if (booVar.b()) {
            if (com.vk.voip.ui.c.M0 == CallMember.NetworkStatus.GOOD || com.vk.voip.ui.c.K0 != VoipViewModelState.InCall) {
                insetDrawable = null;
            } else {
                insetDrawable = (InsetDrawable) booVar.f.getValue();
                Context context = textView.getContext();
                int i2 = boo.a.$EnumSwitchMapping$0[com.vk.voip.ui.c.M0.ordinal()];
                if (i2 == 1) {
                    i = R.color.vk_green;
                } else if (i2 == 2) {
                    i = R.color.vk_yellow_sunflower;
                } else {
                    if (i2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = R.color.vk_red_light;
                }
                e3m.a aVar = e3m.a;
                insetDrawable.setTint(context.getColor(i));
            }
            textView.setCompoundDrawablesWithIntrinsicBounds(insetDrawable, (Drawable) null, (Drawable) null, (Drawable) null);
        }
        textView.setText(com.vk.voip.ui.c.K());
        textView.setVisibility(booVar.b() ? 0 : 8);
    }

    public final void q() {
        TextureViewRenderer textureViewRenderer = this.s;
        rct0 rct0Var = this.Q0;
        if (textureViewRenderer != null) {
            ConversationVideoTrackParticipantKey conversationVideoTrackParticipantKey = this.t;
            if (conversationVideoTrackParticipantKey != null) {
                rct0Var.removeParticipantView(conversationVideoTrackParticipantKey, textureViewRenderer);
            }
            rct0Var.releaseParticipantView(textureViewRenderer);
            this.s = null;
        }
        TextureViewRenderer textureViewRenderer2 = this.p;
        gb9 gb9Var = this.u;
        if (textureViewRenderer2 != null) {
            ConversationVideoTrackParticipantKey conversationVideoTrackParticipantKey2 = this.q;
            if (conversationVideoTrackParticipantKey2 != null) {
                rct0Var.removeParticipantView(conversationVideoTrackParticipantKey2, textureViewRenderer2);
            }
            rct0Var.releaseParticipantView(textureViewRenderer2);
            gb9Var.d(null);
            this.p = null;
        }
        gb9Var.A = null;
    }

    public final void s() {
        this.I0.onNext(s3q0.a);
    }

    public final void setControlsAreHidden(boolean z) {
        if (this.h1) {
            return;
        }
        if (this.i1 != z) {
            this.i1 = z;
            this.g1 = System.currentTimeMillis();
            s();
            float minimizedVideoTopOffset = getMinimizedVideoTopOffset();
            VoipViewBehaviour voipViewBehaviour = this.x;
            voipViewBehaviour.g = minimizedVideoTopOffset;
            voipViewBehaviour.i = getMinimizedVideoBottomOffset();
            float minimizedVideoTopOffset2 = getMinimizedVideoTopOffset();
            VoipViewBehaviour voipViewBehaviour2 = this.y;
            voipViewBehaviour2.g = minimizedVideoTopOffset2;
            voipViewBehaviour2.i = getMinimizedVideoBottomOffset();
            voipViewBehaviour.a();
            voipViewBehaviour2.a();
            com.vk.voip.ui.c.b.getClass();
            com.vk.voip.ui.c.D0.j.onNext(Boolean.valueOf(z));
        }
        ov ovVar = this.N0;
        removeCallbacks(ovVar);
        if (z) {
            return;
        }
        postDelayed(ovVar, 3000L);
    }

    public final void setControlsAreLocked(boolean z) {
        this.h1 = z;
    }

    public final void setEnsureMasksPermissionsCallback(izs<? super izs<? super Boolean, s3q0>, s3q0> izsVar) {
        this.f1 = izsVar;
    }

    public final void setFinishCallCallback(gzs<s3q0> gzsVar) {
        this.e1 = gzsVar;
    }

    public final void setFragmentManagerProvider(zbs zbsVar) {
        this.S0.e = zbsVar;
    }

    public final void setHasListRecycler$ui_release(boolean z) {
        this.b1 = z;
        s();
    }

    public final void setLastTimeChangedControlsRelatedState(long j) {
        this.g1 = j;
    }

    public final void setOpenChatCallback(izs<? super Long, s3q0> izsVar) {
        this.d1 = izsVar;
    }

    public final void setPipCallback(gzs<s3q0> gzsVar) {
        this.c1 = gzsVar;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        com.vk.voip.ui.c.b.getClass();
        if (com.vk.voip.ui.c.q) {
            com.vk.voip.ui.c.r.getVideoController().rebindParticipantViews();
        }
        s();
    }

    public final l7s v() {
        Context context = getContext();
        dhr0.a.getClass();
        return new l7s(context, dhr0.u().c);
    }

    @Override // xsna.tmg0, xsna.j6m
    public final void v0(float f2) {
        super.v0(f2);
        if (com.vk.voip.ui.c.b.s0()) {
            this.K0.run();
        }
        y();
    }

    public final void w() {
        boolean z;
        AnimatorSet animatorSet;
        com.vk.voip.ui.c cVar = com.vk.voip.ui.c.b;
        cVar.getClass();
        if (com.vk.voip.ui.c.K0 != VoipViewModelState.ReceivingCallFromPeer) {
            cVar.getClass();
            if (com.vk.voip.ui.c.K0 != VoipViewModelState.CallingPeer || cVar.s0()) {
                cVar.getClass();
                if (com.vk.voip.ui.c.K0 != VoipViewModelState.Connecting) {
                    z = false;
                    animatorSet = this.e0;
                    boolean isRunning = animatorSet.isRunning();
                    if (z && !isRunning) {
                        animatorSet.start();
                    }
                    if (z && isRunning) {
                        animatorSet.end();
                        return;
                    }
                }
            }
        }
        z = true;
        animatorSet = this.e0;
        boolean isRunning2 = animatorSet.isRunning();
        if (z) {
            animatorSet.start();
        }
        if (z) {
        }
    }

    public final void x(float f2, boolean z) {
        int i;
        int i2;
        if (Float.isInfinite(f2) || Float.isNaN(f2) || f2 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        if (f2 > 1.0f || z) {
            int width = getWidth();
            i = (int) (width * f2);
            i2 = width;
        } else {
            i = getWidth();
            i2 = (int) (i / f2);
        }
        FrameLayout frameLayout = this.o;
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.width = i;
        layoutParams.height = i2;
        frameLayout.setLayoutParams(layoutParams);
    }

    public final void y() {
        Collection collection;
        ConversationParticipant me2;
        com.vk.voip.ui.c cVar = com.vk.voip.ui.c.b;
        if (cVar.s0()) {
            return;
        }
        ltw0 p2pLayoutUpdater = getP2pLayoutUpdater();
        Size j = j(this.o, this.y, cVar.x0());
        Size j2 = j(this.r, this.x, com.vk.voip.ui.c.i0().g());
        com.vk.voip.b bVar = p2pLayoutUpdater.a;
        hl90 k = bVar.k();
        Conversation conversation = k.a.getConversation();
        CallMember a2 = (conversation == null || (me2 = conversation.getMe()) == null) ? null : tk90.a(k.b, me2);
        if (a2 != null) {
            ArrayList arrayList = new ArrayList(2);
            hl90 k2 = bVar.k();
            Conversation conversation2 = k2.a.getConversation();
            if (conversation2 == null) {
                collection = EmptyList.b;
            } else {
                ParticipantCollection participants = conversation2.getParticipants();
                ArrayList arrayList2 = new ArrayList();
                for (ConversationParticipant conversationParticipant : participants) {
                    if (!epx.f(conversationParticipant.getExternalId(), conversation2.getMe().getExternalId())) {
                        arrayList2.add(conversationParticipant);
                    }
                }
                tk90 tk90Var = k2.b;
                ArrayList arrayList3 = new ArrayList();
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    CallMember a3 = tk90.a(tk90Var, (ConversationParticipant) it.next());
                    if (a3 != null) {
                        arrayList3.add(a3);
                    }
                }
                collection = arrayList3;
            }
            if (!collection.isEmpty() && j.getWidth() > 0 && j.getHeight() > 0) {
                arrayList.add(new Pair(j5g.X(collection), j));
            }
            if (j2.getWidth() > 0 && j2.getHeight() > 0) {
                arrayList.add(new Pair(a2, j2));
            }
            ArrayList arrayList4 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Pair pair = (Pair) it2.next();
                CallMember callMember = (CallMember) pair.d();
                Size size = (Size) pair.g();
                boolean z = callMember.g;
                CallMemberId callMemberId = callMember.a;
                ConversationDisplayLayoutItem a4 = z ? ltw0.a(callMemberId, VideoTrackType.VIDEO, size) : callMember.h ? ltw0.a(callMemberId, VideoTrackType.ANIMOJI, size) : null;
                if (a4 != null) {
                    arrayList4.add(a4);
                }
            }
            bVar.getVideoController().updateDisplayLayout(arrayList4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void z() {
        Drawable w;
        boolean f2;
        String l;
        com.vk.voip.ui.c cVar = com.vk.voip.ui.c.b;
        cVar.getClass();
        y4x0 y4x0Var = com.vk.voip.ui.c.u;
        String b2 = y4x0Var.b();
        String str = "";
        if (b2 == null) {
            b2 = "";
        }
        dhw0 dhw0Var = com.vk.voip.ui.c.O;
        if (dhw0Var != null && (l = dhw0Var.l()) != null) {
            str = l;
        }
        if (!cVar.s0()) {
            com.vk.voip.ui.c.W().getClass();
            dhw0 L = cVar.L();
            if (L != null && L.C != null) {
                w = new com.vk.im.ui.views.avatars.a(getContext(), new a.b.C1179b(com.vk.voip.ui.c.d0()), 2);
                this.m.c(kr5.a(y4x0Var.a(), w, null, 11));
                f2 = myc0.f(b2);
                VKImageView vKImageView = this.E;
                VKImageView vKImageView2 = this.n;
                if (!f2) {
                    vKImageView2.load(b2);
                    vKImageView.load(b2);
                    return;
                } else {
                    if (myc0.f(str)) {
                        vKImageView2.load(str);
                        vKImageView.load(str);
                        return;
                    }
                    return;
                }
            }
        }
        w = dhr0.w(R.drawable.ic_user_260, getContext());
        this.m.c(kr5.a(y4x0Var.a(), w, null, 11));
        f2 = myc0.f(b2);
        VKImageView vKImageView3 = this.E;
        VKImageView vKImageView22 = this.n;
        if (!f2) {
        }
    }
}
