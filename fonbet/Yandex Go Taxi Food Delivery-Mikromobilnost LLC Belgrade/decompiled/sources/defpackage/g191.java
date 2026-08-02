package defpackage;

import android.app.Activity;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.RectF;
import android.media.AudioAttributes;
import android.media.RingtoneManager;
import android.net.Uri;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.core.app.s0;
import androidx.media3.container.ObuParser$NotYetImplementedException;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.yandex.div2.DivSizeUnit;
import com.yandex.go.pickup_from_photo.api.PickupFromPhotoEntryPointAnalytics$EntryPointScreen;
import com.yandex.go.pickup_from_photo.api.PickupFromPhotoPayload$Origin;
import com.yandex.go.user_profile.ui.am.s;
import io.appmetrica.analytics.rtm.internal.Constants;
import io.flutter.view.AccessibilityBridge;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.collections.a;
import org.json.JSONException;
import org.webrtc.MediaStreamTrack;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.settings.profile.rating.PassengerRatingInfoDialog;
import ru.yandex.video.m3.player.impl.tracking.StrmManagerImplKt;

/* loaded from: classes11.dex */
public class g191 implements q0z0, f3u, ee5, fa0, qty, zx0, m11, b5v0, cl90, v9x0, bl3, wyt {
    public static g191 b;
    public static final long[] c = {0, 0};
    public static final String[] w = {"_data"};
    public static final Object x = new Object();
    public static final Object y = new Object();
    public static volatile g191 z;
    public Object a;

    public g191(Context context, dh60 dh60Var) {
        Object systemService = context.getSystemService("notification");
        Objects.requireNonNull(systemService);
        s0 s0Var = new s0(context);
        Object systemService2 = context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        Objects.requireNonNull(systemService2);
        this.a = dh60Var;
        NotificationChannel notificationChannel = new NotificationChannel("ringing_calls_v5", context.getString(oyh0.call_ringing_notification_channel_name), 4);
        NotificationManager notificationManager = s0Var.b;
        NotificationChannel notificationChannel2 = notificationManager.getNotificationChannel("ringing_calls_v1");
        if (notificationChannel2 != null) {
            s0Var.c(notificationChannel2.getId());
        }
        F(notificationChannel);
        NotificationChannel notificationChannel3 = notificationManager.getNotificationChannel("ringing_calls_v2");
        long[] jArr = c;
        if (notificationChannel3 != null) {
            notificationChannel.setLightColor(notificationChannel3.getLightColor());
            notificationChannel.enableLights(notificationChannel3.shouldShowLights());
            notificationChannel.setShowBadge(notificationChannel3.canShowBadge());
            notificationChannel.setLockscreenVisibility(notificationChannel3.getLockscreenVisibility());
            notificationChannel.setBypassDnd(notificationChannel3.canBypassDnd());
            notificationChannel.enableVibration(notificationChannel3.shouldVibrate());
            notificationChannel.setSound(RingtoneManager.getDefaultUri(1), new AudioAttributes.Builder().setUsage(6).setContentType(4).build());
            notificationChannel.setVibrationPattern(jArr);
            s0Var.c(notificationChannel3.getId());
        } else {
            F(notificationChannel);
        }
        NotificationChannel notificationChannel4 = notificationManager.getNotificationChannel("ringing_calls_v3");
        if (notificationChannel4 != null) {
            notificationChannel.setLightColor(notificationChannel4.getLightColor());
            notificationChannel.enableLights(notificationChannel4.shouldShowLights());
            notificationChannel.setShowBadge(notificationChannel4.canShowBadge());
            notificationChannel.setLockscreenVisibility(notificationChannel4.getLockscreenVisibility());
            notificationChannel.setBypassDnd(notificationChannel4.canBypassDnd());
            notificationChannel.setVibrationPattern(jArr);
            s0Var.c(notificationChannel4.getId());
        } else {
            F(notificationChannel);
        }
        NotificationChannel notificationChannel5 = notificationManager.getNotificationChannel("ringing_calls_v4");
        if (notificationChannel5 != null) {
            notificationChannel.setLightColor(notificationChannel5.getLightColor());
            notificationChannel.enableLights(notificationChannel5.shouldShowLights());
            notificationChannel.setShowBadge(notificationChannel5.canShowBadge());
            notificationChannel.setLockscreenVisibility(notificationChannel5.getLockscreenVisibility());
            notificationChannel.setBypassDnd(notificationChannel5.canBypassDnd());
            dh60Var.getClass();
            notificationChannel.setGroup("messenger_notifications_group");
            s0Var.c(notificationChannel5.getId());
        } else {
            F(notificationChannel);
        }
        s0Var.b(notificationChannel);
    }

