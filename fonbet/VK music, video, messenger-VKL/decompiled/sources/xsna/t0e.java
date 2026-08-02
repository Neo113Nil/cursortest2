package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.clips.design.view.stikers.ClipsStickersView;
import com.vk.clips.editor.base.api.ClipsEditorScreen;
import com.vk.clips.editor.callbacks.tracker.ClipsEditorScreenType;
import com.vk.clips.editor.stickers.api.NewStickersArranger;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import one.video.view.OneVideoPlayerView;
import xsna.ixd;
import xsna.udl0;
import xsna.uy50;

/* compiled from: ClipsEditorView.kt */
/* loaded from: classes16.dex */
public final class t0e extends ConstraintLayout implements com.vk.clips.editor.base.api.a {
    public final bpn0 A;
    public final bpn0 B;
    public final som0 C;
    public final h1t0 D;
    public final co2 E;
    public final mwd F;
    public final OneVideoPlayerView G;
    public final udl0 H;
    public final bpn0 I;
    public final e2e t;
    public exd u;
    public final ViewGroup v;
    public final bpn0 w;
    public final bpn0 x;
    public final bpn0 y;
    public final bpn0 z;

    /* compiled from: ClipsEditorView.kt */
    public final class a {
        public a() {
        }
    }

    /* compiled from: ClipsEditorView.kt */
    public class b {

