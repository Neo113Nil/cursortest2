package com.yandex.passport.internal.ui.challenge.vpn;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.yandex.passport.common.logger.LogLevel;
import defpackage.b2x0;
import defpackage.ceu0;
import defpackage.eja1;
import defpackage.evu0;
import defpackage.mkn;
import defpackage.tje;
import defpackage.uw51;
import defpackage.v0d;
import defpackage.x40;
import defpackage.zy11;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 \u000b2\u00020\u0001:\u0002\f\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\n\u0010\u0003¨\u0006\u000e"}, d2 = {"Lcom/yandex/passport/internal/ui/challenge/vpn/VpnChallengeActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Lzy11;", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "onDestroy", "Companion", "com/yandex/passport/internal/ui/challenge/vpn/a", "a", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class VpnChallengeActivity extends AppCompatActivity {
    public static final int $stable = 0;
    public static final com.yandex.passport.internal.ui.challenge.vpn.a Companion = new com.yandex.passport.internal.ui.challenge.vpn.a();
    private static final String EXTRA_URL = "vpn.challenge.url";
    private static volatile boolean isOpened;

    /* loaded from: classes8.dex */
    public static final class a extends x40 {
        @Override // defpackage.x40
        public final Intent a(Context context, Object obj) {
            VpnChallengeActivity.Companion.getClass();
            return com.yandex.passport.internal.ui.challenge.vpn.a.a(context, (String) obj);
        }

        @Override // defpackage.x40
        public final /* bridge */ /* synthetic */ Object c(int i, Intent intent) {
            return zy11.a;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        int i = 6;
        int i2 = 1;
        mkn.a(this, new b2x0(-1, -1, 1, new ceu0(i)), new b2x0(-1, -1, 1, new ceu0(i)));
        super.onCreate(savedInstanceState);
        isOpened = true;
        String stringExtra = getIntent().getStringExtra(EXTRA_URL);
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            uw51.w("open with initialUrl ", stringExtra, LogLevel.DEBUG, null, 8);
        }
        if (stringExtra == null || evu0.J(stringExtra)) {
            finish();
        } else {
            v0d.a(this, new androidx.compose.runtime.internal.a(72917944, new b(stringExtra, this, i2), true));
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        isOpened = false;
        super.onDestroy();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        tje.N(eja1.s(this), null, null, new VpnChallengeActivity$onResume$1(2, null), 3);
    }
}
