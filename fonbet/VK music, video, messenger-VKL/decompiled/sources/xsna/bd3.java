package xsna;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.vk.core.preference.Preference;
import com.vk.log.L;
import com.vk.metrics.firebase.crashlytics.ndk.CrashlyticsNdkRegistrar;
import com.vk.music.offline.api.model.MusicOfflineCacheStorage;
import com.vk.statistic.DeprecatedStatisticBase;
import com.vk.statistic.DeprecatedStatisticUrl;
import com.vkontakte.android.data.b;
import java.io.File;
import ru.mail.libverify.platform.core.ISmsRetrieverService;
import ru.mail.platform.libverify.sms.SmsRetrieverService;
import xsna.ju70;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class bd3 implements ISmsRetrieverService, b9i, v0m {
    public static String b(String str, int i, int i2, StringBuilder sb) {
        sb.append(i);
        sb.append(str);
        sb.append(i2);
        return sb.toString();
    }

    public static boolean d(String str) {
        return new File(str).exists();
    }

    @Override // xsna.v0m
    public boolean a(DeprecatedStatisticBase deprecatedStatisticBase, int i) {
        if (!(deprecatedStatisticBase instanceof DeprecatedStatisticUrl)) {
            return false;
        }
        DeprecatedStatisticUrl deprecatedStatisticUrl = (DeprecatedStatisticUrl) deprecatedStatisticBase;
        b.d dVar = new b.d("ads/impression");
        dVar.d();
        dVar.j();
        dVar.b(deprecatedStatisticUrl.f, "ad_data_impression");
        if (i != -1) {
            dVar.c(Integer.valueOf(i));
        }
        dVar.f();
        L.e("Statistics sent", deprecatedStatisticUrl);
        return true;
    }

    @Override // xsna.b9i
    public Object c(lcg0 lcg0Var) {
        b9i<T> b9iVar;
        SharedPreferences sharedPreferences;
        Context context = (Context) lcg0Var.a(Context.class);
        if (!epx.f(Looper.myLooper(), Looper.getMainLooper())) {
            Log.e("CrashlyticsNdkRepository", "Metric prefs are to be initialized from a non-main thread.");
        }
        if (bl20.a == null) {
            Preference.a.getClass();
            Preference.w(context);
            bl20.a = Preference.f("analytics");
        }
        String str = "";
        if (!TextUtils.isEmpty("config_crashlytics_ndk_enabled") && (sharedPreferences = bl20.a) != null) {
            str = sharedPreferences.getString("config_crashlytics_ndk_enabled", "");
        }
        if (!TextUtils.equals(str, "1")) {
            return new CrashlyticsNdkRegistrar.a();
        }
        i8i i8iVar = (i8i) j5g.a0(new com.google.firebase.crashlytics.ndk.CrashlyticsNdkRegistrar().getComponents());
        Object c = (i8iVar == null || (b9iVar = i8iVar.f) == 0) ? null : b9iVar.c(lcg0Var);
        f5k f5kVar = c instanceof f5k ? (f5k) c : null;
        if (f5kVar != null) {
            return f5kVar;
        }
        Log.e("CrashlyticsNdkRegistrar", "OriginalCrashlyticsNdkRegistrar is null.");
        return new CrashlyticsNdkRegistrar.a();
    }

    public String e(String str, MusicOfflineCacheStorage musicOfflineCacheStorage) {
        if (ju70.a.f(str)) {
            return musicOfflineCacheStorage.k();
        }
        if (ju70.a.e(str)) {
            return musicOfflineCacheStorage.k();
        }
        if (ju70.a.d(str)) {
            return "private_cache";
        }
        ju70.a.b(str);
        return "private_cache";
    }

    @Override // ru.mail.libverify.platform.core.ISmsRetrieverService
    public void enqueueWork(Context context, Intent intent) {
        SmsRetrieverService.enqueueWork(context, intent);
    }
}
