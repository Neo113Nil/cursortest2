package com.vkontakte.android;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import androidx.appcompat.app.AlertController;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.common.links.LaunchContext;
import com.vk.dto.common.data.UserNotification;
import com.vk.pushes.PushOpenActivity;
import com.vkontakte.android.activities.LogoutReceiver;
import xsna.clq0;
import xsna.dhr0;
import xsna.h7u0;
import xsna.xwk;

/* loaded from: classes7.dex */
public class NotificationActivity extends Activity {
    public LogoutReceiver b = null;

    public class a implements DialogInterface.OnCancelListener {
        public final /* synthetic */ UserNotification b;

        public a(UserNotification userNotification) {
            this.b = userNotification;
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public final void onCancel(DialogInterface dialogInterface) {
            UserNotification userNotification = this.b;
            if (userNotification != null) {
                clq0.b(userNotification, false);
            }
            NotificationActivity.this.finish();
        }
    }

    public class b implements DialogInterface.OnClickListener {
        public final /* synthetic */ UserNotification b;

        public b(UserNotification userNotification) {
            this.b = userNotification;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            UserNotification userNotification = this.b;
            if (userNotification != null) {
                clq0.b(userNotification, false);
            }
            NotificationActivity.this.finish();
        }
    }

    public class c implements DialogInterface.OnClickListener {
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ UserNotification d;

        public c(String str, String str2, UserNotification userNotification) {
            this.b = str;
            this.c = str2;
            this.d = userNotification;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            boolean isEmpty = TextUtils.isEmpty(this.b);
            NotificationActivity notificationActivity = NotificationActivity.this;
            if (isEmpty) {
                notificationActivity.startActivity(new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(this.c)));
            } else {
                xwk.d().e().l(notificationActivity, this.b, new LaunchContext(true, false, false, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, false, false, null, null, null, 67108862), null, null);
            }
            UserNotification userNotification = this.d;
            if (userNotification != null) {
                clq0.a(notificationActivity, userNotification);
            }
            notificationActivity.finish();
        }
    }

    public class d implements DialogInterface.OnClickListener {
        public final /* synthetic */ UserNotification b;

        public d(UserNotification userNotification) {
            this.b = userNotification;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            NotificationActivity notificationActivity = NotificationActivity.this;
            UserNotification userNotification = this.b;
            if (userNotification != null) {
                clq0.a(notificationActivity, userNotification);
            }
            notificationActivity.finish();
        }
    }

    public static Intent a(PushOpenActivity pushOpenActivity, String str, String str2, String str3, String str4) {
        Intent intent = new Intent(pushOpenActivity, (Class<?>) NotificationActivity.class);
        intent.putExtra("title", str);
        intent.putExtra("message", str2);
        intent.putExtra("button", str3);
        intent.putExtra("url", str4);
        return intent;
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        String str;
        String str2;
        String str3;
        String str4;
        setTheme(dhr0.C().c);
        super.onCreate(bundle);
        this.b = LogoutReceiver.a(this);
        Intent intent = getIntent();
        UserNotification userNotification = (UserNotification) intent.getParcelableExtra("user_notification");
        String str5 = null;
        if (userNotification == null) {
            str = intent.hasExtra("title") ? intent.getStringExtra("title") : getResources().getString(R.string.notification);
            str2 = intent.getStringExtra("message");
            str3 = intent.hasExtra("link") ? intent.getStringExtra("link") : null;
            str4 = intent.hasExtra("button") ? intent.getStringExtra("button") : null;
            if (intent.hasExtra("url")) {
                str5 = intent.getStringExtra("url");
            }
        } else {
            str = userNotification.d;
            str2 = userNotification.e;
            str3 = userNotification.k;
            str4 = userNotification.h;
        }
        h7u0.a aVar = new h7u0.a(this);
        aVar.h0(str);
        Spanned fromHtml = Html.fromHtml(str2);
        AlertController.b bVar = aVar.a;
        bVar.f = fromHtml;
        bVar.n = new a(userNotification);
        if (TextUtils.isEmpty(str3) && TextUtils.isEmpty(str5)) {
            if (TextUtils.isEmpty(str4)) {
                str4 = getString(R.string.close);
            }
            aVar.j(str4, new d(userNotification));
        } else {
            if (TextUtils.isEmpty(str4)) {
                str4 = getString(R.string.view);
            }
            aVar.j(str4, new c(str5, str3, userNotification));
            aVar.setNegativeButton(R.string.close, new b(userNotification));
        }
        aVar.m();
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        this.b.b();
        super.onDestroy();
    }
}
