package defpackage;

import com.ybsdk.common.entities.ApplicationEntity$ApplicationStatus;
import com.ybsdk.common.entities.ApplicationStatusEntity$Status;
import com.ybsdk.common.repositiories.applications.poller.ApplicationStatusFailedException;
import com.ybsdk.core.utils.text.d;
import com.ybsdk.network.dto.ApplicationResponse;
import com.ybsdk.network.dto.ApplicationStatusResponse;
import java.util.Map;
import kotlin.collections.b;

/* loaded from: classes2.dex */
public abstract class n13 {
    public static final s2e0 a(b13 b13Var) {
        int i = m13.a[b13Var.a.ordinal()];
        if (i == 1 || i == 2) {
            return new n2e0(new ApplicationStatusFailedException(b13Var.b, b13Var.c, b13Var.d, b13Var.f, b13Var.g, b13Var.e));
        }
        if (i == 3) {
            return new q2e0(b13Var, true);
        }
        if (i != 4) {
            w511.b();
            return null;
        }
        return new p2e0(b13Var.d, 8, b13Var.b, b13Var.c);
    }

    public static final a03 b(ApplicationResponse applicationResponse) {
        String applicationId = applicationResponse.getApplicationId();
        ApplicationEntity$ApplicationStatus valueOf = ApplicationEntity$ApplicationStatus.valueOf(applicationResponse.getStatus().name());
        String agreement = applicationResponse.getAgreement();
        Map<String, Object> form = applicationResponse.getForm();
        if (form == null) {
            form = b.f();
        }
        return new a03(applicationId, valueOf, agreement, form);
    }

    public static final b13 c(ApplicationStatusResponse applicationStatusResponse) {
        ApplicationStatusEntity$Status applicationStatusEntity$Status;
        ApplicationStatusEntity$Status[] values = ApplicationStatusEntity$Status.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                applicationStatusEntity$Status = null;
                break;
            }
            applicationStatusEntity$Status = values[i];
            if (jl40.l(applicationStatusEntity$Status.getNetworkStatus(), applicationStatusResponse.getStatus())) {
                break;
            }
            i++;
        }
        if (applicationStatusEntity$Status != null) {
            return new b13(applicationStatusEntity$Status, d.f(applicationStatusResponse.getTitle()), d.f(applicationStatusResponse.getDescription()), applicationStatusResponse.getSupportUrl(), null, null, null);
        }
        ny61.r(g8e.o("Unexpected status ", applicationStatusResponse.getStatus()));
        return null;
    }
}
