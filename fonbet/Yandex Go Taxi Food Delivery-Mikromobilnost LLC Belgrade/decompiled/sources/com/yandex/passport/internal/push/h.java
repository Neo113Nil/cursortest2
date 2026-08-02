package com.yandex.passport.internal.push;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import androidx.core.app.t;
import androidx.core.app.w0;
import androidx.core.app.x0;
import androidx.core.graphics.drawable.IconCompat;
import com.yandex.passport.R;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.data.network.d8;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.report.aa;
import com.yandex.passport.internal.report.ea;
import com.yandex.passport.internal.report.ld;
import com.yandex.passport.internal.report.md;
import com.yandex.passport.internal.report.n9;
import com.yandex.passport.internal.report.q9;
import com.yandex.passport.internal.report.r9;
import com.yandex.passport.internal.report.reporters.u0;
import com.yandex.passport.internal.report.uc;
import com.yandex.passport.internal.report.yd;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import com.yandex.passport.internal.ui.sloth.webcard.WebCardSlothActivity;
import defpackage.bvf0;
import defpackage.jl40;
import defpackage.lxj;
import defpackage.m0s0;
import defpackage.ny61;
import defpackage.qgn0;
import defpackage.qv10;
import defpackage.tje;
import defpackage.w511;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;

/* loaded from: classes8.dex */
public final class h {
    public final Context a;
    public final com.yandex.passport.internal.core.accounts.d b;
    public final com.yandex.passport.internal.report.reporters.s0 c;
    public final u0 d;
    public final com.yandex.passport.common.analytics.d e;
    public final com.yandex.passport.common.common.a f;
    public final i0 g;
    public final d8 h;
    public final a0 i;
    public final com.yandex.passport.common.coroutine.a j;
    public final com.yandex.passport.internal.flags.j k;
    public final com.yandex.passport.internal.network.mappers.b l;
    public final d0 m;
    public final e0 n;
    public final c0 o;
    public final i p;
    public final com.yandex.passport.internal.usecase.y q;
    public final com.yandex.passport.internal.report.reporters.r0 r;
    public final androidx.core.app.s0 s;
    public final Map t;