    public static g191 G(ByteArrayOutputStream byteArrayOutputStream) {
        return new g191(byteArrayOutputStream);
    }

    public static g191 H(ByteArrayOutputStream byteArrayOutputStream) {
        return new eqf(byteArrayOutputStream);
    }

    public static int L(int i) {
        if (i < 128) {
            return 1;
        }
        int i2 = 2;
        while (true) {
            i >>>= 8;
            if (i == 0) {
                return i2;
            }
            i2++;
        }
    }

    public static int M(int i, boolean z2) {
        return L(i) + (z2 ? 1 : 0) + i;
    }

    public static int N(int i) {
        if (i < 31) {
            return 1;
        }
        int i2 = 2;
        while (true) {
            i >>>= 7;
            if (i == 0) {
                return i2;
            }
            i2++;
        }
    }

    public static String O(qv0 qv0Var, hyq hyqVar) {
        if (hyqVar.equals(cyq.a)) {
            return qv0Var.c;
        }
        if (hyqVar.equals(fyq.a)) {
            return qv0Var.d;
        }
        if (hyqVar.equals(gyq.a)) {
            return qv0Var.b;
        }
        if (hyqVar.equals(eyq.a)) {
            return qv0Var.f;
        }
        if (hyqVar.equals(dyq.a)) {
            return qv0Var.e;
        }
        w511.b();
        return null;
    }

    public static synchronized g191 f0(Context context) {
        g191 g191Var;
        synchronized (g191.class) {
            Context applicationContext = context.getApplicationContext();
            synchronized (g191.class) {
                g191Var = b;
                if (g191Var == null) {
                    g191Var = new g191(applicationContext, 0);
                    b = g191Var;
                }
            }
            return g191Var;
        }
        return g191Var;
    }

    @Override // defpackage.b5v0
    public void A(String str, String str2, String str3, String str4, long j) {
        e51 e51Var = (e51) this.a;
        HashMap t = n.t(e51Var);
        if (str2 != null) {
            t.put("address_search", str2);
        }
        if (str3 != null) {
            t.put("suggest_serpid", str3);
        }
        t.put("event_milli_timestamp", Long.valueOf(j));
        t.put("client_reqid", str);
        if (str4 != null) {
            t.put("MainScreenVersion", str4);
        }
        e51Var.a.a("address_search.SuggestFormClose", t, 1, new HashMap());
    }

    @Override // defpackage.b5v0
    public boolean B(a5v0 a5v0Var, boolean z2) {
        e51 e51Var = (e51) this.a;
        long j = a5v0Var.a;
        String str = a5v0Var.b;
        String str2 = a5v0Var.c;
        String str3 = a5v0Var.d;
        String str4 = a5v0Var.e;
        HashMap t = n.t(e51Var);
        if (str2 != null) {
            t.put("address_search", str2);
        }
        if (str3 != null) {
            t.put("suggest_serpid", str3);
        }
        t.put("event_milli_timestamp", Long.valueOf(j));
        t.put("client_reqid", str);
        if (str4 != null) {
            t.put("MainScreenVersion", str4);
        }
        e51Var.a.a("address_search.FullscreenSuggestNextButtonTapped", t, 1, x4e.r(z2, t, "has_destination"));
        return true;
    }

    @Override // defpackage.wyt
    public Resources C() {
        return ((hk4) this.a).a.getResources();
    }

    @Override // defpackage.f3u
    public Iterator D() {
        return ((Iterable) this.a).iterator();
    }

    public void E(int i, String str, boolean z2) {
        int i2;
        ay4 I = I(str);
        if (i > 0) {
            i2 = I.g(i);
        } else if (i >= 0) {
            return;
        } else {
            i2 = I.i(-i);
        }
        S(i2, z2);
    }

