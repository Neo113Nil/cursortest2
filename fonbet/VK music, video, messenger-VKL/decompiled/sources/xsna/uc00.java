package xsna;

import android.annotation.SuppressLint;
import android.app.Application;
import android.os.Bundle;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.mbridge.msdk.out.reveue.MBridgeRevenueParamsEntity;
import com.my.tracker.MyTracker;
import com.my.tracker.MyTrackerConfig;
import com.my.tracker.MyTrackerParams;
import com.vk.log.L;
import com.vk.metrics.eventtracking.Event;
import com.vkontakte.android.VKActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import xsna.b0g;
import xsna.zk3;

/* compiled from: MailMyTracker.kt */
@SuppressLint({"StaticFieldLeak"})
/* loaded from: classes.dex */
public final class uc00 implements ohp0 {
    public static volatile boolean b;
    public static Application c;
    public static String d;
    public static String e;
    public static je5 f;
    public static final uc00 a = new uc00();
    public static final ReentrantLock g = new ReentrantLock();
    public static ArrayList h = new ArrayList();

    public static void m(String str, Application application) {
        if (str != null) {
            L.p("MailMyTracker.initTracker()");
            MyTracker.initTracker(str, application);
        } else {
            L.p("Missed myTracker id!");
        }
        MyTracker.setAttributionListener(new ep());
        ReentrantLock reentrantLock = g;
        reentrantLock.lock();
        try {
            ArrayList arrayList = h;
            List O0 = arrayList != null ? j5g.O0(arrayList) : null;
            h = null;
            reentrantLock.unlock();
            if (O0 == null) {
                return;
            }
            Iterator it = O0.iterator();
            while (it.hasNext()) {
                ((gzs) it.next()).invoke();
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public static void n(gzs gzsVar) {
        ReentrantLock reentrantLock = g;
        reentrantLock.lock();
        try {
            ArrayList arrayList = h;
            boolean z = false;
            if (arrayList != null) {
                if (arrayList.add(gzsVar)) {
                    z = true;
                }
            }
            if (z) {
                L.e("Action was postponed");
            } else {
                gzsVar.invoke();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // xsna.ohp0
    public final synchronized void c(final Application application, Bundle bundle, gzs<s3q0> gzsVar) {
        try {
            c = application;
            f(bundle);
            final String string = bundle.getString("MY_TRACKER_ID");
            if (bundle.getBoolean("INIT_AFTER_COLD_START")) {
                b0g b0gVar = b0g.a;
                b0g.a(new b0g.a() { // from class: xsna.sc00
                    @Override // xsna.b0g.a
                    public final void a() {
                        uc00 uc00Var = uc00.a;
                        uc00.m(string, application);
                    }
                });
            } else {
                m(string, application);
            }
            b = true;
            gzsVar.invoke();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // xsna.ohp0
    public final void f(Bundle bundle) {
        int i;
        MyTrackerParams trackerParams = MyTracker.getTrackerParams();
        if (bundle.containsKey(CommonConstant.RETKEY.USERID)) {
            String valueOf = String.valueOf(bundle.getLong(CommonConstant.RETKEY.USERID));
            trackerParams.setCustomUserId(valueOf);
            trackerParams.setVkId(valueOf);
        }
        if (bundle.containsKey("AGE") && (i = bundle.getInt("AGE")) > 0) {
            trackerParams.setAge(i);
        }
        if (bundle.containsKey(CommonConstant.RETKEY.GENDER)) {
            trackerParams.setGender(bundle.getInt(CommonConstant.RETKEY.GENDER));
        }
        String string = bundle.getString("ANDROID_ID");
        if (string != null) {
            trackerParams.setCustomParam("android_id", string);
        }
        MyTrackerConfig trackerConfig = MyTracker.getTrackerConfig();
        if (bundle.containsKey("LOCATION_TRACKING_ENABLED")) {
            boolean z = bundle.getBoolean("LOCATION_TRACKING_ENABLED");
            trackerConfig.setTrackingLocationEnabled(z);
            trackerConfig.setTrackingEnvironmentEnabled(z);
        }
        if (bundle.containsKey("APPS_TRACKING_ENABLED") && bundle.getBoolean("APPS_TRACKING_ENABLED")) {
            trackerConfig.setInstalledPackagesProvider(new t33());
        }
        if (bundle.containsKey("DATA_COLLECTION_ENABLED")) {
            trackerConfig.setKidMode(!bundle.getBoolean("DATA_COLLECTION_ENABLED"));
        }
        String string2 = bundle.getString("MY_TRACKER_INSTALLATION_PARAMS");
        if (string2 != null) {
            trackerConfig.setApkPreinstallParams(string2);
        }
        trackerConfig.setAutotrackingPurchaseEnabled(false);
        L.e("MailMyTracker", "updateParams, params = " + bundle);
        L.e("MailMyTracker", "updateParams, trackerParams.getCustomParam(ANDROID_ID_KEY) = " + trackerParams.getCustomParam("android_id"));
    }

    @Override // xsna.ohp0
    public final String getId() {
        return MBridgeRevenueParamsEntity.ATTRIBUTION_PLATFORM_MY_TRACKER;
    }

    @Override // xsna.ohp0
    public final void k(Event event) {
        Event.a aVar = event.a;
        String str = aVar.c;
        zk3 zk3Var = aVar.d;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = ((zk3.a) zk3Var.entrySet()).iterator();
        while (true) {
            zk3.d dVar = (zk3.d) it;
            if (!dVar.hasNext()) {
                break;
            }
            dVar.next();
            zk3.d dVar2 = dVar;
            if ((dVar2.getValue() instanceof String) || (dVar2.getValue() instanceof Number)) {
                linkedHashMap.put(dVar2.getKey(), dVar2.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(on00.e(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry.getKey(), entry.getValue().toString());
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(linkedHashMap2);
        String str2 = e;
        if (str2 != null) {
        }
        n(new t9b(8, str, linkedHashMap3));
    }

    @Override // xsna.ohp0
    public final void g() {
    }

    @Override // xsna.ohp0
    public final void a(Throwable th) {
    }

    @Override // xsna.ohp0
    public final void b(ohp0 ohp0Var) {
    }

    @Override // xsna.ohp0
    public final void d(long j) {
    }

    @Override // xsna.ohp0
    public final void e(long j) {
    }

    @Override // xsna.ohp0
    public final void h(izs<? super Event, s3q0> izsVar) {
    }

    @Override // xsna.ohp0
    public final void i(VKActivity vKActivity) {
    }

    @Override // xsna.ohp0
    public final void j(VKActivity vKActivity) {
    }

    @Override // xsna.ohp0
    public final void l(String str) {
    }
}
