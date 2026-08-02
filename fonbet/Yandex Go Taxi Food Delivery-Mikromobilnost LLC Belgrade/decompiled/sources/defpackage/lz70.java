package defpackage;

import android.content.Intent;
import android.net.http.SslError;
import android.os.Bundle;
import android.util.Log;
import android.util.Range;
import android.util.Size;
import android.view.Display;
import android.view.View;
import android.webkit.WebStorage;
import com.yandex.fintechsdk.core.nfc.impl.api.fragment.NfcDialogFragment;
import com.yandex.go.overdraft.e;
import com.yandex.go.overdraft.g;
import com.yandex.go.taxi.order.map.curtain.a;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.ybsdk.feature.pfm.internal.ui.PfmFragment;
import com.ybsdk.widgets.common.swiperefresh.CustomSwipeRefreshLayout;
import io.flutter.plugins.camerax.CameraXError;
import io.flutter.plugins.webviewflutter.AndroidWebKitError;
import io.flutter.plugins.webviewflutter.DownloadListenerProxyApi$DownloadListenerImpl;
import io.flutter.plugins.webviewflutter.SslErrorType;
import io.flutter.plugins.webviewflutter.WebViewClientProxyApi$WebViewClientImpl;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import ru.yandex.taxi.search.address.view.PointType;

