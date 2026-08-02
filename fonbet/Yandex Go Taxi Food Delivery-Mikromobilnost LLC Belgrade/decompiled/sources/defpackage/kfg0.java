package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.gms.common.a;
import com.ybsdk.core.qr.scanner.ui.InteractorQrScannerView;
import com.ybsdk.feature.qr.api.QrScannerPreview;
import com.ybsdk.feature.qr.api.QrScannerPreviewDependencies;
import com.ybsdk.feature.qr.scanner.vendor.huawei.HuaweiAvailabilityDetectorKt;
import com.ybsdk.feature.qr.scanner.vendor.huawei.HuaweiScanInteractor;
import com.ybsdk.feature.qr.scanner.vendor.zxing.ZxingQrScannerView;
import com.ybsdk.rconfig.b;
import com.ybsdk.rconfig.configs.CommonFeatureFlag;
import java.util.Collections;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class kfg0 implements ifg0 {
    public static final InteractorQrScannerView a(Context context, QrScannerPreviewDependencies qrScannerPreviewDependencies) {
        if (HuaweiAvailabilityDetectorKt.isHuaweiAvailable(context)) {
            return new InteractorQrScannerView(context, null, 0, new jfg0(qrScannerPreviewDependencies, 1), 6, null);
        }
        return null;
    }

    public static final nlm0 c(View view, QrScannerPreviewDependencies qrScannerPreviewDependencies) {
        return new HuaweiScanInteractor(view.getContext(), qrScannerPreviewDependencies);
    }

    public static final ZxingQrScannerView d(Context context) {
        return new ZxingQrScannerView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(7:17|18|(6:29|30|31|32|(3:23|24|25)|(2:10|11)(1:13))|20|21|(0)|(0)(0))(1:3)|4|5|6|(1:8)(1:14)|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005b, code lost:
    
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0052, code lost:
    
        if (r3 == null) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00a9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.ifg0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final QrScannerPreview b(Context context, QrScannerPreviewDependencies qrScannerPreviewDependencies) {
        Context context2;
        QrScannerPreview qrScannerPreview;
        lrp0 lrp0Var = lrp0.w;
        b bVar = (b) ((yxf0) qrScannerPreviewDependencies).a;
        if (((CommonFeatureFlag) bVar.d(wlp.K).getData()).isEnabled()) {
            context2 = context;
        } else {
            try {
                try {
                } catch (Throwable th) {
                    context2 = context;
                    x4c.g("isGooglePlayServicesAvailable failed unexpectedly", th, null, Collections.singletonList(lrp0Var), 4);
                }
            } catch (NoClassDefFoundError unused) {
            }
            if (a.d.d(context, com.google.android.gms.common.b.a) == 0) {
                try {
                    context2 = context;
                    qrScannerPreview = new InteractorQrScannerView(context2, null, 0, new jfg0(qrScannerPreviewDependencies, 0), 6, null);
                } catch (NoClassDefFoundError unused2) {
                }
                if (qrScannerPreview == null) {
                    try {
                        qrScannerPreview = a(context2, qrScannerPreviewDependencies);
                    } catch (NoClassDefFoundError unused3) {
                        qrScannerPreview = null;
                    }
                }
                if (qrScannerPreview != null) {
                    return qrScannerPreview;
                }
                x4c.g("No available services for ScanVendorInteractorProvider", null, null, Collections.singletonList(lrp0Var), 6);
                return new InteractorQrScannerView(context2, null, 0, new d7g0(2), 6, null);
            }
            context2 = context;
            qrScannerPreview = null;
            if (qrScannerPreview == null) {
            }
            if (qrScannerPreview != null) {
            }
        }
        ZxingQrScannerView zxingQrScannerView = d(context2);
        QrScannerPreview qrScannerPreview2 = (QrScannerPreview) zxingQrScannerView;
        if (qrScannerPreview2 != null) {
            Map e = gw00.e(new Pair("fallback", Boolean.valueOf(((CommonFeatureFlag) bVar.d(wlp.K).getData()).isEnabled())));
            trp0 trp0Var = trp0.a;
            trp0.f(new grp0(e));
            qrScannerPreview = qrScannerPreview2;
        } else {
            qrScannerPreview = null;
        }
        if (qrScannerPreview != null) {
        }
    }
}
