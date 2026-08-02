package com.yandex.passport.internal.ui.browser;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.yandex.passport.internal.analytics.e0;
import com.yandex.passport.internal.analytics.r;
import com.yandex.passport.internal.di.a;
import kotlin.Pair;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;

/* loaded from: classes15.dex */
public class SocialBrowserDataActivity extends Activity {
    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        SocialBrowserActivity.clearFinishRunnable();
        super.onCreate(bundle);
        e0 socialBrowserReporter = a.a().getSocialBrowserReporter();
        Intent intent = getIntent();
        socialBrowserReporter.getClass();
        socialBrowserReporter.a(r.f, new Pair("flags", String.valueOf(intent.getFlags())), new Pair("task_id", String.valueOf(getTaskId())));
        Intent intent2 = new Intent(this, (Class<?>) SocialBrowserActivity.class);
        intent2.putExtra(SocialBrowserActivity.SOCIAL_KEY_URI, getIntent().getData());
        intent2.addFlags(SelfTester_JCP.DECRYPT_CBC);
        startActivity(intent2);
        finish();
    }
}
