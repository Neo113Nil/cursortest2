package xsna;

import android.annotation.SuppressLint;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.SystemClock;
import android.service.notification.StatusBarNotification;
import androidx.core.app.NotificationCompat;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import com.vk.core.apps.BuildInfo;
import com.vk.core.preference.Preference;
import com.vk.core.serialize.Serializer;
import com.vk.dto.Push;
import com.vk.dto.common.NotificationImage;
import com.vk.dto.common.id.UserId;
import com.vk.im.ui.fragments.chat.ChatFragment;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.pushes.dto.BusinessNotifyNotificationInfo;
import com.vk.pushes.dto.MessageNotificationInfo;
import com.vk.pushes.dto.PushBusinessNotify;
import com.vk.pushes.dto.PushMessage;
import com.vk.pushes.notifications.im.BusinessNotifyNotification;
import com.vk.pushes.notifications.im.MessageNotificationContainer;
import com.vk.toggle.anonymous.SakFeatures;
import com.vk.toggle.features.ImFeatures;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.ok.proto.PublisherConfiguration;
import xsna.ahe0;

/* compiled from: PushMessageHandler.kt */
/* loaded from: classes5.dex */
public final class qje0 {
    public final Context a;
    public final bpn0 b = new bpn0(new l9(26));

    /* compiled from: PushMessageHandler.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            ((com.vk.metrics.eventtracking.b) this.receiver).a(th);
            return s3q0.a;
        }
    }

    public qje0(Context context) {
        this.a = context;
    }

    public static Map d(Map map) {
        UserId c = o25.a().c();
        if (!fkq0.c(c)) {
            c = null;
        }
        Long valueOf = c != null ? Long.valueOf(c.b) : null;
        if (f(map) != null || valueOf == null) {
            return map;
        }
        Map map2 = ttp0.g(map) ? map : null;
        if (map2 == null) {
            map2 = new LinkedHashMap(map);
        }
        map2.put("to_id", valueOf.toString());
        return map2;
    }

    public static Map e(Map map) {
        String str = (String) map.get("time");
        long l = str != null ? cqm0.l(str) : 0L;
        if (l > 2147483647L) {
            return map;
        }
        Map map2 = ttp0.g(map) ? map : null;
        if (map2 == null) {
            map2 = new LinkedHashMap(map);
        }
        map2.put("time", String.valueOf(TimeUnit.SECONDS.toMillis(l)));
        return map2;
    }

    public static Long f(Map map) {
        String str = (String) map.get("to_id");
        if (str != null) {
            return cqm0.k(str);
        }
        return null;
    }

    public static boolean h(Map map) {
        if (!map.containsKey("badge")) {
            return false;
        }
        CharSequence charSequence = (CharSequence) map.get("title");
        if (charSequence != null && charSequence.length() != 0) {
            return false;
        }
        CharSequence charSequence2 = (CharSequence) map.get("body");
        return charSequence2 == null || charSequence2.length() == 0;
    }

    public final void a(Push push) {
        Object obj;
        List<PushMessage> list;
        String str;
        String zb;
        Object obj2;
        Context context;
        ri6 pa20Var;
        Map d = d(push.a);
        String str2 = (String) d.get("context");
        JSONObject jSONObject = str2 != null ? new JSONObject(str2) : new JSONObject();
        Serializer.c<MessageNotificationContainer> cVar = MessageNotificationContainer.CREATOR;
        long a2 = MessageNotificationContainer.a.a(jSONObject);
        ra20 ra20Var = ra20.a;
        ChatFragment.w1.getClass();
        if (ChatFragment.y1 == a2) {
            L l = L.a;
            l.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l, L.LogType.d, new Object[]{qlb0.a(a2, "[Push]: ignore, because dialog ", " opened")});
            }
            ine0.m(push, ahe0.l.b);
            return;
        }
        if (!epx.f(jSONObject.optString("edited"), "true") || epx.f(push.c(), "custom")) {
            bpn0 bpn0Var = new bpn0(new ye80(d, 11));
            long j = push.b().b;
            if (jSONObject.has("group_id")) {
                j = -jSONObject.optLong("group_id");
            }
            long j2 = j;
            int optInt = jSONObject.optInt("conversation_message_id", jSONObject.optInt("msg_id"));
            List e = qa20.b.a.e(Long.valueOf(a2), Long.valueOf(j2));
            if (!(e instanceof Collection) || !e.isEmpty()) {
                Iterator it = e.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (((PushMessage) it.next()).b == optInt) {
                        if (!push.c) {
                            L l2 = L.a;
                            l2.getClass();
                            if (!L.m(LoggerOutputTarget.NONE)) {
                                L.u(l2, L.LogType.d, new Object[]{ho8.a(new StringBuilder("[Push]: already shown("), (String) bpn0Var.getValue(), ')')});
                            }
                            ine0.m(push, ahe0.b.b);
                            return;
                        }
                    }
                }
            }
            UserId c = o25.a().c();
            if (!fkq0.c(c)) {
                c = null;
            }
            Long valueOf = c != null ? Long.valueOf(c.b) : null;
            long j3 = push.b().b;
            if (valueOf != null && valueOf.longValue() == j3 && z4g.d().m(optInt, j2, a2)) {
                L l3 = L.a;
                l3.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l3, L.LogType.d, new Object[]{ho8.a(new StringBuilder("[Push]: msg already read("), (String) bpn0Var.getValue(), ')')});
                }
                ine0.m(push, ahe0.a.b);
                return;
            }
            L l4 = L.a;
            l4.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l4, L.LogType.d, new Object[]{ho8.a(new StringBuilder("[Push]: MessageNotificationCache.addMsgPush("), (String) bpn0Var.getValue(), ')')});
            }
            qa20.b.a.a(new MessageNotificationContainer(d), e870.e(d), e870.c(d), e870.d().g() ? null : (String) d.get("photo_url"));
            List<Long> list2 = lsn.a;
            if (!lsn.a(a2)) {
                b(push);
                return;
            }
            L.p("Chat dnd is active, not showing notification");
            ine0.m(push, ahe0.e.b);
            i(push, "dnd");
            return;
        }
        L.e("[Push]: handleMsgEditPush");
        long a3 = MessageNotificationContainer.a.a(jSONObject);
        List<Long> list3 = lsn.a;
        if (lsn.a(a3)) {
            L.p("Chat dnd is active, not updating message in notification");
            i(push, "dnd");
            ine0.m(push, ahe0.e.b);
            return;
        }
        int i = 0;
        int optInt2 = jSONObject.optInt("conversation_message_id", 0);
        ra20 ra20Var2 = ra20.a;
        Context context2 = this.a;
        ra20Var2.getClass();
        try {
            obj = qa20.b.a.f(a3, Long.valueOf(push.b().b)).a();
        } catch (Throwable unused) {
            obj = null;
        }
        MessageNotificationInfo messageNotificationInfo = (MessageNotificationInfo) obj;
        if ((messageNotificationInfo != null ? messageNotificationInfo.b : null) == null || (list = messageNotificationInfo.e) == null || list.isEmpty()) {
            ine0.m(push, ahe0.d.b);
            return;
        }
        String str3 = com.vk.dto.common.b.a(a3) ? push.a.get("sender") : push.a.get("title");
        ArrayList arrayList = new ArrayList(j5g.D0(new sa20(), messageNotificationInfo.e));
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            int i2 = i + 1;
            PushMessage pushMessage = (PushMessage) it2.next();
            if (pushMessage.b == optInt2) {
                String str4 = str3 == null ? "" : str3;
                String str5 = push.a.get("body");
                String str6 = str5 == null ? "" : str5;
                e870 e870Var = e870.b;
                if (e870.d().g() || (str = push.a.get("big_image")) == null) {
                    zb = null;
                } else {
                    Serializer.c<NotificationImage> cVar2 = NotificationImage.CREATOR;
                    zb = NotificationImage.a.a(new JSONArray(str)).zb(1440, PublisherConfiguration.DEFAULT_MAX_RES);
                }
                arrayList.set(i, PushMessage.zb(pushMessage, optInt2, str4, str6, zb, false, 112));
                if (!pushMessage.g) {
                    PushMessage pushMessage2 = (PushMessage) xy9.b(1, arrayList);
                    MessageNotificationContainer messageNotificationContainer = messageNotificationInfo.b;
                    String str7 = messageNotificationContainer.e;
                    String str8 = pushMessage2.d;
                    long j4 = pushMessage2.f;
                    String str9 = messageNotificationContainer.h;
                    String format = String.format(i5s.a(new StringBuilder("https://"), a0a.d, "/im?sel=%d"), Arrays.copyOf(new Object[]{Long.valueOf(a3)}, 1));
                    String str10 = pushMessage2.c;
                    MessageNotificationContainer messageNotificationContainer2 = messageNotificationInfo.b;
                    MessageNotificationContainer a4 = com.vk.pushes.notifications.im.a.a(str7, str8, j4, str9, format, false, str10, messageNotificationContainer2.w, messageNotificationContainer2.x, messageNotificationContainer2.B, messageNotificationContainer2.y, a3, pushMessage2.b, false, messageNotificationContainer2.p, messageNotificationContainer2.q, messageNotificationContainer2.s, messageNotificationContainer2.r);
                    a4.u = true;
                    MessageNotificationInfo zb2 = MessageNotificationInfo.zb(messageNotificationInfo, a4, arrayList, null, 22);
                    wmi0.a.a(qa20.b.a.c(a3, a4.j()), zb2);
                    MessageNotificationContainer messageNotificationContainer3 = zb2.b;
                    if (messageNotificationContainer3 == null) {
                        return;
                    }
                    try {
                        obj2 = mcr0.l(600L, zb2.c).a();
                    } catch (Throwable unused2) {
                        obj2 = null;
                    }
                    Bitmap bitmap = (Bitmap) obj2;
                    xsw xswVar = new xsw(push, 7);
                    sfg sfgVar = new sfg(push, 29);
                    if (com.vk.dto.common.b.a(a3)) {
                        context = context2;
                        pa20Var = new qtb(context, messageNotificationContainer3, ra20.e(zb2), bitmap, zb2.e, sfgVar, xswVar, 32);
                    } else {
                        context = context2;
                        pa20Var = new pa20(context, messageNotificationContainer3, bitmap, zb2.e, (Intent) null, sfgVar, xswVar, 40);
                    }
                    ca70 ca70Var = ca70.a;
                    pa20Var.g(ca70.f(context));
                    return;
                }
            } else {
                i = i2;
            }
        }
        ine0.m(push, ahe0.g.b);
    }

    @SuppressLint({"CheckResult"})
    public final void b(Push push) {
        boolean z;
        Set<String> set = ule0.a;
        String c = push.c();
        Map<String, String> map = push.a;
        if (!j5g.P(ule0.l, c) && lsn.b()) {
            L.p("Global dnd is active, not showing notification");
            i(push, "dnd");
            ine0.m(push, ahe0.h.b);
            return;
        }
        if (myc0.f(map.get("visibility_hash"))) {
            String str = map.get("visibility_hash");
            String str2 = map.get("to_id");
            String str3 = map.get("type");
            String str4 = map.get("context");
            mns0 mns0Var = new mns0("internal.shouldNotifyPush");
            mns0Var.K("visibility_hash", str);
            mns0Var.K("owner_id", str2);
            mns0Var.K("type", str3);
            mns0Var.K("context", str4);
            Object obj = null;
            try {
                obj = rsg0.y0(mns0Var, null, null, 3).a();
            } catch (Throwable unused) {
            }
            z = Boolean.TRUE.equals((Boolean) obj);
        } else {
            z = true;
        }
        if (!z) {
            L l = L.a;
            l.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l, L.LogType.d, new Object[]{"[Push]: server validation error, skip it"});
            }
            i(push, "validation");
            ine0.m(push, ahe0.j.b);
            return;
        }
        e870 e870Var = e870.b;
        if (!epx.f(map.get("type"), "friend")) {
            c(push);
            return;
        }
        L l2 = L.a;
        l2.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l2, L.LogType.d, new Object[]{"[Push]: buildNotification(" + push.a() + ')'});
        }
        io.reactivex.rxjava3.internal.operators.observable.m1 b = e870.b(this.a, map);
        if (b != null) {
            b.subscribe(new sl30(new zl20(this, 26), 19), new ow40(new a(1, com.vk.metrics.eventtracking.b.a, com.vk.metrics.eventtracking.b.class, "logException", "logException(Ljava/lang/Throwable;)V", 0), 14));
        } else {
            c(push);
        }
    }

    public final void c(Push push) {
        L l = L.a;
        l.getClass();
        LoggerOutputTarget loggerOutputTarget = LoggerOutputTarget.NONE;
        if (!L.m(loggerOutputTarget)) {
            L.u(l, L.LogType.d, new Object[]{"[Push]: buildNotification(" + push.a() + ')'});
        }
        e870 e870Var = e870.b;
        z4g.d().getClass();
        Context context = this.a;
        com.vk.pushes.notifications.base.a a2 = e870.a(context, push, null);
        l.getClass();
        if (!L.m(loggerOutputTarget)) {
            L.u(l, L.LogType.d, new Object[]{"[Push]: notification = " + a2});
        }
        ca70 ca70Var = ca70.a;
        NotificationManager f = ca70.f(context);
        if (a2 != null) {
            a2.g(f);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x08df, code lost:
    
        if (r2.equals("unifyretention_top_clip") == false) goto L337;
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x0900, code lost:
    
        b(r25);
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:366:0x08e9, code lost:
    
        if (r2.equals("unifyvk_video_promo") == false) goto L337;
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x08f3, code lost:
    
        if (r2.equals("unifyvideo_retention") == false) goto L337;
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x08fd, code lost:
    
        if (r2.equals("unifytop_clips_authors") == false) goto L337;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(Push push) {
        String str;
        long j;
        Object obj;
        List<PushBusinessNotify> list;
        String str2;
        int i;
        Context context = this.a;
        boolean z = push.c;
        Map<String, String> map = push.a;
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.d, new Object[]{"Push message data: " + push.a()});
        }
        o260 o260Var = d260.a;
        o260 o260Var2 = d260.a;
        r6 = null;
        Iterable iterable = null;
        Long l2 = null;
        if (o260Var2 == null) {
            o260Var2 = null;
        }
        o260Var2.getClass();
        AtomicLong atomicLong = x2q0.d;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = x2q0.c;
        long j3 = elapsedRealtime + j2;
        long j4 = atomicLong.get();
        if (j3 < j4) {
            j3 = j4;
        }
        atomicLong.set(j3);
        AtomicLong atomicLong2 = x2q0.e;
        long elapsedRealtime2 = SystemClock.elapsedRealtime() + j2;
        long j5 = atomicLong2.get();
        if (elapsedRealtime2 < j5) {
            elapsedRealtime2 = j5;
        }
        atomicLong2.set(elapsedRealtime2);
        if (!z) {
            i(push, null);
        }
        boolean b = o25.a().b();
        if (b) {
            UserId b2 = push.b();
            g2v.c().getClass();
            String c = push.c();
            if (!epx.f(c, NotificationCompat.CATEGORY_CALL)) {
                epx.f(c, NotificationCompat.CATEGORY_MISSED_CALL);
            }
            if (fkq0.c(b2) && !o25.a().a(b2)) {
                r55 r55Var = r55.a;
                umu0 umu0Var = r55.g;
                if (umu0Var == null) {
                    umu0Var = null;
                }
                umu0Var.getClass();
            }
            List<UserId> g = o25.a().g();
            if (!fkq0.c(b2) || (!o25.a().a(b2) && !g.contains(b2))) {
                ine0.m(push, ahe0.o.b);
                i(push, "wrong_id");
                return;
            }
        }
        SharedPreferences l3 = Preference.l();
        l3.edit().putInt("push_counter", l3.getInt("push_counter", 0) + 1).apply();
        if (Preference.g(context).getBoolean("notifyShortcutBadge", true) && (str2 = map.get("badge")) != null && str2.length() != 0) {
            ca70 ca70Var = ca70.a;
            bpn0 bpn0Var = cqm0.a;
            try {
                i = Integer.parseInt(str2);
            } catch (Throwable unused) {
                i = 0;
            }
            ca70Var.i(i, context);
        }
        if (b && !zqn0.a.f()) {
            ine0.m(push, ahe0.k.b);
            i(push, "disabled_by_system");
            return;
        }
        Set<String> set = ule0.a;
        if (!j5g.P(ule0.m, push.c())) {
            z4g.d().n(true);
        }
        if (!b) {
            if (b) {
                throw new NoWhenBranchMatchedException();
            }
            String c2 = push.c();
            if (c2 != null) {
                switch (c2.hashCode()) {
                    case -1411101089:
                        break;
                    case -995238857:
                        break;
                    case -563854780:
                        break;
                    case 26224382:
                        break;
                    case 588593696:
                        if (c2.equals("anonymous_token_signature")) {
                            if (!SakFeatures.Type.FEATURE_SIGN_ANONYMOUS_TOKEN.h() || (str = map.get("anonymous_token_signature_key")) == null || str.length() == 0) {
                                return;
                            }
                            z4g.d().k(str);
                            return;
                        }
                        break;
                }
            }
            L l4 = L.a;
            l4.getClass();
            if (L.m(LoggerOutputTarget.NONE)) {
                return;
            }
            L.u(l4, L.LogType.w, new Object[]{go9.b("Anonymous push with such type does not exist: type = ", c2)});
            return;
        }
        if (z4g.d().w(push.b(), push.c())) {
            i(push, "unexpected_push_vkme");
            ine0.m(push, ahe0.f.b);
            return;
        }
        String c3 = push.c();
        if (epx.f(c3, "erase")) {
            String str3 = map.get("ids");
            if (str3 != null) {
                JSONArray jSONArray = new JSONArray(str3);
                k9x q = swe0.q(0, jSONArray.length());
                ArrayList arrayList = new ArrayList(c5g.u(q, 10));
                j9x it = q.iterator();
                while (it.d) {
                    arrayList.add(jSONArray.optString(it.nextInt()));
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    String str4 = (String) it2.next();
                    ca70 ca70Var2 = ca70.a;
                    ca70.a(this.a, str4, 1);
                }
            }
            String str5 = map.get("group_ids");
            if (str5 != null) {
                JSONArray jSONArray2 = new JSONArray(str5);
                try {
                    k9x q2 = swe0.q(0, jSONArray2.length());
                    ArrayList arrayList2 = new ArrayList(c5g.u(q2, 10));
                    j9x it3 = q2.iterator();
                    while (it3.d) {
                        arrayList2.add(jSONArray2.optString(it3.nextInt()));
                    }
                    ca70 ca70Var3 = ca70.a;
                    for (StatusBarNotification statusBarNotification : ((NotificationManager) context.getSystemService("notification")).getActiveNotifications()) {
                        if (arrayList2.contains(statusBarNotification.getNotification().extras.getString("group_id_extra_key"))) {
                            ca70 ca70Var4 = ca70.a;
                            ca70.a(this.a, statusBarNotification.getTag(), 1);
                        }
                    }
                    return;
                } catch (Exception e) {
                    L.i(e);
                    return;
                }
            }
            return;
        }
        if (epx.f(c3, NotificationCompat.CATEGORY_CALL)) {
            Map d = d(map);
            Long f = f(d);
            String str6 = (String) d.get("context");
            z4g.d().u(new JSONObject().put("to_id", f).put("type", (String) d.get("type")).put("body", str6 != null ? new JSONObject(str6) : new JSONObject()));
            return;
        }
        if (epx.f(c3, "log")) {
            try {
                String str7 = map.get("data");
                if (str7 == null) {
                    return;
                }
                z4g.d().A(new JSONObject(str7));
                return;
            } catch (Exception e2) {
                L.i(e2);
                return;
            }
        }
        if (epx.f(c3, "business_notify")) {
            L.e("[Push]: ImBgSyncHelper.handleBusinessNotify");
            z4g.d().t(null);
            String str8 = map.get("context");
            JSONObject jSONObject = str8 != null ? new JSONObject(str8) : new JSONObject();
            Serializer.c<MessageNotificationContainer> cVar = MessageNotificationContainer.CREATOR;
            long a2 = MessageNotificationContainer.a.a(jSONObject);
            int optInt = jSONObject.optInt("conversation_message_id", jSONObject.optInt("msg_id"));
            try {
                obj = vo8.b(a2).a();
            } catch (Throwable unused2) {
                obj = null;
            }
            BusinessNotifyNotificationInfo businessNotifyNotificationInfo = (BusinessNotifyNotificationInfo) obj;
            if (businessNotifyNotificationInfo != null && (list = businessNotifyNotificationInfo.d) != null) {
                iterable = j5g.D0(new uo8(0), list);
            }
            if (iterable == null) {
                iterable = EmptyList.b;
            }
            Iterable iterable2 = iterable;
            if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                Iterator it4 = iterable2.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    Integer num = ((PushBusinessNotify) it4.next()).b;
                    if (num != null && num.intValue() == optInt) {
                        if (!z) {
                            L l5 = L.a;
                            l5.getClass();
                            if (L.m(LoggerOutputTarget.NONE)) {
                                return;
                            }
                            L.u(l5, L.LogType.d, new Object[]{"[Push]: already shown(" + push.a() + ')'});
                            return;
                        }
                    }
                }
            }
            if (z4g.d().m(optInt, push.b().b, a2)) {
                L l6 = L.a;
                l6.getClass();
                if (L.m(LoggerOutputTarget.NONE)) {
                    return;
                }
                L.u(l6, L.LogType.d, new Object[]{"[Push]: msg already read(" + push.a() + ')'});
                return;
            }
            L l7 = L.a;
            l7.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l7, L.LogType.d, new Object[]{"[Push]: BusinessNotifyNotificationCache.addMsgPush(" + push.a() + ')'});
            }
            BusinessNotifyNotification.BusinessNotifyNotificationContainer businessNotifyNotificationContainer = new BusinessNotifyNotification.BusinessNotifyNotificationContainer(map);
            e870 e870Var = e870.b;
            vo8.a(businessNotifyNotificationContainer, e870.e(map));
            b(push);
            return;
        }
        if (epx.f(c3, "channel_activation_erase")) {
            L.e("[Push]: ImBgSyncHelper.deleteChannelActivationMessages");
            if (!BuildInfo.s()) {
                z4g.d().t(null);
            }
            String str9 = map.get("context");
            long optLong = (str9 != null ? new JSONObject(str9) : new JSONObject()).optLong("sender_id");
            String str10 = map.get("to_id");
            if (str10 != null) {
                byte[] bArr = x2r0.a;
                try {
                    j = Long.parseLong(str10);
                } catch (NumberFormatException unused3) {
                    j = 0;
                }
                l2 = Long.valueOf(j);
            }
            ca70 ca70Var5 = ca70.a;
            ca70.a(this.a, "channel_activation_notification_" + Long.valueOf(optLong) + '_' + l2, 1);
            return;
        }
        if (j5g.P(ule0.h, c3)) {
            String c4 = push.c();
            L.e("[Push]: ImBgSyncHelper.deletePushMessages");
            z4g.d().t(null);
            Map d2 = d(map);
            JSONObject jSONObject2 = new JSONObject((String) d2.get("cmid_items"));
            boolean equals = "erase_messages".equals(c4);
            Long f2 = f(d2);
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                long l8 = cqm0.l(next);
                int optInt2 = jSONObject2.optInt(next, 0);
                ra20 ra20Var = ra20.a;
                Context context2 = this.a;
                ra20Var.getClass();
                ra20.f(context2, l8, optInt2, f2, equals);
                Handler handler = wo8.a;
                wo8.c(this.a, l8, optInt2, equals);
                z320.b(this.a, l8, optInt2, equals);
            }
            return;
        }
        if (j5g.P(ule0.i, c3)) {
            String c5 = push.c();
            L.e("[Push]: ImBgSyncHelper.deletePushMessages");
            if (!BuildInfo.s()) {
                z4g.d().t(null);
            }
            Map d3 = d(map);
            String str11 = (String) d3.get("items");
            if (str11 == null) {
                throw new IllegalStateException("no items data in push");
            }
            JSONObject jSONObject3 = new JSONObject(str11);
            boolean equals2 = "community_msg_del_till".equals(c5);
            Long f3 = f(d3);
            jp9 jp9Var = new jp9(context, new iv3(context));
            Iterator<String> keys2 = jSONObject3.keys();
            while (keys2.hasNext()) {
                String next2 = keys2.next();
                jp9Var.b(cqm0.l(next2), jSONObject3.optInt(next2, 0), f3, equals2);
            }
            return;
        }
        if (j5g.P(ule0.c, c3)) {
            L.e("[Push]: ImBgSyncHelper.handleMsgRequest");
            z4g.d().t(null);
            b(push);
            return;
        }
        if (j5g.P(ule0.a, c3)) {
            Map e3 = e(map);
            Push push2 = new Push((Map<String, String>) e3, push.b, push.c);
            if (h(e3)) {
                L.e("[Push]: ImBgSyncHelper.handleMsgPushForSync");
                z4g.d().t(null);
                L.e("[Push]: badge update push");
                ine0.m(push2, ahe0.c.b);
                return;
            }
            String str12 = (String) d(e3).get("context");
            JSONObject jSONObject4 = str12 != null ? new JSONObject(str12) : new JSONObject();
            Serializer.c<MessageNotificationContainer> cVar2 = MessageNotificationContainer.CREATOR;
            long a3 = MessageNotificationContainer.a.a(jSONObject4);
            L l9 = L.a;
            l9.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l9, L.LogType.d, new Object[]{defpackage.k0.a(a3, "[Push]: ImBgSyncHelper.handleMsgPushForSync peerId=")});
            }
            z4g.d().t(Long.valueOf(a3));
            a(push2);
            return;
        }
        if (!j5g.P(ule0.b, c3)) {
            if (!epx.f(c3, "msg_reaction_del")) {
                if (epx.f(c3, "custom") && epx.f(map.get("subtype"), "community_msg")) {
                    ImFeatures imFeatures = ImFeatures.GROUPS_MESSENGER_DISABLED;
                    imFeatures.getClass();
                    if (!com.vk.toggle.b.A.a(imFeatures)) {
                        a(new Push((Map<String, String>) e(map), push.b, push.c));
                        return;
                    }
                }
                b(push);
                return;
            }
            JSONObject jSONObject5 = new JSONObject(map.get("items"));
            Iterator<String> keys3 = jSONObject5.keys();
            while (keys3.hasNext()) {
                String next3 = keys3.next();
                String str13 = "msg_reaction_notification_" + cqm0.l(next3) + '_' + jSONObject5.optInt(next3, 0);
                ca70 ca70Var6 = ca70.a;
                ca70.a(this.a, str13, 1);
            }
            return;
        }
        Map e4 = e(map);
        Push push3 = new Push((Map<String, String>) e4, push.b, push.c);
        L.e("[Push]: handleChannelMsgPush");
        if (!BuildInfo.s()) {
            z4g.d().t(null);
        }
        if (h(e4)) {
            L.e("[Push]: handleChannelMsgPush, badge update push");
            return;
        }
        UserId c6 = o25.a().c();
        if (!fkq0.c(c6)) {
            c6 = null;
        }
        Long valueOf = c6 != null ? Long.valueOf(c6.b) : null;
        Map d4 = d(e4);
        String str14 = (String) d4.get("context");
        JSONObject jSONObject6 = str14 != null ? new JSONObject(str14) : new JSONObject();
        Serializer.c<MessageNotificationContainer> cVar3 = MessageNotificationContainer.CREATOR;
        long a4 = MessageNotificationContainer.a.a(jSONObject6);
        int optInt3 = jSONObject6.optInt("conversation_message_id", jSONObject6.optInt("msg_id"));
        if (!z4g.d().F(a4)) {
            L l10 = L.a;
            l10.getClass();
            if (L.m(LoggerOutputTarget.NONE)) {
                return;
            }
            L.u(l10, L.LogType.d, new Object[]{"[Push]: handleChannelMsgPush, skip push for data " + d4});
            return;
        }
        if (epx.f(jSONObject6.optString("edited"), "true")) {
            L l11 = L.a;
            l11.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l11, L.LogType.d, new Object[]{"[Push]: handleChannelMsgPush, handleMsgEditPush for data " + d4});
            }
            long a5 = MessageNotificationContainer.a.a(jSONObject6);
            int optInt4 = jSONObject6.optInt("conversation_message_id", 0);
            String str15 = (String) d4.get("body");
            String str16 = str15 == null ? "" : str15;
            String str17 = (String) d4.get("title");
            String str18 = str17 == null ? "" : str17;
            e870 e870Var2 = e870.b;
            new azp0(new iv3(context)).a(a5, optInt4, str18, f(d4), str16, e870.c(d4), null, null);
            return;
        }
        Long f4 = f(d4);
        List e5 = v1b.b.a.e(Long.valueOf(a4), f4);
        if (!(e5 instanceof Collection) || !e5.isEmpty()) {
            Iterator it5 = e5.iterator();
            while (true) {
                if (!it5.hasNext()) {
                    break;
                }
                if (((PushMessage) it5.next()).b == optInt3) {
                    if (!push3.c) {
                        L l12 = L.a;
                        l12.getClass();
                        if (L.m(LoggerOutputTarget.NONE)) {
                            return;
                        }
                        L.u(l12, L.LogType.d, new Object[]{"[Push]: handleChannelMsgPush, already shown " + d4});
                        return;
                    }
                }
            }
        }
        if (valueOf != null && valueOf.equals(f4)) {
            z4g.d().getClass();
        }
        L l13 = L.a;
        l13.getClass();
        LoggerOutputTarget loggerOutputTarget = LoggerOutputTarget.NONE;
        if (!L.m(loggerOutputTarget)) {
            L.u(l13, L.LogType.d, new Object[]{"[Push]: handleChannelMsgPush, add push to cache " + d4});
        }
        v1b.b.a.a(new MessageNotificationContainer(d4), e870.e(d4), e870.c(d4), e870.d().g() ? null : (String) d4.get("photo_url"));
        Map map2 = ttp0.g(d4) ? d4 : null;
        if (map2 == null) {
            map2 = new LinkedHashMap(d4);
        }
        if (z4g.d().z()) {
            String str19 = (String) map2.get("sound");
            if (str19 == null) {
                str19 = "1";
            }
        }
        if (!L.m(loggerOutputTarget)) {
            L.u(l13, L.LogType.d, new Object[]{"[Push]: handleChannelMsgPush, create notification " + d4});
        }
        b(new Push((Map<String, String>) map2, push3.b, push3.c));
    }

    public final void i(Push push, String str) {
        Map<String, String> map = push.a;
        ((p6i) this.b.getValue()).getClass();
        if (p6i.a()) {
            return;
        }
        if (str != null) {
            L l = L.a;
            l.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l, L.LogType.w, new Object[]{"Error:".concat(str)});
            }
        }
        if (map.get(AndroidDynamicDeviceInfoDataSource.KEY_STAT_CONTENT) != null) {
            z4g.d().f("receive", push.c(), map.get(AndroidDynamicDeviceInfoDataSource.KEY_STAT_CONTENT), str, push.b.i(), map.get("to_id"), null);
        }
    }
}
