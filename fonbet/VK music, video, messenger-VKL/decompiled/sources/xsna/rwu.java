package xsna;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import androidx.credentials.provider.CredentialEntry;
import com.ironsource.T3;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: HeaderFileBuilder.kt */
/* loaded from: classes.dex */
public class rwu {
    public final ConcurrentHashMap<String, String> a = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, String> b = new ConcurrentHashMap<>();

    /* compiled from: HeaderFileBuilder.kt */
    public static final class a extends rwu {
        public final gzs<Context> c;
        public final p6m d = new p6m();

        public a(gzs gzsVar) {
            this.c = gzsVar;
        }

        @Override // xsna.rwu
        public final StringBuilder b() {
            String str;
            a("VERSION_CODENAME", Build.VERSION.CODENAME);
            a("SDK CODE", String.valueOf(Build.VERSION.SDK_INT));
            a("MANUFACTURER", Build.MANUFACTURER);
            a("MODEL", Build.MODEL);
            a("BOARD", Build.BOARD);
            a("BRAND", Build.BRAND);
            a("DEVICE", Build.DEVICE);
            a("HARDWARE", Build.HARDWARE);
            a("DISPLAY", Build.DISPLAY);
            a("FINGERPRINT", Build.FINGERPRINT);
            a("PRODUCT", Build.PRODUCT);
            a("USER", Build.USER);
            Context invoke = this.c.invoke();
            if (invoke != null) {
                p6m p6mVar = this.d;
                ConcurrentHashMap<String, String> concurrentHashMap = p6mVar.a;
                ConcurrentHashMap<String, String> concurrentHashMap2 = p6mVar.a;
                if (concurrentHashMap.isEmpty()) {
                    ContentResolver contentResolver = invoke.getContentResolver();
                    Iterator it = e43.a("airplane_mode_on", "airplane_mode_radios", "adb_enabled", "auto_time", "auto_time_zone", "always_finish_activities", "animator_duration_scale", "bluetooth_on", "debug_app", "development_settings_enabled", "device_provisioned", "http_proxy", "mode_ringer", "name", "network_preference", T3.d, "cell", "wifi", "stay_on_while_plugged_in", "usb_mass_storage_enabled", "use_google_mail", "wifi_max_dhcp_retry_count", "wifi_mobile_data_transition_wakelock_timeout_ms", "wifi_networks_available_repeat_delay", "wifi_on", "wifi_sleep_policy").iterator();
                    while (it.hasNext()) {
                        p6m.a(p6mVar, contentResolver, (String) it.next());
                    }
                    if (Build.VERSION.SDK_INT >= 29) {
                        p6m.a(p6mVar, contentResolver, "apply_ramping_ringer");
                    }
                    p6m.a(p6mVar, contentResolver, "boot_count");
                    p6m.a(p6mVar, contentResolver, "contact_metadata_sync_enabled");
                    p6m.a(p6mVar, contentResolver, "device_name");
                    p6m.a(p6mVar, contentResolver, "wifi_device_owner_configs_lockdown");
                    try {
                        str = (String) Class.forName("android.os.SystemProperties").getDeclaredMethod("get", String.class, String.class).invoke(null, "ro.com.android.dataroaming", CredentialEntry.FALSE_STRING);
                    } catch (Throwable unused) {
                        str = new String();
                    }
                    Integer valueOf = Integer.valueOf("true".equalsIgnoreCase(str) ? 1 : 0);
                    try {
                        String string = Settings.Global.getString(contentResolver, "data_roaming");
                        if (string == null) {
                            string = valueOf.toString();
                        }
                        if (string != null) {
                            concurrentHashMap2.put("data_roaming", string);
                        }
                    } catch (Throwable unused2) {
                    }
                    Iterator it2 = e43.a(AndroidDynamicDeviceInfoDataSource.SETTING_ACCESSIBILITY_DISPLAY_INVERSION_ENABLED, "accessibility_enabled", "allowed_geolocation_origins", "android_id", "default_input_method", "enabled_accessibility_services", "enabled_input_methods", "input_method_selector_visibility", "parental_control_enabled", "parental_control_last_update", "selected_input_method_subtype", "skip_first_use_hints", "tts_enabled_plugins", "tts_default_rate", "tts_default_synth").iterator();
                    while (it2.hasNext()) {
                        p6m.b(p6mVar, contentResolver, (String) it2.next());
                    }
                    p6m.b(p6mVar, contentResolver, "rtt_calling_mode");
                    try {
                        concurrentHashMap2.put("window_animation_scale", String.valueOf(Settings.Global.getFloat(contentResolver, "window_animation_scale")));
                    } catch (Throwable unused3) {
                    }
                    try {
                        concurrentHashMap2.put("transition_animation_scale", String.valueOf(Settings.Global.getFloat(contentResolver, "transition_animation_scale")));
                    } catch (Throwable unused4) {
                    }
                }
                for (Map.Entry<String, String> entry : concurrentHashMap.entrySet()) {
                    String upperCase = entry.getKey().toUpperCase(Locale.ROOT);
                    String value = entry.getValue();
                    String concat = upperCase.concat(": ");
                    ConcurrentHashMap<String, String> concurrentHashMap3 = this.b;
                    if (!concurrentHashMap3.containsKey(concat)) {
                        concurrentHashMap3.put(concat, value);
                    }
                }
            }
            return super.b();
        }
    }

    public final void a(String str, String str2) {
        String concat = str.concat(": ");
        ConcurrentHashMap<String, String> concurrentHashMap = this.a;
        if (concurrentHashMap.containsKey(concat)) {
            return;
        }
        concurrentHashMap.put(concat, str2);
    }

    public StringBuilder b() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : this.a.entrySet()) {
            sb.append(entry.getKey());
            sb.append(entry.getValue());
            sb.append("\n");
        }
        sb.append("\n\n");
        for (Map.Entry<String, String> entry2 : this.b.entrySet()) {
            sb.append(entry2.getKey());
            sb.append(entry2.getValue());
            sb.append("\n");
        }
        sb.append("\n\n");
        return sb;
    }
}
