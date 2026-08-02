package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.log.L;
import com.vk.stat.scheme.MobileOfficialAppsCallsStat$TypeVoipCallItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.voip.api.id.CallId;
import com.vk.voip.ui.prodstat.analytics.base.screen.VoipAnalyticsEventScreen;
import io.requery.android.database.sqlite.SQLiteDatabase;

/* compiled from: VoipVKAnalyticsSenderBase.kt */
/* loaded from: classes7.dex */
public abstract class a3x0 {
    /* JADX WARN: Multi-variable type inference failed */
    public static void p(a3x0 a3x0Var, MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType callEventType, String str, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, boolean z, String str2, Boolean bool, int i) {
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen2;
        Long l;
        com.vk.voip.ui.c cVar = com.vk.voip.ui.c.b;
        cVar.getClass();
        MobileOfficialAppsCallsStat$TypeVoipCallItem.Source source = com.vk.voip.ui.c.Y0.b;
        String str3 = (i & 4) != 0 ? "" : str;
        if ((i & 8) != 0) {
            cVar.getClass();
            mobileOfficialAppsCoreNavStat$EventScreen2 = com.vk.voip.ui.c.Y0.c;
        } else {
            mobileOfficialAppsCoreNavStat$EventScreen2 = mobileOfficialAppsCoreNavStat$EventScreen;
        }
        cVar.getClass();
        String valueOf = String.valueOf(com.vk.voip.ui.c.K);
        cVar.getClass();
        CallId callId = com.vk.voip.ui.c.T0;
        boolean z2 = (i & 128) != 0 ? false : z;
        Integer num = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        String str4 = (i & 1024) != 0 ? null : str2;
        Boolean bool2 = (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : bool;
        a3x0Var.getClass();
        dhw0 L = cVar.L();
        UserId userId = (L == null || !l2l0.m(L)) ? null : L.M;
        L.e(a3x0Var.o(), "stat reported: event=" + callEventType + " callId=" + callId);
        VoipAnalyticsEventScreen voipAnalyticsEventScreen = new VoipAnalyticsEventScreen(str3);
        if (!VoipAnalyticsEventScreen.b(str3)) {
            voipAnalyticsEventScreen = null;
        }
        String str5 = voipAnalyticsEventScreen != null ? voipAnalyticsEventScreen.b : null;
        String str6 = str5 == null ? null : str5;
        Boolean bool3 = bool2;
        String valueOf2 = String.valueOf(System.currentTimeMillis() * 1000);
        String str7 = callId.b;
        String str8 = valueOf != null ? valueOf : "";
        Integer valueOf3 = bool3 != null ? Integer.valueOf(bool3.booleanValue() ? 1 : 0) : null;
        Long valueOf4 = userId != null ? Long.valueOf(userId.b) : null;
        zqk0 g0 = cVar.g0();
        new znw0(mobileOfficialAppsCoreNavStat$EventScreen2, new MobileOfficialAppsCallsStat$TypeVoipCallItem(callEventType, valueOf2, str7, str8, "calls_v2", z2, source, null, null, str4, null, null, null, null, num, objArr5 == true ? 1 : 0, objArr4 == true ? 1 : 0, valueOf3, null, null, null, null, valueOf4, null, objArr3 == true ? 1 : 0, objArr2 == true ? 1 : 0, objArr == true ? 1 : 0, null, null, null, (g0 == null || (l = g0.q) == null) ? null : Integer.valueOf((int) l.longValue()), null, null, null, null, null, null, null, null, null, str6, -2143813632, 247, null)).q();
    }

    public abstract String o();
}
