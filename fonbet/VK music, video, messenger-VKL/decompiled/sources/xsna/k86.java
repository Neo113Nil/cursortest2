package xsna;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.TransitionDrawable;
import android.location.Location;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.base.VkPaginationList;
import com.vk.api.generated.stories.dto.StoriesGetPhotoUploadServerMemoryTypeDto;
import com.vk.camera.editor.stories.api.base.privacy.StoryPrivacyType;
import com.vk.camera.editor.stories.impl.base.BaseCameraEditorContract$ScreenState;
import com.vk.core.preference.Preference;
import com.vk.core.serialize.Serializer;
import com.vk.dto.camera.CameraEditorContentType;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.im.Image;
import com.vk.dto.common.im.ImageList;
import com.vk.dto.group.Group;
import com.vk.dto.im.MsgType;
import com.vk.dto.music.StoryMusicInfo;
import com.vk.dto.stories.entities.OrdData;
import com.vk.dto.stories.entities.StoryCameraMode;
import com.vk.dto.stories.entities.StoryCameraTarget;
import com.vk.dto.stories.entities.StoryEditorMode;
import com.vk.dto.stories.entities.StorySharingInfo;
import com.vk.dto.stories.entities.stat.BackgroundInfo;
import com.vk.dto.stories.entities.stat.StoryBackgroundType;
import com.vk.dto.stories.model.CommonUploadParams;
import com.vk.dto.stories.model.StoriesInvolvementChoice;
import com.vk.dto.stories.model.StoryUploadParams;
import com.vk.editor.analytics.StoryEditorEvents;
import com.vk.editor.di.StoryEditorExtDepsComponent;
import com.vk.log.L;
import com.vk.media.MediaUtils;
import com.vk.media.player.video.view.SimpleVideoView;
import com.vk.stickers.api.models.market.StoryServiceItemInfo;
import com.vk.storycamera.builder.StoryEditorCameraParams;
import com.vk.superapp.api.dto.story.WebStoryBox;
import com.vk.toggle.features.ContentFeatures;
import com.vk.toggle.features.StoriesFeatures;
import com.vkontakte.android.R;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import xsna.hfr;
import xsna.n930;
import xsna.ppr0;
import xsna.q850;
import xsna.u850;
import xsna.v76;
import xsna.w1m0;

/* compiled from: BaseCameraEditorPresenter.kt */
/* loaded from: classes16.dex */
public abstract class k86<V extends v76> extends ysi implements u76, w8i {
    public static final io.reactivex.rxjava3.core.w n0 = asu0.a.c();
    public boolean A;
    public final p1m0 B;
    public final m5p D;
    public b96 F;
    public Float H;
    public boolean I;
    public Bitmap J;
    public t9l0 K;
    public boolean L;
    public Matrix N;
    public n930.i Q;
    public final a600 R;
    public boolean S;
    public final hw5 T;
    public final Context U;
    public final gpj0 V;
    public final Object W;
    public final Object X;
    public final Object Y;
    public final Object Z;
    public final Object a0;
    public final Object b0;
    public final di9 c;
    public v2l0 c0;
    public final CommonUploadParams d;
    public final Object d0;
    public Bitmap e;
    public final bpn0 e0;
    public qx5 f;
    public final Object f0;
    public nov g;
    public final Object g0;
    public boolean h0;
    public final sd i0;
    public final di9 j;
    public final y76 j0;
    public final CommonUploadParams k;
    public final ft0 k0;
    public final StoryUploadParams l;
    public final ux0 l0;
    public final vf6 m;
    public final op0 m0;
    public final f2m0 n;
    public final p86 o;
    public gyl0 p;
    public final qr5 q;
    public final s5m0 r;
    public final V s;
    public z4p t;
    public q3p u;
    public final ArrayList v;
    public final CameraEditorContentType w;
    public final StoryCameraTarget x;
    public boolean z;
    public StoryEditorMode h = StoryEditorMode.DEFAULT;
    public final Handler i = new Handler(Looper.getMainLooper());
    public boolean y = true;
    public final hi9 C = new hi9();
    public final AtomicReference<BaseCameraEditorContract$ScreenState> E = new AtomicReference<>(BaseCameraEditorContract$ScreenState.EDITOR_MAIN_SCREEN);
    public boolean G = true;
    public final q6x M = new q6x();
    public izs<? super Bitmap, s3q0> O = new y90(3);
    public final AtomicInteger P = new AtomicInteger(0);

    /* compiled from: BaseCameraEditorPresenter.kt */
    public final class a {
        public final /* synthetic */ u440 a;

        public a(u440 u440Var) {
            this.a = u440Var;
        }
    }

