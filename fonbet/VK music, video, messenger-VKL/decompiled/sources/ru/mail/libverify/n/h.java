package ru.mail.libverify.n;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.os.Build;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import ru.mail.libverify.n.g;
import ru.mail.libverify.n.h;
import ru.mail.libverify.o.b;
import ru.mail.verify.core.utils.FileLog;
import ru.ok.android.webrtc.utils.retry.ExponentialAlgorithm;
import xsna.epx;
import xsna.h73;
import xsna.lx5;

/* loaded from: classes9.dex */
public final class h implements g {
    private static final HashMap<g.a, b> c = new HashMap<>();
    private final ru.mail.libverify.c.b a;
    private final ru.mail.libverify.o.b b;

    public static abstract class a {

        /* renamed from: ru.mail.libverify.n.h$a$a, reason: collision with other inner class name */
        public static final class C2207a extends a {
            public static final C2207a a = new C2207a();

            private C2207a() {
                super(0);
            }
        }

        public static final class b extends a {
            private final g.c a;

            public b(g.c cVar) {
                super(0);
                this.a = cVar;
            }

            public final g.c a() {
                return this.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "";
            }
        }

        public a(int i) {
        }
    }

    public final class b extends BroadcastReceiver {
        private final a a;
        private g.a b;

        public b(a aVar) {
            this.a = aVar;
        }

