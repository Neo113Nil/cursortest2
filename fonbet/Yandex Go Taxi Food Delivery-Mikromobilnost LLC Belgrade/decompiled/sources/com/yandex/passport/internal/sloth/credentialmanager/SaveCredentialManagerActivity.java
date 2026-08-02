package com.yandex.passport.internal.sloth.credentialmanager;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import defpackage.eja1;
import defpackage.tje;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \t2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/yandex/passport/internal/sloth/credentialmanager/SaveCredentialManagerActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Lzy11;", "onCreate", "(Landroid/os/Bundle;)V", "Companion", "com/yandex/passport/internal/sloth/credentialmanager/g", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SaveCredentialManagerActivity extends AppCompatActivity {
    public static final int $stable = 0;
    public static final g Companion = new g();

    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004f  */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onCreate(Bundle savedInstanceState) {
        Object obj;
        Bundle extras;
        super.onCreate(savedInstanceState);
        d credentialManagerInterface = com.yandex.passport.internal.di.a.a().getCredentialManagerInterface();
        credentialManagerInterface.d(this);
        Intent intent = getIntent();
        if (intent != null && (extras = intent.getExtras()) != null) {
            String string = extras.getString("username_key");
            String string2 = extras.getString("password_key");
            String string3 = extras.getString("response_key");
            boolean z = extras.getBoolean("is_from_dialog_key");
            if (string3 != null) {
                obj = new b(string3, z);
            } else if (string != null && string2 != null) {
                obj = new a(string, string2, z);
            }
            tje.N(eja1.s(this), null, null, new SaveCredentialManagerActivity$onCreate$1(!(obj instanceof a) ? (a) obj : null, this, credentialManagerInterface, null), 3);
        }
        obj = null;
        tje.N(eja1.s(this), null, null, new SaveCredentialManagerActivity$onCreate$1(!(obj instanceof a) ? (a) obj : null, this, credentialManagerInterface, null), 3);
    }
}
