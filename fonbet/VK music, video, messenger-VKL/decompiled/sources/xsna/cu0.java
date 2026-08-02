package xsna;

import com.vk.clips.sdk.models.SdkActionLink;
import com.vk.clips.sdk.stats.pixels.models.AdStatPixel;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ClipsMoreMenuItem;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipsClipItem;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipsStatAdsAction;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import com.vk.stat.scheme.SchemeStat$TypeClipViewerItem;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import xsna.gih0;
import xsna.yt0;

/* compiled from: AdsAnalyticsDelegateImpl.kt */
/* loaded from: classes17.dex */
public final class cu0 implements au0 {
    public final SchemeStat$TypeClipViewerItem.ScreenType a;
    public final ki0 b;
    public final uvx c;
    public final emi d;
    public final Object e;
    public final Object f;

    public cu0(SchemeStat$TypeClipViewerItem.ScreenType screenType, q20 q20Var, ki0 ki0Var, uvx uvxVar, emi emiVar) {
        this.a = screenType;
        this.b = ki0Var;
        this.c = uvxVar;
        this.d = emiVar;
        bu0 bu0Var = new bu0(0);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.e = msy.a(lazyThreadSafetyMode, bu0Var);
        this.f = msy.a(lazyThreadSafetyMode, new cb(q20Var, 2));
    }