        public final void a(g.a aVar) {
            this.b = aVar;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            final String string;
            Bundle extras;
            final String string2;
            Bundle extras2 = intent.getExtras();
            if (extras2 == null || (string = extras2.getString("state")) == null) {
                return;
            }
            a aVar = this.a;
            if (epx.f(aVar, a.C2207a.a)) {
                if (!string.equals(TelephonyManager.EXTRA_STATE_RINGING) || (extras = intent.getExtras()) == null || (string2 = extras.getString("incoming_number")) == null) {
                    return;
                }
                ru.mail.libverify.p0.b b = h.this.a.b();
                final h hVar = h.this;
                b.post(new Runnable() { // from class: ru.mail.libverify.n.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        h.b.a(string, string2, this, hVar);
                    }
                });
                return;
            }
            if ((aVar instanceof a.b) && string.equals(TelephonyManager.EXTRA_STATE_OFFHOOK)) {
                Bundle extras3 = intent.getExtras();
                final String string3 = extras3 != null ? extras3.getString("incoming_number") : null;
                FileLog.v("PhoneCallInterceptor", "onCallStateChanged state " + string + " number " + string3);
                if (((a.b) this.a).a().a(string3)) {
                    h.this.a.b().post(new Runnable() { // from class: ru.mail.libverify.n.p
                        @Override // java.lang.Runnable
                        public final void run() {
                            h.b.a(h.b.this, string3);
                        }
                    });
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(String str, String str2, b bVar, h hVar) {
            FileLog.v("PhoneCallInterceptor", "onCallStateChanged state %s number %s", str, str2);
            if (bVar.b == null || TextUtils.isEmpty(str2) || !bVar.b.a(str2)) {
                return;
            }
            h.b(hVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(b bVar, String str) {
            g.a aVar = bVar.b;
            if (aVar != null) {
                if (str == null) {
                    str = "";
                }
                aVar.a(str);
            }
        }
    }

    public h(ru.mail.libverify.c.b bVar, ru.mail.libverify.o.b bVar2) {
        this.a = bVar;
        this.b = bVar2;
    }

    public final void c(g.a aVar) {
        FileLog.v("PhoneCallInterceptor", "callback unregistered");
        b remove = c.remove(aVar);
        if (remove == null) {
            return;
        }
        remove.a(null);
        this.a.e().getContext().unregisterReceiver(remove);
    }

    public final void b(g.a aVar) {
        if (!ru.mail.libverify.n0.e.b(this.a.e().getContext(), "android.permission.READ_PHONE_STATE")) {
            FileLog.d("PhoneCallInterceptor", "can't register call listener without %s permission", "android.permission.READ_PHONE_STATE");
            return;
        }
        try {
            FileLog.v("PhoneCallInterceptor", "callback unregistered");
            b remove = c.remove(aVar);
            if (remove == null) {
                return;
            }
            remove.a(null);
            this.a.e().getContext().unregisterReceiver(remove);
        } catch (Throwable th) {
            FileLog.e("PhoneCallInterceptor", "failed to subscribe for a call state", th);
        }
    }

    public final void a(g.a aVar) {
        if (!ru.mail.libverify.n0.e.b(this.a.e().getContext(), "android.permission.READ_PHONE_STATE")) {
            FileLog.d("PhoneCallInterceptor", "can't register call listener without %s permission", "android.permission.READ_PHONE_STATE");
            return;
        }
        try {
            HashMap<g.a, b> hashMap = c;
            if (hashMap.containsKey(aVar)) {
                FileLog.e("PhoneCallInterceptor", "callback has been already registered");
                return;
            }
            FileLog.v("PhoneCallInterceptor", "callback registered");
            b bVar = new b(a.C2207a.a);
            bVar.a(aVar);
            hashMap.put(aVar, bVar);
            Context context = this.a.e().getContext();
            IntentFilter intentFilter = new IntentFilter("android.intent.action.PHONE_STATE");
            if (Build.VERSION.SDK_INT >= 33) {
                context.registerReceiver(bVar, intentFilter, 4);
            } else {
                context.registerReceiver(bVar, intentFilter);
            }
        } catch (Throwable th) {
            FileLog.e("PhoneCallInterceptor", "failed to subscribe for a call state", th);
        }
    }

    private final boolean b(String str) {
        FileLog.v("PhoneCallInterceptor", "check phone is able to intercept calls");
        boolean b2 = ru.mail.libverify.n0.e.b(this.a.e().getContext(), "android.permission.READ_CALL_LOG");
        if (ru.mail.libverify.n0.e.b(this.a.e().getContext(), "android.permission.READ_PHONE_STATE") && b2) {
            if (this.a.e().b().o()) {
                return true;
            }
            FileLog.d("PhoneCallInterceptor", "can't intercept calls to %s (%s)", str, "no ready sim");
            this.b.a(b.a.NO_READY_SIM);
            return false;
        }
        FileLog.d("PhoneCallInterceptor", "can't intercept calls to %s (%s)", str, "no permission");
        this.b.a(b.a.NO_CALL_PERMISSION);
        return false;
    }

    public final void a(g.c cVar, g.a aVar) {
        if (b("")) {
            HashMap<g.a, b> hashMap = c;
            if (hashMap.containsKey(aVar)) {
                FileLog.e("PhoneCallInterceptor", "callback has been already registered");
                return;
            }
            b bVar = new b(new a.b(cVar));
            bVar.a(aVar);
            hashMap.put(aVar, bVar);
            Context context = this.a.e().getContext();
            IntentFilter intentFilter = new IntentFilter("android.intent.action.PHONE_STATE");
            if (Build.VERSION.SDK_INT >= 33) {
                context.registerReceiver(bVar, intentFilter, 4);
            } else {
                context.registerReceiver(bVar, intentFilter);
            }
            FileLog.d("PhoneCallInterceptor", "Outgoing call callback registered!");
        }
    }

    public static final void b(h hVar) {
        TelephonyManager telephonyManager = (TelephonyManager) hVar.a.e().getContext().getSystemService("phone");
        try {
            if (!ru.mail.libverify.n0.e.b(hVar.a.e().getContext(), "android.permission.CALL_PHONE")) {
                FileLog.d("PhoneCallInterceptor", "can't reject call without %s permission", "android.permission.CALL_PHONE");
                return;
            }
            Method declaredMethod = TelephonyManager.class.getDeclaredMethod("getITelephony", null);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(telephonyManager, null);
            if (invoke == null) {
                return;
            }
            Class<?> cls = Class.forName("com.android.internal.telephony.ITelephony");
            cls.getDeclaredMethod("endCall", null).invoke(invoke, null);
            cls.getDeclaredMethod("silenceRinger", null).invoke(invoke, null);
            cls.getDeclaredMethod("cancelMissedCallsNotification", null).invoke(invoke, null);
        } catch (Throwable th) {
            FileLog.d("PhoneCallInterceptor", "can't reject call", th);
        }
    }

    public final void a(g.b bVar) {
        this.a.d().submit(new h73(9, this, bVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(h hVar, g.b bVar) {
        FileLog.v("PhoneCallInterceptor", "last calls search started");
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            if (!ru.mail.libverify.n0.e.b(hVar.a.e().getContext(), "android.permission.READ_CALL_LOG")) {
                FileLog.d("PhoneCallInterceptor", "can't read calls without %s permission", "android.permission.READ_CALL_LOG");
                FileLog.d("PhoneCallInterceptor", "found %s calls", Arrays.toString(arrayList.toArray(new String[0])));
                hVar.a.b().post(new lx5(5, bVar, arrayList));
                return;
            }
            bVar.getClass();
            Cursor a2 = hVar.a();
            if (a2 == null) {
                FileLog.d("PhoneCallInterceptor", "found %s calls", Arrays.toString(arrayList.toArray(new String[0])));
                hVar.a.b().post(new lx5(5, bVar, arrayList));
                return;
            }
            long a3 = bVar.a();
            int columnIndex = a2.getColumnIndex("number");
            int columnIndex2 = a2.getColumnIndex("date");
            if (a2.moveToFirst()) {
                do {
                    long j = a2.getLong(columnIndex2) - a3;
                    if (j >= 0) {
                        if (j > ExponentialAlgorithm.DEFAULT_MAX_INTERVAL_MS) {
                            a2.close();
                            FileLog.d("PhoneCallInterceptor", "found %s calls", Arrays.toString(arrayList.toArray(new String[0])));
                            hVar.a.b().post(new lx5(5, bVar, arrayList));
                            return;
                        } else {
                            arrayList.add(a2.getString(columnIndex));
                            if (arrayList.size() > 5) {
                                a2.close();
                                FileLog.d("PhoneCallInterceptor", "found %s calls", Arrays.toString(arrayList.toArray(new String[0])));
                                hVar.a.b().post(new lx5(5, bVar, arrayList));
                                return;
                            }
                        }
                    }
                } while (a2.moveToNext());
            }
            a2.close();
            FileLog.d("PhoneCallInterceptor", "found %s calls", Arrays.toString(arrayList.toArray(new String[0])));
            hVar.a.b().post(new lx5(5, bVar, arrayList));
        } catch (Throwable th) {
            try {
                FileLog.e("PhoneCallInterceptor", "can't read calls", th);
                if (0 != 0) {
                    cursor.close();
                }
                FileLog.d("PhoneCallInterceptor", "found %s calls", Arrays.toString(arrayList.toArray(new String[0])));
                hVar.a.b().post(new lx5(5, bVar, arrayList));
            } catch (Throwable th2) {
                if (0 != 0) {
                    cursor.close();
                }
                FileLog.d("PhoneCallInterceptor", "found %s calls", Arrays.toString(arrayList.toArray(new String[0])));
                hVar.a.b().post(new lx5(5, bVar, arrayList));
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(g.b bVar, List list) {
        bVar.a(list);
    }

    public final boolean a(String str) {
        if (str == null) {
            return false;
        }
        return b(str);
    }

    private final Cursor a() {
        Bundle bundle = new Bundle();
        bundle.putInt("android:query-arg-limit", 5);
        bundle.putInt("android:query-arg-sort-direction", 1);
        bundle.putStringArray("android:query-arg-sort-columns", new String[]{"date"});
        return this.a.e().getContext().getContentResolver().query(ru.mail.libverify.n.a.c, null, bundle, null);
    }
}
