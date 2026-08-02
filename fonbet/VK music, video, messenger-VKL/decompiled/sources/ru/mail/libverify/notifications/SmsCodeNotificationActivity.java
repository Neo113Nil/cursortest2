package ru.mail.libverify.notifications;

import android.app.ActivityManager;
import android.app.AlertDialog;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.util.Linkify;
import android.util.TypedValue;
import android.view.Menu;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.graphics.drawable.IconCompat;
import java.util.Collections;
import kotlin.Lazy;
import kotlin.jvm.internal.Lambda;
import ru.mail.libverify.R;
import ru.mail.libverify.api.j;
import ru.mail.libverify.i.b;
import ru.mail.libverify.i.e;
import ru.mail.libverify.notifications.SmsCodeNotificationActivity;
import ru.mail.libverify.notifications.a;
import ru.mail.verify.core.utils.FileLog;
import xsna.bhj0;
import xsna.bpn0;
import xsna.d8p;
import xsna.dbg0;
import xsna.epx;
import xsna.eu;
import xsna.exa;
import xsna.gzs;
import xsna.hrz;
import xsna.i4a0;
import xsna.v1v;
import xsna.zgj0;

/* loaded from: classes9.dex */
public final class SmsCodeNotificationActivity extends AppCompatActivity implements b {
    private String a;
    private String b;
    private AlertDialog c;
    private boolean d;
    private final Lazy e = new bpn0(new a());

    public static final class a extends Lambda implements gzs<Drawable> {
        public a() {
            super(0);
        }

