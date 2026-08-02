package com.yandex.pulse.histogram;

import android.util.Log;
import defpackage.cjy;
import defpackage.cvw;
import defpackage.djy;
import defpackage.gp50;
import defpackage.olu;
import defpackage.sku;
import defpackage.t7u0;
import defpackage.tku;
import defpackage.uku;
import defpackage.vku;
import defpackage.ycs0;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/pulse/histogram/ComponentHistograms;", "", "vez0", "histograms_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ComponentHistograms {
    public static final Object b = new Object();
    public static final ycs0 c = new ycs0();
    public final String a;

    public ComponentHistograms(String str) {
        this.a = str;
    }

    public final vku a(String str) {
        vku vkuVar;
        String str2 = this.a;
        synchronized (gp50.c) {
            try {
                if (gp50.x == null) {
                    new gp50(1);
                }
                if (!((ycs0) gp50.x.b).containsKey(str2)) {
                    ((ycs0) gp50.x.b).put(str2, new t7u0());
                }
                vkuVar = (vku) ((t7u0) ((ycs0) gp50.x.b).get(str2)).a.get(str);
            } catch (Throwable th) {
                throw th;
            }
        }
        return vkuVar;
    }

    public final vku b(int i, int i2, int i3, String str) {
        tku N = cvw.N(i, i2, i3);
        if (!N.a) {
            Log.e("Histogram", "Requested histogram construction arguments were changed. See details above.");
        }
        return new sku(str, uku.class, N.b, N.c, N.d).b(this);
    }

    public final vku c(int i, int i2, int i3, String str) {
        tku N = cvw.N(i, i2, i3);
        if (!N.a) {
            Log.e("LinearHistogram", "Requested histogram construction arguments were changed. See details above.");
        }
        return new cjy(str, djy.class, N.b, N.c, N.d).b(this);
    }

    public final void d(olu oluVar) {
        String str = this.a;
        synchronized (gp50.c) {
            if (gp50.x == null) {
                new gp50(1);
            }
            if (!((ycs0) gp50.x.b).containsKey(str)) {
                ((ycs0) gp50.x.b).put(str, new t7u0());
            }
            ((t7u0) ((ycs0) gp50.x.b).get(str)).a(oluVar);
        }
    }

    public final vku e(vku vkuVar) {
        String str = this.a;
        synchronized (gp50.c) {
            try {
                if (gp50.x == null) {
                    new gp50(1);
                }
                if (!((ycs0) gp50.x.b).containsKey(str)) {
                    ((ycs0) gp50.x.b).put(str, new t7u0());
                }
                ycs0 ycs0Var = ((t7u0) ((ycs0) gp50.x.b).get(str)).a;
                String str2 = vkuVar.a;
                vku vkuVar2 = (vku) ycs0Var.get(str2);
                if (vkuVar2 == null) {
                    ycs0Var.put(str2, vkuVar);
                } else {
                    vkuVar = vkuVar2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return vkuVar;
    }
}
