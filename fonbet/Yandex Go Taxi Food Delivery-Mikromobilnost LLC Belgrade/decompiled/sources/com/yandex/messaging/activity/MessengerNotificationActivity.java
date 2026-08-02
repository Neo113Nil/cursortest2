package com.yandex.messaging.activity;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import defpackage.enp0;
import defpackage.i3y;
import defpackage.k200;
import defpackage.m020;
import defpackage.p8g;
import defpackage.v320;
import defpackage.z8g;
import defpackage.zy11;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u001b\u0010\u000e\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/yandex/messaging/activity/MessengerNotificationActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Lzy11;", "onCreate", "(Landroid/os/Bundle;)V", "Lenp0;", "sdkComponent$delegate", "Li3y;", "getSdkComponent", "()Lenp0;", "sdkComponent", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MessengerNotificationActivity extends AppCompatActivity {
    public static final int $stable = 8;

    /* renamed from: sdkComponent$delegate, reason: from kotlin metadata */
    private final i3y sdkComponent = kotlin.a.a(new m020(2, this));

    private final enp0 getSdkComponent() {
        return (enp0) this.sdkComponent.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onCreate$lambda$2$lambda$1(Intent intent, v320 v320Var) {
        ((p8g) v320Var).e().b(intent);
        return zy11.a;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        Intent intent = getIntent();
        if (intent != null) {
            ((z8g) getSdkComponent()).b().a(new k200(25, intent));
        }
        finish();
        super.onCreate(savedInstanceState);
    }
}
