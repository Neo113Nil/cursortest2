package com.vungle.ads.internal;

import android.content.Context;
import android.view.MotionEvent;
import com.vungle.ads.TpatError;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.text.Regex;
import xsna.msy;

/* loaded from: classes7.dex */
public final class p0 {
    public static final String d = Pattern.quote("{{{req_width}}}");
    public static final String e = Pattern.quote("{{{req_height}}}");
    public static final String f = Pattern.quote("{{{width}}}");
    public static final String g = Pattern.quote("{{{height}}}");
    public static final String h = Pattern.quote("{{{down_x}}}");
    public static final String i = Pattern.quote("{{{down_y}}}");
    public static final String j = Pattern.quote("{{{up_x}}}");
    public static final String k = Pattern.quote("{{{up_y}}}");
    public final Context a;
    public final com.vungle.ads.internal.model.h0 b;
    public final l0 c = new l0(new m0(Integer.MIN_VALUE, Integer.MIN_VALUE), new m0(Integer.MIN_VALUE, Integer.MIN_VALUE));

    public p0(Context context, com.vungle.ads.internal.model.h0 h0Var) {
        this.a = context;
        this.b = h0Var;
    }

    public final void a(MotionEvent motionEvent) {
        if (this.b.z()) {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.c.a(new m0((int) motionEvent.getX(), (int) motionEvent.getY()));
                return;
            }
            if (action != 1) {
                return;
            }
            this.c.b(new m0((int) motionEvent.getX(), (int) motionEvent.getY()));
            if (this.c.c()) {
                List a = com.vungle.ads.internal.model.h0.a(this.b, "video.clickCoordinates", (String) null, 6);
                if (a == null || a.isEmpty()) {
                    new TpatError(Sdk.SDKError.Reason.EMPTY_TPAT_ERROR, "Empty urls for tpat: video.clickCoordinates").setLogEntry$vungle_ads_release(this.b.q()).logErrorNoReturnValue$vungle_ads_release();
                    return;
                }
                int d2 = this.b.d();
                int a2 = d2 == 0 ? new n0(this.a).b.widthPixels : com.vungle.ads.internal.util.a0.a(this.a, d2);
                int a3 = this.b.a();
                int a4 = a3 == 0 ? new n0(this.a).b.heightPixels : com.vungle.ads.internal.util.a0.a(this.a, a3);
                int d3 = this.b.d();
                int a5 = d3 == 0 ? new n0(this.a).b.widthPixels : com.vungle.ads.internal.util.a0.a(this.a, d3);
                int a6 = this.b.a();
                int a7 = a6 == 0 ? new n0(this.a).b.heightPixels : com.vungle.ads.internal.util.a0.a(this.a, a6);
                Lazy a8 = msy.a(LazyThreadSafetyMode.SYNCHRONIZED, new o0(this.a));
                Iterator it = a.iterator();
                while (it.hasNext()) {
                    ((com.vungle.ads.internal.network.r) a8.getValue()).a(new com.vungle.ads.internal.network.p(new Regex(k).g(new Regex(j).g(new Regex(i).g(new Regex(h).g(new Regex(g).g(new Regex(f).g(new Regex(e).g(new Regex(d).g((String) it.next(), String.valueOf(a2)), String.valueOf(a4)), String.valueOf(a5)), String.valueOf(a7)), String.valueOf(this.c.a().a())), String.valueOf(this.c.a().b())), String.valueOf(this.c.b().a())), String.valueOf(this.c.b().b()))).b("coordinate").a(), false);
                }
            }
        }
    }
}
