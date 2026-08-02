package xsna;

import com.vk.dto.common.data.ApiApplication;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.superapp.presentation.about.AboutAppFragment;
import com.vk.voip.ui.qr.ui.VoipQrCodeScannerActivity;
import com.vk.voip.ui.qr.ui.VoipQrCodeScannerFragment;
import java.util.Locale;

/* compiled from: AboutAppNavigator.kt */
/* loaded from: classes6.dex */
public final class a2 extends oz50 {
    public a2() {
        super(VoipQrCodeScannerFragment.class, VoipQrCodeScannerActivity.class, null);
        s(true);
    }

    public void y(String str) {
        this.j.putString("call_join_link", str);
    }

    public void z(MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen) {
        this.j.putString("event_screen", mobileOfficialAppsCoreNavStat$EventScreen.name().toLowerCase(Locale.ROOT));
    }

    public /* synthetic */ a2(int i) {
        this(i, false, null, null, null);
    }

    public a2(int i, boolean z, ApiApplication apiApplication, String str, String str2) {
        super(AboutAppFragment.class, null, null);
        this.j.putInt("appId", i);
        this.j.putBoolean("SHOW_UNVERIFIED", z);
        this.j.putParcelable("APP_ITEM", apiApplication);
        this.j.putString("VIEW_URL", str);
        this.j.putString("ORIGINAL_URL", str2);
    }
}
