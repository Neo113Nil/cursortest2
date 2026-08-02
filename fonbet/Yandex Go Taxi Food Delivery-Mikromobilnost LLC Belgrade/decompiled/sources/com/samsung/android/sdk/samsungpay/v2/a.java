package com.samsung.android.sdk.samsungpay.v2;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.samsung.android.sdk.samsungpay.v2.SpaySdk;
import com.samsung.android.sdk.samsungpay.v2.card.AddCardInfo;
import com.samsung.android.sdk.samsungpay.v2.card.Card;
import com.samsung.android.sdk.samsungpay.v2.card.IdvVerifyInfo;
import com.samsung.android.sdk.samsungpay.v2.card.TransitCard;
import com.samsung.android.sdk.samsungpay.v2.payment.PaymentManager;
import com.samsung.android.sdk.samsungpay.v2.service.RequestType;
import defpackage.b22;
import defpackage.xeb;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public class a {
    private static a d;
    private static final Class[] e = {SpaySdk.class, PaymentManager.class, WatchManager.class, AddCardInfo.class, Card.class, TransitCard.class, IdvVerifyInfo.class, b22.class, RequestType.ALL.getClass()};
    private static final Class[] f = {AddCardInfo.class};
    private HashMap<String, C0034a> a = new HashMap<>();
    private HashMap<String, ArrayList<String>> b = new HashMap<>();
    private SpaySdk.SdkApiLevel c = SpaySdk.SdkApiLevel.LEVEL_UNKNOWN;

    /* renamed from: com.samsung.android.sdk.samsungpay.v2.a$a, reason: collision with other inner class name */
    public static class C0034a {
        SpaySdk.SdkApiLevel a;
        boolean b;
        String c;

        public C0034a(String str, c cVar) {
            this.a = cVar.since();
            this.b = cVar.checkValue();
            this.c = str;
        }

        public String toString() {
            return this.c + " (since: " + this.a + Extension.C_BRAKE;
        }
    }

    private a() {
        for (Class cls : e) {
            b(cls);
        }
        for (Class cls2 : f) {
            a(cls2);
        }
    }

    private void a(Class cls) {
        Field[] declaredFields = cls.getDeclaredFields();
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            for (Field field : declaredFields) {
                field.setAccessible(true);
                if (field.getAnnotation(xeb.class) != null) {
                    field.getName();
                    if (field.getType() == String.class || field.getType() == Bundle.class) {
                        arrayList.add(field.getName());
                    } else {
                        g("Only String and Bundle variable are supported");
                    }
                }
            }
        } catch (Exception unused) {
        }
        if (arrayList.isEmpty()) {
            return;
        }
        this.b.put(cls.getSimpleName(), arrayList);
    }

    private void b(Class cls) {
        String c;
        for (Field field : cls.getDeclaredFields()) {
            c cVar = (c) field.getAnnotation(c.class);
            if (cVar != null) {
                try {
                    if (field.getType() == String.class) {
                        c = field.get(cls).toString();
                    } else if (field.getType().isEnum()) {
                        c = c(field.get(cls));
                    }
                    C0034a c0034a = new C0034a(field.getName(), cVar);
                    if (this.a.containsKey(c)) {
                        g("Field " + c0034a + " with value '" + c + "' is defined twice");
                    } else {
                        this.a.put(c, c0034a);
                    }
                } catch (IllegalAccessException unused) {
                }
            }
        }
    }

    private String c(Object obj) {
        if (obj == null || !obj.getClass().isEnum()) {
            g(obj + "is not an enum");
            return "";
        }
        return obj.getClass().getSimpleName() + Extension.DOT_CHAR + obj.toString();
    }

    public static synchronized a e() {
        a aVar;
        synchronized (a.class) {
            try {
                if (d == null) {
                    d = new a();
                }
                aVar = d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }

    private void g(String str) {
        Log.e("SPAYSDK:ApiLevelTable", str);
    }

    public boolean d(Object obj) {
        if (obj == null) {
            Log.e("SPAYSDK:ApiLevelTable", "findFieldContainsNotDefinedValue - param is NULL");
            return false;
        }
        if (!this.b.containsKey(obj.getClass().getSimpleName())) {
            g("Not checking support for " + obj.getClass());
            return false;
        }
        Class<?> cls = obj.getClass();
        try {
            Iterator<String> it = this.b.get(cls.getSimpleName()).iterator();
            while (it.hasNext()) {
                Field declaredField = cls.getDeclaredField(it.next());
                declaredField.setAccessible(true);
                if (declaredField.getType() == String.class || declaredField.getType() == Bundle.class) {
                    if (h(declaredField.get(obj))) {
                        return true;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public void f(SpaySdk.SdkApiLevel sdkApiLevel) {
        this.c = sdkApiLevel;
    }

    public boolean h(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj.getClass().isEnum()) {
            obj = c(obj);
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (!TextUtils.isEmpty(str) && this.a.containsKey(str)) {
                C0034a c0034a = this.a.get(str);
                if (c0034a.a.compareTo(this.c) > 0) {
                    Log.e("SPAYSDK:ApiLevelTable", "Parameter: " + c0034a.toString() + " is not defined in " + this.c);
                    return true;
                }
            }
        } else if (obj instanceof Bundle) {
            Bundle bundle = (Bundle) obj;
            for (String str2 : bundle.keySet()) {
                C0034a c0034a2 = this.a.get(str2);
                if (c0034a2 != null) {
                    if (h(str2)) {
                        return true;
                    }
                    if (c0034a2.b) {
                        c0034a2.toString();
                        if (h(bundle.getString(str2, null))) {
                            return true;
                        }
                    } else {
                        continue;
                    }
                }
            }
        } else {
            g("Not checking support for " + obj.getClass());
        }
        return false;
    }
}