    public void F(NotificationChannel notificationChannel) {
        notificationChannel.setLightColor(-16776961);
        notificationChannel.enableLights(true);
        notificationChannel.setShowBadge(false);
        ((dh60) this.a).getClass();
        notificationChannel.setGroup("messenger_notifications_group");
        notificationChannel.setVibrationPattern(c);
        notificationChannel.setSound(RingtoneManager.getDefaultUri(1), new AudioAttributes.Builder().setUsage(6).setContentType(4).build());
    }

    public ay4 I(String str) {
        oj91 oj91Var = (oj91) this.a;
        int c2 = oj91Var.c();
        int e = oj91Var.e();
        int h = oj91Var.h();
        int g = oj91Var.g();
        DisplayMetrics f = oj91Var.f();
        if (!(str == null ? true : str.equals("clamp")) && jl40.l(str, "ring")) {
            return new b090(c2, e, h, g, f, 1);
        }
        return new b090(c2, e, h, g, f, 0);
    }

    public eqf J() {
        return new eqf((ByteArrayOutputStream) this.a);
    }

    public uvf K() {
        return new uvf((ByteArrayOutputStream) this.a);
    }

    public ky P(hhg hhgVar, String str) {
        return new ky(str, new j0(6, this, hhgVar), 1);
    }

    public void Q(int i, String str, boolean z2) {
        if (i == 0) {
            return;
        }
        ((oj91) this.a).i(I(str).h(i), DivSizeUnit.PX, z2);
    }

    public void R(String str, boolean z2) {
        List d = ((oj91) this.a).d(str);
        IllegalArgumentException illegalArgumentException = d.isEmpty() ? new IllegalArgumentException(oyr.p("There are no items with id '", str, "'.")) : d.size() > 1 ? new IllegalArgumentException(oyr.p("There are several items with id '", str, "'.")) : null;
        if (illegalArgumentException == null) {
            S(((Number) a.P(d)).intValue(), z2);
        } else {
            ny61.n("Failed to scroll to item with id.", illegalArgumentException);
        }
    }

    public void S(int i, boolean z2) {
        oj91 oj91Var = (oj91) this.a;
        if (z2) {
            oj91Var.k(i);
        } else {
            oj91Var.l(i);
        }
    }

    public void T(ArrayList arrayList) {
        kr60 kr60Var;
        for (int i = 0; i < arrayList.size(); i++) {
            if (((jr60) arrayList.get(i)).a == 1) {
                try {
                    kr60Var = new kr60((jr60) arrayList.get(i));
                } catch (ObuParser$NotYetImplementedException unused) {
                    kr60Var = null;
                }
                this.a = kr60Var;
            }
        }
    }

    public void U(int i) {
        ((ByteArrayOutputStream) this.a).write(i);
    }

    public void V(byte[] bArr, int i, int i2) {
        ((ByteArrayOutputStream) this.a).write(bArr, i, i2);
    }

    public void W(int i) {
        if (i < 128) {
            U(i);
            return;
        }
        int i2 = 5;
        byte[] bArr = new byte[5];
        while (true) {
            int i3 = i2 - 1;
            bArr[i3] = (byte) i;
            i >>>= 8;
            if (i == 0) {
                int i4 = i2 - 2;
                bArr[i4] = (byte) ((5 - i3) | 128);
                V(bArr, i4, 6 - i3);
                return;
            }
            i2 = i3;
        }
    }

    public void X(z1[] z1VarArr) {
        for (z1 z1Var : z1VarArr) {
            z1Var.toASN1Primitive().i(this, true);
        }
    }

    public void Y(int i, byte[] bArr, boolean z2) {
        c0(i, z2);
        W(bArr.length);
        V(bArr, 0, bArr.length);
    }

    public void Z(byte[] bArr, int i, int i2, int i3, boolean z2) {
        c0(i, z2);
        W(i3);
        V(bArr, i2, i3);
    }

    @Override // defpackage.b5v0
    public boolean a(a5v0 a5v0Var, String str, int i, String str2) {
        e51 e51Var = (e51) this.a;
        long j = a5v0Var.a;
        String str3 = a5v0Var.b;
        String str4 = a5v0Var.c;
        String str5 = a5v0Var.d;
        String str6 = a5v0Var.e;
        HashMap t = n.t(e51Var);
        if (str4 != null) {
            t.put("address_search", str4);
        }
        if (str5 != null) {
            t.put("suggest_serpid", str5);
        }
        t.put("event_milli_timestamp", Long.valueOf(j));
        t.put("client_reqid", str3);
        if (str6 != null) {
            t.put("MainScreenVersion", str6);
        }
        t.put("part", str);
        if (str2 != null) {
            t.put("search_type", str2);
        }
        e51Var.a.a("address_search.SuggestSearchRequest", t, 1, x4e.n(i, t, "editOpCount"));
        return true;
    }

