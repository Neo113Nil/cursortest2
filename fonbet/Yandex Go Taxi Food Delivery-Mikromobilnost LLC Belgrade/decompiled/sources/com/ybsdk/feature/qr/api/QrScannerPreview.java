package com.ybsdk.feature.qr.api;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
import defpackage.pvn;
import defpackage.tls;
import defpackage.tpr;
import defpackage.wls;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nH\u0017¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0013\u001a\u00020\u00112\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fH\u0017¢\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00152\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fH\u0017¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u0019H\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH&¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u0010H\u0004¢\u0006\u0004\b!\u0010\"R<\u0010%\u001a\u001c\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010#j\u0004\u0018\u0001`$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lcom/ybsdk/feature/qr/api/QrScannerPreview;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Ltpr;", "", "Lxlm0;", "getDecodeFlow", "()Ltpr;", "Lkotlin/Function1;", "", "Lzy11;", "onDecode", "decodeSingle", "(Ltls;)V", "Landroid/net/Uri;", LaunchBrowserActivity.KEY_URI, "decodeUri", "(Landroid/net/Uri;Ltls;)V", "", "isOn", "setTorch", "(Z)V", "Lcom/ybsdk/feature/qr/api/QrCameraType;", "cameraType", "()Lcom/ybsdk/feature/qr/api/QrCameraType;", "action", "reportAction", "(Ljava/lang/String;)V", "Lkotlin/Function2;", "Lcom/ybsdk/feature/qr/api/QrScannerAnalyticsListener;", "analyticsListener", "Lwls;", "getAnalyticsListener", "()Lwls;", "setAnalyticsListener", "(Lwls;)V", "feature-qr-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class QrScannerPreview extends FrameLayout {
    private wls analyticsListener;

    public /* synthetic */ QrScannerPreview(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public abstract QrCameraType cameraType();

    public void decodeSingle(tls onDecode) {
        reportAction("start_scan");
    }

    public void decodeUri(Uri uri, tls onDecode) {
        reportAction("decode_file");
    }

    public final wls getAnalyticsListener() {
        return this.analyticsListener;
    }

    public tpr getDecodeFlow() {
        reportAction("start_scan");
        return pvn.a;
    }

    public final void reportAction(String action) {
        wls wlsVar = this.analyticsListener;
        if (wlsVar != null) {
            wlsVar.invoke(action, cameraType().name());
        }
    }

    public final void setAnalyticsListener(wls wlsVar) {
        this.analyticsListener = wlsVar;
    }

    public void setTorch(boolean isOn) {
        reportAction("torch_is_on:" + isOn);
    }

    public QrScannerPreview(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
