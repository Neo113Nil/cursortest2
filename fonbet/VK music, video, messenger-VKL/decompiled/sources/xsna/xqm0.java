package xsna;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Indent.kt */
/* loaded from: classes11.dex */
public class xqm0 extends bay {
    public static String f(String str) {
        return rli0.r(new ulp0(new crm0(str), new rgl0(7)), "\n", null, 62);
    }

    public static String g(String str) {
        int i;
        List Q = drm0.Q(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : Q) {
            if (!drm0.N((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            int length = str2.length();
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                }
                if (!ro.j(str2.charAt(i))) {
                    break;
                }
                i++;
            }
            if (i == -1) {
                i = str2.length();
            }
            arrayList2.add(Integer.valueOf(i));
        }
        Integer num = (Integer) j5g.o0(arrayList2);
        int intValue = num != null ? num.intValue() : 0;
        int length2 = str.length();
        Q.size();
        int h = e43.h(Q);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : Q) {
            int i2 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            String str3 = (String) obj2;
            String v0 = ((i == 0 || i == h) && drm0.N(str3)) ? null : erm0.v0(intValue, str3);
            if (v0 != null) {
                arrayList3.add(v0);
            }
            i = i2;
        }
        StringBuilder sb = new StringBuilder(length2);
        j5g.f0(arrayList3, sb, "\n", null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
        return sb.toString();
    }

    public static String h(String str) {
        if (drm0.N(HiAnalyticsConstant.REPORT_VAL_SEPARATOR)) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        List Q = drm0.Q(str);
        int length = str.length();
        Q.size();
        int h = e43.h(Q);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : Q) {
            int i2 = i + 1;
            String str2 = null;
            if (i < 0) {
                e43.t();
                throw null;
            }
            String str3 = (String) obj;
            if ((i != 0 && i != h) || !drm0.N(str3)) {
                int length2 = str3.length();
                int i3 = 0;
                while (true) {
                    if (i3 >= length2) {
                        i3 = -1;
                        break;
                    }
                    if (!ro.j(str3.charAt(i3))) {
                        break;
                    }
                    i3++;
                }
                if (i3 != -1 && str3.startsWith(HiAnalyticsConstant.REPORT_VAL_SEPARATOR, i3)) {
                    str2 = str3.substring(HiAnalyticsConstant.REPORT_VAL_SEPARATOR.length() + i3);
                }
                if (str2 == null) {
                    str2 = str3;
                }
            }
            if (str2 != null) {
                arrayList.add(str2);
            }
            i = i2;
        }
        StringBuilder sb = new StringBuilder(length);
        j5g.f0(arrayList, sb, "\n", null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
        return sb.toString();
    }
}
