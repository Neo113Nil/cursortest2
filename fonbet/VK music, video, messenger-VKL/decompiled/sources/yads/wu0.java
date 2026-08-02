package yads;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import android.telephony.TelephonyManager;
import android.telephony.gsm.GsmCellLocation;
import com.facebook.soloader.MinElf;
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import ru.ok.tracer.base.deviceid.DeviceIdUtils;
import xsna.an10;
import xsna.arm0;
import xsna.brm0;
import xsna.c5g;
import xsna.drm0;
import xsna.epx;
import xsna.j5g;
import xsna.j8y;
import xsna.oqm0;

/* loaded from: classes10.dex */
public final class wu0 {
    /* JADX WARN: Can't wrap try/catch for region: R(38:0|1|(2:2|3)|4|(4:6|(1:19)(1:12)|13|(1:18))|20|(1:24)|25|(4:27|(1:40)(1:33)|34|(1:39))|41|(2:42|43)|(3:(2:45|(27:48|49|50|51|(22:53|54|55|56|(17:58|59|60|61|(4:159|(1:161)|162|(15:164|(3:166|(2:168|169)(2:171|172)|170)|173|174|65|(1:67)(1:158)|68|69|70|71|72|73|74|75|76))(1:63)|64|65|(0)(0)|68|69|70|71|72|73|74|75|76)|178|59|60|61|(0)(0)|64|65|(0)(0)|68|69|70|71|72|73|74|75|76)|181|54|55|56|(0)|178|59|60|61|(0)(0)|64|65|(0)(0)|68|69|70|71|72|73|74|75|76))|75|76)|184|49|50|51|(0)|181|54|55|56|(0)|178|59|60|61|(0)(0)|64|65|(0)(0)|68|69|70|71|72|73|74|(1:(27:78|79|(1:81)(1:151)|82|(1:84)(1:150)|85|(1:87)(1:149)|88|319|93|(1:95)|96|(1:98)(1:145)|(1:100)|101|(1:103)|104|(4:107|(2:112|(2:113|(1:1)(2:115|(3:117|118|119)(1:121))))(1:123)|120|105)|125|126|(4:129|(3:131|132|133)(1:135)|134|127)|136|137|(2:140|138)|141|142|143))) */
    /* JADX WARN: Can't wrap try/catch for region: R(41:0|1|2|3|4|(4:6|(1:19)(1:12)|13|(1:18))|20|(1:24)|25|(4:27|(1:40)(1:33)|34|(1:39))|41|(2:42|43)|(2:45|(27:48|49|50|51|(22:53|54|55|56|(17:58|59|60|61|(4:159|(1:161)|162|(15:164|(3:166|(2:168|169)(2:171|172)|170)|173|174|65|(1:67)(1:158)|68|69|70|71|72|73|74|75|76))(1:63)|64|65|(0)(0)|68|69|70|71|72|73|74|75|76)|178|59|60|61|(0)(0)|64|65|(0)(0)|68|69|70|71|72|73|74|75|76)|181|54|55|56|(0)|178|59|60|61|(0)(0)|64|65|(0)(0)|68|69|70|71|72|73|74|75|76))|184|49|50|51|(0)|181|54|55|56|(0)|178|59|60|61|(0)(0)|64|65|(0)(0)|68|69|70|71|72|73|74|75|76|(1:(27:78|79|(1:81)(1:151)|82|(1:84)(1:150)|85|(1:87)(1:149)|88|319|93|(1:95)|96|(1:98)(1:145)|(1:100)|101|(1:103)|104|(4:107|(2:112|(2:113|(1:1)(2:115|(3:117|118|119)(1:121))))(1:123)|120|105)|125|126|(4:129|(3:131|132|133)(1:135)|134|127)|136|137|(2:140|138)|141|142|143))) */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x01e1, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x01c9, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01fa, code lost:
    