    public static gih0 b(yt0 yt0Var) {
        zt0 model = yt0Var.getModel();
        ju0 ju0Var = new ju0(model.a, model.b);
        if (yt0Var instanceof yt0.a) {
            return new gih0.a(((yt0.a) yt0Var).b, ju0Var);
        }
        if (yt0Var instanceof yt0.b) {
            return new gih0.b(ju0Var);
        }
        if (yt0Var instanceof yt0.c) {
            return new gih0.c(ju0Var);
        }
        if (yt0Var instanceof yt0.i) {
            return new gih0.j(ju0Var);
        }
        if (yt0Var instanceof yt0.h) {
            yt0.h hVar = (yt0.h) yt0Var;
            if (hVar instanceof yt0.h.a) {
                return new gih0.h.a(ju0Var);
            }
            if (hVar instanceof yt0.h.c) {
                return new gih0.h.c(ju0Var);
            }
            if (hVar instanceof yt0.h.d) {
                return new gih0.h.d(ju0Var);
            }
            if (hVar instanceof yt0.h.b) {
                return new gih0.h.b(ju0Var);
            }
            throw new NoWhenBranchMatchedException();
        }
        if (yt0Var instanceof yt0.f) {
            return new gih0.f(ju0Var);
        }
        if (yt0Var instanceof yt0.j) {
            return new gih0.k(ju0Var);
        }
        if (yt0Var instanceof yt0.g) {
            return new gih0.g(ju0Var);
        }
        if (yt0Var instanceof yt0.d) {
            return new gih0.d(ju0Var);
        }
        if (yt0Var instanceof yt0.e) {
            return new gih0.e(ju0Var);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.au0
    public final void a(gih0 gih0Var) {
        SchemeStat$TypeClipViewerItem schemeStat$TypeClipViewerItem;
        SchemeStat$TypeAction.b bVar;
        MobileOfficialAppsClipsStat$ClipsMoreMenuItem.EventSubtype eventSubtype;
        ((iu0) this.e.getValue()).getClass();
        boolean z = gih0Var instanceof gih0.f;
        SchemeStat$EventItem schemeStat$EventItem = (z || (gih0Var instanceof gih0.a) || (gih0Var instanceof gih0.h) || (gih0Var instanceof gih0.k) || (gih0Var instanceof gih0.b) || (gih0Var instanceof gih0.c) || (gih0Var instanceof gih0.g) || (gih0Var instanceof gih0.d) || (gih0Var instanceof gih0.e)) ? new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLIP, null, null, null, gih0Var.getModel().a, null, 46, null) : null;
        ?? r4 = this.f;
        ku0 ku0Var = (ku0) r4.getValue();
        ku0Var.getClass();
        boolean z2 = gih0Var instanceof gih0.a;
        SchemeStat$TypeClipViewerItem.ScreenType screenType = this.a;
        if (z2) {
            SdkActionLink sdkActionLink = ((gih0.a) gih0Var).a;
            SchemeStat$TypeClipViewerItem.EventType eventType = SchemeStat$TypeClipViewerItem.EventType.CLICK_TO_ACTION_BUTTON;
            q20 q20Var = ku0Var.a;
            String str = sdkActionLink.e;
            q20Var.getClass();
            schemeStat$TypeClipViewerItem = new SchemeStat$TypeClipViewerItem(screenType, eventType, null, null, null, null, null, null, null, null, new SchemeStat$EventItem(q20.a(str), Long.valueOf(sdkActionLink.c), null, sdkActionLink.f, sdkActionLink.b, null, 36, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073740796, null);
        } else {
            schemeStat$TypeClipViewerItem = z ? new SchemeStat$TypeClipViewerItem(screenType, SchemeStat$TypeClipViewerItem.EventType.CLICK_TO_EXPAND_DESCRIPTION, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741820, null) : null;
        }
        ((ku0) r4.getValue()).getClass();
        if (gih0Var instanceof gih0.k) {
            bVar = new MobileOfficialAppsClipsStat$TypeClipsStatAdsAction(MobileOfficialAppsClipsStat$TypeClipsStatAdsAction.Type.START);
        } else if (gih0Var instanceof gih0.h) {
            gih0.h hVar = (gih0.h) gih0Var;
            if (hVar instanceof gih0.h.b) {
                eventSubtype = MobileOfficialAppsClipsStat$ClipsMoreMenuItem.EventSubtype.REPORT;
            } else if (hVar instanceof gih0.h.a) {
                eventSubtype = MobileOfficialAppsClipsStat$ClipsMoreMenuItem.EventSubtype.SHOW_ADS_INFO;
            } else if (hVar instanceof gih0.h.c) {
                eventSubtype = MobileOfficialAppsClipsStat$ClipsMoreMenuItem.EventSubtype.COPY_ERID;
            } else {
                if (!(hVar instanceof gih0.h.d)) {
                    throw new NoWhenBranchMatchedException();
                }
                eventSubtype = MobileOfficialAppsClipsStat$ClipsMoreMenuItem.EventSubtype.NOT_INTERESTING;
            }
            bVar = new SchemeStat$TypeClipViewerItem(this.a, SchemeStat$TypeClipViewerItem.EventType.CLICK_MORE, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new MobileOfficialAppsClipsStat$ClipsMoreMenuItem(eventSubtype, null, new MobileOfficialAppsClipsStat$TypeClipsClipItem(0, 0L, hVar.getModel().a), 2, null), null, null, null, null, null, 1056964604, null);
        } else {
            bVar = null;
        }
        uvx uvxVar = this.c;
        emi emiVar = this.d;
        if (schemeStat$EventItem != null && schemeStat$TypeClipViewerItem != null) {
            uvxVar.c(emiVar.n(), schemeStat$EventItem, schemeStat$TypeClipViewerItem);
        }
        if (bVar != null) {
            MobileOfficialAppsCoreNavStat$EventScreen n = emiVar.n();
            emiVar.getClass();
            UiTracker uiTracker = UiTracker.a;
            UiTrackingScreen b = UiTracker.j.b();
            uvxVar.a(n, b != null ? b.a : null, schemeStat$EventItem, bVar);
        }
        Map<AdStatPixel.Type, List<AdStatPixel>> map = gih0Var.getModel().b;
        if (map != null) {
            ki0 ki0Var = this.b;
            if (z2 || (gih0Var instanceof gih0.b) || (gih0Var instanceof gih0.c) || (gih0Var instanceof gih0.j)) {
                ki0Var.d(map);
                return;
            }
            if (gih0Var instanceof gih0.e) {
                ki0Var.n(map);
                return;
            }
            if (gih0Var instanceof gih0.h.d) {
                ki0Var.m(map);
                return;
            }
            if (gih0Var instanceof gih0.i) {
                ki0Var.h(map);
            } else if ((gih0Var instanceof gih0.g) || (gih0Var instanceof gih0.d)) {
                ki0Var.a(map);
            }
        }
    }
}
