package xsna;

import android.annotation.SuppressLint;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import androidx.core.graphics.drawable.IconCompat;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.preference.Preference;
import com.vk.dto.common.id.UserId;
import com.vk.im.ui.components.msg_list.MsgListOpenAtUnreadMode;
import com.vk.pushes.NotificationUtils;
import com.vk.pushes.dto.PushMessage;
import com.vk.pushes.notifications.im.MessageNotificationContainer;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import xsna.c2r0;
import xsna.lsn;

/* compiled from: MessageNotification.kt */
/* loaded from: classes5.dex */
public class pa20 extends dfq0 {
    public final Bitmap A;
    public final Bitmap B;
    public final Intent C;
    public final gzs<s3q0> D;
    public final gzs<s3q0> E;
    public final bpn0 F;
    public final String G;
    public final String H;
    public final NotificationUtils.Type I;
    public final String J;
    public final String K;
    public final boolean L;
    public final boolean M;
    public final Object N;
    public final boolean O;
    public final boolean P;
    public final List<PushMessage> Q;
    public final Object R;
    public final MessageNotificationContainer z;

    public /* synthetic */ pa20(Context context, MessageNotificationContainer messageNotificationContainer, Bitmap bitmap, List list, Intent intent, gzs gzsVar, gzs gzsVar2, int i) {
        this(context, messageNotificationContainer, bitmap, bitmap, (List<PushMessage>) list, (i & 32) != 0 ? null : intent, (gzs<s3q0>) ((i & 64) != 0 ? new l35(19) : gzsVar), (gzs<s3q0>) ((i & 128) != 0 ? new x5(24) : gzsVar2));
    }

    @Override // xsna.dfq0
    public final Intent C() {
        Intent intent = this.C;
        if (intent == null) {
            intent = E();
        }
        intent.setComponent(new ComponentName(this.c, z4g.d().s()));
        intent.putExtra("withoutAnimation", true);
        intent.putExtra("from_push", true);
        intent.putExtra("push_action", "open_url");
        intent.putExtra("notification_tag_id_key", f());
        MessageNotificationContainer messageNotificationContainer = this.z;
        intent.putExtra("push_type_key", messageNotificationContainer.a("type"));
        String a = messageNotificationContainer.a(AndroidDynamicDeviceInfoDataSource.KEY_STAT_CONTENT);
        if (a != null) {
            intent.putExtra("stat_key", a);
        }
        String a2 = messageNotificationContainer.a("need_track_interaction");
        if (a2 != null) {
            intent.putExtra("track_interaction_key", a2);
        }
        return intent;
    }

    public NotificationCompat.a D() {
        Intent k = k(null, "msg_mark_as_read");
        MessageNotificationContainer messageNotificationContainer = this.z;
        k.putExtra("peer_id", messageNotificationContainer.z);
        k.putExtra("msg_cnv_id", messageNotificationContainer.A);
        NotificationCompat.a.C0022a c0022a = new NotificationCompat.a.C0022a(R.drawable.vk_icon_done_24, this.c.getString(R.string.notification_mark_as_read), l(k));
        c0022a.e.putBundle("android.wearable.EXTENSIONS", ar.b(5, "flags"));
        c0022a.h = false;
        c0022a.g = 2;
        return c0022a.b();
    }

