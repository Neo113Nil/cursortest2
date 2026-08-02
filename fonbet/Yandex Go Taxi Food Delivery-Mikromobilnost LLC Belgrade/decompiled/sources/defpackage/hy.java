package defpackage;

import com.yandex.div.state.db.StateEntry;
import flex.health.ErrorTypes;
import flex.logger.FlexLogLevel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlinx.serialization.json.c;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.cprocsp.NGate.tools.Constants;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes4.dex */
public final class hy implements dez {
    public final zjr A;
    public final lu00 a;
    public final ux b;
    public final jse c;
    public final iy w;
    public final wwq x;
    public final uyg y;
    public final seu z;

    public hy(lu00 lu00Var, ux uxVar, jse jseVar, iy iyVar, wwq wwqVar, uyg uygVar, seu seuVar, int i) {
        wwqVar = (i & 16) != 0 ? null : wwqVar;
        uygVar = (i & 32) != 0 ? null : uygVar;
        seuVar = (i & 64) != 0 ? null : seuVar;
        this.a = lu00Var;
        this.b = uxVar;
        this.c = jseVar;
        this.w = iyVar;
        this.x = wwqVar;
        this.y = uygVar;
        this.z = seuVar;
        this.A = new zjr(xfz.b(hy.class.getSimpleName()));
    }

