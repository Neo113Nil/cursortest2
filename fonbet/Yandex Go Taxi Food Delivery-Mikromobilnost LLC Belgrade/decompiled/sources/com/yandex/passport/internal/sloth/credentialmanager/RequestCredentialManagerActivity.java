package com.yandex.passport.internal.sloth.credentialmanager;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import defpackage.eja1;
import defpackage.tje;
import defpackage.tls;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000 \u00112\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bR0\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/yandex/passport/internal/sloth/credentialmanager/RequestCredentialManagerActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Lzy11;", "onCreate", "(Landroid/os/Bundle;)V", "Lkotlin/Function1;", "Lcom/yandex/passport/internal/sloth/credentialmanager/c;", "request", "Ltls;", "getRequest", "()Ltls;", "setRequest", "(Ltls;)V", "Companion", "com/yandex/passport/internal/sloth/credentialmanager/f", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class RequestCredentialManagerActivity extends AppCompatActivity {
    public static final int $stable = 8;
    public static final f Companion = new f();
    private tls request;

    public final tls getRequest() {
        return this.request;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        d credentialManagerInterface = com.yandex.passport.internal.di.a.a().getCredentialManagerInterface();
        credentialManagerInterface.d(this);
        tje.N(eja1.s(this), null, null, new RequestCredentialManagerActivity$onCreate$1(credentialManagerInterface, this, null), 3);
    }

    public final void setRequest(tls tlsVar) {
        this.request = tlsVar;
    }
}
