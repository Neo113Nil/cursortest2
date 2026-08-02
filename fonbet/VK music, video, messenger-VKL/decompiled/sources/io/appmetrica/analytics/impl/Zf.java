package io.appmetrica.analytics.impl;

import android.util.SparseArray;
import java.util.Calendar;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public abstract class Zf {
    public static final Map a;
    public static final SparseArray b;
    public static final Map c;
    public static final Map d;

    static {
        HashMap hashMap = new HashMap();
        EnumC4840fl enumC4840fl = EnumC4840fl.FOREGROUND;
        hashMap.put(enumC4840fl, 0);
        EnumC4840fl enumC4840fl2 = EnumC4840fl.BACKGROUND;
        hashMap.put(enumC4840fl2, 1);
        a = Collections.unmodifiableMap(hashMap);
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, enumC4840fl);
        sparseArray.put(1, enumC4840fl2);
        b = sparseArray;
        HashMap hashMap2 = new HashMap();
        EnumC5037nb enumC5037nb = EnumC5037nb.EVENT_TYPE_INIT;
        hashMap2.put(enumC5037nb, 1);
        EnumC5037nb enumC5037nb2 = EnumC5037nb.EVENT_TYPE_REGULAR;
        hashMap2.put(enumC5037nb2, 4);
        EnumC5037nb enumC5037nb3 = EnumC5037nb.EVENT_TYPE_SEND_REFERRER;
        hashMap2.put(enumC5037nb3, 5);
        EnumC5037nb enumC5037nb4 = EnumC5037nb.EVENT_TYPE_ALIVE;
        hashMap2.put(enumC5037nb4, 7);
        EnumC5037nb enumC5037nb5 = EnumC5037nb.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF;
        hashMap2.put(enumC5037nb5, 26);
        EnumC5037nb enumC5037nb6 = EnumC5037nb.EVENT_TYPE_PREV_SESSION_EXCEPTION_UNHANDLED_FROM_FILE;
        hashMap2.put(enumC5037nb6, 26);
        EnumC5037nb enumC5037nb7 = EnumC5037nb.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE;
        hashMap2.put(enumC5037nb7, 26);
        EnumC5037nb enumC5037nb8 = EnumC5037nb.EVENT_TYPE_ANR;
        hashMap2.put(enumC5037nb8, 25);
        EnumC5037nb enumC5037nb9 = EnumC5037nb.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF;
        hashMap2.put(enumC5037nb9, 26);
        EnumC5037nb enumC5037nb10 = EnumC5037nb.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF;
        hashMap2.put(enumC5037nb10, 26);
        EnumC5037nb enumC5037nb11 = EnumC5037nb.EVENT_TYPE_EXCEPTION_USER_PROTOBUF;
        hashMap2.put(enumC5037nb11, 27);
        EnumC5037nb enumC5037nb12 = EnumC5037nb.EVENT_TYPE_EXCEPTION_USER_CUSTOM_PROTOBUF;
        hashMap2.put(enumC5037nb12, 27);
        EnumC5037nb enumC5037nb13 = EnumC5037nb.EVENT_TYPE_FIRST_ACTIVATION;
        hashMap2.put(enumC5037nb13, 13);
        EnumC5037nb enumC5037nb14 = EnumC5037nb.EVENT_TYPE_START;
        hashMap2.put(enumC5037nb14, 2);
        EnumC5037nb enumC5037nb15 = EnumC5037nb.EVENT_TYPE_APP_OPEN;
        hashMap2.put(enumC5037nb15, 16);
        EnumC5037nb enumC5037nb16 = EnumC5037nb.EVENT_TYPE_APP_UPDATE;
        hashMap2.put(enumC5037nb16, 17);
        EnumC5037nb enumC5037nb17 = EnumC5037nb.EVENT_TYPE_PERMISSIONS;
        hashMap2.put(enumC5037nb17, 18);
        EnumC5037nb enumC5037nb18 = EnumC5037nb.EVENT_TYPE_APP_FEATURES;
        hashMap2.put(enumC5037nb18, 19);
        EnumC5037nb enumC5037nb19 = EnumC5037nb.EVENT_TYPE_SEND_USER_PROFILE;
        hashMap2.put(enumC5037nb19, 20);
        EnumC5037nb enumC5037nb20 = EnumC5037nb.EVENT_TYPE_SEND_REVENUE_EVENT;
        hashMap2.put(enumC5037nb20, 21);
        EnumC5037nb enumC5037nb21 = EnumC5037nb.EVENT_TYPE_SEND_AD_REVENUE_EVENT;
        hashMap2.put(enumC5037nb21, 40);
        EnumC5037nb enumC5037nb22 = EnumC5037nb.EVENT_TYPE_SEND_ECOMMERCE_EVENT;
        hashMap2.put(enumC5037nb22, 35);
        hashMap2.put(EnumC5037nb.EVENT_TYPE_CLEANUP, 29);
        EnumC5037nb enumC5037nb23 = EnumC5037nb.EVENT_TYPE_WEBVIEW_SYNC;
        hashMap2.put(enumC5037nb23, 38);
        EnumC5037nb enumC5037nb24 = EnumC5037nb.EVENT_CLIENT_EXTERNAL_ATTRIBUTION;
        hashMap2.put(enumC5037nb24, 42);
        c = Collections.unmodifiableMap(hashMap2);
        HashMap hashMap3 = new HashMap();
        I8 i8 = new I8();
        O8 o8 = new O8(new T8());
        J8 j8 = new J8();
        C5055o3 c5055o3 = new C5055o3(new T8());
        Zn zn = new Zn(new T8());
        Vf vf = new Vf();
        C4828f9 a2 = C4854g9.a();
        a2.b = vf;
        a2.c = vf;
        C4854g9 c4854g9 = new C4854g9(a2);
        C4828f9 a3 = C4854g9.a();
        a3.b = o8;
        C4854g9 c4854g92 = new C4854g9(a3);
        C4828f9 a4 = C4854g9.a();
        a4.b = c5055o3;
        C4854g9 c4854g93 = new C4854g9(a4);
        C4828f9 a5 = C4854g9.a();
        a5.b = zn;
        C4854g9 c4854g94 = new C4854g9(a5);
        C4828f9 a6 = C4854g9.a();
        a6.a = i8;
        C4854g9 c4854g95 = new C4854g9(a6);
        C4828f9 a7 = C4854g9.a();
        a7.b = new Eo(new O8());
        C4854g9 c4854g96 = new C4854g9(a7);
        hashMap3.put(enumC5037nb2, c4854g92);
        C4828f9 a8 = C4854g9.a();
        a8.b = new Xf();
        hashMap3.put(enumC5037nb3, new C4854g9(a8));
        C4828f9 a9 = C4854g9.a();
        a9.a = i8;
        a9.b = j8;
        a9.e = new C4905i8();
        a9.f = new C4930j8();
        hashMap3.put(enumC5037nb4, new C4854g9(a9));
        hashMap3.put(enumC5037nb9, c4854g9);
        hashMap3.put(enumC5037nb10, c4854g9);
        hashMap3.put(enumC5037nb11, c4854g93);
        hashMap3.put(enumC5037nb12, c4854g93);
        hashMap3.put(enumC5037nb5, c4854g93);
        hashMap3.put(enumC5037nb6, c4854g93);
        hashMap3.put(enumC5037nb7, c4854g93);
        hashMap3.put(enumC5037nb8, c4854g93);
        C4828f9 a10 = C4854g9.a();
        a10.a = new I8();
        a10.b = c5055o3;
        hashMap3.put(enumC5037nb14, new C4854g9(a10));
        EnumC5037nb enumC5037nb25 = EnumC5037nb.EVENT_TYPE_CUSTOM_EVENT;
        C4828f9 a11 = C4854g9.a();
        a11.d = new Yf();
        hashMap3.put(enumC5037nb25, new C4854g9(a11));
        hashMap3.put(enumC5037nb15, c4854g92);
        hashMap3.put(enumC5037nb17, c4854g95);
        hashMap3.put(enumC5037nb18, c4854g95);
        hashMap3.put(enumC5037nb19, c4854g93);
        hashMap3.put(enumC5037nb20, c4854g93);
        hashMap3.put(enumC5037nb21, c4854g93);
        hashMap3.put(enumC5037nb22, c4854g94);
        hashMap3.put(enumC5037nb, c4854g96);
        hashMap3.put(enumC5037nb16, c4854g96);
        hashMap3.put(enumC5037nb13, c4854g92);
        hashMap3.put(enumC5037nb23, c4854g92);
        hashMap3.put(enumC5037nb24, c4854g93);
        d = Collections.unmodifiableMap(hashMap3);
    }

    public static C5216u9 a(Long l, Long l2, Boolean bool) {
        C5216u9 c5216u9 = new C5216u9();
        if (l != null) {
            c5216u9.a = l.longValue();
            c5216u9.b = ((GregorianCalendar) Calendar.getInstance()).getTimeZone().getOffset(l.longValue() * 1000) / 1000;
        }
        if (l2 != null) {
            c5216u9.c = l2.longValue();
        }
        if (bool != null) {
            c5216u9.d = bool.booleanValue();
        }
        return c5216u9;
    }

    public static void a(C5164s9 c5164s9) {
        C5113q9[] c5113q9Arr = c5164s9.c;
        if (c5113q9Arr != null) {
            for (C5113q9 c5113q9 : c5113q9Arr) {
            }
        }
    }
}
