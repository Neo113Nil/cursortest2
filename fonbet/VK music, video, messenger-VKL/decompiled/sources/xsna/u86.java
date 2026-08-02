package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.base.VkPaginationList;
import com.vk.api.generated.stories.dto.StoriesGetPhotoUploadServerMemoryTypeDto;
import com.vk.camera.editor.common.cadre.CadreTarget;
import com.vk.camera.editor.stories.impl.share.content.StoryShareContentType;
import com.vk.camera.editor.stories.impl.share.holders.ShareStoryDataRecyclerView;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.im.MsgType;
import com.vk.dto.stories.entities.StoryCameraTarget;
import com.vk.dto.stories.entities.StoryEditorMode;
import com.vk.editor.analytics.StoryEditorEvents;
import com.vk.lists.c;
import com.vk.log.L;
import com.vk.stories.design.view.editor.SideControlPanelView;
import com.vk.stories.design.view.editor.StickerDeleteAreaView;
import com.vk.stories.design.view.editor.StoryStylePickerView;
import com.vk.stories.design.view.editor.verticalization.VerticalizationBannerView;
import com.vk.stories.design.view.stickers.StickersDrawingViewGroup;
import com.vk.superapp.api.dto.story.WebStickerType;
import com.vk.toggle.Features;
import com.vk.toggle.features.StoriesFeatures;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptySet;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.j9l0;
import xsna.rdm0;
import xsna.w1m0;
import xsna.x7j0;
import xsna.z9l0;

/* compiled from: BaseCameraEditorView.kt */
/* loaded from: classes6.dex */
public abstract class u86 extends FrameLayout implements v76, t76, s76, View.OnClickListener {
    public final Object A;
    public final Object B;
    public final Object C;
    public final View D;
    public final View E;
    public final View F;
    public final Object G;
    public final Object H;
    public final Object I;
    public fov J;
    public zlo0 K;
    public final Object L;
    public boolean M;
    public iz8 N;
    public final hhw O;
    public final q86 P;
    public final Object Q;
    public final Object R;
    public final ei9 b;
    public final j96 c;
    public final u48 d;
    public final Object e;
    public final Object f;
    public final Object g;
    public u76 h;
    public d4l0 i;
    public boolean j;
    public boolean k;
    public final EnumSet<WebStickerType> l;
    public final Handler m;
    public com.vk.core.view.components.spinner.c n;
    public final Object o;
    public final Object p;
    public final ImageView q;
    public final Object r;
    public final Object s;
    public final Object t;
    public final Object u;
    public final Object v;
    public final Object w;
    public FrameLayout x;
    public final Object y;
    public final Object z;

    /* compiled from: BaseCameraEditorView.kt */
    public static final class a extends AnimatorListenerAdapter {
        public final /* synthetic */ boolean b;
        public final /* synthetic */ u86 c;

        public a(boolean z, u86 u86Var) {
            this.b = z;
            this.c = u86Var;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (!this.b) {
                u86 u86Var = this.c;
                u86Var.getSoundOffText().setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                u86Var.getSoundOffText().setVisibility(8);
            }
            animator.removeListener(this);
        }
    }

    /* compiled from: ViewExt.kt */
    public static final class b implements gzs<s3q0> {
        public final /* synthetic */ View b;
        public final /* synthetic */ Ref$IntRef c;
        public final /* synthetic */ Ref$IntRef d;
        public final /* synthetic */ u86 e;
        public final /* synthetic */ u76 f;

        public b(View view, Ref$IntRef ref$IntRef, Ref$IntRef ref$IntRef2, u86 u86Var, u76 u76Var) {
            this.b = view;
            this.c = ref$IntRef;
            this.d = ref$IntRef2;
            this.e = u86Var;
            this.f = u76Var;
        }

        @Override // xsna.gzs
        public final s3q0 invoke() {
            View view = this.b;
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            Ref$IntRef ref$IntRef = this.c;
            int i = ref$IntRef.element;
            Ref$IntRef ref$IntRef2 = this.d;
            if (i != measuredWidth || ref$IntRef2.element != measuredHeight) {
                ref$IntRef.element = measuredWidth;
                ref$IntRef2.element = measuredHeight;
                u86 u86Var = this.e;
                u86Var.M = true;
                u86Var.O();
                u86Var.getBottomControlPanel().c(this.f.A0().g);
            }
            return s3q0.a;
        }
    }

    /* compiled from: BaseCameraEditorView.kt */
    public static final class c implements amo0 {
        public c() {
        }

        @Override // xsna.amo0
        public final void a(Editable editable, imo0 imo0Var) {
            if (editable == null || editable.length() == 0) {
                return;
            }
            u86 u86Var = u86.this;
            u86Var.getDelegates().setLastTextStickerInfo(imo0Var);
            u86Var.getStickersDrawingView().f(new xlo0(u86Var.getStickersDrawingView().getMeasuredWidth() - xlo0.p, editable, imo0Var));
            u86Var.getRequirePresenter().o5().f();
        }
    }

    /* compiled from: BaseCameraEditorView.kt */
    public static final class d implements ylo0 {
        public d() {
        }

        @Override // xsna.ylo0
        public final void a(Uri uri) {
            e8m0 photoStickerDelegate = u86.this.getPhotoStickerDelegate();
            photoStickerDelegate.f = true;
            photoStickerDelegate.a(uri);
        }

        @Override // xsna.ylo0
        public final void b() {
            u86.this.getRequirePresenter().o5().i(StoryEditorEvents.ADD_TEXT_CLIPBOARD);
        }
    }

