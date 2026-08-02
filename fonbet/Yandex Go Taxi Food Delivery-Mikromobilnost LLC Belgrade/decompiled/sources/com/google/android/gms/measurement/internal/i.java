package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzcu;
import defpackage.hx61;
import defpackage.ieb1;
import defpackage.j5b1;
import defpackage.l1a1;
import defpackage.nw91;
import defpackage.svb1;
import defpackage.y1a1;

/* loaded from: classes11.dex */
public final class i implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;

    public i(AppMeasurementDynamiteService appMeasurementDynamiteService, zzcu zzcuVar, String str, String str2, boolean z) {
        this.x = zzcuVar;
        this.c = str;
        this.w = str2;
        this.b = z;
        this.y = appMeasurementDynamiteService;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00b4 A[Catch: RuntimeException -> 0x0092, TRY_ENTER, TryCatch #1 {RuntimeException -> 0x0092, blocks: (B:15:0x00b4, B:17:0x00bf, B:20:0x00cc, B:22:0x00d2, B:23:0x00ec, B:24:0x00f5, B:29:0x00fd, B:32:0x0116, B:33:0x0125, B:35:0x011d, B:36:0x0138, B:38:0x013e, B:40:0x0144, B:42:0x014a, B:44:0x0150, B:46:0x0158, B:48:0x0160, B:50:0x0166, B:53:0x0178, B:58:0x0041, B:60:0x0047, B:62:0x0051, B:64:0x0057, B:66:0x005d, B:68:0x0063, B:70:0x006b, B:72:0x0073, B:74:0x007b, B:76:0x0083, B:77:0x0099, B:79:0x00a7), top: B:57:0x0041 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00fd A[Catch: RuntimeException -> 0x0092, TryCatch #1 {RuntimeException -> 0x0092, blocks: (B:15:0x00b4, B:17:0x00bf, B:20:0x00cc, B:22:0x00d2, B:23:0x00ec, B:24:0x00f5, B:29:0x00fd, B:32:0x0116, B:33:0x0125, B:35:0x011d, B:36:0x0138, B:38:0x013e, B:40:0x0144, B:42:0x014a, B:44:0x0150, B:46:0x0158, B:48:0x0160, B:50:0x0166, B:53:0x0178, B:58:0x0041, B:60:0x0047, B:62:0x0051, B:64:0x0057, B:66:0x005d, B:68:0x0063, B:70:0x006b, B:72:0x0073, B:74:0x007b, B:76:0x0083, B:77:0x0099, B:79:0x00a7), top: B:57:0x0041 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        zzky zzkyVar;
        ieb1 ieb1Var;
        y1a1 y1a1Var;
        y1a1 y1a1Var2;
        Bundle Eh;
        boolean z;
        String str;
        int i = this.a;
        Object obj = this.x;
        Object obj2 = this.y;
        switch (i) {
            case 0:
                j5b1 j = ((AppMeasurementDynamiteService) obj2).zza.j();
                j.Gg();
                j.Hg();
                j.Ug(new hx61(j, this.c, this.w, j.Wg(false), this.b, (zzcu) obj));
                break;
            default:
                zzky zzkyVar2 = (zzky) obj2;
                j jVar = zzkyVar2.zza;
                jVar.Gg();
                g gVar = (g) jVar.b;
                svb1 svb1Var = jVar.L;
                String str2 = this.w;
                Uri uri = (Uri) obj;
                try {
                    ieb1Var = gVar.B;
                    y1a1Var = gVar.y;
                    g.e(ieb1Var);
                } catch (RuntimeException e) {
                    e = e;
                    zzkyVar = zzkyVar2;
                }
                try {
                    zzkyVar = zzkyVar2;
                    if (TextUtils.isEmpty(str2)) {
                        y1a1Var2 = y1a1Var;
                    } else {
                        try {
                            if (str2.contains("gclid")) {
                                y1a1Var2 = y1a1Var;
                            } else {
                                y1a1Var2 = y1a1Var;
                                if (!str2.contains("gbraid") && !str2.contains("utm_campaign") && !str2.contains("utm_source") && !str2.contains("utm_medium") && !str2.contains("utm_id") && !str2.contains("dclid") && !str2.contains("srsltid") && !str2.contains("sfmc_id")) {
                                    y1a1 y1a1Var3 = ((g) ieb1Var.b).y;
                                    g.g(y1a1Var3);
                                    y1a1Var3.G.a("Activity created with data 'referrer' without required params");
                                }
                            }
                            Eh = ieb1Var.Eh(Uri.parse("https://google.com/search?".concat(str2)));
                            if (Eh != null) {
                                Eh.putString("_cis", "referrer");
                            }
                            z = this.b;
                            String str3 = this.c;
                            if (z) {
                                ieb1 ieb1Var2 = gVar.B;
                                g.e(ieb1Var2);
                                Bundle Eh2 = ieb1Var2.Eh(uri);
                                if (Eh2 != null) {
                                    Eh2.putString("_cis", "intent");
                                    if (Eh2.containsKey("gclid") || Eh == null || !Eh.containsKey("gclid")) {
                                        str = "Activity created with data 'referrer' without required params";
                                    } else {
                                        str = "Activity created with data 'referrer' without required params";
                                        Eh2.putString("_cer", "gclid=" + Eh.getString("gclid"));
                                    }
                                    jVar.Ng(str3, "_cmp", Eh2);
                                    svb1Var.b(Eh2, str3);
                                    if (!TextUtils.isEmpty(str2)) {
                                        g.g(y1a1Var2);
                                        y1a1 y1a1Var4 = y1a1Var2;
                                        l1a1 l1a1Var = y1a1Var4.G;
                                        l1a1Var.b(str2, "Activity created with referrer");
                                        if (!gVar.w.Qg(null, nw91.G0)) {
                                            if (!str2.contains("gclid") || (!str2.contains("utm_campaign") && !str2.contains("utm_source") && !str2.contains("utm_medium") && !str2.contains("utm_term") && !str2.contains("utm_content"))) {
                                                g.g(y1a1Var4);
                                                l1a1Var.a(str);
                                                break;
                                            } else if (!TextUtils.isEmpty(str2)) {
                                                gVar.D.getClass();
                                                jVar.Qg("auto", "_ldl", str2, true, System.currentTimeMillis());
                                                break;
                                            }
                                        } else {
                                            if (Eh != null) {
                                                jVar.Ng(str3, "_cmp", Eh);
                                                svb1Var.b(Eh, str3);
                                            } else {
                                                g.g(y1a1Var4);
                                                l1a1Var.b(str2, "Referrer does not contain valid parameters");
                                            }
                                            gVar.D.getClass();
                                            jVar.Qg("auto", "_ldl", null, true, System.currentTimeMillis());
                                            break;
                                        }
                                    } else {
                                        break;
                                    }
                                }
                            }
                            str = "Activity created with data 'referrer' without required params";
                            if (!TextUtils.isEmpty(str2)) {
                            }
                        } catch (RuntimeException e2) {
                            e = e2;
                            zzkyVar2 = zzkyVar;
                            y1a1 y1a1Var5 = ((g) zzkyVar2.zza.b).y;
                            g.g(y1a1Var5);
                            y1a1Var5.z.b(e, "Throwable caught in handleReferrerForOnActivityCreated");
                        }
                    }
                    Eh = null;
                    z = this.b;
                    String str32 = this.c;
                    if (z) {
                    }
                    str = "Activity created with data 'referrer' without required params";
                    if (!TextUtils.isEmpty(str2)) {
                    }
                } catch (RuntimeException e3) {
                    e = e3;
                    y1a1 y1a1Var52 = ((g) zzkyVar2.zza.b).y;
                    g.g(y1a1Var52);
                    y1a1Var52.z.b(e, "Throwable caught in handleReferrerForOnActivityCreated");
                }
                break;
        }
    }

    public i(zzky zzkyVar, boolean z, Uri uri, String str, String str2) {
        this.b = z;
        this.x = uri;
        this.c = str;
        this.w = str2;
        this.y = zzkyVar;
    }
}
