package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.net.http.SslError;
import android.os.Message;
import android.util.Log;
import android.webkit.GeolocationPermissions;
import android.webkit.PermissionRequest;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebStorage;
import android.webkit.WebViewClient;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.pdf.internal.entities.ButtonEntity$Alignment;
import com.ybsdk.widgets.common.YbButtonView;
import com.ybsdk.widgets.common.YbButtonViewGroup;
import io.flutter.plugins.camerax.CameraXError;
import io.flutter.plugins.camerax.LiveDataSupportedType;
import io.flutter.plugins.webviewflutter.AndroidWebKitError;
import io.flutter.plugins.webviewflutter.SslErrorType;
import io.flutter.plugins.webviewflutter.WebViewClientProxyApi$WebViewClientImpl;
import java.io.File;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.bouncycastle.jce.provider.AnnotatedException;

/* loaded from: classes4.dex */
public final /* synthetic */ class h490 implements ev31, ee5, ims, f18 {
    public final /* synthetic */ int a;

    public static /* synthetic */ void a(int i, int i2, String str) {
        throw new IllegalArgumentException(str + i + 'x' + i2);
    }

    public static /* synthetic */ void b(Exception exc, String str) {
        throw new AnnotatedException(str, exc);
    }

    public static /* synthetic */ void c(StringBuilder sb, Object obj) {
        sb.append(obj);
        sb.append('\'');
        throw new IllegalArgumentException(sb.toString().toString());
    }

    @Override // defpackage.ims
    /* renamed from: apply */
    public Object mo104apply(Object obj) {
        return i5f0.b;
    }

    @Override // defpackage.f18
    public void cancel() {
        muf0.a();
    }

    @Override // defpackage.ee5
    public void m(Object obj, ce5 ce5Var) {
        List g;
        List g2;
        List g3;
        List g4;
        List g5;
        List g6;
        List g7;
        List g8;
        List g9;
        List g10;
        List g11;
        List g12;
        List g13;
        List g14;
        List g15;
        List g16;
        List g17;
        List g18;
        List g19;
        List g20;
        List g21;
        List g22;
        List g23;
        List g24;
        switch (this.a) {
            case 2:
                try {
                    ((Message) ((List) obj).get(0)).sendToTarget();
                    g = Collections.singletonList(null);
                } catch (Throwable th) {
                    if (th instanceof AndroidWebKitError) {
                        AndroidWebKitError androidWebKitError = th;
                        g = scc.g(androidWebKitError.getCode(), androidWebKitError.getMessage(), androidWebKitError.getDetails());
                    } else {
                        g = scc.g(th.getClass().getSimpleName(), th.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                    }
                }
                ce5Var.a(g);
                return;
            case 3:
                try {
                    g2 = Collections.singletonList(((co7) ((List) obj).get(0)).c());
                } catch (Throwable th2) {
                    if (th2 instanceof CameraXError) {
                        CameraXError cameraXError = th2;
                        g2 = scc.g(cameraXError.getCode(), cameraXError.getMessage(), cameraXError.getDetails());
                    } else {
                        g2 = scc.g(th2.getClass().getSimpleName(), th2.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                    }
                }
                ce5Var.a(g2);
                return;
            case 4:
                try {
                    g3 = Collections.singletonList(new fvy(((ar7) ((List) obj).get(0)).a(), LiveDataSupportedType.CAMERA_STATE));
                } catch (Throwable th3) {
                    if (th3 instanceof CameraXError) {
                        CameraXError cameraXError2 = th3;
                        g3 = scc.g(cameraXError2.getCode(), cameraXError2.getMessage(), cameraXError2.getDetails());
                    } else {
                        g3 = scc.g(th3.getClass().getSimpleName(), th3.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                    }
                }
                ce5Var.a(g3);
                return;
            case 5:
                try {
                    g4 = Collections.singletonList(new fvy(((ar7) ((List) obj).get(0)).k(), LiveDataSupportedType.ZOOM_STATE));
                } catch (Throwable th4) {
                    if (th4 instanceof CameraXError) {
                        CameraXError cameraXError3 = th4;
                        g4 = scc.g(cameraXError3.getCode(), cameraXError3.getMessage(), cameraXError3.getDetails());
                    } else {
                        g4 = scc.g(th4.getClass().getSimpleName(), th4.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                    }
                }
                ce5Var.a(g4);
                return;
            case 6:
                List list = (List) obj;
                try {
                    g5 = Collections.singletonList(((b48) list.get(0)).a.g(wn7.a((CaptureRequest.Key) list.get(1)), null));
                } catch (Throwable th5) {
                    if (th5 instanceof CameraXError) {
                        CameraXError cameraXError4 = th5;
                        g5 = scc.g(cameraXError4.getCode(), cameraXError4.getMessage(), cameraXError4.getDetails());
                    } else {
                        g5 = scc.g(th5.getClass().getSimpleName(), th5.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                    }
                }
                ce5Var.a(g5);
                return;
            case 7:
                try {
                    try {
                        g6 = Collections.singletonList(((Certificate) ((List) obj).get(0)).getEncoded());
                    } catch (CertificateEncodingException e) {
                        throw new RuntimeException(e);
                    }
                } catch (Throwable th6) {
                    if (th6 instanceof AndroidWebKitError) {
                        AndroidWebKitError androidWebKitError2 = th6;
                        g6 = scc.g(androidWebKitError2.getCode(), androidWebKitError2.getMessage(), androidWebKitError2.getDetails());
                    } else {
                        g6 = scc.g(th6.getClass().getSimpleName(), th6.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                    }
                }
                ce5Var.a(g6);
                return;
            case 8:
                try {
                    ((WebChromeClient.CustomViewCallback) ((List) obj).get(0)).onCustomViewHidden();
                    g7 = Collections.singletonList(null);
                } catch (Throwable th7) {
                    if (th7 instanceof AndroidWebKitError) {
                        AndroidWebKitError androidWebKitError3 = th7;
                        g7 = scc.g(androidWebKitError3.getCode(), androidWebKitError3.getMessage(), androidWebKitError3.getDetails());
                    } else {
                        g7 = scc.g(th7.getClass().getSimpleName(), th7.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                    }
                }
                ce5Var.a(g7);
                return;
            case 9:
                List list2 = (List) obj;
                try {
                    ((GeolocationPermissions.Callback) list2.get(0)).invoke((String) list2.get(1), ((Boolean) list2.get(2)).booleanValue(), ((Boolean) list2.get(3)).booleanValue());
                    g8 = Collections.singletonList(null);
                } catch (Throwable th8) {
                    if (th8 instanceof AndroidWebKitError) {
                        AndroidWebKitError androidWebKitError4 = th8;
                        g8 = scc.g(androidWebKitError4.getCode(), androidWebKitError4.getMessage(), androidWebKitError4.getDetails());
                    } else {
                        g8 = scc.g(th8.getClass().getSimpleName(), th8.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                    }
                }
                ce5Var.a(g8);
                return;
            case 10:
                try {
                    g9 = Collections.singletonList(Arrays.asList(((jdv) ((List) obj).get(0)).i0()));
                } catch (Throwable th9) {
                    if (th9 instanceof CameraXError) {
                        CameraXError cameraXError5 = th9;
                        g9 = scc.g(cameraXError5.getCode(), cameraXError5.getMessage(), cameraXError5.getDetails());
                    } else {
                        g9 = scc.g(th9.getClass().getSimpleName(), th9.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                    }
                }
                ce5Var.a(g9);
                return;
            case 11:
                try {
                    ((jdv) ((List) obj).get(0)).close();
                    g10 = Collections.singletonList(null);
                } catch (Throwable th10) {
                    if (th10 instanceof CameraXError) {
                        CameraXError cameraXError6 = th10;
                        g10 = scc.g(cameraXError6.getCode(), cameraXError6.getMessage(), cameraXError6.getDetails());
                    } else {
                        g10 = scc.g(th10.getClass().getSimpleName(), th10.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                    }
                }
                ce5Var.a(g10);
                return;
            case 12:
                List list3 = (List) obj;
                try {
                    g11 = Collections.singletonList(sm7.b((List) list3.get(2), ((Long) list3.get(0)).longValue(), ((Long) list3.get(1)).longValue()));
                } catch (Throwable th11) {
                    if (th11 instanceof CameraXError) {
                        CameraXError cameraXError7 = th11;
                        g11 = scc.g(cameraXError7.getCode(), cameraXError7.getMessage(), cameraXError7.getDetails());
                    } else {
                        g11 = scc.g(th11.getClass().getSimpleName(), th11.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                    }
                }
                ce5Var.a(g11);
                return;
            case 13:
                try {
                    g12 = Collections.singletonList(Double.valueOf(((s920) ((List) obj).get(0)).c));
                } catch (Throwable th12) {
                    if (th12 instanceof CameraXError) {
                        CameraXError cameraXError8 = th12;
                        g12 = scc.g(cameraXError8.getCode(), cameraXError8.getMessage(), cameraXError8.getDetails());
                    } else {
                        g12 = scc.g(th12.getClass().getSimpleName(), th12.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                    }
                }
                ce5Var.a(g12);
                return;
            case 14:
                List list4 = (List) obj;
                try {
                    g13 = Collections.singletonList(((t920) list4.get(0)).b((float) ((Double) list4.get(1)).doubleValue(), (float) ((Double) list4.get(2)).doubleValue(), 0.15f));
                } catch (Throwable th13) {
                    if (th13 instanceof CameraXError) {
                        CameraXError cameraXError9 = th13;
                        g13 = scc.g(cameraXError9.getCode(), cameraXError9.getMessage(), cameraXError9.getDetails());
                    } else {
                        g13 = scc.g(th13.getClass().getSimpleName(), th13.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                    }
                }
                ce5Var.a(g13);
                return;
            case 15:
                List list5 = (List) obj;
                try {
                    g14 = Collections.singletonList(((t920) list5.get(0)).b((float) ((Double) list5.get(1)).doubleValue(), (float) ((Double) list5.get(2)).doubleValue(), (float) ((Double) list5.get(3)).doubleValue()));
                } catch (Throwable th14) {
                    if (th14 instanceof CameraXError) {
                        CameraXError cameraXError10 = th14;
                        g14 = scc.g(cameraXError10.getCode(), cameraXError10.getMessage(), cameraXError10.getDetails());
                    } else {
                        g14 = scc.g(th14.getClass().getSimpleName(), th14.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                    }
                }
                ce5Var.a(g14);
                return;
            case 16:
                List list6 = (List) obj;
                try {
                    ((PermissionRequest) list6.get(0)).grant((String[]) ((List) list6.get(1)).toArray(new String[0]));
                    g15 = Collections.singletonList(null);
                } catch (Throwable th15) {
                    if (th15 instanceof AndroidWebKitError) {
                        AndroidWebKitError androidWebKitError5 = th15;
                        g15 = scc.g(androidWebKitError5.getCode(), androidWebKitError5.getMessage(), androidWebKitError5.getDetails());
                    } else {
                        g15 = scc.g(th15.getClass().getSimpleName(), th15.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                    }
                }
                ce5Var.a(g15);
                return;
            case 17:
                try {
                    ((PermissionRequest) ((List) obj).get(0)).deny();
                    g16 = Collections.singletonList(null);
                } catch (Throwable th16) {
                    if (th16 instanceof AndroidWebKitError) {
                        AndroidWebKitError androidWebKitError6 = th16;
                        g16 = scc.g(androidWebKitError6.getCode(), androidWebKitError6.getMessage(), androidWebKitError6.getDetails());
                    } else {
                        g16 = scc.g(th16.getClass().getSimpleName(), th16.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                    }
                }
                ce5Var.a(g16);
                return;
            case 18:
                try {
                    g17 = Collections.singletonList(((bsj0) ((List) obj).get(0)).a);
                } catch (Throwable th17) {
                    if (th17 instanceof CameraXError) {
                        CameraXError cameraXError11 = th17;
                        g17 = scc.g(cameraXError11.getCode(), cameraXError11.getMessage(), cameraXError11.getDetails());
                    } else {
                        g17 = scc.g(th17.getClass().getSimpleName(), th17.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th17), th17.getCause()));
                    }
                }
                ce5Var.a(g17);
                return;
            case 19:
                try {
                    int primaryError = ((SslError) ((List) obj).get(0)).getPrimaryError();
                    g18 = Collections.singletonList(primaryError != 0 ? primaryError != 1 ? primaryError != 2 ? primaryError != 3 ? primaryError != 4 ? primaryError != 5 ? SslErrorType.UNKNOWN : SslErrorType.INVALID : SslErrorType.DATE_INVALID : SslErrorType.UNTRUSTED : SslErrorType.ID_MISMATCH : SslErrorType.EXPIRED : SslErrorType.NOT_YET_VALID);
                } catch (Throwable th18) {
                    if (th18 instanceof AndroidWebKitError) {
                        AndroidWebKitError androidWebKitError7 = th18;
                        g18 = scc.g(androidWebKitError7.getCode(), androidWebKitError7.getMessage(), androidWebKitError7.getDetails());
                    } else {
                        g18 = scc.g(th18.getClass().getSimpleName(), th18.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th18), th18.getCause()));
                    }
                }
                ce5Var.a(g18);
                return;
            case 20:
                try {
                    ((SslErrorHandler) ((List) obj).get(0)).cancel();
                    g19 = Collections.singletonList(null);
                } catch (Throwable th19) {
                    if (th19 instanceof AndroidWebKitError) {
                        AndroidWebKitError androidWebKitError8 = th19;
                        g19 = scc.g(androidWebKitError8.getCode(), androidWebKitError8.getMessage(), androidWebKitError8.getDetails());
                    } else {
                        g19 = scc.g(th19.getClass().getSimpleName(), th19.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th19), th19.getCause()));
                    }
                }
                ce5Var.a(g19);
                return;
            case 21:
                try {
                    ((SslErrorHandler) ((List) obj).get(0)).proceed();
                    g20 = Collections.singletonList(null);
                } catch (Throwable th20) {
                    if (th20 instanceof AndroidWebKitError) {
                        AndroidWebKitError androidWebKitError9 = th20;
                        g20 = scc.g(androidWebKitError9.getCode(), androidWebKitError9.getMessage(), androidWebKitError9.getDetails());
                    } else {
                        g20 = scc.g(th20.getClass().getSimpleName(), th20.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th20), th20.getCause()));
                    }
                }
                ce5Var.a(g20);
                return;
            case 22:
                List list7 = (List) obj;
                WebSettings webSettings = (WebSettings) list7.get(0);
                boolean booleanValue = ((Boolean) list7.get(1)).booleanValue();
                try {
                } catch (Throwable th21) {
                    if (th21 instanceof AndroidWebKitError) {
                        AndroidWebKitError androidWebKitError10 = th21;
                        g21 = scc.g(androidWebKitError10.getCode(), androidWebKitError10.getMessage(), androidWebKitError10.getDetails());
                    } else {
                        g21 = scc.g(th21.getClass().getSimpleName(), th21.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th21), th21.getCause()));
                    }
                }
                if (!qp41.R.a()) {
                    throw qp41.a();
                }
                vj41.a(webSettings).x(booleanValue);
                g21 = Collections.singletonList(null);
                ce5Var.a(g21);
                return;
            case 23:
                try {
                    ((WebStorage) ((List) obj).get(0)).deleteAllData();
                    g22 = Collections.singletonList(null);
                } catch (Throwable th22) {
                    if (th22 instanceof AndroidWebKitError) {
                        AndroidWebKitError androidWebKitError11 = th22;
                        g22 = scc.g(androidWebKitError11.getCode(), androidWebKitError11.getMessage(), androidWebKitError11.getDetails());
                    } else {
                        g22 = scc.g(th22.getClass().getSimpleName(), th22.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th22), th22.getCause()));
                    }
                }
                ce5Var.a(g22);
                return;
            case 24:
                List list8 = (List) obj;
                WebViewClient webViewClient = (WebViewClient) list8.get(0);
                boolean booleanValue2 = ((Boolean) list8.get(1)).booleanValue();
                try {
                } catch (Throwable th23) {
                    if (th23 instanceof AndroidWebKitError) {
                        AndroidWebKitError androidWebKitError12 = th23;
                        g23 = scc.g(androidWebKitError12.getCode(), androidWebKitError12.getMessage(), androidWebKitError12.getDetails());
                    } else {
                        g23 = scc.g(th23.getClass().getSimpleName(), th23.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th23), th23.getCause()));
                    }
                }
                if (!(webViewClient instanceof WebViewClientProxyApi$WebViewClientImpl)) {
                    throw new IllegalStateException("This WebViewClient doesn't support setting the returnValueForShouldOverrideUrlLoading.");
                }
                ((WebViewClientProxyApi$WebViewClientImpl) webViewClient).setReturnValueForShouldOverrideUrlLoading(booleanValue2);
                g23 = Collections.singletonList(null);
                ce5Var.a(g23);
                return;
            default:
                try {
                    g24 = Collections.singletonList(Boolean.valueOf(hm91.d((String) ((List) obj).get(0))));
                } catch (Throwable th24) {
                    if (th24 instanceof AndroidWebKitError) {
                        AndroidWebKitError androidWebKitError13 = th24;
                        g24 = scc.g(androidWebKitError13.getCode(), androidWebKitError13.getMessage(), androidWebKitError13.getDetails());
                    } else {
                        g24 = scc.g(th24.getClass().getSimpleName(), th24.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th24), th24.getCause()));
                    }
                }
                ce5Var.a(g24);
                return;
        }
    }

    @Override // defpackage.ev31
    public Object q(Object obj) {
        YbButtonViewGroup.Orientation orientation;
        xqa0 xqa0Var = (xqa0) obj;
        File file = xqa0Var.c;
        YbButtonViewGroup.b bVar = null;
        if (xqa0Var.b != null) {
            return new cra0(r501.a(xqa0Var.b, unr0.h(Text.Companion, dzh0.ybsdk_reports_reports_processing_failure_title), new Text.Resource(dzh0.ybsdk_reports_reports_processing_failure_subtitle), null, null, null, null, null, null, null, new nbv(txg0.ybsdk_ic_status_error, null), null, null, 63474));
        }
        if (file == null) {
            return dra0.a;
        }
        YbButtonViewGroup.b bVar2 = new YbButtonViewGroup.b(null, null, new YbButtonView.a(unr0.h(Text.Companion, dzh0.ybsdk_webview_share_document_button), null, new nbv(txg0.ybsdk_ic_upload, null), null, null, null, null, false, false, null, 4090), null, 11);
        kao a = r501.a(null, new Text.Resource(dzh0.ybsdk_reports_reports_processing_success_title), new Text.Resource(dzh0.ybsdk_reports_reports_processing_success_subtitle), new Text.Resource(dzh0.ybsdk_reports_reports_processing_success_button_title), null, null, null, null, null, null, new nbv(txg0.ybsdk_ic_status_success, null), null, null, 63459);
        if (xqa0Var.d) {
            bVar = bVar2;
        } else {
            j57 j57Var = xqa0Var.e;
            if (j57Var != null) {
                ButtonEntity$Alignment buttonEntity$Alignment = j57Var.c;
                int i = buttonEntity$Alignment == null ? -1 : fra0.a[buttonEntity$Alignment.ordinal()];
                if (i == -1 || i == 1) {
                    orientation = YbButtonViewGroup.Orientation.VERTICAL;
                } else {
                    if (i != 2) {
                        w511.b();
                        return null;
                    }
                    orientation = YbButtonViewGroup.Orientation.HORIZONTAL;
                }
                YbButtonViewGroup.Orientation orientation2 = orientation;
                uz6 uz6Var = j57Var.a;
                YbButtonView.a aVar = uz6Var != null ? new YbButtonView.a(uz6Var.a, null, null, null, null, null, null, false, false, null, 4094) : null;
                uz6 uz6Var2 = j57Var.b;
                bVar = new YbButtonViewGroup.b(orientation2, aVar, uz6Var2 != null ? new YbButtonView.a(uz6Var2.a, null, null, null, null, null, null, false, false, null, 4094) : null, null, 8);
            }
        }
        return new bra0(a, bVar, file);
    }

    public /* synthetic */ h490(int i, Object obj) {
        this.a = i;
    }
}
