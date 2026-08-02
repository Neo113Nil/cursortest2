package xsna;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.drawable.Drawable;
import android.util.LruCache;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.common.im.Image;
import com.vk.imageloader.view.VKImageView;
import com.vk.log.L;
import com.vk.toggle.features.VoipFeatures;
import com.vk.voip.OKVoipEngine;
import com.vk.voip.dto.call_member.CallMember;
import com.vk.voip.dto.call_member.CallMemberId;
import com.vk.voip.ui.avatars.VoipAvatarViewContainer;
import com.vk.voip.ui.groupcalls.GroupCallViewModel;
import com.vkontakte.android.R;
import io.jsonwebtoken.JwtParser;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import ru.ok.android.externcalls.sdk.layout.ConversationVideoTrackParticipantKey;
import ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager;
import ru.ok.android.externcalls.sdk.stat.view.TextStatRendererView;
import ru.ok.android.externcalls.sdk.ui.FrameDecorator;
import ru.ok.android.externcalls.sdk.ui.TextureViewRenderer;
import ru.ok.android.webrtc.participant.movie.Movie;
import ru.ok.android.webrtc.participant.movie.MovieSourceTypeExtensionsKt;
import ru.ok.android.webrtc.videotracks.VideoTrackType;
import xsna.e3m;
import xsna.qtw0;
import xsna.sew0;

/* compiled from: GroupCallParticipantView.kt */
/* loaded from: classes7.dex */
public abstract class giu extends ConstraintLayout implements tmg0 {
    public final ImageView A;
    public final VoipAvatarViewContainer B;
    public final FrameLayout C;
    public final ImageView D;
    public final VKImageView E;
    public final View F;
    public final ImageView G;
    public final View H;
    public TextureViewRenderer I;
    public final View J;
    public final VKImageView K;
    public TextStatRendererView L;
    public final Drawable M;
    public final Drawable N;
    public final Drawable O;
    public final io.reactivex.rxjava3.disposables.b P;
    public final boolean Q;
    public volatile boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public sew0 V;
    public final Object W;
    public final zzz a0;
    public ConversationVideoTrackParticipantKey b0;
    public final EmptyList c0;
    public final EmptyList d0;
    public final GestureDetector e0;
    public final ViewGroup.LayoutParams t;
    public final rct0 u;
    public boolean v;
    public kiu w;
    public boolean x;
    public gzs<CallMemberId> y;
    public final TextView z;

