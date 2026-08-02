package xsna;

import com.vk.clips.editor.base.api.ClipsEditorScreen;
import com.vk.clips.editor.callbacks.tracker.ClipsEditorScreenType;
import xsna.t0e;

/* compiled from: NavigationHandlerImpl.kt */
/* loaded from: classes16.dex */
public final class uy50 implements com.vk.clips.editor.base.api.b {
    public final t0e.b a;
    public ClipsEditorScreen b;

    /* compiled from: NavigationHandlerImpl.kt */
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

    public uy50(t0e.b bVar) {
        this.a = bVar;
    }

    @Override // com.vk.clips.editor.base.api.b
    public final void a() {
        t0e t0eVar = t0e.this;
        exd presenter = t0eVar.getPresenter();
        if (presenter != null) {
            presenter.q(t0eVar.getPresenter().e());
        }
    }

    @Override // com.vk.clips.editor.base.api.b
    public final void b(ClipsEditorScreen.State state, ClipsEditorScreen.a aVar) {
        exd presenter;
        x8d b;
        t0e.b bVar = this.a;
        ClipsEditorScreen a2 = bVar.a(state);
        ClipsEditorScreen clipsEditorScreen = this.b;
        if (clipsEditorScreen == null) {
            clipsEditorScreen = null;
        }
        clipsEditorScreen.close();
        this.b = a2;
        a2.b(true, aVar);
        if (state != ClipsEditorScreen.State.VIDEO_CROPPER && (presenter = t0e.this.getPresenter()) != null && (b = presenter.b()) != null) {
            b.p();
        }
        int i = a.$EnumSwitchMapping$0[state.ordinal()];
        if (i == 1) {
            bVar.b(ClipsEditorScreenType.CLIPS_EDITOR);
            return;
        }
        if (i == 2) {
            bVar.b(ClipsEditorScreenType.CLIPS_EDITOR_FULLSCREEN);
            return;
        }
        if (i == 4) {
            bVar.b(ClipsEditorScreenType.CLIPS_FRAGMENT_COLOR_CORRECTION_EDITOR);
            return;
        }
        if (i == 5) {
            bVar.b(ClipsEditorScreenType.CLIPS_FRAGMENT_SPEED_EDITOR);
            return;
        }
        switch (i) {
            case 8:
                bVar.b(ClipsEditorScreenType.CLIPS_EDITOR_FRAGMENTS_SWAP);
                break;
            case 9:
                bVar.b(ClipsEditorScreenType.CLIPS_FRAGMENT_VOLUME_EDITOR);
                break;
            case 10:
                bVar.b(ClipsEditorScreenType.CLIPS_FRAGMENT_AUDIO_EFFECT_EDITOR);
                break;
        }
    }
}
