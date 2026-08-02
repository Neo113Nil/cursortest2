package xsna;

import android.os.Bundle;
import com.mbridge.msdk.MBridgeConstans;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.common.data.ApiApplication;
import com.vk.superapp.core.perf.BrowserPerfState;

/* compiled from: VKSuperAppBrowserFragmentBuilder.kt */
/* loaded from: classes6.dex */
public class bi extends oz50 {
    public bi(ApiApplication apiApplication, String str, String str2, String str3, Long l, boolean z, String str4, Long l2, String str5, String str6, BrowserPerfState browserPerfState, Class<? extends FragmentImpl> cls, String str7, boolean z2) {
        super(cls, null, null);
        Bundle bundle = this.j;
        bundle.putString("key_url", str);
        this.j.putLong("key_application_id", apiApplication.b.b);
        this.j.putString("original_url", str3);
        bundle.putString("key_title", apiApplication.c);
        bundle.putString("key_ref", str2);
        bundle.putParcelable(MBridgeConstans.DYNAMIC_VIEW_WX_APP, apiApplication);
        bundle.putLong("key_application_id", apiApplication.b.b);
        if (l != null) {
            bundle.putLong("dialog_id", l.longValue());
        }
        bundle.putBoolean("key_is_nested", z);
        bundle.putString("track_code", str4);
        bundle.putString("entry_point", str5);
        if (l2 != null) {
            bundle.putLong("group_id", l2.longValue());
        }
        bundle.putString("key_source_url", str6);
        bundle.putParcelable("perf_state", browserPerfState);
        bundle.putString("special_url", str7);
        bundle.putBoolean("clear_top", z2);
        this.j.putBoolean("no_bottom_navigation", !apiApplication.K || apiApplication.J);
    }
}
