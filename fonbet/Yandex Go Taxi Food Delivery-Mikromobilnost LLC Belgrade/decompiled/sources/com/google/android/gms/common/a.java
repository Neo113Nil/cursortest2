package com.google.android.gms.common;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.util.TypedValue;
import androidx.core.app.t;
import androidx.core.app.v;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.zabx;
import com.google.android.gms.common.internal.zag;
import defpackage.cvw;
import defpackage.d091;
import defpackage.dey;
import defpackage.fwt;
import defpackage.gxh0;
import defpackage.ny81;
import defpackage.qy81;
import defpackage.s4h0;
import defpackage.s8o;

/* loaded from: classes.dex */
public class a extends b {
    public static final Object c = new Object();
    public static final a d = new a();

    public static AlertDialog f(Activity activity, int i, zag zagVar, DialogInterface.OnCancelListener onCancelListener) {
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(activity, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(activity);
        }
        builder.setMessage(qy81.c(i, activity));
        builder.setOnCancelListener(onCancelListener);
        String b = qy81.b(i, activity);
        if (b != null) {
            if (zagVar == null) {
                zagVar = null;
            }
            builder.setPositiveButton(b, zagVar);
        }
        String f = qy81.f(i, activity);
        if (f != null) {
            builder.setTitle(f);
        }
        new IllegalArgumentException();
        return builder.create();
    }

    public static zabx g(Context context, ny81 ny81Var) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        zabx zabxVar = new zabx(ny81Var);
        d091.J(context, zabxVar, intentFilter);
        zabxVar.zaa(context);
        if (fwt.c(context)) {
            return zabxVar;
        }
        ny81Var.a();
        zabxVar.zab();
        return null;
    }

    public static void h(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof FragmentActivity) {
                SupportErrorDialogFragment.newInstance(alertDialog, onCancelListener).show(((FragmentActivity) activity).getSupportFragmentManager(), str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        ErrorDialogFragment.newInstance(alertDialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    public final void e(GoogleApiActivity googleApiActivity, int i, GoogleApiActivity googleApiActivity2) {
        AlertDialog f = f(googleApiActivity, i, zag.zab(googleApiActivity, super.b(googleApiActivity, i, "d"), 2), googleApiActivity2);
        if (f == null) {
            return;
        }
        h(googleApiActivity, f, "GooglePlayServicesErrorDialog", googleApiActivity2);
    }

    public final void i(Context context, int i, PendingIntent pendingIntent) {
        int i2;
        new IllegalArgumentException();
        if (i == 18) {
            new zad(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            return;
        }
        String e = qy81.e(i, context);
        String d2 = qy81.d(i, context);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        cvw.l(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        v vVar = new v(context, null);
        vVar.u = true;
        vVar.h(16, true);
        vVar.e = v.d(e);
        t.b bVar = new t.b();
        bVar.e(d2);
        vVar.l(bVar);
        if (s8o.F(context)) {
            vVar.K.icon = context.getApplicationInfo().icon;
            vVar.m = 2;
            if (s8o.G(context)) {
                vVar.a(s4h0.common_full_open_on_phone, resources.getString(gxh0.common_open_on_phone), pendingIntent);
            } else {
                vVar.h = pendingIntent;
            }
        } else {
            vVar.K.icon = R.drawable.stat_sys_warning;
            vVar.m(resources.getString(gxh0.common_google_play_services_notification_ticker));
            vVar.K.when = System.currentTimeMillis();
            vVar.h = pendingIntent;
            vVar.e(d2);
        }
        synchronized (c) {
        }
        NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
        String string = context.getResources().getString(gxh0.common_google_play_services_notification_channel_name);
        if (notificationChannel == null) {
            notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", string, 4));
        } else if (!string.contentEquals(notificationChannel.getName())) {
            notificationChannel.setName(string);
            notificationManager.createNotificationChannel(notificationChannel);
        }
        vVar.F = "com.google.android.gms.availability";
        Notification b = vVar.b();
        if (i == 1 || i == 2 || i == 3) {
            fwt.a.set(false);
            i2 = 10436;
        } else {
            i2 = 39789;
        }
        notificationManager.notify(i2, b);
    }

    public final void j(Activity activity, dey deyVar, int i, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog f = f(activity, i, zag.zad(deyVar, super.b(activity, i, "d"), 2), onCancelListener);
        if (f == null) {
            return;
        }
        h(activity, f, "GooglePlayServicesErrorDialog", onCancelListener);
    }
}
