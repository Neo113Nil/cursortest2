package defpackage;

import android.content.Context;
import android.os.Build;
import com.yandex.plus.core.strings.PlusSdkBrandType;
import com.yandex.plus.experiments.impl.providers.a;
import com.yandex.plus.log.api.LogPriority;
import com.yandex.plus.pay.internal.b;
import com.yandex.plus.paywall.sdk.analytics.impl.evgen.diagnostic.AcquisitionEvgenBuildOrigin;
import com.yandex.plus.paywall.sdk.analytics.impl.evgen.diagnostic.AcquisitionEvgenBuildType;
import com.yandex.plus.paywall.sdk.analytics.impl.evgen.diagnostic.AcquisitionEvgenDeviceType;
import com.yandex.plus.paywall.sdk.analytics.impl.evgen.diagnostic.AcquisitionEvgenSubscriptionStatus;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.Result;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

/* loaded from: classes2.dex */
public final class bn {
    public final zch a;
    public final b42 b;
    public final kcj c;

    public bn(zch zchVar, b42 b42Var, kcj kcjVar) {
        this.a = zchVar;
        this.b = b42Var;
        this.c = kcjVar;
    }

    public static HashMap a(HashMap hashMap) {
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        hashMap3.put("version", 1);
        hashMap2.put(DatabaseHelper.OttTrackingTable.COLUMN_EVENT, hashMap3);
        hashMap2.put("interfaces", hashMap);
        return hashMap2;
    }

