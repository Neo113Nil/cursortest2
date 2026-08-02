package xsna;

import android.content.SharedPreferences;
import com.vk.core.preference.Preference;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.libvideo.api.minimizable.VideoMinimizableState;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.stat.scheme.CommonVideoStat$TypeVsidItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$CastConnectOfferModalType;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeCloseCastConnectOfferModal;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeScreenMode;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoPlayerButtonClick;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$VideoEventSource;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.toggle.b;
import java.util.LinkedHashSet;
import kotlin.Pair;
import org.json.JSONObject;

/* compiled from: RetranslationPopupDiscoveryDelegate.kt */
/* loaded from: classes7.dex */
public final class veg0 {
    public final io.reactivex.rxjava3.subjects.d<VideoMinimizableState> a;
    public final SharedPreferences b = Preference.f("cast-settings");
    public final boolean c;
    public final Integer d;
    public final Integer e;
    public final Integer f;
    public final Integer g;
    public final Integer h;
    public final Integer i;
    public b0a j;
    public int k;
    public Pair<String, String> l;
    public final LinkedHashSet m;
    public Integer n;
    public long o;
    public long p;
    public int q;
    public boolean r;
    public String s;
    public long t;
    public long u;

    /* compiled from: RetranslationPopupDiscoveryDelegate.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MobileOfficialAppsVideoStat$CastConnectOfferModalType.values().length];
            try {
                iArr[MobileOfficialAppsVideoStat$CastConnectOfferModalType.OFFER_MODAL_FIRST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public veg0(b.d dVar, io.reactivex.rxjava3.subjects.d<VideoMinimizableState> dVar2) {
        this.a = dVar2;
        this.c = p1p0.a(dVar);
        JSONObject g = dVar != null ? dVar.g() : null;
        Integer valueOf = g != null ? Integer.valueOf(g.optInt("popup_frequency_no_session_hours")) : null;
        this.d = valueOf;
        this.e = g != null ? Integer.valueOf(g.optInt("popup_frequency_with_sessions_hours")) : null;
        this.f = g != null ? Integer.valueOf(g.optInt("number_of_closings_to_rest")) : null;
        this.g = g != null ? Integer.valueOf(g.optInt("rest_interval_days")) : null;
        this.h = g != null ? Integer.valueOf(g.optInt("min_video_duration_minutes")) : null;
        this.i = g != null ? Integer.valueOf(g.optInt("popup_appearance_delay_seconds")) : null;
        this.m = new LinkedHashSet();
        this.n = valueOf;
        this.u = System.currentTimeMillis();
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.d, new Object[]{"RETRANSLATION_UTILS", "Initializing RetranslationUtils..."});
        }
        L l2 = L.a;
        l2.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l2, L.LogType.d, new Object[]{"RETRANSLATION_UTILS", "isEnabled: " + this.c});
        }
        L l3 = L.a;
        l3.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l3, L.LogType.d, new Object[]{"RETRANSLATION_UTILS", "frequencyNoSessions: " + this.d});
        }
        L l4 = L.a;
        l4.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l4, L.LogType.d, new Object[]{"RETRANSLATION_UTILS", "frequencyWithSessions: " + this.e});
        }
        L l5 = L.a;
        l5.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l5, L.LogType.d, new Object[]{"RETRANSLATION_UTILS", "closingsToRest: " + this.f});
        }
        L l6 = L.a;
        l6.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l6, L.LogType.d, new Object[]{"RETRANSLATION_UTILS", "restInterval: " + this.g});
        }
        L l7 = L.a;
        l7.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l7, L.LogType.d, new Object[]{"RETRANSLATION_UTILS", "minVideoDuration: " + this.h});
        }
        L l8 = L.a;
        l8.getClass();
        if (L.m(LoggerOutputTarget.NONE)) {
            return;
        }
        L.u(l8, L.LogType.d, new Object[]{"RETRANSLATION_UTILS", "popupDelay: " + this.i});
    }

    public final MobileOfficialAppsVideoStat$TypeScreenMode a() {
        VideoMinimizableState P0 = this.a.P0();
        if (P0 instanceof VideoMinimizableState.FullscreenVertical) {
            return MobileOfficialAppsVideoStat$TypeScreenMode.FULLSCREEN_PORTRAIT;
        }
        if (P0 instanceof VideoMinimizableState.FullscreenHorizontal) {
            return MobileOfficialAppsVideoStat$TypeScreenMode.FULLSCREEN_LANDSCAPE;
        }
        if (P0 instanceof VideoMinimizableState.Expanded) {
            return MobileOfficialAppsVideoStat$TypeScreenMode.DISCOVERY;
        }
        return null;
    }

    public final void b(MobileOfficialAppsVideoStat$CastConnectOfferModalType mobileOfficialAppsVideoStat$CastConnectOfferModalType, MobileOfficialAppsVideoStat$VideoEventSource mobileOfficialAppsVideoStat$VideoEventSource) {
        Integer num;
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.d, new Object[]{"RETRANSLATION_UTILS", "onDismissPopup() in RetranslationPopupDiscoveryDelegate."});
        }
        qu5.c().getClass();
        if (this.j != null && (num = this.f) != null) {
            int intValue = num.intValue();
            int i = this.q + 1;
            this.q = i;
            if (i >= intValue) {
                System.currentTimeMillis();
                this.q = 0;
            }
        }
        und0 und0Var = new und0();
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(SchemeStat$EventItem.Type.EVENT, null, null, null, null, null, 62, null);
        MobileOfficialAppsVideoStat$TypeCloseCastConnectOfferModal.EventType eventType = MobileOfficialAppsVideoStat$TypeCloseCastConnectOfferModal.EventType.CLOSE_CAST_CONNECT_OFFER_MODAL;
        String str = this.s;
        if (str == null) {
            str = "";
        }
        SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(schemeStat$EventItem, new MobileOfficialAppsVideoStat$TypeCloseCastConnectOfferModal(eventType, mobileOfficialAppsVideoStat$CastConnectOfferModalType, mobileOfficialAppsVideoStat$VideoEventSource, new CommonVideoStat$TypeVsidItem(str), a(), Integer.valueOf((int) this.t)), 2);
        und0Var.f = c;
        und0Var.g = b;
        und0Var.q();
    }

    public final void c(MobileOfficialAppsVideoStat$CastConnectOfferModalType mobileOfficialAppsVideoStat$CastConnectOfferModalType) {
        und0 und0Var = new und0();
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(SchemeStat$EventItem.Type.EVENT, null, null, null, null, null, 62, null);
        MobileOfficialAppsVideoStat$TypeVideoPlayerButtonClick.ButtonClickType buttonClickType = MobileOfficialAppsVideoStat$TypeVideoPlayerButtonClick.ButtonClickType.CLICK_TO_EXTERNAL_DEVICE_SHARE_BUTTON;
        String str = this.s;
        if (str == null) {
            str = "";
        }
        CommonVideoStat$TypeVsidItem commonVideoStat$TypeVsidItem = new CommonVideoStat$TypeVsidItem(str);
        MobileOfficialAppsVideoStat$TypeScreenMode a2 = a();
        int i = (int) this.t;
        SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(schemeStat$EventItem, new MobileOfficialAppsVideoStat$TypeVideoPlayerButtonClick(buttonClickType, commonVideoStat$TypeVsidItem.a, a2, a.$EnumSwitchMapping$0[mobileOfficialAppsVideoStat$CastConnectOfferModalType.ordinal()] == 1 ? MobileOfficialAppsVideoStat$VideoEventSource.OFFER_MODAL_FIRST : MobileOfficialAppsVideoStat$VideoEventSource.OFFER_MODAL_RECONNECT_MULTI, Integer.valueOf(i)), 2);
        und0Var.f = c;
        und0Var.g = b;
        und0Var.q();
    }
}