/* loaded from: classes12.dex */
public final /* synthetic */ class lz70 implements ls4, bzz, r55, ai60, xv51, kds, llf, ee5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ lz70(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.bzz
    public ffa0 a(yyz yyzVar) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 2:
                return new myz(yyzVar, (kov) obj, 0);
            default:
                return new myz(yyzVar, ((e) obj).D, 1);
        }
    }

    @Override // defpackage.xv51
    public void b() {
        ((g) this.b).D.h();
    }

    public void c(int i) {
        x4e.z(i, ((pz70) ((a) ((lz70) this.b).b).x).d, null);
    }

    @Override // defpackage.r55
    public void d(pv0 pv0Var, PointType pointType) {
        ((oh70) this.b).a(pointType, pv0Var, null);
    }

    @Override // defpackage.ai60
    public void i(boolean z) {
        TaxiOrder taxiOrder = (TaxiOrder) this.b;
        if (z) {
            synchronized (taxiOrder) {
                taxiOrder.l = taxiOrder.l.M();
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.ee5
    public void m(Object obj, ce5 ce5Var) {
        List g;
        List g2;
        List g3;
        List g4;
        List g5;
        w4u w4uVar;
        Display k;
        List g6;
        List g7;
        List g8;
        List g9;
        List g10;
        List g11;
        List g12;
        List g13;
        List g14;
        int i = this.a;
        int i2 = 3;
        int i3 = 1;
        Object obj2 = this.b;
        int i4 = 0;
        switch (i) {
            case 11:
                n52 n52Var = (n52) obj2;
                try {
                    ((w4u) n52Var.a.w).j(((Long) ((List) obj).get(0)).longValue(), new m52(i4, n52Var));
                    g = Collections.singletonList(null);
                } catch (Throwable th) {
                    if (th instanceof CameraXError) {
                        CameraXError cameraXError = th;
                        g = scc.g(cameraXError.getCode(), cameraXError.getMessage(), cameraXError.getDetails());
                    } else {
                        g = scc.g(th.getClass().getSimpleName(), th.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                    }
                }
                ce5Var.a(g);
                return;
            case 12:
                List list = (List) obj;
                try {
                    ((w4u) ((v83) obj2).a.w).j(((Long) list.get(0)).longValue(), new Range(Integer.valueOf((int) ((Long) list.get(1)).longValue()), Integer.valueOf((int) ((Long) list.get(2)).longValue())));
                    g2 = Collections.singletonList(null);
                } catch (Throwable th2) {
                    if (th2 instanceof CameraXError) {
                        CameraXError cameraXError2 = th2;
                        g2 = scc.g(cameraXError2.getCode(), cameraXError2.getMessage(), cameraXError2.getDetails());
                    } else {
                        g2 = scc.g(th2.getClass().getSimpleName(), th2.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                    }
                }
                ce5Var.a(g2);
                return;
            case 13:
                List list2 = (List) obj;
                try {
                    ((w4u) ((v83) obj2).a.w).j(((Long) list2.get(0)).longValue(), new Size((int) ((Long) list2.get(1)).longValue(), (int) ((Long) list2.get(2)).longValue()));
                    g3 = Collections.singletonList(null);
                } catch (Throwable th3) {
                    if (th3 instanceof CameraXError) {
                        CameraXError cameraXError3 = th3;
                        g3 = scc.g(cameraXError3.getCode(), cameraXError3.getMessage(), cameraXError3.getDetails());
                    } else {
                        g3 = scc.g(th3.getClass().getSimpleName(), th3.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                    }
                }
                ce5Var.a(g3);
                return;
            case 14:
                List list3 = (List) obj;
                try {
                    ((w4u) ((v83) obj2).a.w).j(((Long) list3.get(0)).longValue(), v83.b((Map) list3.get(1)));
                    g4 = Collections.singletonList(null);
                } catch (Throwable th4) {
                    if (th4 instanceof CameraXError) {
                        CameraXError cameraXError4 = th4;
                        g4 = scc.g(cameraXError4.getCode(), cameraXError4.getMessage(), cameraXError4.getDetails());
                    } else {
                        g4 = scc.g(th4.getClass().getSimpleName(), th4.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                    }
                }
                ce5Var.a(g4);
                return;
            case 15:
                v83 v83Var = (v83) obj2;
                List list4 = (List) obj;
                long longValue = ((Long) list4.get(0)).longValue();
                ar7 ar7Var = (ar7) list4.get(1);
                double doubleValue = ((Double) list4.get(2)).doubleValue();
                double doubleValue2 = ((Double) list4.get(3)).doubleValue();
                try {
                    pbj pbjVar = v83Var.a;
                    w4uVar = (w4u) pbjVar.w;
                    k = pbjVar.k();
                } catch (Throwable th5) {
                    if (th5 instanceof CameraXError) {
                        CameraXError cameraXError5 = th5;
                        g5 = scc.g(cameraXError5.getCode(), cameraXError5.getMessage(), cameraXError5.getDetails());
                    } else {
                        g5 = scc.g(th5.getClass().getSimpleName(), th5.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                    }
                }
                if (k == null) {
                    throw new IllegalStateException("A Display could not be retrieved.");
                }
                w4uVar.j(longValue, new lzj(k, ar7Var, (float) doubleValue, (float) doubleValue2));
                g5 = Collections.singletonList(null);
                ce5Var.a(g5);
                return;
            case 16:
                h7m h7mVar = (h7m) obj2;
                try {
                    ((w4u) h7mVar.a.b).j(((Long) ((List) obj).get(0)).longValue(), new DownloadListenerProxyApi$DownloadListenerImpl(h7mVar));
                    g6 = Collections.singletonList(null);
                } catch (Throwable th6) {
                    if (th6 instanceof AndroidWebKitError) {
                        AndroidWebKitError androidWebKitError = th6;
                        g6 = scc.g(androidWebKitError.getCode(), androidWebKitError.getMessage(), androidWebKitError.getDetails());
                    } else {
                        g6 = scc.g(th6.getClass().getSimpleName(), th6.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                    }
                }
                ce5Var.a(g6);
                return;
            case 17:
                prr prrVar = (prr) obj2;
                List list5 = (List) obj;
                try {
                    ((w4u) prrVar.a.b).j(((Long) list5.get(0)).longValue(), new b7x((String) list5.get(1), prrVar));
                    g7 = Collections.singletonList(null);
                } catch (Throwable th7) {
                    if (th7 instanceof AndroidWebKitError) {
                        AndroidWebKitError androidWebKitError2 = th7;
                        g7 = scc.g(androidWebKitError2.getCode(), androidWebKitError2.getMessage(), androidWebKitError2.getDetails());
                    } else {
                        g7 = scc.g(th7.getClass().getSimpleName(), th7.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                    }
                }
                ce5Var.a(g7);
                return;
            case 18:
                sm7 sm7Var = (sm7) obj2;
                try {
                    ((w4u) sm7Var.a.w).j(((Long) ((List) obj).get(0)).longValue(), new wdj(i3, sm7Var));
                    g8 = Collections.singletonList(null);
                } catch (Throwable th8) {
                    if (th8 instanceof CameraXError) {
                        CameraXError cameraXError6 = th8;
                        g8 = scc.g(cameraXError6.getCode(), cameraXError6.getMessage(), cameraXError6.getDetails());
                    } else {
                        g8 = scc.g(th8.getClass().getSimpleName(), th8.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                    }
                }
                ce5Var.a(g8);
                return;
            case 19:
                List list6 = (List) obj;
                try {
                    ((w4u) ((sm7) obj2).a.w).j(((Long) list6.get(0)).longValue(), new yrj0((Size) list6.get(1)));
                    g9 = Collections.singletonList(null);
                } catch (Throwable th9) {
                    if (th9 instanceof CameraXError) {
                        CameraXError cameraXError7 = th9;
                        g9 = scc.g(cameraXError7.getCode(), cameraXError7.getMessage(), cameraXError7.getDetails());
                    } else {
                        g9 = scc.g(th9.getClass().getSimpleName(), th9.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                    }
                }
                ce5Var.a(g9);
                return;
            case 20:
                n52 n52Var2 = (n52) obj2;
                List list7 = (List) obj;
                long longValue2 = ((Long) list7.get(0)).longValue();
                xrj0 xrj0Var = (xrj0) list7.get(1);
                csj0 csj0Var = (csj0) list7.get(2);
                s83 s83Var = (s83) list7.get(3);
                try {
                    w4u w4uVar2 = (w4u) n52Var2.a.w;
                    asj0 asj0Var = new asj0();
                    if (s83Var != null) {
                        asj0Var.a = s83Var;
                    }
                    if (csj0Var != null) {
                        asj0Var.b = csj0Var;
                    }
                    if (xrj0Var != null) {
                        asj0Var.c = xrj0Var;
                    }
                    w4uVar2.j(longValue2, asj0Var.a());
                    g10 = Collections.singletonList(null);
                } catch (Throwable th10) {
                    if (th10 instanceof CameraXError) {
                        CameraXError cameraXError8 = th10;
                        g10 = scc.g(cameraXError8.getCode(), cameraXError8.getMessage(), cameraXError8.getDetails());
                    } else {
                        g10 = scc.g(th10.getClass().getSimpleName(), th10.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                    }
                }
                ce5Var.a(g10);
                return;
            case 21:
                prr prrVar2 = (prr) obj2;
                List list8 = (List) obj;
                SslError sslError = (SslError) list8.get(0);
                SslErrorType sslErrorType = (SslErrorType) list8.get(1);
                try {
                } catch (Throwable th11) {
                    if (th11 instanceof AndroidWebKitError) {
                        AndroidWebKitError androidWebKitError3 = th11;
                        g11 = scc.g(androidWebKitError3.getCode(), androidWebKitError3.getMessage(), androidWebKitError3.getDetails());
                    } else {
                        g11 = scc.g(th11.getClass().getSimpleName(), th11.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                    }
                }
                switch (ayt0.a[sslErrorType.ordinal()]) {
                    case 1:
                        i2 = 4;
                        g11 = Collections.singletonList(Boolean.valueOf(sslError.hasError(i2)));
                        ce5Var.a(g11);
                        return;
                    case 2:
                        i2 = 1;
                        g11 = Collections.singletonList(Boolean.valueOf(sslError.hasError(i2)));
                        ce5Var.a(g11);
                        return;
                    case 3:
                        i2 = 2;
                        g11 = Collections.singletonList(Boolean.valueOf(sslError.hasError(i2)));
                        ce5Var.a(g11);
                        return;
                    case 4:
                        i2 = 5;
                        g11 = Collections.singletonList(Boolean.valueOf(sslError.hasError(i2)));
                        ce5Var.a(g11);
                        return;
                    case 5:
                        i2 = 0;
                        g11 = Collections.singletonList(Boolean.valueOf(sslError.hasError(i2)));
                        ce5Var.a(g11);
                        return;
                    case 6:
                        g11 = Collections.singletonList(Boolean.valueOf(sslError.hasError(i2)));
                        ce5Var.a(g11);
                        return;
                    case 7:
                        prrVar2.a.getClass();
                        throw new IllegalArgumentException(sslErrorType + " doesn't represent a native value.");
                    default:
                        i2 = -1;
                        g11 = Collections.singletonList(Boolean.valueOf(sslError.hasError(i2)));
                        ce5Var.a(g11);
                        return;
                }
            case 22:
                sm7 sm7Var2 = (sm7) obj2;
                try {
                    ((w4u) sm7Var2.a.w).j(((Long) ((List) obj).get(0)).longValue(), new jn31(sm7Var2));
                    g12 = Collections.singletonList(null);
                } catch (Throwable th12) {
                    if (th12 instanceof CameraXError) {
                        CameraXError cameraXError9 = th12;
                        g12 = scc.g(cameraXError9.getCode(), cameraXError9.getMessage(), cameraXError9.getDetails());
                    } else {
                        g12 = scc.g(th12.getClass().getSimpleName(), th12.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                    }
                }
                ce5Var.a(g12);
                return;
            case 23:
                try {
                    ((w4u) ((o2c) obj2).a.b).j(((Long) ((List) obj).get(0)).longValue(), WebStorage.getInstance());
                    g13 = Collections.singletonList(null);
                } catch (Throwable th13) {
                    if (th13 instanceof AndroidWebKitError) {
                        AndroidWebKitError androidWebKitError4 = th13;
                        g13 = scc.g(androidWebKitError4.getCode(), androidWebKitError4.getMessage(), androidWebKitError4.getDetails());
                    } else {
                        g13 = scc.g(th13.getClass().getSimpleName(), th13.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                    }
                }
                ce5Var.a(g13);
                return;
            default:
                im41 im41Var = (im41) obj2;
                try {
                    ((w4u) im41Var.a.b).j(((Long) ((List) obj).get(0)).longValue(), new WebViewClientProxyApi$WebViewClientImpl(im41Var));
                    g14 = Collections.singletonList(null);
                } catch (Throwable th14) {
                    if (th14 instanceof AndroidWebKitError) {
                        AndroidWebKitError androidWebKitError5 = th14;
                        g14 = scc.g(androidWebKitError5.getCode(), androidWebKitError5.getMessage(), androidWebKitError5.getDetails());
                    } else {
                        g14 = scc.g(th14.getClass().getSimpleName(), th14.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                    }
                }
                ce5Var.a(g14);
                return;
        }
    }

    @Override // defpackage.llf
    public boolean q(CustomSwipeRefreshLayout customSwipeRefreshLayout, View view) {
        boolean onViewCreated$lambda$13$lambda$8;
        onViewCreated$lambda$13$lambda$8 = PfmFragment.onViewCreated$lambda$13$lambda$8((PfmFragment) this.b, customSwipeRefreshLayout, view);
        return onViewCreated$lambda$13$lambda$8;
    }

    @Override // defpackage.kds
    public void s(Bundle bundle, String str) {
        r2a0 r2a0Var = (r2a0) this.b;
        String string = bundle.getString(NfcDialogFragment.RESULT_KEY);
        r2a0Var.getClass();
        if (jl40.l(string, NfcDialogFragment.RESULT_POSITIVE)) {
            r2a0Var.a.startActivity(new Intent("android.settings.NFC_SETTINGS"));
        } else {
            jl40.l(string, NfcDialogFragment.RESULT_NEGATIVE);
        }
        r2a0Var.i = null;
    }
}