    public u86(l7s l7sVar, ei9 ei9Var, j96 j96Var, u48 u48Var) {
        super(l7sVar);
        this.b = ei9Var;
        this.c = j96Var;
        this.d = u48Var;
        y440 y440Var = (y440) this;
        defpackage.e eVar = new defpackage.e(y440Var, 9);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.e = msy.a(lazyThreadSafetyMode, eVar);
        this.f = msy.a(lazyThreadSafetyMode, new pu(y440Var, 12));
        this.g = msy.a(lazyThreadSafetyMode, new ji0(y440Var, 6));
        this.k = true;
        this.l = EnumSet.of(WebStickerType.HASHTAG, WebStickerType.MENTION, WebStickerType.LINK, WebStickerType.QUESTION, WebStickerType.MUSIC, WebStickerType.GEO, WebStickerType.GIF, WebStickerType.MARKET_ITEM, WebStickerType.MARKET_SERVICE_ITEM, WebStickerType.TIME, WebStickerType.PHOTO, WebStickerType.POLL, WebStickerType.SERVICE_YC_ITEM, WebStickerType.PHOTO_ALBUM, WebStickerType.REACTION);
        this.m = new Handler(Looper.getMainLooper());
        this.o = msy.a(lazyThreadSafetyMode, new in0(y440Var, 7));
        this.p = msy.a(lazyThreadSafetyMode, new z4(y440Var, 9));
        this.r = msy.a(lazyThreadSafetyMode, new mh(y440Var, 10));
        this.s = msy.a(lazyThreadSafetyMode, new defpackage.f(y440Var, 3));
        this.t = msy.a(lazyThreadSafetyMode, new defpackage.g(y440Var, 10));
        this.u = msy.a(lazyThreadSafetyMode, new defpackage.h(y440Var, 6));
        this.v = msy.a(lazyThreadSafetyMode, new defpackage.i(y440Var, 8));
        this.w = msy.a(lazyThreadSafetyMode, new f5(y440Var, 6));
        this.y = msy.a(lazyThreadSafetyMode, new g5(y440Var, 5));
        this.z = msy.a(lazyThreadSafetyMode, new i70(y440Var, 7));
        this.A = msy.a(lazyThreadSafetyMode, new j70(y440Var, 4));
        this.B = msy.a(lazyThreadSafetyMode, new defpackage.r(y440Var, 9));
        this.C = msy.a(lazyThreadSafetyMode, new yh(y440Var, 5));
        this.G = msy.a(lazyThreadSafetyMode, new ic(l7sVar, 8));
        this.H = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.android.defaultplayer.view.timeline.a(l7sVar, 7));
        this.I = msy.a(lazyThreadSafetyMode, new ah(y440Var, 6));
        this.L = msy.a(lazyThreadSafetyMode, new m4(y440Var, 9));
        this.M = true;
        this.N = new iz8(0, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, false, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, true);
        this.P = new q86(y440Var, 0);
        this.Q = msy.a(lazyThreadSafetyMode, new s4(y440Var, 10));
        this.R = msy.a(lazyThreadSafetyMode, new ry0(y440Var, 6));
        setClipChildren(false);
        setClipToPadding(false);
        LayoutInflater.from(getContext()).inflate(R.layout.layout_story_editor, (ViewGroup) this, true);
        ((FrameLayout) findViewById(R.id.bottom_control_panel)).addView(getBottomPanel());
        View findViewById = findViewById(R.id.left_story_skeleton);
        this.D = findViewById;
        findViewById.setRotation(175.0f);
        View findViewById2 = findViewById(R.id.right_story_skeleton);
        this.E = findViewById2;
        findViewById2.setRotation(5.0f);
        View findViewById3 = findViewById(R.id.preview_glow);
        this.F = findViewById3;
        findViewById3.setVisibility(0);
        this.q = (ImageView) findViewById(R.id.remove);
        hhw hhwVar = ei9Var.d;
        hhwVar.b(getTextStickerClipboardInsertionCallback());
        this.O = hhwVar;
    }

    public static View F(y440 y440Var) {
        return y440Var.get_topButtonsPanel().findViewById(R.id.change_photo);
    }

    public static TextView G(y440 y440Var) {
        return (TextView) y440Var.getMetaInfo().findViewById(R.id.stub_story_view_name_text);
    }

    public static ImageView I(y440 y440Var) {
        return (ImageView) y440Var.get_topButtonsPanel().findViewById(R.id.sharing_compact_image);
    }

    public static ImageView J(y440 y440Var) {
        return (ImageView) y440Var.get_topButtonsPanel().findViewById(R.id.iv_close);
    }

    public static TextView L(y440 y440Var) {
        return (TextView) y440Var.getMetaInfo().findViewById(R.id.stub_story_view_meta);
    }

    public static View M(y440 y440Var) {
        return y440Var.get_topButtonsPanel().findViewById(R.id.open_camera);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final myl0 getBackgroundEditorView() {
        return (myl0) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final View getChangePhoto() {
        return (View) this.t.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final Drawable getGradientDrawable() {
        return (Drawable) this.H.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final LinearLayout getMetaInfo() {
        return (LinearLayout) this.y.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final TextView getMetaInfoName() {
        return (TextView) this.z.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final TextView getMetaInfoType() {
        return (TextView) this.A.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final GradientDrawable getMultiStoryBackground() {
        return (GradientDrawable) this.G.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final View getOpenCamera() {
        return (View) this.s.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final ImageView getSharingCompactImage() {
        return (ImageView) this.r.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final SideControlPanelView getSideControlPanelView() {
        return (SideControlPanelView) this.p.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final View getSoundOffText() {
        return (View) this.u.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final FrameLayout getStickersContainer() {
        return (FrameLayout) this.I.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final StoryStylePickerView getStyleControls() {
        return (StoryStylePickerView) this.B.getValue();
    }

    private final amo0 getTextStickerCallback() {
        return new c();
    }

    private final ylo0 getTextStickerClipboardInsertionCallback() {
        return new d();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final ViewGroup get_topButtonsPanel() {
        return (ViewGroup) this.o.getValue();
    }

    @Override // xsna.p5p
    public void C(int i, ArrayList arrayList) {
        pc(i, arrayList);
    }

    @Override // xsna.v76
    public final boolean C2() {
        return getDrawToolControlsDelegate().C2();
    }

    @Override // xsna.v76
    public final void Eg(boolean z) {
        StickersDrawingViewGroup stickersDrawingView = getStickersDrawingView();
        stickersDrawingView.Q = true;
        ial0 ial0Var = stickersDrawingView.l;
        if (ial0Var != null) {
            ial0Var.f(z);
        }
        stickersDrawingView.invalidate();
    }

    @Override // xsna.v76
    public final void Ha(boolean z) {
        int i;
        int i2;
        int i3;
        Set<? extends WebStickerType> set;
        q8m0 q8m0Var;
        boolean h = getStickersBridge().h(getRequirePresenter().x3());
        fov stickersView = getStickersView();
        if (stickersView == null) {
            stickersView = getStickersBridge().i(getContext(), h, this.i);
            stickersView.getView().setOnClickListener(this);
            stickersView.d();
            getStickersContainer().addView(stickersView.getView());
            setStickersView(stickersView);
        }
        stickersView.c(z);
        k9l0 clickableCounter = getStickersDrawingView().getClickableCounter();
        if (h) {
            j9l0.a a2 = z9l0.a(getPresenter());
            psj0 stickersBridge = getStickersBridge();
            EnumSet noneOf = EnumSet.noneOf(WebStickerType.class);
            EnumSet<WebStickerType> enumSet = this.l;
            if (a2 == null) {
                noneOf.addAll(stickersBridge.g(enumSet, clickableCounter));
            } else {
                Iterator<? extends WebStickerType> it = enumSet.iterator();
                while (it.hasNext()) {
                    WebStickerType next = it.next();
                    int f = next == WebStickerType.LINK ? stickersBridge.f() : stickersBridge.a(next);
                    if (stickersBridge.d(next)) {
                        switch (z9l0.a.$EnumSwitchMapping$0[next.ordinal()]) {
                            case 1:
                                i = clickableCounter.b;
                                break;
                            case 2:
                                i = clickableCounter.a.size();
                                break;
                            case 3:
                                i = clickableCounter.d;
                                break;
                            case 4:
                                i = clickableCounter.e;
                                break;
                            case 5:
                                i = clickableCounter.f;
                                break;
                            case 6:
                                i = clickableCounter.j;
                                break;
                            case 7:
                                i2 = clickableCounter.l;
                                i3 = clickableCounter.g;
                                i = i2 + i3;
                                break;
                            case 8:
                                i2 = clickableCounter.l;
                                i3 = clickableCounter.g;
                                i = i2 + i3;
                                break;
                            case 9:
                                i = clickableCounter.m;
                                break;
                            case 10:
                                i = clickableCounter.i;
                                break;
                            case 11:
                                i = clickableCounter.k;
                                break;
                            case 12:
                                i = clickableCounter.n;
                                break;
                            case 13:
                                i = clickableCounter.o;
                                break;
                            default:
                                i = -1;
                                break;
                        }
                        if (f > i) {
                            noneOf.add(next);
                        }
                    }
                }
            }
            WebStickerType webStickerType = WebStickerType.MUSIC;
            if (noneOf.contains(webStickerType) && getRequirePresenter().y6()) {
                noneOf.remove(webStickerType);
            }
            if (noneOf.contains(WebStickerType.POLL)) {
                List<nov> stickers = getStickers();
                if (!(stickers instanceof Collection) || !stickers.isEmpty()) {
                    Iterator<T> it2 = stickers.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            nov novVar = (nov) it2.next();
                            r8m0 r8m0Var = novVar instanceof r8m0 ? (r8m0) novVar : null;
                            if (r8m0Var != null && (q8m0Var = r8m0Var.h) != null && q8m0Var.b) {
                                noneOf.remove(WebStickerType.POLL);
                            }
                        }
                    }
                }
            }
            WebStickerType webStickerType2 = WebStickerType.SERVICE_YC_ITEM;
            if (noneOf.contains(webStickerType2)) {
                u76 presenter = getPresenter();
                if (!(presenter != null ? epx.f(presenter.p5(), Boolean.TRUE) : false)) {
                    noneOf.remove(webStickerType2);
                }
            }
            set = noneOf;
        } else {
            set = EmptySet.b;
        }
        stickersView.a(set);
        stickersView.getView().setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        stickersView.setVisible(true);
        stickersView.b();
        stickersView.show();
        getRequirePresenter().o5().a();
    }

    @Override // xsna.v76
    public final void Hk() {
        FrameLayout frameLayout = this.x;
        if (frameLayout != null) {
            removeView(frameLayout);
            this.x = null;
            getBottomControlPanel().setSendButtonAlpha(1.0f);
        }
    }

    @Override // xsna.v76
    public final boolean I4() {
        return this.j;
    }

    @Override // xsna.v76
    public final void Ib() {
        getDrawToolControlsDelegate().l();
        getRequirePresenter().o5().i(StoryEditorEvents.DELETE_GRAFFITI);
    }

    @Override // xsna.v76
    public final boolean J8() {
        return this.K == null;
    }

    @Override // xsna.v76
    public final void J9() {
        getStickersDrawingView().invalidate();
    }

    public final void O() {
        kh6 musicDelegate = getMusicDelegate();
        if (musicDelegate != null) {
            musicDelegate.k = getCadreSize();
        }
        getTextStickerDialogDelegate().f = getCadreSize();
        getPhotoStickerRedesignDelegate().h = getCadreSize();
        y7m0 photoAlbumStickerDelegate = getPhotoAlbumStickerDelegate();
        if (photoAlbumStickerDelegate != null) {
            photoAlbumStickerDelegate.h = getCadreSize();
        }
        v8m0 storyPostDelegate = getStoryPostDelegate();
        if (storyPostDelegate != null) {
            storyPostDelegate.h = getCadreSize();
        }
        getReplyVideoStickerDelegate().h = getCadreSize();
        getReactionDelegate().i = getCadreSize();
        getStickersDrawingView().getLayoutParams().height = getCadreSize().b;
        getBackgroundEditorView().setCadreSize(getCadreSize());
        f4m.t(an10.b(getCadreSize().c), this);
        SideControlPanelView sideControlPanelView = getSideControlPanelView();
        int i = (int) getCadreSize().d;
        sideControlPanelView.getClass();
        int i2 = u48.r;
        if (i < i2) {
            i += i2;
        }
        f4m.q(i, sideControlPanelView.c);
        f4m.q(i, sideControlPanelView.q);
        getBottomControlPanel().b((int) getCadreSize().d);
        im();
        getStickersDrawingView().setClipToOutline(true);
        getStickersDrawingView().invalidateOutline();
        getStickerDeleteArea().setTranslationY(-getCadreSize().d);
        getVerticalizationDelegate().i = getCadreSize();
    }

    @Override // xsna.v76
    public final void Oa(StoryEditorMode storyEditorMode) {
        u76 requirePresenter = getRequirePresenter();
        setOnClickListener(this);
        setId(R.id.story_editor_root_layout);
        d4l0 d4l0Var = new d4l0(this, requirePresenter, getAnimationsDelegate());
        this.i = d4l0Var;
        requirePresenter.S2(getAnimationsDelegate());
        SideControlPanelView sideControlPanelView = getSideControlPanelView();
        bwt0.i0(sideControlPanelView.d, new pf40(sideControlPanelView, 19));
        bwt0.i0(sideControlPanelView.e, new bl30(sideControlPanelView, 18));
        int i = 22;
        bwt0.i0(sideControlPanelView.f, new aj50(sideControlPanelView, i));
        bwt0.i0(sideControlPanelView.g, new arb0(sideControlPanelView, 16));
        bwt0.i0(sideControlPanelView.h, new skj0(sideControlPanelView, 0));
        bwt0.i0(sideControlPanelView.i, new r8a0(sideControlPanelView, i));
        int i2 = 5;
        Iterator it = e43.l(sideControlPanelView.d, sideControlPanelView.e, sideControlPanelView.f, sideControlPanelView.g, sideControlPanelView.h, sideControlPanelView.i).iterator();
        while (it.hasNext()) {
            bwt0.s0((View) it.next(), 0.9f);
        }
        getSideControlPanelView().setPresenter(requirePresenter);
        getSideControlPanelView().setStickerListener(d4l0Var);
        if (requirePresenter.q7()) {
            bwt0.h0(this, getSharingCompactImage());
            getSharingCompactImage().setVisibility(0);
        } else {
            getSharingCompactImage().setVisibility(8);
        }
        bwt0.h0(this, getOpenCamera());
        bwt0.h0(this, getChangePhoto());
        getCloseButton().setOnClickListener(this);
        getCloseButton().setVisibility(0);
        getBottomControlPanel().i(getTrashPreviewBtn());
        getBottomControlPanel().setPresenter(requirePresenter);
        getBottomControlPanel().a();
        getBackgroundEditorView().getPresenter().A4(requirePresenter);
        gyl0 presenter = getBackgroundEditorView().getPresenter();
        j96 j96Var = this.c;
        presenter.y5(j96Var.b());
        requirePresenter.a3(getBackgroundEditorView().getPresenter());
        addView(getBackgroundEditorView(), new FrameLayout.LayoutParams(-1, -1));
        getBackgroundEditorTopView().setVisibility(8);
        getBackgroundEditorBottomView().setVisibility(8);
        x1e0 x1e0Var = j96Var.c;
        Activity activity = (Activity) x1e0Var.invoke();
        StickersDrawingViewGroup stickersDrawingView = j96Var.getStickersDrawingView();
        z4d0 z4d0Var = j96Var.f;
        b96 b96Var = (b96) z4d0Var.invoke();
        ke90 ke90Var = j96Var.e;
        j96Var.n = new c4m0(activity, stickersDrawingView, (u76) ke90Var.invoke(), b96Var);
        j96Var.m = new e7m0((Activity) x1e0Var.invoke(), j96Var.getStickersDrawingView(), (u76) ke90Var.invoke(), (b96) z4d0Var.invoke(), j96Var.d.b);
        bwt0.o(this, new n0(i2, this, requirePresenter));
        if (epx.f(requirePresenter.A0().m.g, StoriesGetPhotoUploadServerMemoryTypeDto.FRIENDSHIP.j())) {
            getMetaInfo().setVisibility(0);
            getMetaInfoName().setText(getAuthBridge().getName());
            getMetaInfoType().setText(R.string.from_memory_without_date);
        }
    }

    public final void Q() {
        getRequirePresenter().N5().I().start();
    }

    public final AnimatorSet S(float f, TimeInterpolator timeInterpolator) {
        return getRequirePresenter().N5().L(f, timeInterpolator);
    }

    @Override // xsna.v76
    public final void T(StoryCameraTarget storyCameraTarget) {
        getCloseButtonBackground().setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        get_topButtonsPanel().setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        getSideControlPanelView().getEndButtonsPanel().setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        getBottomControlPanel().T(storyCameraTarget);
        og();
    }

    public final boolean V() {
        List<nov> stickers = getStickers();
        ArrayList arrayList = new ArrayList();
        for (Object obj : stickers) {
            nov novVar = (nov) obj;
            if (!(novVar instanceof dh9) && !(novVar instanceof qx5)) {
                arrayList.add(obj);
            }
        }
        if (getStyleControls().b.getTabCount() == 0) {
            return false;
        }
        StoriesFeatures storiesFeatures = StoriesFeatures.ST_TAB_STYLE_PICKER;
        storiesFeatures.getClass();
        return com.vk.toggle.b.A.a(storiesFeatures) && arrayList.size() == 1 && (j5g.Y(arrayList) instanceof d7g0);
    }

    public final void W(boolean z, boolean z2) {
        getRequirePresenter().W4(z, z2);
    }

    @Override // xsna.v76
    public final void Wa() {
        getStyleControls().setVisibility(8);
    }

    @Override // xsna.v76
    public final void X7(float f) {
        SideControlPanelView sideControlPanelView = getSideControlPanelView();
        Iterator it = e43.l(sideControlPanelView.d, sideControlPanelView.e, sideControlPanelView.f).iterator();
        while (it.hasNext()) {
            ((View) it.next()).setRotation(f);
        }
        getDrawToolControlsDelegate().getClass();
    }

    @Override // xsna.v76
    public final void Y8(UserId userId) {
        if (this.x == null) {
            int a2 = iah0.a(12) + (bwt0.C(this).bottom - getBottomControlPanel().getSendButtonRect().top);
            Context context = getContext();
            int a3 = e3m.a(R.dimen.story_editor_content_item_width_small, context);
            int a4 = e3m.a(R.dimen.story_editor_long_tap_view_max_width, context);
            u76 requirePresenter = getRequirePresenter();
            zg zgVar = new zg(this, 5);
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            bwt0.i0(frameLayout, new gmj(zgVar, 6));
            a600 c3 = requirePresenter.c3();
            VkPaginationList<Group> t6 = requirePresenter.t6();
            c3.h = userId;
            b600 b600Var = new b600(context);
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            odm0 odm0Var = new odm0(new cvh(c3, 19), StoryShareContentType.LONG_TAP);
            c3.g = odm0Var;
            ListBuilder e = e43.e();
            e.add(new rdm0.b(c3.a().getUid().b, c3.a().a(), "", epx.f(c3.h, c3.a().getUid()), new x7j0.a(null), c3.a().getName(), 32));
            for (Group group : t6.b) {
                UserId userId2 = group.c;
                e.add(new rdm0.b(userId2.b, group.e, "", epx.f(c3.h, userId2), new x7j0.a(group), group.d, 32));
            }
            odm0Var.setItems(e.g());
            b600Var.addOnAttachStateChangeListener(new z500(b600Var, ref$ObjectRef));
            d9j0 d9j0Var = new d9j0(new eo3(ref$ObjectRef, b600Var, c3, 8), new iq8(4, c3, ref$ObjectRef), (xqu) c3.e.getValue(), c3.c);
            odm0 odm0Var2 = c3.g;
            if (odm0Var2 != null) {
                b600Var.setAdapter(odm0Var2);
            }
            c.h hVar = new c.h(d9j0Var);
            hVar.m = false;
            hVar.l = false;
            hVar.k = String.valueOf(t6.e);
            hVar.g = t6.d;
            ShareStoryDataRecyclerView shareStoryDataRecyclerView = b600Var.t;
            com.vk.lists.c a5 = com.vk.lists.f.a(hVar, shareStoryDataRecyclerView);
            b600Var.u = a5;
            b600Var.v = t6.c;
            shareStoryDataRecyclerView.setLoadingHoldersCount(Math.min(a5.k(), b600Var.v - a5.i()));
            int a6 = iah0.a(16);
            int size = ((requirePresenter.t6().b.size() + 1) * a3) + a6;
            if (size <= a4) {
                a4 = size;
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a4, -2);
            layoutParams.bottomMargin = a2;
            layoutParams.setMarginEnd(a6);
            layoutParams.setMarginStart(a6);
            layoutParams.gravity = 8388693;
            b600Var.setLayoutParams(layoutParams);
            frameLayout.setTranslationY(iah0.a(5));
            frameLayout.addView(b600Var);
            this.x = frameLayout;
            getBottomControlPanel().setSendButtonAlpha(0.64f);
            addView(this.x);
        }
    }

    public final AnimatorSet Z(float f, TimeInterpolator timeInterpolator) {
        return getRequirePresenter().N5().l(f, timeInterpolator);
    }

    @Override // xsna.v76
    public final void eb() {
        imo0 imo0Var;
        if (this.n != null) {
            return;
        }
        imo0 imo0Var2 = this.c.h;
        if (imo0Var2 != null) {
            imo0Var = new imo0();
            imo0Var.a = imo0Var2.a;
            imo0Var.h = imo0Var2.h;
            imo0Var.c = imo0Var2.c;
            imo0Var.g = imo0Var2.g;
            imo0Var.b = imo0Var2.b;
            imo0Var.m = imo0Var2.m;
            imo0Var.i = imo0Var2.i;
            imo0Var.j = imo0Var2.j;
        } else {
            imo0Var = null;
        }
        imo0 imo0Var3 = imo0Var;
        zlo0 a2 = getTextStickerDialogDelegate().a(imo0Var3, getRequirePresenter().x3(), getTextStickerCallback(), this.O, "");
        ((cmo0) a2).g = new t86(this, 0);
        a2.show();
        this.K = a2;
    }

    @Override // xsna.v76
    public fn2 getAnimationStickerManager() {
        return getStickersDrawingView().getAnimationChoreographer();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final b96 getAnimationsDelegate() {
        return (b96) this.e.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final gpj0 getAuthBridge() {
        return (gpj0) this.f.getValue();
    }

    @Override // xsna.s76
    public View getBackgroundEditorBottomView() {
        return getBackgroundEditorView().getBottomView();
    }

    @Override // xsna.s76
    public View getBackgroundEditorTopView() {
        return getBackgroundEditorView().getTopView();
    }

    @Override // xsna.v76
    public q3p getBottomControlPanel() {
        return (q3p) getBottomPanel();
    }

    @Override // xsna.s76
    public View getBottomPanel() {
        return this.d;
    }

    @Override // xsna.v76
    public iz8 getCadreSize() {
        if (this.M) {
            this.M = false;
            kz8 kz8Var = this.b.a;
            this.N = kz8Var.d(this, kz8Var.a(getContext()), CadreTarget.EDITOR, getRequirePresenter().A0().k.g);
        }
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.s76
    public final View getCloseButtonBackground() {
        return (View) this.w.getValue();
    }

    @Override // xsna.t76
    public final zlo0 getCurrentTextDialog() {
        return this.K;
    }

    public final t76 getDelegates() {
        return this.c;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final ajo getDrawToolControlsDelegate() {
        return (ajo) this.C.getValue();
    }

    @Override // xsna.s76
    public View getDrawingBottomPanel() {
        return getDrawToolControlsDelegate().getDrawingBottomPanel();
    }

    @Override // xsna.v76
    public w1m0.a getDrawingHistory() {
        return getDrawToolControlsDelegate().k();
    }

    @Override // xsna.v76
    public int getDrawingHistorySize() {
        return getDrawToolControlsDelegate().g();
    }

    @Override // xsna.s76
    public View getDrawingUndoButton() {
        getDrawToolControlsDelegate().getClass();
        return null;
    }

    @Override // xsna.s76
    public View getDrawingUndoContainer() {
        getDrawToolControlsDelegate().getClass();
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public wht getGeneratedStoriesDelegate() {
        return (wht) this.R.getValue();
    }

    public c4m0 getGeoStickerDelegate() {
        return this.c.n;
    }

    @Override // xsna.t76
    public m4m0 getHashtagDelegate() {
        return this.c.getHashtagDelegate();
    }

    public imo0 getLastTextStickerInfo() {
        return this.c.h;
    }

    @Override // xsna.v76
    public int getLayoutHeight() {
        return getCadreSize().b;
    }

    @Override // xsna.v76
    public int getLayoutWidth() {
        return getCadreSize().a;
    }

    @Override // xsna.t76
    public z5m0 getMarketItemStickerDelegate() {
        return this.c.getMarketItemStickerDelegate();
    }

    @Override // xsna.t76
    public p6m0 getMentionDelegate() {
        return this.c.getMentionDelegate();
    }

    @Override // xsna.t76
    public nov getMovingSticker() {
        return this.c.getMovingSticker();
    }

    @Override // xsna.v76, xsna.t76
    public kh6 getMusicDelegate() {
        return this.c.m;
    }

    @Override // xsna.t76
    public y7m0 getPhotoAlbumStickerDelegate() {
        return this.c.getPhotoAlbumStickerDelegate();
    }

    public e8m0 getPhotoStickerDelegate() {
        return this.c.a();
    }

    @Override // xsna.t76
    public f8m0 getPhotoStickerRedesignDelegate() {
        return this.c.getPhotoStickerRedesignDelegate();
    }

    public xpa0 getPipetteProvider() {
        return this.c.b();
    }

    @Override // xsna.t76
    public o8m0 getPollStickerDelegate() {
        return this.c.getPollStickerDelegate();
    }

    @Override // xsna.t76
    public x0m0 getQuestionDelegate() {
        return this.c.getQuestionDelegate();
    }

    @Override // xsna.t76
    public vam0 getReactionDelegate() {
        return this.c.getReactionDelegate();
    }

    @Override // xsna.t76
    public obm0 getReplyVideoStickerDelegate() {
        return this.c.getReplyVideoStickerDelegate();
    }

    @Override // xsna.v76, xsna.t76
    public Context getRequireContext() {
        return this.c.b;
    }

    public final u76 getRequirePresenter() {
        return getPresenter();
    }

    public int getSceneHeight() {
        return this.c.c();
    }

    public int getSceneWidth() {
        return this.c.d();
    }

    @Override // xsna.t76
    public ddm0 getServiceItemStickerDelegate() {
        return this.c.getServiceItemStickerDelegate();
    }

    @Override // xsna.v76, xsna.s76
    public z4p getSideControlPanel() {
        return getSideControlPanelView();
    }

    @Override // xsna.s76
    public View getSizeSeekBar() {
        return getDrawToolControlsDelegate().j();
    }

    @Override // xsna.v76
    public t8l0 getStickerBackgroundState() {
        return getStickersDrawingView().getBackgroundState();
    }

    @Override // xsna.t76
    public StickerDeleteAreaView getStickerDeleteArea() {
        return this.c.getStickerDeleteArea();
    }

    @Override // xsna.v76
    public List<nov> getStickers() {
        return getStickersDrawingView().getCurrentStickers();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final psj0 getStickersBridge() {
        return (psj0) this.g.getValue();
    }

    @Override // xsna.v76, xsna.t76
    public StickersDrawingViewGroup getStickersDrawingView() {
        return this.c.getStickersDrawingView();
    }

    @Override // xsna.v76
    public zcl0 getStickersState() {
        return this.c.getStickersDrawingView().getStickersState();
    }

    @Override // xsna.s76
    public fov getStickersView() {
        return this.J;
    }

    public abstract /* synthetic */ Integer getStoriesCount();

    @Override // xsna.t76
    public p5m0 getStoryLinkDelegate() {
        return this.c.getStoryLinkDelegate();
    }

    @Override // xsna.t76
    public v8m0 getStoryPostDelegate() {
        return this.c.getStoryPostDelegate();
    }

    @Override // xsna.s76
    public View getStylePicker() {
        return getStyleControls();
    }

    @Override // xsna.t76
    public bmo0 getTextStickerDialogDelegate() {
        return this.c.getTextStickerDialogDelegate();
    }

    @Override // xsna.t76
    public xjm0 getTimeStickerDelegate() {
        return this.c.getTimeStickerDelegate();
    }

    @Override // xsna.s76
    public ViewGroup getTopButtonsPanel() {
        return get_topButtonsPanel();
    }

    @Override // xsna.s76
    public View getTopDrawingControlsPanel() {
        return getDrawToolControlsDelegate().i();
    }

    public VerticalizationBannerView getVerticalizationBanner() {
        return getVerticalizationDelegate().m;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.v76
    public jpr0 getVerticalizationDelegate() {
        return (jpr0) this.Q.getValue();
    }

    @Override // xsna.p5p
    public final void i(List<? extends nov> list) {
        StickersDrawingViewGroup stickersDrawingView = getStickersDrawingView();
        stickersDrawingView.getClass();
        for (nov novVar : list) {
            if (novVar instanceof View) {
                b7l.a("Passing view stickers in bucket not supported yet");
                return;
            }
            novVar.setInvalidator(new x9l0(stickersDrawingView, 0));
        }
        stickersDrawingView.q.b(list);
        Iterator<? extends nov> it = list.iterator();
        while (it.hasNext()) {
            stickersDrawingView.m(it.next());
        }
        stickersDrawingView.invalidate();
    }

    @Override // xsna.v76
    public final void ik() {
        this.m.removeCallbacks(this.P);
        com.vk.core.view.components.spinner.c cVar = this.n;
        if (cVar != null) {
            cVar.dismiss();
        }
        this.n = null;
        setResumeAfterProgressDialogHide(true);
    }

    @Override // xsna.v76
    public final void im() {
        Bitmap U6;
        getStickersDrawingView().setOutlineProvider(this.b.a.c(getCadreSize()));
        GradientDrawable multiStoryBackground = getMultiStoryBackground();
        if (multiStoryBackground != null) {
            multiStoryBackground.setCornerRadius((1 / getStickersDrawingView().getScaleX()) * iz8.j);
            this.D.setBackground(multiStoryBackground);
            this.E.setBackground(multiStoryBackground);
        }
        gyl0 presenter = getBackgroundEditorView().getPresenter();
        if (presenter == null || (U6 = presenter.U6()) == null) {
            return;
        }
        this.F.setBackground(new LayerDrawable(new Drawable[]{new BitmapDrawable(getResources(), U6), getGradientDrawable()}));
    }

    @Override // xsna.v76
    public final void kc(boolean z) {
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (z) {
            getSoundOffText().setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            getSoundOffText().setVisibility(0);
        }
        ViewPropertyAnimator animate = getSoundOffText().animate();
        if (z) {
            f = 1.0f;
        }
        animate.alpha(f).setDuration(400L).setListener(new a(z, this)).start();
    }

    @Override // xsna.v76
    public final void ki(Bitmap bitmap, String str) {
        ial0 guidesDrawer = getStickersDrawingView().getGuidesDrawer();
        if (guidesDrawer instanceof pim0) {
            pim0 pim0Var = (pim0) guidesDrawer;
            pim0Var.z = bitmap != null ? kd7.h(pim0Var.a.getContext(), bitmap, bitmap.getWidth()) : null;
            pim0Var.A = str;
            if (pim0Var.B) {
                pim0Var.D();
            }
        }
        getStickersDrawingView().setAuthorNameForRepost(str);
    }

    @Override // xsna.p5p
    public final void m() {
        ViewPropertyAnimator e;
        SideControlPanelView sideControlPanelView = getSideControlPanelView();
        if (bwt0.K(sideControlPanelView.q)) {
            ViewGroup viewGroup = sideControlPanelView.q;
            View view = sideControlPanelView.p;
            eqy<bek0> eqyVar = com.vk.toggle.d.a;
            if (com.vk.toggle.b.A.a(Features.Type.FEATURE_STORY_EDITOR_CONTROLS_TIPS)) {
                e = d3m.e(viewGroup, (r15 & 1) != 0 ? 300L : 200L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
                if (e != null) {
                    e.translationX(y8g0.b(R.dimen.camera_controls_tips_shift));
                }
                d3m.e(view, (r15 & 1) != 0 ? 300L : 200L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
            }
        }
    }

    @Override // xsna.v76
    public final void m9(long j) {
        if (this.n == null) {
            Handler handler = this.m;
            if (handler.hasMessages(1)) {
                return;
            }
            q86 q86Var = this.P;
            handler.removeCallbacks(q86Var);
            handler.sendEmptyMessageDelayed(1, j);
            handler.postDelayed(q86Var, j);
        }
    }

    @Override // xsna.v76
    public final boolean mi() {
        return getStickersDrawingView().getStateSize() == 0;
    }

    @Override // xsna.v76
    public final void n7(float f, float f2, float f3) {
        float f4 = f + 0.4f;
        if (f4 > 1.0f) {
            f4 = 1.0f;
        }
        float f5 = 0.4f + f2;
        float f6 = f5 <= 1.0f ? f5 : 1.0f;
        View view = this.F;
        view.setTranslationY(1.1f * f3);
        view.setScaleY(f4);
        view.setScaleX(f6);
        StickersDrawingViewGroup stickersDrawingView = getStickersDrawingView();
        stickersDrawingView.setTranslationY(f3);
        stickersDrawingView.setScaleY(f);
        stickersDrawingView.setScaleX(f2);
        View view2 = this.D;
        view2.setTranslationY(f3);
        view2.setScaleY(f);
        view2.setScaleX(f2);
        View view3 = this.E;
        view3.setTranslationY(f3);
        view3.setScaleY(f);
        view3.setScaleX(f2);
    }

    @Override // xsna.v76
    public final void nh(int i, v2l0 v2l0Var) {
        Context s;
        Iterator<nov> it = getStickersDrawingView().q.a.iterator();
        while (it.hasNext()) {
            nov next = it.next();
            if (v2l0Var != null && (next instanceof agj)) {
                ((agj) next).b(v2l0Var);
            }
            if (next instanceof o7c0) {
                o7c0 o7c0Var = (o7c0) next;
                o7c0Var.getClass();
                if (n8g.f(i) >= 0.5d) {
                    dhr0.a.getClass();
                    s = dhr0.y();
                } else {
                    dhr0.a.getClass();
                    s = dhr0.s();
                }
                o7c0Var.E = s;
                c8c0 c8c0Var = o7c0Var.D;
                u7c0 u7c0Var = o7c0Var.f;
                c8c0Var.getClass();
                b8c0 a2 = c8c0.a(u7c0Var, s);
                o7c0Var.q(o7c0Var.getOriginalWidth(), a2.b);
                o7c0Var.r(a2.d);
            }
        }
    }

    @Override // xsna.v76
    public final void og() {
        if (getRequirePresenter().G2() > 1) {
            getBottomControlPanel().setStoryActionsPanelVisible(false);
            getSideControlPanelView().setSaveToDeviceVisible(true);
            getSideControlPanelView().setNewFrameVisible(false);
            StoriesFeatures storiesFeatures = StoriesFeatures.ST_STORY_LIFETIME_SAVE;
            storiesFeatures.getClass();
            com.vk.toggle.b bVar = com.vk.toggle.b.A;
            if (bVar.a(storiesFeatures)) {
                return;
            }
            StoriesFeatures storiesFeatures2 = StoriesFeatures.ST_STORY_LIFETIME_48;
            storiesFeatures2.getClass();
            if (bVar.a(storiesFeatures2)) {
                return;
            }
            StoriesFeatures storiesFeatures3 = StoriesFeatures.ST_STORY_LIFETIME_COMM_48;
            storiesFeatures3.getClass();
            if (bVar.a(storiesFeatures3)) {
                return;
            }
            getRequirePresenter().K2(24);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int id = view.getId();
        if (id == R.id.sharing_compact_image) {
            getRequirePresenter().getClass();
            return;
        }
        if (id == R.id.iv_close) {
            getRequirePresenter().a0();
        } else if (id == R.id.open_camera) {
            getRequirePresenter().B2();
        } else if (id == R.id.change_photo) {
            getRequirePresenter().F2();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        m();
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.v76
    public final void onPause() {
        tyl0<?> tyl0Var;
        uyl0 uyl0Var;
        setResumeAfterProgressDialogHide(false);
        kh6 musicDelegate = getMusicDelegate();
        if (musicDelegate != null && (tyl0Var = musicDelegate.d) != null && (uyl0Var = (uyl0) tyl0Var.getPresenter()) != null) {
            uyl0Var.onPause();
        }
        jpr0 verticalizationDelegate = getVerticalizationDelegate();
        if (verticalizationDelegate.g) {
            ((zdh0) verticalizationDelegate.f.getValue()).e(verticalizationDelegate.n);
        }
    }

    @Override // xsna.h90.a
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        c4m0 geoStickerDelegate = getGeoStickerDelegate();
        if (geoStickerDelegate != null) {
            geoStickerDelegate.h.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.v76
    public final void onResume() {
        boolean contains;
        tyl0<?> tyl0Var;
        uyl0 uyl0Var;
        setResumeAfterProgressDialogHide(false);
        zlo0 zlo0Var = this.K;
        if (zlo0Var != null) {
            zlo0Var.a();
        }
        kh6 musicDelegate = getMusicDelegate();
        if (musicDelegate != null && (tyl0Var = musicDelegate.d) != null && (uyl0Var = (uyl0) tyl0Var.getPresenter()) != null) {
            uyl0Var.onResume();
        }
        getStickersDrawingView().m.a(true);
        jpr0 verticalizationDelegate = getVerticalizationDelegate();
        kpr0 kpr0Var = verticalizationDelegate.n;
        if (verticalizationDelegate.g) {
            zdh0 zdh0Var = (zdh0) verticalizationDelegate.f.getValue();
            synchronized (zdh0Var) {
                contains = zdh0Var.d.contains(kpr0Var);
            }
            if (contains) {
                return;
            }
            ((zdh0) verticalizationDelegate.f.getValue()).a(kpr0Var);
        }
    }

    @Override // xsna.tvo.a
    public final void pc(int i, List<String> list) {
        c4m0 geoStickerDelegate = getGeoStickerDelegate();
        if (geoStickerDelegate != null) {
            geoStickerDelegate.pc(i, new ArrayList(list));
        }
    }

    @Override // xsna.v76
    public final void r2(nov novVar) {
        getStickersDrawingView().t(novVar);
    }

    @Override // xsna.v76
    public void release() {
        io.reactivex.rxjava3.disposables.c cVar = getPhotoStickerDelegate().e;
        if (cVar != null) {
            cVar.dispose();
        }
        getCloseButtonBackground().setVisibility(8);
    }

    @Override // xsna.v76
    public void setBackgroundImage(Bitmap bitmap) {
        getStickersDrawingView().setBackgroundState(bitmap);
    }

    @Override // xsna.v76
    public void setBackgroundImageColor(int i) {
        getStickersDrawingView().setBackgroundState(i);
    }

    public void setCadreSize(iz8 iz8Var) {
        this.N = iz8Var;
    }

    @Override // xsna.v76
    public void setChangePhotoVisible(boolean z) {
        getChangePhoto().setVisibility(z ? 0 : 8);
    }

    @Override // xsna.v76
    public void setContentLoaded(boolean z) {
        this.k = z;
    }

    @Override // xsna.t76
    public void setCurrentTextDialog(zlo0 zlo0Var) {
        this.c.D = zlo0Var;
    }

    @Override // xsna.v76
    public void setDecorationVisibility(boolean z) {
        getBottomPanel().setVisibility(z ? 0 : 8);
        getRequirePresenter().Y3(z);
        getSideControlPanelView().setVisibility(z ? 0 : 8);
        getCloseButton().setVisibility(z ? 0 : 8);
        VerticalizationBannerView verticalizationBanner = getVerticalizationBanner();
        if (verticalizationBanner != null) {
            verticalizationBanner.setVisibility(z ? 0 : 8);
        }
        if (V()) {
            getStyleControls().setVisibility(z ? 0 : 8);
        }
    }

    @Override // xsna.v76
    public void setDrawingUndoButtonEnabled(boolean z) {
        getDrawToolControlsDelegate().getClass();
    }

    @Override // xsna.v76
    public void setDrawingViewsEnabled(boolean z) {
        getDrawToolControlsDelegate().getClass();
    }

    @Override // xsna.s76
    public void setEditorTouchesEnabled(boolean z) {
        getRequirePresenter().setEditorTouchesEnabled(z);
    }

    @Override // xsna.v76
    public void setEditorViewsEnabled(boolean z) {
        getSideControlPanelView().setEditorViewsEnabled(z);
        getBottomControlPanel().h(z, this.k);
        getStickersDrawingView().v(z);
    }

    @Override // xsna.t76
    public void setLastTextStickerInfo(imo0 imo0Var) {
        this.c.h = imo0Var;
    }

    @Override // xsna.p5p
    public abstract /* synthetic */ void setMsgType(MsgType msgType);

    @Override // xsna.v76
    public void setMultiBackgroundVisibility(boolean z) {
        this.D.setVisibility(z ? 0 : 8);
        this.E.setVisibility(z ? 0 : 8);
    }

    @Override // xsna.v76
    public abstract /* synthetic */ void setNeedRequestAudioFocus(boolean z);

    @Override // xsna.v76
    public void setOpenCameraEnabled(boolean z) {
        View openCamera = getOpenCamera();
        openCamera.setAlpha(z ? 1.0f : 0.4f);
        openCamera.setEnabled(z);
        openCamera.setOnClickListener(z ? this : null);
    }

    @Override // xsna.v76
    public void setOpenCameraVisible(boolean z) {
        getOpenCamera().setVisibility(z ? 0 : 8);
    }

    public void setResumeAfterProgressDialogHide(boolean z) {
        this.j = z;
    }

    @Override // xsna.v76
    public void setStickersState(zcl0 zcl0Var) {
        this.c.getStickersDrawingView().setStickersState(zcl0Var);
    }

    public void setStickersView(fov fovVar) {
        this.J = fovVar;
    }

    @Override // xsna.v76, xsna.s76
    public void setStickersViewTouchesEnabled(boolean z) {
        getStickersDrawingView().setTouchEnabled(z);
    }

    @Override // xsna.v76
    public final void v2(nov novVar) {
        float f = f2l0.a;
        ((y440) this).sc(novVar, new mgi(2));
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.v76
    public final void we() {
        wht generatedStoriesDelegate = getGeneratedStoriesDelegate();
        generatedStoriesDelegate.getClass();
        if (j5g.P(wht.e, generatedStoriesDelegate.c.A0().i)) {
            ((xqj0) generatedStoriesDelegate.d.getValue()).l(new m1k(generatedStoriesDelegate, 11));
        }
        final jpr0 verticalizationDelegate = getVerticalizationDelegate();
        verticalizationDelegate.getClass();
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        final y440 y440Var = verticalizationDelegate.b;
        hg1.b(y440Var, new io.reactivex.rxjava3.internal.operators.completable.e(new si60(verticalizationDelegate, 14)).o(asu0.a.d()).subscribe(new io.reactivex.rxjava3.functions.a() { // from class: xsna.hpr0
            @Override // io.reactivex.rxjava3.functions.a
            public final void run() {
                y440Var.postDelayed(new vq3(verticalizationDelegate, 14), Math.max(0L, 500 - (SystemClock.elapsedRealtime() - elapsedRealtime)));
            }
        }, new pw40(new vs6(L.a, 8), 15)));
        getCloseButtonBackground().setVisibility(8);
    }

    @Override // xsna.tvo.a
    public final void wi(int i, List<String> list) {
        c4m0 geoStickerDelegate = getGeoStickerDelegate();
        if (geoStickerDelegate != null) {
            geoStickerDelegate.wi(i, new ArrayList(list));
        }
    }

    @Override // xsna.p5p
    public void y(int i, ArrayList arrayList) {
        wi(i, arrayList);
    }

    @Override // xsna.v76
    public final void z1(ArrayList arrayList, int i, izs izsVar) {
        if (arrayList.size() < 2) {
            return;
        }
        getStyleControls().a(i, arrayList, izsVar);
        getStyleControls().setVisibility(0);
    }

    @Override // xsna.v76
    public final void z6() {
        getStickersDrawingView().setGuidesDrawer(new oim0(getStickersDrawingView(), this.b.c));
        StickersDrawingViewGroup stickersDrawingView = getStickersDrawingView();
        stickersDrawingView.Q = true;
        ial0 ial0Var = stickersDrawingView.l;
        if (ial0Var != null) {
            ial0Var.f(true);
        }
        stickersDrawingView.invalidate();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final ImageView getCloseButton() {
        return (ImageView) this.v.getValue();
    }

    @Override // xsna.s76
    public ViewGroup getEndButtonsPanel() {
        return getSideControlPanelView().getEndButtonsPanel();
    }

    @Override // xsna.dc6
    public u76 getPresenter() {
        return this.h;
    }

    @Override // xsna.s76
    public final ImageView getTrashPreviewBtn() {
        if (getBottomControlPanel().e()) {
            return this.q;
        }
        return null;
    }

    @Override // xsna.v76
    public void setBackgroundImage(Drawable drawable) {
        getStickersDrawingView().setBackgroundState(drawable);
    }

    @Override // xsna.dc6
    public void setPresenter(u76 u76Var) {
        this.h = u76Var;
    }
}
