package com.yandex.passport.internal.ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.yandex.passport.R;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.internal.a0;
import com.yandex.passport.internal.analytics.t;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.ui.domik.DomikActivity;
import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
import defpackage.evu0;
import defpackage.jl40;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import kotlin.Pair;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/yandex/passport/internal/ui/YxAuthActivity;", "Lcom/yandex/passport/internal/ui/BaseActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Lzy11;", "onCreate", "(Landroid/os/Bundle;)V", "Companion", "com/yandex/passport/internal/ui/q", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class YxAuthActivity extends BaseActivity {
    public static final int $stable = 0;
    public static final q Companion = new q();
    public static final String DEVICE_ID_ERROR_MESSAGE = "DeviceId came from another device, applink ignored";
    public static final String EMPTY_URI_ERROR_MESSAGE = "Uri is empty";

    @Override // com.yandex.passport.internal.ui.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        Uri data = intent != null ? intent.getData() : null;
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "uri: " + data, 8);
        }
        PassportProcessGlobalComponent a = com.yandex.passport.internal.di.a.a();
        t analyticsTrackerWrapper = a.getAnalyticsTrackerWrapper();
        Pair pair = new Pair(LaunchBrowserActivity.KEY_URI, String.valueOf(data));
        com.yandex.passport.internal.analytics.c cVar2 = com.yandex.passport.internal.analytics.c.b;
        analyticsTrackerWrapper.a(a0.I(), kotlin.collections.b.l(pair));
        if (data == null) {
            analyticsTrackerWrapper.a(a0.x(), kotlin.collections.b.l(pair, new Pair(Constants.KEY_MESSAGE, EMPTY_URI_ERROR_MESSAGE)));
            finish();
            return;
        }
        String g = com.yandex.passport.internal.ui.sloth.e.g(data);
        String d = a.getAnalyticsHelper().d();
        if (d == null) {
            d = null;
        }
        if (g == null || evu0.J(g) || jl40.l(d, g)) {
            Intent intent2 = new Intent(this, (Class<?>) DomikActivity.class);
            intent2.addFlags(SelfTester_JCP.DECRYPT_CBC);
            Intent intent3 = getIntent();
            intent2.setData(intent3 != null ? intent3.getData() : null);
            analyticsTrackerWrapper.a(a0.A(), kotlin.collections.b.l(pair));
            startActivity(intent2);
            return;
        }
        analyticsTrackerWrapper.a(a0.x(), kotlin.collections.b.l(pair, new Pair(Constants.KEY_MESSAGE, DEVICE_ID_ERROR_MESSAGE)));
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, DEVICE_ID_ERROR_MESSAGE, 8);
        }
        m mVar = new m(this);
        mVar.f(R.string.passport_error_magiclink_wrong_device);
        mVar.b();
        mVar.c();
        mVar.e(R.string.passport_required_web_error_ok_button, new d(1, this));
        mVar.a().show();
    }
}
