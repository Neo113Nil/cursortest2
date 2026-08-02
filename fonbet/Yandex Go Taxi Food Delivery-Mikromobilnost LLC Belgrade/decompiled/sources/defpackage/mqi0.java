package defpackage;

import android.content.Context;
import com.ybsdk.api.YBSdkScenarioResultReceiver$RegistrationResult;
import com.ybsdk.api.entities.YBProduct;
import com.ybsdk.common.repositiories.applications.poller.ApplicationStatusFailedException;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.delegates.RegistrationEvents$RegistrationResultResult;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.d;
import com.ybsdk.feature.deeplink.api.Deeplink;
import com.ybsdk.screens.registration.applicationstatus.presentation.c;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes2.dex */
public final /* synthetic */ class mqi0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ c b;
    public final /* synthetic */ String c;

    public /* synthetic */ mqi0(c cVar, String str, int i) {
        this.a = i;
        this.b = cVar;
        this.c = str;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        r0 r0Var;
        Object value;
        Text title;
        Text description;
        YBProduct product;
        String e0;
        Throwable th;
        String str;
        r0 r0Var2;
        Object value2;
        String message;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        c cVar = this.b;
        switch (i) {
            case 0:
                ApplicationStatusFailedException applicationStatusFailedException = (ApplicationStatusFailedException) obj;
                pz40 Y = cVar.Y();
                do {
                    r0Var = (r0) Y;
                    value = r0Var.getValue();
                    title = applicationStatusFailedException.getTitle();
                    description = applicationStatusFailedException.getDescription();
                    product = cVar.B.getProduct();
                    e0 = cVar.e0(applicationStatusFailedException);
                    th = new Throwable("Polling state is FAILED (Polling.ProductOpening)");
                    str = this.c;
                } while (!r0Var.k(value, new ypi0(title, description, str, product, e0, th)));
                cVar.H.b(YBSdkScenarioResultReceiver$RegistrationResult.FAIL, str);
                break;
            case 1:
                ApplicationStatusFailedException applicationStatusFailedException2 = (ApplicationStatusFailedException) obj;
                Deeplink action = applicationStatusFailedException2.getAction();
                String str2 = this.c;
                if (action != null) {
                    h791.d(cVar.J, applicationStatusFailedException2.getAction().getParsedUri(), 14);
                } else {
                    pz40 Y2 = cVar.Y();
                    do {
                        r0Var2 = (r0) Y2;
                        value2 = r0Var2.getValue();
                    } while (!r0Var2.k(value2, new zpi0(applicationStatusFailedException2.getTitle(), applicationStatusFailedException2.getDescription(), str2, cVar.B.getProduct(), cVar.e0(applicationStatusFailedException2), new Throwable("Polling state is FAILED (Polling.Registration)"), applicationStatusFailedException2.getImage(), applicationStatusFailedException2.getButtons())));
                }
                cVar.H.b(YBSdkScenarioResultReceiver$RegistrationResult.FAIL, str2);
                break;
            default:
                s2e0 s2e0Var = (s2e0) obj;
                Context context = cVar.O;
                AppAnalyticsReporter appAnalyticsReporter = cVar.F;
                boolean z = s2e0Var instanceof q2e0;
                String str3 = this.c;
                if (!z) {
                    if (s2e0Var instanceof n2e0) {
                        Throwable th2 = ((n2e0) s2e0Var).a;
                        ApplicationStatusFailedException applicationStatusFailedException3 = th2 instanceof ApplicationStatusFailedException ? (ApplicationStatusFailedException) th2 : null;
                        if (applicationStatusFailedException3 != null) {
                            message = ((Object) d.a(context, applicationStatusFailedException3.getTitle())) + " " + ((Object) d.a(context, applicationStatusFailedException3.getDescription()));
                        } else {
                            message = th2.getMessage();
                        }
                        z94.u(appAnalyticsReporter.b0, RegistrationEvents$RegistrationResultResult.ERROR, message, str3);
                        break;
                    }
                } else {
                    z94.u(appAnalyticsReporter.b0, RegistrationEvents$RegistrationResultResult.OK, null, str3);
                    break;
                }
                break;
        }
        return zy11Var;
    }
}
