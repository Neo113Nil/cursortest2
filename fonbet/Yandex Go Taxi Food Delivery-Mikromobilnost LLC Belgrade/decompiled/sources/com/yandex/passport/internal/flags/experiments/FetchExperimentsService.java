package com.yandex.passport.internal.flags.experiments;

import android.content.Intent;
import androidx.core.app.PassportJobIntentService;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.internal.ui.webview.WebViewActivity;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \f2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/yandex/passport/internal/flags/experiments/FetchExperimentsService;", "Landroidx/core/app/PassportJobIntentService;", "<init>", "()V", "Landroid/content/Intent;", "intent", "Lcom/yandex/passport/common/core/Environment;", "getEnvironmentSafe", "(Landroid/content/Intent;)Lcom/yandex/passport/common/core/Environment;", "Lzy11;", "onHandleWork", "(Landroid/content/Intent;)V", "Companion", "com/yandex/passport/internal/flags/experiments/r", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class FetchExperimentsService extends PassportJobIntentService {
    public static final int $stable = 0;
    public static final r Companion = new r();

    private final Environment getEnvironmentSafe(Intent intent) {
        Environment environment;
        try {
            environment = (Environment) intent.getParcelableExtra(WebViewActivity.KEY_ENVIRONMENT);
        } catch (Throwable th) {
            com.yandex.passport.internal.di.a.a().getEventReporter().k(th);
            environment = null;
        }
        return environment == null ? Environment.PRODUCTION : environment;
    }

    @Override // androidx.core.app.JobIntentService
    public void onHandleWork(Intent intent) {
        com.yandex.passport.common.util.a.i(new FetchExperimentsService$onHandleWork$1(getEnvironmentSafe(intent), null));
    }
}
