package xsna;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailability;
import com.huawei.hms.framework.common.BundleUtil;
import com.vk.core.preference.Preference;
import com.vk.push.core.utils.CoroutineExtensionsKt;
import com.vk.pushes.dto.MessageNotificationInfo;
import com.vk.pushes.dto.PushMessage;
import com.vk.pushes.notifications.im.MessageNotificationContainer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.yye0;

/* compiled from: CastManagerGetter.kt */
/* loaded from: classes2.dex */
public final class c0a implements yye0.a {
    public final Object b;
    public Object c;

    public /* synthetic */ c0a(Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(MessageNotificationContainer messageNotificationContainer, String str, String str2, String str3) {
        Object obj;
        String str4;
        String str5;
        String str6;
        int i;
        Iterator it;
        int i2;
        long j = messageNotificationContainer.z;
        try {
            obj = f(j, messageNotificationContainer.j()).a();
        } catch (Throwable unused) {
            obj = null;
        }
        MessageNotificationInfo messageNotificationInfo = (MessageNotificationInfo) obj;
        List<PushMessage> list = messageNotificationInfo != null ? messageNotificationInfo.e : null;
        if (list == null) {
            list = EmptyList.b;
        }
        ArrayList arrayList = new ArrayList(j5g.I0(100, list));
        if (messageNotificationContainer.l()) {
            str4 = messageNotificationContainer.o;
        } else {
            str4 = messageNotificationContainer.e;
            if (str4 == null) {
                str5 = "";
                String str7 = messageNotificationContainer.g;
                str6 = str7 != null ? str7 : "";
                i = 0;
                if (str6.length() > 200) {
                    str6 = str6.substring(0, 199).concat("...");
                }
                String str8 = str6;
                int i3 = messageNotificationContainer.A;
                Long l = messageNotificationContainer.B;
                PushMessage pushMessage = new PushMessage(i3, str5, str8, str2, messageNotificationContainer.v, false, l == null ? l.longValue() : 0L, 32, null);
                it = arrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        arrayList.add(pushMessage);
                        break;
                    }
                    i2 = i + 1;
                    PushMessage pushMessage2 = (PushMessage) it.next();
                    if (messageNotificationContainer.A == pushMessage2.b) {
                        arrayList.set(i, PushMessage.zb(pushMessage, 0, null, null, null, pushMessage2.g, 95));
                        break;
                    }
                    i = i2;
                }
                wmi0.a.a(c(j, messageNotificationContainer.j()), new MessageNotificationInfo(messageNotificationContainer, str, str2, arrayList, str3));
            }
        }
        str5 = str4;
        String str72 = messageNotificationContainer.g;
        if (str72 != null) {
        }
        i = 0;
        if (str6.length() > 200) {
        }
        String str82 = str6;
        int i32 = messageNotificationContainer.A;
        Long l2 = messageNotificationContainer.B;
        PushMessage pushMessage3 = new PushMessage(i32, str5, str82, str2, messageNotificationContainer.v, false, l2 == null ? l2.longValue() : 0L, 32, null);
        it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
            }
            i = i2;
        }
        wmi0.a.a(c(j, messageNotificationContainer.j()), new MessageNotificationInfo(messageNotificationContainer, str, str2, arrayList, str3));
    }

    @Override // xsna.yye0.a
    public void b() {
        CoroutineExtensionsKt.safeResume((lq9) this.b, ((o1i0) this.c).c.getdefaulv2("com.vk.push.authsdk"));
    }

    public String c(long j, Long l) {
        StringBuilder sb = new StringBuilder();
        tj0.d(sb, (String) this.b, j, BundleUtil.UNDERLINE_TAG);
        sb.append(l);
        return sb.toString();
    }

    @Override // xsna.yye0.a
    public void d(Throwable th) {
        CoroutineExtensionsKt.safeResumeWithException((lq9) this.b, new IllegalStateException("Library loading was failed", th));
    }

    public List e(Long l, Long l2) {
        Object obj;
        List<PushMessage> list;
        try {
            obj = f(l.longValue(), l2).a();
        } catch (Throwable unused) {
            obj = null;
        }
        MessageNotificationInfo messageNotificationInfo = (MessageNotificationInfo) obj;
        if (messageNotificationInfo != null && (list = messageNotificationInfo.e) != null) {
            List D0 = j5g.D0(new yje0(), list);
            if (D0 != null) {
                return D0;
            }
        }
        return EmptyList.b;
    }

    public io.reactivex.rxjava3.core.q f(long j, Long l) {
        return wmi0.a.h(c(j, l));
    }

    public fbr0 g() {
        return (fbr0) this.c;
    }

    public e5p h() {
        d5p d5pVar = (d5p) ((w3p) this.b).c.get((f5p) this.c);
        e5p i = d5pVar != null ? d5pVar.i() : null;
        if (i != null) {
            return i;
        }
        return null;
    }

    public c0a(Context context) {
        this.b = Preference.h(context, 0, "odt_storage");
        this.c = new mkl();
    }

    public c0a(Context context, gzs gzsVar) {
        this.b = gzsVar;
        if (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context.getApplicationContext()) == 0) {
            pw pwVar = new pw(3, this, context);
            Context context2 = e43.a;
            if (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable((context2 == null ? null : context2).getApplicationContext()) != 0 || fxc0.B().J().V0()) {
                return;
            }
            if (!a0a.b) {
                wvv.b(wvv.a, new zz9(0, context, pwVar), 0L, 0L, 14);
            } else {
                pwVar.invoke();
            }
        }
    }
}
