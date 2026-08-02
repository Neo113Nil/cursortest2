package xsna;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoToClipAttach;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.video.ui.upload.api.router.AttachedClipsArguments;
import com.vk.video.ui.upload.impl.attachedclips.presentation.feature.entity.AttachedClipsState;
import xsna.t44;
import xsna.x44;

/* compiled from: AttachedClipsAnalyticsMiddleware.kt */
/* loaded from: classes7.dex */
public final class u44 implements h7f0<AttachedClipsState, t44, on50, ll50<on50, bwj, dwj>, jl50<AttachedClipsState>, x44> {
    public final AttachedClipsArguments b;
    public final sl50<AttachedClipsState, t44, on50, ll50<on50, bwj, dwj>, jl50<AttachedClipsState>, x44> c;
    public final bpn0 d = new bpn0(new com.vk.movika.sdk.base.logic.processor.actions.g(this, 4));

    /* compiled from: AttachedClipsAnalyticsMiddleware.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AttachedClipsArguments.EntryPoint.values().length];
            try {
                iArr[AttachedClipsArguments.EntryPoint.FROM_CHANNEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AttachedClipsArguments.EntryPoint.FROM_UPLOAD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AttachedClipsArguments.EntryPoint.FROM_EDIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public u44(AttachedClipsArguments attachedClipsArguments, sl50<AttachedClipsState, t44, on50, ll50<on50, bwj, dwj>, jl50<AttachedClipsState>, x44> sl50Var) {
        this.b = attachedClipsArguments;
        this.c = sl50Var;
    }

    @Override // xsna.h7f0
    public final void K(lj50 lj50Var) {
        if (((t44) lj50Var) instanceof t44.b) {
            a(MobileOfficialAppsVideoStat$TypeVideoToClipAttach.EventType.ATTACH_CLIP_CLICK, true);
        }
    }

    @Override // xsna.h7f0
    public final void T(pk50 pk50Var) {
        x44 x44Var = (x44) pk50Var;
        if ((x44Var instanceof x44.a) && ((x44.a) x44Var).a == null) {
            a(MobileOfficialAppsVideoStat$TypeVideoToClipAttach.EventType.ATTACH_CLIP_CANCEL, false);
        }
    }

    public final void a(MobileOfficialAppsVideoStat$TypeVideoToClipAttach.EventType eventType, boolean z) {
        Integer valueOf = z ? Integer.valueOf(((AttachedClipsState) getCurrentState()).j().size()) : null;
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        SchemeStat$EventItem.Type type = SchemeStat$EventItem.Type.VIDEO;
        AttachedClipsArguments attachedClipsArguments = this.b;
        new bjc(c, SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(type, attachedClipsArguments.c != null ? Long.valueOf(r6.intValue()) : null, Long.valueOf(attachedClipsArguments.b.b), null, null, null, 56, null), new MobileOfficialAppsVideoStat$TypeVideoToClipAttach(eventType, (MobileOfficialAppsVideoStat$TypeVideoToClipAttach.EventSubtype) this.d.getValue(), valueOf), 2)).q();
    }

    @Override // xsna.rl50
    public final lm50 getCurrentState() {
        return this.c.getCurrentState();
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

    @Override // xsna.rl50
    public final void init() {
    }
}
