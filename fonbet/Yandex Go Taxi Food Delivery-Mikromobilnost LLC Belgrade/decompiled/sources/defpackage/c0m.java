package defpackage;

import androidx.compose.foundation.gestures.i;
import androidx.compose.ui.semantics.f;
import com.yandex.go.navigator.driving.GuidanceCompletionReason;
import com.yandex.mobile.drive.drive_native_features.a;
import com.yandex.mobile.drive.drive_native_features.b;
import io.flutter.plugins.webviewflutter.DownloadListenerProxyApi$DownloadListenerImpl;
import java.util.List;
import kotlin.Result;

/* loaded from: classes12.dex */
public final /* synthetic */ class c0m implements tls {
    public final /* synthetic */ int a;

    public /* synthetic */ c0m(int i) {
        this.a = i;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                return zy11Var;
            case 1:
                return DownloadListenerProxyApi$DownloadListenerImpl.lambda$onDownloadStart$0((Result) obj);
            case 2:
                float f = i.a;
                return zy11Var;
            case 3:
                return Boolean.TRUE;
            case 4:
                Throwable th = (Throwable) obj;
                a aVar = b.z;
                String message = th.getMessage();
                qgn0 qgn0Var = h2b1.c;
                if (qgn0Var != null) {
                    qgn0Var.o(message, th);
                }
                return zy11Var;
            case 5:
                return zy11Var;
            case 6:
                ((lhm) obj).e();
                return zy11Var;
            case 7:
                return Long.valueOf(((Boolean) obj).booleanValue() ? 0L : 1000L);
            case 8:
                ((glm) obj).a.r(new c0m(12));
                return zy11Var;
            case 9:
                mlm mlmVar = ((glm) obj).a;
                mlmVar.z((jws) mlmVar.S.getValue(), new hlm(mlmVar));
                return zy11Var;
            case 10:
                mlm.P(((glm) obj).a);
                return zy11Var;
            case 11:
                ((glm) obj).a.r(new lkm(GuidanceCompletionReason.COMPLETED_BY_USER, 1));
                return zy11Var;
            case 12:
                ((xe50) obj).a.U();
                return zy11Var;
            case 13:
                ((xe50) obj).n1(GuidanceCompletionReason.COMPLETED_BY_USER);
                return zy11Var;
            case 14:
                f.d((mnq0) obj);
                return zy11Var;
            case 15:
                mnq0 mnq0Var = (mnq0) obj;
                f.v(mnq0Var);
                f.w(mnq0Var, 2.0f);
                return zy11Var;
            case 16:
                mnq0 mnq0Var2 = (mnq0) obj;
                f.v(mnq0Var2);
                f.w(mnq0Var2, 0.0f);
                return zy11Var;
            case 17:
                f.d((mnq0) obj);
                return zy11Var;
            case 18:
                f.v((mnq0) obj);
                return zy11Var;
            case 19:
                mnq0 mnq0Var3 = (mnq0) obj;
                f.v(mnq0Var3);
                f.w(mnq0Var3, 1.0f);
                return zy11Var;
            case 20:
                float f2 = iom.a;
                return zy11Var;
            case 21:
                List list = (List) obj;
                int intValue = ((Number) list.get(0)).intValue();
                oc0 oc0Var = new oc0(list, 3);
                z890 z890Var = a990.a;
                return new ppm(new ugh(intValue, 0.0f, oc0Var));
            case 22:
                f.d((mnq0) obj);
                return zy11Var;
            case 23:
                f.v((mnq0) obj);
                return zy11Var;
            case 24:
                f.w((mnq0) obj, -1.0f);
                return zy11Var;
            case 25:
                f.w((mnq0) obj, -1.0f);
                return zy11Var;
            case 26:
                f.w((mnq0) obj, 1.0f);
                return zy11Var;
            case 27:
                return evu0.k0((String) obj).toString();
            case 28:
                f.e((mnq0) obj);
                return zy11Var;
            default:
                qwd qwdVar = yrm.a;
                return Boolean.TRUE;
        }
    }
}
