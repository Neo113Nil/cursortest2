package xsna;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.support.v4.media.session.MediaSessionCompat;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockPlaceholder;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionSwitchSection;
import com.vk.catalog2.common.ui.holders.placeholder.UiBlockOnboardingBannerVh;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.music.MusicTrack;
import com.vk.stat.scheme.CommonOnboardingStat$TypeOnboardingEvent;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoChildProfileClicks;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import java.util.Iterator;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class a5f implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ a5f(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0036, code lost:
    
        if (r0 != 3) goto L15;
     */
    @Override // xsna.gzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        int i = this.b;
        int i2 = 0;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                Canvas canvas = (Canvas) obj2;
                uru uruVar = (uru) obj;
                Iterator it = ((List) obj3).iterator();
                while (it.hasNext()) {
                    canvas.drawPath((Path) it.next(), uruVar.a);
                }
                return s3q0.a;
            case 1:
                izs izsVar = (izs) obj3;
                de70 de70Var = (de70) obj2;
                wh50 wh50Var = (wh50) obj;
                if (!jjc.d().a()) {
                    un20.f(wh50Var, false);
                    izsVar.invoke(de70Var.d);
                    s3q0 s3q0Var = s3q0.a;
                }
                return s3q0.a;
            case 2:
                lp40 lp40Var = (lp40) obj3;
                Context context = (Context) obj2;
                mp40 mp40Var = (mp40) obj;
                oz ozVar = new oz(mp40Var, 24);
                tib tibVar = lp40Var.a;
                i2p0 i2p0Var = lp40Var.d;
                MediaSessionCompat mediaSessionCompat = mp40Var.b;
                com.vk.music.track.a aVar = lp40Var.b;
                MusicTrack musicTrack = mp40Var.c;
                boolean z = mp40Var.d;
                boolean z2 = mp40Var.e;
                boolean z3 = mp40Var.g;
                yx40 yx40Var = new yx40(tibVar, i2p0Var, mediaSessionCompat, aVar, context, musicTrack, z, z2, z3);
                lp40Var.c.b(new io.reactivex.rxjava3.internal.operators.mixed.q(io.reactivex.rxjava3.core.x.k(yx40Var.d.k(context, z2, musicTrack, z3)), new cfz(new ux40(yx40Var, i2), 5)).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new t520(new td0(26, ozVar, mp40Var), 7), new bf2(new l6u(mp40Var, 19), 29)));
                return s3q0.a;
            case 3:
                return Boolean.valueOf(((com.vk.core.compose.component.topbar.b) obj3).f((com.vk.core.compose.component.topbar.k) obj2, ((Number) ((mtk0) obj).getValue()).floatValue()));
            default:
                UiBlockOnboardingBannerVh uiBlockOnboardingBannerVh = (UiBlockOnboardingBannerVh) obj3;
                UIBlockActionSwitchSection uIBlockActionSwitchSection = (UIBlockActionSwitchSection) obj;
                SchemeStat$EventItem schemeStat$EventItem = UiBlockOnboardingBannerVh.f;
                UIBlockPlaceholder uIBlockPlaceholder = (UIBlockPlaceholder) ((UIBlock) obj2);
                uiBlockOnboardingBannerVh.b.b(new snn0(uIBlockActionSwitchSection.c), true);
                uiBlockOnboardingBannerVh.b(uIBlockPlaceholder, uIBlockActionSwitchSection);
                int i3 = UiBlockOnboardingBannerVh.a.$EnumSwitchMapping$0[uiBlockOnboardingBannerVh.c.ordinal()];
                if (i3 != 1) {
                    if (i3 != 2) {
                        break;
                    } else {
                        UiBlockOnboardingBannerVh.a(MobileOfficialAppsVideoStat$TypeVideoChildProfileClicks.EventType.CLICK_BANNER).q();
                    }
                    return s3q0.a;
                }
                SchemeStat$EventItem schemeStat$EventItem2 = UiBlockOnboardingBannerVh.f;
                CommonOnboardingStat$TypeOnboardingEvent.EventType eventType = CommonOnboardingStat$TypeOnboardingEvent.EventType.CLICK;
                String str = uIBlockPlaceholder.q;
                if (str == null) {
                    str = "";
                }
                SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(schemeStat$EventItem2, new CommonOnboardingStat$TypeOnboardingEvent(UiBlockOnboardingBannerVh.g, eventType, str, -1, null, null, null, null, PsExtractor.VIDEO_STREAM_MASK, null), 2);
                UiTracker uiTracker = UiTracker.a;
                MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
                uzp0 uzp0Var = UiTracker.h;
                uzp0Var.getClass();
                new bjc(c, b, uzp0Var.a).q();
                return s3q0.a;
        }
    }
}
