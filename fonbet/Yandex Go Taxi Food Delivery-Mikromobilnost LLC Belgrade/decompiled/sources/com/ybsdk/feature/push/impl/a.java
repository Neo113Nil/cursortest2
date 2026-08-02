package com.ybsdk.feature.push.impl;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.net.Uri;
import androidx.core.app.s0;
import com.google.common.collect.ImmutableSet;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.vendor.huawei.push.HuaweiPushHelper;
import com.ybsdk.rconfig.configs.CommonFeatureFlag;
import com.ybsdk.rconfig.configs.PushNotificationReplacement;
import com.ybsdk.rconfig.configs.PushNotificationsReplacements;
import defpackage.cvu0;
import defpackage.dnp0;
import defpackage.e2g0;
import defpackage.g8e;
import defpackage.i3y;
import defpackage.i5z0;
import defpackage.jl40;
import defpackage.k2g0;
import defpackage.l2g0;
import defpackage.mcr;
import defpackage.nbp0;
import defpackage.ny61;
import defpackage.p03;
import defpackage.q960;
import defpackage.rt1;
import defpackage.tcc;
import defpackage.tje;
import defpackage.u0a1;
import defpackage.u1g0;
import defpackage.uza;
import defpackage.v190;
import defpackage.wlp;
import defpackage.wt51;
import defpackage.x4c;
import defpackage.x8g;
import defpackage.y5e;
import defpackage.z151;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class a implements wt51 {
    public final dnp0 a;
    public final i3y b = kotlin.a.a(new z151(14));
    public final i3y c = kotlin.a.a(new z151(15));
    public final s0 d;

    public a(dnp0 dnp0Var) {
        this.a = dnp0Var;
        this.d = new s0(((x8g) dnp0Var).a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, k2g0 k2g0Var, ContinuationImpl continuationImpl) {
        YbPushNotificationsFeatureImpl$tryOverrideContent$1 ybPushNotificationsFeatureImpl$tryOverrideContent$1;
        int i;
        v190 v190Var;
        aVar.getClass();
        if (continuationImpl instanceof YbPushNotificationsFeatureImpl$tryOverrideContent$1) {
            ybPushNotificationsFeatureImpl$tryOverrideContent$1 = (YbPushNotificationsFeatureImpl$tryOverrideContent$1) continuationImpl;
            int i2 = ybPushNotificationsFeatureImpl$tryOverrideContent$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ybPushNotificationsFeatureImpl$tryOverrideContent$1.label = i2 - Integer.MIN_VALUE;
                Object obj = ybPushNotificationsFeatureImpl$tryOverrideContent$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = ybPushNotificationsFeatureImpl$tryOverrideContent$1.label;
                if (i != 0) {
                    b.b(obj);
                    com.ybsdk.feature.push.api.overrider.a m = p03.m(ImmutableSet.q(p03.n(p03.e((x8g) aVar.a))));
                    JSONObject f = k2g0Var.f();
                    ybPushNotificationsFeatureImpl$tryOverrideContent$1.L$0 = k2g0Var;
                    ybPushNotificationsFeatureImpl$tryOverrideContent$1.label = 1;
                    obj = m.a(f, ybPushNotificationsFeatureImpl$tryOverrideContent$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    k2g0Var = (k2g0) ybPushNotificationsFeatureImpl$tryOverrideContent$1.L$0;
                    b.b(obj);
                }
                v190Var = (v190) obj;
                if (v190Var != null) {
                    String b = v190Var.b();
                    if (b == null) {
                        b = k2g0Var.c();
                    }
                    k2g0Var.o(b);
                    String c = v190Var.c();
                    if (c == null) {
                        c = k2g0Var.k();
                    }
                    k2g0Var.p(c);
                    String a = v190Var.a();
                    if (a == null) {
                        a = k2g0Var.b();
                    }
                    k2g0Var.n(a);
                }
                return zy11.a;
            }
        }
        ybPushNotificationsFeatureImpl$tryOverrideContent$1 = new YbPushNotificationsFeatureImpl$tryOverrideContent$1(aVar, continuationImpl);
        Object obj2 = ybPushNotificationsFeatureImpl$tryOverrideContent$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ybPushNotificationsFeatureImpl$tryOverrideContent$1.label;
        if (i != 0) {
        }
        v190Var = (v190) obj2;
        if (v190Var != null) {
        }
        return zy11.a;
    }

    public final Uri b(String str) {
        Uri parse;
        dnp0 dnp0Var = this.a;
        if (str != null) {
            if (str.length() <= 0) {
                str = null;
            }
            if (str != null && (parse = Uri.parse(str)) != null) {
                x8g x8gVar = (x8g) dnp0Var;
                if (((e2g0) x8gVar.U0.get()).a(parse)) {
                    return parse;
                }
                x8gVar.d().X.a.a("push_notifications.not_yb_push", null);
                return null;
            }
        }
        ((x8g) dnp0Var).d().X.a.a("push_notifications.cannot_parse_deeplink", null);
        return null;
    }

    public final mcr c() {
        dnp0 dnp0Var = this.a;
        try {
            return new HuaweiPushHelper(((CommonFeatureFlag) ((x8g) dnp0Var).c().a.d(wlp.M0).getData()).isEnabled(), ((x8g) dnp0Var).d());
        } catch (NoClassDefFoundError unused) {
            return null;
        }
    }

    public final com.ybsdk.feature.push.impl.domain.a d() {
        return (com.ybsdk.feature.push.impl.domain.a) this.b.getValue();
    }

    public final boolean e(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        x8g x8gVar = (x8g) this.a;
        List<PushNotificationReplacement> replacements = ((PushNotificationsReplacements) x8gVar.c().a.d(l2g0.a).getData()).getReplacements();
        ArrayList arrayList = new ArrayList(tcc.n(replacements, 10));
        for (PushNotificationReplacement pushNotificationReplacement : replacements) {
            arrayList.add(new Pair(pushNotificationReplacement.getOld(), pushNotificationReplacement.getNew()));
        }
        if (!arrayList.isEmpty()) {
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Pair pair = (Pair) it.next();
                    str2 = cvu0.v(str2, (String) pair.getFirst(), (String) pair.getSecond(), false);
                }
                linkedHashMap.put(str, str2);
            }
        }
        k2g0 k2g0Var = new k2g0(linkedHashMap);
        rt1 rt1Var = x8gVar.d().X;
        boolean m = k2g0Var.m();
        String c = k2g0Var.c();
        boolean l = k2g0Var.l();
        String j = k2g0Var.j();
        String e = k2g0Var.e();
        Boolean a = k2g0Var.a();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(6);
        linkedHashMap2.put("is_silent", Boolean.valueOf(m));
        if (c != null) {
            linkedHashMap2.put("raw_notification_deeplink", c);
        }
        linkedHashMap2.put("is_yb_source", Boolean.valueOf(l));
        if (j != null) {
            linkedHashMap2.put("source", j);
        }
        if (e != null) {
            linkedHashMap2.put("notification_channel", e);
        }
        if (a != null) {
            linkedHashMap2.put("ack_required", a);
        }
        rt1Var.a.a("push_notifications.before_handle_push_info", linkedHashMap2);
        if (!k2g0Var.m() || k2g0Var.f() == null) {
            Uri b = b(k2g0Var.c());
            if (b == null) {
                return false;
            }
            if (((CommonFeatureFlag) x8gVar.c().a.d(wlp.R).getData()).isEnabled()) {
                tje.N(((nbp0) x8gVar.u.get()).a, null, null, new YbPushNotificationsFeatureImpl$handleNotificationPush$1(this, k2g0Var, null), 3);
                return true;
            }
            f(b, k2g0Var);
            return true;
        }
        byte[] bArr = y5e.c;
        if (!k2g0Var.l()) {
            rt1 rt1Var2 = x8gVar.d().X;
            String j2 = k2g0Var.j();
            Boolean a2 = k2g0Var.a();
            LinkedHashMap linkedHashMap3 = new LinkedHashMap(2);
            if (j2 != null) {
                linkedHashMap3.put("source", j2);
            }
            if (a2 != null) {
                linkedHashMap3.put("ack_required", a2);
            }
            com.ybsdk.core.analytics.a aVar = rt1Var2.a;
            byte[] bArr2 = y5e.v;
            byte[] bArr3 = new byte[52];
            for (int i = 0; i < 52; i++) {
                bArr3[i] = (byte) (bArr2[i] ^ bArr[i % 8]);
            }
            aVar.a(new String(bArr3, uza.a), linkedHashMap3);
            return false;
        }
        rt1 rt1Var3 = x8gVar.d().X;
        String h = k2g0Var.h();
        JSONObject i2 = k2g0Var.i();
        String jSONObject = i2 != null ? i2.toString() : null;
        Boolean a3 = k2g0Var.a();
        LinkedHashMap linkedHashMap4 = new LinkedHashMap(3);
        if (h != null) {
            linkedHashMap4.put("feature", h);
        }
        if (jSONObject != null) {
            linkedHashMap4.put("params", jSONObject);
        }
        if (a3 != null) {
            linkedHashMap4.put("ack_required", a3);
        }
        com.ybsdk.core.analytics.a aVar2 = rt1Var3.a;
        byte[] bArr4 = y5e.t;
        byte[] bArr5 = new byte[48];
        for (int i3 = 0; i3 < 48; i3++) {
            bArr5[i3] = (byte) (bArr4[i3] ^ bArr[i3 % 8]);
        }
        aVar2.a(new String(bArr5, uza.a), linkedHashMap4);
        p03.r(ImmutableSet.l(2, p03.f(x8gVar.d, (q960) x8gVar.V0.get()), p03.d(ImmutableSet.q(new com.ybsdk.screens.changephone.push.a(x8gVar.E, (AppAnalyticsReporter) x8gVar.q.get(), (nbp0) x8gVar.u.get()))))).a(k2g0Var.h(), k2g0Var.i());
        com.ybsdk.feature.push.impl.domain.a d = d();
        d.getClass();
        if (jl40.l(k2g0Var.a(), Boolean.TRUE)) {
            d.c(k2g0Var.g());
        }
        d.j.a.a.g(zy11.a);
        return true;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(29:0|1|(4:10|(2:11|(2:13|(1:15)(1:19))(2:20|21))|16|(1:18))|22|(2:77|(2:81|(4:84|(1:93)(0)|76|82))(0))(3:26|(2:28|(2:30|(1:32)(0))(0))(0)|76)|(2:34|35)|(22:37|38|39|(16:41|(2:65|(1:67))|44|(2:47|45)|48|49|(1:51)|52|(1:54)|55|(1:57)|58|(1:60)|61|62|63)|69|(0)|65|(0)|44|(1:45)|48|49|(0)|52|(0)|55|(0)|58|(0)|61|62|63)|72|38|39|(0)|69|(0)|65|(0)|44|(1:45)|48|49|(0)|52|(0)|55|(0)|58|(0)|61|62|63) */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b7, code lost:
    
        if (r3.isBlocked() != true) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x014b, code lost:
    
        defpackage.i5z0.a.g("Failed to show Huawei push", new java.lang.Object[0]);
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x013e A[Catch: all -> 0x014b, TRY_LEAVE, TryCatch #1 {all -> 0x014b, blocks: (B:39:0x0138, B:41:0x013e), top: B:38:0x0138 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0157 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0190 A[LOOP:1: B:45:0x018a->B:47:0x0190, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01f7 A[LOOP:2: B:59:0x01f5->B:60:0x01f7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x016c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(Uri uri, k2g0 k2g0Var) {
        NotificationChannelGroup notificationChannelGroup;
        mcr mcrVar;
        boolean z;
        boolean z2;
        ArrayList arrayList;
        Iterator it;
        Boolean a;
        mcr c;
        Object obj;
        d().j.a.a.g(zy11.a);
        dnp0 dnp0Var = this.a;
        x8g x8gVar = (x8g) dnp0Var;
        String uri2 = ((e2g0) x8gVar.U0.get()).b(uri).toString();
        k2g0Var.o(uri2);
        String e = k2g0Var.e();
        s0 s0Var = this.d;
        NotificationManager notificationManager = s0Var.b;
        NotificationManager notificationManager2 = s0Var.b;
        boolean areNotificationsEnabled = notificationManager.areNotificationsEnabled();
        if (areNotificationsEnabled && ((CommonFeatureFlag) x8gVar.c().a.d(wlp.L0).getData()).isEnabled() && e != null && e.length() != 0 && notificationManager2.getNotificationChannel(e) == null) {
            Iterator it2 = x8gVar.c().a().iterator();
            while (true) {
                if (it2.hasNext()) {
                    obj = it2.next();
                    if (jl40.l(((u1g0) obj).a(), e)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            u1g0 u1g0Var = (u1g0) obj;
            if (u1g0Var != null) {
                u0a1.c(x8gVar.a, Collections.singletonList(u1g0Var));
            }
        }
        boolean z3 = true;
        if (e != null && e.length() != 0) {
            NotificationChannel notificationChannel = notificationManager2.getNotificationChannel(e);
            if (notificationChannel != null) {
                if (notificationChannel.getImportance() != 0) {
                    NotificationChannelGroup notificationChannelGroup2 = notificationManager2.getNotificationChannelGroup(notificationChannel.getGroup());
                    if (notificationChannelGroup2 != null) {
                    }
                }
            }
            z3 = false;
            break;
        }
        List<NotificationChannel> notificationChannels = notificationManager2.getNotificationChannels();
        if (!(notificationChannels instanceof Collection) || !notificationChannels.isEmpty()) {
            for (NotificationChannel notificationChannel2 : notificationChannels) {
                if (notificationChannel2.getImportance() != 0 && ((notificationChannelGroup = notificationManager2.getNotificationChannelGroup(notificationChannel2.getGroup())) == null || !notificationChannelGroup.isBlocked())) {
                }
                z3 = false;
            }
        }
        try {
            try {
                mcrVar = new mcr(((CommonFeatureFlag) ((x8g) dnp0Var).c().a.d(wlp.M0).getData()).isEnabled(), ((x8g) dnp0Var).d());
            } catch (NoClassDefFoundError unused) {
                mcrVar = null;
            }
        } catch (Throwable unused2) {
            i5z0.a.g("Failed to show Firebase push", new Object[0]);
        }
        if (mcrVar != null) {
            z = mcrVar.f(((x8g) dnp0Var).a, k2g0Var.q());
            c = c();
            if (c != null) {
                z2 = c.f(((x8g) dnp0Var).a, k2g0Var.q());
                if (!z || z2) {
                    com.ybsdk.feature.push.impl.domain.a d = d();
                    d.getClass();
                    if (jl40.l(k2g0Var.a(), Boolean.TRUE)) {
                        d.c(k2g0Var.g());
                    }
                }
                ArrayList a2 = x8gVar.c().a();
                arrayList = new ArrayList(tcc.n(a2, 10));
                it = a2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((u1g0) it.next()).a());
                }
                if (!kotlin.collections.a.G(arrayList, e)) {
                    x4c.g("Failed to show push notification with channelId", null, e, null, 10);
                }
                rt1 rt1Var = x8gVar.d().X;
                Boolean valueOf = Boolean.valueOf(z3);
                a = k2g0Var.a();
                LinkedHashMap w = g8e.w(7, "wrapped_deeplink", uri2);
                w.put("shown_by_firebase", Boolean.valueOf(z));
                w.put("shown_by_huawei", Boolean.valueOf(z2));
                if (e != null) {
                    w.put("notification_channel", e);
                }
                w.put("notifications_enabled", Boolean.valueOf(areNotificationsEnabled));
                w.put("notification_channel_enabled", valueOf);
                if (a != null) {
                    w.put("ack_required", a);
                }
                com.ybsdk.core.analytics.a aVar = rt1Var.a;
                byte[] bArr = y5e.f;
                byte[] bArr2 = new byte[40];
                for (int i = 0; i < 40; i++) {
                    bArr2[i] = (byte) (bArr[i] ^ y5e.c[i % 8]);
                }
                aVar.a(new String(bArr2, uza.a), w);
            }
            z2 = false;
            if (!z) {
            }
            com.ybsdk.feature.push.impl.domain.a d2 = d();
            d2.getClass();
            if (jl40.l(k2g0Var.a(), Boolean.TRUE)) {
            }
            ArrayList a22 = x8gVar.c().a();
            arrayList = new ArrayList(tcc.n(a22, 10));
            it = a22.iterator();
            while (it.hasNext()) {
            }
            if (!kotlin.collections.a.G(arrayList, e)) {
            }
            rt1 rt1Var2 = x8gVar.d().X;
            Boolean valueOf2 = Boolean.valueOf(z3);
            a = k2g0Var.a();
            LinkedHashMap w2 = g8e.w(7, "wrapped_deeplink", uri2);
            w2.put("shown_by_firebase", Boolean.valueOf(z));
            w2.put("shown_by_huawei", Boolean.valueOf(z2));
            if (e != null) {
            }
            w2.put("notifications_enabled", Boolean.valueOf(areNotificationsEnabled));
            w2.put("notification_channel_enabled", valueOf2);
            if (a != null) {
            }
            com.ybsdk.core.analytics.a aVar2 = rt1Var2.a;
            byte[] bArr3 = y5e.f;
            byte[] bArr22 = new byte[40];
            while (i < 40) {
            }
            aVar2.a(new String(bArr22, uza.a), w2);
        }
        z = false;
        c = c();
        if (c != null) {
        }
        z2 = false;
        if (!z) {
        }
        com.ybsdk.feature.push.impl.domain.a d22 = d();
        d22.getClass();
        if (jl40.l(k2g0Var.a(), Boolean.TRUE)) {
        }
        ArrayList a222 = x8gVar.c().a();
        arrayList = new ArrayList(tcc.n(a222, 10));
        it = a222.iterator();
        while (it.hasNext()) {
        }
        if (!kotlin.collections.a.G(arrayList, e)) {
        }
        rt1 rt1Var22 = x8gVar.d().X;
        Boolean valueOf22 = Boolean.valueOf(z3);
        a = k2g0Var.a();
        LinkedHashMap w22 = g8e.w(7, "wrapped_deeplink", uri2);
        w22.put("shown_by_firebase", Boolean.valueOf(z));
        w22.put("shown_by_huawei", Boolean.valueOf(z2));
        if (e != null) {
        }
        w22.put("notifications_enabled", Boolean.valueOf(areNotificationsEnabled));
        w22.put("notification_channel_enabled", valueOf22);
        if (a != null) {
        }
        com.ybsdk.core.analytics.a aVar22 = rt1Var22.a;
        byte[] bArr32 = y5e.f;
        byte[] bArr222 = new byte[40];
        while (i < 40) {
        }
        aVar22.a(new String(bArr222, uza.a), w22);
    }
}