    public Intent E() {
        o0w b = g2v.c().b();
        MessageNotificationContainer messageNotificationContainer = this.z;
        Long j = messageNotificationContainer.j();
        long j2 = messageNotificationContainer.z;
        MsgListOpenAtUnreadMode msgListOpenAtUnreadMode = MsgListOpenAtUnreadMode.b;
        Class<? extends FragmentImpl> D = g2v.c().b().D();
        PushMessage pushMessage = (PushMessage) j5g.a0(J());
        return o0w.j(b, this.c, j, j2, null, msgListOpenAtUnreadMode, "message_push", D, pushMessage != null ? Integer.valueOf(pushMessage.b) : null, 33529816);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
    
        if (xsna.myc0.f(r2) != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CharSequence F(CharSequence charSequence, CharSequence charSequence2) {
        if (A()) {
            return xpg0.a(this.c.getString(R.string.hided_notification_hidden_content));
        }
        if (this.z.l()) {
            if (myc0.f(charSequence) && myc0.f(charSequence2)) {
                charSequence = String.format("%s: %s", Arrays.copyOf(new Object[]{charSequence, charSequence2}, 2));
            }
            return xpg0.a(charSequence);
        }
        charSequence = charSequence2;
        return xpg0.a(charSequence);
    }

    public boolean G() {
        return this.O;
    }

    public boolean H() {
        return this.P;
    }

    public final CharSequence I() {
        return B(this.c.getResources().getQuantityString(R.plurals.notification_msg_unread, J().size(), Integer.valueOf(J().size())));
    }

    public final ArrayList J() {
        List<PushMessage> list = this.Q;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!((PushMessage) obj).g) {
                arrayList.add(obj);
            }
        }
        if (!A()) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(PushMessage.zb((PushMessage) it.next(), 0, "", this.c.getString(R.string.hided_notification_hidden_content), "", false, 113));
        }
        return arrayList2;
    }

    @Override // com.vk.pushes.notifications.base.a, xsna.ri6
    public Intent b() {
        Intent b = super.b();
        b.setAction("delete_push_message_cache");
        MessageNotificationContainer messageNotificationContainer = this.z;
        b.putExtra("peer_id", messageNotificationContainer.z);
        b.putExtra("owner_id", messageNotificationContainer.j());
        return b;
    }

    @Override // com.vk.pushes.notifications.base.a, xsna.ri6
    public String c() {
        return this.G;
    }

    @Override // com.vk.pushes.notifications.base.a, xsna.ri6
    public String f() {
        return this.H;
    }

    @Override // xsna.ri6
    @SuppressLint({"NewApi"})
    public final void g(NotificationManager notificationManager) {
        int size;
        super.g(notificationManager);
        ca70 ca70Var = ca70.a;
        if (ca70.g()) {
            ra20 ra20Var = ra20.a;
            MessageNotificationContainer messageNotificationContainer = this.z;
            Long j = messageNotificationContainer.j();
            ra20Var.getClass();
            int d = ra20.d(notificationManager, j);
            if (d > 1) {
                String c = c();
                dtt dttVar = (dtt) this.F.getValue();
                if (dttVar.c.a()) {
                    size = dttVar.b.g().size();
                } else {
                    r55 r55Var = r55.a;
                    List<c2r0.b> h = ((yui) r55.j()).h(dttVar.a, true);
                    size = h != null ? h.size() : 0;
                }
                boolean z = size > 1;
                Long j2 = messageNotificationContainer.j();
                String str = messageNotificationContainer.x;
                new q920(this.c, d, c, z, j2, String.valueOf(str != null ? B(str) : null), new nuv(this, 9)).g(notificationManager);
            }
        }
        ra20.a.getClass();
        if (gz80.a(30)) {
            bhj0.i(this.c, Collections.singletonList(f()));
        }
    }

    @Override // xsna.ri6
    public final void i() {
        this.E.invoke();
    }

    @Override // xsna.ri6
    public final void j() {
        this.D.invoke();
    }

    @Override // com.vk.pushes.notifications.base.a
    public final Collection<NotificationCompat.a> m() {
        if (A()) {
            return EmptyList.b;
        }
        MessageNotificationContainer messageNotificationContainer = this.z;
        Long l = messageNotificationContainer.w;
        UserId userId = l != null ? new UserId(l.longValue()) : null;
        if ((userId != null && !o25.a().a(userId)) || !gz80.a(24) || messageNotificationContainer.p) {
            return EmptyList.b;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        Bundle bundle = new Bundle();
        Context context = this.c;
        kvf0 kvf0Var = new kvf0("message", context.getString(R.string.reply_to), null, true, 0, bundle, hashSet);
        Intent k = k(null, "msg_send");
        k.putExtra("peer_id", messageNotificationContainer.z);
        k.putExtra("msg_cnv_id", messageNotificationContainer.A);
        k.putExtra("entry_point", "message_push_reply");
        NotificationCompat.a.C0022a c0022a = new NotificationCompat.a.C0022a(R.drawable.vk_icon_reply_24, context.getString(R.string.reply_to), l(k));
        c0022a.d = true;
        c0022a.a(kvf0Var);
        Bundle bundle2 = new Bundle();
        bundle2.putInt("flags", 5);
        c0022a.e.putBundle("android.wearable.EXTENSIONS", bundle2);
        c0022a.h = false;
        c0022a.g = 1;
        p4g.a(c0022a.b(), arrayList, H());
        arrayList.add(D());
        return arrayList;
    }

    @Override // xsna.dfq0, com.vk.pushes.notifications.base.a
    public final void o(NotificationCompat.h hVar) {
        Bitmap bitmap;
        hVar.e(true);
        ArrayList J = J();
        PushMessage pushMessage = (PushMessage) j5g.i0(J);
        CharSequence F = F(this.z.o, this.p);
        zgj0 zgj0Var = null;
        hVar.f = NotificationCompat.h.d(F != null ? B(F) : null);
        hVar.D(B(String.format("%s: %s", Arrays.copyOf(new Object[]{pushMessage.c, pushMessage.d}, 2))));
        hVar.I.when = pushMessage.f;
        if (gz80.a(24) && J.size() > 1) {
            CharSequence I = I();
            if (myc0.f(I)) {
                hVar.C(I);
            }
        }
        Intent intent = this.C;
        if (intent != null && intent.getBooleanExtra("auto_cancel", false)) {
            hVar.e(true);
        }
        if (!this.z.t) {
            hVar.J = true;
        }
        ra20.a.getClass();
        if (gz80.a(30)) {
            if (!A() && (bitmap = this.B) != null) {
                IconCompat c = IconCompat.c(bitmap);
                String str = this.z.e;
                if (str != null) {
                    Intent launchIntentForPackage = this.c.getPackageManager().getLaunchIntentForPackage(this.c.getPackageName());
                    if (launchIntentForPackage != null) {
                        launchIntentForPackage.setPackage(null);
                        launchIntentForPackage.addFlags(268468224);
                        s3q0 s3q0Var = s3q0.a;
                    } else {
                        launchIntentForPackage = null;
                    }
                    fhj0 fhj0Var = fhj0.a;
                    Intent intent2 = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, fhj0.a(this.z.z, a0a.d));
                    intent2.setPackage(this.c.getPackageName());
                    intent2.putExtra("__source_from_shortcut", true);
                    s3q0 s3q0Var2 = s3q0.a;
                    Intent[] intentArr = {launchIntentForPackage, intent2};
                    Context context = this.c;
                    String f = f();
                    zgj0 zgj0Var2 = new zgj0();
                    zgj0Var2.a = context;
                    zgj0Var2.b = f;
                    zgj0Var2.h = c;
                    zgj0Var2.e = str;
                    zgj0Var2.l = true;
                    zgj0Var2.k = new c000(f());
                    j1a0 j1a0Var = new j1a0();
                    j1a0Var.a = str;
                    j1a0Var.b = c;
                    j1a0Var.c = null;
                    j1a0Var.d = null;
                    j1a0Var.e = false;
                    j1a0Var.f = false;
                    zgj0Var2.i = new j1a0[]{j1a0Var};
                    PersistableBundle persistableBundle = new PersistableBundle();
                    persistableBundle.putLong("creator_user_id", this.z.z);
                    zgj0Var2.n = persistableBundle;
                    zgj0Var2.c = intentArr;
                    if (TextUtils.isEmpty(zgj0Var2.e)) {
                        throw new IllegalArgumentException("Shortcut must have a non-empty label");
                    }
                    Intent[] intentArr2 = zgj0Var2.c;
                    if (intentArr2 == null || intentArr2.length == 0) {
                        throw new IllegalArgumentException("Shortcut must have an intent");
                    }
                    zgj0Var = zgj0Var2;
                }
            }
            if (zgj0Var == null) {
                return;
            }
            bhj0.g(this.c, zgj0Var);
            hVar.x(zgj0Var);
        }
    }

    @Override // com.vk.pushes.notifications.base.a
    public final void p(NotificationCompat.n nVar) {
        lsn.a aVar;
        lsn.a aVar2;
        super.p(nVar);
        if (G()) {
            List<Long> list = lsn.a;
            MessageNotificationContainer messageNotificationContainer = this.z;
            Long valueOf = Long.valueOf(messageNotificationContainer.z);
            List<Integer> list2 = lsn.c;
            SharedPreferences f = Preference.f("notify");
            Context context = this.c;
            String[] stringArray = context.getResources().getStringArray(R.array.dnd_options);
            int i = f.getInt(String.format("chat_enabled_time%d", Arrays.copyOf(new Object[]{valueOf}, 1)), 0);
            xuo0.a.getClass();
            if (xuo0.a() - i > lsn.b) {
                aVar = new lsn.a(list2.get(0).intValue(), stringArray[0]);
            } else {
                int indexOf = list2.indexOf(Integer.valueOf(f.getInt(String.format("chat_dnd_period%d", Arrays.copyOf(new Object[]{valueOf}, 1)), 0)));
                if (indexOf == list2.size() - 1) {
                    aVar2 = new lsn.a(list2.get(indexOf).intValue(), stringArray[indexOf]);
                } else if (indexOf < 0 || indexOf >= list2.size()) {
                    aVar = new lsn.a(list2.get(0).intValue(), stringArray[0]);
                } else {
                    int i2 = indexOf + 1;
                    aVar2 = new lsn.a(list2.get(i2).intValue(), stringArray[i2]);
                }
                aVar = aVar2;
            }
            Intent k = k(null, "dnd");
            k.putExtra("peer_id", messageNotificationContainer.z);
            k.putExtra("dnd_time", aVar.a);
            NotificationCompat.a.C0022a c0022a = new NotificationCompat.a.C0022a(R.drawable.vk_icon_do_not_disturb_24, context.getString(R.string.chat_dnd) + ' ' + aVar.b, l(k));
            c0022a.e.putBundle("android.wearable.EXTENSIONS", new Bundle());
            c0022a.g = 6;
            nVar.a.add(c0022a.b());
        }
    }

    @Override // com.vk.pushes.notifications.base.a
    public final String q() {
        return this.K;
    }

    @Override // com.vk.pushes.notifications.base.a
    public final boolean s() {
        return this.M;
    }

    @Override // xsna.dfq0
    public String toString() {
        return "MessageNotification(notify=" + this.z + ')';
    }

    @Override // com.vk.pushes.notifications.base.a
    public final String u() {
        return this.J;
    }

    @Override // com.vk.pushes.notifications.base.a
    public final boolean v() {
        return this.L;
    }

    @Override // com.vk.pushes.notifications.base.a
    public NotificationUtils.Type w() {
        return this.I;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.pushes.notifications.base.a
    public final NotificationCompat.m x() {
        return (NotificationCompat.m) this.N.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pa20(Context context, MessageNotificationContainer messageNotificationContainer, Bitmap bitmap, Bitmap bitmap2, List<PushMessage> list, Intent intent, gzs<s3q0> gzsVar, gzs<s3q0> gzsVar2) {
        super(context, messageNotificationContainer, gz80.a(30) ? null : bitmap2);
        String str;
        long j = messageNotificationContainer.z;
        ra20.a.getClass();
        this.z = messageNotificationContainer;
        this.A = bitmap;
        this.B = bitmap2;
        this.C = intent;
        this.D = gzsVar;
        this.E = gzsVar2;
        this.F = new bpn0(new wo1(8, context, this));
        if (j != 0) {
            if (com.vk.dto.common.b.a(messageNotificationContainer.z)) {
                x870 x870Var = x870.a;
                str = "group_chats_ver2";
            } else {
                x870 x870Var2 = x870.a;
                str = "private_messages_ver2";
            }
            this.G = str;
            this.H = "msg_notification_" + Long.valueOf(j) + '_' + messageNotificationContainer.j();
            this.I = NotificationUtils.Type.PrivateMessages;
            this.J = "message_group_group_msg_notification_" + messageNotificationContainer.j();
            this.K = NotificationCompat.CATEGORY_MESSAGE;
            this.L = messageNotificationContainer.t;
            this.M = messageNotificationContainer.u;
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
            this.N = msy.a(lazyThreadSafetyMode, new s1x(this, 10));
            this.O = !messageNotificationContainer.p;
            this.P = !messageNotificationContainer.q;
            this.Q = list;
            this.R = msy.a(lazyThreadSafetyMode, new vq6(14, context, this));
            return;
        }
        throw new IllegalArgumentException("peerId=0");
    }
}