        @Override // xsna.gzs
        public final Drawable invoke() {
            Integer num;
            Resources resources = SmsCodeNotificationActivity.this.getResources();
            int i = R.drawable.libverify_ic_sms_white;
            Resources.Theme theme = SmsCodeNotificationActivity.this.getTheme();
            ThreadLocal<TypedValue> threadLocal = dbg0.a;
            Drawable drawable = resources.getDrawable(i, theme);
            try {
                num = Integer.valueOf(SmsCodeNotificationActivity.this.getResources().getColor(R.color.libverify_secondary_icon_color, SmsCodeNotificationActivity.this.getTheme()));
            } catch (Resources.NotFoundException unused) {
                num = null;
            }
            if (drawable == null || num == null) {
                throw new IllegalStateException("Check failed.");
            }
            drawable.setTint(num.intValue());
            return drawable;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(SmsCodeNotificationActivity smsCodeNotificationActivity, DialogInterface dialogInterface, int i) {
        try {
            String str = smsCodeNotificationActivity.a;
            if (str == null) {
                str = null;
            }
            e.c(smsCodeNotificationActivity, str).send();
        } catch (PendingIntent.CanceledException e) {
            FileLog.e("SmsCodeActivity", "failed to open settings", e);
        }
        smsCodeNotificationActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(SmsCodeNotificationActivity smsCodeNotificationActivity, DialogInterface dialogInterface, int i) {
        try {
            String str = smsCodeNotificationActivity.a;
            if (str == null) {
                str = null;
            }
            e.b(smsCodeNotificationActivity, str).send();
        } catch (PendingIntent.CanceledException e) {
            FileLog.e("SmsCodeActivity", "failed to confirm notification", e);
        }
        smsCodeNotificationActivity.finish();
    }

    @Override // ru.mail.libverify.i.b
    public final void a(j.b bVar) {
        boolean z;
        AlertDialog alertDialog;
        if (bVar == null) {
            String str = this.a;
            Notification a2 = a.C2210a.a(this, str != null ? str : null);
            if (a2 == null) {
                finish();
                return;
            }
            AlertDialog a3 = a(a2.extras.getString(NotificationCompat.EXTRA_TITLE), a2.tickerText.toString(), "", "", false);
            this.c = a3;
            a3.show();
            Linkify.addLinks((TextView) this.c.findViewById(android.R.id.message), 3);
            return;
        }
        String str2 = bVar.f;
        String str3 = this.a;
        if (str3 == null) {
            str3 = null;
        }
        if (!epx.f(str2, str3)) {
            StringBuilder sb = new StringBuilder("no such notification with id ");
            String str4 = this.a;
            sb.append(str4 != null ? str4 : null);
            FileLog.e("SmsCodeActivity", sb.toString());
            finish();
            return;
        }
        if (this.d) {
            StringBuilder sb2 = new StringBuilder("activity with id ");
            String str5 = this.a;
            sb2.append(str5 != null ? str5 : null);
            sb2.append(" has been already deactivated");
            FileLog.d("SmsCodeActivity", sb2.toString());
            return;
        }
        String str6 = bVar.b;
        this.b = str6;
        this.c = a(str6, bVar.a, bVar.c, bVar.g, bVar.d.booleanValue());
        try {
            if (!isFinishing() && (alertDialog = this.c) != null) {
                alertDialog.show();
            }
        } catch (WindowManager.BadTokenException e) {
            e.printStackTrace();
        }
        if (bVar.j) {
            String str7 = bVar.h;
            String string = (str7 == null || str7.length() == 0) ? getResources().getString(R.string.notification_history_shortcut_name) : bVar.h;
            if (ru.mail.libverify.n0.e.b(this, "com.android.launcher.permission.INSTALL_SHORTCUT") && ru.mail.libverify.n0.e.b(this, "com.android.launcher.permission.UNINSTALL_SHORTCUT")) {
                Intent intent = new Intent(getApplicationContext(), (Class<?>) SettingsActivity.class);
                intent.setAction("ACTION_SHOW_DIALOGS");
                intent.addFlags(268435456);
                intent.addFlags(67108864);
                bhj0.i(this, Collections.singletonList(string));
                zgj0 zgj0Var = new zgj0();
                zgj0Var.a = this;
                zgj0Var.b = string;
                zgj0Var.e = string;
                zgj0Var.h = IconCompat.d(R.drawable.libverify_ic_sms_white, this);
                zgj0Var.c = new Intent[]{intent};
                if (TextUtils.isEmpty(zgj0Var.e)) {
                    throw new IllegalArgumentException("Shortcut must have a non-empty label");
                }
                Intent[] intentArr = zgj0Var.c;
                if (intentArr == null || intentArr.length == 0) {
                    throw new IllegalArgumentException("Shortcut must have an intent");
                }
                bhj0.g(this, zgj0Var);
                z = true;
            } else {
                z = false;
            }
            ru.mail.libverify.d0.a.a(this, ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.UI_NOTIFICATION_HISTORY_SHORTCUT_CREATED, Boolean.valueOf(z)));
        }
        AlertDialog alertDialog2 = this.c;
        if (alertDialog2 != null) {
            Linkify.addLinks((TextView) alertDialog2.findViewById(android.R.id.message), 3);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_sms_code_notification);
        if (getIntent() == null) {
            finish();
            return;
        }
        FileLog.v("SmsCodeActivity", "create with %s", ru.mail.libverify.n0.e.a(getIntent().getExtras()));
        String stringExtra = getIntent().getStringExtra("notification_id");
        if (stringExtra == null) {
            finish();
            return;
        }
        this.a = stringExtra;
        ru.mail.libverify.d0.a.a(this, ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.UI_NOTIFICATION_OPENED, stringExtra));
        ru.mail.libverify.p0.a aVar = ru.mail.libverify.p0.a.UI_NOTIFICATION_GET_INFO;
        String str = this.a;
        if (str == null) {
            str = null;
        }
        ru.mail.libverify.d0.a.a(this, ru.mail.libverify.p0.e.a(aVar, str, new ru.mail.libverify.i.a(this)));
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        ActivityManager.TaskDescription taskDescription;
        ActivityManager.TaskDescription.Builder label;
        ActivityManager.TaskDescription.Builder icon;
        ActivityManager.TaskDescription.Builder primaryColor;
        String str = this.b;
        if (str != null) {
            int i = R.drawable.libverify_ic_sms_white;
            setTitle(str);
            TypedValue typedValue = new TypedValue();
            getTheme().resolveAttribute(com.vkontakte.android.R.attr.colorPrimary, typedValue, true);
            int i2 = typedValue.data;
            eu supportActionBar = getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.l(new ColorDrawable(i2));
            }
            int i3 = Build.VERSION.SDK_INT;
            if (i3 < 35) {
                getWindow().addFlags(Integer.MIN_VALUE);
                getWindow().setStatusBarColor(i2);
            }
            Bitmap decodeResource = BitmapFactory.decodeResource(getResources(), i);
            if (i3 >= 33) {
                label = d8p.a().setLabel(str);
                icon = label.setIcon(i);
                primaryColor = icon.setPrimaryColor(i2);
                taskDescription = primaryColor.build();
            } else {
                taskDescription = new ActivityManager.TaskDescription(str, decodeResource, i2);
            }
            setTaskDescription(taskDescription);
            decodeResource.recycle();
        }
        super.onPause();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
        super.onStop();
        this.d = true;
        AlertDialog alertDialog = this.c;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    private final AlertDialog a(String str, String str2, String str3, String str4, boolean z) {
        FileLog.v("SmsCodeActivity", "build dialog for notification " + str);
        if (str4 != null && str4.length() != 0) {
            str2 = v1v.a('\n', str2, str4);
        }
        if (str3 == null || str3.length() == 0) {
            str3 = getString(R.string.notification_event_confirm);
        }
        AlertDialog.Builder neutralButton = new AlertDialog.Builder(this).setTitle(str).setIcon((Drawable) this.e.getValue()).setMessage(str2).setNegativeButton(getString(R.string.notification_event_close), new exa(this, 3)).setNeutralButton(getString(R.string.notification_settings), new i4a0(this, 2));
        if (z) {
            neutralButton.setPositiveButton(str3, new hrz(this, 3));
        }
        AlertDialog create = neutralButton.create();
        create.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: xsna.p6k0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                SmsCodeNotificationActivity.a(SmsCodeNotificationActivity.this, dialogInterface);
            }
        });
        return create;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(SmsCodeNotificationActivity smsCodeNotificationActivity, DialogInterface dialogInterface, int i) {
        try {
            String str = smsCodeNotificationActivity.a;
            if (str == null) {
                str = null;
            }
            e.a(smsCodeNotificationActivity, str).send();
        } catch (PendingIntent.CanceledException e) {
            FileLog.e("SmsCodeActivity", "failed to confirm notification", e);
        }
        smsCodeNotificationActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(SmsCodeNotificationActivity smsCodeNotificationActivity, DialogInterface dialogInterface) {
        smsCodeNotificationActivity.finish();
    }
}
