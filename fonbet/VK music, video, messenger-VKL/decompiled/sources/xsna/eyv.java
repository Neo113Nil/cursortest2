package xsna;

import com.vk.im.reporters.api.analytics.click.ImCallClickAnalyticsItem;
import com.vk.stat.scheme.MobileOfficialAppsCallsStat$TypeVoipCallsServicesClick;
import com.vk.stat.scheme.MobileOfficialAppsCallsStat$TypeVoipJoinCallClick;
import com.vk.stat.scheme.MobileOfficialAppsCallsStat$TypeVoipMoreMenuClick;
import com.vk.stat.scheme.MobileOfficialAppsCallsStat$TypeVoipOutgoingCallClick;
import com.vk.stat.scheme.MobileOfficialAppsCallsStat$TypeVoipServicePrivacyMessageClick;
import com.vk.stat.scheme.MobileOfficialAppsImStat$TypeImPhoneNumberCallClickItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import kotlin.NoWhenBranchMatchedException;
import xsna.lwv;
import xsna.mwv;

/* compiled from: ImCallClickAnalytics.kt */
/* loaded from: classes5.dex */
public final class eyv extends bxv<ImCallClickAnalyticsItem> implements lwv.b {
    public static final a c = new a();

    /* compiled from: ImCallClickAnalytics.kt */
    public static final class a implements lwv.a {
        @Override // xsna.lwv.a
        public final boolean a(mwv.a aVar) {
            return aVar instanceof ImCallClickAnalyticsItem;
        }
    }

