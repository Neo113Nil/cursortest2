package xsna;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ironsource.X3;
import java.util.ArrayList;
import xsna.q8z;
import xsna.us2;

/* compiled from: parseMarkdown.kt */
/* loaded from: classes17.dex */
public final class bj90 {
    public static final us2 a(String str, izs izsVar, long j) {
        tjo0 tjo0Var = new tjo0(new hik0(j, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534), (hik0) null, (hik0) null, 14);
        teq0 teq0Var = new teq0(izsVar);
        try {
            StringBuilder sb = new StringBuilder(16);
            new ArrayList();
            ArrayList arrayList = new ArrayList();
            new ArrayList();
            int i = 0;
            while (i < str.length()) {
                int K = drm0.K(i, 4, str, X3.j.d, false);
                int K2 = drm0.K(K, 4, str, X3.j.e, false);
                int i2 = K + 1;
                int K3 = drm0.K(K, 4, str, HiAnalyticsConstant.REPORT_VAL_SEPARATOR, false);
                int i3 = K3 + 1;
                if (K < 0 || K2 <= 0) {
                    sb.append(str.substring(i));
                    break;
                }
                sb.append(str.substring(i, K));
                String substring = str.substring(i3, K2);
                String substring2 = str.substring(i2, K3);
                int length = sb.length();
                sb.append(substring);
                arrayList.add(new us2.b.a(length, sb.length(), 8, new q8z.b(substring2, tjo0Var, teq0Var)));
                i = K2 + 1;
            }
            String sb2 = sb.toString();
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                arrayList2.add(((us2.b.a) arrayList.get(i4)).a(sb.length()));
            }
            return new us2(sb2, arrayList2);
        } catch (Exception unused) {
            StringBuilder sb3 = new StringBuilder(16);
            new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            new ArrayList();
            sb3.append(str);
            arrayList3.add(new us2.b.a(0, str.length(), 8, new q8z.b(str, tjo0Var, teq0Var)));
            String sb4 = sb3.toString();
            ArrayList arrayList4 = new ArrayList(arrayList3.size());
            int size2 = arrayList3.size();
            for (int i5 = 0; i5 < size2; i5++) {
                arrayList4.add(((us2.b.a) arrayList3.get(i5)).a(sb3.length()));
            }
            return new us2(sb4, arrayList4);
        }
    }
}
