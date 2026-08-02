package ru.mail.libverify.f0;

import android.annotation.SuppressLint;
import android.content.Context;
import android.telephony.SubscriptionManager;
import com.ironsource.X3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import kotlin.collections.EmptyList;
import ru.mail.libverify.a0.a;
import ru.mail.libverify.f0.b;
import ru.mail.verify.core.utils.FileLog;
import xsna.anj;

/* loaded from: classes9.dex */
public final class d implements c {
    private final Context a;

    public d(Context context) {
        this.a = context;
    }

    @SuppressLint({"HardwareIds", "MissingPermission"})
    private static b a(ru.mail.libverify.a0.a aVar, String str) {
        String str2;
        b.a aVar2 = new b.a();
        int f = aVar.f();
        switch (f) {
            case 0:
                str2 = "unknown";
                break;
            case 1:
                str2 = "absent";
                break;
            case 2:
                str2 = "pin_required";
                break;
            case 3:
                str2 = "puk_required";
                break;
            case 4:
                str2 = "network_locked";
                break;
            case 5:
                str2 = X3.i.s;
                break;
            case 6:
                str2 = "not_ready";
                break;
            case 7:
                str2 = "perm_disabled";
                break;
            case 8:
                str2 = "card_io_error";
                break;
            default:
                str2 = null;
                break;
        }
        aVar2.j(str2);
        aVar2.b(f == 5);
        if (f == 5) {
            aVar2.i(aVar.a());
            aVar2.a(aVar.i());
            aVar.m();
            aVar2.f(aVar.j());
            aVar2.g(aVar.k());
            aVar2.d(aVar.d());
            aVar2.e(aVar.e());
            aVar2.c(aVar.c());
            aVar2.a(aVar.o());
            aVar2.c(aVar.p());
            aVar2.a(Integer.valueOf(aVar.b()));
            String h = aVar.h();
            if (h != null) {
                aVar2.h(h.toUpperCase(Locale.ROOT));
            } else {
                aVar2.h("");
            }
            aVar2.b(aVar.a(str));
        }
        return aVar2.a();
    }

    @Override // ru.mail.libverify.f0.c
    public final a b() {
        a aVar;
        Integer num;
        Integer num2;
        ru.mail.libverify.a0.a aVar2;
        b bVar;
        ru.mail.libverify.a0.a aVar3;
        FileLog.v("SimCardReader", "sim card read start");
        String d = ru.mail.libverify.n0.e.d(this.a);
        if (d == null) {
            d = "";
        }
        String[] strArr = {"android.permission.READ_PHONE_STATE"};
        b bVar2 = null;
        try {
        } catch (Exception unused) {
            FileLog.e("Utils", "Failed to check self permission %s", Arrays.toString(strArr));
        }
        if (anj.a(this.a, strArr[0]) == 0) {
            FileLog.v("SimCardReader", "readData started");
            ArrayList arrayList = new ArrayList();
            try {
                try {
                    aVar2 = a.C2189a.a(this.a, null);
                } catch (Exception e) {
                    FileLog.e("SimCardReader", "Failed to getTelephonyManager: ", e.getMessage());
                    aVar2 = null;
                }
            } catch (Exception e2) {
                e = e2;
                num = null;
                num2 = null;
                FileLog.e("SimCardReader", "readData failed to read sim card data items", e.getMessage());
                bVar = bVar2;
                aVar = new a(num2, num, bVar, arrayList);
                FileLog.v("SimCardReader", "sim card read result %s", Boolean.valueOf(aVar.p()));
                return aVar;
            }
            if (aVar2 == null) {
                throw new IllegalStateException("Can not create telephonyManager");
            }
            num = Integer.valueOf(aVar2.g());
            try {
                int l = aVar2.l();
                num2 = Integer.valueOf(l);
                try {
                    bVar = a(aVar2, d);
                    for (int i = 0; i < l; i++) {
                        try {
                            try {
                                aVar3 = a.C2189a.a(this.a, Integer.valueOf(i));
                            } catch (Exception e3) {
                                FileLog.e("SimCardReader", "Failed to getTelephonyManager: ", e3.getMessage());
                                aVar3 = null;
                            }
                        } catch (Exception e4) {
                            try {
                                FileLog.e("SimCardReader", "readData failed to read sim card item", e4.getMessage());
                            } catch (Exception e5) {
                                e = e5;
                                bVar2 = bVar;
                                FileLog.e("SimCardReader", "readData failed to read sim card data items", e.getMessage());
                                bVar = bVar2;
                                aVar = new a(num2, num, bVar, arrayList);
                                FileLog.v("SimCardReader", "sim card read result %s", Boolean.valueOf(aVar.p()));
                                return aVar;
                            }
                        }
                        if (aVar3 == null) {
                            throw new IllegalStateException("Can not create telephonyManager");
                        }
                        arrayList.add(a(aVar3, d));
                    }
                } catch (Exception e6) {
                    e = e6;
                }
            } catch (Exception e7) {
                e = e7;
                num2 = null;
            }
            aVar = new a(num2, num, bVar, arrayList);
            FileLog.v("SimCardReader", "sim card read result %s", Boolean.valueOf(aVar.p()));
            return aVar;
        }
        FileLog.v("SimCardReader", "can't read sim data without %s", "android.permission.READ_PHONE_STATE");
        SubscriptionManager subscriptionManager = (SubscriptionManager) this.a.getSystemService("telephony_subscription_service");
        a aVar4 = new a(subscriptionManager != null ? Integer.valueOf(subscriptionManager.getActiveSubscriptionInfoCountMax()) : null, null, null, EmptyList.b);
        aVar4.q();
        aVar = aVar4;
        FileLog.v("SimCardReader", "sim card read result %s", Boolean.valueOf(aVar.p()));
        return aVar;
    }
}