        if (r3.length() == 0) goto L101;
     */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x014a A[Catch: Exception -> 0x019f, TryCatch #0 {Exception -> 0x019f, blocks: (B:61:0x0137, B:159:0x014a, B:161:0x0150, B:162:0x0152, B:164:0x0161, B:166:0x0175, B:170:0x0196, B:174:0x019a), top: B:60:0x0137 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x010f A[Catch: Exception -> 0x0115, TRY_LEAVE, TryCatch #5 {Exception -> 0x0115, blocks: (B:51:0x00fb, B:53:0x010f), top: B:50:0x00fb }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x012c A[Catch: Exception -> 0x0133, TRY_LEAVE, TryCatch #6 {Exception -> 0x0133, blocks: (B:56:0x0118, B:58:0x012c), top: B:55:0x0118 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static vu0 a(Context context, sy2 sy2Var, qx qxVar, tq2 tq2Var, qb2 qb2Var) {
        String str;
        Integer num;
        Integer num2;
        Integer num3;
        String str2;
        String str3;
        String str4;
        String str5;
        WifiManager wifiManager;
        int lac;
        int cid;
        Intent registerReceiver;
        km0 km0Var = qxVar.a;
        rd rdVar = qxVar.b;
        vu0 vu0Var = new vu0(sy2Var.b(context));
        vu0Var.n0 = context.getPackageName();
        vu0Var.o0 = og.a(context);
        vu0Var.p0 = og.b(context);
        vu0Var.c.getClass();
        pg.a(context);
        try {
            str = AppMetrica.getLibraryVersion();
        } catch (Throwable unused) {
            str = null;
        }
        vu0Var.C0 = str;
        td tdVar = rdVar.a;
        boolean z = rdVar.c;
        if (tdVar != null) {
            vu0Var.N = Boolean.valueOf(tdVar.b);
            vu0Var.O = Boolean.valueOf(z);
            String str6 = tdVar.a;
            vu0Var.e.getClass();
            boolean z2 = (str6 == null || str6.length() == 0 || DeviceIdUtils.NULL_UUID.equals(str6)) ? false : true;
            if (!vu0Var.a && epx.f(vu0Var.N, Boolean.FALSE) && z2) {
                vu0Var.P = str6;
            }
        }
        String str7 = rdVar.d;
        if (str7 != null && !drm0.N(str7)) {
            vu0Var.l = str7;
        }
        td tdVar2 = rdVar.b;
        if (tdVar2 != null) {
            vu0Var.Q = Boolean.valueOf(tdVar2.b);
            String str8 = tdVar2.a;
            vu0Var.e.getClass();
            boolean z3 = (str8 == null || str8.length() == 0 || DeviceIdUtils.NULL_UUID.equals(str8)) ? false : true;
            if (!vu0Var.a && epx.f(vu0Var.Q, Boolean.FALSE) && z3) {
                vu0Var.R = str8;
            }
        }
        try {
            registerReceiver = context.getApplicationContext().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        } catch (Exception unused2) {
        }
        try {
            if (registerReceiver != null) {
                int intExtra = registerReceiver.getIntExtra("level", -1);
                int intExtra2 = registerReceiver.getIntExtra("scale", -1);
                if (intExtra > -1 && intExtra2 > 0) {
                    num = Integer.valueOf(an10.b((intExtra / intExtra2) * 100));
                    vu0Var.S = num;
                    vu0Var.Z = C.UTF8_NAME;
                    cid = ((GsmCellLocation) ((TelephonyManager) context.getSystemService("phone")).getCellLocation()).getCid();
                    if (-1 != cid) {
                        num2 = Integer.valueOf(cid & MinElf.PN_XNUM);
                        vu0Var.K = num2;
                        lac = ((GsmCellLocation) ((TelephonyManager) context.getSystemService("phone")).getCellLocation()).getLac();
                        if (-1 != lac) {
                            num3 = Integer.valueOf(lac & MinElf.PN_XNUM);
                            vu0Var.L = num3;
                            wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi");
                            if (wifiManager.isWifiEnabled()) {
                                List<ScanResult> scanResults = wifiManager.getScanResults();
                                if (scanResults == null) {
                                    scanResults = EmptyList.b;
                                }
                                List D0 = j5g.D0(new yd2(), scanResults);
                                if (!D0.isEmpty()) {
                                    StringBuilder sb = new StringBuilder();
                                    int min = Math.min(3, D0.size());
                                    int i = 0;
                                    while (i < min) {
                                        sb.append(((ScanResult) D0.get(i)).BSSID);
                                        sb.append(StringUtils.COMMA);
                                        sb.append(((ScanResult) D0.get(i)).level);
                                        i++;
                                        sb.append(i < min ? ";" : "");
                                    }
                                    str2 = sb.toString();
                                    vu0Var.M = str2;
                                    vu0Var.B = vu0Var.a ? null : bi1.a(context).a();
                                    Integer num4 = arm0.m(10, ((TelephonyManager) context.getSystemService("phone")).getNetworkOperator().substring(0, 3));
                                    vu0Var.F = num4;
                                    Integer num5 = arm0.m(10, ((TelephonyManager) context.getSystemService("phone")).getNetworkOperator().substring(3));
                                    vu0Var.G = num5;
                                    vu0Var.H = zd2.a(context);
                                    str3 = ((TelephonyManager) context.getSystemService("phone")).getNetworkOperatorName();
                                }
                            }
                            str2 = null;
                            vu0Var.M = str2;
                            vu0Var.B = vu0Var.a ? null : bi1.a(context).a();
                            Integer num42 = arm0.m(10, ((TelephonyManager) context.getSystemService("phone")).getNetworkOperator().substring(0, 3));
                            vu0Var.F = num42;
                            Integer num52 = arm0.m(10, ((TelephonyManager) context.getSystemService("phone")).getNetworkOperator().substring(3));
                            vu0Var.G = num52;
                            vu0Var.H = zd2.a(context);
                            str3 = ((TelephonyManager) context.getSystemService("phone")).getNetworkOperatorName();
                        }
                        num3 = null;
                        vu0Var.L = num3;
                        wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi");
                        if (wifiManager.isWifiEnabled()) {
                        }
                        str2 = null;
                        vu0Var.M = str2;
                        vu0Var.B = vu0Var.a ? null : bi1.a(context).a();
                        Integer num422 = arm0.m(10, ((TelephonyManager) context.getSystemService("phone")).getNetworkOperator().substring(0, 3));
                        vu0Var.F = num422;
                        Integer num522 = arm0.m(10, ((TelephonyManager) context.getSystemService("phone")).getNetworkOperator().substring(3));
                        vu0Var.G = num522;
                        vu0Var.H = zd2.a(context);
                        str3 = ((TelephonyManager) context.getSystemService("phone")).getNetworkOperatorName();
                    }
                    num2 = null;
                    vu0Var.K = num2;
                    lac = ((GsmCellLocation) ((TelephonyManager) context.getSystemService("phone")).getCellLocation()).getLac();
                    if (-1 != lac) {
                    }
                    num3 = null;
                    vu0Var.L = num3;
                    wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi");
                    if (wifiManager.isWifiEnabled()) {
                    }
                    str2 = null;
                    vu0Var.M = str2;
                    vu0Var.B = vu0Var.a ? null : bi1.a(context).a();
                    Integer num4222 = arm0.m(10, ((TelephonyManager) context.getSystemService("phone")).getNetworkOperator().substring(0, 3));
                    vu0Var.F = num4222;
                    Integer num5222 = arm0.m(10, ((TelephonyManager) context.getSystemService("phone")).getNetworkOperator().substring(3));
                    vu0Var.G = num5222;
                    vu0Var.H = zd2.a(context);
                    str3 = ((TelephonyManager) context.getSystemService("phone")).getNetworkOperatorName();
                }
            }
            str3 = ((TelephonyManager) context.getSystemService("phone")).getNetworkOperatorName();
        } catch (Exception unused3) {
        }
        num = null;
        vu0Var.S = num;
        vu0Var.Z = C.UTF8_NAME;
        cid = ((GsmCellLocation) ((TelephonyManager) context.getSystemService("phone")).getCellLocation()).getCid();
        if (-1 != cid) {
        }
        num2 = null;
        vu0Var.K = num2;
        lac = ((GsmCellLocation) ((TelephonyManager) context.getSystemService("phone")).getCellLocation()).getLac();
        if (-1 != lac) {
        }
        num3 = null;
        vu0Var.L = num3;
        wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi");
        if (wifiManager.isWifiEnabled()) {
        }
        str2 = null;
        vu0Var.M = str2;
        vu0Var.B = vu0Var.a ? null : bi1.a(context).a();
        Integer num42222 = arm0.m(10, ((TelephonyManager) context.getSystemService("phone")).getNetworkOperator().substring(0, 3));
        vu0Var.F = num42222;
        Integer num52222 = arm0.m(10, ((TelephonyManager) context.getSystemService("phone")).getNetworkOperator().substring(3));
        vu0Var.G = num52222;
        vu0Var.H = zd2.a(context);
        str3 = null;
        vu0Var.I = str3;
        vu0Var.C = Integer.valueOf(om3.d(context));
        vu0Var.D = Integer.valueOf(om3.b(context));
        vu0Var.E = Float.valueOf(context.getResources().getDisplayMetrics().density);
        vu0Var.r0 = om3.a(context);
        wg0 b = zp3.b(context);
        vu0Var.s0 = b.a;
        vu0Var.t0 = b.b;
        vu0Var.u0 = b.c;
        vu0Var.v0 = b.d;
        vu0Var.w0 = b.e;
        vu0Var.x0 = b.f;
        vu0Var.A0 = vu0Var.d.a("%d.%d%d");
        vu0Var.B0 = vu0Var.d.a("%d.%d.%d");
        vu0Var.g = sy2.a(context);
        vu0Var.Y = Long.valueOf(tb.a);
        km0Var.getClass();
        vu0Var.a0 = null;
        vu0 a = vu0Var.a(context, km0Var.a);
        a.u = km0Var.b();
        a.m = km0Var.d;
        List list = qxVar.c;
        a.W = list != null ? j5g.g0(list, StringUtils.COMMA, null, null, 0, null, 62) : null;
        if (new z20(context).a()) {
            hq2 hq2Var = hq2.c;
            str4 = "dark";
        } else {
            hq2 hq2Var2 = hq2.c;
            str4 = "light";
        }
        a.E0 = str4;
        a.j = gx2.a().d();
        tq2Var.getClass();
        a.A = 1 == context.getResources().getConfiguration().orientation ? X3.i.D : X3.i.C;
        a.k = gx2.a().b();
        xw.a.getClass();
        a.p = ((zw) ww.a(context)).c();
        a.q = ((zw) ww.a(context)).b();
        a.o = ((zw) ww.a(context)).a();
        a.r = ((zw) ww.a(context)).d();
        a.s = ((zw) ww.a(context)).e();
        zw zwVar = (zw) ww.a(context);
        synchronized (zw.j) {
            str5 = zwVar.i;
        }
        a.t = str5;
        a.G0 = Boolean.valueOf(tb.a(context));
        qu2 a2 = gx2.a().a(context);
        if (a2 != null) {
            a.H0 = a2.e0;
        }
        qu2 a3 = gx2.a().a(context);
        Map map = a3 != null ? a3.f0 : null;
        if (map != null) {
            a.I0 = map;
        }
        a.O0 = Boolean.valueOf(km0Var.f);
        boolean a4 = ((uh1) qb2Var.a).a("OPT_OUT_ENABLED", false);
        a.P0 = a4 ? Boolean.valueOf(a4) : null;
        a.Q0 = zd2.c(context);
        ArrayList a5 = new ps1().a(nr1.a());
        ArrayList arrayList = new ArrayList();
        Iterator it = a5.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            List list2 = ((cs1) next).d;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it2 = list2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (((bs1) it2.next()).c) {
                        arrayList.add(next);
                        break;
                    }
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            Object next2 = it3.next();
            if (!epx.f(((cs1) next2).b, StringUtils.UNDEFINED)) {
                arrayList2.add(next2);
            }
        }
        ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            arrayList3.add(((cs1) it4.next()).b);
        }
        j8y.a aVar = j8y.d;
        aVar.getClass();
        a.e0 = aVar.b(new xsna.yk3(oqm0.a), arrayList3);
        return a;
    }

    public static vu0 a(Context context, d4 d4Var, sy2 sy2Var) {
        String str;
        String string;
        String str2;
        String decode;
        vu0 a = a(context, sy2Var, d4Var.b, new tq2(), new qb2(vh1.a(context)));
        g9 g9Var = d4Var.e;
        if (g9Var != null) {
            a.J = a.a ? null : g9Var;
            String str3 = g9Var.d;
            if (str3 == null || str3.length() == 0) {
                str2 = null;
            } else {
                String encode = Uri.encode(str3);
                if (encode != null && encode.length() > 1024) {
                    gm2.a("Exceeded the length of the parameter! The maximum size of the parameter is %s bytes. First %s bytes of the parameter will be used", 1024, 1024);
                    String encode2 = Uri.encode(" ");
                    String substring = encode.substring(0, 1024);
                    boolean startsWith = encode.startsWith(encode2, 1024);
                    int O = drm0.O(0, 6, substring, encode2);
                    encode = (startsWith || O < 0) ? substring : substring.substring(0, O);
                }
                str2 = Uri.decode(encode);
            }
            a.U = str2;
            List list = g9Var.e;
            String str4 = "";
            if (list != null) {
                StringBuilder sb = new StringBuilder();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    xsna.jh.f(sb, str4, (String) it.next(), "\n");
                    str4 = "3";
                }
                str4 = sb.toString();
            }
            if (str4.length() == 0) {
                decode = null;
            } else {
                String encode3 = Uri.encode(str4);
                if (encode3 != null && encode3.length() > 2048) {
                    gm2.a("Exceeded the length of the parameter! The maximum size of the parameter is %s bytes. First %s bytes of the parameter will be used", 2048, 2048);
                    String encode4 = Uri.encode("\n");
                    encode3 = encode3.substring(0, 2048);
                    int O2 = drm0.O(0, 6, encode3, encode4);
                    if (!brm0.v(encode3, encode4, false) && O2 >= 0) {
                        encode3 = encode3.substring(0, O2);
                    }
                }
                decode = Uri.decode(encode3);
            }
            a.V = decode;
            a.y0 = m9.a(g9Var.b);
            a.z0 = m9.a(g9Var.c);
            a.b0 = g9Var.h;
            hq2 hq2Var = g9Var.j;
            if (hq2Var != null) {
                a.D0 = m9.a(hq2Var.b);
            }
            HashMap a2 = m9.a(g9Var.g);
            if (a2 != null) {
                a.h.putAll(a2);
            }
        }
        e00 e00Var = d4Var.a;
        if (e00Var != null) {
            a.w = e00Var.b;
        }
        a.n = d4Var.j;
        a.v = d4Var.c.a;
        w52 w52Var = d4Var.f;
        if (w52Var != null) {
            a.X = w52Var.b;
        }
        e13 e13Var = d4Var.d.a;
        if (e13Var != null) {
            a.z = e13Var.b().b;
            a.x = Integer.valueOf(e13Var.c(context));
            a.y = Integer.valueOf(e13Var.a(context));
        }
        a.c0 = d4Var.h;
        a.d0 = d4Var.i;
        int i = d4Var.n;
        if (1 == i) {
            str = X3.i.D;
        } else {
            str = X3.i.C;
        }
        a.A = str;
        String str5 = d4Var.c.a;
        if (str5 != null && (string = sz2.a(new sz2(), context, "ViewSizeInfoStorage").getString(im3.a(new jm3(i, str5)), null)) != null) {
            a.F0 = string;
        }
        return a;
    }
}
