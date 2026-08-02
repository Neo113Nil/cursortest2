package defpackage;

import android.view.View;
import com.yandex.go.ads.mobile_ads_sdk.presentation.divkit.native_banner.NativeAdSlotContainerView;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class f250 {
    public final View a;
    public final NativeAdSlotContainerView b;

    public f250(View view, NativeAdSlotContainerView nativeAdSlotContainerView) {
        this.a = view;
        this.b = nativeAdSlotContainerView;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f250) {
            f250 f250Var = (f250) obj;
            return this.a.equals(f250Var.a) && this.b == f250Var.b;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "RegisteredSlot(view=" + this.a + ", themeSwitcher=" + this.b + Extension.C_BRAKE;
    }
}
