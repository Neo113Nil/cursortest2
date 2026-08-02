package com.vkontakte.android;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertController;
import com.vk.pushes.PushAwareActivity;
import xsna.cuz;
import xsna.dhr0;
import xsna.h7u0;
import xsna.rok;
import xsna.sok;
import xsna.tok;

/* loaded from: classes7.dex */
public class ConfirmationActivity extends PushAwareActivity implements rok {
    public static boolean x;
    public static boolean y;
    public final CloseBroadcastReciever v = new CloseBroadcastReciever();
    public final sok w = new sok(this);

    public class CloseBroadcastReciever extends BroadcastReceiver {
        public CloseBroadcastReciever() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            ConfirmationActivity.this.finish();
        }
    }

    public class a implements DialogInterface.OnCancelListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public final void onCancel(DialogInterface dialogInterface) {
            ConfirmationActivity.x = false;
            ConfirmationActivity.y = true;
            ConfirmationActivity.this.finish();
        }
    }

    public class b implements DialogInterface.OnClickListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            ConfirmationActivity.x = false;
            ConfirmationActivity.y = true;
            ConfirmationActivity.this.finish();
        }
    }

    public class c implements DialogInterface.OnClickListener {
        public c() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            ConfirmationActivity.x = true;
            ConfirmationActivity.y = true;
            ConfirmationActivity.this.finish();
        }
    }

    @Override // xsna.rok
    @Nullable
    public final tok R() {
        return this.w;
    }

    @Override // com.vkontakte.android.VKActivity, com.vk.core.ui.themes.ThemableActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        setTheme(dhr0.L() ? R.style.TranslucentStyle : R.style.TranslucentStyleDark);
        super.onCreate(bundle);
        int i = h7u0.p;
        h7u0.a c2 = h7u0.b.c(this);
        AlertController.b bVar = c2.a;
        c2.g0(R.string.confirm);
        bVar.f = getIntent().getStringExtra("confirm_text");
        c2.c0(R.string.reg_continue, new c());
        c2.W(R.string.cancel, new b());
        bVar.n = new a();
        c2.m();
    }

    @Override // com.vkontakte.android.VKActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        cuz.a(this).d(this.v);
    }

    @Override // com.vk.pushes.PushAwareActivity, com.vkontakte.android.VKActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
        super.onStart();
        cuz.a(this).b(this.v, new IntentFilter("CLOSE_CONFIRMATION_ACTION"));
    }
}