    /* compiled from: GroupCallParticipantView.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CallMember.NetworkStatus.values().length];
            try {
                iArr[CallMember.NetworkStatus.GOOD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CallMember.NetworkStatus.MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CallMember.NetworkStatus.BAD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public giu(float f, int i, int i2, Context context) {
        super(context, null, 0);
        this.t = new ViewGroup.LayoutParams(-1, -1);
        this.u = OKVoipEngine.b.getVideoController();
        this.y = iiu.b;
        this.P = new io.reactivex.rxjava3.disposables.b();
        this.Q = true;
        this.U = true;
        LruCache<String, fxj0> lruCache = sew0.a;
        this.V = sew0.a.b("", false, false);
        this.W = msy.a(LazyThreadSafetyMode.NONE, new b1j(this, 23));
        com.vk.voip.ui.c.b.getClass();
        this.a0 = (a000) com.vk.voip.ui.c.T().a;
        LayoutInflater.from(context).inflate(i, this);
        this.z = (TextView) findViewById(R.id.tv_participant_name);
        ImageView imageView = (ImageView) findViewById(R.id.connection_status);
        this.A = imageView;
        this.B = (VoipAvatarViewContainer) findViewById(R.id.avatar);
        this.F = findViewById(R.id.screen_capture_icon);
        this.G = (ImageView) findViewById(R.id.watch_together_icon);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.fl_render_container);
        this.C = frameLayout;
        frameLayout.setClipChildren(false);
        this.D = (ImageView) findViewById(R.id.pin_icon);
        VKImageView vKImageView = (VKImageView) findViewById(R.id.bg_blurred_avatar);
        this.E = vKImageView;
        this.K = (VKImageView) findViewById(R.id.reaction_icon);
        com.vk.voip.ui.c.s0.f.getClass();
        mqw0 mqw0Var = mqw0.a;
        if (Boolean.TRUE.booleanValue()) {
            vKImageView.setPostprocessor(new hh7(cn70.b(20), -1895825408));
        }
        View findViewById = findViewById(R.id.border_speaking_holder);
        findViewById.setBackgroundResource(i2);
        this.H = findViewById;
        this.J = findViewById(R.id.hand_layout);
        this.L = (TextStatRendererView) findViewById(R.id.debug_media_stat_list);
        imageView.setImageDrawable(new vup0(context));
        bwt0.d(this, f, (r4 & 2) != 0, (r4 & 4) != 0);
        int color = context.getColor(R.color.vk_white);
        e3m.a aVar = e3m.a;
        Drawable mutate = m33.a(R.drawable.vk_icon_connection_16, context).mutate();
        mutate.setTint(color);
        this.M = mutate;
        Drawable a2 = m33.a(R.drawable.ic_mic_disabled_shadow_16, context);
        a2.setTint(color);
        this.N = a2;
        this.O = m33.a(R.drawable.black_alpha_35_round_overlay, context);
        EmptyList emptyList = EmptyList.b;
        this.c0 = emptyList;
        this.d0 = emptyList;
        this.e0 = new GestureDetector(context, new hiu(this));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final ParticipantStatesManager.Listener getHandStateChangeListener() {
        return (ParticipantStatesManager.Listener) this.W.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void setIcons(kiu kiuVar) {
        boolean z;
        Drawable drawable;
        int i;
        VoipFeatures voipFeatures = VoipFeatures.BAD_NETWORK_INDICATOR;
        voipFeatures.getClass();
        boolean a2 = com.vk.toggle.b.A.a(voipFeatures);
        boolean z2 = this.U || a2 || !T4() || !this.S;
        boolean z3 = z2 && !kiuVar.a.f;
        if (z2) {
            CallMember callMember = kiuVar.a;
            if (callMember.r != CallMember.NetworkStatus.GOOD && (!callMember.n || a2)) {
                z = true;
                boolean z4 = kiuVar.k == null;
                boolean z5 = (z2 || !kiuVar.a.i || z4) ? false : true;
                boolean z6 = (z2 || kiuVar.a.s.isEmpty() || z4) ? false : true;
                if (z) {
                    drawable = null;
                } else {
                    Context context = getContext();
                    int i2 = a.$EnumSwitchMapping$0[kiuVar.a.r.ordinal()];
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
                    int color = context.getColor(i);
                    drawable = this.M;
                    drawable.setTint(color);
                }
                Drawable drawable2 = !z3 ? this.N : null;
                TextView textView = this.z;
                textView.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, drawable2, (Drawable) null);
                textView.setVisibility(!z2 ? 0 : 8);
                this.F.setVisibility(!z5 ? 0 : 8);
                this.G.setVisibility(z6 ? 0 : 8);
            }
        }
        z = false;
        if (kiuVar.k == null) {
        }
        if (z2) {
        }
        if (z2) {
        }
        if (z) {
        }
        if (!z3) {
        }
        TextView textView2 = this.z;
        textView2.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, drawable2, (Drawable) null);
        textView2.setVisibility(!z2 ? 0 : 8);
        this.F.setVisibility(!z5 ? 0 : 8);
        this.G.setVisibility(z6 ? 0 : 8);
    }

    private final void setIconsSource(kiu kiuVar) {
        release();
        setAvatarVisibility(true);
        this.S = false;
        setIcons(kiuVar);
    }

    private final void setWatchTogether(kiu kiuVar) {
        Movie movie = (Movie) j5g.a0(kiuVar.a.s);
        if (movie == null) {
            return;
        }
        U4(kiuVar, new ConversationVideoTrackParticipantKey.Builder().setParticipantId(mnh0.H(kiuVar.a.a)).setType(MovieSourceTypeExtensionsKt.toVideoTrackType(movie.getSourceType())).setMovieId(movie.getMovieId()).build());
    }

    public CallMemberId P4() {
        return null;
    }

    public final boolean Q4() {
        kiu kiuVar = this.w;
        return kiuVar != null && kiuVar.a.h && this.x;
    }

    public final boolean T4() {
        kiu kiuVar = this.w;
        return kiuVar != null && kiuVar.a.g && this.x;
    }

    public final void U4(kiu kiuVar, ConversationVideoTrackParticipantKey conversationVideoTrackParticipantKey) {
        FrameDecorator empty;
        rct0 rct0Var = this.u;
        if (getRenderView() == null) {
            L.A("creating " + this);
            setRenderView(rct0Var.mo349createVideoViewInstance(getContext()));
            this.C.addView(getRenderView(), 0, this.t);
        }
        TextureViewRenderer renderView = getRenderView();
        if (renderView != null) {
            zzz zzzVar = this.a0;
            ConversationVideoTrackParticipantKey conversationVideoTrackParticipantKey2 = this.b0;
            if (conversationVideoTrackParticipantKey2 != null) {
                rct0Var.removeParticipantView(conversationVideoTrackParticipantKey2, renderView);
            }
            VideoTrackType type = conversationVideoTrackParticipantKey.getType();
            ConversationVideoTrackParticipantKey conversationVideoTrackParticipantKey3 = this.b0;
            boolean z = type != (conversationVideoTrackParticipantKey3 != null ? conversationVideoTrackParticipantKey3.getType() : null);
            if (getIgnoreFrameRotation()) {
                empty = FrameDecorator.Companion.getEMPTY();
            } else if (!kiuVar.a.n || conversationVideoTrackParticipantKey.getType() == VideoTrackType.ANIMOJI) {
                empty = new ags(new v1u(zzzVar));
            } else {
                u1u u1uVar = new u1u(zzzVar);
                OKVoipEngine.b.getClass();
                empty = new j7i(u1uVar, OKVoipEngine.f);
            }
            rct0Var.setParticipantView(conversationVideoTrackParticipantKey, renderView, empty);
            if (z) {
                renderView.setFrameDecorator(empty);
            }
            this.b0 = conversationVideoTrackParticipantKey;
        }
        if (this.S) {
            setAvatarVisibility(false);
        } else {
            setAvatarVisibility(true);
            this.R = true;
            TextureViewRenderer renderView2 = getRenderView();
            if (renderView2 != null) {
                renderView2.setFrameSizeListener(new jiu(2, this, giu.class, "onFrameRendered", "onFrameRendered(II)V", 0));
            }
        }
        setIcons(kiuVar);
    }

    public final void V4(kiu kiuVar, VideoTrackType videoTrackType) {
        U4(kiuVar, new ConversationVideoTrackParticipantKey.Builder().setParticipantId(mnh0.H(kiuVar.a.a)).setType(videoTrackType).build());
    }

    public boolean X4(kiu kiuVar) {
        return (!Q4() || T4() || Y4(kiuVar) || Z4(kiuVar)) ? false : true;
    }

    public boolean Y4(kiu kiuVar) {
        kiu kiuVar2 = this.w;
        return kiuVar2 != null && kiuVar2.a.i && this.x && !kiuVar.a.n;
    }

    public boolean Z4(kiu kiuVar) {
        kiu kiuVar2 = this.w;
        return (kiuVar2 == null || kiuVar2.a.s.isEmpty() || !this.x) ? false : true;
    }

    public final void a5(kiu kiuVar) {
        CallMember callMember = kiuVar.a;
        if (callMember.n || (callMember.k && kiuVar.b)) {
            setIconsSource(kiuVar);
            return;
        }
        release();
        setAvatarVisibility(true);
        this.S = false;
        TextView textView = this.z;
        textView.setVisibility(0);
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        this.B.setVisibility(0);
        this.E.setVisibility(0);
        this.A.setVisibility(0);
        this.F.setVisibility(8);
        this.G.setVisibility(8);
    }

    public final void b5() {
        boolean z;
        kiu kiuVar = this.w;
        if (kiuVar == null) {
            return;
        }
        Context context = getContext();
        while (true) {
            z = context instanceof AppCompatActivity;
            if (z || !(context instanceof ContextWrapper)) {
                break;
            } else {
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        if (((AppCompatActivity) (z ? (Activity) context : null)) != null) {
            performHapticFeedback(0, 2);
            int i = qtw0.l1;
            new qtw0.a(getContext(), kiuVar.a.a).I0("VoipParticipantSettingsBottomSheet");
        }
    }

    public void c5(boolean z) {
        this.J.setVisibility(z ? 0 : 8);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x011c  */
    @SuppressLint({"ClickableViewAccessibility"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e5() {
        String str;
        Image Gb;
        kiu kiuVar = this.w;
        VKImageView vKImageView = this.E;
        VoipAvatarViewContainer voipAvatarViewContainer = this.B;
        TextView textView = this.z;
        if (kiuVar == null) {
            textView.setVisibility(8);
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            voipAvatarViewContainer.setVisibility(8);
            this.F.setVisibility(8);
            this.G.setVisibility(8);
            this.A.setVisibility(0);
            vKImageView.setVisibility(0);
            vKImageView.setBackgroundColor(-16777216);
            return;
        }
        setVisibility(0);
        if (kiuVar.a.n) {
            str = getContext().getString(R.string.voip_call_own_name);
        } else if (kiuVar.b) {
            String str2 = kiuVar.l;
            if (str2 != null && str2.length() != 0) {
                str = kiuVar.l;
            } else if (!getShouldShowLastName()) {
                str = kiuVar.c;
            } else if (kiuVar.d.length() > 0) {
                str = kiuVar.c + ' ' + erm0.x0(kiuVar.d) + JwtParser.SEPARATOR_CHAR;
            } else {
                str = kiuVar.c;
            }
        } else {
            str = "";
        }
        textView.setText(str);
        sew0 sew0Var = kiuVar.h;
        if (!epx.f(this.V, sew0Var)) {
            voipAvatarViewContainer.O(sew0Var);
            x59.c(vKImageView, sew0Var);
            this.V = sew0Var;
        }
        if (this.x) {
            CallMember callMember = kiuVar.a;
            if (callMember.n || (callMember.j && kiuVar.b)) {
                boolean Z4 = Z4(kiuVar);
                boolean Y4 = Y4(kiuVar);
                boolean T4 = T4();
                boolean X4 = X4(kiuVar);
                if (Z4) {
                    setWatchTogether(kiuVar);
                } else if (Y4) {
                    V4(kiuVar, VideoTrackType.SCREEN_CAPTURE);
                } else if (X4) {
                    V4(kiuVar, VideoTrackType.ANIMOJI);
                } else if (T4) {
                    V4(kiuVar, VideoTrackType.VIDEO);
                } else {
                    CallMember callMember2 = kiuVar.a;
                    if (callMember2.n || (callMember2.k && kiuVar.b)) {
                        setIconsSource(kiuVar);
                    } else {
                        a5(kiuVar);
                    }
                }
                String str3 = kiuVar.k;
                d5();
                com.vk.voip.ui.c.b.getClass();
                b69 a2 = com.vk.voip.ui.c.Y.c.a(str3);
                Gb = a2 == null ? a2.b.Gb(cn70.b(32)) : null;
                VKImageView vKImageView2 = this.K;
                if (Gb == null) {
                    vKImageView2.load(Gb.d);
                } else {
                    vKImageView2.setImageDrawable(null);
                }
                this.H.setVisibility(kiuVar.a.m ? 0 : 8);
                c5(kiuVar.m);
            }
        }
        a5(kiuVar);
        String str32 = kiuVar.k;
        d5();
        com.vk.voip.ui.c.b.getClass();
        b69 a22 = com.vk.voip.ui.c.Y.c.a(str32);
        if (a22 == null) {
        }
        VKImageView vKImageView22 = this.K;
        if (Gb == null) {
        }
        this.H.setVisibility(kiuVar.a.m ? 0 : 8);
        c5(kiuVar.m);
    }

    public List<View> getAnimatedViewsToRotate() {
        return this.d0;
    }

    public final VoipAvatarViewContainer getAvatarView() {
        return this.B;
    }

    public final VKImageView getBlurredPhotoBg() {
        return this.E;
    }

    public final ImageView getConnectionStatus() {
        return this.A;
    }

    public final sew0 getCurrentlySetImage() {
        return this.V;
    }

    public final TextStatRendererView getDebugMediaStat() {
        return this.L;
    }

    public final gzs<CallMemberId> getGetPrimaryParticipantId() {
        return this.y;
    }

    public final View getHandLayout() {
        return this.J;
    }

    public boolean getIgnoreFrameRotation() {
        return this.Q;
    }

    public final boolean getNameAlwaysVisible() {
        return this.U;
    }

    public final TextView getNameView() {
        return this.z;
    }

    public final zzz getOrientationDelegate() {
        return this.a0;
    }

    public final ImageView getPinIconView() {
        return this.D;
    }

    public final boolean getPinned() {
        return this.v;
    }

    public final VKImageView getReactionView() {
        return this.K;
    }

    public final FrameLayout getRenderContainer() {
        return this.C;
    }

    public TextureViewRenderer getRenderView() {
        return this.I;
    }

    public final View getScreenCaptureIconView() {
        return this.F;
    }

    public boolean getShouldShowLastName() {
        return false;
    }

    public final ConversationVideoTrackParticipantKey getVideoTrackKey() {
        return this.b0;
    }

    public final kiu getViewModel() {
        return this.w;
    }

    public List<View> getViewsToRotate() {
        return this.c0;
    }

    public final ImageView getWatchTogetherIconView() {
        return this.G;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        GroupCallViewModel groupCallViewModel = GroupCallViewModel.b;
        z4f z4fVar = new z4f(this, 29);
        groupCallViewModel.getClass();
        io.reactivex.rxjava3.disposables.c subscribe = GroupCallViewModel.f(z4fVar).subscribe(new lz(new xcd(this, 26), 17));
        io.reactivex.rxjava3.disposables.b bVar = this.P;
        bVar.b(subscribe);
        bVar.b(GroupCallViewModel.r.b.a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new hv(new kdn(this, 10), 25)));
        e5();
        this.S = false;
        this.T = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.T = false;
        super.onDetachedFromWindow();
        d3m.b(this.B, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3);
        this.P.e();
        release();
        this.S = false;
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.e0.onTouchEvent(motionEvent) || super.onTouchEvent(motionEvent);
    }

    public final void release() {
        TextureViewRenderer renderView = getRenderView();
        if (renderView == null) {
            return;
        }
        L.A("releasing " + this);
        setRenderView(null);
        ConversationVideoTrackParticipantKey conversationVideoTrackParticipantKey = this.b0;
        rct0 rct0Var = this.u;
        if (conversationVideoTrackParticipantKey != null) {
            rct0Var.removeParticipantView(conversationVideoTrackParticipantKey, renderView);
        }
        rct0Var.releaseParticipantView(renderView);
        this.C.removeView(renderView);
        this.b0 = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setAvatarVisibility(boolean z) {
        boolean z2;
        kiu kiuVar;
        int i = z ? 0 : 8;
        VoipAvatarViewContainer voipAvatarViewContainer = this.B;
        voipAvatarViewContainer.setVisibility(i);
        this.E.setVisibility(z ? 0 : 8);
        if (z && (kiuVar = this.w) != null) {
            CallMember callMember = kiuVar.a;
            if (!callMember.n && kiuVar != null && !callMember.k) {
                z2 = true;
                this.A.setVisibility(z2 ? 0 : 8);
                voipAvatarViewContainer.setupOverlay(!z2 ? this.O : null);
            }
        }
        z2 = false;
        this.A.setVisibility(z2 ? 0 : 8);
        voipAvatarViewContainer.setupOverlay(!z2 ? this.O : null);
    }

    public final void setCurrentlySetImage(sew0 sew0Var) {
        this.V = sew0Var;
    }

    public final void setDebugMediaStat(TextStatRendererView textStatRendererView) {
        this.L = textStatRendererView;
    }

    public final void setGetPrimaryParticipantId(gzs<CallMemberId> gzsVar) {
        this.y = gzsVar;
    }

    public final void setNameAlwaysVisible(boolean z) {
        this.U = z;
    }

    public final void setPinned(boolean z) {
        this.v = z;
        if (this.T) {
            e5();
        }
    }

    public void setRenderView(TextureViewRenderer textureViewRenderer) {
        this.I = textureViewRenderer;
    }

    public final void setVideoOn(boolean z) {
        if (z != this.x) {
            this.x = z;
            e5();
        }
    }

    public final void setViewModel(kiu kiuVar) {
        kiu kiuVar2 = this.w;
        if (kiuVar2 != null) {
            if (!kiuVar2.a.a.equals(kiuVar != null ? kiuVar.a.a : null)) {
                release();
                this.S = false;
            }
        }
        this.w = kiuVar;
        if (this.T) {
            e5();
        }
    }

    public void d5() {
    }
}
