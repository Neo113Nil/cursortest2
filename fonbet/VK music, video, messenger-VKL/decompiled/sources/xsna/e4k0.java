package xsna;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.libvideo.models.videofile.VideoFilePlaybackDo;
import com.vk.stat.scheme.CommonVideoStat$TypeVideoCreateClip;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.video.ui.smartcrop.api.router.SmartCropArguments;
import com.vk.video.ui.smartcrop.impl.presentation.feature.entity.SmartCropState;
import kotlin.NoWhenBranchMatchedException;
import xsna.d4k0;

/* compiled from: SmartCropAnalyticsMiddleware.kt */
/* loaded from: classes7.dex */
public final class e4k0 implements h7f0<SmartCropState, d4k0, on50, ll50<on50, bwj, dwj>, jl50<SmartCropState>, g4k0> {
    public final SmartCropArguments b;
    public final sl50<SmartCropState, d4k0, on50, ll50<on50, bwj, dwj>, jl50<SmartCropState>, g4k0> c;
    public final CommonVideoStat$TypeVideoCreateClip.EventSubtype d;

    /* compiled from: SmartCropAnalyticsMiddleware.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SmartCropArguments.EntryPoint.values().length];
            try {
                iArr[SmartCropArguments.EntryPoint.VIDEO_BOTTOM_SHEET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SmartCropArguments.EntryPoint.VIDEO_EDIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public e4k0(SmartCropArguments smartCropArguments, sl50<SmartCropState, d4k0, on50, ll50<on50, bwj, dwj>, jl50<SmartCropState>, g4k0> sl50Var) {
        CommonVideoStat$TypeVideoCreateClip.EventSubtype eventSubtype;
        this.b = smartCropArguments;
        this.c = sl50Var;
        int i = a.$EnumSwitchMapping$0[smartCropArguments.c.ordinal()];
        if (i == 1) {
            eventSubtype = CommonVideoStat$TypeVideoCreateClip.EventSubtype.FROM_VIDEO_ELLIPSIS;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            eventSubtype = CommonVideoStat$TypeVideoCreateClip.EventSubtype.FROM_VIDEO_ADDITIONAL;
        }
        this.d = eventSubtype;
    }

    @Override // xsna.h7f0
    public final void K(lj50 lj50Var) {
        d4k0 d4k0Var = (d4k0) lj50Var;
        if (d4k0Var instanceof d4k0.c) {
            if (((SmartCropState) getCurrentState()).h) {
                a(CommonVideoStat$TypeVideoCreateClip.EventType.CREATE_CLIP_CUT_CROP);
                return;
            } else {
                a(CommonVideoStat$TypeVideoCreateClip.EventType.CREATE_CLIP_CUT);
                return;
            }
        }
        if (d4k0Var instanceof d4k0.f) {
            a(CommonVideoStat$TypeVideoCreateClip.EventType.CREATE_CLIP_CANCEL);
        } else if (d4k0Var instanceof d4k0.a.C2704a) {
            a(CommonVideoStat$TypeVideoCreateClip.EventType.CREATE_CLIP_CANCEL_YES);
        } else if (d4k0Var instanceof d4k0.a.b) {
            a(CommonVideoStat$TypeVideoCreateClip.EventType.CREATE_CLIP_CANCEL_NO);
        }
    }

    @Override // xsna.h7f0
    public final /* bridge */ /* synthetic */ void T(pk50 pk50Var) {
    }

    public final void a(CommonVideoStat$TypeVideoCreateClip.EventType eventType) {
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(SchemeStat$EventItem.Type.VIDEO, null, null, null, null, null, 62, null);
        VideoFilePlaybackDo videoFilePlaybackDo = this.b.b;
        new bjc(c, SchemeStat$TypeClick.a.b(schemeStat$EventItem, new CommonVideoStat$TypeVideoCreateClip(videoFilePlaybackDo.n, videoFilePlaybackDo.o, eventType, this.d), 2)).q();
    }

    @Override // xsna.rl50
    public final lm50 getCurrentState() {
        return this.c.getCurrentState();
    }

    @Override // xsna.rl50
    public final void init() {
        a(CommonVideoStat$TypeVideoCreateClip.EventType.CREATE_CLIP);
    }

    @Override // xsna.h7f0
    public final /* bridge */ /* synthetic */ void l(hn50 hn50Var) {
    }

    @Override // xsna.h7f0
    public final /* bridge */ /* synthetic */ void o(yl50 yl50Var) {
    }

    @Override // xsna.h7f0
    public final /* bridge */ /* synthetic */ void u(lm50 lm50Var) {
    }

    @Override // xsna.uic
    public final void clear() {
    }
}
