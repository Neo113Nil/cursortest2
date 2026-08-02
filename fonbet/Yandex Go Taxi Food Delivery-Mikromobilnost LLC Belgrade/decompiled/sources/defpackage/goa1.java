package defpackage;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.g;
import com.google.android.gms.measurement.internal.j;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzbg;
import com.google.android.gms.measurement.internal.zzpl;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.Iterator;
import java.util.TreeSet;

/* loaded from: classes11.dex */
public final class goa1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j b;
    public final /* synthetic */ Bundle c;

    public /* synthetic */ goa1(j jVar, Bundle bundle, int i) {
        this.a = i;
        this.c = bundle;
        this.b = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle;
        int i = this.a;
        Bundle bundle2 = this.c;
        j jVar = this.b;
        switch (i) {
            case 0:
                jVar.Gg();
                jVar.Hg();
                String string = bundle2.getString("name");
                String string2 = bundle2.getString("origin");
                cvw.i(string);
                cvw.i(string2);
                cvw.l(bundle2.get("value"));
                g gVar = (g) jVar.b;
                if (!gVar.a()) {
                    y1a1 y1a1Var = gVar.y;
                    g.g(y1a1Var);
                    y1a1Var.H.a("Conditional property not set since app measurement is disabled");
                    break;
                } else {
                    zzpl zzplVar = new zzpl(string, bundle2.getLong("triggered_timestamp"), bundle2.get("value"), string2);
                    try {
                        ieb1 ieb1Var = gVar.B;
                        g.e(ieb1Var);
                        bundle2.getString(CommonUrlParts.APP_ID);
                        zzbg hh = ieb1Var.hh(bundle2.getString("triggered_event_name"), bundle2.getBundle("triggered_event_params"), string2, 0L, true);
                        g.e(ieb1Var);
                        bundle2.getString(CommonUrlParts.APP_ID);
                        zzbg hh2 = ieb1Var.hh(bundle2.getString("timed_out_event_name"), bundle2.getBundle("timed_out_event_params"), string2, 0L, true);
                        bundle2.getString(CommonUrlParts.APP_ID);
                        gVar.j().Zg(new zzah(bundle2.getString(CommonUrlParts.APP_ID), string2, zzplVar, bundle2.getLong("creation_timestamp"), false, bundle2.getString("trigger_event_name"), hh2, bundle2.getLong("trigger_timeout"), hh, bundle2.getLong("time_to_live"), ieb1Var.hh(bundle2.getString("expired_event_name"), bundle2.getBundle("expired_event_params"), string2, 0L, true)));
                        break;
                    } catch (IllegalArgumentException unused) {
                        return;
                    }
                }
            default:
                o370 o370Var = jVar.Q;
                g gVar2 = (g) jVar.b;
                if (bundle2.isEmpty()) {
                    bundle = bundle2;
                } else {
                    o5a1 o5a1Var = gVar2.x;
                    ieb1 ieb1Var2 = gVar2.B;
                    j691 j691Var = gVar2.w;
                    y1a1 y1a1Var2 = gVar2.y;
                    g.e(o5a1Var);
                    bundle = new Bundle(o5a1Var.S.D());
                    for (String str : bundle2.keySet()) {
                        Object obj = bundle2.get(str);
                        if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                            g.e(ieb1Var2);
                            if (ieb1.Nh(obj)) {
                                ieb1.Wg(o370Var, null, 27, null, null, 0);
                            }
                            g.g(y1a1Var2);
                            y1a1Var2.E.c("Invalid default event parameter type. Name, value", str, obj);
                        } else if (ieb1.dh(str)) {
                            g.g(y1a1Var2);
                            y1a1Var2.E.b(str, "Invalid default event parameter name. Name");
                        } else if (obj == null) {
                            bundle.remove(str);
                        } else {
                            g.e(ieb1Var2);
                            j691Var.getClass();
                            if (ieb1Var2.Oh("param", str, 500, obj)) {
                                ieb1Var2.Vg(bundle, str, obj);
                            }
                        }
                    }
                    g.e(ieb1Var2);
                    ieb1 ieb1Var3 = ((g) j691Var.b).B;
                    g.e(ieb1Var3);
                    int i2 = ieb1Var3.kh(201500000) ? 100 : 25;
                    if (bundle.size() > i2) {
                        Iterator it = new TreeSet(bundle.keySet()).iterator();
                        int i3 = 0;
                        while (it.hasNext()) {
                            String str2 = (String) it.next();
                            i3++;
                            if (i3 > i2) {
                                bundle.remove(str2);
                            }
                        }
                        g.e(ieb1Var2);
                        ieb1.Wg(o370Var, null, 26, null, null, 0);
                        g.g(y1a1Var2);
                        y1a1Var2.E.a("Too many default event parameters set. Discarding beyond event parameter limit");
                    }
                }
                o5a1 o5a1Var2 = gVar2.x;
                g.e(o5a1Var2);
                o5a1Var2.S.F(bundle);
                if (!bundle2.isEmpty() || gVar2.w.Qg(null, nw91.W0)) {
                    gVar2.j().Lg(bundle);
                    break;
                }
                break;
        }
    }
}