    public static final uu00 b(hy hyVar, hx hxVar, Map map, c cVar) {
        String str;
        hyVar.getClass();
        String str2 = hxVar.a;
        Map map2 = hxVar.b;
        Map z = g8e.z("Compat-Vector", "+Q+y6l");
        Map map3 = hxVar.c;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (map3 != null) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(gw00.d(map3.size()));
            for (Map.Entry entry : map3.entrySet()) {
                linkedHashMap2.put(entry.getKey(), xw91.m(entry.getValue()));
            }
            linkedHashMap.put("request", new c(linkedHashMap2));
        }
        if (!map.isEmpty()) {
            linkedHashMap.put("payload", new c(map));
        }
        if (cVar != null) {
            linkedHashMap.put("context", cVar);
        }
        if (linkedHashMap.isEmpty()) {
            str = "{}";
        } else {
            rbx rbxVar = sbx.d;
            c cVar2 = new c(linkedHashMap);
            rbxVar.getClass();
            str = rbxVar.c(cVar2, c.Companion.serializer());
        }
        return new uu00(str2, z, map2, str);
    }

    public static final nui0 c(hy hyVar, nui0 nui0Var, hx hxVar, Map map, ErrorTypes errorTypes) {
        hyVar.getClass();
        if (nui0Var instanceof ewj0) {
            hyVar.f(nui0Var, hxVar, map, errorTypes, ((ewj0) nui0Var).a);
            return nui0Var;
        }
        if (!(nui0Var instanceof nrq)) {
            w511.b();
            return null;
        }
        kr krVar = ((nrq) nui0Var).a;
        if (krVar != null && krVar.getClass() == uug.class) {
            hyVar.f(nui0Var, hxVar, map, errorTypes, null);
        }
        return nui0Var;
    }

    public static Map e(hx hxVar) {
        String str;
        Map map = hxVar.b;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(((String) entry.getKey()) + Extension.COLON_SPACE + a.X((List) entry.getValue(), Extension.FIX_SPACE, null, null, null, 62));
        }
        Pair pair = new Pair("query", a.X(arrayList, "\n", null, null, null, 62));
        Map map2 = hxVar.c;
        if (map2 != null) {
            ArrayList arrayList2 = new ArrayList(map2.size());
            for (Map.Entry entry2 : map2.entrySet()) {
                arrayList2.add(((String) entry2.getKey()) + Extension.COLON_SPACE + entry2.getValue());
            }
            str = a.X(arrayList2, "\n", null, null, null, 62);
        } else {
            str = "";
        }
        return b.i(pair, new Pair("body", str), new Pair("URLPath", hxVar.a));
    }

    @Override // defpackage.dez
    public final zjr a() {
        return this.A;
    }

    public final void d(wu00 wu00Var) {
        c2r0 c2r0Var = new c2r0(5, 1);
        c2r0Var.a(xfz.d(wu00Var.c, Constants.INTENT_PARAM_RESPONSE_CODE));
        c2r0Var.a(xfz.d(wu00Var.d, "responseMessage"));
        c2r0Var.a(xfz.d(wu00Var.e, "requestId"));
        c2r0Var.a(new Pair(StateEntry.COLUMN_PATH, ((uu00) wu00Var.a).a));
        Map map = wu00Var.k;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(new Pair(entry.getKey(), entry.getValue()));
        }
        c2r0Var.b(arrayList.toArray(new Pair[0]));
        ArrayList arrayList2 = c2r0Var.b;
        Pair[] pairArr = (Pair[]) arrayList2.toArray(new Pair[arrayList2.size()]);
        String str = this.A.d;
        if (str != null) {
            xfz.a.put(new yjr(str), xfz.a((Pair[]) Arrays.copyOf(pairArr, pairArr.length)));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00cd A[LOOP:1: B:22:0x00c7->B:24:0x00cd, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(nui0 nui0Var, hx hxVar, Map map, ErrorTypes errorTypes, Throwable th) {
        String str;
        String str2;
        int i;
        String message;
        String str3;
        boolean booleanValue;
        tjr tjrVar;
        StackTraceElement stackTraceElement;
        String fileName;
        Integer valueOf;
        if (this.z != null) {
            int i2 = ey.b[errorTypes.ordinal()];
            LinkedHashMap linkedHashMap = new LinkedHashMap(gw00.d(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), ((kotlinx.serialization.json.b) entry.getValue()).toString());
            }
            e(hxVar);
        }
        int[] iArr = ey.b;
        int i3 = iArr[errorTypes.ordinal()];
        String str4 = "Inappropriate error in ActionService";
        if (i3 == 1) {
            str = "Failed to fetch remote action";
        } else {
            if (i3 != 2) {
                str2 = "Inappropriate error in ActionService";
                String type = errorTypes.getType();
                c2r0 c2r0Var = new c2r0(5, 1);
                c2r0Var.a(new Pair("locator", "DefaultActionExecutor.performActionRequest"));
                c2r0Var.a(xfz.d(th, "cause"));
                i = iArr[errorTypes.ordinal()];
                if (i == 1) {
                    if (i == 2) {
                        message = th != null ? th.getMessage() : null;
                        str3 = "Action service error: failed to parse action (";
                    }
                    c2r0Var.a(new Pair(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, str4));
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(gw00.d(map.size()));
                    for (Map.Entry entry2 : map.entrySet()) {
                        linkedHashMap2.put(entry2.getKey(), ((kotlinx.serialization.json.b) entry2.getValue()).toString());
                    }
                    c2r0Var.b(dai0.J(linkedHashMap2));
                    c2r0Var.b(dai0.J(e(hxVar)));
                    ArrayList arrayList = c2r0Var.b;
                    i3y a = xfz.a((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                    zjr zjrVar = this.A;
                    s7s0 s7s0Var = zjrVar.c.a;
                    booleanValue = Boolean.FALSE.booleanValue();
                    tjrVar = tjr.d;
                    if (booleanValue && (stackTraceElement = (StackTraceElement) unr0.j(0)) != null) {
                        fileName = stackTraceElement.getFileName();
                        if (fileName == null) {
                            fileName = "No file info";
                        }
                        String methodName = stackTraceElement.getMethodName();
                        int lineNumber = stackTraceElement.getLineNumber();
                        valueOf = lineNumber > 0 ? Integer.valueOf(lineNumber) : null;
                        if (valueOf != null || (r14 = valueOf.toString()) == null) {
                            String str5 = "No line info";
                        }
                        tjrVar = new tjr(fileName, methodName, str5);
                    }
                    zjrVar.d(FlexLogLevel.ERROR, str2, xfz.c(a, xfz.a(new Pair("errorType", type))), EmptyList.a, tjrVar.a, tjrVar.b, tjrVar.c);
                }
                message = th != null ? th.getMessage() : null;
                str3 = "Action service error: failed to fetch action (";
                str4 = oyr.p(str3, message, Extension.C_BRAKE);
                c2r0Var.a(new Pair(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, str4));
                LinkedHashMap linkedHashMap22 = new LinkedHashMap(gw00.d(map.size()));
                while (r1.hasNext()) {
                }
                c2r0Var.b(dai0.J(linkedHashMap22));
                c2r0Var.b(dai0.J(e(hxVar)));
                ArrayList arrayList2 = c2r0Var.b;
                i3y a2 = xfz.a((Pair[]) arrayList2.toArray(new Pair[arrayList2.size()]));
                zjr zjrVar2 = this.A;
                s7s0 s7s0Var2 = zjrVar2.c.a;
                booleanValue = Boolean.FALSE.booleanValue();
                tjrVar = tjr.d;
                if (booleanValue) {
                    fileName = stackTraceElement.getFileName();
                    if (fileName == null) {
                    }
                    String methodName2 = stackTraceElement.getMethodName();
                    int lineNumber2 = stackTraceElement.getLineNumber();
                    if (lineNumber2 > 0) {
                    }
                    if (valueOf != null) {
                    }
                    String str52 = "No line info";
                    tjrVar = new tjr(fileName, methodName2, str52);
                }
                zjrVar2.d(FlexLogLevel.ERROR, str2, xfz.c(a2, xfz.a(new Pair("errorType", type))), EmptyList.a, tjrVar.a, tjrVar.b, tjrVar.c);
            }
            str = "Failed to parse remote action";
        }
        str2 = str;
        String type2 = errorTypes.getType();
        c2r0 c2r0Var2 = new c2r0(5, 1);
        c2r0Var2.a(new Pair("locator", "DefaultActionExecutor.performActionRequest"));
        c2r0Var2.a(xfz.d(th, "cause"));
        i = iArr[errorTypes.ordinal()];
        if (i == 1) {
        }
        str4 = oyr.p(str3, message, Extension.C_BRAKE);
        c2r0Var2.a(new Pair(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, str4));
        LinkedHashMap linkedHashMap222 = new LinkedHashMap(gw00.d(map.size()));
        while (r1.hasNext()) {
        }
        c2r0Var2.b(dai0.J(linkedHashMap222));
        c2r0Var2.b(dai0.J(e(hxVar)));
        ArrayList arrayList22 = c2r0Var2.b;
        i3y a22 = xfz.a((Pair[]) arrayList22.toArray(new Pair[arrayList22.size()]));
        zjr zjrVar22 = this.A;
        s7s0 s7s0Var22 = zjrVar22.c.a;
        booleanValue = Boolean.FALSE.booleanValue();
        tjrVar = tjr.d;
        if (booleanValue) {
        }
        zjrVar22.d(FlexLogLevel.ERROR, str2, xfz.c(a22, xfz.a(new Pair("errorType", type2))), EmptyList.a, tjrVar.a, tjrVar.b, tjrVar.c);
    }
}
