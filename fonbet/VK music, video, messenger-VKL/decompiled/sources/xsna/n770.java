package xsna;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.vk.pushes.receivers.NotificationActionsReceiver;
import com.vk.pushes.receivers.NotificationActionsTrampolineActivity;
import java.util.Set;

/* compiled from: NotificationActions.kt */
/* loaded from: classes5.dex */
public final class n770 {
    public static final Set<String> a = rl3.y0(new String[]{"gift_send", "accept_money", "send_money", "msg_request_view", "comment_send", "voip_callback_on_missed", "music_subscription_clicked", "api_call_input", "custom"});

    /* compiled from: NotificationActions.kt */
    public static final class a {
        public static void a(Intent intent, b bVar) {
            String str = bVar.a;
            String str2 = bVar.f;
            intent.setAction(str);
            intent.setType("push_type_key");
            intent.putExtra("notification_tag_id_key", bVar.b);
            intent.putExtra("push_type_key", bVar.c);
            String str3 = bVar.d;
            if (str3 != null) {
                intent.putExtra("stat_key", str3);
            }
            if (bVar.e != null) {
                intent.putExtra("track_interaction_key", true);
            }
            if (str2 == null || str2.length() == 0) {
                return;
            }
            intent.putExtra("subtype", str2);
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public static Intent b(Context context, b bVar) {
            Class cls;
            String str;
            Bundle bundle = bVar.g;
            String str2 = bVar.a;
            cls = NotificationActionsReceiver.class;
            switch (str2.hashCode()) {
                case -1991355703:
                    if (str2.equals("accept_money")) {
                        Intent p = z4g.d().p(context, bundle != null ? bundle.getInt("transfer_id", 0) : 0, bundle != null ? bundle.getString("accept_url") : null);
                        Set<String> set = n770.a;
                        a(p, bVar);
                        return p;
                    }
                    break;
                case -1349088399:
                    if (str2.equals("custom")) {
                        return c(context, bVar);
                    }
                    break;
                case -912007698:
                    if (str2.equals("api_call_input")) {
                        String string = bundle != null ? bundle.getString("query") : null;
                        String string2 = bundle != null ? bundle.getString("url") : null;
                        if (string != null && string2 != null) {
                            return c(context, bVar);
                        }
                        Intent intent = new Intent(context, (Class<?>) cls);
                        Set<String> set2 = n770.a;
                        a(intent, bVar);
                        intent.putExtra("query", string);
                        return intent;
                    }
                    break;
                case 821988681:
                    if (str2.equals("send_money")) {
                        long j = bundle != null ? bundle.getLong("from_id_key", 0L) : 0L;
                        if (bundle == null || (str = bundle.getString("amount_key")) == null) {
                            str = "";
                        }
                        if (bundle != null) {
                            bundle.getString("currency_key");
                        }
                        Intent K = z4g.d().K(context, j, str);
                        Set<String> set3 = n770.a;
                        a(K, bVar);
                        return K;
                    }
                    break;
            }
            Intent intent2 = new Intent(context, (Class<?>) (d(str2) ? NotificationActionsTrampolineActivity.class : NotificationActionsReceiver.class));
            Set<String> set4 = n770.a;
            a(intent2, bVar);
            return intent2;
        }

        public static Intent c(Context context, b bVar) {
            String str;
            Bundle bundle = bVar.g;
            if (bundle == null || (str = bundle.getString("url")) == null) {
                str = "";
            }
            Intent r = z4g.d().r(context, str);
            Set<String> set = n770.a;
            a(r, bVar);
            r.setData(Uri.parse(str));
            return r;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x001d, code lost:
        
            r3 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x002d, code lost:
        
            if (com.vk.toggle.d.C().a == false) goto L10;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x003f, code lost:
        
            if (com.vk.toggle.d.B().a == false) goto L10;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0057, code lost:
        
            if (com.vk.toggle.d.C().b == false) goto L10;
         */
        /* JADX WARN: Code restructure failed: missing block: B:6:0x0019, code lost:
        
            if (com.vk.toggle.d.C().c == false) goto L10;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
        
            r3 = true;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static boolean d(String str) {
            boolean contains;
            switch (str.hashCode()) {
                case -2085622897:
                    if (str.equals("action_video_watch_later")) {
                        break;
                    }
                    contains = n770.a.contains(str);
                    break;
                case -486578593:
                    if (str.equals("action_live_not_interested")) {
                        break;
                    }
                    contains = n770.a.contains(str);
                    break;
                case 257390818:
                    if (str.equals("action_video_not_interested")) {
                        break;
                    }
                    contains = n770.a.contains(str);
                    break;
                case 1598405877:
                    if (str.equals("action_video_download")) {
                        break;
                    }
                    contains = n770.a.contains(str);
                    break;
                default:
                    contains = n770.a.contains(str);
                    break;
            }
            if (contains) {
                Context context = e43.a;
                if (context == null) {
                    context = null;
                }
                if (context.getApplicationInfo().targetSdkVersion >= 31) {
                    return true;
                }
            }
            return false;
        }
    }

    /* compiled from: NotificationActions.kt */
    public static final class b {
        public final String a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;
        public final Bundle g;

        public b(String str, String str2, String str3, String str4, String str5, Bundle bundle, int i) {
            String str6 = (i & 32) != 0 ? null : "new_type";
            bundle = (i & 64) != 0 ? null : bundle;
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
            this.f = str6;
            this.g = bundle;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && epx.f(this.d, bVar.d) && epx.f(this.e, bVar.e) && epx.f(this.f, bVar.f) && epx.f(this.g, bVar.g);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            String str = this.b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.c;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.d;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.e;
            int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f;
            int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            Bundle bundle = this.g;
            return hashCode6 + (bundle != null ? bundle.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("IntentModel(action=");
            sb.append(this.a);
            sb.append(", notificationTagId=");
            sb.append(this.b);
            sb.append(", pushType=");
            sb.append(this.c);
            sb.append(", stat=");
            sb.append(this.d);
            sb.append(", trackInteraction=");
            sb.append(this.e);
            sb.append(", subtype=");
            sb.append(this.f);
            sb.append(", args=");
            return uf3.c(sb, this.g, ')');
        }
    }
}
