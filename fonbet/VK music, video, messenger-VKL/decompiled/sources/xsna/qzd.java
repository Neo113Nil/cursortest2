package xsna;

import com.vk.clips.editor.callbacks.tracker.ClipsEditorScreenType;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ClipsCreateContext;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipEditorItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;

/* compiled from: ClipsEditorStatController.kt */
/* loaded from: classes16.dex */
public final class qzd {
    public final int a;
    public final irk0 b;
    public final MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint c;
    public final bpn0 d = new bpn0(new m1(this, 25));

    /* compiled from: ClipsEditorStatController.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ClipsEditorScreenType.values().length];
            try {
                iArr[ClipsEditorScreenType.CLIPS_EDITOR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ClipsEditorScreenType.CLIPS_FRAGMENT_SPEED_EDITOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ClipsEditorScreenType.CLIPS_FRAGMENT_AUDIO_EFFECT_EDITOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ClipsEditorScreenType.CLIPS_FRAGMENT_VOLUME_EDITOR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ClipsEditorScreenType.CLIPS_FRAGMENT_COLOR_CORRECTION_EDITOR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ClipsEditorScreenType.CLIPS_EDITOR_FRAGMENTS_SWAP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ClipsEditorScreenType.CLIPS_EDITOR_FULLSCREEN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public qzd(int i, irk0 irk0Var, MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint creationEntryPoint) {
        this.a = i;
        this.b = irk0Var;
        this.c = creationEntryPoint;
    }

    public final void a(MobileOfficialAppsClipsStat$TypeClipEditorItem.a aVar) {
        irk0 irk0Var = this.b;
        if (irk0Var == null) {
            return;
        }
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint creationEntryPoint = this.c;
        if (creationEntryPoint == null) {
            creationEntryPoint = MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint.OTHER;
        }
        new xxd(c, new MobileOfficialAppsClipsStat$ClipsCreateContext(this.a, creationEntryPoint), aVar, irk0Var).q();
    }

    public final y1q0 b() {
        return (y1q0) this.d.getValue();
    }
}
