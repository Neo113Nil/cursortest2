package defpackage;

import java.util.Map;
import ru.yandex.taxi.analytics.j;

/* loaded from: classes12.dex */
public final /* synthetic */ class cm9 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cm9(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0113, code lost:
    
        if (r10.equals("Map.TransportVehicle.Tapped") == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0155, code lost:
    
        ((defpackage.na1) r9).getClass();
        r3 = defpackage.as6.C();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x011a, code lost:
    
        if (r10.equals("Map.Stop.Tapped") == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0121, code lost:
    
        if (r10.equals("TransportRoute.DetailCard.Shown") != false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0152, code lost:
    
        if (r10.equals("masstransit.SuggestCard.ButtonClicked") == false) goto L68;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(mcw mcwVar) {
        String e;
        String str;
        lx4 lx4Var;
        String str2;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                dm9 dm9Var = (dm9) obj;
                ma1 ma1Var = dm9Var.b;
                String str3 = mcwVar.a;
                if (jl40.l(str3, "Chargers.QrScan.Closed")) {
                    Map map = mcwVar.b;
                    Object obj2 = map != null ? map.get("close_reason") : null;
                    if (jl40.l(obj2, "qr_scanned") || jl40.l(obj2, "entered_number")) {
                        ((na1) ma1Var).getClass();
                        e = as6.d();
                        if (e == null) {
                            dm9Var.b(str3, e);
                            break;
                        }
                    }
                    e = null;
                    if (e == null) {
                    }
                } else {
                    if (jl40.l(str3, "Chargers.Map.Tapped")) {
                        ((na1) ma1Var).getClass();
                        e = as6.e();
                        if (e == null) {
                        }
                    }
                    e = null;
                    if (e == null) {
                    }
                }
                break;
            case 1:
                sy00 sy00Var = (sy00) obj;
                sme0 sme0Var = sy00Var.d;
                lx4 lx4Var2 = sy00Var.a;
                sme0 sme0Var2 = sy00Var.c;
                kgx[] kgxVarArr = sy00.h;
                ma1 ma1Var2 = sy00Var.b;
                String str4 = mcwVar.a;
                Map map2 = mcwVar.b;
                switch (str4.hashCode()) {
                    case -1154835544:
                        if (str4.equals("TransportMain.Shortcut.Tapped")) {
                            Object obj3 = map2 != null ? map2.get("type") : null;
                            if (!jl40.l(obj3, "find_in_go_shortcut")) {
                                if (jl40.l(obj3, "suggest_shortcut")) {
                                    ((na1) ma1Var2).getClass();
                                    str = as6.K();
                                    break;
                                }
                            } else {
                                ((na1) ma1Var2).getClass();
                                str = as6.S();
                                break;
                            }
                        }
                        str = null;
                        break;
                    case 332008274:
                        if (str4.equals("TransportRoute.DetailCard.Shown")) {
                            ((na1) ma1Var2).getClass();
                            str = as6.D();
                            break;
                        }
                        str = null;
                        break;
                    case 556081222:
                        if (str4.equals("Map.Stop.Tapped")) {
                            ((na1) ma1Var2).getClass();
                            str = as6.L();
                            break;
                        }
                        str = null;
                        break;
                    case 1717880933:
                        if (str4.equals("Map.TransportVehicle.Tapped")) {
                            ((na1) ma1Var2).getClass();
                            str = as6.Q();
                            break;
                        }
                        str = null;
                        break;
                    default:
                        str = null;
                        break;
                }
                if (str != null) {
                    lx4Var = lx4Var2;
                    long longValue = ((Number) sme0Var2.getValue(sy00Var, kgxVarArr[0])).longValue();
                    long currentTimeMillis = System.currentTimeMillis();
                    if (currentTimeMillis >= longValue + 1800000) {
                        ((j) lx4Var).v(str);
                        sme0Var2.setValue(sy00Var, sy00.h[0], Long.valueOf(currentTimeMillis));
                    }
                } else {
                    lx4Var = lx4Var2;
                }
                switch (str4.hashCode()) {
                    case -1554285620:
                        break;
                    case -1154835544:
                        if (str4.equals("TransportMain.Shortcut.Tapped")) {
                            Object obj4 = map2 != null ? map2.get("type") : null;
                            if (jl40.l(obj4, "find_in_go_shortcut") || jl40.l(obj4, "suggest_shortcut")) {
                                ((na1) ma1Var2).getClass();
                                str2 = as6.C();
                                break;
                            }
                        }
                        str2 = null;
                        break;
                    case 332008274:
                        break;
                    case 556081222:
                        break;
                    case 1717880933:
                        break;
                    default:
                        str2 = null;
                        break;
                }
                if (str2 != null) {
                    long longValue2 = ((Number) sme0Var.getValue(sy00Var, kgxVarArr[1])).longValue();
                    long currentTimeMillis2 = System.currentTimeMillis();
                    if (currentTimeMillis2 >= longValue2 + 1800000) {
                        ((j) lx4Var).v(str2);
                        sme0Var.setValue(sy00Var, sy00.h[1], Long.valueOf(currentTimeMillis2));
                        break;
                    }
                }
                break;
            default:
                dt20 dt20Var = (dt20) obj;
                String str5 = mcwVar.a;
                cne0 cne0Var = (cne0) dt20Var.c;
                String str6 = (String) ((Map) dt20Var.w).get(str5);
                if (str6 != null) {
                    String j = b64.j(str5, "_last_tracked_event_time");
                    long j2 = cne0Var.j(j, 0L);
                    long currentTimeMillis3 = System.currentTimeMillis();
                    if (currentTimeMillis3 >= j2 + 1800000) {
                        ((j) ((lx4) dt20Var.b)).v(str6);
                        cne0Var.q(currentTimeMillis3, j);
                        break;
                    }
                }
                break;
        }
    }
}
