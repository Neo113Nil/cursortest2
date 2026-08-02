package defpackage;

import android.os.Bundle;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.screens.registration.codeconfirmation.presentation.CodeConfirmationParams;
import com.ybsdk.screens.registration.domain.OtpResponseDataEntity;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public interface i9c {
    Object a(String str, int i, d6v d6vVar, ContinuationImpl continuationImpl);

    void b(vr80 vr80Var, vqb vqbVar);

    Text.Formatted c(OtpResponseDataEntity otpResponseDataEntity, Integer num);

    Bundle d();

    OtpResponseDataEntity e();

    Object f(d6v d6vVar, ContinuationImpl continuationImpl);

    c9c g(AppAnalyticsReporter appAnalyticsReporter);

    CodeConfirmationParams getParams();

    boolean h();
}
