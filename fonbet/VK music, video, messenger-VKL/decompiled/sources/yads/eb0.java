package yads;

import android.content.Context;
import android.os.SystemClock;
import android.webkit.URLUtil;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.unity3d.ads.BuildConfig;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.text.Regex;
import xsna.brm0;
import xsna.epx;

/* loaded from: classes10.dex */
public final class eb0 implements s63 {
    public final d4 a;
    public final v9 b;
    public final z9 c;
    public final p2 d;
    public final mm0 e;
    public final WeakReference f;

    public eb0(Context context, d4 d4Var, v9 v9Var, z9 z9Var, p2 p2Var, mm0 mm0Var) {
        this.a = d4Var;
        this.b = v9Var;
        this.c = z9Var;
        this.d = p2Var;
        this.e = mm0Var;
        this.f = new WeakReference(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    @Override // yads.s63
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(lv lvVar, String str) {
        dv dvVar;
        zu zuVar;
        String str2;
        this.e.a.getClass();
        boolean z = this.b.C;
        p2 p2Var = this.d;
        Context context = (Context) this.f.get();
        d4 d4Var = this.a;
        v9 v9Var = this.b;
        z9 z9Var = this.c;
        p2Var.getClass();
        if (context == null) {
            return;
        }
        AtomicLong atomicLong = o2.a;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long andSet = elapsedRealtime - o2.a.getAndSet(elapsedRealtime);
        if (0 <= andSet && andSet < 1001) {
            return;
        }
        qu2 a = gx2.a().a(context);
        boolean z2 = false;
        if (a != null && (str2 = a.V) != null) {
            dv.c.getClass();
            dv[] values = dv.values();
            int length = values.length;
            for (int i = 0; i < length; i++) {
                dvVar = values[i];
                if (epx.f(dvVar.b, str2)) {
                    break;
                }
            }
        }
        dvVar = null;
        if ((z && dvVar == null) || dv.d == dvVar) {
            if (str.length() != 0) {
                String i2 = new Regex("http(s?)://").i(str, "");
                for (ec3 ec3Var : ec3.values()) {
                    if (brm0.B(i2, ec3Var.b, false)) {
                        break;
                    }
                }
            }
            if (URLUtil.isNetworkUrl(str)) {
                zuVar = zu.c;
                z2 = p2Var.a.a(context, v9Var, z9Var, d4Var, str);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("click_type", BuildConfig.FLAVOR);
                linkedHashMap.put("click_handled", Boolean.valueOf(z2));
                linkedHashMap.put(CampaignEx.JSON_KEY_CLICK_URL, bc3.a(str));
                linkedHashMap.put("click_destination", zuVar.b);
                dp2 dp2Var = dp2.t;
                fp2 a2 = lvVar.a(dp2Var, linkedHashMap);
                lvVar.d.a(a2);
                lvVar.f.a(dp2Var, a2.b, cp2.a, null);
                if (z9Var == null) {
                    z9Var.a(9, null);
                    return;
                }
                return;
            }
        }
        zuVar = zu.d;
        if (new hc3(new gc3()).a(context, str)) {
            z9Var.a(7, null);
            z2 = true;
        } else if (URLUtil.isNetworkUrl(str)) {
            z2 = p2Var.a.a(context, v9Var, z9Var, d4Var, str);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("click_type", BuildConfig.FLAVOR);
        linkedHashMap2.put("click_handled", Boolean.valueOf(z2));
        linkedHashMap2.put(CampaignEx.JSON_KEY_CLICK_URL, bc3.a(str));
        linkedHashMap2.put("click_destination", zuVar.b);
        dp2 dp2Var2 = dp2.t;
        fp2 a22 = lvVar.a(dp2Var2, linkedHashMap2);
        lvVar.d.a(a22);
        lvVar.f.a(dp2Var2, a22.b, cp2.a, null);
        if (z9Var == null) {
        }
    }
}