    public void a0(boolean z2, int i, z1[] z1VarArr) {
        c0(i, z2);
        U(128);
        X(z1VarArr);
        U(0);
        U(0);
    }

    @Override // defpackage.bl3
    public Object b() {
        ((cl3) this.a).b();
        return zy11.a;
    }

    public void b0(int i, int i2) {
        if (i2 < 31) {
            U(i | i2);
            return;
        }
        byte[] bArr = new byte[6];
        int i3 = 5;
        bArr[5] = (byte) (i2 & HProv.PP_VERSION_TIMESTAMP);
        while (i2 > 127) {
            i2 >>>= 7;
            i3--;
            bArr[i3] = (byte) ((i2 & HProv.PP_VERSION_TIMESTAMP) | 128);
        }
        int i4 = i3 - 1;
        bArr[i4] = (byte) (i | 31);
        V(bArr, i4, 6 - i4);
    }

    @Override // defpackage.b5v0
    public boolean c(a5v0 a5v0Var, HashMap hashMap, String str) {
        e51 e51Var = (e51) this.a;
        long j = a5v0Var.a;
        String str2 = a5v0Var.b;
        String str3 = a5v0Var.c;
        String str4 = a5v0Var.d;
        String str5 = a5v0Var.e;
        HashMap t = n.t(e51Var);
        if (str3 != null) {
            t.put("address_search", str3);
        }
        if (str4 != null) {
            t.put("suggest_serpid", str4);
        }
        t.put("event_milli_timestamp", Long.valueOf(j));
        t.put("client_reqid", str2);
        if (str5 != null) {
            t.put("MainScreenVersion", str5);
        }
        t.put("searchFilter", hashMap);
        t.put("part", str);
        e51Var.a.a("address_search.SuggestPointOnMap", t, 1, new HashMap());
        return true;
    }

    public void c0(int i, boolean z2) {
        if (z2) {
            U(i);
        }
    }

    @Override // defpackage.bl3
    public Object d() {
        ((cl3) this.a).d();
        return zy11.a;
    }

    public void d0(a3 a3Var) {
        a3Var.i(this, true);
    }

    @Override // defpackage.bl3
    public Object e() {
        ((cl3) this.a).e();
        return zy11.a;
    }

    public void e0(a3[] a3VarArr) {
        for (a3 a3Var : a3VarArr) {
            a3Var.i(this, true);
        }
    }

    @Override // defpackage.b5v0
    public boolean f(a5v0 a5v0Var) {
        e51 e51Var = (e51) this.a;
        long j = a5v0Var.a;
        String str = a5v0Var.b;
        String str2 = a5v0Var.c;
        String str3 = a5v0Var.d;
        String str4 = a5v0Var.e;
        HashMap t = n.t(e51Var);
        if (str2 != null) {
            t.put("address_search", str2);
        }
        if (str3 != null) {
            t.put("suggest_serpid", str3);
        }
        t.put("event_milli_timestamp", Long.valueOf(j));
        t.put("client_reqid", str);
        if (str4 != null) {
            t.put("MainScreenVersion", str4);
        }
        e51Var.a.a("address_search.SuggestLongTap", t, 1, new HashMap());
        return true;
    }

    @Override // defpackage.bl3
    public Object g() {
        ((cl3) this.a).g();
        return zy11.a;
    }

