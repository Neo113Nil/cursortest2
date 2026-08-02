package defpackage;

import com.ybsdk.feature.kyc.api.KycGeoRequest;
import com.ybsdk.rconfig.b;
import com.ybsdk.rconfig.configs.CommonFeatureFlag;
import com.ybsdk.rconfig.configs.WebViewAutoRetryConfig;
import com.ybsdk.rconfig.model.ThemedImage;

/* loaded from: classes3.dex */
public final class if8 implements wm8, opx, um41 {
    public final /* synthetic */ b a;

    public /* synthetic */ if8(b bVar) {
        this.a = bVar;
    }

    public static rbv h(ThemedImage themedImage) {
        return fob1.c(themedImage.getLight(), themedImage.getDark(), new mtw(14));
    }

    public boolean a() {
        b bVar = this.a;
        return jl40.l(bVar.r().isEnabledOnCardRenameScreen(), Boolean.TRUE) && bVar.r().isEnabled();
    }

    public KycGeoRequest b() {
        String geoRequestStatus = this.a.e().getGeoRequestStatus();
        if (geoRequestStatus != null) {
            int hashCode = geoRequestStatus.hashCode();
            if (hashCode != -1901282887) {
                if (hashCode != 703609696) {
                    if (hashCode == 1053567612 && geoRequestStatus.equals("DISABLED")) {
                        return KycGeoRequest.DISABLED;
                    }
                } else if (geoRequestStatus.equals("OPTIONAL")) {
                    return KycGeoRequest.OPTIONAL;
                }
            } else if (geoRequestStatus.equals("MANDATORY")) {
                return KycGeoRequest.MANDATORY;
            }
        }
        return KycGeoRequest.OPTIONAL;
    }

    public boolean c() {
        Boolean previewInFrameEnabled = this.a.e().getPreviewInFrameEnabled();
        if (previewInFrameEnabled != null) {
            return previewInFrameEnabled.booleanValue();
        }
        return false;
    }

    public boolean d() {
        return ((CommonFeatureFlag) this.a.d(wlp.E).getData()).isEnabled();
    }

    public boolean e() {
        return ((CommonFeatureFlag) this.a.d(wlp.v0).getData()).isEnabled();
    }

    public boolean f() {
        return ((WebViewAutoRetryConfig) this.a.d(yl41.a).getData()).isEnabled();
    }

    public boolean g() {
        return ((CommonFeatureFlag) this.a.d(wlp.R0).getData()).isEnabled();
    }
}
