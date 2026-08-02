package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.core.voip.VoipCallSource;
import com.vk.dto.common.id.UserId;
import com.vk.dto.masks.Mask;
import com.vk.log.L;
import com.vk.stat.scheme.MobileOfficialAppsCallsStat$TypeVoipCallItem;
import com.vk.stat.scheme.MobileOfficialAppsCallsStat$TypeVoipErrorItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.voip.analytics.device.audio.output.model.VoipAudioOutputTypeAnalytics;
import com.vk.voip.api.id.CallId;
import com.vk.voip.dto.call_member.CallMemberId;
import com.vk.voip.ui.assessment.BadAssessmentReason;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import xsna.e49;

/* compiled from: VkVoipProdStatHelper.kt */
/* loaded from: classes11.dex */
public final class g1w0 implements pvw0 {
    public static void Q0(g1w0 g1w0Var, MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType callEventType, String str, MobileOfficialAppsCallsStat$TypeVoipCallItem.Source source, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, String str2, CallId callId, String str3, boolean z, Integer num, Integer num2, String str4, Integer num3, String str5, Integer num4, String str6, String str7, Boolean bool, Integer num5, UserId userId, Long l, Integer num6, String str8, MobileOfficialAppsCallsStat$TypeVoipCallItem.SharingChannel sharingChannel, Integer num7, Integer num8, Integer num9, Integer num10, int i) {
        MobileOfficialAppsCallsStat$TypeVoipCallItem.Source source2;
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen2;
        String str9;
        CallId callId2;
        String str10;
        Integer num11;
        Long valueOf;
        Integer num12;
        Long h;
        int i2;
        String str11 = (i & 2) != 0 ? null : str;
        if ((i & 4) != 0) {
            com.vk.voip.ui.c.b.getClass();
            source2 = com.vk.voip.ui.c.Y0.b;
        } else {
            source2 = source;
        }
        if ((i & 8) != 0) {
            com.vk.voip.ui.c.b.getClass();
            mobileOfficialAppsCoreNavStat$EventScreen2 = com.vk.voip.ui.c.Y0.c;
        } else {
            mobileOfficialAppsCoreNavStat$EventScreen2 = mobileOfficialAppsCoreNavStat$EventScreen;
        }
        if ((i & 16) != 0) {
            com.vk.voip.ui.c.b.getClass();
            str9 = String.valueOf(com.vk.voip.ui.c.K);
        } else {
            str9 = str2;
        }
        if ((i & 32) != 0) {
            com.vk.voip.ui.c.b.getClass();
            callId2 = com.vk.voip.ui.c.T0;
        } else {
            callId2 = callId;
        }
        String str12 = (i & 64) != 0 ? "calls_v2" : str3;
        boolean z2 = (i & 128) != 0 ? false : z;
        Integer num13 = (i & 256) != 0 ? null : num;
        Integer num14 = (i & 512) != 0 ? null : num2;
        String str13 = (i & 1024) != 0 ? null : str4;
        Integer num15 = (i & 2048) != 0 ? null : num3;
        String str14 = (i & 4096) != 0 ? null : str5;
        Integer num16 = (i & 16384) != 0 ? null : num4;
        String str15 = (32768 & i) != 0 ? null : str6;
        String str16 = (65536 & i) != 0 ? null : str7;
        Boolean bool2 = (131072 & i) != 0 ? null : bool;
        g1w0Var.getClass();
        com.vk.voip.ui.c cVar = com.vk.voip.ui.c.b;
        dhw0 L = cVar.L();
        UserId o = (L == null || !l2l0.m(L)) ? null : L.o();
        Integer num17 = (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : num5;
        UserId userId2 = (i & 2097152) != 0 ? null : userId;
        Long l2 = (i & 4194304) != 0 ? null : l;
        Integer num18 = (i & 8388608) != 0 ? null : num6;
        String str17 = (i & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : str8;
        MobileOfficialAppsCallsStat$TypeVoipCallItem.SharingChannel sharingChannel2 = (i & 33554432) != 0 ? null : sharingChannel;
        if ((i & 67108864) == 0) {
            str10 = str9;
            num11 = num7;
        } else if (str15 == null) {
            str10 = str9;
            num11 = null;
        } else {
            str10 = str9;
            Integer m = arm0.m(10, str15);
            num11 = Integer.valueOf(m != null ? m.intValue() : 0);
        }
        Integer num19 = (i & 134217728) != 0 ? null : num8;
        Integer num20 = (i & 268435456) != 0 ? null : num9;
        Integer num21 = (i & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : num10;
        g1w0Var.getClass();
        Integer num22 = num11;
        Integer num23 = num21;
        L.e("VkVoipProdStatHelper", "stat reported: event=" + callEventType + " callId=" + callId2);
        String str18 = str16;
        String str19 = str12;
        String valueOf2 = String.valueOf(System.currentTimeMillis() * ((long) 1000));
        String str20 = callId2.b;
        String str21 = str10 == null ? "" : str10;
        if (str18 == null) {
            valueOf = null;
        } else {
            Long n = arm0.n(str18);
            valueOf = Long.valueOf(n != null ? n.longValue() : 0L);
        }
        if (bool2 != null) {
            if (bool2.equals(Boolean.TRUE)) {
                i2 = 1;
            } else {
                if (!bool2.equals(Boolean.FALSE)) {
                    throw new NoWhenBranchMatchedException();
                }
                i2 = 0;
            }
            num12 = i2;
        } else {
            num12 = null;
        }
        Long l3 = valueOf;
        Long valueOf3 = o != null ? Long.valueOf(o.b) : null;
        Long valueOf4 = userId2 != null ? Long.valueOf(userId2.b) : null;
        Integer valueOf5 = l2 != null ? Integer.valueOf((int) l2.longValue()) : null;
        Long valueOf6 = num18 != null ? Long.valueOf(num18.intValue()) : null;
        zqk0 g0 = cVar.g0();
        new znw0(mobileOfficialAppsCoreNavStat$EventScreen2, new MobileOfficialAppsCallsStat$TypeVoipCallItem(callEventType, valueOf2, str20, str21, str19, z2, source2, num13, num14, str13, num15, num23, null, num16, num22, l3, num12, null, str17, null, null, null, valueOf3, num17, valueOf6, valueOf4, valueOf5, sharingChannel2, num19, num20, (g0 == null || (h = g0.h()) == null) ? null : Integer.valueOf((int) h.longValue()), null, null, null, null, str14, null, null, null, null, str11, -2143813632, 247, null)).q();
    }

    @Override // xsna.pvw0
    public final void A(int i, String str, String str2, boolean z) {
        Set<CallMemberId> k;
        MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType callEventType = MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType.CALL_STREAMING_START_FAILED;
        com.vk.voip.ui.c cVar = com.vk.voip.ui.c.b;
        boolean s0 = cVar.s0();
        dhw0 L = cVar.L();
        Q0(this, callEventType, null, null, null, null, null, null, s0, Integer.valueOf((L == null || (k = L.k()) == null) ? 0 : k.size()), null, null, Integer.valueOf(i), null, null, str, str2, Boolean.valueOf(z), null, null, null, null, null, null, null, null, null, null, 1073510014);
    }

    @Override // xsna.pvw0
    public final void A0() {
        Q0(this, MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType.OPEN_CHAT, null, null, MobileOfficialAppsCoreNavStat$EventScreen.VOIP_CALL, null, null, null, com.vk.voip.ui.c.b.s0(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741686);
    }

    @Override // xsna.pvw0
    public final void B() {
        Q0(this, MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType.REJECT_PARTICIPANT_W_R, null, null, MobileOfficialAppsCoreNavStat$EventScreen.VOIP_CALL, null, null, null, com.vk.voip.ui.c.b.s0(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741686);
    }

    @Override // xsna.e49
    public final void B0(e49.e eVar) {
        long a;
        long d;
        if (eVar.f()) {
            a = eVar.d();
            d = eVar.a();
        } else {
            a = eVar.a();
            d = eVar.d();
        }
        MobileOfficialAppsCallsStat$TypeVoipErrorItem mobileOfficialAppsCallsStat$TypeVoipErrorItem = new MobileOfficialAppsCallsStat$TypeVoipErrorItem(String.valueOf(a), String.valueOf(d), eVar.e(), eVar.e(), Boolean.valueOf(eVar.c()), qjg.a(eVar.b()));
        com.vk.voip.ui.c.b.getClass();
        new ynw0(com.vk.voip.ui.c.Y0.c, mobileOfficialAppsCallsStat$TypeVoipErrorItem).q();
    }

    @Override // xsna.pvw0
    public final void C(CallId callId) {
        CallId callId2;
        MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType callEventType = MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType.CALL_PREVIEW_LINK_SHARED;
        if (callId == null) {
            com.vk.voip.ui.c.b.getClass();
            callId2 = com.vk.voip.ui.c.T0;
        } else {
            callId2 = callId;
        }
        Q0(this, callEventType, null, null, null, null, callId2, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741790);
    }

    @Override // xsna.pvw0
    public final void C0(CallId callId) {
        CallId callId2;
        MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType callEventType = MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType.CALL_PREVIEW_MIC_ENABLED;
        if (callId == null) {
            com.vk.voip.ui.c.b.getClass();
            callId2 = com.vk.voip.ui.c.T0;
        } else {
            callId2 = callId;
        }
        Q0(this, callEventType, null, null, null, null, callId2, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741790);
    }

    @Override // xsna.pvw0
    public final void D() {
        Q0(this, MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType.NAME_CHANGED_BY_COMMUNITY, null, null, null, null, null, null, com.vk.voip.ui.c.b.s0(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741694);
    }

    @Override // xsna.e49
    public final void D0(e49.l lVar) {
        String valueOf;
        VoipCallSource f = lVar.f();
        if (f == null) {
            com.vk.voip.ui.c.b.getClass();
            f = com.vk.voip.ui.c.Y0;
        }
        if (lVar.g()) {
            valueOf = "2000000000";
        } else if (lVar.e() != null) {
            valueOf = lVar.e();
        } else {
            com.vk.voip.ui.c.b.getClass();
            valueOf = String.valueOf(com.vk.voip.ui.c.K);
        }
        String str = valueOf;
        MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType callEventType = MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType.OUTGOING_CALL_FAILED;
        int c = lVar.c();
        String d = lVar.d();
        boolean g = lVar.g();
        Q0(this, callEventType, null, f.b, f.c, str, lVar.b(), null, g, null, null, null, Integer.valueOf(c), d, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073735490);
    }

    @Override // xsna.e49
    public final void E(e49.j jVar) {
        Q0(this, MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType.GROUP_CALL_JOINED, null, null, null, "2000000000", jVar.a(), null, true, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741646);
    }

    @Override // xsna.pvw0
    public final void E0() {
        Q0(this, MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType.REQUEST_INTERACTION, null, null, MobileOfficialAppsCoreNavStat$EventScreen.VOIP_CALL, null, null, null, com.vk.voip.ui.c.b.s0(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741686);
    }

    @Override // xsna.pvw0
    public final void F() {
        Q0(this, MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType.WHITE_BOARD_VIEW_CLICK, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741822);
    }

    @Override // xsna.pvw0
    public final void F0(int i) {
        Q0(this, MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType.OUTGOING_CALL_ADD_PARTICIPANTS_SENT, null, null, MobileOfficialAppsCoreNavStat$EventScreen.VOIP_CALL, "2000000000", null, null, true, Integer.valueOf(i), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741414);
    }

    @Override // xsna.pvw0
    public final void G(int i, UserId userId) {
        Q0(this, MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType.MASK_ON, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, userId, null, Integer.valueOf(i), null, null, null, null, null, null, 1063256062);
    }

    @Override // xsna.pvw0
    public final void G0() {
        Set<CallMemberId> k;
        MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType callEventType = MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType.CALL_STREAMING_CLICK;
        com.vk.voip.ui.c cVar = com.vk.voip.ui.c.b;
        boolean s0 = cVar.s0();
        dhw0 L = cVar.L();
        Q0(this, callEventType, null, null, null, null, null, null, s0, Integer.valueOf((L == null || (k = L.k()) == null) ? 0 : k.size()), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741438);
    }

    @Override // xsna.pvw0
    public final void H() {
        Q0(this, MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType.SCREEN_SHARING_STOPPED, null, null, MobileOfficialAppsCoreNavStat$EventScreen.VOIP_CALL, null, null, null, com.vk.voip.ui.c.b.s0(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741686);
    }

    @Override // xsna.pvw0
    public final void H0(String str, String str2) {
        Set<CallMemberId> k;
        MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType callEventType = MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType.CALL_STREAMING_STOPPED;
        com.vk.voip.ui.c cVar = com.vk.voip.ui.c.b;
        boolean s0 = cVar.s0();
        dhw0 L = cVar.L();
        Q0(this, callEventType, null, null, null, null, null, null, s0, Integer.valueOf((L == null || (k = L.k()) == null) ? 0 : k.size()), null, null, null, null, null, str, str2, null, null, null, null, null, null, null, null, null, null, null, 1073643134);
    }

    @Override // xsna.pvw0
    public final void I() {
        Q0(this, MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType.BEAUTY_DISABLED, null, null, MobileOfficialAppsCoreNavStat$EventScreen.VOIP_CALL, null, null, null, com.vk.voip.ui.c.b.s0(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741686);
    }

    @Override // xsna.pvw0
    public final void I0(CallId callId) {
        CallId callId2;
        MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType callEventType = MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType.CALL_PREVIEW_MIC_DISABLED;
        if (callId == null) {
            com.vk.voip.ui.c.b.getClass();
            callId2 = com.vk.voip.ui.c.T0;
        } else {
            callId2 = callId;
        }
        Q0(this, callEventType, null, null, null, null, callId2, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741790);
    }

    @Override // xsna.e49
    public final void J(e49.m mVar) {
        if (mVar.a()) {
            return;
        }
        Q0(this, MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType.OUTGOING_CALL_REMOTE_RINGING, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741822);
    }

    @Override // xsna.qew0
    public final void J0(VoipAudioOutputTypeAnalytics voipAudioOutputTypeAnalytics) {
        Q0(this, MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType.SPEAKER_MODE_CHANGED, null, null, MobileOfficialAppsCoreNavStat$EventScreen.VOIP_CALL, null, null, null, com.vk.voip.ui.c.b.s0(), null, null, voipAudioOutputTypeAnalytics.h(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073740662);
    }

    @Override // xsna.e49
    public final void K(String str, e49.b bVar) {
        Q0(this, MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType.CALL_DECLINED_OR_HANGED_LOCALLY, str, null, null, String.valueOf(bVar.c()), bVar.a(), null, bVar.e(), bVar.b(), null, bVar.d() ? "busy" : "none", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073740364);
    }

    @Override // xsna.e49
    public final void K0(e49.i iVar) {
        MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType callEventType = MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType.GROUP_CALL_JOIN_FAILED;
        int c = iVar.c();
        Q0(this, callEventType, null, null, null, null, iVar.b(), null, true, null, null, null, Integer.valueOf(c), iVar.d(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073735518);
    }

    @Override // xsna.pvw0
    public final void L() {
        Q0(this, MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType.SCREEN_SHARING_STARTED, null, null, MobileOfficialAppsCoreNavStat$EventScreen.VOIP_CALL, null, null, null, com.vk.voip.ui.c.b.s0(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741686);
    }

    @Override // xsna.pvw0
    public final void L0(boolean z) {
        Q0(this, MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType.VIDEO_DISABLED, null, null, MobileOfficialAppsCoreNavStat$EventScreen.VOIP_CALL, null, null, null, false, null, null, "manual", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073740790);
    }

    @Override // xsna.pvw0
    public final void M(int i, boolean z) {
        Q0(this, MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType.SESSION_ROOMS_TIMER_ENABLED, null, null, null, null, null, null, com.vk.voip.ui.c.b.s0(), null, null, z ? "preset" : "manual", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Integer.valueOf(i), 536869758);
    }

    @Override // xsna.pvw0
    public final void M0(Integer num) {
        Q0(this, MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType.BEAUTY_ENABLED, null, null, MobileOfficialAppsCoreNavStat$EventScreen.VOIP_CALL, null, null, null, com.vk.voip.ui.c.b.s0(), null, null, null, null, null, null, null, null, null, num, null, null, null, null, null, null, null, null, null, 1072693110);
    }

    @Override // xsna.pvw0
    public final void N() {
        Q0(this, MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType.USER_PROMO_CLOSED, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741694);
    }

    @Override // xsna.pvw0
    public final void N0() {
        Q0(this, MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType.VIDEO_DISABLED_DUE_TO_BAD_CONNECTION_ALERT, null, null, MobileOfficialAppsCoreNavStat$EventScreen.VOIP_CALL, null, null, null, com.vk.voip.ui.c.b.s0(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741686);
    }

    @Override // xsna.c8j
    public final void O() {
        Q0(this, MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType.CONTACT_DEANONIMIZED, null, null, null, null, null, null, com.vk.voip.ui.c.b.s0(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741694);
    }

    @Override // xsna.pvw0
    public final void O0() {
        Q0(this, MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType.TRANSCRIPTION_STOPPED, null, null, MobileOfficialAppsCoreNavStat$EventScreen.VOIP_CALL, null, null, null, com.vk.voip.ui.c.b.s0(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741686);
    }

    @Override // xsna.pvw0
    public final void P() {
        Q0(this, MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType.ADMIN_UNPIN, null, null, MobileOfficialAppsCoreNavStat$EventScreen.VOIP_CALL, null, null, null, com.vk.voip.ui.c.b.s0(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741686);
    }

    @Override // xsna.pvw0
    public final void P0() {
        Q0(this, MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType.CALL_VMOJI_CLICK, null, null, MobileOfficialAppsCoreNavStat$EventScreen.VOIP_CALL, null, null, null, com.vk.voip.ui.c.b.s0(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741686);
    }

    @Override // xsna.pvw0
    public final void Q(boolean z) {
        Q0(this, MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType.MIC_DISABLED, null, null, MobileOfficialAppsCoreNavStat$EventScreen.VOIP_CALL, null, null, null, z, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741686);
    }

    @Override // xsna.pvw0
    public final void R(CallId callId) {
        CallId callId2;
        MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType callEventType = MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType.CALL_PREVIEW_CAMERA_DISABLED;
        if (callId == null) {
            com.vk.voip.ui.c.b.getClass();
            callId2 = com.vk.voip.ui.c.T0;
        } else {
            callId2 = callId;
        }
        Q0(this, callEventType, null, null, null, null, callId2, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741790);
    }

    @Override // xsna.pvw0
    public final void S() {
        Q0(this, MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType.REACTION_DISABLED, null, null, MobileOfficialAppsCoreNavStat$EventScreen.VOIP_CALL, null, null, null, com.vk.voip.ui.c.b.s0(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741686);
    }

    @Override // xsna.pvw0
    public final void T(CallId callId) {
        CallId callId2;
        MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType callEventType = MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType.CALL_PREVIEW_CAMERA_ENABLED;
        if (callId == null) {
            com.vk.voip.ui.c.b.getClass();
            callId2 = com.vk.voip.ui.c.T0;
        } else {
            callId2 = callId;
        }
        Q0(this, callEventType, null, null, null, null, callId2, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741790);
    }

    @Override // xsna.e49
    public final void U(e49.d dVar) {
        Q0(this, MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType.CALL_DISCONNECTED, null, null, null, null, dVar.a(), null, dVar.c(), dVar.b(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741406);
    }

    @Override // xsna.e49
    public final void V(e49.a aVar) {
        Q0(this, MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType.CALL_CONNECTED, null, null, null, null, aVar.a(), null, aVar.b(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741662);
    }

    @Override // xsna.pvw0
    public final void W() {
        Q0(this, MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType.SESSION_ROOMS_ASK_FOR_HELP, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741822);
    }

    @Override // xsna.pvw0
    public final void X() {
        Q0(this, MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType.SESSION_ROOMS_CLOSED, null, null, null, null, null, null, com.vk.voip.ui.c.b.s0(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741694);
    }

    @Override // xsna.pvw0
    public final void Y() {
        Q0(this, MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType.NAME_CHANGED_BY_ADMIN, null, null, null, null, null, null, com.vk.voip.ui.c.b.s0(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741694);
    }

    @Override // xsna.pvw0
    public final void Z() {
        Q0(this, MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType.NAME_CHANGED_BY_ANONYM, null, null, null, null, null, null, com.vk.voip.ui.c.b.s0(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741694);
    }

    @Override // xsna.pvw0, xsna.ubx0
    public final void a(int i, UserId userId) {
        Q0(this, MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType.CALL_WATCH_TOGETHER_STOPPED, null, null, null, null, null, null, com.vk.voip.ui.c.b.s0(), null, null, null, null, null, null, null, String.valueOf(userId.b), null, null, null, null, null, null, null, Integer.valueOf(i), null, null, null, 1006567294);
    }

    @Override // xsna.pvw0
    public final void a0() {
        Q0(this, MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType.GROUP_CALL_JOIN_FORBIDDEN_ANONYM, null, null, MobileOfficialAppsCoreNavStat$EventScreen.VOIP_CALL, null, null, null, com.vk.voip.ui.c.b.s0(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741686);
    }

    @Override // xsna.pvw0
    public final void b() {
        Q0(this, MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType.CUSTOM_VIRTUAL_BACKGROUND_DELETED, null, null, MobileOfficialAppsCoreNavStat$EventScreen.VOIP_CALL, null, null, null, com.vk.voip.ui.c.b.s0(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741686);
    }

    @Override // xsna.pvw0
    public final void b0(boolean z) {
        Q0(this, MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType.MIC_ENABLED, null, null, MobileOfficialAppsCoreNavStat$EventScreen.VOIP_CALL, null, null, null, z, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741686);
    }

    @Override // xsna.pvw0
    public final void c() {
        Q0(this, MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType.CUSTOM_VIRTUAL_BACKGROUND_ADDED, null, null, MobileOfficialAppsCoreNavStat$EventScreen.VOIP_CALL, null, null, null, com.vk.voip.ui.c.b.s0(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741686);
    }

    @Override // xsna.c8j
    public final void c0() {
        Q0(this, MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType.CONTACT_INVITED, null, null, null, null, null, null, com.vk.voip.ui.c.b.s0(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741694);
    }

    @Override // xsna.pvw0, xsna.ubx0
    public final void d() {
        Q0(this, MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType.CALL_WATCH_TOGETHER_CLICK, null, null, null, null, null, null, com.vk.voip.ui.c.b.s0(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741694);
    }

    @Override // xsna.pvw0
    public final void d0() {
        Q0(this, MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType.SESSION_ROOMS_MESSAGE_SENT, null, null, null, null, null, null, com.vk.voip.ui.c.b.s0(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741694);
    }

    @Override // xsna.pvw0
    public final void e() {
        Q0(this, MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType.CALL_VMOJI_STOPPED, null, null, MobileOfficialAppsCoreNavStat$EventScreen.VOIP_CALL, null, null, null, com.vk.voip.ui.c.b.s0(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741686);
    }

    @Override // xsna.pvw0
    public final void e0(xw3 xw3Var, cow0 cow0Var) {
        Object valueOf = cow0Var.f() ? 2000000000 : Long.valueOf(cow0Var.c());
        MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType callEventType = MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType.USER_FEEDBACK_RECEIVED;
        MobileOfficialAppsCallsStat$TypeVoipCallItem.Source source = cow0Var.b().b;
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = cow0Var.b().c;
        String obj = valueOf.toString();
        CallId a = cow0Var.a();
        String e = cow0Var.e();
        int b = xw3Var.b();
        BadAssessmentReason a2 = xw3Var.a();
        Q0(this, callEventType, null, source, mobileOfficialAppsCoreNavStat$EventScreen, obj, a, e, cow0Var.f(), cow0Var.d(), Integer.valueOf(b), a2 != null ? a2.h() : null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073739778);
    }

    @Override // xsna.pvw0, xsna.ubx0
    public final void f(int i, UserId userId) {
        Q0(this, MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType.CALL_WATCH_TOGETHER_STARTED, null, null, null, null, null, null, com.vk.voip.ui.c.b.s0(), null, null, null, null, null, null, null, String.valueOf(userId.b), null, null, null, null, null, null, null, Integer.valueOf(i), null, null, null, 1006567294);
    }

    @Override // xsna.e49
    public final void f0(e49.g gVar) {
        MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType callEventType = MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType.INCOMING_CALL_FAILED;
        int c = gVar.c();
        String d = gVar.d();
        Q0(this, callEventType, null, null, null, null, gVar.b(), null, gVar.e(), null, null, null, Integer.valueOf(c), d, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073735518);
    }

    @Override // xsna.pvw0
    public final void g() {
        Q0(this, MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType.CALL_VMOJI_STARTED, null, null, MobileOfficialAppsCoreNavStat$EventScreen.VOIP_CALL, null, null, null, com.vk.voip.ui.c.b.s0(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741686);
    }

    @Override // xsna.pvw0
    public final void g0() {
        Q0(this, MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType.SESSION_ROOMS_USER_LEFT, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741822);
    }

    @Override // xsna.e49
    public final void h(e49.n nVar) {
        String valueOf;
        MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType callEventType = nVar.f() ? MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType.OUTGOING_CALL_STARTED_VIDEO : MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType.OUTGOING_CALL_STARTED_AUDIO;
        if (nVar.e()) {
            valueOf = "2000000000";
        } else if (nVar.c() != null) {
            valueOf = nVar.c();
        } else {
            com.vk.voip.ui.c.b.getClass();
            valueOf = String.valueOf(com.vk.voip.ui.c.K);
        }
        String str = valueOf;
        VoipCallSource d = nVar.d();
        if (d == null) {
            com.vk.voip.ui.c.b.getClass();
            d = com.vk.voip.ui.c.Y0;
        }
        Q0(this, callEventType, null, d.b, d.c, str, nVar.a(), null, nVar.e(), nVar.b(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741378);
    }

    @Override // xsna.pvw0
    public final void h0() {
        Q0(this, MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType.VIRTUAL_BACKGROUND_DISABLED, null, null, MobileOfficialAppsCoreNavStat$EventScreen.VOIP_CALL, null, null, null, com.vk.voip.ui.c.b.s0(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741686);
    }

    @Override // xsna.pvw0
    public final void i() {
        Q0(this, MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType.ADMIN_PIN, null, null, MobileOfficialAppsCoreNavStat$EventScreen.VOIP_CALL, null, null, null, com.vk.voip.ui.c.b.s0(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741686);
    }

    @Override // xsna.pvw0
    public final void i0() {
        Q0(this, MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType.CUSTOM_VIRTUAL_BACKGROUND_SELECTED, null, null, MobileOfficialAppsCoreNavStat$EventScreen.VOIP_CALL, null, null, null, com.vk.voip.ui.c.b.s0(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741686);
    }

    @Override // xsna.pvw0
    public final void j(CallId callId, MobileOfficialAppsCallsStat$TypeVoipCallItem.SharingChannel sharingChannel) {
        Q0(this, MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType.SCHEDULED_CALL_EDITED, null, null, null, null, callId, null, true, null, null, null, null, null, null, null, null, null, null, null, null, null, null, sharingChannel, null, null, null, null, 1040187230);
    }

    @Override // xsna.pvw0
    public final void j0(int i) {
        Q0(this, MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType.SESSION_ROOMS_USER_MOVED, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Integer.valueOf(i), null, null, 939524094);
    }

    @Override // xsna.pvw0
    public final void k() {
        Q0(this, MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType.WAITING_ROOM_ENABLED, null, null, MobileOfficialAppsCoreNavStat$EventScreen.VOIP_CALL, null, null, null, com.vk.voip.ui.c.b.s0(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741686);
    }

    @Override // xsna.pvw0
    public final void k0() {
        Q0(this, MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType.WHITE_BOARD_STARTED_REMOTELY, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741822);
    }

    @Override // xsna.pvw0
    public final void l() {
        Q0(this, MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType.WAITING_ROOM_DISABLED, null, null, MobileOfficialAppsCoreNavStat$EventScreen.VOIP_CALL, null, null, null, com.vk.voip.ui.c.b.s0(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741686);
    }

    @Override // xsna.pvw0
    public final void l0() {
        Q0(this, MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType.SESSION_ROOMS_AUTO_ALLOCATION, null, null, null, null, null, null, com.vk.voip.ui.c.b.s0(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741694);
    }

    @Override // xsna.pvw0
    public final void m(int i) {
        Q0(this, MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType.SESSION_ROOMS_OPENED, null, null, null, null, null, null, com.vk.voip.ui.c.b.s0(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Integer.valueOf(i), null, 805306238);
    }

    @Override // xsna.pvw0
    public final void m0() {
        Q0(this, MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType.REACTION_ENABLED, null, null, MobileOfficialAppsCoreNavStat$EventScreen.VOIP_CALL, null, null, null, com.vk.voip.ui.c.b.s0(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741686);
    }

    @Override // xsna.pvw0
    public final void n(CallId callId) {
        CallId callId2;
        MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType callEventType = MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType.CALL_PREVIEW_QR_PRESSED;
        if (callId == null) {
            com.vk.voip.ui.c.b.getClass();
            callId2 = com.vk.voip.ui.c.T0;
        } else {
            callId2 = callId;
        }
        Q0(this, callEventType, null, null, null, null, callId2, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741790);
    }

    @Override // xsna.pvw0
    public final void n0(String str) {
        Q0(this, MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType.REACTION_SENT, null, null, MobileOfficialAppsCoreNavStat$EventScreen.VOIP_CALL, null, null, null, com.vk.voip.ui.c.b.s0(), null, null, null, null, null, null, null, null, null, null, null, null, null, str, null, null, null, null, null, 1056964470);
    }

    @Override // xsna.pvw0
    public final void o() {
        Q0(this, MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType.NAME_CHANGED_BY_USER, null, null, null, null, null, null, com.vk.voip.ui.c.b.s0(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741694);
    }

    @Override // xsna.pvw0
    public final void o0() {
        Q0(this, MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType.TRANSCRIPTION_STARTED, null, null, MobileOfficialAppsCoreNavStat$EventScreen.VOIP_CALL, null, null, null, com.vk.voip.ui.c.b.s0(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741686);
    }

    @Override // xsna.dew0
    public final void p() {
        Q0(this, MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType.ONLINE_TRANSCRIPTION_STARTED, null, null, MobileOfficialAppsCoreNavStat$EventScreen.VOIP_CALL, null, null, null, com.vk.voip.ui.c.b.s0(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741686);
    }

    @Override // xsna.pvw0
    public final void p0(CallId callId, MobileOfficialAppsCallsStat$TypeVoipCallItem.SharingChannel sharingChannel) {
        Q0(this, MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType.CALL_SCHEDULED, null, null, null, null, callId, null, true, null, null, null, null, null, null, null, null, null, null, null, null, null, null, sharingChannel, null, null, null, null, 1040187230);
    }

    @Override // xsna.c8j
    public final void q() {
        Q0(this, MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType.CONTACT_JOINED, null, null, null, null, null, null, com.vk.voip.ui.c.b.s0(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741694);
    }

    @Override // xsna.pvw0
    public final void q0() {
        Q0(this, MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType.ASSIGN_ADMIN, null, null, MobileOfficialAppsCoreNavStat$EventScreen.VOIP_CALL, null, null, null, com.vk.voip.ui.c.b.s0(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741686);
    }

    @Override // xsna.pvw0
    public final void r() {
        Q0(this, MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType.PROMOTE_PARTICIPANT_W_R, null, null, MobileOfficialAppsCoreNavStat$EventScreen.VOIP_CALL, null, null, null, com.vk.voip.ui.c.b.s0(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741686);
    }

    @Override // xsna.pvw0
    public final void r0(String str) {
        Q0(this, MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType.GESTURE_REACTION_SENT, null, null, MobileOfficialAppsCoreNavStat$EventScreen.VOIP_CALL, null, null, null, com.vk.voip.ui.c.b.s0(), null, null, null, null, null, null, null, null, null, null, null, null, null, str, null, null, null, null, null, 1056964470);
    }

    @Override // xsna.pvw0
    public final void reset() {
        L.e("VkVoipProdStatHelper", "reset");
    }

    @Override // xsna.pvw0
    public final void s(boolean z) {
        Q0(this, MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType.VIDEO_ENABLED, null, null, MobileOfficialAppsCoreNavStat$EventScreen.VOIP_CALL, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741814);
    }

    @Override // xsna.pvw0
    public final void s0() {
        Q0(this, MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType.REQUEST_INTERACTION_ACCEPTED_REMOTELY, null, null, MobileOfficialAppsCoreNavStat$EventScreen.VOIP_CALL, null, null, null, com.vk.voip.ui.c.b.s0(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741686);
    }

    @Override // xsna.pvw0
    public final void t() {
        Q0(this, MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType.WHITE_BOARD_STARTED, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741822);
    }

    @Override // xsna.pvw0
    public final void t0(String str, String str2, boolean z) {
        Set<CallMemberId> k;
        MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType callEventType = MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType.CALL_STREAMING_STARTED;
        com.vk.voip.ui.c cVar = com.vk.voip.ui.c.b;
        boolean s0 = cVar.s0();
        dhw0 L = cVar.L();
        Q0(this, callEventType, null, null, null, null, null, null, s0, Integer.valueOf((L == null || (k = L.k()) == null) ? 0 : k.size()), null, null, null, null, null, str, str2, Boolean.valueOf(z), null, null, null, null, null, null, null, null, null, null, 1073512062);
    }

    @Override // xsna.e49
    public final void u(e49.h hVar) {
        Q0(this, MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType.INCOMING_CALL_RECEIVED, null, null, null, String.valueOf(hVar.b()), hVar.a(), null, hVar.c(), null, null, hVar.d() ? "video" : "audio", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073740622);
    }

    @Override // xsna.pvw0
    public final void u0() {
        Set<CallMemberId> k;
        MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType callEventType = MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType.CALL_RECORDING_CLICK;
        com.vk.voip.ui.c cVar = com.vk.voip.ui.c.b;
        boolean s0 = cVar.s0();
        dhw0 L = cVar.L();
        Q0(this, callEventType, null, null, null, null, null, null, s0, Integer.valueOf((L == null || (k = L.k()) == null) ? 0 : k.size()), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741438);
    }

    @Override // xsna.e49
    public final void v(e49.f fVar) {
        Q0(this, MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType.INCOMING_CALL_ACCEPTED, null, null, null, null, null, null, fVar.a(), null, null, fVar.b() ? "video" : "audio", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073740670);
    }

    @Override // xsna.pvw0
    public final void v0() {
        Q0(this, MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType.CURRENT_USER_BAD_CONNECTION_ALERT, null, null, MobileOfficialAppsCoreNavStat$EventScreen.VOIP_CALL, null, null, null, com.vk.voip.ui.c.b.s0(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741686);
    }

    @Override // xsna.pvw0
    public final void w() {
        Q0(this, MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType.SESSION_ROOMS_MANUAL_ALLOCATION, null, null, null, null, null, null, com.vk.voip.ui.c.b.s0(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741694);
    }

    @Override // xsna.pvw0
    public final void w0() {
        Q0(this, MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType.RETRIEVE_ADMIN, null, null, MobileOfficialAppsCoreNavStat$EventScreen.VOIP_CALL, null, null, null, com.vk.voip.ui.c.b.s0(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741686);
    }

    @Override // xsna.pvw0
    public final void x(UserId userId, long j, int i) {
        Q0(this, MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType.MASK_OFF, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, userId, Long.valueOf(j), Integer.valueOf(i), null, null, null, null, null, null, 1059061758);
    }

    @Override // xsna.dew0
    public final void x0() {
        Q0(this, MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType.ONLINE_TRANSCRIPTION_STOPPED, null, null, MobileOfficialAppsCoreNavStat$EventScreen.VOIP_CALL, null, null, null, com.vk.voip.ui.c.b.s0(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741686);
    }

    @Override // xsna.e49
    public final void y(e49.c cVar) {
        Q0(this, MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType.CALL_DECLINED_OR_HANGED_REMOTELY, null, null, null, null, cVar.a(), null, false, null, null, cVar.c() ? "timeout" : cVar.b() ? "busy" : "none", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073740766);
    }

    @Override // xsna.pvw0
    public final void y0(Mask mask) {
        Q0(this, MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType.VIRTUAL_BACKGROUND_SELECTED, null, null, MobileOfficialAppsCoreNavStat$EventScreen.VOIP_CALL, null, null, null, com.vk.voip.ui.c.b.s0(), null, null, null, null, null, Integer.valueOf(mask.getId()), null, null, null, null, null, null, null, null, null, null, null, null, null, 1073725302);
    }

    @Override // xsna.e49
    public final void z(e49.k kVar) {
        if (kVar.b()) {
            return;
        }
        Q0(this, MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType.OUTGOING_CALL_ACCEPTED_REMOTELY, null, null, null, null, kVar.a(), null, false, null, null, kVar.c() ? "video" : "audio", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073740766);
    }

    @Override // xsna.pvw0
    public final void z0() {
        Q0(this, MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType.SESSION_ROOMS_CLOSED_USING_TIMER, null, null, null, null, null, null, com.vk.voip.ui.c.b.s0(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741694);
    }
}