    /* compiled from: ImCallClickAnalytics.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ImCallClickAnalyticsItem.ConversationType.values().length];
            try {
                iArr[ImCallClickAnalyticsItem.ConversationType.AUDIO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ImCallClickAnalyticsItem.ConversationType.VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ImCallClickAnalyticsItem.ConversationType.MAX.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // xsna.lwv.b
    public final boolean b(mwv.a aVar) {
        if (!(aVar instanceof ImCallClickAnalyticsItem)) {
            return false;
        }
        a((ImCallClickAnalyticsItem) aVar);
        return true;
    }

    @Override // xsna.mwv
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final void a(ImCallClickAnalyticsItem imCallClickAnalyticsItem) {
        SchemeStat$TypeClick.b mobileOfficialAppsCallsStat$TypeVoipServicePrivacyMessageClick;
        SchemeStat$TypeClick.b mobileOfficialAppsCallsStat$TypeVoipMoreMenuClick;
        MobileOfficialAppsCallsStat$TypeVoipOutgoingCallClick.EventType eventType;
        if (imCallClickAnalyticsItem instanceof ImCallClickAnalyticsItem.a) {
            mobileOfficialAppsCallsStat$TypeVoipServicePrivacyMessageClick = new MobileOfficialAppsImStat$TypeImPhoneNumberCallClickItem(MobileOfficialAppsImStat$TypeImPhoneNumberCallClickItem.EventType.PHONE_NUMBER_CALL);
        } else if (imCallClickAnalyticsItem instanceof ImCallClickAnalyticsItem.h) {
            mobileOfficialAppsCallsStat$TypeVoipServicePrivacyMessageClick = new MobileOfficialAppsCallsStat$TypeVoipServicePrivacyMessageClick(MobileOfficialAppsCallsStat$TypeVoipServicePrivacyMessageClick.EventType.INBOX_SERVICE_PRIVACY_MESSAGE_CLICK, MobileOfficialAppsCallsStat$TypeVoipServicePrivacyMessageClick.Source.IM_CHAT);
        } else {
            if (imCallClickAnalyticsItem instanceof ImCallClickAnalyticsItem.b) {
                mobileOfficialAppsCallsStat$TypeVoipMoreMenuClick = new MobileOfficialAppsCallsStat$TypeVoipOutgoingCallClick(MobileOfficialAppsCallsStat$TypeVoipOutgoingCallClick.EventType.OUTGOING_CALL_STARTED_CLICK, MobileOfficialAppsCallsStat$TypeVoipOutgoingCallClick.Source.IM_PROFILE, gyv.a(((ImCallClickAnalyticsItem.b) imCallClickAnalyticsItem).a));
            } else if (imCallClickAnalyticsItem instanceof ImCallClickAnalyticsItem.c) {
                ImCallClickAnalyticsItem.c cVar = (ImCallClickAnalyticsItem.c) imCallClickAnalyticsItem;
                mobileOfficialAppsCallsStat$TypeVoipServicePrivacyMessageClick = new MobileOfficialAppsCallsStat$TypeVoipOutgoingCallClick(cVar.b ? MobileOfficialAppsCallsStat$TypeVoipOutgoingCallClick.EventType.OUTGOING_CALL_STARTED_VIDEO_CLICK : MobileOfficialAppsCallsStat$TypeVoipOutgoingCallClick.EventType.OUTGOING_CALL_STARTED_AUDIO_CLICK, MobileOfficialAppsCallsStat$TypeVoipOutgoingCallClick.Source.IM_PROFILE, gyv.a(cVar.a));
            } else if (imCallClickAnalyticsItem instanceof ImCallClickAnalyticsItem.g) {
                mobileOfficialAppsCallsStat$TypeVoipServicePrivacyMessageClick = new MobileOfficialAppsCallsStat$TypeVoipCallsServicesClick(MobileOfficialAppsCallsStat$TypeVoipCallsServicesClick.EventType.CALLS_SERVICES_CLICK, MobileOfficialAppsCallsStat$TypeVoipCallsServicesClick.Source.IM);
            } else if (imCallClickAnalyticsItem instanceof ImCallClickAnalyticsItem.d) {
                ImCallClickAnalyticsItem.d dVar = (ImCallClickAnalyticsItem.d) imCallClickAnalyticsItem;
                int i = b.$EnumSwitchMapping$0[dVar.a.ordinal()];
                if (i == 1) {
                    eventType = MobileOfficialAppsCallsStat$TypeVoipOutgoingCallClick.EventType.OUTGOING_CALL_STARTED_AUDIO_CLICK;
                } else if (i == 2) {
                    eventType = MobileOfficialAppsCallsStat$TypeVoipOutgoingCallClick.EventType.OUTGOING_CALL_STARTED_VIDEO_CLICK;
                } else {
                    if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    eventType = MobileOfficialAppsCallsStat$TypeVoipOutgoingCallClick.EventType.MAX_CALL_CLICK;
                }
                mobileOfficialAppsCallsStat$TypeVoipMoreMenuClick = new MobileOfficialAppsCallsStat$TypeVoipOutgoingCallClick(eventType, MobileOfficialAppsCallsStat$TypeVoipOutgoingCallClick.Source.IM_HEADER, gyv.a(dVar.b));
            } else if (imCallClickAnalyticsItem instanceof ImCallClickAnalyticsItem.e) {
                mobileOfficialAppsCallsStat$TypeVoipMoreMenuClick = new MobileOfficialAppsCallsStat$TypeVoipJoinCallClick(MobileOfficialAppsCallsStat$TypeVoipJoinCallClick.EventType.GROUP_CALL_JOINED_CLICK, MobileOfficialAppsCallsStat$TypeVoipJoinCallClick.Source.IM_JOIN_POPUP, gyv.a(((ImCallClickAnalyticsItem.e) imCallClickAnalyticsItem).a));
            } else if (imCallClickAnalyticsItem instanceof ImCallClickAnalyticsItem.i) {
                mobileOfficialAppsCallsStat$TypeVoipMoreMenuClick = new MobileOfficialAppsCallsStat$TypeVoipMoreMenuClick(MobileOfficialAppsCallsStat$TypeVoipMoreMenuClick.EventType.CALL_OTHER_CLICK, MobileOfficialAppsCallsStat$TypeVoipMoreMenuClick.Source.IM_HEADER, gyv.a(((ImCallClickAnalyticsItem.i) imCallClickAnalyticsItem).a));
            } else {
                if (!(imCallClickAnalyticsItem instanceof ImCallClickAnalyticsItem.f)) {
                    throw new NoWhenBranchMatchedException();
                }
                mobileOfficialAppsCallsStat$TypeVoipServicePrivacyMessageClick = new MobileOfficialAppsCallsStat$TypeVoipServicePrivacyMessageClick(MobileOfficialAppsCallsStat$TypeVoipServicePrivacyMessageClick.EventType.MISSED_CALL_ATTACHE_CLICK, MobileOfficialAppsCallsStat$TypeVoipServicePrivacyMessageClick.Source.IM_CHAT);
            }
            mobileOfficialAppsCallsStat$TypeVoipServicePrivacyMessageClick = mobileOfficialAppsCallsStat$TypeVoipMoreMenuClick;
        }
        bxv.c(this, null, mobileOfficialAppsCallsStat$TypeVoipServicePrivacyMessageClick, 3);
    }
}
