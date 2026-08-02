package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import com.mbridge.msdk.out.reveue.MBridgeRevenueParamsEntity;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.shortvideo.ClipsAuthor;
import com.vk.metrics.eventtracking.Event;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ClipsSubscriptionItem;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipsGridItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;
import xsna.av20;
import xsna.dw20;
import xsna.grd;
import xsna.ixe;

/* compiled from: SubscribeControllerNoViews.kt */
/* loaded from: classes17.dex */
public final class uvm0 {
    public final Context a;
    public final ebd b;
    public final cye c;
    public final fee d;
    public final io.reactivex.rxjava3.disposables.b e = new io.reactivex.rxjava3.disposables.b();
    public dw20 f;
    public jce g;

    public uvm0(Context context, ebd ebdVar, cye cyeVar, fee feeVar) {
        this.a = context;
        this.b = ebdVar;
        this.c = cyeVar;
        this.d = feeVar;
    }

    public static void a(ClipsAuthor clipsAuthor) {
        Long k = clipsAuthor.k();
        clipsAuthor.n(Long.valueOf(Math.max(0L, (k != null ? k.longValue() : 0L) - 1)));
    }

    public final void b(boolean z) {
        this.c.C(new ixe.v(z));
    }

    public final void c(gzs gzsVar) {
        av20.a aVar = new av20.a();
        Context context = this.a;
        aVar.d(R.layout.actions_popup_item, LayoutInflater.from(context));
        aVar.d = new svm0();
        aVar.f = Collections.singletonList(context.getString(R.string.not_new_clips_indicator_small_modal_unsubscribe));
        aVar.e = new tvm0(gzsVar, this);
        av20 b = aVar.b();
        grd.a aVar2 = new grd.a(context, null);
        aVar2.e = true;
        this.f = dw20.a.k(aVar2.a0(new mll0(this, 5)), b, 6).I0(null);
    }

    public final void d(ClipsAuthor clipsAuthor, Boolean bool) {
        Owner owner = clipsAuthor.b;
        boolean d = fkq0.d(owner.b);
        Context context = this.a;
        io.reactivex.rxjava3.disposables.b bVar = this.e;
        if (d) {
            int i = clipsAuthor.f;
            if (i != 0 && i != 2) {
                if (bool == null) {
                    c(new t9b(15, this, clipsAuthor));
                    return;
                } else {
                    if (Boolean.valueOf(clipsAuthor.U()).equals(bool)) {
                        return;
                    }
                    g(clipsAuthor, bool.booleanValue());
                    return;
                }
            }
            if (bool != null) {
                if (Boolean.valueOf(clipsAuthor.U()).equals(bool)) {
                    return;
                }
                g(clipsAuthor, bool.booleanValue());
                return;
            }
            e(clipsAuthor, true);
            int i2 = clipsAuthor.f;
            Long k = clipsAuthor.k();
            clipsAuthor.f = i2 == 2 ? 3 : 1;
            clipsAuthor.k3(true);
            f(clipsAuthor);
            Long k2 = clipsAuthor.k();
            clipsAuthor.n(Long.valueOf((k2 != null ? k2.longValue() : 0L) + 1));
            b(false);
            bVar.b(hg1.m(o0r0.i(xwk.e(), owner.b, false, null, false, "clips", 100).a0(io.reactivex.rxjava3.android.schedulers.a.b()), context, 0L, false, 62).subscribe(new b0y(new kvm0(this, 0), 26), new hdi0(new vne0(this, clipsAuthor, i2, k, 1), 3)));
            return;
        }
        if (fkq0.b(owner.b)) {
            if (ehd.d(clipsAuthor)) {
                if (bool == null) {
                    c(new jl4(24, this, clipsAuthor));
                    return;
                } else {
                    if (Boolean.valueOf(clipsAuthor.U()).equals(bool)) {
                        return;
                    }
                    g(clipsAuthor, bool.booleanValue());
                    a(clipsAuthor);
                    return;
                }
            }
            if (bool != null) {
                if (Boolean.valueOf(clipsAuthor.U()).equals(bool)) {
                    return;
                }
                g(clipsAuthor, bool.booleanValue());
                return;
            }
            e(clipsAuthor, true);
            boolean U = clipsAuthor.U();
            int i3 = clipsAuthor.f;
            Long k3 = clipsAuthor.k();
            clipsAuthor.f = (clipsAuthor.d == 0 || i3 == 5 || clipsAuthor.h > 0) ? 1 : 4;
            clipsAuthor.k3(true);
            f(clipsAuthor);
            Long k4 = clipsAuthor.k();
            clipsAuthor.n(Long.valueOf((k4 != null ? k4.longValue() : 0L) + 1));
            b(false);
            bVar.b(hg1.m(o0r0.i(xwk.e(), owner.b, false, null, false, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE).a0(io.reactivex.rxjava3.android.schedulers.a.b()), context, 0L, false, 62).subscribe(new o330(new rvm0(this, clipsAuthor, i3, U, k3), 18), new rt10(new lvm0(this, clipsAuthor, i3, U, k3), 17)));
        }
    }