    /* compiled from: BaseCameraEditorPresenter.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BaseCameraEditorContract$ScreenState.values().length];
            try {
                iArr[BaseCameraEditorContract$ScreenState.DRAWING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BaseCameraEditorContract$ScreenState.BACKGROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BaseCameraEditorContract$ScreenState.STICKERS_SELECTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BaseCameraEditorContract$ScreenState.EDITOR_MAIN_SCREEN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BaseCameraEditorContract$ScreenState.VERTICALIZATION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: _Sequences.kt */
    public static final class c implements izs<Object, Boolean> {
        public static final c b = new c();

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof oit0);
        }
    }

    /* compiled from: _Sequences.kt */
    public static final class d implements izs<Object, Boolean> {
        public static final d b = new d();

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof r4g0);
        }
    }

    /* compiled from: Handler.kt */
    public static final class e implements Runnable {
        public final /* synthetic */ dh9 b;

        public e(dh9 dh9Var) {
            this.b = dh9Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            dh9 dh9Var = this.b;
            tal0.a(dh9Var.getOriginalStickerScale(), dh9Var);
        }
    }

    /* compiled from: Handler.kt */
    public static final class f implements Runnable {
        public final /* synthetic */ dh9 b;

        public f(dh9 dh9Var) {
            this.b = dh9Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            dh9 dh9Var = this.b;
            tal0.a(dh9Var.getOriginalStickerScale() * 0.7f, dh9Var);
        }
    }

    /* compiled from: _Sequences.kt */
    public static final class g implements izs<Object, Boolean> {
        public static final g b = new g();

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof grt0);
        }
    }

    /* compiled from: Handler.kt */
    public static final class h implements Runnable {
        public h() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            k86 k86Var = k86.this;
            k86Var.C.a = true;
            b96 b96Var = k86Var.F;
            if (b96Var != null) {
                b96.c(b96Var);
            }
            k86Var.s.eb();
        }
    }

    /* compiled from: _Sequences.kt */
    public static final class i implements izs<Object, Boolean> {
        public static final i b = new i();

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof grt0);
        }
    }

    /* compiled from: Handler.kt */
    public static final class j implements Runnable {
        public final /* synthetic */ UserId c;

        public j(UserId userId) {
            this.c = userId;
        }

        @Override // java.lang.Runnable
        public final void run() {
            k86 k86Var = k86.this;
            k86Var.D.d(e3m.h(k86Var.U), k86.j7(k86Var, this.c));
        }
    }

    /* compiled from: Handler.kt */
    public static final class k implements Runnable {
        public k() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            k86 k86Var = k86.this;
            k86Var.D.c(epx.f(k86Var.d.e, UserId.d), k86Var.v.size() > 1, k86Var.o.r.b.d());
        }
    }

    /* compiled from: Handler.kt */
    public static final class l implements Runnable {
        public l() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ViewPropertyAnimator animate;
            ViewPropertyAnimator duration;
            ViewPropertyAnimator alpha;
            View view;
            ViewPropertyAnimator animate2;
            ViewPropertyAnimator alpha2;
            ViewPropertyAnimator duration2;
            ViewPropertyAnimator listener;
            b96 b96Var = k86.this.F;
            if (b96Var != null) {
                y440 y440Var = b96Var.a;
                ContentFeatures contentFeatures = ContentFeatures.STORY_GIF;
                contentFeatures.getClass();
                if (com.vk.toggle.b.A.a(contentFeatures)) {
                    b96.c(b96Var);
                } else {
                    View bottomPanel = y440Var.getBottomPanel();
                    bottomPanel.animate().setDuration(195L).alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setListener(new a96(bottomPanel, b96Var)).start();
                    View trashPreviewBtn = y440Var.getTrashPreviewBtn();
                    if (trashPreviewBtn != null && (animate = trashPreviewBtn.animate()) != null && (duration = animate.setDuration(195L)) != null && (alpha = duration.alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) != null) {
                        alpha.start();
                    }
                    y440Var.Q();
                }
                fov stickersView = y440Var.getStickersView();
                if (stickersView == null || (view = stickersView.getView()) == null || (animate2 = view.animate()) == null || (alpha2 = animate2.alpha(1.0f)) == null || (duration2 = alpha2.setDuration(200L)) == null || (listener = duration2.setListener(null)) == null) {
                    return;
                }
                listener.start();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0250, code lost:
    
        if (r9.a(r2) != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public k86(CameraEditorContentType cameraEditorContentType, StoryCameraTarget storyCameraTarget, CommonUploadParams commonUploadParams, StoryUploadParams storyUploadParams, ArrayList arrayList, di9 di9Var, g440 g440Var) {
        this.c = di9Var;
        this.d = commonUploadParams;
        u440 u440Var = (u440) this;
        this.B = new p1m0(g440Var.getRequireContext().getApplicationContext(), u440Var, new com.vk.movika.sdk.base.hooks.k(u440Var, 3));
        n930.l lVar = n930.l.d;
        this.Q = lVar;
        this.T = new hw5();
        Context requireContext = g440Var.getRequireContext();
        this.U = requireContext;
        com.vk.movika.sdk.base.logic.interactor.h hVar = new com.vk.movika.sdk.base.logic.interactor.h(u440Var, 7);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.W = msy.a(lazyThreadSafetyMode, hVar);
        this.X = msy.a(lazyThreadSafetyMode, new wm1(u440Var, 5));
        Lazy a2 = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.base.logic.interactor.j(u440Var, 10));
        this.Y = a2;
        Lazy a3 = msy.a(lazyThreadSafetyMode, new xm1(u440Var, 5));
        this.Z = a3;
        this.a0 = msy.a(lazyThreadSafetyMode, new la0(3));
        Lazy a4 = msy.a(lazyThreadSafetyMode, new b3(u440Var, 9));
        this.b0 = a4;
        this.c0 = ((w2l0) a4.getValue()).a(0);
        int i2 = 10;
        this.d0 = msy.a(lazyThreadSafetyMode, new na(u440Var, i2));
        this.e0 = new bpn0(new ra0(u440Var, i2));
        Lazy a5 = msy.a(lazyThreadSafetyMode, new s1(u440Var, 8));
        this.f0 = a5;
        Lazy a6 = msy.a(lazyThreadSafetyMode, new u40(u440Var, 3));
        this.g0 = a6;
        this.i0 = new sd(u440Var, 2);
        this.j0 = new y76(u440Var);
        StoriesFeatures storiesFeatures = StoriesFeatures.ST_REACTION_STICKER;
        storiesFeatures.getClass();
        com.vk.toggle.b bVar = com.vk.toggle.b.A;
        if (bVar.a(storiesFeatures)) {
            aqw.o((q7v0) a2.getValue(), "stories:onboarding:reaction", new z76(u440Var, 0));
        }
        this.r = ((StoryEditorExtDepsComponent) ((k7m) m7m.f(this)).a(fpf0.a(StoryEditorExtDepsComponent.class))).R().e();
        StoryEditorExtDepsComponent storyEditorExtDepsComponent = (StoryEditorExtDepsComponent) ((k7m) m7m.f(this)).a(fpf0.a(StoryEditorExtDepsComponent.class));
        gpj0 k7 = storyEditorExtDepsComponent.k7();
        this.V = k7;
        storyEditorExtDepsComponent.Dd().a(new c2(4));
        this.s = g440Var;
        this.j = di9Var;
        this.v = new ArrayList(arrayList);
        this.k = commonUploadParams;
        this.l = storyUploadParams;
        this.w = cameraEditorContentType;
        this.x = storyCameraTarget;
        this.D = new m5p(g440Var);
        vf6 vf6Var = new vf6(new a86(u440Var, 0), new i86(0, g440Var, v76.class, "animationStickerManager", "getAnimationStickerManager()Lcom/vk/stickers/drawing/AnimationChoreographer;", 0), new j86(g440Var, v76.class, "isDefaultEditorState", "isDefaultEditorState()Z", 0), new wl0(u440Var, 6));
        this.m = vf6Var;
        this.n = new f2m0(new a(u440Var));
        p86 p86Var = new p86(requireContext, g440Var, u440Var, vf6Var, di9Var.x(), k7, storyEditorExtDepsComponent.x(), storyEditorExtDepsComponent.O(), (h7v) a3.getValue(), (w2l0) a4.getValue(), a5, (scd) a6.getValue());
        this.o = p86Var;
        p86Var.q.d.a();
        this.q = new qr5();
        D7().t(new tj8(this, g440Var, storyUploadParams));
        StoriesFeatures storiesFeatures2 = StoriesFeatures.ST_STORY_LIFETIME_SAVE;
        storiesFeatures2.getClass();
        boolean a7 = bVar.a(storiesFeatures2);
        n930.i iVar = n930.m.d;
        if (a7) {
            StoriesFeatures storiesFeatures3 = StoriesFeatures.ST_STORY_LIFETIME_48;
            storiesFeatures3.getClass();
            if (!bVar.a(storiesFeatures3)) {
                StoriesFeatures storiesFeatures4 = StoriesFeatures.ST_STORY_LIFETIME_COMM_48;
                storiesFeatures4.getClass();
            }
            this.Q = epx.f(commonUploadParams.e, UserId.d) ? iVar : lVar;
            final boolean Kb = commonUploadParams.Kb();
            io.reactivex.rxjava3.internal.operators.single.v vVar = new io.reactivex.rxjava3.internal.operators.single.v(new Callable() { // from class: xsna.i5m0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return Integer.valueOf((int) Preference.m(Kb ? 24L : 48L, "story_lifetime", "selected_lifetime_hours"));
                }
            });
            asu0 asu0Var = asu0.a;
            this.b.b(vVar.q(asu0Var.c()).m(asu0Var.d()).subscribe(new y50(new dg(u440Var, 7), 3), new b60(new a60(5), 3)));
            this.R = new a600(g440Var, this.b, new b86(u440Var, 0));
            this.k0 = new ft0(u440Var, 3);
            this.l0 = new ux0(u440Var, 4);
            this.m0 = new op0(u440Var, 2);
        }
        StoriesFeatures storiesFeatures5 = StoriesFeatures.ST_STORY_LIFETIME_48;
        storiesFeatures5.getClass();
        if (!bVar.a(storiesFeatures5) || !epx.f(commonUploadParams.e, UserId.d)) {
            StoriesFeatures storiesFeatures6 = StoriesFeatures.ST_STORY_LIFETIME_COMM_48;
            storiesFeatures6.getClass();
            if (!bVar.a(storiesFeatures6) || epx.f(commonUploadParams.e, UserId.d)) {
                iVar = this.Q;
            }
        }
        this.Q = iVar;
        this.R = new a600(g440Var, this.b, new b86(u440Var, 0));
        this.k0 = new ft0(u440Var, 3);
        this.l0 = new ux0(u440Var, 4);
        this.m0 = new op0(u440Var, 2);
    }

    public static final boolean j7(k86 k86Var, UserId userId) {
        int i2 = 0;
        return ((Boolean) k86Var.t6().b.stream().filter(new d86(new fm0(userId, 4), i2)).findAny().map(new e86(new tb4(2), i2)).orElse(Boolean.FALSE)).booleanValue();
    }

    public static n930.i v7(int i2) {
        if (i2 == 1) {
            return n930.k.d;
        }
        if (i2 == 12) {
            return n930.j.d;
        }
        n930.l lVar = n930.l.d;
        return i2 != 24 ? i2 != 48 ? lVar : n930.m.d : lVar;
    }

    @Override // xsna.u76
    public final StoryEditorCameraParams A0() {
        return this.j.x();
    }

    @Override // xsna.u76
    public final void A2() {
        di9 di9Var;
        ArrayList arrayList = this.v;
        hfr.a aVar = new hfr.a(rli0.j(rli0.p(new i5g(arrayList), new db(12)), i.b));
        while (true) {
            boolean hasNext = aVar.hasNext();
            di9Var = this.j;
            if (!hasNext) {
                break;
            }
            grt0 grt0Var = (grt0) aVar.next();
            grt0Var.w();
            if (!grt0Var.n()) {
                di9Var.f();
            }
        }
        hfr.a aVar2 = new hfr.a(rli0.j(rli0.p(new i5g(arrayList), new ht(5)), n86.c));
        while (aVar2.hasNext()) {
            r4g0 r4g0Var = (r4g0) aVar2.next();
            r4g0Var.getVideo().w();
            if (!r4g0Var.getVideo().v) {
                di9Var.f();
            }
        }
    }

    public final void A7() {
        this.E.set(BaseCameraEditorContract$ScreenState.EDITOR_MAIN_SCREEN);
        di9 di9Var = this.j;
        di9Var.setShutterEnabled(true);
        this.s.m();
        D7().r(true);
        if (G7()) {
            di9Var.finish();
        } else {
            di9Var.M();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.u76
    public final void B2() {
        Object obj;
        if (this.G) {
            di9 di9Var = this.j;
            di9Var.N().a.s();
            di9Var.t(E7());
            dl9 dl9Var = ((u440) this).o.a;
            boolean z = false;
            nov novVar = null;
            novVar = null;
            if (dl9Var != null) {
                Iterator<T> it = dl9Var.b.getStickers().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (((nov) obj) instanceof l4g0) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                nov novVar2 = (nov) obj;
                if (novVar2 != null) {
                    l4g0 l4g0Var = (l4g0) novVar2.copy();
                    l4g0Var.setLoadingVisible(false);
                    boolean z2 = l4g0Var instanceof grt0;
                    novVar = l4g0Var;
                    if (z2) {
                        grt0 grt0Var = (grt0) l4g0Var;
                        grt0Var.z();
                        grt0Var.setMute(true);
                        novVar = l4g0Var;
                    }
                }
            }
            if (novVar != null) {
                novVar.setStickerAlpha(50);
                di9Var.N().a(novVar);
            }
            List<nov> stickers = this.s.getStickers();
            int size = stickers.size();
            for (int i2 = 0; i2 < size; i2++) {
                nov novVar3 = stickers.get(i2);
                if (!(novVar3 instanceof l4g0)) {
                    nov copy = novVar3.copy();
                    copy.setStickerAlpha(50);
                    if ((copy instanceof blj) || (copy instanceof qx5)) {
                        copy.setStickerVisible(false);
                    }
                    di9Var.N().a(copy);
                }
            }
            WebStoryBox webStoryBox = di9Var.x().e;
            if (webStoryBox != null && webStoryBox.Db()) {
                z = true;
            }
            this.z = z;
            di9Var.v(true, z);
        }
    }

    @Override // xsna.u76
    public final void C0(String str) {
        Preference.H("text_sticker", "text_sticker", str);
    }

    @Override // xsna.u76
    public final void C1() {
        D7().l();
        D7().r(false);
        ((u440) this).C2(true);
    }

    public final void C7(tam0 tam0Var, StoryUploadParams storyUploadParams, boolean z) {
        OrdData ordData;
        nov novVar;
        StoryServiceItemInfo info;
        StoryServiceItemInfo.Style style;
        D7().m(tam0Var, storyUploadParams);
        storyUploadParams.e = F7(tam0Var);
        storyUploadParams.c = tam0Var.l;
        p86 p86Var = this.o;
        g9m0 g9m0Var = p86Var.r.b;
        if (!ham0.a.contains(g9m0Var.o()) && g9m0Var.l() && epx.f(this.k.e, UserId.d)) {
            String j2 = g9m0Var.o().j();
            storyUploadParams.C = j2;
            if (z) {
                g9m0Var.m(j2);
            }
        }
        storyUploadParams.D = Integer.valueOf(this.Q.c);
        di9 di9Var = this.j;
        storyUploadParams.L = di9Var.x().m.f;
        storyUploadParams.K = storyUploadParams.f == StoryUploadParams.CameraType.AVATAR ? StoriesGetPhotoUploadServerMemoryTypeDto.AVATAR.j() : di9Var.x().m.g;
        Iterator<nov> it = tam0Var.h.a.iterator();
        while (true) {
            ordData = null;
            if (!it.hasNext()) {
                novVar = null;
                break;
            } else {
                novVar = it.next();
                if (novVar instanceof jdm0) {
                    break;
                }
            }
        }
        jdm0 jdm0Var = novVar instanceof jdm0 ? (jdm0) novVar : null;
        Boolean valueOf = (jdm0Var == null || (info = jdm0Var.getInfo()) == null || (style = info.e) == null) ? null : Boolean.valueOf(style.h());
        Boolean m3 = valueOf == null ? ((u440) this).m3() : valueOf;
        if (m3 != null) {
            storyUploadParams.E = m3.booleanValue();
        }
        storyUploadParams.F = epx.f(valueOf, Boolean.TRUE) ? StoriesInvolvementChoice.ONLINE_BOOKING : null;
        OrdData ordData2 = p86Var.q.b.get(Integer.valueOf(this.v.indexOf(tam0Var)));
        if (ordData2 != null && ordData2.b) {
            ordData = ordData2;
        }
        storyUploadParams.z = ordData;
    }

    @Override // xsna.u76
    public final void D3() {
        this.E.set(BaseCameraEditorContract$ScreenState.EDITOR_MAIN_SCREEN);
    }

    @Override // xsna.u76
    public final void D5() {
        z7();
        D7().i(StoryEditorEvents.CANCEL_GRAFFITI);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final y3p D7() {
        return (y3p) this.W.getValue();
    }

    public final w1m0 E7() {
        w1m0.a drawingHistory = this.s.getDrawingHistory();
        tam0 tam0Var = ((u440) this).B0;
        return new w1m0(drawingHistory, this.J, tam0Var != null ? tam0Var.d : null);
    }

    public final Location F7(tam0 tam0Var) {
        File file;
        yaa0 yaa0Var = tam0Var.a;
        boolean z = tam0Var.c;
        Location location = null;
        Uri uri = yaa0Var != null ? yaa0Var.a : null;
        mat0 d2 = tam0Var.d();
        String path = (d2 == null || (file = d2.a) == null) ? null : file.getPath();
        if (!z && tam0Var.f() && uri != null) {
            q6x q6xVar = this.M;
            q6xVar.getClass();
            location = (Location) q6x.p(this.U, uri, new bhh(q6xVar, 13));
        } else if (!z && tam0Var.g() && path != null) {
            location = MediaUtils.a.a(path);
        }
        return location == null ? this.l.e : location;
    }

    public final boolean G7() {
        StoryEditorMode.a aVar = StoryEditorMode.Companion;
        StoryEditorMode storyEditorMode = this.h;
        aVar.getClass();
        int i2 = StoryEditorMode.a.C0915a.$EnumSwitchMapping$0[storyEditorMode.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
        } else if (!this.j.x().k.e) {
            return false;
        }
        return true;
    }

    @Override // xsna.u76
    public final StoryUploadParams H2() {
        StoryUploadParams storyUploadParams = this.l;
        storyUploadParams.getClass();
        return new StoryUploadParams(storyUploadParams);
    }

    public final boolean H7() {
        tam0 tam0Var;
        return (this.h == StoryEditorMode.WITH_BACKGROUND && this.j.x().k.h.b) || ((tam0Var = ((u440) this).B0) != null && tam0Var.q);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004f, code lost:
    
        if (r7.length() > 0) goto L27;
     */
    @Override // xsna.u76
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void I2(String str, String str2) {
        di9 di9Var = this.j;
        String str3 = di9Var.x().m.c;
        gpj0 gpj0Var = this.V;
        if (str == null) {
            str = (str3 == null || str3.length() == 0) ? gpj0Var.c() : str3;
        }
        int a2 = y8g0.a(R.dimen.story_view_avatar_size);
        ImageList f2 = gpj0Var.f();
        int i2 = 0;
        Image Cb = f2 != null ? f2.Cb(a2, false) : null;
        String str4 = di9Var.x().m.d;
        if (str2 == null) {
            if (str4 == null || str4.length() == 0) {
                if (Cb != null) {
                    str2 = Cb.d;
                }
                this.s.ki(null, str);
                return;
            }
            str2 = str4;
        }
        io.reactivex.rxjava3.internal.operators.observable.m1 a0 = mcr0.h(Uri.parse(str2)).r0(n0).a0(asu0.a.d());
        n20 n20Var = new n20(new g86(i2, this, str), 4);
        int i3 = kwg0.a;
        this.b.b(a0.subscribe(n20Var, new iwg0()));
    }

    public abstract boolean I7();

    @Override // xsna.u76
    public final void J2(UserId userId) {
        this.i.postDelayed(new j(userId), 500L);
    }

    public final void J7(boolean z) {
        tam0 tam0Var;
        di9 di9Var = this.j;
        boolean z2 = di9Var.x().k.i;
        V v = this.s;
        if ((z2 || di9Var.x().k.j) && (tam0Var = ((u440) this).B0) != null && tam0Var.a()) {
            v.setOpenCameraVisible(false);
            v.setChangePhotoVisible(z);
        } else {
            v.setChangePhotoVisible(false);
            v.setOpenCameraVisible(z && H7());
        }
    }

    public final void K7() {
        nov novVar;
        CopyOnWriteArrayList<nov> copyOnWriteArrayList = this.s.getStickersState().a;
        int i2 = 0;
        while (true) {
            if (i2 == copyOnWriteArrayList.size()) {
                novVar = null;
                break;
            } else {
                if (copyOnWriteArrayList.get(i2) instanceof si9) {
                    novVar = copyOnWriteArrayList.get(i2);
                    break;
                }
                i2++;
            }
        }
        if (novVar == null) {
            return;
        }
        M7(novVar);
    }

    public final void L7() {
        nov novVar;
        qx5 e2;
        WebStoryBox webStoryBox;
        tam0 tam0Var = ((u440) this).B0;
        di9 di9Var = this.j;
        V v = this.s;
        AtomicReference<BaseCameraEditorContract$ScreenState> atomicReference = this.E;
        if (tam0Var != null && (e2 = v.getStickersState().e()) != null && ((webStoryBox = di9Var.x().e) == null || !webStoryBox.Db() || atomicReference.get() != BaseCameraEditorContract$ScreenState.BACKGROUND || e2.v0())) {
            WebStoryBox webStoryBox2 = di9Var.x().e;
            if (webStoryBox2 != null && webStoryBox2.Db() && atomicReference.get() == BaseCameraEditorContract$ScreenState.BACKGROUND) {
                this.e = E7().b;
                e2.r();
                this.f = e2;
            } else {
                e2.w();
            }
            M7(e2);
            List<mat0> list = tam0Var.b;
            ArrayList arrayList = new ArrayList();
            for (mat0 mat0Var : list) {
                if (!mat0Var.g) {
                    arrayList.add(mat0Var);
                }
            }
            tam0Var.b = arrayList;
        }
        CopyOnWriteArrayList<nov> copyOnWriteArrayList = v.getStickersState().a;
        int i2 = 0;
        while (true) {
            if (i2 == copyOnWriteArrayList.size()) {
                novVar = null;
                break;
            } else {
                if (copyOnWriteArrayList.get(i2) instanceof yv5) {
                    novVar = copyOnWriteArrayList.get(i2);
                    break;
                }
                i2++;
            }
        }
        if (novVar == null) {
            return;
        }
        WebStoryBox webStoryBox3 = di9Var.x().e;
        if (webStoryBox3 != null && webStoryBox3.Db() && atomicReference.get() == BaseCameraEditorContract$ScreenState.BACKGROUND) {
            this.e = E7().b;
            this.g = novVar;
        }
        M7(novVar);
    }

    @Override // xsna.u76
    public final void M(nov novVar) {
        if ((novVar instanceof c8m0) || (novVar instanceof abm0)) {
            D7().i(StoryEditorEvents.ADD_STICKER);
        }
        if (this.N == null) {
            this.N = new Matrix(novVar.getStickerMatrix());
        }
        boolean z = true;
        if (novVar instanceof h7m0) {
            this.n.a(true);
            this.j.i();
        }
        if (novVar instanceof bij) {
            bij bijVar = (bij) novVar;
            if (!bijVar.h()) {
                sd sdVar = this.i0;
                i0q0.g(sdVar);
                this.P.incrementAndGet();
                O7(false);
                bijVar.j(this.j0);
                i0q0.d(10000L, sdVar);
            }
        }
        w7();
        tam0 tam0Var = ((u440) this).B0;
        p86 p86Var = this.o;
        if (tam0Var == null) {
            p86Var.getClass();
        } else {
            p86Var.s.a(tam0Var);
            p86Var.t.getClass();
            Iterator<nov> it = tam0Var.h.a.iterator();
            while (it.hasNext() && !(it.next() instanceof abm0)) {
            }
        }
        StoriesFeatures storiesFeatures = StoriesFeatures.ST_TAB_STYLE_PICKER;
        storiesFeatures.getClass();
        if (com.vk.toggle.b.A.a(storiesFeatures)) {
            V v = this.s;
            if (v.getStickers().size() == 1) {
                t9l0 t9l0Var = this.K;
                if (t9l0Var != null) {
                    t9l0Var.k(novVar);
                    return;
                }
                return;
            }
            if (!(novVar instanceof dh9) && !(novVar instanceof qx5)) {
                z = false;
            }
            if (z) {
                return;
            }
            v.Wa();
        }
    }

    public final void M7(nov novVar) {
        this.s.r2(novVar);
    }

    @Override // xsna.u76
    public final di9 N5() {
        return this.j;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    public final void N7(Bitmap bitmap) {
        this.J = bitmap;
        int i2 = bitmap.hasAlpha() ? -16777216 : 0;
        V v = this.s;
        v.setBackgroundImageColor(i2);
        v.setBackgroundImage(bitmap);
        this.T.getClass();
        int a2 = hw5.a(bitmap);
        y2l0 a3 = ((w2l0) this.b0.getValue()).a(a2);
        this.c0 = a3;
        v.nh(a2, a3);
    }

    public final void O7(boolean z) {
        V v = this.s;
        if (z) {
            v.ik();
        } else {
            v.m9(1000L);
        }
        this.y = z;
        v.setContentLoaded(z);
        boolean z2 = false;
        boolean z3 = z && this.y;
        q3p q3pVar = this.u;
        if (q3pVar != null) {
            q3pVar.setSelectRecipientsEnabled(z3);
        }
        boolean z4 = z && this.y;
        q3p q3pVar2 = this.u;
        if (q3pVar2 != null) {
            q3pVar2.setInstantSendEnabled(z4);
        }
        if (z && this.y) {
            z2 = true;
        }
        v.setOpenCameraEnabled(z2);
        this.j.setShutterEnabled(z);
        if (this.I) {
            ((u440) this).K();
        }
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
    public final void P7() {
        AtomicReference<BaseCameraEditorContract$ScreenState> atomicReference;
        BaseCameraEditorContract$ScreenState baseCameraEditorContract$ScreenState = BaseCameraEditorContract$ScreenState.EDITOR_MAIN_SCREEN;
        BaseCameraEditorContract$ScreenState baseCameraEditorContract$ScreenState2 = BaseCameraEditorContract$ScreenState.STICKERS_SELECTION;
        do {
            atomicReference = this.E;
            if (atomicReference.compareAndSet(baseCameraEditorContract$ScreenState, baseCameraEditorContract$ScreenState2)) {
                this.C.c = true;
                this.s.Ha(this.h0);
                if (this.h0) {
                    this.h0 = false;
                    StoriesFeatures storiesFeatures = StoriesFeatures.ST_REACTION_STICKER;
                    storiesFeatures.getClass();
                    if (com.vk.toggle.b.A.a(storiesFeatures)) {
                        aqw.o((q7v0) this.Y.getValue(), "stories:onboarding:reaction", new x76(this, 0));
                    }
                }
                this.i.postDelayed(new l(), 32L);
                return;
            }
        } while (atomicReference.get() == baseCameraEditorContract$ScreenState);
    }

    @Override // xsna.u76
    public final f2m0 Q2() {
        return this.n;
    }

    @Override // xsna.u76
    public final void Q3(BaseCameraEditorContract$ScreenState baseCameraEditorContract$ScreenState) {
        this.E.set(baseCameraEditorContract$ScreenState);
    }

    public final void Q7(Bitmap bitmap, Bitmap bitmap2, BackgroundInfo backgroundInfo) {
        L7();
        int i2 = bitmap.hasAlpha() ? -16777216 : 0;
        V v = this.s;
        v.setBackgroundImageColor(i2);
        if (bitmap2 == null || ((u440) this).B0 == null) {
            v.setBackgroundImage(bitmap);
        } else {
            TransitionDrawable transitionDrawable = new TransitionDrawable(new BitmapDrawable[]{new BitmapDrawable(v.getRequireContext().getResources(), bitmap2), new BitmapDrawable(v.getRequireContext().getResources(), bitmap)});
            v.setBackgroundImage(transitionDrawable);
            transitionDrawable.startTransition(300);
        }
        this.T.getClass();
        v.nh(hw5.a(bitmap), null);
        u440 u440Var = (u440) this;
        tam0 tam0Var = u440Var.B0;
        if (tam0Var != null) {
            tam0Var.t = bitmap;
            if (backgroundInfo == null) {
                Serializer.c<BackgroundInfo> cVar = BackgroundInfo.CREATOR;
                backgroundInfo = BackgroundInfo.a.a();
            }
            tam0Var.d = backgroundInfo;
        }
        u440Var.j8();
    }

    @Override // xsna.u76
    public final void S2(b96 b96Var) {
        this.F = b96Var;
    }

    @Override // xsna.u76
    public final void T(StoryCameraTarget storyCameraTarget) {
        this.s.T(storyCameraTarget);
    }

    @Override // xsna.u76
    public final void T2(t9l0 t9l0Var) {
        this.K = t9l0Var;
    }

    @Override // xsna.u76
    public final void U2() {
        CommonUploadParams commonUploadParams = this.k;
        UserId e2 = !epx.f(commonUploadParams.e, UserId.d) ? fkq0.e(commonUploadParams.e) : commonUploadParams.b;
        if (this.o.r.b.a().b.isEmpty() || this.j.x().e()) {
            return;
        }
        D7().i(StoryEditorEvents.SHOW_BUBBLE_LONGTAP);
        this.s.Y8(e2);
    }

    @Override // xsna.u76
    public final void V(boolean z) {
        this.s.setNeedRequestAudioFocus(z);
    }

    @Override // xsna.u76
    public final String W() {
        return Preference.s("text_sticker", "text_sticker", "");
    }

    @Override // xsna.u76
    public final void W4(boolean z, boolean z2) {
        this.G = z || z2;
        V v = this.s;
        v.setEditorViewsEnabled(z);
        v.setDrawingViewsEnabled(z2);
    }

    @Override // xsna.u76
    public final void X2() {
        if (!this.s.getStickersState().r()) {
            p1m0 p1m0Var = this.B;
            p1m0Var.b = null;
            p1m0Var.c = 0;
            p1m0Var.d = 0;
            this.j.f();
        }
        this.n.c(false);
    }

    @Override // xsna.u76
    public final void Y3(boolean z) {
        J7(z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00bd, code lost:
    
        if (((r2 == null || !r2.isVisible()) ? false : r2.a0()) == true) goto L64;
     */
    @Override // xsna.u76
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a0() {
        Matrix matrix;
        ppr0 ppr0Var;
        if (!this.G) {
            return true;
        }
        AtomicReference<BaseCameraEditorContract$ScreenState> atomicReference = this.E;
        BaseCameraEditorContract$ScreenState baseCameraEditorContract$ScreenState = atomicReference.get();
        int i2 = baseCameraEditorContract$ScreenState == null ? -1 : b.$EnumSwitchMapping$0[baseCameraEditorContract$ScreenState.ordinal()];
        V v = this.s;
        if (i2 != 1) {
            if (i2 == 2) {
                gyl0 gyl0Var = this.p;
                if (gyl0Var != null) {
                    gyl0Var.a0();
                }
            } else if (i2 == 3) {
                b96 b96Var = this.F;
                if (b96Var != null) {
                    fov stickersView = b96Var.a.getStickersView();
                }
                r1 = false;
                if (!r1) {
                    o5().g();
                    f7();
                }
            } else if (i2 != 4) {
                if (i2 == 5 && (ppr0Var = v.getVerticalizationDelegate().k) != null) {
                    ppr0.a aVar = ppr0Var.h;
                    if (aVar != null) {
                        aVar.a();
                    }
                    ppr0Var.h();
                }
            } else if (!jjc.b() && !((u440) this).I7()) {
                boolean z = this.J == null;
                zcl0 stickersState = v.getStickersState();
                boolean z2 = stickersState.a.size() == 1 && (matrix = this.N) != null && matrix.equals(stickersState.a.get(0).getStickerMatrix());
                if (v.C2() && z2 && z) {
                    A7();
                } else {
                    v.S3(this.w == CameraEditorContentType.STORY, new bb(this, 8), new cb(this, 8));
                }
            }
        } else if (v.C2()) {
            z7();
        } else {
            v.Ib();
        }
        return rl3.y0(new BaseCameraEditorContract$ScreenState[]{BaseCameraEditorContract$ScreenState.DRAWING, BaseCameraEditorContract$ScreenState.BACKGROUND, BaseCameraEditorContract$ScreenState.STICKERS_SELECTION, BaseCameraEditorContract$ScreenState.EDITOR_MAIN_SCREEN, BaseCameraEditorContract$ScreenState.VERTICALIZATION}).contains(atomicReference.get());
    }

    @Override // xsna.u76
    public final void a3(gyl0 gyl0Var) {
        this.p = gyl0Var;
    }

    @Override // xsna.u76
    public final v2l0 b7() {
        return this.c0;
    }

    @Override // xsna.u76
    public final a600 c3() {
        return this.R;
    }

    @Override // xsna.u76
    public final void d5() {
        AtomicReference<BaseCameraEditorContract$ScreenState> atomicReference;
        if (I7()) {
            return;
        }
        BaseCameraEditorContract$ScreenState baseCameraEditorContract$ScreenState = BaseCameraEditorContract$ScreenState.EDITOR_MAIN_SCREEN;
        BaseCameraEditorContract$ScreenState baseCameraEditorContract$ScreenState2 = BaseCameraEditorContract$ScreenState.BACKGROUND;
        do {
            atomicReference = this.E;
            if (atomicReference.compareAndSet(baseCameraEditorContract$ScreenState, baseCameraEditorContract$ScreenState2)) {
                b96 b96Var = this.F;
                if (b96Var != null) {
                    DecelerateInterpolator decelerateInterpolator = qq2.b;
                    y440 y440Var = b96Var.a;
                    y440Var.getBottomPanel().setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    y440Var.getBottomPanel().setVisibility(0);
                    y440Var.getCloseButtonBackground().setAlpha(1.0f);
                    y440Var.getCloseButtonBackground().setVisibility(0);
                    y440Var.getTopButtonsPanel().setAlpha(1.0f);
                    y440Var.getTopButtonsPanel().setVisibility(0);
                    y440Var.getEndButtonsPanel().setAlpha(1.0f);
                    y440Var.getEndButtonsPanel().setVisibility(0);
                    AnimatorSet animatorSet = new AnimatorSet();
                    View bottomPanel = y440Var.getBottomPanel();
                    Property property = View.TRANSLATION_Y;
                    float f2 = b96.c;
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(bottomPanel, (Property<View, Float>) property, f2);
                    View closeButtonBackground = y440Var.getCloseButtonBackground();
                    Property property2 = View.ALPHA;
                    animatorSet.playTogether(rl3.I(new Animator[]{ofFloat, ObjectAnimator.ofFloat(closeButtonBackground, (Property<View, Float>) property2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), ObjectAnimator.ofFloat(y440Var.getTopButtonsPanel(), (Property<ViewGroup, Float>) property2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), ObjectAnimator.ofFloat(y440Var.getEndButtonsPanel(), (Property<View, Float>) property2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), ObjectAnimator.ofFloat(y440Var.getStylePicker(), (Property<View, Float>) property2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), y440Var.S(f2, decelerateInterpolator)}));
                    animatorSet.setInterpolator(decelerateInterpolator);
                    animatorSet.setDuration(112L);
                    animatorSet.addListener(new d96(b96Var));
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    animatorSet2.playTogether(ObjectAnimator.ofFloat(y440Var.getBackgroundEditorTopView(), (Property<View, Float>) property2, 1.0f), ObjectAnimator.ofFloat(y440Var.getBackgroundEditorBottomView(), (Property<View, Float>) property, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                    animatorSet2.setInterpolator(decelerateInterpolator);
                    animatorSet2.setDuration(112L);
                    AnimatorSet animatorSet3 = new AnimatorSet();
                    animatorSet3.playSequentially(animatorSet, animatorSet2);
                    animatorSet3.start();
                }
                gyl0 gyl0Var = this.p;
                if (gyl0Var != null) {
                    gyl0Var.I();
                }
                V v = this.s;
                v.Eg(false);
                o5().i(StoryEditorEvents.OPEN_BACKGROUND_EDITOR);
                dh9 f3 = v.getStickersState().f();
                if (f3 == null) {
                    return;
                }
                StoryEditorMode storyEditorMode = this.h;
                StoryEditorMode storyEditorMode2 = StoryEditorMode.WITH_BACKGROUND;
                di9 di9Var = this.j;
                if (storyEditorMode == storyEditorMode2 && !di9Var.x().k.f) {
                    f3.setStickerVisible(false);
                    v.J9();
                    return;
                }
                if (this.h == StoryEditorMode.DEFAULT || di9Var.x().k.f) {
                    if (di9Var.x().k.f) {
                        f3.setStickerVisible(false);
                        v.J9();
                        return;
                    }
                    float c2 = f3.getCommons().c();
                    if (!f3.B0() || c2 < f3.getOriginalStickerScale() * 0.98f) {
                        return;
                    }
                    this.H = Float.valueOf(c2);
                    this.i.postDelayed(new f(f3), 100L);
                    return;
                }
                return;
            }
        } while (atomicReference.get() == baseCameraEditorContract$ScreenState);
    }

    @Override // xsna.u76
    public final void e3(boolean z) {
        if (z) {
            return;
        }
        D7().h();
        P7();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.u76
    public final void f(nov novVar) {
        t9l0 t9l0Var;
        Object n;
        if (novVar instanceof xlo0) {
            o5().i(StoryEditorEvents.DELETE_TEXT);
        } else if (!((Boolean) this.a0.getValue()).booleanValue() || !(novVar instanceof si9)) {
            o5().i(StoryEditorEvents.DELETE_STICKER);
        }
        if (novVar instanceof sov) {
            p1m0 p1m0Var = this.B;
            p1m0Var.d();
            p1m0Var.b = null;
            p1m0Var.c = 0;
            p1m0Var.d = 0;
            this.j.f();
            this.n.a(false);
        }
        boolean z = novVar instanceof grt0;
        V v = this.s;
        if (z) {
            SimpleVideoView simpleVideoView = ((grt0) novVar).r;
            if (((simpleVideoView != null ? simpleVideoView.I : false) || (novVar instanceof dh9)) && (n = rli0.n(rli0.j(new i5g(v.getStickers()), g.b))) != null) {
                ((grt0) n).u();
            }
        }
        StoriesFeatures storiesFeatures = StoriesFeatures.ST_TAB_STYLE_PICKER;
        storiesFeatures.getClass();
        if (com.vk.toggle.b.A.a(storiesFeatures)) {
            List<nov> stickers = v.getStickers();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = stickers.iterator();
            while (true) {
                boolean z2 = true;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                nov novVar2 = (nov) next;
                if (!(novVar2 instanceof dh9) && !(novVar2 instanceof qx5)) {
                    z2 = false;
                }
                if (!z2) {
                    arrayList.add(next);
                }
            }
            if (arrayList.size() == 1 && (t9l0Var = this.K) != null) {
                t9l0Var.k((nov) j5g.Y(arrayList));
            }
        }
        if (novVar instanceof bij) {
            ((bij) novVar).k(this.j0);
        }
    }

    @Override // xsna.u76
    public final void f7() {
        this.E.set(BaseCameraEditorContract$ScreenState.EDITOR_MAIN_SCREEN);
        b96 b96Var = this.F;
        if (b96Var != null) {
            b96Var.d();
            b96Var.f();
        }
    }

    @Override // xsna.u76
    public final void g3() {
        this.i.postDelayed(new k(), 500L);
    }

    @Override // xsna.u76
    public final BaseCameraEditorContract$ScreenState getCurrentState() {
        return this.E.get();
    }

    @Override // xsna.u76
    public final StoryPrivacyType getPrivacy() {
        return this.o.r.b.o();
    }

    @Override // xsna.u76
    public final StoryCameraTarget getTarget() {
        return this.x;
    }

    @Override // xsna.u76
    public final void h3() {
        D7().l();
        D7().r(false);
        ((u440) this).C2(false);
    }

    @Override // xsna.u76
    public final void i4() {
        P7();
    }

    @Override // xsna.fyl0
    public final void i7(Bitmap bitmap, boolean z, avj0 avj0Var) {
        if (!z) {
            u7(bitmap, avj0Var);
        } else {
            this.s.pk(new w76(this, bitmap, avj0Var, 0));
        }
    }

    @Override // xsna.u76
    public final hi9 j3() {
        return this.C;
    }

    @Override // xsna.u76
    public final CommonUploadParams k3() {
        return this.k;
    }

    @Override // xsna.u76
    public final void k7() {
        this.j.i();
        f2m0 f2m0Var = this.n;
        f2m0Var.c(true);
        f2m0Var.a.a.B.a.setVolume(1.0f);
    }

    @Override // xsna.u76
    public final Location l3() {
        tam0 tam0Var = ((u440) this).B0;
        if (tam0Var != null) {
            return F7(tam0Var);
        }
        return null;
    }

    @Override // xsna.u76
    public final r76 o5() {
        return (r76) this.e0.getValue();
    }

    @Override // xsna.u76
    public final void onClose() {
        this.S = true;
    }

    @Override // xsna.u76
    public final void p4(nov novVar) {
        if (novVar instanceof h7m0) {
            this.n.a(true);
        } else if (novVar instanceof d7g0) {
            this.s.setEditorViewsEnabled(true);
        }
    }

    @Override // xsna.u76
    public final void p6() {
        if (this.j.x().k.h.c) {
            x2(false);
        }
    }

    @Override // xsna.u76
    public final boolean q7() {
        StorySharingInfo storySharingInfo;
        return this.l.y == null && (storySharingInfo = this.k.g) != null && storySharingInfo.k;
    }

    @Override // xsna.fyl0
    public final void r1(boolean z) {
        dh9 f2;
        o5().i(StoryEditorEvents.CANCEL_BACKGROUND_EDITOR);
        y7();
        V v = this.s;
        for (nov novVar : v.getStickers()) {
            if (novVar instanceof dh9) {
                novVar.setStickerVisible(true);
            }
        }
        this.O.invoke(null);
        StoryEditorMode storyEditorMode = this.h;
        StoryEditorMode storyEditorMode2 = StoryEditorMode.DEFAULT;
        di9 di9Var = this.j;
        if ((storyEditorMode == storyEditorMode2 || di9Var.x().k.f) && this.H != null && z && (f2 = v.getStickersState().f()) != null) {
            tal0.a(this.H.floatValue(), f2);
        }
        this.H = null;
        WebStoryBox webStoryBox = di9Var.x().e;
        if (webStoryBox != null && webStoryBox.Db()) {
            nov novVar2 = this.g;
            if (novVar2 != null) {
                v.v2(novVar2);
                this.g = null;
            }
            qx5 qx5Var = this.f;
            if (qx5Var != null) {
                v.v2(qx5Var);
                qx5Var.u();
                this.f = null;
            }
            Bitmap bitmap = this.e;
            if (bitmap != null) {
                v.setBackgroundImage(bitmap);
                this.e = null;
            }
        }
        v.J9();
    }

    @Override // xsna.u76
    public final p1m0 s4() {
        return this.B;
    }

    @Override // xsna.u76
    public final boolean s6() {
        return this.o.r.b.l();
    }

    @Override // xsna.u76
    public final void setEditorTouchesEnabled(boolean z) {
        W4(z, false);
        this.s.setStickersViewTouchesEnabled(z);
    }

    @Override // xsna.u76
    public final void setMsgType(MsgType msgType) {
        this.k.i = msgType;
    }

    @Override // xsna.u76
    public final void t() {
        z7();
        D7().i(StoryEditorEvents.APPLY_GRAFFITI);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.u76
    public final com.vk.stickers.api.styles.b t0() {
        return (com.vk.stickers.api.styles.b) this.d0.getValue();
    }

    @Override // xsna.fyl0
    public final void t3(Bitmap bitmap, Bitmap bitmap2, BackgroundInfo backgroundInfo) {
        Q7(bitmap, bitmap2, backgroundInfo);
        this.O.invoke(bitmap);
        o5().i(StoryEditorEvents.SELECT_BACKGROUND);
    }

    @Override // xsna.u76
    public final VkPaginationList<Group> t6() {
        return this.o.r.b.a();
    }

    @Override // xsna.fyl0
    public final boolean u0() {
        tam0 tam0Var;
        nov novVar;
        nov novVar2;
        if (this.s.getStickersState().f() == null && (tam0Var = ((u440) this).B0) != null) {
            zcl0 zcl0Var = tam0Var.h;
            if (tam0Var.g) {
                boolean t = zcl0Var.t();
                CopyOnWriteArrayList<nov> copyOnWriteArrayList = zcl0Var.a;
                if (!t && !tam0Var.a()) {
                    int i2 = 0;
                    while (true) {
                        novVar = null;
                        if (i2 == copyOnWriteArrayList.size()) {
                            novVar2 = null;
                            break;
                        }
                        if (copyOnWriteArrayList.get(i2) instanceof p550) {
                            novVar2 = copyOnWriteArrayList.get(i2);
                            break;
                        }
                        i2++;
                    }
                    if (((p550) novVar2) == null) {
                        int i3 = 0;
                        while (true) {
                            if (i3 == copyOnWriteArrayList.size()) {
                                break;
                            }
                            if (copyOnWriteArrayList.get(i3) instanceof eeb0) {
                                novVar = copyOnWriteArrayList.get(i3);
                                break;
                            }
                            i3++;
                        }
                        if (((eeb0) novVar) == null && this.j.x().l.d == null && tam0Var.d == null && !zcl0Var.s()) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void u7(Bitmap bitmap, avj0 avj0Var) {
        tam0 tam0Var;
        List<mat0> list;
        y7();
        this.J = bitmap;
        if (this.h == StoryEditorMode.WITH_BACKGROUND && this.j.x().k.f) {
            hfr.a aVar = new hfr.a(rli0.j(new i5g(new fgg0(this.s.getStickers())), l86.c));
            while (aVar.hasNext()) {
                dh9 dh9Var = (dh9) aVar.next();
                lo9 lo9Var = dh9Var instanceof lo9 ? (lo9) dh9Var : null;
                if (lo9Var != null && (tam0Var = ((u440) this).B0) != null && (list = tam0Var.b) != null) {
                    list.removeIf(new c86(new t6(lo9Var, 9), 0));
                }
                M7(dh9Var);
            }
        }
        o5().i(StoryEditorEvents.APPLY_BACKGROUND);
        avj0Var.invoke();
        ((u440) this).j8();
    }

    @Override // xsna.u76
    public final void v2(nov novVar) {
        this.s.v2(novVar);
    }

    @Override // xsna.u76
    public final p86 w2() {
        return this.o;
    }

    public final void w7() {
        z4p z4pVar = this.t;
        if (z4pVar != null) {
            V v = this.s;
            boolean z = rli0.n(rli0.j(new i5g(v.getStickers()), c.b)) != null ? !((oit0) r2).n() : false;
            Object n = rli0.n(rli0.j(new i5g(v.getStickers()), d.b));
            if (n != null) {
                p4g0 video = ((r4g0) n).getVideo();
                z = (video == null || video.v) ? false : true;
            }
            z4pVar.setMuteButtonVisible(z);
            if (z) {
                this.j.i();
            }
        }
    }

    @Override // xsna.u76
    public final void x2(boolean z) {
        AtomicReference<BaseCameraEditorContract$ScreenState> atomicReference;
        if (this.s.J8()) {
            BaseCameraEditorContract$ScreenState baseCameraEditorContract$ScreenState = BaseCameraEditorContract$ScreenState.EDITOR_MAIN_SCREEN;
            BaseCameraEditorContract$ScreenState baseCameraEditorContract$ScreenState2 = BaseCameraEditorContract$ScreenState.ADD_TEXT;
            do {
                atomicReference = this.E;
                if (atomicReference.compareAndSet(baseCameraEditorContract$ScreenState, baseCameraEditorContract$ScreenState2)) {
                    this.i.postDelayed(new h(), z ? 195 : 0);
                    return;
                }
            } while (atomicReference.get() == baseCameraEditorContract$ScreenState);
        }
    }

    @Override // xsna.u76
    public final StoryCameraMode x3() {
        return this.j.getCurrentState();
    }

    public final void x7() {
        if (this.I) {
            p1m0 p1m0Var = this.B;
            q850 q850Var = p1m0Var.a;
            q850 q850Var2 = p1m0Var.a;
            if (q850Var.d.b()) {
                return;
            }
            V v = this.s;
            oit0 m = v.getStickersState().m();
            grt0 grt0Var = m instanceof grt0 ? (grt0) m : null;
            if (grt0Var == null) {
                q850.a aVar = q850Var2.f;
                if (aVar != null) {
                    q850Var2.q(q850.a.a(aVar, null, 0, 0, false, null, 55));
                }
                p1m0Var.b(true);
                return;
            }
            SimpleVideoView simpleVideoView = grt0Var.r;
            if (simpleVideoView != null && simpleVideoView.getCurrentState() == 2 && p1m0Var.b != null && epx.f(q850Var2.i, u850.f.a)) {
                p1m0Var.b(true);
                grt0Var.u();
            } else {
                if (v.getStickersState().r()) {
                    return;
                }
                grt0Var.u();
            }
        }
    }

    @Override // xsna.u76
    public final boolean y6() {
        return this.j.x().l.f != null;
    }

    public final void y7() {
        this.E.set(BaseCameraEditorContract$ScreenState.EDITOR_MAIN_SCREEN);
        W4(true, false);
        V v = this.s;
        v.Eg(true);
        b96 b96Var = this.F;
        if (b96Var != null) {
            y440 y440Var = b96Var.a;
            y440Var.getBackgroundEditorTopView().setVisibility(0);
            y440Var.getBackgroundEditorBottomView().setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            y440Var.getBackgroundEditorBottomView().setVisibility(0);
            y440Var.getCloseButtonBackground().setVisibility(8);
            y440Var.getTopButtonsPanel().setVisibility(8);
            y440Var.getEndButtonsPanel().setVisibility(8);
            y440Var.getBottomPanel().setVisibility(8);
            View trashPreviewBtn = y440Var.getTrashPreviewBtn();
            if (trashPreviewBtn != null) {
                trashPreviewBtn.setVisibility(8);
            }
            y440Var.getStylePicker().setVisibility(8);
            AnimatorSet animatorSet = new AnimatorSet();
            View backgroundEditorTopView = y440Var.getBackgroundEditorTopView();
            Property property = View.ALPHA;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(backgroundEditorTopView, (Property<View, Float>) property, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            View backgroundEditorBottomView = y440Var.getBackgroundEditorBottomView();
            Property property2 = View.TRANSLATION_Y;
            animatorSet.playTogether(ofFloat, ObjectAnimator.ofFloat(backgroundEditorBottomView, (Property<View, Float>) property2, b96.b));
            animatorSet.addListener(new w86(b96Var));
            animatorSet.setInterpolator(qq2.c);
            animatorSet.setDuration(112L);
            DecelerateInterpolator decelerateInterpolator = qq2.b;
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playTogether(rl3.I(new Animator[]{ObjectAnimator.ofFloat(y440Var.getBottomPanel(), (Property<View, Float>) property2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), ObjectAnimator.ofFloat(y440Var.getCloseButtonBackground(), (Property<View, Float>) property, 1.0f), ObjectAnimator.ofFloat(y440Var.getTopButtonsPanel(), (Property<ViewGroup, Float>) property, 1.0f), ObjectAnimator.ofFloat(y440Var.getEndButtonsPanel(), (Property<View, Float>) property, 1.0f), y440Var.Z(b96.c, decelerateInterpolator), y440Var.V() ? ObjectAnimator.ofFloat(y440Var.getStylePicker(), (Property<View, Float>) property, 1.0f) : null}));
            animatorSet2.setInterpolator(decelerateInterpolator);
            animatorSet2.setDuration(112L);
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.playSequentially(animatorSet, animatorSet2);
            animatorSet3.addListener(new x86(b96Var));
            animatorSet3.start();
        }
        dh9 f2 = v.getStickersState().f();
        if (f2 == null) {
            return;
        }
        f2.setStickerVisible(true);
        if (this.h == StoryEditorMode.DEFAULT || !this.j.x().k.f) {
            float c2 = f2.getCommons().c();
            if (!f2.B0() || c2 < f2.getOriginalStickerScale() * 0.98f) {
                return;
            }
            this.i.postDelayed(new e(f2), 100L);
        }
    }

    @Override // xsna.fyl0
    public final StoryBackgroundType z() {
        return this.j.x().k.c;
    }

    @Override // xsna.u76
    public final void z0() {
        int i2;
        tam0 tam0Var = ((u440) this).B0;
        if (tam0Var == null) {
            return;
        }
        zcl0 zcl0Var = tam0Var.h;
        CopyOnWriteArrayList<nov> copyOnWriteArrayList = zcl0Var.a;
        if (copyOnWriteArrayList.isEmpty()) {
            i2 = 0;
        } else {
            Iterator<nov> it = copyOnWriteArrayList.iterator();
            i2 = 0;
            while (it.hasNext()) {
                if ((it.next() instanceof bij) && (i2 = i2 + 1) < 0) {
                    e43.s();
                    throw null;
                }
            }
        }
        AtomicInteger atomicInteger = this.P;
        if (atomicInteger.addAndGet(i2) > 0) {
            O7(false);
            i0q0.d(10000L, this.i0);
        } else {
            O7(true);
        }
        Iterator<nov> it2 = copyOnWriteArrayList.iterator();
        while (it2.hasNext()) {
            nov next = it2.next();
            if (next instanceof bij) {
                bij bijVar = (bij) next;
                if (!bijVar.h()) {
                    bijVar.j(this.j0);
                } else if (atomicInteger.decrementAndGet() < 1) {
                    O7(true);
                }
            }
        }
        Iterator<nov> it3 = zcl0Var.a.iterator();
        while (it3.hasNext()) {
            nov next2 = it3.next();
            if (next2 instanceof l4g0) {
                ((l4g0) next2).setLoadingVisible(false);
            } else {
                boolean z = next2 instanceof grt0;
                V v = this.s;
                f2m0 f2m0Var = this.n;
                if (z) {
                    grt0 grt0Var = (grt0) next2;
                    if (!grt0Var.u) {
                        grt0Var.z();
                    }
                    if (v.getStickersState().r()) {
                        f2m0Var.a(true);
                    }
                } else if (next2 instanceof r4g0) {
                    p4g0 video = ((r4g0) next2).getVideo();
                    if (video != null && !video.u) {
                        video.z();
                    }
                    if (v.getStickersState().r()) {
                        f2m0Var.a(true);
                    }
                } else if (next2 instanceof h7m0) {
                    StoryMusicInfo info = ((h7m0) next2).getInfo();
                    if (!info.j) {
                        this.B.c(info.b, info.d, info.e, info.f);
                        f2m0Var.a(true);
                    }
                }
            }
        }
    }

    @Override // xsna.u76
    public final void z1(ArrayList arrayList, int i2, izs izsVar) {
        this.s.z1(arrayList, i2, izsVar);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(12:5|(1:7)(1:27)|8|(1:10)(1:26)|11|12|13|(1:15)(1:22)|16|(1:18)|19|20)(2:28|(2:32|33)))|34|35|36|(1:38)|39|20) */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0093, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0094, code lost:
    
        com.vk.log.L.g("Can't parse date from exif", r0);
     */
    @Override // xsna.u76
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final m0g0 z4() {
        m0g0 m0g0Var;
        mat0 d2;
        String str;
        tam0 tam0Var = ((u440) this).B0;
        Date date = null;
        if (!tam0Var.c) {
            if (tam0Var.f()) {
                yaa0 yaa0Var = tam0Var.a;
                Uri uri = yaa0Var != null ? yaa0Var.a : null;
                q6x q6xVar = this.M;
                if (uri == null) {
                    q6xVar.getClass();
                    str = null;
                } else {
                    sc scVar = new sc(23);
                    q6xVar.getClass();
                    str = (String) q6x.p(this.U, uri, scVar);
                }
                try {
                    date = str != null ? new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", Locale.ENGLISH).parse(str) : Calendar.getInstance().getTime();
                } catch (Throwable th) {
                    L.g("Can't parse date from exif", th);
                }
                if (date == null) {
                    date = Calendar.getInstance().getTime();
                }
                m0g0Var = new m0g0(date);
                return m0g0Var;
            }
            if (tam0Var.g() && (d2 = tam0Var.d()) != null) {
                return new m0g0(new Date(d2.a.lastModified()));
            }
        }
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", Locale.ENGLISH);
        date = Calendar.getInstance().getTime();
        if (date == null) {
            date = Calendar.getInstance().getTime();
        }
        m0g0Var = new m0g0(date);
        return m0g0Var;
    }

    public final void z7() {
        this.E.set(BaseCameraEditorContract$ScreenState.EDITOR_MAIN_SCREEN);
        o5().b();
        int i2 = 0;
        W4(true, false);
        b96 b96Var = this.F;
        if (b96Var != null) {
            y440 y440Var = b96Var.a;
            y440Var.getDrawToolControlsDelegate().f();
            View topDrawingControlsPanel = y440Var.getTopDrawingControlsPanel();
            if (topDrawingControlsPanel != null) {
                topDrawingControlsPanel.setVisibility(0);
            }
            y440Var.getDrawingBottomPanel().setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            y440Var.getDrawingBottomPanel().setVisibility(0);
            View sizeSeekBar = y440Var.getSizeSeekBar();
            if (sizeSeekBar != null) {
                sizeSeekBar.setVisibility(0);
            }
            y440Var.getCloseButtonBackground().setVisibility(8);
            y440Var.getTopButtonsPanel().setVisibility(8);
            y440Var.getEndButtonsPanel().setVisibility(8);
            y440Var.getBottomPanel().setVisibility(8);
            View trashPreviewBtn = y440Var.getTrashPreviewBtn();
            if (trashPreviewBtn != null) {
                trashPreviewBtn.setVisibility(8);
            }
            AnimatorSet animatorSet = new AnimatorSet();
            View drawingBottomPanel = y440Var.getDrawingBottomPanel();
            Property property = View.TRANSLATION_Y;
            float f2 = b96.c;
            ArrayList o = e43.o(ObjectAnimator.ofFloat(drawingBottomPanel, (Property<View, Float>) property, f2));
            View drawingUndoContainer = y440Var.getDrawingUndoContainer();
            if (drawingUndoContainer != null) {
                o.add(ObjectAnimator.ofFloat(drawingUndoContainer, (Property<View, Float>) View.ALPHA, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
            }
            View topDrawingControlsPanel2 = y440Var.getTopDrawingControlsPanel();
            if (topDrawingControlsPanel2 != null) {
                o.add(ObjectAnimator.ofFloat(topDrawingControlsPanel2, (Property<View, Float>) View.ALPHA, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
            }
            animatorSet.playTogether(j5g.O0(o));
            animatorSet.addListener(new y86(b96Var, i2));
            animatorSet.setInterpolator(qq2.c);
            animatorSet.setDuration(112L);
            DecelerateInterpolator decelerateInterpolator = qq2.b;
            AnimatorSet animatorSet2 = new AnimatorSet();
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(y440Var.getBottomPanel(), (Property<View, Float>) property, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            View closeButtonBackground = y440Var.getCloseButtonBackground();
            Property property2 = View.ALPHA;
            animatorSet2.playTogether(rl3.I(new Animator[]{ofFloat, ObjectAnimator.ofFloat(closeButtonBackground, (Property<View, Float>) property2, 1.0f), ObjectAnimator.ofFloat(y440Var.getTopButtonsPanel(), (Property<ViewGroup, Float>) property2, 1.0f), ObjectAnimator.ofFloat(y440Var.getEndButtonsPanel(), (Property<View, Float>) property2, 1.0f), y440Var.Z(f2, decelerateInterpolator)}));
            animatorSet2.setInterpolator(decelerateInterpolator);
            animatorSet2.setDuration(112L);
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.playSequentially(animatorSet, animatorSet2);
            animatorSet3.addListener(new z86(b96Var));
            animatorSet3.start();
        }
    }

    @Override // xsna.u76
    public final void P2() {
    }
}
