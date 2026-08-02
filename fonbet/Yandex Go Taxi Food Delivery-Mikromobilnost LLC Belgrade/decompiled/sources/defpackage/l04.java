package defpackage;

import android.content.Context;
import com.ybsdk.core.analytics.a;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.delegates.AutotopupEvents$AutoTopupSettingsLoadedResult;
import com.ybsdk.core.analytics.generated.delegates.AutotopupEvents$AutoTopupSettingsLoadedVersion;
import com.ybsdk.core.analytics.generated.delegates.AutotopupEvents$AutoTopupSettingsResultScreenActionResult;
import com.ybsdk.core.analytics.generated.delegates.AutotopupEvents$AutoTopupSettingsResultScreenShownResult;
import com.ybsdk.core.analytics.generated.delegates.AutotopupEvents$AutoTopupSettingsSaveLoadedResult;
import com.ybsdk.core.analytics.generated.delegates.AutotopupEvents$AutoTopupSettingsSaveLoadedVersion;
import com.ybsdk.core.analytics.generated.delegates.AutotopupEvents$AutoTopupSettingsSaveResultResult;
import com.ybsdk.core.analytics.generated.delegates.AutotopupEvents$AutoTopupSettingsSaveResultVersion;
import com.ybsdk.core.analytics.generated.delegates.SettingsEvents$SettingsHidingBalancesOnLaunchChangeAction;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.d;
import com.ybsdk.feature.autotopup.api.AutoTopupType;
import com.ybsdk.feature.autotopup.internal.domain.analytics.data.ClickEvent;
import com.ybsdk.feature.autotopup.internal.domain.entities.AutoTopupInputType;
import com.ybsdk.feature.autotopup.internal.presentation.result.AutoTopupLogoResultStatus;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class l04 {
    public final AppAnalyticsReporter a;
    public final Context b;

    public /* synthetic */ l04(Context context, AppAnalyticsReporter appAnalyticsReporter) {
        this.a = appAnalyticsReporter;
        this.b = context;
    }

    public void a(ClickEvent clickEvent) {
        z94 z94Var = this.a.e;
        LinkedHashMap w = g8e.w(1, "action", clickEvent.getEventName());
        a aVar = z94Var.a;
        byte[] bArr = y5e.k;
        byte[] bArr2 = new byte[48];
        for (int i = 0; i < 48; i++) {
            bArr2[i] = (byte) (bArr[i] ^ y5e.c[i % 8]);
        }
        aVar.a(new String(bArr2, uza.a), w);
    }

    public void b(ClickEvent clickEvent) {
        z94 z94Var = this.a.e;
        z94Var.a.a("auto_topup.binding.ask_for_transfer", g8e.w(1, "action", clickEvent.getEventName()));
    }

    public void c(AutoTopupLogoResultStatus autoTopupLogoResultStatus, ClickEvent clickEvent, String str, List list) {
        int i = k04.a[autoTopupLogoResultStatus.ordinal()];
        AppAnalyticsReporter appAnalyticsReporter = this.a;
        switch (i) {
            case 1:
                appAnalyticsReporter.e.c(AutotopupEvents$AutoTopupSettingsResultScreenActionResult.ERROR, str, clickEvent.getEventName(), list);
                break;
            case 2:
                appAnalyticsReporter.e.c(AutotopupEvents$AutoTopupSettingsResultScreenActionResult.SUCCESS, null, clickEvent.getEventName(), list);
                break;
            case 3:
                z94 z94Var = appAnalyticsReporter.e;
                z94Var.a.a("auto_topup.binding.request_sent.action", g8e.w(1, "action", clickEvent.getEventName()));
                break;
            case 4:
                appAnalyticsReporter.e.c(AutotopupEvents$AutoTopupSettingsResultScreenActionResult.TIMEOUT, null, clickEvent.getEventName(), list);
                break;
            case 5:
            case 6:
                break;
            default:
                w511.b();
                break;
        }
    }

    public void d(List list) {
        this.a.e.d(AutotopupEvents$AutoTopupSettingsResultScreenShownResult.SUCCESS, null, list);
    }

    public void e(String str, String str2) {
        z94.b(this.a.e, AutotopupEvents$AutoTopupSettingsLoadedResult.ERROR, str, null, null, null, null, null, str2, null, null, null, null, null, null, AutotopupEvents$AutoTopupSettingsLoadedVersion.V1, 16252);
    }

    public void f(boolean z) {
        SettingsEvents$SettingsHidingBalancesOnLaunchChangeAction settingsEvents$SettingsHidingBalancesOnLaunchChangeAction = z ? SettingsEvents$SettingsHidingBalancesOnLaunchChangeAction.ON : SettingsEvents$SettingsHidingBalancesOnLaunchChangeAction.OFF;
        qq7 qq7Var = this.a.h0;
        LinkedHashMap linkedHashMap = new LinkedHashMap(1);
        linkedHashMap.put("action", settingsEvents$SettingsHidingBalancesOnLaunchChangeAction.getOriginalValue());
        qq7Var.a.a("settings.hiding_balances_on_launch.change", linkedHashMap);
    }

    public void g(o8r0 o8r0Var, String str) {
        String str2;
        CharSequence a;
        qq7 qq7Var = this.a.h0;
        String str3 = o8r0Var.a;
        Text text = o8r0Var.c;
        if (text == null || (a = d.a(this.b, text)) == null || (str2 = a.toString()) == null) {
            str2 = "";
        }
        Boolean valueOf = Boolean.valueOf(o8r0Var.g);
        LinkedHashMap linkedHashMap = new LinkedHashMap(4);
        if (str != null) {
            linkedHashMap.put("error", str);
        }
        linkedHashMap.put("key", str3);
        linkedHashMap.put("title", str2);
        linkedHashMap.put("boolean_value", valueOf);
        qq7Var.a.a("settings.change.result", linkedHashMap);
    }

    public void h(String str, AutoTopupType autoTopupType, Boolean bool) {
        z94.f(this.a.e, AutotopupEvents$AutoTopupSettingsSaveLoadedResult.ERROR, str, null, null, null, rsa1.c(autoTopupType), bool != null ? rsa1.e(bool.booleanValue()) : null, null, null, null, null, null, AutotopupEvents$AutoTopupSettingsSaveLoadedVersion.V1, 3996);
    }

    public void i(String str, qz3 qz3Var, String str2) {
        lz3 lz3Var;
        z94 z94Var = this.a.e;
        AutotopupEvents$AutoTopupSettingsSaveResultResult autotopupEvents$AutoTopupSettingsSaveResultResult = AutotopupEvents$AutoTopupSettingsSaveResultResult.ERROR;
        String str3 = null;
        String plainString = qz3Var != null ? k2b1.c(qz3Var, AutoTopupInputType.AMOUNT).d.toPlainString() : null;
        String plainString2 = qz3Var != null ? k2b1.c(qz3Var, AutoTopupInputType.THRESHOLD).d.toPlainString() : null;
        Map a = h52.a(qz3Var != null ? qz3Var.m : null);
        Integer c = rsa1.c(qz3Var != null ? k2b1.d(qz3Var, null) : null);
        if (qz3Var != null && (lz3Var = qz3Var.k) != null) {
            str3 = rsa1.e(lz3Var.a);
        }
        z94.g(z94Var, autotopupEvents$AutoTopupSettingsSaveResultResult, str, plainString, plainString2, a, c, str3, null, null, null, null, null, str2, AutotopupEvents$AutoTopupSettingsSaveResultVersion.V1, 3968);
    }

    public void j(qz3 qz3Var, String str) {
        lz3 lz3Var;
        z94 z94Var = this.a.e;
        AutotopupEvents$AutoTopupSettingsSaveResultResult autotopupEvents$AutoTopupSettingsSaveResultResult = AutotopupEvents$AutoTopupSettingsSaveResultResult.OK;
        String str2 = null;
        String plainString = qz3Var != null ? k2b1.c(qz3Var, AutoTopupInputType.AMOUNT).d.toPlainString() : null;
        String plainString2 = qz3Var != null ? k2b1.c(qz3Var, AutoTopupInputType.THRESHOLD).d.toPlainString() : null;
        Map a = h52.a(qz3Var != null ? qz3Var.m : null);
        Integer c = rsa1.c(qz3Var != null ? k2b1.d(qz3Var, null) : null);
        if (qz3Var != null && (lz3Var = qz3Var.k) != null) {
            str2 = rsa1.e(lz3Var.a);
        }
        z94.g(z94Var, autotopupEvents$AutoTopupSettingsSaveResultResult, null, plainString, plainString2, a, c, str2, null, null, null, null, null, str, AutotopupEvents$AutoTopupSettingsSaveResultVersion.V1, 3968);
    }
}