    public final void b(String str, LinkedHashMap linkedHashMap) {
        Object obj;
        AcquisitionEvgenBuildType acquisitionEvgenBuildType;
        String str2;
        HashMap hashMap = new HashMap();
        hashMap.putAll(linkedHashMap);
        b42 b42Var = this.b;
        oo2 oo2Var = b42Var.a;
        ru2 ru2Var = (ru2) oo2Var.a;
        i3y i3yVar = (i3y) oo2Var.c;
        Context context = (Context) ru2Var.g;
        ls90 ls90Var = b42Var.b;
        Object h = ((a) ls90Var.e.getValue()).h();
        if (h instanceof Result.Failure) {
            h = null;
        }
        k2d0 k2d0Var = (k2d0) h;
        String str3 = k2d0Var != null ? k2d0Var.a : null;
        String str4 = k2d0Var != null ? k2d0Var.b : null;
        Long id = ((lj) ((com.yandex.plus.domain.auth.impl.a) i3yVar.getValue()).h.getValue()).getId();
        String l = id != null ? id.toString() : null;
        i3y i3yVar2 = skd0.a;
        String uuid = skd0.d().toString();
        String a = ((x75) ((i3y) oo2Var.w).getValue()).a();
        String language = context.getResources().getConfiguration().getLocales().get(0).getLanguage();
        String format = b42Var.c.format(Float.valueOf(vng.r(context)));
        AcquisitionEvgenDeviceType acquisitionEvgenDeviceType = context.getPackageManager().hasSystemFeature("android.software.leanback") ? AcquisitionEvgenDeviceType.Tv : (context.getResources().getConfiguration().screenLayout & 15) >= 3 ? AcquisitionEvgenDeviceType.Pad : AcquisitionEvgenDeviceType.Phone;
        jzs jzsVar = (jzs) ((sls) ru2Var.i).invoke();
        String jzsVar2 = jzsVar != null ? jzsVar.toString() : null;
        int i = s0v0.a[((b) ((t0v0) ls90Var.i.getValue()).a).c().ordinal()];
        if (i == 1) {
            obj = j0d0.a;
        } else if (i == 2) {
            obj = i0d0.a;
        } else {
            if (i != 3) {
                w511.b();
                return;
            }
            obj = k0d0.a;
        }
        AcquisitionEvgenSubscriptionStatus acquisitionEvgenSubscriptionStatus = !(((com.yandex.plus.domain.auth.impl.a) i3yVar.getValue()).h.getValue() instanceof hj) ? AcquisitionEvgenSubscriptionStatus.NotLoggedIn : obj instanceof j0d0 ? AcquisitionEvgenSubscriptionStatus.NoSubscription : obj instanceof i0d0 ? AcquisitionEvgenSubscriptionStatus.Active : obj instanceof k0d0 ? AcquisitionEvgenSubscriptionStatus.Unknown : AcquisitionEvgenSubscriptionStatus.Unknown;
        AcquisitionEvgenBuildOrigin acquisitionEvgenBuildOrigin = qje.D((Context) ((ru2) oo2Var.a).g) ? AcquisitionEvgenBuildOrigin.Store : AcquisitionEvgenBuildOrigin.TestService;
        AcquisitionEvgenBuildType acquisitionEvgenBuildType2 = AcquisitionEvgenBuildType.Release;
        AcquisitionEvgenBuildOrigin acquisitionEvgenBuildOrigin2 = acquisitionEvgenBuildOrigin;
        String str5 = (String) ru2Var.e;
        AcquisitionEvgenDeviceType acquisitionEvgenDeviceType2 = acquisitionEvgenDeviceType;
        String str6 = (String) ru2Var.d;
        String str7 = jzsVar2;
        String str8 = (String) ru2Var.a;
        if (str3 == null) {
            str3 = "no_value";
        }
        if (l == null) {
            l = "no_value";
        }
        if (str4 == null) {
            str4 = "no_value";
        }
        if (a == null) {
            a = "no_value";
        }
        AcquisitionEvgenSubscriptionStatus acquisitionEvgenSubscriptionStatus2 = acquisitionEvgenSubscriptionStatus;
        String str9 = Build.VERSION.RELEASE;
        if (str7 == null) {
            acquisitionEvgenBuildType = acquisitionEvgenBuildType2;
            str2 = "no_value";
        } else {
            acquisitionEvgenBuildType = acquisitionEvgenBuildType2;
            str2 = str7;
        }
        hashMap.putAll(kotlin.collections.b.i(new Pair("client_app_package", str5), new Pair("client_app_version", str6), new Pair(Constants.KEY_SERVICE, str8), new Pair("sdk_version", "110.0.2"), new Pair("testids", str3), new Pair("puid", l), new Pair("log_session_id", uuid), new Pair("triggered_testids", str4), new Pair("device_screen_size", format), new Pair(CommonUrlParts.DEVICE_TYPE, acquisitionEvgenDeviceType2.getEventValue()), new Pair(MetaDataField.DEVICE_ID_FIELD, a), new Pair("os_version", str9), new Pair("device_language", language), new Pair("device_region", str2), new Pair("brand", ((PlusSdkBrandType) ru2Var.h).name()), new Pair("subscription_status", acquisitionEvgenSubscriptionStatus2.getEventValue()), new Pair("build_origin", acquisitionEvgenBuildOrigin2.getEventValue()), new Pair("build_type", acquisitionEvgenBuildType.getEventValue())));
        hashMap.putAll(((cn) this.c.a.getValue()).a);
        ls90 ls90Var2 = (ls90) this.a.a;
        jt90 jt90Var = (jt90) ls90Var2.d.getValue();
        String p = b64.p(unr0.x("event: ", str, ", parameters: "), kotlin.collections.a.X(hashMap.entrySet(), null, null, null, null, 63), ')');
        mdd0 mdd0Var = jt90Var.a;
        mdd0Var.getClass();
        ((ndd0) mdd0Var).b(LogPriority.INFO, oyr.f('.', "PAY", "COMMON"), p, null);
        for (i4j0 i4j0Var : ((jt90) ls90Var2.d.getValue()).b) {
            i4j0Var.reportEvent(str, hashMap);
            i4j0Var.reportDiagnosticEvent(str, hashMap);
        }
    }
}
