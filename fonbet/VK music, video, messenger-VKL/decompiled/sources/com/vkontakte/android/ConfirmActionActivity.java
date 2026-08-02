package com.vkontakte.android;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import androidx.appcompat.app.AlertController;
import com.vk.pushes.PushAwareActivity;
import com.vk.pushes.PushOpenActivity;
import xsna.dhr0;
import xsna.h7u0;
import xsna.rsg0;
import xsna.s2j;
import xsna.t2j;
import xsna.zs;

/* loaded from: classes7.dex */
public class ConfirmActionActivity extends PushAwareActivity {

    public class a implements DialogInterface.OnCancelListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public final void onCancel(DialogInterface dialogInterface) {
            ConfirmActionActivity.this.finish();
        }
    }

    public class b implements DialogInterface.OnClickListener {
        public final /* synthetic */ String b;

        public b(String str) {
            this.b = str;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            String str = this.b;
            ConfirmActionActivity confirmActionActivity = ConfirmActionActivity.this;
            ConfirmActionActivity.T1(confirmActionActivity, str, false);
            confirmActionActivity.finish();
        }
    }

    public class c implements DialogInterface.OnClickListener {
        public final /* synthetic */ String b;

        public c(String str) {
            this.b = str;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            String str = this.b;
            ConfirmActionActivity confirmActionActivity = ConfirmActionActivity.this;
            ConfirmActionActivity.T1(confirmActionActivity, str, true);
            confirmActionActivity.finish();
        }
    }

    public static void T1(ConfirmActionActivity confirmActionActivity, String str, boolean z) {
        zs zsVar = new zs(str, z);
        zsVar.k = true;
        rsg0.y0(zsVar, null, null, 3).subscribe(new s2j(), new t2j());
    }

    public static void U1(PushOpenActivity pushOpenActivity, String str, String str2) {
        Intent intent = new Intent(pushOpenActivity, (Class<?>) ConfirmActionActivity.class);
        intent.putExtra("hash", str);
        intent.putExtra("confirm_text", str2);
        pushOpenActivity.startActivity(intent);
    }

    @Override // com.vkontakte.android.VKActivity, com.vk.core.ui.themes.ThemableActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("confirm_text");
        String stringExtra2 = intent.getStringExtra("hash");
        h7u0.a aVar = new h7u0.a(new ContextThemeWrapper(this, dhr0.C().c));
        aVar.g0(R.string.confirm_action_title);
        AlertController.b bVar = aVar.a;
        bVar.f = stringExtra;
        aVar.c0(R.string.signup_confirm, new c(stringExtra2));
        aVar.W(R.string.cancel, new b(stringExtra2));
        bVar.n = new a();
        aVar.m();
    }
}
