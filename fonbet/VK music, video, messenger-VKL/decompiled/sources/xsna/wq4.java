package xsna;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.vk.log.L;
import com.vk.medianative.AudioNative;
import java.net.MalformedURLException;
import java.net.URL;

/* compiled from: AudioMessageUtils.java */
/* loaded from: classes15.dex */
public final class wq4 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ wq4(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[ADDED_TO_REGION, REMOVE, RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Pair pair;
        NetworkInfo activeNetworkInfo;
        switch (this.b) {
            case 0:
                m3a m3aVar = ((xq4) this.c).d;
                m3aVar.getClass();
                try {
                    ((Handler) m3aVar.b).removeCallbacksAndMessages(null);
                } catch (Exception e) {
                    L.g("cleanup failure", e);
                }
                AudioNative.audioStopRecord();
                break;
            default:
                bf01 bf01Var = (bf01) this.c;
                bf01Var.k();
                mb01 mb01Var = (mb01) bf01Var.b;
                x901 x901Var = mb01Var.i;
                k901 k901Var = mb01Var.j;
                x901 x901Var2 = mb01Var.i;
                mb01.i(x901Var);
                if (!x901Var.u.b()) {
                    mb01.i(x901Var2);
                    long a = x901Var2.v.a();
                    mb01.i(x901Var2);
                    x901Var2.v.b(1 + a);
                    if (a < 5) {
                        kb01 kb01Var = mb01Var.k;
                        mb01.k(kb01Var);
                        kb01Var.k();
                        bg01 bg01Var = mb01Var.s;
                        mb01.k(bg01Var);
                        mb01 mb01Var2 = (mb01) bg01Var.b;
                        mb01.k(bg01Var);
                        String o = mb01Var.o().o();
                        mb01.i(x901Var2);
                        x901Var2.k();
                        mb01 mb01Var3 = (mb01) x901Var2.b;
                        mb01Var3.o.getClass();
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        String str = x901Var2.j;
                        if (str == null || elapsedRealtime >= x901Var2.l) {
                            x901Var2.l = mb01Var3.h.q(o, s701.c) + elapsedRealtime;
                            AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
                            try {
                                AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(mb01Var3.b);
                                x901Var2.j = "";
                                String id = advertisingIdInfo.getId();
                                if (id != null) {
                                    x901Var2.j = id;
                                }
                                x901Var2.k = advertisingIdInfo.isLimitAdTrackingEnabled();
                            } catch (Exception e2) {
                                k901 k901Var2 = mb01Var3.j;
                                mb01.k(k901Var2);
                                k901Var2.p.b(e2, "Unable to get advertising id");
                                x901Var2.j = "";
                            }
                            AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
                            pair = new Pair(x901Var2.j, Boolean.valueOf(x901Var2.k));
                        } else {
                            pair = new Pair(str, Boolean.valueOf(x901Var2.k));
                        }
                        Boolean s = mb01Var.h.s("google_analytics_adid_collection_enabled");
                        if ((s != null && !s.booleanValue()) || ((Boolean) pair.second).booleanValue() || TextUtils.isEmpty((CharSequence) pair.first)) {
                            mb01.k(k901Var);
                            k901Var.p.a("ADID unavailable to retrieve Deferred Deep Link. Skipping");
                            break;
                        } else {
                            mb01.k(bg01Var);
                            bg01Var.m();
                            ConnectivityManager connectivityManager = (ConnectivityManager) mb01Var2.b.getSystemService("connectivity");
                            URL url = null;
                            if (connectivityManager != null) {
                                try {
                                    activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                                } catch (SecurityException unused) {
                                }
                                if (activeNetworkInfo != null || !activeNetworkInfo.isConnected()) {
                                    mb01.k(k901Var);
                                    k901Var.l.a("Network is not available for Deferred Deep Link request. Skipping");
                                    break;
                                } else {
                                    sk01 sk01Var = mb01Var.m;
                                    mb01.i(sk01Var);
                                    ((mb01) mb01Var.o().b).h.p();
                                    String str2 = (String) pair.first;
                                    long a2 = x901Var2.v.a() - 1;
                                    mb01 mb01Var4 = (mb01) sk01Var.b;
                                    try {
                                        exc0.f(str2);
                                        exc0.f(o);
                                        String str3 = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=" + ("v74029." + sk01Var.h0()) + "&rdid=" + str2 + "&bundleid=" + o + "&retry=" + a2;
                                        if (o.equals(mb01Var4.h.l("debug.deferred.deeplink"))) {
                                            str3 = str3.concat("&ddl_test=1");
                                        }
                                        url = new URL(str3);
                                    } catch (IllegalArgumentException e3) {
                                        e = e3;
                                        k901 k901Var3 = mb01Var4.j;
                                        mb01.k(k901Var3);
                                        k901Var3.i.b(e.getMessage(), "Failed to create BOW URL for Deferred Deep Link. exception");
                                        if (url != null) {
                                            return;
                                        }
                                    } catch (MalformedURLException e4) {
                                        e = e4;
                                        k901 k901Var32 = mb01Var4.j;
                                        mb01.k(k901Var32);
                                        k901Var32.i.b(e.getMessage(), "Failed to create BOW URL for Deferred Deep Link. exception");
                                        if (url != null) {
                                        }
                                    }
                                    if (url != null) {
                                        mb01.k(bg01Var);
                                        m3a m3aVar2 = new m3a(mb01Var);
                                        bg01Var.k();
                                        bg01Var.m();
                                        kb01 kb01Var2 = mb01Var2.k;
                                        mb01.k(kb01Var2);
                                        kb01Var2.r(new ag01(bg01Var, o, url, m3aVar2));
                                        break;
                                    }
                                }
                            }
                            activeNetworkInfo = null;
                            if (activeNetworkInfo != null) {
                            }
                            mb01.k(k901Var);
                            k901Var.l.a("Network is not available for Deferred Deep Link request. Skipping");
                        }
                    } else {
                        mb01.k(k901Var);
                        k901Var.l.a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                        mb01.i(x901Var2);
                        x901Var2.u.a(true);
                        break;
                    }
                } else {
                    mb01.k(k901Var);
                    k901Var.p.a("Deferred Deep Link already retrieved. Not fetching again.");
                    break;
                }
                break;
        }
    }
}
