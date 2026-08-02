package xsna;

import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: VideoPlaylistCoverOverlay.kt */
/* loaded from: classes16.dex */
public final class p4t0 extends GradientDrawable {
    public final int[] a = new int[16];

    public p4t0() {
        float[] fArr = new float[16];
        for (int i = 0; i < 16; i++) {
            fArr[i] = Math.min(i * 0.0666667f, 1.0f);
        }
        this.a[0] = n8g.l(-16777216, 46);
        this.a[1] = n8g.l(-16777216, 47);
        this.a[2] = n8g.l(-16777216, 50);
        this.a[3] = n8g.l(-16777216, 55);
        this.a[4] = n8g.l(-16777216, 62);
        this.a[5] = n8g.l(-16777216, 71);
        this.a[6] = n8g.l(-16777216, 80);
        this.a[7] = n8g.l(-16777216, 93);
        this.a[8] = n8g.l(-16777216, Sdk.SDKError.Reason.INVALID_REQUEST_BUILDER_ERROR_VALUE);
        this.a[9] = n8g.l(-16777216, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE);
        this.a[10] = n8g.l(-16777216, 128);
        this.a[11] = n8g.l(-16777216, Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE);
        this.a[12] = n8g.l(-16777216, 144);
        this.a[13] = n8g.l(-16777216, 149);
        this.a[14] = n8g.l(-16777216, 152);
        this.a[15] = n8g.l(-16777216, 153);
        setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
        if (Build.VERSION.SDK_INT >= 29) {
            setColors(this.a, fArr);
        } else {
            setColors(this.a);
        }
    }
}
