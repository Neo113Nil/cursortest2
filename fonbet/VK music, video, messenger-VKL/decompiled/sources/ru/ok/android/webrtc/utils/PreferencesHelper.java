package ru.ok.android.webrtc.utils;

import android.content.Context;
import android.content.SharedPreferences;
import com.vk.core.preference.Preference;
import io.reactivex.rxjava3.core.w;
import kotlin.Lazy;
import ru.ok.android.annotation.CallInternalApi;
import ru.ok.android.webrtc.utils.PreferencesHelper;
import xsna.bpn0;
import xsna.da50;
import xsna.hgb;
import xsna.zcl;

@CallInternalApi
/* loaded from: classes9.dex */
public final class PreferencesHelper {
    public static final Companion Companion = new Companion(null);
    public static final String ESTIMATED_PERFORMANCE_INDEX_KEY = "estimatedPerformanceIndex";
    public static final String SUPPORTED_CODECS_LAST_UPDATE_INDEX_KEY = "supportedCodecsLastUpdate";
    public final Context a;
    public final w b;
    public final Lazy c;
    public volatile Integer d;

    public static final class Companion {
        public Companion(zcl zclVar) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PreferencesHelper(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
    }

    public static final void a(PreferencesHelper preferencesHelper) {
        if (((SharedPreferences) preferencesHelper.c.getValue()).contains(ESTIMATED_PERFORMANCE_INDEX_KEY)) {
            preferencesHelper.d = Integer.valueOf(((SharedPreferences) preferencesHelper.c.getValue()).getInt(ESTIMATED_PERFORMANCE_INDEX_KEY, 0));
        }
    }

    public static final SharedPreferences b(PreferencesHelper preferencesHelper) {
        return Preference.h(preferencesHelper.a, 0, "webrtc-android-sdk-pref");
    }

    public final boolean containsEstimatedPerfIndex() {
        return this.d != null;
    }

    public final int getEstimatedPerfIndex() {
        Integer num = this.d;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final long getLong(String str) {
        return ((SharedPreferences) this.c.getValue()).getLong(str, 0L);
    }

    public final void putEstimatedPerfIndex(final int i) {
        this.d = Integer.valueOf(i);
        io.reactivex.rxjava3.core.a.l(new io.reactivex.rxjava3.functions.a() { // from class: xsna.wyc0
            @Override // io.reactivex.rxjava3.functions.a
            public final void run() {
                PreferencesHelper.a(PreferencesHelper.this, i);
            }
        }).q(this.b).subscribe();
    }

    public final void putLong(String str, long j) {
        ((SharedPreferences) this.c.getValue()).edit().putLong(str, j).apply();
    }

    public PreferencesHelper(Context context, w wVar) {
        this.a = context;
        this.b = wVar;
        this.c = new bpn0(new da50(this, 15));
        io.reactivex.rxjava3.core.a.l(new hgb(this, 2)).q(wVar).subscribe();
    }

    public static final void a(PreferencesHelper preferencesHelper, int i) {
        ((SharedPreferences) preferencesHelper.c.getValue()).edit().putInt(ESTIMATED_PERFORMANCE_INDEX_KEY, i).apply();
    }

    public /* synthetic */ PreferencesHelper(Context context, w wVar, int i, zcl zclVar) {
        this(context, (i & 2) != 0 ? io.reactivex.rxjava3.schedulers.a.b() : wVar);
    }
}