        /* compiled from: ClipsEditorView.kt */
        public static final /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ClipsEditorScreen.State.values().length];
                try {
                    iArr[ClipsEditorScreen.State.VIDEO_CROPPER.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ClipsEditorScreen.State.VIDEO_FULLSCREEN.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ClipsEditorScreen.State.STICKERS_SELECTOR.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[ClipsEditorScreen.State.CORRECTION.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[ClipsEditorScreen.State.SPEED.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[ClipsEditorScreen.State.ASPECT_RATIO.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[ClipsEditorScreen.State.STICKERS_STYLE_EDITOR.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[ClipsEditorScreen.State.SWAP.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[ClipsEditorScreen.State.VOLUME.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[ClipsEditorScreen.State.AUDIO_EFFECTS.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public b() {
        }

        public final ClipsEditorScreen a(ClipsEditorScreen.State state) {
            int i = a.$EnumSwitchMapping$0[state.ordinal()];
            t0e t0eVar = t0e.this;
            switch (i) {
                case 1:
                    return t0eVar.getVideoCropper();
                case 2:
                    return t0eVar.getFullscreenPreview();
                case 3:
                    return t0eVar.getStickersSelector();
                case 4:
                    return new qis0(t0eVar, t0eVar.getNavigationHandler(), t0eVar.getAnimationDelegate(), t0eVar.H, t0eVar.getAlertsHandler(), t0eVar.t.i, t0eVar.getPresenter().f());
                case 5:
                    return new ekk0(t0eVar, t0eVar.getNavigationHandler(), t0eVar.getAnimationDelegate(), t0eVar.H, t0eVar.getAlertsHandler(), t0eVar.getPresenter().f());
                case 6:
                    return t0eVar.getAspectRatioEditor();
                case 7:
                    return t0eVar.getStickersStyleEditor();
                case 8:
                    return t0eVar.getSwapEditor();
                case 9:
                    return new c7x0(t0eVar, t0eVar.getNavigationHandler(), t0eVar.getAnimationDelegate(), t0eVar.H, t0eVar.getAlertsHandler(), t0eVar.getPresenter().f());
                case 10:
                    return new hn4(t0eVar, t0eVar.getNavigationHandler(), t0eVar.getAnimationDelegate(), t0eVar.H, t0eVar.getAlertsHandler(), t0eVar.getPresenter().f());
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }

        public final void b(ClipsEditorScreenType clipsEditorScreenType) {
            exd presenter = t0e.this.getPresenter();
            if (presenter != null) {
                presenter.h(clipsEditorScreenType);
            }
        }
    }

    public t0e(lpj lpjVar, e2e e2eVar) {
        super(lpjVar, null, 0);
        this.t = e2eVar;
        this.w = new bpn0(new defpackage.k(this, 16));
        this.x = new bpn0(new com.vk.movika.sdk.android.defaultplayer.interactive.a(this, 20));
        this.y = new bpn0(new ac(this, 18));
        this.z = new bpn0(new f5(this, 23));
        this.A = new bpn0(new g5(this, 19));
        this.B = new bpn0(new i70(this, 22));
        this.I = new bpn0(new j70(this, 22));
        LayoutInflater.from(lpjVar).inflate(R.layout.layout_clips_editor, (ViewGroup) this, true);
        setBackgroundColor(lpjVar.getColor(R.color.vk_black));
        setId(R.id.clips_editor_root_layout);
        setClipChildren(false);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.clips_editor_video_container);
        this.v = viewGroup;
        OneVideoPlayerView oneVideoPlayerView = (OneVideoPlayerView) findViewById(R.id.clips_editor_player_view);
        oneVideoPlayerView.setClipToOutline(true);
        oneVideoPlayerView.setOutlineProvider(new wnf(lpjVar.getResources().getDimension(R.dimen.pro_editor_video_corner_radius)));
        oneVideoPlayerView.setVisibility(0);
        this.G = oneVideoPlayerView;
        ClipsStickersView clipsStickersView = (ClipsStickersView) findViewById(R.id.clips_editor_stickers_view);
        nbl0 nbl0Var = e2eVar.a;
        clipsStickersView.setStickersProvider(nbl0Var);
        this.C = new som0(clipsStickersView);
        this.H = new udl0(clipsStickersView);
        clipsStickersView.setOutlineProvider(new wnf(lpjVar.getResources().getDimension(R.dimen.pro_editor_video_corner_radius)));
        clipsStickersView.setClipToOutline(true);
        clipsStickersView.setLockContentStickers(true);
        clipsStickersView.setLockAllStickersMovement(true);
        clipsStickersView.setGuidesDrawer(new f5f(clipsStickersView, (cng0) nbl0Var.c.getValue()));
        clipsStickersView.setBackgroundState(0);
        clipsStickersView.setOnEmptySpaceClickListener(new d9(this, 8));
        VkImageSimple vkImageSimple = (VkImageSimple) findViewById(R.id.clips_editor_play_button);
        ixd ixdVar = ad0.g;
        ixd.b bVar = (ixdVar != null ? ixdVar : null).a;
        vkImageSimple.setImageResource(R.drawable.vk_icon_play_button_64);
        this.D = new h1t0(findViewById(R.id.clips_editor_play_button), findViewById(R.id.clips_editor_transforms_touchscreen));
        this.E = new co2(viewGroup);
        this.F = new mwd(lpjVar, new a(), e2eVar);
    }

    public static k0e P4(t0e t0eVar) {
        return new k0e((ViewStub) t0eVar.findViewById(R.id.clips_editor_swap), t0eVar.getAnimationDelegate(), t0eVar.getNavigationHandler(), t0eVar.getAlertsHandler(), (i0e) t0eVar.getPresenter().o().getValue());
    }

    public static d0e Q4(t0e t0eVar) {
        return new d0e((ViewStub) t0eVar.findViewById(R.id.clips_editor_stickers_selector), t0eVar.getStickersInteractor(), t0eVar.t.b, t0eVar.getNavigationHandler(), new u0e(3, t0eVar, t0e.class, "addNewSticker", "addNewSticker(Lcom/vk/clips/editor/state/model/ClipsEditorStickerItem;ZLcom/vk/clips/editor/stickers/api/NewStickersArranger;)V", 0), t0eVar.getPresenter().r());
    }

    public static hyd T4(t0e t0eVar) {
        return new hyd((ViewStub) t0eVar.findViewById(R.id.clips_editor_fullscreen_preview), (dyd) t0eVar.getPresenter().m().getValue(), t0eVar.getAnimationDelegate(), t0eVar.getNavigationHandler(), t0eVar.H, t0eVar.t);
    }

    public static h0e U4(t0e t0eVar) {
        return new h0e((ViewStub) t0eVar.findViewById(R.id.clips_editor_stickers_style_editor), t0eVar.getAnimationDelegate(), (e0e) t0eVar.getPresenter().w().getValue(), t0eVar.getNavigationHandler(), new v0e(3, t0eVar, t0e.class, "addNewSticker", "addNewSticker(Lcom/vk/clips/editor/state/model/ClipsEditorStickerItem;ZLcom/vk/clips/editor/stickers/api/NewStickersArranger;)V", 0));
    }

    public static rwd V4(t0e t0eVar) {
        return new rwd((ViewStub) t0eVar.findViewById(R.id.clips_editor_format), t0eVar.getAnimationDelegate(), t0eVar.getNavigationHandler(), (nwd) t0eVar.getPresenter().i().getValue());
    }

    public static s0e X4(t0e t0eVar) {
        return new s0e((ViewStub) t0eVar.findViewById(R.id.clips_editor_video_cropper), t0eVar.getAnimationDelegate(), t0eVar.getPresenter().n(), t0eVar.H, t0eVar.getVideoOverlayInteractor(), t0eVar.t, t0eVar.getNavigationHandler(), t0eVar.getPresenter().y());
    }

    public static final void Y4(t0e t0eVar, com.vk.clips.editor.state.model.b bVar, boolean z, NewStickersArranger newStickersArranger) {
        udl0 udl0Var = t0eVar.H;
        nov novVar = bVar.b;
        yzs yzsVar = udl0Var.b;
        int i = newStickersArranger == null ? -1 : udl0.a.$EnumSwitchMapping$0[newStickersArranger.ordinal()];
        if (i != -1 && i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            float f = f2l0.a;
            yzsVar = new mgi(2);
        }
        udl0Var.a.f(novVar, yzsVar);
        t0eVar.getPresenter().s(bVar, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ClipsEditorScreen getAspectRatioEditor() {
        return (ClipsEditorScreen) this.A.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ClipsEditorScreen getFullscreenPreview() {
        return (ClipsEditorScreen) this.x.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final uy50 getNavigationHandler() {
        return (uy50) this.I.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ClipsEditorScreen getStickersSelector() {
        return (ClipsEditorScreen) this.z.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ClipsEditorScreen getStickersStyleEditor() {
        return (ClipsEditorScreen) this.y.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ClipsEditorScreen getSwapEditor() {
        return (ClipsEditorScreen) this.B.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ClipsEditorScreen getVideoCropper() {
        return (ClipsEditorScreen) this.w.getValue();
    }

    public final boolean g5() {
        uy50 navigationHandler = getNavigationHandler();
        ClipsEditorScreen clipsEditorScreen = navigationHandler.b;
        if (clipsEditorScreen == null) {
            clipsEditorScreen = null;
        }
        if (clipsEditorScreen.a0()) {
            return true;
        }
        ClipsEditorScreen clipsEditorScreen2 = navigationHandler.b;
        if (clipsEditorScreen2 == null) {
            clipsEditorScreen2 = null;
        }
        switch (uy50.a.$EnumSwitchMapping$0[clipsEditorScreen2.getState().ordinal()]) {
            case 1:
                navigationHandler.a();
                return true;
            case 2:
                navigationHandler.b(ClipsEditorScreen.State.VIDEO_CROPPER, null);
                return true;
            case 3:
                navigationHandler.b(ClipsEditorScreen.State.VIDEO_CROPPER, null);
                return true;
            case 4:
                navigationHandler.b(ClipsEditorScreen.State.VIDEO_CROPPER, null);
                return true;
            case 5:
                navigationHandler.b(ClipsEditorScreen.State.VIDEO_CROPPER, null);
                return true;
            case 6:
                navigationHandler.b(ClipsEditorScreen.State.VIDEO_CROPPER, null);
                return true;
            case 7:
                navigationHandler.b(ClipsEditorScreen.State.VIDEO_CROPPER, null);
                return true;
            case 8:
                navigationHandler.b(ClipsEditorScreen.State.VIDEO_CROPPER, null);
                return true;
            case 9:
                navigationHandler.b(ClipsEditorScreen.State.VIDEO_CROPPER, null);
                return true;
            case 10:
                navigationHandler.b(ClipsEditorScreen.State.VIDEO_CROPPER, null);
                return true;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // com.vk.clips.editor.base.api.a
    public hwd getAlertsHandler() {
        return this.F;
    }

    @Override // com.vk.clips.editor.base.api.a
    public wn2 getAnimationDelegate() {
        return this.E;
    }

    @Override // com.vk.clips.editor.base.api.a
    public Context getCtx() {
        return getContext();
    }

    @Override // com.vk.clips.editor.base.api.a
    public ClipsEditorScreen.State getCurrentScreen() {
        ClipsEditorScreen clipsEditorScreen = getNavigationHandler().b;
        if (clipsEditorScreen == null) {
            clipsEditorScreen = null;
        }
        return clipsEditorScreen.getState();
    }

    @Override // com.vk.clips.editor.base.api.a
    public OneVideoPlayerView getPlayerView() {
        return this.G;
    }

    public exd getPresenter() {
        return this.u;
    }

    @Override // com.vk.clips.editor.base.api.a
    public nal0 getStickersInteractor() {
        return this.C;
    }

    @Override // com.vk.clips.editor.base.api.a
    public g1t0 getVideoOverlayInteractor() {
        return this.D;
    }

    public final void h5() {
        uy50 navigationHandler = getNavigationHandler();
        ClipsEditorScreen a2 = navigationHandler.a.a(ClipsEditorScreen.State.VIDEO_CROPPER);
        navigationHandler.b = a2;
        if (a2 == null) {
            a2 = null;
        }
        a2.b(false, null);
        exd presenter = getPresenter();
        if (presenter != null) {
            presenter.prepare();
        }
    }

    public void setPresenter(exd exdVar) {
        this.u = exdVar;
    }
}