    public h(Context context, com.yandex.passport.internal.core.accounts.d dVar, com.yandex.passport.internal.report.reporters.s0 s0Var, u0 u0Var, com.yandex.passport.common.analytics.d dVar2, com.yandex.passport.common.common.a aVar, i0 i0Var, d8 d8Var, a0 a0Var, com.yandex.passport.common.coroutine.a aVar2, com.yandex.passport.internal.flags.j jVar, com.yandex.passport.internal.network.mappers.b bVar, d0 d0Var, e0 e0Var, c0 c0Var, i iVar, com.yandex.passport.internal.usecase.y yVar, com.yandex.passport.internal.report.reporters.r0 r0Var) {
        this.a = context;
        this.b = dVar;
        this.c = s0Var;
        this.d = u0Var;
        this.e = dVar2;
        this.f = aVar;
        this.g = i0Var;
        this.h = d8Var;
        this.i = a0Var;
        this.j = aVar2;
        this.k = jVar;
        this.l = bVar;
        this.m = d0Var;
        this.n = e0Var;
        this.o = c0Var;
        this.p = iVar;
        this.q = yVar;
        this.r = r0Var;
        this.s = new androidx.core.app.s0(context);
        this.t = kotlin.collections.b.i(new Pair("sign_in_notification_channel_id", context.getString(R.string.passport_am_name_notification_channel_sign_in)), new Pair("account_security_notification_channel_id", context.getString(R.string.passport_am_name_notification_channel_account_security)), new Pair("com.yandex.passport", context.getString(R.string.passport_am_name_notification_channel_family)), new Pair("miscellaneous_notification_channel_id", context.getString(R.string.passport_am_name_notification_channel_miscellaneous)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00bc, code lost:
    
        if (r5.b == 0) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00da A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(h hVar, PushPayload pushPayload, ContinuationImpl continuationImpl) {
        NotificationHelper$handlePushForPayload$1 notificationHelper$handlePushForPayload$1;
        int i;
        lxj k;
        hVar.getClass();
        if (continuationImpl instanceof NotificationHelper$handlePushForPayload$1) {
            notificationHelper$handlePushForPayload$1 = (NotificationHelper$handlePushForPayload$1) continuationImpl;
            int i2 = notificationHelper$handlePushForPayload$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                notificationHelper$handlePushForPayload$1.label = i2 - Integer.MIN_VALUE;
                NotificationHelper$handlePushForPayload$1 notificationHelper$handlePushForPayload$12 = notificationHelper$handlePushForPayload$1;
                Object obj = notificationHelper$handlePushForPayload$12.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = notificationHelper$handlePushForPayload$12.label;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return null;
                    }
                    if (i == 2) {
                        kotlin.b.b(obj);
                        return null;
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                ModernAccount l = hVar.l(pushPayload.getUid(), com.yandex.passport.internal.properties.u.S(pushPayload));
                if (l != null) {
                    Boolean openInBrowser = pushPayload.getOpenInBrowser();
                    Boolean bool = Boolean.TRUE;
                    if (jl40.l(openInBrowser, bool)) {
                        notificationHelper$handlePushForPayload$12.label = 1;
                        if (hVar.k(l, pushPayload, notificationHelper$handlePushForPayload$12) == obj2) {
                            return obj2;
                        }
                    } else {
                        if (!jl40.l(pushPayload.getShowCodeInNotification(), bool) || pushPayload.getTrackId() == null) {
                            hVar.j(l, pushPayload, null);
                            return null;
                        }
                        if (((Boolean) hVar.k.b(com.yandex.passport.internal.flags.q.k0)).booleanValue()) {
                            if (!jl40.l(pushPayload.isSilent(), bool)) {
                                a0 a0Var = hVar.i;
                                androidx.core.app.s0 s0Var = a0Var.a;
                                androidx.core.app.s0 s0Var2 = a0Var.a;
                                if (!s0Var.b.areNotificationsEnabled() || ((k = com.yandex.passport.internal.util.p.k(s0Var2)) != null && k.b)) {
                                    return pushPayload;
                                }
                                NotificationChannel notificationChannel = s0Var2.b.getNotificationChannel("sign_in_notification_channel_id");
                                androidx.core.app.p pVar = notificationChannel != null ? new androidx.core.app.p(notificationChannel) : null;
                                if (pVar != null) {
                                }
                            }
                            return pushPayload;
                        }
                        String trackId = pushPayload.getTrackId();
                        notificationHelper$handlePushForPayload$12.label = 2;
                        Object n = bvf0.n(new NotificationHelper$handle2FaPush$2(hVar, l, trackId, pushPayload, null), notificationHelper$handlePushForPayload$12);
                        if (n != obj2) {
                            n = zy11.a;
                        }
                        if (n == obj2) {
                        }
                    }
                }
                return null;
            }
        }
        notificationHelper$handlePushForPayload$1 = new NotificationHelper$handlePushForPayload$1(hVar, continuationImpl);
        NotificationHelper$handlePushForPayload$1 notificationHelper$handlePushForPayload$122 = notificationHelper$handlePushForPayload$1;
        Object obj3 = notificationHelper$handlePushForPayload$122.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = notificationHelper$handlePushForPayload$122.label;
        if (i == 0) {
        }
    }

    public static final void b(h hVar, PushPayload pushPayload, ModernAccount modernAccount) {
        StatusBarNotification[] activeNotifications = hVar.s.b.getActiveNotifications();
        Iterable arrayList = activeNotifications == null ? new ArrayList() : Arrays.asList(activeNotifications);
        if (!(arrayList instanceof Collection) || !((Collection) arrayList).isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((StatusBarNotification) it.next()).getId() == ((int) (pushPayload.getTimestamp() / 1000))) {
                    return;
                }
            }
        }
        com.yandex.passport.internal.report.reporters.s0 s0Var = hVar.c;
        Uid uid = modernAccount.getUid();
        String g = hVar.g();
        if (g == null) {
            g = null;
        }
        if (g == null) {
            g = "";
        }
        String a = ((com.yandex.passport.internal.common.e) hVar.f).a();
        String pushId = pushPayload.getPushId();
        String trackId = pushPayload.getTrackId();
        String platform = pushPayload.getPlatform();
        s0Var.getClass();
        boolean z = false;
        s0Var.f(aa.w, new yd(uid), new com.yandex.passport.internal.report.a(g, 20, z), new com.yandex.passport.internal.report.a(a, 1, z), new md(pushId, 7), new yd(trackId, 12), new md(platform, 9));
        hVar.j(modernAccount, pushPayload, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(h hVar, PicturePayload picturePayload, ContinuationImpl continuationImpl) {
        NotificationHelper$showPicturePush$1 notificationHelper$showPicturePush$1;
        int i;
        ModernAccount l;
        Object w;
        androidx.core.app.v vVar;
        h hVar2 = hVar;
        PicturePayload picturePayload2 = picturePayload;
        hVar2.getClass();
        if (continuationImpl instanceof NotificationHelper$showPicturePush$1) {
            notificationHelper$showPicturePush$1 = (NotificationHelper$showPicturePush$1) continuationImpl;
            int i2 = notificationHelper$showPicturePush$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                notificationHelper$showPicturePush$1.label = i2 - Integer.MIN_VALUE;
                Object obj = notificationHelper$showPicturePush$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = notificationHelper$showPicturePush$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    l = hVar2.l(picturePayload2.getUid(), com.yandex.passport.internal.properties.u.R(picturePayload2));
                    if (l == null) {
                        return Boolean.FALSE;
                    }
                    NotificationHelper$showPicturePush$baseNotificationBuilder$1 notificationHelper$showPicturePush$baseNotificationBuilder$1 = new NotificationHelper$showPicturePush$baseNotificationBuilder$1(hVar2, picturePayload2, l, null);
                    notificationHelper$showPicturePush$1.L$0 = hVar2;
                    notificationHelper$showPicturePush$1.L$1 = picturePayload2;
                    notificationHelper$showPicturePush$1.L$2 = l;
                    notificationHelper$showPicturePush$1.label = 1;
                    w = kotlinx.coroutines.a.w(com.yandex.passport.common.time.a.a(0, 2, 0), notificationHelper$showPicturePush$baseNotificationBuilder$1, notificationHelper$showPicturePush$1);
                    if (w == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ModernAccount modernAccount = (ModernAccount) notificationHelper$showPicturePush$1.L$2;
                    picturePayload2 = (PicturePayload) notificationHelper$showPicturePush$1.L$1;
                    h hVar3 = (h) notificationHelper$showPicturePush$1.L$0;
                    kotlin.b.b(obj);
                    l = modernAccount;
                    hVar2 = hVar3;
                    w = obj;
                }
                vVar = (androidx.core.app.v) w;
                if (vVar != null) {
                    return Boolean.FALSE;
                }
                String pushService = picturePayload2.getPushService();
                hVar2.getClass();
                String f = f(pushService);
                hVar2.e(f);
                vVar.F = f;
                com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "show push with id " + picturePayload2.getNotificationId(), 8);
                }
                hVar2.s.d(com.yandex.passport.internal.i.a, picturePayload2.getNotificationId(), vVar.b());
                com.yandex.passport.internal.report.reporters.s0 s0Var = hVar2.c;
                Uid uid = l.getUid();
                String platform = picturePayload2.getPlatform();
                String pushService2 = picturePayload2.getPushService();
                String eventName = picturePayload2.getEventName();
                String g = hVar2.g();
                if (g == null) {
                    g = "";
                }
                s0Var.j(uid, platform, pushService2, eventName, g, ((com.yandex.passport.internal.common.e) hVar2.f).a(), picturePayload2.getTitle(), picturePayload2.getPushId(), picturePayload2.getTrackId(), picturePayload2.getPlatform());
                return Boolean.TRUE;
            }
        }
        notificationHelper$showPicturePush$1 = new NotificationHelper$showPicturePush$1(hVar2, continuationImpl);
        Object obj2 = notificationHelper$showPicturePush$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = notificationHelper$showPicturePush$1.label;
        if (i != 0) {
        }
        vVar = (androidx.core.app.v) w;
        if (vVar != null) {
        }
    }

    public static String f(String str) {
        if (str == null) {
            return "miscellaneous_notification_channel_id";
        }
        switch (str.hashCode()) {
            case -1316330898:
                return !str.equals("account_modification") ? "miscellaneous_notification_channel_id" : "account_security_notification_channel_id";
            case -1281860764:
                return !str.equals("family") ? "miscellaneous_notification_channel_id" : "com.yandex.passport";
            case 51309:
                return !str.equals("2fa") ? "miscellaneous_notification_channel_id" : "sign_in_notification_channel_id";
            case 799074637:
                return !str.equals("family_pay") ? "miscellaneous_notification_channel_id" : "com.yandex.passport";
            case 927471105:
                return !str.equals("login_notification") ? "miscellaneous_notification_channel_id" : "account_security_notification_channel_id";
            case 1287505377:
                return !str.equals("suggest_by_phone") ? "miscellaneous_notification_channel_id" : "sign_in_notification_channel_id";
            default:
                return "miscellaneous_notification_channel_id";
        }
    }

    public final void d(int i) {
        try {
            this.s.a(i, com.yandex.passport.internal.i.a);
            com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "push with id " + i + " canceled", 8);
            }
        } catch (Throwable unused) {
        }
    }

    public final boolean e(String str) {
        int i;
        androidx.core.app.s0 s0Var = this.s;
        try {
            String str2 = (String) this.t.get(str);
            if (s0Var.b.getNotificationChannel(str) == null) {
                if (com.yandex.passport.internal.util.p.k(s0Var) == null) {
                    s0Var.b.createNotificationChannelGroup(new NotificationChannelGroup("passport_channel_group_id", this.a.getString(R.string.passport_am_name_notification_channel_group_yandex_id)));
                }
                if (!str.equals("com.yandex.passport") && !str.equals("miscellaneous_notification_channel_id")) {
                    i = 4;
                    NotificationChannel notificationChannel = new NotificationChannel(str, str2, i);
                    notificationChannel.setDescription(str2);
                    notificationChannel.enableLights(true);
                    notificationChannel.setLightColor(-65536);
                    notificationChannel.setGroup("passport_channel_group_id");
                    notificationChannel.setLockscreenVisibility(!str.equals("sign_in_notification_channel_id") ? 1 : 0);
                    s0Var.b(notificationChannel);
                }
                i = 3;
                NotificationChannel notificationChannel2 = new NotificationChannel(str, str2, i);
                notificationChannel2.setDescription(str2);
                notificationChannel2.enableLights(true);
                notificationChannel2.setLightColor(-65536);
                notificationChannel2.setGroup("passport_channel_group_id");
                notificationChannel2.setLockscreenVisibility(!str.equals("sign_in_notification_channel_id") ? 1 : 0);
                s0Var.b(notificationChannel2);
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public final String g() {
        Object i = com.yandex.passport.common.util.a.i(new NotificationHelper$getDeviceId$1(this, null));
        if (i instanceof Result.Failure) {
            i = null;
        }
        com.yandex.passport.common.value.a aVar = (com.yandex.passport.common.value.a) i;
        if (aVar != null) {
            return aVar.a;
        }
        return null;
    }

    public final Object h(Bundle bundle, ContinuationImpl continuationImpl) {
        return tje.k0(((com.yandex.passport.common.coroutine.b) this.j).c, new NotificationHelper$handleNotificationPush$2(this, bundle, null), continuationImpl);
    }

    public final Object i(Bundle bundle, SuspendLambda suspendLambda) {
        return tje.k0(((com.yandex.passport.common.coroutine.b) this.j).c, new NotificationHelper$handlePushForData$2(this, bundle, null), suspendLambda);
    }

    public final void j(ModernAccount modernAccount, PushPayload pushPayload, String str) {
        Pair pair;
        String str2;
        int i;
        com.yandex.passport.common.common.a aVar;
        String str3;
        int timestamp = (int) (pushPayload.getTimestamp() / 1000);
        Uri defaultUri = RingtoneManager.getDefaultUri(2);
        if (pushPayload.getBodyIncludeCode() == null || str == null) {
            pair = new Pair(pushPayload.getBody(), pushPayload.getBody());
        } else {
            try {
                pair = new Pair(String.format(pushPayload.getBodyIncludeCode(), Arrays.copyOf(new Object[]{str}, 1)), pushPayload.getBodyIncludeCode());
            } catch (Exception unused) {
                pair = new Pair(pushPayload.getBody(), pushPayload.getBody());
            }
        }
        String str4 = (String) pair.getFirst();
        String str5 = (String) pair.getSecond();
        Context context = this.a;
        androidx.core.app.v vVar = new androidx.core.app.v(context, context.getPackageName());
        n(vVar);
        vVar.e = androidx.core.app.v.d(pushPayload.getTitle());
        vVar.h(16, true);
        vVar.k(defaultUri);
        Uid uid = modernAccount.getUid();
        c0 c0Var = this.o;
        c0Var.getClass();
        vVar.h = c0Var.a(((int) (pushPayload.getTimestamp() / 1000)) * 2, c0Var.d(c0Var.e(uid, pushPayload.getWebviewUrl(), pushPayload.getPushType())));
        vVar.m = 1;
        PendingIntent c = this.o.c(this.a, timestamp, str5, modernAccount.getUid(), pushPayload.getPushId(), pushPayload.getTrackId(), pushPayload.getPlatform());
        Notification notification = vVar.K;
        notification.deleteIntent = c;
        notification.when = pushPayload.getTimestamp();
        vVar.h(8, true);
        m(vVar);
        if (jl40.l(pushPayload.getShowCodeInNotification(), Boolean.TRUE) && str != null) {
            vVar.a(R.drawable.passport_ic_copy, context.getString(R.string.passport_copy_to_clipboard_description), PendingIntent.getBroadcast(context, timestamp, new Intent(context, (Class<?>) NotificationCodeCopyReceiver.class).setAction(NotificationCodeCopyReceiver.COPY_CODE).putExtra(AuthSdkActivity.RESPONSE_TYPE_CODE, str), SelfTester_JCP.DECRYPT_CBC));
        }
        String f = f(pushPayload.getPushService());
        boolean e = e(f);
        androidx.core.app.s0 s0Var = this.s;
        com.yandex.passport.common.common.a aVar2 = this.f;
        if (e) {
            vVar.F = f;
            i = timestamp;
            aVar = aVar2;
            str3 = "";
        } else {
            Iterator it = this.t.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    str2 = null;
                    break;
                } else {
                    str2 = (String) it.next();
                    if (s0Var.b.getNotificationChannel(str2) != null) {
                        break;
                    }
                }
            }
            com.yandex.passport.internal.report.reporters.s0 s0Var2 = this.c;
            if (str2 != null) {
                Uid uid2 = modernAccount.getUid();
                String g = g();
                if (g == null) {
                    g = null;
                }
                String str6 = g == null ? "" : g;
                String a = ((com.yandex.passport.internal.common.e) aVar2).a();
                String pushId = pushPayload.getPushId();
                String trackId = pushPayload.getTrackId();
                s0Var2.getClass();
                aVar = aVar2;
                str3 = "";
                i = timestamp;
                boolean z = false;
                s0Var2.f(r9.w, new com.yandex.passport.internal.report.f("fallback_channel", str2), new yd(uid2), new com.yandex.passport.internal.report.a(str6, 20, z), new com.yandex.passport.internal.report.a(a, 1, z), new md(pushId, 7), new yd(trackId, 12));
                vVar.F = str2;
            } else {
                i = timestamp;
                aVar = aVar2;
                str3 = "";
                Uid uid3 = modernAccount.getUid();
                String g2 = g();
                String str7 = g2 == null ? null : g2;
                if (str7 == null) {
                    str7 = str3;
                }
                String a2 = ((com.yandex.passport.internal.common.e) aVar).a();
                String pushId2 = pushPayload.getPushId();
                String trackId2 = pushPayload.getTrackId();
                s0Var2.getClass();
                boolean z2 = false;
                s0Var2.f(q9.w, new yd(uid3), new com.yandex.passport.internal.report.a(str7, 20, z2), new com.yandex.passport.internal.report.a(a2, 1, z2), new md(pushId2, 7), new yd(trackId2, 12));
            }
        }
        vVar.f = androidx.core.app.v.d(pushPayload.getBody());
        t.b bVar = new t.b();
        bVar.e(pushPayload.getBody());
        vVar.l(bVar);
        Notification b = vVar.b();
        vVar.f = androidx.core.app.v.d(str4);
        t.b bVar2 = new t.b();
        bVar2.e(str4);
        vVar.l(bVar2);
        vVar.A = 0;
        vVar.B = b;
        com.yandex.passport.internal.flags.a aVar3 = com.yandex.passport.internal.flags.q.n0;
        com.yandex.passport.internal.flags.j jVar = this.k;
        if (((Boolean) jVar.b(aVar3)).booleanValue()) {
            w0 w0Var = new w0();
            w0Var.b(IconCompat.c(R.drawable.passport_big_id_notification, context));
            w0Var.c(pushPayload.getTitle());
            x0 a3 = w0Var.a();
            String pushId3 = pushPayload.getPushId();
            if (pushId3 == null) {
                pushId3 = str3;
            }
            String title = pushPayload.getTitle();
            if (title == null) {
                title = str3;
            }
            int i2 = R.drawable.passport_big_id_notification;
            Intent intent = new Intent(context, (Class<?>) WebCardSlothActivity.class);
            intent.setAction("WEB_CARD_SHORTCUT");
            qgn0 qgn0Var = new qgn0(context, pushId3);
            qgn0Var.s();
            qgn0Var.q(intent);
            qgn0Var.u(title);
            qgn0Var.t(a3);
            qgn0Var.p(IconCompat.c(i2, context));
            m0s0.c(context, qgn0Var.c());
            androidx.core.app.h0 h0Var = new androidx.core.app.h0(a3);
            h0Var.e(new androidx.core.app.g0(pushPayload.getBody(), System.currentTimeMillis(), a3));
            vVar.l(h0Var);
            String pushId4 = pushPayload.getPushId();
            if (pushId4 == null) {
                pushId4 = str3;
            }
            vVar.G = pushId4;
            notification.icon = R.drawable.passport_lock_notification;
            vVar.v = false;
            vVar.w = true;
            vVar.z = context.getColor(android.R.color.darker_gray);
        }
        s0Var.d(com.yandex.passport.internal.i.a, i, vVar.b());
        if (((Boolean) jVar.b(aVar3)).booleanValue()) {
            String pushId5 = pushPayload.getPushId();
            if (pushId5 == null) {
                pushId5 = str3;
            }
            m0s0.d(context, Collections.singletonList(pushId5));
        }
        Uid uid4 = modernAccount.getUid();
        String platform = pushPayload.getPlatform();
        String pushService = pushPayload.getPushService();
        String eventName = pushPayload.getEventName();
        String g3 = g();
        this.c.j(uid4, platform, pushService, eventName, g3 == null ? str3 : g3, ((com.yandex.passport.internal.common.e) aVar).a(), str5, pushPayload.getPushId(), pushPayload.getTrackId(), pushPayload.getPlatform());
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(ModernAccount modernAccount, PushPayload pushPayload, ContinuationImpl continuationImpl) {
        NotificationHelper$openInBrowser$1 notificationHelper$openInBrowser$1;
        int i;
        PushPayload pushPayload2;
        String webviewUrl;
        Throwable a;
        h hVar = this;
        ModernAccount modernAccount2 = modernAccount;
        if (continuationImpl instanceof NotificationHelper$openInBrowser$1) {
            notificationHelper$openInBrowser$1 = (NotificationHelper$openInBrowser$1) continuationImpl;
            int i2 = notificationHelper$openInBrowser$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                notificationHelper$openInBrowser$1.label = i2 - Integer.MIN_VALUE;
                Object obj = notificationHelper$openInBrowser$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = notificationHelper$openInBrowser$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (!jl40.l(pushPayload.getRequireWebAuthWithUid(), Boolean.TRUE)) {
                        pushPayload2 = pushPayload;
                        webviewUrl = pushPayload2.getWebviewUrl();
                        hVar.getClass();
                        int timestamp = (int) (pushPayload2.getTimestamp() / 1000);
                        Uri defaultUri = RingtoneManager.getDefaultUri(2);
                        Context context = hVar.a;
                        androidx.core.app.v vVar = new androidx.core.app.v(context, context.getPackageName());
                        hVar.n(vVar);
                        vVar.e = androidx.core.app.v.d(pushPayload2.getTitle());
                        vVar.f = androidx.core.app.v.d(pushPayload2.getBody());
                        t.b bVar = new t.b();
                        bVar.e(pushPayload2.getBody());
                        vVar.l(bVar);
                        vVar.h(16, true);
                        vVar.k(defaultUri);
                        c0 c0Var = hVar.o;
                        c0Var.getClass();
                        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(webviewUrl));
                        intent.addFlags(268437504);
                        vVar.h = PendingIntent.getActivity(c0Var.a, timestamp, intent, 1140850688);
                        vVar.m = 1;
                        PendingIntent c = hVar.o.c(hVar.a, timestamp, pushPayload2.getBody(), modernAccount2.getUid(), pushPayload2.getPushId(), pushPayload2.getTrackId(), pushPayload2.getPlatform());
                        Notification notification = vVar.K;
                        notification.deleteIntent = c;
                        notification.when = pushPayload2.getTimestamp();
                        vVar.h(8, true);
                        hVar.m(vVar);
                        vVar.A = 1;
                        String f = f(pushPayload2.getPushService());
                        hVar.e(f);
                        vVar.F = f;
                        hVar.s.d(com.yandex.passport.internal.i.a, timestamp, vVar.b());
                        com.yandex.passport.internal.report.reporters.r0 r0Var = hVar.r;
                        Uid uid = modernAccount2.getUid();
                        r0Var.getClass();
                        r0Var.g(n9.x, uid);
                        return zy11Var;
                    }
                    com.yandex.passport.internal.usecase.w wVar = new com.yandex.passport.internal.usecase.w(new com.yandex.passport.internal.usecase.u(modernAccount2), pushPayload.getWebviewUrl());
                    notificationHelper$openInBrowser$1.L$0 = hVar;
                    notificationHelper$openInBrowser$1.L$1 = modernAccount2;
                    pushPayload2 = pushPayload;
                    notificationHelper$openInBrowser$1.L$2 = pushPayload2;
                    notificationHelper$openInBrowser$1.label = 1;
                    obj = hVar.q.a(wVar, notificationHelper$openInBrowser$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    PushPayload pushPayload3 = (PushPayload) notificationHelper$openInBrowser$1.L$2;
                    modernAccount2 = (ModernAccount) notificationHelper$openInBrowser$1.L$1;
                    h hVar2 = (h) notificationHelper$openInBrowser$1.L$0;
                    kotlin.b.b(obj);
                    pushPayload2 = pushPayload3;
                    hVar = hVar2;
                }
                Object value = ((Result) obj).getValue();
                a = Result.a(value);
                if (a == null) {
                    com.yandex.passport.internal.report.reporters.r0 r0Var2 = hVar.r;
                    Uid uid2 = modernAccount2.getUid();
                    r0Var2.getClass();
                    r0Var2.f(ea.w, new yd(uid2), new ld(a));
                    return zy11Var;
                }
                webviewUrl = ((com.yandex.passport.common.url.b) value).a;
                hVar.getClass();
                int timestamp2 = (int) (pushPayload2.getTimestamp() / 1000);
                Uri defaultUri2 = RingtoneManager.getDefaultUri(2);
                Context context2 = hVar.a;
                androidx.core.app.v vVar2 = new androidx.core.app.v(context2, context2.getPackageName());
                hVar.n(vVar2);
                vVar2.e = androidx.core.app.v.d(pushPayload2.getTitle());
                vVar2.f = androidx.core.app.v.d(pushPayload2.getBody());
                t.b bVar2 = new t.b();
                bVar2.e(pushPayload2.getBody());
                vVar2.l(bVar2);
                vVar2.h(16, true);
                vVar2.k(defaultUri2);
                c0 c0Var2 = hVar.o;
                c0Var2.getClass();
                Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(webviewUrl));
                intent2.addFlags(268437504);
                vVar2.h = PendingIntent.getActivity(c0Var2.a, timestamp2, intent2, 1140850688);
                vVar2.m = 1;
                PendingIntent c2 = hVar.o.c(hVar.a, timestamp2, pushPayload2.getBody(), modernAccount2.getUid(), pushPayload2.getPushId(), pushPayload2.getTrackId(), pushPayload2.getPlatform());
                Notification notification2 = vVar2.K;
                notification2.deleteIntent = c2;
                notification2.when = pushPayload2.getTimestamp();
                vVar2.h(8, true);
                hVar.m(vVar2);
                vVar2.A = 1;
                String f2 = f(pushPayload2.getPushService());
                hVar.e(f2);
                vVar2.F = f2;
                hVar.s.d(com.yandex.passport.internal.i.a, timestamp2, vVar2.b());
                com.yandex.passport.internal.report.reporters.r0 r0Var3 = hVar.r;
                Uid uid3 = modernAccount2.getUid();
                r0Var3.getClass();
                r0Var3.g(n9.x, uid3);
                return zy11Var;
            }
        }
        notificationHelper$openInBrowser$1 = new NotificationHelper$openInBrowser$1(hVar, continuationImpl);
        Object obj2 = notificationHelper$openInBrowser$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = notificationHelper$openInBrowser$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        Object value2 = ((Result) obj2).getValue();
        a = Result.a(value2);
        if (a == null) {
        }
    }

    public final ModernAccount l(long j, List list) {
        ModernAccount d = this.b.a().d(j);
        com.yandex.passport.internal.report.reporters.s0 s0Var = this.c;
        if (d == null) {
            s0Var.getClass();
            s0Var.e(uc.w, kotlin.collections.a.o0(list, new md("account_not_found", 12, false)));
            com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(LogLevel.INFO, null, qv10.k(j, "Account with uid ", " is not found"), 8);
                return null;
            }
        } else if (d.getMasterToken().isDropped()) {
            s0Var.getClass();
            s0Var.e(uc.w, kotlin.collections.a.o0(list, new md("master_token_is_dropped", 12, false)));
            com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(LogLevel.INFO, null, qv10.j(j, "Master token is dropped for uid "), 8);
                return null;
            }
        } else {
            if (this.g.d(d.getUid())) {
                return d;
            }
            com.yandex.passport.common.logger.c cVar3 = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(LogLevel.INFO, null, qv10.k(j, "Account with uid ", " was logout and can't show notification."), 8);
            }
        }
        return null;
    }

    public final void m(androidx.core.app.v vVar) {
        int i = g.a[((PushIconType) this.k.b(com.yandex.passport.internal.flags.q.v)).ordinal()];
        Context context = this.a;
        if (i == 2 || i == 3) {
            int i2 = R.color.passport_notification_lock;
            vVar.v = true;
            vVar.w = true;
            vVar.z = context.getColor(i2);
            return;
        }
        if (i != 4) {
            return;
        }
        int i3 = R.color.passport_logout_brand_background;
        vVar.v = true;
        vVar.w = true;
        vVar.z = context.getColor(i3);
    }

    public final void n(androidx.core.app.v vVar) {
        int i;
        int i2 = g.a[((PushIconType) this.k.b(com.yandex.passport.internal.flags.q.v)).ordinal()];
        if (i2 == 1) {
            i = R.mipmap.passport_ic_suspicious_enter;
        } else if (i2 == 2) {
            i = R.drawable.passport_lock_notification;
        } else {
            if (i2 != 3 && i2 != 4) {
                w511.b();
                return;
            }
            i = R.drawable.passport_id_notification;
        }
        vVar.K.icon = i;
    }
}