    public final void e(ClipsAuthor clipsAuthor, boolean z) {
        MobileOfficialAppsClipsStat$ClipsSubscriptionItem.EventSubtype eventSubtype;
        if (z) {
            com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
            el3 el3Var = Event.b;
            Event.a b = h5s.b("clips_subscribe");
            b.a(clipsAuthor.b.b, "oid");
            b.i(MBridgeRevenueParamsEntity.ATTRIBUTION_PLATFORM_MY_TRACKER);
            bVar.k(b.e());
        }
        jce jceVar = this.g;
        if (jceVar != null) {
            jceVar.a(z);
        }
        Owner owner = clipsAuthor.b;
        SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(fkq0.d(owner.b) ? SchemeStat$EventItem.Type.USER : SchemeStat$EventItem.Type.GROUP, null, Long.valueOf(owner.b.b), null, null, null, 58, null);
        MobileOfficialAppsClipsStat$TypeClipsGridItem.ScreenType screenType = fkq0.d(owner.b) ? MobileOfficialAppsClipsStat$TypeClipsGridItem.ScreenType.GRID_USER : MobileOfficialAppsClipsStat$TypeClipsGridItem.ScreenType.GRID_COMMUNITY;
        MobileOfficialAppsClipsStat$TypeClipsGridItem.EventType eventType = MobileOfficialAppsClipsStat$TypeClipsGridItem.EventType.CLICK_TO_SUBSCRIPTION_BUTTON;
        if (z) {
            eventSubtype = MobileOfficialAppsClipsStat$ClipsSubscriptionItem.EventSubtype.SUBSCRIBE;
        } else {
            if (z) {
                throw new NoWhenBranchMatchedException();
            }
            eventSubtype = MobileOfficialAppsClipsStat$ClipsSubscriptionItem.EventSubtype.UNSUBSCRIBE;
        }
        SchemeStat$TypeClick b2 = SchemeStat$TypeClick.a.b(schemeStat$EventItem, new MobileOfficialAppsClipsStat$TypeClipsGridItem(eventType, screenType, new MobileOfficialAppsClipsStat$ClipsSubscriptionItem(MobileOfficialAppsClipsStat$ClipsSubscriptionItem.SubscriptionPlace.AUTHOR_GRID, eventSubtype), null, null, 24, null), 2);
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        uzp0 uzp0Var = UiTracker.h;
        uzp0Var.getClass();
        new bjc(c, b2, uzp0Var.a).q();
    }

    public final void f(ClipsAuthor clipsAuthor) {
        boolean z = clipsAuthor.b.p || !(clipsAuthor.g == 0 || !ehd.b(clipsAuthor) || clipsAuthor.f == 3) || ((ehd.c(clipsAuthor) || ehd.e(clipsAuthor)) && !ehd.d(clipsAuthor));
        int i = clipsAuthor.f;
        this.c.C(new ixe.f(z, (i == 0 || i == 2) ? false : true, clipsAuthor.b.o));
    }

    public final void g(ClipsAuthor clipsAuthor, boolean z) {
        int i = clipsAuthor.f;
        int i2 = 1;
        if (!z) {
            if (i == 1) {
                i = 0;
            } else if (i == 3) {
                i = 2;
            }
            i2 = i;
        } else if (i == 2) {
            i2 = 3;
        }
        clipsAuthor.f = i2;
        clipsAuthor.k3(z);
        f(clipsAuthor);
    }
}
