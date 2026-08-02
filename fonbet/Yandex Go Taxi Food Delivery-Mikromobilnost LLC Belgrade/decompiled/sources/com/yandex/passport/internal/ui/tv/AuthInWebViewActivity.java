package com.yandex.passport.internal.ui.tv;

import android.R;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.yandex.passport.internal.properties.AuthByQrProperties;
import com.yandex.passport.internal.ui.BaseActivity;
import com.yandex.passport.internal.ui.util.o;
import defpackage.g8e;
import defpackage.ny61;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/yandex/passport/internal/ui/tv/AuthInWebViewActivity;", "Lcom/yandex/passport/internal/ui/BaseActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Lzy11;", "onCreate", "(Landroid/os/Bundle;)V", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AuthInWebViewActivity extends BaseActivity {
    public static final int $stable = 0;

    @Override // com.yandex.passport.internal.ui.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        String str;
        com.yandex.passport.internal.properties.c cVar = AuthByQrProperties.Companion;
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            ny61.r("Required value was null.");
            return;
        }
        cVar.getClass();
        AuthByQrProperties a = com.yandex.passport.internal.properties.c.a(extras);
        setTheme(o.f(a.getTheme(), this));
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            androidx.fragment.app.a h = g8e.h(supportFragmentManager, supportFragmentManager);
            AuthInWebViewFragment.Companion.getClass();
            AuthInWebViewFragment authInWebViewFragment = new AuthInWebViewFragment();
            authInWebViewFragment.setArguments(a.toBundle());
            str = AuthInWebViewFragment.FRAGMENT_TAG;
            h.h(R.id.content, authInWebViewFragment, str);
            h.l(true, true);
        }
    }
}