    public synchronized void g0() {
        yiu0 yiu0Var = (yiu0) this.a;
        ReentrantLock reentrantLock = yiu0Var.a;
        reentrantLock.lock();
        try {
            yiu0Var.b.edit().clear().apply();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // defpackage.wyt
    public int getPaddingTop() {
        hk4 hk4Var = (hk4) this.a;
        RectF rectF = hk4Var.i;
        return rectF != null ? (int) rectF.top : hk4Var.a.getPaddingTop();
    }

    @Override // defpackage.wyt
    public int getWidth() {
        hk4 hk4Var = (hk4) this.a;
        RectF rectF = hk4Var.i;
        return rectF != null ? (int) rectF.width() : hk4Var.a.getWidth();
    }

    @Override // defpackage.bl3
    public Object h() {
        ((cl3) this.a).h();
        return zy11.a;
    }

    @Override // defpackage.q0z0
    public Cursor i(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        return ((ContentResolver) this.a).query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, w, "kind = 1 AND image_id = ?", new String[]{lastPathSegment}, null);
    }

    @Override // defpackage.b5v0
    public boolean j(a5v0 a5v0Var, HashMap hashMap) {
        e51 e51Var = (e51) this.a;
        long j = a5v0Var.a;
        String str = a5v0Var.b;
        String str2 = a5v0Var.c;
        String str3 = a5v0Var.d;
        String str4 = a5v0Var.e;
        HashMap t = n.t(e51Var);
        if (str2 != null) {
            t.put("address_search", str2);
        }
        if (str3 != null) {
            t.put("suggest_serpid", str3);
        }
        t.put("event_milli_timestamp", Long.valueOf(j));
        t.put("client_reqid", str);
        if (str4 != null) {
            t.put("MainScreenVersion", str4);
        }
        t.put("address", hashMap);
        e51Var.a.a("address_search.ShowOnMapForRestrictedAddressable", t, 1, new HashMap());
        return true;
    }

    @Override // defpackage.b5v0
    public void k(String str, String str2, String str3, String str4, long j) {
        e51 e51Var = (e51) this.a;
        HashMap t = n.t(e51Var);
        if (str2 != null) {
            t.put("address_search", str2);
        }
        if (str3 != null) {
            t.put("suggest_serpid", str3);
        }
        t.put("event_milli_timestamp", Long.valueOf(j));
        t.put("client_reqid", str);
        if (str4 != null) {
            t.put("MainScreenVersion", str4);
        }
        e51Var.a.a("address_search.SuggestFormHideKeyboard", t, 1, new HashMap());
    }

    @Override // defpackage.b5v0
    public boolean l(a5v0 a5v0Var) {
        e51 e51Var = (e51) this.a;
        long j = a5v0Var.a;
        String str = a5v0Var.b;
        String str2 = a5v0Var.c;
        String str3 = a5v0Var.d;
        String str4 = a5v0Var.e;
        HashMap t = n.t(e51Var);
        if (str2 != null) {
            t.put("address_search", str2);
        }
        if (str3 != null) {
            t.put("suggest_serpid", str3);
        }
        t.put("event_milli_timestamp", Long.valueOf(j));
        t.put("client_reqid", str);
        if (str4 != null) {
            t.put("MainScreenVersion", str4);
        }
        e51Var.a.a("address_search.SuggestFormShowKeyboard", t, 1, new HashMap());
        return true;
    }

    @Override // defpackage.ee5
    public void m(Object obj, ce5 ce5Var) {
        HashMap hashMap;
        HashMap hashMap2;
        View view;
        pg pgVar = (pg) this.a;
        if (pgVar.c == null) {
            ce5Var.a(null);
            return;
        }
        hashMap = (HashMap) obj;
        String str = (String) hashMap.get("type");
        hashMap2 = (HashMap) hashMap.get(Constants.KEY_DATA);
        str.getClass();
        switch (str) {
            case "tooltip":
                if (((String) hashMap2.get(Constants.KEY_MESSAGE)) != null) {
                    pgVar.c.getClass();
                    break;
                }
                break;
            case "announce":
                String str2 = (String) hashMap2.get(Constants.KEY_MESSAGE);
                if (str2 != null) {
                    view = ((AccessibilityBridge) ((ddf) pgVar.c).b).rootAccessibilityView;
                    view.announceForAccessibility(str2);
                    break;
                }
                break;
            case "tap":
                Integer num = (Integer) hashMap.get("nodeId");
                if (num != null) {
                    og ogVar = pgVar.c;
                    ((AccessibilityBridge) ((ddf) ogVar).b).sendAccessibilityEvent(num.intValue(), 1);
                    break;
                }
                break;
            case "focus":
                Integer num2 = (Integer) hashMap.get("nodeId");
                if (num2 != null) {
                    og ogVar2 = pgVar.c;
                    ((AccessibilityBridge) ((ddf) ogVar2).b).sendAccessibilityEvent(num2.intValue(), 8);
                    break;
                }
                break;
            case "longPress":
                Integer num3 = (Integer) hashMap.get("nodeId");
                if (num3 != null) {
                    og ogVar3 = pgVar.c;
                    ((AccessibilityBridge) ((ddf) ogVar3).b).sendAccessibilityEvent(num3.intValue(), 2);
                    break;
                }
                break;
        }
        ce5Var.a(null);
    }

    @Override // defpackage.b5v0
    public void n(String str, String str2, String str3, String str4, long j) {
        e51 e51Var = (e51) this.a;
        HashMap t = n.t(e51Var);
        if (str2 != null) {
            t.put("address_search", str2);
        }
        if (str3 != null) {
            t.put("suggest_serpid", str3);
        }
        t.put("event_milli_timestamp", Long.valueOf(j));
        t.put("client_reqid", str);
        if (str4 != null) {
            t.put("MainScreenVersion", str4);
        }
        e51Var.a.a("address_search.SuggestDotsTap", t, 1, new HashMap());
    }

    @Override // defpackage.b5v0
    public boolean o(a5v0 a5v0Var) {
        e51 e51Var = (e51) this.a;
        long j = a5v0Var.a;
        String str = a5v0Var.b;
        String str2 = a5v0Var.c;
        String str3 = a5v0Var.d;
        String str4 = a5v0Var.e;
        HashMap t = n.t(e51Var);
        if (str2 != null) {
            t.put("address_search", str2);
        }
        if (str3 != null) {
            t.put("suggest_serpid", str3);
        }
        t.put("event_milli_timestamp", Long.valueOf(j));
        t.put("client_reqid", str);
        if (str4 != null) {
            t.put("MainScreenVersion", str4);
        }
        e51Var.a.a("address_search.SuggestFormOpen", t, 1, new HashMap());
        return true;
    }

    @Override // defpackage.qty
    public void onChanged(int i, int i2, Object obj) {
    }

    @Override // defpackage.qty
    public void onInserted(int i, int i2) {
        nl0 nl0Var = (nl0) this.a;
        for (int i3 = 0; i3 < i2; i3++) {
            nl0Var.a.add(i, nl0.d);
        }
    }

    @Override // defpackage.qty
    public void onMoved(int i, int i2) {
        ArrayList arrayList = ((nl0) this.a).a;
        arrayList.add(i2, arrayList.remove(i));
    }

    @Override // defpackage.qty
    public void onRemoved(int i, int i2) {
        nl0 nl0Var = (nl0) this.a;
        for (int i3 = 0; i3 < i2; i3++) {
            nl0Var.a.remove(i);
        }
    }

    @Override // defpackage.m11
    public void openPickupFromPhoto() {
        o41 o41Var = (o41) this.a;
        ((umb0) o41Var.I).b(PickupFromPhotoEntryPointAnalytics$EntryPointScreen.CLARIFY);
        o41Var.E((m950) o41Var.H.get(), new cob0(PickupFromPhotoPayload$Origin.CLARIFY, true), sy60.Q2, hxx.a);
    }

    @Override // defpackage.b5v0
    public void p(String str, String str2, String str3, String str4, long j) {
        e51 e51Var = (e51) this.a;
        HashMap t = n.t(e51Var);
        if (str2 != null) {
            t.put("address_search", str2);
        }
        if (str3 != null) {
            t.put("suggest_serpid", str3);
        }
        t.put("event_milli_timestamp", Long.valueOf(j));
        t.put("client_reqid", str);
        if (str4 != null) {
            t.put("MainScreenVersion", str4);
        }
        e51Var.a.a("address_search.FullscreenSuggestOpenPickup", t, 1, new HashMap());
    }

    @Override // defpackage.f3u
    public Object q(Object obj) {
        return (Class) obj;
    }

    @Override // defpackage.b5v0
    public boolean r(a5v0 a5v0Var) {
        e51 e51Var = (e51) this.a;
        long j = a5v0Var.a;
        String str = a5v0Var.b;
        String str2 = a5v0Var.c;
        String str3 = a5v0Var.d;
        String str4 = a5v0Var.e;
        HashMap t = n.t(e51Var);
        if (str2 != null) {
            t.put("address_search", str2);
        }
        if (str3 != null) {
            t.put("suggest_serpid", str3);
        }
        t.put("event_milli_timestamp", Long.valueOf(j));
        t.put("client_reqid", str);
        if (str4 != null) {
            t.put("MainScreenVersion", str4);
        }
        e51Var.a.a("address_search.SuggestCloseByBackgroundTap", t, 1, new HashMap());
        return true;
    }

    @Override // defpackage.b5v0
    public boolean s(a5v0 a5v0Var, HashMap hashMap, String str) {
        e51 e51Var = (e51) this.a;
        long j = a5v0Var.a;
        String str2 = a5v0Var.b;
        String str3 = a5v0Var.c;
        String str4 = a5v0Var.d;
        String str5 = a5v0Var.e;
        HashMap t = n.t(e51Var);
        if (str3 != null) {
            t.put("address_search", str3);
        }
        if (str4 != null) {
            t.put("suggest_serpid", str4);
        }
        t.put("event_milli_timestamp", Long.valueOf(j));
        t.put("client_reqid", str2);
        if (str5 != null) {
            t.put("MainScreenVersion", str5);
        }
        t.put("searchFilter", hashMap);
        t.put("part", str);
        e51Var.a.a("address_search.SuggestSearchKeyPressed", t, 1, new HashMap());
        return true;
    }

    @Override // defpackage.b5v0
    public boolean t(a5v0 a5v0Var, int i, String str, String str2, HashMap hashMap, String str3, HashMap hashMap2, String str4) {
        e51 e51Var = (e51) this.a;
        long j = a5v0Var.a;
        String str5 = a5v0Var.b;
        String str6 = a5v0Var.c;
        String str7 = a5v0Var.d;
        String str8 = a5v0Var.e;
        HashMap t = n.t(e51Var);
        if (str6 != null) {
            t.put("address_search", str6);
        }
        if (str7 != null) {
            t.put("suggest_serpid", str7);
        }
        t.put("event_milli_timestamp", Long.valueOf(j));
        t.put("client_reqid", str5);
        if (str8 != null) {
            t.put("MainScreenVersion", str8);
        }
        if (hashMap != null) {
            t.put("searchFilter", hashMap);
        }
        if (str3 != null) {
            t.put("part", str3);
        }
        if (hashMap2 != null) {
            t.put("address", hashMap2);
        }
        t.put(StrmManagerImplKt.QUERY_PARAMETER_SOURCE_INDEX, Integer.valueOf(i));
        if (str4 != null) {
            t.put("log_id", str4);
        }
        e51Var.a.a("address_search.SuggestSelectAddress", t, 1, x4e.q(t, "ll", str, "spn", str2));
        return true;
    }

    @Override // defpackage.b5v0
    public boolean u(a5v0 a5v0Var, int i, String str) {
        e51 e51Var = (e51) this.a;
        long j = a5v0Var.a;
        String str2 = a5v0Var.b;
        String str3 = a5v0Var.c;
        String str4 = a5v0Var.d;
        String str5 = a5v0Var.e;
        HashMap t = n.t(e51Var);
        if (str3 != null) {
            t.put("address_search", str3);
        }
        if (str4 != null) {
            t.put("suggest_serpid", str4);
        }
        t.put("event_milli_timestamp", Long.valueOf(j));
        t.put("client_reqid", str2);
        if (str5 != null) {
            t.put("MainScreenVersion", str5);
        }
        t.put("suggests_count", Integer.valueOf(i));
        t.put("text", str);
        e51Var.a.a("address_search.SuggestScrollToBottom", t, 1, new HashMap());
        return true;
    }

    @Override // defpackage.b5v0
    public boolean v(long j, String str, String str2) {
        e51 e51Var = (e51) this.a;
        HashMap t = n.t(e51Var);
        if (str2 != null) {
            t.put("address_search", str2);
        }
        t.put("client_reqid", str);
        t.put("event_milli_timestamp", Long.valueOf(j));
        e51Var.a.a("address_search.SuggestUserInput", t, 1, new HashMap());
        return true;
    }

    @Override // defpackage.cl90
    public void w() {
        s sVar = (s) this.a;
        el90 el90Var = sVar.L;
        Activity activity = sVar.G;
        el90Var.getClass();
        new PassengerRatingInfoDialog(activity, el90Var.c).show();
    }

    @Override // defpackage.b5v0
    public boolean x(a5v0 a5v0Var, int i, String str, String str2, String str3, HashMap hashMap) {
        e51 e51Var = (e51) this.a;
        long j = a5v0Var.a;
        String str4 = a5v0Var.b;
        String str5 = a5v0Var.c;
        String str6 = a5v0Var.d;
        String str7 = a5v0Var.e;
        HashMap t = n.t(e51Var);
        if (str5 != null) {
            t.put("address_search", str5);
        }
        if (str6 != null) {
            t.put("suggest_serpid", str6);
        }
        t.put("event_milli_timestamp", Long.valueOf(j));
        t.put("client_reqid", str4);
        if (str7 != null) {
            t.put("MainScreenVersion", str7);
        }
        if (hashMap != null) {
            t.put("address", hashMap);
        }
        t.put(StrmManagerImplKt.QUERY_PARAMETER_SOURCE_INDEX, Integer.valueOf(i));
        t.put("ll", str);
        e51Var.a.a("address_search.ZeroSuggestSelectAddress", t, 1, x4e.q(t, "spn", str2, "type", str3));
        return true;
    }

    @Override // defpackage.b5v0
    public boolean y(a5v0 a5v0Var, String str, int i, String str2, String str3, Double d) {
        e51 e51Var = (e51) this.a;
        long j = a5v0Var.a;
        String str4 = a5v0Var.b;
        String str5 = a5v0Var.c;
        String str6 = a5v0Var.d;
        String str7 = a5v0Var.e;
        HashMap t = n.t(e51Var);
        if (str5 != null) {
            t.put("address_search", str5);
        }
        if (str6 != null) {
            t.put("suggest_serpid", str6);
        }
        t.put("event_milli_timestamp", Long.valueOf(j));
        t.put("client_reqid", str4);
        if (str7 != null) {
            t.put("MainScreenVersion", str7);
        }
        t.put("part", str);
        if (str2 != null) {
            t.put("search_type", str2);
        }
        t.put("editOpCount", Integer.valueOf(i));
        if (str3 != null) {
            t.put("suggest_provider", str3);
        }
        if (d != null) {
            t.put("requestTime", d);
        }
        e51Var.a.a("address_search.SuggestSearchResponse", t, 1, new HashMap());
        return true;
    }

    @Override // defpackage.b5v0
    public boolean z(a5v0 a5v0Var, String str, int i, String str2) {
        e51 e51Var = (e51) this.a;
        long j = a5v0Var.a;
        String str3 = a5v0Var.b;
        String str4 = a5v0Var.c;
        String str5 = a5v0Var.d;
        String str6 = a5v0Var.e;
        HashMap t = n.t(e51Var);
        if (str4 != null) {
            t.put("address_search", str4);
        }
        if (str5 != null) {
            t.put("suggest_serpid", str5);
        }
        t.put("event_milli_timestamp", Long.valueOf(j));
        t.put("client_reqid", str3);
        if (str6 != null) {
            t.put("MainScreenVersion", str6);
        }
        t.put("part", str);
        if (str2 != null) {
            t.put("search_type", str2);
        }
        e51Var.a.a("address_search.SuggestSearchRendered", t, 1, x4e.n(i, t, "editOpCount"));
        return true;
    }

    public g191(Context context, int i) {
        a081 a081Var;
        String c2;
        switch (i) {
            case 5:
                new dm61();
                new yh61();
                a081 a081Var2 = a081.g;
                if (a081Var2 == null) {
                    synchronized (a081.f) {
                        a081Var = a081.g;
                        if (a081Var == null) {
                            a081Var = new a081();
                            a081.g = a081Var;
                        }
                    }
                    a081Var2 = a081Var;
                }
                new fw81();
                this.a = a081Var2;
                context.getApplicationContext();
                return;
            default:
                yiu0 a = yiu0.a(context);
                this.a = a;
                a.b();
                String c3 = a.c("defaultGoogleSignInAccount");
                if (TextUtils.isEmpty(c3) || (c2 = a.c(yiu0.f("googleSignInOptions", c3))) == null) {
                    return;
                }
                try {
                    GoogleSignInOptions.zab(c2);
                    return;
                } catch (JSONException unused) {
                    return;
                }
        }
    }

    public /* synthetic */ g191(Object obj) {
        this.a = obj;
    }
}
